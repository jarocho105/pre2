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

import com.bydan.erp.inventario.util.EstadoDetalleOrdenCompraConstantesFunciones;
import com.bydan.erp.inventario.util.EstadoDetalleOrdenCompraParameterReturnGeneral;
//import com.bydan.erp.inventario.util.EstadoDetalleOrdenCompraParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.EstadoDetalleOrdenCompraBean;
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


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
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




@SuppressWarnings("unused")
public class EstadoDetalleOrdenCompraBeanSwingJInternalFrame extends EstadoDetalleOrdenCompraJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoDetalleOrdenCompraBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoDetalleOrdenCompra> estadodetalleordencompraValidator = new ClassValidator<EstadoDetalleOrdenCompra>(EstadoDetalleOrdenCompra.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoDetalleOrdenCompra estadodetalleordencompra;	
	public EstadoDetalleOrdenCompra estadodetalleordencompraAux;
	public EstadoDetalleOrdenCompra estadodetalleordencompraAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoDetalleOrdenCompra estadodetalleordencompraTotales;
	public Long idEstadoDetalleOrdenCompraActual;
	public Long iIdNuevoEstadoDetalleOrdenCompra=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosDetalleOrdenCompra=false;

	public Boolean getIsTienePermisosDetalleOrdenCompra() {
		return isTienePermisosDetalleOrdenCompra;
	}

	public void setIsTienePermisosDetalleOrdenCompra(Boolean isTienePermisosDetalleOrdenCompra) {
		this.isTienePermisosDetalleOrdenCompra= isTienePermisosDetalleOrdenCompra;
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
	
	public Boolean isPermisoTodoEstadoDetalleOrdenCompra;
	public Boolean isPermisoNuevoEstadoDetalleOrdenCompra;
	public Boolean isPermisoActualizarEstadoDetalleOrdenCompra;
	public Boolean isPermisoActualizarOriginalEstadoDetalleOrdenCompra;
	public Boolean isPermisoEliminarEstadoDetalleOrdenCompra;
	public Boolean isPermisoGuardarCambiosEstadoDetalleOrdenCompra;
	public Boolean isPermisoConsultaEstadoDetalleOrdenCompra;
	public Boolean isPermisoBusquedaEstadoDetalleOrdenCompra;
	public Boolean isPermisoReporteEstadoDetalleOrdenCompra;
	public Boolean isPermisoPaginacionMedioEstadoDetalleOrdenCompra;
	public Boolean isPermisoPaginacionAltoEstadoDetalleOrdenCompra;
	public Boolean isPermisoPaginacionTodoEstadoDetalleOrdenCompra;
	public Boolean isPermisoCopiarEstadoDetalleOrdenCompra;
	public Boolean isPermisoVerFormEstadoDetalleOrdenCompra;
	public Boolean isPermisoDuplicarEstadoDetalleOrdenCompra;
	public Boolean isPermisoOrdenEstadoDetalleOrdenCompra;
	
	
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
	
	public EstadoDetalleOrdenCompraParameterReturnGeneral estadodetalleordencompraReturnGeneral;
	public EstadoDetalleOrdenCompraParameterReturnGeneral estadodetalleordencompraParameterGeneral;
	
	

	public DetalleOrdenCompraLogic detalleordencompraLogic=null;

	public DetalleOrdenCompraLogic getDetalleOrdenCompraLogic() {
		return detalleordencompraLogic;
	}

	public void setDetalleOrdenCompraLogic(DetalleOrdenCompraLogic detalleordencompraLogic) {
		this.detalleordencompraLogic = detalleordencompraLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoDetalleOrdenCompra=false;
	public Boolean esParaAccionDesdeFormularioEstadoDetalleOrdenCompra=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadoDetalleOrdenCompraSessionBeanAdditional estadodetalleordencompraSessionBeanAdditional=null;
	
	public EstadoDetalleOrdenCompraSessionBeanAdditional getEstadoDetalleOrdenCompraSessionBeanAdditional() {
		return this.estadodetalleordencompraSessionBeanAdditional;
	}
	
	public void setEstadoDetalleOrdenCompraSessionBeanAdditional(EstadoDetalleOrdenCompraSessionBeanAdditional estadodetalleordencompraSessionBeanAdditional) {
		try {
			this.estadodetalleordencompraSessionBeanAdditional=estadodetalleordencompraSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional estadodetalleordencompraBeanSwingJInternalFrameAdditional=null;
	//public class EstadoDetalleOrdenCompraBeanSwingJInternalFrame
	
	public EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional getEstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional() {
		return this.estadodetalleordencompraBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional(EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional estadodetalleordencompraBeanSwingJInternalFrameAdditional) {
		try {
			this.estadodetalleordencompraBeanSwingJInternalFrameAdditional=estadodetalleordencompraBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoDetalleOrdenCompraLogic estadodetalleordencompraLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoDetalleOrdenCompra estadodetalleordencompraBean;
	public EstadoDetalleOrdenCompraConstantesFunciones estadodetalleordencompraConstantesFunciones;
	//public EstadoDetalleOrdenCompraParameterReturnGeneral estadodetalleordencompraReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoDetalleOrdenCompra> estadodetalleordencompras;	
	//public List<EstadoDetalleOrdenCompra> estadodetalleordencomprasEliminados;
	//public List<EstadoDetalleOrdenCompra> estadodetalleordencomprasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoDetalleOrdenCompra=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoDetalleOrdenCompra=true;
	public Boolean isVisibilidadCeldaCopiarEstadoDetalleOrdenCompra=true;
	public Boolean isVisibilidadCeldaVerFormEstadoDetalleOrdenCompra=true;
	public Boolean isVisibilidadCeldaOrdenEstadoDetalleOrdenCompra=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoDetalleOrdenCompra=false;
	public Boolean isVisibilidadCeldaModificarEstadoDetalleOrdenCompra=false;
	public Boolean isVisibilidadCeldaActualizarEstadoDetalleOrdenCompra=false;
	public Boolean isVisibilidadCeldaEliminarEstadoDetalleOrdenCompra=false;
	public Boolean isVisibilidadCeldaCancelarEstadoDetalleOrdenCompra=false;
	public Boolean isVisibilidadCeldaGuardarEstadoDetalleOrdenCompra=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoDetalleOrdenCompra=false;	
	
	
	
	public Long getiIdNuevoEstadoDetalleOrdenCompra() {
		return this.iIdNuevoEstadoDetalleOrdenCompra;
	}

	public void setiIdNuevoEstadoDetalleOrdenCompra(Long iIdNuevoEstadoDetalleOrdenCompra) {
		this.iIdNuevoEstadoDetalleOrdenCompra = iIdNuevoEstadoDetalleOrdenCompra;
	}
	
	public Long getidEstadoDetalleOrdenCompraActual() {
		return this.idEstadoDetalleOrdenCompraActual;
	}

	public void setidEstadoDetalleOrdenCompraActual(Long idEstadoDetalleOrdenCompraActual) {
		this.idEstadoDetalleOrdenCompraActual = idEstadoDetalleOrdenCompraActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoDetalleOrdenCompra getestadodetalleordencompra() {
		return this.estadodetalleordencompra;
	}

	public void setestadodetalleordencompra(EstadoDetalleOrdenCompra estadodetalleordencompra) {
		this.estadodetalleordencompra = estadodetalleordencompra;
	}
	
	public EstadoDetalleOrdenCompra getestadodetalleordencompraAux() {
		return this.estadodetalleordencompraAux;
	}

	public void setestadodetalleordencompraAux(EstadoDetalleOrdenCompra estadodetalleordencompraAux) {
		this.estadodetalleordencompraAux = estadodetalleordencompraAux;
	}				
	
	public EstadoDetalleOrdenCompra getestadodetalleordencompraAnterior() {
		return this.estadodetalleordencompraAnterior;
	}

	public void setestadodetalleordencompraAnterior(EstadoDetalleOrdenCompra estadodetalleordencompraAnterior) {
		this.estadodetalleordencompraAnterior = estadodetalleordencompraAnterior;
	}	
	
	public EstadoDetalleOrdenCompra getestadodetalleordencompraTotales() {
		return this.estadodetalleordencompraTotales;
	}

	public void setestadodetalleordencompraTotales(EstadoDetalleOrdenCompra estadodetalleordencompraTotales) {
		this.estadodetalleordencompraTotales = estadodetalleordencompraTotales;
	}	
	
	public EstadoDetalleOrdenCompra getestadodetalleordencompraBean() {
		return this.estadodetalleordencompraBean;
	}

	public void setestadodetalleordencompraBean(EstadoDetalleOrdenCompra estadodetalleordencompraBean) {
		this.estadodetalleordencompraBean = estadodetalleordencompraBean;
	}	
	
	public EstadoDetalleOrdenCompraParameterReturnGeneral getestadodetalleordencompraReturnGeneral() {
		return this.estadodetalleordencompraReturnGeneral;
	}

	public void setestadodetalleordencompraReturnGeneral(EstadoDetalleOrdenCompraParameterReturnGeneral estadodetalleordencompraReturnGeneral) {
		this.estadodetalleordencompraReturnGeneral = estadodetalleordencompraReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoDetalleOrdenCompraLogic getEstadoDetalleOrdenCompraLogic()	{		
		return estadodetalleordencompraLogic;
	}

	public void setEstadoDetalleOrdenCompraLogic(EstadoDetalleOrdenCompraLogic estadodetalleordencompraLogic) {
		this.estadodetalleordencompraLogic = estadodetalleordencompraLogic;
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
	
	public Boolean getIsEsNuevoEstadoDetalleOrdenCompra() {
		return isEsNuevoEstadoDetalleOrdenCompra;
	}

	public void setIsEsNuevoEstadoDetalleOrdenCompra(Boolean isEsNuevoEstadoDetalleOrdenCompra) {
		this.isEsNuevoEstadoDetalleOrdenCompra = isEsNuevoEstadoDetalleOrdenCompra;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoDetalleOrdenCompra() {
		return esParaAccionDesdeFormularioEstadoDetalleOrdenCompra;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoDetalleOrdenCompra(Boolean esParaAccionDesdeFormularioEstadoDetalleOrdenCompra) {
		this.esParaAccionDesdeFormularioEstadoDetalleOrdenCompra = esParaAccionDesdeFormularioEstadoDetalleOrdenCompra;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoDetalleOrdenCompra() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoDetalleOrdenCompraConstantesFunciones.refrescarForeignKeysDescripcionesEstadoDetalleOrdenCompra(this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoDetalleOrdenCompraConstantesFunciones.refrescarForeignKeysDescripcionesEstadoDetalleOrdenCompra(this.estadodetalleordencompras);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadodetalleordencompraLogic.setEstadoDetalleOrdenCompras(this.estadodetalleordencompras);
			estadodetalleordencompraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoDetalleOrdenCompraParameterReturnGeneral getEstadoDetalleOrdenCompraParameterGeneral() {
		return this.estadodetalleordencompraParameterGeneral;
	}
	
	public void setEstadoDetalleOrdenCompraParameterGeneral(EstadoDetalleOrdenCompraParameterReturnGeneral estadodetalleordencompraParameterGeneral) {
		this.estadodetalleordencompraParameterGeneral = estadodetalleordencompraParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoDetalleOrdenCompra() {
		return isPermisoTodoEstadoDetalleOrdenCompra;
	}

	public void setIsPermisoTodoEstadoDetalleOrdenCompra(Boolean isPermisoTodoEstadoDetalleOrdenCompra) {
		this.isPermisoTodoEstadoDetalleOrdenCompra = isPermisoTodoEstadoDetalleOrdenCompra;
	}

	public Boolean getIsPermisoNuevoEstadoDetalleOrdenCompra() {
		return isPermisoNuevoEstadoDetalleOrdenCompra;
	}

	public void setIsPermisoNuevoEstadoDetalleOrdenCompra(Boolean isPermisoNuevoEstadoDetalleOrdenCompra) {
		this.isPermisoNuevoEstadoDetalleOrdenCompra = isPermisoNuevoEstadoDetalleOrdenCompra;
	}

	public Boolean getIsPermisoActualizarEstadoDetalleOrdenCompra() {
		return isPermisoActualizarEstadoDetalleOrdenCompra;
	}

	public void setIsPermisoActualizarEstadoDetalleOrdenCompra(Boolean isPermisoActualizarEstadoDetalleOrdenCompra) {
		this.isPermisoActualizarEstadoDetalleOrdenCompra = isPermisoActualizarEstadoDetalleOrdenCompra;
	}

	public Boolean getIsPermisoEliminarEstadoDetalleOrdenCompra() {
		return isPermisoEliminarEstadoDetalleOrdenCompra;
	}

	public void setIsPermisoEliminarEstadoDetalleOrdenCompra(Boolean isPermisoEliminarEstadoDetalleOrdenCompra) {
		this.isPermisoEliminarEstadoDetalleOrdenCompra = isPermisoEliminarEstadoDetalleOrdenCompra;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoDetalleOrdenCompra() {
		return isPermisoGuardarCambiosEstadoDetalleOrdenCompra;
	}

	public void setIsPermisoGuardarCambiosEstadoDetalleOrdenCompra(Boolean isPermisoGuardarCambiosEstadoDetalleOrdenCompra) {
		this.isPermisoGuardarCambiosEstadoDetalleOrdenCompra = isPermisoGuardarCambiosEstadoDetalleOrdenCompra;
	}
	
	public Boolean getIsPermisoConsultaEstadoDetalleOrdenCompra() {
		return isPermisoConsultaEstadoDetalleOrdenCompra;
	}

	public void setIsPermisoConsultaEstadoDetalleOrdenCompra(Boolean isPermisoConsultaEstadoDetalleOrdenCompra) {
		this.isPermisoConsultaEstadoDetalleOrdenCompra = isPermisoConsultaEstadoDetalleOrdenCompra;
	}

	public Boolean getIsPermisoBusquedaEstadoDetalleOrdenCompra() {
		return isPermisoBusquedaEstadoDetalleOrdenCompra;
	}

	public void setIsPermisoBusquedaEstadoDetalleOrdenCompra(Boolean isPermisoBusquedaEstadoDetalleOrdenCompra) {
		this.isPermisoBusquedaEstadoDetalleOrdenCompra = isPermisoBusquedaEstadoDetalleOrdenCompra;
	}

	public Boolean getIsPermisoReporteEstadoDetalleOrdenCompra() {
		return isPermisoReporteEstadoDetalleOrdenCompra;
	}

	public void setIsPermisoReporteEstadoDetalleOrdenCompra(Boolean isPermisoReporteEstadoDetalleOrdenCompra) {
		this.isPermisoReporteEstadoDetalleOrdenCompra = isPermisoReporteEstadoDetalleOrdenCompra;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoDetalleOrdenCompra() {
		return isPermisoPaginacionMedioEstadoDetalleOrdenCompra;
	}

	public void setIsPermisoPaginacionMedioEstadoDetalleOrdenCompra(Boolean isPermisoPaginacionMedioEstadoDetalleOrdenCompra) {
		this.isPermisoPaginacionMedioEstadoDetalleOrdenCompra = isPermisoPaginacionMedioEstadoDetalleOrdenCompra;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoDetalleOrdenCompra() {
		return isPermisoPaginacionTodoEstadoDetalleOrdenCompra;
	}

	public void setIsPermisoPaginacionTodoEstadoDetalleOrdenCompra(Boolean isPermisoPaginacionTodoEstadoDetalleOrdenCompra) {
		this.isPermisoPaginacionTodoEstadoDetalleOrdenCompra = isPermisoPaginacionTodoEstadoDetalleOrdenCompra;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoDetalleOrdenCompra() {
		return isPermisoPaginacionAltoEstadoDetalleOrdenCompra;
	}

	public void setIsPermisoPaginacionAltoEstadoDetalleOrdenCompra(Boolean isPermisoPaginacionAltoEstadoDetalleOrdenCompra) {
		this.isPermisoPaginacionAltoEstadoDetalleOrdenCompra = isPermisoPaginacionAltoEstadoDetalleOrdenCompra;
	}
	
	public Boolean getIsPermisoCopiarEstadoDetalleOrdenCompra() {
		return isPermisoCopiarEstadoDetalleOrdenCompra;
	}

	public void setIsPermisoCopiarEstadoDetalleOrdenCompra(Boolean isPermisoCopiarEstadoDetalleOrdenCompra) {
		this.isPermisoCopiarEstadoDetalleOrdenCompra = isPermisoCopiarEstadoDetalleOrdenCompra;
	}
	
	public Boolean getIsPermisoVerFormEstadoDetalleOrdenCompra() {
		return isPermisoVerFormEstadoDetalleOrdenCompra;
	}

	public void setIsPermisoVerFormEstadoDetalleOrdenCompra(Boolean isPermisoVerFormEstadoDetalleOrdenCompra) {
		this.isPermisoVerFormEstadoDetalleOrdenCompra = isPermisoVerFormEstadoDetalleOrdenCompra;
	}
	
	public Boolean getIsPermisoDuplicarEstadoDetalleOrdenCompra() {
		return isPermisoDuplicarEstadoDetalleOrdenCompra;
	}

	public void setIsPermisoDuplicarEstadoDetalleOrdenCompra(Boolean isPermisoDuplicarEstadoDetalleOrdenCompra) {
		this.isPermisoDuplicarEstadoDetalleOrdenCompra = isPermisoDuplicarEstadoDetalleOrdenCompra;
	}
	
	public Boolean getIsPermisoOrdenEstadoDetalleOrdenCompra() {
		return isPermisoOrdenEstadoDetalleOrdenCompra;
	}

	public void setIsPermisoOrdenEstadoDetalleOrdenCompra(Boolean isPermisoOrdenEstadoDetalleOrdenCompra) {
		this.isPermisoOrdenEstadoDetalleOrdenCompra = isPermisoOrdenEstadoDetalleOrdenCompra;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoDetalleOrdenCompra() {
		return isVisibilidadCeldaNuevoEstadoDetalleOrdenCompra;
	}

	public void setIsVisibilidadCeldaNuevoEstadoDetalleOrdenCompra(Boolean isVisibilidadCeldaNuevoEstadoDetalleOrdenCompra) {
		this.isVisibilidadCeldaNuevoEstadoDetalleOrdenCompra = isVisibilidadCeldaNuevoEstadoDetalleOrdenCompra;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoDetalleOrdenCompra() {
		return isVisibilidadCeldaDuplicarEstadoDetalleOrdenCompra;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoDetalleOrdenCompra(Boolean isVisibilidadCeldaDuplicarEstadoDetalleOrdenCompra) {
		this.isVisibilidadCeldaDuplicarEstadoDetalleOrdenCompra = isVisibilidadCeldaDuplicarEstadoDetalleOrdenCompra;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoDetalleOrdenCompra() {
		return isVisibilidadCeldaCopiarEstadoDetalleOrdenCompra;
	}

	public void setIsVisibilidadCeldaCopiarEstadoDetalleOrdenCompra(Boolean isVisibilidadCeldaCopiarEstadoDetalleOrdenCompra) {
		this.isVisibilidadCeldaCopiarEstadoDetalleOrdenCompra = isVisibilidadCeldaCopiarEstadoDetalleOrdenCompra;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoDetalleOrdenCompra() {
		return isVisibilidadCeldaVerFormEstadoDetalleOrdenCompra;
	}

	public void setIsVisibilidadCeldaVerFormEstadoDetalleOrdenCompra(Boolean isVisibilidadCeldaVerFormEstadoDetalleOrdenCompra) {
		this.isVisibilidadCeldaVerFormEstadoDetalleOrdenCompra = isVisibilidadCeldaVerFormEstadoDetalleOrdenCompra;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoDetalleOrdenCompra() {
		return isVisibilidadCeldaOrdenEstadoDetalleOrdenCompra;
	}

	public void setIsVisibilidadCeldaOrdenEstadoDetalleOrdenCompra(Boolean isVisibilidadCeldaOrdenEstadoDetalleOrdenCompra) {
		this.isVisibilidadCeldaOrdenEstadoDetalleOrdenCompra = isVisibilidadCeldaOrdenEstadoDetalleOrdenCompra;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoDetalleOrdenCompra() {
		return isVisibilidadCeldaNuevoRelacionesEstadoDetalleOrdenCompra;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoDetalleOrdenCompra(Boolean isVisibilidadCeldaNuevoRelacionesEstadoDetalleOrdenCompra) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleOrdenCompra = isVisibilidadCeldaNuevoRelacionesEstadoDetalleOrdenCompra;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoDetalleOrdenCompra() {
		return isVisibilidadCeldaModificarEstadoDetalleOrdenCompra;
	}

	public void setIsVisibilidadCeldaModificarEstadoDetalleOrdenCompra(Boolean isVisibilidadCeldaModificarEstadoDetalleOrdenCompra) {
		this.isVisibilidadCeldaModificarEstadoDetalleOrdenCompra = isVisibilidadCeldaModificarEstadoDetalleOrdenCompra;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoDetalleOrdenCompra() {
		return isVisibilidadCeldaActualizarEstadoDetalleOrdenCompra;
	}

	public void setIsVisibilidadCeldaActualizarEstadoDetalleOrdenCompra(Boolean isVisibilidadCeldaActualizarEstadoDetalleOrdenCompra) {
		this.isVisibilidadCeldaActualizarEstadoDetalleOrdenCompra = isVisibilidadCeldaActualizarEstadoDetalleOrdenCompra;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoDetalleOrdenCompra() {
		return isVisibilidadCeldaEliminarEstadoDetalleOrdenCompra;
	}

	public void setIsVisibilidadCeldaEliminarEstadoDetalleOrdenCompra(Boolean isVisibilidadCeldaEliminarEstadoDetalleOrdenCompra) {
		this.isVisibilidadCeldaEliminarEstadoDetalleOrdenCompra = isVisibilidadCeldaEliminarEstadoDetalleOrdenCompra;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoDetalleOrdenCompra() {
		return isVisibilidadCeldaCancelarEstadoDetalleOrdenCompra;
	}

	public void setIsVisibilidadCeldaCancelarEstadoDetalleOrdenCompra(Boolean isVisibilidadCeldaCancelarEstadoDetalleOrdenCompra) {
		this.isVisibilidadCeldaCancelarEstadoDetalleOrdenCompra = isVisibilidadCeldaCancelarEstadoDetalleOrdenCompra;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoDetalleOrdenCompra() {
		return isVisibilidadCeldaGuardarEstadoDetalleOrdenCompra;
	}

	public void setIsVisibilidadCeldaGuardarEstadoDetalleOrdenCompra(Boolean isVisibilidadCeldaGuardarEstadoDetalleOrdenCompra) {
		this.isVisibilidadCeldaGuardarEstadoDetalleOrdenCompra = isVisibilidadCeldaGuardarEstadoDetalleOrdenCompra;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoDetalleOrdenCompra() {
		return isVisibilidadCeldaGuardarCambiosEstadoDetalleOrdenCompra;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoDetalleOrdenCompra(Boolean isVisibilidadCeldaGuardarCambiosEstadoDetalleOrdenCompra) {
		this.isVisibilidadCeldaGuardarCambiosEstadoDetalleOrdenCompra = isVisibilidadCeldaGuardarCambiosEstadoDetalleOrdenCompra;
	}
		
	public EstadoDetalleOrdenCompraSessionBean getestadodetalleordencompraSessionBean() {
		return this.estadodetalleordencompraSessionBean;
	}
	
	public void setestadodetalleordencompraSessionBean(EstadoDetalleOrdenCompraSessionBean estadodetalleordencompraSessionBean) {
		this.estadodetalleordencompraSessionBean=estadodetalleordencompraSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleOrdenCompra(EstadoDetalleOrdenCompra estadodetalleordencompra)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoDetalleOrdenCompra estadodetalleordencompra,EstadoDetalleOrdenCompra estadodetalleordencompraAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoDetalleOrdenCompra(estadodetalleordencompra);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadodetalleordencompraAux.setId(estadodetalleordencompra.getId());
		estadodetalleordencompraAux.setVersionRow(estadodetalleordencompra.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoDetalleOrdenCompra();
		
			int intSelectedRow = this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleordencompra =(EstadoDetalleOrdenCompra) this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadodetalleordencompra =(EstadoDetalleOrdenCompra) this.estadodetalleordencompras.toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoDetalleOrdenCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoDetalleOrdenCompra(this.estadodetalleordencompra,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleOrdenCompra(this.estadodetalleordencompra);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadodetalleordencompraValidator.getInvalidValues(this.estadodetalleordencompra);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadodetalleordencompraLogic.setDatosCliente(datosCliente);
			estadodetalleordencompraLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadodetalleordencompraAux=new  EstadoDetalleOrdenCompra();
				
				estadodetalleordencompraAux.setIsNew(true);
				estadodetalleordencompraAux.setIsChanged(true);
				
				estadodetalleordencompraAux.setEstadoDetalleOrdenCompraOriginal(this.estadodetalleordencompra);
				
				estadodetalleordencompraAux.setId(this.estadodetalleordencompra.getId());	
				estadodetalleordencompraAux.setVersionRow(this.estadodetalleordencompra.getVersionRow());	
				estadodetalleordencompraAux.setcodigo(this.estadodetalleordencompra.getcodigo());	
				estadodetalleordencompraAux.setnombre(this.estadodetalleordencompra.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadodetalleordencompraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadodetalleordencompraAux,estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetalleordencompraAux,estadodetalleordencompras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadodetalleordencompraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetalleordencompraLogic.saveEstadoDetalleOrdenCompras();//WithConnection
						//estadodetalleordencompraLogic.getSetVersionRowEstadoDetalleOrdenCompras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadodetalleordencompra,estadodetalleordencompraAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadodetalleordencompraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.getDetalleOrdenCompras().addAll(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencomprasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencompras.addAll(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencomprasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadodetalleordencompraLogic.saveEstadoDetalleOrdenCompraRelaciones(estadodetalleordencompraAux,this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.getDetalleOrdenCompras());//WithConnection
								//estadodetalleordencompraLogic.getSetVersionRowEstadoDetalleOrdenCompras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadodetalleordencompra,estadodetalleordencompraAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.setDetalleOrdenCompras(new ArrayList<DetalleOrdenCompra>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencompras= new ArrayList<DetalleOrdenCompra>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodetalleordencompraAux.setDetalleOrdenCompras(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.getDetalleOrdenCompras());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadodetalleordencompraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadodetalleordencompraAux,estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadodetalleordencompraAux,estadodetalleordencompras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadodetalleordencompra,estadodetalleordencompraAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadodetalleordencompraAux=new  EstadoDetalleOrdenCompra();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado() 
					|| (this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado() && this.estadodetalleordencompra.getId()>=0)) {
						
					estadodetalleordencompraAux.setIsNew(false);
				}
				
				estadodetalleordencompraAux.setIsDeleted(false);
			
				estadodetalleordencompraAux.setId(this.estadodetalleordencompra.getId());	
				estadodetalleordencompraAux.setVersionRow(this.estadodetalleordencompra.getVersionRow());	
				estadodetalleordencompraAux.setcodigo(this.estadodetalleordencompra.getcodigo());	
				estadodetalleordencompraAux.setnombre(this.estadodetalleordencompra.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadodetalleordencompraAux,estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetalleordencompraAux,estadodetalleordencompras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadodetalleordencompraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetalleordencompraLogic.saveEstadoDetalleOrdenCompras();//WithConnection
						//estadodetalleordencompraLogic.getSetVersionRowEstadoDetalleOrdenCompras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadodetalleordencompra,estadodetalleordencompraAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadodetalleordencompraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.getDetalleOrdenCompras().addAll(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencomprasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencompras.addAll(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencomprasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadodetalleordencompraLogic.saveEstadoDetalleOrdenCompraRelaciones(estadodetalleordencompraAux,this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.getDetalleOrdenCompras());//WithConnection
								//estadodetalleordencompraLogic.getSetVersionRowEstadoDetalleOrdenCompras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadodetalleordencompra,estadodetalleordencompraAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.setDetalleOrdenCompras(new ArrayList<DetalleOrdenCompra>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencompras= new ArrayList<DetalleOrdenCompra>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodetalleordencompraAux.setDetalleOrdenCompras(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.getDetalleOrdenCompras());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadodetalleordencompraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadodetalleordencompraAux,estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadodetalleordencompraAux,estadodetalleordencompras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadodetalleordencompra,estadodetalleordencompraAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadodetalleordencompraAux=new  EstadoDetalleOrdenCompra();
				
				estadodetalleordencompraAux.setIsNew(false);
				estadodetalleordencompraAux.setIsChanged(false);
				
				estadodetalleordencompraAux.setIsDeleted(true);
				
				estadodetalleordencompraAux.setId(this.estadodetalleordencompra.getId());	
				estadodetalleordencompraAux.setVersionRow(this.estadodetalleordencompra.getVersionRow());	
				estadodetalleordencompraAux.setcodigo(this.estadodetalleordencompra.getcodigo());	
				estadodetalleordencompraAux.setnombre(this.estadodetalleordencompra.getnombre());	
				
				if(this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadodetalleordencompraAux.getId()>=0) {	
						this.estadodetalleordencomprasEliminados.add(estadodetalleordencompraAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadodetalleordencompraAux,estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetalleordencompraAux,estadodetalleordencompras);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadodetalleordencompraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetalleordencompraLogic.saveEstadoDetalleOrdenCompras();//WithConnection
						//estadodetalleordencompraLogic.getSetVersionRowEstadoDetalleOrdenCompras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadodetalleordencompraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.getDetalleOrdenCompras().addAll(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencomprasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencompras.addAll(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencomprasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadodetalleordencompraLogic.saveEstadoDetalleOrdenCompraRelaciones(estadodetalleordencompraAux,this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.getDetalleOrdenCompras());//WithConnection
								//estadodetalleordencompraLogic.getSetVersionRowEstadoDetalleOrdenCompras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.setDetalleOrdenCompras(new ArrayList<DetalleOrdenCompra>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencompras= new ArrayList<DetalleOrdenCompra>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodetalleordencompraAux.setDetalleOrdenCompras(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.getDetalleOrdenCompras());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadodetalleordencompraSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadodetalleordencompraAux,estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadodetalleordencompraAux,estadodetalleordencompras);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().addAll(this.estadodetalleordencomprasEliminados);
					
					estadodetalleordencompraLogic.saveEstadoDetalleOrdenCompras();//WithConnection
					//estadodetalleordencompraLogic.getSetVersionRowEstadoDetalleOrdenCompras();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadodetalleordencomprasEliminados= new ArrayList<EstadoDetalleOrdenCompra>();		
			}
			
			if(this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Detalle Orden Compra GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Detalle Orden Compra",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadodetalleordencompra=estadodetalleordencompraAux;
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
      		//this.finishProcessEstadoDetalleOrdenCompra();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoDetalleOrdenCompra estadodetalleordencompraLocal) throws Exception {
		
		if(this.estadodetalleordencompraSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadodetalleordencompraLocal.setDetalleOrdenCompras(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.getDetalleOrdenCompras());
			
			} else {
			
				estadodetalleordencompraLocal.setDetalleOrdenCompras(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencompras);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoDetalleOrdenCompra estadodetalleordencompraLocal) throws Exception {	
		if(this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoDetalleOrdenCompraActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadodetalleordencompra =(EstadoDetalleOrdenCompra) this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadodetalleordencompra =(EstadoDetalleOrdenCompra) this.estadodetalleordencompras.toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadodetalleordencompraValidator.getInvalidValues(this.estadodetalleordencompra);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoDetalleOrdenCompra estadodetalleordencompra,List<EstadoDetalleOrdenCompra> estadodetalleordencompras) throws Exception {
		try	{		
			EstadoDetalleOrdenCompraConstantesFunciones.actualizarLista(estadodetalleordencompra,estadodetalleordencompras,this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoDetalleOrdenCompra estadodetalleordencompra,List<EstadoDetalleOrdenCompra> estadodetalleordencompras) throws Exception {
		try	{			
			EstadoDetalleOrdenCompraConstantesFunciones.actualizarSelectedLista(estadodetalleordencompra,estadodetalleordencompras);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoDetalleOrdenCompra> estadodetalleordencomprasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadodetalleordencomprasLocal=this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadodetalleordencomprasLocal=this.estadodetalleordencompras;
			}
			//ARCHITECTURE
		
			for(EstadoDetalleOrdenCompra estadodetalleordencompraLocal:estadodetalleordencomprasLocal) {
				if(this.permiteMantenimiento(estadodetalleordencompraLocal) && estadodetalleordencompraLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoDetalleOrdenCompraConstantesFunciones.getEstadoDetalleOrdenCompraLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoDetalleOrdenCompraConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jLabelcodigoEstadoDetalleOrdenCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoDetalleOrdenCompraConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jLabelnombreEstadoDetalleOrdenCompra,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jLabelcodigoEstadoDetalleOrdenCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jLabelnombreEstadoDetalleOrdenCompra,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleOrdenCompra")) {
			if(this.estadodetalleordencompra==null) {
				this.estadodetalleordencompra= new EstadoDetalleOrdenCompra();
			}

			if(this.estadodetalleordencompraSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoDetalleOrdenCompra
				this.setVariablesFormularioToObjetoActualEstadoDetalleOrdenCompra(this.estadodetalleordencompra,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleOrdenCompra(this.estadodetalleordencompra);

				this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.getdetalleordencompra().setEstadoDetalleOrdenCompra(this.estadodetalleordencompra);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoDetalleOrdenCompra--;	
		
		
		this.estadodetalleordencompraAux=new EstadoDetalleOrdenCompra();
		
		this.estadodetalleordencompraAux.setId(this.iIdNuevoEstadoDetalleOrdenCompra);
		this.estadodetalleordencompraAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().add(this.estadodetalleordencompraAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadodetalleordencompras.add(this.estadodetalleordencompraAux);
		}
		//ARCHITECTURE
		
		this.estadodetalleordencompra=this.estadodetalleordencompraAux;
		
		if(EstadoDetalleOrdenCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoDetalleOrdenCompra(this.estadodetalleordencompra);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleOrdenCompra(this.estadodetalleordencompra);
		}
				
		//this.setDefaultControlesEstadoDetalleOrdenCompra();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoDetalleOrdenCompra();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoDetalleOrdenCompra();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoDetalleOrdenCompra();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoDetalleOrdenCompra(this.estadodetalleordencompraBean,this.estadodetalleordencompra,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleOrdenCompra(this.estadodetalleordencompra);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadodetalleordencompraSessionBean.getConGuardarRelaciones()) {
			classes=EstadoDetalleOrdenCompraConstantesFunciones.getClassesRelationshipsOfEstadoDetalleOrdenCompra(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadodetalleordencompraReturnGeneral=estadodetalleordencompraLogic.procesarEventosEstadoDetalleOrdenComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras(),this.estadodetalleordencompra,this.estadodetalleordencompraParameterGeneral,this.isEsNuevoEstadoDetalleOrdenCompra,classes);//this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompra()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoDetalleOrdenCompra(this.estadodetalleordencompraReturnGeneral,this.estadodetalleordencompraBean,false);
		
		if(this.estadodetalleordencompraReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleOrdenCompra(this.estadodetalleordencompraReturnGeneral.getEstadoDetalleOrdenCompra());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoDetalleOrdenCompra(this.estadodetalleordencompraReturnGeneral.getEstadoDetalleOrdenCompra());
		}
		
		if(this.estadodetalleordencompraReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoDetalleOrdenCompra(this.estadodetalleordencompraReturnGeneral.getEstadoDetalleOrdenCompra(),classes);//this.estadodetalleordencompraBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoDetalleOrdenCompra(this.estadodetalleordencompra,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoDetalleOrdenCompra();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoDetalleOrdenCompra();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.RecargarFormEstadoDetalleOrdenCompra(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoDetalleOrdenCompra(false);
						
			if(estadodetalleordencompraSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencompraSessionBean.getEsGuardarRelacionado() && DetalleOrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleOrdenCompraActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoDetalleOrdenCompraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoDetalleOrdenCompra();
			}
			
			this.actualizarVisualTableDatosEstadoDetalleOrdenCompra();
			
			this.jTableDatosEstadoDetalleOrdenCompra.setRowSelectionInterval(this.getIndiceNuevoEstadoDetalleOrdenCompra(), this.getIndiceNuevoEstadoDetalleOrdenCompra());
			
			this.seleccionarFilaTablaEstadoDetalleOrdenCompraActual();
						
			this.actualizarEstadoCeldasBotonesEstadoDetalleOrdenCompra("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoDetalleOrdenCompra(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTextFieldcodigoEstadoDetalleOrdenCompra.setEnabled(isHabilitar && this.estadodetalleordencompraConstantesFunciones.activarcodigoEstadoDetalleOrdenCompra);
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTextAreanombreEstadoDetalleOrdenCompra.setEnabled(isHabilitar && this.estadodetalleordencompraConstantesFunciones.activarnombreEstadoDetalleOrdenCompra);	
		
	};
	
	public void setDefaultControlesEstadoDetalleOrdenCompra() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoDetalleOrdenCompra(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadodetalleordencompraSessionBean.setConGuardarRelaciones(true);			
			this.estadodetalleordencompraSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTabbedPaneRelacionesEstadoDetalleOrdenCompra.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencompraSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadodetalleordencompraSessionBean.setConGuardarRelaciones(false);			
			this.estadodetalleordencompraSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTabbedPaneRelacionesEstadoDetalleOrdenCompra.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencompraSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoDetalleOrdenCompra() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleOrdenCompra estadodetalleordencompraAux:this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras()) {
				if(estadodetalleordencompraAux.getId().equals(this.iIdNuevoEstadoDetalleOrdenCompra)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleOrdenCompra estadodetalleordencompraAux:this.estadodetalleordencompras) {
				if(estadodetalleordencompraAux.getId().equals(this.iIdNuevoEstadoDetalleOrdenCompra)) {
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
	
	public int getIndiceActualEstadoDetalleOrdenCompra(EstadoDetalleOrdenCompra estadodetalleordencompra,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleOrdenCompra estadodetalleordencompraAux:this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras()) {
				if(estadodetalleordencompraAux.getId().equals(estadodetalleordencompra.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleOrdenCompra estadodetalleordencompraAux:this.estadodetalleordencompras) {
				if(estadodetalleordencompraAux.getId().equals(estadodetalleordencompra.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoDetalleOrdenCompra(EstadoDetalleOrdenCompra estadodetalleordencompraOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleOrdenCompra estadodetalleordencompraAux:this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras()) {
				if(estadodetalleordencompraAux.getEstadoDetalleOrdenCompraOriginal().getId().equals(estadodetalleordencompraOriginal.getId())) {
					existe=true;
					estadodetalleordencompraOriginal.setId(estadodetalleordencompraAux.getId());
					estadodetalleordencompraOriginal.setVersionRow(estadodetalleordencompraAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleOrdenCompra estadodetalleordencompraAux:this.estadodetalleordencompras) {
				if(estadodetalleordencompraAux.getEstadoDetalleOrdenCompraOriginal().getId().equals(estadodetalleordencompraOriginal.getId())) {
					existe=true;
					estadodetalleordencompraOriginal.setId(estadodetalleordencompraAux.getId());
					estadodetalleordencompraOriginal.setVersionRow(estadodetalleordencompraAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoDetalleOrdenCompra(Boolean esParaCancelar) throws Exception {
		estadodetalleordencomprasAux=new ArrayList<EstadoDetalleOrdenCompra>();
		estadodetalleordencompraAux=new EstadoDetalleOrdenCompra();
		
		if(!this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoDetalleOrdenCompra estadodetalleordencompraAux:this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras()) {
					if(estadodetalleordencompraAux.getId()<0) {
						estadodetalleordencomprasAux.add(estadodetalleordencompraAux);
					}		
				}
				this.iIdNuevoEstadoDetalleOrdenCompra=0L;
				this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().removeAll(estadodetalleordencomprasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetalleOrdenCompra estadodetalleordencompraAux:this.estadodetalleordencompras) {
					if(estadodetalleordencompraAux.getId()<0) {
						estadodetalleordencomprasAux.add(estadodetalleordencompraAux);
					}		
				}
				this.iIdNuevoEstadoDetalleOrdenCompra=0L;
				this.estadodetalleordencompras.removeAll(estadodetalleordencomprasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoDetalleOrdenCompra 
					&& this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().size()>0
					) {
					estadodetalleordencompraAux=this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().get(this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().size() - 1);
				
					if(estadodetalleordencompraAux.getId()<0) {
						this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().remove(estadodetalleordencompraAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoDetalleOrdenCompra && this.estadodetalleordencompras.size()>0) {
					estadodetalleordencompraAux=this.estadodetalleordencompras.get(this.estadodetalleordencompras.size() - 1);
				
					if(estadodetalleordencompraAux.getId()<0) {
						this.estadodetalleordencompras.remove(estadodetalleordencompraAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoDetalleOrdenCompra(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadodetalleordencompra.getId()<0) {
				this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().remove(this.estadodetalleordencompra);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadodetalleordencompra.getId()<0) {
				this.estadodetalleordencompras.remove(this.estadodetalleordencompra);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoDetalleOrdenCompra(List<EstadoDetalleOrdenCompra> estadodetalleordencomprasAux) throws Exception {
		EstadoDetalleOrdenCompraConstantesFunciones.setEstadosInicialesEstadoDetalleOrdenCompra(estadodetalleordencomprasAux);
	}
	
	public void setEstadosInicialesEstadoDetalleOrdenCompra(EstadoDetalleOrdenCompra estadodetalleordencompraAux) throws Exception {
		EstadoDetalleOrdenCompraConstantesFunciones.setEstadosInicialesEstadoDetalleOrdenCompra(estadodetalleordencompraAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoDetalleOrdenCompraActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoDetalleOrdenCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoDetalleOrdenCompraActual()) {
				if(!this.isEsNuevoEstadoDetalleOrdenCompra) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoDetalleOrdenCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoDetalleOrdenCompra=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoDetalleOrdenCompraActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Detalle Orden Compra ?", "MANTENIMIENTO DE Estado Detalle Orden Compra", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoDetalleOrdenCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoDetalleOrdenCompra estadodetalleordencompra) throws Exception {
		EstadoDetalleOrdenCompraConstantesFunciones.seleccionarAsignar(this.estadodetalleordencompra,estadodetalleordencompra);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoDetalleOrdenCompra=this.isPermisoActualizarOriginalEstadoDetalleOrdenCompra;
			
			
			this.seleccionarAsignar(estadodetalleordencompra);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoDetalleOrdenCompraConstantesFunciones.quitarEspaciosEstadoDetalleOrdenCompra(this.estadodetalleordencompra,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoDetalleOrdenCompra("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadodetalleordencompraSessionBean.setsFuncionBusquedaRapida(this.estadodetalleordencompraSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoDetalleOrdenCompra) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoDetalleOrdenCompra(esParaCancelar);				
				this.cancelarNuevoEstadoDetalleOrdenCompra(esParaCancelar);								
			}
			
			this.estadodetalleordencompra=new EstadoDetalleOrdenCompra();
			
			this.inicializarEstadoDetalleOrdenCompra();
			
			this.actualizarEstadoCeldasBotonesEstadoDetalleOrdenCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoDetalleOrdenCompra() throws Exception {
		try {
			EstadoDetalleOrdenCompraConstantesFunciones.inicializarEstadoDetalleOrdenCompra(this.estadodetalleordencompra);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoDetalleOrdenCompras(String sAccionBusqueda,List<EstadoDetalleOrdenCompra> estadodetalleordencomprasParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoDetalleOrdenCompra"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoDetalleOrdenCompraMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoDetalleOrdenCompraMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoDetalleOrdenCompra"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Detalle Orden Compras");		
		parameters.put("busquedapor", EstadoDetalleOrdenCompraConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleOrdenCompra.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoDetalleOrdenCompraLogic estadodetalleordencompraLogicAuxiliar=new EstadoDetalleOrdenCompraLogic();
					estadodetalleordencompraLogicAuxiliar.setDatosCliente(estadodetalleordencompraLogic.getDatosCliente());				
					estadodetalleordencompraLogicAuxiliar.setEstadoDetalleOrdenCompras(estadodetalleordencomprasParaReportes);
					
					estadodetalleordencompraLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoDetalleOrdenCompraWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadodetalleordencomprasParaReportes=estadodetalleordencompraLogicAuxiliar.getEstadoDetalleOrdenCompras();
					
					//estadodetalleordencompraLogic.getNewConnexionToDeep();
					
					//for (EstadoDetalleOrdenCompra estadodetalleordencompra:estadodetalleordencomprasParaReportes) {
					//	estadodetalleordencompraLogic.deepLoad(estadodetalleordencompra, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadodetalleordencompraLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadodetalleordencompraLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleOrdenCompra = AuxiliarReportes.class.getResourceAsStream("DetalleOrdenCompraDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalleordencompra", reportFileDetalleOrdenCompra);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoDetalleOrdenCompra=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoDetalleOrdenCompraConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoDetalleOrdenCompraConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoDetalleOrdenCompra=new JRBeanArrayDataSource(EstadoDetalleOrdenCompraJInternalFrame.TraerEstadoDetalleOrdenCompraBeans(estadodetalleordencomprasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoDetalleOrdenCompra);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoDetalleOrdenCompraConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoDetalleOrdenCompraBean.TraerEstadoDetalleOrdenCompraBeans(estadodetalleordencomprasParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoDetalleOrdenCompras(sAccionBusqueda,sTipoArchivoReporte,estadodetalleordencomprasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoDetalleOrdenCompras(sAccionBusqueda,sTipoArchivoReporte,estadodetalleordencomprasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoDetalleOrdenCompraActionPerformed(null);
					//this.generarExcelReporteEstadoDetalleOrdenCompras(sAccionBusqueda,sTipoArchivoReporte,estadodetalleordencomprasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoDetalleOrdenCompras(sAccionBusqueda,sTipoArchivoReporte,estadodetalleordencomprasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoDetalleOrdenCompras(sAccionBusqueda,sTipoArchivoReporte,estadodetalleordencomprasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoDetalleOrdenCompras(sAccionBusqueda,sTipoArchivoReporte,estadodetalleordencomprasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoDetalleOrdenCompras(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoDetalleOrdenCompra> estadodetalleordencomprasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleordencompra";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoDetalleOrdenCompras");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoDetalleOrdenCompra("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoDetalleOrdenCompra estadodetalleordencompra : estadodetalleordencomprasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoDetalleOrdenCompraConstantesFunciones.generarExcelReporteDataEstadoDetalleOrdenCompra("NORMAL",row,workbook,estadodetalleordencompra,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Orden Compra",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoDetalleOrdenCompra(String sTipo,Row row,Workbook workbook) {
		
		EstadoDetalleOrdenCompraConstantesFunciones.generarExcelReporteHeaderEstadoDetalleOrdenCompra(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoDetalleOrdenCompras(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoDetalleOrdenCompra> estadodetalleordencomprasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleordencompra_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoDetalleOrdenCompras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoDetalleOrdenCompra estadodetalleordencompra : estadodetalleordencomprasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoDetalleOrdenCompraConstantesFunciones.getEstadoDetalleOrdenCompraDescripcion(estadodetalleordencompra));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoDetalleOrdenCompraConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoDetalleOrdenCompraConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadodetalleordencompra.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoDetalleOrdenCompraConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoDetalleOrdenCompraConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadodetalleordencompra.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Orden Compra",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoDetalleOrdenCompras(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoDetalleOrdenCompra> estadodetalleordencomprasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoDetalleOrdenCompra> estadodetalleordencomprasRespaldo=null;
		
		classes=EstadoDetalleOrdenCompraConstantesFunciones.getClassesRelationshipsOfEstadoDetalleOrdenCompra(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadodetalleordencompraLogic.setDatosCliente(this.datosCliente);
		this.estadodetalleordencompraLogic.setDatosDeep(this.datosDeep);
		this.estadodetalleordencompraLogic.setIsConDeep(true);
		
		estadodetalleordencomprasRespaldo=this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras();
		
		this.estadodetalleordencompraLogic.setEstadoDetalleOrdenCompras(estadodetalleordencomprasParaReportes);	
		this.estadodetalleordencompraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadodetalleordencomprasParaReportes=this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras();
		this.estadodetalleordencompraLogic.setEstadoDetalleOrdenCompras(estadodetalleordencomprasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleordencompra_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoDetalleOrdenCompras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoDetalleOrdenCompra("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoDetalleOrdenCompra estadodetalleordencompra : estadodetalleordencomprasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoDetalleOrdenCompra("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoDetalleOrdenCompraConstantesFunciones.generarExcelReporteDataEstadoDetalleOrdenCompra("NORMAL",row,workbook,estadodetalleordencompra,cellStyleDataAux);
		
			
			


				//DetalleOrdenCompra
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadodetalleordencompra.getDetalleOrdenCompras()!=null && estadodetalleordencompra.getDetalleOrdenCompras().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleOrdenCompraConstantesFunciones.generarExcelReporteHeaderDetalleOrdenCompra("RELACIONADO",row,workbook);
				}

				if(estadodetalleordencompra.getDetalleOrdenCompras()!=null) {
					i2=0;
					for(DetalleOrdenCompra detalleordencompra : estadodetalleordencompra.getDetalleOrdenCompras()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleOrdenCompraConstantesFunciones.generarExcelReporteDataDetalleOrdenCompra("RELACIONADO",row,workbook,detalleordencompra,cellStyleDataAuxHijo);
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
		cell.setCellValue(EstadoDetalleOrdenCompraConstantesFunciones.getEstadoDetalleOrdenCompraDescripcion(estadodetalleordencompra));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Orden Compra",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoDetalleOrdenCompra() throws Exception {		
		this.startProcessEstadoDetalleOrdenCompra(true);
	}
	
	public void startProcessEstadoDetalleOrdenCompra(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoDetalleOrdenCompra, this.jScrollPanelDatosEstadoDetalleOrdenCompra,this.jPanelPaginacionEstadoDetalleOrdenCompra, this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra, this.jPanelAccionesEstadoDetalleOrdenCompra,this.jPanelAccionesFormularioEstadoDetalleOrdenCompra,this.jmenuBarEstadoDetalleOrdenCompra,this.jmenuBarDetalleEstadoDetalleOrdenCompra,this.jTtoolBarEstadoDetalleOrdenCompra,this.jTtoolBarDetalleEstadoDetalleOrdenCompra);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoDetalleOrdenCompra=null; 
		
		final JPanel jPanelParametrosReportesEstadoDetalleOrdenCompra=this.jPanelParametrosReportesEstadoDetalleOrdenCompra;
		//final JScrollPane jScrollPanelDatosEstadoDetalleOrdenCompra=this.jScrollPanelDatosEstadoDetalleOrdenCompra;
		final JTable jTableDatosEstadoDetalleOrdenCompra=this.jTableDatosEstadoDetalleOrdenCompra;		
		final JPanel jPanelPaginacionEstadoDetalleOrdenCompra=this.jPanelPaginacionEstadoDetalleOrdenCompra;
		//final JScrollPane jScrollPanelDatosEdicionEstadoDetalleOrdenCompra=this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra;
		final JPanel jPanelAccionesEstadoDetalleOrdenCompra=this.jPanelAccionesEstadoDetalleOrdenCompra;
		
		JPanel jPanelCamposAuxiliarEstadoDetalleOrdenCompra=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoDetalleOrdenCompra=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) {
			jPanelCamposAuxiliarEstadoDetalleOrdenCompra=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jPanelCamposEstadoDetalleOrdenCompra;
			jPanelAccionesFormularioAuxiliarEstadoDetalleOrdenCompra=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jPanelAccionesFormularioEstadoDetalleOrdenCompra;
		}
		
		final JPanel jPanelCamposEstadoDetalleOrdenCompra=jPanelCamposAuxiliarEstadoDetalleOrdenCompra;
		final JPanel jPanelAccionesFormularioEstadoDetalleOrdenCompra=jPanelAccionesFormularioAuxiliarEstadoDetalleOrdenCompra;
		
		
		final JMenuBar jmenuBarEstadoDetalleOrdenCompra=this.jmenuBarEstadoDetalleOrdenCompra;
		final JToolBar jTtoolBarEstadoDetalleOrdenCompra=this.jTtoolBarEstadoDetalleOrdenCompra;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoDetalleOrdenCompra=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoDetalleOrdenCompra=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) {
			jmenuBarDetalleAuxiliarEstadoDetalleOrdenCompra=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jmenuBarDetalleEstadoDetalleOrdenCompra;
			jTtoolBarDetalleAuxiliarEstadoDetalleOrdenCompra=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTtoolBarDetalleEstadoDetalleOrdenCompra;
		}
		
		final JMenuBar jmenuBarDetalleEstadoDetalleOrdenCompra=jmenuBarDetalleAuxiliarEstadoDetalleOrdenCompra;
		final JToolBar jTtoolBarDetalleEstadoDetalleOrdenCompra=jTtoolBarDetalleAuxiliarEstadoDetalleOrdenCompra;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoDetalleOrdenCompra;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoDetalleOrdenCompra;
			processRunnable.jTableDatos=jTableDatosEstadoDetalleOrdenCompra;
			processRunnable.jPanelCampos=jPanelCamposEstadoDetalleOrdenCompra;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoDetalleOrdenCompra;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoDetalleOrdenCompra;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoDetalleOrdenCompra;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoDetalleOrdenCompra;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoDetalleOrdenCompra;
			processRunnable.jTtoolBar=jTtoolBarEstadoDetalleOrdenCompra;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoDetalleOrdenCompra;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoDetalleOrdenCompra ,jPanelParametrosReportesEstadoDetalleOrdenCompra,jTableDatosEstadoDetalleOrdenCompra, /*jScrollPanelDatosEstadoDetalleOrdenCompra,*/jPanelCamposEstadoDetalleOrdenCompra,jPanelPaginacionEstadoDetalleOrdenCompra, /*jScrollPanelDatosEdicionEstadoDetalleOrdenCompra,*/ jPanelAccionesEstadoDetalleOrdenCompra,jPanelAccionesFormularioEstadoDetalleOrdenCompra,jmenuBarEstadoDetalleOrdenCompra,jmenuBarDetalleEstadoDetalleOrdenCompra,jTtoolBarEstadoDetalleOrdenCompra,jTtoolBarDetalleEstadoDetalleOrdenCompra);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoDetalleOrdenCompra, jScrollPanelDatosEstadoDetalleOrdenCompra,jPanelPaginacionEstadoDetalleOrdenCompra, jScrollPanelDatosEdicionEstadoDetalleOrdenCompra, jPanelAccionesEstadoDetalleOrdenCompra,jPanelAccionesFormularioEstadoDetalleOrdenCompra,jmenuBarEstadoDetalleOrdenCompra,jmenuBarDetalleEstadoDetalleOrdenCompra,jTtoolBarEstadoDetalleOrdenCompra,jTtoolBarDetalleEstadoDetalleOrdenCompra);
						
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
	
	public void finishProcessEstadoDetalleOrdenCompra() {// throws Exception 
		this.finishProcessEstadoDetalleOrdenCompra(true);
	}
	
	public void finishProcessEstadoDetalleOrdenCompra(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoDetalleOrdenCompra, this.jScrollPanelDatosEstadoDetalleOrdenCompra,this.jPanelPaginacionEstadoDetalleOrdenCompra, this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra, this.jPanelAccionesEstadoDetalleOrdenCompra,this.jPanelAccionesFormularioEstadoDetalleOrdenCompra,this.jmenuBarEstadoDetalleOrdenCompra,this.jmenuBarDetalleEstadoDetalleOrdenCompra,this.jTtoolBarEstadoDetalleOrdenCompra,this.jTtoolBarDetalleEstadoDetalleOrdenCompra);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoDetalleOrdenCompra=null; 
		
		final JPanel jPanelParametrosReportesEstadoDetalleOrdenCompra=this.jPanelParametrosReportesEstadoDetalleOrdenCompra;
		//final JScrollPane jScrollPanelDatosEstadoDetalleOrdenCompra=this.jScrollPanelDatosEstadoDetalleOrdenCompra;
		final JTable jTableDatosEstadoDetalleOrdenCompra=this.jTableDatosEstadoDetalleOrdenCompra;		
		final JPanel jPanelPaginacionEstadoDetalleOrdenCompra=this.jPanelPaginacionEstadoDetalleOrdenCompra;
		//final JScrollPane jScrollPanelDatosEdicionEstadoDetalleOrdenCompra=this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra;
		final JPanel jPanelAccionesEstadoDetalleOrdenCompra=this.jPanelAccionesEstadoDetalleOrdenCompra;
		
		JPanel jPanelCamposAuxiliarEstadoDetalleOrdenCompra=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoDetalleOrdenCompra=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) {
			jPanelCamposAuxiliarEstadoDetalleOrdenCompra=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jPanelCamposEstadoDetalleOrdenCompra;
			jPanelAccionesFormularioAuxiliarEstadoDetalleOrdenCompra=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jPanelAccionesFormularioEstadoDetalleOrdenCompra;
		}
		
		final JPanel jPanelCamposEstadoDetalleOrdenCompra=jPanelCamposAuxiliarEstadoDetalleOrdenCompra;
		final JPanel jPanelAccionesFormularioEstadoDetalleOrdenCompra=jPanelAccionesFormularioAuxiliarEstadoDetalleOrdenCompra;
		
		
		final JMenuBar jmenuBarEstadoDetalleOrdenCompra=this.jmenuBarEstadoDetalleOrdenCompra;		
		final JToolBar jTtoolBarEstadoDetalleOrdenCompra=this.jTtoolBarEstadoDetalleOrdenCompra;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoDetalleOrdenCompra=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoDetalleOrdenCompra=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) {
			jmenuBarDetalleAuxiliarEstadoDetalleOrdenCompra=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jmenuBarDetalleEstadoDetalleOrdenCompra;
			jTtoolBarDetalleAuxiliarEstadoDetalleOrdenCompra=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTtoolBarDetalleEstadoDetalleOrdenCompra;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoDetalleOrdenCompra=jmenuBarDetalleAuxiliarEstadoDetalleOrdenCompra;
		final JToolBar jTtoolBarDetalleEstadoDetalleOrdenCompra=jTtoolBarDetalleAuxiliarEstadoDetalleOrdenCompra;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoDetalleOrdenCompra;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoDetalleOrdenCompra;
			processRunnable.jTableDatos=jTableDatosEstadoDetalleOrdenCompra;
			processRunnable.jPanelCampos=jPanelCamposEstadoDetalleOrdenCompra;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoDetalleOrdenCompra;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoDetalleOrdenCompra;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoDetalleOrdenCompra;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoDetalleOrdenCompra;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoDetalleOrdenCompra;
			processRunnable.jTtoolBar=jTtoolBarEstadoDetalleOrdenCompra;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoDetalleOrdenCompra;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoDetalleOrdenCompra ,jPanelParametrosReportesEstadoDetalleOrdenCompra, jTableDatosEstadoDetalleOrdenCompra,/*jScrollPanelDatosEstadoDetalleOrdenCompra,*/jPanelCamposEstadoDetalleOrdenCompra,jPanelPaginacionEstadoDetalleOrdenCompra, /*jScrollPanelDatosEdicionEstadoDetalleOrdenCompra,*/ jPanelAccionesEstadoDetalleOrdenCompra,jPanelAccionesFormularioEstadoDetalleOrdenCompra,jmenuBarEstadoDetalleOrdenCompra,jmenuBarDetalleEstadoDetalleOrdenCompra,jTtoolBarEstadoDetalleOrdenCompra,jTtoolBarDetalleEstadoDetalleOrdenCompra));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoDetalleOrdenCompra(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoDetalleOrdenCompra(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoDetalleOrdenCompra(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoDetalleOrdenCompra(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoDetalleOrdenCompra,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoDetalleOrdenCompra,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoDetalleOrdenCompra(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoDetalleOrdenCompra,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoDetalleOrdenCompra,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadodetalleordencompraConstantesFunciones.getsFinalQueryEstadoDetalleOrdenCompra();
		String  finalQueryPaginacionTodos=this.estadodetalleordencompraConstantesFunciones.getsFinalQueryEstadoDetalleOrdenCompra();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoDetalleOrdenCompraConstantesFunciones.getArrayColumnasGlobalesNoEstadoDetalleOrdenCompra(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoDetalleOrdenCompraConstantesFunciones.getArrayColumnasGlobalesEstadoDetalleOrdenCompra(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoDetalleOrdenCompraConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadodetalleordencomprasEliminados= new ArrayList<EstadoDetalleOrdenCompra>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoDetalleOrdenCompra();
		
				///*EstadoDetalleOrdenCompraSessionBean*/this.estadodetalleordencompraSessionBean=new EstadoDetalleOrdenCompraSessionBean();
			
			if(this.estadodetalleordencompraSessionBean==null) {
				this.estadodetalleordencompraSessionBean=new EstadoDetalleOrdenCompraSessionBean();
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
					this.iNumeroPaginacion=EstadoDetalleOrdenCompraConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoDetalleOrdenCompraConstantesFunciones.getClassesForeignKeysOfEstadoDetalleOrdenCompra(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadodetalleordencompra."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadodetalleordencomprasAux= new ArrayList<EstadoDetalleOrdenCompra>();
			
				
			estadodetalleordencompraLogic.setDatosCliente(this.datosCliente);
			estadodetalleordencompraLogic.setDatosDeep(this.datosDeep);
			estadodetalleordencompraLogic.setIsConDeep(true);
			
			
			estadodetalleordencompraLogic.getEstadoDetalleOrdenCompraDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadodetalleordencompraLogic.getTodosEstadoDetalleOrdenCompras(finalQueryGlobal,pagination);
					
					//estadodetalleordencompraLogic.getTodosEstadoDetalleOrdenComprasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras()==null|| estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadodetalleordencomprasAux= new ArrayList<EstadoDetalleOrdenCompra>();
							estadodetalleordencomprasAux.addAll(estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadodetalleordencomprasAux= new ArrayList<EstadoDetalleOrdenCompra>();
							estadodetalleordencomprasAux.addAll(estadodetalleordencompras);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadodetalleordencompraLogic.getTodosEstadoDetalleOrdenCompras(finalQueryGlobal+"",this.pagination);												
							
							//estadodetalleordencompraLogic.getTodosEstadoDetalleOrdenComprasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoDetalleOrdenCompras("Todos",estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadodetalleordencompraLogic.setEstadoDetalleOrdenCompras(new ArrayList<EstadoDetalleOrdenCompra>());					
							estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().addAll(estadodetalleordencomprasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadodetalleordencompras=new ArrayList<EstadoDetalleOrdenCompra>();
							estadodetalleordencompras.addAll(estadodetalleordencomprasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoDetalleOrdenCompra=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoDetalleOrdenCompra=this.idActual;
				
				} else if(this.idEstadoDetalleOrdenCompraActual!=null && this.idEstadoDetalleOrdenCompraActual!=0L) {
					idEstadoDetalleOrdenCompra=idEstadoDetalleOrdenCompraActual;
				}
				
					
				this.sDetalleReporte=EstadoDetalleOrdenCompraConstantesFunciones.getDetalleIndicePorId(idEstadoDetalleOrdenCompra);
				
				this.estadodetalleordencompras=new ArrayList<EstadoDetalleOrdenCompra>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadodetalleordencompraLogic.getEntity(idEstadoDetalleOrdenCompra);
					
					//estadodetalleordencompraLogic.getEntityWithConnection(idEstadoDetalleOrdenCompra);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadodetalleordencompraLogic.setEstadoDetalleOrdenCompras(new ArrayList<EstadoDetalleOrdenCompra>());
					estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().add(estadodetalleordencompraLogic.getEstadoDetalleOrdenCompra());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadodetalleordencompras=new ArrayList<EstadoDetalleOrdenCompra>();
					this.estadodetalleordencompras.add(estadodetalleordencompra);
				}
				
				if(estadodetalleordencompraLogic.getEstadoDetalleOrdenCompra()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoDetalleOrdenCompra();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoDetalleOrdenCompra();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadodetalleordencompras.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadodetalleordencompras.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoDetalleOrdenCompra estadodetalleordencompra) {
		Boolean permite=true;
		
		if(this.estadodetalleordencompra.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoDetalleOrdenCompraConstantesFunciones.getOrderByListaEstadoDetalleOrdenCompra();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoDetalleOrdenCompraConstantesFunciones.getOrderByListaEstadoDetalleOrdenCompra();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleOrdenCompra estadodetalleordencompra:estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras()) {
				if(estadodetalleordencompra.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetalleordencompraTotales=estadodetalleordencompra;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleOrdenCompra estadodetalleordencompra:this.estadodetalleordencompras) {
				if(estadodetalleordencompra.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetalleordencompraTotales=estadodetalleordencompra;
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
			this.estadodetalleordencompraAux=new EstadoDetalleOrdenCompra();
			this.estadodetalleordencompraAux.setsType(Constantes2.S_TOTALES);
			this.estadodetalleordencompraAux.setIsNew(false);
			this.estadodetalleordencompraAux.setIsChanged(false);
			this.estadodetalleordencompraAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoDetalleOrdenCompraConstantesFunciones.TotalizarValoresFilaEstadoDetalleOrdenCompra(this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras(),this.estadodetalleordencompraAux);
				
				this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().add(this.estadodetalleordencompraAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoDetalleOrdenCompraConstantesFunciones.TotalizarValoresFilaEstadoDetalleOrdenCompra(this.estadodetalleordencompras,this.estadodetalleordencompraAux);
				
				this.estadodetalleordencompras.add(this.estadodetalleordencompraAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadodetalleordencompraTotales=new EstadoDetalleOrdenCompra();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().remove(estadodetalleordencompraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadodetalleordencompras.remove(estadodetalleordencompraTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadodetalleordencompraTotales=new EstadoDetalleOrdenCompra();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleOrdenCompra estadodetalleordencompra:estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras()) {
				if(estadodetalleordencompra.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetalleordencompraTotales=estadodetalleordencompra;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoDetalleOrdenCompraConstantesFunciones.TotalizarValoresFilaEstadoDetalleOrdenCompra(this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras(),estadodetalleordencompraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleOrdenCompra estadodetalleordencompra:this.estadodetalleordencompras) {
				if(estadodetalleordencompra.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetalleordencompraTotales=estadodetalleordencompra;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoDetalleOrdenCompraConstantesFunciones.TotalizarValoresFilaEstadoDetalleOrdenCompra(this.estadodetalleordencompras,estadodetalleordencompraTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosEstadoDetalleOrdenCompra() {
		this.isPermisoTodoEstadoDetalleOrdenCompra=false;
		this.isPermisoNuevoEstadoDetalleOrdenCompra=false;
		this.isPermisoActualizarEstadoDetalleOrdenCompra=false;
		this.isPermisoActualizarOriginalEstadoDetalleOrdenCompra=false;
		this.isPermisoEliminarEstadoDetalleOrdenCompra=false;
		this.isPermisoGuardarCambiosEstadoDetalleOrdenCompra=false;
		this.isPermisoConsultaEstadoDetalleOrdenCompra=false;
		this.isPermisoBusquedaEstadoDetalleOrdenCompra=false;
		this.isPermisoReporteEstadoDetalleOrdenCompra=false;		
		this.isPermisoOrdenEstadoDetalleOrdenCompra=false;		
		this.isPermisoPaginacionMedioEstadoDetalleOrdenCompra=false;		
		this.isPermisoPaginacionAltoEstadoDetalleOrdenCompra=false;
		this.isPermisoPaginacionTodoEstadoDetalleOrdenCompra=false;
		this.isPermisoCopiarEstadoDetalleOrdenCompra=false;		
		this.isPermisoVerFormEstadoDetalleOrdenCompra=false;		
		this.isPermisoDuplicarEstadoDetalleOrdenCompra=false;		
		this.isPermisoOrdenEstadoDetalleOrdenCompra=false;		
	}
	
	public void setPermisosUsuarioEstadoDetalleOrdenCompra(Boolean isPermiso) {
		this.isPermisoTodoEstadoDetalleOrdenCompra=isPermiso;
		this.isPermisoNuevoEstadoDetalleOrdenCompra=isPermiso;
		this.isPermisoActualizarEstadoDetalleOrdenCompra=isPermiso;
		this.isPermisoActualizarOriginalEstadoDetalleOrdenCompra=isPermiso;
		this.isPermisoEliminarEstadoDetalleOrdenCompra=isPermiso;
		this.isPermisoGuardarCambiosEstadoDetalleOrdenCompra=isPermiso;
		this.isPermisoConsultaEstadoDetalleOrdenCompra=isPermiso;
		this.isPermisoBusquedaEstadoDetalleOrdenCompra=isPermiso;
		this.isPermisoReporteEstadoDetalleOrdenCompra=isPermiso;
		this.isPermisoOrdenEstadoDetalleOrdenCompra=isPermiso;		
		this.isPermisoPaginacionMedioEstadoDetalleOrdenCompra=isPermiso;		
		this.isPermisoPaginacionAltoEstadoDetalleOrdenCompra=isPermiso;		
		this.isPermisoPaginacionTodoEstadoDetalleOrdenCompra=isPermiso;		
		this.isPermisoCopiarEstadoDetalleOrdenCompra=isPermiso;		
		this.isPermisoVerFormEstadoDetalleOrdenCompra=isPermiso;		
		this.isPermisoDuplicarEstadoDetalleOrdenCompra=isPermiso;
		this.isPermisoOrdenEstadoDetalleOrdenCompra=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoDetalleOrdenCompra(Boolean isPermiso) {
		//this.isPermisoTodoEstadoDetalleOrdenCompra=isPermiso;
		this.isPermisoNuevoEstadoDetalleOrdenCompra=isPermiso;
		this.isPermisoActualizarEstadoDetalleOrdenCompra=isPermiso;
		this.isPermisoActualizarOriginalEstadoDetalleOrdenCompra=isPermiso;
		this.isPermisoEliminarEstadoDetalleOrdenCompra=isPermiso;
		this.isPermisoGuardarCambiosEstadoDetalleOrdenCompra=isPermiso;
		//this.isPermisoConsultaEstadoDetalleOrdenCompra=isPermiso;
		//this.isPermisoBusquedaEstadoDetalleOrdenCompra=isPermiso;
		//this.isPermisoReporteEstadoDetalleOrdenCompra=isPermiso;
		//this.isPermisoOrdenEstadoDetalleOrdenCompra=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoDetalleOrdenCompra=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoDetalleOrdenCompra=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoDetalleOrdenCompra=isPermiso;		
		//this.isPermisoCopiarEstadoDetalleOrdenCompra=isPermiso;		
		//this.isPermisoDuplicarEstadoDetalleOrdenCompra=isPermiso;
		//this.isPermisoOrdenEstadoDetalleOrdenCompra=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoDetalleOrdenCompraClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleOrdenCompraConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoDetalleOrdenCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleOrdenCompra=false;
		this.isTienePermisosDetalleOrdenCompra=this.verificarGetPermisosUsuarioOpcionEstadoDetalleOrdenCompraClaseRelacionada(this.opcionsRelacionadas,DetalleOrdenCompraConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoDetalleOrdenCompra(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoDetalleOrdenCompraClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleOrdenCompra=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoDetalleOrdenCompraClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoDetalleOrdenCompraClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoDetalleOrdenCompraClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleOrdenCompra && this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null && this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTabbedPaneRelacionesEstadoDetalleOrdenCompra.remove(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoDetalleOrdenCompra() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoDetalleOrdenCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoDetalleOrdenCompraConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoDetalleOrdenCompra=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoDetalleOrdenCompra=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoDetalleOrdenCompra=this.isPermisoActualizarEstadoDetalleOrdenCompra;
			this.isPermisoEliminarEstadoDetalleOrdenCompra=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoDetalleOrdenCompra=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoDetalleOrdenCompra=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoDetalleOrdenCompra=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoDetalleOrdenCompra=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoDetalleOrdenCompra=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoDetalleOrdenCompra=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoDetalleOrdenCompra=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoDetalleOrdenCompra=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoDetalleOrdenCompra=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoDetalleOrdenCompra=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoDetalleOrdenCompra=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoDetalleOrdenCompra=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoDetalleOrdenCompra=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoDetalleOrdenCompra.setToolTipText(this.jTableDatosEstadoDetalleOrdenCompra.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoDetalleOrdenCompra(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoDetalleOrdenCompra(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoDetalleOrdenCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoDetalleOrdenCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoDetalleOrdenCompra() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleOrdenCompra && this.estadodetalleordencompraConstantesFunciones.mostrarDetalleOrdenCompraEstadoDetalleOrdenCompra && !EstadoDetalleOrdenCompraConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Orden Compra");
			reporte.setsDescripcion("Detalle Orden Compra");
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
	
		
	public void inicializarCombosForeignKeyEstadoDetalleOrdenCompraListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoDetalleOrdenCompraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoDetalleOrdenCompraJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoDetalleOrdenCompraListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoDetalleOrdenCompraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoDetalleOrdenCompra()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoDetalleOrdenCompra()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoDetalleOrdenCompra(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoDetalleOrdenCompra()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoDetalleOrdenCompra();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleOrdenCompra(EstadoDetalleOrdenCompra estadodetalleordencompra)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoDetalleOrdenCompra(EstadoDetalleOrdenCompra estadodetalleordencompra,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoDetalleOrdenCompra()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoDetalleOrdenCompra()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoDetalleOrdenCompra()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoDetalleOrdenCompra()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoDetalleOrdenCompra()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoDetalleOrdenCompra()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoDetalleOrdenCompra(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoDetalleOrdenCompra()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoDetalleOrdenCompraBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoDetalleOrdenCompraBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoDetalleOrdenCompraBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadodetalleordencompraSessionBean=new EstadoDetalleOrdenCompraSessionBean(); 
		this.estadodetalleordencompraConstantesFunciones=new EstadoDetalleOrdenCompraConstantesFunciones(); 
		this.estadodetalleordencompraBean=new EstadoDetalleOrdenCompra();//(this.estadodetalleordencompraConstantesFunciones); 		
		this.estadodetalleordencompraReturnGeneral=new EstadoDetalleOrdenCompraParameterReturnGeneral(); 
		
		this.estadodetalleordencompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadodetalleordencompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoDetalleOrdenCompraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoDetalleOrdenCompraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoDetalleOrdenCompraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoDetalleOrdenCompra(true);
			
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
			
			this.estadodetalleordencompraConstantesFunciones=new EstadoDetalleOrdenCompraConstantesFunciones(); 
			this.estadodetalleordencompraBean=new EstadoDetalleOrdenCompra();//this.estadodetalleordencompraConstantesFunciones); 			
			this.estadodetalleordencompraReturnGeneral=new EstadoDetalleOrdenCompraParameterReturnGeneral(); 
		
			EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Detalle Orden Compra Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadodetalleordencompra=new EstadoDetalleOrdenCompra();
			this.estadodetalleordencompras = new ArrayList<EstadoDetalleOrdenCompra>();
			this.estadodetalleordencomprasAux = new ArrayList<EstadoDetalleOrdenCompra>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic=new EstadoDetalleOrdenCompraLogic();
				this.estadodetalleordencompraLogic.getNewConnexionToDeep("");
			}
			
			//this.estadodetalleordencompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadodetalleordencompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra);	
					}
					
					if(this.jInternalFrameImportacionEstadoDetalleOrdenCompra!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoDetalleOrdenCompra);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoDetalleOrdenCompra!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoDetalleOrdenCompra);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra);
				this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.setVisible(false);
				this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra);
					this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoDetalleOrdenCompra!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoDetalleOrdenCompra);
					this.jInternalFrameImportacionEstadoDetalleOrdenCompra.setVisible(false);
					this.jInternalFrameImportacionEstadoDetalleOrdenCompra.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoDetalleOrdenCompra!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoDetalleOrdenCompra);
					this.jInternalFrameOrderByEstadoDetalleOrdenCompra.setVisible(false);
					this.jInternalFrameOrderByEstadoDetalleOrdenCompra.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoDetalleOrdenCompraActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoDetalleOrdenCompraConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadodetalleordencompraReturnGeneral=new EstadoDetalleOrdenCompraParameterReturnGeneral();
			
			this.estadodetalleordencompraParameterGeneral=new EstadoDetalleOrdenCompraParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadodetalleordencompraLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoDetalleOrdenCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleOrdenCompraConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoDetalleOrdenCompraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado(),this.estadodetalleordencompraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoDetalleOrdenCompraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado(),this.estadodetalleordencompraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaDuplicarEstadoDetalleOrdenCompra=true;
			this.isVisibilidadCeldaCopiarEstadoDetalleOrdenCompra=true;
			this.isVisibilidadCeldaVerFormEstadoDetalleOrdenCompra=true;
			this.isVisibilidadCeldaOrdenEstadoDetalleOrdenCompra=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaModificarEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaGuardarEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleOrdenCompra=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoDetalleOrdenCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoDetalleOrdenCompra();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoDetalleOrdenCompra(false);
			
			this.setPermisosUsuarioEstadoDetalleOrdenCompra();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado() 
				|| (this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado() && this.estadodetalleordencompraSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoDetalleOrdenCompraClasesRelacionadas();
			}
			
			if(this.estadodetalleordencompraSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoDetalleOrdenCompraClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoDetalleOrdenCompraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoDetalleOrdenCompra();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoDetalleOrdenCompra();
			}
			
			if(!this.isPermisoBusquedaEstadoDetalleOrdenCompra) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoDetalleOrdenCompra,this.isPermisoPaginacionMedioEstadoDetalleOrdenCompra,this.isPermisoPaginacionTodoEstadoDetalleOrdenCompra);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoDetalleOrdenCompraConstantesFunciones.getTiposSeleccionarEstadoDetalleOrdenCompra());
				
				this.tiposColumnasSelect=EstadoDetalleOrdenCompraConstantesFunciones.getTiposSeleccionarEstadoDetalleOrdenCompra(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoDetalleOrdenCompra();				
				//this.tiposRelacionesSelect=EstadoDetalleOrdenCompraConstantesFunciones.getTiposRelacionesEstadoDetalleOrdenCompra(true);
				
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
			//if(!this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoDetalleOrdenCompra();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoDetalleOrdenCompra(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoDetalleOrdenCompra(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetalleOrdenCompra() ;
			
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
			
			
			this.detalleordencompraLogic=new DetalleOrdenCompraLogic(); 
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
				estadodetalleordencompraImplementable= (EstadoDetalleOrdenCompraImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoDetalleOrdenCompraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadodetalleordencompraImplementableHome= (EstadoDetalleOrdenCompraImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoDetalleOrdenCompraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadodetalleordencompras= new ArrayList<EstadoDetalleOrdenCompra>();
			this.estadodetalleordencomprasEliminados= new ArrayList<EstadoDetalleOrdenCompra>();
						
			this.isEsNuevoEstadoDetalleOrdenCompra=false;
			this.esParaAccionDesdeFormularioEstadoDetalleOrdenCompra=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoDetalleOrdenCompra(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoDetalleOrdenCompra();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoDetalleOrdenCompraConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoDetalleOrdenCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoDetalleOrdenCompra(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoDetalleOrdenCompra();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoDetalleOrdenCompra();
			}
			
			EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoDetalleOrdenCompra(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoDetalleOrdenCompra: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoDetalleOrdenCompra() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoDetalleOrdenCompra")) {
				iIndex=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTabbedPaneRelacionesEstadoDetalleOrdenCompra.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTabbedPaneRelacionesEstadoDetalleOrdenCompra.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Orden Compras")) {
					if(!DetalleOrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoDetalleOrdenCompra();

						this.cargarParteTabPanelRelacionadaDetalleOrdenCompra(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoDetalleOrdenCompra();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleOrdenCompra(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.cargarSessionConBeanSwingJInternalFrameDetalleOrdenCompra(false,true,iIndex);
		this.jButtonDetalleOrdenCompraActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleOrdenCompra();

		//this.jTabbedPaneRelacionesEstadoDetalleOrdenCompra.updateUI();
		//this.jTabbedPaneRelacionesEstadoDetalleOrdenCompra.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoDetalleOrdenCompra.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleOrdenCompra")) {
				int row=this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRow();
				jButtonDetalleOrdenCompraActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Orden Compra")) {

					if(this.isTienePermisosDetalleOrdenCompra && this.estadodetalleordencompraConstantesFunciones.mostrarDetalleOrdenCompraEstadoDetalleOrdenCompra && !EstadoDetalleOrdenCompraConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Orden Compras"+"("+DetalleOrdenCompraConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Orden Compras");

						if(estadodetalleordencompraConstantesFunciones.resaltarDetalleOrdenCompraEstadoDetalleOrdenCompra!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadodetalleordencompraConstantesFunciones.resaltarDetalleOrdenCompraEstadoDetalleOrdenCompra);
						}

						jmenuItem.setEnabled(this.estadodetalleordencompraConstantesFunciones.activarDetalleOrdenCompraEstadoDetalleOrdenCompra);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleOrdenCompra"));

						

						this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jmenuDetalleEstadoDetalleOrdenCompra.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoDetalleOrdenCompra(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoDetalleOrdenCompra(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoDetalleOrdenCompra(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoDetalleOrdenCompraListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoDetalleOrdenCompra();
		
		this.cargarCombosFrameForeignKeyEstadoDetalleOrdenCompra();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoDetalleOrdenCompra();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoDetalleOrdenCompra();
		}
	}
	
	
	
	public void jButtonNuevoEstadoDetalleOrdenCompraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadodetalleordencompraSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
			
			
			if(jTableDatosEstadoDetalleOrdenCompra.getRowCount()>=1) {
				jTableDatosEstadoDetalleOrdenCompra.removeRowSelectionInterval(0, jTableDatosEstadoDetalleOrdenCompra.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoDetalleOrdenCompra=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoDetalleOrdenCompra(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoDetalleOrdenCompra(true);			
			//this.estadodetalleordencompra=new EstadoDetalleOrdenCompra();
			//this.estadodetalleordencompra.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoDetalleOrdenCompra(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetalleOrdenCompra() ;
			
			if(EstadoDetalleOrdenCompraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoDetalleOrdenCompra(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadodetalleordencompra);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleordencompra);				
			
			EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
			
			if(this.estadodetalleordencompraSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoDetalleOrdenCompra: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoDetalleOrdenCompraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoDetalleOrdenCompra> estadodetalleordencomprasSeleccionados=new ArrayList<EstadoDetalleOrdenCompra>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRows().length;			
			}
			
			estadodetalleordencomprasSeleccionados=this.getEstadoDetalleOrdenComprasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoDetalleOrdenCompra--;			
				//EstadoDetalleOrdenCompra estadodetalleordencompraAux= new EstadoDetalleOrdenCompra();			
				//estadodetalleordencompraAux.setId(this.iIdNuevoEstadoDetalleOrdenCompra);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoDetalleOrdenCompra estadodetalleordencompraOrigen=new EstadoDetalleOrdenCompra();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoDetalleOrdenCompra estadodetalleordencompraOrigen : estadodetalleordencomprasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadodetalleordencompraOrigen =(EstadoDetalleOrdenCompra) this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadodetalleordencompraOrigen =(EstadoDetalleOrdenCompra) this.estadodetalleordencompras.toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoDetalleOrdenCompra();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadodetalleordencompra.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoDetalleOrdenCompra(estadodetalleordencompraOrigen,this.estadodetalleordencompra,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleOrdenCompra(this.estadodetalleordencompra);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().add(this.estadodetalleordencompraAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadodetalleordencompras.add(this.estadodetalleordencompraAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoDetalleOrdenCompra(false);
				
				this.jTableDatosEstadoDetalleOrdenCompra.setRowSelectionInterval(this.getIndiceNuevoEstadoDetalleOrdenCompra(), this.getIndiceNuevoEstadoDetalleOrdenCompra());
				
				int iLastRow =  this.jTableDatosEstadoDetalleOrdenCompra.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoDetalleOrdenCompra.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoDetalleOrdenCompra.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoDetalleOrdenCompra(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoDetalleOrdenCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoDetalleOrdenCompra> estadodetalleordencomprasSeleccionados=new ArrayList<EstadoDetalleOrdenCompra>();									
		
			EstadoDetalleOrdenCompra estadodetalleordencompraOrigen=new EstadoDetalleOrdenCompra();
			EstadoDetalleOrdenCompra estadodetalleordencompraDestino=new EstadoDetalleOrdenCompra();
				
			estadodetalleordencomprasSeleccionados=this.getEstadoDetalleOrdenComprasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadodetalleordencomprasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetalleordencompraOrigen =(EstadoDetalleOrdenCompra) this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadodetalleordencompraOrigen =(EstadoDetalleOrdenCompra) this.estadodetalleordencompras.toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetalleordencompraDestino =(EstadoDetalleOrdenCompra) this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadodetalleordencompraDestino =(EstadoDetalleOrdenCompra) this.estadodetalleordencompras.toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadodetalleordencompraOrigen =estadodetalleordencomprasSeleccionados.get(0);
				estadodetalleordencompraDestino =estadodetalleordencomprasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoDetalleOrdenCompra(estadodetalleordencompraOrigen,estadodetalleordencompraDestino,true,false);
				
				estadodetalleordencompraDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadodetalleordencompraDestino,estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetalleordencompraDestino,estadodetalleordencompras);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoDetalleOrdenCompra(false);
				
				//this.jTableDatosEstadoDetalleOrdenCompra.setRowSelectionInterval(this.getIndiceNuevoEstadoDetalleOrdenCompra(), this.getIndiceNuevoEstadoDetalleOrdenCompra());
				
				int iLastRow =  this.jTableDatosEstadoDetalleOrdenCompra.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoDetalleOrdenCompra.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoDetalleOrdenCompra.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoDetalleOrdenCompra(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoDetalleOrdenCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoDetalleOrdenCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoDetalleOrdenCompra.isVisible();
			
			
			this.jPanelParametrosReportesEstadoDetalleOrdenCompra.setVisible(!isVisible);
			this.jPanelPaginacionEstadoDetalleOrdenCompra.setVisible(!isVisible);
			this.jPanelAccionesEstadoDetalleOrdenCompra.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoDetalleOrdenCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoDetalleOrdenCompra();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoDetalleOrdenCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoDetalleOrdenCompra();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoDetalleOrdenCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoDetalleOrdenCompra();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoDetalleOrdenCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoDetalleOrdenCompra();
			
			this.abrirFrameOrderByEstadoDetalleOrdenCompra();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoDetalleOrdenCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoDetalleOrdenCompra();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoDetalleOrdenCompra(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoDetalleOrdenCompra);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.setSize(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.iWidthFormulario,this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jContentPaneDetalleEstadoDetalleOrdenCompra.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTabbedPaneRelacionesEstadoDetalleOrdenCompra.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jContentPaneDetalleEstadoDetalleOrdenCompra.getWidth(),EstadoDetalleOrdenCompraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTabbedPaneRelacionesEstadoDetalleOrdenCompra.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jContentPaneDetalleEstadoDetalleOrdenCompra.getWidth(),EstadoDetalleOrdenCompraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTabbedPaneRelacionesEstadoDetalleOrdenCompra.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jContentPaneDetalleEstadoDetalleOrdenCompra.getWidth(),EstadoDetalleOrdenCompraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleOrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleOrdenCompra();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoDetalleOrdenCompra() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoDetalleOrdenCompra==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoDetalleOrdenCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetalleOrdenCompra,false,this);
				} else {
					this.jInternalFrameOrderByEstadoDetalleOrdenCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetalleOrdenCompra,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoDetalleOrdenCompra);
				this.jInternalFrameOrderByEstadoDetalleOrdenCompra.setVisible(false);
				this.jInternalFrameOrderByEstadoDetalleOrdenCompra.setSelected(false);
				
				this.jInternalFrameOrderByEstadoDetalleOrdenCompra.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoDetalleOrdenCompra"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoDetalleOrdenCompra();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoDetalleOrdenCompra() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoDetalleOrdenCompra==null) {
				
				this.jInternalFrameImportacionEstadoDetalleOrdenCompra=new ImportacionJInternalFrame(EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoDetalleOrdenCompra);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoDetalleOrdenCompra);
				this.jInternalFrameImportacionEstadoDetalleOrdenCompra.setVisible(false);
				this.jInternalFrameImportacionEstadoDetalleOrdenCompra.setSelected(false);


				this.jInternalFrameImportacionEstadoDetalleOrdenCompra.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoDetalleOrdenCompra"));
				this.jInternalFrameImportacionEstadoDetalleOrdenCompra.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoDetalleOrdenCompra"));
				this.jInternalFrameImportacionEstadoDetalleOrdenCompra.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoDetalleOrdenCompra"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoDetalleOrdenCompra() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra==null) {
				this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra=new ReporteDinamicoJInternalFrame(EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra);
				this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoDetalleOrdenCompra"));
				this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoDetalleOrdenCompra"));
				this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoDetalleOrdenCompra"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoDetalleOrdenCompra();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleOrdenCompra() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.jScrollPanelDatosDetalleOrdenCompra.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jContentPaneDetalleEstadoDetalleOrdenCompra.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.jScrollPanelDatosDetalleOrdenCompra.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.jScrollPanelDatosDetalleOrdenCompra.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.jScrollPanelDatosDetalleOrdenCompra.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoDetalleOrdenCompra() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoDetalleOrdenCompra);
			
	       	this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.dispose();
			//this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoDetalleOrdenCompra() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoDetalleOrdenCompra() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoDetalleOrdenCompra.setVisible(true);
	        this.jInternalFrameImportacionEstadoDetalleOrdenCompra.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoDetalleOrdenCompra() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoDetalleOrdenCompra.setVisible(true);
	        this.jInternalFrameOrderByEstadoDetalleOrdenCompra.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoDetalleOrdenCompra() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoDetalleOrdenCompra.setVisible(false);
	        this.jInternalFrameOrderByEstadoDetalleOrdenCompra.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoDetalleOrdenCompra() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoDetalleOrdenCompra() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoDetalleOrdenCompra.setVisible(false);
	        this.jInternalFrameImportacionEstadoDetalleOrdenCompra.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoDetalleOrdenCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoDetalleOrdenCompra(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoDetalleOrdenCompra(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoDetalleOrdenCompra(true);
			//this.isEsNuevoEstadoDetalleOrdenCompra=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompra =(EstadoDetalleOrdenCompra) this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadodetalleordencompra =(EstadoDetalleOrdenCompra) this.estadodetalleordencompras.toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoDetalleOrdenCompra("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoDetalleOrdenCompra(false) ;
			
			if(estadodetalleordencompraSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencompraSessionBean.getEsGuardarRelacionado() && DetalleOrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleOrdenCompraActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoDetalleOrdenCompraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoDetalleOrdenCompra(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetalleOrdenCompra(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoDetalleOrdenCompraActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleordencompra =(EstadoDetalleOrdenCompra) this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleordencompra =(EstadoDetalleOrdenCompra) this.estadodetalleordencompras.toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoDetalleOrdenCompra(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoDetalleOrdenCompra(true);
			//this.isEsNuevoEstadoDetalleOrdenCompra=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompra =(EstadoDetalleOrdenCompra) this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadodetalleordencompra =(EstadoDetalleOrdenCompra) this.estadodetalleordencompras.toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadodetalleordencompra.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoDetalleOrdenCompra("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoDetalleOrdenCompra(false) ;
			
			if(EstadoDetalleOrdenCompraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoDetalleOrdenCompra(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetalleOrdenCompra(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoDetalleOrdenCompraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoDetalleOrdenCompra(false);
			
			//if(!this.isEsNuevoEstadoDetalleOrdenCompra) {								
				int intSelectedRow = this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleordencompra =(EstadoDetalleOrdenCompra) this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadodetalleordencompra =(EstadoDetalleOrdenCompra) this.estadodetalleordencompras.toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoDetalleOrdenCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoDetalleOrdenCompra(this.estadodetalleordencompra,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleOrdenCompra(this.estadodetalleordencompra);
				
			}
			
			if(this.permiteMantenimiento(this.estadodetalleordencompra)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoDetalleOrdenCompra=true;
					this.inicializarActualizarBindingTablaEstadoDetalleOrdenCompra(false);
					this.isEsNuevoEstadoDetalleOrdenCompra=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoDetalleOrdenCompra=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoDetalleOrdenCompra=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoDetalleOrdenCompra(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoDetalleOrdenCompra(false);
				
				this.habilitarDeshabilitarControlesEstadoDetalleOrdenCompra(false);
			
												
				
				if(EstadoDetalleOrdenCompraJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoDetalleOrdenCompra();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoDetalleOrdenCompraActionPerformed(evt,estadodetalleordencompraSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoDetalleOrdenCompra(this.estadodetalleordencompra,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoDetalleOrdenCompra.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadodetalleordencompraSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadodetalleordencompra.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleOrdenCompra.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleOrdenCompra.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoDetalleOrdenCompraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompra =(EstadoDetalleOrdenCompra) this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				this.estadodetalleordencompra.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadodetalleordencompra =(EstadoDetalleOrdenCompra) this.estadodetalleordencompras.toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				this.estadodetalleordencompra.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadodetalleordencompra)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoDetalleOrdenCompraModel) this.jTableDatosEstadoDetalleOrdenCompra.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoDetalleOrdenCompra=true;
				this.inicializarActualizarBindingTablaEstadoDetalleOrdenCompra(false);
				this.isEsNuevoEstadoDetalleOrdenCompra=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoDetalleOrdenCompra(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoDetalleOrdenCompra(false);
				
				this.habilitarDeshabilitarControlesEstadoDetalleOrdenCompra(false);
				
				
				
				if(EstadoDetalleOrdenCompraJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoDetalleOrdenCompra();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoDetalleOrdenCompraActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoDetalleOrdenCompra.getRowCount()>=1) {
				jTableDatosEstadoDetalleOrdenCompra.removeRowSelectionInterval(0, jTableDatosEstadoDetalleOrdenCompra.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoDetalleOrdenCompra(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoDetalleOrdenCompra(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoDetalleOrdenCompra(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetalleOrdenCompra(false) ;
			
			this.isEsNuevoEstadoDetalleOrdenCompra=false;
			
			if(EstadoDetalleOrdenCompraJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoDetalleOrdenCompra();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoDetalleOrdenCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoDetalleOrdenCompra(false);
				
				//SI ES MANUAL
				if(EstadoDetalleOrdenCompraJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoDetalleOrdenCompra();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoDetalleOrdenCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoDetalleOrdenCompra--;			
			//EstadoDetalleOrdenCompra estadodetalleordencompraAux= new EstadoDetalleOrdenCompra();			
			//estadodetalleordencompraAux.setId(this.iIdNuevoEstadoDetalleOrdenCompra);
			
			if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoDetalleOrdenCompra();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleOrdenCompra(this.estadodetalleordencompra);
			
			this.estadodetalleordencompra.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().add(this.estadodetalleordencompraAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadodetalleordencompras.add(this.estadodetalleordencompraAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoDetalleOrdenCompra(false);
			
			this.jTableDatosEstadoDetalleOrdenCompra.setRowSelectionInterval(this.getIndiceNuevoEstadoDetalleOrdenCompra(), this.getIndiceNuevoEstadoDetalleOrdenCompra());
			
			int iLastRow =  this.jTableDatosEstadoDetalleOrdenCompra.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoDetalleOrdenCompra.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoDetalleOrdenCompra.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoDetalleOrdenCompra(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoDetalleOrdenCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoDetalleOrdenCompra(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetalleOrdenCompra(false);
			
			//SI ES MANUAL
			if(EstadoDetalleOrdenCompraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoDetalleOrdenCompra();
			}
			
			//this.abrirFrameTreeEstadoDetalleOrdenCompra();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoDetalleOrdenCompraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Detalle Orden CompraS ?", "MANTENIMIENTO DE Estado Detalle Orden Compra", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoDetalleOrdenCompra.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoDetalleOrdenCompra();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadodetalleordencompraReturnGeneral=estadodetalleordencompraLogic.procesarImportacionEstadoDetalleOrdenComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadodetalleordencompraParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoDetalleOrdenCompraReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoDetalleOrdenCompraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoDetalleOrdenCompra.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoDetalleOrdenCompra.setFileImportacion(this.jInternalFrameImportacionEstadoDetalleOrdenCompra.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoDetalleOrdenCompra.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoDetalleOrdenCompra.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoDetalleOrdenCompra.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoDetalleOrdenCompra.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoDetalleOrdenCompraActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoDetalleOrdenCompra> estadodetalleordencomprasSeleccionados=new ArrayList<EstadoDetalleOrdenCompra>();		

		estadodetalleordencomprasSeleccionados=this.getEstadoDetalleOrdenComprasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoDetalleOrdenCompraBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoDetalleOrdenCompraBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoDetalleOrdenCompras("Todos",estadodetalleordencomprasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Orden Compra",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoDetalleOrdenCompraConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoDetalleOrdenCompraConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoDetalleOrdenCompraConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoDetalleOrdenCompraConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoDetalleOrdenCompraConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoDetalleOrdenCompraConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoDetalleOrdenCompraConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoDetalleOrdenCompraConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoDetalleOrdenCompraActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoDetalleOrdenCompra> estadodetalleordencomprasSeleccionados=new ArrayList<EstadoDetalleOrdenCompra>();		
		
		estadodetalleordencomprasSeleccionados=this.getEstadoDetalleOrdenComprasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleordencompra";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoDetalleOrdenCompras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoDetalleOrdenCompraConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoDetalleOrdenCompraConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoDetalleOrdenCompra estadodetalleordencompra:estadodetalleordencomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadodetalleordencompra.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoDetalleOrdenCompraConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoDetalleOrdenCompraConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoDetalleOrdenCompra estadodetalleordencompra:estadodetalleordencomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadodetalleordencompra.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoDetalleOrdenCompra(row);				
			//	iRow++;
			//}				
			
			//for(EstadoDetalleOrdenCompra estadodetalleordencompraAux:estadodetalleordencomprasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoDetalleOrdenCompra(estadodetalleordencompraAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Orden Compra",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadodetalleordencompraLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetalleOrdenCompra(false);
			
			//SI ES MANUAL
			if(EstadoDetalleOrdenCompraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoDetalleOrdenCompra();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoDetalleOrdenCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetalleOrdenCompra(false);
			
			//SI ES MANUAL
			if(EstadoDetalleOrdenCompraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoDetalleOrdenCompra();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoDetalleOrdenCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetalleOrdenCompra(false);
			
			//SI ES MANUAL
			if(EstadoDetalleOrdenCompraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoDetalleOrdenCompra();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleordencompraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoDetalleOrdenCompra() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoDetalleOrdenCompra.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoDetalleOrdenCompra.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoDetalleOrdenCompra.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoDetalleOrdenCompra.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoDetalleOrdenCompra.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoDetalleOrdenCompra.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoDetalleOrdenCompra.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoDetalleOrdenCompra(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoDetalleOrdenCompra(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoDetalleOrdenCompra(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoDetalleOrdenCompra(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoDetalleOrdenCompra(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoDetalleOrdenCompra(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetalleOrdenCompra(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoDetalleOrdenCompra(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoDetalleOrdenCompraJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoDetalleOrdenCompraJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoDetalleOrdenCompra() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoDetalleOrdenCompra();
		
		this.inicializarActualizarBindingBotonesManualEstadoDetalleOrdenCompra(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoDetalleOrdenCompra();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetalleOrdenCompra() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoDetalleOrdenCompra(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoDetalleOrdenCompra(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoDetalleOrdenCompra.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoDetalleOrdenCompra.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoDetalleOrdenCompra.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jCheckBoxPostAccionNuevoEstadoDetalleOrdenCompra.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jCheckBoxPostAccionSinCerrarEstadoDetalleOrdenCompra.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jCheckBoxPostAccionSinMensajeEstadoDetalleOrdenCompra.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoDetalleOrdenCompra.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoDetalleOrdenCompra.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoDetalleOrdenCompra.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) {
				this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jCheckBoxPostAccionNuevoEstadoDetalleOrdenCompra.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jCheckBoxPostAccionSinCerrarEstadoDetalleOrdenCompra.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jCheckBoxPostAccionSinMensajeEstadoDetalleOrdenCompra.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoDetalleOrdenCompra.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoDetalleOrdenCompra.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoDetalleOrdenCompra.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoDetalleOrdenCompra.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoDetalleOrdenCompra.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoDetalleOrdenCompra.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoDetalleOrdenCompra.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoDetalleOrdenCompra.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoDetalleOrdenCompra(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoDetalleOrdenCompraJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoDetalleOrdenCompra(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetalleOrdenCompra() throws Exception {
		try	{
			if(EstadoDetalleOrdenCompraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoDetalleOrdenCompra();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoDetalleOrdenCompra() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoDetalleOrdenCompra() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoDetalleOrdenCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoDetalleOrdenCompra.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoDetalleOrdenCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoDetalleOrdenCompra.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoDetalleOrdenCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoDetalleOrdenCompra.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoDetalleOrdenCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoDetalleOrdenCompra.addItem(reporte);
			}
			
			
			if(!this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoDetalleOrdenCompra.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoDetalleOrdenCompra.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoDetalleOrdenCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoDetalleOrdenCompra.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoDetalleOrdenCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoDetalleOrdenCompra.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoDetalleOrdenCompra.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoDetalleOrdenCompra();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoDetalleOrdenCompra() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra!=null) {
				this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra!=null) {
				this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoDetalleOrdenCompra()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoDetalleOrdenCompra(Boolean esInicializar) throws Exception {				
		if(EstadoDetalleOrdenCompraJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoDetalleOrdenCompra();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoDetalleOrdenCompra() throws Exception {
		this.inicializarActualizarBindingTablaEstadoDetalleOrdenCompra(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoDetalleOrdenCompra() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoDetalleOrdenCompra.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoDetalleOrdenCompra.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoDetalleOrdenCompra.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoDetalleOrdenCompraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoDetalleOrdenCompra.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoDetalleOrdenCompra.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoDetalleOrdenCompraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoDetalleOrdenCompraOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleOrdenCompraOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoDetalleOrdenCompraPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoDetalleOrdenCompra.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoDetalleOrdenCompra.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoDetalleOrdenCompraPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoDetalleOrdenCompra.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoDetalleOrdenCompra(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadodetalleordencompras.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoDetalleOrdenCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoDetalleOrdenCompra.setModel(new EstadoDetalleOrdenCompraModel(this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoDetalleOrdenCompra.setModel(new EstadoDetalleOrdenCompraModel(this.estadodetalleordencompras,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoDetalleOrdenCompra!=null && this.jInternalFrameOrderByEstadoDetalleOrdenCompra.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoDetalleOrdenCompra();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoDetalleOrdenCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleOrdenCompra,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoDetalleOrdenCompraPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO,estadodetalleordencompraConstantesFunciones.resaltarSeleccionarEstadoDetalleOrdenCompra,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoDetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO,estadodetalleordencompraConstantesFunciones.resaltarSeleccionarEstadoDetalleOrdenCompra,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoDetalleOrdenCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleOrdenCompra,EstadoDetalleOrdenCompraConstantesFunciones.LABEL_ID));

		if(this.estadodetalleordencompraConstantesFunciones.mostraridEstadoDetalleOrdenCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoDetalleOrdenCompraConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadodetalleordencompraConstantesFunciones.resaltaridEstadoDetalleOrdenCompra,this.estadodetalleordencompraConstantesFunciones.activaridEstadoDetalleOrdenCompra,this,true,"idEstadoDetalleOrdenCompra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadodetalleordencompraConstantesFunciones.resaltaridEstadoDetalleOrdenCompra,this.estadodetalleordencompraConstantesFunciones.activaridEstadoDetalleOrdenCompra,this,true,"idEstadoDetalleOrdenCompra","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoDetalleOrdenCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleOrdenCompra,EstadoDetalleOrdenCompraConstantesFunciones.LABEL_CODIGO));

		if(this.estadodetalleordencompraConstantesFunciones.mostrarcodigoEstadoDetalleOrdenCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoDetalleOrdenCompraConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadodetalleordencompraConstantesFunciones.resaltarcodigoEstadoDetalleOrdenCompra,this.estadodetalleordencompraConstantesFunciones.activarcodigoEstadoDetalleOrdenCompra,this,true,"codigoEstadoDetalleOrdenCompra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadodetalleordencompraConstantesFunciones.resaltarcodigoEstadoDetalleOrdenCompra,this.estadodetalleordencompraConstantesFunciones.activarcodigoEstadoDetalleOrdenCompra,this,true,"codigoEstadoDetalleOrdenCompra","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoDetalleOrdenCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoDetalleOrdenCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleOrdenCompra,EstadoDetalleOrdenCompraConstantesFunciones.LABEL_NOMBRE));

		if(this.estadodetalleordencompraConstantesFunciones.mostrarnombreEstadoDetalleOrdenCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoDetalleOrdenCompraConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadodetalleordencompraConstantesFunciones.resaltarnombreEstadoDetalleOrdenCompra,this.estadodetalleordencompraConstantesFunciones.activarnombreEstadoDetalleOrdenCompra,this,true,"nombreEstadoDetalleOrdenCompra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadodetalleordencompraConstantesFunciones.resaltarnombreEstadoDetalleOrdenCompra,this.estadodetalleordencompraConstantesFunciones.activarnombreEstadoDetalleOrdenCompra,this,true,"nombreEstadoDetalleOrdenCompra","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoDetalleOrdenCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleOrdenCompra && this.estadodetalleordencompraConstantesFunciones.mostrarDetalleOrdenCompraEstadoDetalleOrdenCompra && !EstadoDetalleOrdenCompraConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Orden Compras");
				tableColumn.setHeaderValue("Detalle Orden Compras");
				tableColumn.setCellRenderer(new DetalleOrdenCompraTableCell(estadodetalleordencompraConstantesFunciones.resaltarDetalleOrdenCompraEstadoDetalleOrdenCompra,this,this.estadodetalleordencompraConstantesFunciones.activarDetalleOrdenCompraEstadoDetalleOrdenCompra));
				tableColumn.setCellEditor(new DetalleOrdenCompraTableCell(estadodetalleordencompraConstantesFunciones.resaltarDetalleOrdenCompraEstadoDetalleOrdenCompra,this,this.estadodetalleordencompraConstantesFunciones.activarDetalleOrdenCompraEstadoDetalleOrdenCompra));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoDetalleOrdenCompra.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoDetalleOrdenCompra.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoDetalleOrdenCompra.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoDetalleOrdenCompra && this.isPermisoGuardarCambiosEstadoDetalleOrdenCompra) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoDetalleOrdenCompra.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadodetalleordencompraSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoDetalleOrdenCompra.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoDetalleOrdenCompra.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoDetalleOrdenCompra && this.isPermisoGuardarCambiosEstadoDetalleOrdenCompra) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadodetalleordencompraSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoDetalleOrdenCompra && this.isPermisoGuardarCambiosEstadoDetalleOrdenCompra) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoDetalleOrdenCompra.moveColumn(this.jTableDatosEstadoDetalleOrdenCompra.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoDetalleOrdenCompra.moveColumn(this.jTableDatosEstadoDetalleOrdenCompra.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadodetalleordencompraSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoDetalleOrdenCompra.moveColumn(this.jTableDatosEstadoDetalleOrdenCompra.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoDetalleOrdenCompra.moveColumn(this.jTableDatosEstadoDetalleOrdenCompra.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoDetalleOrdenCompra.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoDetalleOrdenCompra.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoDetalleOrdenCompra,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoDetalleOrdenCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoDetalleOrdenCompra.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoDetalleOrdenCompra.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoDetalleOrdenCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoDetalleOrdenCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoDetalleOrdenCompra.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoDetalleOrdenCompra.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoDetalleOrdenCompra.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadodetalleordencompras.size()-1;
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
		//this.jTableDatosEstadoDetalleOrdenCompra.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoDetalleOrdenCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoDetalleOrdenCompra();
			
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
				
				//this.isEsNuevoEstadoDetalleOrdenCompra=false;
					
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
			
				if(this.estadodetalleordencompraSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoDetalleOrdenCompra.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleordencompra =(EstadoDetalleOrdenCompra) this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleordencompra =(EstadoDetalleOrdenCompra) this.estadodetalleordencompras.toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadodetalleordencompra.getsType().equals("DUPLICADO")
				   || this.estadodetalleordencompra.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoDetalleOrdenCompra=true;
				
				} else {
					this.isEsNuevoEstadoDetalleOrdenCompra=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
					if(this.estadodetalleordencompra.getId()>=0 && !this.estadodetalleordencompra.getIsNew()) {						
						this.isEsNuevoEstadoDetalleOrdenCompra=false;
						
					} else {
						this.isEsNuevoEstadoDetalleOrdenCompra=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoDetalleOrdenCompra(esRelaciones);						
				
				this.seleccionarEstadoDetalleOrdenCompra(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadodetalleordencompra.getId()<0) {
					this.isEsNuevoEstadoDetalleOrdenCompra=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoDetalleOrdenCompra(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoDetalleOrdenCompra(evt,rowIndex);
				}	
				
				if(this.estadodetalleordencompraSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoDetalleOrdenCompra: " + this.dDif); 
					}
				}								
				
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoDetalleOrdenCompra(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadodetalleordencompra)) {
					if(this.estadodetalleordencompra.getId()>0) {
						this.estadodetalleordencompra.setIsDeleted(true);
						
						this.estadodetalleordencomprasEliminados.add(this.estadodetalleordencompra);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().remove(this.estadodetalleordencompra);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadodetalleordencompras.remove(this.estadodetalleordencompra);				
					}
					
					
					((EstadoDetalleOrdenCompraModel) this.jTableDatosEstadoDetalleOrdenCompra.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoDetalleOrdenCompra(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoDetalleOrdenCompra(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoDetalleOrdenCompra) {
			
			if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoDetalleOrdenCompra.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleordencompra =(EstadoDetalleOrdenCompra) this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleordencompra =(EstadoDetalleOrdenCompra) this.estadodetalleordencompras.toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoDetalleOrdenCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoDetalleOrdenCompra(this.estadodetalleordencompra);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoDetalleOrdenCompra("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoDetalleOrdenCompra(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoDetalleOrdenCompra() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoDetalleOrdenCompra(EstadoDetalleOrdenCompra estadodetalleordencompra) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoDetalleOrdenCompra(estadodetalleordencompra,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoDetalleOrdenCompra(EstadoDetalleOrdenCompra estadodetalleordencompra,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoDetalleOrdenCompra(estadodetalleordencompra);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoDetalleOrdenCompra(estadodetalleordencompra,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleOrdenCompra(estadodetalleordencompra);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoDetalleOrdenCompra(EstadoDetalleOrdenCompra estadodetalleordencompra) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTextFieldidEstadoDetalleOrdenCompra.setText(estadodetalleordencompra.getId().toString());
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTextFieldcodigoEstadoDetalleOrdenCompra.setText(estadodetalleordencompra.getcodigo());
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTextAreanombreEstadoDetalleOrdenCompra.setText(estadodetalleordencompra.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoDetalleOrdenCompra estadodetalleordencompraLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadodetalleordencompraLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoDetalleOrdenCompra estadodetalleordencompraLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadodetalleordencompraLocal=this.estadodetalleordencompra;
			} else {
				estadodetalleordencompraLocal=this.estadodetalleordencompraAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadodetalleordencompraLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoDetalleOrdenCompra(estadodetalleordencompraLocal,true);
					
					if(estadodetalleordencompraSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadodetalleordencompraLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadodetalleordencompraLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoDetalleOrdenCompra(EstadoDetalleOrdenCompra estadodetalleordencompra,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoDetalleOrdenCompra(estadodetalleordencompra,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleOrdenCompra(estadodetalleordencompra);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoDetalleOrdenCompra(EstadoDetalleOrdenCompra estadodetalleordencompra,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoDetalleOrdenCompra(estadodetalleordencompra,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoDetalleOrdenCompra(EstadoDetalleOrdenCompra estadodetalleordencompra,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTextFieldidEstadoDetalleOrdenCompra.getText()==null || this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTextFieldidEstadoDetalleOrdenCompra.getText()=="" || this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTextFieldidEstadoDetalleOrdenCompra.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTextFieldidEstadoDetalleOrdenCompra.setText("0");
			}

			if(conColumnasBase) {estadodetalleordencompra.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTextFieldidEstadoDetalleOrdenCompra.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoDetalleOrdenCompraConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jLabelIdEstadoDetalleOrdenCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadodetalleordencompra.setcodigo(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTextFieldcodigoEstadoDetalleOrdenCompra.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoDetalleOrdenCompraConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jLabelcodigoEstadoDetalleOrdenCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadodetalleordencompra.setnombre(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTextAreanombreEstadoDetalleOrdenCompra.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoDetalleOrdenCompraConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jLabelnombreEstadoDetalleOrdenCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoDetalleOrdenCompra(EstadoDetalleOrdenCompra estadodetalleordencompraBean,EstadoDetalleOrdenCompra estadodetalleordencompra,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoDetalleOrdenCompra(EstadoDetalleOrdenCompra estadodetalleordencompraOrigen,EstadoDetalleOrdenCompra estadodetalleordencompra,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadodetalleordencompraOrigen.getId()!=null && !estadodetalleordencompraOrigen.getId().equals(0L))) {estadodetalleordencompra.setId(estadodetalleordencompraOrigen.getId());}}
			if(conDefault || (!conDefault && estadodetalleordencompraOrigen.getcodigo()!=null && !estadodetalleordencompraOrigen.getcodigo().equals(""))) {estadodetalleordencompra.setcodigo(estadodetalleordencompraOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadodetalleordencompraOrigen.getnombre()!=null && !estadodetalleordencompraOrigen.getnombre().equals(""))) {estadodetalleordencompra.setnombre(estadodetalleordencompraOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoDetalleOrdenCompra(EstadoDetalleOrdenCompra estadodetalleordencompra) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTextFieldidEstadoDetalleOrdenCompra.setText(estadodetalleordencompra.getId().toString());
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTextFieldcodigoEstadoDetalleOrdenCompra.setText(estadodetalleordencompra.getcodigo());
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTextAreanombreEstadoDetalleOrdenCompra.setText(estadodetalleordencompra.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoDetalleOrdenCompra(EstadoDetalleOrdenCompraBean estadodetalleordencompraBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTextFieldidEstadoDetalleOrdenCompra.setText(estadodetalleordencompraBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTextFieldcodigoEstadoDetalleOrdenCompra.setText(estadodetalleordencompraBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTextAreanombreEstadoDetalleOrdenCompra.setText(estadodetalleordencompraBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoDetalleOrdenCompra(EstadoDetalleOrdenCompraParameterReturnGeneral estadodetalleordencompraReturnGeneral,EstadoDetalleOrdenCompraBean estadodetalleordencompraBean,Boolean conDefault) throws Exception { 
		try {
			EstadoDetalleOrdenCompra estadodetalleordencompraLocal=new EstadoDetalleOrdenCompra();
			
			estadodetalleordencompraLocal=estadodetalleordencompraReturnGeneral.getEstadoDetalleOrdenCompra();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadodetalleordencompraLocal.getId()!=null && !estadodetalleordencompraLocal.getId().equals(0L))) {estadodetalleordencompraBean.setId(estadodetalleordencompraLocal.getId());}}
			if(conDefault || (!conDefault && estadodetalleordencompraLocal.getcodigo()!=null && !estadodetalleordencompraLocal.getcodigo().equals(""))) {estadodetalleordencompraBean.setcodigo(estadodetalleordencompraLocal.getcodigo());}
			if(conDefault || (!conDefault && estadodetalleordencompraLocal.getnombre()!=null && !estadodetalleordencompraLocal.getnombre().equals(""))) {estadodetalleordencompraBean.setnombre(estadodetalleordencompraLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoDetalleOrdenCompraGenerico(Long idEstadoDetalleOrdenCompraSeleccionado,JComboBox jComboBoxEstadoDetalleOrdenCompra,List<EstadoDetalleOrdenCompra> estadodetalleordencomprasLocal)throws Exception {
		try {
			EstadoDetalleOrdenCompra  estadodetalleordencompraTemp=null;

			for(EstadoDetalleOrdenCompra estadodetalleordencompraAux:estadodetalleordencomprasLocal) {
				if(estadodetalleordencompraAux.getId()!=null && estadodetalleordencompraAux.getId().equals(idEstadoDetalleOrdenCompraSeleccionado)) {
					estadodetalleordencompraTemp=estadodetalleordencompraAux;
					break;
				}
			}

			jComboBoxEstadoDetalleOrdenCompra.setSelectedItem(estadodetalleordencompraTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoDetalleOrdenCompraGenerico(JComboBox jComboBoxEstadoDetalleOrdenCompra,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoDetalleOrdenCompra.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoDetalleOrdenCompra.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoDetalleOrdenCompra.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoDetalleOrdenCompra.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoDetalleOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoDetalleOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetalleOrdenCompra")) {
			jButtonDetalleOrdenCompraActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadodetalleordencompra=(EstadoDetalleOrdenCompra) estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadodetalleordencompra =(EstadoDetalleOrdenCompra) estadodetalleordencompras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoDetalleOrdenCompra estadodetalleordencompraRow=new EstadoDetalleOrdenCompra();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadodetalleordencompraRow=(EstadoDetalleOrdenCompra) estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadodetalleordencompraRow=(EstadoDetalleOrdenCompra) estadodetalleordencompras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleOrdenCompraActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoDetalleOrdenCompra estadodetalleordencompra) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleordencompraLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetalleordencompra = (EstadoDetalleOrdenCompra)this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadodetalleordencompra = (EstadoDetalleOrdenCompra)this.estadodetalleordencompras.toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadodetalleordencompra!=null) {
						this.estadodetalleordencompra = estadodetalleordencompra;
					} else {
						this.estadodetalleordencompra = new EstadoDetalleOrdenCompra();
					}
				}

				if(this.isTienePermisosDetalleOrdenCompra && this.permiteMantenimiento(this.estadodetalleordencompra)) {
					DetalleOrdenCompraBeanSwingJInternalFrame detalleordencompraBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFramePopup=new DetalleOrdenCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleordencompraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFramePopup;
					} else {
						detalleordencompraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame;
					}

					List<EstadoDetalleOrdenCompra> estadodetalleordencompras=new ArrayList<EstadoDetalleOrdenCompra>();
					estadodetalleordencompras.add(this.estadodetalleordencompra);
					if(!esRelacionado) {
						//detalleordencompraBeanSwingJInternalFrame.detalleordencompraSessionBean.setConGuardarRelaciones(false);
						//detalleordencompraBeanSwingJInternalFrame.detalleordencompraSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleordencompraBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.cargarDetalleOrdenCompraBeanSwingJInternalFrame(estadodetalleordencompras,this.estadodetalleordencompra,detalleordencompraBeanSwingJInternalFrame,/*conInicializar,*/detalleordencompraBeanSwingJInternalFrame.detalleordencompraSessionBean.getConGuardarRelaciones(),detalleordencompraBeanSwingJInternalFrame.detalleordencompraSessionBean.getEsGuardarRelacionado());
					detalleordencompraBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleordencompraBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleOrdenCompra("no_relacionado");

						detalleordencompraBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleOrdenCompraConstantesFunciones.ITAMANIOFILATABLA + (DetalleOrdenCompraConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleordencompraBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoDetalleOrdenCompra=(TitledBorder)this.jScrollPanelDatosEstadoDetalleOrdenCompra.getBorder();
						TitledBorder titledBorderDetalleOrdenCompra=(TitledBorder)detalleordencompraBeanSwingJInternalFrame.jScrollPanelDatosDetalleOrdenCompra.getBorder();

						titledBorderDetalleOrdenCompra.setTitle(titledBorderEstadoDetalleOrdenCompra.getTitle() + " -> Detalle Orden Compra");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleordencompraBeanSwingJInternalFrame);
						}

						detalleordencompraBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleordencompraBeanSwingJInternalFrame);

						detalleordencompraBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadodetalleordencompraSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Orden Compra",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleordencompraLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleordencompraLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleordencompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoDetalleOrdenCompra(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleOrdenCompra && this.isPermisoNuevoEstadoDetalleOrdenCompra));			
			this.jButtonDuplicarEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaDuplicarEstadoDetalleOrdenCompra && this.isPermisoDuplicarEstadoDetalleOrdenCompra));			
			this.jButtonCopiarEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaCopiarEstadoDetalleOrdenCompra && this.isPermisoCopiarEstadoDetalleOrdenCompra));
			this.jButtonVerFormEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaVerFormEstadoDetalleOrdenCompra && this.isPermisoVerFormEstadoDetalleOrdenCompra));
			
			this.jButtonAbrirOrderByEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleOrdenCompra && this.isPermisoOrdenEstadoDetalleOrdenCompra));			
			
			this.jButtonNuevoRelacionesEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleOrdenCompra && this.isPermisoNuevoEstadoDetalleOrdenCompra));			
			this.jButtonNuevoGuardarCambiosEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleOrdenCompra && this.isPermisoNuevoEstadoDetalleOrdenCompra && this.isPermisoGuardarCambiosEstadoDetalleOrdenCompra));
			
			if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonModificarEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaModificarEstadoDetalleOrdenCompra && this.isPermisoActualizarEstadoDetalleOrdenCompra));	
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonActualizarEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaActualizarEstadoDetalleOrdenCompra && this.isPermisoActualizarEstadoDetalleOrdenCompra));	
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonEliminarEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaEliminarEstadoDetalleOrdenCompra && this.isPermisoEliminarEstadoDetalleOrdenCompra));
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonCancelarEstadoDetalleOrdenCompra.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleOrdenCompra);							
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonGuardarCambiosEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaGuardarEstadoDetalleOrdenCompra && this.isPermisoGuardarCambiosEstadoDetalleOrdenCompra));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoDetalleOrdenCompra && this.isPermisoGuardarCambiosEstadoDetalleOrdenCompra));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleOrdenCompra && this.isPermisoNuevoEstadoDetalleOrdenCompra));						
			this.jButtonDuplicarToolBarEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaDuplicarEstadoDetalleOrdenCompra && this.isPermisoDuplicarEstadoDetalleOrdenCompra));						
			this.jButtonCopiarToolBarEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaCopiarEstadoDetalleOrdenCompra && this.isPermisoCopiarEstadoDetalleOrdenCompra));			
			this.jButtonVerFormToolBarEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaVerFormEstadoDetalleOrdenCompra && this.isPermisoVerFormEstadoDetalleOrdenCompra));			
			this.jButtonAbrirOrderByToolBarEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleOrdenCompra && this.isPermisoOrdenEstadoDetalleOrdenCompra));
			this.jButtonNuevoRelacionesToolBarEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleOrdenCompra && this.isPermisoNuevoEstadoDetalleOrdenCompra));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleOrdenCompra && this.isPermisoNuevoEstadoDetalleOrdenCompra && this.isPermisoGuardarCambiosEstadoDetalleOrdenCompra));			
			
			if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonModificarToolBarEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaModificarEstadoDetalleOrdenCompra && this.isPermisoActualizarEstadoDetalleOrdenCompra));	
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonActualizarToolBarEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaActualizarEstadoDetalleOrdenCompra  && this.isPermisoActualizarEstadoDetalleOrdenCompra));	
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonEliminarToolBarEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaEliminarEstadoDetalleOrdenCompra && this.isPermisoEliminarEstadoDetalleOrdenCompra));
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonCancelarToolBarEstadoDetalleOrdenCompra.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleOrdenCompra);				
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonGuardarCambiosToolBarEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaGuardarEstadoDetalleOrdenCompra && this.isPermisoGuardarCambiosEstadoDetalleOrdenCompra));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoDetalleOrdenCompra && this.isPermisoGuardarCambiosEstadoDetalleOrdenCompra));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleOrdenCompra && this.isPermisoNuevoEstadoDetalleOrdenCompra));			
			this.jMenuItemDuplicarEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaDuplicarEstadoDetalleOrdenCompra && this.isPermisoDuplicarEstadoDetalleOrdenCompra));			
			this.jMenuItemCopiarEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaCopiarEstadoDetalleOrdenCompra && this.isPermisoCopiarEstadoDetalleOrdenCompra));			
			this.jMenuItemVerFormEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaVerFormEstadoDetalleOrdenCompra && this.isPermisoVerFormEstadoDetalleOrdenCompra));			
			this.jMenuItemAbrirOrderByEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleOrdenCompra && this.isPermisoOrdenEstadoDetalleOrdenCompra));			
			//this.jMenuItemMostrarOcultarEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleOrdenCompra && this.isPermisoOrdenEstadoDetalleOrdenCompra));
			this.jMenuItemDetalleAbrirOrderByEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleOrdenCompra && this.isPermisoOrdenEstadoDetalleOrdenCompra));			
			//this.jMenuItemDetalleMostrarOcultarEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleOrdenCompra && this.isPermisoOrdenEstadoDetalleOrdenCompra));			
			this.jMenuItemNuevoRelacionesEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleOrdenCompra && this.isPermisoNuevoEstadoDetalleOrdenCompra));			
			this.jMenuItemNuevoGuardarCambiosEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleOrdenCompra && this.isPermisoNuevoEstadoDetalleOrdenCompra && this.isPermisoGuardarCambiosEstadoDetalleOrdenCompra));									
			
			if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jMenuItemModificarEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaModificarEstadoDetalleOrdenCompra && this.isPermisoActualizarEstadoDetalleOrdenCompra));	
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jMenuItemActualizarEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaActualizarEstadoDetalleOrdenCompra && this.isPermisoActualizarEstadoDetalleOrdenCompra));	
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jMenuItemEliminarEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaEliminarEstadoDetalleOrdenCompra && this.isPermisoEliminarEstadoDetalleOrdenCompra));
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jMenuItemCancelarEstadoDetalleOrdenCompra.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleOrdenCompra);				
			}
			
			this.jMenuItemGuardarCambiosEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaGuardarEstadoDetalleOrdenCompra && this.isPermisoGuardarCambiosEstadoDetalleOrdenCompra));						
			this.jMenuItemGuardarCambiosTablaEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoDetalleOrdenCompra && this.isPermisoGuardarCambiosEstadoDetalleOrdenCompra));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoDetalleOrdenCompra=this.jButtonNuevoEstadoDetalleOrdenCompra.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoDetalleOrdenCompra=this.jButtonDuplicarEstadoDetalleOrdenCompra.isVisible();
			this.isVisibilidadCeldaCopiarEstadoDetalleOrdenCompra=this.jButtonCopiarEstadoDetalleOrdenCompra.isVisible();
			this.isVisibilidadCeldaVerFormEstadoDetalleOrdenCompra=this.jButtonVerFormEstadoDetalleOrdenCompra.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoDetalleOrdenCompra=this.jButtonAbrirOrderByEstadoDetalleOrdenCompra.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleOrdenCompra=this.jButtonNuevoRelacionesEstadoDetalleOrdenCompra.isVisible();
			this.isVisibilidadCeldaModificarEstadoDetalleOrdenCompra=this.jButtonModificarEstadoDetalleOrdenCompra.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) {
			this.isVisibilidadCeldaActualizarEstadoDetalleOrdenCompra=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonActualizarEstadoDetalleOrdenCompra.isVisible();
			this.isVisibilidadCeldaEliminarEstadoDetalleOrdenCompra=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonEliminarEstadoDetalleOrdenCompra.isVisible();
			this.isVisibilidadCeldaCancelarEstadoDetalleOrdenCompra=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonCancelarEstadoDetalleOrdenCompra.isVisible();
			this.isVisibilidadCeldaGuardarEstadoDetalleOrdenCompra=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonGuardarCambiosEstadoDetalleOrdenCompra.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleOrdenCompra=this.jButtonGuardarCambiosTablaEstadoDetalleOrdenCompra.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoDetalleOrdenCompra=this.jButtonNuevoToolBarEstadoDetalleOrdenCompra.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleOrdenCompra=this.jButtonNuevoRelacionesToolBarEstadoDetalleOrdenCompra.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) {
			this.isVisibilidadCeldaModificarEstadoDetalleOrdenCompra=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonModificarToolBarEstadoDetalleOrdenCompra.isVisible();
			this.isVisibilidadCeldaActualizarEstadoDetalleOrdenCompra=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonActualizarToolBarEstadoDetalleOrdenCompra.isVisible();
			this.isVisibilidadCeldaEliminarEstadoDetalleOrdenCompra=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonEliminarToolBarEstadoDetalleOrdenCompra.isVisible();
			this.isVisibilidadCeldaCancelarEstadoDetalleOrdenCompra=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonCancelarToolBarEstadoDetalleOrdenCompra.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoDetalleOrdenCompra=this.jButtonGuardarCambiosToolBarEstadoDetalleOrdenCompra.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleOrdenCompra=this.jButtonGuardarCambiosTablaToolBarEstadoDetalleOrdenCompra.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoDetalleOrdenCompra=this.jMenuItemNuevoEstadoDetalleOrdenCompra.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleOrdenCompra=this.jMenuItemNuevoRelacionesEstadoDetalleOrdenCompra.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) {
			this.isVisibilidadCeldaModificarEstadoDetalleOrdenCompra=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jMenuItemModificarEstadoDetalleOrdenCompra.isVisible();
			this.isVisibilidadCeldaActualizarEstadoDetalleOrdenCompra=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jMenuItemActualizarEstadoDetalleOrdenCompra.isVisible();
			this.isVisibilidadCeldaEliminarEstadoDetalleOrdenCompra=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jMenuItemEliminarEstadoDetalleOrdenCompra.isVisible();
			this.isVisibilidadCeldaCancelarEstadoDetalleOrdenCompra=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jMenuItemCancelarEstadoDetalleOrdenCompra.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoDetalleOrdenCompra=this.jMenuItemGuardarCambiosEstadoDetalleOrdenCompra.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleOrdenCompra=this.jMenuItemGuardarCambiosTablaEstadoDetalleOrdenCompra.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoDetalleOrdenCompra(Boolean esInicializar) {
		if(EstadoDetalleOrdenCompraJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadodetalleordencompraSessionBean.getConGuardarRelaciones()) {
				//if(this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoDetalleOrdenCompra();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoDetalleOrdenCompra(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoDetalleOrdenCompra() {
		this.jButtonNuevoEstadoDetalleOrdenCompra.setVisible(this.isPermisoNuevoEstadoDetalleOrdenCompra);			
		this.jButtonDuplicarEstadoDetalleOrdenCompra.setVisible(this.isPermisoDuplicarEstadoDetalleOrdenCompra);			
		this.jButtonCopiarEstadoDetalleOrdenCompra.setVisible(this.isPermisoCopiarEstadoDetalleOrdenCompra);			
		this.jButtonVerFormEstadoDetalleOrdenCompra.setVisible(this.isPermisoVerFormEstadoDetalleOrdenCompra);			
		
		this.jButtonAbrirOrderByEstadoDetalleOrdenCompra.setVisible(this.isPermisoOrdenEstadoDetalleOrdenCompra);					
		
		this.jButtonNuevoRelacionesEstadoDetalleOrdenCompra.setVisible(this.isPermisoNuevoEstadoDetalleOrdenCompra);			
		
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonModificarEstadoDetalleOrdenCompra.setVisible(this.isPermisoActualizarEstadoDetalleOrdenCompra);	
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonActualizarEstadoDetalleOrdenCompra.setVisible(this.isPermisoActualizarEstadoDetalleOrdenCompra);	
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonEliminarEstadoDetalleOrdenCompra.setVisible(this.isPermisoEliminarEstadoDetalleOrdenCompra);
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonCancelarEstadoDetalleOrdenCompra.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleOrdenCompra);						
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonGuardarCambiosEstadoDetalleOrdenCompra.setVisible(this.isPermisoGuardarCambiosEstadoDetalleOrdenCompra);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoDetalleOrdenCompra.setVisible(this.isPermisoActualizarEstadoDetalleOrdenCompra);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoDetalleOrdenCompra() {
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonModificarEstadoDetalleOrdenCompra.setVisible(this.isPermisoActualizarEstadoDetalleOrdenCompra);	
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonActualizarEstadoDetalleOrdenCompra.setVisible(this.isPermisoActualizarEstadoDetalleOrdenCompra);	
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonEliminarEstadoDetalleOrdenCompra.setVisible(this.isPermisoEliminarEstadoDetalleOrdenCompra);
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonCancelarEstadoDetalleOrdenCompra.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleOrdenCompra);							
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonGuardarCambiosEstadoDetalleOrdenCompra.setVisible((this.isVisibilidadCeldaGuardarEstadoDetalleOrdenCompra && this.isPermisoGuardarCambiosEstadoDetalleOrdenCompra));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoDetalleOrdenCompra() {
		if(EstadoDetalleOrdenCompraJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoDetalleOrdenCompra();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoDetalleOrdenCompra() {
	}
	
	public void jTableDatosEstadoDetalleOrdenCompraListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoDetalleOrdenCompra(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoDetalleOrdenCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleordencompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoDetalleOrdenCompra(this.getestadodetalleordencompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleOrdenCompra(this.estadodetalleordencompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetalleordencompra =(EstadoDetalleOrdenCompra) this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadodetalleordencompra =(EstadoDetalleOrdenCompra) this.estadodetalleordencompras.toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadodetalleordencompra==null) {
						this.estadodetalleordencompra = new EstadoDetalleOrdenCompra();
					}

					this.setVariablesFormularioToObjetoActualEstadoDetalleOrdenCompra(this.estadodetalleordencompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleOrdenCompra(this.estadodetalleordencompra);
				}

				if(this.estadodetalleordencompra.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadodetalleordencompra.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoDetalleOrdenCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleordencompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleordencompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleordencompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoDetalleOrdenCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleordencompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoDetalleOrdenCompra(this.getestadodetalleordencompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleOrdenCompra(this.estadodetalleordencompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetalleordencompra =(EstadoDetalleOrdenCompra) this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadodetalleordencompra =(EstadoDetalleOrdenCompra) this.estadodetalleordencompras.toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadodetalleordencompra==null) {
						this.estadodetalleordencompra = new EstadoDetalleOrdenCompra();
					}

					this.setVariablesFormularioToObjetoActualEstadoDetalleOrdenCompra(this.estadodetalleordencompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleOrdenCompra(this.estadodetalleordencompra);
				}

				if(this.estadodetalleordencompra.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadodetalleordencompra.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoDetalleOrdenCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleordencompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleordencompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleordencompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoDetalleOrdenCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleordencompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoDetalleOrdenCompra(this.getestadodetalleordencompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleOrdenCompra(this.estadodetalleordencompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetalleordencompra =(EstadoDetalleOrdenCompra) this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadodetalleordencompra =(EstadoDetalleOrdenCompra) this.estadodetalleordencompras.toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadodetalleordencompra==null) {
						this.estadodetalleordencompra = new EstadoDetalleOrdenCompra();
					}

					this.setVariablesFormularioToObjetoActualEstadoDetalleOrdenCompra(this.estadodetalleordencompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleOrdenCompra(this.estadodetalleordencompra);
				}

				if(this.estadodetalleordencompra.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadodetalleordencompra.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoDetalleOrdenCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleordencompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleordencompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleordencompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoDetalleOrdenCompra() {
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.dispose();
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra!=null) {
			this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.dispose();
			this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra=null;
		}
		
		if(this.jInternalFrameImportacionEstadoDetalleOrdenCompra!=null) {
			this.jInternalFrameImportacionEstadoDetalleOrdenCompra.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoDetalleOrdenCompra.dispose();
			this.jInternalFrameImportacionEstadoDetalleOrdenCompra=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoDetalleOrdenCompra();
			
			EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoDetalleOrdenCompra")) {
				jButtonNuevoEstadoDetalleOrdenCompraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoDetalleOrdenCompra")) {
				jButtonDuplicarEstadoDetalleOrdenCompraActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoDetalleOrdenCompra")) {
				jButtonCopiarEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoDetalleOrdenCompra")) {
				jButtonVerFormEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoDetalleOrdenCompra")) {
				jButtonNuevoEstadoDetalleOrdenCompraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoDetalleOrdenCompra")) {
				jButtonDuplicarEstadoDetalleOrdenCompraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoDetalleOrdenCompra")) {
				jButtonNuevoEstadoDetalleOrdenCompraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoDetalleOrdenCompra")) {
				jButtonDuplicarEstadoDetalleOrdenCompraActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoDetalleOrdenCompra")) {
				jButtonNuevoEstadoDetalleOrdenCompraActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoDetalleOrdenCompra")) {
				jButtonNuevoEstadoDetalleOrdenCompraActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoDetalleOrdenCompra")) {
				jButtonNuevoEstadoDetalleOrdenCompraActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoDetalleOrdenCompra")) {
				jButtonModificarEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoDetalleOrdenCompra")) {
				jButtonModificarEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoDetalleOrdenCompra")) {
				jButtonModificarEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoDetalleOrdenCompra")) {
				jButtonActualizarEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoDetalleOrdenCompra")) {
				jButtonActualizarEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoDetalleOrdenCompra")) {
				jButtonActualizarEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoDetalleOrdenCompra")) {
				jButtonEliminarEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoDetalleOrdenCompra")) {
				jButtonEliminarEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoDetalleOrdenCompra")) {
				jButtonEliminarEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoDetalleOrdenCompra")) {
				jButtonCancelarEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoDetalleOrdenCompra")) {
				jButtonCancelarEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoDetalleOrdenCompra")) {
				jButtonCancelarEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoDetalleOrdenCompra")) {
				jButtonCerrarEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoDetalleOrdenCompra")) {
				jButtonCerrarEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoDetalleOrdenCompra")) {
				jButtonCerrarEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoDetalleOrdenCompra")) {
				jButtonMostrarOcultarEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoDetalleOrdenCompra")) {
				jButtonCancelarEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoDetalleOrdenCompra")) {
				jButtonGuardarCambiosEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoDetalleOrdenCompra")) {
				jButtonGuardarCambiosEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoDetalleOrdenCompra")) {
				jButtonCopiarEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoDetalleOrdenCompra")) {
				jButtonVerFormEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoDetalleOrdenCompra")) {
				jButtonGuardarCambiosEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoDetalleOrdenCompra")) {
				jButtonCopiarEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoDetalleOrdenCompra")) {
				jButtonVerFormEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoDetalleOrdenCompra")) {
				jButtonGuardarCambiosEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoDetalleOrdenCompra")) {
				jButtonGuardarCambiosEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoDetalleOrdenCompra")) {
				jButtonGuardarCambiosEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoDetalleOrdenCompra")) {
				jButtonRecargarInformacionEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoDetalleOrdenCompra")) {
				jButtonRecargarInformacionEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoDetalleOrdenCompra")) {
				jButtonRecargarInformacionEstadoDetalleOrdenCompraActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoDetalleOrdenCompra")) {
				jButtonAnterioresEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoDetalleOrdenCompra")) {
				jButtonAnterioresEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoDetalleOrdenCompra")) {
				jButtonAnterioresEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoDetalleOrdenCompra")) {
				jButtonSiguientesEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoDetalleOrdenCompra")) {
				jButtonSiguientesEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoDetalleOrdenCompra")) {
				jButtonSiguientesEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoDetalleOrdenCompra") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoDetalleOrdenCompra")) {
				jButtonAbrirOrderByEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoDetalleOrdenCompra") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoDetalleOrdenCompra")) {
				jButtonMostrarOcultarEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoDetalleOrdenCompra")) {
				jButtonNuevoGuardarCambiosEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoDetalleOrdenCompra")) {
				jButtonNuevoGuardarCambiosEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoDetalleOrdenCompra")) {
				jButtonNuevoGuardarCambiosEstadoDetalleOrdenCompraActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoDetalleOrdenCompra")) {
				jButtonCerrarReporteDinamicoEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoDetalleOrdenCompra")) {
				jButtonGenerarReporteDinamicoEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoDetalleOrdenCompra")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoDetalleOrdenCompraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoDetalleOrdenCompra")) {
				jButtonCerrarImportacionEstadoDetalleOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoDetalleOrdenCompra")) {
				
				jButtonGenerarImportacionEstadoDetalleOrdenCompraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoDetalleOrdenCompra")) {
				
				jButtonAbrirImportacionEstadoDetalleOrdenCompraActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoDetalleOrdenCompra")) {
				jComboBoxTiposAccionesEstadoDetalleOrdenCompraActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoDetalleOrdenCompra")) {
				jComboBoxTiposRelacionesEstadoDetalleOrdenCompraActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoDetalleOrdenCompra")) {
				jComboBoxTiposAccionesEstadoDetalleOrdenCompraActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoDetalleOrdenCompra")) {
				
				jComboBoxTiposSeleccionarEstadoDetalleOrdenCompraActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoDetalleOrdenCompra")) {
				jTextFieldValorCampoGeneralEstadoDetalleOrdenCompraActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoDetalleOrdenCompra")) {
				jButtonAbrirOrderByEstadoDetalleOrdenCompraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoDetalleOrdenCompra")) {
				jButtonAbrirOrderByEstadoDetalleOrdenCompraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoDetalleOrdenCompra")) {
				jButtonCerrarOrderByEstadoDetalleOrdenCompraActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoDetalleOrdenCompraBusqueda")) {
				this.jButtonidEstadoDetalleOrdenCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoDetalleOrdenCompraBusqueda")) {
				this.jButtoncodigoEstadoDetalleOrdenCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoDetalleOrdenCompraBusqueda")) {
				this.jButtonnombreEstadoDetalleOrdenCompraBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoDetalleOrdenCompra();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleOrdenCompraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleordencompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleordencompra);
				
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
				
				


				
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleOrdenCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleOrdenCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoDetalleOrdenCompra estadodetalleordencompraLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadodetalleordencompraLocal=this.estadodetalleordencompra;
			} else {
				estadodetalleordencompraLocal=this.estadodetalleordencompraAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleordencompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleordencompra);
				
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
							
				
				


				
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleOrdenCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleOrdenCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleOrdenCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleordencompraAnterior =(EstadoDetalleOrdenCompra) this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleordencompraAnterior =(EstadoDetalleOrdenCompra) this.estadodetalleordencompras.toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
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
			
			EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
			
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
			
			


			
			EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleOrdenCompraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleordencompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleordencompra);
				
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
								
						
				


				
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleOrdenCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleOrdenCompra.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleordencompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleordencompra);
				
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
								
				
				


				
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleOrdenCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleOrdenCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleOrdenCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleordencompraAnterior =(EstadoDetalleOrdenCompra) this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleordencompraAnterior =(EstadoDetalleOrdenCompra) this.estadodetalleordencompras.toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleordencompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleordencompra);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleOrdenCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleordencompraAnterior =(EstadoDetalleOrdenCompra) this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleordencompraAnterior =(EstadoDetalleOrdenCompra) this.estadodetalleordencompras.toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleOrdenCompraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleordencompra);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleordencompra);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleordencompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleordencompra);
				
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
							
				
				


				
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleOrdenCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleOrdenCompra.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleOrdenCompraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetalleordencompraAnterior =(EstadoDetalleOrdenCompra) this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadodetalleordencompraAnterior =(EstadoDetalleOrdenCompra) this.estadodetalleordencompras.toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
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
			
			EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
			
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
			
			


			
			EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleOrdenCompraActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleordencompra);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleordencompra);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleordencompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleordencompra);
				
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
								
				
				


				
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleOrdenCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleOrdenCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleOrdenCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleordencompraAnterior =(EstadoDetalleOrdenCompra) this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleordencompraAnterior =(EstadoDetalleOrdenCompra) this.estadodetalleordencompras.toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleOrdenCompraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleordencompra);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleordencompra);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleOrdenCompraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleordencompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleordencompra);
				
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoDetalleOrdenCompra")) {
					jCheckBoxSeleccionarTodosEstadoDetalleOrdenCompraItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoDetalleOrdenCompra")) {
					jCheckBoxSeleccionadosEstadoDetalleOrdenCompraItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoDetalleOrdenCompra")) {
					
				}
				
				


				
				
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleOrdenCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleOrdenCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleordencompra);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleordencompra);
				
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
												
				
				


				
				
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleOrdenCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleOrdenCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleOrdenCompraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetalleordencompraAnterior =(EstadoDetalleOrdenCompra) this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadodetalleordencompraAnterior =(EstadoDetalleOrdenCompra) this.estadodetalleordencompras.toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleOrdenCompraActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleordencompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleordencompra);
				
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
				
				
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
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
			
			EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
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
			
			


			
			EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleOrdenCompraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleordencompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleordencompra);
				
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleOrdenCompra.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleOrdenCompra.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleordencompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleordencompra);
				
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
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
				
				


				
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleOrdenCompra.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleOrdenCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleOrdenCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleordencompraAnterior =(EstadoDetalleOrdenCompra) this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleordencompraAnterior =(EstadoDetalleOrdenCompra) this.estadodetalleordencompras.toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoDetalleOrdenCompra")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoDetalleOrdenCompraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadodetalleordencompra =(EstadoDetalleOrdenCompra) this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadodetalleordencompra =(EstadoDetalleOrdenCompra) this.estadodetalleordencompras.toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadodetalleordencompra);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoDetalleOrdenCompra")) {
				
				}
				
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoDetalleOrdenCompra")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoDetalleOrdenCompra.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoDetalleOrdenCompra")) {
			
			}
			
			EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoDetalleOrdenCompra();
			
			EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoDetalleOrdenCompra")) {
				jButtonNuevoEstadoDetalleOrdenCompraActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoDetalleOrdenCompra")) {
				jButtonDuplicarEstadoDetalleOrdenCompraActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoDetalleOrdenCompra")) {
				jButtonCopiarEstadoDetalleOrdenCompraActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoDetalleOrdenCompra")) {
				jButtonVerFormEstadoDetalleOrdenCompraActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoDetalleOrdenCompra")) {
				jButtonNuevoEstadoDetalleOrdenCompraActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoDetalleOrdenCompra")) {
				jButtonModificarEstadoDetalleOrdenCompraActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoDetalleOrdenCompra")) {
				jButtonActualizarEstadoDetalleOrdenCompraActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoDetalleOrdenCompra")) {
				jButtonEliminarEstadoDetalleOrdenCompraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoDetalleOrdenCompra")) {
				jButtonGuardarCambiosEstadoDetalleOrdenCompraActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoDetalleOrdenCompra")) {
				jButtonCancelarEstadoDetalleOrdenCompraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoDetalleOrdenCompra")) {
				jButtonCerrarEstadoDetalleOrdenCompraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoDetalleOrdenCompra")) {
				jButtonGuardarCambiosEstadoDetalleOrdenCompraActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoDetalleOrdenCompra")) {
				jButtonNuevoGuardarCambiosEstadoDetalleOrdenCompraActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoDetalleOrdenCompra")) {
				jButtonAbrirOrderByEstadoDetalleOrdenCompraActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoDetalleOrdenCompra")) {
				jButtonRecargarInformacionEstadoDetalleOrdenCompraActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoDetalleOrdenCompra")) {
				jButtonAnterioresEstadoDetalleOrdenCompraActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoDetalleOrdenCompra")) {
				jButtonSiguientesEstadoDetalleOrdenCompraActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoDetalleOrdenCompraBusqueda")) {
				this.jButtonidEstadoDetalleOrdenCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoDetalleOrdenCompraBusqueda")) {
				this.jButtoncodigoEstadoDetalleOrdenCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoDetalleOrdenCompraBusqueda")) {
				this.jButtonnombreEstadoDetalleOrdenCompraBusquedaActionPerformed(evt);
			}
			
			EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoDetalleOrdenCompra();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoDetalleOrdenCompra")) {
				closingInternalFrameEstadoDetalleOrdenCompra();
				
			} else if(sTipo.equals("jButtonCancelarEstadoDetalleOrdenCompra")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoDetalleOrdenCompra = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoDetalleOrdenCompraBeanSwingJInternalFrame jInternalFrameParent=(EstadoDetalleOrdenCompraBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoDetalleOrdenCompra.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoDetalleOrdenCompraActionPerformed(null);
			}
			
			EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadodetalleordencompra,new Object(),this.estadodetalleordencompraParameterGeneral,this.estadodetalleordencompraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoDetalleOrdenCompra(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoDetalleOrdenCompra(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoDetalleOrdenCompra(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadodetalleordencompra)) {
			if(!esControlTabla) {
				if(EstadoDetalleOrdenCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoDetalleOrdenCompra(this.estadodetalleordencompra,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleOrdenCompra(this.estadodetalleordencompra);			
				}
				
				if(this.estadodetalleordencompraSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoDetalleOrdenCompra(this.estadodetalleordencompra,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadodetalleordencompraReturnGeneral=estadodetalleordencompraLogic.procesarEventosEstadoDetalleOrdenComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras(),this.estadodetalleordencompra,this.estadodetalleordencompraParameterGeneral,this.isEsNuevoEstadoDetalleOrdenCompra,classes);//this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompra()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoDetalleOrdenCompra(this.estadodetalleordencompraReturnGeneral,this.estadodetalleordencompraBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadodetalleordencompraSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoDetalleOrdenCompra(classes,this.estadodetalleordencompraReturnGeneral,this.estadodetalleordencompraBean,false);
					}
						
					if(this.estadodetalleordencompraReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleOrdenCompra(this.estadodetalleordencompraReturnGeneral.getEstadoDetalleOrdenCompra());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoDetalleOrdenCompra(this.estadodetalleordencompraReturnGeneral.getEstadoDetalleOrdenCompra());	
					}
						
					if(this.estadodetalleordencompraReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoDetalleOrdenCompra(this.estadodetalleordencompraReturnGeneral.getEstadoDetalleOrdenCompra(),classes);//this.estadodetalleordencompraBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoDetalleOrdenCompra(this.estadodetalleordencompra,classes);//this.estadodetalleordencompraBean);									
				}
			
				if(EstadoDetalleOrdenCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoDetalleOrdenCompra(this.estadodetalleordencompra,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleOrdenCompra(this.estadodetalleordencompra);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadodetalleordencompraAnterior!=null) {
						this.estadodetalleordencompra=this.estadodetalleordencompraAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadodetalleordencompraReturnGeneral=estadodetalleordencompraLogic.procesarEventosEstadoDetalleOrdenComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras(),this.estadodetalleordencompra,this.estadodetalleordencompraParameterGeneral,this.isEsNuevoEstadoDetalleOrdenCompra,classes);//this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompra()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadodetalleordencompraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadodetalleordencompraReturnGeneral.getEstadoDetalleOrdenCompra(),estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadodetalleordencompraReturnGeneral.getEstadoDetalleOrdenCompra(),this.estadodetalleordencompras);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoDetalleOrdenCompra.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoDetalleOrdenCompra.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoDetalleOrdenCompra();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoDetalleOrdenCompra() throws Exception {
		
		EstadoDetalleOrdenCompraModel estadodetalleordencompraModel=(EstadoDetalleOrdenCompraModel)this.jTableDatosEstadoDetalleOrdenCompra.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadodetalleordencompraModel.estadodetalleordencompras=this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadodetalleordencompraModel.estadodetalleordencompras=this.estadodetalleordencompras;
		}
		
		
		((EstadoDetalleOrdenCompraModel) this.jTableDatosEstadoDetalleOrdenCompra.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoDetalleOrdenCompra() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadodetalleordencompraAnterior(),this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadodetalleordencompraAnterior(),this.estadodetalleordencompras);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoDetalleOrdenCompra();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoDetalleOrdenCompra(EstadoDetalleOrdenCompra estadodetalleordencompra,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleOrdenCompra.class)) {
					this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.setDetalleOrdenCompras(estadodetalleordencompra.getDetalleOrdenCompras());
					this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleOrdenCompra(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
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
										
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetalleordencompra,new Object(),generalEntityParameterGeneral,this.estadodetalleordencompraReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadodetalleordencompraSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoDetalleOrdenCompraConstantesFunciones.getClassesRelationshipsOfEstadoDetalleOrdenCompra(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoDetalleOrdenCompraConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoDetalleOrdenCompra(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoDetalleOrdenCompra(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetalleordencompra,new Object(),generalEntityParameterGeneral,this.estadodetalleordencompraReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoDetalleOrdenCompra(EstadoDetalleOrdenCompraBean estadodetalleordencompraBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleOrdenCompra.class)) {
					this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.setDetalleOrdenCompras(estadodetalleordencompra.getDetalleOrdenCompras());
					this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleOrdenCompra(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoDetalleOrdenCompra(ArrayList<Classe> classes,EstadoDetalleOrdenCompraReturnGeneral estadodetalleordencompraReturnGeneral,EstadoDetalleOrdenCompraBean estadodetalleordencompraBean,Boolean conDefault) throws Exception {
		
			this.estadodetalleordencompraBean.setDetalleOrdenCompras(estadodetalleordencompraReturnGeneral.getEstadoDetalleOrdenCompra().getDetalleOrdenCompras());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoDetalleOrdenCompra(EstadoDetalleOrdenCompra estadodetalleordencompra,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleOrdenCompra.class)) {
					estadodetalleordencompra.setDetalleOrdenCompras(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.getDetalleOrdenCompras());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadodetalleordencompra)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra = new EstadoDetalleOrdenCompraDetalleFormJInternalFrame(jDesktopPane,this.estadodetalleordencompraSessionBean.getConGuardarRelaciones(),this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra);
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.setVisible(false);
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.estadodetalleordencompraLogic=this.estadodetalleordencompraLogic;
		
		this.cargarCombosFrameForeignKeyEstadoDetalleOrdenCompra("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoDetalleOrdenCompra();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoDetalleOrdenCompra();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoDetalleOrdenCompra("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoDetalleOrdenCompra();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoDetalleOrdenCompra"));
		
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonModificarEstadoDetalleOrdenCompra.addActionListener(new ButtonActionListener(this,"ModificarEstadoDetalleOrdenCompra"));

		
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonModificarToolBarEstadoDetalleOrdenCompra.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoDetalleOrdenCompra"));
					
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jMenuItemModificarEstadoDetalleOrdenCompra.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoDetalleOrdenCompra"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonActualizarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"ActualizarEstadoDetalleOrdenCompra"));
		
		
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonActualizarToolBarEstadoDetalleOrdenCompra.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoDetalleOrdenCompra"));
						
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jMenuItemActualizarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoDetalleOrdenCompra"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonEliminarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"EliminarEstadoDetalleOrdenCompra"));
		
		
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonEliminarToolBarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoDetalleOrdenCompra"));
								
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jMenuItemEliminarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoDetalleOrdenCompra"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonCancelarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"CancelarEstadoDetalleOrdenCompra"));
		
		
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonCancelarToolBarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoDetalleOrdenCompra"));
					
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jMenuItemCancelarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoDetalleOrdenCompra"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jMenuItemDetalleCerrarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoDetalleOrdenCompra"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonGuardarCambiosToolBarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoDetalleOrdenCompra"));
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonGuardarCambiosToolBarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoDetalleOrdenCompra"));
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoDetalleOrdenCompra"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonidEstadoDetalleOrdenCompraBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoDetalleOrdenCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtoncodigoEstadoDetalleOrdenCompraBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoDetalleOrdenCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonnombreEstadoDetalleOrdenCompraBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoDetalleOrdenCompraBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTabbedPaneRelacionesEstadoDetalleOrdenCompra.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoDetalleOrdenCompra"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoDetalleOrdenCompra"));
		
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoDetalleOrdenCompra"));
		}
		
		this.jTableDatosEstadoDetalleOrdenCompra.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoDetalleOrdenCompra"));
		
		this.jTableDatosEstadoDetalleOrdenCompra.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoDetalleOrdenCompra"));
		
		this.jButtonNuevoEstadoDetalleOrdenCompra.addActionListener(new ButtonActionListener(this,"NuevoEstadoDetalleOrdenCompra"));
		
		this.jButtonDuplicarEstadoDetalleOrdenCompra.addActionListener(new ButtonActionListener(this,"DuplicarEstadoDetalleOrdenCompra"));
		
		this.jButtonCopiarEstadoDetalleOrdenCompra.addActionListener(new ButtonActionListener(this,"CopiarEstadoDetalleOrdenCompra"));
		
		this.jButtonVerFormEstadoDetalleOrdenCompra.addActionListener(new ButtonActionListener(this,"VerFormEstadoDetalleOrdenCompra"));
		
		
		this.jButtonNuevoToolBarEstadoDetalleOrdenCompra.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoDetalleOrdenCompra"));
			
		this.jButtonDuplicarToolBarEstadoDetalleOrdenCompra.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoDetalleOrdenCompra"));
			
		this.jMenuItemNuevoEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoDetalleOrdenCompra"));
			
		this.jMenuItemDuplicarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoDetalleOrdenCompra"));		
		
		
		this.jButtonNuevoRelacionesEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoDetalleOrdenCompra"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoDetalleOrdenCompra.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoDetalleOrdenCompra"));
			
		this.jMenuItemNuevoRelacionesEstadoDetalleOrdenCompra.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoDetalleOrdenCompra"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonModificarEstadoDetalleOrdenCompra.addActionListener(new ButtonActionListener(this,"ModificarEstadoDetalleOrdenCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonModificarToolBarEstadoDetalleOrdenCompra.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoDetalleOrdenCompra"));
			
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jMenuItemModificarEstadoDetalleOrdenCompra.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoDetalleOrdenCompra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonActualizarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"ActualizarEstadoDetalleOrdenCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonActualizarToolBarEstadoDetalleOrdenCompra.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoDetalleOrdenCompra"));
				
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jMenuItemActualizarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoDetalleOrdenCompra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonEliminarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"EliminarEstadoDetalleOrdenCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonEliminarToolBarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoDetalleOrdenCompra"));
						
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jMenuItemEliminarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoDetalleOrdenCompra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonCancelarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"CancelarEstadoDetalleOrdenCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonCancelarToolBarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoDetalleOrdenCompra"));
			
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jMenuItemCancelarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoDetalleOrdenCompra"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoDetalleOrdenCompra"));		
		
		
		this.jButtonCerrarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"CerrarEstadoDetalleOrdenCompra"));
		
		
		this.jButtonCerrarToolBarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoDetalleOrdenCompra"));
			
		this.jMenuItemCerrarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoDetalleOrdenCompra"));
			
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jMenuItemDetalleCerrarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoDetalleOrdenCompra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonGuardarCambiosEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoDetalleOrdenCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonGuardarCambiosToolBarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoDetalleOrdenCompra"));
		}
		
		this.jButtonCopiarToolBarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoDetalleOrdenCompra"));
			
		this.jButtonVerFormToolBarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoDetalleOrdenCompra"));
		
		this.jMenuItemGuardarCambiosEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoDetalleOrdenCompra"));
			
		this.jMenuItemCopiarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoDetalleOrdenCompra"));		
		
		this.jMenuItemVerFormEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoDetalleOrdenCompra"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoDetalleOrdenCompra"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoDetalleOrdenCompra"));
			
		this.jMenuItemGuardarCambiosTablaEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoDetalleOrdenCompra"));		
		
		
		
		this.jButtonRecargarInformacionEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoDetalleOrdenCompra"));
					
		this.jButtonRecargarInformacionToolBarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoDetalleOrdenCompra"));
		
		this.jMenuItemRecargarInformacionEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoDetalleOrdenCompra"));		
		
		
		
		this.jButtonAnterioresEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"AnterioresEstadoDetalleOrdenCompra"));
		
		
		this.jButtonAnterioresToolBarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoDetalleOrdenCompra"));
		
		this.jMenuItemAnterioresEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoDetalleOrdenCompra"));		
		
		
		this.jButtonSiguientesEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"SiguientesEstadoDetalleOrdenCompra"));
		
		
		this.jButtonSiguientesToolBarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoDetalleOrdenCompra"));
			
		this.jMenuItemSiguientesEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoDetalleOrdenCompra"));
			
		this.jMenuItemAbrirOrderByEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoDetalleOrdenCompra"));
			
		this.jMenuItemMostrarOcultarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoDetalleOrdenCompra"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoDetalleOrdenCompra"));
			
		this.jMenuItemDetalleMostarOcultarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoDetalleOrdenCompra"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoDetalleOrdenCompra"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoDetalleOrdenCompra"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoDetalleOrdenCompra"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoDetalleOrdenCompra.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoDetalleOrdenCompra"));

		this.jCheckBoxSeleccionadosEstadoDetalleOrdenCompra.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoDetalleOrdenCompra"));
		
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoDetalleOrdenCompra"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoDetalleOrdenCompra"));
			
		this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoDetalleOrdenCompra"));
					
		this.jComboBoxTiposSeleccionarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoDetalleOrdenCompra"));
			
		this.jTextFieldValorCampoGeneralEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoDetalleOrdenCompra"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonidEstadoDetalleOrdenCompraBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoDetalleOrdenCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtoncodigoEstadoDetalleOrdenCompraBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoDetalleOrdenCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonnombreEstadoDetalleOrdenCompraBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoDetalleOrdenCompraBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra!=null) {
				this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoDetalleOrdenCompra"));
				this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoDetalleOrdenCompra"));
				this.jInternalFrameReporteDinamicoEstadoDetalleOrdenCompra.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoDetalleOrdenCompra"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoDetalleOrdenCompra"));				
			//this.jButtonGenerarReporteDinamicoEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoDetalleOrdenCompra"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoDetalleOrdenCompra"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoDetalleOrdenCompra!=null) {
				this.jInternalFrameImportacionEstadoDetalleOrdenCompra.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoDetalleOrdenCompra"));
				this.jInternalFrameImportacionEstadoDetalleOrdenCompra.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoDetalleOrdenCompra"));
				this.jInternalFrameImportacionEstadoDetalleOrdenCompra.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoDetalleOrdenCompra"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoDetalleOrdenCompra"));
			
			this.jButtonAbrirOrderByToolBarEstadoDetalleOrdenCompra.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoDetalleOrdenCompra"));			
			
			if(this.jInternalFrameOrderByEstadoDetalleOrdenCompra!=null) {
				this.jInternalFrameOrderByEstadoDetalleOrdenCompra.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoDetalleOrdenCompra"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTabbedPaneRelacionesEstadoDetalleOrdenCompra.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoDetalleOrdenCompra"));
		
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
            		closingInternalFrameEstadoDetalleOrdenCompra();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoDetalleOrdenCompra = (JInternalFrameBase)event.getSource();
	            	
	            EstadoDetalleOrdenCompraBeanSwingJInternalFrame jInternalFrameParent=(EstadoDetalleOrdenCompraBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoDetalleOrdenCompra.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoDetalleOrdenCompraActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoDetalleOrdenCompra.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoDetalleOrdenCompraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoDetalleOrdenCompra.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoDetalleOrdenCompra.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleOrdenCompraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleOrdenCompraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleOrdenCompraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoDetalleOrdenCompra";
		inputMap = this.jButtonNuevoEstadoDetalleOrdenCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoDetalleOrdenCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoDetalleOrdenCompraActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleOrdenCompraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleOrdenCompraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleOrdenCompraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoDetalleOrdenCompra";
		inputMap = this.jButtonNuevoRelacionesEstadoDetalleOrdenCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoDetalleOrdenCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoDetalleOrdenCompraActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoDetalleOrdenCompra";
		inputMap = this.jButtonModificarEstadoDetalleOrdenCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoDetalleOrdenCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoDetalleOrdenCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoDetalleOrdenCompra";
		inputMap = this.jButtonActualizarEstadoDetalleOrdenCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoDetalleOrdenCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoDetalleOrdenCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoDetalleOrdenCompra";
		inputMap = this.jButtonEliminarEstadoDetalleOrdenCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoDetalleOrdenCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoDetalleOrdenCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoDetalleOrdenCompra";
		inputMap = this.jButtonCancelarEstadoDetalleOrdenCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoDetalleOrdenCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoDetalleOrdenCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoDetalleOrdenCompra";
		inputMap = this.jButtonCerrarEstadoDetalleOrdenCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoDetalleOrdenCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoDetalleOrdenCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonGuardarCambiosEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoDetalleOrdenCompra";
		inputMap = this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonGuardarCambiosEstadoDetalleOrdenCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonGuardarCambiosEstadoDetalleOrdenCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoDetalleOrdenCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoDetalleOrdenCompra.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoDetalleOrdenCompraItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoDetalleOrdenCompraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoDetalleOrdenCompra.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoDetalleOrdenCompraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoDetalleOrdenCompra.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoDetalleOrdenCompraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonidEstadoDetalleOrdenCompraBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoDetalleOrdenCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtoncodigoEstadoDetalleOrdenCompraBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoDetalleOrdenCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jButtonnombreEstadoDetalleOrdenCompraBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoDetalleOrdenCompraBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoDetalleOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoDetalleOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoDetalleOrdenCompraActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoDetalleOrdenCompra.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoDetalleOrdenCompra(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoDetalleOrdenCompra estadodetalleordencompraAux:this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras()) {
					estadodetalleordencompraAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetalleOrdenCompra estadodetalleordencompraAux:estadodetalleordencompras) {
					estadodetalleordencompraAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoDetalleOrdenCompraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoDetalleOrdenCompra(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoDetalleOrdenCompra estadodetalleordencompraAux:this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras()) {
						estadodetalleordencompraAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoDetalleOrdenCompra estadodetalleordencompraAux:estadodetalleordencompras) {
						estadodetalleordencompraAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoDetalleOrdenCompra estadodetalleordencompraAux:this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoDetalleOrdenCompra estadodetalleordencompraAux:estadodetalleordencompras) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoDetalleOrdenCompra(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoDetalleOrdenCompra.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoDetalleOrdenCompra.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleOrdenCompra,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoDetalleOrdenCompraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoDetalleOrdenCompra(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoDetalleOrdenCompra.getSelectedRows();
			
			EstadoDetalleOrdenCompra estadodetalleordencompraLocal=new EstadoDetalleOrdenCompra();
			
			//this.seleccionarTodosEstadoDetalleOrdenCompra(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadodetalleordencompraLocal =(EstadoDetalleOrdenCompra) this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras().toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadodetalleordencompraLocal =(EstadoDetalleOrdenCompra) this.estadodetalleordencompras.toArray()[this.jTableDatosEstadoDetalleOrdenCompra.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadodetalleordencompraLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoDetalleOrdenCompra estadodetalleordencompraAux:this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras()) {
						estadodetalleordencompraAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoDetalleOrdenCompra estadodetalleordencompraAux:estadodetalleordencompras) {
						estadodetalleordencompraAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoDetalleOrdenCompra(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoDetalleOrdenCompra.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoDetalleOrdenCompra.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleOrdenCompra,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoDetalleOrdenCompraItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoDetalleOrdenCompraParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoDetalleOrdenCompraActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoDetalleOrdenCompra(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoDetalleOrdenCompra.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoDetalleOrdenCompra estadodetalleordencompraAux:this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras()) {
				
						if(sTipoSeleccionar.equals(EstadoDetalleOrdenCompraConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadodetalleordencompraAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoDetalleOrdenCompraConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadodetalleordencompraAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetalleOrdenCompra estadodetalleordencompraAux:estadodetalleordencompras) {
					
						if(sTipoSeleccionar.equals(EstadoDetalleOrdenCompraConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadodetalleordencompraAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoDetalleOrdenCompraConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadodetalleordencompraAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoDetalleOrdenCompra(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoDetalleOrdenCompraActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoDetalleOrdenCompra(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoDetalleOrdenCompra=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoDetalleOrdenCompra) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoDetalleOrdenCompra(conSplash);
				
					this.generarReporteEstadoDetalleOrdenComprasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoDetalleOrdenComprasSeleccionados();
				//this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoDetalleOrdenComprasSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoDetalleOrdenComprasSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoDetalleOrdenCompra();
				
				this.exportarEstadoDetalleOrdenComprasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoDetalleOrdenCompras();
				//this.importarEstadoDetalleOrdenCompras();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoDetalleOrdenCompra();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoDetalleOrdenComprasSeleccionados();
				//this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Detalle Orden Compra", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoDetalleOrdenCompra();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoDetalleOrdenCompra)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoDetalleOrdenCompra(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Detalle Orden Compra",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadoDetalleOrdenCompraBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadoDetalleOrdenCompra) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadoDetalleOrdenCompra(conSplash);
					
						//this.actualizarParametrosGeneralEstadoDetalleOrdenCompra();
						
						this.generarReporteProcesoAccionEstadoDetalleOrdenComprasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estado Detalle Orden CompraS SELECCIONADOS?", "MANTENIMIENTO DE Estado Detalle Orden Compra", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadoDetalleOrdenCompra();
				
						this.actualizarParametrosGeneralEstadoDetalleOrdenCompra();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadodetalleordencompraReturnGeneral=estadodetalleordencompraLogic.procesarAccionEstadoDetalleOrdenComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras(),this.estadodetalleordencompraParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadoDetalleOrdenCompraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoDetalleOrdenCompra();
					
					EstadoDetalleOrdenCompraBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadoDetalleOrdenCompraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoDetalleOrdenCompra.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jComboBoxTiposAccionesFormularioEstadoDetalleOrdenCompra.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoDetalleOrdenCompra(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoDetalleOrdenCompraActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoDetalleOrdenCompra();
			
			if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoDetalleOrdenCompra> estadodetalleordencomprasSeleccionados=new ArrayList<EstadoDetalleOrdenCompra>();		
			EstadoDetalleOrdenCompra estadodetalleordencompra=new EstadoDetalleOrdenCompra();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoDetalleOrdenCompra(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoDetalleOrdenCompra.getSelectedItem();
			
			
			
			
			estadodetalleordencomprasSeleccionados=this.getEstadoDetalleOrdenComprasSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadodetalleordencomprasSeleccionados.size()==1) {
				for(EstadoDetalleOrdenCompra estadodetalleordencompraAux:estadodetalleordencomprasSeleccionados) {
					estadodetalleordencompra=estadodetalleordencompraAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Orden Compra")) {
					jButtonDetalleOrdenCompraActionPerformed(null,rowIndex,true,false,estadodetalleordencompra);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoDetalleOrdenCompra();
			
      		//this.finishProcessEstadoDetalleOrdenCompra(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoDetalleOrdenCompraReturnGeneral() throws Exception {
		if(this.estadodetalleordencompraReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadodetalleordencompraReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadodetalleordencompraReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadodetalleordencompraReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadodetalleordencompraReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadodetalleordencompraReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoDetalleOrdenCompra(false);
		}
		
		if(this.estadodetalleordencompraReturnGeneral.getConRetornoLista() || this.estadodetalleordencompraReturnGeneral.getConRetornoObjeto()) {
			if(this.estadodetalleordencompraReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadodetalleordencompraLogic.setEstadoDetalleOrdenCompras(this.estadodetalleordencompraReturnGeneral.getEstadoDetalleOrdenCompras());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadodetalleordencompraReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadodetalleordencompraLogic.setEstadoDetalleOrdenCompra(this.estadodetalleordencompraReturnGeneral.getEstadoDetalleOrdenCompra());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoDetalleOrdenCompra(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoDetalleOrdenCompra() throws Exception {
		
		
	}
	
	public ArrayList<EstadoDetalleOrdenCompra> getEstadoDetalleOrdenComprasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoDetalleOrdenCompra> estadodetalleordencomprasSeleccionados=new ArrayList<EstadoDetalleOrdenCompra>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoDetalleOrdenCompra) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoDetalleOrdenCompra estadodetalleordencompraAux:estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras()) {
					if(estadodetalleordencompraAux.getIsSelected()) {
						estadodetalleordencomprasSeleccionados.add(estadodetalleordencompraAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetalleOrdenCompra estadodetalleordencompraAux:this.estadodetalleordencompras) {
					if(estadodetalleordencompraAux.getIsSelected()) {
						estadodetalleordencomprasSeleccionados.add(estadodetalleordencompraAux);				
					}
				}
			}
			
			if(estadodetalleordencomprasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadodetalleordencomprasSeleccionados.addAll(this.estadodetalleordencompraLogic.getEstadoDetalleOrdenCompras());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadodetalleordencomprasSeleccionados.addAll(this.estadodetalleordencompras);				
					}
				}
			}
		} else {
			estadodetalleordencomprasSeleccionados.add(this.estadodetalleordencompra);
		}
		
		return estadodetalleordencomprasSeleccionados;
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
	
	public void generarReporteEstadoDetalleOrdenComprasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoDetalleOrdenComprasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoDetalleOrdenComprasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoDetalleOrdenComprasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoDetalleOrdenComprasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoDetalleOrdenComprasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Detalle Orden Compra",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoDetalleOrdenComprasSeleccionados() throws Exception {
		ArrayList<EstadoDetalleOrdenCompra> estadodetalleordencomprasSeleccionados=new ArrayList<EstadoDetalleOrdenCompra>();		
		
		estadodetalleordencomprasSeleccionados=this.getEstadoDetalleOrdenComprasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoDetalleOrdenCompras("Todos",estadodetalleordencomprasSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoDetalleOrdenComprasSeleccionados() throws Exception {
		ArrayList<EstadoDetalleOrdenCompra> estadodetalleordencomprasSeleccionados=new ArrayList<EstadoDetalleOrdenCompra>();		
		
		estadodetalleordencomprasSeleccionados=this.getEstadoDetalleOrdenComprasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoDetalleOrdenCompras("Todos",estadodetalleordencomprasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoDetalleOrdenComprasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoDetalleOrdenCompra> estadodetalleordencomprasSeleccionados=new ArrayList<EstadoDetalleOrdenCompra>();
		
		estadodetalleordencomprasSeleccionados=this.getEstadoDetalleOrdenComprasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoDetalleOrdenCompras("Todos",estadodetalleordencomprasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoDetalleOrdenComprasSeleccionados() throws Exception {
		ArrayList<EstadoDetalleOrdenCompra> estadodetalleordencomprasSeleccionados=new ArrayList<EstadoDetalleOrdenCompra>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoDetalleOrdenCompra();
		
		
		estadodetalleordencomprasSeleccionados=this.getEstadoDetalleOrdenComprasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoDetalleOrdenCompra();
		
		
		//this.generarReporteEstadoDetalleOrdenCompras("Todos",estadodetalleordencomprasSeleccionados ,estadodetalleordencompraImplementable,estadodetalleordencompraImplementableHome);
	}
	
	public void mostrarImportacionEstadoDetalleOrdenCompras() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoDetalleOrdenCompra();
		
		this.abrirFrameImportacionEstadoDetalleOrdenCompra();		
		
			
		//this.generarReporteEstadoDetalleOrdenCompras("Todos",estadodetalleordencomprasSeleccionados ,estadodetalleordencompraImplementable,estadodetalleordencompraImplementableHome);
	}
	
	public void importarEstadoDetalleOrdenCompras() throws Exception {		
	
	}
	
	public void exportarEstadoDetalleOrdenComprasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoDetalleOrdenComprasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoDetalleOrdenComprasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoDetalleOrdenComprasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Detalle Orden Compra",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoDetalleOrdenComprasSeleccionados() throws Exception {
		ArrayList<EstadoDetalleOrdenCompra> estadodetalleordencomprasSeleccionados=new ArrayList<EstadoDetalleOrdenCompra>();		
		
		estadodetalleordencomprasSeleccionados=this.getEstadoDetalleOrdenComprasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleordencompra."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoDetalleOrdenCompra(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoDetalleOrdenCompra estadodetalleordencompraAux:estadodetalleordencomprasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoDetalleOrdenCompra(estadodetalleordencompraAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadodetalleordencompraAux.setsDetalleGeneralEntityReporte(estadodetalleordencompraAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Orden Compra",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoDetalleOrdenCompra(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoDetalleOrdenCompraConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoDetalleOrdenCompraConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoDetalleOrdenCompraConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoDetalleOrdenCompraConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoDetalleOrdenCompra(EstadoDetalleOrdenCompra estadodetalleordencompra,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadodetalleordencompra.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadodetalleordencompra.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadodetalleordencompra.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadodetalleordencompra.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoDetalleOrdenComprasSeleccionados() throws Exception {
		ArrayList<EstadoDetalleOrdenCompra> estadodetalleordencomprasSeleccionados=new ArrayList<EstadoDetalleOrdenCompra>();		
		
		estadodetalleordencomprasSeleccionados=this.getEstadoDetalleOrdenComprasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleordencompra.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoDetalleOrdenCompras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoDetalleOrdenCompra(row);				
				iRow++;
			}				
			
			for(EstadoDetalleOrdenCompra estadodetalleordencompraAux:estadodetalleordencomprasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoDetalleOrdenCompra(estadodetalleordencompraAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Orden Compra",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoDetalleOrdenComprasSeleccionados() throws Exception {
		ArrayList<EstadoDetalleOrdenCompra> estadodetalleordencomprasSeleccionados=new ArrayList<EstadoDetalleOrdenCompra>();		
		
		estadodetalleordencomprasSeleccionados=this.getEstadoDetalleOrdenComprasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleordencompra.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadodetalleordencompras");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadodetalleordencompra");
			//elementRoot.appendChild(element);
		
			for(EstadoDetalleOrdenCompra estadodetalleordencompraAux:estadodetalleordencomprasSeleccionados) {
				element = document.createElement("estadodetalleordencompra");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoDetalleOrdenCompra(estadodetalleordencompraAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Orden Compra",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoDetalleOrdenCompra(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetalleOrdenCompraConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetalleOrdenCompraConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetalleOrdenCompraConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetalleOrdenCompraConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoDetalleOrdenCompra(EstadoDetalleOrdenCompra estadodetalleordencompra,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadodetalleordencompra.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadodetalleordencompra.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadodetalleordencompra.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoDetalleOrdenCompra(EstadoDetalleOrdenCompra estadodetalleordencompra,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoDetalleOrdenCompraConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadodetalleordencompra.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoDetalleOrdenCompraConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadodetalleordencompra.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoDetalleOrdenCompraConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadodetalleordencompra.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoDetalleOrdenCompraConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadodetalleordencompra.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoDetalleOrdenComprasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoDetalleOrdenCompra> estadodetalleordencomprasSeleccionados=new ArrayList<EstadoDetalleOrdenCompra>();
		
		estadodetalleordencomprasSeleccionados=this.getEstadoDetalleOrdenComprasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoDetalleOrdenCompra(estadodetalleordencomprasSeleccionados);
		
		this.generarReporteEstadoDetalleOrdenCompras("Todos",estadodetalleordencomprasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoDetalleOrdenCompra(ArrayList<EstadoDetalleOrdenCompra> estadodetalleordencomprasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoDetalleOrdenCompra estadodetalleordencompraAux:estadodetalleordencomprasSeleccionados) {
				estadodetalleordencompraAux.setsDetalleGeneralEntityReporte(estadodetalleordencompraAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoDetalleOrdenCompraConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadodetalleordencompraAux.setsDescripcionGeneralEntityReporte1(estadodetalleordencompraAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoDetalleOrdenCompraConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadodetalleordencompraAux.setsDescripcionGeneralEntityReporte1(estadodetalleordencompraAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoDetalleOrdenCompra(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoDetalleOrdenCompra=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleOrdenCompra=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoDetalleOrdenCompra=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleOrdenCompra=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleOrdenCompra=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleOrdenCompra=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaModificarEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleOrdenCompra=true;
			this.isVisibilidadCeldaEliminarEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleOrdenCompra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleOrdenCompra=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleOrdenCompra=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaModificarEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleOrdenCompra=true;
			this.isVisibilidadCeldaEliminarEstadoDetalleOrdenCompra=true;
			this.isVisibilidadCeldaCancelarEstadoDetalleOrdenCompra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleOrdenCompra=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleOrdenCompra=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaModificarEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleOrdenCompra=true;
			this.isVisibilidadCeldaEliminarEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleOrdenCompra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleOrdenCompra=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleOrdenCompra=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoDetalleOrdenCompra=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleOrdenCompra=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleOrdenCompra=true;
			this.isVisibilidadCeldaModificarEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleOrdenCompra=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleOrdenCompra=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleOrdenCompra=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleOrdenCompra=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleOrdenCompra=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleOrdenCompra=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaModificarEstadoDetalleOrdenCompra=true;
			this.isVisibilidadCeldaActualizarEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleOrdenCompra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleOrdenCompra=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleOrdenCompra=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoDetalleOrdenCompraJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoDetalleOrdenCompra=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleOrdenCompra=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleOrdenCompra=true;
		} else {
			this.actualizarEstadoPanelsEstadoDetalleOrdenCompra(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoDetalleOrdenCompra=false;
			//this.isVisibilidadCeldaVerFormEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaDuplicarEstadoDetalleOrdenCompra=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadodetalleordencompraSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleOrdenCompra=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleOrdenCompra=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
			if(!estadodetalleordencompraSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleOrdenCompra=false;												
			}
			
			this.jButtonCerrarEstadoDetalleOrdenCompra.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleOrdenCompra=false;
		}
		
		if(!this.permiteMantenimiento(this.estadodetalleordencompra)) {
			this.isVisibilidadCeldaActualizarEstadoDetalleOrdenCompra=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleOrdenCompra=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoDetalleOrdenCompra() {
		this.isVisibilidadCeldaNuevoEstadoDetalleOrdenCompra=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoDetalleOrdenCompra=false;
	}
	
	public void actualizarEstadoPanelsEstadoDetalleOrdenCompra(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleOrdenCompra!=null) {
				this.jScrollPanelDatosEstadoDetalleOrdenCompra.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetalleOrdenCompra!=null) {
				this.jPanelPaginacionEstadoDetalleOrdenCompra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleOrdenCompra!=null) {
				this.jPanelParametrosReportesEstadoDetalleOrdenCompra.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoDetalleOrdenCompra!=null) {
				this.jScrollPanelDatosEstadoDetalleOrdenCompra.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoDetalleOrdenCompra!=null) {
				this.jPanelPaginacionEstadoDetalleOrdenCompra.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleOrdenCompra!=null) {
				this.jPanelParametrosReportesEstadoDetalleOrdenCompra.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleOrdenCompra!=null) {
				this.jScrollPanelDatosEstadoDetalleOrdenCompra.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoDetalleOrdenCompra!=null) {
				this.jPanelPaginacionEstadoDetalleOrdenCompra.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleOrdenCompra!=null) {
				this.jPanelParametrosReportesEstadoDetalleOrdenCompra.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleOrdenCompra!=null) {
				this.jScrollPanelDatosEstadoDetalleOrdenCompra.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoDetalleOrdenCompra!=null) {
				this.jPanelPaginacionEstadoDetalleOrdenCompra.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleOrdenCompra!=null) {
				this.jPanelParametrosReportesEstadoDetalleOrdenCompra.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleOrdenCompra!=null) {
				this.jScrollPanelDatosEstadoDetalleOrdenCompra.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetalleOrdenCompra!=null) {
				this.jPanelPaginacionEstadoDetalleOrdenCompra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleOrdenCompra!=null) {
				this.jPanelParametrosReportesEstadoDetalleOrdenCompra.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleOrdenCompra!=null) {
				this.jScrollPanelDatosEstadoDetalleOrdenCompra.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetalleOrdenCompra!=null) {
				this.jPanelPaginacionEstadoDetalleOrdenCompra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleOrdenCompra!=null) {
				this.jPanelParametrosReportesEstadoDetalleOrdenCompra.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleOrdenCompra.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleOrdenCompra!=null) {
				this.jScrollPanelDatosEstadoDetalleOrdenCompra.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetalleOrdenCompra!=null) {
				this.jPanelPaginacionEstadoDetalleOrdenCompra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleOrdenCompra!=null) {
				this.jPanelParametrosReportesEstadoDetalleOrdenCompra.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadodetalleordencompraSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoDetalleOrdenCompraParaDetalleOrdenCompras() throws Exception {
		Boolean isPaginaPopupDetalleOrdenCompra=false;

		try {

			if(this.estadodetalleordencompraSessionBean==null) {
				this.estadodetalleordencompraSessionBean=new EstadoDetalleOrdenCompraSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraSessionBean=new DetalleOrdenCompraSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraSessionBean.setsPathNavegacionActual(estadodetalleordencompraSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleOrdenCompra=this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleOrdenCompra(true);
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleOrdenCompra(EstadoDetalleOrdenCompraConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraSessionBean.setisBusquedaDesdeForeignKeySesionEstadoDetalleOrdenCompra(true);
			this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.detalleordencompraSessionBean.setlidEstadoDetalleOrdenCompraActual(this.idEstadoDetalleOrdenCompraActual);

			estadodetalleordencompraSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoDetalleOrdenCompra(true);
			estadodetalleordencompraSessionBean.setlIdEstadoDetalleOrdenCompraActualForeignKey(this.idEstadoDetalleOrdenCompraActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoDetalleOrdenCompraSessionBean estadodetalleordencompraSessionBean=new EstadoDetalleOrdenCompraSessionBean();
		
		if(this.estadodetalleordencompraSessionBean==null) {
			this.estadodetalleordencompraSessionBean=new EstadoDetalleOrdenCompraSessionBean();
		}
		
		this.estadodetalleordencompraSessionBean.setsUltimaBusquedaEstadoDetalleOrdenCompra(this.getsAccionBusqueda());
		this.estadodetalleordencompraSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadodetalleordencompraSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoDetalleOrdenCompraSessionBean estadodetalleordencompraSessionBean=new EstadoDetalleOrdenCompraSessionBean();
		
		if(this.estadodetalleordencompraSessionBean==null) {
			this.estadodetalleordencompraSessionBean=new EstadoDetalleOrdenCompraSessionBean();
		}
		
		if(this.estadodetalleordencompraSessionBean.getsUltimaBusquedaEstadoDetalleOrdenCompra()!=null&&!this.estadodetalleordencompraSessionBean.getsUltimaBusquedaEstadoDetalleOrdenCompra().equals("")) {
			this.setsAccionBusqueda(estadodetalleordencompraSessionBean.getsUltimaBusquedaEstadoDetalleOrdenCompra());
			this.setiNumeroPaginacion(estadodetalleordencompraSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadodetalleordencompraSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadodetalleordencompraSessionBean.setsUltimaBusquedaEstadoDetalleOrdenCompra("");
		this.estadodetalleordencompraSessionBean.setiNumeroPaginacion(EstadoDetalleOrdenCompraConstantesFunciones.INUMEROPAGINACION);
		this.estadodetalleordencompraSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoDetalleOrdenCompra(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoDetalleOrdenCompra() {
		this.updateBorderResaltarBusquedasFormularioEstadoDetalleOrdenCompra();
		this.updateVisibilidadBusquedasFormularioEstadoDetalleOrdenCompra();
		this.updateHabilitarBusquedasFormularioEstadoDetalleOrdenCompra();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoDetalleOrdenCompra() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoDetalleOrdenCompra() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoDetalleOrdenCompra() {
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
	
	public void updateControlesFormularioEstadoDetalleOrdenCompra() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoDetalleOrdenCompra();
		this.updateVisibilidadResaltarControlesFormularioEstadoDetalleOrdenCompra();
		this.updateHabilitarResaltarControlesFormularioEstadoDetalleOrdenCompra();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoDetalleOrdenCompra() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadodetalleordencompraConstantesFunciones.resaltaridEstadoDetalleOrdenCompra!=null && this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) {this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTextFieldidEstadoDetalleOrdenCompra.setBorder(this.estadodetalleordencompraConstantesFunciones.resaltaridEstadoDetalleOrdenCompra);}
		if(this.estadodetalleordencompraConstantesFunciones.resaltarcodigoEstadoDetalleOrdenCompra!=null && this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) {this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTextFieldcodigoEstadoDetalleOrdenCompra.setBorder(this.estadodetalleordencompraConstantesFunciones.resaltarcodigoEstadoDetalleOrdenCompra);}
		if(this.estadodetalleordencompraConstantesFunciones.resaltarnombreEstadoDetalleOrdenCompra!=null && this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) {this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTextAreanombreEstadoDetalleOrdenCompra.setBorder(this.estadodetalleordencompraConstantesFunciones.resaltarnombreEstadoDetalleOrdenCompra);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoDetalleOrdenCompra() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) {
	
		//this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTextFieldidEstadoDetalleOrdenCompra.setVisible(this.estadodetalleordencompraConstantesFunciones.mostraridEstadoDetalleOrdenCompra);
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jPanelidEstadoDetalleOrdenCompra.setVisible(this.estadodetalleordencompraConstantesFunciones.mostraridEstadoDetalleOrdenCompra);
		//this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTextFieldcodigoEstadoDetalleOrdenCompra.setVisible(this.estadodetalleordencompraConstantesFunciones.mostrarcodigoEstadoDetalleOrdenCompra);
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jPanelcodigoEstadoDetalleOrdenCompra.setVisible(this.estadodetalleordencompraConstantesFunciones.mostrarcodigoEstadoDetalleOrdenCompra);
		//this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTextAreanombreEstadoDetalleOrdenCompra.setVisible(this.estadodetalleordencompraConstantesFunciones.mostrarnombreEstadoDetalleOrdenCompra);
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jPanelnombreEstadoDetalleOrdenCompra.setVisible(this.estadodetalleordencompraConstantesFunciones.mostrarnombreEstadoDetalleOrdenCompra);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoDetalleOrdenCompra() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra!=null) {
	
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTextFieldidEstadoDetalleOrdenCompra.setEnabled(this.estadodetalleordencompraConstantesFunciones.activaridEstadoDetalleOrdenCompra);
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTextFieldcodigoEstadoDetalleOrdenCompra.setEnabled(this.estadodetalleordencompraConstantesFunciones.activarcodigoEstadoDetalleOrdenCompra);
		this.jInternalFrameDetalleFormEstadoDetalleOrdenCompra.jTextAreanombreEstadoDetalleOrdenCompra.setEnabled(this.estadodetalleordencompraConstantesFunciones.activarnombreEstadoDetalleOrdenCompra);
		}
	}
	
		
}