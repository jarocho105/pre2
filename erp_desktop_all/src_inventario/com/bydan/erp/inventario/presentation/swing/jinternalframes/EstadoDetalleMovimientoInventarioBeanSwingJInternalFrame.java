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

import com.bydan.erp.inventario.util.EstadoDetalleMovimientoInventarioConstantesFunciones;
import com.bydan.erp.inventario.util.EstadoDetalleMovimientoInventarioParameterReturnGeneral;
//import com.bydan.erp.inventario.util.EstadoDetalleMovimientoInventarioParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.EstadoDetalleMovimientoInventarioBean;
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
public class EstadoDetalleMovimientoInventarioBeanSwingJInternalFrame extends EstadoDetalleMovimientoInventarioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoDetalleMovimientoInventarioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventarioValidator = new ClassValidator<EstadoDetalleMovimientoInventario>(EstadoDetalleMovimientoInventario.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoDetalleMovimientoInventario estadodetallemovimientoinventario;	
	public EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux;
	public EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioTotales;
	public Long idEstadoDetalleMovimientoInventarioActual;
	public Long iIdNuevoEstadoDetalleMovimientoInventario=0L;
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
	
	public Boolean isPermisoTodoEstadoDetalleMovimientoInventario;
	public Boolean isPermisoNuevoEstadoDetalleMovimientoInventario;
	public Boolean isPermisoActualizarEstadoDetalleMovimientoInventario;
	public Boolean isPermisoActualizarOriginalEstadoDetalleMovimientoInventario;
	public Boolean isPermisoEliminarEstadoDetalleMovimientoInventario;
	public Boolean isPermisoGuardarCambiosEstadoDetalleMovimientoInventario;
	public Boolean isPermisoConsultaEstadoDetalleMovimientoInventario;
	public Boolean isPermisoBusquedaEstadoDetalleMovimientoInventario;
	public Boolean isPermisoReporteEstadoDetalleMovimientoInventario;
	public Boolean isPermisoPaginacionMedioEstadoDetalleMovimientoInventario;
	public Boolean isPermisoPaginacionAltoEstadoDetalleMovimientoInventario;
	public Boolean isPermisoPaginacionTodoEstadoDetalleMovimientoInventario;
	public Boolean isPermisoCopiarEstadoDetalleMovimientoInventario;
	public Boolean isPermisoVerFormEstadoDetalleMovimientoInventario;
	public Boolean isPermisoDuplicarEstadoDetalleMovimientoInventario;
	public Boolean isPermisoOrdenEstadoDetalleMovimientoInventario;
	
	
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
	
	public EstadoDetalleMovimientoInventarioParameterReturnGeneral estadodetallemovimientoinventarioReturnGeneral;
	public EstadoDetalleMovimientoInventarioParameterReturnGeneral estadodetallemovimientoinventarioParameterGeneral;
	
	

	public DetalleMovimientoInventarioLogic detallemovimientoinventarioLogic=null;

	public DetalleMovimientoInventarioLogic getDetalleMovimientoInventarioLogic() {
		return detallemovimientoinventarioLogic;
	}

	public void setDetalleMovimientoInventarioLogic(DetalleMovimientoInventarioLogic detallemovimientoinventarioLogic) {
		this.detallemovimientoinventarioLogic = detallemovimientoinventarioLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoDetalleMovimientoInventario=false;
	public Boolean esParaAccionDesdeFormularioEstadoDetalleMovimientoInventario=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadoDetalleMovimientoInventarioSessionBeanAdditional estadodetallemovimientoinventarioSessionBeanAdditional=null;
	
	public EstadoDetalleMovimientoInventarioSessionBeanAdditional getEstadoDetalleMovimientoInventarioSessionBeanAdditional() {
		return this.estadodetallemovimientoinventarioSessionBeanAdditional;
	}
	
	public void setEstadoDetalleMovimientoInventarioSessionBeanAdditional(EstadoDetalleMovimientoInventarioSessionBeanAdditional estadodetallemovimientoinventarioSessionBeanAdditional) {
		try {
			this.estadodetallemovimientoinventarioSessionBeanAdditional=estadodetallemovimientoinventarioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional estadodetallemovimientoinventarioBeanSwingJInternalFrameAdditional=null;
	//public class EstadoDetalleMovimientoInventarioBeanSwingJInternalFrame
	
	public EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional getEstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional() {
		return this.estadodetallemovimientoinventarioBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional(EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional estadodetallemovimientoinventarioBeanSwingJInternalFrameAdditional) {
		try {
			this.estadodetallemovimientoinventarioBeanSwingJInternalFrameAdditional=estadodetallemovimientoinventarioBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoDetalleMovimientoInventarioLogic estadodetallemovimientoinventarioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioBean;
	public EstadoDetalleMovimientoInventarioConstantesFunciones estadodetallemovimientoinventarioConstantesFunciones;
	//public EstadoDetalleMovimientoInventarioParameterReturnGeneral estadodetallemovimientoinventarioReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventarios;	
	//public List<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosEliminados;
	//public List<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoDetalleMovimientoInventario=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoDetalleMovimientoInventario=true;
	public Boolean isVisibilidadCeldaCopiarEstadoDetalleMovimientoInventario=true;
	public Boolean isVisibilidadCeldaVerFormEstadoDetalleMovimientoInventario=true;
	public Boolean isVisibilidadCeldaOrdenEstadoDetalleMovimientoInventario=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoDetalleMovimientoInventario=false;
	public Boolean isVisibilidadCeldaModificarEstadoDetalleMovimientoInventario=false;
	public Boolean isVisibilidadCeldaActualizarEstadoDetalleMovimientoInventario=false;
	public Boolean isVisibilidadCeldaEliminarEstadoDetalleMovimientoInventario=false;
	public Boolean isVisibilidadCeldaCancelarEstadoDetalleMovimientoInventario=false;
	public Boolean isVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoDetalleMovimientoInventario=false;	
	
	
	
	public Long getiIdNuevoEstadoDetalleMovimientoInventario() {
		return this.iIdNuevoEstadoDetalleMovimientoInventario;
	}

	public void setiIdNuevoEstadoDetalleMovimientoInventario(Long iIdNuevoEstadoDetalleMovimientoInventario) {
		this.iIdNuevoEstadoDetalleMovimientoInventario = iIdNuevoEstadoDetalleMovimientoInventario;
	}
	
	public Long getidEstadoDetalleMovimientoInventarioActual() {
		return this.idEstadoDetalleMovimientoInventarioActual;
	}

	public void setidEstadoDetalleMovimientoInventarioActual(Long idEstadoDetalleMovimientoInventarioActual) {
		this.idEstadoDetalleMovimientoInventarioActual = idEstadoDetalleMovimientoInventarioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoDetalleMovimientoInventario getestadodetallemovimientoinventario() {
		return this.estadodetallemovimientoinventario;
	}

	public void setestadodetallemovimientoinventario(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario) {
		this.estadodetallemovimientoinventario = estadodetallemovimientoinventario;
	}
	
	public EstadoDetalleMovimientoInventario getestadodetallemovimientoinventarioAux() {
		return this.estadodetallemovimientoinventarioAux;
	}

	public void setestadodetallemovimientoinventarioAux(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux) {
		this.estadodetallemovimientoinventarioAux = estadodetallemovimientoinventarioAux;
	}				
	
	public EstadoDetalleMovimientoInventario getestadodetallemovimientoinventarioAnterior() {
		return this.estadodetallemovimientoinventarioAnterior;
	}

	public void setestadodetallemovimientoinventarioAnterior(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAnterior) {
		this.estadodetallemovimientoinventarioAnterior = estadodetallemovimientoinventarioAnterior;
	}	
	
	public EstadoDetalleMovimientoInventario getestadodetallemovimientoinventarioTotales() {
		return this.estadodetallemovimientoinventarioTotales;
	}

	public void setestadodetallemovimientoinventarioTotales(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioTotales) {
		this.estadodetallemovimientoinventarioTotales = estadodetallemovimientoinventarioTotales;
	}	
	
	public EstadoDetalleMovimientoInventario getestadodetallemovimientoinventarioBean() {
		return this.estadodetallemovimientoinventarioBean;
	}

	public void setestadodetallemovimientoinventarioBean(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioBean) {
		this.estadodetallemovimientoinventarioBean = estadodetallemovimientoinventarioBean;
	}	
	
	public EstadoDetalleMovimientoInventarioParameterReturnGeneral getestadodetallemovimientoinventarioReturnGeneral() {
		return this.estadodetallemovimientoinventarioReturnGeneral;
	}

	public void setestadodetallemovimientoinventarioReturnGeneral(EstadoDetalleMovimientoInventarioParameterReturnGeneral estadodetallemovimientoinventarioReturnGeneral) {
		this.estadodetallemovimientoinventarioReturnGeneral = estadodetallemovimientoinventarioReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoDetalleMovimientoInventarioLogic getEstadoDetalleMovimientoInventarioLogic()	{		
		return estadodetallemovimientoinventarioLogic;
	}

	public void setEstadoDetalleMovimientoInventarioLogic(EstadoDetalleMovimientoInventarioLogic estadodetallemovimientoinventarioLogic) {
		this.estadodetallemovimientoinventarioLogic = estadodetallemovimientoinventarioLogic;
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
	
	public Boolean getIsEsNuevoEstadoDetalleMovimientoInventario() {
		return isEsNuevoEstadoDetalleMovimientoInventario;
	}

	public void setIsEsNuevoEstadoDetalleMovimientoInventario(Boolean isEsNuevoEstadoDetalleMovimientoInventario) {
		this.isEsNuevoEstadoDetalleMovimientoInventario = isEsNuevoEstadoDetalleMovimientoInventario;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoDetalleMovimientoInventario() {
		return esParaAccionDesdeFormularioEstadoDetalleMovimientoInventario;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoDetalleMovimientoInventario(Boolean esParaAccionDesdeFormularioEstadoDetalleMovimientoInventario) {
		this.esParaAccionDesdeFormularioEstadoDetalleMovimientoInventario = esParaAccionDesdeFormularioEstadoDetalleMovimientoInventario;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoDetalleMovimientoInventario() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoDetalleMovimientoInventarioConstantesFunciones.refrescarForeignKeysDescripcionesEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoDetalleMovimientoInventarioConstantesFunciones.refrescarForeignKeysDescripcionesEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventarios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadodetallemovimientoinventarioLogic.setEstadoDetalleMovimientoInventarios(this.estadodetallemovimientoinventarios);
			estadodetallemovimientoinventarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoDetalleMovimientoInventarioParameterReturnGeneral getEstadoDetalleMovimientoInventarioParameterGeneral() {
		return this.estadodetallemovimientoinventarioParameterGeneral;
	}
	
	public void setEstadoDetalleMovimientoInventarioParameterGeneral(EstadoDetalleMovimientoInventarioParameterReturnGeneral estadodetallemovimientoinventarioParameterGeneral) {
		this.estadodetallemovimientoinventarioParameterGeneral = estadodetallemovimientoinventarioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoDetalleMovimientoInventario() {
		return isPermisoTodoEstadoDetalleMovimientoInventario;
	}

	public void setIsPermisoTodoEstadoDetalleMovimientoInventario(Boolean isPermisoTodoEstadoDetalleMovimientoInventario) {
		this.isPermisoTodoEstadoDetalleMovimientoInventario = isPermisoTodoEstadoDetalleMovimientoInventario;
	}

	public Boolean getIsPermisoNuevoEstadoDetalleMovimientoInventario() {
		return isPermisoNuevoEstadoDetalleMovimientoInventario;
	}

	public void setIsPermisoNuevoEstadoDetalleMovimientoInventario(Boolean isPermisoNuevoEstadoDetalleMovimientoInventario) {
		this.isPermisoNuevoEstadoDetalleMovimientoInventario = isPermisoNuevoEstadoDetalleMovimientoInventario;
	}

	public Boolean getIsPermisoActualizarEstadoDetalleMovimientoInventario() {
		return isPermisoActualizarEstadoDetalleMovimientoInventario;
	}

	public void setIsPermisoActualizarEstadoDetalleMovimientoInventario(Boolean isPermisoActualizarEstadoDetalleMovimientoInventario) {
		this.isPermisoActualizarEstadoDetalleMovimientoInventario = isPermisoActualizarEstadoDetalleMovimientoInventario;
	}

	public Boolean getIsPermisoEliminarEstadoDetalleMovimientoInventario() {
		return isPermisoEliminarEstadoDetalleMovimientoInventario;
	}

	public void setIsPermisoEliminarEstadoDetalleMovimientoInventario(Boolean isPermisoEliminarEstadoDetalleMovimientoInventario) {
		this.isPermisoEliminarEstadoDetalleMovimientoInventario = isPermisoEliminarEstadoDetalleMovimientoInventario;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoDetalleMovimientoInventario() {
		return isPermisoGuardarCambiosEstadoDetalleMovimientoInventario;
	}

	public void setIsPermisoGuardarCambiosEstadoDetalleMovimientoInventario(Boolean isPermisoGuardarCambiosEstadoDetalleMovimientoInventario) {
		this.isPermisoGuardarCambiosEstadoDetalleMovimientoInventario = isPermisoGuardarCambiosEstadoDetalleMovimientoInventario;
	}
	
	public Boolean getIsPermisoConsultaEstadoDetalleMovimientoInventario() {
		return isPermisoConsultaEstadoDetalleMovimientoInventario;
	}

	public void setIsPermisoConsultaEstadoDetalleMovimientoInventario(Boolean isPermisoConsultaEstadoDetalleMovimientoInventario) {
		this.isPermisoConsultaEstadoDetalleMovimientoInventario = isPermisoConsultaEstadoDetalleMovimientoInventario;
	}

	public Boolean getIsPermisoBusquedaEstadoDetalleMovimientoInventario() {
		return isPermisoBusquedaEstadoDetalleMovimientoInventario;
	}

	public void setIsPermisoBusquedaEstadoDetalleMovimientoInventario(Boolean isPermisoBusquedaEstadoDetalleMovimientoInventario) {
		this.isPermisoBusquedaEstadoDetalleMovimientoInventario = isPermisoBusquedaEstadoDetalleMovimientoInventario;
	}

	public Boolean getIsPermisoReporteEstadoDetalleMovimientoInventario() {
		return isPermisoReporteEstadoDetalleMovimientoInventario;
	}

	public void setIsPermisoReporteEstadoDetalleMovimientoInventario(Boolean isPermisoReporteEstadoDetalleMovimientoInventario) {
		this.isPermisoReporteEstadoDetalleMovimientoInventario = isPermisoReporteEstadoDetalleMovimientoInventario;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoDetalleMovimientoInventario() {
		return isPermisoPaginacionMedioEstadoDetalleMovimientoInventario;
	}

	public void setIsPermisoPaginacionMedioEstadoDetalleMovimientoInventario(Boolean isPermisoPaginacionMedioEstadoDetalleMovimientoInventario) {
		this.isPermisoPaginacionMedioEstadoDetalleMovimientoInventario = isPermisoPaginacionMedioEstadoDetalleMovimientoInventario;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoDetalleMovimientoInventario() {
		return isPermisoPaginacionTodoEstadoDetalleMovimientoInventario;
	}

	public void setIsPermisoPaginacionTodoEstadoDetalleMovimientoInventario(Boolean isPermisoPaginacionTodoEstadoDetalleMovimientoInventario) {
		this.isPermisoPaginacionTodoEstadoDetalleMovimientoInventario = isPermisoPaginacionTodoEstadoDetalleMovimientoInventario;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoDetalleMovimientoInventario() {
		return isPermisoPaginacionAltoEstadoDetalleMovimientoInventario;
	}

	public void setIsPermisoPaginacionAltoEstadoDetalleMovimientoInventario(Boolean isPermisoPaginacionAltoEstadoDetalleMovimientoInventario) {
		this.isPermisoPaginacionAltoEstadoDetalleMovimientoInventario = isPermisoPaginacionAltoEstadoDetalleMovimientoInventario;
	}
	
	public Boolean getIsPermisoCopiarEstadoDetalleMovimientoInventario() {
		return isPermisoCopiarEstadoDetalleMovimientoInventario;
	}

	public void setIsPermisoCopiarEstadoDetalleMovimientoInventario(Boolean isPermisoCopiarEstadoDetalleMovimientoInventario) {
		this.isPermisoCopiarEstadoDetalleMovimientoInventario = isPermisoCopiarEstadoDetalleMovimientoInventario;
	}
	
	public Boolean getIsPermisoVerFormEstadoDetalleMovimientoInventario() {
		return isPermisoVerFormEstadoDetalleMovimientoInventario;
	}

	public void setIsPermisoVerFormEstadoDetalleMovimientoInventario(Boolean isPermisoVerFormEstadoDetalleMovimientoInventario) {
		this.isPermisoVerFormEstadoDetalleMovimientoInventario = isPermisoVerFormEstadoDetalleMovimientoInventario;
	}
	
	public Boolean getIsPermisoDuplicarEstadoDetalleMovimientoInventario() {
		return isPermisoDuplicarEstadoDetalleMovimientoInventario;
	}

	public void setIsPermisoDuplicarEstadoDetalleMovimientoInventario(Boolean isPermisoDuplicarEstadoDetalleMovimientoInventario) {
		this.isPermisoDuplicarEstadoDetalleMovimientoInventario = isPermisoDuplicarEstadoDetalleMovimientoInventario;
	}
	
	public Boolean getIsPermisoOrdenEstadoDetalleMovimientoInventario() {
		return isPermisoOrdenEstadoDetalleMovimientoInventario;
	}

	public void setIsPermisoOrdenEstadoDetalleMovimientoInventario(Boolean isPermisoOrdenEstadoDetalleMovimientoInventario) {
		this.isPermisoOrdenEstadoDetalleMovimientoInventario = isPermisoOrdenEstadoDetalleMovimientoInventario;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoDetalleMovimientoInventario() {
		return isVisibilidadCeldaNuevoEstadoDetalleMovimientoInventario;
	}

	public void setIsVisibilidadCeldaNuevoEstadoDetalleMovimientoInventario(Boolean isVisibilidadCeldaNuevoEstadoDetalleMovimientoInventario) {
		this.isVisibilidadCeldaNuevoEstadoDetalleMovimientoInventario = isVisibilidadCeldaNuevoEstadoDetalleMovimientoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoDetalleMovimientoInventario() {
		return isVisibilidadCeldaDuplicarEstadoDetalleMovimientoInventario;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoDetalleMovimientoInventario(Boolean isVisibilidadCeldaDuplicarEstadoDetalleMovimientoInventario) {
		this.isVisibilidadCeldaDuplicarEstadoDetalleMovimientoInventario = isVisibilidadCeldaDuplicarEstadoDetalleMovimientoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoDetalleMovimientoInventario() {
		return isVisibilidadCeldaCopiarEstadoDetalleMovimientoInventario;
	}

	public void setIsVisibilidadCeldaCopiarEstadoDetalleMovimientoInventario(Boolean isVisibilidadCeldaCopiarEstadoDetalleMovimientoInventario) {
		this.isVisibilidadCeldaCopiarEstadoDetalleMovimientoInventario = isVisibilidadCeldaCopiarEstadoDetalleMovimientoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoDetalleMovimientoInventario() {
		return isVisibilidadCeldaVerFormEstadoDetalleMovimientoInventario;
	}

	public void setIsVisibilidadCeldaVerFormEstadoDetalleMovimientoInventario(Boolean isVisibilidadCeldaVerFormEstadoDetalleMovimientoInventario) {
		this.isVisibilidadCeldaVerFormEstadoDetalleMovimientoInventario = isVisibilidadCeldaVerFormEstadoDetalleMovimientoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoDetalleMovimientoInventario() {
		return isVisibilidadCeldaOrdenEstadoDetalleMovimientoInventario;
	}

	public void setIsVisibilidadCeldaOrdenEstadoDetalleMovimientoInventario(Boolean isVisibilidadCeldaOrdenEstadoDetalleMovimientoInventario) {
		this.isVisibilidadCeldaOrdenEstadoDetalleMovimientoInventario = isVisibilidadCeldaOrdenEstadoDetalleMovimientoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoDetalleMovimientoInventario() {
		return isVisibilidadCeldaNuevoRelacionesEstadoDetalleMovimientoInventario;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoDetalleMovimientoInventario(Boolean isVisibilidadCeldaNuevoRelacionesEstadoDetalleMovimientoInventario) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleMovimientoInventario = isVisibilidadCeldaNuevoRelacionesEstadoDetalleMovimientoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoDetalleMovimientoInventario() {
		return isVisibilidadCeldaModificarEstadoDetalleMovimientoInventario;
	}

	public void setIsVisibilidadCeldaModificarEstadoDetalleMovimientoInventario(Boolean isVisibilidadCeldaModificarEstadoDetalleMovimientoInventario) {
		this.isVisibilidadCeldaModificarEstadoDetalleMovimientoInventario = isVisibilidadCeldaModificarEstadoDetalleMovimientoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoDetalleMovimientoInventario() {
		return isVisibilidadCeldaActualizarEstadoDetalleMovimientoInventario;
	}

	public void setIsVisibilidadCeldaActualizarEstadoDetalleMovimientoInventario(Boolean isVisibilidadCeldaActualizarEstadoDetalleMovimientoInventario) {
		this.isVisibilidadCeldaActualizarEstadoDetalleMovimientoInventario = isVisibilidadCeldaActualizarEstadoDetalleMovimientoInventario;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoDetalleMovimientoInventario() {
		return isVisibilidadCeldaEliminarEstadoDetalleMovimientoInventario;
	}

	public void setIsVisibilidadCeldaEliminarEstadoDetalleMovimientoInventario(Boolean isVisibilidadCeldaEliminarEstadoDetalleMovimientoInventario) {
		this.isVisibilidadCeldaEliminarEstadoDetalleMovimientoInventario = isVisibilidadCeldaEliminarEstadoDetalleMovimientoInventario;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoDetalleMovimientoInventario() {
		return isVisibilidadCeldaCancelarEstadoDetalleMovimientoInventario;
	}

	public void setIsVisibilidadCeldaCancelarEstadoDetalleMovimientoInventario(Boolean isVisibilidadCeldaCancelarEstadoDetalleMovimientoInventario) {
		this.isVisibilidadCeldaCancelarEstadoDetalleMovimientoInventario = isVisibilidadCeldaCancelarEstadoDetalleMovimientoInventario;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario() {
		return isVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario;
	}

	public void setIsVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario(Boolean isVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario) {
		this.isVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario = isVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoDetalleMovimientoInventario() {
		return isVisibilidadCeldaGuardarCambiosEstadoDetalleMovimientoInventario;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoDetalleMovimientoInventario(Boolean isVisibilidadCeldaGuardarCambiosEstadoDetalleMovimientoInventario) {
		this.isVisibilidadCeldaGuardarCambiosEstadoDetalleMovimientoInventario = isVisibilidadCeldaGuardarCambiosEstadoDetalleMovimientoInventario;
	}
		
	public EstadoDetalleMovimientoInventarioSessionBean getestadodetallemovimientoinventarioSessionBean() {
		return this.estadodetallemovimientoinventarioSessionBean;
	}
	
	public void setestadodetallemovimientoinventarioSessionBean(EstadoDetalleMovimientoInventarioSessionBean estadodetallemovimientoinventarioSessionBean) {
		this.estadodetallemovimientoinventarioSessionBean=estadodetallemovimientoinventarioSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleMovimientoInventario(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario,EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoDetalleMovimientoInventario(estadodetallemovimientoinventario);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadodetallemovimientoinventarioAux.setId(estadodetallemovimientoinventario.getId());
		estadodetallemovimientoinventarioAux.setVersionRow(estadodetallemovimientoinventario.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoDetalleMovimientoInventario();
		
			int intSelectedRow = this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallemovimientoinventario =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadodetallemovimientoinventario =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarios.toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadodetallemovimientoinventarioValidator.getInvalidValues(this.estadodetallemovimientoinventario);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadodetallemovimientoinventarioLogic.setDatosCliente(datosCliente);
			estadodetallemovimientoinventarioLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadodetallemovimientoinventarioAux=new  EstadoDetalleMovimientoInventario();
				
				estadodetallemovimientoinventarioAux.setIsNew(true);
				estadodetallemovimientoinventarioAux.setIsChanged(true);
				
				estadodetallemovimientoinventarioAux.setEstadoDetalleMovimientoInventarioOriginal(this.estadodetallemovimientoinventario);
				
				estadodetallemovimientoinventarioAux.setId(this.estadodetallemovimientoinventario.getId());	
				estadodetallemovimientoinventarioAux.setVersionRow(this.estadodetallemovimientoinventario.getVersionRow());	
				estadodetallemovimientoinventarioAux.setcodigo(this.estadodetallemovimientoinventario.getcodigo());	
				estadodetallemovimientoinventarioAux.setnombre(this.estadodetallemovimientoinventario.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadodetallemovimientoinventarioAux,estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetallemovimientoinventarioAux,estadodetallemovimientoinventarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetallemovimientoinventarioLogic.saveEstadoDetalleMovimientoInventarios();//WithConnection
						//estadodetallemovimientoinventarioLogic.getSetVersionRowEstadoDetalleMovimientoInventarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadodetallemovimientoinventario,estadodetallemovimientoinventarioAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.getDetalleMovimientoInventarios().addAll(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventariosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarios.addAll(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventariosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadodetallemovimientoinventarioLogic.saveEstadoDetalleMovimientoInventarioRelaciones(estadodetallemovimientoinventarioAux,this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.getDetalleMovimientoInventarios());//WithConnection
								//estadodetallemovimientoinventarioLogic.getSetVersionRowEstadoDetalleMovimientoInventarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadodetallemovimientoinventario,estadodetallemovimientoinventarioAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.setDetalleMovimientoInventarios(new ArrayList<DetalleMovimientoInventario>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarios= new ArrayList<DetalleMovimientoInventario>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodetallemovimientoinventarioAux.setDetalleMovimientoInventarios(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.getDetalleMovimientoInventarios());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadodetallemovimientoinventarioAux,estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadodetallemovimientoinventarioAux,estadodetallemovimientoinventarios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadodetallemovimientoinventario,estadodetallemovimientoinventarioAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadodetallemovimientoinventarioAux=new  EstadoDetalleMovimientoInventario();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado() 
					|| (this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado() && this.estadodetallemovimientoinventario.getId()>=0)) {
						
					estadodetallemovimientoinventarioAux.setIsNew(false);
				}
				
				estadodetallemovimientoinventarioAux.setIsDeleted(false);
			
				estadodetallemovimientoinventarioAux.setId(this.estadodetallemovimientoinventario.getId());	
				estadodetallemovimientoinventarioAux.setVersionRow(this.estadodetallemovimientoinventario.getVersionRow());	
				estadodetallemovimientoinventarioAux.setcodigo(this.estadodetallemovimientoinventario.getcodigo());	
				estadodetallemovimientoinventarioAux.setnombre(this.estadodetallemovimientoinventario.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadodetallemovimientoinventarioAux,estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetallemovimientoinventarioAux,estadodetallemovimientoinventarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetallemovimientoinventarioLogic.saveEstadoDetalleMovimientoInventarios();//WithConnection
						//estadodetallemovimientoinventarioLogic.getSetVersionRowEstadoDetalleMovimientoInventarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadodetallemovimientoinventario,estadodetallemovimientoinventarioAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.getDetalleMovimientoInventarios().addAll(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventariosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarios.addAll(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventariosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadodetallemovimientoinventarioLogic.saveEstadoDetalleMovimientoInventarioRelaciones(estadodetallemovimientoinventarioAux,this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.getDetalleMovimientoInventarios());//WithConnection
								//estadodetallemovimientoinventarioLogic.getSetVersionRowEstadoDetalleMovimientoInventarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadodetallemovimientoinventario,estadodetallemovimientoinventarioAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.setDetalleMovimientoInventarios(new ArrayList<DetalleMovimientoInventario>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarios= new ArrayList<DetalleMovimientoInventario>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodetallemovimientoinventarioAux.setDetalleMovimientoInventarios(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.getDetalleMovimientoInventarios());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadodetallemovimientoinventarioAux,estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadodetallemovimientoinventarioAux,estadodetallemovimientoinventarios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadodetallemovimientoinventario,estadodetallemovimientoinventarioAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadodetallemovimientoinventarioAux=new  EstadoDetalleMovimientoInventario();
				
				estadodetallemovimientoinventarioAux.setIsNew(false);
				estadodetallemovimientoinventarioAux.setIsChanged(false);
				
				estadodetallemovimientoinventarioAux.setIsDeleted(true);
				
				estadodetallemovimientoinventarioAux.setId(this.estadodetallemovimientoinventario.getId());	
				estadodetallemovimientoinventarioAux.setVersionRow(this.estadodetallemovimientoinventario.getVersionRow());	
				estadodetallemovimientoinventarioAux.setcodigo(this.estadodetallemovimientoinventario.getcodigo());	
				estadodetallemovimientoinventarioAux.setnombre(this.estadodetallemovimientoinventario.getnombre());	
				
				if(this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadodetallemovimientoinventarioAux.getId()>=0) {	
						this.estadodetallemovimientoinventariosEliminados.add(estadodetallemovimientoinventarioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadodetallemovimientoinventarioAux,estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetallemovimientoinventarioAux,estadodetallemovimientoinventarios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetallemovimientoinventarioLogic.saveEstadoDetalleMovimientoInventarios();//WithConnection
						//estadodetallemovimientoinventarioLogic.getSetVersionRowEstadoDetalleMovimientoInventarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.getDetalleMovimientoInventarios().addAll(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventariosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarios.addAll(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventariosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadodetallemovimientoinventarioLogic.saveEstadoDetalleMovimientoInventarioRelaciones(estadodetallemovimientoinventarioAux,this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.getDetalleMovimientoInventarios());//WithConnection
								//estadodetallemovimientoinventarioLogic.getSetVersionRowEstadoDetalleMovimientoInventarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.setDetalleMovimientoInventarios(new ArrayList<DetalleMovimientoInventario>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarios= new ArrayList<DetalleMovimientoInventario>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodetallemovimientoinventarioAux.setDetalleMovimientoInventarios(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.getDetalleMovimientoInventarios());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadodetallemovimientoinventarioAux,estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadodetallemovimientoinventarioAux,estadodetallemovimientoinventarios);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().addAll(this.estadodetallemovimientoinventariosEliminados);
					
					estadodetallemovimientoinventarioLogic.saveEstadoDetalleMovimientoInventarios();//WithConnection
					//estadodetallemovimientoinventarioLogic.getSetVersionRowEstadoDetalleMovimientoInventarios();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadodetallemovimientoinventariosEliminados= new ArrayList<EstadoDetalleMovimientoInventario>();		
			}
			
			if(this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Detalle Movimiento Inventario GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Detalle Movimiento Inventario",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadodetallemovimientoinventario=estadodetallemovimientoinventarioAux;
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
      		//this.finishProcessEstadoDetalleMovimientoInventario();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioLocal) throws Exception {
		
		if(this.estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadodetallemovimientoinventarioLocal.setDetalleMovimientoInventarios(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.getDetalleMovimientoInventarios());
			
			} else {
			
				estadodetallemovimientoinventarioLocal.setDetalleMovimientoInventarios(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarios);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioLocal) throws Exception {	
		if(this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoDetalleMovimientoInventarioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadodetallemovimientoinventario =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadodetallemovimientoinventario =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarios.toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadodetallemovimientoinventarioValidator.getInvalidValues(this.estadodetallemovimientoinventario);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario,List<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventarios) throws Exception {
		try	{		
			EstadoDetalleMovimientoInventarioConstantesFunciones.actualizarLista(estadodetallemovimientoinventario,estadodetallemovimientoinventarios,this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario,List<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventarios) throws Exception {
		try	{			
			EstadoDetalleMovimientoInventarioConstantesFunciones.actualizarSelectedLista(estadodetallemovimientoinventario,estadodetallemovimientoinventarios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadodetallemovimientoinventariosLocal=this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadodetallemovimientoinventariosLocal=this.estadodetallemovimientoinventarios;
			}
			//ARCHITECTURE
		
			for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioLocal:estadodetallemovimientoinventariosLocal) {
				if(this.permiteMantenimiento(estadodetallemovimientoinventarioLocal) && estadodetallemovimientoinventarioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoDetalleMovimientoInventarioConstantesFunciones.getEstadoDetalleMovimientoInventarioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoDetalleMovimientoInventarioConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jLabelcodigoEstadoDetalleMovimientoInventario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoDetalleMovimientoInventarioConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jLabelnombreEstadoDetalleMovimientoInventario,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jLabelcodigoEstadoDetalleMovimientoInventario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jLabelnombreEstadoDetalleMovimientoInventario,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleMovimientoInventario")) {
			if(this.estadodetallemovimientoinventario==null) {
				this.estadodetallemovimientoinventario= new EstadoDetalleMovimientoInventario();
			}

			if(this.estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoDetalleMovimientoInventario
				this.setVariablesFormularioToObjetoActualEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario);

				this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.getdetallemovimientoinventario().setEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoDetalleMovimientoInventario--;	
		
		
		this.estadodetallemovimientoinventarioAux=new EstadoDetalleMovimientoInventario();
		
		this.estadodetallemovimientoinventarioAux.setId(this.iIdNuevoEstadoDetalleMovimientoInventario);
		this.estadodetallemovimientoinventarioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().add(this.estadodetallemovimientoinventarioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadodetallemovimientoinventarios.add(this.estadodetallemovimientoinventarioAux);
		}
		//ARCHITECTURE
		
		this.estadodetallemovimientoinventario=this.estadodetallemovimientoinventarioAux;
		
		if(EstadoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario);
		}
				
		//this.setDefaultControlesEstadoDetalleMovimientoInventario();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoDetalleMovimientoInventario();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoDetalleMovimientoInventario();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoDetalleMovimientoInventario();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventarioBean,this.estadodetallemovimientoinventario,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
			classes=EstadoDetalleMovimientoInventarioConstantesFunciones.getClassesRelationshipsOfEstadoDetalleMovimientoInventario(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadodetallemovimientoinventarioReturnGeneral=estadodetallemovimientoinventarioLogic.procesarEventosEstadoDetalleMovimientoInventariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios(),this.estadodetallemovimientoinventario,this.estadodetallemovimientoinventarioParameterGeneral,this.isEsNuevoEstadoDetalleMovimientoInventario,classes);//this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventario()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventarioReturnGeneral,this.estadodetallemovimientoinventarioBean,false);
		
		if(this.estadodetallemovimientoinventarioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventarioReturnGeneral.getEstadoDetalleMovimientoInventario());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventarioReturnGeneral.getEstadoDetalleMovimientoInventario());
		}
		
		if(this.estadodetallemovimientoinventarioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventarioReturnGeneral.getEstadoDetalleMovimientoInventario(),classes);//this.estadodetallemovimientoinventarioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoDetalleMovimientoInventario();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoDetalleMovimientoInventario();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.RecargarFormEstadoDetalleMovimientoInventario(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoDetalleMovimientoInventario(false);
						
			if(estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() && DetalleMovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleMovimientoInventarioActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoDetalleMovimientoInventario();
			}
			
			this.actualizarVisualTableDatosEstadoDetalleMovimientoInventario();
			
			this.jTableDatosEstadoDetalleMovimientoInventario.setRowSelectionInterval(this.getIndiceNuevoEstadoDetalleMovimientoInventario(), this.getIndiceNuevoEstadoDetalleMovimientoInventario());
			
			this.seleccionarFilaTablaEstadoDetalleMovimientoInventarioActual();
						
			this.actualizarEstadoCeldasBotonesEstadoDetalleMovimientoInventario("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoDetalleMovimientoInventario(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTextFieldcodigoEstadoDetalleMovimientoInventario.setEnabled(isHabilitar && this.estadodetallemovimientoinventarioConstantesFunciones.activarcodigoEstadoDetalleMovimientoInventario);
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTextAreanombreEstadoDetalleMovimientoInventario.setEnabled(isHabilitar && this.estadodetallemovimientoinventarioConstantesFunciones.activarnombreEstadoDetalleMovimientoInventario);	
		
	};
	
	public void setDefaultControlesEstadoDetalleMovimientoInventario() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoDetalleMovimientoInventario(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadodetallemovimientoinventarioSessionBean.setConGuardarRelaciones(true);			
			this.estadodetallemovimientoinventarioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTabbedPaneRelacionesEstadoDetalleMovimientoInventario.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadodetallemovimientoinventarioSessionBean.setConGuardarRelaciones(false);			
			this.estadodetallemovimientoinventarioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTabbedPaneRelacionesEstadoDetalleMovimientoInventario.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoDetalleMovimientoInventario() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux:this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios()) {
				if(estadodetallemovimientoinventarioAux.getId().equals(this.iIdNuevoEstadoDetalleMovimientoInventario)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux:this.estadodetallemovimientoinventarios) {
				if(estadodetallemovimientoinventarioAux.getId().equals(this.iIdNuevoEstadoDetalleMovimientoInventario)) {
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
	
	public int getIndiceActualEstadoDetalleMovimientoInventario(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux:this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios()) {
				if(estadodetallemovimientoinventarioAux.getId().equals(estadodetallemovimientoinventario.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux:this.estadodetallemovimientoinventarios) {
				if(estadodetallemovimientoinventarioAux.getId().equals(estadodetallemovimientoinventario.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoDetalleMovimientoInventario(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux:this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios()) {
				if(estadodetallemovimientoinventarioAux.getEstadoDetalleMovimientoInventarioOriginal().getId().equals(estadodetallemovimientoinventarioOriginal.getId())) {
					existe=true;
					estadodetallemovimientoinventarioOriginal.setId(estadodetallemovimientoinventarioAux.getId());
					estadodetallemovimientoinventarioOriginal.setVersionRow(estadodetallemovimientoinventarioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux:this.estadodetallemovimientoinventarios) {
				if(estadodetallemovimientoinventarioAux.getEstadoDetalleMovimientoInventarioOriginal().getId().equals(estadodetallemovimientoinventarioOriginal.getId())) {
					existe=true;
					estadodetallemovimientoinventarioOriginal.setId(estadodetallemovimientoinventarioAux.getId());
					estadodetallemovimientoinventarioOriginal.setVersionRow(estadodetallemovimientoinventarioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoDetalleMovimientoInventario(Boolean esParaCancelar) throws Exception {
		estadodetallemovimientoinventariosAux=new ArrayList<EstadoDetalleMovimientoInventario>();
		estadodetallemovimientoinventarioAux=new EstadoDetalleMovimientoInventario();
		
		if(!this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux:this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios()) {
					if(estadodetallemovimientoinventarioAux.getId()<0) {
						estadodetallemovimientoinventariosAux.add(estadodetallemovimientoinventarioAux);
					}		
				}
				this.iIdNuevoEstadoDetalleMovimientoInventario=0L;
				this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().removeAll(estadodetallemovimientoinventariosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux:this.estadodetallemovimientoinventarios) {
					if(estadodetallemovimientoinventarioAux.getId()<0) {
						estadodetallemovimientoinventariosAux.add(estadodetallemovimientoinventarioAux);
					}		
				}
				this.iIdNuevoEstadoDetalleMovimientoInventario=0L;
				this.estadodetallemovimientoinventarios.removeAll(estadodetallemovimientoinventariosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoDetalleMovimientoInventario 
					&& this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().size()>0
					) {
					estadodetallemovimientoinventarioAux=this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().get(this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().size() - 1);
				
					if(estadodetallemovimientoinventarioAux.getId()<0) {
						this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().remove(estadodetallemovimientoinventarioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoDetalleMovimientoInventario && this.estadodetallemovimientoinventarios.size()>0) {
					estadodetallemovimientoinventarioAux=this.estadodetallemovimientoinventarios.get(this.estadodetallemovimientoinventarios.size() - 1);
				
					if(estadodetallemovimientoinventarioAux.getId()<0) {
						this.estadodetallemovimientoinventarios.remove(estadodetallemovimientoinventarioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoDetalleMovimientoInventario(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadodetallemovimientoinventario.getId()<0) {
				this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().remove(this.estadodetallemovimientoinventario);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadodetallemovimientoinventario.getId()<0) {
				this.estadodetallemovimientoinventarios.remove(this.estadodetallemovimientoinventario);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoDetalleMovimientoInventario(List<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosAux) throws Exception {
		EstadoDetalleMovimientoInventarioConstantesFunciones.setEstadosInicialesEstadoDetalleMovimientoInventario(estadodetallemovimientoinventariosAux);
	}
	
	public void setEstadosInicialesEstadoDetalleMovimientoInventario(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux) throws Exception {
		EstadoDetalleMovimientoInventarioConstantesFunciones.setEstadosInicialesEstadoDetalleMovimientoInventario(estadodetallemovimientoinventarioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoDetalleMovimientoInventarioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoDetalleMovimientoInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoDetalleMovimientoInventarioActual()) {
				if(!this.isEsNuevoEstadoDetalleMovimientoInventario) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoDetalleMovimientoInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoDetalleMovimientoInventario=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoDetalleMovimientoInventarioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Detalle Movimiento Inventario ?", "MANTENIMIENTO DE Estado Detalle Movimiento Inventario", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoDetalleMovimientoInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario) throws Exception {
		EstadoDetalleMovimientoInventarioConstantesFunciones.seleccionarAsignar(this.estadodetallemovimientoinventario,estadodetallemovimientoinventario);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoDetalleMovimientoInventario=this.isPermisoActualizarOriginalEstadoDetalleMovimientoInventario;
			
			
			this.seleccionarAsignar(estadodetallemovimientoinventario);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoDetalleMovimientoInventarioConstantesFunciones.quitarEspaciosEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoDetalleMovimientoInventario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadodetallemovimientoinventarioSessionBean.setsFuncionBusquedaRapida(this.estadodetallemovimientoinventarioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoDetalleMovimientoInventario) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoDetalleMovimientoInventario(esParaCancelar);				
				this.cancelarNuevoEstadoDetalleMovimientoInventario(esParaCancelar);								
			}
			
			this.estadodetallemovimientoinventario=new EstadoDetalleMovimientoInventario();
			
			this.inicializarEstadoDetalleMovimientoInventario();
			
			this.actualizarEstadoCeldasBotonesEstadoDetalleMovimientoInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoDetalleMovimientoInventario() throws Exception {
		try {
			EstadoDetalleMovimientoInventarioConstantesFunciones.inicializarEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoDetalleMovimientoInventarios(String sAccionBusqueda,List<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoDetalleMovimientoInventario"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoDetalleMovimientoInventarioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoDetalleMovimientoInventarioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoDetalleMovimientoInventario"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Detalle Movimiento Inventarios");		
		parameters.put("busquedapor", EstadoDetalleMovimientoInventarioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
					
					EstadoDetalleMovimientoInventarioLogic estadodetallemovimientoinventarioLogicAuxiliar=new EstadoDetalleMovimientoInventarioLogic();
					estadodetallemovimientoinventarioLogicAuxiliar.setDatosCliente(estadodetallemovimientoinventarioLogic.getDatosCliente());				
					estadodetallemovimientoinventarioLogicAuxiliar.setEstadoDetalleMovimientoInventarios(estadodetallemovimientoinventariosParaReportes);
					
					estadodetallemovimientoinventarioLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoDetalleMovimientoInventarioWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadodetallemovimientoinventariosParaReportes=estadodetallemovimientoinventarioLogicAuxiliar.getEstadoDetalleMovimientoInventarios();
					
					//estadodetallemovimientoinventarioLogic.getNewConnexionToDeep();
					
					//for (EstadoDetalleMovimientoInventario estadodetallemovimientoinventario:estadodetallemovimientoinventariosParaReportes) {
					//	estadodetallemovimientoinventarioLogic.deepLoad(estadodetallemovimientoinventario, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadodetallemovimientoinventarioLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadodetallemovimientoinventarioLogic.closeNewConnexionToDeep();
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoDetalleMovimientoInventario=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoDetalleMovimientoInventarioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoDetalleMovimientoInventarioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoDetalleMovimientoInventario=new JRBeanArrayDataSource(EstadoDetalleMovimientoInventarioJInternalFrame.TraerEstadoDetalleMovimientoInventarioBeans(estadodetallemovimientoinventariosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoDetalleMovimientoInventario);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoDetalleMovimientoInventarioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoDetalleMovimientoInventarioBean.TraerEstadoDetalleMovimientoInventarioBeans(estadodetallemovimientoinventariosParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoDetalleMovimientoInventarios(sAccionBusqueda,sTipoArchivoReporte,estadodetallemovimientoinventariosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoDetalleMovimientoInventarios(sAccionBusqueda,sTipoArchivoReporte,estadodetallemovimientoinventariosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoDetalleMovimientoInventarioActionPerformed(null);
					//this.generarExcelReporteEstadoDetalleMovimientoInventarios(sAccionBusqueda,sTipoArchivoReporte,estadodetallemovimientoinventariosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoDetalleMovimientoInventarios(sAccionBusqueda,sTipoArchivoReporte,estadodetallemovimientoinventariosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoDetalleMovimientoInventarios(sAccionBusqueda,sTipoArchivoReporte,estadodetallemovimientoinventariosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoDetalleMovimientoInventarios(sAccionBusqueda,sTipoArchivoReporte,estadodetallemovimientoinventariosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoDetalleMovimientoInventarios(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetallemovimientoinventario";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoDetalleMovimientoInventarios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoDetalleMovimientoInventario("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario : estadodetallemovimientoinventariosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoDetalleMovimientoInventarioConstantesFunciones.generarExcelReporteDataEstadoDetalleMovimientoInventario("NORMAL",row,workbook,estadodetallemovimientoinventario,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Movimiento Inventario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoDetalleMovimientoInventario(String sTipo,Row row,Workbook workbook) {
		
		EstadoDetalleMovimientoInventarioConstantesFunciones.generarExcelReporteHeaderEstadoDetalleMovimientoInventario(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoDetalleMovimientoInventarios(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetallemovimientoinventario_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoDetalleMovimientoInventarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario : estadodetallemovimientoinventariosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoDetalleMovimientoInventarioConstantesFunciones.getEstadoDetalleMovimientoInventarioDescripcion(estadodetallemovimientoinventario));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadodetallemovimientoinventario.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadodetallemovimientoinventario.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Movimiento Inventario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoDetalleMovimientoInventarios(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosRespaldo=null;
		
		classes=EstadoDetalleMovimientoInventarioConstantesFunciones.getClassesRelationshipsOfEstadoDetalleMovimientoInventario(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadodetallemovimientoinventarioLogic.setDatosCliente(this.datosCliente);
		this.estadodetallemovimientoinventarioLogic.setDatosDeep(this.datosDeep);
		this.estadodetallemovimientoinventarioLogic.setIsConDeep(true);
		
		estadodetallemovimientoinventariosRespaldo=this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios();
		
		this.estadodetallemovimientoinventarioLogic.setEstadoDetalleMovimientoInventarios(estadodetallemovimientoinventariosParaReportes);	
		this.estadodetallemovimientoinventarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadodetallemovimientoinventariosParaReportes=this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios();
		this.estadodetallemovimientoinventarioLogic.setEstadoDetalleMovimientoInventarios(estadodetallemovimientoinventariosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetallemovimientoinventario_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoDetalleMovimientoInventarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoDetalleMovimientoInventario("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario : estadodetallemovimientoinventariosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoDetalleMovimientoInventario("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoDetalleMovimientoInventarioConstantesFunciones.generarExcelReporteDataEstadoDetalleMovimientoInventario("NORMAL",row,workbook,estadodetallemovimientoinventario,cellStyleDataAux);
		
			
			


				//DetalleMovimientoInventario
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadodetallemovimientoinventario.getDetalleMovimientoInventarios()!=null && estadodetallemovimientoinventario.getDetalleMovimientoInventarios().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleMovimientoInventarioConstantesFunciones.generarExcelReporteHeaderDetalleMovimientoInventario("RELACIONADO",row,workbook);
				}

				if(estadodetallemovimientoinventario.getDetalleMovimientoInventarios()!=null) {
					i2=0;
					for(DetalleMovimientoInventario detallemovimientoinventario : estadodetallemovimientoinventario.getDetalleMovimientoInventarios()) {
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
		cell.setCellValue(EstadoDetalleMovimientoInventarioConstantesFunciones.getEstadoDetalleMovimientoInventarioDescripcion(estadodetallemovimientoinventario));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Movimiento Inventario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoDetalleMovimientoInventario() throws Exception {		
		this.startProcessEstadoDetalleMovimientoInventario(true);
	}
	
	public void startProcessEstadoDetalleMovimientoInventario(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoDetalleMovimientoInventario, this.jScrollPanelDatosEstadoDetalleMovimientoInventario,this.jPanelPaginacionEstadoDetalleMovimientoInventario, this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario, this.jPanelAccionesEstadoDetalleMovimientoInventario,this.jPanelAccionesFormularioEstadoDetalleMovimientoInventario,this.jmenuBarEstadoDetalleMovimientoInventario,this.jmenuBarDetalleEstadoDetalleMovimientoInventario,this.jTtoolBarEstadoDetalleMovimientoInventario,this.jTtoolBarDetalleEstadoDetalleMovimientoInventario);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoDetalleMovimientoInventario=null; 
		
		final JPanel jPanelParametrosReportesEstadoDetalleMovimientoInventario=this.jPanelParametrosReportesEstadoDetalleMovimientoInventario;
		//final JScrollPane jScrollPanelDatosEstadoDetalleMovimientoInventario=this.jScrollPanelDatosEstadoDetalleMovimientoInventario;
		final JTable jTableDatosEstadoDetalleMovimientoInventario=this.jTableDatosEstadoDetalleMovimientoInventario;		
		final JPanel jPanelPaginacionEstadoDetalleMovimientoInventario=this.jPanelPaginacionEstadoDetalleMovimientoInventario;
		//final JScrollPane jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario=this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario;
		final JPanel jPanelAccionesEstadoDetalleMovimientoInventario=this.jPanelAccionesEstadoDetalleMovimientoInventario;
		
		JPanel jPanelCamposAuxiliarEstadoDetalleMovimientoInventario=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoDetalleMovimientoInventario=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) {
			jPanelCamposAuxiliarEstadoDetalleMovimientoInventario=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jPanelCamposEstadoDetalleMovimientoInventario;
			jPanelAccionesFormularioAuxiliarEstadoDetalleMovimientoInventario=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jPanelAccionesFormularioEstadoDetalleMovimientoInventario;
		}
		
		final JPanel jPanelCamposEstadoDetalleMovimientoInventario=jPanelCamposAuxiliarEstadoDetalleMovimientoInventario;
		final JPanel jPanelAccionesFormularioEstadoDetalleMovimientoInventario=jPanelAccionesFormularioAuxiliarEstadoDetalleMovimientoInventario;
		
		
		final JMenuBar jmenuBarEstadoDetalleMovimientoInventario=this.jmenuBarEstadoDetalleMovimientoInventario;
		final JToolBar jTtoolBarEstadoDetalleMovimientoInventario=this.jTtoolBarEstadoDetalleMovimientoInventario;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoDetalleMovimientoInventario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoDetalleMovimientoInventario=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) {
			jmenuBarDetalleAuxiliarEstadoDetalleMovimientoInventario=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jmenuBarDetalleEstadoDetalleMovimientoInventario;
			jTtoolBarDetalleAuxiliarEstadoDetalleMovimientoInventario=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTtoolBarDetalleEstadoDetalleMovimientoInventario;
		}
		
		final JMenuBar jmenuBarDetalleEstadoDetalleMovimientoInventario=jmenuBarDetalleAuxiliarEstadoDetalleMovimientoInventario;
		final JToolBar jTtoolBarDetalleEstadoDetalleMovimientoInventario=jTtoolBarDetalleAuxiliarEstadoDetalleMovimientoInventario;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoDetalleMovimientoInventario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoDetalleMovimientoInventario;
			processRunnable.jTableDatos=jTableDatosEstadoDetalleMovimientoInventario;
			processRunnable.jPanelCampos=jPanelCamposEstadoDetalleMovimientoInventario;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoDetalleMovimientoInventario;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoDetalleMovimientoInventario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoDetalleMovimientoInventario;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoDetalleMovimientoInventario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoDetalleMovimientoInventario;
			processRunnable.jTtoolBar=jTtoolBarEstadoDetalleMovimientoInventario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoDetalleMovimientoInventario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoDetalleMovimientoInventario ,jPanelParametrosReportesEstadoDetalleMovimientoInventario,jTableDatosEstadoDetalleMovimientoInventario, /*jScrollPanelDatosEstadoDetalleMovimientoInventario,*/jPanelCamposEstadoDetalleMovimientoInventario,jPanelPaginacionEstadoDetalleMovimientoInventario, /*jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario,*/ jPanelAccionesEstadoDetalleMovimientoInventario,jPanelAccionesFormularioEstadoDetalleMovimientoInventario,jmenuBarEstadoDetalleMovimientoInventario,jmenuBarDetalleEstadoDetalleMovimientoInventario,jTtoolBarEstadoDetalleMovimientoInventario,jTtoolBarDetalleEstadoDetalleMovimientoInventario);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoDetalleMovimientoInventario, jScrollPanelDatosEstadoDetalleMovimientoInventario,jPanelPaginacionEstadoDetalleMovimientoInventario, jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario, jPanelAccionesEstadoDetalleMovimientoInventario,jPanelAccionesFormularioEstadoDetalleMovimientoInventario,jmenuBarEstadoDetalleMovimientoInventario,jmenuBarDetalleEstadoDetalleMovimientoInventario,jTtoolBarEstadoDetalleMovimientoInventario,jTtoolBarDetalleEstadoDetalleMovimientoInventario);
						
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
	
	public void finishProcessEstadoDetalleMovimientoInventario() {// throws Exception 
		this.finishProcessEstadoDetalleMovimientoInventario(true);
	}
	
	public void finishProcessEstadoDetalleMovimientoInventario(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoDetalleMovimientoInventario, this.jScrollPanelDatosEstadoDetalleMovimientoInventario,this.jPanelPaginacionEstadoDetalleMovimientoInventario, this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario, this.jPanelAccionesEstadoDetalleMovimientoInventario,this.jPanelAccionesFormularioEstadoDetalleMovimientoInventario,this.jmenuBarEstadoDetalleMovimientoInventario,this.jmenuBarDetalleEstadoDetalleMovimientoInventario,this.jTtoolBarEstadoDetalleMovimientoInventario,this.jTtoolBarDetalleEstadoDetalleMovimientoInventario);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoDetalleMovimientoInventario=null; 
		
		final JPanel jPanelParametrosReportesEstadoDetalleMovimientoInventario=this.jPanelParametrosReportesEstadoDetalleMovimientoInventario;
		//final JScrollPane jScrollPanelDatosEstadoDetalleMovimientoInventario=this.jScrollPanelDatosEstadoDetalleMovimientoInventario;
		final JTable jTableDatosEstadoDetalleMovimientoInventario=this.jTableDatosEstadoDetalleMovimientoInventario;		
		final JPanel jPanelPaginacionEstadoDetalleMovimientoInventario=this.jPanelPaginacionEstadoDetalleMovimientoInventario;
		//final JScrollPane jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario=this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario;
		final JPanel jPanelAccionesEstadoDetalleMovimientoInventario=this.jPanelAccionesEstadoDetalleMovimientoInventario;
		
		JPanel jPanelCamposAuxiliarEstadoDetalleMovimientoInventario=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoDetalleMovimientoInventario=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) {
			jPanelCamposAuxiliarEstadoDetalleMovimientoInventario=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jPanelCamposEstadoDetalleMovimientoInventario;
			jPanelAccionesFormularioAuxiliarEstadoDetalleMovimientoInventario=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jPanelAccionesFormularioEstadoDetalleMovimientoInventario;
		}
		
		final JPanel jPanelCamposEstadoDetalleMovimientoInventario=jPanelCamposAuxiliarEstadoDetalleMovimientoInventario;
		final JPanel jPanelAccionesFormularioEstadoDetalleMovimientoInventario=jPanelAccionesFormularioAuxiliarEstadoDetalleMovimientoInventario;
		
		
		final JMenuBar jmenuBarEstadoDetalleMovimientoInventario=this.jmenuBarEstadoDetalleMovimientoInventario;		
		final JToolBar jTtoolBarEstadoDetalleMovimientoInventario=this.jTtoolBarEstadoDetalleMovimientoInventario;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoDetalleMovimientoInventario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoDetalleMovimientoInventario=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) {
			jmenuBarDetalleAuxiliarEstadoDetalleMovimientoInventario=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jmenuBarDetalleEstadoDetalleMovimientoInventario;
			jTtoolBarDetalleAuxiliarEstadoDetalleMovimientoInventario=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTtoolBarDetalleEstadoDetalleMovimientoInventario;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoDetalleMovimientoInventario=jmenuBarDetalleAuxiliarEstadoDetalleMovimientoInventario;
		final JToolBar jTtoolBarDetalleEstadoDetalleMovimientoInventario=jTtoolBarDetalleAuxiliarEstadoDetalleMovimientoInventario;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoDetalleMovimientoInventario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoDetalleMovimientoInventario;
			processRunnable.jTableDatos=jTableDatosEstadoDetalleMovimientoInventario;
			processRunnable.jPanelCampos=jPanelCamposEstadoDetalleMovimientoInventario;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoDetalleMovimientoInventario;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoDetalleMovimientoInventario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoDetalleMovimientoInventario;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoDetalleMovimientoInventario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoDetalleMovimientoInventario;
			processRunnable.jTtoolBar=jTtoolBarEstadoDetalleMovimientoInventario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoDetalleMovimientoInventario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoDetalleMovimientoInventario ,jPanelParametrosReportesEstadoDetalleMovimientoInventario, jTableDatosEstadoDetalleMovimientoInventario,/*jScrollPanelDatosEstadoDetalleMovimientoInventario,*/jPanelCamposEstadoDetalleMovimientoInventario,jPanelPaginacionEstadoDetalleMovimientoInventario, /*jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario,*/ jPanelAccionesEstadoDetalleMovimientoInventario,jPanelAccionesFormularioEstadoDetalleMovimientoInventario,jmenuBarEstadoDetalleMovimientoInventario,jmenuBarDetalleEstadoDetalleMovimientoInventario,jTtoolBarEstadoDetalleMovimientoInventario,jTtoolBarDetalleEstadoDetalleMovimientoInventario));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoDetalleMovimientoInventario(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoDetalleMovimientoInventario(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoDetalleMovimientoInventario(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoDetalleMovimientoInventario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoDetalleMovimientoInventario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoDetalleMovimientoInventario,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoDetalleMovimientoInventario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoDetalleMovimientoInventario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoDetalleMovimientoInventario,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadodetallemovimientoinventarioConstantesFunciones.getsFinalQueryEstadoDetalleMovimientoInventario();
		String  finalQueryPaginacionTodos=this.estadodetallemovimientoinventarioConstantesFunciones.getsFinalQueryEstadoDetalleMovimientoInventario();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoDetalleMovimientoInventarioConstantesFunciones.getArrayColumnasGlobalesNoEstadoDetalleMovimientoInventario(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoDetalleMovimientoInventarioConstantesFunciones.getArrayColumnasGlobalesEstadoDetalleMovimientoInventario(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoDetalleMovimientoInventarioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadodetallemovimientoinventariosEliminados= new ArrayList<EstadoDetalleMovimientoInventario>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoDetalleMovimientoInventario();
		
				///*EstadoDetalleMovimientoInventarioSessionBean*/this.estadodetallemovimientoinventarioSessionBean=new EstadoDetalleMovimientoInventarioSessionBean();
			
			if(this.estadodetallemovimientoinventarioSessionBean==null) {
				this.estadodetallemovimientoinventarioSessionBean=new EstadoDetalleMovimientoInventarioSessionBean();
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
					this.iNumeroPaginacion=EstadoDetalleMovimientoInventarioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoDetalleMovimientoInventarioConstantesFunciones.getClassesForeignKeysOfEstadoDetalleMovimientoInventario(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadodetallemovimientoinventario."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadodetallemovimientoinventariosAux= new ArrayList<EstadoDetalleMovimientoInventario>();
			
				
			estadodetallemovimientoinventarioLogic.setDatosCliente(this.datosCliente);
			estadodetallemovimientoinventarioLogic.setDatosDeep(this.datosDeep);
			estadodetallemovimientoinventarioLogic.setIsConDeep(true);
			
			
			estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarioDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadodetallemovimientoinventarioLogic.getTodosEstadoDetalleMovimientoInventarios(finalQueryGlobal,pagination);
					
					//estadodetallemovimientoinventarioLogic.getTodosEstadoDetalleMovimientoInventariosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios()==null|| estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadodetallemovimientoinventariosAux= new ArrayList<EstadoDetalleMovimientoInventario>();
							estadodetallemovimientoinventariosAux.addAll(estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadodetallemovimientoinventariosAux= new ArrayList<EstadoDetalleMovimientoInventario>();
							estadodetallemovimientoinventariosAux.addAll(estadodetallemovimientoinventarios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadodetallemovimientoinventarioLogic.getTodosEstadoDetalleMovimientoInventarios(finalQueryGlobal+"",this.pagination);												
							
							//estadodetallemovimientoinventarioLogic.getTodosEstadoDetalleMovimientoInventariosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoDetalleMovimientoInventarios("Todos",estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadodetallemovimientoinventarioLogic.setEstadoDetalleMovimientoInventarios(new ArrayList<EstadoDetalleMovimientoInventario>());					
							estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().addAll(estadodetallemovimientoinventariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadodetallemovimientoinventarios=new ArrayList<EstadoDetalleMovimientoInventario>();
							estadodetallemovimientoinventarios.addAll(estadodetallemovimientoinventariosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoDetalleMovimientoInventario=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoDetalleMovimientoInventario=this.idActual;
				
				} else if(this.idEstadoDetalleMovimientoInventarioActual!=null && this.idEstadoDetalleMovimientoInventarioActual!=0L) {
					idEstadoDetalleMovimientoInventario=idEstadoDetalleMovimientoInventarioActual;
				}
				
					
				this.sDetalleReporte=EstadoDetalleMovimientoInventarioConstantesFunciones.getDetalleIndicePorId(idEstadoDetalleMovimientoInventario);
				
				this.estadodetallemovimientoinventarios=new ArrayList<EstadoDetalleMovimientoInventario>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadodetallemovimientoinventarioLogic.getEntity(idEstadoDetalleMovimientoInventario);
					
					//estadodetallemovimientoinventarioLogic.getEntityWithConnection(idEstadoDetalleMovimientoInventario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadodetallemovimientoinventarioLogic.setEstadoDetalleMovimientoInventarios(new ArrayList<EstadoDetalleMovimientoInventario>());
					estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().add(estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventario());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadodetallemovimientoinventarios=new ArrayList<EstadoDetalleMovimientoInventario>();
					this.estadodetallemovimientoinventarios.add(estadodetallemovimientoinventario);
				}
				
				if(estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventario()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoDetalleMovimientoInventario();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoDetalleMovimientoInventario();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadodetallemovimientoinventarios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadodetallemovimientoinventarios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario) {
		Boolean permite=true;
		
		if(this.estadodetallemovimientoinventario.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoDetalleMovimientoInventarioConstantesFunciones.getOrderByListaEstadoDetalleMovimientoInventario();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoDetalleMovimientoInventarioConstantesFunciones.getOrderByListaEstadoDetalleMovimientoInventario();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario:estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios()) {
				if(estadodetallemovimientoinventario.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetallemovimientoinventarioTotales=estadodetallemovimientoinventario;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario:this.estadodetallemovimientoinventarios) {
				if(estadodetallemovimientoinventario.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetallemovimientoinventarioTotales=estadodetallemovimientoinventario;
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
			this.estadodetallemovimientoinventarioAux=new EstadoDetalleMovimientoInventario();
			this.estadodetallemovimientoinventarioAux.setsType(Constantes2.S_TOTALES);
			this.estadodetallemovimientoinventarioAux.setIsNew(false);
			this.estadodetallemovimientoinventarioAux.setIsChanged(false);
			this.estadodetallemovimientoinventarioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoDetalleMovimientoInventarioConstantesFunciones.TotalizarValoresFilaEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios(),this.estadodetallemovimientoinventarioAux);
				
				this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().add(this.estadodetallemovimientoinventarioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoDetalleMovimientoInventarioConstantesFunciones.TotalizarValoresFilaEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventarios,this.estadodetallemovimientoinventarioAux);
				
				this.estadodetallemovimientoinventarios.add(this.estadodetallemovimientoinventarioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadodetallemovimientoinventarioTotales=new EstadoDetalleMovimientoInventario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().remove(estadodetallemovimientoinventarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadodetallemovimientoinventarios.remove(estadodetallemovimientoinventarioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadodetallemovimientoinventarioTotales=new EstadoDetalleMovimientoInventario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario:estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios()) {
				if(estadodetallemovimientoinventario.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetallemovimientoinventarioTotales=estadodetallemovimientoinventario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoDetalleMovimientoInventarioConstantesFunciones.TotalizarValoresFilaEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios(),estadodetallemovimientoinventarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario:this.estadodetallemovimientoinventarios) {
				if(estadodetallemovimientoinventario.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetallemovimientoinventarioTotales=estadodetallemovimientoinventario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoDetalleMovimientoInventarioConstantesFunciones.TotalizarValoresFilaEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventarios,estadodetallemovimientoinventarioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosEstadoDetalleMovimientoInventario() {
		this.isPermisoTodoEstadoDetalleMovimientoInventario=false;
		this.isPermisoNuevoEstadoDetalleMovimientoInventario=false;
		this.isPermisoActualizarEstadoDetalleMovimientoInventario=false;
		this.isPermisoActualizarOriginalEstadoDetalleMovimientoInventario=false;
		this.isPermisoEliminarEstadoDetalleMovimientoInventario=false;
		this.isPermisoGuardarCambiosEstadoDetalleMovimientoInventario=false;
		this.isPermisoConsultaEstadoDetalleMovimientoInventario=false;
		this.isPermisoBusquedaEstadoDetalleMovimientoInventario=false;
		this.isPermisoReporteEstadoDetalleMovimientoInventario=false;		
		this.isPermisoOrdenEstadoDetalleMovimientoInventario=false;		
		this.isPermisoPaginacionMedioEstadoDetalleMovimientoInventario=false;		
		this.isPermisoPaginacionAltoEstadoDetalleMovimientoInventario=false;
		this.isPermisoPaginacionTodoEstadoDetalleMovimientoInventario=false;
		this.isPermisoCopiarEstadoDetalleMovimientoInventario=false;		
		this.isPermisoVerFormEstadoDetalleMovimientoInventario=false;		
		this.isPermisoDuplicarEstadoDetalleMovimientoInventario=false;		
		this.isPermisoOrdenEstadoDetalleMovimientoInventario=false;		
	}
	
	public void setPermisosUsuarioEstadoDetalleMovimientoInventario(Boolean isPermiso) {
		this.isPermisoTodoEstadoDetalleMovimientoInventario=isPermiso;
		this.isPermisoNuevoEstadoDetalleMovimientoInventario=isPermiso;
		this.isPermisoActualizarEstadoDetalleMovimientoInventario=isPermiso;
		this.isPermisoActualizarOriginalEstadoDetalleMovimientoInventario=isPermiso;
		this.isPermisoEliminarEstadoDetalleMovimientoInventario=isPermiso;
		this.isPermisoGuardarCambiosEstadoDetalleMovimientoInventario=isPermiso;
		this.isPermisoConsultaEstadoDetalleMovimientoInventario=isPermiso;
		this.isPermisoBusquedaEstadoDetalleMovimientoInventario=isPermiso;
		this.isPermisoReporteEstadoDetalleMovimientoInventario=isPermiso;
		this.isPermisoOrdenEstadoDetalleMovimientoInventario=isPermiso;		
		this.isPermisoPaginacionMedioEstadoDetalleMovimientoInventario=isPermiso;		
		this.isPermisoPaginacionAltoEstadoDetalleMovimientoInventario=isPermiso;		
		this.isPermisoPaginacionTodoEstadoDetalleMovimientoInventario=isPermiso;		
		this.isPermisoCopiarEstadoDetalleMovimientoInventario=isPermiso;		
		this.isPermisoVerFormEstadoDetalleMovimientoInventario=isPermiso;		
		this.isPermisoDuplicarEstadoDetalleMovimientoInventario=isPermiso;
		this.isPermisoOrdenEstadoDetalleMovimientoInventario=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoDetalleMovimientoInventario(Boolean isPermiso) {
		//this.isPermisoTodoEstadoDetalleMovimientoInventario=isPermiso;
		this.isPermisoNuevoEstadoDetalleMovimientoInventario=isPermiso;
		this.isPermisoActualizarEstadoDetalleMovimientoInventario=isPermiso;
		this.isPermisoActualizarOriginalEstadoDetalleMovimientoInventario=isPermiso;
		this.isPermisoEliminarEstadoDetalleMovimientoInventario=isPermiso;
		this.isPermisoGuardarCambiosEstadoDetalleMovimientoInventario=isPermiso;
		//this.isPermisoConsultaEstadoDetalleMovimientoInventario=isPermiso;
		//this.isPermisoBusquedaEstadoDetalleMovimientoInventario=isPermiso;
		//this.isPermisoReporteEstadoDetalleMovimientoInventario=isPermiso;
		//this.isPermisoOrdenEstadoDetalleMovimientoInventario=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoDetalleMovimientoInventario=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoDetalleMovimientoInventario=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoDetalleMovimientoInventario=isPermiso;		
		//this.isPermisoCopiarEstadoDetalleMovimientoInventario=isPermiso;		
		//this.isPermisoDuplicarEstadoDetalleMovimientoInventario=isPermiso;
		//this.isPermisoOrdenEstadoDetalleMovimientoInventario=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoDetalleMovimientoInventarioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleMovimientoInventarioConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoDetalleMovimientoInventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosDetalleMovimientoInventario=this.verificarGetPermisosUsuarioOpcionEstadoDetalleMovimientoInventarioClaseRelacionada(this.opcionsRelacionadas,DetalleMovimientoInventarioConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoDetalleMovimientoInventario(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoDetalleMovimientoInventarioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleMovimientoInventario=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoDetalleMovimientoInventarioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoDetalleMovimientoInventarioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoDetalleMovimientoInventarioClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleMovimientoInventario && this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null && this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTabbedPaneRelacionesEstadoDetalleMovimientoInventario.remove(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoDetalleMovimientoInventario() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoDetalleMovimientoInventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoDetalleMovimientoInventarioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoDetalleMovimientoInventario=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoDetalleMovimientoInventario=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoDetalleMovimientoInventario=this.isPermisoActualizarEstadoDetalleMovimientoInventario;
			this.isPermisoEliminarEstadoDetalleMovimientoInventario=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoDetalleMovimientoInventario=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoDetalleMovimientoInventario=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoDetalleMovimientoInventario=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoDetalleMovimientoInventario=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoDetalleMovimientoInventario=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoDetalleMovimientoInventario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoDetalleMovimientoInventario=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoDetalleMovimientoInventario=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoDetalleMovimientoInventario=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoDetalleMovimientoInventario=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoDetalleMovimientoInventario=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoDetalleMovimientoInventario=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoDetalleMovimientoInventario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoDetalleMovimientoInventario.setToolTipText(this.jTableDatosEstadoDetalleMovimientoInventario.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoDetalleMovimientoInventario(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoDetalleMovimientoInventario(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoDetalleMovimientoInventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoDetalleMovimientoInventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoDetalleMovimientoInventario() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleMovimientoInventario && this.estadodetallemovimientoinventarioConstantesFunciones.mostrarDetalleMovimientoInventarioEstadoDetalleMovimientoInventario && !EstadoDetalleMovimientoInventarioConstantesFunciones.ISGUARDARREL) {

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
	
		
	public void inicializarCombosForeignKeyEstadoDetalleMovimientoInventarioListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoDetalleMovimientoInventarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoDetalleMovimientoInventarioJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoDetalleMovimientoInventarioListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoDetalleMovimientoInventarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoDetalleMovimientoInventario()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoDetalleMovimientoInventario()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoDetalleMovimientoInventario(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoDetalleMovimientoInventario()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoDetalleMovimientoInventario();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleMovimientoInventario(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoDetalleMovimientoInventario(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoDetalleMovimientoInventario()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoDetalleMovimientoInventario()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoDetalleMovimientoInventario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoDetalleMovimientoInventario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoDetalleMovimientoInventario()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoDetalleMovimientoInventario()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoDetalleMovimientoInventario(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoDetalleMovimientoInventario()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoDetalleMovimientoInventarioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoDetalleMovimientoInventarioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoDetalleMovimientoInventarioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadodetallemovimientoinventarioSessionBean=new EstadoDetalleMovimientoInventarioSessionBean(); 
		this.estadodetallemovimientoinventarioConstantesFunciones=new EstadoDetalleMovimientoInventarioConstantesFunciones(); 
		this.estadodetallemovimientoinventarioBean=new EstadoDetalleMovimientoInventario();//(this.estadodetallemovimientoinventarioConstantesFunciones); 		
		this.estadodetallemovimientoinventarioReturnGeneral=new EstadoDetalleMovimientoInventarioParameterReturnGeneral(); 
		
		this.estadodetallemovimientoinventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadodetallemovimientoinventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoDetalleMovimientoInventarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoDetalleMovimientoInventarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoDetalleMovimientoInventarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoDetalleMovimientoInventario(true);
			
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
			
			this.estadodetallemovimientoinventarioConstantesFunciones=new EstadoDetalleMovimientoInventarioConstantesFunciones(); 
			this.estadodetallemovimientoinventarioBean=new EstadoDetalleMovimientoInventario();//this.estadodetallemovimientoinventarioConstantesFunciones); 			
			this.estadodetallemovimientoinventarioReturnGeneral=new EstadoDetalleMovimientoInventarioParameterReturnGeneral(); 
		
			EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Detalle Movimiento Inventario Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadodetallemovimientoinventario=new EstadoDetalleMovimientoInventario();
			this.estadodetallemovimientoinventarios = new ArrayList<EstadoDetalleMovimientoInventario>();
			this.estadodetallemovimientoinventariosAux = new ArrayList<EstadoDetalleMovimientoInventario>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic=new EstadoDetalleMovimientoInventarioLogic();
				this.estadodetallemovimientoinventarioLogic.getNewConnexionToDeep("");
			}
			
			//this.estadodetallemovimientoinventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadodetallemovimientoinventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario);	
					}
					
					if(this.jInternalFrameImportacionEstadoDetalleMovimientoInventario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoDetalleMovimientoInventario);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoDetalleMovimientoInventario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoDetalleMovimientoInventario);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario);
				this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.setVisible(false);
				this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario);
					this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoDetalleMovimientoInventario!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoDetalleMovimientoInventario);
					this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.setVisible(false);
					this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoDetalleMovimientoInventario!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoDetalleMovimientoInventario);
					this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.setVisible(false);
					this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoDetalleMovimientoInventarioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoDetalleMovimientoInventarioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadodetallemovimientoinventarioReturnGeneral=new EstadoDetalleMovimientoInventarioParameterReturnGeneral();
			
			this.estadodetallemovimientoinventarioParameterGeneral=new EstadoDetalleMovimientoInventarioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadodetallemovimientoinventarioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoDetalleMovimientoInventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleMovimientoInventarioConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoDetalleMovimientoInventarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado(),this.estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoDetalleMovimientoInventarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado(),this.estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaDuplicarEstadoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaCopiarEstadoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaVerFormEstadoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaOrdenEstadoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaModificarEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleMovimientoInventario=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoDetalleMovimientoInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoDetalleMovimientoInventario();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoDetalleMovimientoInventario(false);
			
			this.setPermisosUsuarioEstadoDetalleMovimientoInventario();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado() 
				|| (this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado() && this.estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoDetalleMovimientoInventarioClasesRelacionadas();
			}
			
			if(this.estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoDetalleMovimientoInventarioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoDetalleMovimientoInventario();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoDetalleMovimientoInventario();
			}
			
			if(!this.isPermisoBusquedaEstadoDetalleMovimientoInventario) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoDetalleMovimientoInventario,this.isPermisoPaginacionMedioEstadoDetalleMovimientoInventario,this.isPermisoPaginacionTodoEstadoDetalleMovimientoInventario);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoDetalleMovimientoInventarioConstantesFunciones.getTiposSeleccionarEstadoDetalleMovimientoInventario());
				
				this.tiposColumnasSelect=EstadoDetalleMovimientoInventarioConstantesFunciones.getTiposSeleccionarEstadoDetalleMovimientoInventario(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoDetalleMovimientoInventario();				
				//this.tiposRelacionesSelect=EstadoDetalleMovimientoInventarioConstantesFunciones.getTiposRelacionesEstadoDetalleMovimientoInventario(true);
				
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
			//if(!this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoDetalleMovimientoInventario();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoDetalleMovimientoInventario(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoDetalleMovimientoInventario(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetalleMovimientoInventario() ;
			
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
				estadodetallemovimientoinventarioImplementable= (EstadoDetalleMovimientoInventarioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoDetalleMovimientoInventarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadodetallemovimientoinventarioImplementableHome= (EstadoDetalleMovimientoInventarioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoDetalleMovimientoInventarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadodetallemovimientoinventarios= new ArrayList<EstadoDetalleMovimientoInventario>();
			this.estadodetallemovimientoinventariosEliminados= new ArrayList<EstadoDetalleMovimientoInventario>();
						
			this.isEsNuevoEstadoDetalleMovimientoInventario=false;
			this.esParaAccionDesdeFormularioEstadoDetalleMovimientoInventario=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoDetalleMovimientoInventario(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoDetalleMovimientoInventario();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoDetalleMovimientoInventarioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoDetalleMovimientoInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoDetalleMovimientoInventario(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoDetalleMovimientoInventario();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoDetalleMovimientoInventario();
			}
			
			EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoDetalleMovimientoInventario(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoDetalleMovimientoInventario: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoDetalleMovimientoInventario() {
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
			if(sTipo.equals("RelacionesEstadoDetalleMovimientoInventario")) {
				iIndex=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTabbedPaneRelacionesEstadoDetalleMovimientoInventario.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTabbedPaneRelacionesEstadoDetalleMovimientoInventario.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Movimiento Inventarios")) {
					if(!DetalleMovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoDetalleMovimientoInventario();

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
				this.finishProcessEstadoDetalleMovimientoInventario();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleMovimientoInventario(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.cargarSessionConBeanSwingJInternalFrameDetalleMovimientoInventario(false,true,iIndex);
		this.jButtonDetalleMovimientoInventarioActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleMovimientoInventario();

		//this.jTabbedPaneRelacionesEstadoDetalleMovimientoInventario.updateUI();
		//this.jTabbedPaneRelacionesEstadoDetalleMovimientoInventario.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoDetalleMovimientoInventario.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleMovimientoInventario")) {
				int row=this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRow();
				jButtonDetalleMovimientoInventarioActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Movimiento Inventario")) {

					if(this.isTienePermisosDetalleMovimientoInventario && this.estadodetallemovimientoinventarioConstantesFunciones.mostrarDetalleMovimientoInventarioEstadoDetalleMovimientoInventario && !EstadoDetalleMovimientoInventarioConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Movimiento Inventarios"+"("+DetalleMovimientoInventarioConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Movimiento Inventarios");

						if(estadodetallemovimientoinventarioConstantesFunciones.resaltarDetalleMovimientoInventarioEstadoDetalleMovimientoInventario!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadodetallemovimientoinventarioConstantesFunciones.resaltarDetalleMovimientoInventarioEstadoDetalleMovimientoInventario);
						}

						jmenuItem.setEnabled(this.estadodetallemovimientoinventarioConstantesFunciones.activarDetalleMovimientoInventarioEstadoDetalleMovimientoInventario);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleMovimientoInventario"));

						

						this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jmenuDetalleEstadoDetalleMovimientoInventario.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoDetalleMovimientoInventario(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoDetalleMovimientoInventario(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoDetalleMovimientoInventario(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoDetalleMovimientoInventarioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoDetalleMovimientoInventario();
		
		this.cargarCombosFrameForeignKeyEstadoDetalleMovimientoInventario();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoDetalleMovimientoInventario();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoDetalleMovimientoInventario();
		}
	}
	
	
	
	public void jButtonNuevoEstadoDetalleMovimientoInventarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
			
			
			if(jTableDatosEstadoDetalleMovimientoInventario.getRowCount()>=1) {
				jTableDatosEstadoDetalleMovimientoInventario.removeRowSelectionInterval(0, jTableDatosEstadoDetalleMovimientoInventario.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoDetalleMovimientoInventario=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoDetalleMovimientoInventario(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoDetalleMovimientoInventario(true);			
			//this.estadodetallemovimientoinventario=new EstadoDetalleMovimientoInventario();
			//this.estadodetallemovimientoinventario.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoDetalleMovimientoInventario(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetalleMovimientoInventario() ;
			
			if(EstadoDetalleMovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoDetalleMovimientoInventario(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadodetallemovimientoinventario);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetallemovimientoinventario);				
			
			EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
			
			if(this.estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoDetalleMovimientoInventario: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoDetalleMovimientoInventarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosSeleccionados=new ArrayList<EstadoDetalleMovimientoInventario>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRows().length;			
			}
			
			estadodetallemovimientoinventariosSeleccionados=this.getEstadoDetalleMovimientoInventariosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoDetalleMovimientoInventario--;			
				//EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux= new EstadoDetalleMovimientoInventario();			
				//estadodetallemovimientoinventarioAux.setId(this.iIdNuevoEstadoDetalleMovimientoInventario);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioOrigen=new EstadoDetalleMovimientoInventario();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioOrigen : estadodetallemovimientoinventariosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadodetallemovimientoinventarioOrigen =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadodetallemovimientoinventarioOrigen =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarios.toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoDetalleMovimientoInventario();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadodetallemovimientoinventario.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoDetalleMovimientoInventario(estadodetallemovimientoinventarioOrigen,this.estadodetallemovimientoinventario,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().add(this.estadodetallemovimientoinventarioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadodetallemovimientoinventarios.add(this.estadodetallemovimientoinventarioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoDetalleMovimientoInventario(false);
				
				this.jTableDatosEstadoDetalleMovimientoInventario.setRowSelectionInterval(this.getIndiceNuevoEstadoDetalleMovimientoInventario(), this.getIndiceNuevoEstadoDetalleMovimientoInventario());
				
				int iLastRow =  this.jTableDatosEstadoDetalleMovimientoInventario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoDetalleMovimientoInventario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoDetalleMovimientoInventario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoDetalleMovimientoInventario(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosSeleccionados=new ArrayList<EstadoDetalleMovimientoInventario>();									
		
			EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioOrigen=new EstadoDetalleMovimientoInventario();
			EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioDestino=new EstadoDetalleMovimientoInventario();
				
			estadodetallemovimientoinventariosSeleccionados=this.getEstadoDetalleMovimientoInventariosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadodetallemovimientoinventariosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetallemovimientoinventarioOrigen =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadodetallemovimientoinventarioOrigen =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarios.toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetallemovimientoinventarioDestino =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadodetallemovimientoinventarioDestino =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarios.toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadodetallemovimientoinventarioOrigen =estadodetallemovimientoinventariosSeleccionados.get(0);
				estadodetallemovimientoinventarioDestino =estadodetallemovimientoinventariosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoDetalleMovimientoInventario(estadodetallemovimientoinventarioOrigen,estadodetallemovimientoinventarioDestino,true,false);
				
				estadodetallemovimientoinventarioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadodetallemovimientoinventarioDestino,estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetallemovimientoinventarioDestino,estadodetallemovimientoinventarios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoDetalleMovimientoInventario(false);
				
				//this.jTableDatosEstadoDetalleMovimientoInventario.setRowSelectionInterval(this.getIndiceNuevoEstadoDetalleMovimientoInventario(), this.getIndiceNuevoEstadoDetalleMovimientoInventario());
				
				int iLastRow =  this.jTableDatosEstadoDetalleMovimientoInventario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoDetalleMovimientoInventario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoDetalleMovimientoInventario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoDetalleMovimientoInventario(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoDetalleMovimientoInventario.isVisible();
			
			
			this.jPanelParametrosReportesEstadoDetalleMovimientoInventario.setVisible(!isVisible);
			this.jPanelPaginacionEstadoDetalleMovimientoInventario.setVisible(!isVisible);
			this.jPanelAccionesEstadoDetalleMovimientoInventario.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoDetalleMovimientoInventario();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoDetalleMovimientoInventario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoDetalleMovimientoInventario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoDetalleMovimientoInventario();
			
			this.abrirFrameOrderByEstadoDetalleMovimientoInventario();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoDetalleMovimientoInventario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoDetalleMovimientoInventario(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoDetalleMovimientoInventario);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.setSize(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.iWidthFormulario,this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jContentPaneDetalleEstadoDetalleMovimientoInventario.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTabbedPaneRelacionesEstadoDetalleMovimientoInventario.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jContentPaneDetalleEstadoDetalleMovimientoInventario.getWidth(),EstadoDetalleMovimientoInventarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTabbedPaneRelacionesEstadoDetalleMovimientoInventario.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jContentPaneDetalleEstadoDetalleMovimientoInventario.getWidth(),EstadoDetalleMovimientoInventarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTabbedPaneRelacionesEstadoDetalleMovimientoInventario.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jContentPaneDetalleEstadoDetalleMovimientoInventario.getWidth(),EstadoDetalleMovimientoInventarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleMovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleMovimientoInventario();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoDetalleMovimientoInventario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoDetalleMovimientoInventario==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoDetalleMovimientoInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetalleMovimientoInventario,false,this);
				} else {
					this.jInternalFrameOrderByEstadoDetalleMovimientoInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetalleMovimientoInventario,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoDetalleMovimientoInventario);
				this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.setVisible(false);
				this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.setSelected(false);
				
				this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoDetalleMovimientoInventario"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoDetalleMovimientoInventario();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoDetalleMovimientoInventario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoDetalleMovimientoInventario==null) {
				
				this.jInternalFrameImportacionEstadoDetalleMovimientoInventario=new ImportacionJInternalFrame(EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoDetalleMovimientoInventario);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoDetalleMovimientoInventario);
				this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.setVisible(false);
				this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.setSelected(false);


				this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoDetalleMovimientoInventario"));
				this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoDetalleMovimientoInventario"));
				this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoDetalleMovimientoInventario"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoDetalleMovimientoInventario() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario==null) {
				this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario=new ReporteDinamicoJInternalFrame(EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario);
				this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoDetalleMovimientoInventario"));
				this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoDetalleMovimientoInventario"));
				this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoDetalleMovimientoInventario"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoDetalleMovimientoInventario();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleMovimientoInventario() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jScrollPanelDatosDetalleMovimientoInventario.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jContentPaneDetalleEstadoDetalleMovimientoInventario.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jScrollPanelDatosDetalleMovimientoInventario.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jScrollPanelDatosDetalleMovimientoInventario.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jScrollPanelDatosDetalleMovimientoInventario.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoDetalleMovimientoInventario() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoDetalleMovimientoInventario);
			
	       	this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.dispose();
			//this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoDetalleMovimientoInventario() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoDetalleMovimientoInventario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.setVisible(true);
	        this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoDetalleMovimientoInventario() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.setVisible(true);
	        this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoDetalleMovimientoInventario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.setVisible(false);
	        this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoDetalleMovimientoInventario() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoDetalleMovimientoInventario() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.setVisible(false);
	        this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoDetalleMovimientoInventario(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoDetalleMovimientoInventario(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoDetalleMovimientoInventario(true);
			//this.isEsNuevoEstadoDetalleMovimientoInventario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventario =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadodetallemovimientoinventario =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarios.toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoDetalleMovimientoInventario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoDetalleMovimientoInventario(false) ;
			
			if(estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() && DetalleMovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleMovimientoInventarioActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoDetalleMovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoDetalleMovimientoInventario(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetalleMovimientoInventario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoDetalleMovimientoInventarioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallemovimientoinventario =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetallemovimientoinventario =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarios.toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoDetalleMovimientoInventario(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoDetalleMovimientoInventario(true);
			//this.isEsNuevoEstadoDetalleMovimientoInventario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventario =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadodetallemovimientoinventario =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarios.toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadodetallemovimientoinventario.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoDetalleMovimientoInventario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoDetalleMovimientoInventario(false) ;
			
			if(EstadoDetalleMovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoDetalleMovimientoInventario(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetalleMovimientoInventario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoDetalleMovimientoInventario(false);
			
			//if(!this.isEsNuevoEstadoDetalleMovimientoInventario) {								
				int intSelectedRow = this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallemovimientoinventario =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadodetallemovimientoinventario =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarios.toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario);
				
			}
			
			if(this.permiteMantenimiento(this.estadodetallemovimientoinventario)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoDetalleMovimientoInventario=true;
					this.inicializarActualizarBindingTablaEstadoDetalleMovimientoInventario(false);
					this.isEsNuevoEstadoDetalleMovimientoInventario=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoDetalleMovimientoInventario=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoDetalleMovimientoInventario=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoDetalleMovimientoInventario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoDetalleMovimientoInventario(false);
				
				this.habilitarDeshabilitarControlesEstadoDetalleMovimientoInventario(false);
			
												
				
				if(EstadoDetalleMovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoDetalleMovimientoInventario();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoDetalleMovimientoInventarioActionPerformed(evt,estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoDetalleMovimientoInventario.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadodetallemovimientoinventario.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleMovimientoInventario.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleMovimientoInventario.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventario =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				this.estadodetallemovimientoinventario.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadodetallemovimientoinventario =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarios.toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				this.estadodetallemovimientoinventario.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadodetallemovimientoinventario)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoDetalleMovimientoInventarioModel) this.jTableDatosEstadoDetalleMovimientoInventario.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoDetalleMovimientoInventario=true;
				this.inicializarActualizarBindingTablaEstadoDetalleMovimientoInventario(false);
				this.isEsNuevoEstadoDetalleMovimientoInventario=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoDetalleMovimientoInventario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoDetalleMovimientoInventario(false);
				
				this.habilitarDeshabilitarControlesEstadoDetalleMovimientoInventario(false);
				
				
				
				if(EstadoDetalleMovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoDetalleMovimientoInventario();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoDetalleMovimientoInventario.getRowCount()>=1) {
				jTableDatosEstadoDetalleMovimientoInventario.removeRowSelectionInterval(0, jTableDatosEstadoDetalleMovimientoInventario.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoDetalleMovimientoInventario(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoDetalleMovimientoInventario(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoDetalleMovimientoInventario(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetalleMovimientoInventario(false) ;
			
			this.isEsNuevoEstadoDetalleMovimientoInventario=false;
			
			if(EstadoDetalleMovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoDetalleMovimientoInventario();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoDetalleMovimientoInventario(false);
				
				//SI ES MANUAL
				if(EstadoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoDetalleMovimientoInventario();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoDetalleMovimientoInventario--;			
			//EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux= new EstadoDetalleMovimientoInventario();			
			//estadodetallemovimientoinventarioAux.setId(this.iIdNuevoEstadoDetalleMovimientoInventario);
			
			if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoDetalleMovimientoInventario();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario);
			
			this.estadodetallemovimientoinventario.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().add(this.estadodetallemovimientoinventarioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadodetallemovimientoinventarios.add(this.estadodetallemovimientoinventarioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoDetalleMovimientoInventario(false);
			
			this.jTableDatosEstadoDetalleMovimientoInventario.setRowSelectionInterval(this.getIndiceNuevoEstadoDetalleMovimientoInventario(), this.getIndiceNuevoEstadoDetalleMovimientoInventario());
			
			int iLastRow =  this.jTableDatosEstadoDetalleMovimientoInventario.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoDetalleMovimientoInventario.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoDetalleMovimientoInventario.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoDetalleMovimientoInventario(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoDetalleMovimientoInventario(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetalleMovimientoInventario(false);
			
			//SI ES MANUAL
			if(EstadoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoDetalleMovimientoInventario();
			}
			
			//this.abrirFrameTreeEstadoDetalleMovimientoInventario();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Detalle Movimiento InventarioS ?", "MANTENIMIENTO DE Estado Detalle Movimiento Inventario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoDetalleMovimientoInventario();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadodetallemovimientoinventarioReturnGeneral=estadodetallemovimientoinventarioLogic.procesarImportacionEstadoDetalleMovimientoInventariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadodetallemovimientoinventarioParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoDetalleMovimientoInventarioReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.setFileImportacion(this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoDetalleMovimientoInventario.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosSeleccionados=new ArrayList<EstadoDetalleMovimientoInventario>();		

		estadodetallemovimientoinventariosSeleccionados=this.getEstadoDetalleMovimientoInventariosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoDetalleMovimientoInventarioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoDetalleMovimientoInventarioBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoDetalleMovimientoInventarios("Todos",estadodetallemovimientoinventariosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Movimiento Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosSeleccionados=new ArrayList<EstadoDetalleMovimientoInventario>();		
		
		estadodetallemovimientoinventariosSeleccionados=this.getEstadoDetalleMovimientoInventariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetallemovimientoinventario";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoDetalleMovimientoInventarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario:estadodetallemovimientoinventariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadodetallemovimientoinventario.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario:estadodetallemovimientoinventariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadodetallemovimientoinventario.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoDetalleMovimientoInventario(row);				
			//	iRow++;
			//}				
			
			//for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux:estadodetallemovimientoinventariosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoDetalleMovimientoInventario(estadodetallemovimientoinventarioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Movimiento Inventario",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadodetallemovimientoinventarioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetalleMovimientoInventario(false);
			
			//SI ES MANUAL
			if(EstadoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoDetalleMovimientoInventario();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetalleMovimientoInventario(false);
			
			//SI ES MANUAL
			if(EstadoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoDetalleMovimientoInventario();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoDetalleMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetalleMovimientoInventario(false);
			
			//SI ES MANUAL
			if(EstadoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoDetalleMovimientoInventario();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallemovimientoinventarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoDetalleMovimientoInventario() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoDetalleMovimientoInventario.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoDetalleMovimientoInventario.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoDetalleMovimientoInventario.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoDetalleMovimientoInventario.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoDetalleMovimientoInventario.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoDetalleMovimientoInventario.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoDetalleMovimientoInventario.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoDetalleMovimientoInventario(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoDetalleMovimientoInventario(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoDetalleMovimientoInventario(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoDetalleMovimientoInventario(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoDetalleMovimientoInventario(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoDetalleMovimientoInventario(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetalleMovimientoInventario(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoDetalleMovimientoInventario(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoDetalleMovimientoInventario() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoDetalleMovimientoInventario();
		
		this.inicializarActualizarBindingBotonesManualEstadoDetalleMovimientoInventario(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoDetalleMovimientoInventario();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetalleMovimientoInventario() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoDetalleMovimientoInventario(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoDetalleMovimientoInventario(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoDetalleMovimientoInventario.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoDetalleMovimientoInventario.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoDetalleMovimientoInventario.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jCheckBoxPostAccionNuevoEstadoDetalleMovimientoInventario.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jCheckBoxPostAccionSinCerrarEstadoDetalleMovimientoInventario.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jCheckBoxPostAccionSinMensajeEstadoDetalleMovimientoInventario.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoDetalleMovimientoInventario.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoDetalleMovimientoInventario.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoDetalleMovimientoInventario.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) {
				this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jCheckBoxPostAccionNuevoEstadoDetalleMovimientoInventario.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jCheckBoxPostAccionSinCerrarEstadoDetalleMovimientoInventario.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jCheckBoxPostAccionSinMensajeEstadoDetalleMovimientoInventario.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoDetalleMovimientoInventario.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoDetalleMovimientoInventario.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoDetalleMovimientoInventario.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoDetalleMovimientoInventario.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoDetalleMovimientoInventario.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoDetalleMovimientoInventario.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoDetalleMovimientoInventario.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoDetalleMovimientoInventario.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoDetalleMovimientoInventario(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoDetalleMovimientoInventario(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetalleMovimientoInventario() throws Exception {
		try	{
			if(EstadoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoDetalleMovimientoInventario();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoDetalleMovimientoInventario() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoDetalleMovimientoInventario() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoDetalleMovimientoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoDetalleMovimientoInventario.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoDetalleMovimientoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoDetalleMovimientoInventario.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoDetalleMovimientoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoDetalleMovimientoInventario.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoDetalleMovimientoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoDetalleMovimientoInventario.addItem(reporte);
			}
			
			
			if(!this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoDetalleMovimientoInventario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoDetalleMovimientoInventario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoDetalleMovimientoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoDetalleMovimientoInventario.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoDetalleMovimientoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoDetalleMovimientoInventario.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoDetalleMovimientoInventario.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoDetalleMovimientoInventario();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoDetalleMovimientoInventario() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario!=null) {
				this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario!=null) {
				this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoDetalleMovimientoInventario()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoDetalleMovimientoInventario(Boolean esInicializar) throws Exception {				
		if(EstadoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoDetalleMovimientoInventario();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoDetalleMovimientoInventario() throws Exception {
		this.inicializarActualizarBindingTablaEstadoDetalleMovimientoInventario(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoDetalleMovimientoInventario() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoDetalleMovimientoInventarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoDetalleMovimientoInventarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoDetalleMovimientoInventarioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleMovimientoInventarioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoDetalleMovimientoInventarioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoDetalleMovimientoInventarioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoDetalleMovimientoInventario(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadodetallemovimientoinventarios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoDetalleMovimientoInventario.setModel(new EstadoDetalleMovimientoInventarioModel(this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoDetalleMovimientoInventario.setModel(new EstadoDetalleMovimientoInventarioModel(this.estadodetallemovimientoinventarios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoDetalleMovimientoInventario!=null && this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoDetalleMovimientoInventario();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoDetalleMovimientoInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleMovimientoInventario,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoDetalleMovimientoInventarioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO,estadodetallemovimientoinventarioConstantesFunciones.resaltarSeleccionarEstadoDetalleMovimientoInventario,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO,estadodetallemovimientoinventarioConstantesFunciones.resaltarSeleccionarEstadoDetalleMovimientoInventario,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoDetalleMovimientoInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleMovimientoInventario,EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_ID));

		if(this.estadodetallemovimientoinventarioConstantesFunciones.mostraridEstadoDetalleMovimientoInventario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadodetallemovimientoinventarioConstantesFunciones.resaltaridEstadoDetalleMovimientoInventario,this.estadodetallemovimientoinventarioConstantesFunciones.activaridEstadoDetalleMovimientoInventario,this,true,"idEstadoDetalleMovimientoInventario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadodetallemovimientoinventarioConstantesFunciones.resaltaridEstadoDetalleMovimientoInventario,this.estadodetallemovimientoinventarioConstantesFunciones.activaridEstadoDetalleMovimientoInventario,this,true,"idEstadoDetalleMovimientoInventario","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoDetalleMovimientoInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleMovimientoInventario,EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO));

		if(this.estadodetallemovimientoinventarioConstantesFunciones.mostrarcodigoEstadoDetalleMovimientoInventario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadodetallemovimientoinventarioConstantesFunciones.resaltarcodigoEstadoDetalleMovimientoInventario,this.estadodetallemovimientoinventarioConstantesFunciones.activarcodigoEstadoDetalleMovimientoInventario,this,true,"codigoEstadoDetalleMovimientoInventario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadodetallemovimientoinventarioConstantesFunciones.resaltarcodigoEstadoDetalleMovimientoInventario,this.estadodetallemovimientoinventarioConstantesFunciones.activarcodigoEstadoDetalleMovimientoInventario,this,true,"codigoEstadoDetalleMovimientoInventario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoDetalleMovimientoInventarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoDetalleMovimientoInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleMovimientoInventario,EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE));

		if(this.estadodetallemovimientoinventarioConstantesFunciones.mostrarnombreEstadoDetalleMovimientoInventario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadodetallemovimientoinventarioConstantesFunciones.resaltarnombreEstadoDetalleMovimientoInventario,this.estadodetallemovimientoinventarioConstantesFunciones.activarnombreEstadoDetalleMovimientoInventario,this,true,"nombreEstadoDetalleMovimientoInventario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadodetallemovimientoinventarioConstantesFunciones.resaltarnombreEstadoDetalleMovimientoInventario,this.estadodetallemovimientoinventarioConstantesFunciones.activarnombreEstadoDetalleMovimientoInventario,this,true,"nombreEstadoDetalleMovimientoInventario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoDetalleMovimientoInventarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleMovimientoInventario && this.estadodetallemovimientoinventarioConstantesFunciones.mostrarDetalleMovimientoInventarioEstadoDetalleMovimientoInventario && !EstadoDetalleMovimientoInventarioConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Movimiento Inventarios");
				tableColumn.setHeaderValue("Detalle Movimiento Inventarios");
				tableColumn.setCellRenderer(new DetalleMovimientoInventarioTableCell(estadodetallemovimientoinventarioConstantesFunciones.resaltarDetalleMovimientoInventarioEstadoDetalleMovimientoInventario,this,this.estadodetallemovimientoinventarioConstantesFunciones.activarDetalleMovimientoInventarioEstadoDetalleMovimientoInventario));
				tableColumn.setCellEditor(new DetalleMovimientoInventarioTableCell(estadodetallemovimientoinventarioConstantesFunciones.resaltarDetalleMovimientoInventarioEstadoDetalleMovimientoInventario,this,this.estadodetallemovimientoinventarioConstantesFunciones.activarDetalleMovimientoInventarioEstadoDetalleMovimientoInventario));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoDetalleMovimientoInventario.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoDetalleMovimientoInventario.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoDetalleMovimientoInventario.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoDetalleMovimientoInventario && this.isPermisoGuardarCambiosEstadoDetalleMovimientoInventario) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoDetalleMovimientoInventario.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoDetalleMovimientoInventario.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoDetalleMovimientoInventario.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoDetalleMovimientoInventario && this.isPermisoGuardarCambiosEstadoDetalleMovimientoInventario) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoDetalleMovimientoInventario && this.isPermisoGuardarCambiosEstadoDetalleMovimientoInventario) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoDetalleMovimientoInventario.moveColumn(this.jTableDatosEstadoDetalleMovimientoInventario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoDetalleMovimientoInventario.moveColumn(this.jTableDatosEstadoDetalleMovimientoInventario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoDetalleMovimientoInventario.moveColumn(this.jTableDatosEstadoDetalleMovimientoInventario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoDetalleMovimientoInventario.moveColumn(this.jTableDatosEstadoDetalleMovimientoInventario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoDetalleMovimientoInventario.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoDetalleMovimientoInventario.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoDetalleMovimientoInventario,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoDetalleMovimientoInventario.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoDetalleMovimientoInventario.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoDetalleMovimientoInventario.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoDetalleMovimientoInventario.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoDetalleMovimientoInventario.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadodetallemovimientoinventarios.size()-1;
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
		//this.jTableDatosEstadoDetalleMovimientoInventario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoDetalleMovimientoInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoDetalleMovimientoInventario();
			
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
				
				//this.isEsNuevoEstadoDetalleMovimientoInventario=false;
					
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
			
				if(this.estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoDetalleMovimientoInventario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallemovimientoinventario =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetallemovimientoinventario =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarios.toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadodetallemovimientoinventario.getsType().equals("DUPLICADO")
				   || this.estadodetallemovimientoinventario.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoDetalleMovimientoInventario=true;
				
				} else {
					this.isEsNuevoEstadoDetalleMovimientoInventario=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
					if(this.estadodetallemovimientoinventario.getId()>=0 && !this.estadodetallemovimientoinventario.getIsNew()) {						
						this.isEsNuevoEstadoDetalleMovimientoInventario=false;
						
					} else {
						this.isEsNuevoEstadoDetalleMovimientoInventario=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoDetalleMovimientoInventario(esRelaciones);						
				
				this.seleccionarEstadoDetalleMovimientoInventario(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadodetallemovimientoinventario.getId()<0) {
					this.isEsNuevoEstadoDetalleMovimientoInventario=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoDetalleMovimientoInventario(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoDetalleMovimientoInventario(evt,rowIndex);
				}	
				
				if(this.estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoDetalleMovimientoInventario: " + this.dDif); 
					}
				}								
				
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoDetalleMovimientoInventario(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadodetallemovimientoinventario)) {
					if(this.estadodetallemovimientoinventario.getId()>0) {
						this.estadodetallemovimientoinventario.setIsDeleted(true);
						
						this.estadodetallemovimientoinventariosEliminados.add(this.estadodetallemovimientoinventario);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().remove(this.estadodetallemovimientoinventario);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadodetallemovimientoinventarios.remove(this.estadodetallemovimientoinventario);				
					}
					
					
					((EstadoDetalleMovimientoInventarioModel) this.jTableDatosEstadoDetalleMovimientoInventario.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoDetalleMovimientoInventario(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoDetalleMovimientoInventario(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoDetalleMovimientoInventario) {
			
			if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoDetalleMovimientoInventario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallemovimientoinventario =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetallemovimientoinventario =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarios.toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoDetalleMovimientoInventario("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoDetalleMovimientoInventario(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoDetalleMovimientoInventario() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoDetalleMovimientoInventario(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoDetalleMovimientoInventario(estadodetallemovimientoinventario,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoDetalleMovimientoInventario(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoDetalleMovimientoInventario(estadodetallemovimientoinventario);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoDetalleMovimientoInventario(estadodetallemovimientoinventario,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleMovimientoInventario(estadodetallemovimientoinventario);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoDetalleMovimientoInventario(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTextFieldidEstadoDetalleMovimientoInventario.setText(estadodetallemovimientoinventario.getId().toString());
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTextFieldcodigoEstadoDetalleMovimientoInventario.setText(estadodetallemovimientoinventario.getcodigo());
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTextAreanombreEstadoDetalleMovimientoInventario.setText(estadodetallemovimientoinventario.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadodetallemovimientoinventarioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadodetallemovimientoinventarioLocal=this.estadodetallemovimientoinventario;
			} else {
				estadodetallemovimientoinventarioLocal=this.estadodetallemovimientoinventarioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadodetallemovimientoinventarioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoDetalleMovimientoInventario(estadodetallemovimientoinventarioLocal,true);
					
					if(estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadodetallemovimientoinventarioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadodetallemovimientoinventarioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoDetalleMovimientoInventario(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoDetalleMovimientoInventario(estadodetallemovimientoinventario,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleMovimientoInventario(estadodetallemovimientoinventario);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoDetalleMovimientoInventario(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoDetalleMovimientoInventario(estadodetallemovimientoinventario,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoDetalleMovimientoInventario(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTextFieldidEstadoDetalleMovimientoInventario.getText()==null || this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTextFieldidEstadoDetalleMovimientoInventario.getText()=="" || this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTextFieldidEstadoDetalleMovimientoInventario.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTextFieldidEstadoDetalleMovimientoInventario.setText("0");
			}

			if(conColumnasBase) {estadodetallemovimientoinventario.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTextFieldidEstadoDetalleMovimientoInventario.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jLabelIdEstadoDetalleMovimientoInventario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadodetallemovimientoinventario.setcodigo(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTextFieldcodigoEstadoDetalleMovimientoInventario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jLabelcodigoEstadoDetalleMovimientoInventario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadodetallemovimientoinventario.setnombre(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTextAreanombreEstadoDetalleMovimientoInventario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jLabelnombreEstadoDetalleMovimientoInventario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoDetalleMovimientoInventario(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioBean,EstadoDetalleMovimientoInventario estadodetallemovimientoinventario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoDetalleMovimientoInventario(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioOrigen,EstadoDetalleMovimientoInventario estadodetallemovimientoinventario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadodetallemovimientoinventarioOrigen.getId()!=null && !estadodetallemovimientoinventarioOrigen.getId().equals(0L))) {estadodetallemovimientoinventario.setId(estadodetallemovimientoinventarioOrigen.getId());}}
			if(conDefault || (!conDefault && estadodetallemovimientoinventarioOrigen.getcodigo()!=null && !estadodetallemovimientoinventarioOrigen.getcodigo().equals(""))) {estadodetallemovimientoinventario.setcodigo(estadodetallemovimientoinventarioOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadodetallemovimientoinventarioOrigen.getnombre()!=null && !estadodetallemovimientoinventarioOrigen.getnombre().equals(""))) {estadodetallemovimientoinventario.setnombre(estadodetallemovimientoinventarioOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoDetalleMovimientoInventario(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTextFieldidEstadoDetalleMovimientoInventario.setText(estadodetallemovimientoinventario.getId().toString());
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTextFieldcodigoEstadoDetalleMovimientoInventario.setText(estadodetallemovimientoinventario.getcodigo());
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTextAreanombreEstadoDetalleMovimientoInventario.setText(estadodetallemovimientoinventario.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoDetalleMovimientoInventario(EstadoDetalleMovimientoInventarioBean estadodetallemovimientoinventarioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTextFieldidEstadoDetalleMovimientoInventario.setText(estadodetallemovimientoinventarioBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTextFieldcodigoEstadoDetalleMovimientoInventario.setText(estadodetallemovimientoinventarioBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTextAreanombreEstadoDetalleMovimientoInventario.setText(estadodetallemovimientoinventarioBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoDetalleMovimientoInventario(EstadoDetalleMovimientoInventarioParameterReturnGeneral estadodetallemovimientoinventarioReturnGeneral,EstadoDetalleMovimientoInventarioBean estadodetallemovimientoinventarioBean,Boolean conDefault) throws Exception { 
		try {
			EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioLocal=new EstadoDetalleMovimientoInventario();
			
			estadodetallemovimientoinventarioLocal=estadodetallemovimientoinventarioReturnGeneral.getEstadoDetalleMovimientoInventario();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadodetallemovimientoinventarioLocal.getId()!=null && !estadodetallemovimientoinventarioLocal.getId().equals(0L))) {estadodetallemovimientoinventarioBean.setId(estadodetallemovimientoinventarioLocal.getId());}}
			if(conDefault || (!conDefault && estadodetallemovimientoinventarioLocal.getcodigo()!=null && !estadodetallemovimientoinventarioLocal.getcodigo().equals(""))) {estadodetallemovimientoinventarioBean.setcodigo(estadodetallemovimientoinventarioLocal.getcodigo());}
			if(conDefault || (!conDefault && estadodetallemovimientoinventarioLocal.getnombre()!=null && !estadodetallemovimientoinventarioLocal.getnombre().equals(""))) {estadodetallemovimientoinventarioBean.setnombre(estadodetallemovimientoinventarioLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoDetalleMovimientoInventarioGenerico(Long idEstadoDetalleMovimientoInventarioSeleccionado,JComboBox jComboBoxEstadoDetalleMovimientoInventario,List<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosLocal)throws Exception {
		try {
			EstadoDetalleMovimientoInventario  estadodetallemovimientoinventarioTemp=null;

			for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux:estadodetallemovimientoinventariosLocal) {
				if(estadodetallemovimientoinventarioAux.getId()!=null && estadodetallemovimientoinventarioAux.getId().equals(idEstadoDetalleMovimientoInventarioSeleccionado)) {
					estadodetallemovimientoinventarioTemp=estadodetallemovimientoinventarioAux;
					break;
				}
			}

			jComboBoxEstadoDetalleMovimientoInventario.setSelectedItem(estadodetallemovimientoinventarioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoDetalleMovimientoInventarioGenerico(JComboBox jComboBoxEstadoDetalleMovimientoInventario,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoDetalleMovimientoInventario.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoDetalleMovimientoInventario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoDetalleMovimientoInventario.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoDetalleMovimientoInventario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadodetallemovimientoinventario=(EstadoDetalleMovimientoInventario) estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadodetallemovimientoinventario =(EstadoDetalleMovimientoInventario) estadodetallemovimientoinventarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioRow=new EstadoDetalleMovimientoInventario();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadodetallemovimientoinventarioRow=(EstadoDetalleMovimientoInventario) estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadodetallemovimientoinventarioRow=(EstadoDetalleMovimientoInventario) estadodetallemovimientoinventarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleMovimientoInventarioActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoDetalleMovimientoInventario estadodetallemovimientoinventario) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallemovimientoinventarioLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetallemovimientoinventario = (EstadoDetalleMovimientoInventario)this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadodetallemovimientoinventario = (EstadoDetalleMovimientoInventario)this.estadodetallemovimientoinventarios.toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadodetallemovimientoinventario!=null) {
						this.estadodetallemovimientoinventario = estadodetallemovimientoinventario;
					} else {
						this.estadodetallemovimientoinventario = new EstadoDetalleMovimientoInventario();
					}
				}

				if(this.isTienePermisosDetalleMovimientoInventario && this.permiteMantenimiento(this.estadodetallemovimientoinventario)) {
					DetalleMovimientoInventarioBeanSwingJInternalFrame detallemovimientoinventarioBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFramePopup=new DetalleMovimientoInventarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detallemovimientoinventarioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFramePopup;
					} else {
						detallemovimientoinventarioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame;
					}

					List<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventarios=new ArrayList<EstadoDetalleMovimientoInventario>();
					estadodetallemovimientoinventarios.add(this.estadodetallemovimientoinventario);
					if(!esRelacionado) {
						//detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.setConGuardarRelaciones(false);
						//detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detallemovimientoinventarioBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.cargarDetalleMovimientoInventarioBeanSwingJInternalFrame(estadodetallemovimientoinventarios,this.estadodetallemovimientoinventario,detallemovimientoinventarioBeanSwingJInternalFrame,/*conInicializar,*/detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.getConGuardarRelaciones(),detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
					detallemovimientoinventarioBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detallemovimientoinventarioBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleMovimientoInventario("no_relacionado");

						detallemovimientoinventarioBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleMovimientoInventarioConstantesFunciones.ITAMANIOFILATABLA + (DetalleMovimientoInventarioConstantesFunciones.ITAMANIOFILATABLA/2));

						detallemovimientoinventarioBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoDetalleMovimientoInventario=(TitledBorder)this.jScrollPanelDatosEstadoDetalleMovimientoInventario.getBorder();
						TitledBorder titledBorderDetalleMovimientoInventario=(TitledBorder)detallemovimientoinventarioBeanSwingJInternalFrame.jScrollPanelDatosDetalleMovimientoInventario.getBorder();

						titledBorderDetalleMovimientoInventario.setTitle(titledBorderEstadoDetalleMovimientoInventario.getTitle() + " -> Detalle Movimiento Inventario");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detallemovimientoinventarioBeanSwingJInternalFrame);
						}

						detallemovimientoinventarioBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detallemovimientoinventarioBeanSwingJInternalFrame);

						detallemovimientoinventarioBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Movimiento Inventario",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallemovimientoinventarioLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallemovimientoinventarioLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallemovimientoinventarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoDetalleMovimientoInventario(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleMovimientoInventario && this.isPermisoNuevoEstadoDetalleMovimientoInventario));			
			this.jButtonDuplicarEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaDuplicarEstadoDetalleMovimientoInventario && this.isPermisoDuplicarEstadoDetalleMovimientoInventario));			
			this.jButtonCopiarEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaCopiarEstadoDetalleMovimientoInventario && this.isPermisoCopiarEstadoDetalleMovimientoInventario));
			this.jButtonVerFormEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaVerFormEstadoDetalleMovimientoInventario && this.isPermisoVerFormEstadoDetalleMovimientoInventario));
			
			this.jButtonAbrirOrderByEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleMovimientoInventario && this.isPermisoOrdenEstadoDetalleMovimientoInventario));			
			
			this.jButtonNuevoRelacionesEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleMovimientoInventario && this.isPermisoNuevoEstadoDetalleMovimientoInventario));			
			this.jButtonNuevoGuardarCambiosEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleMovimientoInventario && this.isPermisoNuevoEstadoDetalleMovimientoInventario && this.isPermisoGuardarCambiosEstadoDetalleMovimientoInventario));
			
			if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonModificarEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaModificarEstadoDetalleMovimientoInventario && this.isPermisoActualizarEstadoDetalleMovimientoInventario));	
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonActualizarEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaActualizarEstadoDetalleMovimientoInventario && this.isPermisoActualizarEstadoDetalleMovimientoInventario));	
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonEliminarEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaEliminarEstadoDetalleMovimientoInventario && this.isPermisoEliminarEstadoDetalleMovimientoInventario));
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonCancelarEstadoDetalleMovimientoInventario.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleMovimientoInventario);							
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonGuardarCambiosEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario && this.isPermisoGuardarCambiosEstadoDetalleMovimientoInventario));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoDetalleMovimientoInventario && this.isPermisoGuardarCambiosEstadoDetalleMovimientoInventario));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleMovimientoInventario && this.isPermisoNuevoEstadoDetalleMovimientoInventario));						
			this.jButtonDuplicarToolBarEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaDuplicarEstadoDetalleMovimientoInventario && this.isPermisoDuplicarEstadoDetalleMovimientoInventario));						
			this.jButtonCopiarToolBarEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaCopiarEstadoDetalleMovimientoInventario && this.isPermisoCopiarEstadoDetalleMovimientoInventario));			
			this.jButtonVerFormToolBarEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaVerFormEstadoDetalleMovimientoInventario && this.isPermisoVerFormEstadoDetalleMovimientoInventario));			
			this.jButtonAbrirOrderByToolBarEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleMovimientoInventario && this.isPermisoOrdenEstadoDetalleMovimientoInventario));
			this.jButtonNuevoRelacionesToolBarEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleMovimientoInventario && this.isPermisoNuevoEstadoDetalleMovimientoInventario));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleMovimientoInventario && this.isPermisoNuevoEstadoDetalleMovimientoInventario && this.isPermisoGuardarCambiosEstadoDetalleMovimientoInventario));			
			
			if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonModificarToolBarEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaModificarEstadoDetalleMovimientoInventario && this.isPermisoActualizarEstadoDetalleMovimientoInventario));	
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonActualizarToolBarEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaActualizarEstadoDetalleMovimientoInventario  && this.isPermisoActualizarEstadoDetalleMovimientoInventario));	
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonEliminarToolBarEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaEliminarEstadoDetalleMovimientoInventario && this.isPermisoEliminarEstadoDetalleMovimientoInventario));
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonCancelarToolBarEstadoDetalleMovimientoInventario.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleMovimientoInventario);				
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonGuardarCambiosToolBarEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario && this.isPermisoGuardarCambiosEstadoDetalleMovimientoInventario));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoDetalleMovimientoInventario && this.isPermisoGuardarCambiosEstadoDetalleMovimientoInventario));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleMovimientoInventario && this.isPermisoNuevoEstadoDetalleMovimientoInventario));			
			this.jMenuItemDuplicarEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaDuplicarEstadoDetalleMovimientoInventario && this.isPermisoDuplicarEstadoDetalleMovimientoInventario));			
			this.jMenuItemCopiarEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaCopiarEstadoDetalleMovimientoInventario && this.isPermisoCopiarEstadoDetalleMovimientoInventario));			
			this.jMenuItemVerFormEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaVerFormEstadoDetalleMovimientoInventario && this.isPermisoVerFormEstadoDetalleMovimientoInventario));			
			this.jMenuItemAbrirOrderByEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleMovimientoInventario && this.isPermisoOrdenEstadoDetalleMovimientoInventario));			
			//this.jMenuItemMostrarOcultarEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleMovimientoInventario && this.isPermisoOrdenEstadoDetalleMovimientoInventario));
			this.jMenuItemDetalleAbrirOrderByEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleMovimientoInventario && this.isPermisoOrdenEstadoDetalleMovimientoInventario));			
			//this.jMenuItemDetalleMostrarOcultarEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleMovimientoInventario && this.isPermisoOrdenEstadoDetalleMovimientoInventario));			
			this.jMenuItemNuevoRelacionesEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleMovimientoInventario && this.isPermisoNuevoEstadoDetalleMovimientoInventario));			
			this.jMenuItemNuevoGuardarCambiosEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleMovimientoInventario && this.isPermisoNuevoEstadoDetalleMovimientoInventario && this.isPermisoGuardarCambiosEstadoDetalleMovimientoInventario));									
			
			if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jMenuItemModificarEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaModificarEstadoDetalleMovimientoInventario && this.isPermisoActualizarEstadoDetalleMovimientoInventario));	
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jMenuItemActualizarEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaActualizarEstadoDetalleMovimientoInventario && this.isPermisoActualizarEstadoDetalleMovimientoInventario));	
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jMenuItemEliminarEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaEliminarEstadoDetalleMovimientoInventario && this.isPermisoEliminarEstadoDetalleMovimientoInventario));
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jMenuItemCancelarEstadoDetalleMovimientoInventario.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleMovimientoInventario);				
			}
			
			this.jMenuItemGuardarCambiosEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario && this.isPermisoGuardarCambiosEstadoDetalleMovimientoInventario));						
			this.jMenuItemGuardarCambiosTablaEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoDetalleMovimientoInventario && this.isPermisoGuardarCambiosEstadoDetalleMovimientoInventario));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoDetalleMovimientoInventario=this.jButtonNuevoEstadoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoDetalleMovimientoInventario=this.jButtonDuplicarEstadoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaCopiarEstadoDetalleMovimientoInventario=this.jButtonCopiarEstadoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaVerFormEstadoDetalleMovimientoInventario=this.jButtonVerFormEstadoDetalleMovimientoInventario.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoDetalleMovimientoInventario=this.jButtonAbrirOrderByEstadoDetalleMovimientoInventario.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleMovimientoInventario=this.jButtonNuevoRelacionesEstadoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaModificarEstadoDetalleMovimientoInventario=this.jButtonModificarEstadoDetalleMovimientoInventario.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) {
			this.isVisibilidadCeldaActualizarEstadoDetalleMovimientoInventario=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonActualizarEstadoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaEliminarEstadoDetalleMovimientoInventario=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonEliminarEstadoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaCancelarEstadoDetalleMovimientoInventario=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonCancelarEstadoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonGuardarCambiosEstadoDetalleMovimientoInventario.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleMovimientoInventario=this.jButtonGuardarCambiosTablaEstadoDetalleMovimientoInventario.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoDetalleMovimientoInventario=this.jButtonNuevoToolBarEstadoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleMovimientoInventario=this.jButtonNuevoRelacionesToolBarEstadoDetalleMovimientoInventario.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) {
			this.isVisibilidadCeldaModificarEstadoDetalleMovimientoInventario=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonModificarToolBarEstadoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaActualizarEstadoDetalleMovimientoInventario=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonActualizarToolBarEstadoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaEliminarEstadoDetalleMovimientoInventario=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonEliminarToolBarEstadoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaCancelarEstadoDetalleMovimientoInventario=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonCancelarToolBarEstadoDetalleMovimientoInventario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario=this.jButtonGuardarCambiosToolBarEstadoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleMovimientoInventario=this.jButtonGuardarCambiosTablaToolBarEstadoDetalleMovimientoInventario.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoDetalleMovimientoInventario=this.jMenuItemNuevoEstadoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleMovimientoInventario=this.jMenuItemNuevoRelacionesEstadoDetalleMovimientoInventario.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) {
			this.isVisibilidadCeldaModificarEstadoDetalleMovimientoInventario=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jMenuItemModificarEstadoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaActualizarEstadoDetalleMovimientoInventario=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jMenuItemActualizarEstadoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaEliminarEstadoDetalleMovimientoInventario=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jMenuItemEliminarEstadoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaCancelarEstadoDetalleMovimientoInventario=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jMenuItemCancelarEstadoDetalleMovimientoInventario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario=this.jMenuItemGuardarCambiosEstadoDetalleMovimientoInventario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleMovimientoInventario=this.jMenuItemGuardarCambiosTablaEstadoDetalleMovimientoInventario.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoDetalleMovimientoInventario(Boolean esInicializar) {
		if(EstadoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
				//if(this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoDetalleMovimientoInventario();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoDetalleMovimientoInventario(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoDetalleMovimientoInventario() {
		this.jButtonNuevoEstadoDetalleMovimientoInventario.setVisible(this.isPermisoNuevoEstadoDetalleMovimientoInventario);			
		this.jButtonDuplicarEstadoDetalleMovimientoInventario.setVisible(this.isPermisoDuplicarEstadoDetalleMovimientoInventario);			
		this.jButtonCopiarEstadoDetalleMovimientoInventario.setVisible(this.isPermisoCopiarEstadoDetalleMovimientoInventario);			
		this.jButtonVerFormEstadoDetalleMovimientoInventario.setVisible(this.isPermisoVerFormEstadoDetalleMovimientoInventario);			
		
		this.jButtonAbrirOrderByEstadoDetalleMovimientoInventario.setVisible(this.isPermisoOrdenEstadoDetalleMovimientoInventario);					
		
		this.jButtonNuevoRelacionesEstadoDetalleMovimientoInventario.setVisible(this.isPermisoNuevoEstadoDetalleMovimientoInventario);			
		
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonModificarEstadoDetalleMovimientoInventario.setVisible(this.isPermisoActualizarEstadoDetalleMovimientoInventario);	
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonActualizarEstadoDetalleMovimientoInventario.setVisible(this.isPermisoActualizarEstadoDetalleMovimientoInventario);	
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonEliminarEstadoDetalleMovimientoInventario.setVisible(this.isPermisoEliminarEstadoDetalleMovimientoInventario);
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonCancelarEstadoDetalleMovimientoInventario.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleMovimientoInventario);						
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonGuardarCambiosEstadoDetalleMovimientoInventario.setVisible(this.isPermisoGuardarCambiosEstadoDetalleMovimientoInventario);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoDetalleMovimientoInventario.setVisible(this.isPermisoActualizarEstadoDetalleMovimientoInventario);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoDetalleMovimientoInventario() {
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonModificarEstadoDetalleMovimientoInventario.setVisible(this.isPermisoActualizarEstadoDetalleMovimientoInventario);	
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonActualizarEstadoDetalleMovimientoInventario.setVisible(this.isPermisoActualizarEstadoDetalleMovimientoInventario);	
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonEliminarEstadoDetalleMovimientoInventario.setVisible(this.isPermisoEliminarEstadoDetalleMovimientoInventario);
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonCancelarEstadoDetalleMovimientoInventario.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleMovimientoInventario);							
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonGuardarCambiosEstadoDetalleMovimientoInventario.setVisible((this.isVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario && this.isPermisoGuardarCambiosEstadoDetalleMovimientoInventario));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoDetalleMovimientoInventario() {
		if(EstadoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoDetalleMovimientoInventario();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoDetalleMovimientoInventario() {
	}
	
	public void jTableDatosEstadoDetalleMovimientoInventarioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoDetalleMovimientoInventario(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoDetalleMovimientoInventarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallemovimientoinventarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoDetalleMovimientoInventario(this.getestadodetallemovimientoinventario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetallemovimientoinventario =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadodetallemovimientoinventario =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarios.toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadodetallemovimientoinventario==null) {
						this.estadodetallemovimientoinventario = new EstadoDetalleMovimientoInventario();
					}

					this.setVariablesFormularioToObjetoActualEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario);
				}

				if(this.estadodetallemovimientoinventario.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadodetallemovimientoinventario.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoDetalleMovimientoInventario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallemovimientoinventarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallemovimientoinventarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallemovimientoinventarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoDetalleMovimientoInventarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallemovimientoinventarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoDetalleMovimientoInventario(this.getestadodetallemovimientoinventario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetallemovimientoinventario =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadodetallemovimientoinventario =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarios.toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadodetallemovimientoinventario==null) {
						this.estadodetallemovimientoinventario = new EstadoDetalleMovimientoInventario();
					}

					this.setVariablesFormularioToObjetoActualEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario);
				}

				if(this.estadodetallemovimientoinventario.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadodetallemovimientoinventario.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoDetalleMovimientoInventario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallemovimientoinventarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallemovimientoinventarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallemovimientoinventarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoDetalleMovimientoInventarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallemovimientoinventarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoDetalleMovimientoInventario(this.getestadodetallemovimientoinventario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetallemovimientoinventario =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadodetallemovimientoinventario =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarios.toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadodetallemovimientoinventario==null) {
						this.estadodetallemovimientoinventario = new EstadoDetalleMovimientoInventario();
					}

					this.setVariablesFormularioToObjetoActualEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario);
				}

				if(this.estadodetallemovimientoinventario.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadodetallemovimientoinventario.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoDetalleMovimientoInventario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallemovimientoinventarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallemovimientoinventarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallemovimientoinventarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoDetalleMovimientoInventario() {
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.dispose();
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario!=null) {
			this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.dispose();
			this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario=null;
		}
		
		if(this.jInternalFrameImportacionEstadoDetalleMovimientoInventario!=null) {
			this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.dispose();
			this.jInternalFrameImportacionEstadoDetalleMovimientoInventario=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoDetalleMovimientoInventario();
			
			EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoDetalleMovimientoInventario")) {
				jButtonNuevoEstadoDetalleMovimientoInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoDetalleMovimientoInventario")) {
				jButtonDuplicarEstadoDetalleMovimientoInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoDetalleMovimientoInventario")) {
				jButtonCopiarEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoDetalleMovimientoInventario")) {
				jButtonVerFormEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoDetalleMovimientoInventario")) {
				jButtonNuevoEstadoDetalleMovimientoInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoDetalleMovimientoInventario")) {
				jButtonDuplicarEstadoDetalleMovimientoInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoDetalleMovimientoInventario")) {
				jButtonNuevoEstadoDetalleMovimientoInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoDetalleMovimientoInventario")) {
				jButtonDuplicarEstadoDetalleMovimientoInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoDetalleMovimientoInventario")) {
				jButtonNuevoEstadoDetalleMovimientoInventarioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoDetalleMovimientoInventario")) {
				jButtonNuevoEstadoDetalleMovimientoInventarioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoDetalleMovimientoInventario")) {
				jButtonNuevoEstadoDetalleMovimientoInventarioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoDetalleMovimientoInventario")) {
				jButtonModificarEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoDetalleMovimientoInventario")) {
				jButtonModificarEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoDetalleMovimientoInventario")) {
				jButtonModificarEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoDetalleMovimientoInventario")) {
				jButtonActualizarEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoDetalleMovimientoInventario")) {
				jButtonActualizarEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoDetalleMovimientoInventario")) {
				jButtonActualizarEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoDetalleMovimientoInventario")) {
				jButtonEliminarEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoDetalleMovimientoInventario")) {
				jButtonEliminarEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoDetalleMovimientoInventario")) {
				jButtonEliminarEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoDetalleMovimientoInventario")) {
				jButtonCancelarEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoDetalleMovimientoInventario")) {
				jButtonCancelarEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoDetalleMovimientoInventario")) {
				jButtonCancelarEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoDetalleMovimientoInventario")) {
				jButtonCerrarEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoDetalleMovimientoInventario")) {
				jButtonCerrarEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoDetalleMovimientoInventario")) {
				jButtonCerrarEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoDetalleMovimientoInventario")) {
				jButtonMostrarOcultarEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoDetalleMovimientoInventario")) {
				jButtonCancelarEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoDetalleMovimientoInventario")) {
				jButtonGuardarCambiosEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoDetalleMovimientoInventario")) {
				jButtonGuardarCambiosEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoDetalleMovimientoInventario")) {
				jButtonCopiarEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoDetalleMovimientoInventario")) {
				jButtonVerFormEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoDetalleMovimientoInventario")) {
				jButtonGuardarCambiosEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoDetalleMovimientoInventario")) {
				jButtonCopiarEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoDetalleMovimientoInventario")) {
				jButtonVerFormEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoDetalleMovimientoInventario")) {
				jButtonGuardarCambiosEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoDetalleMovimientoInventario")) {
				jButtonGuardarCambiosEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoDetalleMovimientoInventario")) {
				jButtonGuardarCambiosEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoDetalleMovimientoInventario")) {
				jButtonRecargarInformacionEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoDetalleMovimientoInventario")) {
				jButtonRecargarInformacionEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoDetalleMovimientoInventario")) {
				jButtonRecargarInformacionEstadoDetalleMovimientoInventarioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoDetalleMovimientoInventario")) {
				jButtonAnterioresEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoDetalleMovimientoInventario")) {
				jButtonAnterioresEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoDetalleMovimientoInventario")) {
				jButtonAnterioresEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoDetalleMovimientoInventario")) {
				jButtonSiguientesEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoDetalleMovimientoInventario")) {
				jButtonSiguientesEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoDetalleMovimientoInventario")) {
				jButtonSiguientesEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoDetalleMovimientoInventario") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoDetalleMovimientoInventario")) {
				jButtonAbrirOrderByEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoDetalleMovimientoInventario") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoDetalleMovimientoInventario")) {
				jButtonMostrarOcultarEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoDetalleMovimientoInventario")) {
				jButtonNuevoGuardarCambiosEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoDetalleMovimientoInventario")) {
				jButtonNuevoGuardarCambiosEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoDetalleMovimientoInventario")) {
				jButtonNuevoGuardarCambiosEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoDetalleMovimientoInventario")) {
				jButtonCerrarReporteDinamicoEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoDetalleMovimientoInventario")) {
				jButtonGenerarReporteDinamicoEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoDetalleMovimientoInventario")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoDetalleMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoDetalleMovimientoInventario")) {
				jButtonCerrarImportacionEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoDetalleMovimientoInventario")) {
				
				jButtonGenerarImportacionEstadoDetalleMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoDetalleMovimientoInventario")) {
				
				jButtonAbrirImportacionEstadoDetalleMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoDetalleMovimientoInventario")) {
				jComboBoxTiposAccionesEstadoDetalleMovimientoInventarioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoDetalleMovimientoInventario")) {
				jComboBoxTiposRelacionesEstadoDetalleMovimientoInventarioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoDetalleMovimientoInventario")) {
				jComboBoxTiposAccionesEstadoDetalleMovimientoInventarioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoDetalleMovimientoInventario")) {
				
				jComboBoxTiposSeleccionarEstadoDetalleMovimientoInventarioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoDetalleMovimientoInventario")) {
				jTextFieldValorCampoGeneralEstadoDetalleMovimientoInventarioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoDetalleMovimientoInventario")) {
				jButtonAbrirOrderByEstadoDetalleMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoDetalleMovimientoInventario")) {
				jButtonAbrirOrderByEstadoDetalleMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoDetalleMovimientoInventario")) {
				jButtonCerrarOrderByEstadoDetalleMovimientoInventarioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoDetalleMovimientoInventarioBusqueda")) {
				this.jButtonidEstadoDetalleMovimientoInventarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoDetalleMovimientoInventarioBusqueda")) {
				this.jButtoncodigoEstadoDetalleMovimientoInventarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoDetalleMovimientoInventarioBusqueda")) {
				this.jButtonnombreEstadoDetalleMovimientoInventarioBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoDetalleMovimientoInventario();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleMovimientoInventarioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallemovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallemovimientoinventario);
				
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
				
				


				
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleMovimientoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleMovimientoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadodetallemovimientoinventarioLocal=this.estadodetallemovimientoinventario;
			} else {
				estadodetallemovimientoinventarioLocal=this.estadodetallemovimientoinventarioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallemovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallemovimientoinventario);
				
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
							
				
				


				
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleMovimientoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleMovimientoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleMovimientoInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallemovimientoinventarioAnterior =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetallemovimientoinventarioAnterior =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarios.toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
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
			
			EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
			
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
			
			


			
			EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleMovimientoInventarioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallemovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallemovimientoinventario);
				
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
								
						
				


				
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleMovimientoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleMovimientoInventario.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallemovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallemovimientoinventario);
				
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
								
				
				


				
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleMovimientoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleMovimientoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleMovimientoInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallemovimientoinventarioAnterior =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetallemovimientoinventarioAnterior =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarios.toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallemovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallemovimientoinventario);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleMovimientoInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallemovimientoinventarioAnterior =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetallemovimientoinventarioAnterior =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarios.toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleMovimientoInventarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallemovimientoinventario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetallemovimientoinventario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallemovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallemovimientoinventario);
				
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
							
				
				


				
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleMovimientoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleMovimientoInventario.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleMovimientoInventarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetallemovimientoinventarioAnterior =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadodetallemovimientoinventarioAnterior =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarios.toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
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
			
			EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
			
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
			
			


			
			EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleMovimientoInventarioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallemovimientoinventario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetallemovimientoinventario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallemovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallemovimientoinventario);
				
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
								
				
				


				
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleMovimientoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleMovimientoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleMovimientoInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallemovimientoinventarioAnterior =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetallemovimientoinventarioAnterior =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarios.toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleMovimientoInventarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallemovimientoinventario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetallemovimientoinventario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleMovimientoInventarioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallemovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallemovimientoinventario);
				
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoDetalleMovimientoInventario")) {
					jCheckBoxSeleccionarTodosEstadoDetalleMovimientoInventarioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoDetalleMovimientoInventario")) {
					jCheckBoxSeleccionadosEstadoDetalleMovimientoInventarioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoDetalleMovimientoInventario")) {
					
				}
				
				


				
				
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleMovimientoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleMovimientoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallemovimientoinventario);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadodetallemovimientoinventario);
				
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
												
				
				


				
				
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleMovimientoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleMovimientoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleMovimientoInventarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetallemovimientoinventarioAnterior =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadodetallemovimientoinventarioAnterior =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarios.toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleMovimientoInventarioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallemovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallemovimientoinventario);
				
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
				
				
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
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
			
			EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
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
			
			


			
			EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleMovimientoInventarioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallemovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallemovimientoinventario);
				
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleMovimientoInventario.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleMovimientoInventario.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallemovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallemovimientoinventario);
				
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
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
				
				


				
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleMovimientoInventario.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleMovimientoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleMovimientoInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallemovimientoinventarioAnterior =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetallemovimientoinventarioAnterior =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarios.toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoDetalleMovimientoInventario")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoDetalleMovimientoInventarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadodetallemovimientoinventario =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadodetallemovimientoinventario =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarios.toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadodetallemovimientoinventario);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoDetalleMovimientoInventario")) {
				
				}
				
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoDetalleMovimientoInventario")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoDetalleMovimientoInventario.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoDetalleMovimientoInventario")) {
			
			}
			
			EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoDetalleMovimientoInventario();
			
			EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoDetalleMovimientoInventario")) {
				jButtonNuevoEstadoDetalleMovimientoInventarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoDetalleMovimientoInventario")) {
				jButtonDuplicarEstadoDetalleMovimientoInventarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoDetalleMovimientoInventario")) {
				jButtonCopiarEstadoDetalleMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoDetalleMovimientoInventario")) {
				jButtonVerFormEstadoDetalleMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoDetalleMovimientoInventario")) {
				jButtonNuevoEstadoDetalleMovimientoInventarioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoDetalleMovimientoInventario")) {
				jButtonModificarEstadoDetalleMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoDetalleMovimientoInventario")) {
				jButtonActualizarEstadoDetalleMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoDetalleMovimientoInventario")) {
				jButtonEliminarEstadoDetalleMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoDetalleMovimientoInventario")) {
				jButtonGuardarCambiosEstadoDetalleMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoDetalleMovimientoInventario")) {
				jButtonCancelarEstadoDetalleMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoDetalleMovimientoInventario")) {
				jButtonCerrarEstadoDetalleMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoDetalleMovimientoInventario")) {
				jButtonGuardarCambiosEstadoDetalleMovimientoInventarioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoDetalleMovimientoInventario")) {
				jButtonNuevoGuardarCambiosEstadoDetalleMovimientoInventarioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoDetalleMovimientoInventario")) {
				jButtonAbrirOrderByEstadoDetalleMovimientoInventarioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoDetalleMovimientoInventario")) {
				jButtonRecargarInformacionEstadoDetalleMovimientoInventarioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoDetalleMovimientoInventario")) {
				jButtonAnterioresEstadoDetalleMovimientoInventarioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoDetalleMovimientoInventario")) {
				jButtonSiguientesEstadoDetalleMovimientoInventarioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoDetalleMovimientoInventarioBusqueda")) {
				this.jButtonidEstadoDetalleMovimientoInventarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoDetalleMovimientoInventarioBusqueda")) {
				this.jButtoncodigoEstadoDetalleMovimientoInventarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoDetalleMovimientoInventarioBusqueda")) {
				this.jButtonnombreEstadoDetalleMovimientoInventarioBusquedaActionPerformed(evt);
			}
			
			EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoDetalleMovimientoInventario();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoDetalleMovimientoInventario")) {
				closingInternalFrameEstadoDetalleMovimientoInventario();
				
			} else if(sTipo.equals("jButtonCancelarEstadoDetalleMovimientoInventario")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoDetalleMovimientoInventario = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoDetalleMovimientoInventarioBeanSwingJInternalFrame jInternalFrameParent=(EstadoDetalleMovimientoInventarioBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoDetalleMovimientoInventarioActionPerformed(null);
			}
			
			EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadodetallemovimientoinventario,new Object(),this.estadodetallemovimientoinventarioParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoDetalleMovimientoInventario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoDetalleMovimientoInventario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoDetalleMovimientoInventario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadodetallemovimientoinventario)) {
			if(!esControlTabla) {
				if(EstadoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario);			
				}
				
				if(this.estadodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadodetallemovimientoinventarioReturnGeneral=estadodetallemovimientoinventarioLogic.procesarEventosEstadoDetalleMovimientoInventariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios(),this.estadodetallemovimientoinventario,this.estadodetallemovimientoinventarioParameterGeneral,this.isEsNuevoEstadoDetalleMovimientoInventario,classes);//this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventario()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventarioReturnGeneral,this.estadodetallemovimientoinventarioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoDetalleMovimientoInventario(classes,this.estadodetallemovimientoinventarioReturnGeneral,this.estadodetallemovimientoinventarioBean,false);
					}
						
					if(this.estadodetallemovimientoinventarioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventarioReturnGeneral.getEstadoDetalleMovimientoInventario());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventarioReturnGeneral.getEstadoDetalleMovimientoInventario());	
					}
						
					if(this.estadodetallemovimientoinventarioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventarioReturnGeneral.getEstadoDetalleMovimientoInventario(),classes);//this.estadodetallemovimientoinventarioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario,classes);//this.estadodetallemovimientoinventarioBean);									
				}
			
				if(EstadoDetalleMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventario);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadodetallemovimientoinventarioAnterior!=null) {
						this.estadodetallemovimientoinventario=this.estadodetallemovimientoinventarioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadodetallemovimientoinventarioReturnGeneral=estadodetallemovimientoinventarioLogic.procesarEventosEstadoDetalleMovimientoInventariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios(),this.estadodetallemovimientoinventario,this.estadodetallemovimientoinventarioParameterGeneral,this.isEsNuevoEstadoDetalleMovimientoInventario,classes);//this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventario()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadodetallemovimientoinventarioReturnGeneral.getEstadoDetalleMovimientoInventario(),estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadodetallemovimientoinventarioReturnGeneral.getEstadoDetalleMovimientoInventario(),this.estadodetallemovimientoinventarios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoDetalleMovimientoInventario.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoDetalleMovimientoInventario.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoDetalleMovimientoInventario();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoDetalleMovimientoInventario() throws Exception {
		
		EstadoDetalleMovimientoInventarioModel estadodetallemovimientoinventarioModel=(EstadoDetalleMovimientoInventarioModel)this.jTableDatosEstadoDetalleMovimientoInventario.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadodetallemovimientoinventarioModel.estadodetallemovimientoinventarios=this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadodetallemovimientoinventarioModel.estadodetallemovimientoinventarios=this.estadodetallemovimientoinventarios;
		}
		
		
		((EstadoDetalleMovimientoInventarioModel) this.jTableDatosEstadoDetalleMovimientoInventario.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoDetalleMovimientoInventario() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadodetallemovimientoinventarioAnterior(),this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadodetallemovimientoinventarioAnterior(),this.estadodetallemovimientoinventarios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoDetalleMovimientoInventario();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoDetalleMovimientoInventario(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleMovimientoInventario.class)) {
					this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.setDetalleMovimientoInventarios(estadodetallemovimientoinventario.getDetalleMovimientoInventarios());
					this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleMovimientoInventario(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
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
										
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetallemovimientoinventario,new Object(),generalEntityParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoDetalleMovimientoInventarioConstantesFunciones.getClassesRelationshipsOfEstadoDetalleMovimientoInventario(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoDetalleMovimientoInventarioConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoDetalleMovimientoInventario(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoDetalleMovimientoInventario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetallemovimientoinventario,new Object(),generalEntityParameterGeneral,this.estadodetallemovimientoinventarioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoDetalleMovimientoInventario(EstadoDetalleMovimientoInventarioBean estadodetallemovimientoinventarioBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleMovimientoInventario.class)) {
					this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.setDetalleMovimientoInventarios(estadodetallemovimientoinventario.getDetalleMovimientoInventarios());
					this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleMovimientoInventario(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoDetalleMovimientoInventario(ArrayList<Classe> classes,EstadoDetalleMovimientoInventarioReturnGeneral estadodetallemovimientoinventarioReturnGeneral,EstadoDetalleMovimientoInventarioBean estadodetallemovimientoinventarioBean,Boolean conDefault) throws Exception {
		
			this.estadodetallemovimientoinventarioBean.setDetalleMovimientoInventarios(estadodetallemovimientoinventarioReturnGeneral.getEstadoDetalleMovimientoInventario().getDetalleMovimientoInventarios());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoDetalleMovimientoInventario(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleMovimientoInventario.class)) {
					estadodetallemovimientoinventario.setDetalleMovimientoInventarios(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.getDetalleMovimientoInventarios());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadodetallemovimientoinventario)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario = new EstadoDetalleMovimientoInventarioDetalleFormJInternalFrame(jDesktopPane,this.estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones(),this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario);
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.setVisible(false);
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.estadodetallemovimientoinventarioLogic=this.estadodetallemovimientoinventarioLogic;
		
		this.cargarCombosFrameForeignKeyEstadoDetalleMovimientoInventario("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoDetalleMovimientoInventario();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoDetalleMovimientoInventario();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoDetalleMovimientoInventario("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoDetalleMovimientoInventario();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoDetalleMovimientoInventario"));
		
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonModificarEstadoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"ModificarEstadoDetalleMovimientoInventario"));

		
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonModificarToolBarEstadoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoDetalleMovimientoInventario"));
					
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jMenuItemModificarEstadoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoDetalleMovimientoInventario"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonActualizarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"ActualizarEstadoDetalleMovimientoInventario"));
		
		
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonActualizarToolBarEstadoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoDetalleMovimientoInventario"));
						
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jMenuItemActualizarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoDetalleMovimientoInventario"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonEliminarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"EliminarEstadoDetalleMovimientoInventario"));
		
		
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonEliminarToolBarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoDetalleMovimientoInventario"));
								
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jMenuItemEliminarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoDetalleMovimientoInventario"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonCancelarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"CancelarEstadoDetalleMovimientoInventario"));
		
		
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonCancelarToolBarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoDetalleMovimientoInventario"));
					
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jMenuItemCancelarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoDetalleMovimientoInventario"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jMenuItemDetalleCerrarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoDetalleMovimientoInventario"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonGuardarCambiosToolBarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoDetalleMovimientoInventario"));
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonGuardarCambiosToolBarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoDetalleMovimientoInventario"));
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoDetalleMovimientoInventario"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonidEstadoDetalleMovimientoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoDetalleMovimientoInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtoncodigoEstadoDetalleMovimientoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoDetalleMovimientoInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonnombreEstadoDetalleMovimientoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoDetalleMovimientoInventarioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTabbedPaneRelacionesEstadoDetalleMovimientoInventario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoDetalleMovimientoInventario"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoDetalleMovimientoInventario"));
		
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoDetalleMovimientoInventario"));
		}
		
		this.jTableDatosEstadoDetalleMovimientoInventario.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoDetalleMovimientoInventario"));
		
		this.jTableDatosEstadoDetalleMovimientoInventario.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoDetalleMovimientoInventario"));
		
		this.jButtonNuevoEstadoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"NuevoEstadoDetalleMovimientoInventario"));
		
		this.jButtonDuplicarEstadoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"DuplicarEstadoDetalleMovimientoInventario"));
		
		this.jButtonCopiarEstadoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"CopiarEstadoDetalleMovimientoInventario"));
		
		this.jButtonVerFormEstadoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"VerFormEstadoDetalleMovimientoInventario"));
		
		
		this.jButtonNuevoToolBarEstadoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoDetalleMovimientoInventario"));
			
		this.jButtonDuplicarToolBarEstadoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoDetalleMovimientoInventario"));
			
		this.jMenuItemNuevoEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoDetalleMovimientoInventario"));
			
		this.jMenuItemDuplicarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoDetalleMovimientoInventario"));		
		
		
		this.jButtonNuevoRelacionesEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoDetalleMovimientoInventario"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoDetalleMovimientoInventario"));
			
		this.jMenuItemNuevoRelacionesEstadoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoDetalleMovimientoInventario"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonModificarEstadoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"ModificarEstadoDetalleMovimientoInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonModificarToolBarEstadoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoDetalleMovimientoInventario"));
			
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jMenuItemModificarEstadoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoDetalleMovimientoInventario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonActualizarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"ActualizarEstadoDetalleMovimientoInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonActualizarToolBarEstadoDetalleMovimientoInventario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoDetalleMovimientoInventario"));
				
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jMenuItemActualizarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoDetalleMovimientoInventario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonEliminarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"EliminarEstadoDetalleMovimientoInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonEliminarToolBarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoDetalleMovimientoInventario"));
						
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jMenuItemEliminarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoDetalleMovimientoInventario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonCancelarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"CancelarEstadoDetalleMovimientoInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonCancelarToolBarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoDetalleMovimientoInventario"));
			
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jMenuItemCancelarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoDetalleMovimientoInventario"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoDetalleMovimientoInventario"));		
		
		
		this.jButtonCerrarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"CerrarEstadoDetalleMovimientoInventario"));
		
		
		this.jButtonCerrarToolBarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoDetalleMovimientoInventario"));
			
		this.jMenuItemCerrarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoDetalleMovimientoInventario"));
			
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jMenuItemDetalleCerrarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoDetalleMovimientoInventario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonGuardarCambiosEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoDetalleMovimientoInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonGuardarCambiosToolBarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoDetalleMovimientoInventario"));
		}
		
		this.jButtonCopiarToolBarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoDetalleMovimientoInventario"));
			
		this.jButtonVerFormToolBarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoDetalleMovimientoInventario"));
		
		this.jMenuItemGuardarCambiosEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoDetalleMovimientoInventario"));
			
		this.jMenuItemCopiarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoDetalleMovimientoInventario"));		
		
		this.jMenuItemVerFormEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoDetalleMovimientoInventario"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoDetalleMovimientoInventario"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoDetalleMovimientoInventario"));
			
		this.jMenuItemGuardarCambiosTablaEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoDetalleMovimientoInventario"));		
		
		
		
		this.jButtonRecargarInformacionEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoDetalleMovimientoInventario"));
					
		this.jButtonRecargarInformacionToolBarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoDetalleMovimientoInventario"));
		
		this.jMenuItemRecargarInformacionEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoDetalleMovimientoInventario"));		
		
		
		
		this.jButtonAnterioresEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"AnterioresEstadoDetalleMovimientoInventario"));
		
		
		this.jButtonAnterioresToolBarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoDetalleMovimientoInventario"));
		
		this.jMenuItemAnterioresEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoDetalleMovimientoInventario"));		
		
		
		this.jButtonSiguientesEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"SiguientesEstadoDetalleMovimientoInventario"));
		
		
		this.jButtonSiguientesToolBarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoDetalleMovimientoInventario"));
			
		this.jMenuItemSiguientesEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoDetalleMovimientoInventario"));
			
		this.jMenuItemAbrirOrderByEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoDetalleMovimientoInventario"));
			
		this.jMenuItemMostrarOcultarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoDetalleMovimientoInventario"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoDetalleMovimientoInventario"));
			
		this.jMenuItemDetalleMostarOcultarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoDetalleMovimientoInventario"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoDetalleMovimientoInventario"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoDetalleMovimientoInventario"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoDetalleMovimientoInventario"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoDetalleMovimientoInventario.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoDetalleMovimientoInventario"));

		this.jCheckBoxSeleccionadosEstadoDetalleMovimientoInventario.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoDetalleMovimientoInventario"));
		
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoDetalleMovimientoInventario"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoDetalleMovimientoInventario"));
			
		this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoDetalleMovimientoInventario"));
					
		this.jComboBoxTiposSeleccionarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoDetalleMovimientoInventario"));
			
		this.jTextFieldValorCampoGeneralEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoDetalleMovimientoInventario"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonidEstadoDetalleMovimientoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoDetalleMovimientoInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtoncodigoEstadoDetalleMovimientoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoDetalleMovimientoInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonnombreEstadoDetalleMovimientoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoDetalleMovimientoInventarioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario!=null) {
				this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoDetalleMovimientoInventario"));
				this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoDetalleMovimientoInventario"));
				this.jInternalFrameReporteDinamicoEstadoDetalleMovimientoInventario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoDetalleMovimientoInventario"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoDetalleMovimientoInventario"));				
			//this.jButtonGenerarReporteDinamicoEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoDetalleMovimientoInventario"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoDetalleMovimientoInventario"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoDetalleMovimientoInventario!=null) {
				this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoDetalleMovimientoInventario"));
				this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoDetalleMovimientoInventario"));
				this.jInternalFrameImportacionEstadoDetalleMovimientoInventario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoDetalleMovimientoInventario"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoDetalleMovimientoInventario"));
			
			this.jButtonAbrirOrderByToolBarEstadoDetalleMovimientoInventario.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoDetalleMovimientoInventario"));			
			
			if(this.jInternalFrameOrderByEstadoDetalleMovimientoInventario!=null) {
				this.jInternalFrameOrderByEstadoDetalleMovimientoInventario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoDetalleMovimientoInventario"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTabbedPaneRelacionesEstadoDetalleMovimientoInventario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoDetalleMovimientoInventario"));
		
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
            		closingInternalFrameEstadoDetalleMovimientoInventario();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoDetalleMovimientoInventario = (JInternalFrameBase)event.getSource();
	            	
	            EstadoDetalleMovimientoInventarioBeanSwingJInternalFrame jInternalFrameParent=(EstadoDetalleMovimientoInventarioBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoDetalleMovimientoInventarioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoDetalleMovimientoInventario.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoDetalleMovimientoInventarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoDetalleMovimientoInventario.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoDetalleMovimientoInventario.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleMovimientoInventarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleMovimientoInventarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleMovimientoInventarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoDetalleMovimientoInventario";
		inputMap = this.jButtonNuevoEstadoDetalleMovimientoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoDetalleMovimientoInventarioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleMovimientoInventarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleMovimientoInventarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleMovimientoInventarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoDetalleMovimientoInventario";
		inputMap = this.jButtonNuevoRelacionesEstadoDetalleMovimientoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoDetalleMovimientoInventarioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoDetalleMovimientoInventario";
		inputMap = this.jButtonModificarEstadoDetalleMovimientoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoDetalleMovimientoInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoDetalleMovimientoInventario";
		inputMap = this.jButtonActualizarEstadoDetalleMovimientoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoDetalleMovimientoInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoDetalleMovimientoInventario";
		inputMap = this.jButtonEliminarEstadoDetalleMovimientoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoDetalleMovimientoInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoDetalleMovimientoInventario";
		inputMap = this.jButtonCancelarEstadoDetalleMovimientoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoDetalleMovimientoInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoDetalleMovimientoInventario";
		inputMap = this.jButtonCerrarEstadoDetalleMovimientoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoDetalleMovimientoInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonGuardarCambiosEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoDetalleMovimientoInventario";
		inputMap = this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonGuardarCambiosEstadoDetalleMovimientoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonGuardarCambiosEstadoDetalleMovimientoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoDetalleMovimientoInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoDetalleMovimientoInventario.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoDetalleMovimientoInventarioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoDetalleMovimientoInventarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoDetalleMovimientoInventario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoDetalleMovimientoInventarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoDetalleMovimientoInventario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoDetalleMovimientoInventarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonidEstadoDetalleMovimientoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoDetalleMovimientoInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtoncodigoEstadoDetalleMovimientoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoDetalleMovimientoInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jButtonnombreEstadoDetalleMovimientoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoDetalleMovimientoInventarioBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoDetalleMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoDetalleMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoDetalleMovimientoInventarioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoDetalleMovimientoInventario.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoDetalleMovimientoInventario(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux:this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios()) {
					estadodetallemovimientoinventarioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux:estadodetallemovimientoinventarios) {
					estadodetallemovimientoinventarioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoDetalleMovimientoInventarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoDetalleMovimientoInventario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux:this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios()) {
						estadodetallemovimientoinventarioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux:estadodetallemovimientoinventarios) {
						estadodetallemovimientoinventarioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux:this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux:estadodetallemovimientoinventarios) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoDetalleMovimientoInventario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoDetalleMovimientoInventario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoDetalleMovimientoInventario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleMovimientoInventario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoDetalleMovimientoInventarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoDetalleMovimientoInventario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoDetalleMovimientoInventario.getSelectedRows();
			
			EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioLocal=new EstadoDetalleMovimientoInventario();
			
			//this.seleccionarTodosEstadoDetalleMovimientoInventario(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadodetallemovimientoinventarioLocal =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios().toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadodetallemovimientoinventarioLocal =(EstadoDetalleMovimientoInventario) this.estadodetallemovimientoinventarios.toArray()[this.jTableDatosEstadoDetalleMovimientoInventario.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadodetallemovimientoinventarioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux:this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios()) {
						estadodetallemovimientoinventarioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux:estadodetallemovimientoinventarios) {
						estadodetallemovimientoinventarioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoDetalleMovimientoInventario(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoDetalleMovimientoInventario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoDetalleMovimientoInventario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleMovimientoInventario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoDetalleMovimientoInventarioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoDetalleMovimientoInventarioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoDetalleMovimientoInventarioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoDetalleMovimientoInventario(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoDetalleMovimientoInventario.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux:this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios()) {
				
						if(sTipoSeleccionar.equals(EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadodetallemovimientoinventarioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadodetallemovimientoinventarioAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux:estadodetallemovimientoinventarios) {
					
						if(sTipoSeleccionar.equals(EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadodetallemovimientoinventarioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadodetallemovimientoinventarioAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoDetalleMovimientoInventario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoDetalleMovimientoInventarioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoDetalleMovimientoInventario(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoDetalleMovimientoInventario=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoDetalleMovimientoInventario) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoDetalleMovimientoInventario(conSplash);
				
					this.generarReporteEstadoDetalleMovimientoInventariosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoDetalleMovimientoInventariosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoDetalleMovimientoInventariosSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoDetalleMovimientoInventariosSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoDetalleMovimientoInventario();
				
				this.exportarEstadoDetalleMovimientoInventariosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoDetalleMovimientoInventarios();
				//this.importarEstadoDetalleMovimientoInventarios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoDetalleMovimientoInventario();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoDetalleMovimientoInventariosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Detalle Movimiento Inventario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoDetalleMovimientoInventario();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoDetalleMovimientoInventario)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoDetalleMovimientoInventario(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Detalle Movimiento Inventario",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadoDetalleMovimientoInventarioBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadoDetalleMovimientoInventario) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadoDetalleMovimientoInventario(conSplash);
					
						//this.actualizarParametrosGeneralEstadoDetalleMovimientoInventario();
						
						this.generarReporteProcesoAccionEstadoDetalleMovimientoInventariosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estado Detalle Movimiento InventarioS SELECCIONADOS?", "MANTENIMIENTO DE Estado Detalle Movimiento Inventario", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadoDetalleMovimientoInventario();
				
						this.actualizarParametrosGeneralEstadoDetalleMovimientoInventario();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadodetallemovimientoinventarioReturnGeneral=estadodetallemovimientoinventarioLogic.procesarAccionEstadoDetalleMovimientoInventariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios(),this.estadodetallemovimientoinventarioParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadoDetalleMovimientoInventarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoDetalleMovimientoInventario();
					
					EstadoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadoDetalleMovimientoInventarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoDetalleMovimientoInventario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoDetalleMovimientoInventario.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoDetalleMovimientoInventario(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoDetalleMovimientoInventarioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoDetalleMovimientoInventario();
			
			if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosSeleccionados=new ArrayList<EstadoDetalleMovimientoInventario>();		
			EstadoDetalleMovimientoInventario estadodetallemovimientoinventario=new EstadoDetalleMovimientoInventario();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoDetalleMovimientoInventario(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoDetalleMovimientoInventario.getSelectedItem();
			
			
			
			
			estadodetallemovimientoinventariosSeleccionados=this.getEstadoDetalleMovimientoInventariosSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadodetallemovimientoinventariosSeleccionados.size()==1) {
				for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux:estadodetallemovimientoinventariosSeleccionados) {
					estadodetallemovimientoinventario=estadodetallemovimientoinventarioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Movimiento Inventario")) {
					jButtonDetalleMovimientoInventarioActionPerformed(null,rowIndex,true,false,estadodetallemovimientoinventario);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoDetalleMovimientoInventario();
			
      		//this.finishProcessEstadoDetalleMovimientoInventario(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoDetalleMovimientoInventarioReturnGeneral() throws Exception {
		if(this.estadodetallemovimientoinventarioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadodetallemovimientoinventarioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadodetallemovimientoinventarioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadodetallemovimientoinventarioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadodetallemovimientoinventarioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadodetallemovimientoinventarioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoDetalleMovimientoInventario(false);
		}
		
		if(this.estadodetallemovimientoinventarioReturnGeneral.getConRetornoLista() || this.estadodetallemovimientoinventarioReturnGeneral.getConRetornoObjeto()) {
			if(this.estadodetallemovimientoinventarioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadodetallemovimientoinventarioLogic.setEstadoDetalleMovimientoInventarios(this.estadodetallemovimientoinventarioReturnGeneral.getEstadoDetalleMovimientoInventarios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadodetallemovimientoinventarioReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadodetallemovimientoinventarioLogic.setEstadoDetalleMovimientoInventario(this.estadodetallemovimientoinventarioReturnGeneral.getEstadoDetalleMovimientoInventario());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoDetalleMovimientoInventario(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoDetalleMovimientoInventario() throws Exception {
		
		
	}
	
	public ArrayList<EstadoDetalleMovimientoInventario> getEstadoDetalleMovimientoInventariosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosSeleccionados=new ArrayList<EstadoDetalleMovimientoInventario>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoDetalleMovimientoInventario) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux:estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios()) {
					if(estadodetallemovimientoinventarioAux.getIsSelected()) {
						estadodetallemovimientoinventariosSeleccionados.add(estadodetallemovimientoinventarioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux:this.estadodetallemovimientoinventarios) {
					if(estadodetallemovimientoinventarioAux.getIsSelected()) {
						estadodetallemovimientoinventariosSeleccionados.add(estadodetallemovimientoinventarioAux);				
					}
				}
			}
			
			if(estadodetallemovimientoinventariosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadodetallemovimientoinventariosSeleccionados.addAll(this.estadodetallemovimientoinventarioLogic.getEstadoDetalleMovimientoInventarios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadodetallemovimientoinventariosSeleccionados.addAll(this.estadodetallemovimientoinventarios);				
					}
				}
			}
		} else {
			estadodetallemovimientoinventariosSeleccionados.add(this.estadodetallemovimientoinventario);
		}
		
		return estadodetallemovimientoinventariosSeleccionados;
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
	
	public void generarReporteEstadoDetalleMovimientoInventariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoDetalleMovimientoInventariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoDetalleMovimientoInventariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoDetalleMovimientoInventariosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoDetalleMovimientoInventariosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoDetalleMovimientoInventariosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Detalle Movimiento Inventario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoDetalleMovimientoInventariosSeleccionados() throws Exception {
		ArrayList<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosSeleccionados=new ArrayList<EstadoDetalleMovimientoInventario>();		
		
		estadodetallemovimientoinventariosSeleccionados=this.getEstadoDetalleMovimientoInventariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoDetalleMovimientoInventarios("Todos",estadodetallemovimientoinventariosSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoDetalleMovimientoInventariosSeleccionados() throws Exception {
		ArrayList<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosSeleccionados=new ArrayList<EstadoDetalleMovimientoInventario>();		
		
		estadodetallemovimientoinventariosSeleccionados=this.getEstadoDetalleMovimientoInventariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoDetalleMovimientoInventarios("Todos",estadodetallemovimientoinventariosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoDetalleMovimientoInventariosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosSeleccionados=new ArrayList<EstadoDetalleMovimientoInventario>();
		
		estadodetallemovimientoinventariosSeleccionados=this.getEstadoDetalleMovimientoInventariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoDetalleMovimientoInventarios("Todos",estadodetallemovimientoinventariosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoDetalleMovimientoInventariosSeleccionados() throws Exception {
		ArrayList<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosSeleccionados=new ArrayList<EstadoDetalleMovimientoInventario>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoDetalleMovimientoInventario();
		
		
		estadodetallemovimientoinventariosSeleccionados=this.getEstadoDetalleMovimientoInventariosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoDetalleMovimientoInventario();
		
		
		//this.generarReporteEstadoDetalleMovimientoInventarios("Todos",estadodetallemovimientoinventariosSeleccionados ,estadodetallemovimientoinventarioImplementable,estadodetallemovimientoinventarioImplementableHome);
	}
	
	public void mostrarImportacionEstadoDetalleMovimientoInventarios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoDetalleMovimientoInventario();
		
		this.abrirFrameImportacionEstadoDetalleMovimientoInventario();		
		
			
		//this.generarReporteEstadoDetalleMovimientoInventarios("Todos",estadodetallemovimientoinventariosSeleccionados ,estadodetallemovimientoinventarioImplementable,estadodetallemovimientoinventarioImplementableHome);
	}
	
	public void importarEstadoDetalleMovimientoInventarios() throws Exception {		
	
	}
	
	public void exportarEstadoDetalleMovimientoInventariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoDetalleMovimientoInventariosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoDetalleMovimientoInventariosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoDetalleMovimientoInventariosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Detalle Movimiento Inventario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoDetalleMovimientoInventariosSeleccionados() throws Exception {
		ArrayList<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosSeleccionados=new ArrayList<EstadoDetalleMovimientoInventario>();		
		
		estadodetallemovimientoinventariosSeleccionados=this.getEstadoDetalleMovimientoInventariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetallemovimientoinventario."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoDetalleMovimientoInventario(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux:estadodetallemovimientoinventariosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoDetalleMovimientoInventario(estadodetallemovimientoinventarioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadodetallemovimientoinventarioAux.setsDetalleGeneralEntityReporte(estadodetallemovimientoinventarioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Movimiento Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoDetalleMovimientoInventario(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoDetalleMovimientoInventario(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadodetallemovimientoinventario.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadodetallemovimientoinventario.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadodetallemovimientoinventario.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadodetallemovimientoinventario.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoDetalleMovimientoInventariosSeleccionados() throws Exception {
		ArrayList<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosSeleccionados=new ArrayList<EstadoDetalleMovimientoInventario>();		
		
		estadodetallemovimientoinventariosSeleccionados=this.getEstadoDetalleMovimientoInventariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetallemovimientoinventario.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoDetalleMovimientoInventarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoDetalleMovimientoInventario(row);				
				iRow++;
			}				
			
			for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux:estadodetallemovimientoinventariosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoDetalleMovimientoInventario(estadodetallemovimientoinventarioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Movimiento Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoDetalleMovimientoInventariosSeleccionados() throws Exception {
		ArrayList<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosSeleccionados=new ArrayList<EstadoDetalleMovimientoInventario>();		
		
		estadodetallemovimientoinventariosSeleccionados=this.getEstadoDetalleMovimientoInventariosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetallemovimientoinventario.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadodetallemovimientoinventarios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadodetallemovimientoinventario");
			//elementRoot.appendChild(element);
		
			for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux:estadodetallemovimientoinventariosSeleccionados) {
				element = document.createElement("estadodetallemovimientoinventario");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoDetalleMovimientoInventario(estadodetallemovimientoinventarioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Movimiento Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoDetalleMovimientoInventario(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoDetalleMovimientoInventario(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadodetallemovimientoinventario.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadodetallemovimientoinventario.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadodetallemovimientoinventario.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoDetalleMovimientoInventario(EstadoDetalleMovimientoInventario estadodetallemovimientoinventario,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoDetalleMovimientoInventarioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadodetallemovimientoinventario.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoDetalleMovimientoInventarioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadodetallemovimientoinventario.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoDetalleMovimientoInventarioConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadodetallemovimientoinventario.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoDetalleMovimientoInventarioConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadodetallemovimientoinventario.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoDetalleMovimientoInventariosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosSeleccionados=new ArrayList<EstadoDetalleMovimientoInventario>();
		
		estadodetallemovimientoinventariosSeleccionados=this.getEstadoDetalleMovimientoInventariosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoDetalleMovimientoInventario(estadodetallemovimientoinventariosSeleccionados);
		
		this.generarReporteEstadoDetalleMovimientoInventarios("Todos",estadodetallemovimientoinventariosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoDetalleMovimientoInventario(ArrayList<EstadoDetalleMovimientoInventario> estadodetallemovimientoinventariosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoDetalleMovimientoInventario estadodetallemovimientoinventarioAux:estadodetallemovimientoinventariosSeleccionados) {
				estadodetallemovimientoinventarioAux.setsDetalleGeneralEntityReporte(estadodetallemovimientoinventarioAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadodetallemovimientoinventarioAux.setsDescripcionGeneralEntityReporte1(estadodetallemovimientoinventarioAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadodetallemovimientoinventarioAux.setsDescripcionGeneralEntityReporte1(estadodetallemovimientoinventarioAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoDetalleMovimientoInventario(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoDetalleMovimientoInventario=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleMovimientoInventario=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoDetalleMovimientoInventario=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleMovimientoInventario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaModificarEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaEliminarEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleMovimientoInventario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaModificarEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaEliminarEstadoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaCancelarEstadoDetalleMovimientoInventario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaModificarEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaEliminarEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleMovimientoInventario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaModificarEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleMovimientoInventario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleMovimientoInventario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaModificarEstadoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaActualizarEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleMovimientoInventario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleMovimientoInventario=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoDetalleMovimientoInventarioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleMovimientoInventario=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleMovimientoInventario=true;
		} else {
			this.actualizarEstadoPanelsEstadoDetalleMovimientoInventario(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoDetalleMovimientoInventario=false;
			//this.isVisibilidadCeldaVerFormEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaDuplicarEstadoDetalleMovimientoInventario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleMovimientoInventario=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleMovimientoInventario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			if(!estadodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleMovimientoInventario=false;												
			}
			
			this.jButtonCerrarEstadoDetalleMovimientoInventario.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleMovimientoInventario=false;
		}
		
		if(!this.permiteMantenimiento(this.estadodetallemovimientoinventario)) {
			this.isVisibilidadCeldaActualizarEstadoDetalleMovimientoInventario=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleMovimientoInventario=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoDetalleMovimientoInventario() {
		this.isVisibilidadCeldaNuevoEstadoDetalleMovimientoInventario=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoDetalleMovimientoInventario=false;
	}
	
	public void actualizarEstadoPanelsEstadoDetalleMovimientoInventario(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosEstadoDetalleMovimientoInventario.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetalleMovimientoInventario!=null) {
				this.jPanelPaginacionEstadoDetalleMovimientoInventario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleMovimientoInventario!=null) {
				this.jPanelParametrosReportesEstadoDetalleMovimientoInventario.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosEstadoDetalleMovimientoInventario.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoDetalleMovimientoInventario!=null) {
				this.jPanelPaginacionEstadoDetalleMovimientoInventario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleMovimientoInventario!=null) {
				this.jPanelParametrosReportesEstadoDetalleMovimientoInventario.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosEstadoDetalleMovimientoInventario.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoDetalleMovimientoInventario!=null) {
				this.jPanelPaginacionEstadoDetalleMovimientoInventario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleMovimientoInventario!=null) {
				this.jPanelParametrosReportesEstadoDetalleMovimientoInventario.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosEstadoDetalleMovimientoInventario.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoDetalleMovimientoInventario!=null) {
				this.jPanelPaginacionEstadoDetalleMovimientoInventario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleMovimientoInventario!=null) {
				this.jPanelParametrosReportesEstadoDetalleMovimientoInventario.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosEstadoDetalleMovimientoInventario.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetalleMovimientoInventario!=null) {
				this.jPanelPaginacionEstadoDetalleMovimientoInventario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleMovimientoInventario!=null) {
				this.jPanelParametrosReportesEstadoDetalleMovimientoInventario.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosEstadoDetalleMovimientoInventario.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetalleMovimientoInventario!=null) {
				this.jPanelPaginacionEstadoDetalleMovimientoInventario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleMovimientoInventario!=null) {
				this.jPanelParametrosReportesEstadoDetalleMovimientoInventario.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleMovimientoInventario.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleMovimientoInventario!=null) {
				this.jScrollPanelDatosEstadoDetalleMovimientoInventario.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetalleMovimientoInventario!=null) {
				this.jPanelPaginacionEstadoDetalleMovimientoInventario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleMovimientoInventario!=null) {
				this.jPanelParametrosReportesEstadoDetalleMovimientoInventario.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoDetalleMovimientoInventarioParaDetalleMovimientoInventarios() throws Exception {
		Boolean isPaginaPopupDetalleMovimientoInventario=false;

		try {

			if(this.estadodetallemovimientoinventarioSessionBean==null) {
				this.estadodetallemovimientoinventarioSessionBean=new EstadoDetalleMovimientoInventarioSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioSessionBean=new DetalleMovimientoInventarioSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioSessionBean.setsPathNavegacionActual(estadodetallemovimientoinventarioSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleMovimientoInventario=this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleMovimientoInventario(true);
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleMovimientoInventario(EstadoDetalleMovimientoInventarioConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioSessionBean.setisBusquedaDesdeForeignKeySesionEstadoDetalleMovimientoInventario(true);
			this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.detallemovimientoinventarioSessionBean.setlidEstadoDetalleMovimientoInventarioActual(this.idEstadoDetalleMovimientoInventarioActual);

			estadodetallemovimientoinventarioSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoDetalleMovimientoInventario(true);
			estadodetallemovimientoinventarioSessionBean.setlIdEstadoDetalleMovimientoInventarioActualForeignKey(this.idEstadoDetalleMovimientoInventarioActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoDetalleMovimientoInventarioSessionBean estadodetallemovimientoinventarioSessionBean=new EstadoDetalleMovimientoInventarioSessionBean();
		
		if(this.estadodetallemovimientoinventarioSessionBean==null) {
			this.estadodetallemovimientoinventarioSessionBean=new EstadoDetalleMovimientoInventarioSessionBean();
		}
		
		this.estadodetallemovimientoinventarioSessionBean.setsUltimaBusquedaEstadoDetalleMovimientoInventario(this.getsAccionBusqueda());
		this.estadodetallemovimientoinventarioSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadodetallemovimientoinventarioSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoDetalleMovimientoInventarioSessionBean estadodetallemovimientoinventarioSessionBean=new EstadoDetalleMovimientoInventarioSessionBean();
		
		if(this.estadodetallemovimientoinventarioSessionBean==null) {
			this.estadodetallemovimientoinventarioSessionBean=new EstadoDetalleMovimientoInventarioSessionBean();
		}
		
		if(this.estadodetallemovimientoinventarioSessionBean.getsUltimaBusquedaEstadoDetalleMovimientoInventario()!=null&&!this.estadodetallemovimientoinventarioSessionBean.getsUltimaBusquedaEstadoDetalleMovimientoInventario().equals("")) {
			this.setsAccionBusqueda(estadodetallemovimientoinventarioSessionBean.getsUltimaBusquedaEstadoDetalleMovimientoInventario());
			this.setiNumeroPaginacion(estadodetallemovimientoinventarioSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadodetallemovimientoinventarioSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadodetallemovimientoinventarioSessionBean.setsUltimaBusquedaEstadoDetalleMovimientoInventario("");
		this.estadodetallemovimientoinventarioSessionBean.setiNumeroPaginacion(EstadoDetalleMovimientoInventarioConstantesFunciones.INUMEROPAGINACION);
		this.estadodetallemovimientoinventarioSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoDetalleMovimientoInventario(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoDetalleMovimientoInventario() {
		this.updateBorderResaltarBusquedasFormularioEstadoDetalleMovimientoInventario();
		this.updateVisibilidadBusquedasFormularioEstadoDetalleMovimientoInventario();
		this.updateHabilitarBusquedasFormularioEstadoDetalleMovimientoInventario();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoDetalleMovimientoInventario() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoDetalleMovimientoInventario() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoDetalleMovimientoInventario() {
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
	
	public void updateControlesFormularioEstadoDetalleMovimientoInventario() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoDetalleMovimientoInventario();
		this.updateVisibilidadResaltarControlesFormularioEstadoDetalleMovimientoInventario();
		this.updateHabilitarResaltarControlesFormularioEstadoDetalleMovimientoInventario();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoDetalleMovimientoInventario() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadodetallemovimientoinventarioConstantesFunciones.resaltaridEstadoDetalleMovimientoInventario!=null && this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) {this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTextFieldidEstadoDetalleMovimientoInventario.setBorder(this.estadodetallemovimientoinventarioConstantesFunciones.resaltaridEstadoDetalleMovimientoInventario);}
		if(this.estadodetallemovimientoinventarioConstantesFunciones.resaltarcodigoEstadoDetalleMovimientoInventario!=null && this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) {this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTextFieldcodigoEstadoDetalleMovimientoInventario.setBorder(this.estadodetallemovimientoinventarioConstantesFunciones.resaltarcodigoEstadoDetalleMovimientoInventario);}
		if(this.estadodetallemovimientoinventarioConstantesFunciones.resaltarnombreEstadoDetalleMovimientoInventario!=null && this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) {this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTextAreanombreEstadoDetalleMovimientoInventario.setBorder(this.estadodetallemovimientoinventarioConstantesFunciones.resaltarnombreEstadoDetalleMovimientoInventario);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoDetalleMovimientoInventario() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) {
	
		//this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTextFieldidEstadoDetalleMovimientoInventario.setVisible(this.estadodetallemovimientoinventarioConstantesFunciones.mostraridEstadoDetalleMovimientoInventario);
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jPanelidEstadoDetalleMovimientoInventario.setVisible(this.estadodetallemovimientoinventarioConstantesFunciones.mostraridEstadoDetalleMovimientoInventario);
		//this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTextFieldcodigoEstadoDetalleMovimientoInventario.setVisible(this.estadodetallemovimientoinventarioConstantesFunciones.mostrarcodigoEstadoDetalleMovimientoInventario);
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jPanelcodigoEstadoDetalleMovimientoInventario.setVisible(this.estadodetallemovimientoinventarioConstantesFunciones.mostrarcodigoEstadoDetalleMovimientoInventario);
		//this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTextAreanombreEstadoDetalleMovimientoInventario.setVisible(this.estadodetallemovimientoinventarioConstantesFunciones.mostrarnombreEstadoDetalleMovimientoInventario);
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jPanelnombreEstadoDetalleMovimientoInventario.setVisible(this.estadodetallemovimientoinventarioConstantesFunciones.mostrarnombreEstadoDetalleMovimientoInventario);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoDetalleMovimientoInventario() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario!=null) {
	
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTextFieldidEstadoDetalleMovimientoInventario.setEnabled(this.estadodetallemovimientoinventarioConstantesFunciones.activaridEstadoDetalleMovimientoInventario);
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTextFieldcodigoEstadoDetalleMovimientoInventario.setEnabled(this.estadodetallemovimientoinventarioConstantesFunciones.activarcodigoEstadoDetalleMovimientoInventario);
		this.jInternalFrameDetalleFormEstadoDetalleMovimientoInventario.jTextAreanombreEstadoDetalleMovimientoInventario.setEnabled(this.estadodetallemovimientoinventarioConstantesFunciones.activarnombreEstadoDetalleMovimientoInventario);
		}
	}
	
		
}