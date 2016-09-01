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

import com.bydan.erp.inventario.util.EstadoDetalleInventarioConstantesFunciones;
import com.bydan.erp.inventario.util.EstadoDetalleInventarioParameterReturnGeneral;
//import com.bydan.erp.inventario.util.EstadoDetalleInventarioParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.EstadoDetalleInventarioBean;
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
public class EstadoDetalleInventarioBeanSwingJInternalFrame extends EstadoDetalleInventarioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoDetalleInventarioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoDetalleInventario> estadodetalleinventarioValidator = new ClassValidator<EstadoDetalleInventario>(EstadoDetalleInventario.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoDetalleInventario estadodetalleinventario;	
	public EstadoDetalleInventario estadodetalleinventarioAux;
	public EstadoDetalleInventario estadodetalleinventarioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoDetalleInventario estadodetalleinventarioTotales;
	public Long idEstadoDetalleInventarioActual;
	public Long iIdNuevoEstadoDetalleInventario=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosDetalleCompra=false;

	public Boolean getIsTienePermisosDetalleCompra() {
		return isTienePermisosDetalleCompra;
	}

	public void setIsTienePermisosDetalleCompra(Boolean isTienePermisosDetalleCompra) {
		this.isTienePermisosDetalleCompra= isTienePermisosDetalleCompra;
	}


	public Boolean isTienePermisosDetalleTransferencia=false;

	public Boolean getIsTienePermisosDetalleTransferencia() {
		return isTienePermisosDetalleTransferencia;
	}

	public void setIsTienePermisosDetalleTransferencia(Boolean isTienePermisosDetalleTransferencia) {
		this.isTienePermisosDetalleTransferencia= isTienePermisosDetalleTransferencia;
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
	
	public Boolean isPermisoTodoEstadoDetalleInventario;
	public Boolean isPermisoNuevoEstadoDetalleInventario;
	public Boolean isPermisoActualizarEstadoDetalleInventario;
	public Boolean isPermisoActualizarOriginalEstadoDetalleInventario;
	public Boolean isPermisoEliminarEstadoDetalleInventario;
	public Boolean isPermisoGuardarCambiosEstadoDetalleInventario;
	public Boolean isPermisoConsultaEstadoDetalleInventario;
	public Boolean isPermisoBusquedaEstadoDetalleInventario;
	public Boolean isPermisoReporteEstadoDetalleInventario;
	public Boolean isPermisoPaginacionMedioEstadoDetalleInventario;
	public Boolean isPermisoPaginacionAltoEstadoDetalleInventario;
	public Boolean isPermisoPaginacionTodoEstadoDetalleInventario;
	public Boolean isPermisoCopiarEstadoDetalleInventario;
	public Boolean isPermisoVerFormEstadoDetalleInventario;
	public Boolean isPermisoDuplicarEstadoDetalleInventario;
	public Boolean isPermisoOrdenEstadoDetalleInventario;
	
	
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
	
	public EstadoDetalleInventarioParameterReturnGeneral estadodetalleinventarioReturnGeneral;
	public EstadoDetalleInventarioParameterReturnGeneral estadodetalleinventarioParameterGeneral;
	
	

	public DetalleCompraLogic detallecompraLogic=null;

	public DetalleCompraLogic getDetalleCompraLogic() {
		return detallecompraLogic;
	}

	public void setDetalleCompraLogic(DetalleCompraLogic detallecompraLogic) {
		this.detallecompraLogic = detallecompraLogic;
	}


	public DetalleTransferenciaLogic detalletransferenciaLogic=null;

	public DetalleTransferenciaLogic getDetalleTransferenciaLogic() {
		return detalletransferenciaLogic;
	}

	public void setDetalleTransferenciaLogic(DetalleTransferenciaLogic detalletransferenciaLogic) {
		this.detalletransferenciaLogic = detalletransferenciaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoDetalleInventario=false;
	public Boolean esParaAccionDesdeFormularioEstadoDetalleInventario=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadoDetalleInventarioSessionBeanAdditional estadodetalleinventarioSessionBeanAdditional=null;
	
	public EstadoDetalleInventarioSessionBeanAdditional getEstadoDetalleInventarioSessionBeanAdditional() {
		return this.estadodetalleinventarioSessionBeanAdditional;
	}
	
	public void setEstadoDetalleInventarioSessionBeanAdditional(EstadoDetalleInventarioSessionBeanAdditional estadodetalleinventarioSessionBeanAdditional) {
		try {
			this.estadodetalleinventarioSessionBeanAdditional=estadodetalleinventarioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadoDetalleInventarioBeanSwingJInternalFrameAdditional estadodetalleinventarioBeanSwingJInternalFrameAdditional=null;
	//public class EstadoDetalleInventarioBeanSwingJInternalFrame
	
	public EstadoDetalleInventarioBeanSwingJInternalFrameAdditional getEstadoDetalleInventarioBeanSwingJInternalFrameAdditional() {
		return this.estadodetalleinventarioBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadoDetalleInventarioBeanSwingJInternalFrameAdditional(EstadoDetalleInventarioBeanSwingJInternalFrameAdditional estadodetalleinventarioBeanSwingJInternalFrameAdditional) {
		try {
			this.estadodetalleinventarioBeanSwingJInternalFrameAdditional=estadodetalleinventarioBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoDetalleInventarioLogic estadodetalleinventarioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoDetalleInventario estadodetalleinventarioBean;
	public EstadoDetalleInventarioConstantesFunciones estadodetalleinventarioConstantesFunciones;
	//public EstadoDetalleInventarioParameterReturnGeneral estadodetalleinventarioReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoDetalleInventario> estadodetalleinventarios;	
	//public List<EstadoDetalleInventario> estadodetalleinventariosEliminados;
	//public List<EstadoDetalleInventario> estadodetalleinventariosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoDetalleInventario=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoDetalleInventario=true;
	public Boolean isVisibilidadCeldaCopiarEstadoDetalleInventario=true;
	public Boolean isVisibilidadCeldaVerFormEstadoDetalleInventario=true;
	public Boolean isVisibilidadCeldaOrdenEstadoDetalleInventario=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoDetalleInventario=false;
	public Boolean isVisibilidadCeldaModificarEstadoDetalleInventario=false;
	public Boolean isVisibilidadCeldaActualizarEstadoDetalleInventario=false;
	public Boolean isVisibilidadCeldaEliminarEstadoDetalleInventario=false;
	public Boolean isVisibilidadCeldaCancelarEstadoDetalleInventario=false;
	public Boolean isVisibilidadCeldaGuardarEstadoDetalleInventario=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoDetalleInventario=false;	
	
	
	
	public Long getiIdNuevoEstadoDetalleInventario() {
		return this.iIdNuevoEstadoDetalleInventario;
	}

	public void setiIdNuevoEstadoDetalleInventario(Long iIdNuevoEstadoDetalleInventario) {
		this.iIdNuevoEstadoDetalleInventario = iIdNuevoEstadoDetalleInventario;
	}
	
	public Long getidEstadoDetalleInventarioActual() {
		return this.idEstadoDetalleInventarioActual;
	}

	public void setidEstadoDetalleInventarioActual(Long idEstadoDetalleInventarioActual) {
		this.idEstadoDetalleInventarioActual = idEstadoDetalleInventarioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoDetalleInventario getestadodetalleinventario() {
		return this.estadodetalleinventario;
	}

	public void setestadodetalleinventario(EstadoDetalleInventario estadodetalleinventario) {
		this.estadodetalleinventario = estadodetalleinventario;
	}
	
	public EstadoDetalleInventario getestadodetalleinventarioAux() {
		return this.estadodetalleinventarioAux;
	}

	public void setestadodetalleinventarioAux(EstadoDetalleInventario estadodetalleinventarioAux) {
		this.estadodetalleinventarioAux = estadodetalleinventarioAux;
	}				
	
	public EstadoDetalleInventario getestadodetalleinventarioAnterior() {
		return this.estadodetalleinventarioAnterior;
	}

	public void setestadodetalleinventarioAnterior(EstadoDetalleInventario estadodetalleinventarioAnterior) {
		this.estadodetalleinventarioAnterior = estadodetalleinventarioAnterior;
	}	
	
	public EstadoDetalleInventario getestadodetalleinventarioTotales() {
		return this.estadodetalleinventarioTotales;
	}

	public void setestadodetalleinventarioTotales(EstadoDetalleInventario estadodetalleinventarioTotales) {
		this.estadodetalleinventarioTotales = estadodetalleinventarioTotales;
	}	
	
	public EstadoDetalleInventario getestadodetalleinventarioBean() {
		return this.estadodetalleinventarioBean;
	}

	public void setestadodetalleinventarioBean(EstadoDetalleInventario estadodetalleinventarioBean) {
		this.estadodetalleinventarioBean = estadodetalleinventarioBean;
	}	
	
	public EstadoDetalleInventarioParameterReturnGeneral getestadodetalleinventarioReturnGeneral() {
		return this.estadodetalleinventarioReturnGeneral;
	}

	public void setestadodetalleinventarioReturnGeneral(EstadoDetalleInventarioParameterReturnGeneral estadodetalleinventarioReturnGeneral) {
		this.estadodetalleinventarioReturnGeneral = estadodetalleinventarioReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoDetalleInventarioLogic getEstadoDetalleInventarioLogic()	{		
		return estadodetalleinventarioLogic;
	}

	public void setEstadoDetalleInventarioLogic(EstadoDetalleInventarioLogic estadodetalleinventarioLogic) {
		this.estadodetalleinventarioLogic = estadodetalleinventarioLogic;
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
	
	public Boolean getIsEsNuevoEstadoDetalleInventario() {
		return isEsNuevoEstadoDetalleInventario;
	}

	public void setIsEsNuevoEstadoDetalleInventario(Boolean isEsNuevoEstadoDetalleInventario) {
		this.isEsNuevoEstadoDetalleInventario = isEsNuevoEstadoDetalleInventario;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoDetalleInventario() {
		return esParaAccionDesdeFormularioEstadoDetalleInventario;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoDetalleInventario(Boolean esParaAccionDesdeFormularioEstadoDetalleInventario) {
		this.esParaAccionDesdeFormularioEstadoDetalleInventario = esParaAccionDesdeFormularioEstadoDetalleInventario;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoDetalleInventario() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoDetalleInventarioConstantesFunciones.refrescarForeignKeysDescripcionesEstadoDetalleInventario(this.estadodetalleinventarioLogic.getEstadoDetalleInventarios());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoDetalleInventarioConstantesFunciones.refrescarForeignKeysDescripcionesEstadoDetalleInventario(this.estadodetalleinventarios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadodetalleinventarioLogic.setEstadoDetalleInventarios(this.estadodetalleinventarios);
			estadodetalleinventarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoDetalleInventarioParameterReturnGeneral getEstadoDetalleInventarioParameterGeneral() {
		return this.estadodetalleinventarioParameterGeneral;
	}
	
	public void setEstadoDetalleInventarioParameterGeneral(EstadoDetalleInventarioParameterReturnGeneral estadodetalleinventarioParameterGeneral) {
		this.estadodetalleinventarioParameterGeneral = estadodetalleinventarioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoDetalleInventario() {
		return isPermisoTodoEstadoDetalleInventario;
	}

	public void setIsPermisoTodoEstadoDetalleInventario(Boolean isPermisoTodoEstadoDetalleInventario) {
		this.isPermisoTodoEstadoDetalleInventario = isPermisoTodoEstadoDetalleInventario;
	}

	public Boolean getIsPermisoNuevoEstadoDetalleInventario() {
		return isPermisoNuevoEstadoDetalleInventario;
	}

	public void setIsPermisoNuevoEstadoDetalleInventario(Boolean isPermisoNuevoEstadoDetalleInventario) {
		this.isPermisoNuevoEstadoDetalleInventario = isPermisoNuevoEstadoDetalleInventario;
	}

	public Boolean getIsPermisoActualizarEstadoDetalleInventario() {
		return isPermisoActualizarEstadoDetalleInventario;
	}

	public void setIsPermisoActualizarEstadoDetalleInventario(Boolean isPermisoActualizarEstadoDetalleInventario) {
		this.isPermisoActualizarEstadoDetalleInventario = isPermisoActualizarEstadoDetalleInventario;
	}

	public Boolean getIsPermisoEliminarEstadoDetalleInventario() {
		return isPermisoEliminarEstadoDetalleInventario;
	}

	public void setIsPermisoEliminarEstadoDetalleInventario(Boolean isPermisoEliminarEstadoDetalleInventario) {
		this.isPermisoEliminarEstadoDetalleInventario = isPermisoEliminarEstadoDetalleInventario;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoDetalleInventario() {
		return isPermisoGuardarCambiosEstadoDetalleInventario;
	}

	public void setIsPermisoGuardarCambiosEstadoDetalleInventario(Boolean isPermisoGuardarCambiosEstadoDetalleInventario) {
		this.isPermisoGuardarCambiosEstadoDetalleInventario = isPermisoGuardarCambiosEstadoDetalleInventario;
	}
	
	public Boolean getIsPermisoConsultaEstadoDetalleInventario() {
		return isPermisoConsultaEstadoDetalleInventario;
	}

	public void setIsPermisoConsultaEstadoDetalleInventario(Boolean isPermisoConsultaEstadoDetalleInventario) {
		this.isPermisoConsultaEstadoDetalleInventario = isPermisoConsultaEstadoDetalleInventario;
	}

	public Boolean getIsPermisoBusquedaEstadoDetalleInventario() {
		return isPermisoBusquedaEstadoDetalleInventario;
	}

	public void setIsPermisoBusquedaEstadoDetalleInventario(Boolean isPermisoBusquedaEstadoDetalleInventario) {
		this.isPermisoBusquedaEstadoDetalleInventario = isPermisoBusquedaEstadoDetalleInventario;
	}

	public Boolean getIsPermisoReporteEstadoDetalleInventario() {
		return isPermisoReporteEstadoDetalleInventario;
	}

	public void setIsPermisoReporteEstadoDetalleInventario(Boolean isPermisoReporteEstadoDetalleInventario) {
		this.isPermisoReporteEstadoDetalleInventario = isPermisoReporteEstadoDetalleInventario;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoDetalleInventario() {
		return isPermisoPaginacionMedioEstadoDetalleInventario;
	}

	public void setIsPermisoPaginacionMedioEstadoDetalleInventario(Boolean isPermisoPaginacionMedioEstadoDetalleInventario) {
		this.isPermisoPaginacionMedioEstadoDetalleInventario = isPermisoPaginacionMedioEstadoDetalleInventario;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoDetalleInventario() {
		return isPermisoPaginacionTodoEstadoDetalleInventario;
	}

	public void setIsPermisoPaginacionTodoEstadoDetalleInventario(Boolean isPermisoPaginacionTodoEstadoDetalleInventario) {
		this.isPermisoPaginacionTodoEstadoDetalleInventario = isPermisoPaginacionTodoEstadoDetalleInventario;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoDetalleInventario() {
		return isPermisoPaginacionAltoEstadoDetalleInventario;
	}

	public void setIsPermisoPaginacionAltoEstadoDetalleInventario(Boolean isPermisoPaginacionAltoEstadoDetalleInventario) {
		this.isPermisoPaginacionAltoEstadoDetalleInventario = isPermisoPaginacionAltoEstadoDetalleInventario;
	}
	
	public Boolean getIsPermisoCopiarEstadoDetalleInventario() {
		return isPermisoCopiarEstadoDetalleInventario;
	}

	public void setIsPermisoCopiarEstadoDetalleInventario(Boolean isPermisoCopiarEstadoDetalleInventario) {
		this.isPermisoCopiarEstadoDetalleInventario = isPermisoCopiarEstadoDetalleInventario;
	}
	
	public Boolean getIsPermisoVerFormEstadoDetalleInventario() {
		return isPermisoVerFormEstadoDetalleInventario;
	}

	public void setIsPermisoVerFormEstadoDetalleInventario(Boolean isPermisoVerFormEstadoDetalleInventario) {
		this.isPermisoVerFormEstadoDetalleInventario = isPermisoVerFormEstadoDetalleInventario;
	}
	
	public Boolean getIsPermisoDuplicarEstadoDetalleInventario() {
		return isPermisoDuplicarEstadoDetalleInventario;
	}

	public void setIsPermisoDuplicarEstadoDetalleInventario(Boolean isPermisoDuplicarEstadoDetalleInventario) {
		this.isPermisoDuplicarEstadoDetalleInventario = isPermisoDuplicarEstadoDetalleInventario;
	}
	
	public Boolean getIsPermisoOrdenEstadoDetalleInventario() {
		return isPermisoOrdenEstadoDetalleInventario;
	}

	public void setIsPermisoOrdenEstadoDetalleInventario(Boolean isPermisoOrdenEstadoDetalleInventario) {
		this.isPermisoOrdenEstadoDetalleInventario = isPermisoOrdenEstadoDetalleInventario;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoDetalleInventario() {
		return isVisibilidadCeldaNuevoEstadoDetalleInventario;
	}

	public void setIsVisibilidadCeldaNuevoEstadoDetalleInventario(Boolean isVisibilidadCeldaNuevoEstadoDetalleInventario) {
		this.isVisibilidadCeldaNuevoEstadoDetalleInventario = isVisibilidadCeldaNuevoEstadoDetalleInventario;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoDetalleInventario() {
		return isVisibilidadCeldaDuplicarEstadoDetalleInventario;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoDetalleInventario(Boolean isVisibilidadCeldaDuplicarEstadoDetalleInventario) {
		this.isVisibilidadCeldaDuplicarEstadoDetalleInventario = isVisibilidadCeldaDuplicarEstadoDetalleInventario;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoDetalleInventario() {
		return isVisibilidadCeldaCopiarEstadoDetalleInventario;
	}

	public void setIsVisibilidadCeldaCopiarEstadoDetalleInventario(Boolean isVisibilidadCeldaCopiarEstadoDetalleInventario) {
		this.isVisibilidadCeldaCopiarEstadoDetalleInventario = isVisibilidadCeldaCopiarEstadoDetalleInventario;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoDetalleInventario() {
		return isVisibilidadCeldaVerFormEstadoDetalleInventario;
	}

	public void setIsVisibilidadCeldaVerFormEstadoDetalleInventario(Boolean isVisibilidadCeldaVerFormEstadoDetalleInventario) {
		this.isVisibilidadCeldaVerFormEstadoDetalleInventario = isVisibilidadCeldaVerFormEstadoDetalleInventario;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoDetalleInventario() {
		return isVisibilidadCeldaOrdenEstadoDetalleInventario;
	}

	public void setIsVisibilidadCeldaOrdenEstadoDetalleInventario(Boolean isVisibilidadCeldaOrdenEstadoDetalleInventario) {
		this.isVisibilidadCeldaOrdenEstadoDetalleInventario = isVisibilidadCeldaOrdenEstadoDetalleInventario;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoDetalleInventario() {
		return isVisibilidadCeldaNuevoRelacionesEstadoDetalleInventario;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoDetalleInventario(Boolean isVisibilidadCeldaNuevoRelacionesEstadoDetalleInventario) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleInventario = isVisibilidadCeldaNuevoRelacionesEstadoDetalleInventario;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoDetalleInventario() {
		return isVisibilidadCeldaModificarEstadoDetalleInventario;
	}

	public void setIsVisibilidadCeldaModificarEstadoDetalleInventario(Boolean isVisibilidadCeldaModificarEstadoDetalleInventario) {
		this.isVisibilidadCeldaModificarEstadoDetalleInventario = isVisibilidadCeldaModificarEstadoDetalleInventario;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoDetalleInventario() {
		return isVisibilidadCeldaActualizarEstadoDetalleInventario;
	}

	public void setIsVisibilidadCeldaActualizarEstadoDetalleInventario(Boolean isVisibilidadCeldaActualizarEstadoDetalleInventario) {
		this.isVisibilidadCeldaActualizarEstadoDetalleInventario = isVisibilidadCeldaActualizarEstadoDetalleInventario;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoDetalleInventario() {
		return isVisibilidadCeldaEliminarEstadoDetalleInventario;
	}

	public void setIsVisibilidadCeldaEliminarEstadoDetalleInventario(Boolean isVisibilidadCeldaEliminarEstadoDetalleInventario) {
		this.isVisibilidadCeldaEliminarEstadoDetalleInventario = isVisibilidadCeldaEliminarEstadoDetalleInventario;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoDetalleInventario() {
		return isVisibilidadCeldaCancelarEstadoDetalleInventario;
	}

	public void setIsVisibilidadCeldaCancelarEstadoDetalleInventario(Boolean isVisibilidadCeldaCancelarEstadoDetalleInventario) {
		this.isVisibilidadCeldaCancelarEstadoDetalleInventario = isVisibilidadCeldaCancelarEstadoDetalleInventario;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoDetalleInventario() {
		return isVisibilidadCeldaGuardarEstadoDetalleInventario;
	}

	public void setIsVisibilidadCeldaGuardarEstadoDetalleInventario(Boolean isVisibilidadCeldaGuardarEstadoDetalleInventario) {
		this.isVisibilidadCeldaGuardarEstadoDetalleInventario = isVisibilidadCeldaGuardarEstadoDetalleInventario;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoDetalleInventario() {
		return isVisibilidadCeldaGuardarCambiosEstadoDetalleInventario;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoDetalleInventario(Boolean isVisibilidadCeldaGuardarCambiosEstadoDetalleInventario) {
		this.isVisibilidadCeldaGuardarCambiosEstadoDetalleInventario = isVisibilidadCeldaGuardarCambiosEstadoDetalleInventario;
	}
		
	public EstadoDetalleInventarioSessionBean getestadodetalleinventarioSessionBean() {
		return this.estadodetalleinventarioSessionBean;
	}
	
	public void setestadodetalleinventarioSessionBean(EstadoDetalleInventarioSessionBean estadodetalleinventarioSessionBean) {
		this.estadodetalleinventarioSessionBean=estadodetalleinventarioSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleInventario(EstadoDetalleInventario estadodetalleinventario)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoDetalleInventario estadodetalleinventario,EstadoDetalleInventario estadodetalleinventarioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoDetalleInventario(estadodetalleinventario);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadodetalleinventarioAux.setId(estadodetalleinventario.getId());
		estadodetalleinventarioAux.setVersionRow(estadodetalleinventario.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoDetalleInventario();
		
			int intSelectedRow = this.jTableDatosEstadoDetalleInventario.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventario =(EstadoDetalleInventario) this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadodetalleinventario =(EstadoDetalleInventario) this.estadodetalleinventarios.toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoDetalleInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoDetalleInventario(this.estadodetalleinventario,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleInventario(this.estadodetalleinventario);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadodetalleinventarioValidator.getInvalidValues(this.estadodetalleinventario);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadodetalleinventarioLogic.setDatosCliente(datosCliente);
			estadodetalleinventarioLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadodetalleinventarioAux=new  EstadoDetalleInventario();
				
				estadodetalleinventarioAux.setIsNew(true);
				estadodetalleinventarioAux.setIsChanged(true);
				
				estadodetalleinventarioAux.setEstadoDetalleInventarioOriginal(this.estadodetalleinventario);
				
				estadodetalleinventarioAux.setId(this.estadodetalleinventario.getId());	
				estadodetalleinventarioAux.setVersionRow(this.estadodetalleinventario.getVersionRow());	
				estadodetalleinventarioAux.setcodigo(this.estadodetalleinventario.getcodigo());	
				estadodetalleinventarioAux.setnombre(this.estadodetalleinventario.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadodetalleinventarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadodetalleinventarioAux,estadodetalleinventarioLogic.getEstadoDetalleInventarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetalleinventarioAux,estadodetalleinventarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadodetalleinventarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetalleinventarioLogic.saveEstadoDetalleInventarios();//WithConnection
						//estadodetalleinventarioLogic.getSetVersionRowEstadoDetalleInventarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadodetalleinventario,estadodetalleinventarioAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadodetalleinventarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecompraLogic.getDetalleCompras().addAll(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecomprasEliminados);
							this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.getDetalleTransferencias().addAll(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecompras.addAll(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecomprasEliminados);
							this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferencias.addAll(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadodetalleinventarioLogic.saveEstadoDetalleInventarioRelaciones(estadodetalleinventarioAux,this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecompraLogic.getDetalleCompras(),this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.getDetalleTransferencias());//WithConnection
								//estadodetalleinventarioLogic.getSetVersionRowEstadoDetalleInventarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadodetalleinventario,estadodetalleinventarioAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecompraLogic.setDetalleCompras(new ArrayList<DetalleCompra>());
							this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.setDetalleTransferencias(new ArrayList<DetalleTransferencia>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecompras= new ArrayList<DetalleCompra>();
							this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferencias= new ArrayList<DetalleTransferencia>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodetalleinventarioAux.setDetalleCompras(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecompraLogic.getDetalleCompras());

							if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodetalleinventarioAux.setDetalleTransferencias(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.getDetalleTransferencias());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadodetalleinventarioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadodetalleinventarioAux,estadodetalleinventarioLogic.getEstadoDetalleInventarios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadodetalleinventarioAux,estadodetalleinventarios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadodetalleinventario,estadodetalleinventarioAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadodetalleinventarioAux=new  EstadoDetalleInventario();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado() 
					|| (this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado() && this.estadodetalleinventario.getId()>=0)) {
						
					estadodetalleinventarioAux.setIsNew(false);
				}
				
				estadodetalleinventarioAux.setIsDeleted(false);
			
				estadodetalleinventarioAux.setId(this.estadodetalleinventario.getId());	
				estadodetalleinventarioAux.setVersionRow(this.estadodetalleinventario.getVersionRow());	
				estadodetalleinventarioAux.setcodigo(this.estadodetalleinventario.getcodigo());	
				estadodetalleinventarioAux.setnombre(this.estadodetalleinventario.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadodetalleinventarioAux,estadodetalleinventarioLogic.getEstadoDetalleInventarios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetalleinventarioAux,estadodetalleinventarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadodetalleinventarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetalleinventarioLogic.saveEstadoDetalleInventarios();//WithConnection
						//estadodetalleinventarioLogic.getSetVersionRowEstadoDetalleInventarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadodetalleinventario,estadodetalleinventarioAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadodetalleinventarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecompraLogic.getDetalleCompras().addAll(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecomprasEliminados);
							this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.getDetalleTransferencias().addAll(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecompras.addAll(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecomprasEliminados);
							this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferencias.addAll(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadodetalleinventarioLogic.saveEstadoDetalleInventarioRelaciones(estadodetalleinventarioAux,this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecompraLogic.getDetalleCompras(),this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.getDetalleTransferencias());//WithConnection
								//estadodetalleinventarioLogic.getSetVersionRowEstadoDetalleInventarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadodetalleinventario,estadodetalleinventarioAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecompraLogic.setDetalleCompras(new ArrayList<DetalleCompra>());
							this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.setDetalleTransferencias(new ArrayList<DetalleTransferencia>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecompras= new ArrayList<DetalleCompra>();
							this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferencias= new ArrayList<DetalleTransferencia>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodetalleinventarioAux.setDetalleCompras(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecompraLogic.getDetalleCompras());

							if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodetalleinventarioAux.setDetalleTransferencias(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.getDetalleTransferencias());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadodetalleinventarioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadodetalleinventarioAux,estadodetalleinventarioLogic.getEstadoDetalleInventarios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadodetalleinventarioAux,estadodetalleinventarios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadodetalleinventario,estadodetalleinventarioAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadodetalleinventarioAux=new  EstadoDetalleInventario();
				
				estadodetalleinventarioAux.setIsNew(false);
				estadodetalleinventarioAux.setIsChanged(false);
				
				estadodetalleinventarioAux.setIsDeleted(true);
				
				estadodetalleinventarioAux.setId(this.estadodetalleinventario.getId());	
				estadodetalleinventarioAux.setVersionRow(this.estadodetalleinventario.getVersionRow());	
				estadodetalleinventarioAux.setcodigo(this.estadodetalleinventario.getcodigo());	
				estadodetalleinventarioAux.setnombre(this.estadodetalleinventario.getnombre());	
				
				if(this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadodetalleinventarioAux.getId()>=0) {	
						this.estadodetalleinventariosEliminados.add(estadodetalleinventarioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadodetalleinventarioAux,estadodetalleinventarioLogic.getEstadoDetalleInventarios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetalleinventarioAux,estadodetalleinventarios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadodetalleinventarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetalleinventarioLogic.saveEstadoDetalleInventarios();//WithConnection
						//estadodetalleinventarioLogic.getSetVersionRowEstadoDetalleInventarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadodetalleinventarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecompraLogic.getDetalleCompras().addAll(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecomprasEliminados);
							this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.getDetalleTransferencias().addAll(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecompras.addAll(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecomprasEliminados);
							this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferencias.addAll(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadodetalleinventarioLogic.saveEstadoDetalleInventarioRelaciones(estadodetalleinventarioAux,this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecompraLogic.getDetalleCompras(),this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.getDetalleTransferencias());//WithConnection
								//estadodetalleinventarioLogic.getSetVersionRowEstadoDetalleInventarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecompraLogic.setDetalleCompras(new ArrayList<DetalleCompra>());
							this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.setDetalleTransferencias(new ArrayList<DetalleTransferencia>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecompras= new ArrayList<DetalleCompra>();
							this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferencias= new ArrayList<DetalleTransferencia>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodetalleinventarioAux.setDetalleCompras(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecompraLogic.getDetalleCompras());

							if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodetalleinventarioAux.setDetalleTransferencias(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.getDetalleTransferencias());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadodetalleinventarioSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadodetalleinventarioAux,estadodetalleinventarioLogic.getEstadoDetalleInventarios());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadodetalleinventarioAux,estadodetalleinventarios);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().addAll(this.estadodetalleinventariosEliminados);
					
					estadodetalleinventarioLogic.saveEstadoDetalleInventarios();//WithConnection
					//estadodetalleinventarioLogic.getSetVersionRowEstadoDetalleInventarios();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadodetalleinventariosEliminados= new ArrayList<EstadoDetalleInventario>();		
			}
			
			if(this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Detalle Inventario GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Detalle Inventario",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadodetalleinventario=estadodetalleinventarioAux;
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
      		//this.finishProcessEstadoDetalleInventario();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoDetalleInventario estadodetalleinventarioLocal) throws Exception {
		
		if(this.estadodetalleinventarioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadodetalleinventarioLocal.setDetalleCompras(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecompraLogic.getDetalleCompras());
				estadodetalleinventarioLocal.setDetalleTransferencias(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.getDetalleTransferencias());
			
			} else {
			
				estadodetalleinventarioLocal.setDetalleCompras(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecompras);
				estadodetalleinventarioLocal.setDetalleTransferencias(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferencias);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoDetalleInventario estadodetalleinventarioLocal) throws Exception {	
		if(this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoDetalleInventarioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoDetalleInventario.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadodetalleinventario =(EstadoDetalleInventario) this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadodetalleinventario =(EstadoDetalleInventario) this.estadodetalleinventarios.toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadodetalleinventarioValidator.getInvalidValues(this.estadodetalleinventario);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoDetalleInventario estadodetalleinventario,List<EstadoDetalleInventario> estadodetalleinventarios) throws Exception {
		try	{		
			EstadoDetalleInventarioConstantesFunciones.actualizarLista(estadodetalleinventario,estadodetalleinventarios,this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoDetalleInventario estadodetalleinventario,List<EstadoDetalleInventario> estadodetalleinventarios) throws Exception {
		try	{			
			EstadoDetalleInventarioConstantesFunciones.actualizarSelectedLista(estadodetalleinventario,estadodetalleinventarios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoDetalleInventario> estadodetalleinventariosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadodetalleinventariosLocal=this.estadodetalleinventarioLogic.getEstadoDetalleInventarios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadodetalleinventariosLocal=this.estadodetalleinventarios;
			}
			//ARCHITECTURE
		
			for(EstadoDetalleInventario estadodetalleinventarioLocal:estadodetalleinventariosLocal) {
				if(this.permiteMantenimiento(estadodetalleinventarioLocal) && estadodetalleinventarioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoDetalleInventarioConstantesFunciones.getEstadoDetalleInventarioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoDetalleInventarioConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleInventario.jLabelcodigoEstadoDetalleInventario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoDetalleInventarioConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleInventario.jLabelnombreEstadoDetalleInventario,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoDetalleInventario.jLabelcodigoEstadoDetalleInventario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoDetalleInventario.jLabelnombreEstadoDetalleInventario,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleCompra")) {
			if(this.estadodetalleinventario==null) {
				this.estadodetalleinventario= new EstadoDetalleInventario();
			}

			if(this.estadodetalleinventarioSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoDetalleInventario
				this.setVariablesFormularioToObjetoActualEstadoDetalleInventario(this.estadodetalleinventario,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleInventario(this.estadodetalleinventario);

				this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.getdetallecompra().setEstadoDetalleInventario(this.estadodetalleinventario);
			}

			return;
		}
		 else  if(sTipo.equals("DetalleTransferencia")) {
			if(this.estadodetalleinventario==null) {
				this.estadodetalleinventario= new EstadoDetalleInventario();
			}

			if(this.estadodetalleinventarioSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoDetalleInventario
				this.setVariablesFormularioToObjetoActualEstadoDetalleInventario(this.estadodetalleinventario,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleInventario(this.estadodetalleinventario);

				this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.getdetalletransferencia().setEstadoDetalleInventario(this.estadodetalleinventario);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoDetalleInventario--;	
		
		
		this.estadodetalleinventarioAux=new EstadoDetalleInventario();
		
		this.estadodetalleinventarioAux.setId(this.iIdNuevoEstadoDetalleInventario);
		this.estadodetalleinventarioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().add(this.estadodetalleinventarioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadodetalleinventarios.add(this.estadodetalleinventarioAux);
		}
		//ARCHITECTURE
		
		this.estadodetalleinventario=this.estadodetalleinventarioAux;
		
		if(EstadoDetalleInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoDetalleInventario(this.estadodetalleinventario);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleInventario(this.estadodetalleinventario);
		}
				
		//this.setDefaultControlesEstadoDetalleInventario();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoDetalleInventario();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoDetalleInventario();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoDetalleInventario();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoDetalleInventario(this.estadodetalleinventarioBean,this.estadodetalleinventario,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleInventario(this.estadodetalleinventario);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadodetalleinventarioSessionBean.getConGuardarRelaciones()) {
			classes=EstadoDetalleInventarioConstantesFunciones.getClassesRelationshipsOfEstadoDetalleInventario(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadodetalleinventarioReturnGeneral=estadodetalleinventarioLogic.procesarEventosEstadoDetalleInventariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadodetalleinventarioLogic.getEstadoDetalleInventarios(),this.estadodetalleinventario,this.estadodetalleinventarioParameterGeneral,this.isEsNuevoEstadoDetalleInventario,classes);//this.estadodetalleinventarioLogic.getEstadoDetalleInventario()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoDetalleInventario(this.estadodetalleinventarioReturnGeneral,this.estadodetalleinventarioBean,false);
		
		if(this.estadodetalleinventarioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleInventario(this.estadodetalleinventarioReturnGeneral.getEstadoDetalleInventario());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoDetalleInventario(this.estadodetalleinventarioReturnGeneral.getEstadoDetalleInventario());
		}
		
		if(this.estadodetalleinventarioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoDetalleInventario(this.estadodetalleinventarioReturnGeneral.getEstadoDetalleInventario(),classes);//this.estadodetalleinventarioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoDetalleInventario(this.estadodetalleinventario,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoDetalleInventario();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoDetalleInventario();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.RecargarFormEstadoDetalleInventario(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoDetalleInventario(false);
						
			if(estadodetalleinventarioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecompraSessionBean.getEsGuardarRelacionado() && DetalleCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleCompraActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaSessionBean.getEsGuardarRelacionado() && DetalleTransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleTransferenciaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoDetalleInventarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoDetalleInventario();
			}
			
			this.actualizarVisualTableDatosEstadoDetalleInventario();
			
			this.jTableDatosEstadoDetalleInventario.setRowSelectionInterval(this.getIndiceNuevoEstadoDetalleInventario(), this.getIndiceNuevoEstadoDetalleInventario());
			
			this.seleccionarFilaTablaEstadoDetalleInventarioActual();
						
			this.actualizarEstadoCeldasBotonesEstadoDetalleInventario("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoDetalleInventario(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jTextFieldcodigoEstadoDetalleInventario.setEnabled(isHabilitar && this.estadodetalleinventarioConstantesFunciones.activarcodigoEstadoDetalleInventario);
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jTextAreanombreEstadoDetalleInventario.setEnabled(isHabilitar && this.estadodetalleinventarioConstantesFunciones.activarnombreEstadoDetalleInventario);	
		
	};
	
	public void setDefaultControlesEstadoDetalleInventario() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoDetalleInventario(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadodetalleinventarioSessionBean.setConGuardarRelaciones(true);			
			this.estadodetalleinventarioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jTabbedPaneRelacionesEstadoDetalleInventario.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecompraSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadodetalleinventarioSessionBean.setConGuardarRelaciones(false);			
			this.estadodetalleinventarioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jTabbedPaneRelacionesEstadoDetalleInventario.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecompraSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoDetalleInventario() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleInventario estadodetalleinventarioAux:this.estadodetalleinventarioLogic.getEstadoDetalleInventarios()) {
				if(estadodetalleinventarioAux.getId().equals(this.iIdNuevoEstadoDetalleInventario)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleInventario estadodetalleinventarioAux:this.estadodetalleinventarios) {
				if(estadodetalleinventarioAux.getId().equals(this.iIdNuevoEstadoDetalleInventario)) {
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
	
	public int getIndiceActualEstadoDetalleInventario(EstadoDetalleInventario estadodetalleinventario,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleInventario estadodetalleinventarioAux:this.estadodetalleinventarioLogic.getEstadoDetalleInventarios()) {
				if(estadodetalleinventarioAux.getId().equals(estadodetalleinventario.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleInventario estadodetalleinventarioAux:this.estadodetalleinventarios) {
				if(estadodetalleinventarioAux.getId().equals(estadodetalleinventario.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoDetalleInventario(EstadoDetalleInventario estadodetalleinventarioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleInventario estadodetalleinventarioAux:this.estadodetalleinventarioLogic.getEstadoDetalleInventarios()) {
				if(estadodetalleinventarioAux.getEstadoDetalleInventarioOriginal().getId().equals(estadodetalleinventarioOriginal.getId())) {
					existe=true;
					estadodetalleinventarioOriginal.setId(estadodetalleinventarioAux.getId());
					estadodetalleinventarioOriginal.setVersionRow(estadodetalleinventarioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleInventario estadodetalleinventarioAux:this.estadodetalleinventarios) {
				if(estadodetalleinventarioAux.getEstadoDetalleInventarioOriginal().getId().equals(estadodetalleinventarioOriginal.getId())) {
					existe=true;
					estadodetalleinventarioOriginal.setId(estadodetalleinventarioAux.getId());
					estadodetalleinventarioOriginal.setVersionRow(estadodetalleinventarioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoDetalleInventario(Boolean esParaCancelar) throws Exception {
		estadodetalleinventariosAux=new ArrayList<EstadoDetalleInventario>();
		estadodetalleinventarioAux=new EstadoDetalleInventario();
		
		if(!this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoDetalleInventario estadodetalleinventarioAux:this.estadodetalleinventarioLogic.getEstadoDetalleInventarios()) {
					if(estadodetalleinventarioAux.getId()<0) {
						estadodetalleinventariosAux.add(estadodetalleinventarioAux);
					}		
				}
				this.iIdNuevoEstadoDetalleInventario=0L;
				this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().removeAll(estadodetalleinventariosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetalleInventario estadodetalleinventarioAux:this.estadodetalleinventarios) {
					if(estadodetalleinventarioAux.getId()<0) {
						estadodetalleinventariosAux.add(estadodetalleinventarioAux);
					}		
				}
				this.iIdNuevoEstadoDetalleInventario=0L;
				this.estadodetalleinventarios.removeAll(estadodetalleinventariosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoDetalleInventario 
					&& this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().size()>0
					) {
					estadodetalleinventarioAux=this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().get(this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().size() - 1);
				
					if(estadodetalleinventarioAux.getId()<0) {
						this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().remove(estadodetalleinventarioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoDetalleInventario && this.estadodetalleinventarios.size()>0) {
					estadodetalleinventarioAux=this.estadodetalleinventarios.get(this.estadodetalleinventarios.size() - 1);
				
					if(estadodetalleinventarioAux.getId()<0) {
						this.estadodetalleinventarios.remove(estadodetalleinventarioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoDetalleInventario(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadodetalleinventario.getId()<0) {
				this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().remove(this.estadodetalleinventario);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadodetalleinventario.getId()<0) {
				this.estadodetalleinventarios.remove(this.estadodetalleinventario);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoDetalleInventario(List<EstadoDetalleInventario> estadodetalleinventariosAux) throws Exception {
		EstadoDetalleInventarioConstantesFunciones.setEstadosInicialesEstadoDetalleInventario(estadodetalleinventariosAux);
	}
	
	public void setEstadosInicialesEstadoDetalleInventario(EstadoDetalleInventario estadodetalleinventarioAux) throws Exception {
		EstadoDetalleInventarioConstantesFunciones.setEstadosInicialesEstadoDetalleInventario(estadodetalleinventarioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoDetalleInventarioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoDetalleInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoDetalleInventarioActual()) {
				if(!this.isEsNuevoEstadoDetalleInventario) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoDetalleInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoDetalleInventario=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoDetalleInventarioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Detalle Inventario ?", "MANTENIMIENTO DE Estado Detalle Inventario", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoDetalleInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoDetalleInventario estadodetalleinventario) throws Exception {
		EstadoDetalleInventarioConstantesFunciones.seleccionarAsignar(this.estadodetalleinventario,estadodetalleinventario);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoDetalleInventario=this.isPermisoActualizarOriginalEstadoDetalleInventario;
			
			
			this.seleccionarAsignar(estadodetalleinventario);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoDetalleInventarioConstantesFunciones.quitarEspaciosEstadoDetalleInventario(this.estadodetalleinventario,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoDetalleInventario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadodetalleinventarioSessionBean.setsFuncionBusquedaRapida(this.estadodetalleinventarioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoDetalleInventario) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoDetalleInventario(esParaCancelar);				
				this.cancelarNuevoEstadoDetalleInventario(esParaCancelar);								
			}
			
			this.estadodetalleinventario=new EstadoDetalleInventario();
			
			this.inicializarEstadoDetalleInventario();
			
			this.actualizarEstadoCeldasBotonesEstadoDetalleInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoDetalleInventario() throws Exception {
		try {
			EstadoDetalleInventarioConstantesFunciones.inicializarEstadoDetalleInventario(this.estadodetalleinventario);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoDetalleInventarios(String sAccionBusqueda,List<EstadoDetalleInventario> estadodetalleinventariosParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoDetalleInventario"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoDetalleInventarioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoDetalleInventarioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoDetalleInventario"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Detalle Inventarios");		
		parameters.put("busquedapor", EstadoDetalleInventarioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleCompra.class));
			classes.add(new Classe(DetalleTransferencia.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoDetalleInventarioLogic estadodetalleinventarioLogicAuxiliar=new EstadoDetalleInventarioLogic();
					estadodetalleinventarioLogicAuxiliar.setDatosCliente(estadodetalleinventarioLogic.getDatosCliente());				
					estadodetalleinventarioLogicAuxiliar.setEstadoDetalleInventarios(estadodetalleinventariosParaReportes);
					
					estadodetalleinventarioLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoDetalleInventarioWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadodetalleinventariosParaReportes=estadodetalleinventarioLogicAuxiliar.getEstadoDetalleInventarios();
					
					//estadodetalleinventarioLogic.getNewConnexionToDeep();
					
					//for (EstadoDetalleInventario estadodetalleinventario:estadodetalleinventariosParaReportes) {
					//	estadodetalleinventarioLogic.deepLoad(estadodetalleinventario, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadodetalleinventarioLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadodetalleinventarioLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleCompra = AuxiliarReportes.class.getResourceAsStream("DetalleCompraDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detallecompra", reportFileDetalleCompra);

			InputStream reportFileDetalleTransferencia = AuxiliarReportes.class.getResourceAsStream("DetalleTransferenciaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalletransferencia", reportFileDetalleTransferencia);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoDetalleInventario=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoDetalleInventarioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoDetalleInventarioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoDetalleInventario=new JRBeanArrayDataSource(EstadoDetalleInventarioJInternalFrame.TraerEstadoDetalleInventarioBeans(estadodetalleinventariosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoDetalleInventario);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoDetalleInventarioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoDetalleInventarioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoDetalleInventarioBean.TraerEstadoDetalleInventarioBeans(estadodetalleinventariosParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoDetalleInventarios(sAccionBusqueda,sTipoArchivoReporte,estadodetalleinventariosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoDetalleInventarios(sAccionBusqueda,sTipoArchivoReporte,estadodetalleinventariosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoDetalleInventarioActionPerformed(null);
					//this.generarExcelReporteEstadoDetalleInventarios(sAccionBusqueda,sTipoArchivoReporte,estadodetalleinventariosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoDetalleInventarios(sAccionBusqueda,sTipoArchivoReporte,estadodetalleinventariosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoDetalleInventarios(sAccionBusqueda,sTipoArchivoReporte,estadodetalleinventariosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoDetalleInventarios(sAccionBusqueda,sTipoArchivoReporte,estadodetalleinventariosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoDetalleInventarios(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoDetalleInventario> estadodetalleinventariosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleinventario";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoDetalleInventarios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoDetalleInventario("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoDetalleInventario estadodetalleinventario : estadodetalleinventariosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoDetalleInventarioConstantesFunciones.generarExcelReporteDataEstadoDetalleInventario("NORMAL",row,workbook,estadodetalleinventario,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Inventario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoDetalleInventario(String sTipo,Row row,Workbook workbook) {
		
		EstadoDetalleInventarioConstantesFunciones.generarExcelReporteHeaderEstadoDetalleInventario(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoDetalleInventarios(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoDetalleInventario> estadodetalleinventariosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleinventario_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoDetalleInventarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoDetalleInventario estadodetalleinventario : estadodetalleinventariosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoDetalleInventarioConstantesFunciones.getEstadoDetalleInventarioDescripcion(estadodetalleinventario));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoDetalleInventarioConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoDetalleInventarioConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadodetalleinventario.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoDetalleInventarioConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoDetalleInventarioConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadodetalleinventario.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Inventario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoDetalleInventarios(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoDetalleInventario> estadodetalleinventariosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoDetalleInventario> estadodetalleinventariosRespaldo=null;
		
		classes=EstadoDetalleInventarioConstantesFunciones.getClassesRelationshipsOfEstadoDetalleInventario(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadodetalleinventarioLogic.setDatosCliente(this.datosCliente);
		this.estadodetalleinventarioLogic.setDatosDeep(this.datosDeep);
		this.estadodetalleinventarioLogic.setIsConDeep(true);
		
		estadodetalleinventariosRespaldo=this.estadodetalleinventarioLogic.getEstadoDetalleInventarios();
		
		this.estadodetalleinventarioLogic.setEstadoDetalleInventarios(estadodetalleinventariosParaReportes);	
		this.estadodetalleinventarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadodetalleinventariosParaReportes=this.estadodetalleinventarioLogic.getEstadoDetalleInventarios();
		this.estadodetalleinventarioLogic.setEstadoDetalleInventarios(estadodetalleinventariosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleinventario_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoDetalleInventarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoDetalleInventario("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoDetalleInventario estadodetalleinventario : estadodetalleinventariosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoDetalleInventario("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoDetalleInventarioConstantesFunciones.generarExcelReporteDataEstadoDetalleInventario("NORMAL",row,workbook,estadodetalleinventario,cellStyleDataAux);
		
			
			


				//DetalleCompra
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleCompraConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadodetalleinventario.getDetalleCompras()!=null && estadodetalleinventario.getDetalleCompras().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleCompraConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleCompraConstantesFunciones.generarExcelReporteHeaderDetalleCompra("RELACIONADO",row,workbook);
				}

				if(estadodetalleinventario.getDetalleCompras()!=null) {
					i2=0;
					for(DetalleCompra detallecompra : estadodetalleinventario.getDetalleCompras()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleCompraConstantesFunciones.generarExcelReporteDataDetalleCompra("RELACIONADO",row,workbook,detallecompra,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//DetalleTransferencia
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadodetalleinventario.getDetalleTransferencias()!=null && estadodetalleinventario.getDetalleTransferencias().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleTransferenciaConstantesFunciones.generarExcelReporteHeaderDetalleTransferencia("RELACIONADO",row,workbook);
				}

				if(estadodetalleinventario.getDetalleTransferencias()!=null) {
					i2=0;
					for(DetalleTransferencia detalletransferencia : estadodetalleinventario.getDetalleTransferencias()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleTransferenciaConstantesFunciones.generarExcelReporteDataDetalleTransferencia("RELACIONADO",row,workbook,detalletransferencia,cellStyleDataAuxHijo);
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
		cell.setCellValue(EstadoDetalleInventarioConstantesFunciones.getEstadoDetalleInventarioDescripcion(estadodetalleinventario));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Inventario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoDetalleInventario() throws Exception {		
		this.startProcessEstadoDetalleInventario(true);
	}
	
	public void startProcessEstadoDetalleInventario(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoDetalleInventario, this.jScrollPanelDatosEstadoDetalleInventario,this.jPanelPaginacionEstadoDetalleInventario, this.jScrollPanelDatosEdicionEstadoDetalleInventario, this.jPanelAccionesEstadoDetalleInventario,this.jPanelAccionesFormularioEstadoDetalleInventario,this.jmenuBarEstadoDetalleInventario,this.jmenuBarDetalleEstadoDetalleInventario,this.jTtoolBarEstadoDetalleInventario,this.jTtoolBarDetalleEstadoDetalleInventario);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoDetalleInventario=null; 
		
		final JPanel jPanelParametrosReportesEstadoDetalleInventario=this.jPanelParametrosReportesEstadoDetalleInventario;
		//final JScrollPane jScrollPanelDatosEstadoDetalleInventario=this.jScrollPanelDatosEstadoDetalleInventario;
		final JTable jTableDatosEstadoDetalleInventario=this.jTableDatosEstadoDetalleInventario;		
		final JPanel jPanelPaginacionEstadoDetalleInventario=this.jPanelPaginacionEstadoDetalleInventario;
		//final JScrollPane jScrollPanelDatosEdicionEstadoDetalleInventario=this.jScrollPanelDatosEdicionEstadoDetalleInventario;
		final JPanel jPanelAccionesEstadoDetalleInventario=this.jPanelAccionesEstadoDetalleInventario;
		
		JPanel jPanelCamposAuxiliarEstadoDetalleInventario=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoDetalleInventario=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) {
			jPanelCamposAuxiliarEstadoDetalleInventario=this.jInternalFrameDetalleFormEstadoDetalleInventario.jPanelCamposEstadoDetalleInventario;
			jPanelAccionesFormularioAuxiliarEstadoDetalleInventario=this.jInternalFrameDetalleFormEstadoDetalleInventario.jPanelAccionesFormularioEstadoDetalleInventario;
		}
		
		final JPanel jPanelCamposEstadoDetalleInventario=jPanelCamposAuxiliarEstadoDetalleInventario;
		final JPanel jPanelAccionesFormularioEstadoDetalleInventario=jPanelAccionesFormularioAuxiliarEstadoDetalleInventario;
		
		
		final JMenuBar jmenuBarEstadoDetalleInventario=this.jmenuBarEstadoDetalleInventario;
		final JToolBar jTtoolBarEstadoDetalleInventario=this.jTtoolBarEstadoDetalleInventario;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoDetalleInventario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoDetalleInventario=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) {
			jmenuBarDetalleAuxiliarEstadoDetalleInventario=this.jInternalFrameDetalleFormEstadoDetalleInventario.jmenuBarDetalleEstadoDetalleInventario;
			jTtoolBarDetalleAuxiliarEstadoDetalleInventario=this.jInternalFrameDetalleFormEstadoDetalleInventario.jTtoolBarDetalleEstadoDetalleInventario;
		}
		
		final JMenuBar jmenuBarDetalleEstadoDetalleInventario=jmenuBarDetalleAuxiliarEstadoDetalleInventario;
		final JToolBar jTtoolBarDetalleEstadoDetalleInventario=jTtoolBarDetalleAuxiliarEstadoDetalleInventario;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoDetalleInventario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoDetalleInventario;
			processRunnable.jTableDatos=jTableDatosEstadoDetalleInventario;
			processRunnable.jPanelCampos=jPanelCamposEstadoDetalleInventario;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoDetalleInventario;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoDetalleInventario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoDetalleInventario;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoDetalleInventario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoDetalleInventario;
			processRunnable.jTtoolBar=jTtoolBarEstadoDetalleInventario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoDetalleInventario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoDetalleInventario ,jPanelParametrosReportesEstadoDetalleInventario,jTableDatosEstadoDetalleInventario, /*jScrollPanelDatosEstadoDetalleInventario,*/jPanelCamposEstadoDetalleInventario,jPanelPaginacionEstadoDetalleInventario, /*jScrollPanelDatosEdicionEstadoDetalleInventario,*/ jPanelAccionesEstadoDetalleInventario,jPanelAccionesFormularioEstadoDetalleInventario,jmenuBarEstadoDetalleInventario,jmenuBarDetalleEstadoDetalleInventario,jTtoolBarEstadoDetalleInventario,jTtoolBarDetalleEstadoDetalleInventario);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoDetalleInventario, jScrollPanelDatosEstadoDetalleInventario,jPanelPaginacionEstadoDetalleInventario, jScrollPanelDatosEdicionEstadoDetalleInventario, jPanelAccionesEstadoDetalleInventario,jPanelAccionesFormularioEstadoDetalleInventario,jmenuBarEstadoDetalleInventario,jmenuBarDetalleEstadoDetalleInventario,jTtoolBarEstadoDetalleInventario,jTtoolBarDetalleEstadoDetalleInventario);
						
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
	
	public void finishProcessEstadoDetalleInventario() {// throws Exception 
		this.finishProcessEstadoDetalleInventario(true);
	}
	
	public void finishProcessEstadoDetalleInventario(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoDetalleInventario, this.jScrollPanelDatosEstadoDetalleInventario,this.jPanelPaginacionEstadoDetalleInventario, this.jScrollPanelDatosEdicionEstadoDetalleInventario, this.jPanelAccionesEstadoDetalleInventario,this.jPanelAccionesFormularioEstadoDetalleInventario,this.jmenuBarEstadoDetalleInventario,this.jmenuBarDetalleEstadoDetalleInventario,this.jTtoolBarEstadoDetalleInventario,this.jTtoolBarDetalleEstadoDetalleInventario);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoDetalleInventario=null; 
		
		final JPanel jPanelParametrosReportesEstadoDetalleInventario=this.jPanelParametrosReportesEstadoDetalleInventario;
		//final JScrollPane jScrollPanelDatosEstadoDetalleInventario=this.jScrollPanelDatosEstadoDetalleInventario;
		final JTable jTableDatosEstadoDetalleInventario=this.jTableDatosEstadoDetalleInventario;		
		final JPanel jPanelPaginacionEstadoDetalleInventario=this.jPanelPaginacionEstadoDetalleInventario;
		//final JScrollPane jScrollPanelDatosEdicionEstadoDetalleInventario=this.jScrollPanelDatosEdicionEstadoDetalleInventario;
		final JPanel jPanelAccionesEstadoDetalleInventario=this.jPanelAccionesEstadoDetalleInventario;
		
		JPanel jPanelCamposAuxiliarEstadoDetalleInventario=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoDetalleInventario=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) {
			jPanelCamposAuxiliarEstadoDetalleInventario=this.jInternalFrameDetalleFormEstadoDetalleInventario.jPanelCamposEstadoDetalleInventario;
			jPanelAccionesFormularioAuxiliarEstadoDetalleInventario=this.jInternalFrameDetalleFormEstadoDetalleInventario.jPanelAccionesFormularioEstadoDetalleInventario;
		}
		
		final JPanel jPanelCamposEstadoDetalleInventario=jPanelCamposAuxiliarEstadoDetalleInventario;
		final JPanel jPanelAccionesFormularioEstadoDetalleInventario=jPanelAccionesFormularioAuxiliarEstadoDetalleInventario;
		
		
		final JMenuBar jmenuBarEstadoDetalleInventario=this.jmenuBarEstadoDetalleInventario;		
		final JToolBar jTtoolBarEstadoDetalleInventario=this.jTtoolBarEstadoDetalleInventario;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoDetalleInventario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoDetalleInventario=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) {
			jmenuBarDetalleAuxiliarEstadoDetalleInventario=this.jInternalFrameDetalleFormEstadoDetalleInventario.jmenuBarDetalleEstadoDetalleInventario;
			jTtoolBarDetalleAuxiliarEstadoDetalleInventario=this.jInternalFrameDetalleFormEstadoDetalleInventario.jTtoolBarDetalleEstadoDetalleInventario;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoDetalleInventario=jmenuBarDetalleAuxiliarEstadoDetalleInventario;
		final JToolBar jTtoolBarDetalleEstadoDetalleInventario=jTtoolBarDetalleAuxiliarEstadoDetalleInventario;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoDetalleInventario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoDetalleInventario;
			processRunnable.jTableDatos=jTableDatosEstadoDetalleInventario;
			processRunnable.jPanelCampos=jPanelCamposEstadoDetalleInventario;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoDetalleInventario;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoDetalleInventario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoDetalleInventario;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoDetalleInventario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoDetalleInventario;
			processRunnable.jTtoolBar=jTtoolBarEstadoDetalleInventario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoDetalleInventario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoDetalleInventario ,jPanelParametrosReportesEstadoDetalleInventario, jTableDatosEstadoDetalleInventario,/*jScrollPanelDatosEstadoDetalleInventario,*/jPanelCamposEstadoDetalleInventario,jPanelPaginacionEstadoDetalleInventario, /*jScrollPanelDatosEdicionEstadoDetalleInventario,*/ jPanelAccionesEstadoDetalleInventario,jPanelAccionesFormularioEstadoDetalleInventario,jmenuBarEstadoDetalleInventario,jmenuBarDetalleEstadoDetalleInventario,jTtoolBarEstadoDetalleInventario,jTtoolBarDetalleEstadoDetalleInventario));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoDetalleInventario(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoDetalleInventario(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoDetalleInventario(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoDetalleInventario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoDetalleInventario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoDetalleInventario,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoDetalleInventario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoDetalleInventario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoDetalleInventario,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadodetalleinventarioConstantesFunciones.getsFinalQueryEstadoDetalleInventario();
		String  finalQueryPaginacionTodos=this.estadodetalleinventarioConstantesFunciones.getsFinalQueryEstadoDetalleInventario();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoDetalleInventarioConstantesFunciones.getArrayColumnasGlobalesNoEstadoDetalleInventario(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoDetalleInventarioConstantesFunciones.getArrayColumnasGlobalesEstadoDetalleInventario(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoDetalleInventarioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadodetalleinventariosEliminados= new ArrayList<EstadoDetalleInventario>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoDetalleInventario();
		
				///*EstadoDetalleInventarioSessionBean*/this.estadodetalleinventarioSessionBean=new EstadoDetalleInventarioSessionBean();
			
			if(this.estadodetalleinventarioSessionBean==null) {
				this.estadodetalleinventarioSessionBean=new EstadoDetalleInventarioSessionBean();
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
					this.iNumeroPaginacion=EstadoDetalleInventarioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoDetalleInventarioConstantesFunciones.getClassesForeignKeysOfEstadoDetalleInventario(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadodetalleinventario."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadodetalleinventariosAux= new ArrayList<EstadoDetalleInventario>();
			
				
			estadodetalleinventarioLogic.setDatosCliente(this.datosCliente);
			estadodetalleinventarioLogic.setDatosDeep(this.datosDeep);
			estadodetalleinventarioLogic.setIsConDeep(true);
			
			
			estadodetalleinventarioLogic.getEstadoDetalleInventarioDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadodetalleinventarioLogic.getTodosEstadoDetalleInventarios(finalQueryGlobal,pagination);
					
					//estadodetalleinventarioLogic.getTodosEstadoDetalleInventariosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadodetalleinventarioLogic.getEstadoDetalleInventarios()==null|| estadodetalleinventarioLogic.getEstadoDetalleInventarios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadodetalleinventariosAux= new ArrayList<EstadoDetalleInventario>();
							estadodetalleinventariosAux.addAll(estadodetalleinventarioLogic.getEstadoDetalleInventarios());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadodetalleinventariosAux= new ArrayList<EstadoDetalleInventario>();
							estadodetalleinventariosAux.addAll(estadodetalleinventarios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadodetalleinventarioLogic.getTodosEstadoDetalleInventarios(finalQueryGlobal+"",this.pagination);												
							
							//estadodetalleinventarioLogic.getTodosEstadoDetalleInventariosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoDetalleInventarios("Todos",estadodetalleinventarioLogic.getEstadoDetalleInventarios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadodetalleinventarioLogic.setEstadoDetalleInventarios(new ArrayList<EstadoDetalleInventario>());					
							estadodetalleinventarioLogic.getEstadoDetalleInventarios().addAll(estadodetalleinventariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadodetalleinventarios=new ArrayList<EstadoDetalleInventario>();
							estadodetalleinventarios.addAll(estadodetalleinventariosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoDetalleInventario=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoDetalleInventario=this.idActual;
				
				} else if(this.idEstadoDetalleInventarioActual!=null && this.idEstadoDetalleInventarioActual!=0L) {
					idEstadoDetalleInventario=idEstadoDetalleInventarioActual;
				}
				
					
				this.sDetalleReporte=EstadoDetalleInventarioConstantesFunciones.getDetalleIndicePorId(idEstadoDetalleInventario);
				
				this.estadodetalleinventarios=new ArrayList<EstadoDetalleInventario>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadodetalleinventarioLogic.getEntity(idEstadoDetalleInventario);
					
					//estadodetalleinventarioLogic.getEntityWithConnection(idEstadoDetalleInventario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadodetalleinventarioLogic.setEstadoDetalleInventarios(new ArrayList<EstadoDetalleInventario>());
					estadodetalleinventarioLogic.getEstadoDetalleInventarios().add(estadodetalleinventarioLogic.getEstadoDetalleInventario());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadodetalleinventarios=new ArrayList<EstadoDetalleInventario>();
					this.estadodetalleinventarios.add(estadodetalleinventario);
				}
				
				if(estadodetalleinventarioLogic.getEstadoDetalleInventario()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoDetalleInventario();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoDetalleInventario();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadodetalleinventarioLogic.getEstadoDetalleInventarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadodetalleinventarios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadodetalleinventarioLogic.getEstadoDetalleInventarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadodetalleinventarios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoDetalleInventario estadodetalleinventario) {
		Boolean permite=true;
		
		if(this.estadodetalleinventario.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoDetalleInventarioConstantesFunciones.getOrderByListaEstadoDetalleInventario();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoDetalleInventarioConstantesFunciones.getOrderByListaEstadoDetalleInventario();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleInventario estadodetalleinventario:estadodetalleinventarioLogic.getEstadoDetalleInventarios()) {
				if(estadodetalleinventario.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetalleinventarioTotales=estadodetalleinventario;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleInventario estadodetalleinventario:this.estadodetalleinventarios) {
				if(estadodetalleinventario.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetalleinventarioTotales=estadodetalleinventario;
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
			this.estadodetalleinventarioAux=new EstadoDetalleInventario();
			this.estadodetalleinventarioAux.setsType(Constantes2.S_TOTALES);
			this.estadodetalleinventarioAux.setIsNew(false);
			this.estadodetalleinventarioAux.setIsChanged(false);
			this.estadodetalleinventarioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoDetalleInventarioConstantesFunciones.TotalizarValoresFilaEstadoDetalleInventario(this.estadodetalleinventarioLogic.getEstadoDetalleInventarios(),this.estadodetalleinventarioAux);
				
				this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().add(this.estadodetalleinventarioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoDetalleInventarioConstantesFunciones.TotalizarValoresFilaEstadoDetalleInventario(this.estadodetalleinventarios,this.estadodetalleinventarioAux);
				
				this.estadodetalleinventarios.add(this.estadodetalleinventarioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadodetalleinventarioTotales=new EstadoDetalleInventario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().remove(estadodetalleinventarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadodetalleinventarios.remove(estadodetalleinventarioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadodetalleinventarioTotales=new EstadoDetalleInventario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleInventario estadodetalleinventario:estadodetalleinventarioLogic.getEstadoDetalleInventarios()) {
				if(estadodetalleinventario.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetalleinventarioTotales=estadodetalleinventario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoDetalleInventarioConstantesFunciones.TotalizarValoresFilaEstadoDetalleInventario(this.estadodetalleinventarioLogic.getEstadoDetalleInventarios(),estadodetalleinventarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleInventario estadodetalleinventario:this.estadodetalleinventarios) {
				if(estadodetalleinventario.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetalleinventarioTotales=estadodetalleinventario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoDetalleInventarioConstantesFunciones.TotalizarValoresFilaEstadoDetalleInventario(this.estadodetalleinventarios,estadodetalleinventarioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosEstadoDetalleInventario() {
		this.isPermisoTodoEstadoDetalleInventario=false;
		this.isPermisoNuevoEstadoDetalleInventario=false;
		this.isPermisoActualizarEstadoDetalleInventario=false;
		this.isPermisoActualizarOriginalEstadoDetalleInventario=false;
		this.isPermisoEliminarEstadoDetalleInventario=false;
		this.isPermisoGuardarCambiosEstadoDetalleInventario=false;
		this.isPermisoConsultaEstadoDetalleInventario=false;
		this.isPermisoBusquedaEstadoDetalleInventario=false;
		this.isPermisoReporteEstadoDetalleInventario=false;		
		this.isPermisoOrdenEstadoDetalleInventario=false;		
		this.isPermisoPaginacionMedioEstadoDetalleInventario=false;		
		this.isPermisoPaginacionAltoEstadoDetalleInventario=false;
		this.isPermisoPaginacionTodoEstadoDetalleInventario=false;
		this.isPermisoCopiarEstadoDetalleInventario=false;		
		this.isPermisoVerFormEstadoDetalleInventario=false;		
		this.isPermisoDuplicarEstadoDetalleInventario=false;		
		this.isPermisoOrdenEstadoDetalleInventario=false;		
	}
	
	public void setPermisosUsuarioEstadoDetalleInventario(Boolean isPermiso) {
		this.isPermisoTodoEstadoDetalleInventario=isPermiso;
		this.isPermisoNuevoEstadoDetalleInventario=isPermiso;
		this.isPermisoActualizarEstadoDetalleInventario=isPermiso;
		this.isPermisoActualizarOriginalEstadoDetalleInventario=isPermiso;
		this.isPermisoEliminarEstadoDetalleInventario=isPermiso;
		this.isPermisoGuardarCambiosEstadoDetalleInventario=isPermiso;
		this.isPermisoConsultaEstadoDetalleInventario=isPermiso;
		this.isPermisoBusquedaEstadoDetalleInventario=isPermiso;
		this.isPermisoReporteEstadoDetalleInventario=isPermiso;
		this.isPermisoOrdenEstadoDetalleInventario=isPermiso;		
		this.isPermisoPaginacionMedioEstadoDetalleInventario=isPermiso;		
		this.isPermisoPaginacionAltoEstadoDetalleInventario=isPermiso;		
		this.isPermisoPaginacionTodoEstadoDetalleInventario=isPermiso;		
		this.isPermisoCopiarEstadoDetalleInventario=isPermiso;		
		this.isPermisoVerFormEstadoDetalleInventario=isPermiso;		
		this.isPermisoDuplicarEstadoDetalleInventario=isPermiso;
		this.isPermisoOrdenEstadoDetalleInventario=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoDetalleInventario(Boolean isPermiso) {
		//this.isPermisoTodoEstadoDetalleInventario=isPermiso;
		this.isPermisoNuevoEstadoDetalleInventario=isPermiso;
		this.isPermisoActualizarEstadoDetalleInventario=isPermiso;
		this.isPermisoActualizarOriginalEstadoDetalleInventario=isPermiso;
		this.isPermisoEliminarEstadoDetalleInventario=isPermiso;
		this.isPermisoGuardarCambiosEstadoDetalleInventario=isPermiso;
		//this.isPermisoConsultaEstadoDetalleInventario=isPermiso;
		//this.isPermisoBusquedaEstadoDetalleInventario=isPermiso;
		//this.isPermisoReporteEstadoDetalleInventario=isPermiso;
		//this.isPermisoOrdenEstadoDetalleInventario=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoDetalleInventario=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoDetalleInventario=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoDetalleInventario=isPermiso;		
		//this.isPermisoCopiarEstadoDetalleInventario=isPermiso;		
		//this.isPermisoDuplicarEstadoDetalleInventario=isPermiso;
		//this.isPermisoOrdenEstadoDetalleInventario=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoDetalleInventarioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleCompraConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(DetalleTransferenciaConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoDetalleInventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleCompra=false;
		this.isTienePermisosDetalleCompra=this.verificarGetPermisosUsuarioOpcionEstadoDetalleInventarioClaseRelacionada(this.opcionsRelacionadas,DetalleCompraConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosDetalleTransferencia=false;
		this.isTienePermisosDetalleTransferencia=this.verificarGetPermisosUsuarioOpcionEstadoDetalleInventarioClaseRelacionada(this.opcionsRelacionadas,DetalleTransferenciaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoDetalleInventario(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoDetalleInventarioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleCompra=conPermiso;
		this.isTienePermisosDetalleTransferencia=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoDetalleInventarioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoDetalleInventarioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoDetalleInventarioClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleCompra && this.jInternalFrameDetalleFormEstadoDetalleInventario!=null && this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jTabbedPaneRelacionesEstadoDetalleInventario.remove(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosDetalleTransferencia && this.jInternalFrameDetalleFormEstadoDetalleInventario!=null && this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jTabbedPaneRelacionesEstadoDetalleInventario.remove(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoDetalleInventario() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoDetalleInventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoDetalleInventarioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoDetalleInventario=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoDetalleInventario=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoDetalleInventario=this.isPermisoActualizarEstadoDetalleInventario;
			this.isPermisoEliminarEstadoDetalleInventario=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoDetalleInventario=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoDetalleInventario=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoDetalleInventario=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoDetalleInventario=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoDetalleInventario=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoDetalleInventario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoDetalleInventario=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoDetalleInventario=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoDetalleInventario=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoDetalleInventario=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoDetalleInventario=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoDetalleInventario=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoDetalleInventario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoDetalleInventario.setToolTipText(this.jTableDatosEstadoDetalleInventario.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoDetalleInventario(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoDetalleInventario(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoDetalleInventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoDetalleInventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoDetalleInventario() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleCompra && this.estadodetalleinventarioConstantesFunciones.mostrarDetalleCompraEstadoDetalleInventario && !EstadoDetalleInventarioConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Compra");
			reporte.setsDescripcion("Detalle Compra");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosDetalleTransferencia && this.estadodetalleinventarioConstantesFunciones.mostrarDetalleTransferenciaEstadoDetalleInventario && !EstadoDetalleInventarioConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Transferencia");
			reporte.setsDescripcion("Detalle Transferencia");
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
	
		
	public void inicializarCombosForeignKeyEstadoDetalleInventarioListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoDetalleInventarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoDetalleInventarioJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoDetalleInventarioListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoDetalleInventarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoDetalleInventario()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoDetalleInventario()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoDetalleInventario(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoDetalleInventario()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoDetalleInventario();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleInventario(EstadoDetalleInventario estadodetalleinventario)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoDetalleInventario(EstadoDetalleInventario estadodetalleinventario,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoDetalleInventario()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoDetalleInventario()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoDetalleInventario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoDetalleInventario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoDetalleInventario()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoDetalleInventario()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoDetalleInventario(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoDetalleInventario()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoDetalleInventarioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoDetalleInventarioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoDetalleInventarioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadodetalleinventarioSessionBean=new EstadoDetalleInventarioSessionBean(); 
		this.estadodetalleinventarioConstantesFunciones=new EstadoDetalleInventarioConstantesFunciones(); 
		this.estadodetalleinventarioBean=new EstadoDetalleInventario();//(this.estadodetalleinventarioConstantesFunciones); 		
		this.estadodetalleinventarioReturnGeneral=new EstadoDetalleInventarioParameterReturnGeneral(); 
		
		this.estadodetalleinventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadodetalleinventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoDetalleInventarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoDetalleInventarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoDetalleInventarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoDetalleInventario(true);
			
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
			
			this.estadodetalleinventarioConstantesFunciones=new EstadoDetalleInventarioConstantesFunciones(); 
			this.estadodetalleinventarioBean=new EstadoDetalleInventario();//this.estadodetalleinventarioConstantesFunciones); 			
			this.estadodetalleinventarioReturnGeneral=new EstadoDetalleInventarioParameterReturnGeneral(); 
		
			EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Detalle Inventario Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadodetalleinventario=new EstadoDetalleInventario();
			this.estadodetalleinventarios = new ArrayList<EstadoDetalleInventario>();
			this.estadodetalleinventariosAux = new ArrayList<EstadoDetalleInventario>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic=new EstadoDetalleInventarioLogic();
				this.estadodetalleinventarioLogic.getNewConnexionToDeep("");
			}
			
			//this.estadodetalleinventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadodetalleinventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoDetalleInventario);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoDetalleInventario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoDetalleInventario);	
					}
					
					if(this.jInternalFrameImportacionEstadoDetalleInventario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoDetalleInventario);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoDetalleInventario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoDetalleInventario);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoDetalleInventario);
				this.jInternalFrameDetalleFormEstadoDetalleInventario.setVisible(false);
				this.jInternalFrameDetalleFormEstadoDetalleInventario.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoDetalleInventario!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoDetalleInventario);
					this.jInternalFrameReporteDinamicoEstadoDetalleInventario.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoDetalleInventario.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoDetalleInventario!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoDetalleInventario);
					this.jInternalFrameImportacionEstadoDetalleInventario.setVisible(false);
					this.jInternalFrameImportacionEstadoDetalleInventario.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoDetalleInventario!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoDetalleInventario);
					this.jInternalFrameOrderByEstadoDetalleInventario.setVisible(false);
					this.jInternalFrameOrderByEstadoDetalleInventario.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoDetalleInventarioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoDetalleInventarioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadodetalleinventarioReturnGeneral=new EstadoDetalleInventarioParameterReturnGeneral();
			
			this.estadodetalleinventarioParameterGeneral=new EstadoDetalleInventarioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadodetalleinventarioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoDetalleInventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleCompraConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(DetalleTransferenciaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoDetalleInventarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado(),this.estadodetalleinventarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoDetalleInventarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado(),this.estadodetalleinventarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoDetalleInventario=false;
			this.isVisibilidadCeldaDuplicarEstadoDetalleInventario=true;
			this.isVisibilidadCeldaCopiarEstadoDetalleInventario=true;
			this.isVisibilidadCeldaVerFormEstadoDetalleInventario=true;
			this.isVisibilidadCeldaOrdenEstadoDetalleInventario=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleInventario=false;
			this.isVisibilidadCeldaModificarEstadoDetalleInventario=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleInventario=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleInventario=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleInventario=false;
			this.isVisibilidadCeldaGuardarEstadoDetalleInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleInventario=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoDetalleInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoDetalleInventario();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoDetalleInventario(false);
			
			this.setPermisosUsuarioEstadoDetalleInventario();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado() 
				|| (this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado() && this.estadodetalleinventarioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoDetalleInventarioClasesRelacionadas();
			}
			
			if(this.estadodetalleinventarioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoDetalleInventarioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoDetalleInventarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoDetalleInventario();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoDetalleInventario();
			}
			
			if(!this.isPermisoBusquedaEstadoDetalleInventario) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoDetalleInventario,this.isPermisoPaginacionMedioEstadoDetalleInventario,this.isPermisoPaginacionTodoEstadoDetalleInventario);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoDetalleInventarioConstantesFunciones.getTiposSeleccionarEstadoDetalleInventario());
				
				this.tiposColumnasSelect=EstadoDetalleInventarioConstantesFunciones.getTiposSeleccionarEstadoDetalleInventario(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoDetalleInventario();				
				//this.tiposRelacionesSelect=EstadoDetalleInventarioConstantesFunciones.getTiposRelacionesEstadoDetalleInventario(true);
				
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
			//if(!this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoDetalleInventario();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoDetalleInventario(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoDetalleInventario(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetalleInventario() ;
			
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
			
			
			this.detallecompraLogic=new DetalleCompraLogic();
			this.detalletransferenciaLogic=new DetalleTransferenciaLogic(); 
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
				estadodetalleinventarioImplementable= (EstadoDetalleInventarioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoDetalleInventarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadodetalleinventarioImplementableHome= (EstadoDetalleInventarioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoDetalleInventarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadodetalleinventarios= new ArrayList<EstadoDetalleInventario>();
			this.estadodetalleinventariosEliminados= new ArrayList<EstadoDetalleInventario>();
						
			this.isEsNuevoEstadoDetalleInventario=false;
			this.esParaAccionDesdeFormularioEstadoDetalleInventario=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoDetalleInventario(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoDetalleInventario();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoDetalleInventarioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoDetalleInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoDetalleInventario(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoDetalleInventario();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoDetalleInventario();
			}
			
			EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoDetalleInventario(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoDetalleInventario: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoDetalleInventario() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleCompraConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleCompraConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoDetalleInventario")) {
				iIndex=this.jInternalFrameDetalleFormEstadoDetalleInventario.jTabbedPaneRelacionesEstadoDetalleInventario.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoDetalleInventario.jTabbedPaneRelacionesEstadoDetalleInventario.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoDetalleInventario.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Compras")) {
					if(!DetalleCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoDetalleInventario();

						this.cargarParteTabPanelRelacionadaDetalleCompra(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Detalle Transferencias")) {
					if(!DetalleTransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoDetalleInventario();

						this.cargarParteTabPanelRelacionadaDetalleTransferencia(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoDetalleInventario();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleCompra(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoDetalleInventario.cargarSessionConBeanSwingJInternalFrameDetalleCompra(false,true,iIndex);
		this.jButtonDetalleCompraActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleCompra();

		//this.jTabbedPaneRelacionesEstadoDetalleInventario.updateUI();
		//this.jTabbedPaneRelacionesEstadoDetalleInventario.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoDetalleInventario.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaDetalleTransferencia(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoDetalleInventario.cargarSessionConBeanSwingJInternalFrameDetalleTransferencia(false,true,iIndex);
		this.jButtonDetalleTransferenciaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleTransferencia();

		//this.jTabbedPaneRelacionesEstadoDetalleInventario.updateUI();
		//this.jTabbedPaneRelacionesEstadoDetalleInventario.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoDetalleInventario.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleCompra")) {
				int row=this.jTableDatosEstadoDetalleInventario.getSelectedRow();
				jButtonDetalleCompraActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("DetalleTransferencia")) {
				int row=this.jTableDatosEstadoDetalleInventario.getSelectedRow();
				jButtonDetalleTransferenciaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Compra")) {

					if(this.isTienePermisosDetalleCompra && this.estadodetalleinventarioConstantesFunciones.mostrarDetalleCompraEstadoDetalleInventario && !EstadoDetalleInventarioConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Compras"+"("+DetalleCompraConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Compras");

						if(estadodetalleinventarioConstantesFunciones.resaltarDetalleCompraEstadoDetalleInventario!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadodetalleinventarioConstantesFunciones.resaltarDetalleCompraEstadoDetalleInventario);
						}

						jmenuItem.setEnabled(this.estadodetalleinventarioConstantesFunciones.activarDetalleCompraEstadoDetalleInventario);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleCompra"));

						

						this.jInternalFrameDetalleFormEstadoDetalleInventario.jmenuDetalleEstadoDetalleInventario.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Detalle Transferencia")) {

					if(this.isTienePermisosDetalleTransferencia && this.estadodetalleinventarioConstantesFunciones.mostrarDetalleTransferenciaEstadoDetalleInventario && !EstadoDetalleInventarioConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Transferencias"+"("+DetalleTransferenciaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Transferencias");

						if(estadodetalleinventarioConstantesFunciones.resaltarDetalleTransferenciaEstadoDetalleInventario!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadodetalleinventarioConstantesFunciones.resaltarDetalleTransferenciaEstadoDetalleInventario);
						}

						jmenuItem.setEnabled(this.estadodetalleinventarioConstantesFunciones.activarDetalleTransferenciaEstadoDetalleInventario);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleTransferencia"));

						

						this.jInternalFrameDetalleFormEstadoDetalleInventario.jmenuDetalleEstadoDetalleInventario.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoDetalleInventario(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoDetalleInventario(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoDetalleInventario(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoDetalleInventarioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoDetalleInventario();
		
		this.cargarCombosFrameForeignKeyEstadoDetalleInventario();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoDetalleInventario();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoDetalleInventario();
		}
	}
	
	
	
	public void jButtonNuevoEstadoDetalleInventarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadodetalleinventarioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoDetalleInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
			
			
			if(jTableDatosEstadoDetalleInventario.getRowCount()>=1) {
				jTableDatosEstadoDetalleInventario.removeRowSelectionInterval(0, jTableDatosEstadoDetalleInventario.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoDetalleInventario=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoDetalleInventario(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoDetalleInventario(true);			
			//this.estadodetalleinventario=new EstadoDetalleInventario();
			//this.estadodetalleinventario.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoDetalleInventario(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetalleInventario() ;
			
			if(EstadoDetalleInventarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoDetalleInventario(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadodetalleinventario);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleinventario);				
			
			EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
			
			if(this.estadodetalleinventarioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoDetalleInventario: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoDetalleInventarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoDetalleInventario> estadodetalleinventariosSeleccionados=new ArrayList<EstadoDetalleInventario>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoDetalleInventario.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoDetalleInventario.getSelectedRows().length;			
			}
			
			estadodetalleinventariosSeleccionados=this.getEstadoDetalleInventariosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoDetalleInventario--;			
				//EstadoDetalleInventario estadodetalleinventarioAux= new EstadoDetalleInventario();			
				//estadodetalleinventarioAux.setId(this.iIdNuevoEstadoDetalleInventario);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoDetalleInventario estadodetalleinventarioOrigen=new EstadoDetalleInventario();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoDetalleInventario estadodetalleinventarioOrigen : estadodetalleinventariosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoDetalleInventario.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadodetalleinventarioOrigen =(EstadoDetalleInventario) this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadodetalleinventarioOrigen =(EstadoDetalleInventario) this.estadodetalleinventarios.toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoDetalleInventario();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadodetalleinventario.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoDetalleInventario(estadodetalleinventarioOrigen,this.estadodetalleinventario,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleInventario(this.estadodetalleinventario);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().add(this.estadodetalleinventarioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadodetalleinventarios.add(this.estadodetalleinventarioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoDetalleInventario(false);
				
				this.jTableDatosEstadoDetalleInventario.setRowSelectionInterval(this.getIndiceNuevoEstadoDetalleInventario(), this.getIndiceNuevoEstadoDetalleInventario());
				
				int iLastRow =  this.jTableDatosEstadoDetalleInventario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoDetalleInventario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoDetalleInventario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoDetalleInventario(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoDetalleInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoDetalleInventario> estadodetalleinventariosSeleccionados=new ArrayList<EstadoDetalleInventario>();									
		
			EstadoDetalleInventario estadodetalleinventarioOrigen=new EstadoDetalleInventario();
			EstadoDetalleInventario estadodetalleinventarioDestino=new EstadoDetalleInventario();
				
			estadodetalleinventariosSeleccionados=this.getEstadoDetalleInventariosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoDetalleInventario.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadodetalleinventariosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoDetalleInventario.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetalleinventarioOrigen =(EstadoDetalleInventario) this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadodetalleinventarioOrigen =(EstadoDetalleInventario) this.estadodetalleinventarios.toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetalleinventarioDestino =(EstadoDetalleInventario) this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadodetalleinventarioDestino =(EstadoDetalleInventario) this.estadodetalleinventarios.toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadodetalleinventarioOrigen =estadodetalleinventariosSeleccionados.get(0);
				estadodetalleinventarioDestino =estadodetalleinventariosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoDetalleInventario(estadodetalleinventarioOrigen,estadodetalleinventarioDestino,true,false);
				
				estadodetalleinventarioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadodetalleinventarioDestino,estadodetalleinventarioLogic.getEstadoDetalleInventarios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetalleinventarioDestino,estadodetalleinventarios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoDetalleInventario(false);
				
				//this.jTableDatosEstadoDetalleInventario.setRowSelectionInterval(this.getIndiceNuevoEstadoDetalleInventario(), this.getIndiceNuevoEstadoDetalleInventario());
				
				int iLastRow =  this.jTableDatosEstadoDetalleInventario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoDetalleInventario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoDetalleInventario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoDetalleInventario(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoDetalleInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoDetalleInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoDetalleInventario.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoDetalleInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoDetalleInventario.isVisible();
			
			
			this.jPanelParametrosReportesEstadoDetalleInventario.setVisible(!isVisible);
			this.jPanelPaginacionEstadoDetalleInventario.setVisible(!isVisible);
			this.jPanelAccionesEstadoDetalleInventario.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoDetalleInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoDetalleInventario();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoDetalleInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoDetalleInventario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoDetalleInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoDetalleInventario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoDetalleInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoDetalleInventario();
			
			this.abrirFrameOrderByEstadoDetalleInventario();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoDetalleInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoDetalleInventario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoDetalleInventario(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoDetalleInventario);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoDetalleInventario.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoDetalleInventario.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoDetalleInventario.setSize(this.jInternalFrameDetalleFormEstadoDetalleInventario.iWidthFormulario,this.jInternalFrameDetalleFormEstadoDetalleInventario.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoDetalleInventario.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoDetalleInventario.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoDetalleInventario.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoDetalleInventario.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoDetalleInventario.jContentPaneDetalleEstadoDetalleInventario.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoDetalleInventario.jTabbedPaneRelacionesEstadoDetalleInventario.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoDetalleInventario.jContentPaneDetalleEstadoDetalleInventario.getWidth(),EstadoDetalleInventarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoDetalleInventario.jTabbedPaneRelacionesEstadoDetalleInventario.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoDetalleInventario.jContentPaneDetalleEstadoDetalleInventario.getWidth(),EstadoDetalleInventarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoDetalleInventario.jTabbedPaneRelacionesEstadoDetalleInventario.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoDetalleInventario.jContentPaneDetalleEstadoDetalleInventario.getWidth(),EstadoDetalleInventarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleCompra();
					}

					if(DetalleTransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleTransferencia();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoDetalleInventario.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoDetalleInventario.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoDetalleInventario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoDetalleInventario==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoDetalleInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetalleInventario,false,this);
				} else {
					this.jInternalFrameOrderByEstadoDetalleInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetalleInventario,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoDetalleInventario);
				this.jInternalFrameOrderByEstadoDetalleInventario.setVisible(false);
				this.jInternalFrameOrderByEstadoDetalleInventario.setSelected(false);
				
				this.jInternalFrameOrderByEstadoDetalleInventario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoDetalleInventario"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoDetalleInventario();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoDetalleInventario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoDetalleInventario==null) {
				
				this.jInternalFrameImportacionEstadoDetalleInventario=new ImportacionJInternalFrame(EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoDetalleInventario);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoDetalleInventario);
				this.jInternalFrameImportacionEstadoDetalleInventario.setVisible(false);
				this.jInternalFrameImportacionEstadoDetalleInventario.setSelected(false);


				this.jInternalFrameImportacionEstadoDetalleInventario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoDetalleInventario"));
				this.jInternalFrameImportacionEstadoDetalleInventario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoDetalleInventario"));
				this.jInternalFrameImportacionEstadoDetalleInventario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoDetalleInventario"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoDetalleInventario() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoDetalleInventario==null) {
				this.jInternalFrameReporteDinamicoEstadoDetalleInventario=new ReporteDinamicoJInternalFrame(EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoDetalleInventario);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoDetalleInventario);
				this.jInternalFrameReporteDinamicoEstadoDetalleInventario.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoDetalleInventario.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoDetalleInventario"));
				this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoDetalleInventario"));
				this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoDetalleInventario"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoDetalleInventario();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleCompra() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.jScrollPanelDatosDetalleCompra.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoDetalleInventario.jContentPaneDetalleEstadoDetalleInventario.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.jScrollPanelDatosDetalleCompra.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.jScrollPanelDatosDetalleCompra.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.jScrollPanelDatosDetalleCompra.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaDetalleTransferencia() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.jScrollPanelDatosDetalleTransferencia.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoDetalleInventario.jContentPaneDetalleEstadoDetalleInventario.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.jScrollPanelDatosDetalleTransferencia.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.jScrollPanelDatosDetalleTransferencia.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.jScrollPanelDatosDetalleTransferencia.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoDetalleInventario() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoDetalleInventario);
			
	       	this.jInternalFrameDetalleFormEstadoDetalleInventario.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoDetalleInventario.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoDetalleInventario.dispose();
			//this.jInternalFrameDetalleFormEstadoDetalleInventario=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoDetalleInventario() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoDetalleInventario.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoDetalleInventario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoDetalleInventario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoDetalleInventario.setVisible(true);
	        this.jInternalFrameImportacionEstadoDetalleInventario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoDetalleInventario() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoDetalleInventario.setVisible(true);
	        this.jInternalFrameOrderByEstadoDetalleInventario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoDetalleInventario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoDetalleInventario.setVisible(false);
	        this.jInternalFrameOrderByEstadoDetalleInventario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoDetalleInventario() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoDetalleInventario.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoDetalleInventario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoDetalleInventario() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoDetalleInventario.setVisible(false);
	        this.jInternalFrameImportacionEstadoDetalleInventario.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoDetalleInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoDetalleInventario(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoDetalleInventario(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoDetalleInventario.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoDetalleInventario(true);
			//this.isEsNuevoEstadoDetalleInventario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventario =(EstadoDetalleInventario) this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadodetalleinventario =(EstadoDetalleInventario) this.estadodetalleinventarios.toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoDetalleInventario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoDetalleInventario(false) ;
			
			if(estadodetalleinventarioSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecompraSessionBean.getEsGuardarRelacionado() && DetalleCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleCompraActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaSessionBean.getEsGuardarRelacionado() && DetalleTransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleTransferenciaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoDetalleInventarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoDetalleInventario(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetalleInventario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoDetalleInventarioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoDetalleInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventario =(EstadoDetalleInventario) this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleinventario =(EstadoDetalleInventario) this.estadodetalleinventarios.toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoDetalleInventario(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoDetalleInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoDetalleInventario.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoDetalleInventario(true);
			//this.isEsNuevoEstadoDetalleInventario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventario =(EstadoDetalleInventario) this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadodetalleinventario =(EstadoDetalleInventario) this.estadodetalleinventarios.toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadodetalleinventario.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoDetalleInventario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoDetalleInventario(false) ;
			
			if(EstadoDetalleInventarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoDetalleInventario(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetalleInventario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoDetalleInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoDetalleInventario(false);
			
			//if(!this.isEsNuevoEstadoDetalleInventario) {								
				int intSelectedRow = this.jTableDatosEstadoDetalleInventario.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventario =(EstadoDetalleInventario) this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadodetalleinventario =(EstadoDetalleInventario) this.estadodetalleinventarios.toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoDetalleInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoDetalleInventario(this.estadodetalleinventario,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleInventario(this.estadodetalleinventario);
				
			}
			
			if(this.permiteMantenimiento(this.estadodetalleinventario)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoDetalleInventario=true;
					this.inicializarActualizarBindingTablaEstadoDetalleInventario(false);
					this.isEsNuevoEstadoDetalleInventario=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoDetalleInventario=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoDetalleInventario=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoDetalleInventario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoDetalleInventario(false);
				
				this.habilitarDeshabilitarControlesEstadoDetalleInventario(false);
			
												
				
				if(EstadoDetalleInventarioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoDetalleInventario();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoDetalleInventarioActionPerformed(evt,estadodetalleinventarioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoDetalleInventario(this.estadodetalleinventario,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoDetalleInventario.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadodetalleinventarioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadodetalleinventario.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleInventario.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleInventario.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoDetalleInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoDetalleInventario.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventario =(EstadoDetalleInventario) this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
				this.estadodetalleinventario.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadodetalleinventario =(EstadoDetalleInventario) this.estadodetalleinventarios.toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
				this.estadodetalleinventario.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadodetalleinventario)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoDetalleInventarioModel) this.jTableDatosEstadoDetalleInventario.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoDetalleInventario=true;
				this.inicializarActualizarBindingTablaEstadoDetalleInventario(false);
				this.isEsNuevoEstadoDetalleInventario=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoDetalleInventario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoDetalleInventario(false);
				
				this.habilitarDeshabilitarControlesEstadoDetalleInventario(false);
				
				
				
				if(EstadoDetalleInventarioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoDetalleInventario();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoDetalleInventarioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoDetalleInventario.getRowCount()>=1) {
				jTableDatosEstadoDetalleInventario.removeRowSelectionInterval(0, jTableDatosEstadoDetalleInventario.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoDetalleInventario(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoDetalleInventario(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoDetalleInventario(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetalleInventario(false) ;
			
			this.isEsNuevoEstadoDetalleInventario=false;
			
			if(EstadoDetalleInventarioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoDetalleInventario();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoDetalleInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoDetalleInventario(false);
				
				//SI ES MANUAL
				if(EstadoDetalleInventarioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoDetalleInventario();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoDetalleInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoDetalleInventario--;			
			//EstadoDetalleInventario estadodetalleinventarioAux= new EstadoDetalleInventario();			
			//estadodetalleinventarioAux.setId(this.iIdNuevoEstadoDetalleInventario);
			
			if(this.jInternalFrameDetalleFormEstadoDetalleInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoDetalleInventario();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleInventario(this.estadodetalleinventario);
			
			this.estadodetalleinventario.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().add(this.estadodetalleinventarioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadodetalleinventarios.add(this.estadodetalleinventarioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoDetalleInventario(false);
			
			this.jTableDatosEstadoDetalleInventario.setRowSelectionInterval(this.getIndiceNuevoEstadoDetalleInventario(), this.getIndiceNuevoEstadoDetalleInventario());
			
			int iLastRow =  this.jTableDatosEstadoDetalleInventario.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoDetalleInventario.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoDetalleInventario.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoDetalleInventario(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoDetalleInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoDetalleInventario(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetalleInventario(false);
			
			//SI ES MANUAL
			if(EstadoDetalleInventarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoDetalleInventario();
			}
			
			//this.abrirFrameTreeEstadoDetalleInventario();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoDetalleInventarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Detalle InventarioS ?", "MANTENIMIENTO DE Estado Detalle Inventario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoDetalleInventario.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoDetalleInventario();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadodetalleinventarioReturnGeneral=estadodetalleinventarioLogic.procesarImportacionEstadoDetalleInventariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadodetalleinventarioParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoDetalleInventarioReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoDetalleInventarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoDetalleInventario.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoDetalleInventario.setFileImportacion(this.jInternalFrameImportacionEstadoDetalleInventario.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoDetalleInventario.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoDetalleInventario.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoDetalleInventario.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoDetalleInventario.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoDetalleInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoDetalleInventario> estadodetalleinventariosSeleccionados=new ArrayList<EstadoDetalleInventario>();		

		estadodetalleinventariosSeleccionados=this.getEstadoDetalleInventariosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoDetalleInventarioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoDetalleInventarioBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoDetalleInventarios("Todos",estadodetalleinventariosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoDetalleInventarioConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoDetalleInventarioConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoDetalleInventarioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoDetalleInventarioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoDetalleInventarioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoDetalleInventarioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoDetalleInventarioConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoDetalleInventarioConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoDetalleInventarioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoDetalleInventario> estadodetalleinventariosSeleccionados=new ArrayList<EstadoDetalleInventario>();		
		
		estadodetalleinventariosSeleccionados=this.getEstadoDetalleInventariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleinventario";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoDetalleInventarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoDetalleInventarioConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoDetalleInventarioConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoDetalleInventario estadodetalleinventario:estadodetalleinventariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadodetalleinventario.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoDetalleInventarioConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoDetalleInventarioConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoDetalleInventario estadodetalleinventario:estadodetalleinventariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadodetalleinventario.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoDetalleInventario(row);				
			//	iRow++;
			//}				
			
			//for(EstadoDetalleInventario estadodetalleinventarioAux:estadodetalleinventariosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoDetalleInventario(estadodetalleinventarioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Inventario",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadodetalleinventarioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetalleInventario(false);
			
			//SI ES MANUAL
			if(EstadoDetalleInventarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoDetalleInventario();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoDetalleInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetalleInventario(false);
			
			//SI ES MANUAL
			if(EstadoDetalleInventarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoDetalleInventario();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoDetalleInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetalleInventario(false);
			
			//SI ES MANUAL
			if(EstadoDetalleInventarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoDetalleInventario();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleinventarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoDetalleInventario() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoDetalleInventario.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoDetalleInventario.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoDetalleInventario.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoDetalleInventario.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoDetalleInventario.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoDetalleInventario.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoDetalleInventario.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoDetalleInventario(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoDetalleInventario(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoDetalleInventario(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoDetalleInventario(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoDetalleInventario(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoDetalleInventario(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetalleInventario(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoDetalleInventario(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoDetalleInventarioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoDetalleInventarioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoDetalleInventario() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoDetalleInventario();
		
		this.inicializarActualizarBindingBotonesManualEstadoDetalleInventario(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoDetalleInventario();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetalleInventario() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoDetalleInventario(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoDetalleInventario(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoDetalleInventario.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoDetalleInventario.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoDetalleInventario.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoDetalleInventario.jCheckBoxPostAccionNuevoEstadoDetalleInventario.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoDetalleInventario.jCheckBoxPostAccionSinCerrarEstadoDetalleInventario.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoDetalleInventario.jCheckBoxPostAccionSinMensajeEstadoDetalleInventario.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoDetalleInventario.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoDetalleInventario.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoDetalleInventario.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) {
				this.jInternalFrameDetalleFormEstadoDetalleInventario.jCheckBoxPostAccionNuevoEstadoDetalleInventario.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoDetalleInventario.jCheckBoxPostAccionSinCerrarEstadoDetalleInventario.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoDetalleInventario.jCheckBoxPostAccionSinMensajeEstadoDetalleInventario.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoDetalleInventario.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoDetalleInventario.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoDetalleInventario.jComboBoxTiposAccionesFormularioEstadoDetalleInventario.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoDetalleInventario.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoDetalleInventario!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoDetalleInventario.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoDetalleInventario.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoDetalleInventario.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoDetalleInventario.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoDetalleInventario!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoDetalleInventario.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoDetalleInventario.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoDetalleInventario(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoDetalleInventarioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoDetalleInventario(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetalleInventario() throws Exception {
		try	{
			if(EstadoDetalleInventarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoDetalleInventario();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoDetalleInventario() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jComboBoxTiposAccionesFormularioEstadoDetalleInventario.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jComboBoxTiposAccionesFormularioEstadoDetalleInventario.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoDetalleInventario() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoDetalleInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoDetalleInventario.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoDetalleInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoDetalleInventario.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoDetalleInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoDetalleInventario.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoDetalleInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoDetalleInventario.addItem(reporte);
			}
			
			
			if(!this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoDetalleInventario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoDetalleInventario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoDetalleInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoDetalleInventario.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoDetalleInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoDetalleInventario.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoDetalleInventario.jComboBoxTiposAccionesFormularioEstadoDetalleInventario.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoDetalleInventario.jComboBoxTiposAccionesFormularioEstadoDetalleInventario.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoDetalleInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoDetalleInventario.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoDetalleInventario.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoDetalleInventario();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoDetalleInventario() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoDetalleInventario!=null) {
				this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoDetalleInventario!=null) {
				this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoDetalleInventario!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoDetalleInventario()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoDetalleInventario(Boolean esInicializar) throws Exception {				
		if(EstadoDetalleInventarioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoDetalleInventario();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoDetalleInventario() throws Exception {
		this.inicializarActualizarBindingTablaEstadoDetalleInventario(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoDetalleInventario() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoDetalleInventario.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoDetalleInventario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoDetalleInventario.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoDetalleInventarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoDetalleInventario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoDetalleInventario.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoDetalleInventarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoDetalleInventarioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleInventarioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoDetalleInventarioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoDetalleInventario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoDetalleInventario.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoDetalleInventarioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoDetalleInventario.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoDetalleInventario(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadodetalleinventarioLogic.getEstadoDetalleInventarios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadodetalleinventarios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoDetalleInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoDetalleInventario.setModel(new EstadoDetalleInventarioModel(this.estadodetalleinventarioLogic.getEstadoDetalleInventarios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoDetalleInventario.setModel(new EstadoDetalleInventarioModel(this.estadodetalleinventarios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoDetalleInventario!=null && this.jInternalFrameOrderByEstadoDetalleInventario.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoDetalleInventario();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoDetalleInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleInventario,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoDetalleInventarioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO,estadodetalleinventarioConstantesFunciones.resaltarSeleccionarEstadoDetalleInventario,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoDetalleInventarioConstantesFunciones.SCLASSWEBTITULO,estadodetalleinventarioConstantesFunciones.resaltarSeleccionarEstadoDetalleInventario,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoDetalleInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleInventario,EstadoDetalleInventarioConstantesFunciones.LABEL_ID));

		if(this.estadodetalleinventarioConstantesFunciones.mostraridEstadoDetalleInventario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoDetalleInventarioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadodetalleinventarioConstantesFunciones.resaltaridEstadoDetalleInventario,this.estadodetalleinventarioConstantesFunciones.activaridEstadoDetalleInventario,this,true,"idEstadoDetalleInventario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadodetalleinventarioConstantesFunciones.resaltaridEstadoDetalleInventario,this.estadodetalleinventarioConstantesFunciones.activaridEstadoDetalleInventario,this,true,"idEstadoDetalleInventario","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoDetalleInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleInventario,EstadoDetalleInventarioConstantesFunciones.LABEL_CODIGO));

		if(this.estadodetalleinventarioConstantesFunciones.mostrarcodigoEstadoDetalleInventario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoDetalleInventarioConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadodetalleinventarioConstantesFunciones.resaltarcodigoEstadoDetalleInventario,this.estadodetalleinventarioConstantesFunciones.activarcodigoEstadoDetalleInventario,this,true,"codigoEstadoDetalleInventario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadodetalleinventarioConstantesFunciones.resaltarcodigoEstadoDetalleInventario,this.estadodetalleinventarioConstantesFunciones.activarcodigoEstadoDetalleInventario,this,true,"codigoEstadoDetalleInventario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoDetalleInventarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoDetalleInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleInventario,EstadoDetalleInventarioConstantesFunciones.LABEL_NOMBRE));

		if(this.estadodetalleinventarioConstantesFunciones.mostrarnombreEstadoDetalleInventario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoDetalleInventarioConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadodetalleinventarioConstantesFunciones.resaltarnombreEstadoDetalleInventario,this.estadodetalleinventarioConstantesFunciones.activarnombreEstadoDetalleInventario,this,true,"nombreEstadoDetalleInventario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadodetalleinventarioConstantesFunciones.resaltarnombreEstadoDetalleInventario,this.estadodetalleinventarioConstantesFunciones.activarnombreEstadoDetalleInventario,this,true,"nombreEstadoDetalleInventario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoDetalleInventarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleCompra && this.estadodetalleinventarioConstantesFunciones.mostrarDetalleCompraEstadoDetalleInventario && !EstadoDetalleInventarioConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Compras");
				tableColumn.setHeaderValue("Detalle Compras");
				tableColumn.setCellRenderer(new DetalleCompraTableCell(estadodetalleinventarioConstantesFunciones.resaltarDetalleCompraEstadoDetalleInventario,this,this.estadodetalleinventarioConstantesFunciones.activarDetalleCompraEstadoDetalleInventario));
				tableColumn.setCellEditor(new DetalleCompraTableCell(estadodetalleinventarioConstantesFunciones.resaltarDetalleCompraEstadoDetalleInventario,this,this.estadodetalleinventarioConstantesFunciones.activarDetalleCompraEstadoDetalleInventario));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoDetalleInventario.addColumn(tableColumn);
			}

			if(this.isTienePermisosDetalleTransferencia && this.estadodetalleinventarioConstantesFunciones.mostrarDetalleTransferenciaEstadoDetalleInventario && !EstadoDetalleInventarioConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Transferencias");
				tableColumn.setHeaderValue("Detalle Transferencias");
				tableColumn.setCellRenderer(new DetalleTransferenciaTableCell(estadodetalleinventarioConstantesFunciones.resaltarDetalleTransferenciaEstadoDetalleInventario,this,this.estadodetalleinventarioConstantesFunciones.activarDetalleTransferenciaEstadoDetalleInventario));
				tableColumn.setCellEditor(new DetalleTransferenciaTableCell(estadodetalleinventarioConstantesFunciones.resaltarDetalleTransferenciaEstadoDetalleInventario,this,this.estadodetalleinventarioConstantesFunciones.activarDetalleTransferenciaEstadoDetalleInventario));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoDetalleInventario.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoDetalleInventario.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoDetalleInventario.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoDetalleInventario && this.isPermisoGuardarCambiosEstadoDetalleInventario) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoDetalleInventario.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadodetalleinventarioSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoDetalleInventario.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoDetalleInventario.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoDetalleInventario && this.isPermisoGuardarCambiosEstadoDetalleInventario) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadodetalleinventarioSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoDetalleInventario && this.isPermisoGuardarCambiosEstadoDetalleInventario) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoDetalleInventario.moveColumn(this.jTableDatosEstadoDetalleInventario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoDetalleInventario.moveColumn(this.jTableDatosEstadoDetalleInventario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadodetalleinventarioSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoDetalleInventario.moveColumn(this.jTableDatosEstadoDetalleInventario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoDetalleInventario.moveColumn(this.jTableDatosEstadoDetalleInventario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoDetalleInventario.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoDetalleInventario.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoDetalleInventario,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoDetalleInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoDetalleInventario.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoDetalleInventario.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoDetalleInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoDetalleInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoDetalleInventario.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoDetalleInventario.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoDetalleInventario.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadodetalleinventarioLogic.getEstadoDetalleInventarios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadodetalleinventarios.size()-1;
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
		//this.jTableDatosEstadoDetalleInventario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoDetalleInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoDetalleInventario();
			
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
				
				//this.isEsNuevoEstadoDetalleInventario=false;
					
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
			
				if(this.estadodetalleinventarioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoDetalleInventario==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoDetalleInventario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoDetalleInventario.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventario =(EstadoDetalleInventario) this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleinventario =(EstadoDetalleInventario) this.estadodetalleinventarios.toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadodetalleinventario.getsType().equals("DUPLICADO")
				   || this.estadodetalleinventario.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoDetalleInventario=true;
				
				} else {
					this.isEsNuevoEstadoDetalleInventario=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
					if(this.estadodetalleinventario.getId()>=0 && !this.estadodetalleinventario.getIsNew()) {						
						this.isEsNuevoEstadoDetalleInventario=false;
						
					} else {
						this.isEsNuevoEstadoDetalleInventario=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoDetalleInventario(esRelaciones);						
				
				this.seleccionarEstadoDetalleInventario(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadodetalleinventario.getId()<0) {
					this.isEsNuevoEstadoDetalleInventario=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoDetalleInventario(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoDetalleInventario(evt,rowIndex);
				}	
				
				if(this.estadodetalleinventarioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoDetalleInventario: " + this.dDif); 
					}
				}								
				
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoDetalleInventario(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadodetalleinventario)) {
					if(this.estadodetalleinventario.getId()>0) {
						this.estadodetalleinventario.setIsDeleted(true);
						
						this.estadodetalleinventariosEliminados.add(this.estadodetalleinventario);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().remove(this.estadodetalleinventario);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadodetalleinventarios.remove(this.estadodetalleinventario);				
					}
					
					
					((EstadoDetalleInventarioModel) this.jTableDatosEstadoDetalleInventario.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoDetalleInventario(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoDetalleInventario(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoDetalleInventario) {
			
			if(this.jInternalFrameDetalleFormEstadoDetalleInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoDetalleInventario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoDetalleInventario.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventario =(EstadoDetalleInventario) this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleinventario =(EstadoDetalleInventario) this.estadodetalleinventarios.toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoDetalleInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoDetalleInventario(this.estadodetalleinventario);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoDetalleInventario("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoDetalleInventario(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoDetalleInventario() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoDetalleInventario(EstadoDetalleInventario estadodetalleinventario) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoDetalleInventario(estadodetalleinventario,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoDetalleInventario(EstadoDetalleInventario estadodetalleinventario,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoDetalleInventario(estadodetalleinventario);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoDetalleInventario(estadodetalleinventario,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleInventario(estadodetalleinventario);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoDetalleInventario(EstadoDetalleInventario estadodetalleinventario) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoDetalleInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jTextFieldidEstadoDetalleInventario.setText(estadodetalleinventario.getId().toString());
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jTextFieldcodigoEstadoDetalleInventario.setText(estadodetalleinventario.getcodigo());
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jTextAreanombreEstadoDetalleInventario.setText(estadodetalleinventario.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoDetalleInventario estadodetalleinventarioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadodetalleinventarioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoDetalleInventario estadodetalleinventarioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadodetalleinventarioLocal=this.estadodetalleinventario;
			} else {
				estadodetalleinventarioLocal=this.estadodetalleinventarioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadodetalleinventarioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoDetalleInventario(estadodetalleinventarioLocal,true);
					
					if(estadodetalleinventarioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadodetalleinventarioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadodetalleinventarioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoDetalleInventario(EstadoDetalleInventario estadodetalleinventario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoDetalleInventario(estadodetalleinventario,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleInventario(estadodetalleinventario);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoDetalleInventario(EstadoDetalleInventario estadodetalleinventario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoDetalleInventario(estadodetalleinventario,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoDetalleInventario(EstadoDetalleInventario estadodetalleinventario,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoDetalleInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoDetalleInventario.jTextFieldidEstadoDetalleInventario.getText()==null || this.jInternalFrameDetalleFormEstadoDetalleInventario.jTextFieldidEstadoDetalleInventario.getText()=="" || this.jInternalFrameDetalleFormEstadoDetalleInventario.jTextFieldidEstadoDetalleInventario.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoDetalleInventario.jTextFieldidEstadoDetalleInventario.setText("0");
			}

			if(conColumnasBase) {estadodetalleinventario.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoDetalleInventario.jTextFieldidEstadoDetalleInventario.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoDetalleInventarioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleInventario.jLabelIdEstadoDetalleInventario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadodetalleinventario.setcodigo(this.jInternalFrameDetalleFormEstadoDetalleInventario.jTextFieldcodigoEstadoDetalleInventario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoDetalleInventarioConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleInventario.jLabelcodigoEstadoDetalleInventario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadodetalleinventario.setnombre(this.jInternalFrameDetalleFormEstadoDetalleInventario.jTextAreanombreEstadoDetalleInventario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoDetalleInventarioConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleInventario.jLabelnombreEstadoDetalleInventario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoDetalleInventario(EstadoDetalleInventario estadodetalleinventarioBean,EstadoDetalleInventario estadodetalleinventario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoDetalleInventario(EstadoDetalleInventario estadodetalleinventarioOrigen,EstadoDetalleInventario estadodetalleinventario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadodetalleinventarioOrigen.getId()!=null && !estadodetalleinventarioOrigen.getId().equals(0L))) {estadodetalleinventario.setId(estadodetalleinventarioOrigen.getId());}}
			if(conDefault || (!conDefault && estadodetalleinventarioOrigen.getcodigo()!=null && !estadodetalleinventarioOrigen.getcodigo().equals(""))) {estadodetalleinventario.setcodigo(estadodetalleinventarioOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadodetalleinventarioOrigen.getnombre()!=null && !estadodetalleinventarioOrigen.getnombre().equals(""))) {estadodetalleinventario.setnombre(estadodetalleinventarioOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoDetalleInventario(EstadoDetalleInventario estadodetalleinventario) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jTextFieldidEstadoDetalleInventario.setText(estadodetalleinventario.getId().toString());
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jTextFieldcodigoEstadoDetalleInventario.setText(estadodetalleinventario.getcodigo());
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jTextAreanombreEstadoDetalleInventario.setText(estadodetalleinventario.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoDetalleInventario(EstadoDetalleInventarioBean estadodetalleinventarioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jTextFieldidEstadoDetalleInventario.setText(estadodetalleinventarioBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jTextFieldcodigoEstadoDetalleInventario.setText(estadodetalleinventarioBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jTextAreanombreEstadoDetalleInventario.setText(estadodetalleinventarioBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoDetalleInventario(EstadoDetalleInventarioParameterReturnGeneral estadodetalleinventarioReturnGeneral,EstadoDetalleInventarioBean estadodetalleinventarioBean,Boolean conDefault) throws Exception { 
		try {
			EstadoDetalleInventario estadodetalleinventarioLocal=new EstadoDetalleInventario();
			
			estadodetalleinventarioLocal=estadodetalleinventarioReturnGeneral.getEstadoDetalleInventario();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadodetalleinventarioLocal.getId()!=null && !estadodetalleinventarioLocal.getId().equals(0L))) {estadodetalleinventarioBean.setId(estadodetalleinventarioLocal.getId());}}
			if(conDefault || (!conDefault && estadodetalleinventarioLocal.getcodigo()!=null && !estadodetalleinventarioLocal.getcodigo().equals(""))) {estadodetalleinventarioBean.setcodigo(estadodetalleinventarioLocal.getcodigo());}
			if(conDefault || (!conDefault && estadodetalleinventarioLocal.getnombre()!=null && !estadodetalleinventarioLocal.getnombre().equals(""))) {estadodetalleinventarioBean.setnombre(estadodetalleinventarioLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoDetalleInventarioGenerico(Long idEstadoDetalleInventarioSeleccionado,JComboBox jComboBoxEstadoDetalleInventario,List<EstadoDetalleInventario> estadodetalleinventariosLocal)throws Exception {
		try {
			EstadoDetalleInventario  estadodetalleinventarioTemp=null;

			for(EstadoDetalleInventario estadodetalleinventarioAux:estadodetalleinventariosLocal) {
				if(estadodetalleinventarioAux.getId()!=null && estadodetalleinventarioAux.getId().equals(idEstadoDetalleInventarioSeleccionado)) {
					estadodetalleinventarioTemp=estadodetalleinventarioAux;
					break;
				}
			}

			jComboBoxEstadoDetalleInventario.setSelectedItem(estadodetalleinventarioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoDetalleInventarioGenerico(JComboBox jComboBoxEstadoDetalleInventario,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoDetalleInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoDetalleInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoDetalleInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoDetalleInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoDetalleInventario.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoDetalleInventario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoDetalleInventario.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoDetalleInventario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoDetalleInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoDetalleInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetalleCompra")) {
			jButtonDetalleCompraActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("DetalleTransferencia")) {
			jButtonDetalleTransferenciaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadodetalleinventario=(EstadoDetalleInventario) estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadodetalleinventario =(EstadoDetalleInventario) estadodetalleinventarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoDetalleInventario estadodetalleinventarioRow=new EstadoDetalleInventario();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadodetalleinventarioRow=(EstadoDetalleInventario) estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadodetalleinventarioRow=(EstadoDetalleInventario) estadodetalleinventarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleCompraActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoDetalleInventario estadodetalleinventario) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoDetalleInventario==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventarioLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetalleinventario = (EstadoDetalleInventario)this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadodetalleinventario = (EstadoDetalleInventario)this.estadodetalleinventarios.toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadodetalleinventario!=null) {
						this.estadodetalleinventario = estadodetalleinventario;
					} else {
						this.estadodetalleinventario = new EstadoDetalleInventario();
					}
				}

				if(this.isTienePermisosDetalleCompra && this.permiteMantenimiento(this.estadodetalleinventario)) {
					DetalleCompraBeanSwingJInternalFrame detallecompraBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFramePopup=new DetalleCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detallecompraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFramePopup;
					} else {
						detallecompraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame;
					}

					List<EstadoDetalleInventario> estadodetalleinventarios=new ArrayList<EstadoDetalleInventario>();
					estadodetalleinventarios.add(this.estadodetalleinventario);
					if(!esRelacionado) {
						//detallecompraBeanSwingJInternalFrame.detallecompraSessionBean.setConGuardarRelaciones(false);
						//detallecompraBeanSwingJInternalFrame.detallecompraSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detallecompraBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoDetalleInventario.cargarDetalleCompraBeanSwingJInternalFrame(estadodetalleinventarios,this.estadodetalleinventario,detallecompraBeanSwingJInternalFrame,/*conInicializar,*/detallecompraBeanSwingJInternalFrame.detallecompraSessionBean.getConGuardarRelaciones(),detallecompraBeanSwingJInternalFrame.detallecompraSessionBean.getEsGuardarRelacionado());
					detallecompraBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detallecompraBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleCompra("no_relacionado");

						detallecompraBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleCompraConstantesFunciones.ITAMANIOFILATABLA + (DetalleCompraConstantesFunciones.ITAMANIOFILATABLA/2));

						detallecompraBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoDetalleInventario=(TitledBorder)this.jScrollPanelDatosEstadoDetalleInventario.getBorder();
						TitledBorder titledBorderDetalleCompra=(TitledBorder)detallecompraBeanSwingJInternalFrame.jScrollPanelDatosDetalleCompra.getBorder();

						titledBorderDetalleCompra.setTitle(titledBorderEstadoDetalleInventario.getTitle() + " -> Detalle Compra");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detallecompraBeanSwingJInternalFrame);
						}

						detallecompraBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detallecompraBeanSwingJInternalFrame);

						detallecompraBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadodetalleinventarioSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Compra",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventarioLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventarioLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonDetalleTransferenciaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoDetalleInventario estadodetalleinventario) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoDetalleInventario==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventarioLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetalleinventario = (EstadoDetalleInventario)this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadodetalleinventario = (EstadoDetalleInventario)this.estadodetalleinventarios.toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadodetalleinventario!=null) {
						this.estadodetalleinventario = estadodetalleinventario;
					} else {
						this.estadodetalleinventario = new EstadoDetalleInventario();
					}
				}

				if(this.isTienePermisosDetalleTransferencia && this.permiteMantenimiento(this.estadodetalleinventario)) {
					DetalleTransferenciaBeanSwingJInternalFrame detalletransferenciaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFramePopup=new DetalleTransferenciaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalletransferenciaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFramePopup;
					} else {
						detalletransferenciaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame;
					}

					List<EstadoDetalleInventario> estadodetalleinventarios=new ArrayList<EstadoDetalleInventario>();
					estadodetalleinventarios.add(this.estadodetalleinventario);
					if(!esRelacionado) {
						//detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaSessionBean.setConGuardarRelaciones(false);
						//detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalletransferenciaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoDetalleInventario.cargarDetalleTransferenciaBeanSwingJInternalFrame(estadodetalleinventarios,this.estadodetalleinventario,detalletransferenciaBeanSwingJInternalFrame,/*conInicializar,*/detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaSessionBean.getConGuardarRelaciones(),detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaSessionBean.getEsGuardarRelacionado());
					detalletransferenciaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalletransferenciaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleTransferencia("no_relacionado");

						detalletransferenciaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleTransferenciaConstantesFunciones.ITAMANIOFILATABLA + (DetalleTransferenciaConstantesFunciones.ITAMANIOFILATABLA/2));

						detalletransferenciaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoDetalleInventario=(TitledBorder)this.jScrollPanelDatosEstadoDetalleInventario.getBorder();
						TitledBorder titledBorderDetalleTransferencia=(TitledBorder)detalletransferenciaBeanSwingJInternalFrame.jScrollPanelDatosDetalleTransferencia.getBorder();

						titledBorderDetalleTransferencia.setTitle(titledBorderEstadoDetalleInventario.getTitle() + " -> Detalle Transferencia");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalletransferenciaBeanSwingJInternalFrame);
						}

						detalletransferenciaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalletransferenciaBeanSwingJInternalFrame);

						detalletransferenciaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadodetalleinventarioSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Transferencia",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventarioLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventarioLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoDetalleInventario(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleInventario && this.isPermisoNuevoEstadoDetalleInventario));			
			this.jButtonDuplicarEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaDuplicarEstadoDetalleInventario && this.isPermisoDuplicarEstadoDetalleInventario));			
			this.jButtonCopiarEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaCopiarEstadoDetalleInventario && this.isPermisoCopiarEstadoDetalleInventario));
			this.jButtonVerFormEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaVerFormEstadoDetalleInventario && this.isPermisoVerFormEstadoDetalleInventario));
			
			this.jButtonAbrirOrderByEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleInventario && this.isPermisoOrdenEstadoDetalleInventario));			
			
			this.jButtonNuevoRelacionesEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleInventario && this.isPermisoNuevoEstadoDetalleInventario));			
			this.jButtonNuevoGuardarCambiosEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleInventario && this.isPermisoNuevoEstadoDetalleInventario && this.isPermisoGuardarCambiosEstadoDetalleInventario));
			
			if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonModificarEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaModificarEstadoDetalleInventario && this.isPermisoActualizarEstadoDetalleInventario));	
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonActualizarEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaActualizarEstadoDetalleInventario && this.isPermisoActualizarEstadoDetalleInventario));	
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonEliminarEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaEliminarEstadoDetalleInventario && this.isPermisoEliminarEstadoDetalleInventario));
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonCancelarEstadoDetalleInventario.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleInventario);							
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonGuardarCambiosEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaGuardarEstadoDetalleInventario && this.isPermisoGuardarCambiosEstadoDetalleInventario));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoDetalleInventario && this.isPermisoGuardarCambiosEstadoDetalleInventario));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleInventario && this.isPermisoNuevoEstadoDetalleInventario));						
			this.jButtonDuplicarToolBarEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaDuplicarEstadoDetalleInventario && this.isPermisoDuplicarEstadoDetalleInventario));						
			this.jButtonCopiarToolBarEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaCopiarEstadoDetalleInventario && this.isPermisoCopiarEstadoDetalleInventario));			
			this.jButtonVerFormToolBarEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaVerFormEstadoDetalleInventario && this.isPermisoVerFormEstadoDetalleInventario));			
			this.jButtonAbrirOrderByToolBarEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleInventario && this.isPermisoOrdenEstadoDetalleInventario));
			this.jButtonNuevoRelacionesToolBarEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleInventario && this.isPermisoNuevoEstadoDetalleInventario));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleInventario && this.isPermisoNuevoEstadoDetalleInventario && this.isPermisoGuardarCambiosEstadoDetalleInventario));			
			
			if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonModificarToolBarEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaModificarEstadoDetalleInventario && this.isPermisoActualizarEstadoDetalleInventario));	
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonActualizarToolBarEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaActualizarEstadoDetalleInventario  && this.isPermisoActualizarEstadoDetalleInventario));	
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonEliminarToolBarEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaEliminarEstadoDetalleInventario && this.isPermisoEliminarEstadoDetalleInventario));
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonCancelarToolBarEstadoDetalleInventario.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleInventario);				
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonGuardarCambiosToolBarEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaGuardarEstadoDetalleInventario && this.isPermisoGuardarCambiosEstadoDetalleInventario));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoDetalleInventario && this.isPermisoGuardarCambiosEstadoDetalleInventario));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleInventario && this.isPermisoNuevoEstadoDetalleInventario));			
			this.jMenuItemDuplicarEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaDuplicarEstadoDetalleInventario && this.isPermisoDuplicarEstadoDetalleInventario));			
			this.jMenuItemCopiarEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaCopiarEstadoDetalleInventario && this.isPermisoCopiarEstadoDetalleInventario));			
			this.jMenuItemVerFormEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaVerFormEstadoDetalleInventario && this.isPermisoVerFormEstadoDetalleInventario));			
			this.jMenuItemAbrirOrderByEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleInventario && this.isPermisoOrdenEstadoDetalleInventario));			
			//this.jMenuItemMostrarOcultarEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleInventario && this.isPermisoOrdenEstadoDetalleInventario));
			this.jMenuItemDetalleAbrirOrderByEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleInventario && this.isPermisoOrdenEstadoDetalleInventario));			
			//this.jMenuItemDetalleMostrarOcultarEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleInventario && this.isPermisoOrdenEstadoDetalleInventario));			
			this.jMenuItemNuevoRelacionesEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleInventario && this.isPermisoNuevoEstadoDetalleInventario));			
			this.jMenuItemNuevoGuardarCambiosEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleInventario && this.isPermisoNuevoEstadoDetalleInventario && this.isPermisoGuardarCambiosEstadoDetalleInventario));									
			
			if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jMenuItemModificarEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaModificarEstadoDetalleInventario && this.isPermisoActualizarEstadoDetalleInventario));	
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jMenuItemActualizarEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaActualizarEstadoDetalleInventario && this.isPermisoActualizarEstadoDetalleInventario));	
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jMenuItemEliminarEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaEliminarEstadoDetalleInventario && this.isPermisoEliminarEstadoDetalleInventario));
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jMenuItemCancelarEstadoDetalleInventario.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleInventario);				
			}
			
			this.jMenuItemGuardarCambiosEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaGuardarEstadoDetalleInventario && this.isPermisoGuardarCambiosEstadoDetalleInventario));						
			this.jMenuItemGuardarCambiosTablaEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoDetalleInventario && this.isPermisoGuardarCambiosEstadoDetalleInventario));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoDetalleInventario=this.jButtonNuevoEstadoDetalleInventario.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoDetalleInventario=this.jButtonDuplicarEstadoDetalleInventario.isVisible();
			this.isVisibilidadCeldaCopiarEstadoDetalleInventario=this.jButtonCopiarEstadoDetalleInventario.isVisible();
			this.isVisibilidadCeldaVerFormEstadoDetalleInventario=this.jButtonVerFormEstadoDetalleInventario.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoDetalleInventario=this.jButtonAbrirOrderByEstadoDetalleInventario.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleInventario=this.jButtonNuevoRelacionesEstadoDetalleInventario.isVisible();
			this.isVisibilidadCeldaModificarEstadoDetalleInventario=this.jButtonModificarEstadoDetalleInventario.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) {
			this.isVisibilidadCeldaActualizarEstadoDetalleInventario=this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonActualizarEstadoDetalleInventario.isVisible();
			this.isVisibilidadCeldaEliminarEstadoDetalleInventario=this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonEliminarEstadoDetalleInventario.isVisible();
			this.isVisibilidadCeldaCancelarEstadoDetalleInventario=this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonCancelarEstadoDetalleInventario.isVisible();
			this.isVisibilidadCeldaGuardarEstadoDetalleInventario=this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonGuardarCambiosEstadoDetalleInventario.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleInventario=this.jButtonGuardarCambiosTablaEstadoDetalleInventario.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoDetalleInventario=this.jButtonNuevoToolBarEstadoDetalleInventario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleInventario=this.jButtonNuevoRelacionesToolBarEstadoDetalleInventario.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) {
			this.isVisibilidadCeldaModificarEstadoDetalleInventario=this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonModificarToolBarEstadoDetalleInventario.isVisible();
			this.isVisibilidadCeldaActualizarEstadoDetalleInventario=this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonActualizarToolBarEstadoDetalleInventario.isVisible();
			this.isVisibilidadCeldaEliminarEstadoDetalleInventario=this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonEliminarToolBarEstadoDetalleInventario.isVisible();
			this.isVisibilidadCeldaCancelarEstadoDetalleInventario=this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonCancelarToolBarEstadoDetalleInventario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoDetalleInventario=this.jButtonGuardarCambiosToolBarEstadoDetalleInventario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleInventario=this.jButtonGuardarCambiosTablaToolBarEstadoDetalleInventario.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoDetalleInventario=this.jMenuItemNuevoEstadoDetalleInventario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleInventario=this.jMenuItemNuevoRelacionesEstadoDetalleInventario.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) {
			this.isVisibilidadCeldaModificarEstadoDetalleInventario=this.jInternalFrameDetalleFormEstadoDetalleInventario.jMenuItemModificarEstadoDetalleInventario.isVisible();
			this.isVisibilidadCeldaActualizarEstadoDetalleInventario=this.jInternalFrameDetalleFormEstadoDetalleInventario.jMenuItemActualizarEstadoDetalleInventario.isVisible();
			this.isVisibilidadCeldaEliminarEstadoDetalleInventario=this.jInternalFrameDetalleFormEstadoDetalleInventario.jMenuItemEliminarEstadoDetalleInventario.isVisible();
			this.isVisibilidadCeldaCancelarEstadoDetalleInventario=this.jInternalFrameDetalleFormEstadoDetalleInventario.jMenuItemCancelarEstadoDetalleInventario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoDetalleInventario=this.jMenuItemGuardarCambiosEstadoDetalleInventario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleInventario=this.jMenuItemGuardarCambiosTablaEstadoDetalleInventario.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoDetalleInventario(Boolean esInicializar) {
		if(EstadoDetalleInventarioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadodetalleinventarioSessionBean.getConGuardarRelaciones()) {
				//if(this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoDetalleInventario();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoDetalleInventario(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoDetalleInventario() {
		this.jButtonNuevoEstadoDetalleInventario.setVisible(this.isPermisoNuevoEstadoDetalleInventario);			
		this.jButtonDuplicarEstadoDetalleInventario.setVisible(this.isPermisoDuplicarEstadoDetalleInventario);			
		this.jButtonCopiarEstadoDetalleInventario.setVisible(this.isPermisoCopiarEstadoDetalleInventario);			
		this.jButtonVerFormEstadoDetalleInventario.setVisible(this.isPermisoVerFormEstadoDetalleInventario);			
		
		this.jButtonAbrirOrderByEstadoDetalleInventario.setVisible(this.isPermisoOrdenEstadoDetalleInventario);					
		
		this.jButtonNuevoRelacionesEstadoDetalleInventario.setVisible(this.isPermisoNuevoEstadoDetalleInventario);			
		
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonModificarEstadoDetalleInventario.setVisible(this.isPermisoActualizarEstadoDetalleInventario);	
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonActualizarEstadoDetalleInventario.setVisible(this.isPermisoActualizarEstadoDetalleInventario);	
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonEliminarEstadoDetalleInventario.setVisible(this.isPermisoEliminarEstadoDetalleInventario);
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonCancelarEstadoDetalleInventario.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleInventario);						
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonGuardarCambiosEstadoDetalleInventario.setVisible(this.isPermisoGuardarCambiosEstadoDetalleInventario);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoDetalleInventario.setVisible(this.isPermisoActualizarEstadoDetalleInventario);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoDetalleInventario() {
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonModificarEstadoDetalleInventario.setVisible(this.isPermisoActualizarEstadoDetalleInventario);	
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonActualizarEstadoDetalleInventario.setVisible(this.isPermisoActualizarEstadoDetalleInventario);	
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonEliminarEstadoDetalleInventario.setVisible(this.isPermisoEliminarEstadoDetalleInventario);
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonCancelarEstadoDetalleInventario.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleInventario);							
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonGuardarCambiosEstadoDetalleInventario.setVisible((this.isVisibilidadCeldaGuardarEstadoDetalleInventario && this.isPermisoGuardarCambiosEstadoDetalleInventario));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoDetalleInventario() {
		if(EstadoDetalleInventarioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoDetalleInventario();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoDetalleInventario() {
	}
	
	public void jTableDatosEstadoDetalleInventarioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoDetalleInventario(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoDetalleInventarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoDetalleInventario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoDetalleInventario(this.getestadodetalleinventario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleInventario(this.estadodetalleinventario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetalleinventario =(EstadoDetalleInventario) this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadodetalleinventario =(EstadoDetalleInventario) this.estadodetalleinventarios.toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadodetalleinventario==null) {
						this.estadodetalleinventario = new EstadoDetalleInventario();
					}

					this.setVariablesFormularioToObjetoActualEstadoDetalleInventario(this.estadodetalleinventario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleInventario(this.estadodetalleinventario);
				}

				if(this.estadodetalleinventario.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadodetalleinventario.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoDetalleInventario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoDetalleInventarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoDetalleInventario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoDetalleInventario(this.getestadodetalleinventario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleInventario(this.estadodetalleinventario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetalleinventario =(EstadoDetalleInventario) this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadodetalleinventario =(EstadoDetalleInventario) this.estadodetalleinventarios.toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadodetalleinventario==null) {
						this.estadodetalleinventario = new EstadoDetalleInventario();
					}

					this.setVariablesFormularioToObjetoActualEstadoDetalleInventario(this.estadodetalleinventario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleInventario(this.estadodetalleinventario);
				}

				if(this.estadodetalleinventario.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadodetalleinventario.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoDetalleInventario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoDetalleInventarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoDetalleInventario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoDetalleInventario(this.getestadodetalleinventario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleInventario(this.estadodetalleinventario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetalleinventario =(EstadoDetalleInventario) this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadodetalleinventario =(EstadoDetalleInventario) this.estadodetalleinventarios.toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadodetalleinventario==null) {
						this.estadodetalleinventario = new EstadoDetalleInventario();
					}

					this.setVariablesFormularioToObjetoActualEstadoDetalleInventario(this.estadodetalleinventario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleInventario(this.estadodetalleinventario);
				}

				if(this.estadodetalleinventario.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadodetalleinventario.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoDetalleInventario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoDetalleInventario() {
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleInventario.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoDetalleInventario.dispose();
			this.jInternalFrameDetalleFormEstadoDetalleInventario=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoDetalleInventario!=null) {
			this.jInternalFrameReporteDinamicoEstadoDetalleInventario.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoDetalleInventario.dispose();
			this.jInternalFrameReporteDinamicoEstadoDetalleInventario=null;
		}
		
		if(this.jInternalFrameImportacionEstadoDetalleInventario!=null) {
			this.jInternalFrameImportacionEstadoDetalleInventario.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoDetalleInventario.dispose();
			this.jInternalFrameImportacionEstadoDetalleInventario=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoDetalleInventario();
			
			EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoDetalleInventario")) {
				jButtonNuevoEstadoDetalleInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoDetalleInventario")) {
				jButtonDuplicarEstadoDetalleInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoDetalleInventario")) {
				jButtonCopiarEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoDetalleInventario")) {
				jButtonVerFormEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoDetalleInventario")) {
				jButtonNuevoEstadoDetalleInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoDetalleInventario")) {
				jButtonDuplicarEstadoDetalleInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoDetalleInventario")) {
				jButtonNuevoEstadoDetalleInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoDetalleInventario")) {
				jButtonDuplicarEstadoDetalleInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoDetalleInventario")) {
				jButtonNuevoEstadoDetalleInventarioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoDetalleInventario")) {
				jButtonNuevoEstadoDetalleInventarioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoDetalleInventario")) {
				jButtonNuevoEstadoDetalleInventarioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoDetalleInventario")) {
				jButtonModificarEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoDetalleInventario")) {
				jButtonModificarEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoDetalleInventario")) {
				jButtonModificarEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoDetalleInventario")) {
				jButtonActualizarEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoDetalleInventario")) {
				jButtonActualizarEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoDetalleInventario")) {
				jButtonActualizarEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoDetalleInventario")) {
				jButtonEliminarEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoDetalleInventario")) {
				jButtonEliminarEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoDetalleInventario")) {
				jButtonEliminarEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoDetalleInventario")) {
				jButtonCancelarEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoDetalleInventario")) {
				jButtonCancelarEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoDetalleInventario")) {
				jButtonCancelarEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoDetalleInventario")) {
				jButtonCerrarEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoDetalleInventario")) {
				jButtonCerrarEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoDetalleInventario")) {
				jButtonCerrarEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoDetalleInventario")) {
				jButtonMostrarOcultarEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoDetalleInventario")) {
				jButtonCancelarEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoDetalleInventario")) {
				jButtonGuardarCambiosEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoDetalleInventario")) {
				jButtonGuardarCambiosEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoDetalleInventario")) {
				jButtonCopiarEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoDetalleInventario")) {
				jButtonVerFormEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoDetalleInventario")) {
				jButtonGuardarCambiosEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoDetalleInventario")) {
				jButtonCopiarEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoDetalleInventario")) {
				jButtonVerFormEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoDetalleInventario")) {
				jButtonGuardarCambiosEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoDetalleInventario")) {
				jButtonGuardarCambiosEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoDetalleInventario")) {
				jButtonGuardarCambiosEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoDetalleInventario")) {
				jButtonRecargarInformacionEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoDetalleInventario")) {
				jButtonRecargarInformacionEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoDetalleInventario")) {
				jButtonRecargarInformacionEstadoDetalleInventarioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoDetalleInventario")) {
				jButtonAnterioresEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoDetalleInventario")) {
				jButtonAnterioresEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoDetalleInventario")) {
				jButtonAnterioresEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoDetalleInventario")) {
				jButtonSiguientesEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoDetalleInventario")) {
				jButtonSiguientesEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoDetalleInventario")) {
				jButtonSiguientesEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoDetalleInventario") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoDetalleInventario")) {
				jButtonAbrirOrderByEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoDetalleInventario") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoDetalleInventario")) {
				jButtonMostrarOcultarEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoDetalleInventario")) {
				jButtonNuevoGuardarCambiosEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoDetalleInventario")) {
				jButtonNuevoGuardarCambiosEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoDetalleInventario")) {
				jButtonNuevoGuardarCambiosEstadoDetalleInventarioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoDetalleInventario")) {
				jButtonCerrarReporteDinamicoEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoDetalleInventario")) {
				jButtonGenerarReporteDinamicoEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoDetalleInventario")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoDetalleInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoDetalleInventario")) {
				jButtonCerrarImportacionEstadoDetalleInventarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoDetalleInventario")) {
				
				jButtonGenerarImportacionEstadoDetalleInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoDetalleInventario")) {
				
				jButtonAbrirImportacionEstadoDetalleInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoDetalleInventario")) {
				jComboBoxTiposAccionesEstadoDetalleInventarioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoDetalleInventario")) {
				jComboBoxTiposRelacionesEstadoDetalleInventarioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoDetalleInventario")) {
				jComboBoxTiposAccionesEstadoDetalleInventarioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoDetalleInventario")) {
				
				jComboBoxTiposSeleccionarEstadoDetalleInventarioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoDetalleInventario")) {
				jTextFieldValorCampoGeneralEstadoDetalleInventarioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoDetalleInventario")) {
				jButtonAbrirOrderByEstadoDetalleInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoDetalleInventario")) {
				jButtonAbrirOrderByEstadoDetalleInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoDetalleInventario")) {
				jButtonCerrarOrderByEstadoDetalleInventarioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoDetalleInventarioBusqueda")) {
				this.jButtonidEstadoDetalleInventarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoDetalleInventarioBusqueda")) {
				this.jButtoncodigoEstadoDetalleInventarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoDetalleInventarioBusqueda")) {
				this.jButtonnombreEstadoDetalleInventarioBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoDetalleInventario();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleInventarioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleinventario);
				
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
				
				


				
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoDetalleInventario estadodetalleinventarioLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadodetalleinventarioLocal=this.estadodetalleinventario;
			} else {
				estadodetalleinventarioLocal=this.estadodetalleinventarioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleinventario);
				
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
							
				
				


				
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventarioAnterior =(EstadoDetalleInventario) this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleinventarioAnterior =(EstadoDetalleInventario) this.estadodetalleinventarios.toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
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
			
			EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
			
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
			
			


			
			EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleInventarioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleinventario);
				
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
								
						
				


				
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleInventario.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleinventario);
				
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
								
				
				


				
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventarioAnterior =(EstadoDetalleInventario) this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleinventarioAnterior =(EstadoDetalleInventario) this.estadodetalleinventarios.toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleinventario);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventarioAnterior =(EstadoDetalleInventario) this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleinventarioAnterior =(EstadoDetalleInventario) this.estadodetalleinventarios.toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleInventarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleinventario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleinventario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleinventario);
				
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
							
				
				


				
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleInventario.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleInventarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoDetalleInventario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetalleinventarioAnterior =(EstadoDetalleInventario) this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadodetalleinventarioAnterior =(EstadoDetalleInventario) this.estadodetalleinventarios.toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
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
			
			EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
			
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
			
			


			
			EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleInventarioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleinventario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleinventario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleinventario);
				
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
								
				
				


				
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventarioAnterior =(EstadoDetalleInventario) this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleinventarioAnterior =(EstadoDetalleInventario) this.estadodetalleinventarios.toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleInventarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleinventario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleinventario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleInventarioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleinventario);
				
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoDetalleInventario")) {
					jCheckBoxSeleccionarTodosEstadoDetalleInventarioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoDetalleInventario")) {
					jCheckBoxSeleccionadosEstadoDetalleInventarioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoDetalleInventario")) {
					
				}
				
				


				
				
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleinventario);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleinventario);
				
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
												
				
				


				
				
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleInventarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoDetalleInventario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetalleinventarioAnterior =(EstadoDetalleInventario) this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadodetalleinventarioAnterior =(EstadoDetalleInventario) this.estadodetalleinventarios.toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleInventarioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleinventario);
				
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
				
				
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
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
			
			EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
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
			
			


			
			EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleInventarioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleinventario);
				
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleInventario.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleInventario.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleinventario);
				
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
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
				
				


				
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleInventario.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleinventarioAnterior =(EstadoDetalleInventario) this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleinventarioAnterior =(EstadoDetalleInventario) this.estadodetalleinventarios.toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoDetalleInventario")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoDetalleInventarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoDetalleInventario.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadodetalleinventario =(EstadoDetalleInventario) this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadodetalleinventario =(EstadoDetalleInventario) this.estadodetalleinventarios.toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadodetalleinventario);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoDetalleInventario")) {
				
				}
				
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoDetalleInventario")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoDetalleInventario.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoDetalleInventario")) {
			
			}
			
			EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoDetalleInventario();
			
			EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoDetalleInventario")) {
				jButtonNuevoEstadoDetalleInventarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoDetalleInventario")) {
				jButtonDuplicarEstadoDetalleInventarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoDetalleInventario")) {
				jButtonCopiarEstadoDetalleInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoDetalleInventario")) {
				jButtonVerFormEstadoDetalleInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoDetalleInventario")) {
				jButtonNuevoEstadoDetalleInventarioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoDetalleInventario")) {
				jButtonModificarEstadoDetalleInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoDetalleInventario")) {
				jButtonActualizarEstadoDetalleInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoDetalleInventario")) {
				jButtonEliminarEstadoDetalleInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoDetalleInventario")) {
				jButtonGuardarCambiosEstadoDetalleInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoDetalleInventario")) {
				jButtonCancelarEstadoDetalleInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoDetalleInventario")) {
				jButtonCerrarEstadoDetalleInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoDetalleInventario")) {
				jButtonGuardarCambiosEstadoDetalleInventarioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoDetalleInventario")) {
				jButtonNuevoGuardarCambiosEstadoDetalleInventarioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoDetalleInventario")) {
				jButtonAbrirOrderByEstadoDetalleInventarioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoDetalleInventario")) {
				jButtonRecargarInformacionEstadoDetalleInventarioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoDetalleInventario")) {
				jButtonAnterioresEstadoDetalleInventarioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoDetalleInventario")) {
				jButtonSiguientesEstadoDetalleInventarioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoDetalleInventarioBusqueda")) {
				this.jButtonidEstadoDetalleInventarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoDetalleInventarioBusqueda")) {
				this.jButtoncodigoEstadoDetalleInventarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoDetalleInventarioBusqueda")) {
				this.jButtonnombreEstadoDetalleInventarioBusquedaActionPerformed(evt);
			}
			
			EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoDetalleInventario();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoDetalleInventario")) {
				closingInternalFrameEstadoDetalleInventario();
				
			} else if(sTipo.equals("jButtonCancelarEstadoDetalleInventario")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoDetalleInventario = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoDetalleInventarioBeanSwingJInternalFrame jInternalFrameParent=(EstadoDetalleInventarioBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoDetalleInventario.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoDetalleInventarioActionPerformed(null);
			}
			
			EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadodetalleinventario,new Object(),this.estadodetalleinventarioParameterGeneral,this.estadodetalleinventarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoDetalleInventario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoDetalleInventario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoDetalleInventario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadodetalleinventario)) {
			if(!esControlTabla) {
				if(EstadoDetalleInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoDetalleInventario(this.estadodetalleinventario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleInventario(this.estadodetalleinventario);			
				}
				
				if(this.estadodetalleinventarioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoDetalleInventario(this.estadodetalleinventario,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadodetalleinventarioReturnGeneral=estadodetalleinventarioLogic.procesarEventosEstadoDetalleInventariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetalleinventarioLogic.getEstadoDetalleInventarios(),this.estadodetalleinventario,this.estadodetalleinventarioParameterGeneral,this.isEsNuevoEstadoDetalleInventario,classes);//this.estadodetalleinventarioLogic.getEstadoDetalleInventario()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoDetalleInventario(this.estadodetalleinventarioReturnGeneral,this.estadodetalleinventarioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadodetalleinventarioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoDetalleInventario(classes,this.estadodetalleinventarioReturnGeneral,this.estadodetalleinventarioBean,false);
					}
						
					if(this.estadodetalleinventarioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleInventario(this.estadodetalleinventarioReturnGeneral.getEstadoDetalleInventario());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoDetalleInventario(this.estadodetalleinventarioReturnGeneral.getEstadoDetalleInventario());	
					}
						
					if(this.estadodetalleinventarioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoDetalleInventario(this.estadodetalleinventarioReturnGeneral.getEstadoDetalleInventario(),classes);//this.estadodetalleinventarioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoDetalleInventario(this.estadodetalleinventario,classes);//this.estadodetalleinventarioBean);									
				}
			
				if(EstadoDetalleInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoDetalleInventario(this.estadodetalleinventario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleInventario(this.estadodetalleinventario);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadodetalleinventarioAnterior!=null) {
						this.estadodetalleinventario=this.estadodetalleinventarioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadodetalleinventarioReturnGeneral=estadodetalleinventarioLogic.procesarEventosEstadoDetalleInventariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetalleinventarioLogic.getEstadoDetalleInventarios(),this.estadodetalleinventario,this.estadodetalleinventarioParameterGeneral,this.isEsNuevoEstadoDetalleInventario,classes);//this.estadodetalleinventarioLogic.getEstadoDetalleInventario()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadodetalleinventarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadodetalleinventarioReturnGeneral.getEstadoDetalleInventario(),estadodetalleinventarioLogic.getEstadoDetalleInventarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadodetalleinventarioReturnGeneral.getEstadoDetalleInventario(),this.estadodetalleinventarios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoDetalleInventario.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoDetalleInventario.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoDetalleInventario();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoDetalleInventario() throws Exception {
		
		EstadoDetalleInventarioModel estadodetalleinventarioModel=(EstadoDetalleInventarioModel)this.jTableDatosEstadoDetalleInventario.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadodetalleinventarioModel.estadodetalleinventarios=this.estadodetalleinventarioLogic.getEstadoDetalleInventarios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadodetalleinventarioModel.estadodetalleinventarios=this.estadodetalleinventarios;
		}
		
		
		((EstadoDetalleInventarioModel) this.jTableDatosEstadoDetalleInventario.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoDetalleInventario() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadodetalleinventarioAnterior(),this.estadodetalleinventarioLogic.getEstadoDetalleInventarios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadodetalleinventarioAnterior(),this.estadodetalleinventarios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoDetalleInventario();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoDetalleInventario(EstadoDetalleInventario estadodetalleinventario,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleCompra.class)) {
					this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecompraLogic.setDetalleCompras(estadodetalleinventario.getDetalleCompras());
					this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleCompra(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleTransferencia.class)) {
					this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.setDetalleTransferencias(estadodetalleinventario.getDetalleTransferencias());
					this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleTransferencia(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
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
										
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetalleinventario,new Object(),generalEntityParameterGeneral,this.estadodetalleinventarioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadodetalleinventarioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoDetalleInventarioConstantesFunciones.getClassesRelationshipsOfEstadoDetalleInventario(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoDetalleInventarioConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoDetalleInventario(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoDetalleInventario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetalleinventario,new Object(),generalEntityParameterGeneral,this.estadodetalleinventarioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoDetalleInventario(EstadoDetalleInventarioBean estadodetalleinventarioBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleCompra.class)) {
					this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecompraLogic.setDetalleCompras(estadodetalleinventario.getDetalleCompras());
					this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleCompra(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleTransferencia.class)) {
					this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.setDetalleTransferencias(estadodetalleinventario.getDetalleTransferencias());
					this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleTransferencia(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoDetalleInventario(ArrayList<Classe> classes,EstadoDetalleInventarioReturnGeneral estadodetalleinventarioReturnGeneral,EstadoDetalleInventarioBean estadodetalleinventarioBean,Boolean conDefault) throws Exception {
		
			this.estadodetalleinventarioBean.setDetalleCompras(estadodetalleinventarioReturnGeneral.getEstadoDetalleInventario().getDetalleCompras());
			this.estadodetalleinventarioBean.setDetalleTransferencias(estadodetalleinventarioReturnGeneral.getEstadoDetalleInventario().getDetalleTransferencias());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoDetalleInventario(EstadoDetalleInventario estadodetalleinventario,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleCompra.class)) {
					estadodetalleinventario.setDetalleCompras(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraBeanSwingJInternalFrame.detallecompraLogic.getDetalleCompras());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleTransferencia.class)) {
					estadodetalleinventario.setDetalleTransferencias(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.getDetalleTransferencias());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadodetalleinventario)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoDetalleInventario = new EstadoDetalleInventarioDetalleFormJInternalFrame(jDesktopPane,this.estadodetalleinventarioSessionBean.getConGuardarRelaciones(),this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoDetalleInventario);
		this.jInternalFrameDetalleFormEstadoDetalleInventario.setVisible(false);
		this.jInternalFrameDetalleFormEstadoDetalleInventario.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoDetalleInventario.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoDetalleInventario.estadodetalleinventarioLogic=this.estadodetalleinventarioLogic;
		
		this.cargarCombosFrameForeignKeyEstadoDetalleInventario("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoDetalleInventario();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoDetalleInventario();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoDetalleInventario("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoDetalleInventario();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoDetalleInventario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoDetalleInventario"));
		
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonModificarEstadoDetalleInventario.addActionListener(new ButtonActionListener(this,"ModificarEstadoDetalleInventario"));

		
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonModificarToolBarEstadoDetalleInventario.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoDetalleInventario"));
					
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jMenuItemModificarEstadoDetalleInventario.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoDetalleInventario"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonActualizarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"ActualizarEstadoDetalleInventario"));
		
		
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonActualizarToolBarEstadoDetalleInventario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoDetalleInventario"));
						
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jMenuItemActualizarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoDetalleInventario"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonEliminarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"EliminarEstadoDetalleInventario"));
		
		
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonEliminarToolBarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoDetalleInventario"));
								
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jMenuItemEliminarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoDetalleInventario"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonCancelarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"CancelarEstadoDetalleInventario"));
		
		
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonCancelarToolBarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoDetalleInventario"));
					
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jMenuItemCancelarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoDetalleInventario"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jMenuItemDetalleCerrarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoDetalleInventario"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonGuardarCambiosToolBarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoDetalleInventario"));
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonGuardarCambiosToolBarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoDetalleInventario"));
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jComboBoxTiposAccionesFormularioEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoDetalleInventario"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonidEstadoDetalleInventarioBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoDetalleInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtoncodigoEstadoDetalleInventarioBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoDetalleInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonnombreEstadoDetalleInventarioBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoDetalleInventarioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jTabbedPaneRelacionesEstadoDetalleInventario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoDetalleInventario"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoDetalleInventario"));
		
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleInventario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoDetalleInventario"));
		}
		
		this.jTableDatosEstadoDetalleInventario.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoDetalleInventario"));
		
		this.jTableDatosEstadoDetalleInventario.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoDetalleInventario"));
		
		this.jButtonNuevoEstadoDetalleInventario.addActionListener(new ButtonActionListener(this,"NuevoEstadoDetalleInventario"));
		
		this.jButtonDuplicarEstadoDetalleInventario.addActionListener(new ButtonActionListener(this,"DuplicarEstadoDetalleInventario"));
		
		this.jButtonCopiarEstadoDetalleInventario.addActionListener(new ButtonActionListener(this,"CopiarEstadoDetalleInventario"));
		
		this.jButtonVerFormEstadoDetalleInventario.addActionListener(new ButtonActionListener(this,"VerFormEstadoDetalleInventario"));
		
		
		this.jButtonNuevoToolBarEstadoDetalleInventario.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoDetalleInventario"));
			
		this.jButtonDuplicarToolBarEstadoDetalleInventario.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoDetalleInventario"));
			
		this.jMenuItemNuevoEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoDetalleInventario"));
			
		this.jMenuItemDuplicarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoDetalleInventario"));		
		
		
		this.jButtonNuevoRelacionesEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoDetalleInventario"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoDetalleInventario.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoDetalleInventario"));
			
		this.jMenuItemNuevoRelacionesEstadoDetalleInventario.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoDetalleInventario"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonModificarEstadoDetalleInventario.addActionListener(new ButtonActionListener(this,"ModificarEstadoDetalleInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonModificarToolBarEstadoDetalleInventario.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoDetalleInventario"));
			
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jMenuItemModificarEstadoDetalleInventario.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoDetalleInventario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonActualizarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"ActualizarEstadoDetalleInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonActualizarToolBarEstadoDetalleInventario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoDetalleInventario"));
				
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jMenuItemActualizarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoDetalleInventario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonEliminarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"EliminarEstadoDetalleInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonEliminarToolBarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoDetalleInventario"));
						
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jMenuItemEliminarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoDetalleInventario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonCancelarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"CancelarEstadoDetalleInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonCancelarToolBarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoDetalleInventario"));
			
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jMenuItemCancelarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoDetalleInventario"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoDetalleInventario"));		
		
		
		this.jButtonCerrarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"CerrarEstadoDetalleInventario"));
		
		
		this.jButtonCerrarToolBarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoDetalleInventario"));
			
		this.jMenuItemCerrarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoDetalleInventario"));
			
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jMenuItemDetalleCerrarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoDetalleInventario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonGuardarCambiosEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoDetalleInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonGuardarCambiosToolBarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoDetalleInventario"));
		}
		
		this.jButtonCopiarToolBarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoDetalleInventario"));
			
		this.jButtonVerFormToolBarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoDetalleInventario"));
		
		this.jMenuItemGuardarCambiosEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoDetalleInventario"));
			
		this.jMenuItemCopiarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoDetalleInventario"));		
		
		this.jMenuItemVerFormEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoDetalleInventario"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoDetalleInventario"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoDetalleInventario"));
			
		this.jMenuItemGuardarCambiosTablaEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoDetalleInventario"));		
		
		
		
		this.jButtonRecargarInformacionEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoDetalleInventario"));
					
		this.jButtonRecargarInformacionToolBarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoDetalleInventario"));
		
		this.jMenuItemRecargarInformacionEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoDetalleInventario"));		
		
		
		
		this.jButtonAnterioresEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"AnterioresEstadoDetalleInventario"));
		
		
		this.jButtonAnterioresToolBarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoDetalleInventario"));
		
		this.jMenuItemAnterioresEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoDetalleInventario"));		
		
		
		this.jButtonSiguientesEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"SiguientesEstadoDetalleInventario"));
		
		
		this.jButtonSiguientesToolBarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoDetalleInventario"));
			
		this.jMenuItemSiguientesEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoDetalleInventario"));
			
		this.jMenuItemAbrirOrderByEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoDetalleInventario"));
			
		this.jMenuItemMostrarOcultarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoDetalleInventario"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoDetalleInventario"));
			
		this.jMenuItemDetalleMostarOcultarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoDetalleInventario"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoDetalleInventario"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoDetalleInventario"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoDetalleInventario"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoDetalleInventario.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoDetalleInventario"));

		this.jCheckBoxSeleccionadosEstadoDetalleInventario.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoDetalleInventario"));
		
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jComboBoxTiposAccionesFormularioEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoDetalleInventario"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoDetalleInventario"));
			
		this.jComboBoxTiposAccionesEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoDetalleInventario"));
					
		this.jComboBoxTiposSeleccionarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoDetalleInventario"));
			
		this.jTextFieldValorCampoGeneralEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoDetalleInventario"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonidEstadoDetalleInventarioBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoDetalleInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtoncodigoEstadoDetalleInventarioBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoDetalleInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonnombreEstadoDetalleInventarioBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoDetalleInventarioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoDetalleInventario!=null) {
				this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoDetalleInventario"));
				this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoDetalleInventario"));
				this.jInternalFrameReporteDinamicoEstadoDetalleInventario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoDetalleInventario"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoDetalleInventario"));				
			//this.jButtonGenerarReporteDinamicoEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoDetalleInventario"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoDetalleInventario"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoDetalleInventario!=null) {
				this.jInternalFrameImportacionEstadoDetalleInventario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoDetalleInventario"));
				this.jInternalFrameImportacionEstadoDetalleInventario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoDetalleInventario"));
				this.jInternalFrameImportacionEstadoDetalleInventario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoDetalleInventario"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoDetalleInventario"));
			
			this.jButtonAbrirOrderByToolBarEstadoDetalleInventario.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoDetalleInventario"));			
			
			if(this.jInternalFrameOrderByEstadoDetalleInventario!=null) {
				this.jInternalFrameOrderByEstadoDetalleInventario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoDetalleInventario"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleInventario.jTabbedPaneRelacionesEstadoDetalleInventario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoDetalleInventario"));
		
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
            		closingInternalFrameEstadoDetalleInventario();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoDetalleInventario.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoDetalleInventario = (JInternalFrameBase)event.getSource();
	            	
	            EstadoDetalleInventarioBeanSwingJInternalFrame jInternalFrameParent=(EstadoDetalleInventarioBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoDetalleInventario.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoDetalleInventarioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoDetalleInventario.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoDetalleInventarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoDetalleInventario.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoDetalleInventario.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleInventarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleInventarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleInventarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoDetalleInventario";
		inputMap = this.jButtonNuevoEstadoDetalleInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoDetalleInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoDetalleInventarioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleInventarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleInventarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleInventarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoDetalleInventario";
		inputMap = this.jButtonNuevoRelacionesEstadoDetalleInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoDetalleInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoDetalleInventarioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoDetalleInventario";
		inputMap = this.jButtonModificarEstadoDetalleInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoDetalleInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoDetalleInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoDetalleInventario";
		inputMap = this.jButtonActualizarEstadoDetalleInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoDetalleInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoDetalleInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoDetalleInventario";
		inputMap = this.jButtonEliminarEstadoDetalleInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoDetalleInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoDetalleInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoDetalleInventario";
		inputMap = this.jButtonCancelarEstadoDetalleInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoDetalleInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoDetalleInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoDetalleInventario";
		inputMap = this.jButtonCerrarEstadoDetalleInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoDetalleInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoDetalleInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonGuardarCambiosEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoDetalleInventario";
		inputMap = this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonGuardarCambiosEstadoDetalleInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonGuardarCambiosEstadoDetalleInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoDetalleInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoDetalleInventario.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoDetalleInventarioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoDetalleInventario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoDetalleInventarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoDetalleInventario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoDetalleInventarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoDetalleInventario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoDetalleInventarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonidEstadoDetalleInventarioBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoDetalleInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtoncodigoEstadoDetalleInventarioBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoDetalleInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jButtonnombreEstadoDetalleInventarioBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoDetalleInventarioBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoDetalleInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoDetalleInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoDetalleInventarioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoDetalleInventario.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoDetalleInventario(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoDetalleInventario estadodetalleinventarioAux:this.estadodetalleinventarioLogic.getEstadoDetalleInventarios()) {
					estadodetalleinventarioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetalleInventario estadodetalleinventarioAux:estadodetalleinventarios) {
					estadodetalleinventarioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoDetalleInventarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoDetalleInventario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoDetalleInventario estadodetalleinventarioAux:this.estadodetalleinventarioLogic.getEstadoDetalleInventarios()) {
						estadodetalleinventarioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoDetalleInventario estadodetalleinventarioAux:estadodetalleinventarios) {
						estadodetalleinventarioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoDetalleInventario estadodetalleinventarioAux:this.estadodetalleinventarioLogic.getEstadoDetalleInventarios()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoDetalleInventario estadodetalleinventarioAux:estadodetalleinventarios) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoDetalleInventario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoDetalleInventario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoDetalleInventario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleInventario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoDetalleInventarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoDetalleInventario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoDetalleInventario.getSelectedRows();
			
			EstadoDetalleInventario estadodetalleinventarioLocal=new EstadoDetalleInventario();
			
			//this.seleccionarTodosEstadoDetalleInventario(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadodetalleinventarioLocal =(EstadoDetalleInventario) this.estadodetalleinventarioLogic.getEstadoDetalleInventarios().toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadodetalleinventarioLocal =(EstadoDetalleInventario) this.estadodetalleinventarios.toArray()[this.jTableDatosEstadoDetalleInventario.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadodetalleinventarioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoDetalleInventario estadodetalleinventarioAux:this.estadodetalleinventarioLogic.getEstadoDetalleInventarios()) {
						estadodetalleinventarioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoDetalleInventario estadodetalleinventarioAux:estadodetalleinventarios) {
						estadodetalleinventarioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoDetalleInventario(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoDetalleInventario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoDetalleInventario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleInventario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoDetalleInventarioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoDetalleInventarioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoDetalleInventarioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoDetalleInventario(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoDetalleInventario.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoDetalleInventario estadodetalleinventarioAux:this.estadodetalleinventarioLogic.getEstadoDetalleInventarios()) {
				
						if(sTipoSeleccionar.equals(EstadoDetalleInventarioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadodetalleinventarioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoDetalleInventarioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadodetalleinventarioAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetalleInventario estadodetalleinventarioAux:estadodetalleinventarios) {
					
						if(sTipoSeleccionar.equals(EstadoDetalleInventarioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadodetalleinventarioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoDetalleInventarioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadodetalleinventarioAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoDetalleInventario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoDetalleInventarioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoDetalleInventario(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoDetalleInventario=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoDetalleInventario.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoDetalleInventario.jComboBoxTiposAccionesFormularioEstadoDetalleInventario.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoDetalleInventario) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoDetalleInventario(conSplash);
				
					this.generarReporteEstadoDetalleInventariosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetalleInventario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetalleInventario.jComboBoxTiposAccionesFormularioEstadoDetalleInventario.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoDetalleInventariosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoDetalleInventario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoDetalleInventariosSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoDetalleInventario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoDetalleInventariosSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoDetalleInventario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoDetalleInventario();
				
				this.exportarEstadoDetalleInventariosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetalleInventario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetalleInventario.jComboBoxTiposAccionesFormularioEstadoDetalleInventario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoDetalleInventarios();
				//this.importarEstadoDetalleInventarios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetalleInventario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetalleInventario.jComboBoxTiposAccionesFormularioEstadoDetalleInventario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoDetalleInventario();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoDetalleInventariosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoDetalleInventario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Detalle Inventario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoDetalleInventario();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoDetalleInventario)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoDetalleInventario(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Detalle Inventario",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetalleInventario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetalleInventario.jComboBoxTiposAccionesFormularioEstadoDetalleInventario.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadoDetalleInventarioBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadoDetalleInventario) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadoDetalleInventario(conSplash);
					
						//this.actualizarParametrosGeneralEstadoDetalleInventario();
						
						this.generarReporteProcesoAccionEstadoDetalleInventariosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadoDetalleInventario.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadoDetalleInventario.jComboBoxTiposAccionesFormularioEstadoDetalleInventario.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estado Detalle InventarioS SELECCIONADOS?", "MANTENIMIENTO DE Estado Detalle Inventario", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadoDetalleInventario();
				
						this.actualizarParametrosGeneralEstadoDetalleInventario();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadodetalleinventarioReturnGeneral=estadodetalleinventarioLogic.procesarAccionEstadoDetalleInventariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadodetalleinventarioLogic.getEstadoDetalleInventarios(),this.estadodetalleinventarioParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadoDetalleInventarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoDetalleInventario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoDetalleInventario.jComboBoxTiposAccionesFormularioEstadoDetalleInventario.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoDetalleInventario();
					
					EstadoDetalleInventarioBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadoDetalleInventarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoDetalleInventario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoDetalleInventario.jComboBoxTiposAccionesFormularioEstadoDetalleInventario.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoDetalleInventario(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoDetalleInventarioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoDetalleInventario();
			
			if(this.jInternalFrameDetalleFormEstadoDetalleInventario==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoDetalleInventario> estadodetalleinventariosSeleccionados=new ArrayList<EstadoDetalleInventario>();		
			EstadoDetalleInventario estadodetalleinventario=new EstadoDetalleInventario();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoDetalleInventario(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoDetalleInventario.getSelectedItem();
			
			
			
			
			estadodetalleinventariosSeleccionados=this.getEstadoDetalleInventariosSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadodetalleinventariosSeleccionados.size()==1) {
				for(EstadoDetalleInventario estadodetalleinventarioAux:estadodetalleinventariosSeleccionados) {
					estadodetalleinventario=estadodetalleinventarioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Compra")) {
					jButtonDetalleCompraActionPerformed(null,rowIndex,true,false,estadodetalleinventario);
				}
				else if(this.sTipoRelacion.equals("Detalle Transferencia")) {
					jButtonDetalleTransferenciaActionPerformed(null,rowIndex,true,false,estadodetalleinventario);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoDetalleInventario();
			
      		//this.finishProcessEstadoDetalleInventario(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoDetalleInventarioReturnGeneral() throws Exception {
		if(this.estadodetalleinventarioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadodetalleinventarioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadodetalleinventarioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadodetalleinventarioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadodetalleinventarioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadodetalleinventarioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoDetalleInventario(false);
		}
		
		if(this.estadodetalleinventarioReturnGeneral.getConRetornoLista() || this.estadodetalleinventarioReturnGeneral.getConRetornoObjeto()) {
			if(this.estadodetalleinventarioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadodetalleinventarioLogic.setEstadoDetalleInventarios(this.estadodetalleinventarioReturnGeneral.getEstadoDetalleInventarios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadodetalleinventarioReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadodetalleinventarioLogic.setEstadoDetalleInventario(this.estadodetalleinventarioReturnGeneral.getEstadoDetalleInventario());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoDetalleInventario(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoDetalleInventario() throws Exception {
		
		
	}
	
	public ArrayList<EstadoDetalleInventario> getEstadoDetalleInventariosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoDetalleInventario> estadodetalleinventariosSeleccionados=new ArrayList<EstadoDetalleInventario>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoDetalleInventario) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoDetalleInventario estadodetalleinventarioAux:estadodetalleinventarioLogic.getEstadoDetalleInventarios()) {
					if(estadodetalleinventarioAux.getIsSelected()) {
						estadodetalleinventariosSeleccionados.add(estadodetalleinventarioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetalleInventario estadodetalleinventarioAux:this.estadodetalleinventarios) {
					if(estadodetalleinventarioAux.getIsSelected()) {
						estadodetalleinventariosSeleccionados.add(estadodetalleinventarioAux);				
					}
				}
			}
			
			if(estadodetalleinventariosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadodetalleinventariosSeleccionados.addAll(this.estadodetalleinventarioLogic.getEstadoDetalleInventarios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadodetalleinventariosSeleccionados.addAll(this.estadodetalleinventarios);				
					}
				}
			}
		} else {
			estadodetalleinventariosSeleccionados.add(this.estadodetalleinventario);
		}
		
		return estadodetalleinventariosSeleccionados;
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
	
	public void generarReporteEstadoDetalleInventariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoDetalleInventariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoDetalleInventariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoDetalleInventariosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoDetalleInventariosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoDetalleInventariosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Detalle Inventario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoDetalleInventariosSeleccionados() throws Exception {
		ArrayList<EstadoDetalleInventario> estadodetalleinventariosSeleccionados=new ArrayList<EstadoDetalleInventario>();		
		
		estadodetalleinventariosSeleccionados=this.getEstadoDetalleInventariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoDetalleInventarios("Todos",estadodetalleinventariosSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoDetalleInventariosSeleccionados() throws Exception {
		ArrayList<EstadoDetalleInventario> estadodetalleinventariosSeleccionados=new ArrayList<EstadoDetalleInventario>();		
		
		estadodetalleinventariosSeleccionados=this.getEstadoDetalleInventariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoDetalleInventarios("Todos",estadodetalleinventariosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoDetalleInventariosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoDetalleInventario> estadodetalleinventariosSeleccionados=new ArrayList<EstadoDetalleInventario>();
		
		estadodetalleinventariosSeleccionados=this.getEstadoDetalleInventariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoDetalleInventarios("Todos",estadodetalleinventariosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoDetalleInventariosSeleccionados() throws Exception {
		ArrayList<EstadoDetalleInventario> estadodetalleinventariosSeleccionados=new ArrayList<EstadoDetalleInventario>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoDetalleInventario();
		
		
		estadodetalleinventariosSeleccionados=this.getEstadoDetalleInventariosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoDetalleInventario();
		
		
		//this.generarReporteEstadoDetalleInventarios("Todos",estadodetalleinventariosSeleccionados ,estadodetalleinventarioImplementable,estadodetalleinventarioImplementableHome);
	}
	
	public void mostrarImportacionEstadoDetalleInventarios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoDetalleInventario();
		
		this.abrirFrameImportacionEstadoDetalleInventario();		
		
			
		//this.generarReporteEstadoDetalleInventarios("Todos",estadodetalleinventariosSeleccionados ,estadodetalleinventarioImplementable,estadodetalleinventarioImplementableHome);
	}
	
	public void importarEstadoDetalleInventarios() throws Exception {		
	
	}
	
	public void exportarEstadoDetalleInventariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoDetalleInventariosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoDetalleInventariosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoDetalleInventariosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Detalle Inventario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoDetalleInventariosSeleccionados() throws Exception {
		ArrayList<EstadoDetalleInventario> estadodetalleinventariosSeleccionados=new ArrayList<EstadoDetalleInventario>();		
		
		estadodetalleinventariosSeleccionados=this.getEstadoDetalleInventariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleinventario."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoDetalleInventario(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoDetalleInventario estadodetalleinventarioAux:estadodetalleinventariosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoDetalleInventario(estadodetalleinventarioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadodetalleinventarioAux.setsDetalleGeneralEntityReporte(estadodetalleinventarioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoDetalleInventario(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoDetalleInventarioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoDetalleInventarioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoDetalleInventarioConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoDetalleInventarioConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoDetalleInventario(EstadoDetalleInventario estadodetalleinventario,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadodetalleinventario.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadodetalleinventario.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadodetalleinventario.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadodetalleinventario.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoDetalleInventariosSeleccionados() throws Exception {
		ArrayList<EstadoDetalleInventario> estadodetalleinventariosSeleccionados=new ArrayList<EstadoDetalleInventario>();		
		
		estadodetalleinventariosSeleccionados=this.getEstadoDetalleInventariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleinventario.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoDetalleInventarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoDetalleInventario(row);				
				iRow++;
			}				
			
			for(EstadoDetalleInventario estadodetalleinventarioAux:estadodetalleinventariosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoDetalleInventario(estadodetalleinventarioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoDetalleInventariosSeleccionados() throws Exception {
		ArrayList<EstadoDetalleInventario> estadodetalleinventariosSeleccionados=new ArrayList<EstadoDetalleInventario>();		
		
		estadodetalleinventariosSeleccionados=this.getEstadoDetalleInventariosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleinventario.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadodetalleinventarios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadodetalleinventario");
			//elementRoot.appendChild(element);
		
			for(EstadoDetalleInventario estadodetalleinventarioAux:estadodetalleinventariosSeleccionados) {
				element = document.createElement("estadodetalleinventario");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoDetalleInventario(estadodetalleinventarioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoDetalleInventario(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetalleInventarioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetalleInventarioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetalleInventarioConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetalleInventarioConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoDetalleInventario(EstadoDetalleInventario estadodetalleinventario,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadodetalleinventario.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadodetalleinventario.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadodetalleinventario.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoDetalleInventario(EstadoDetalleInventario estadodetalleinventario,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoDetalleInventarioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadodetalleinventario.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoDetalleInventarioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadodetalleinventario.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoDetalleInventarioConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadodetalleinventario.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoDetalleInventarioConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadodetalleinventario.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoDetalleInventariosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoDetalleInventario> estadodetalleinventariosSeleccionados=new ArrayList<EstadoDetalleInventario>();
		
		estadodetalleinventariosSeleccionados=this.getEstadoDetalleInventariosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoDetalleInventario(estadodetalleinventariosSeleccionados);
		
		this.generarReporteEstadoDetalleInventarios("Todos",estadodetalleinventariosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoDetalleInventario(ArrayList<EstadoDetalleInventario> estadodetalleinventariosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoDetalleInventario estadodetalleinventarioAux:estadodetalleinventariosSeleccionados) {
				estadodetalleinventarioAux.setsDetalleGeneralEntityReporte(estadodetalleinventarioAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoDetalleInventarioConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadodetalleinventarioAux.setsDescripcionGeneralEntityReporte1(estadodetalleinventarioAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoDetalleInventarioConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadodetalleinventarioAux.setsDescripcionGeneralEntityReporte1(estadodetalleinventarioAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoDetalleInventario(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoDetalleInventario=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleInventario=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoDetalleInventario=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoDetalleInventario=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleInventario=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleInventario=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleInventario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleInventario=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleInventario=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoDetalleInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleInventario=false;
			this.isVisibilidadCeldaModificarEstadoDetalleInventario=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleInventario=true;
			this.isVisibilidadCeldaEliminarEstadoDetalleInventario=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleInventario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleInventario=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleInventario=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoDetalleInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleInventario=false;
			this.isVisibilidadCeldaModificarEstadoDetalleInventario=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleInventario=true;
			this.isVisibilidadCeldaEliminarEstadoDetalleInventario=true;
			this.isVisibilidadCeldaCancelarEstadoDetalleInventario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleInventario=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleInventario=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoDetalleInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleInventario=false;
			this.isVisibilidadCeldaModificarEstadoDetalleInventario=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleInventario=true;
			this.isVisibilidadCeldaEliminarEstadoDetalleInventario=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleInventario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleInventario=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleInventario=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoDetalleInventario=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleInventario=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleInventario=true;
			this.isVisibilidadCeldaModificarEstadoDetalleInventario=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleInventario=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleInventario=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleInventario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleInventario=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleInventario=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoDetalleInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleInventario=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleInventario=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleInventario=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleInventario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleInventario=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleInventario=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoDetalleInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleInventario=false;
			this.isVisibilidadCeldaModificarEstadoDetalleInventario=true;
			this.isVisibilidadCeldaActualizarEstadoDetalleInventario=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleInventario=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleInventario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleInventario=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleInventario=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoDetalleInventarioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoDetalleInventario=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleInventario=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleInventario=true;
		} else {
			this.actualizarEstadoPanelsEstadoDetalleInventario(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoDetalleInventario=false;
			//this.isVisibilidadCeldaVerFormEstadoDetalleInventario=false;
			this.isVisibilidadCeldaDuplicarEstadoDetalleInventario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadodetalleinventarioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleInventario=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoDetalleInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleInventario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
			if(!estadodetalleinventarioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleInventario=false;												
			}
			
			this.jButtonCerrarEstadoDetalleInventario.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleInventario=false;
		}
		
		if(!this.permiteMantenimiento(this.estadodetalleinventario)) {
			this.isVisibilidadCeldaActualizarEstadoDetalleInventario=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleInventario=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoDetalleInventario() {
		this.isVisibilidadCeldaNuevoEstadoDetalleInventario=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoDetalleInventario=false;
	}
	
	public void actualizarEstadoPanelsEstadoDetalleInventario(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoDetalleInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleInventario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleInventario!=null) {
				this.jScrollPanelDatosEstadoDetalleInventario.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetalleInventario!=null) {
				this.jPanelPaginacionEstadoDetalleInventario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleInventario!=null) {
				this.jPanelParametrosReportesEstadoDetalleInventario.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoDetalleInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleInventario.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoDetalleInventario!=null) {
				this.jScrollPanelDatosEstadoDetalleInventario.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoDetalleInventario!=null) {
				this.jPanelPaginacionEstadoDetalleInventario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleInventario!=null) {
				this.jPanelParametrosReportesEstadoDetalleInventario.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoDetalleInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleInventario.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleInventario!=null) {
				this.jScrollPanelDatosEstadoDetalleInventario.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoDetalleInventario!=null) {
				this.jPanelPaginacionEstadoDetalleInventario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleInventario!=null) {
				this.jPanelParametrosReportesEstadoDetalleInventario.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoDetalleInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleInventario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleInventario!=null) {
				this.jScrollPanelDatosEstadoDetalleInventario.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoDetalleInventario!=null) {
				this.jPanelPaginacionEstadoDetalleInventario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleInventario!=null) {
				this.jPanelParametrosReportesEstadoDetalleInventario.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoDetalleInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleInventario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleInventario!=null) {
				this.jScrollPanelDatosEstadoDetalleInventario.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetalleInventario!=null) {
				this.jPanelPaginacionEstadoDetalleInventario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleInventario!=null) {
				this.jPanelParametrosReportesEstadoDetalleInventario.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoDetalleInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleInventario.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleInventario!=null) {
				this.jScrollPanelDatosEstadoDetalleInventario.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetalleInventario!=null) {
				this.jPanelPaginacionEstadoDetalleInventario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleInventario!=null) {
				this.jPanelParametrosReportesEstadoDetalleInventario.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoDetalleInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleInventario.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleInventario!=null) {
				this.jScrollPanelDatosEstadoDetalleInventario.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetalleInventario!=null) {
				this.jPanelPaginacionEstadoDetalleInventario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleInventario!=null) {
				this.jPanelParametrosReportesEstadoDetalleInventario.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadodetalleinventarioSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoDetalleInventarioParaDetalleCompras() throws Exception {
		Boolean isPaginaPopupDetalleCompra=false;

		try {

			if(this.estadodetalleinventarioSessionBean==null) {
				this.estadodetalleinventarioSessionBean=new EstadoDetalleInventarioSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraSessionBean=new DetalleCompraSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraSessionBean.setsPathNavegacionActual(estadodetalleinventarioSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleCompraConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleCompra=this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleCompra(true);
			this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleCompra(EstadoDetalleInventarioConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraSessionBean.setisBusquedaDesdeForeignKeySesionEstadoDetalleInventario(true);
			this.jInternalFrameDetalleFormEstadoDetalleInventario.detallecompraSessionBean.setlidEstadoDetalleInventarioActual(this.idEstadoDetalleInventarioActual);

			estadodetalleinventarioSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoDetalleInventario(true);
			estadodetalleinventarioSessionBean.setlIdEstadoDetalleInventarioActualForeignKey(this.idEstadoDetalleInventarioActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionEstadoDetalleInventarioParaDetalleTransferencias() throws Exception {
		Boolean isPaginaPopupDetalleTransferencia=false;

		try {

			if(this.estadodetalleinventarioSessionBean==null) {
				this.estadodetalleinventarioSessionBean=new EstadoDetalleInventarioSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaSessionBean=new DetalleTransferenciaSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaSessionBean.setsPathNavegacionActual(estadodetalleinventarioSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleTransferencia=this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleTransferencia(true);
			this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleTransferencia(EstadoDetalleInventarioConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaSessionBean.setisBusquedaDesdeForeignKeySesionEstadoDetalleInventario(true);
			this.jInternalFrameDetalleFormEstadoDetalleInventario.detalletransferenciaSessionBean.setlidEstadoDetalleInventarioActual(this.idEstadoDetalleInventarioActual);

			estadodetalleinventarioSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoDetalleInventario(true);
			estadodetalleinventarioSessionBean.setlIdEstadoDetalleInventarioActualForeignKey(this.idEstadoDetalleInventarioActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoDetalleInventarioSessionBean estadodetalleinventarioSessionBean=new EstadoDetalleInventarioSessionBean();
		
		if(this.estadodetalleinventarioSessionBean==null) {
			this.estadodetalleinventarioSessionBean=new EstadoDetalleInventarioSessionBean();
		}
		
		this.estadodetalleinventarioSessionBean.setsUltimaBusquedaEstadoDetalleInventario(this.getsAccionBusqueda());
		this.estadodetalleinventarioSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadodetalleinventarioSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoDetalleInventarioSessionBean estadodetalleinventarioSessionBean=new EstadoDetalleInventarioSessionBean();
		
		if(this.estadodetalleinventarioSessionBean==null) {
			this.estadodetalleinventarioSessionBean=new EstadoDetalleInventarioSessionBean();
		}
		
		if(this.estadodetalleinventarioSessionBean.getsUltimaBusquedaEstadoDetalleInventario()!=null&&!this.estadodetalleinventarioSessionBean.getsUltimaBusquedaEstadoDetalleInventario().equals("")) {
			this.setsAccionBusqueda(estadodetalleinventarioSessionBean.getsUltimaBusquedaEstadoDetalleInventario());
			this.setiNumeroPaginacion(estadodetalleinventarioSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadodetalleinventarioSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadodetalleinventarioSessionBean.setsUltimaBusquedaEstadoDetalleInventario("");
		this.estadodetalleinventarioSessionBean.setiNumeroPaginacion(EstadoDetalleInventarioConstantesFunciones.INUMEROPAGINACION);
		this.estadodetalleinventarioSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoDetalleInventario(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoDetalleInventario() {
		this.updateBorderResaltarBusquedasFormularioEstadoDetalleInventario();
		this.updateVisibilidadBusquedasFormularioEstadoDetalleInventario();
		this.updateHabilitarBusquedasFormularioEstadoDetalleInventario();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoDetalleInventario() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoDetalleInventario() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoDetalleInventario() {
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
	
	public void updateControlesFormularioEstadoDetalleInventario() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoDetalleInventario==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoDetalleInventario();
		this.updateVisibilidadResaltarControlesFormularioEstadoDetalleInventario();
		this.updateHabilitarResaltarControlesFormularioEstadoDetalleInventario();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoDetalleInventario() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadodetalleinventarioConstantesFunciones.resaltaridEstadoDetalleInventario!=null && this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) {this.jInternalFrameDetalleFormEstadoDetalleInventario.jTextFieldidEstadoDetalleInventario.setBorder(this.estadodetalleinventarioConstantesFunciones.resaltaridEstadoDetalleInventario);}
		if(this.estadodetalleinventarioConstantesFunciones.resaltarcodigoEstadoDetalleInventario!=null && this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) {this.jInternalFrameDetalleFormEstadoDetalleInventario.jTextFieldcodigoEstadoDetalleInventario.setBorder(this.estadodetalleinventarioConstantesFunciones.resaltarcodigoEstadoDetalleInventario);}
		if(this.estadodetalleinventarioConstantesFunciones.resaltarnombreEstadoDetalleInventario!=null && this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) {this.jInternalFrameDetalleFormEstadoDetalleInventario.jTextAreanombreEstadoDetalleInventario.setBorder(this.estadodetalleinventarioConstantesFunciones.resaltarnombreEstadoDetalleInventario);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoDetalleInventario() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) {
	
		//this.jInternalFrameDetalleFormEstadoDetalleInventario.jTextFieldidEstadoDetalleInventario.setVisible(this.estadodetalleinventarioConstantesFunciones.mostraridEstadoDetalleInventario);
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jPanelidEstadoDetalleInventario.setVisible(this.estadodetalleinventarioConstantesFunciones.mostraridEstadoDetalleInventario);
		//this.jInternalFrameDetalleFormEstadoDetalleInventario.jTextFieldcodigoEstadoDetalleInventario.setVisible(this.estadodetalleinventarioConstantesFunciones.mostrarcodigoEstadoDetalleInventario);
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jPanelcodigoEstadoDetalleInventario.setVisible(this.estadodetalleinventarioConstantesFunciones.mostrarcodigoEstadoDetalleInventario);
		//this.jInternalFrameDetalleFormEstadoDetalleInventario.jTextAreanombreEstadoDetalleInventario.setVisible(this.estadodetalleinventarioConstantesFunciones.mostrarnombreEstadoDetalleInventario);
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jPanelnombreEstadoDetalleInventario.setVisible(this.estadodetalleinventarioConstantesFunciones.mostrarnombreEstadoDetalleInventario);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoDetalleInventario() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoDetalleInventario!=null) {
	
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jTextFieldidEstadoDetalleInventario.setEnabled(this.estadodetalleinventarioConstantesFunciones.activaridEstadoDetalleInventario);
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jTextFieldcodigoEstadoDetalleInventario.setEnabled(this.estadodetalleinventarioConstantesFunciones.activarcodigoEstadoDetalleInventario);
		this.jInternalFrameDetalleFormEstadoDetalleInventario.jTextAreanombreEstadoDetalleInventario.setEnabled(this.estadodetalleinventarioConstantesFunciones.activarnombreEstadoDetalleInventario);
		}
	}
	
		
}