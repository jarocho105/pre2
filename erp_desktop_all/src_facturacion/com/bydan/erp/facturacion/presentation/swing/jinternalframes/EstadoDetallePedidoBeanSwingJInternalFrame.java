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

import com.bydan.erp.facturacion.util.EstadoDetallePedidoConstantesFunciones;
import com.bydan.erp.facturacion.util.EstadoDetallePedidoParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.EstadoDetallePedidoParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.EstadoDetallePedidoBean;
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

import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class EstadoDetallePedidoBeanSwingJInternalFrame extends EstadoDetallePedidoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoDetallePedidoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoDetallePedido> estadodetallepedidoValidator = new ClassValidator<EstadoDetallePedido>(EstadoDetallePedido.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoDetallePedido estadodetallepedido;	
	public EstadoDetallePedido estadodetallepedidoAux;
	public EstadoDetallePedido estadodetallepedidoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoDetallePedido estadodetallepedidoTotales;
	public Long idEstadoDetallePedidoActual;
	public Long iIdNuevoEstadoDetallePedido=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosDetalleConsignacion=false;

	public Boolean getIsTienePermisosDetalleConsignacion() {
		return isTienePermisosDetalleConsignacion;
	}

	public void setIsTienePermisosDetalleConsignacion(Boolean isTienePermisosDetalleConsignacion) {
		this.isTienePermisosDetalleConsignacion= isTienePermisosDetalleConsignacion;
	}


	public Boolean isTienePermisosDetallePedidoExpor=false;

	public Boolean getIsTienePermisosDetallePedidoExpor() {
		return isTienePermisosDetallePedidoExpor;
	}

	public void setIsTienePermisosDetallePedidoExpor(Boolean isTienePermisosDetallePedidoExpor) {
		this.isTienePermisosDetallePedidoExpor= isTienePermisosDetallePedidoExpor;
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
	
	public Boolean isPermisoTodoEstadoDetallePedido;
	public Boolean isPermisoNuevoEstadoDetallePedido;
	public Boolean isPermisoActualizarEstadoDetallePedido;
	public Boolean isPermisoActualizarOriginalEstadoDetallePedido;
	public Boolean isPermisoEliminarEstadoDetallePedido;
	public Boolean isPermisoGuardarCambiosEstadoDetallePedido;
	public Boolean isPermisoConsultaEstadoDetallePedido;
	public Boolean isPermisoBusquedaEstadoDetallePedido;
	public Boolean isPermisoReporteEstadoDetallePedido;
	public Boolean isPermisoPaginacionMedioEstadoDetallePedido;
	public Boolean isPermisoPaginacionAltoEstadoDetallePedido;
	public Boolean isPermisoPaginacionTodoEstadoDetallePedido;
	public Boolean isPermisoCopiarEstadoDetallePedido;
	public Boolean isPermisoVerFormEstadoDetallePedido;
	public Boolean isPermisoDuplicarEstadoDetallePedido;
	public Boolean isPermisoOrdenEstadoDetallePedido;
	
	
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
	
	public EstadoDetallePedidoParameterReturnGeneral estadodetallepedidoReturnGeneral;
	public EstadoDetallePedidoParameterReturnGeneral estadodetallepedidoParameterGeneral;
	
	

	public DetalleConsignacionLogic detalleconsignacionLogic=null;

	public DetalleConsignacionLogic getDetalleConsignacionLogic() {
		return detalleconsignacionLogic;
	}

	public void setDetalleConsignacionLogic(DetalleConsignacionLogic detalleconsignacionLogic) {
		this.detalleconsignacionLogic = detalleconsignacionLogic;
	}


	public DetallePedidoExporLogic detallepedidoexporExporLogic=null;

	public DetallePedidoExporLogic getDetallePedidoExporExporLogic() {
		return detallepedidoexporExporLogic;
	}

	public void setDetallePedidoExporExporLogic(DetallePedidoExporLogic detallepedidoexporExporLogic) {
		this.detallepedidoexporExporLogic = detallepedidoexporExporLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoDetallePedido=false;
	public Boolean esParaAccionDesdeFormularioEstadoDetallePedido=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoDetallePedidoLogic estadodetallepedidoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoDetallePedido estadodetallepedidoBean;
	public EstadoDetallePedidoConstantesFunciones estadodetallepedidoConstantesFunciones;
	//public EstadoDetallePedidoParameterReturnGeneral estadodetallepedidoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoDetallePedido> estadodetallepedidos;	
	//public List<EstadoDetallePedido> estadodetallepedidosEliminados;
	//public List<EstadoDetallePedido> estadodetallepedidosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoDetallePedido=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoDetallePedido=true;
	public Boolean isVisibilidadCeldaCopiarEstadoDetallePedido=true;
	public Boolean isVisibilidadCeldaVerFormEstadoDetallePedido=true;
	public Boolean isVisibilidadCeldaOrdenEstadoDetallePedido=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoDetallePedido=false;
	public Boolean isVisibilidadCeldaModificarEstadoDetallePedido=false;
	public Boolean isVisibilidadCeldaActualizarEstadoDetallePedido=false;
	public Boolean isVisibilidadCeldaEliminarEstadoDetallePedido=false;
	public Boolean isVisibilidadCeldaCancelarEstadoDetallePedido=false;
	public Boolean isVisibilidadCeldaGuardarEstadoDetallePedido=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoDetallePedido=false;	
	
	
	
	public Long getiIdNuevoEstadoDetallePedido() {
		return this.iIdNuevoEstadoDetallePedido;
	}

	public void setiIdNuevoEstadoDetallePedido(Long iIdNuevoEstadoDetallePedido) {
		this.iIdNuevoEstadoDetallePedido = iIdNuevoEstadoDetallePedido;
	}
	
	public Long getidEstadoDetallePedidoActual() {
		return this.idEstadoDetallePedidoActual;
	}

	public void setidEstadoDetallePedidoActual(Long idEstadoDetallePedidoActual) {
		this.idEstadoDetallePedidoActual = idEstadoDetallePedidoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoDetallePedido getestadodetallepedido() {
		return this.estadodetallepedido;
	}

	public void setestadodetallepedido(EstadoDetallePedido estadodetallepedido) {
		this.estadodetallepedido = estadodetallepedido;
	}
	
	public EstadoDetallePedido getestadodetallepedidoAux() {
		return this.estadodetallepedidoAux;
	}

	public void setestadodetallepedidoAux(EstadoDetallePedido estadodetallepedidoAux) {
		this.estadodetallepedidoAux = estadodetallepedidoAux;
	}				
	
	public EstadoDetallePedido getestadodetallepedidoAnterior() {
		return this.estadodetallepedidoAnterior;
	}

	public void setestadodetallepedidoAnterior(EstadoDetallePedido estadodetallepedidoAnterior) {
		this.estadodetallepedidoAnterior = estadodetallepedidoAnterior;
	}	
	
	public EstadoDetallePedido getestadodetallepedidoTotales() {
		return this.estadodetallepedidoTotales;
	}

	public void setestadodetallepedidoTotales(EstadoDetallePedido estadodetallepedidoTotales) {
		this.estadodetallepedidoTotales = estadodetallepedidoTotales;
	}	
	
	public EstadoDetallePedido getestadodetallepedidoBean() {
		return this.estadodetallepedidoBean;
	}

	public void setestadodetallepedidoBean(EstadoDetallePedido estadodetallepedidoBean) {
		this.estadodetallepedidoBean = estadodetallepedidoBean;
	}	
	
	public EstadoDetallePedidoParameterReturnGeneral getestadodetallepedidoReturnGeneral() {
		return this.estadodetallepedidoReturnGeneral;
	}

	public void setestadodetallepedidoReturnGeneral(EstadoDetallePedidoParameterReturnGeneral estadodetallepedidoReturnGeneral) {
		this.estadodetallepedidoReturnGeneral = estadodetallepedidoReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoDetallePedidoLogic getEstadoDetallePedidoLogic()	{		
		return estadodetallepedidoLogic;
	}

	public void setEstadoDetallePedidoLogic(EstadoDetallePedidoLogic estadodetallepedidoLogic) {
		this.estadodetallepedidoLogic = estadodetallepedidoLogic;
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
	
	public Boolean getIsEsNuevoEstadoDetallePedido() {
		return isEsNuevoEstadoDetallePedido;
	}

	public void setIsEsNuevoEstadoDetallePedido(Boolean isEsNuevoEstadoDetallePedido) {
		this.isEsNuevoEstadoDetallePedido = isEsNuevoEstadoDetallePedido;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoDetallePedido() {
		return esParaAccionDesdeFormularioEstadoDetallePedido;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoDetallePedido(Boolean esParaAccionDesdeFormularioEstadoDetallePedido) {
		this.esParaAccionDesdeFormularioEstadoDetallePedido = esParaAccionDesdeFormularioEstadoDetallePedido;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoDetallePedido() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoDetallePedidoConstantesFunciones.refrescarForeignKeysDescripcionesEstadoDetallePedido(this.estadodetallepedidoLogic.getEstadoDetallePedidos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoDetallePedidoConstantesFunciones.refrescarForeignKeysDescripcionesEstadoDetallePedido(this.estadodetallepedidos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadodetallepedidoLogic.setEstadoDetallePedidos(this.estadodetallepedidos);
			estadodetallepedidoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoDetallePedidoParameterReturnGeneral getEstadoDetallePedidoParameterGeneral() {
		return this.estadodetallepedidoParameterGeneral;
	}
	
	public void setEstadoDetallePedidoParameterGeneral(EstadoDetallePedidoParameterReturnGeneral estadodetallepedidoParameterGeneral) {
		this.estadodetallepedidoParameterGeneral = estadodetallepedidoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoDetallePedido() {
		return isPermisoTodoEstadoDetallePedido;
	}

	public void setIsPermisoTodoEstadoDetallePedido(Boolean isPermisoTodoEstadoDetallePedido) {
		this.isPermisoTodoEstadoDetallePedido = isPermisoTodoEstadoDetallePedido;
	}

	public Boolean getIsPermisoNuevoEstadoDetallePedido() {
		return isPermisoNuevoEstadoDetallePedido;
	}

	public void setIsPermisoNuevoEstadoDetallePedido(Boolean isPermisoNuevoEstadoDetallePedido) {
		this.isPermisoNuevoEstadoDetallePedido = isPermisoNuevoEstadoDetallePedido;
	}

	public Boolean getIsPermisoActualizarEstadoDetallePedido() {
		return isPermisoActualizarEstadoDetallePedido;
	}

	public void setIsPermisoActualizarEstadoDetallePedido(Boolean isPermisoActualizarEstadoDetallePedido) {
		this.isPermisoActualizarEstadoDetallePedido = isPermisoActualizarEstadoDetallePedido;
	}

	public Boolean getIsPermisoEliminarEstadoDetallePedido() {
		return isPermisoEliminarEstadoDetallePedido;
	}

	public void setIsPermisoEliminarEstadoDetallePedido(Boolean isPermisoEliminarEstadoDetallePedido) {
		this.isPermisoEliminarEstadoDetallePedido = isPermisoEliminarEstadoDetallePedido;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoDetallePedido() {
		return isPermisoGuardarCambiosEstadoDetallePedido;
	}

	public void setIsPermisoGuardarCambiosEstadoDetallePedido(Boolean isPermisoGuardarCambiosEstadoDetallePedido) {
		this.isPermisoGuardarCambiosEstadoDetallePedido = isPermisoGuardarCambiosEstadoDetallePedido;
	}
	
	public Boolean getIsPermisoConsultaEstadoDetallePedido() {
		return isPermisoConsultaEstadoDetallePedido;
	}

	public void setIsPermisoConsultaEstadoDetallePedido(Boolean isPermisoConsultaEstadoDetallePedido) {
		this.isPermisoConsultaEstadoDetallePedido = isPermisoConsultaEstadoDetallePedido;
	}

	public Boolean getIsPermisoBusquedaEstadoDetallePedido() {
		return isPermisoBusquedaEstadoDetallePedido;
	}

	public void setIsPermisoBusquedaEstadoDetallePedido(Boolean isPermisoBusquedaEstadoDetallePedido) {
		this.isPermisoBusquedaEstadoDetallePedido = isPermisoBusquedaEstadoDetallePedido;
	}

	public Boolean getIsPermisoReporteEstadoDetallePedido() {
		return isPermisoReporteEstadoDetallePedido;
	}

	public void setIsPermisoReporteEstadoDetallePedido(Boolean isPermisoReporteEstadoDetallePedido) {
		this.isPermisoReporteEstadoDetallePedido = isPermisoReporteEstadoDetallePedido;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoDetallePedido() {
		return isPermisoPaginacionMedioEstadoDetallePedido;
	}

	public void setIsPermisoPaginacionMedioEstadoDetallePedido(Boolean isPermisoPaginacionMedioEstadoDetallePedido) {
		this.isPermisoPaginacionMedioEstadoDetallePedido = isPermisoPaginacionMedioEstadoDetallePedido;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoDetallePedido() {
		return isPermisoPaginacionTodoEstadoDetallePedido;
	}

	public void setIsPermisoPaginacionTodoEstadoDetallePedido(Boolean isPermisoPaginacionTodoEstadoDetallePedido) {
		this.isPermisoPaginacionTodoEstadoDetallePedido = isPermisoPaginacionTodoEstadoDetallePedido;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoDetallePedido() {
		return isPermisoPaginacionAltoEstadoDetallePedido;
	}

	public void setIsPermisoPaginacionAltoEstadoDetallePedido(Boolean isPermisoPaginacionAltoEstadoDetallePedido) {
		this.isPermisoPaginacionAltoEstadoDetallePedido = isPermisoPaginacionAltoEstadoDetallePedido;
	}
	
	public Boolean getIsPermisoCopiarEstadoDetallePedido() {
		return isPermisoCopiarEstadoDetallePedido;
	}

	public void setIsPermisoCopiarEstadoDetallePedido(Boolean isPermisoCopiarEstadoDetallePedido) {
		this.isPermisoCopiarEstadoDetallePedido = isPermisoCopiarEstadoDetallePedido;
	}
	
	public Boolean getIsPermisoVerFormEstadoDetallePedido() {
		return isPermisoVerFormEstadoDetallePedido;
	}

	public void setIsPermisoVerFormEstadoDetallePedido(Boolean isPermisoVerFormEstadoDetallePedido) {
		this.isPermisoVerFormEstadoDetallePedido = isPermisoVerFormEstadoDetallePedido;
	}
	
	public Boolean getIsPermisoDuplicarEstadoDetallePedido() {
		return isPermisoDuplicarEstadoDetallePedido;
	}

	public void setIsPermisoDuplicarEstadoDetallePedido(Boolean isPermisoDuplicarEstadoDetallePedido) {
		this.isPermisoDuplicarEstadoDetallePedido = isPermisoDuplicarEstadoDetallePedido;
	}
	
	public Boolean getIsPermisoOrdenEstadoDetallePedido() {
		return isPermisoOrdenEstadoDetallePedido;
	}

	public void setIsPermisoOrdenEstadoDetallePedido(Boolean isPermisoOrdenEstadoDetallePedido) {
		this.isPermisoOrdenEstadoDetallePedido = isPermisoOrdenEstadoDetallePedido;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoDetallePedido() {
		return isVisibilidadCeldaNuevoEstadoDetallePedido;
	}

	public void setIsVisibilidadCeldaNuevoEstadoDetallePedido(Boolean isVisibilidadCeldaNuevoEstadoDetallePedido) {
		this.isVisibilidadCeldaNuevoEstadoDetallePedido = isVisibilidadCeldaNuevoEstadoDetallePedido;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoDetallePedido() {
		return isVisibilidadCeldaDuplicarEstadoDetallePedido;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoDetallePedido(Boolean isVisibilidadCeldaDuplicarEstadoDetallePedido) {
		this.isVisibilidadCeldaDuplicarEstadoDetallePedido = isVisibilidadCeldaDuplicarEstadoDetallePedido;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoDetallePedido() {
		return isVisibilidadCeldaCopiarEstadoDetallePedido;
	}

	public void setIsVisibilidadCeldaCopiarEstadoDetallePedido(Boolean isVisibilidadCeldaCopiarEstadoDetallePedido) {
		this.isVisibilidadCeldaCopiarEstadoDetallePedido = isVisibilidadCeldaCopiarEstadoDetallePedido;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoDetallePedido() {
		return isVisibilidadCeldaVerFormEstadoDetallePedido;
	}

	public void setIsVisibilidadCeldaVerFormEstadoDetallePedido(Boolean isVisibilidadCeldaVerFormEstadoDetallePedido) {
		this.isVisibilidadCeldaVerFormEstadoDetallePedido = isVisibilidadCeldaVerFormEstadoDetallePedido;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoDetallePedido() {
		return isVisibilidadCeldaOrdenEstadoDetallePedido;
	}

	public void setIsVisibilidadCeldaOrdenEstadoDetallePedido(Boolean isVisibilidadCeldaOrdenEstadoDetallePedido) {
		this.isVisibilidadCeldaOrdenEstadoDetallePedido = isVisibilidadCeldaOrdenEstadoDetallePedido;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoDetallePedido() {
		return isVisibilidadCeldaNuevoRelacionesEstadoDetallePedido;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoDetallePedido(Boolean isVisibilidadCeldaNuevoRelacionesEstadoDetallePedido) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoDetallePedido = isVisibilidadCeldaNuevoRelacionesEstadoDetallePedido;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoDetallePedido() {
		return isVisibilidadCeldaModificarEstadoDetallePedido;
	}

	public void setIsVisibilidadCeldaModificarEstadoDetallePedido(Boolean isVisibilidadCeldaModificarEstadoDetallePedido) {
		this.isVisibilidadCeldaModificarEstadoDetallePedido = isVisibilidadCeldaModificarEstadoDetallePedido;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoDetallePedido() {
		return isVisibilidadCeldaActualizarEstadoDetallePedido;
	}

	public void setIsVisibilidadCeldaActualizarEstadoDetallePedido(Boolean isVisibilidadCeldaActualizarEstadoDetallePedido) {
		this.isVisibilidadCeldaActualizarEstadoDetallePedido = isVisibilidadCeldaActualizarEstadoDetallePedido;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoDetallePedido() {
		return isVisibilidadCeldaEliminarEstadoDetallePedido;
	}

	public void setIsVisibilidadCeldaEliminarEstadoDetallePedido(Boolean isVisibilidadCeldaEliminarEstadoDetallePedido) {
		this.isVisibilidadCeldaEliminarEstadoDetallePedido = isVisibilidadCeldaEliminarEstadoDetallePedido;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoDetallePedido() {
		return isVisibilidadCeldaCancelarEstadoDetallePedido;
	}

	public void setIsVisibilidadCeldaCancelarEstadoDetallePedido(Boolean isVisibilidadCeldaCancelarEstadoDetallePedido) {
		this.isVisibilidadCeldaCancelarEstadoDetallePedido = isVisibilidadCeldaCancelarEstadoDetallePedido;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoDetallePedido() {
		return isVisibilidadCeldaGuardarEstadoDetallePedido;
	}

	public void setIsVisibilidadCeldaGuardarEstadoDetallePedido(Boolean isVisibilidadCeldaGuardarEstadoDetallePedido) {
		this.isVisibilidadCeldaGuardarEstadoDetallePedido = isVisibilidadCeldaGuardarEstadoDetallePedido;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoDetallePedido() {
		return isVisibilidadCeldaGuardarCambiosEstadoDetallePedido;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoDetallePedido(Boolean isVisibilidadCeldaGuardarCambiosEstadoDetallePedido) {
		this.isVisibilidadCeldaGuardarCambiosEstadoDetallePedido = isVisibilidadCeldaGuardarCambiosEstadoDetallePedido;
	}
		
	public EstadoDetallePedidoSessionBean getestadodetallepedidoSessionBean() {
		return this.estadodetallepedidoSessionBean;
	}
	
	public void setestadodetallepedidoSessionBean(EstadoDetallePedidoSessionBean estadodetallepedidoSessionBean) {
		this.estadodetallepedidoSessionBean=estadodetallepedidoSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoDetallePedido(EstadoDetallePedido estadodetallepedido)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoDetallePedido estadodetallepedido,EstadoDetallePedido estadodetallepedidoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoDetallePedido(estadodetallepedido);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadodetallepedidoAux.setId(estadodetallepedido.getId());
		estadodetallepedidoAux.setVersionRow(estadodetallepedido.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoDetallePedido();
		
			int intSelectedRow = this.jTableDatosEstadoDetallePedido.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedido =(EstadoDetallePedido) this.estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadodetallepedido =(EstadoDetallePedido) this.estadodetallepedidos.toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoDetallePedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoDetallePedido(this.estadodetallepedido,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetallePedido(this.estadodetallepedido);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadodetallepedidoValidator.getInvalidValues(this.estadodetallepedido);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadodetallepedidoLogic.setDatosCliente(datosCliente);
			estadodetallepedidoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadodetallepedidoAux=new  EstadoDetallePedido();
				
				estadodetallepedidoAux.setIsNew(true);
				estadodetallepedidoAux.setIsChanged(true);
				
				estadodetallepedidoAux.setEstadoDetallePedidoOriginal(this.estadodetallepedido);
				
				estadodetallepedidoAux.setId(this.estadodetallepedido.getId());	
				estadodetallepedidoAux.setVersionRow(this.estadodetallepedido.getVersionRow());	
				estadodetallepedidoAux.setcodigo(this.estadodetallepedido.getcodigo());	
				estadodetallepedidoAux.setnombre(this.estadodetallepedido.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadodetallepedidoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadodetallepedidoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadodetallepedidoAux,estadodetallepedidoLogic.getEstadoDetallePedidos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetallepedidoAux,estadodetallepedidos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadodetallepedidoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadodetallepedidoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetallepedidoLogic.saveEstadoDetallePedidos();//WithConnection
						//estadodetallepedidoLogic.getSetVersionRowEstadoDetallePedidos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadodetallepedido,estadodetallepedidoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadodetallepedidoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadodetallepedidoAux=new  EstadoDetallePedido();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadodetallepedidoSessionBean.getEsGuardarRelacionado() 
					|| (this.estadodetallepedidoSessionBean.getEsGuardarRelacionado() && this.estadodetallepedido.getId()>=0)) {
						
					estadodetallepedidoAux.setIsNew(false);
				}
				
				estadodetallepedidoAux.setIsDeleted(false);
			
				estadodetallepedidoAux.setId(this.estadodetallepedido.getId());	
				estadodetallepedidoAux.setVersionRow(this.estadodetallepedido.getVersionRow());	
				estadodetallepedidoAux.setcodigo(this.estadodetallepedido.getcodigo());	
				estadodetallepedidoAux.setnombre(this.estadodetallepedido.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadodetallepedidoAux,estadodetallepedidoLogic.getEstadoDetallePedidos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetallepedidoAux,estadodetallepedidos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadodetallepedidoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadodetallepedidoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetallepedidoLogic.saveEstadoDetallePedidos();//WithConnection
						//estadodetallepedidoLogic.getSetVersionRowEstadoDetallePedidos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadodetallepedido,estadodetallepedidoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadodetallepedidoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadodetallepedidoAux=new  EstadoDetallePedido();
				
				estadodetallepedidoAux.setIsNew(false);
				estadodetallepedidoAux.setIsChanged(false);
				
				estadodetallepedidoAux.setIsDeleted(true);
				
				estadodetallepedidoAux.setId(this.estadodetallepedido.getId());	
				estadodetallepedidoAux.setVersionRow(this.estadodetallepedido.getVersionRow());	
				estadodetallepedidoAux.setcodigo(this.estadodetallepedido.getcodigo());	
				estadodetallepedidoAux.setnombre(this.estadodetallepedido.getnombre());	
				
				if(this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadodetallepedidoAux.getId()>=0) {	
						this.estadodetallepedidosEliminados.add(estadodetallepedidoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadodetallepedidoAux,estadodetallepedidoLogic.getEstadoDetallePedidos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetallepedidoAux,estadodetallepedidos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadodetallepedidoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadodetallepedidoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetallepedidoLogic.saveEstadoDetallePedidos();//WithConnection
						//estadodetallepedidoLogic.getSetVersionRowEstadoDetallePedidos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadodetallepedidoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodetallepedidoAux.setDetalleConsignacions(this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame.detalleconsignacionLogic.getDetalleConsignacions());

							if(this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodetallepedidoAux.setDetallePedidoExporExpors(this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame.detallepedidoexporLogic.getDetallePedidoExpors());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadodetallepedidoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadodetallepedidoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadodetallepedidoAux,estadodetallepedidoLogic.getEstadoDetallePedidos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadodetallepedidoAux,estadodetallepedidos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedidoLogic.getEstadoDetallePedidos().addAll(this.estadodetallepedidosEliminados);
					
					estadodetallepedidoLogic.saveEstadoDetallePedidos();//WithConnection
					//estadodetallepedidoLogic.getSetVersionRowEstadoDetallePedidos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadodetallepedidosEliminados= new ArrayList<EstadoDetallePedido>();		
			}
			
			if(this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Detalle Pedido GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Detalle Pedido",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadodetallepedido=estadodetallepedidoAux;
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
      		//this.finishProcessEstadoDetallePedido();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoDetallePedido estadodetallepedidoLocal) throws Exception {
		
		if(this.estadodetallepedidoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadodetallepedidoLocal.setDetalleConsignacions(this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame.detalleconsignacionLogic.getDetalleConsignacions());
				estadodetallepedidoLocal.setDetallePedidoExporExpors(this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame.detallepedidoexporLogic.getDetallePedidoExpors());
			
			} else {
			
				estadodetallepedidoLocal.setDetalleConsignacions(this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame.detalleconsignacions);
				estadodetallepedidoLocal.setDetallePedidoExporExpors(this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame.detallepedidoexpors);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoDetallePedido estadodetallepedidoLocal) throws Exception {	
		if(this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoDetallePedidoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoDetallePedido.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadodetallepedido =(EstadoDetallePedido) this.estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadodetallepedido =(EstadoDetallePedido) this.estadodetallepedidos.toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadodetallepedidoValidator.getInvalidValues(this.estadodetallepedido);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoDetallePedido estadodetallepedido,List<EstadoDetallePedido> estadodetallepedidos) throws Exception {
		try	{		
			EstadoDetallePedidoConstantesFunciones.actualizarLista(estadodetallepedido,estadodetallepedidos,this.estadodetallepedidoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoDetallePedido estadodetallepedido,List<EstadoDetallePedido> estadodetallepedidos) throws Exception {
		try	{			
			EstadoDetallePedidoConstantesFunciones.actualizarSelectedLista(estadodetallepedido,estadodetallepedidos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoDetallePedido> estadodetallepedidosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadodetallepedidosLocal=this.estadodetallepedidoLogic.getEstadoDetallePedidos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadodetallepedidosLocal=this.estadodetallepedidos;
			}
			//ARCHITECTURE
		
			for(EstadoDetallePedido estadodetallepedidoLocal:estadodetallepedidosLocal) {
				if(this.permiteMantenimiento(estadodetallepedidoLocal) && estadodetallepedidoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoDetallePedidoConstantesFunciones.getEstadoDetallePedidoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoDetallePedidoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetallePedido.jLabelcodigoEstadoDetallePedido,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoDetallePedidoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetallePedido.jLabelnombreEstadoDetallePedido,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoDetallePedido.jLabelcodigoEstadoDetallePedido,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoDetallePedido.jLabelnombreEstadoDetallePedido,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleConsignacion")) {
			if(this.estadodetallepedido==null) {
				this.estadodetallepedido= new EstadoDetallePedido();
			}

			if(this.estadodetallepedidoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoDetallePedido
				this.setVariablesFormularioToObjetoActualEstadoDetallePedido(this.estadodetallepedido,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetallePedido(this.estadodetallepedido);

				this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame.getdetalleconsignacion().setEstadoDetallePedido(this.estadodetallepedido);
			}

			return;
		}
		 else  if(sTipo.equals("DetallePedidoExpor")) {
			if(this.estadodetallepedido==null) {
				this.estadodetallepedido= new EstadoDetallePedido();
			}

			if(this.estadodetallepedidoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoDetallePedido
				this.setVariablesFormularioToObjetoActualEstadoDetallePedido(this.estadodetallepedido,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetallePedido(this.estadodetallepedido);

				this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame.getdetallepedidoexpor().setEstadoDetallePedidoExpor(this.estadodetallepedido);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoDetallePedido--;	
		
		
		this.estadodetallepedidoAux=new EstadoDetallePedido();
		
		this.estadodetallepedidoAux.setId(this.iIdNuevoEstadoDetallePedido);
		this.estadodetallepedidoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadodetallepedidoLogic.getEstadoDetallePedidos().add(this.estadodetallepedidoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadodetallepedidos.add(this.estadodetallepedidoAux);
		}
		//ARCHITECTURE
		
		this.estadodetallepedido=this.estadodetallepedidoAux;
		
		if(EstadoDetallePedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoDetallePedido(this.estadodetallepedido);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetallePedido(this.estadodetallepedido);
		}
				
		//this.setDefaultControlesEstadoDetallePedido();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoDetallePedido();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoDetallePedido();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoDetallePedido();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoDetallePedido(this.estadodetallepedidoBean,this.estadodetallepedido,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetallePedido(this.estadodetallepedido);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadodetallepedidoSessionBean.getConGuardarRelaciones()) {
			classes=EstadoDetallePedidoConstantesFunciones.getClassesRelationshipsOfEstadoDetallePedido(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadodetallepedidoReturnGeneral=estadodetallepedidoLogic.procesarEventosEstadoDetallePedidosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadodetallepedidoLogic.getEstadoDetallePedidos(),this.estadodetallepedido,this.estadodetallepedidoParameterGeneral,this.isEsNuevoEstadoDetallePedido,classes);//this.estadodetallepedidoLogic.getEstadoDetallePedido()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoDetallePedido(this.estadodetallepedidoReturnGeneral,this.estadodetallepedidoBean,false);
		
		if(this.estadodetallepedidoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetallePedido(this.estadodetallepedidoReturnGeneral.getEstadoDetallePedido());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoDetallePedido(this.estadodetallepedidoReturnGeneral.getEstadoDetallePedido());
		}
		
		if(this.estadodetallepedidoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoDetallePedido(this.estadodetallepedidoReturnGeneral.getEstadoDetallePedido(),classes);//this.estadodetallepedidoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoDetallePedido(this.estadodetallepedido,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoDetallePedido();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoDetallePedido();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoDetallePedido(false);
						
			if(estadodetallepedidoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame.detalleconsignacionSessionBean.getEsGuardarRelacionado() && DetalleConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleConsignacionActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame.detallepedidoexporSessionBean.getEsGuardarRelacionado() && DetallePedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetallePedidoExporActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoDetallePedidoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoDetallePedido();
			}
			
			this.actualizarVisualTableDatosEstadoDetallePedido();
			
			this.jTableDatosEstadoDetallePedido.setRowSelectionInterval(this.getIndiceNuevoEstadoDetallePedido(), this.getIndiceNuevoEstadoDetallePedido());
			
			this.seleccionarFilaTablaEstadoDetallePedidoActual();
						
			this.actualizarEstadoCeldasBotonesEstadoDetallePedido("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoDetallePedido(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoDetallePedido.jTextFieldcodigoEstadoDetallePedido.setEnabled(isHabilitar && this.estadodetallepedidoConstantesFunciones.activarcodigoEstadoDetallePedido);
		this.jInternalFrameDetalleFormEstadoDetallePedido.jTextAreanombreEstadoDetallePedido.setEnabled(isHabilitar && this.estadodetallepedidoConstantesFunciones.activarnombreEstadoDetallePedido);	
		
	};
	
	public void setDefaultControlesEstadoDetallePedido() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoDetallePedido(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadodetallepedidoSessionBean.setConGuardarRelaciones(true);			
			this.estadodetallepedidoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoDetallePedido.jTabbedPaneRelacionesEstadoDetallePedido.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame.detalleconsignacionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame.detallepedidoexporSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadodetallepedidoSessionBean.setConGuardarRelaciones(false);			
			this.estadodetallepedidoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoDetallePedido.jTabbedPaneRelacionesEstadoDetallePedido.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame.detalleconsignacionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame.detallepedidoexporSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoDetallePedido() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetallePedido estadodetallepedidoAux:this.estadodetallepedidoLogic.getEstadoDetallePedidos()) {
				if(estadodetallepedidoAux.getId().equals(this.iIdNuevoEstadoDetallePedido)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetallePedido estadodetallepedidoAux:this.estadodetallepedidos) {
				if(estadodetallepedidoAux.getId().equals(this.iIdNuevoEstadoDetallePedido)) {
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
	
	public int getIndiceActualEstadoDetallePedido(EstadoDetallePedido estadodetallepedido,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetallePedido estadodetallepedidoAux:this.estadodetallepedidoLogic.getEstadoDetallePedidos()) {
				if(estadodetallepedidoAux.getId().equals(estadodetallepedido.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetallePedido estadodetallepedidoAux:this.estadodetallepedidos) {
				if(estadodetallepedidoAux.getId().equals(estadodetallepedido.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoDetallePedido(EstadoDetallePedido estadodetallepedidoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetallePedido estadodetallepedidoAux:this.estadodetallepedidoLogic.getEstadoDetallePedidos()) {
				if(estadodetallepedidoAux.getEstadoDetallePedidoOriginal().getId().equals(estadodetallepedidoOriginal.getId())) {
					existe=true;
					estadodetallepedidoOriginal.setId(estadodetallepedidoAux.getId());
					estadodetallepedidoOriginal.setVersionRow(estadodetallepedidoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetallePedido estadodetallepedidoAux:this.estadodetallepedidos) {
				if(estadodetallepedidoAux.getEstadoDetallePedidoOriginal().getId().equals(estadodetallepedidoOriginal.getId())) {
					existe=true;
					estadodetallepedidoOriginal.setId(estadodetallepedidoAux.getId());
					estadodetallepedidoOriginal.setVersionRow(estadodetallepedidoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoDetallePedido(Boolean esParaCancelar) throws Exception {
		estadodetallepedidosAux=new ArrayList<EstadoDetallePedido>();
		estadodetallepedidoAux=new EstadoDetallePedido();
		
		if(!this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoDetallePedido estadodetallepedidoAux:this.estadodetallepedidoLogic.getEstadoDetallePedidos()) {
					if(estadodetallepedidoAux.getId()<0) {
						estadodetallepedidosAux.add(estadodetallepedidoAux);
					}		
				}
				this.iIdNuevoEstadoDetallePedido=0L;
				this.estadodetallepedidoLogic.getEstadoDetallePedidos().removeAll(estadodetallepedidosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetallePedido estadodetallepedidoAux:this.estadodetallepedidos) {
					if(estadodetallepedidoAux.getId()<0) {
						estadodetallepedidosAux.add(estadodetallepedidoAux);
					}		
				}
				this.iIdNuevoEstadoDetallePedido=0L;
				this.estadodetallepedidos.removeAll(estadodetallepedidosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoDetallePedido 
					&& this.estadodetallepedidoLogic.getEstadoDetallePedidos().size()>0
					) {
					estadodetallepedidoAux=this.estadodetallepedidoLogic.getEstadoDetallePedidos().get(this.estadodetallepedidoLogic.getEstadoDetallePedidos().size() - 1);
				
					if(estadodetallepedidoAux.getId()<0) {
						this.estadodetallepedidoLogic.getEstadoDetallePedidos().remove(estadodetallepedidoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoDetallePedido && this.estadodetallepedidos.size()>0) {
					estadodetallepedidoAux=this.estadodetallepedidos.get(this.estadodetallepedidos.size() - 1);
				
					if(estadodetallepedidoAux.getId()<0) {
						this.estadodetallepedidos.remove(estadodetallepedidoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoDetallePedido(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadodetallepedido.getId()<0) {
				this.estadodetallepedidoLogic.getEstadoDetallePedidos().remove(this.estadodetallepedido);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadodetallepedido.getId()<0) {
				this.estadodetallepedidos.remove(this.estadodetallepedido);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoDetallePedido(List<EstadoDetallePedido> estadodetallepedidosAux) throws Exception {
		EstadoDetallePedidoConstantesFunciones.setEstadosInicialesEstadoDetallePedido(estadodetallepedidosAux);
	}
	
	public void setEstadosInicialesEstadoDetallePedido(EstadoDetallePedido estadodetallepedidoAux) throws Exception {
		EstadoDetallePedidoConstantesFunciones.setEstadosInicialesEstadoDetallePedido(estadodetallepedidoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoDetallePedidoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoDetallePedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoDetallePedidoActual()) {
				if(!this.isEsNuevoEstadoDetallePedido) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoDetallePedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoDetallePedido=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoDetallePedidoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Detalle Pedido ?", "MANTENIMIENTO DE Estado Detalle Pedido", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoDetallePedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoDetallePedido estadodetallepedido) throws Exception {
		EstadoDetallePedidoConstantesFunciones.seleccionarAsignar(this.estadodetallepedido,estadodetallepedido);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoDetallePedido=this.isPermisoActualizarOriginalEstadoDetallePedido;
			
			
			this.seleccionarAsignar(estadodetallepedido);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoDetallePedidoConstantesFunciones.quitarEspaciosEstadoDetallePedido(this.estadodetallepedido,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoDetallePedido("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadodetallepedidoSessionBean.setsFuncionBusquedaRapida(this.estadodetallepedidoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoDetallePedido) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoDetallePedido(esParaCancelar);				
				this.cancelarNuevoEstadoDetallePedido(esParaCancelar);								
			}
			
			this.estadodetallepedido=new EstadoDetallePedido();
			
			this.inicializarEstadoDetallePedido();
			
			this.actualizarEstadoCeldasBotonesEstadoDetallePedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoDetallePedido() throws Exception {
		try {
			EstadoDetallePedidoConstantesFunciones.inicializarEstadoDetallePedido(this.estadodetallepedido);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadodetallepedidoLogic.getEstadoDetallePedidos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoDetallePedidos(String sAccionBusqueda,List<EstadoDetallePedido> estadodetallepedidosParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoDetallePedido"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoDetallePedidoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoDetallePedidoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoDetallePedido"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Detalle Pedidos");		
		parameters.put("busquedapor", EstadoDetallePedidoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleConsignacion.class));
			classes.add(new Classe(DetallePedidoExpor.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoDetallePedidoLogic estadodetallepedidoLogicAuxiliar=new EstadoDetallePedidoLogic();
					estadodetallepedidoLogicAuxiliar.setDatosCliente(estadodetallepedidoLogic.getDatosCliente());				
					estadodetallepedidoLogicAuxiliar.setEstadoDetallePedidos(estadodetallepedidosParaReportes);
					
					estadodetallepedidoLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoDetallePedidoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadodetallepedidosParaReportes=estadodetallepedidoLogicAuxiliar.getEstadoDetallePedidos();
					
					//estadodetallepedidoLogic.getNewConnexionToDeep();
					
					//for (EstadoDetallePedido estadodetallepedido:estadodetallepedidosParaReportes) {
					//	estadodetallepedidoLogic.deepLoad(estadodetallepedido, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadodetallepedidoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadodetallepedidoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleConsignacion = AuxiliarReportes.class.getResourceAsStream("DetalleConsignacionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalleconsignacion", reportFileDetalleConsignacion);

			InputStream reportFileDetallePedidoExpor = AuxiliarReportes.class.getResourceAsStream("DetallePedidoExporDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detallepedidoexpor", reportFileDetallePedidoExpor);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoDetallePedido=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoDetallePedidoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoDetallePedidoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoDetallePedido=new JRBeanArrayDataSource(EstadoDetallePedidoJInternalFrame.TraerEstadoDetallePedidoBeans(estadodetallepedidosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoDetallePedido);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoDetallePedidoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoDetallePedidoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoDetallePedidoBean.TraerEstadoDetallePedidoBeans(estadodetallepedidosParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoDetallePedidos(sAccionBusqueda,sTipoArchivoReporte,estadodetallepedidosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoDetallePedidos(sAccionBusqueda,sTipoArchivoReporte,estadodetallepedidosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoDetallePedidoActionPerformed(null);
					//this.generarExcelReporteEstadoDetallePedidos(sAccionBusqueda,sTipoArchivoReporte,estadodetallepedidosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoDetallePedidos(sAccionBusqueda,sTipoArchivoReporte,estadodetallepedidosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoDetallePedidos(sAccionBusqueda,sTipoArchivoReporte,estadodetallepedidosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoDetallePedidos(sAccionBusqueda,sTipoArchivoReporte,estadodetallepedidosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoDetallePedidos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoDetallePedido> estadodetallepedidosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetallepedido";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoDetallePedidos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoDetallePedido("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoDetallePedido estadodetallepedido : estadodetallepedidosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoDetallePedidoConstantesFunciones.generarExcelReporteDataEstadoDetallePedido("NORMAL",row,workbook,estadodetallepedido,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Pedido",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoDetallePedido(String sTipo,Row row,Workbook workbook) {
		
		EstadoDetallePedidoConstantesFunciones.generarExcelReporteHeaderEstadoDetallePedido(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoDetallePedidos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoDetallePedido> estadodetallepedidosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetallepedido_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoDetallePedidos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoDetallePedido estadodetallepedido : estadodetallepedidosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoDetallePedidoConstantesFunciones.getEstadoDetallePedidoDescripcion(estadodetallepedido));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoDetallePedidoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoDetallePedidoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadodetallepedido.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoDetallePedidoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoDetallePedidoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadodetallepedido.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Pedido",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoDetallePedidos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoDetallePedido> estadodetallepedidosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoDetallePedido> estadodetallepedidosRespaldo=null;
		
		classes=EstadoDetallePedidoConstantesFunciones.getClassesRelationshipsOfEstadoDetallePedido(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadodetallepedidoLogic.setDatosCliente(this.datosCliente);
		this.estadodetallepedidoLogic.setDatosDeep(this.datosDeep);
		this.estadodetallepedidoLogic.setIsConDeep(true);
		
		estadodetallepedidosRespaldo=this.estadodetallepedidoLogic.getEstadoDetallePedidos();
		
		this.estadodetallepedidoLogic.setEstadoDetallePedidos(estadodetallepedidosParaReportes);	
		this.estadodetallepedidoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadodetallepedidosParaReportes=this.estadodetallepedidoLogic.getEstadoDetallePedidos();
		this.estadodetallepedidoLogic.setEstadoDetallePedidos(estadodetallepedidosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetallepedido_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoDetallePedidos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoDetallePedido("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoDetallePedido estadodetallepedido : estadodetallepedidosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoDetallePedido("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoDetallePedidoConstantesFunciones.generarExcelReporteDataEstadoDetallePedido("NORMAL",row,workbook,estadodetallepedido,cellStyleDataAux);
		
			
			


				//DetalleConsignacion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadodetallepedido.getDetalleConsignacions()!=null && estadodetallepedido.getDetalleConsignacions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleConsignacionConstantesFunciones.generarExcelReporteHeaderDetalleConsignacion("RELACIONADO",row,workbook);
				}

				if(estadodetallepedido.getDetalleConsignacions()!=null) {
					i2=0;
					for(DetalleConsignacion detalleconsignacion : estadodetallepedido.getDetalleConsignacions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleConsignacionConstantesFunciones.generarExcelReporteDataDetalleConsignacion("RELACIONADO",row,workbook,detalleconsignacion,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//DetallePedidoExpor
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadodetallepedido.getDetallePedidoExporExpors()!=null && estadodetallepedido.getDetallePedidoExporExpors().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetallePedidoExporConstantesFunciones.generarExcelReporteHeaderDetallePedidoExpor("RELACIONADO",row,workbook);
				}

				if(estadodetallepedido.getDetallePedidoExporExpors()!=null) {
					i2=0;
					for(DetallePedidoExpor detallepedidoexpor : estadodetallepedido.getDetallePedidoExporExpors()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetallePedidoExporConstantesFunciones.generarExcelReporteDataDetallePedidoExpor("RELACIONADO",row,workbook,detallepedidoexpor,cellStyleDataAuxHijo);
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
		cell.setCellValue(EstadoDetallePedidoConstantesFunciones.getEstadoDetallePedidoDescripcion(estadodetallepedido));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Pedido",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoDetallePedido() throws Exception {		
		this.startProcessEstadoDetallePedido(true);
	}
	
	public void startProcessEstadoDetallePedido(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoDetallePedido, this.jScrollPanelDatosEstadoDetallePedido,this.jPanelPaginacionEstadoDetallePedido, this.jScrollPanelDatosEdicionEstadoDetallePedido, this.jPanelAccionesEstadoDetallePedido,this.jPanelAccionesFormularioEstadoDetallePedido,this.jmenuBarEstadoDetallePedido,this.jmenuBarDetalleEstadoDetallePedido,this.jTtoolBarEstadoDetallePedido,this.jTtoolBarDetalleEstadoDetallePedido);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoDetallePedido=null; 
		
		final JPanel jPanelParametrosReportesEstadoDetallePedido=this.jPanelParametrosReportesEstadoDetallePedido;
		//final JScrollPane jScrollPanelDatosEstadoDetallePedido=this.jScrollPanelDatosEstadoDetallePedido;
		final JTable jTableDatosEstadoDetallePedido=this.jTableDatosEstadoDetallePedido;		
		final JPanel jPanelPaginacionEstadoDetallePedido=this.jPanelPaginacionEstadoDetallePedido;
		//final JScrollPane jScrollPanelDatosEdicionEstadoDetallePedido=this.jScrollPanelDatosEdicionEstadoDetallePedido;
		final JPanel jPanelAccionesEstadoDetallePedido=this.jPanelAccionesEstadoDetallePedido;
		
		JPanel jPanelCamposAuxiliarEstadoDetallePedido=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoDetallePedido=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) {
			jPanelCamposAuxiliarEstadoDetallePedido=this.jInternalFrameDetalleFormEstadoDetallePedido.jPanelCamposEstadoDetallePedido;
			jPanelAccionesFormularioAuxiliarEstadoDetallePedido=this.jInternalFrameDetalleFormEstadoDetallePedido.jPanelAccionesFormularioEstadoDetallePedido;
		}
		
		final JPanel jPanelCamposEstadoDetallePedido=jPanelCamposAuxiliarEstadoDetallePedido;
		final JPanel jPanelAccionesFormularioEstadoDetallePedido=jPanelAccionesFormularioAuxiliarEstadoDetallePedido;
		
		
		final JMenuBar jmenuBarEstadoDetallePedido=this.jmenuBarEstadoDetallePedido;
		final JToolBar jTtoolBarEstadoDetallePedido=this.jTtoolBarEstadoDetallePedido;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoDetallePedido=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoDetallePedido=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) {
			jmenuBarDetalleAuxiliarEstadoDetallePedido=this.jInternalFrameDetalleFormEstadoDetallePedido.jmenuBarDetalleEstadoDetallePedido;
			jTtoolBarDetalleAuxiliarEstadoDetallePedido=this.jInternalFrameDetalleFormEstadoDetallePedido.jTtoolBarDetalleEstadoDetallePedido;
		}
		
		final JMenuBar jmenuBarDetalleEstadoDetallePedido=jmenuBarDetalleAuxiliarEstadoDetallePedido;
		final JToolBar jTtoolBarDetalleEstadoDetallePedido=jTtoolBarDetalleAuxiliarEstadoDetallePedido;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoDetallePedido;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoDetallePedido;
			processRunnable.jTableDatos=jTableDatosEstadoDetallePedido;
			processRunnable.jPanelCampos=jPanelCamposEstadoDetallePedido;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoDetallePedido;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoDetallePedido;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoDetallePedido;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoDetallePedido;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoDetallePedido;
			processRunnable.jTtoolBar=jTtoolBarEstadoDetallePedido;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoDetallePedido;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoDetallePedido ,jPanelParametrosReportesEstadoDetallePedido,jTableDatosEstadoDetallePedido, /*jScrollPanelDatosEstadoDetallePedido,*/jPanelCamposEstadoDetallePedido,jPanelPaginacionEstadoDetallePedido, /*jScrollPanelDatosEdicionEstadoDetallePedido,*/ jPanelAccionesEstadoDetallePedido,jPanelAccionesFormularioEstadoDetallePedido,jmenuBarEstadoDetallePedido,jmenuBarDetalleEstadoDetallePedido,jTtoolBarEstadoDetallePedido,jTtoolBarDetalleEstadoDetallePedido);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoDetallePedido, jScrollPanelDatosEstadoDetallePedido,jPanelPaginacionEstadoDetallePedido, jScrollPanelDatosEdicionEstadoDetallePedido, jPanelAccionesEstadoDetallePedido,jPanelAccionesFormularioEstadoDetallePedido,jmenuBarEstadoDetallePedido,jmenuBarDetalleEstadoDetallePedido,jTtoolBarEstadoDetallePedido,jTtoolBarDetalleEstadoDetallePedido);
						
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
	
	public void finishProcessEstadoDetallePedido() {// throws Exception 
		this.finishProcessEstadoDetallePedido(true);
	}
	
	public void finishProcessEstadoDetallePedido(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoDetallePedido, this.jScrollPanelDatosEstadoDetallePedido,this.jPanelPaginacionEstadoDetallePedido, this.jScrollPanelDatosEdicionEstadoDetallePedido, this.jPanelAccionesEstadoDetallePedido,this.jPanelAccionesFormularioEstadoDetallePedido,this.jmenuBarEstadoDetallePedido,this.jmenuBarDetalleEstadoDetallePedido,this.jTtoolBarEstadoDetallePedido,this.jTtoolBarDetalleEstadoDetallePedido);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoDetallePedido=null; 
		
		final JPanel jPanelParametrosReportesEstadoDetallePedido=this.jPanelParametrosReportesEstadoDetallePedido;
		//final JScrollPane jScrollPanelDatosEstadoDetallePedido=this.jScrollPanelDatosEstadoDetallePedido;
		final JTable jTableDatosEstadoDetallePedido=this.jTableDatosEstadoDetallePedido;		
		final JPanel jPanelPaginacionEstadoDetallePedido=this.jPanelPaginacionEstadoDetallePedido;
		//final JScrollPane jScrollPanelDatosEdicionEstadoDetallePedido=this.jScrollPanelDatosEdicionEstadoDetallePedido;
		final JPanel jPanelAccionesEstadoDetallePedido=this.jPanelAccionesEstadoDetallePedido;
		
		JPanel jPanelCamposAuxiliarEstadoDetallePedido=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoDetallePedido=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) {
			jPanelCamposAuxiliarEstadoDetallePedido=this.jInternalFrameDetalleFormEstadoDetallePedido.jPanelCamposEstadoDetallePedido;
			jPanelAccionesFormularioAuxiliarEstadoDetallePedido=this.jInternalFrameDetalleFormEstadoDetallePedido.jPanelAccionesFormularioEstadoDetallePedido;
		}
		
		final JPanel jPanelCamposEstadoDetallePedido=jPanelCamposAuxiliarEstadoDetallePedido;
		final JPanel jPanelAccionesFormularioEstadoDetallePedido=jPanelAccionesFormularioAuxiliarEstadoDetallePedido;
		
		
		final JMenuBar jmenuBarEstadoDetallePedido=this.jmenuBarEstadoDetallePedido;		
		final JToolBar jTtoolBarEstadoDetallePedido=this.jTtoolBarEstadoDetallePedido;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoDetallePedido=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoDetallePedido=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) {
			jmenuBarDetalleAuxiliarEstadoDetallePedido=this.jInternalFrameDetalleFormEstadoDetallePedido.jmenuBarDetalleEstadoDetallePedido;
			jTtoolBarDetalleAuxiliarEstadoDetallePedido=this.jInternalFrameDetalleFormEstadoDetallePedido.jTtoolBarDetalleEstadoDetallePedido;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoDetallePedido=jmenuBarDetalleAuxiliarEstadoDetallePedido;
		final JToolBar jTtoolBarDetalleEstadoDetallePedido=jTtoolBarDetalleAuxiliarEstadoDetallePedido;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoDetallePedido;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoDetallePedido;
			processRunnable.jTableDatos=jTableDatosEstadoDetallePedido;
			processRunnable.jPanelCampos=jPanelCamposEstadoDetallePedido;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoDetallePedido;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoDetallePedido;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoDetallePedido;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoDetallePedido;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoDetallePedido;
			processRunnable.jTtoolBar=jTtoolBarEstadoDetallePedido;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoDetallePedido;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoDetallePedido ,jPanelParametrosReportesEstadoDetallePedido, jTableDatosEstadoDetallePedido,/*jScrollPanelDatosEstadoDetallePedido,*/jPanelCamposEstadoDetallePedido,jPanelPaginacionEstadoDetallePedido, /*jScrollPanelDatosEdicionEstadoDetallePedido,*/ jPanelAccionesEstadoDetallePedido,jPanelAccionesFormularioEstadoDetallePedido,jmenuBarEstadoDetallePedido,jmenuBarDetalleEstadoDetallePedido,jTtoolBarEstadoDetallePedido,jTtoolBarDetalleEstadoDetallePedido));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoDetallePedido(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoDetallePedido(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoDetallePedido(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoDetallePedido(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoDetallePedido,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoDetallePedido,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoDetallePedido(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoDetallePedido,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoDetallePedido,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadodetallepedidoConstantesFunciones.getsFinalQueryEstadoDetallePedido();
		String  finalQueryPaginacionTodos=this.estadodetallepedidoConstantesFunciones.getsFinalQueryEstadoDetallePedido();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoDetallePedidoConstantesFunciones.getArrayColumnasGlobalesNoEstadoDetallePedido(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoDetallePedidoConstantesFunciones.getArrayColumnasGlobalesEstadoDetallePedido(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoDetallePedidoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadodetallepedidosEliminados= new ArrayList<EstadoDetallePedido>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoDetallePedido();
		
				///*EstadoDetallePedidoSessionBean*/this.estadodetallepedidoSessionBean=new EstadoDetallePedidoSessionBean();
			
			if(this.estadodetallepedidoSessionBean==null) {
				this.estadodetallepedidoSessionBean=new EstadoDetallePedidoSessionBean();
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
					this.iNumeroPaginacion=EstadoDetallePedidoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoDetallePedidoConstantesFunciones.getClassesForeignKeysOfEstadoDetallePedido(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadodetallepedido."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadodetallepedidosAux= new ArrayList<EstadoDetallePedido>();
			
				
			estadodetallepedidoLogic.setDatosCliente(this.datosCliente);
			estadodetallepedidoLogic.setDatosDeep(this.datosDeep);
			estadodetallepedidoLogic.setIsConDeep(true);
			
			
			estadodetallepedidoLogic.getEstadoDetallePedidoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadodetallepedidoLogic.getTodosEstadoDetallePedidos(finalQueryGlobal,pagination);
					
					//estadodetallepedidoLogic.getTodosEstadoDetallePedidosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadodetallepedidoLogic.getEstadoDetallePedidos()==null|| estadodetallepedidoLogic.getEstadoDetallePedidos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadodetallepedidosAux= new ArrayList<EstadoDetallePedido>();
							estadodetallepedidosAux.addAll(estadodetallepedidoLogic.getEstadoDetallePedidos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadodetallepedidosAux= new ArrayList<EstadoDetallePedido>();
							estadodetallepedidosAux.addAll(estadodetallepedidos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadodetallepedidoLogic.getTodosEstadoDetallePedidos(finalQueryGlobal+"",this.pagination);												
							
							//estadodetallepedidoLogic.getTodosEstadoDetallePedidosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoDetallePedidos("Todos",estadodetallepedidoLogic.getEstadoDetallePedidos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadodetallepedidoLogic.setEstadoDetallePedidos(new ArrayList<EstadoDetallePedido>());					
							estadodetallepedidoLogic.getEstadoDetallePedidos().addAll(estadodetallepedidosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadodetallepedidos=new ArrayList<EstadoDetallePedido>();
							estadodetallepedidos.addAll(estadodetallepedidosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoDetallePedido=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoDetallePedido=this.idActual;
				
				} else if(this.idEstadoDetallePedidoActual!=null && this.idEstadoDetallePedidoActual!=0L) {
					idEstadoDetallePedido=idEstadoDetallePedidoActual;
				}
				
					
				this.sDetalleReporte=EstadoDetallePedidoConstantesFunciones.getDetalleIndicePorId(idEstadoDetallePedido);
				
				this.estadodetallepedidos=new ArrayList<EstadoDetallePedido>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadodetallepedidoLogic.getEntity(idEstadoDetallePedido);
					
					//estadodetallepedidoLogic.getEntityWithConnection(idEstadoDetallePedido);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadodetallepedidoLogic.setEstadoDetallePedidos(new ArrayList<EstadoDetallePedido>());
					estadodetallepedidoLogic.getEstadoDetallePedidos().add(estadodetallepedidoLogic.getEstadoDetallePedido());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadodetallepedidos=new ArrayList<EstadoDetallePedido>();
					this.estadodetallepedidos.add(estadodetallepedido);
				}
				
				if(estadodetallepedidoLogic.getEstadoDetallePedido()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoDetallePedido();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoDetallePedido();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadodetallepedidoLogic.getEstadoDetallePedidos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadodetallepedidos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadodetallepedidoLogic.getEstadoDetallePedidos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadodetallepedidos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoDetallePedido estadodetallepedido) {
		Boolean permite=true;
		
		if(this.estadodetallepedido.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoDetallePedidoConstantesFunciones.getOrderByListaEstadoDetallePedido();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoDetallePedidoConstantesFunciones.getOrderByListaEstadoDetallePedido();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetallePedido estadodetallepedido:estadodetallepedidoLogic.getEstadoDetallePedidos()) {
				if(estadodetallepedido.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetallepedidoTotales=estadodetallepedido;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetallePedido estadodetallepedido:this.estadodetallepedidos) {
				if(estadodetallepedido.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetallepedidoTotales=estadodetallepedido;
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
			this.estadodetallepedidoAux=new EstadoDetallePedido();
			this.estadodetallepedidoAux.setsType(Constantes2.S_TOTALES);
			this.estadodetallepedidoAux.setIsNew(false);
			this.estadodetallepedidoAux.setIsChanged(false);
			this.estadodetallepedidoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoDetallePedidoConstantesFunciones.TotalizarValoresFilaEstadoDetallePedido(this.estadodetallepedidoLogic.getEstadoDetallePedidos(),this.estadodetallepedidoAux);
				
				this.estadodetallepedidoLogic.getEstadoDetallePedidos().add(this.estadodetallepedidoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoDetallePedidoConstantesFunciones.TotalizarValoresFilaEstadoDetallePedido(this.estadodetallepedidos,this.estadodetallepedidoAux);
				
				this.estadodetallepedidos.add(this.estadodetallepedidoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadodetallepedidoTotales=new EstadoDetallePedido();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadodetallepedidoLogic.getEstadoDetallePedidos().remove(estadodetallepedidoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadodetallepedidos.remove(estadodetallepedidoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadodetallepedidoTotales=new EstadoDetallePedido();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetallePedido estadodetallepedido:estadodetallepedidoLogic.getEstadoDetallePedidos()) {
				if(estadodetallepedido.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetallepedidoTotales=estadodetallepedido;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoDetallePedidoConstantesFunciones.TotalizarValoresFilaEstadoDetallePedido(this.estadodetallepedidoLogic.getEstadoDetallePedidos(),estadodetallepedidoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetallePedido estadodetallepedido:this.estadodetallepedidos) {
				if(estadodetallepedido.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetallepedidoTotales=estadodetallepedido;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoDetallePedidoConstantesFunciones.TotalizarValoresFilaEstadoDetallePedido(this.estadodetallepedidos,estadodetallepedidoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEstadoDetallePedidoPorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getEstadoDetallePedidoPorCodigo(String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadodetallepedidoLogic.getEstadoDetallePedidoPorCodigo(codigo);
				
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
	
	public void inicializarPermisosEstadoDetallePedido() {
		this.isPermisoTodoEstadoDetallePedido=false;
		this.isPermisoNuevoEstadoDetallePedido=false;
		this.isPermisoActualizarEstadoDetallePedido=false;
		this.isPermisoActualizarOriginalEstadoDetallePedido=false;
		this.isPermisoEliminarEstadoDetallePedido=false;
		this.isPermisoGuardarCambiosEstadoDetallePedido=false;
		this.isPermisoConsultaEstadoDetallePedido=false;
		this.isPermisoBusquedaEstadoDetallePedido=false;
		this.isPermisoReporteEstadoDetallePedido=false;		
		this.isPermisoOrdenEstadoDetallePedido=false;		
		this.isPermisoPaginacionMedioEstadoDetallePedido=false;		
		this.isPermisoPaginacionAltoEstadoDetallePedido=false;
		this.isPermisoPaginacionTodoEstadoDetallePedido=false;
		this.isPermisoCopiarEstadoDetallePedido=false;		
		this.isPermisoVerFormEstadoDetallePedido=false;		
		this.isPermisoDuplicarEstadoDetallePedido=false;		
		this.isPermisoOrdenEstadoDetallePedido=false;		
	}
	
	public void setPermisosUsuarioEstadoDetallePedido(Boolean isPermiso) {
		this.isPermisoTodoEstadoDetallePedido=isPermiso;
		this.isPermisoNuevoEstadoDetallePedido=isPermiso;
		this.isPermisoActualizarEstadoDetallePedido=isPermiso;
		this.isPermisoActualizarOriginalEstadoDetallePedido=isPermiso;
		this.isPermisoEliminarEstadoDetallePedido=isPermiso;
		this.isPermisoGuardarCambiosEstadoDetallePedido=isPermiso;
		this.isPermisoConsultaEstadoDetallePedido=isPermiso;
		this.isPermisoBusquedaEstadoDetallePedido=isPermiso;
		this.isPermisoReporteEstadoDetallePedido=isPermiso;
		this.isPermisoOrdenEstadoDetallePedido=isPermiso;		
		this.isPermisoPaginacionMedioEstadoDetallePedido=isPermiso;		
		this.isPermisoPaginacionAltoEstadoDetallePedido=isPermiso;		
		this.isPermisoPaginacionTodoEstadoDetallePedido=isPermiso;		
		this.isPermisoCopiarEstadoDetallePedido=isPermiso;		
		this.isPermisoVerFormEstadoDetallePedido=isPermiso;		
		this.isPermisoDuplicarEstadoDetallePedido=isPermiso;
		this.isPermisoOrdenEstadoDetallePedido=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoDetallePedido(Boolean isPermiso) {
		//this.isPermisoTodoEstadoDetallePedido=isPermiso;
		this.isPermisoNuevoEstadoDetallePedido=isPermiso;
		this.isPermisoActualizarEstadoDetallePedido=isPermiso;
		this.isPermisoActualizarOriginalEstadoDetallePedido=isPermiso;
		this.isPermisoEliminarEstadoDetallePedido=isPermiso;
		this.isPermisoGuardarCambiosEstadoDetallePedido=isPermiso;
		//this.isPermisoConsultaEstadoDetallePedido=isPermiso;
		//this.isPermisoBusquedaEstadoDetallePedido=isPermiso;
		//this.isPermisoReporteEstadoDetallePedido=isPermiso;
		//this.isPermisoOrdenEstadoDetallePedido=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoDetallePedido=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoDetallePedido=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoDetallePedido=isPermiso;		
		//this.isPermisoCopiarEstadoDetallePedido=isPermiso;		
		//this.isPermisoDuplicarEstadoDetallePedido=isPermiso;
		//this.isPermisoOrdenEstadoDetallePedido=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoDetallePedidoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleConsignacionConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(DetallePedidoExporConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoDetallePedidoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleConsignacion=false;
		this.isTienePermisosDetalleConsignacion=this.verificarGetPermisosUsuarioOpcionEstadoDetallePedidoClaseRelacionada(this.opcionsRelacionadas,DetalleConsignacionConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosDetallePedidoExpor=false;
		this.isTienePermisosDetallePedidoExpor=this.verificarGetPermisosUsuarioOpcionEstadoDetallePedidoClaseRelacionada(this.opcionsRelacionadas,DetallePedidoExporConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoDetallePedido(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoDetallePedidoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleConsignacion=conPermiso;
		this.isTienePermisosDetallePedidoExpor=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoDetallePedidoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoDetallePedidoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoDetallePedidoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleConsignacion && this.jInternalFrameDetalleFormEstadoDetallePedido!=null && this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoDetallePedido.jTabbedPaneRelacionesEstadoDetallePedido.remove(this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosDetallePedidoExpor && this.jInternalFrameDetalleFormEstadoDetallePedido!=null && this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoDetallePedido.jTabbedPaneRelacionesEstadoDetallePedido.remove(this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoDetallePedido() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoDetallePedidoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoDetallePedidoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoDetallePedido=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoDetallePedido=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoDetallePedido=this.isPermisoActualizarEstadoDetallePedido;
			this.isPermisoEliminarEstadoDetallePedido=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoDetallePedido=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoDetallePedido=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoDetallePedido=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoDetallePedido=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoDetallePedido=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoDetallePedido=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoDetallePedido=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoDetallePedido=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoDetallePedido=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoDetallePedido=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoDetallePedido=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoDetallePedido=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoDetallePedido=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoDetallePedido.setToolTipText(this.jTableDatosEstadoDetallePedido.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoDetallePedido(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoDetallePedido(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoDetallePedidoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoDetallePedidoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoDetallePedido() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleConsignacion && this.estadodetallepedidoConstantesFunciones.mostrarDetalleConsignacionEstadoDetallePedido && !EstadoDetallePedidoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Consignacion");
			reporte.setsDescripcion("Detalle Consignacion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosDetallePedidoExpor && this.estadodetallepedidoConstantesFunciones.mostrarDetallePedidoExporEstadoDetallePedido && !EstadoDetallePedidoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Pedido Exportacion");
			reporte.setsDescripcion("Detalle Pedido Exportacion");
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
	
		
	public void inicializarCombosForeignKeyEstadoDetallePedidoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoDetallePedidoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoDetallePedidoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoDetallePedidoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoDetallePedidoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoDetallePedido()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoDetallePedido()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoDetallePedido(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoDetallePedido()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoDetallePedido();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoDetallePedido(EstadoDetallePedido estadodetallepedido)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoDetallePedido(EstadoDetallePedido estadodetallepedido,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoDetallePedido()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoDetallePedido()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoDetallePedido()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoDetallePedido()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoDetallePedido()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoDetallePedido()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoDetallePedido(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoDetallePedido()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoDetallePedidoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoDetallePedidoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoDetallePedidoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadodetallepedidoSessionBean=new EstadoDetallePedidoSessionBean(); 
		this.estadodetallepedidoConstantesFunciones=new EstadoDetallePedidoConstantesFunciones(); 
		this.estadodetallepedidoBean=new EstadoDetallePedido();//(this.estadodetallepedidoConstantesFunciones); 		
		this.estadodetallepedidoReturnGeneral=new EstadoDetallePedidoParameterReturnGeneral(); 
		
		this.estadodetallepedidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadodetallepedidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoDetallePedidoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoDetallePedidoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoDetallePedidoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoDetallePedido(true);
			
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
			
			this.estadodetallepedidoConstantesFunciones=new EstadoDetallePedidoConstantesFunciones(); 
			this.estadodetallepedidoBean=new EstadoDetallePedido();//this.estadodetallepedidoConstantesFunciones); 			
			this.estadodetallepedidoReturnGeneral=new EstadoDetallePedidoParameterReturnGeneral(); 
		
			EstadoDetallePedidoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Detalle Pedido Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadodetallepedido=new EstadoDetallePedido();
			this.estadodetallepedidos = new ArrayList<EstadoDetallePedido>();
			this.estadodetallepedidosAux = new ArrayList<EstadoDetallePedido>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic=new EstadoDetallePedidoLogic();
				this.estadodetallepedidoLogic.getNewConnexionToDeep("");
			}
			
			//this.estadodetallepedidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadodetallepedidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoDetallePedido);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoDetallePedido!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoDetallePedido);	
					}
					
					if(this.jInternalFrameImportacionEstadoDetallePedido!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoDetallePedido);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoDetallePedido!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoDetallePedido);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoDetallePedido);
				this.jInternalFrameDetalleFormEstadoDetallePedido.setVisible(false);
				this.jInternalFrameDetalleFormEstadoDetallePedido.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoDetallePedido!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoDetallePedido);
					this.jInternalFrameReporteDinamicoEstadoDetallePedido.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoDetallePedido.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoDetallePedido!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoDetallePedido);
					this.jInternalFrameImportacionEstadoDetallePedido.setVisible(false);
					this.jInternalFrameImportacionEstadoDetallePedido.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoDetallePedido!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoDetallePedido);
					this.jInternalFrameOrderByEstadoDetallePedido.setVisible(false);
					this.jInternalFrameOrderByEstadoDetallePedido.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoDetallePedidoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoDetallePedidoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadodetallepedidoReturnGeneral=new EstadoDetallePedidoParameterReturnGeneral();
			
			this.estadodetallepedidoParameterGeneral=new EstadoDetallePedidoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadodetallepedidoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoDetallePedidoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleConsignacionConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(DetallePedidoExporConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoDetallePedidoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadodetallepedidoSessionBean.getEsGuardarRelacionado(),this.estadodetallepedidoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoDetallePedidoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadodetallepedidoSessionBean.getEsGuardarRelacionado(),this.estadodetallepedidoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoDetallePedido=false;
			this.isVisibilidadCeldaDuplicarEstadoDetallePedido=true;
			this.isVisibilidadCeldaCopiarEstadoDetallePedido=true;
			this.isVisibilidadCeldaVerFormEstadoDetallePedido=true;
			this.isVisibilidadCeldaOrdenEstadoDetallePedido=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetallePedido=false;
			this.isVisibilidadCeldaModificarEstadoDetallePedido=false;
			this.isVisibilidadCeldaActualizarEstadoDetallePedido=false;
			this.isVisibilidadCeldaEliminarEstadoDetallePedido=false;
			this.isVisibilidadCeldaCancelarEstadoDetallePedido=false;
			this.isVisibilidadCeldaGuardarEstadoDetallePedido=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetallePedido=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoDetallePedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoDetallePedido();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoDetallePedido(false);
			
			this.setPermisosUsuarioEstadoDetallePedido();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadodetallepedidoSessionBean.getEsGuardarRelacionado() 
				|| (this.estadodetallepedidoSessionBean.getEsGuardarRelacionado() && this.estadodetallepedidoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoDetallePedidoClasesRelacionadas();
			}
			
			if(this.estadodetallepedidoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoDetallePedidoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoDetallePedidoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoDetallePedido();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoDetallePedido();
			}
			
			if(!this.isPermisoBusquedaEstadoDetallePedido) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoDetallePedido,this.isPermisoPaginacionMedioEstadoDetallePedido,this.isPermisoPaginacionTodoEstadoDetallePedido);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoDetallePedidoConstantesFunciones.getTiposSeleccionarEstadoDetallePedido());
				
				this.tiposColumnasSelect=EstadoDetallePedidoConstantesFunciones.getTiposSeleccionarEstadoDetallePedido(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoDetallePedido();				
				//this.tiposRelacionesSelect=EstadoDetallePedidoConstantesFunciones.getTiposRelacionesEstadoDetallePedido(true);
				
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
			//if(!this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoDetallePedido();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoDetallePedido(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoDetallePedido(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetallePedido() ;
			
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
			
			
			this.detalleconsignacionLogic=new DetalleConsignacionLogic();
			this.detallepedidoexporExporLogic=new DetallePedidoExporLogic(); 
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
				estadodetallepedidoImplementable= (EstadoDetallePedidoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoDetallePedidoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadodetallepedidoImplementableHome= (EstadoDetallePedidoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoDetallePedidoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadodetallepedidos= new ArrayList<EstadoDetallePedido>();
			this.estadodetallepedidosEliminados= new ArrayList<EstadoDetallePedido>();
						
			this.isEsNuevoEstadoDetallePedido=false;
			this.esParaAccionDesdeFormularioEstadoDetallePedido=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoDetallePedido(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoDetallePedido();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoDetallePedidoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoDetallePedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoDetallePedido(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoDetallePedido();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoDetallePedido();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoDetallePedido(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoDetallePedido: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoDetallePedido() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoDetallePedido")) {
				iIndex=this.jInternalFrameDetalleFormEstadoDetallePedido.jTabbedPaneRelacionesEstadoDetallePedido.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoDetallePedido.jTabbedPaneRelacionesEstadoDetallePedido.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoDetallePedido.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Consignacions")) {
					if(!DetalleConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoDetallePedido();

						this.cargarParteTabPanelRelacionadaDetalleConsignacion(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Detalle Pedido Exportacions")) {
					if(!DetallePedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoDetallePedido();

						this.cargarParteTabPanelRelacionadaDetallePedidoExpor(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoDetallePedido();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleConsignacion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoDetallePedido.cargarSessionConBeanSwingJInternalFrameDetalleConsignacion(false,true,iIndex);
		this.jButtonDetalleConsignacionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleConsignacion();

		//this.jTabbedPaneRelacionesEstadoDetallePedido.updateUI();
		//this.jTabbedPaneRelacionesEstadoDetallePedido.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoDetallePedido.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaDetallePedidoExpor(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoDetallePedido.cargarSessionConBeanSwingJInternalFrameDetallePedidoExpor(false,true,iIndex);
		this.jButtonDetallePedidoExporActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetallePedidoExpor();

		//this.jTabbedPaneRelacionesEstadoDetallePedido.updateUI();
		//this.jTabbedPaneRelacionesEstadoDetallePedido.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoDetallePedido.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleConsignacion")) {
				int row=this.jTableDatosEstadoDetallePedido.getSelectedRow();
				jButtonDetalleConsignacionActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("DetallePedidoExpor")) {
				int row=this.jTableDatosEstadoDetallePedido.getSelectedRow();
				jButtonDetallePedidoExporActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Consignacion")) {

					if(this.isTienePermisosDetalleConsignacion && this.estadodetallepedidoConstantesFunciones.mostrarDetalleConsignacionEstadoDetallePedido && !EstadoDetallePedidoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Consignacions"+"("+DetalleConsignacionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Consignacions");

						if(estadodetallepedidoConstantesFunciones.resaltarDetalleConsignacionEstadoDetallePedido!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadodetallepedidoConstantesFunciones.resaltarDetalleConsignacionEstadoDetallePedido);
						}

						jmenuItem.setEnabled(this.estadodetallepedidoConstantesFunciones.activarDetalleConsignacionEstadoDetallePedido);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleConsignacion"));

						

						this.jInternalFrameDetalleFormEstadoDetallePedido.jmenuDetalleEstadoDetallePedido.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Detalle Pedido Exportacion")) {

					if(this.isTienePermisosDetallePedidoExpor && this.estadodetallepedidoConstantesFunciones.mostrarDetallePedidoExporEstadoDetallePedido && !EstadoDetallePedidoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Pedido Exportacions"+"("+DetallePedidoExporConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Pedido Exportacions");

						if(estadodetallepedidoConstantesFunciones.resaltarDetallePedidoExporEstadoDetallePedido!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadodetallepedidoConstantesFunciones.resaltarDetallePedidoExporEstadoDetallePedido);
						}

						jmenuItem.setEnabled(this.estadodetallepedidoConstantesFunciones.activarDetallePedidoExporEstadoDetallePedido);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetallePedidoExpor"));

						

						this.jInternalFrameDetalleFormEstadoDetallePedido.jmenuDetalleEstadoDetallePedido.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoDetallePedido(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoDetallePedido(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoDetallePedido(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoDetallePedidoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoDetallePedido();
		
		this.cargarCombosFrameForeignKeyEstadoDetallePedido();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoDetallePedido();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoDetallePedido();
		}
	}
	
	
	
	public void jButtonNuevoEstadoDetallePedidoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadodetallepedidoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoDetallePedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
			
			
			if(jTableDatosEstadoDetallePedido.getRowCount()>=1) {
				jTableDatosEstadoDetallePedido.removeRowSelectionInterval(0, jTableDatosEstadoDetallePedido.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoDetallePedido=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoDetallePedido(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoDetallePedido(true);			
			//this.estadodetallepedido=new EstadoDetallePedido();
			//this.estadodetallepedido.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoDetallePedido(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetallePedido() ;
			
			if(EstadoDetallePedidoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoDetallePedido(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadodetallepedido);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetallepedido);				
			
			EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
			
			if(this.estadodetallepedidoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoDetallePedido: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoDetallePedidoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoDetallePedido> estadodetallepedidosSeleccionados=new ArrayList<EstadoDetallePedido>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoDetallePedido.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoDetallePedido.getSelectedRows().length;			
			}
			
			estadodetallepedidosSeleccionados=this.getEstadoDetallePedidosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoDetallePedido--;			
				//EstadoDetallePedido estadodetallepedidoAux= new EstadoDetallePedido();			
				//estadodetallepedidoAux.setId(this.iIdNuevoEstadoDetallePedido);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoDetallePedido estadodetallepedidoOrigen=new EstadoDetallePedido();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoDetallePedido estadodetallepedidoOrigen : estadodetallepedidosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoDetallePedido.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadodetallepedidoOrigen =(EstadoDetallePedido) this.estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadodetallepedidoOrigen =(EstadoDetallePedido) this.estadodetallepedidos.toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoDetallePedido();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadodetallepedido.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoDetallePedido(estadodetallepedidoOrigen,this.estadodetallepedido,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetallePedido(this.estadodetallepedido);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadodetallepedidoLogic.getEstadoDetallePedidos().add(this.estadodetallepedidoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadodetallepedidos.add(this.estadodetallepedidoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoDetallePedido(false);
				
				this.jTableDatosEstadoDetallePedido.setRowSelectionInterval(this.getIndiceNuevoEstadoDetallePedido(), this.getIndiceNuevoEstadoDetallePedido());
				
				int iLastRow =  this.jTableDatosEstadoDetallePedido.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoDetallePedido.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoDetallePedido.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoDetallePedido(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoDetallePedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoDetallePedido> estadodetallepedidosSeleccionados=new ArrayList<EstadoDetallePedido>();									
		
			EstadoDetallePedido estadodetallepedidoOrigen=new EstadoDetallePedido();
			EstadoDetallePedido estadodetallepedidoDestino=new EstadoDetallePedido();
				
			estadodetallepedidosSeleccionados=this.getEstadoDetallePedidosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoDetallePedido.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadodetallepedidosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoDetallePedido.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetallepedidoOrigen =(EstadoDetallePedido) this.estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadodetallepedidoOrigen =(EstadoDetallePedido) this.estadodetallepedidos.toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetallepedidoDestino =(EstadoDetallePedido) this.estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadodetallepedidoDestino =(EstadoDetallePedido) this.estadodetallepedidos.toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadodetallepedidoOrigen =estadodetallepedidosSeleccionados.get(0);
				estadodetallepedidoDestino =estadodetallepedidosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoDetallePedido(estadodetallepedidoOrigen,estadodetallepedidoDestino,true,false);
				
				estadodetallepedidoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadodetallepedidoDestino,estadodetallepedidoLogic.getEstadoDetallePedidos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetallepedidoDestino,estadodetallepedidos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoDetallePedido(false);
				
				//this.jTableDatosEstadoDetallePedido.setRowSelectionInterval(this.getIndiceNuevoEstadoDetallePedido(), this.getIndiceNuevoEstadoDetallePedido());
				
				int iLastRow =  this.jTableDatosEstadoDetallePedido.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoDetallePedido.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoDetallePedido.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoDetallePedido(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoDetallePedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoDetallePedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoDetallePedido.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoDetallePedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoDetallePedido.isVisible();
			
			
			this.jPanelParametrosReportesEstadoDetallePedido.setVisible(!isVisible);
			this.jPanelPaginacionEstadoDetallePedido.setVisible(!isVisible);
			this.jPanelAccionesEstadoDetallePedido.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoDetallePedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoDetallePedido();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoDetallePedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoDetallePedido();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoDetallePedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoDetallePedido();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoDetallePedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoDetallePedido();
			
			this.abrirFrameOrderByEstadoDetallePedido();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoDetallePedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoDetallePedido();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoDetallePedido(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoDetallePedido);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoDetallePedido.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoDetallePedido.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoDetallePedido.setSize(this.jInternalFrameDetalleFormEstadoDetallePedido.iWidthFormulario,this.jInternalFrameDetalleFormEstadoDetallePedido.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoDetallePedido.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoDetallePedido.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoDetallePedido.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoDetallePedido.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoDetallePedido.jContentPaneDetalleEstadoDetallePedido.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoDetallePedido.jTabbedPaneRelacionesEstadoDetallePedido.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoDetallePedido.jContentPaneDetalleEstadoDetallePedido.getWidth(),EstadoDetallePedidoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoDetallePedido.jTabbedPaneRelacionesEstadoDetallePedido.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoDetallePedido.jContentPaneDetalleEstadoDetallePedido.getWidth(),EstadoDetallePedidoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoDetallePedido.jTabbedPaneRelacionesEstadoDetallePedido.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoDetallePedido.jContentPaneDetalleEstadoDetallePedido.getWidth(),EstadoDetallePedidoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleConsignacion();
					}

					if(DetallePedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetallePedidoExpor();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoDetallePedido.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoDetallePedido.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoDetallePedido() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoDetallePedido==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoDetallePedido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetallePedido,false,this);
				} else {
					this.jInternalFrameOrderByEstadoDetallePedido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetallePedido,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoDetallePedido);
				this.jInternalFrameOrderByEstadoDetallePedido.setVisible(false);
				this.jInternalFrameOrderByEstadoDetallePedido.setSelected(false);
				
				this.jInternalFrameOrderByEstadoDetallePedido.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoDetallePedido"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoDetallePedido();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoDetallePedido() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoDetallePedido==null) {
				
				this.jInternalFrameImportacionEstadoDetallePedido=new ImportacionJInternalFrame(EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoDetallePedido);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoDetallePedido);
				this.jInternalFrameImportacionEstadoDetallePedido.setVisible(false);
				this.jInternalFrameImportacionEstadoDetallePedido.setSelected(false);


				this.jInternalFrameImportacionEstadoDetallePedido.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoDetallePedido"));
				this.jInternalFrameImportacionEstadoDetallePedido.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoDetallePedido"));
				this.jInternalFrameImportacionEstadoDetallePedido.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoDetallePedido"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoDetallePedido() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoDetallePedido==null) {
				this.jInternalFrameReporteDinamicoEstadoDetallePedido=new ReporteDinamicoJInternalFrame(EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoDetallePedido);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoDetallePedido);
				this.jInternalFrameReporteDinamicoEstadoDetallePedido.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoDetallePedido.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoDetallePedido"));
				this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoDetallePedido"));
				this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoDetallePedido"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoDetallePedido();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleConsignacion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame.jScrollPanelDatosDetalleConsignacion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoDetallePedido.jContentPaneDetalleEstadoDetallePedido.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame.jScrollPanelDatosDetalleConsignacion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame.jScrollPanelDatosDetalleConsignacion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame.jScrollPanelDatosDetalleConsignacion.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaDetallePedidoExpor() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame.jScrollPanelDatosDetallePedidoExpor.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoDetallePedido.jContentPaneDetalleEstadoDetallePedido.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame.jScrollPanelDatosDetallePedidoExpor.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame.jScrollPanelDatosDetallePedidoExpor.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame.jScrollPanelDatosDetallePedidoExpor.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoDetallePedido() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoDetallePedido);
			
	       	this.jInternalFrameDetalleFormEstadoDetallePedido.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoDetallePedido.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoDetallePedido.dispose();
			//this.jInternalFrameDetalleFormEstadoDetallePedido=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoDetallePedido() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoDetallePedido.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoDetallePedido.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoDetallePedido() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoDetallePedido.setVisible(true);
	        this.jInternalFrameImportacionEstadoDetallePedido.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoDetallePedido() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoDetallePedido.setVisible(true);
	        this.jInternalFrameOrderByEstadoDetallePedido.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoDetallePedido() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoDetallePedido.setVisible(false);
	        this.jInternalFrameOrderByEstadoDetallePedido.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoDetallePedido() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoDetallePedido.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoDetallePedido.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoDetallePedido() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoDetallePedido.setVisible(false);
	        this.jInternalFrameImportacionEstadoDetallePedido.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoDetallePedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoDetallePedido(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoDetallePedido(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoDetallePedido.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoDetallePedido(true);
			//this.isEsNuevoEstadoDetallePedido=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedido =(EstadoDetallePedido) this.estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadodetallepedido =(EstadoDetallePedido) this.estadodetallepedidos.toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoDetallePedido("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoDetallePedido(false) ;
			
			if(estadodetallepedidoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame.detalleconsignacionSessionBean.getEsGuardarRelacionado() && DetalleConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleConsignacionActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame.detallepedidoexporSessionBean.getEsGuardarRelacionado() && DetallePedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetallePedidoExporActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoDetallePedidoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoDetallePedido(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetallePedido(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoDetallePedidoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoDetallePedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedido =(EstadoDetallePedido) this.estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetallepedido =(EstadoDetallePedido) this.estadodetallepedidos.toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoDetallePedido(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoDetallePedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoDetallePedido.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoDetallePedido(true);
			//this.isEsNuevoEstadoDetallePedido=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedido =(EstadoDetallePedido) this.estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadodetallepedido =(EstadoDetallePedido) this.estadodetallepedidos.toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadodetallepedido.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoDetallePedido("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoDetallePedido(false) ;
			
			if(EstadoDetallePedidoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoDetallePedido(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetallePedido(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoDetallePedidoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoDetallePedido(false);
			
			//if(!this.isEsNuevoEstadoDetallePedido) {								
				int intSelectedRow = this.jTableDatosEstadoDetallePedido.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedido =(EstadoDetallePedido) this.estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadodetallepedido =(EstadoDetallePedido) this.estadodetallepedidos.toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoDetallePedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoDetallePedido(this.estadodetallepedido,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetallePedido(this.estadodetallepedido);
				
			}
			
			if(this.permiteMantenimiento(this.estadodetallepedido)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoDetallePedido=true;
					this.inicializarActualizarBindingTablaEstadoDetallePedido(false);
					this.isEsNuevoEstadoDetallePedido=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoDetallePedido=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoDetallePedido=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoDetallePedido(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoDetallePedido(false);
				
				this.habilitarDeshabilitarControlesEstadoDetallePedido(false);
			
												
				
				if(EstadoDetallePedidoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoDetallePedido();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoDetallePedidoActionPerformed(evt,estadodetallepedidoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoDetallePedido(this.estadodetallepedido,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoDetallePedido.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadodetallepedidoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadodetallepedido.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoDetallePedido.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetallePedido.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoDetallePedidoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoDetallePedido.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedido =(EstadoDetallePedido) this.estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
				this.estadodetallepedido.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadodetallepedido =(EstadoDetallePedido) this.estadodetallepedidos.toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
				this.estadodetallepedido.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadodetallepedido)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoDetallePedidoModel) this.jTableDatosEstadoDetallePedido.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoDetallePedido=true;
				this.inicializarActualizarBindingTablaEstadoDetallePedido(false);
				this.isEsNuevoEstadoDetallePedido=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoDetallePedido(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoDetallePedido(false);
				
				this.habilitarDeshabilitarControlesEstadoDetallePedido(false);
				
				
				
				if(EstadoDetallePedidoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoDetallePedido();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoDetallePedidoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoDetallePedido.getRowCount()>=1) {
				jTableDatosEstadoDetallePedido.removeRowSelectionInterval(0, jTableDatosEstadoDetallePedido.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoDetallePedido(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoDetallePedido(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoDetallePedido(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetallePedido(false) ;
			
			this.isEsNuevoEstadoDetallePedido=false;
			
			if(EstadoDetallePedidoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoDetallePedido();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoDetallePedidoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoDetallePedido(false);
				
				//SI ES MANUAL
				if(EstadoDetallePedidoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoDetallePedido();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoDetallePedidoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoDetallePedido--;			
			//EstadoDetallePedido estadodetallepedidoAux= new EstadoDetallePedido();			
			//estadodetallepedidoAux.setId(this.iIdNuevoEstadoDetallePedido);
			
			if(this.jInternalFrameDetalleFormEstadoDetallePedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoDetallePedido();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetallePedido(this.estadodetallepedido);
			
			this.estadodetallepedido.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadodetallepedidoLogic.getEstadoDetallePedidos().add(this.estadodetallepedidoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadodetallepedidos.add(this.estadodetallepedidoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoDetallePedido(false);
			
			this.jTableDatosEstadoDetallePedido.setRowSelectionInterval(this.getIndiceNuevoEstadoDetallePedido(), this.getIndiceNuevoEstadoDetallePedido());
			
			int iLastRow =  this.jTableDatosEstadoDetallePedido.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoDetallePedido.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoDetallePedido.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoDetallePedido(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoDetallePedidoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoDetallePedido(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetallePedido(false);
			
			//SI ES MANUAL
			if(EstadoDetallePedidoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoDetallePedido();
			}
			
			//this.abrirFrameTreeEstadoDetallePedido();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoDetallePedidoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Detalle PedidoS ?", "MANTENIMIENTO DE Estado Detalle Pedido", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoDetallePedido.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoDetallePedido();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadodetallepedidoReturnGeneral=estadodetallepedidoLogic.procesarImportacionEstadoDetallePedidosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadodetallepedidoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoDetallePedidoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoDetallePedidoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoDetallePedido.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoDetallePedido.setFileImportacion(this.jInternalFrameImportacionEstadoDetallePedido.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoDetallePedido.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoDetallePedido.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoDetallePedido.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoDetallePedido.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoDetallePedidoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoDetallePedido> estadodetallepedidosSeleccionados=new ArrayList<EstadoDetallePedido>();		

		estadodetallepedidosSeleccionados=this.getEstadoDetallePedidosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoDetallePedidoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoDetallePedidoBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoDetallePedidos("Todos",estadodetallepedidosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Pedido",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoDetallePedidoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoDetallePedidoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoDetallePedidoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoDetallePedidoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoDetallePedidoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoDetallePedidoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoDetallePedidoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoDetallePedidoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoDetallePedidoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoDetallePedido> estadodetallepedidosSeleccionados=new ArrayList<EstadoDetallePedido>();		
		
		estadodetallepedidosSeleccionados=this.getEstadoDetallePedidosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetallepedido";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoDetallePedidos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoDetallePedidoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoDetallePedidoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoDetallePedido estadodetallepedido:estadodetallepedidosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadodetallepedido.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoDetallePedidoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoDetallePedidoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoDetallePedido estadodetallepedido:estadodetallepedidosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadodetallepedido.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoDetallePedido(row);				
			//	iRow++;
			//}				
			
			//for(EstadoDetallePedido estadodetallepedidoAux:estadodetallepedidosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoDetallePedido(estadodetallepedidoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Pedido",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadodetallepedidoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetallePedido(false);
			
			//SI ES MANUAL
			if(EstadoDetallePedidoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoDetallePedido();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoDetallePedidoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetallePedido(false);
			
			//SI ES MANUAL
			if(EstadoDetallePedidoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoDetallePedido();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoDetallePedidoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetallePedido(false);
			
			//SI ES MANUAL
			if(EstadoDetallePedidoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoDetallePedido();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallepedidoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoDetallePedido() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoDetallePedido.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoDetallePedido.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoDetallePedido.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoDetallePedido.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoDetallePedido.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoDetallePedido.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoDetallePedido.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoDetallePedido(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoDetallePedido(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoDetallePedido(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoDetallePedido(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoDetallePedido(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoDetallePedido(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetallePedido(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoDetallePedido(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoDetallePedidoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoDetallePedidoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoDetallePedido() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoDetallePedido();
		
		this.inicializarActualizarBindingBotonesManualEstadoDetallePedido(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoDetallePedido();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetallePedido() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoDetallePedido(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoDetallePedido(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoDetallePedido.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoDetallePedido.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoDetallePedido.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoDetallePedido.jCheckBoxPostAccionNuevoEstadoDetallePedido.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoDetallePedido.jCheckBoxPostAccionSinCerrarEstadoDetallePedido.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoDetallePedido.jCheckBoxPostAccionSinMensajeEstadoDetallePedido.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoDetallePedido.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoDetallePedido.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoDetallePedido.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) {
				this.jInternalFrameDetalleFormEstadoDetallePedido.jCheckBoxPostAccionNuevoEstadoDetallePedido.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoDetallePedido.jCheckBoxPostAccionSinCerrarEstadoDetallePedido.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoDetallePedido.jCheckBoxPostAccionSinMensajeEstadoDetallePedido.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoDetallePedido.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoDetallePedido.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoDetallePedido.jComboBoxTiposAccionesFormularioEstadoDetallePedido.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoDetallePedido.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoDetallePedido!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoDetallePedido.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoDetallePedido.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoDetallePedido.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoDetallePedido.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoDetallePedido!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoDetallePedido.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoDetallePedido.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoDetallePedido(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoDetallePedidoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoDetallePedido(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetallePedido() throws Exception {
		try	{
			if(EstadoDetallePedidoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoDetallePedido();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoDetallePedido() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoDetallePedido.jComboBoxTiposAccionesFormularioEstadoDetallePedido.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoDetallePedido.jComboBoxTiposAccionesFormularioEstadoDetallePedido.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoDetallePedido() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoDetallePedido.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoDetallePedido.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoDetallePedido.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoDetallePedido.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoDetallePedido.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoDetallePedido.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoDetallePedido.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoDetallePedido.addItem(reporte);
			}
			
			
			if(!this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoDetallePedido.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoDetallePedido.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoDetallePedido.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoDetallePedido.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoDetallePedido.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoDetallePedido.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoDetallePedido.jComboBoxTiposAccionesFormularioEstadoDetallePedido.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoDetallePedido.jComboBoxTiposAccionesFormularioEstadoDetallePedido.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoDetallePedido.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoDetallePedido.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoDetallePedido.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoDetallePedido();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoDetallePedido() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoDetallePedido!=null) {
				this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoDetallePedido!=null) {
				this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoDetallePedido!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoDetallePedido()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoDetallePedido(Boolean esInicializar) throws Exception {				
		if(EstadoDetallePedidoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoDetallePedido();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoDetallePedido() throws Exception {
		this.inicializarActualizarBindingTablaEstadoDetallePedido(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoDetallePedido() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoDetallePedido.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoDetallePedido.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoDetallePedido.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoDetallePedidoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoDetallePedido.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoDetallePedido.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoDetallePedidoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoDetallePedidoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetallePedidoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoDetallePedidoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoDetallePedido.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoDetallePedido.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoDetallePedidoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoDetallePedido.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoDetallePedido(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadodetallepedidoLogic.getEstadoDetallePedidos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadodetallepedidos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoDetallePedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoDetallePedido.setModel(new EstadoDetallePedidoModel(this.estadodetallepedidoLogic.getEstadoDetallePedidos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoDetallePedido.setModel(new EstadoDetallePedidoModel(this.estadodetallepedidos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoDetallePedido!=null && this.jInternalFrameOrderByEstadoDetallePedido.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoDetallePedido();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoDetallePedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetallePedido,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoDetallePedidoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO,estadodetallepedidoConstantesFunciones.resaltarSeleccionarEstadoDetallePedido,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoDetallePedidoConstantesFunciones.SCLASSWEBTITULO,estadodetallepedidoConstantesFunciones.resaltarSeleccionarEstadoDetallePedido,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoDetallePedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetallePedido,EstadoDetallePedidoConstantesFunciones.LABEL_ID));

		if(this.estadodetallepedidoConstantesFunciones.mostraridEstadoDetallePedido && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoDetallePedidoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadodetallepedidoConstantesFunciones.resaltaridEstadoDetallePedido,this.estadodetallepedidoConstantesFunciones.activaridEstadoDetallePedido,this,true,"idEstadoDetallePedido","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadodetallepedidoConstantesFunciones.resaltaridEstadoDetallePedido,this.estadodetallepedidoConstantesFunciones.activaridEstadoDetallePedido,this,true,"idEstadoDetallePedido","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoDetallePedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetallePedido,EstadoDetallePedidoConstantesFunciones.LABEL_CODIGO));

		if(this.estadodetallepedidoConstantesFunciones.mostrarcodigoEstadoDetallePedido && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoDetallePedidoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadodetallepedidoConstantesFunciones.resaltarcodigoEstadoDetallePedido,this.estadodetallepedidoConstantesFunciones.activarcodigoEstadoDetallePedido,this,true,"codigoEstadoDetallePedido","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadodetallepedidoConstantesFunciones.resaltarcodigoEstadoDetallePedido,this.estadodetallepedidoConstantesFunciones.activarcodigoEstadoDetallePedido,this,true,"codigoEstadoDetallePedido","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoDetallePedidoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoDetallePedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetallePedido,EstadoDetallePedidoConstantesFunciones.LABEL_NOMBRE));

		if(this.estadodetallepedidoConstantesFunciones.mostrarnombreEstadoDetallePedido && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoDetallePedidoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadodetallepedidoConstantesFunciones.resaltarnombreEstadoDetallePedido,this.estadodetallepedidoConstantesFunciones.activarnombreEstadoDetallePedido,this,true,"nombreEstadoDetallePedido","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadodetallepedidoConstantesFunciones.resaltarnombreEstadoDetallePedido,this.estadodetallepedidoConstantesFunciones.activarnombreEstadoDetallePedido,this,true,"nombreEstadoDetallePedido","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoDetallePedidoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleConsignacion && this.estadodetallepedidoConstantesFunciones.mostrarDetalleConsignacionEstadoDetallePedido && !EstadoDetallePedidoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Consignacions");
				tableColumn.setHeaderValue("Detalle Consignacions");
				tableColumn.setCellRenderer(new DetalleConsignacionTableCell(estadodetallepedidoConstantesFunciones.resaltarDetalleConsignacionEstadoDetallePedido,this,this.estadodetallepedidoConstantesFunciones.activarDetalleConsignacionEstadoDetallePedido));
				tableColumn.setCellEditor(new DetalleConsignacionTableCell(estadodetallepedidoConstantesFunciones.resaltarDetalleConsignacionEstadoDetallePedido,this,this.estadodetallepedidoConstantesFunciones.activarDetalleConsignacionEstadoDetallePedido));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoDetallePedido.addColumn(tableColumn);
			}

			if(this.isTienePermisosDetallePedidoExpor && this.estadodetallepedidoConstantesFunciones.mostrarDetallePedidoExporEstadoDetallePedido && !EstadoDetallePedidoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Pedido Exportacions");
				tableColumn.setHeaderValue("Detalle Pedido Exportacions");
				tableColumn.setCellRenderer(new DetallePedidoExporTableCell(estadodetallepedidoConstantesFunciones.resaltarDetallePedidoExporEstadoDetallePedido,this,this.estadodetallepedidoConstantesFunciones.activarDetallePedidoExporEstadoDetallePedido));
				tableColumn.setCellEditor(new DetallePedidoExporTableCell(estadodetallepedidoConstantesFunciones.resaltarDetallePedidoExporEstadoDetallePedido,this,this.estadodetallepedidoConstantesFunciones.activarDetallePedidoExporEstadoDetallePedido));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoDetallePedido.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoDetallePedido.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoDetallePedido.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoDetallePedido && this.isPermisoGuardarCambiosEstadoDetallePedido) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoDetallePedido.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadodetallepedidoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoDetallePedido.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoDetallePedido.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoDetallePedido && this.isPermisoGuardarCambiosEstadoDetallePedido) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadodetallepedidoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoDetallePedido && this.isPermisoGuardarCambiosEstadoDetallePedido) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoDetallePedido.moveColumn(this.jTableDatosEstadoDetallePedido.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoDetallePedido.moveColumn(this.jTableDatosEstadoDetallePedido.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadodetallepedidoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoDetallePedido.moveColumn(this.jTableDatosEstadoDetallePedido.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoDetallePedido.moveColumn(this.jTableDatosEstadoDetallePedido.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoDetallePedido.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoDetallePedido.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoDetallePedido,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoDetallePedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoDetallePedido.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoDetallePedido.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoDetallePedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoDetallePedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoDetallePedido.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoDetallePedido.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoDetallePedido.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadodetallepedidoLogic.getEstadoDetallePedidos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadodetallepedidos.size()-1;
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
		//this.jTableDatosEstadoDetallePedido.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoDetallePedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoDetallePedido();
			
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
				
				//this.isEsNuevoEstadoDetallePedido=false;
					
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
			
				if(this.estadodetallepedidoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoDetallePedido==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoDetallePedido.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoDetallePedido.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedido =(EstadoDetallePedido) this.estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetallepedido =(EstadoDetallePedido) this.estadodetallepedidos.toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadodetallepedido.getsType().equals("DUPLICADO")
				   || this.estadodetallepedido.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoDetallePedido=true;
				
				} else {
					this.isEsNuevoEstadoDetallePedido=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {
					if(this.estadodetallepedido.getId()>=0 && !this.estadodetallepedido.getIsNew()) {						
						this.isEsNuevoEstadoDetallePedido=false;
						
					} else {
						this.isEsNuevoEstadoDetallePedido=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoDetallePedido(esRelaciones);						
				
				this.seleccionarEstadoDetallePedido(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadodetallepedido.getId()<0) {
					this.isEsNuevoEstadoDetallePedido=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoDetallePedido(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoDetallePedido(evt,rowIndex);
				}	
				
				if(this.estadodetallepedidoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoDetallePedido: " + this.dDif); 
					}
				}								
				
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoDetallePedido(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadodetallepedido)) {
					if(this.estadodetallepedido.getId()>0) {
						this.estadodetallepedido.setIsDeleted(true);
						
						this.estadodetallepedidosEliminados.add(this.estadodetallepedido);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadodetallepedidoLogic.getEstadoDetallePedidos().remove(this.estadodetallepedido);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadodetallepedidos.remove(this.estadodetallepedido);				
					}
					
					
					((EstadoDetallePedidoModel) this.jTableDatosEstadoDetallePedido.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoDetallePedido(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoDetallePedido(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoDetallePedido) {
			
			if(this.jInternalFrameDetalleFormEstadoDetallePedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoDetallePedido.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoDetallePedido.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedido =(EstadoDetallePedido) this.estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetallepedido =(EstadoDetallePedido) this.estadodetallepedidos.toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoDetallePedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoDetallePedido(this.estadodetallepedido);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoDetallePedido("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoDetallePedido(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoDetallePedido() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoDetallePedido(EstadoDetallePedido estadodetallepedido) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoDetallePedido(estadodetallepedido,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoDetallePedido(EstadoDetallePedido estadodetallepedido,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoDetallePedido(estadodetallepedido);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoDetallePedido(estadodetallepedido,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetallePedido(estadodetallepedido);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoDetallePedido(EstadoDetallePedido estadodetallepedido) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoDetallePedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoDetallePedido.jTextFieldidEstadoDetallePedido.setText(estadodetallepedido.getId().toString());
			this.jInternalFrameDetalleFormEstadoDetallePedido.jTextFieldcodigoEstadoDetallePedido.setText(estadodetallepedido.getcodigo());
			this.jInternalFrameDetalleFormEstadoDetallePedido.jTextAreanombreEstadoDetallePedido.setText(estadodetallepedido.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoDetallePedido estadodetallepedidoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadodetallepedidoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoDetallePedido estadodetallepedidoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadodetallepedidoLocal=this.estadodetallepedido;
			} else {
				estadodetallepedidoLocal=this.estadodetallepedidoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadodetallepedidoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoDetallePedido(estadodetallepedidoLocal,true);
					
					if(estadodetallepedidoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadodetallepedidoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadodetallepedidoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoDetallePedido(EstadoDetallePedido estadodetallepedido,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoDetallePedido(estadodetallepedido,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetallePedido(estadodetallepedido);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoDetallePedido(EstadoDetallePedido estadodetallepedido,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoDetallePedido(estadodetallepedido,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoDetallePedido(EstadoDetallePedido estadodetallepedido,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoDetallePedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoDetallePedido.jTextFieldidEstadoDetallePedido.getText()==null || this.jInternalFrameDetalleFormEstadoDetallePedido.jTextFieldidEstadoDetallePedido.getText()=="" || this.jInternalFrameDetalleFormEstadoDetallePedido.jTextFieldidEstadoDetallePedido.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoDetallePedido.jTextFieldidEstadoDetallePedido.setText("0");
			}

			if(conColumnasBase) {estadodetallepedido.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoDetallePedido.jTextFieldidEstadoDetallePedido.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoDetallePedidoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetallePedido.jLabelIdEstadoDetallePedido,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadodetallepedido.setcodigo(this.jInternalFrameDetalleFormEstadoDetallePedido.jTextFieldcodigoEstadoDetallePedido.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoDetallePedidoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetallePedido.jLabelcodigoEstadoDetallePedido,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadodetallepedido.setnombre(this.jInternalFrameDetalleFormEstadoDetallePedido.jTextAreanombreEstadoDetallePedido.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoDetallePedidoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetallePedido.jLabelnombreEstadoDetallePedido,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoDetallePedido(EstadoDetallePedido estadodetallepedidoBean,EstadoDetallePedido estadodetallepedido,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoDetallePedido(EstadoDetallePedido estadodetallepedidoOrigen,EstadoDetallePedido estadodetallepedido,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadodetallepedidoOrigen.getId()!=null && !estadodetallepedidoOrigen.getId().equals(0L))) {estadodetallepedido.setId(estadodetallepedidoOrigen.getId());}}
			if(conDefault || (!conDefault && estadodetallepedidoOrigen.getcodigo()!=null && !estadodetallepedidoOrigen.getcodigo().equals(""))) {estadodetallepedido.setcodigo(estadodetallepedidoOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadodetallepedidoOrigen.getnombre()!=null && !estadodetallepedidoOrigen.getnombre().equals(""))) {estadodetallepedido.setnombre(estadodetallepedidoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoDetallePedido(EstadoDetallePedido estadodetallepedido) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoDetallePedido.jTextFieldidEstadoDetallePedido.setText(estadodetallepedido.getId().toString());
			this.jInternalFrameDetalleFormEstadoDetallePedido.jTextFieldcodigoEstadoDetallePedido.setText(estadodetallepedido.getcodigo());
			this.jInternalFrameDetalleFormEstadoDetallePedido.jTextAreanombreEstadoDetallePedido.setText(estadodetallepedido.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoDetallePedido(EstadoDetallePedidoBean estadodetallepedidoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoDetallePedido.jTextFieldidEstadoDetallePedido.setText(estadodetallepedidoBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoDetallePedido.jTextFieldcodigoEstadoDetallePedido.setText(estadodetallepedidoBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoDetallePedido.jTextAreanombreEstadoDetallePedido.setText(estadodetallepedidoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoDetallePedido(EstadoDetallePedidoParameterReturnGeneral estadodetallepedidoReturnGeneral,EstadoDetallePedidoBean estadodetallepedidoBean,Boolean conDefault) throws Exception { 
		try {
			EstadoDetallePedido estadodetallepedidoLocal=new EstadoDetallePedido();
			
			estadodetallepedidoLocal=estadodetallepedidoReturnGeneral.getEstadoDetallePedido();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadodetallepedidoLocal.getId()!=null && !estadodetallepedidoLocal.getId().equals(0L))) {estadodetallepedidoBean.setId(estadodetallepedidoLocal.getId());}}
			if(conDefault || (!conDefault && estadodetallepedidoLocal.getcodigo()!=null && !estadodetallepedidoLocal.getcodigo().equals(""))) {estadodetallepedidoBean.setcodigo(estadodetallepedidoLocal.getcodigo());}
			if(conDefault || (!conDefault && estadodetallepedidoLocal.getnombre()!=null && !estadodetallepedidoLocal.getnombre().equals(""))) {estadodetallepedidoBean.setnombre(estadodetallepedidoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoDetallePedidoGenerico(Long idEstadoDetallePedidoSeleccionado,JComboBox jComboBoxEstadoDetallePedido,List<EstadoDetallePedido> estadodetallepedidosLocal)throws Exception {
		try {
			EstadoDetallePedido  estadodetallepedidoTemp=null;

			for(EstadoDetallePedido estadodetallepedidoAux:estadodetallepedidosLocal) {
				if(estadodetallepedidoAux.getId()!=null && estadodetallepedidoAux.getId().equals(idEstadoDetallePedidoSeleccionado)) {
					estadodetallepedidoTemp=estadodetallepedidoAux;
					break;
				}
			}

			jComboBoxEstadoDetallePedido.setSelectedItem(estadodetallepedidoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoDetallePedidoGenerico(JComboBox jComboBoxEstadoDetallePedido,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoDetallePedido.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoDetallePedido.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoDetallePedido.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoDetallePedido.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoDetallePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoDetallePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetalleConsignacion")) {
			jButtonDetalleConsignacionActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("DetallePedidoExpor")) {
			jButtonDetallePedidoExporActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadodetallepedido=(EstadoDetallePedido) estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadodetallepedido =(EstadoDetallePedido) estadodetallepedidos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoDetallePedido estadodetallepedidoRow=new EstadoDetallePedido();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadodetallepedidoRow=(EstadoDetallePedido) estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadodetallepedidoRow=(EstadoDetallePedido) estadodetallepedidos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleConsignacionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoDetallePedido estadodetallepedido) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoDetallePedido==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedidoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetallepedido = (EstadoDetallePedido)this.estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadodetallepedido = (EstadoDetallePedido)this.estadodetallepedidos.toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadodetallepedido!=null) {
						this.estadodetallepedido = estadodetallepedido;
					} else {
						this.estadodetallepedido = new EstadoDetallePedido();
					}
				}

				if(this.isTienePermisosDetalleConsignacion && this.permiteMantenimiento(this.estadodetallepedido)) {
					DetalleConsignacionBeanSwingJInternalFrame detalleconsignacionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFramePopup=new DetalleConsignacionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleconsignacionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFramePopup;
					} else {
						detalleconsignacionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame;
					}

					List<EstadoDetallePedido> estadodetallepedidos=new ArrayList<EstadoDetallePedido>();
					estadodetallepedidos.add(this.estadodetallepedido);
					if(!esRelacionado) {
						//detalleconsignacionBeanSwingJInternalFrame.detalleconsignacionSessionBean.setConGuardarRelaciones(false);
						//detalleconsignacionBeanSwingJInternalFrame.detalleconsignacionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleconsignacionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoDetallePedido.cargarDetalleConsignacionBeanSwingJInternalFrame(estadodetallepedidos,this.estadodetallepedido,detalleconsignacionBeanSwingJInternalFrame,/*conInicializar,*/detalleconsignacionBeanSwingJInternalFrame.detalleconsignacionSessionBean.getConGuardarRelaciones(),detalleconsignacionBeanSwingJInternalFrame.detalleconsignacionSessionBean.getEsGuardarRelacionado());
					detalleconsignacionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleconsignacionBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleConsignacion("no_relacionado");

						detalleconsignacionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleConsignacionConstantesFunciones.ITAMANIOFILATABLA + (DetalleConsignacionConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleconsignacionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoDetallePedido=(TitledBorder)this.jScrollPanelDatosEstadoDetallePedido.getBorder();
						TitledBorder titledBorderDetalleConsignacion=(TitledBorder)detalleconsignacionBeanSwingJInternalFrame.jScrollPanelDatosDetalleConsignacion.getBorder();

						titledBorderDetalleConsignacion.setTitle(titledBorderEstadoDetallePedido.getTitle() + " -> Detalle Consignacion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleconsignacionBeanSwingJInternalFrame);
						}

						detalleconsignacionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleconsignacionBeanSwingJInternalFrame);

						detalleconsignacionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadodetallepedidoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Consignacion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedidoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedidoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonDetallePedidoExporActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoDetallePedido estadodetallepedido) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoDetallePedido==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedidoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetallepedido = (EstadoDetallePedido)this.estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadodetallepedido = (EstadoDetallePedido)this.estadodetallepedidos.toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadodetallepedido!=null) {
						this.estadodetallepedido = estadodetallepedido;
					} else {
						this.estadodetallepedido = new EstadoDetallePedido();
					}
				}

				if(this.isTienePermisosDetallePedidoExpor && this.permiteMantenimiento(this.estadodetallepedido)) {
					DetallePedidoExporBeanSwingJInternalFrame detallepedidoexporBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFramePopup=new DetallePedidoExporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detallepedidoexporBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFramePopup;
					} else {
						detallepedidoexporBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame;
					}

					List<EstadoDetallePedido> estadodetallepedidos=new ArrayList<EstadoDetallePedido>();
					estadodetallepedidos.add(this.estadodetallepedido);
					if(!esRelacionado) {
						//detallepedidoexporBeanSwingJInternalFrame.detallepedidoexporSessionBean.setConGuardarRelaciones(false);
						//detallepedidoexporBeanSwingJInternalFrame.detallepedidoexporSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detallepedidoexporBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoDetallePedido.cargarDetallePedidoExporBeanSwingJInternalFrame(estadodetallepedidos,this.estadodetallepedido,detallepedidoexporBeanSwingJInternalFrame,/*conInicializar,*/detallepedidoexporBeanSwingJInternalFrame.detallepedidoexporSessionBean.getConGuardarRelaciones(),detallepedidoexporBeanSwingJInternalFrame.detallepedidoexporSessionBean.getEsGuardarRelacionado());
					detallepedidoexporBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detallepedidoexporBeanSwingJInternalFrame.actualizarEstadoPanelsDetallePedidoExpor("no_relacionado");

						detallepedidoexporBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetallePedidoExporConstantesFunciones.ITAMANIOFILATABLA + (DetallePedidoExporConstantesFunciones.ITAMANIOFILATABLA/2));

						detallepedidoexporBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoDetallePedido=(TitledBorder)this.jScrollPanelDatosEstadoDetallePedido.getBorder();
						TitledBorder titledBorderDetallePedidoExpor=(TitledBorder)detallepedidoexporBeanSwingJInternalFrame.jScrollPanelDatosDetallePedidoExpor.getBorder();

						titledBorderDetallePedidoExpor.setTitle(titledBorderEstadoDetallePedido.getTitle() + " -> Detalle Pedido Exportacion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detallepedidoexporBeanSwingJInternalFrame);
						}

						detallepedidoexporBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detallepedidoexporBeanSwingJInternalFrame);

						detallepedidoexporBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadodetallepedidoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Pedido Exportacion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedidoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedidoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoDetallePedido(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoDetallePedido.setVisible((this.isVisibilidadCeldaNuevoEstadoDetallePedido && this.isPermisoNuevoEstadoDetallePedido));			
			this.jButtonDuplicarEstadoDetallePedido.setVisible((this.isVisibilidadCeldaDuplicarEstadoDetallePedido && this.isPermisoDuplicarEstadoDetallePedido));			
			this.jButtonCopiarEstadoDetallePedido.setVisible((this.isVisibilidadCeldaCopiarEstadoDetallePedido && this.isPermisoCopiarEstadoDetallePedido));
			this.jButtonVerFormEstadoDetallePedido.setVisible((this.isVisibilidadCeldaVerFormEstadoDetallePedido && this.isPermisoVerFormEstadoDetallePedido));
			
			this.jButtonAbrirOrderByEstadoDetallePedido.setVisible((this.isVisibilidadCeldaOrdenEstadoDetallePedido && this.isPermisoOrdenEstadoDetallePedido));			
			
			this.jButtonNuevoRelacionesEstadoDetallePedido.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoDetallePedido && this.isPermisoNuevoEstadoDetallePedido));			
			this.jButtonNuevoGuardarCambiosEstadoDetallePedido.setVisible((this.isVisibilidadCeldaNuevoEstadoDetallePedido && this.isPermisoNuevoEstadoDetallePedido && this.isPermisoGuardarCambiosEstadoDetallePedido));
			
			if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) {
			this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonModificarEstadoDetallePedido.setVisible((this.isVisibilidadCeldaModificarEstadoDetallePedido && this.isPermisoActualizarEstadoDetallePedido));	
			this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonActualizarEstadoDetallePedido.setVisible((this.isVisibilidadCeldaActualizarEstadoDetallePedido && this.isPermisoActualizarEstadoDetallePedido));	
			this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonEliminarEstadoDetallePedido.setVisible((this.isVisibilidadCeldaEliminarEstadoDetallePedido && this.isPermisoEliminarEstadoDetallePedido));
			this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonCancelarEstadoDetallePedido.setVisible(this.isVisibilidadCeldaCancelarEstadoDetallePedido);							
			this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonGuardarCambiosEstadoDetallePedido.setVisible((this.isVisibilidadCeldaGuardarEstadoDetallePedido && this.isPermisoGuardarCambiosEstadoDetallePedido));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoDetallePedido.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoDetallePedido && this.isPermisoGuardarCambiosEstadoDetallePedido));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoDetallePedido.setVisible((this.isVisibilidadCeldaNuevoEstadoDetallePedido && this.isPermisoNuevoEstadoDetallePedido));						
			this.jButtonDuplicarToolBarEstadoDetallePedido.setVisible((this.isVisibilidadCeldaDuplicarEstadoDetallePedido && this.isPermisoDuplicarEstadoDetallePedido));						
			this.jButtonCopiarToolBarEstadoDetallePedido.setVisible((this.isVisibilidadCeldaCopiarEstadoDetallePedido && this.isPermisoCopiarEstadoDetallePedido));			
			this.jButtonVerFormToolBarEstadoDetallePedido.setVisible((this.isVisibilidadCeldaVerFormEstadoDetallePedido && this.isPermisoVerFormEstadoDetallePedido));			
			this.jButtonAbrirOrderByToolBarEstadoDetallePedido.setVisible((this.isVisibilidadCeldaOrdenEstadoDetallePedido && this.isPermisoOrdenEstadoDetallePedido));
			this.jButtonNuevoRelacionesToolBarEstadoDetallePedido.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoDetallePedido && this.isPermisoNuevoEstadoDetallePedido));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoDetallePedido.setVisible((this.isVisibilidadCeldaNuevoEstadoDetallePedido && this.isPermisoNuevoEstadoDetallePedido && this.isPermisoGuardarCambiosEstadoDetallePedido));			
			
			if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) {
			this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonModificarToolBarEstadoDetallePedido.setVisible((this.isVisibilidadCeldaModificarEstadoDetallePedido && this.isPermisoActualizarEstadoDetallePedido));	
			this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonActualizarToolBarEstadoDetallePedido.setVisible((this.isVisibilidadCeldaActualizarEstadoDetallePedido  && this.isPermisoActualizarEstadoDetallePedido));	
			this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonEliminarToolBarEstadoDetallePedido.setVisible((this.isVisibilidadCeldaEliminarEstadoDetallePedido && this.isPermisoEliminarEstadoDetallePedido));
			this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonCancelarToolBarEstadoDetallePedido.setVisible(this.isVisibilidadCeldaCancelarEstadoDetallePedido);				
			this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonGuardarCambiosToolBarEstadoDetallePedido.setVisible((this.isVisibilidadCeldaGuardarEstadoDetallePedido && this.isPermisoGuardarCambiosEstadoDetallePedido));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoDetallePedido.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoDetallePedido && this.isPermisoGuardarCambiosEstadoDetallePedido));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoDetallePedido.setVisible((this.isVisibilidadCeldaNuevoEstadoDetallePedido && this.isPermisoNuevoEstadoDetallePedido));			
			this.jMenuItemDuplicarEstadoDetallePedido.setVisible((this.isVisibilidadCeldaDuplicarEstadoDetallePedido && this.isPermisoDuplicarEstadoDetallePedido));			
			this.jMenuItemCopiarEstadoDetallePedido.setVisible((this.isVisibilidadCeldaCopiarEstadoDetallePedido && this.isPermisoCopiarEstadoDetallePedido));			
			this.jMenuItemVerFormEstadoDetallePedido.setVisible((this.isVisibilidadCeldaVerFormEstadoDetallePedido && this.isPermisoVerFormEstadoDetallePedido));			
			this.jMenuItemAbrirOrderByEstadoDetallePedido.setVisible((this.isVisibilidadCeldaOrdenEstadoDetallePedido && this.isPermisoOrdenEstadoDetallePedido));			
			//this.jMenuItemMostrarOcultarEstadoDetallePedido.setVisible((this.isVisibilidadCeldaOrdenEstadoDetallePedido && this.isPermisoOrdenEstadoDetallePedido));
			this.jMenuItemDetalleAbrirOrderByEstadoDetallePedido.setVisible((this.isVisibilidadCeldaOrdenEstadoDetallePedido && this.isPermisoOrdenEstadoDetallePedido));			
			//this.jMenuItemDetalleMostrarOcultarEstadoDetallePedido.setVisible((this.isVisibilidadCeldaOrdenEstadoDetallePedido && this.isPermisoOrdenEstadoDetallePedido));			
			this.jMenuItemNuevoRelacionesEstadoDetallePedido.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoDetallePedido && this.isPermisoNuevoEstadoDetallePedido));			
			this.jMenuItemNuevoGuardarCambiosEstadoDetallePedido.setVisible((this.isVisibilidadCeldaNuevoEstadoDetallePedido && this.isPermisoNuevoEstadoDetallePedido && this.isPermisoGuardarCambiosEstadoDetallePedido));									
			
			if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) {
			this.jInternalFrameDetalleFormEstadoDetallePedido.jMenuItemModificarEstadoDetallePedido.setVisible((this.isVisibilidadCeldaModificarEstadoDetallePedido && this.isPermisoActualizarEstadoDetallePedido));	
			this.jInternalFrameDetalleFormEstadoDetallePedido.jMenuItemActualizarEstadoDetallePedido.setVisible((this.isVisibilidadCeldaActualizarEstadoDetallePedido && this.isPermisoActualizarEstadoDetallePedido));	
			this.jInternalFrameDetalleFormEstadoDetallePedido.jMenuItemEliminarEstadoDetallePedido.setVisible((this.isVisibilidadCeldaEliminarEstadoDetallePedido && this.isPermisoEliminarEstadoDetallePedido));
			this.jInternalFrameDetalleFormEstadoDetallePedido.jMenuItemCancelarEstadoDetallePedido.setVisible(this.isVisibilidadCeldaCancelarEstadoDetallePedido);				
			}
			
			this.jMenuItemGuardarCambiosEstadoDetallePedido.setVisible((this.isVisibilidadCeldaGuardarEstadoDetallePedido && this.isPermisoGuardarCambiosEstadoDetallePedido));						
			this.jMenuItemGuardarCambiosTablaEstadoDetallePedido.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoDetallePedido && this.isPermisoGuardarCambiosEstadoDetallePedido));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoDetallePedido=this.jButtonNuevoEstadoDetallePedido.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoDetallePedido=this.jButtonDuplicarEstadoDetallePedido.isVisible();
			this.isVisibilidadCeldaCopiarEstadoDetallePedido=this.jButtonCopiarEstadoDetallePedido.isVisible();
			this.isVisibilidadCeldaVerFormEstadoDetallePedido=this.jButtonVerFormEstadoDetallePedido.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoDetallePedido=this.jButtonAbrirOrderByEstadoDetallePedido.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetallePedido=this.jButtonNuevoRelacionesEstadoDetallePedido.isVisible();
			this.isVisibilidadCeldaModificarEstadoDetallePedido=this.jButtonModificarEstadoDetallePedido.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) {
			this.isVisibilidadCeldaActualizarEstadoDetallePedido=this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonActualizarEstadoDetallePedido.isVisible();
			this.isVisibilidadCeldaEliminarEstadoDetallePedido=this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonEliminarEstadoDetallePedido.isVisible();
			this.isVisibilidadCeldaCancelarEstadoDetallePedido=this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonCancelarEstadoDetallePedido.isVisible();
			this.isVisibilidadCeldaGuardarEstadoDetallePedido=this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonGuardarCambiosEstadoDetallePedido.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoDetallePedido=this.jButtonGuardarCambiosTablaEstadoDetallePedido.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoDetallePedido=this.jButtonNuevoToolBarEstadoDetallePedido.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetallePedido=this.jButtonNuevoRelacionesToolBarEstadoDetallePedido.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) {
			this.isVisibilidadCeldaModificarEstadoDetallePedido=this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonModificarToolBarEstadoDetallePedido.isVisible();
			this.isVisibilidadCeldaActualizarEstadoDetallePedido=this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonActualizarToolBarEstadoDetallePedido.isVisible();
			this.isVisibilidadCeldaEliminarEstadoDetallePedido=this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonEliminarToolBarEstadoDetallePedido.isVisible();
			this.isVisibilidadCeldaCancelarEstadoDetallePedido=this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonCancelarToolBarEstadoDetallePedido.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoDetallePedido=this.jButtonGuardarCambiosToolBarEstadoDetallePedido.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoDetallePedido=this.jButtonGuardarCambiosTablaToolBarEstadoDetallePedido.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoDetallePedido=this.jMenuItemNuevoEstadoDetallePedido.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetallePedido=this.jMenuItemNuevoRelacionesEstadoDetallePedido.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) {
			this.isVisibilidadCeldaModificarEstadoDetallePedido=this.jInternalFrameDetalleFormEstadoDetallePedido.jMenuItemModificarEstadoDetallePedido.isVisible();
			this.isVisibilidadCeldaActualizarEstadoDetallePedido=this.jInternalFrameDetalleFormEstadoDetallePedido.jMenuItemActualizarEstadoDetallePedido.isVisible();
			this.isVisibilidadCeldaEliminarEstadoDetallePedido=this.jInternalFrameDetalleFormEstadoDetallePedido.jMenuItemEliminarEstadoDetallePedido.isVisible();
			this.isVisibilidadCeldaCancelarEstadoDetallePedido=this.jInternalFrameDetalleFormEstadoDetallePedido.jMenuItemCancelarEstadoDetallePedido.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoDetallePedido=this.jMenuItemGuardarCambiosEstadoDetallePedido.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoDetallePedido=this.jMenuItemGuardarCambiosTablaEstadoDetallePedido.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoDetallePedido(Boolean esInicializar) {
		if(EstadoDetallePedidoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadodetallepedidoSessionBean.getConGuardarRelaciones()) {
				//if(this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoDetallePedido();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoDetallePedido(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoDetallePedido() {
		this.jButtonNuevoEstadoDetallePedido.setVisible(this.isPermisoNuevoEstadoDetallePedido);			
		this.jButtonDuplicarEstadoDetallePedido.setVisible(this.isPermisoDuplicarEstadoDetallePedido);			
		this.jButtonCopiarEstadoDetallePedido.setVisible(this.isPermisoCopiarEstadoDetallePedido);			
		this.jButtonVerFormEstadoDetallePedido.setVisible(this.isPermisoVerFormEstadoDetallePedido);			
		
		this.jButtonAbrirOrderByEstadoDetallePedido.setVisible(this.isPermisoOrdenEstadoDetallePedido);					
		
		this.jButtonNuevoRelacionesEstadoDetallePedido.setVisible(this.isPermisoNuevoEstadoDetallePedido);			
		
		if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonModificarEstadoDetallePedido.setVisible(this.isPermisoActualizarEstadoDetallePedido);	
			this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonActualizarEstadoDetallePedido.setVisible(this.isPermisoActualizarEstadoDetallePedido);	
			this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonEliminarEstadoDetallePedido.setVisible(this.isPermisoEliminarEstadoDetallePedido);
			this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonCancelarEstadoDetallePedido.setVisible(this.isVisibilidadCeldaCancelarEstadoDetallePedido);						
			this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonGuardarCambiosEstadoDetallePedido.setVisible(this.isPermisoGuardarCambiosEstadoDetallePedido);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoDetallePedido.setVisible(this.isPermisoActualizarEstadoDetallePedido);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoDetallePedido() {
		this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonModificarEstadoDetallePedido.setVisible(this.isPermisoActualizarEstadoDetallePedido);	
		this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonActualizarEstadoDetallePedido.setVisible(this.isPermisoActualizarEstadoDetallePedido);	
		this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonEliminarEstadoDetallePedido.setVisible(this.isPermisoEliminarEstadoDetallePedido);
		this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonCancelarEstadoDetallePedido.setVisible(this.isVisibilidadCeldaCancelarEstadoDetallePedido);							
		this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonGuardarCambiosEstadoDetallePedido.setVisible((this.isVisibilidadCeldaGuardarEstadoDetallePedido && this.isPermisoGuardarCambiosEstadoDetallePedido));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoDetallePedido() {
		if(EstadoDetallePedidoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoDetallePedido();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoDetallePedido() {
	}
	
	public void jTableDatosEstadoDetallePedidoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoDetallePedido(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoDetallePedidoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedidoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoDetallePedido.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoDetallePedido(this.getestadodetallepedido(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetallePedido(this.estadodetallepedido);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetallepedido =(EstadoDetallePedido) this.estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadodetallepedido =(EstadoDetallePedido) this.estadodetallepedidos.toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadodetallepedido==null) {
						this.estadodetallepedido = new EstadoDetallePedido();
					}

					this.setVariablesFormularioToObjetoActualEstadoDetallePedido(this.estadodetallepedido,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetallePedido(this.estadodetallepedido);
				}

				if(this.estadodetallepedido.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadodetallepedido.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoDetallePedido(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedidoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedidoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoDetallePedidoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedidoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoDetallePedido.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoDetallePedido(this.getestadodetallepedido(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetallePedido(this.estadodetallepedido);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetallepedido =(EstadoDetallePedido) this.estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadodetallepedido =(EstadoDetallePedido) this.estadodetallepedidos.toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadodetallepedido==null) {
						this.estadodetallepedido = new EstadoDetallePedido();
					}

					this.setVariablesFormularioToObjetoActualEstadoDetallePedido(this.estadodetallepedido,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetallePedido(this.estadodetallepedido);
				}

				if(this.estadodetallepedido.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadodetallepedido.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoDetallePedido(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedidoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedidoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoDetallePedidoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedidoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoDetallePedido.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoDetallePedido(this.getestadodetallepedido(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetallePedido(this.estadodetallepedido);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetallepedido =(EstadoDetallePedido) this.estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadodetallepedido =(EstadoDetallePedido) this.estadodetallepedidos.toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadodetallepedido==null) {
						this.estadodetallepedido = new EstadoDetallePedido();
					}

					this.setVariablesFormularioToObjetoActualEstadoDetallePedido(this.estadodetallepedido,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetallePedido(this.estadodetallepedido);
				}

				if(this.estadodetallepedido.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadodetallepedido.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoDetallePedido(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedidoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedidoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoDetallePedido() {
		if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) {
			this.jInternalFrameDetalleFormEstadoDetallePedido.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoDetallePedido.dispose();
			this.jInternalFrameDetalleFormEstadoDetallePedido=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoDetallePedido!=null) {
			this.jInternalFrameReporteDinamicoEstadoDetallePedido.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoDetallePedido.dispose();
			this.jInternalFrameReporteDinamicoEstadoDetallePedido=null;
		}
		
		if(this.jInternalFrameImportacionEstadoDetallePedido!=null) {
			this.jInternalFrameImportacionEstadoDetallePedido.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoDetallePedido.dispose();
			this.jInternalFrameImportacionEstadoDetallePedido=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoDetallePedido();
			
			EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoDetallePedido")) {
				jButtonNuevoEstadoDetallePedidoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoDetallePedido")) {
				jButtonDuplicarEstadoDetallePedidoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoDetallePedido")) {
				jButtonCopiarEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoDetallePedido")) {
				jButtonVerFormEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoDetallePedido")) {
				jButtonNuevoEstadoDetallePedidoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoDetallePedido")) {
				jButtonDuplicarEstadoDetallePedidoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoDetallePedido")) {
				jButtonNuevoEstadoDetallePedidoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoDetallePedido")) {
				jButtonDuplicarEstadoDetallePedidoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoDetallePedido")) {
				jButtonNuevoEstadoDetallePedidoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoDetallePedido")) {
				jButtonNuevoEstadoDetallePedidoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoDetallePedido")) {
				jButtonNuevoEstadoDetallePedidoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoDetallePedido")) {
				jButtonModificarEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoDetallePedido")) {
				jButtonModificarEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoDetallePedido")) {
				jButtonModificarEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoDetallePedido")) {
				jButtonActualizarEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoDetallePedido")) {
				jButtonActualizarEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoDetallePedido")) {
				jButtonActualizarEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoDetallePedido")) {
				jButtonEliminarEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoDetallePedido")) {
				jButtonEliminarEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoDetallePedido")) {
				jButtonEliminarEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoDetallePedido")) {
				jButtonCancelarEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoDetallePedido")) {
				jButtonCancelarEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoDetallePedido")) {
				jButtonCancelarEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoDetallePedido")) {
				jButtonCerrarEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoDetallePedido")) {
				jButtonCerrarEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoDetallePedido")) {
				jButtonCerrarEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoDetallePedido")) {
				jButtonMostrarOcultarEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoDetallePedido")) {
				jButtonCancelarEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoDetallePedido")) {
				jButtonGuardarCambiosEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoDetallePedido")) {
				jButtonGuardarCambiosEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoDetallePedido")) {
				jButtonCopiarEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoDetallePedido")) {
				jButtonVerFormEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoDetallePedido")) {
				jButtonGuardarCambiosEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoDetallePedido")) {
				jButtonCopiarEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoDetallePedido")) {
				jButtonVerFormEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoDetallePedido")) {
				jButtonGuardarCambiosEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoDetallePedido")) {
				jButtonGuardarCambiosEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoDetallePedido")) {
				jButtonGuardarCambiosEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoDetallePedido")) {
				jButtonRecargarInformacionEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoDetallePedido")) {
				jButtonRecargarInformacionEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoDetallePedido")) {
				jButtonRecargarInformacionEstadoDetallePedidoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoDetallePedido")) {
				jButtonAnterioresEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoDetallePedido")) {
				jButtonAnterioresEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoDetallePedido")) {
				jButtonAnterioresEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoDetallePedido")) {
				jButtonSiguientesEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoDetallePedido")) {
				jButtonSiguientesEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoDetallePedido")) {
				jButtonSiguientesEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoDetallePedido") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoDetallePedido")) {
				jButtonAbrirOrderByEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoDetallePedido") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoDetallePedido")) {
				jButtonMostrarOcultarEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoDetallePedido")) {
				jButtonNuevoGuardarCambiosEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoDetallePedido")) {
				jButtonNuevoGuardarCambiosEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoDetallePedido")) {
				jButtonNuevoGuardarCambiosEstadoDetallePedidoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoDetallePedido")) {
				jButtonCerrarReporteDinamicoEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoDetallePedido")) {
				jButtonGenerarReporteDinamicoEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoDetallePedido")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoDetallePedidoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoDetallePedido")) {
				jButtonCerrarImportacionEstadoDetallePedidoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoDetallePedido")) {
				
				jButtonGenerarImportacionEstadoDetallePedidoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoDetallePedido")) {
				
				jButtonAbrirImportacionEstadoDetallePedidoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoDetallePedido")) {
				jComboBoxTiposAccionesEstadoDetallePedidoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoDetallePedido")) {
				jComboBoxTiposRelacionesEstadoDetallePedidoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoDetallePedido")) {
				jComboBoxTiposAccionesEstadoDetallePedidoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoDetallePedido")) {
				
				jComboBoxTiposSeleccionarEstadoDetallePedidoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoDetallePedido")) {
				jTextFieldValorCampoGeneralEstadoDetallePedidoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoDetallePedido")) {
				jButtonAbrirOrderByEstadoDetallePedidoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoDetallePedido")) {
				jButtonAbrirOrderByEstadoDetallePedidoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoDetallePedido")) {
				jButtonCerrarOrderByEstadoDetallePedidoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoDetallePedidoBusqueda")) {
				this.jButtonidEstadoDetallePedidoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoDetallePedidoBusqueda")) {
				this.jButtoncodigoEstadoDetallePedidoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoDetallePedidoBusqueda")) {
				this.jButtonnombreEstadoDetallePedidoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoDetallePedido();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetallePedidoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallepedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallepedido);
				
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
				
				


				
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetallePedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetallePedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoDetallePedido estadodetallepedidoLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadodetallepedidoLocal=this.estadodetallepedido;
			} else {
				estadodetallepedidoLocal=this.estadodetallepedidoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallepedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallepedido);
				
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
							
				
				


				
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetallePedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetallePedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetallePedidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetallePedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedidoAnterior =(EstadoDetallePedido) this.estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetallepedidoAnterior =(EstadoDetallePedido) this.estadodetallepedidos.toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
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
			
			EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
			
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
			
			


			
			EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetallePedidoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallepedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallepedido);
				
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
								
						
				


				
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetallePedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetallePedido.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallepedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallepedido);
				
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
								
				
				


				
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetallePedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetallePedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetallePedidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetallePedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedidoAnterior =(EstadoDetallePedido) this.estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetallepedidoAnterior =(EstadoDetallePedido) this.estadodetallepedidos.toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallepedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallepedido);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetallePedidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetallePedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedidoAnterior =(EstadoDetallePedido) this.estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetallepedidoAnterior =(EstadoDetallePedido) this.estadodetallepedidos.toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetallePedidoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallepedido);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetallepedido);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallepedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallepedido);
				
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
							
				
				


				
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetallePedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetallePedido.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetallePedidoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoDetallePedido.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetallepedidoAnterior =(EstadoDetallePedido) this.estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadodetallepedidoAnterior =(EstadoDetallePedido) this.estadodetallepedidos.toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
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
			
			EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
			
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
			
			


			
			EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetallePedidoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallepedido);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetallepedido);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallepedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallepedido);
				
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
								
				
				


				
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetallePedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetallePedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetallePedidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetallePedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedidoAnterior =(EstadoDetallePedido) this.estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetallepedidoAnterior =(EstadoDetallePedido) this.estadodetallepedidos.toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetallePedidoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallepedido);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetallepedido);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetallePedidoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallepedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallepedido);
				
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoDetallePedido")) {
					jCheckBoxSeleccionarTodosEstadoDetallePedidoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoDetallePedido")) {
					jCheckBoxSeleccionadosEstadoDetallePedidoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoDetallePedido")) {
					
				}
				
				


				
				
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetallePedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetallePedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallepedido);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadodetallepedido);
				
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
												
				
				


				
				
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetallePedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetallePedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetallePedidoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoDetallePedido.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetallepedidoAnterior =(EstadoDetallePedido) this.estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadodetallepedidoAnterior =(EstadoDetallePedido) this.estadodetallepedidos.toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetallePedidoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallepedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallepedido);
				
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
				
				
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
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
			
			EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
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
			
			


			
			EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetallePedidoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallepedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallepedido);
				
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetallePedido.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetallePedido.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallepedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallepedido);
				
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
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
				
				


				
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetallePedido.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetallePedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetallePedidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetallePedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallepedidoAnterior =(EstadoDetallePedido) this.estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetallepedidoAnterior =(EstadoDetallePedido) this.estadodetallepedidos.toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoDetallePedido")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoDetallePedidoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoDetallePedido.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadodetallepedido =(EstadoDetallePedido) this.estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadodetallepedido =(EstadoDetallePedido) this.estadodetallepedidos.toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadodetallepedido);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoDetallePedido")) {
				
				}
				
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoDetallePedido")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoDetallePedido.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoDetallePedido")) {
			
			}
			
			EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoDetallePedido();
			
			EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoDetallePedido")) {
				jButtonNuevoEstadoDetallePedidoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoDetallePedido")) {
				jButtonDuplicarEstadoDetallePedidoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoDetallePedido")) {
				jButtonCopiarEstadoDetallePedidoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoDetallePedido")) {
				jButtonVerFormEstadoDetallePedidoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoDetallePedido")) {
				jButtonNuevoEstadoDetallePedidoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoDetallePedido")) {
				jButtonModificarEstadoDetallePedidoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoDetallePedido")) {
				jButtonActualizarEstadoDetallePedidoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoDetallePedido")) {
				jButtonEliminarEstadoDetallePedidoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoDetallePedido")) {
				jButtonGuardarCambiosEstadoDetallePedidoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoDetallePedido")) {
				jButtonCancelarEstadoDetallePedidoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoDetallePedido")) {
				jButtonCerrarEstadoDetallePedidoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoDetallePedido")) {
				jButtonGuardarCambiosEstadoDetallePedidoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoDetallePedido")) {
				jButtonNuevoGuardarCambiosEstadoDetallePedidoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoDetallePedido")) {
				jButtonAbrirOrderByEstadoDetallePedidoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoDetallePedido")) {
				jButtonRecargarInformacionEstadoDetallePedidoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoDetallePedido")) {
				jButtonAnterioresEstadoDetallePedidoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoDetallePedido")) {
				jButtonSiguientesEstadoDetallePedidoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoDetallePedidoBusqueda")) {
				this.jButtonidEstadoDetallePedidoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoDetallePedidoBusqueda")) {
				this.jButtoncodigoEstadoDetallePedidoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoDetallePedidoBusqueda")) {
				this.jButtonnombreEstadoDetallePedidoBusquedaActionPerformed(evt);
			}
			
			EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoDetallePedido();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoDetallePedido")) {
				closingInternalFrameEstadoDetallePedido();
				
			} else if(sTipo.equals("jButtonCancelarEstadoDetallePedido")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoDetallePedido = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoDetallePedidoBeanSwingJInternalFrame jInternalFrameParent=(EstadoDetallePedidoBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoDetallePedido.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoDetallePedidoActionPerformed(null);
			}
			
			EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadodetallepedido,new Object(),this.estadodetallepedidoParameterGeneral,this.estadodetallepedidoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoDetallePedido(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoDetallePedido(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoDetallePedido(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadodetallepedido)) {
			if(!esControlTabla) {
				if(EstadoDetallePedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoDetallePedido(this.estadodetallepedido,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetallePedido(this.estadodetallepedido);			
				}
				
				if(this.estadodetallepedidoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoDetallePedido(this.estadodetallepedido,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadodetallepedidoReturnGeneral=estadodetallepedidoLogic.procesarEventosEstadoDetallePedidosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetallepedidoLogic.getEstadoDetallePedidos(),this.estadodetallepedido,this.estadodetallepedidoParameterGeneral,this.isEsNuevoEstadoDetallePedido,classes);//this.estadodetallepedidoLogic.getEstadoDetallePedido()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoDetallePedido(this.estadodetallepedidoReturnGeneral,this.estadodetallepedidoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadodetallepedidoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoDetallePedido(classes,this.estadodetallepedidoReturnGeneral,this.estadodetallepedidoBean,false);
					}
						
					if(this.estadodetallepedidoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetallePedido(this.estadodetallepedidoReturnGeneral.getEstadoDetallePedido());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoDetallePedido(this.estadodetallepedidoReturnGeneral.getEstadoDetallePedido());	
					}
						
					if(this.estadodetallepedidoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoDetallePedido(this.estadodetallepedidoReturnGeneral.getEstadoDetallePedido(),classes);//this.estadodetallepedidoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoDetallePedido(this.estadodetallepedido,classes);//this.estadodetallepedidoBean);									
				}
			
				if(EstadoDetallePedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoDetallePedido(this.estadodetallepedido,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetallePedido(this.estadodetallepedido);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadodetallepedidoAnterior!=null) {
						this.estadodetallepedido=this.estadodetallepedidoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadodetallepedidoReturnGeneral=estadodetallepedidoLogic.procesarEventosEstadoDetallePedidosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetallepedidoLogic.getEstadoDetallePedidos(),this.estadodetallepedido,this.estadodetallepedidoParameterGeneral,this.isEsNuevoEstadoDetallePedido,classes);//this.estadodetallepedidoLogic.getEstadoDetallePedido()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadodetallepedidoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadodetallepedidoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadodetallepedidoReturnGeneral.getEstadoDetallePedido(),estadodetallepedidoLogic.getEstadoDetallePedidos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadodetallepedidoReturnGeneral.getEstadoDetallePedido(),this.estadodetallepedidos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoDetallePedido.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoDetallePedido.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoDetallePedido();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoDetallePedido() throws Exception {
		
		EstadoDetallePedidoModel estadodetallepedidoModel=(EstadoDetallePedidoModel)this.jTableDatosEstadoDetallePedido.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadodetallepedidoModel.estadodetallepedidos=this.estadodetallepedidoLogic.getEstadoDetallePedidos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadodetallepedidoModel.estadodetallepedidos=this.estadodetallepedidos;
		}
		
		
		((EstadoDetallePedidoModel) this.jTableDatosEstadoDetallePedido.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoDetallePedido() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadodetallepedidoAnterior(),this.estadodetallepedidoLogic.getEstadoDetallePedidos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadodetallepedidoAnterior(),this.estadodetallepedidos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoDetallePedido();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoDetallePedido(EstadoDetallePedido estadodetallepedido,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleConsignacion.class)) {
					this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame.detalleconsignacionLogic.setDetalleConsignacions(estadodetallepedido.getDetalleConsignacions());
					this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleConsignacion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetallePedidoExpor.class)) {
					this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame.detallepedidoexporLogic.setDetallePedidoExpors(estadodetallepedido.getDetallePedidoExporExpors());
					this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetallePedidoExpor(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
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
										
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetallepedido,new Object(),generalEntityParameterGeneral,this.estadodetallepedidoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadodetallepedidoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoDetallePedidoConstantesFunciones.getClassesRelationshipsOfEstadoDetallePedido(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoDetallePedidoConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoDetallePedido(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoDetallePedido(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoDetallePedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetallepedido,new Object(),generalEntityParameterGeneral,this.estadodetallepedidoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoDetallePedido(EstadoDetallePedidoBean estadodetallepedidoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleConsignacion.class)) {
					this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame.detalleconsignacionLogic.setDetalleConsignacions(estadodetallepedido.getDetalleConsignacions());
					this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleConsignacion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetallePedidoExpor.class)) {
					this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame.detallepedidoexporLogic.setDetallePedidoExpors(estadodetallepedido.getDetallePedidoExporExpors());
					this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetallePedidoExpor(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoDetallePedido(ArrayList<Classe> classes,EstadoDetallePedidoReturnGeneral estadodetallepedidoReturnGeneral,EstadoDetallePedidoBean estadodetallepedidoBean,Boolean conDefault) throws Exception {
		
			this.estadodetallepedidoBean.setDetalleConsignacions(estadodetallepedidoReturnGeneral.getEstadoDetallePedido().getDetalleConsignacions());
			this.estadodetallepedidoBean.setDetallePedidoExpors(estadodetallepedidoReturnGeneral.getEstadoDetallePedido().getDetallePedidoExpors());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoDetallePedido(EstadoDetallePedido estadodetallepedido,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleConsignacion.class)) {
					estadodetallepedido.setDetalleConsignacions(this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionBeanSwingJInternalFrame.detalleconsignacionLogic.getDetalleConsignacions());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetallePedidoExpor.class)) {
					estadodetallepedido.setDetallePedidoExporExpors(this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporBeanSwingJInternalFrame.detallepedidoexporLogic.getDetallePedidoExpors());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadodetallepedido)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoDetallePedido = new EstadoDetallePedidoDetalleFormJInternalFrame(jDesktopPane,this.estadodetallepedidoSessionBean.getConGuardarRelaciones(),this.estadodetallepedidoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoDetallePedido);
		this.jInternalFrameDetalleFormEstadoDetallePedido.setVisible(false);
		this.jInternalFrameDetalleFormEstadoDetallePedido.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoDetallePedido.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoDetallePedido.estadodetallepedidoLogic=this.estadodetallepedidoLogic;
		
		this.cargarCombosFrameForeignKeyEstadoDetallePedido("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoDetallePedido();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoDetallePedido();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoDetallePedido("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoDetallePedido();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoDetallePedido.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoDetallePedido"));
		
		this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonModificarEstadoDetallePedido.addActionListener(new ButtonActionListener(this,"ModificarEstadoDetallePedido"));

		
		this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonModificarToolBarEstadoDetallePedido.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoDetallePedido"));
					
		this.jInternalFrameDetalleFormEstadoDetallePedido.jMenuItemModificarEstadoDetallePedido.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoDetallePedido"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonActualizarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"ActualizarEstadoDetallePedido"));
		
		
		this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonActualizarToolBarEstadoDetallePedido.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoDetallePedido"));
						
		this.jInternalFrameDetalleFormEstadoDetallePedido.jMenuItemActualizarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoDetallePedido"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonEliminarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"EliminarEstadoDetallePedido"));
		
		
		this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonEliminarToolBarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoDetallePedido"));
								
		this.jInternalFrameDetalleFormEstadoDetallePedido.jMenuItemEliminarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoDetallePedido"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonCancelarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"CancelarEstadoDetallePedido"));
		
		
		this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonCancelarToolBarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoDetallePedido"));
					
		this.jInternalFrameDetalleFormEstadoDetallePedido.jMenuItemCancelarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoDetallePedido"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetallePedido.jMenuItemDetalleCerrarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoDetallePedido"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonGuardarCambiosToolBarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoDetallePedido"));
		
		
		
		this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonGuardarCambiosToolBarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoDetallePedido"));
		
		
		
		this.jInternalFrameDetalleFormEstadoDetallePedido.jComboBoxTiposAccionesFormularioEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoDetallePedido"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonidEstadoDetallePedidoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoDetallePedidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetallePedido.jButtoncodigoEstadoDetallePedidoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoDetallePedidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonnombreEstadoDetallePedidoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoDetallePedidoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoDetallePedido.jTabbedPaneRelacionesEstadoDetallePedido.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoDetallePedido"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoDetallePedido"));
		
		if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetallePedido.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoDetallePedido"));
		}
		
		this.jTableDatosEstadoDetallePedido.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoDetallePedido"));
		
		this.jTableDatosEstadoDetallePedido.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoDetallePedido"));
		
		this.jButtonNuevoEstadoDetallePedido.addActionListener(new ButtonActionListener(this,"NuevoEstadoDetallePedido"));
		
		this.jButtonDuplicarEstadoDetallePedido.addActionListener(new ButtonActionListener(this,"DuplicarEstadoDetallePedido"));
		
		this.jButtonCopiarEstadoDetallePedido.addActionListener(new ButtonActionListener(this,"CopiarEstadoDetallePedido"));
		
		this.jButtonVerFormEstadoDetallePedido.addActionListener(new ButtonActionListener(this,"VerFormEstadoDetallePedido"));
		
		
		this.jButtonNuevoToolBarEstadoDetallePedido.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoDetallePedido"));
			
		this.jButtonDuplicarToolBarEstadoDetallePedido.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoDetallePedido"));
			
		this.jMenuItemNuevoEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoDetallePedido"));
			
		this.jMenuItemDuplicarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoDetallePedido"));		
		
		
		this.jButtonNuevoRelacionesEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoDetallePedido"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoDetallePedido.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoDetallePedido"));
			
		this.jMenuItemNuevoRelacionesEstadoDetallePedido.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoDetallePedido"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonModificarEstadoDetallePedido.addActionListener(new ButtonActionListener(this,"ModificarEstadoDetallePedido"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonModificarToolBarEstadoDetallePedido.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoDetallePedido"));
			
			this.jInternalFrameDetalleFormEstadoDetallePedido.jMenuItemModificarEstadoDetallePedido.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoDetallePedido"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonActualizarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"ActualizarEstadoDetallePedido"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonActualizarToolBarEstadoDetallePedido.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoDetallePedido"));
				
			this.jInternalFrameDetalleFormEstadoDetallePedido.jMenuItemActualizarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoDetallePedido"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonEliminarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"EliminarEstadoDetallePedido"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonEliminarToolBarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoDetallePedido"));
						
			this.jInternalFrameDetalleFormEstadoDetallePedido.jMenuItemEliminarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoDetallePedido"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonCancelarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"CancelarEstadoDetallePedido"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonCancelarToolBarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoDetallePedido"));
			
			this.jInternalFrameDetalleFormEstadoDetallePedido.jMenuItemCancelarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoDetallePedido"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoDetallePedido"));		
		
		
		this.jButtonCerrarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"CerrarEstadoDetallePedido"));
		
		
		this.jButtonCerrarToolBarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoDetallePedido"));
			
		this.jMenuItemCerrarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoDetallePedido"));
			
		if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetallePedido.jMenuItemDetalleCerrarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoDetallePedido"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonGuardarCambiosEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoDetallePedido"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonGuardarCambiosToolBarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoDetallePedido"));
		}
		
		this.jButtonCopiarToolBarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoDetallePedido"));
			
		this.jButtonVerFormToolBarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoDetallePedido"));
		
		this.jMenuItemGuardarCambiosEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoDetallePedido"));
			
		this.jMenuItemCopiarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoDetallePedido"));		
		
		this.jMenuItemVerFormEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoDetallePedido"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoDetallePedido"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoDetallePedido"));
			
		this.jMenuItemGuardarCambiosTablaEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoDetallePedido"));		
		
		
		
		this.jButtonRecargarInformacionEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoDetallePedido"));
					
		this.jButtonRecargarInformacionToolBarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoDetallePedido"));
		
		this.jMenuItemRecargarInformacionEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoDetallePedido"));		
		
		
		
		this.jButtonAnterioresEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"AnterioresEstadoDetallePedido"));
		
		
		this.jButtonAnterioresToolBarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoDetallePedido"));
		
		this.jMenuItemAnterioresEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoDetallePedido"));		
		
		
		this.jButtonSiguientesEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"SiguientesEstadoDetallePedido"));
		
		
		this.jButtonSiguientesToolBarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoDetallePedido"));
			
		this.jMenuItemSiguientesEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoDetallePedido"));
			
		this.jMenuItemAbrirOrderByEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoDetallePedido"));
			
		this.jMenuItemMostrarOcultarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoDetallePedido"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoDetallePedido"));
			
		this.jMenuItemDetalleMostarOcultarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoDetallePedido"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoDetallePedido"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoDetallePedido"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoDetallePedido"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoDetallePedido.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoDetallePedido"));

		this.jCheckBoxSeleccionadosEstadoDetallePedido.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoDetallePedido"));
		
		if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetallePedido.jComboBoxTiposAccionesFormularioEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoDetallePedido"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoDetallePedido"));
			
		this.jComboBoxTiposAccionesEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoDetallePedido"));
					
		this.jComboBoxTiposSeleccionarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoDetallePedido"));
			
		this.jTextFieldValorCampoGeneralEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoDetallePedido"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonidEstadoDetallePedidoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoDetallePedidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetallePedido.jButtoncodigoEstadoDetallePedidoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoDetallePedidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonnombreEstadoDetallePedidoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoDetallePedidoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoDetallePedido!=null) {
				this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoDetallePedido"));
				this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoDetallePedido"));
				this.jInternalFrameReporteDinamicoEstadoDetallePedido.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoDetallePedido"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoDetallePedido"));				
			//this.jButtonGenerarReporteDinamicoEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoDetallePedido"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoDetallePedido"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoDetallePedido!=null) {
				this.jInternalFrameImportacionEstadoDetallePedido.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoDetallePedido"));
				this.jInternalFrameImportacionEstadoDetallePedido.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoDetallePedido"));
				this.jInternalFrameImportacionEstadoDetallePedido.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoDetallePedido"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoDetallePedido"));
			
			this.jButtonAbrirOrderByToolBarEstadoDetallePedido.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoDetallePedido"));			
			
			if(this.jInternalFrameOrderByEstadoDetallePedido!=null) {
				this.jInternalFrameOrderByEstadoDetallePedido.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoDetallePedido"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetallePedido.jTabbedPaneRelacionesEstadoDetallePedido.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoDetallePedido"));
		
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
            		closingInternalFrameEstadoDetallePedido();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoDetallePedido.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoDetallePedido = (JInternalFrameBase)event.getSource();
	            	
	            EstadoDetallePedidoBeanSwingJInternalFrame jInternalFrameParent=(EstadoDetallePedidoBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoDetallePedido.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoDetallePedidoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoDetallePedido.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoDetallePedidoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoDetallePedido.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoDetallePedido.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetallePedidoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetallePedidoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetallePedidoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoDetallePedido";
		inputMap = this.jButtonNuevoEstadoDetallePedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoDetallePedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoDetallePedidoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetallePedidoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetallePedidoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetallePedidoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoDetallePedido";
		inputMap = this.jButtonNuevoRelacionesEstadoDetallePedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoDetallePedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoDetallePedidoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoDetallePedido";
		inputMap = this.jButtonModificarEstadoDetallePedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoDetallePedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoDetallePedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoDetallePedido";
		inputMap = this.jButtonActualizarEstadoDetallePedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoDetallePedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoDetallePedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoDetallePedido";
		inputMap = this.jButtonEliminarEstadoDetallePedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoDetallePedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoDetallePedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoDetallePedido";
		inputMap = this.jButtonCancelarEstadoDetallePedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoDetallePedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoDetallePedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoDetallePedido";
		inputMap = this.jButtonCerrarEstadoDetallePedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoDetallePedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoDetallePedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonGuardarCambiosEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoDetallePedido";
		inputMap = this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonGuardarCambiosEstadoDetallePedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonGuardarCambiosEstadoDetallePedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoDetallePedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoDetallePedido.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoDetallePedidoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoDetallePedido.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoDetallePedidoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoDetallePedido.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoDetallePedidoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoDetallePedido.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoDetallePedidoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonidEstadoDetallePedidoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoDetallePedidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetallePedido.jButtoncodigoEstadoDetallePedidoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoDetallePedidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetallePedido.jButtonnombreEstadoDetallePedidoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoDetallePedidoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoDetallePedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoDetallePedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoDetallePedidoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoDetallePedido.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoDetallePedido(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoDetallePedido estadodetallepedidoAux:this.estadodetallepedidoLogic.getEstadoDetallePedidos()) {
					estadodetallepedidoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetallePedido estadodetallepedidoAux:estadodetallepedidos) {
					estadodetallepedidoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoDetallePedidoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoDetallePedido(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoDetallePedido estadodetallepedidoAux:this.estadodetallepedidoLogic.getEstadoDetallePedidos()) {
						estadodetallepedidoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoDetallePedido estadodetallepedidoAux:estadodetallepedidos) {
						estadodetallepedidoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoDetallePedido estadodetallepedidoAux:this.estadodetallepedidoLogic.getEstadoDetallePedidos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoDetallePedido estadodetallepedidoAux:estadodetallepedidos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoDetallePedido(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoDetallePedido.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoDetallePedido.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetallePedido,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoDetallePedidoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoDetallePedido(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoDetallePedido.getSelectedRows();
			
			EstadoDetallePedido estadodetallepedidoLocal=new EstadoDetallePedido();
			
			//this.seleccionarTodosEstadoDetallePedido(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadodetallepedidoLocal =(EstadoDetallePedido) this.estadodetallepedidoLogic.getEstadoDetallePedidos().toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadodetallepedidoLocal =(EstadoDetallePedido) this.estadodetallepedidos.toArray()[this.jTableDatosEstadoDetallePedido.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadodetallepedidoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoDetallePedido estadodetallepedidoAux:this.estadodetallepedidoLogic.getEstadoDetallePedidos()) {
						estadodetallepedidoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoDetallePedido estadodetallepedidoAux:estadodetallepedidos) {
						estadodetallepedidoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoDetallePedido(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoDetallePedido.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoDetallePedido.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetallePedido,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoDetallePedidoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoDetallePedidoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoDetallePedidoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoDetallePedido(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoDetallePedido.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoDetallePedido estadodetallepedidoAux:this.estadodetallepedidoLogic.getEstadoDetallePedidos()) {
				
						if(sTipoSeleccionar.equals(EstadoDetallePedidoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadodetallepedidoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoDetallePedidoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadodetallepedidoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetallePedido estadodetallepedidoAux:estadodetallepedidos) {
					
						if(sTipoSeleccionar.equals(EstadoDetallePedidoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadodetallepedidoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoDetallePedidoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadodetallepedidoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoDetallePedido(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoDetallePedidoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoDetallePedido(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoDetallePedido=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoDetallePedido.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoDetallePedido.jComboBoxTiposAccionesFormularioEstadoDetallePedido.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoDetallePedido) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoDetallePedido(conSplash);
				
					this.generarReporteEstadoDetallePedidosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetallePedido.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetallePedido.jComboBoxTiposAccionesFormularioEstadoDetallePedido.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoDetallePedidosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoDetallePedido.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoDetallePedidosSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoDetallePedido.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoDetallePedidosSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoDetallePedido.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoDetallePedido();
				
				this.exportarEstadoDetallePedidosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetallePedido.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetallePedido.jComboBoxTiposAccionesFormularioEstadoDetallePedido.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoDetallePedidos();
				//this.importarEstadoDetallePedidos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetallePedido.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetallePedido.jComboBoxTiposAccionesFormularioEstadoDetallePedido.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoDetallePedido();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoDetallePedidosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoDetallePedido.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Detalle Pedido", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoDetallePedido();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoDetallePedido)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoDetallePedido(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Detalle Pedido",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetallePedido.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetallePedido.jComboBoxTiposAccionesFormularioEstadoDetallePedido.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoDetallePedido();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoDetallePedido(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoDetallePedidoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoDetallePedido();
			
			if(this.jInternalFrameDetalleFormEstadoDetallePedido==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoDetallePedido> estadodetallepedidosSeleccionados=new ArrayList<EstadoDetallePedido>();		
			EstadoDetallePedido estadodetallepedido=new EstadoDetallePedido();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoDetallePedido(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoDetallePedido.getSelectedItem();
			
			
			
			
			estadodetallepedidosSeleccionados=this.getEstadoDetallePedidosSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadodetallepedidosSeleccionados.size()==1) {
				for(EstadoDetallePedido estadodetallepedidoAux:estadodetallepedidosSeleccionados) {
					estadodetallepedido=estadodetallepedidoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Consignacion")) {
					jButtonDetalleConsignacionActionPerformed(null,rowIndex,true,false,estadodetallepedido);
				}
				else if(this.sTipoRelacion.equals("Detalle Pedido Exportacion")) {
					jButtonDetallePedidoExporActionPerformed(null,rowIndex,true,false,estadodetallepedido);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoDetallePedido();
			
      		//this.finishProcessEstadoDetallePedido(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoDetallePedidoReturnGeneral() throws Exception {
		if(this.estadodetallepedidoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadodetallepedidoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadodetallepedidoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadodetallepedidoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadodetallepedidoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadodetallepedidoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoDetallePedido(false);
		}
		
		if(this.estadodetallepedidoReturnGeneral.getConRetornoLista() || this.estadodetallepedidoReturnGeneral.getConRetornoObjeto()) {
			if(this.estadodetallepedidoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadodetallepedidoLogic.setEstadoDetallePedidos(this.estadodetallepedidoReturnGeneral.getEstadoDetallePedidos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadodetallepedidoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadodetallepedidoLogic.setEstadoDetallePedido(this.estadodetallepedidoReturnGeneral.getEstadoDetallePedido());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoDetallePedido(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoDetallePedido() throws Exception {
		
		
	}
	
	public ArrayList<EstadoDetallePedido> getEstadoDetallePedidosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoDetallePedido> estadodetallepedidosSeleccionados=new ArrayList<EstadoDetallePedido>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoDetallePedido) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoDetallePedido estadodetallepedidoAux:estadodetallepedidoLogic.getEstadoDetallePedidos()) {
					if(estadodetallepedidoAux.getIsSelected()) {
						estadodetallepedidosSeleccionados.add(estadodetallepedidoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetallePedido estadodetallepedidoAux:this.estadodetallepedidos) {
					if(estadodetallepedidoAux.getIsSelected()) {
						estadodetallepedidosSeleccionados.add(estadodetallepedidoAux);				
					}
				}
			}
			
			if(estadodetallepedidosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadodetallepedidosSeleccionados.addAll(this.estadodetallepedidoLogic.getEstadoDetallePedidos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadodetallepedidosSeleccionados.addAll(this.estadodetallepedidos);				
					}
				}
			}
		} else {
			estadodetallepedidosSeleccionados.add(this.estadodetallepedido);
		}
		
		return estadodetallepedidosSeleccionados;
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
	
	public void generarReporteEstadoDetallePedidosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoDetallePedidosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoDetallePedidosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoDetallePedidosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoDetallePedidosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoDetallePedidosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Detalle Pedido",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoDetallePedidosSeleccionados() throws Exception {
		ArrayList<EstadoDetallePedido> estadodetallepedidosSeleccionados=new ArrayList<EstadoDetallePedido>();		
		
		estadodetallepedidosSeleccionados=this.getEstadoDetallePedidosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoDetallePedidos("Todos",estadodetallepedidosSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoDetallePedidosSeleccionados() throws Exception {
		ArrayList<EstadoDetallePedido> estadodetallepedidosSeleccionados=new ArrayList<EstadoDetallePedido>();		
		
		estadodetallepedidosSeleccionados=this.getEstadoDetallePedidosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoDetallePedidos("Todos",estadodetallepedidosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoDetallePedidosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoDetallePedido> estadodetallepedidosSeleccionados=new ArrayList<EstadoDetallePedido>();
		
		estadodetallepedidosSeleccionados=this.getEstadoDetallePedidosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoDetallePedidos("Todos",estadodetallepedidosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoDetallePedidosSeleccionados() throws Exception {
		ArrayList<EstadoDetallePedido> estadodetallepedidosSeleccionados=new ArrayList<EstadoDetallePedido>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoDetallePedido();
		
		
		estadodetallepedidosSeleccionados=this.getEstadoDetallePedidosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoDetallePedido();
		
		
		//this.generarReporteEstadoDetallePedidos("Todos",estadodetallepedidosSeleccionados ,estadodetallepedidoImplementable,estadodetallepedidoImplementableHome);
	}
	
	public void mostrarImportacionEstadoDetallePedidos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoDetallePedido();
		
		this.abrirFrameImportacionEstadoDetallePedido();		
		
			
		//this.generarReporteEstadoDetallePedidos("Todos",estadodetallepedidosSeleccionados ,estadodetallepedidoImplementable,estadodetallepedidoImplementableHome);
	}
	
	public void importarEstadoDetallePedidos() throws Exception {		
	
	}
	
	public void exportarEstadoDetallePedidosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoDetallePedidosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoDetallePedidosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoDetallePedidosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Detalle Pedido",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoDetallePedidosSeleccionados() throws Exception {
		ArrayList<EstadoDetallePedido> estadodetallepedidosSeleccionados=new ArrayList<EstadoDetallePedido>();		
		
		estadodetallepedidosSeleccionados=this.getEstadoDetallePedidosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetallepedido."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoDetallePedido(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoDetallePedido estadodetallepedidoAux:estadodetallepedidosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoDetallePedido(estadodetallepedidoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadodetallepedidoAux.setsDetalleGeneralEntityReporte(estadodetallepedidoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Pedido",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoDetallePedido(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoDetallePedidoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoDetallePedidoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoDetallePedidoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoDetallePedidoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoDetallePedido(EstadoDetallePedido estadodetallepedido,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadodetallepedido.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadodetallepedido.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadodetallepedido.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadodetallepedido.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoDetallePedidosSeleccionados() throws Exception {
		ArrayList<EstadoDetallePedido> estadodetallepedidosSeleccionados=new ArrayList<EstadoDetallePedido>();		
		
		estadodetallepedidosSeleccionados=this.getEstadoDetallePedidosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetallepedido.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoDetallePedidos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoDetallePedido(row);				
				iRow++;
			}				
			
			for(EstadoDetallePedido estadodetallepedidoAux:estadodetallepedidosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoDetallePedido(estadodetallepedidoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Pedido",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoDetallePedidosSeleccionados() throws Exception {
		ArrayList<EstadoDetallePedido> estadodetallepedidosSeleccionados=new ArrayList<EstadoDetallePedido>();		
		
		estadodetallepedidosSeleccionados=this.getEstadoDetallePedidosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetallepedido.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadodetallepedidos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadodetallepedido");
			//elementRoot.appendChild(element);
		
			for(EstadoDetallePedido estadodetallepedidoAux:estadodetallepedidosSeleccionados) {
				element = document.createElement("estadodetallepedido");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoDetallePedido(estadodetallepedidoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Pedido",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoDetallePedido(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetallePedidoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetallePedidoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetallePedidoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetallePedidoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoDetallePedido(EstadoDetallePedido estadodetallepedido,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadodetallepedido.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadodetallepedido.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadodetallepedido.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoDetallePedido(EstadoDetallePedido estadodetallepedido,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoDetallePedidoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadodetallepedido.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoDetallePedidoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadodetallepedido.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoDetallePedidoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadodetallepedido.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoDetallePedidoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadodetallepedido.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoDetallePedidosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoDetallePedido> estadodetallepedidosSeleccionados=new ArrayList<EstadoDetallePedido>();
		
		estadodetallepedidosSeleccionados=this.getEstadoDetallePedidosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoDetallePedido(estadodetallepedidosSeleccionados);
		
		this.generarReporteEstadoDetallePedidos("Todos",estadodetallepedidosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoDetallePedido(ArrayList<EstadoDetallePedido> estadodetallepedidosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoDetallePedido estadodetallepedidoAux:estadodetallepedidosSeleccionados) {
				estadodetallepedidoAux.setsDetalleGeneralEntityReporte(estadodetallepedidoAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoDetallePedidoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadodetallepedidoAux.setsDescripcionGeneralEntityReporte1(estadodetallepedidoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoDetallePedidoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadodetallepedidoAux.setsDescripcionGeneralEntityReporte1(estadodetallepedidoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetallePedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoDetallePedido(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoDetallePedido=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoDetallePedido=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoDetallePedido=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoDetallePedido=false;
			this.isVisibilidadCeldaActualizarEstadoDetallePedido=false;
			this.isVisibilidadCeldaEliminarEstadoDetallePedido=false;
			this.isVisibilidadCeldaCancelarEstadoDetallePedido=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetallePedido=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetallePedido=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoDetallePedido=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetallePedido=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetallePedido=false;
			this.isVisibilidadCeldaModificarEstadoDetallePedido=false;
			this.isVisibilidadCeldaActualizarEstadoDetallePedido=true;
			this.isVisibilidadCeldaEliminarEstadoDetallePedido=false;
			this.isVisibilidadCeldaCancelarEstadoDetallePedido=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetallePedido=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetallePedido=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoDetallePedido=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetallePedido=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetallePedido=false;
			this.isVisibilidadCeldaModificarEstadoDetallePedido=false;
			this.isVisibilidadCeldaActualizarEstadoDetallePedido=true;
			this.isVisibilidadCeldaEliminarEstadoDetallePedido=true;
			this.isVisibilidadCeldaCancelarEstadoDetallePedido=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetallePedido=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetallePedido=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoDetallePedido=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetallePedido=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetallePedido=false;
			this.isVisibilidadCeldaModificarEstadoDetallePedido=false;
			this.isVisibilidadCeldaActualizarEstadoDetallePedido=true;
			this.isVisibilidadCeldaEliminarEstadoDetallePedido=false;
			this.isVisibilidadCeldaCancelarEstadoDetallePedido=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetallePedido=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetallePedido=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoDetallePedido=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetallePedido=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetallePedido=true;
			this.isVisibilidadCeldaModificarEstadoDetallePedido=false;
			this.isVisibilidadCeldaActualizarEstadoDetallePedido=false;
			this.isVisibilidadCeldaEliminarEstadoDetallePedido=false;
			this.isVisibilidadCeldaCancelarEstadoDetallePedido=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetallePedido=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetallePedido=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoDetallePedido=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetallePedido=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetallePedido=false;
			this.isVisibilidadCeldaActualizarEstadoDetallePedido=false;
			this.isVisibilidadCeldaEliminarEstadoDetallePedido=false;
			this.isVisibilidadCeldaCancelarEstadoDetallePedido=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetallePedido=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetallePedido=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoDetallePedido=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetallePedido=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetallePedido=false;
			this.isVisibilidadCeldaModificarEstadoDetallePedido=true;
			this.isVisibilidadCeldaActualizarEstadoDetallePedido=false;
			this.isVisibilidadCeldaEliminarEstadoDetallePedido=false;
			this.isVisibilidadCeldaCancelarEstadoDetallePedido=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetallePedido=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetallePedido=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoDetallePedidoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoDetallePedido=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetallePedido=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetallePedido=true;
		} else {
			this.actualizarEstadoPanelsEstadoDetallePedido(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoDetallePedido=false;
			//this.isVisibilidadCeldaVerFormEstadoDetallePedido=false;
			this.isVisibilidadCeldaDuplicarEstadoDetallePedido=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadodetallepedidoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetallePedido=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoDetallePedido=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetallePedido=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {
			if(!estadodetallepedidoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoDetallePedido=false;												
			}
			
			this.jButtonCerrarEstadoDetallePedido.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetallePedido=false;
		}
		
		if(!this.permiteMantenimiento(this.estadodetallepedido)) {
			this.isVisibilidadCeldaActualizarEstadoDetallePedido=false;
			this.isVisibilidadCeldaEliminarEstadoDetallePedido=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoDetallePedido() {
		this.isVisibilidadCeldaNuevoEstadoDetallePedido=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoDetallePedido=false;
	}
	
	public void actualizarEstadoPanelsEstadoDetallePedido(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoDetallePedido!=null) {
				this.jScrollPanelDatosEdicionEstadoDetallePedido.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoDetallePedido!=null) {
				this.jScrollPanelDatosEstadoDetallePedido.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetallePedido!=null) {
				this.jPanelPaginacionEstadoDetallePedido.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetallePedido!=null) {
				this.jPanelParametrosReportesEstadoDetallePedido.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoDetallePedido!=null) {
				this.jScrollPanelDatosEdicionEstadoDetallePedido.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoDetallePedido!=null) {
				this.jScrollPanelDatosEstadoDetallePedido.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoDetallePedido!=null) {
				this.jPanelPaginacionEstadoDetallePedido.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoDetallePedido!=null) {
				this.jPanelParametrosReportesEstadoDetallePedido.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoDetallePedido!=null) {
				this.jScrollPanelDatosEdicionEstadoDetallePedido.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoDetallePedido!=null) {
				this.jScrollPanelDatosEstadoDetallePedido.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoDetallePedido!=null) {
				this.jPanelPaginacionEstadoDetallePedido.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoDetallePedido!=null) {
				this.jPanelParametrosReportesEstadoDetallePedido.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoDetallePedido!=null) {
				this.jScrollPanelDatosEdicionEstadoDetallePedido.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoDetallePedido!=null) {
				this.jScrollPanelDatosEstadoDetallePedido.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoDetallePedido!=null) {
				this.jPanelPaginacionEstadoDetallePedido.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoDetallePedido!=null) {
				this.jPanelParametrosReportesEstadoDetallePedido.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoDetallePedido!=null) {
				this.jScrollPanelDatosEdicionEstadoDetallePedido.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoDetallePedido!=null) {
				this.jScrollPanelDatosEstadoDetallePedido.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetallePedido!=null) {
				this.jPanelPaginacionEstadoDetallePedido.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetallePedido!=null) {
				this.jPanelParametrosReportesEstadoDetallePedido.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoDetallePedido!=null) {
				this.jScrollPanelDatosEdicionEstadoDetallePedido.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoDetallePedido!=null) {
				this.jScrollPanelDatosEstadoDetallePedido.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetallePedido!=null) {
				this.jPanelPaginacionEstadoDetallePedido.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetallePedido!=null) {
				this.jPanelParametrosReportesEstadoDetallePedido.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoDetallePedido!=null) {
				this.jScrollPanelDatosEdicionEstadoDetallePedido.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoDetallePedido!=null) {
				this.jScrollPanelDatosEstadoDetallePedido.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetallePedido!=null) {
				this.jPanelPaginacionEstadoDetallePedido.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetallePedido!=null) {
				this.jPanelParametrosReportesEstadoDetallePedido.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadodetallepedidoSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoDetallePedidoParaDetalleConsignacions() throws Exception {
		Boolean isPaginaPopupDetalleConsignacion=false;

		try {

			if(this.estadodetallepedidoSessionBean==null) {
				this.estadodetallepedidoSessionBean=new EstadoDetallePedidoSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionSessionBean=new DetalleConsignacionSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionSessionBean.setsPathNavegacionActual(estadodetallepedidoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleConsignacionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleConsignacion=this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleConsignacion(true);
			this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleConsignacion(EstadoDetallePedidoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionSessionBean.setisBusquedaDesdeForeignKeySesionEstadoDetallePedido(true);
			this.jInternalFrameDetalleFormEstadoDetallePedido.detalleconsignacionSessionBean.setlidEstadoDetallePedidoActual(this.idEstadoDetallePedidoActual);

			estadodetallepedidoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoDetallePedido(true);
			estadodetallepedidoSessionBean.setlIdEstadoDetallePedidoActualForeignKey(this.idEstadoDetallePedidoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionEstadoDetallePedidoExporParaDetallePedidoExpors() throws Exception {
		Boolean isPaginaPopupDetallePedidoExpor=false;

		try {

			if(this.estadodetallepedidoSessionBean==null) {
				this.estadodetallepedidoSessionBean=new EstadoDetallePedidoSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporSessionBean=new DetallePedidoExporSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporSessionBean.setsPathNavegacionActual(estadodetallepedidoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetallePedidoExporConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetallePedidoExpor=this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetallePedidoExpor(true);
			this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetallePedidoExpor(EstadoDetallePedidoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporSessionBean.setisBusquedaDesdeForeignKeySesionEstadoDetallePedidoExpor(true);
			this.jInternalFrameDetalleFormEstadoDetallePedido.detallepedidoexporSessionBean.setlidEstadoDetallePedidoExporActual(this.idEstadoDetallePedidoActual);

			estadodetallepedidoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoDetallePedido(true);
			estadodetallepedidoSessionBean.setlIdEstadoDetallePedidoActualForeignKey(this.idEstadoDetallePedidoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoDetallePedidoSessionBean estadodetallepedidoSessionBean=new EstadoDetallePedidoSessionBean();
		
		if(this.estadodetallepedidoSessionBean==null) {
			this.estadodetallepedidoSessionBean=new EstadoDetallePedidoSessionBean();
		}
		
		this.estadodetallepedidoSessionBean.setsUltimaBusquedaEstadoDetallePedido(this.getsAccionBusqueda());
		this.estadodetallepedidoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadodetallepedidoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoDetallePedidoSessionBean estadodetallepedidoSessionBean=new EstadoDetallePedidoSessionBean();
		
		if(this.estadodetallepedidoSessionBean==null) {
			this.estadodetallepedidoSessionBean=new EstadoDetallePedidoSessionBean();
		}
		
		if(this.estadodetallepedidoSessionBean.getsUltimaBusquedaEstadoDetallePedido()!=null&&!this.estadodetallepedidoSessionBean.getsUltimaBusquedaEstadoDetallePedido().equals("")) {
			this.setsAccionBusqueda(estadodetallepedidoSessionBean.getsUltimaBusquedaEstadoDetallePedido());
			this.setiNumeroPaginacion(estadodetallepedidoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadodetallepedidoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadodetallepedidoSessionBean.setsUltimaBusquedaEstadoDetallePedido("");
		this.estadodetallepedidoSessionBean.setiNumeroPaginacion(EstadoDetallePedidoConstantesFunciones.INUMEROPAGINACION);
		this.estadodetallepedidoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoDetallePedido(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoDetallePedido() {
		this.updateBorderResaltarBusquedasFormularioEstadoDetallePedido();
		this.updateVisibilidadBusquedasFormularioEstadoDetallePedido();
		this.updateHabilitarBusquedasFormularioEstadoDetallePedido();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoDetallePedido() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoDetallePedido() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoDetallePedido() {
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
	
	public void updateControlesFormularioEstadoDetallePedido() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoDetallePedido==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoDetallePedido();
		this.updateVisibilidadResaltarControlesFormularioEstadoDetallePedido();
		this.updateHabilitarResaltarControlesFormularioEstadoDetallePedido();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoDetallePedido() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoDetallePedido==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadodetallepedidoConstantesFunciones.resaltaridEstadoDetallePedido!=null && this.jInternalFrameDetalleFormEstadoDetallePedido!=null) {this.jInternalFrameDetalleFormEstadoDetallePedido.jTextFieldidEstadoDetallePedido.setBorder(this.estadodetallepedidoConstantesFunciones.resaltaridEstadoDetallePedido);}
		if(this.estadodetallepedidoConstantesFunciones.resaltarcodigoEstadoDetallePedido!=null && this.jInternalFrameDetalleFormEstadoDetallePedido!=null) {this.jInternalFrameDetalleFormEstadoDetallePedido.jTextFieldcodigoEstadoDetallePedido.setBorder(this.estadodetallepedidoConstantesFunciones.resaltarcodigoEstadoDetallePedido);}
		if(this.estadodetallepedidoConstantesFunciones.resaltarnombreEstadoDetallePedido!=null && this.jInternalFrameDetalleFormEstadoDetallePedido!=null) {this.jInternalFrameDetalleFormEstadoDetallePedido.jTextAreanombreEstadoDetallePedido.setBorder(this.estadodetallepedidoConstantesFunciones.resaltarnombreEstadoDetallePedido);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoDetallePedido() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoDetallePedido==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) {
	
		//this.jInternalFrameDetalleFormEstadoDetallePedido.jTextFieldidEstadoDetallePedido.setVisible(this.estadodetallepedidoConstantesFunciones.mostraridEstadoDetallePedido);
		this.jInternalFrameDetalleFormEstadoDetallePedido.jPanelidEstadoDetallePedido.setVisible(this.estadodetallepedidoConstantesFunciones.mostraridEstadoDetallePedido);
		//this.jInternalFrameDetalleFormEstadoDetallePedido.jTextFieldcodigoEstadoDetallePedido.setVisible(this.estadodetallepedidoConstantesFunciones.mostrarcodigoEstadoDetallePedido);
		this.jInternalFrameDetalleFormEstadoDetallePedido.jPanelcodigoEstadoDetallePedido.setVisible(this.estadodetallepedidoConstantesFunciones.mostrarcodigoEstadoDetallePedido);
		//this.jInternalFrameDetalleFormEstadoDetallePedido.jTextAreanombreEstadoDetallePedido.setVisible(this.estadodetallepedidoConstantesFunciones.mostrarnombreEstadoDetallePedido);
		this.jInternalFrameDetalleFormEstadoDetallePedido.jPanelnombreEstadoDetallePedido.setVisible(this.estadodetallepedidoConstantesFunciones.mostrarnombreEstadoDetallePedido);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoDetallePedido() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoDetallePedido==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoDetallePedido!=null) {
	
		this.jInternalFrameDetalleFormEstadoDetallePedido.jTextFieldidEstadoDetallePedido.setEnabled(this.estadodetallepedidoConstantesFunciones.activaridEstadoDetallePedido);
		this.jInternalFrameDetalleFormEstadoDetallePedido.jTextFieldcodigoEstadoDetallePedido.setEnabled(this.estadodetallepedidoConstantesFunciones.activarcodigoEstadoDetallePedido);
		this.jInternalFrameDetalleFormEstadoDetallePedido.jTextAreanombreEstadoDetallePedido.setEnabled(this.estadodetallepedidoConstantesFunciones.activarnombreEstadoDetallePedido);
		}
	}
	
		
}