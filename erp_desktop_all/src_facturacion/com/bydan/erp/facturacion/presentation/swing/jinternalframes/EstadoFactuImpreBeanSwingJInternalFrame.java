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

import com.bydan.erp.facturacion.util.EstadoFactuImpreConstantesFunciones;
import com.bydan.erp.facturacion.util.EstadoFactuImpreParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.EstadoFactuImpreParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.EstadoFactuImpreBean;
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


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
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




@SuppressWarnings("unused")
public class EstadoFactuImpreBeanSwingJInternalFrame extends EstadoFactuImpreJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoFactuImpreBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoFactuImpre> estadofactuimpreValidator = new ClassValidator<EstadoFactuImpre>(EstadoFactuImpre.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoFactuImpre estadofactuimpre;	
	public EstadoFactuImpre estadofactuimpreAux;
	public EstadoFactuImpre estadofactuimpreAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoFactuImpre estadofactuimpreTotales;
	public Long idEstadoFactuImpreActual;
	public Long iIdNuevoEstadoFactuImpre=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosFacturaImpresion=false;

	public Boolean getIsTienePermisosFacturaImpresion() {
		return isTienePermisosFacturaImpresion;
	}

	public void setIsTienePermisosFacturaImpresion(Boolean isTienePermisosFacturaImpresion) {
		this.isTienePermisosFacturaImpresion= isTienePermisosFacturaImpresion;
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
	
	public Boolean isPermisoTodoEstadoFactuImpre;
	public Boolean isPermisoNuevoEstadoFactuImpre;
	public Boolean isPermisoActualizarEstadoFactuImpre;
	public Boolean isPermisoActualizarOriginalEstadoFactuImpre;
	public Boolean isPermisoEliminarEstadoFactuImpre;
	public Boolean isPermisoGuardarCambiosEstadoFactuImpre;
	public Boolean isPermisoConsultaEstadoFactuImpre;
	public Boolean isPermisoBusquedaEstadoFactuImpre;
	public Boolean isPermisoReporteEstadoFactuImpre;
	public Boolean isPermisoPaginacionMedioEstadoFactuImpre;
	public Boolean isPermisoPaginacionAltoEstadoFactuImpre;
	public Boolean isPermisoPaginacionTodoEstadoFactuImpre;
	public Boolean isPermisoCopiarEstadoFactuImpre;
	public Boolean isPermisoVerFormEstadoFactuImpre;
	public Boolean isPermisoDuplicarEstadoFactuImpre;
	public Boolean isPermisoOrdenEstadoFactuImpre;
	
	
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
	
	public EstadoFactuImpreParameterReturnGeneral estadofactuimpreReturnGeneral;
	public EstadoFactuImpreParameterReturnGeneral estadofactuimpreParameterGeneral;
	
	

	public FacturaImpresionLogic facturaimpresionLogic=null;

	public FacturaImpresionLogic getFacturaImpresionLogic() {
		return facturaimpresionLogic;
	}

	public void setFacturaImpresionLogic(FacturaImpresionLogic facturaimpresionLogic) {
		this.facturaimpresionLogic = facturaimpresionLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoFactuImpre=false;
	public Boolean esParaAccionDesdeFormularioEstadoFactuImpre=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadoFactuImpreSessionBeanAdditional estadofactuimpreSessionBeanAdditional=null;
	
	public EstadoFactuImpreSessionBeanAdditional getEstadoFactuImpreSessionBeanAdditional() {
		return this.estadofactuimpreSessionBeanAdditional;
	}
	
	public void setEstadoFactuImpreSessionBeanAdditional(EstadoFactuImpreSessionBeanAdditional estadofactuimpreSessionBeanAdditional) {
		try {
			this.estadofactuimpreSessionBeanAdditional=estadofactuimpreSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadoFactuImpreBeanSwingJInternalFrameAdditional estadofactuimpreBeanSwingJInternalFrameAdditional=null;
	//public class EstadoFactuImpreBeanSwingJInternalFrame
	
	public EstadoFactuImpreBeanSwingJInternalFrameAdditional getEstadoFactuImpreBeanSwingJInternalFrameAdditional() {
		return this.estadofactuimpreBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadoFactuImpreBeanSwingJInternalFrameAdditional(EstadoFactuImpreBeanSwingJInternalFrameAdditional estadofactuimpreBeanSwingJInternalFrameAdditional) {
		try {
			this.estadofactuimpreBeanSwingJInternalFrameAdditional=estadofactuimpreBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoFactuImpreLogic estadofactuimpreLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoFactuImpre estadofactuimpreBean;
	public EstadoFactuImpreConstantesFunciones estadofactuimpreConstantesFunciones;
	//public EstadoFactuImpreParameterReturnGeneral estadofactuimpreReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoFactuImpre> estadofactuimpres;	
	//public List<EstadoFactuImpre> estadofactuimpresEliminados;
	//public List<EstadoFactuImpre> estadofactuimpresAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoFactuImpre=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoFactuImpre=true;
	public Boolean isVisibilidadCeldaCopiarEstadoFactuImpre=true;
	public Boolean isVisibilidadCeldaVerFormEstadoFactuImpre=true;
	public Boolean isVisibilidadCeldaOrdenEstadoFactuImpre=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoFactuImpre=false;
	public Boolean isVisibilidadCeldaModificarEstadoFactuImpre=false;
	public Boolean isVisibilidadCeldaActualizarEstadoFactuImpre=false;
	public Boolean isVisibilidadCeldaEliminarEstadoFactuImpre=false;
	public Boolean isVisibilidadCeldaCancelarEstadoFactuImpre=false;
	public Boolean isVisibilidadCeldaGuardarEstadoFactuImpre=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoFactuImpre=false;	
	
	
	
	public Long getiIdNuevoEstadoFactuImpre() {
		return this.iIdNuevoEstadoFactuImpre;
	}

	public void setiIdNuevoEstadoFactuImpre(Long iIdNuevoEstadoFactuImpre) {
		this.iIdNuevoEstadoFactuImpre = iIdNuevoEstadoFactuImpre;
	}
	
	public Long getidEstadoFactuImpreActual() {
		return this.idEstadoFactuImpreActual;
	}

	public void setidEstadoFactuImpreActual(Long idEstadoFactuImpreActual) {
		this.idEstadoFactuImpreActual = idEstadoFactuImpreActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoFactuImpre getestadofactuimpre() {
		return this.estadofactuimpre;
	}

	public void setestadofactuimpre(EstadoFactuImpre estadofactuimpre) {
		this.estadofactuimpre = estadofactuimpre;
	}
	
	public EstadoFactuImpre getestadofactuimpreAux() {
		return this.estadofactuimpreAux;
	}

	public void setestadofactuimpreAux(EstadoFactuImpre estadofactuimpreAux) {
		this.estadofactuimpreAux = estadofactuimpreAux;
	}				
	
	public EstadoFactuImpre getestadofactuimpreAnterior() {
		return this.estadofactuimpreAnterior;
	}

	public void setestadofactuimpreAnterior(EstadoFactuImpre estadofactuimpreAnterior) {
		this.estadofactuimpreAnterior = estadofactuimpreAnterior;
	}	
	
	public EstadoFactuImpre getestadofactuimpreTotales() {
		return this.estadofactuimpreTotales;
	}

	public void setestadofactuimpreTotales(EstadoFactuImpre estadofactuimpreTotales) {
		this.estadofactuimpreTotales = estadofactuimpreTotales;
	}	
	
	public EstadoFactuImpre getestadofactuimpreBean() {
		return this.estadofactuimpreBean;
	}

	public void setestadofactuimpreBean(EstadoFactuImpre estadofactuimpreBean) {
		this.estadofactuimpreBean = estadofactuimpreBean;
	}	
	
	public EstadoFactuImpreParameterReturnGeneral getestadofactuimpreReturnGeneral() {
		return this.estadofactuimpreReturnGeneral;
	}

	public void setestadofactuimpreReturnGeneral(EstadoFactuImpreParameterReturnGeneral estadofactuimpreReturnGeneral) {
		this.estadofactuimpreReturnGeneral = estadofactuimpreReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoFactuImpreLogic getEstadoFactuImpreLogic()	{		
		return estadofactuimpreLogic;
	}

	public void setEstadoFactuImpreLogic(EstadoFactuImpreLogic estadofactuimpreLogic) {
		this.estadofactuimpreLogic = estadofactuimpreLogic;
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
	
	public Boolean getIsEsNuevoEstadoFactuImpre() {
		return isEsNuevoEstadoFactuImpre;
	}

	public void setIsEsNuevoEstadoFactuImpre(Boolean isEsNuevoEstadoFactuImpre) {
		this.isEsNuevoEstadoFactuImpre = isEsNuevoEstadoFactuImpre;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoFactuImpre() {
		return esParaAccionDesdeFormularioEstadoFactuImpre;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoFactuImpre(Boolean esParaAccionDesdeFormularioEstadoFactuImpre) {
		this.esParaAccionDesdeFormularioEstadoFactuImpre = esParaAccionDesdeFormularioEstadoFactuImpre;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoFactuImpre() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoFactuImpreConstantesFunciones.refrescarForeignKeysDescripcionesEstadoFactuImpre(this.estadofactuimpreLogic.getEstadoFactuImpres());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoFactuImpreConstantesFunciones.refrescarForeignKeysDescripcionesEstadoFactuImpre(this.estadofactuimpres);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadofactuimpreLogic.setEstadoFactuImpres(this.estadofactuimpres);
			estadofactuimpreLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoFactuImpreParameterReturnGeneral getEstadoFactuImpreParameterGeneral() {
		return this.estadofactuimpreParameterGeneral;
	}
	
	public void setEstadoFactuImpreParameterGeneral(EstadoFactuImpreParameterReturnGeneral estadofactuimpreParameterGeneral) {
		this.estadofactuimpreParameterGeneral = estadofactuimpreParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoFactuImpre() {
		return isPermisoTodoEstadoFactuImpre;
	}

	public void setIsPermisoTodoEstadoFactuImpre(Boolean isPermisoTodoEstadoFactuImpre) {
		this.isPermisoTodoEstadoFactuImpre = isPermisoTodoEstadoFactuImpre;
	}

	public Boolean getIsPermisoNuevoEstadoFactuImpre() {
		return isPermisoNuevoEstadoFactuImpre;
	}

	public void setIsPermisoNuevoEstadoFactuImpre(Boolean isPermisoNuevoEstadoFactuImpre) {
		this.isPermisoNuevoEstadoFactuImpre = isPermisoNuevoEstadoFactuImpre;
	}

	public Boolean getIsPermisoActualizarEstadoFactuImpre() {
		return isPermisoActualizarEstadoFactuImpre;
	}

	public void setIsPermisoActualizarEstadoFactuImpre(Boolean isPermisoActualizarEstadoFactuImpre) {
		this.isPermisoActualizarEstadoFactuImpre = isPermisoActualizarEstadoFactuImpre;
	}

	public Boolean getIsPermisoEliminarEstadoFactuImpre() {
		return isPermisoEliminarEstadoFactuImpre;
	}

	public void setIsPermisoEliminarEstadoFactuImpre(Boolean isPermisoEliminarEstadoFactuImpre) {
		this.isPermisoEliminarEstadoFactuImpre = isPermisoEliminarEstadoFactuImpre;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoFactuImpre() {
		return isPermisoGuardarCambiosEstadoFactuImpre;
	}

	public void setIsPermisoGuardarCambiosEstadoFactuImpre(Boolean isPermisoGuardarCambiosEstadoFactuImpre) {
		this.isPermisoGuardarCambiosEstadoFactuImpre = isPermisoGuardarCambiosEstadoFactuImpre;
	}
	
	public Boolean getIsPermisoConsultaEstadoFactuImpre() {
		return isPermisoConsultaEstadoFactuImpre;
	}

	public void setIsPermisoConsultaEstadoFactuImpre(Boolean isPermisoConsultaEstadoFactuImpre) {
		this.isPermisoConsultaEstadoFactuImpre = isPermisoConsultaEstadoFactuImpre;
	}

	public Boolean getIsPermisoBusquedaEstadoFactuImpre() {
		return isPermisoBusquedaEstadoFactuImpre;
	}

	public void setIsPermisoBusquedaEstadoFactuImpre(Boolean isPermisoBusquedaEstadoFactuImpre) {
		this.isPermisoBusquedaEstadoFactuImpre = isPermisoBusquedaEstadoFactuImpre;
	}

	public Boolean getIsPermisoReporteEstadoFactuImpre() {
		return isPermisoReporteEstadoFactuImpre;
	}

	public void setIsPermisoReporteEstadoFactuImpre(Boolean isPermisoReporteEstadoFactuImpre) {
		this.isPermisoReporteEstadoFactuImpre = isPermisoReporteEstadoFactuImpre;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoFactuImpre() {
		return isPermisoPaginacionMedioEstadoFactuImpre;
	}

	public void setIsPermisoPaginacionMedioEstadoFactuImpre(Boolean isPermisoPaginacionMedioEstadoFactuImpre) {
		this.isPermisoPaginacionMedioEstadoFactuImpre = isPermisoPaginacionMedioEstadoFactuImpre;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoFactuImpre() {
		return isPermisoPaginacionTodoEstadoFactuImpre;
	}

	public void setIsPermisoPaginacionTodoEstadoFactuImpre(Boolean isPermisoPaginacionTodoEstadoFactuImpre) {
		this.isPermisoPaginacionTodoEstadoFactuImpre = isPermisoPaginacionTodoEstadoFactuImpre;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoFactuImpre() {
		return isPermisoPaginacionAltoEstadoFactuImpre;
	}

	public void setIsPermisoPaginacionAltoEstadoFactuImpre(Boolean isPermisoPaginacionAltoEstadoFactuImpre) {
		this.isPermisoPaginacionAltoEstadoFactuImpre = isPermisoPaginacionAltoEstadoFactuImpre;
	}
	
	public Boolean getIsPermisoCopiarEstadoFactuImpre() {
		return isPermisoCopiarEstadoFactuImpre;
	}

	public void setIsPermisoCopiarEstadoFactuImpre(Boolean isPermisoCopiarEstadoFactuImpre) {
		this.isPermisoCopiarEstadoFactuImpre = isPermisoCopiarEstadoFactuImpre;
	}
	
	public Boolean getIsPermisoVerFormEstadoFactuImpre() {
		return isPermisoVerFormEstadoFactuImpre;
	}

	public void setIsPermisoVerFormEstadoFactuImpre(Boolean isPermisoVerFormEstadoFactuImpre) {
		this.isPermisoVerFormEstadoFactuImpre = isPermisoVerFormEstadoFactuImpre;
	}
	
	public Boolean getIsPermisoDuplicarEstadoFactuImpre() {
		return isPermisoDuplicarEstadoFactuImpre;
	}

	public void setIsPermisoDuplicarEstadoFactuImpre(Boolean isPermisoDuplicarEstadoFactuImpre) {
		this.isPermisoDuplicarEstadoFactuImpre = isPermisoDuplicarEstadoFactuImpre;
	}
	
	public Boolean getIsPermisoOrdenEstadoFactuImpre() {
		return isPermisoOrdenEstadoFactuImpre;
	}

	public void setIsPermisoOrdenEstadoFactuImpre(Boolean isPermisoOrdenEstadoFactuImpre) {
		this.isPermisoOrdenEstadoFactuImpre = isPermisoOrdenEstadoFactuImpre;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoFactuImpre() {
		return isVisibilidadCeldaNuevoEstadoFactuImpre;
	}

	public void setIsVisibilidadCeldaNuevoEstadoFactuImpre(Boolean isVisibilidadCeldaNuevoEstadoFactuImpre) {
		this.isVisibilidadCeldaNuevoEstadoFactuImpre = isVisibilidadCeldaNuevoEstadoFactuImpre;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoFactuImpre() {
		return isVisibilidadCeldaDuplicarEstadoFactuImpre;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoFactuImpre(Boolean isVisibilidadCeldaDuplicarEstadoFactuImpre) {
		this.isVisibilidadCeldaDuplicarEstadoFactuImpre = isVisibilidadCeldaDuplicarEstadoFactuImpre;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoFactuImpre() {
		return isVisibilidadCeldaCopiarEstadoFactuImpre;
	}

	public void setIsVisibilidadCeldaCopiarEstadoFactuImpre(Boolean isVisibilidadCeldaCopiarEstadoFactuImpre) {
		this.isVisibilidadCeldaCopiarEstadoFactuImpre = isVisibilidadCeldaCopiarEstadoFactuImpre;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoFactuImpre() {
		return isVisibilidadCeldaVerFormEstadoFactuImpre;
	}

	public void setIsVisibilidadCeldaVerFormEstadoFactuImpre(Boolean isVisibilidadCeldaVerFormEstadoFactuImpre) {
		this.isVisibilidadCeldaVerFormEstadoFactuImpre = isVisibilidadCeldaVerFormEstadoFactuImpre;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoFactuImpre() {
		return isVisibilidadCeldaOrdenEstadoFactuImpre;
	}

	public void setIsVisibilidadCeldaOrdenEstadoFactuImpre(Boolean isVisibilidadCeldaOrdenEstadoFactuImpre) {
		this.isVisibilidadCeldaOrdenEstadoFactuImpre = isVisibilidadCeldaOrdenEstadoFactuImpre;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoFactuImpre() {
		return isVisibilidadCeldaNuevoRelacionesEstadoFactuImpre;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoFactuImpre(Boolean isVisibilidadCeldaNuevoRelacionesEstadoFactuImpre) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoFactuImpre = isVisibilidadCeldaNuevoRelacionesEstadoFactuImpre;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoFactuImpre() {
		return isVisibilidadCeldaModificarEstadoFactuImpre;
	}

	public void setIsVisibilidadCeldaModificarEstadoFactuImpre(Boolean isVisibilidadCeldaModificarEstadoFactuImpre) {
		this.isVisibilidadCeldaModificarEstadoFactuImpre = isVisibilidadCeldaModificarEstadoFactuImpre;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoFactuImpre() {
		return isVisibilidadCeldaActualizarEstadoFactuImpre;
	}

	public void setIsVisibilidadCeldaActualizarEstadoFactuImpre(Boolean isVisibilidadCeldaActualizarEstadoFactuImpre) {
		this.isVisibilidadCeldaActualizarEstadoFactuImpre = isVisibilidadCeldaActualizarEstadoFactuImpre;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoFactuImpre() {
		return isVisibilidadCeldaEliminarEstadoFactuImpre;
	}

	public void setIsVisibilidadCeldaEliminarEstadoFactuImpre(Boolean isVisibilidadCeldaEliminarEstadoFactuImpre) {
		this.isVisibilidadCeldaEliminarEstadoFactuImpre = isVisibilidadCeldaEliminarEstadoFactuImpre;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoFactuImpre() {
		return isVisibilidadCeldaCancelarEstadoFactuImpre;
	}

	public void setIsVisibilidadCeldaCancelarEstadoFactuImpre(Boolean isVisibilidadCeldaCancelarEstadoFactuImpre) {
		this.isVisibilidadCeldaCancelarEstadoFactuImpre = isVisibilidadCeldaCancelarEstadoFactuImpre;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoFactuImpre() {
		return isVisibilidadCeldaGuardarEstadoFactuImpre;
	}

	public void setIsVisibilidadCeldaGuardarEstadoFactuImpre(Boolean isVisibilidadCeldaGuardarEstadoFactuImpre) {
		this.isVisibilidadCeldaGuardarEstadoFactuImpre = isVisibilidadCeldaGuardarEstadoFactuImpre;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoFactuImpre() {
		return isVisibilidadCeldaGuardarCambiosEstadoFactuImpre;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoFactuImpre(Boolean isVisibilidadCeldaGuardarCambiosEstadoFactuImpre) {
		this.isVisibilidadCeldaGuardarCambiosEstadoFactuImpre = isVisibilidadCeldaGuardarCambiosEstadoFactuImpre;
	}
		
	public EstadoFactuImpreSessionBean getestadofactuimpreSessionBean() {
		return this.estadofactuimpreSessionBean;
	}
	
	public void setestadofactuimpreSessionBean(EstadoFactuImpreSessionBean estadofactuimpreSessionBean) {
		this.estadofactuimpreSessionBean=estadofactuimpreSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoFactuImpre(EstadoFactuImpre estadofactuimpre)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoFactuImpre estadofactuimpre,EstadoFactuImpre estadofactuimpreAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoFactuImpre(estadofactuimpre);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadofactuimpreAux.setId(estadofactuimpre.getId());
		estadofactuimpreAux.setVersionRow(estadofactuimpre.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoFactuImpre();
		
			int intSelectedRow = this.jTableDatosEstadoFactuImpre.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofactuimpre =(EstadoFactuImpre) this.estadofactuimpreLogic.getEstadoFactuImpres().toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadofactuimpre =(EstadoFactuImpre) this.estadofactuimpres.toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoFactuImpreJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoFactuImpre(this.estadofactuimpre,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoFactuImpre(this.estadofactuimpre);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadofactuimpreValidator.getInvalidValues(this.estadofactuimpre);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadofactuimpreLogic.setDatosCliente(datosCliente);
			estadofactuimpreLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadofactuimpreAux=new  EstadoFactuImpre();
				
				estadofactuimpreAux.setIsNew(true);
				estadofactuimpreAux.setIsChanged(true);
				
				estadofactuimpreAux.setEstadoFactuImpreOriginal(this.estadofactuimpre);
				
				estadofactuimpreAux.setId(this.estadofactuimpre.getId());	
				estadofactuimpreAux.setVersionRow(this.estadofactuimpre.getVersionRow());	
				estadofactuimpreAux.setcodigo(this.estadofactuimpre.getcodigo());	
				estadofactuimpreAux.setnombre(this.estadofactuimpre.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadofactuimpreSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadofactuimpreSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadofactuimpreAux,estadofactuimpreLogic.getEstadoFactuImpres());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadofactuimpreAux,estadofactuimpres);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadofactuimpreSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadofactuimpreSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadofactuimpreLogic.saveEstadoFactuImpres();//WithConnection
						//estadofactuimpreLogic.getSetVersionRowEstadoFactuImpres();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadofactuimpre,estadofactuimpreAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadofactuimpreSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresionLogic.getFacturaImpresions().addAll(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresions.addAll(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresionsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadofactuimpreLogic.saveEstadoFactuImpreRelaciones(estadofactuimpreAux,this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresionLogic.getFacturaImpresions());//WithConnection
								//estadofactuimpreLogic.getSetVersionRowEstadoFactuImpres();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadofactuimpre,estadofactuimpreAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresionLogic.setFacturaImpresions(new ArrayList<FacturaImpresion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresions= new ArrayList<FacturaImpresion>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.quitarFilaTotales();}
							estadofactuimpreAux.setFacturaImpresions(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresionLogic.getFacturaImpresions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadofactuimpreSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadofactuimpreSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadofactuimpreAux,estadofactuimpreLogic.getEstadoFactuImpres());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadofactuimpreAux,estadofactuimpres);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadofactuimpre,estadofactuimpreAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadofactuimpreAux=new  EstadoFactuImpre();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadofactuimpreSessionBean.getEsGuardarRelacionado() 
					|| (this.estadofactuimpreSessionBean.getEsGuardarRelacionado() && this.estadofactuimpre.getId()>=0)) {
						
					estadofactuimpreAux.setIsNew(false);
				}
				
				estadofactuimpreAux.setIsDeleted(false);
			
				estadofactuimpreAux.setId(this.estadofactuimpre.getId());	
				estadofactuimpreAux.setVersionRow(this.estadofactuimpre.getVersionRow());	
				estadofactuimpreAux.setcodigo(this.estadofactuimpre.getcodigo());	
				estadofactuimpreAux.setnombre(this.estadofactuimpre.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadofactuimpreAux,estadofactuimpreLogic.getEstadoFactuImpres());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadofactuimpreAux,estadofactuimpres);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadofactuimpreSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadofactuimpreSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadofactuimpreLogic.saveEstadoFactuImpres();//WithConnection
						//estadofactuimpreLogic.getSetVersionRowEstadoFactuImpres();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadofactuimpre,estadofactuimpreAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadofactuimpreSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresionLogic.getFacturaImpresions().addAll(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresions.addAll(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresionsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadofactuimpreLogic.saveEstadoFactuImpreRelaciones(estadofactuimpreAux,this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresionLogic.getFacturaImpresions());//WithConnection
								//estadofactuimpreLogic.getSetVersionRowEstadoFactuImpres();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadofactuimpre,estadofactuimpreAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresionLogic.setFacturaImpresions(new ArrayList<FacturaImpresion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresions= new ArrayList<FacturaImpresion>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.quitarFilaTotales();}
							estadofactuimpreAux.setFacturaImpresions(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresionLogic.getFacturaImpresions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadofactuimpreSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadofactuimpreSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadofactuimpreAux,estadofactuimpreLogic.getEstadoFactuImpres());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadofactuimpreAux,estadofactuimpres);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadofactuimpre,estadofactuimpreAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadofactuimpreAux=new  EstadoFactuImpre();
				
				estadofactuimpreAux.setIsNew(false);
				estadofactuimpreAux.setIsChanged(false);
				
				estadofactuimpreAux.setIsDeleted(true);
				
				estadofactuimpreAux.setId(this.estadofactuimpre.getId());	
				estadofactuimpreAux.setVersionRow(this.estadofactuimpre.getVersionRow());	
				estadofactuimpreAux.setcodigo(this.estadofactuimpre.getcodigo());	
				estadofactuimpreAux.setnombre(this.estadofactuimpre.getnombre());	
				
				if(this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadofactuimpreAux.getId()>=0) {	
						this.estadofactuimpresEliminados.add(estadofactuimpreAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadofactuimpreAux,estadofactuimpreLogic.getEstadoFactuImpres());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadofactuimpreAux,estadofactuimpres);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadofactuimpreSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadofactuimpreSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadofactuimpreLogic.saveEstadoFactuImpres();//WithConnection
						//estadofactuimpreLogic.getSetVersionRowEstadoFactuImpres();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadofactuimpreSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresionLogic.getFacturaImpresions().addAll(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresions.addAll(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresionsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadofactuimpreLogic.saveEstadoFactuImpreRelaciones(estadofactuimpreAux,this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresionLogic.getFacturaImpresions());//WithConnection
								//estadofactuimpreLogic.getSetVersionRowEstadoFactuImpres();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresionLogic.setFacturaImpresions(new ArrayList<FacturaImpresion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresions= new ArrayList<FacturaImpresion>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.quitarFilaTotales();}
							estadofactuimpreAux.setFacturaImpresions(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresionLogic.getFacturaImpresions());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadofactuimpreSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadofactuimpreSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadofactuimpreAux,estadofactuimpreLogic.getEstadoFactuImpres());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadofactuimpreAux,estadofactuimpres);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofactuimpreLogic.getEstadoFactuImpres().addAll(this.estadofactuimpresEliminados);
					
					estadofactuimpreLogic.saveEstadoFactuImpres();//WithConnection
					//estadofactuimpreLogic.getSetVersionRowEstadoFactuImpres();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadofactuimpresEliminados= new ArrayList<EstadoFactuImpre>();		
			}
			
			if(this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Factu Impre GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Factu Impre",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadofactuimpre=estadofactuimpreAux;
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
      		//this.finishProcessEstadoFactuImpre();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoFactuImpre estadofactuimpreLocal) throws Exception {
		
		if(this.estadofactuimpreSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadofactuimpreLocal.setFacturaImpresions(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresionLogic.getFacturaImpresions());
			
			} else {
			
				estadofactuimpreLocal.setFacturaImpresions(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresions);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoFactuImpre estadofactuimpreLocal) throws Exception {	
		if(this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoFactuImpreActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoFactuImpre.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadofactuimpre =(EstadoFactuImpre) this.estadofactuimpreLogic.getEstadoFactuImpres().toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadofactuimpre =(EstadoFactuImpre) this.estadofactuimpres.toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadofactuimpreValidator.getInvalidValues(this.estadofactuimpre);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoFactuImpre estadofactuimpre,List<EstadoFactuImpre> estadofactuimpres) throws Exception {
		try	{		
			EstadoFactuImpreConstantesFunciones.actualizarLista(estadofactuimpre,estadofactuimpres,this.estadofactuimpreSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoFactuImpre estadofactuimpre,List<EstadoFactuImpre> estadofactuimpres) throws Exception {
		try	{			
			EstadoFactuImpreConstantesFunciones.actualizarSelectedLista(estadofactuimpre,estadofactuimpres);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoFactuImpre> estadofactuimpresLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadofactuimpresLocal=this.estadofactuimpreLogic.getEstadoFactuImpres();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadofactuimpresLocal=this.estadofactuimpres;
			}
			//ARCHITECTURE
		
			for(EstadoFactuImpre estadofactuimpreLocal:estadofactuimpresLocal) {
				if(this.permiteMantenimiento(estadofactuimpreLocal) && estadofactuimpreLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoFactuImpreConstantesFunciones.getEstadoFactuImpreLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoFactuImpreConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoFactuImpre.jLabelcodigoEstadoFactuImpre,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoFactuImpreConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoFactuImpre.jLabelnombreEstadoFactuImpre,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoFactuImpre.jLabelcodigoEstadoFactuImpre,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoFactuImpre.jLabelnombreEstadoFactuImpre,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("FacturaImpresion")) {
			if(this.estadofactuimpre==null) {
				this.estadofactuimpre= new EstadoFactuImpre();
			}

			if(this.estadofactuimpreSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoFactuImpre
				this.setVariablesFormularioToObjetoActualEstadoFactuImpre(this.estadofactuimpre,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoFactuImpre(this.estadofactuimpre);

				this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.getfacturaimpresion().setEstadoFactuImpre(this.estadofactuimpre);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoFactuImpre--;	
		
		
		this.estadofactuimpreAux=new EstadoFactuImpre();
		
		this.estadofactuimpreAux.setId(this.iIdNuevoEstadoFactuImpre);
		this.estadofactuimpreAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadofactuimpreLogic.getEstadoFactuImpres().add(this.estadofactuimpreAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadofactuimpres.add(this.estadofactuimpreAux);
		}
		//ARCHITECTURE
		
		this.estadofactuimpre=this.estadofactuimpreAux;
		
		if(EstadoFactuImpreJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoFactuImpre(this.estadofactuimpre);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoFactuImpre(this.estadofactuimpre);
		}
				
		//this.setDefaultControlesEstadoFactuImpre();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoFactuImpre();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoFactuImpre();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoFactuImpre();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoFactuImpre(this.estadofactuimpreBean,this.estadofactuimpre,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoFactuImpre(this.estadofactuimpre);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadofactuimpreSessionBean.getConGuardarRelaciones()) {
			classes=EstadoFactuImpreConstantesFunciones.getClassesRelationshipsOfEstadoFactuImpre(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadofactuimpreReturnGeneral=estadofactuimpreLogic.procesarEventosEstadoFactuImpresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadofactuimpreLogic.getEstadoFactuImpres(),this.estadofactuimpre,this.estadofactuimpreParameterGeneral,this.isEsNuevoEstadoFactuImpre,classes);//this.estadofactuimpreLogic.getEstadoFactuImpre()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoFactuImpre(this.estadofactuimpreReturnGeneral,this.estadofactuimpreBean,false);
		
		if(this.estadofactuimpreReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoFactuImpre(this.estadofactuimpreReturnGeneral.getEstadoFactuImpre());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoFactuImpre(this.estadofactuimpreReturnGeneral.getEstadoFactuImpre());
		}
		
		if(this.estadofactuimpreReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoFactuImpre(this.estadofactuimpreReturnGeneral.getEstadoFactuImpre(),classes);//this.estadofactuimpreBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoFactuImpre(this.estadofactuimpre,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoFactuImpre();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoFactuImpre();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoFactuImpreBeanSwingJInternalFrameAdditional.RecargarFormEstadoFactuImpre(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoFactuImpre(false);
						
			if(estadofactuimpreSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresionSessionBean.getEsGuardarRelacionado() && FacturaImpresionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFacturaImpresionActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoFactuImpreJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoFactuImpre();
			}
			
			this.actualizarVisualTableDatosEstadoFactuImpre();
			
			this.jTableDatosEstadoFactuImpre.setRowSelectionInterval(this.getIndiceNuevoEstadoFactuImpre(), this.getIndiceNuevoEstadoFactuImpre());
			
			this.seleccionarFilaTablaEstadoFactuImpreActual();
						
			this.actualizarEstadoCeldasBotonesEstadoFactuImpre("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoFactuImpre(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoFactuImpre.jTextFieldcodigoEstadoFactuImpre.setEnabled(isHabilitar && this.estadofactuimpreConstantesFunciones.activarcodigoEstadoFactuImpre);
		this.jInternalFrameDetalleFormEstadoFactuImpre.jTextAreanombreEstadoFactuImpre.setEnabled(isHabilitar && this.estadofactuimpreConstantesFunciones.activarnombreEstadoFactuImpre);	
		
	};
	
	public void setDefaultControlesEstadoFactuImpre() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoFactuImpre(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadofactuimpreSessionBean.setConGuardarRelaciones(true);			
			this.estadofactuimpreSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoFactuImpre.jTabbedPaneRelacionesEstadoFactuImpre.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadofactuimpreSessionBean.setConGuardarRelaciones(false);			
			this.estadofactuimpreSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoFactuImpre.jTabbedPaneRelacionesEstadoFactuImpre.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoFactuImpre() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoFactuImpre estadofactuimpreAux:this.estadofactuimpreLogic.getEstadoFactuImpres()) {
				if(estadofactuimpreAux.getId().equals(this.iIdNuevoEstadoFactuImpre)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoFactuImpre estadofactuimpreAux:this.estadofactuimpres) {
				if(estadofactuimpreAux.getId().equals(this.iIdNuevoEstadoFactuImpre)) {
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
	
	public int getIndiceActualEstadoFactuImpre(EstadoFactuImpre estadofactuimpre,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoFactuImpre estadofactuimpreAux:this.estadofactuimpreLogic.getEstadoFactuImpres()) {
				if(estadofactuimpreAux.getId().equals(estadofactuimpre.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoFactuImpre estadofactuimpreAux:this.estadofactuimpres) {
				if(estadofactuimpreAux.getId().equals(estadofactuimpre.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoFactuImpre(EstadoFactuImpre estadofactuimpreOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoFactuImpre estadofactuimpreAux:this.estadofactuimpreLogic.getEstadoFactuImpres()) {
				if(estadofactuimpreAux.getEstadoFactuImpreOriginal().getId().equals(estadofactuimpreOriginal.getId())) {
					existe=true;
					estadofactuimpreOriginal.setId(estadofactuimpreAux.getId());
					estadofactuimpreOriginal.setVersionRow(estadofactuimpreAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoFactuImpre estadofactuimpreAux:this.estadofactuimpres) {
				if(estadofactuimpreAux.getEstadoFactuImpreOriginal().getId().equals(estadofactuimpreOriginal.getId())) {
					existe=true;
					estadofactuimpreOriginal.setId(estadofactuimpreAux.getId());
					estadofactuimpreOriginal.setVersionRow(estadofactuimpreAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoFactuImpre(Boolean esParaCancelar) throws Exception {
		estadofactuimpresAux=new ArrayList<EstadoFactuImpre>();
		estadofactuimpreAux=new EstadoFactuImpre();
		
		if(!this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoFactuImpre estadofactuimpreAux:this.estadofactuimpreLogic.getEstadoFactuImpres()) {
					if(estadofactuimpreAux.getId()<0) {
						estadofactuimpresAux.add(estadofactuimpreAux);
					}		
				}
				this.iIdNuevoEstadoFactuImpre=0L;
				this.estadofactuimpreLogic.getEstadoFactuImpres().removeAll(estadofactuimpresAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoFactuImpre estadofactuimpreAux:this.estadofactuimpres) {
					if(estadofactuimpreAux.getId()<0) {
						estadofactuimpresAux.add(estadofactuimpreAux);
					}		
				}
				this.iIdNuevoEstadoFactuImpre=0L;
				this.estadofactuimpres.removeAll(estadofactuimpresAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoFactuImpre 
					&& this.estadofactuimpreLogic.getEstadoFactuImpres().size()>0
					) {
					estadofactuimpreAux=this.estadofactuimpreLogic.getEstadoFactuImpres().get(this.estadofactuimpreLogic.getEstadoFactuImpres().size() - 1);
				
					if(estadofactuimpreAux.getId()<0) {
						this.estadofactuimpreLogic.getEstadoFactuImpres().remove(estadofactuimpreAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoFactuImpre && this.estadofactuimpres.size()>0) {
					estadofactuimpreAux=this.estadofactuimpres.get(this.estadofactuimpres.size() - 1);
				
					if(estadofactuimpreAux.getId()<0) {
						this.estadofactuimpres.remove(estadofactuimpreAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoFactuImpre(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadofactuimpre.getId()<0) {
				this.estadofactuimpreLogic.getEstadoFactuImpres().remove(this.estadofactuimpre);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadofactuimpre.getId()<0) {
				this.estadofactuimpres.remove(this.estadofactuimpre);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoFactuImpre(List<EstadoFactuImpre> estadofactuimpresAux) throws Exception {
		EstadoFactuImpreConstantesFunciones.setEstadosInicialesEstadoFactuImpre(estadofactuimpresAux);
	}
	
	public void setEstadosInicialesEstadoFactuImpre(EstadoFactuImpre estadofactuimpreAux) throws Exception {
		EstadoFactuImpreConstantesFunciones.setEstadosInicialesEstadoFactuImpre(estadofactuimpreAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoFactuImpreActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoFactuImpre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoFactuImpreActual()) {
				if(!this.isEsNuevoEstadoFactuImpre) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoFactuImpre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoFactuImpre=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoFactuImpreActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Factu Impre ?", "MANTENIMIENTO DE Estado Factu Impre", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoFactuImpre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoFactuImpre estadofactuimpre) throws Exception {
		EstadoFactuImpreConstantesFunciones.seleccionarAsignar(this.estadofactuimpre,estadofactuimpre);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoFactuImpre=this.isPermisoActualizarOriginalEstadoFactuImpre;
			
			
			this.seleccionarAsignar(estadofactuimpre);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoFactuImpreConstantesFunciones.quitarEspaciosEstadoFactuImpre(this.estadofactuimpre,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoFactuImpre("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadofactuimpreSessionBean.setsFuncionBusquedaRapida(this.estadofactuimpreSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoFactuImpre) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoFactuImpre(esParaCancelar);				
				this.cancelarNuevoEstadoFactuImpre(esParaCancelar);								
			}
			
			this.estadofactuimpre=new EstadoFactuImpre();
			
			this.inicializarEstadoFactuImpre();
			
			this.actualizarEstadoCeldasBotonesEstadoFactuImpre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoFactuImpre() throws Exception {
		try {
			EstadoFactuImpreConstantesFunciones.inicializarEstadoFactuImpre(this.estadofactuimpre);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadofactuimpreLogic.getEstadoFactuImpres().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoFactuImpres(String sAccionBusqueda,List<EstadoFactuImpre> estadofactuimpresParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoFactuImpre"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoFactuImpreMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoFactuImpreMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoFactuImpre"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Factu Impres");		
		parameters.put("busquedapor", EstadoFactuImpreConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(FacturaImpresion.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoFactuImpreLogic estadofactuimpreLogicAuxiliar=new EstadoFactuImpreLogic();
					estadofactuimpreLogicAuxiliar.setDatosCliente(estadofactuimpreLogic.getDatosCliente());				
					estadofactuimpreLogicAuxiliar.setEstadoFactuImpres(estadofactuimpresParaReportes);
					
					estadofactuimpreLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoFactuImpreWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadofactuimpresParaReportes=estadofactuimpreLogicAuxiliar.getEstadoFactuImpres();
					
					//estadofactuimpreLogic.getNewConnexionToDeep();
					
					//for (EstadoFactuImpre estadofactuimpre:estadofactuimpresParaReportes) {
					//	estadofactuimpreLogic.deepLoad(estadofactuimpre, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadofactuimpreLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadofactuimpreLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileFacturaImpresion = AuxiliarReportes.class.getResourceAsStream("FacturaImpresionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_facturaimpresion", reportFileFacturaImpresion);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoFactuImpre=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoFactuImpreConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoFactuImpreConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoFactuImpre=new JRBeanArrayDataSource(EstadoFactuImpreJInternalFrame.TraerEstadoFactuImpreBeans(estadofactuimpresParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoFactuImpre);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoFactuImpreConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoFactuImpreConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoFactuImpreBean.TraerEstadoFactuImpreBeans(estadofactuimpresParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoFactuImpres(sAccionBusqueda,sTipoArchivoReporte,estadofactuimpresParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoFactuImpres(sAccionBusqueda,sTipoArchivoReporte,estadofactuimpresParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoFactuImpreActionPerformed(null);
					//this.generarExcelReporteEstadoFactuImpres(sAccionBusqueda,sTipoArchivoReporte,estadofactuimpresParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoFactuImpres(sAccionBusqueda,sTipoArchivoReporte,estadofactuimpresParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoFactuImpres(sAccionBusqueda,sTipoArchivoReporte,estadofactuimpresParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoFactuImpres(sAccionBusqueda,sTipoArchivoReporte,estadofactuimpresParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoFactuImpres(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoFactuImpre> estadofactuimpresParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofactuimpre";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoFactuImpres");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoFactuImpre("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoFactuImpre estadofactuimpre : estadofactuimpresParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoFactuImpreConstantesFunciones.generarExcelReporteDataEstadoFactuImpre("NORMAL",row,workbook,estadofactuimpre,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Factu Impre",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoFactuImpre(String sTipo,Row row,Workbook workbook) {
		
		EstadoFactuImpreConstantesFunciones.generarExcelReporteHeaderEstadoFactuImpre(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoFactuImpres(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoFactuImpre> estadofactuimpresParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofactuimpre_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoFactuImpres");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoFactuImpre estadofactuimpre : estadofactuimpresParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoFactuImpreConstantesFunciones.getEstadoFactuImpreDescripcion(estadofactuimpre));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoFactuImpreConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoFactuImpreConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadofactuimpre.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoFactuImpreConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoFactuImpreConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadofactuimpre.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Factu Impre",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoFactuImpres(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoFactuImpre> estadofactuimpresParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoFactuImpre> estadofactuimpresRespaldo=null;
		
		classes=EstadoFactuImpreConstantesFunciones.getClassesRelationshipsOfEstadoFactuImpre(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadofactuimpreLogic.setDatosCliente(this.datosCliente);
		this.estadofactuimpreLogic.setDatosDeep(this.datosDeep);
		this.estadofactuimpreLogic.setIsConDeep(true);
		
		estadofactuimpresRespaldo=this.estadofactuimpreLogic.getEstadoFactuImpres();
		
		this.estadofactuimpreLogic.setEstadoFactuImpres(estadofactuimpresParaReportes);	
		this.estadofactuimpreLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadofactuimpresParaReportes=this.estadofactuimpreLogic.getEstadoFactuImpres();
		this.estadofactuimpreLogic.setEstadoFactuImpres(estadofactuimpresRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofactuimpre_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoFactuImpres");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoFactuImpre("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoFactuImpre estadofactuimpre : estadofactuimpresParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoFactuImpre("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoFactuImpreConstantesFunciones.generarExcelReporteDataEstadoFactuImpre("NORMAL",row,workbook,estadofactuimpre,cellStyleDataAux);
		
			
			


				//FacturaImpresion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FacturaImpresionConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadofactuimpre.getFacturaImpresions()!=null && estadofactuimpre.getFacturaImpresions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FacturaImpresionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FacturaImpresionConstantesFunciones.generarExcelReporteHeaderFacturaImpresion("RELACIONADO",row,workbook);
				}

				if(estadofactuimpre.getFacturaImpresions()!=null) {
					i2=0;
					for(FacturaImpresion facturaimpresion : estadofactuimpre.getFacturaImpresions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FacturaImpresionConstantesFunciones.generarExcelReporteDataFacturaImpresion("RELACIONADO",row,workbook,facturaimpresion,cellStyleDataAuxHijo);
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
		cell.setCellValue(EstadoFactuImpreConstantesFunciones.getEstadoFactuImpreDescripcion(estadofactuimpre));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Factu Impre",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoFactuImpre() throws Exception {		
		this.startProcessEstadoFactuImpre(true);
	}
	
	public void startProcessEstadoFactuImpre(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoFactuImpre, this.jScrollPanelDatosEstadoFactuImpre,this.jPanelPaginacionEstadoFactuImpre, this.jScrollPanelDatosEdicionEstadoFactuImpre, this.jPanelAccionesEstadoFactuImpre,this.jPanelAccionesFormularioEstadoFactuImpre,this.jmenuBarEstadoFactuImpre,this.jmenuBarDetalleEstadoFactuImpre,this.jTtoolBarEstadoFactuImpre,this.jTtoolBarDetalleEstadoFactuImpre);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoFactuImpre=null; 
		
		final JPanel jPanelParametrosReportesEstadoFactuImpre=this.jPanelParametrosReportesEstadoFactuImpre;
		//final JScrollPane jScrollPanelDatosEstadoFactuImpre=this.jScrollPanelDatosEstadoFactuImpre;
		final JTable jTableDatosEstadoFactuImpre=this.jTableDatosEstadoFactuImpre;		
		final JPanel jPanelPaginacionEstadoFactuImpre=this.jPanelPaginacionEstadoFactuImpre;
		//final JScrollPane jScrollPanelDatosEdicionEstadoFactuImpre=this.jScrollPanelDatosEdicionEstadoFactuImpre;
		final JPanel jPanelAccionesEstadoFactuImpre=this.jPanelAccionesEstadoFactuImpre;
		
		JPanel jPanelCamposAuxiliarEstadoFactuImpre=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoFactuImpre=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) {
			jPanelCamposAuxiliarEstadoFactuImpre=this.jInternalFrameDetalleFormEstadoFactuImpre.jPanelCamposEstadoFactuImpre;
			jPanelAccionesFormularioAuxiliarEstadoFactuImpre=this.jInternalFrameDetalleFormEstadoFactuImpre.jPanelAccionesFormularioEstadoFactuImpre;
		}
		
		final JPanel jPanelCamposEstadoFactuImpre=jPanelCamposAuxiliarEstadoFactuImpre;
		final JPanel jPanelAccionesFormularioEstadoFactuImpre=jPanelAccionesFormularioAuxiliarEstadoFactuImpre;
		
		
		final JMenuBar jmenuBarEstadoFactuImpre=this.jmenuBarEstadoFactuImpre;
		final JToolBar jTtoolBarEstadoFactuImpre=this.jTtoolBarEstadoFactuImpre;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoFactuImpre=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoFactuImpre=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) {
			jmenuBarDetalleAuxiliarEstadoFactuImpre=this.jInternalFrameDetalleFormEstadoFactuImpre.jmenuBarDetalleEstadoFactuImpre;
			jTtoolBarDetalleAuxiliarEstadoFactuImpre=this.jInternalFrameDetalleFormEstadoFactuImpre.jTtoolBarDetalleEstadoFactuImpre;
		}
		
		final JMenuBar jmenuBarDetalleEstadoFactuImpre=jmenuBarDetalleAuxiliarEstadoFactuImpre;
		final JToolBar jTtoolBarDetalleEstadoFactuImpre=jTtoolBarDetalleAuxiliarEstadoFactuImpre;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoFactuImpre;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoFactuImpre;
			processRunnable.jTableDatos=jTableDatosEstadoFactuImpre;
			processRunnable.jPanelCampos=jPanelCamposEstadoFactuImpre;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoFactuImpre;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoFactuImpre;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoFactuImpre;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoFactuImpre;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoFactuImpre;
			processRunnable.jTtoolBar=jTtoolBarEstadoFactuImpre;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoFactuImpre;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoFactuImpre ,jPanelParametrosReportesEstadoFactuImpre,jTableDatosEstadoFactuImpre, /*jScrollPanelDatosEstadoFactuImpre,*/jPanelCamposEstadoFactuImpre,jPanelPaginacionEstadoFactuImpre, /*jScrollPanelDatosEdicionEstadoFactuImpre,*/ jPanelAccionesEstadoFactuImpre,jPanelAccionesFormularioEstadoFactuImpre,jmenuBarEstadoFactuImpre,jmenuBarDetalleEstadoFactuImpre,jTtoolBarEstadoFactuImpre,jTtoolBarDetalleEstadoFactuImpre);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoFactuImpre, jScrollPanelDatosEstadoFactuImpre,jPanelPaginacionEstadoFactuImpre, jScrollPanelDatosEdicionEstadoFactuImpre, jPanelAccionesEstadoFactuImpre,jPanelAccionesFormularioEstadoFactuImpre,jmenuBarEstadoFactuImpre,jmenuBarDetalleEstadoFactuImpre,jTtoolBarEstadoFactuImpre,jTtoolBarDetalleEstadoFactuImpre);
						
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
	
	public void finishProcessEstadoFactuImpre() {// throws Exception 
		this.finishProcessEstadoFactuImpre(true);
	}
	
	public void finishProcessEstadoFactuImpre(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoFactuImpre, this.jScrollPanelDatosEstadoFactuImpre,this.jPanelPaginacionEstadoFactuImpre, this.jScrollPanelDatosEdicionEstadoFactuImpre, this.jPanelAccionesEstadoFactuImpre,this.jPanelAccionesFormularioEstadoFactuImpre,this.jmenuBarEstadoFactuImpre,this.jmenuBarDetalleEstadoFactuImpre,this.jTtoolBarEstadoFactuImpre,this.jTtoolBarDetalleEstadoFactuImpre);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoFactuImpre=null; 
		
		final JPanel jPanelParametrosReportesEstadoFactuImpre=this.jPanelParametrosReportesEstadoFactuImpre;
		//final JScrollPane jScrollPanelDatosEstadoFactuImpre=this.jScrollPanelDatosEstadoFactuImpre;
		final JTable jTableDatosEstadoFactuImpre=this.jTableDatosEstadoFactuImpre;		
		final JPanel jPanelPaginacionEstadoFactuImpre=this.jPanelPaginacionEstadoFactuImpre;
		//final JScrollPane jScrollPanelDatosEdicionEstadoFactuImpre=this.jScrollPanelDatosEdicionEstadoFactuImpre;
		final JPanel jPanelAccionesEstadoFactuImpre=this.jPanelAccionesEstadoFactuImpre;
		
		JPanel jPanelCamposAuxiliarEstadoFactuImpre=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoFactuImpre=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) {
			jPanelCamposAuxiliarEstadoFactuImpre=this.jInternalFrameDetalleFormEstadoFactuImpre.jPanelCamposEstadoFactuImpre;
			jPanelAccionesFormularioAuxiliarEstadoFactuImpre=this.jInternalFrameDetalleFormEstadoFactuImpre.jPanelAccionesFormularioEstadoFactuImpre;
		}
		
		final JPanel jPanelCamposEstadoFactuImpre=jPanelCamposAuxiliarEstadoFactuImpre;
		final JPanel jPanelAccionesFormularioEstadoFactuImpre=jPanelAccionesFormularioAuxiliarEstadoFactuImpre;
		
		
		final JMenuBar jmenuBarEstadoFactuImpre=this.jmenuBarEstadoFactuImpre;		
		final JToolBar jTtoolBarEstadoFactuImpre=this.jTtoolBarEstadoFactuImpre;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoFactuImpre=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoFactuImpre=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) {
			jmenuBarDetalleAuxiliarEstadoFactuImpre=this.jInternalFrameDetalleFormEstadoFactuImpre.jmenuBarDetalleEstadoFactuImpre;
			jTtoolBarDetalleAuxiliarEstadoFactuImpre=this.jInternalFrameDetalleFormEstadoFactuImpre.jTtoolBarDetalleEstadoFactuImpre;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoFactuImpre=jmenuBarDetalleAuxiliarEstadoFactuImpre;
		final JToolBar jTtoolBarDetalleEstadoFactuImpre=jTtoolBarDetalleAuxiliarEstadoFactuImpre;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoFactuImpre;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoFactuImpre;
			processRunnable.jTableDatos=jTableDatosEstadoFactuImpre;
			processRunnable.jPanelCampos=jPanelCamposEstadoFactuImpre;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoFactuImpre;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoFactuImpre;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoFactuImpre;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoFactuImpre;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoFactuImpre;
			processRunnable.jTtoolBar=jTtoolBarEstadoFactuImpre;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoFactuImpre;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoFactuImpre ,jPanelParametrosReportesEstadoFactuImpre, jTableDatosEstadoFactuImpre,/*jScrollPanelDatosEstadoFactuImpre,*/jPanelCamposEstadoFactuImpre,jPanelPaginacionEstadoFactuImpre, /*jScrollPanelDatosEdicionEstadoFactuImpre,*/ jPanelAccionesEstadoFactuImpre,jPanelAccionesFormularioEstadoFactuImpre,jmenuBarEstadoFactuImpre,jmenuBarDetalleEstadoFactuImpre,jTtoolBarEstadoFactuImpre,jTtoolBarDetalleEstadoFactuImpre));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoFactuImpre(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoFactuImpre(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoFactuImpre(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoFactuImpre(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoFactuImpre,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoFactuImpre,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoFactuImpre(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoFactuImpre,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoFactuImpre,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadofactuimpreConstantesFunciones.getsFinalQueryEstadoFactuImpre();
		String  finalQueryPaginacionTodos=this.estadofactuimpreConstantesFunciones.getsFinalQueryEstadoFactuImpre();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoFactuImpreConstantesFunciones.getArrayColumnasGlobalesNoEstadoFactuImpre(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoFactuImpreConstantesFunciones.getArrayColumnasGlobalesEstadoFactuImpre(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoFactuImpreConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadofactuimpresEliminados= new ArrayList<EstadoFactuImpre>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoFactuImpre();
		
				///*EstadoFactuImpreSessionBean*/this.estadofactuimpreSessionBean=new EstadoFactuImpreSessionBean();
			
			if(this.estadofactuimpreSessionBean==null) {
				this.estadofactuimpreSessionBean=new EstadoFactuImpreSessionBean();
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
					this.iNumeroPaginacion=EstadoFactuImpreConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoFactuImpreConstantesFunciones.getClassesForeignKeysOfEstadoFactuImpre(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadofactuimpre."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadofactuimpresAux= new ArrayList<EstadoFactuImpre>();
			
				
			estadofactuimpreLogic.setDatosCliente(this.datosCliente);
			estadofactuimpreLogic.setDatosDeep(this.datosDeep);
			estadofactuimpreLogic.setIsConDeep(true);
			
			
			estadofactuimpreLogic.getEstadoFactuImpreDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadofactuimpreLogic.getTodosEstadoFactuImpres(finalQueryGlobal,pagination);
					
					//estadofactuimpreLogic.getTodosEstadoFactuImpresWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadofactuimpreLogic.getEstadoFactuImpres()==null|| estadofactuimpreLogic.getEstadoFactuImpres().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadofactuimpresAux= new ArrayList<EstadoFactuImpre>();
							estadofactuimpresAux.addAll(estadofactuimpreLogic.getEstadoFactuImpres());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadofactuimpresAux= new ArrayList<EstadoFactuImpre>();
							estadofactuimpresAux.addAll(estadofactuimpres);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadofactuimpreLogic.getTodosEstadoFactuImpres(finalQueryGlobal+"",this.pagination);												
							
							//estadofactuimpreLogic.getTodosEstadoFactuImpresWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoFactuImpres("Todos",estadofactuimpreLogic.getEstadoFactuImpres() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadofactuimpreLogic.setEstadoFactuImpres(new ArrayList<EstadoFactuImpre>());					
							estadofactuimpreLogic.getEstadoFactuImpres().addAll(estadofactuimpresAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadofactuimpres=new ArrayList<EstadoFactuImpre>();
							estadofactuimpres.addAll(estadofactuimpresAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoFactuImpre=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoFactuImpre=this.idActual;
				
				} else if(this.idEstadoFactuImpreActual!=null && this.idEstadoFactuImpreActual!=0L) {
					idEstadoFactuImpre=idEstadoFactuImpreActual;
				}
				
					
				this.sDetalleReporte=EstadoFactuImpreConstantesFunciones.getDetalleIndicePorId(idEstadoFactuImpre);
				
				this.estadofactuimpres=new ArrayList<EstadoFactuImpre>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadofactuimpreLogic.getEntity(idEstadoFactuImpre);
					
					//estadofactuimpreLogic.getEntityWithConnection(idEstadoFactuImpre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadofactuimpreLogic.setEstadoFactuImpres(new ArrayList<EstadoFactuImpre>());
					estadofactuimpreLogic.getEstadoFactuImpres().add(estadofactuimpreLogic.getEstadoFactuImpre());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadofactuimpres=new ArrayList<EstadoFactuImpre>();
					this.estadofactuimpres.add(estadofactuimpre);
				}
				
				if(estadofactuimpreLogic.getEstadoFactuImpre()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoFactuImpre();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoFactuImpre();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadofactuimpreLogic.getEstadoFactuImpres().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadofactuimpres.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadofactuimpreLogic.getEstadoFactuImpres().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadofactuimpres.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoFactuImpre estadofactuimpre) {
		Boolean permite=true;
		
		if(this.estadofactuimpre.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoFactuImpreConstantesFunciones.getOrderByListaEstadoFactuImpre();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoFactuImpreConstantesFunciones.getOrderByListaEstadoFactuImpre();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoFactuImpre estadofactuimpre:estadofactuimpreLogic.getEstadoFactuImpres()) {
				if(estadofactuimpre.getsType().equals(Constantes2.S_TOTALES)) {
					estadofactuimpreTotales=estadofactuimpre;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoFactuImpre estadofactuimpre:this.estadofactuimpres) {
				if(estadofactuimpre.getsType().equals(Constantes2.S_TOTALES)) {
					estadofactuimpreTotales=estadofactuimpre;
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
			this.estadofactuimpreAux=new EstadoFactuImpre();
			this.estadofactuimpreAux.setsType(Constantes2.S_TOTALES);
			this.estadofactuimpreAux.setIsNew(false);
			this.estadofactuimpreAux.setIsChanged(false);
			this.estadofactuimpreAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoFactuImpreConstantesFunciones.TotalizarValoresFilaEstadoFactuImpre(this.estadofactuimpreLogic.getEstadoFactuImpres(),this.estadofactuimpreAux);
				
				this.estadofactuimpreLogic.getEstadoFactuImpres().add(this.estadofactuimpreAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoFactuImpreConstantesFunciones.TotalizarValoresFilaEstadoFactuImpre(this.estadofactuimpres,this.estadofactuimpreAux);
				
				this.estadofactuimpres.add(this.estadofactuimpreAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadofactuimpreTotales=new EstadoFactuImpre();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadofactuimpreLogic.getEstadoFactuImpres().remove(estadofactuimpreTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadofactuimpres.remove(estadofactuimpreTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadofactuimpreTotales=new EstadoFactuImpre();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoFactuImpre estadofactuimpre:estadofactuimpreLogic.getEstadoFactuImpres()) {
				if(estadofactuimpre.getsType().equals(Constantes2.S_TOTALES)) {
					estadofactuimpreTotales=estadofactuimpre;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoFactuImpreConstantesFunciones.TotalizarValoresFilaEstadoFactuImpre(this.estadofactuimpreLogic.getEstadoFactuImpres(),estadofactuimpreTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoFactuImpre estadofactuimpre:this.estadofactuimpres) {
				if(estadofactuimpre.getsType().equals(Constantes2.S_TOTALES)) {
					estadofactuimpreTotales=estadofactuimpre;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoFactuImpreConstantesFunciones.TotalizarValoresFilaEstadoFactuImpre(this.estadofactuimpres,estadofactuimpreTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEstadoFactuImprePorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getEstadoFactuImprePorCodigo(String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadofactuimpreLogic.getEstadoFactuImprePorCodigo(codigo);
				
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
	
	public void inicializarPermisosEstadoFactuImpre() {
		this.isPermisoTodoEstadoFactuImpre=false;
		this.isPermisoNuevoEstadoFactuImpre=false;
		this.isPermisoActualizarEstadoFactuImpre=false;
		this.isPermisoActualizarOriginalEstadoFactuImpre=false;
		this.isPermisoEliminarEstadoFactuImpre=false;
		this.isPermisoGuardarCambiosEstadoFactuImpre=false;
		this.isPermisoConsultaEstadoFactuImpre=false;
		this.isPermisoBusquedaEstadoFactuImpre=false;
		this.isPermisoReporteEstadoFactuImpre=false;		
		this.isPermisoOrdenEstadoFactuImpre=false;		
		this.isPermisoPaginacionMedioEstadoFactuImpre=false;		
		this.isPermisoPaginacionAltoEstadoFactuImpre=false;
		this.isPermisoPaginacionTodoEstadoFactuImpre=false;
		this.isPermisoCopiarEstadoFactuImpre=false;		
		this.isPermisoVerFormEstadoFactuImpre=false;		
		this.isPermisoDuplicarEstadoFactuImpre=false;		
		this.isPermisoOrdenEstadoFactuImpre=false;		
	}
	
	public void setPermisosUsuarioEstadoFactuImpre(Boolean isPermiso) {
		this.isPermisoTodoEstadoFactuImpre=isPermiso;
		this.isPermisoNuevoEstadoFactuImpre=isPermiso;
		this.isPermisoActualizarEstadoFactuImpre=isPermiso;
		this.isPermisoActualizarOriginalEstadoFactuImpre=isPermiso;
		this.isPermisoEliminarEstadoFactuImpre=isPermiso;
		this.isPermisoGuardarCambiosEstadoFactuImpre=isPermiso;
		this.isPermisoConsultaEstadoFactuImpre=isPermiso;
		this.isPermisoBusquedaEstadoFactuImpre=isPermiso;
		this.isPermisoReporteEstadoFactuImpre=isPermiso;
		this.isPermisoOrdenEstadoFactuImpre=isPermiso;		
		this.isPermisoPaginacionMedioEstadoFactuImpre=isPermiso;		
		this.isPermisoPaginacionAltoEstadoFactuImpre=isPermiso;		
		this.isPermisoPaginacionTodoEstadoFactuImpre=isPermiso;		
		this.isPermisoCopiarEstadoFactuImpre=isPermiso;		
		this.isPermisoVerFormEstadoFactuImpre=isPermiso;		
		this.isPermisoDuplicarEstadoFactuImpre=isPermiso;
		this.isPermisoOrdenEstadoFactuImpre=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoFactuImpre(Boolean isPermiso) {
		//this.isPermisoTodoEstadoFactuImpre=isPermiso;
		this.isPermisoNuevoEstadoFactuImpre=isPermiso;
		this.isPermisoActualizarEstadoFactuImpre=isPermiso;
		this.isPermisoActualizarOriginalEstadoFactuImpre=isPermiso;
		this.isPermisoEliminarEstadoFactuImpre=isPermiso;
		this.isPermisoGuardarCambiosEstadoFactuImpre=isPermiso;
		//this.isPermisoConsultaEstadoFactuImpre=isPermiso;
		//this.isPermisoBusquedaEstadoFactuImpre=isPermiso;
		//this.isPermisoReporteEstadoFactuImpre=isPermiso;
		//this.isPermisoOrdenEstadoFactuImpre=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoFactuImpre=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoFactuImpre=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoFactuImpre=isPermiso;		
		//this.isPermisoCopiarEstadoFactuImpre=isPermiso;		
		//this.isPermisoDuplicarEstadoFactuImpre=isPermiso;
		//this.isPermisoOrdenEstadoFactuImpre=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoFactuImpreClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(FacturaImpresionConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoFactuImpreJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosFacturaImpresion=false;
		this.isTienePermisosFacturaImpresion=this.verificarGetPermisosUsuarioOpcionEstadoFactuImpreClaseRelacionada(this.opcionsRelacionadas,FacturaImpresionConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoFactuImpre(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoFactuImpreClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosFacturaImpresion=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoFactuImpreClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoFactuImpreClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoFactuImpreClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosFacturaImpresion && this.jInternalFrameDetalleFormEstadoFactuImpre!=null && this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoFactuImpre.jTabbedPaneRelacionesEstadoFactuImpre.remove(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoFactuImpre() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoFactuImpreJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoFactuImpreConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoFactuImpre=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoFactuImpre=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoFactuImpre=this.isPermisoActualizarEstadoFactuImpre;
			this.isPermisoEliminarEstadoFactuImpre=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoFactuImpre=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoFactuImpre=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoFactuImpre=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoFactuImpre=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoFactuImpre=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoFactuImpre=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoFactuImpre=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoFactuImpre=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoFactuImpre=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoFactuImpre=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoFactuImpre=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoFactuImpre=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoFactuImpre=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoFactuImpre.setToolTipText(this.jTableDatosEstadoFactuImpre.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoFactuImpre(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoFactuImpre(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoFactuImpreJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoFactuImpreJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoFactuImpre() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosFacturaImpresion && this.estadofactuimpreConstantesFunciones.mostrarFacturaImpresionEstadoFactuImpre && !EstadoFactuImpreConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Factura Impresion");
			reporte.setsDescripcion("Factura Impresion");
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
	
		
	public void inicializarCombosForeignKeyEstadoFactuImpreListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoFactuImpreListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoFactuImpreJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoFactuImpreListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoFactuImpreListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoFactuImpre()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoFactuImpre()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoFactuImpre(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoFactuImpre()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoFactuImpre();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoFactuImpre(EstadoFactuImpre estadofactuimpre)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoFactuImpre(EstadoFactuImpre estadofactuimpre,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoFactuImpre()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoFactuImpre()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoFactuImpre()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoFactuImpre()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoFactuImpre()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoFactuImpre()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoFactuImpre(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoFactuImpre()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoFactuImpreBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoFactuImpreBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoFactuImpreBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadofactuimpreSessionBean=new EstadoFactuImpreSessionBean(); 
		this.estadofactuimpreConstantesFunciones=new EstadoFactuImpreConstantesFunciones(); 
		this.estadofactuimpreBean=new EstadoFactuImpre();//(this.estadofactuimpreConstantesFunciones); 		
		this.estadofactuimpreReturnGeneral=new EstadoFactuImpreParameterReturnGeneral(); 
		
		this.estadofactuimpreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadofactuimpreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoFactuImpreBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoFactuImpreBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoFactuImpreBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoFactuImpre(true);
			
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
			
			this.estadofactuimpreConstantesFunciones=new EstadoFactuImpreConstantesFunciones(); 
			this.estadofactuimpreBean=new EstadoFactuImpre();//this.estadofactuimpreConstantesFunciones); 			
			this.estadofactuimpreReturnGeneral=new EstadoFactuImpreParameterReturnGeneral(); 
		
			EstadoFactuImpreBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Factu Impre Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadofactuimpre=new EstadoFactuImpre();
			this.estadofactuimpres = new ArrayList<EstadoFactuImpre>();
			this.estadofactuimpresAux = new ArrayList<EstadoFactuImpre>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic=new EstadoFactuImpreLogic();
				this.estadofactuimpreLogic.getNewConnexionToDeep("");
			}
			
			//this.estadofactuimpreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadofactuimpreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoFactuImpre);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoFactuImpre!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoFactuImpre);	
					}
					
					if(this.jInternalFrameImportacionEstadoFactuImpre!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoFactuImpre);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoFactuImpre!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoFactuImpre);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoFactuImpre);
				this.jInternalFrameDetalleFormEstadoFactuImpre.setVisible(false);
				this.jInternalFrameDetalleFormEstadoFactuImpre.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoFactuImpre!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoFactuImpre);
					this.jInternalFrameReporteDinamicoEstadoFactuImpre.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoFactuImpre.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoFactuImpre!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoFactuImpre);
					this.jInternalFrameImportacionEstadoFactuImpre.setVisible(false);
					this.jInternalFrameImportacionEstadoFactuImpre.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoFactuImpre!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoFactuImpre);
					this.jInternalFrameOrderByEstadoFactuImpre.setVisible(false);
					this.jInternalFrameOrderByEstadoFactuImpre.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoFactuImpreActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoFactuImpreConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadofactuimpreReturnGeneral=new EstadoFactuImpreParameterReturnGeneral();
			
			this.estadofactuimpreParameterGeneral=new EstadoFactuImpreParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadofactuimpreLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoFactuImpreJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(FacturaImpresionConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoFactuImpreConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadofactuimpreSessionBean.getEsGuardarRelacionado(),this.estadofactuimpreSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoFactuImpreConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadofactuimpreSessionBean.getEsGuardarRelacionado(),this.estadofactuimpreSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoFactuImpre=false;
			this.isVisibilidadCeldaDuplicarEstadoFactuImpre=true;
			this.isVisibilidadCeldaCopiarEstadoFactuImpre=true;
			this.isVisibilidadCeldaVerFormEstadoFactuImpre=true;
			this.isVisibilidadCeldaOrdenEstadoFactuImpre=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFactuImpre=false;
			this.isVisibilidadCeldaModificarEstadoFactuImpre=false;
			this.isVisibilidadCeldaActualizarEstadoFactuImpre=false;
			this.isVisibilidadCeldaEliminarEstadoFactuImpre=false;
			this.isVisibilidadCeldaCancelarEstadoFactuImpre=false;
			this.isVisibilidadCeldaGuardarEstadoFactuImpre=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFactuImpre=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoFactuImpre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoFactuImpre();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoFactuImpre(false);
			
			this.setPermisosUsuarioEstadoFactuImpre();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadofactuimpreSessionBean.getEsGuardarRelacionado() 
				|| (this.estadofactuimpreSessionBean.getEsGuardarRelacionado() && this.estadofactuimpreSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoFactuImpreClasesRelacionadas();
			}
			
			if(this.estadofactuimpreSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoFactuImpreClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoFactuImpreJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoFactuImpre();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoFactuImpre();
			}
			
			if(!this.isPermisoBusquedaEstadoFactuImpre) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoFactuImpre,this.isPermisoPaginacionMedioEstadoFactuImpre,this.isPermisoPaginacionTodoEstadoFactuImpre);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoFactuImpreConstantesFunciones.getTiposSeleccionarEstadoFactuImpre());
				
				this.tiposColumnasSelect=EstadoFactuImpreConstantesFunciones.getTiposSeleccionarEstadoFactuImpre(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoFactuImpre();				
				//this.tiposRelacionesSelect=EstadoFactuImpreConstantesFunciones.getTiposRelacionesEstadoFactuImpre(true);
				
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
			//if(!this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoFactuImpre();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoFactuImpre(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoFactuImpre(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoFactuImpre() ;
			
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
			
			
			this.facturaimpresionLogic=new FacturaImpresionLogic(); 
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
				estadofactuimpreImplementable= (EstadoFactuImpreImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoFactuImpreConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadofactuimpreImplementableHome= (EstadoFactuImpreImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoFactuImpreConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadofactuimpres= new ArrayList<EstadoFactuImpre>();
			this.estadofactuimpresEliminados= new ArrayList<EstadoFactuImpre>();
						
			this.isEsNuevoEstadoFactuImpre=false;
			this.esParaAccionDesdeFormularioEstadoFactuImpre=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoFactuImpre(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoFactuImpre();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadoFactuImpreBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoFactuImpreConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoFactuImpre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoFactuImpre(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoFactuImpre();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoFactuImpre();
			}
			
			EstadoFactuImpreBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoFactuImpre(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoFactuImpre: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoFactuImpre() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(FacturaImpresionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FacturaImpresionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoFactuImpre")) {
				iIndex=this.jInternalFrameDetalleFormEstadoFactuImpre.jTabbedPaneRelacionesEstadoFactuImpre.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoFactuImpre.jTabbedPaneRelacionesEstadoFactuImpre.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoFactuImpre.getSelectedRow();	
				
				

				if(sTitle.equals("Factura Impresiones")) {
					if(!FacturaImpresionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoFactuImpre();

						this.cargarParteTabPanelRelacionadaFacturaImpresion(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoFactuImpre();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaFacturaImpresion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoFactuImpre.cargarSessionConBeanSwingJInternalFrameFacturaImpresion(false,true,iIndex);
		this.jButtonFacturaImpresionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFacturaImpresion();

		//this.jTabbedPaneRelacionesEstadoFactuImpre.updateUI();
		//this.jTabbedPaneRelacionesEstadoFactuImpre.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoFactuImpre.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("FacturaImpresion")) {
				int row=this.jTableDatosEstadoFactuImpre.getSelectedRow();
				jButtonFacturaImpresionActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Factura Impresion")) {

					if(this.isTienePermisosFacturaImpresion && this.estadofactuimpreConstantesFunciones.mostrarFacturaImpresionEstadoFactuImpre && !EstadoFactuImpreConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Factura Impresiones"+"("+FacturaImpresionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Factura Impresiones");

						if(estadofactuimpreConstantesFunciones.resaltarFacturaImpresionEstadoFactuImpre!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadofactuimpreConstantesFunciones.resaltarFacturaImpresionEstadoFactuImpre);
						}

						jmenuItem.setEnabled(this.estadofactuimpreConstantesFunciones.activarFacturaImpresionEstadoFactuImpre);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"FacturaImpresion"));

						

						this.jInternalFrameDetalleFormEstadoFactuImpre.jmenuDetalleEstadoFactuImpre.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoFactuImpre(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoFactuImpre(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoFactuImpre(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoFactuImpreListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoFactuImpre();
		
		this.cargarCombosFrameForeignKeyEstadoFactuImpre();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoFactuImpre();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoFactuImpre();
		}
	}
	
	
	
	public void jButtonNuevoEstadoFactuImpreActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadofactuimpreSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoFactuImpre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
			
			
			if(jTableDatosEstadoFactuImpre.getRowCount()>=1) {
				jTableDatosEstadoFactuImpre.removeRowSelectionInterval(0, jTableDatosEstadoFactuImpre.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoFactuImpre=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoFactuImpre(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoFactuImpre(true);			
			//this.estadofactuimpre=new EstadoFactuImpre();
			//this.estadofactuimpre.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoFactuImpre(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoFactuImpre() ;
			
			if(EstadoFactuImpreJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoFactuImpre(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadofactuimpre);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadofactuimpre);				
			
			EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
			
			if(this.estadofactuimpreSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoFactuImpre: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoFactuImpreActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoFactuImpre> estadofactuimpresSeleccionados=new ArrayList<EstadoFactuImpre>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoFactuImpre.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoFactuImpre.getSelectedRows().length;			
			}
			
			estadofactuimpresSeleccionados=this.getEstadoFactuImpresSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoFactuImpre--;			
				//EstadoFactuImpre estadofactuimpreAux= new EstadoFactuImpre();			
				//estadofactuimpreAux.setId(this.iIdNuevoEstadoFactuImpre);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoFactuImpre estadofactuimpreOrigen=new EstadoFactuImpre();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoFactuImpre estadofactuimpreOrigen : estadofactuimpresSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoFactuImpre.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadofactuimpreOrigen =(EstadoFactuImpre) this.estadofactuimpreLogic.getEstadoFactuImpres().toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadofactuimpreOrigen =(EstadoFactuImpre) this.estadofactuimpres.toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoFactuImpre();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadofactuimpre.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoFactuImpre(estadofactuimpreOrigen,this.estadofactuimpre,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFactuImpre(this.estadofactuimpre);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadofactuimpreLogic.getEstadoFactuImpres().add(this.estadofactuimpreAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadofactuimpres.add(this.estadofactuimpreAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoFactuImpre(false);
				
				this.jTableDatosEstadoFactuImpre.setRowSelectionInterval(this.getIndiceNuevoEstadoFactuImpre(), this.getIndiceNuevoEstadoFactuImpre());
				
				int iLastRow =  this.jTableDatosEstadoFactuImpre.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoFactuImpre.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoFactuImpre.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoFactuImpre(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoFactuImpreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoFactuImpre> estadofactuimpresSeleccionados=new ArrayList<EstadoFactuImpre>();									
		
			EstadoFactuImpre estadofactuimpreOrigen=new EstadoFactuImpre();
			EstadoFactuImpre estadofactuimpreDestino=new EstadoFactuImpre();
				
			estadofactuimpresSeleccionados=this.getEstadoFactuImpresSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoFactuImpre.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadofactuimpresSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoFactuImpre.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadofactuimpreOrigen =(EstadoFactuImpre) this.estadofactuimpreLogic.getEstadoFactuImpres().toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadofactuimpreOrigen =(EstadoFactuImpre) this.estadofactuimpres.toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadofactuimpreDestino =(EstadoFactuImpre) this.estadofactuimpreLogic.getEstadoFactuImpres().toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadofactuimpreDestino =(EstadoFactuImpre) this.estadofactuimpres.toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadofactuimpreOrigen =estadofactuimpresSeleccionados.get(0);
				estadofactuimpreDestino =estadofactuimpresSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoFactuImpre(estadofactuimpreOrigen,estadofactuimpreDestino,true,false);
				
				estadofactuimpreDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadofactuimpreDestino,estadofactuimpreLogic.getEstadoFactuImpres());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadofactuimpreDestino,estadofactuimpres);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoFactuImpre(false);
				
				//this.jTableDatosEstadoFactuImpre.setRowSelectionInterval(this.getIndiceNuevoEstadoFactuImpre(), this.getIndiceNuevoEstadoFactuImpre());
				
				int iLastRow =  this.jTableDatosEstadoFactuImpre.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoFactuImpre.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoFactuImpre.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoFactuImpre(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoFactuImpreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoFactuImpre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoFactuImpre.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoFactuImpreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoFactuImpre.isVisible();
			
			
			this.jPanelParametrosReportesEstadoFactuImpre.setVisible(!isVisible);
			this.jPanelPaginacionEstadoFactuImpre.setVisible(!isVisible);
			this.jPanelAccionesEstadoFactuImpre.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoFactuImpreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoFactuImpre();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoFactuImpreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoFactuImpre();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoFactuImpreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoFactuImpre();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoFactuImpreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoFactuImpre();
			
			this.abrirFrameOrderByEstadoFactuImpre();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoFactuImpreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoFactuImpre();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoFactuImpre(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoFactuImpre);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoFactuImpre.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoFactuImpre.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoFactuImpre.setSize(this.jInternalFrameDetalleFormEstadoFactuImpre.iWidthFormulario,this.jInternalFrameDetalleFormEstadoFactuImpre.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoFactuImpre.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoFactuImpre.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoFactuImpre.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoFactuImpre.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoFactuImpre.jContentPaneDetalleEstadoFactuImpre.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoFactuImpre.jTabbedPaneRelacionesEstadoFactuImpre.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoFactuImpre.jContentPaneDetalleEstadoFactuImpre.getWidth(),EstadoFactuImpreConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoFactuImpre.jTabbedPaneRelacionesEstadoFactuImpre.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoFactuImpre.jContentPaneDetalleEstadoFactuImpre.getWidth(),EstadoFactuImpreConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoFactuImpre.jTabbedPaneRelacionesEstadoFactuImpre.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoFactuImpre.jContentPaneDetalleEstadoFactuImpre.getWidth(),EstadoFactuImpreConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(FacturaImpresionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFacturaImpresion();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoFactuImpre.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoFactuImpre.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoFactuImpre() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoFactuImpre==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoFactuImpre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoFactuImpre,false,this);
				} else {
					this.jInternalFrameOrderByEstadoFactuImpre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoFactuImpre,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoFactuImpre);
				this.jInternalFrameOrderByEstadoFactuImpre.setVisible(false);
				this.jInternalFrameOrderByEstadoFactuImpre.setSelected(false);
				
				this.jInternalFrameOrderByEstadoFactuImpre.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoFactuImpre"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoFactuImpre();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoFactuImpre() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoFactuImpre==null) {
				
				this.jInternalFrameImportacionEstadoFactuImpre=new ImportacionJInternalFrame(EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoFactuImpre);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoFactuImpre);
				this.jInternalFrameImportacionEstadoFactuImpre.setVisible(false);
				this.jInternalFrameImportacionEstadoFactuImpre.setSelected(false);


				this.jInternalFrameImportacionEstadoFactuImpre.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoFactuImpre"));
				this.jInternalFrameImportacionEstadoFactuImpre.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoFactuImpre"));
				this.jInternalFrameImportacionEstadoFactuImpre.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoFactuImpre"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoFactuImpre() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoFactuImpre==null) {
				this.jInternalFrameReporteDinamicoEstadoFactuImpre=new ReporteDinamicoJInternalFrame(EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoFactuImpre);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoFactuImpre);
				this.jInternalFrameReporteDinamicoEstadoFactuImpre.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoFactuImpre.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoFactuImpre"));
				this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoFactuImpre"));
				this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoFactuImpre"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoFactuImpre();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaFacturaImpresion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.jScrollPanelDatosFacturaImpresion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoFactuImpre.jContentPaneDetalleEstadoFactuImpre.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.jScrollPanelDatosFacturaImpresion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.jScrollPanelDatosFacturaImpresion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.jScrollPanelDatosFacturaImpresion.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoFactuImpre() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoFactuImpre);
			
	       	this.jInternalFrameDetalleFormEstadoFactuImpre.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoFactuImpre.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoFactuImpre.dispose();
			//this.jInternalFrameDetalleFormEstadoFactuImpre=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoFactuImpre() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoFactuImpre.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoFactuImpre.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoFactuImpre() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoFactuImpre.setVisible(true);
	        this.jInternalFrameImportacionEstadoFactuImpre.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoFactuImpre() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoFactuImpre.setVisible(true);
	        this.jInternalFrameOrderByEstadoFactuImpre.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoFactuImpre() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoFactuImpre.setVisible(false);
	        this.jInternalFrameOrderByEstadoFactuImpre.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoFactuImpre() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoFactuImpre.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoFactuImpre.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoFactuImpre() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoFactuImpre.setVisible(false);
	        this.jInternalFrameImportacionEstadoFactuImpre.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoFactuImpreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoFactuImpre(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoFactuImpre(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoFactuImpre.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoFactuImpre(true);
			//this.isEsNuevoEstadoFactuImpre=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpre =(EstadoFactuImpre) this.estadofactuimpreLogic.getEstadoFactuImpres().toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadofactuimpre =(EstadoFactuImpre) this.estadofactuimpres.toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoFactuImpre("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoFactuImpre(false) ;
			
			if(estadofactuimpreSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresionSessionBean.getEsGuardarRelacionado() && FacturaImpresionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFacturaImpresionActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoFactuImpreJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoFactuImpre(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoFactuImpre(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoFactuImpreActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoFactuImpre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofactuimpre =(EstadoFactuImpre) this.estadofactuimpreLogic.getEstadoFactuImpres().toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofactuimpre =(EstadoFactuImpre) this.estadofactuimpres.toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoFactuImpre(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoFactuImpre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoFactuImpre.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoFactuImpre(true);
			//this.isEsNuevoEstadoFactuImpre=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpre =(EstadoFactuImpre) this.estadofactuimpreLogic.getEstadoFactuImpres().toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadofactuimpre =(EstadoFactuImpre) this.estadofactuimpres.toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadofactuimpre.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoFactuImpre("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoFactuImpre(false) ;
			
			if(EstadoFactuImpreJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoFactuImpre(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoFactuImpre(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoFactuImpreActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoFactuImpre(false);
			
			//if(!this.isEsNuevoEstadoFactuImpre) {								
				int intSelectedRow = this.jTableDatosEstadoFactuImpre.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofactuimpre =(EstadoFactuImpre) this.estadofactuimpreLogic.getEstadoFactuImpres().toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadofactuimpre =(EstadoFactuImpre) this.estadofactuimpres.toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoFactuImpreJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoFactuImpre(this.estadofactuimpre,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoFactuImpre(this.estadofactuimpre);
				
			}
			
			if(this.permiteMantenimiento(this.estadofactuimpre)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoFactuImpre=true;
					this.inicializarActualizarBindingTablaEstadoFactuImpre(false);
					this.isEsNuevoEstadoFactuImpre=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoFactuImpre=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoFactuImpre=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoFactuImpre(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoFactuImpre(false);
				
				this.habilitarDeshabilitarControlesEstadoFactuImpre(false);
			
												
				
				if(EstadoFactuImpreJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoFactuImpre();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoFactuImpreActionPerformed(evt,estadofactuimpreSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoFactuImpre(this.estadofactuimpre,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoFactuImpre.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadofactuimpreSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadofactuimpre.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoFactuImpre.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFactuImpre.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoFactuImpreActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoFactuImpre.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpre =(EstadoFactuImpre) this.estadofactuimpreLogic.getEstadoFactuImpres().toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
				this.estadofactuimpre.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadofactuimpre =(EstadoFactuImpre) this.estadofactuimpres.toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
				this.estadofactuimpre.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadofactuimpre)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoFactuImpreModel) this.jTableDatosEstadoFactuImpre.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoFactuImpre=true;
				this.inicializarActualizarBindingTablaEstadoFactuImpre(false);
				this.isEsNuevoEstadoFactuImpre=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoFactuImpre(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoFactuImpre(false);
				
				this.habilitarDeshabilitarControlesEstadoFactuImpre(false);
				
				
				
				if(EstadoFactuImpreJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoFactuImpre();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoFactuImpreActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoFactuImpre.getRowCount()>=1) {
				jTableDatosEstadoFactuImpre.removeRowSelectionInterval(0, jTableDatosEstadoFactuImpre.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoFactuImpre(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoFactuImpre(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoFactuImpre(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoFactuImpre(false) ;
			
			this.isEsNuevoEstadoFactuImpre=false;
			
			if(EstadoFactuImpreJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoFactuImpre();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoFactuImpreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoFactuImpre(false);
				
				//SI ES MANUAL
				if(EstadoFactuImpreJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoFactuImpre();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoFactuImpreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoFactuImpre--;			
			//EstadoFactuImpre estadofactuimpreAux= new EstadoFactuImpre();			
			//estadofactuimpreAux.setId(this.iIdNuevoEstadoFactuImpre);
			
			if(this.jInternalFrameDetalleFormEstadoFactuImpre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoFactuImpre();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoFactuImpre(this.estadofactuimpre);
			
			this.estadofactuimpre.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadofactuimpreLogic.getEstadoFactuImpres().add(this.estadofactuimpreAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadofactuimpres.add(this.estadofactuimpreAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoFactuImpre(false);
			
			this.jTableDatosEstadoFactuImpre.setRowSelectionInterval(this.getIndiceNuevoEstadoFactuImpre(), this.getIndiceNuevoEstadoFactuImpre());
			
			int iLastRow =  this.jTableDatosEstadoFactuImpre.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoFactuImpre.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoFactuImpre.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoFactuImpre(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoFactuImpreActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoFactuImpre(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoFactuImpre(false);
			
			//SI ES MANUAL
			if(EstadoFactuImpreJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoFactuImpre();
			}
			
			//this.abrirFrameTreeEstadoFactuImpre();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoFactuImpreActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Factu ImpreS ?", "MANTENIMIENTO DE Estado Factu Impre", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoFactuImpre.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoFactuImpre();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadofactuimpreReturnGeneral=estadofactuimpreLogic.procesarImportacionEstadoFactuImpresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadofactuimpreParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoFactuImpreReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoFactuImpreActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoFactuImpre.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoFactuImpre.setFileImportacion(this.jInternalFrameImportacionEstadoFactuImpre.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoFactuImpre.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoFactuImpre.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoFactuImpre.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoFactuImpre.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoFactuImpreActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoFactuImpre> estadofactuimpresSeleccionados=new ArrayList<EstadoFactuImpre>();		

		estadofactuimpresSeleccionados=this.getEstadoFactuImpresSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoFactuImpreBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoFactuImpreBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoFactuImpres("Todos",estadofactuimpresSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Factu Impre",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoFactuImpreConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoFactuImpreConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoFactuImpreConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoFactuImpreConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoFactuImpreConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoFactuImpreConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoFactuImpreConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoFactuImpreConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoFactuImpreActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoFactuImpre> estadofactuimpresSeleccionados=new ArrayList<EstadoFactuImpre>();		
		
		estadofactuimpresSeleccionados=this.getEstadoFactuImpresSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofactuimpre";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoFactuImpres");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoFactuImpreConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoFactuImpreConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoFactuImpre estadofactuimpre:estadofactuimpresSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadofactuimpre.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoFactuImpreConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoFactuImpreConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoFactuImpre estadofactuimpre:estadofactuimpresSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadofactuimpre.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoFactuImpre(row);				
			//	iRow++;
			//}				
			
			//for(EstadoFactuImpre estadofactuimpreAux:estadofactuimpresSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoFactuImpre(estadofactuimpreAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Factu Impre",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadofactuimpreLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoFactuImpre(false);
			
			//SI ES MANUAL
			if(EstadoFactuImpreJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoFactuImpre();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoFactuImpreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoFactuImpre(false);
			
			//SI ES MANUAL
			if(EstadoFactuImpreJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoFactuImpre();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoFactuImpreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoFactuImpre(false);
			
			//SI ES MANUAL
			if(EstadoFactuImpreJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoFactuImpre();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofactuimpreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoFactuImpre() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoFactuImpre.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoFactuImpre.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoFactuImpre.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoFactuImpre.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoFactuImpre.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoFactuImpre.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoFactuImpre.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoFactuImpre(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoFactuImpre(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoFactuImpre(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoFactuImpre(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoFactuImpre(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoFactuImpre(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoFactuImpre(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoFactuImpre(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoFactuImpreJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoFactuImpreJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoFactuImpre() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoFactuImpre();
		
		this.inicializarActualizarBindingBotonesManualEstadoFactuImpre(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoFactuImpre();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoFactuImpre() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoFactuImpre(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoFactuImpre(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoFactuImpre.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoFactuImpre.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoFactuImpre.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoFactuImpre.jCheckBoxPostAccionNuevoEstadoFactuImpre.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoFactuImpre.jCheckBoxPostAccionSinCerrarEstadoFactuImpre.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoFactuImpre.jCheckBoxPostAccionSinMensajeEstadoFactuImpre.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoFactuImpre.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoFactuImpre.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoFactuImpre.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) {
				this.jInternalFrameDetalleFormEstadoFactuImpre.jCheckBoxPostAccionNuevoEstadoFactuImpre.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoFactuImpre.jCheckBoxPostAccionSinCerrarEstadoFactuImpre.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoFactuImpre.jCheckBoxPostAccionSinMensajeEstadoFactuImpre.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoFactuImpre.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoFactuImpre.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoFactuImpre.jComboBoxTiposAccionesFormularioEstadoFactuImpre.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoFactuImpre.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoFactuImpre!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoFactuImpre.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoFactuImpre.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoFactuImpre.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoFactuImpre.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoFactuImpre!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoFactuImpre.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoFactuImpre.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoFactuImpre(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoFactuImpreJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoFactuImpre(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoFactuImpre() throws Exception {
		try	{
			if(EstadoFactuImpreJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoFactuImpre();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoFactuImpre() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoFactuImpre.jComboBoxTiposAccionesFormularioEstadoFactuImpre.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoFactuImpre.jComboBoxTiposAccionesFormularioEstadoFactuImpre.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoFactuImpre() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoFactuImpre.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoFactuImpre.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoFactuImpre.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoFactuImpre.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoFactuImpre.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoFactuImpre.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoFactuImpre.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoFactuImpre.addItem(reporte);
			}
			
			
			if(!this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoFactuImpre.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoFactuImpre.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoFactuImpre.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoFactuImpre.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoFactuImpre.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoFactuImpre.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoFactuImpre.jComboBoxTiposAccionesFormularioEstadoFactuImpre.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoFactuImpre.jComboBoxTiposAccionesFormularioEstadoFactuImpre.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoFactuImpre.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoFactuImpre.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoFactuImpre.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoFactuImpre();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoFactuImpre() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoFactuImpre!=null) {
				this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoFactuImpre!=null) {
				this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoFactuImpre!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoFactuImpre()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoFactuImpre(Boolean esInicializar) throws Exception {				
		if(EstadoFactuImpreJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoFactuImpre();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoFactuImpre() throws Exception {
		this.inicializarActualizarBindingTablaEstadoFactuImpre(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoFactuImpre() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoFactuImpre.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoFactuImpre.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoFactuImpre.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoFactuImprePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoFactuImpre.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoFactuImpre.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoFactuImprePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoFactuImpreOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoFactuImpreOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoFactuImprePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoFactuImpre.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoFactuImpre.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoFactuImprePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoFactuImpre.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoFactuImpre(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadofactuimpreLogic.getEstadoFactuImpres().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadofactuimpres.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoFactuImpreJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoFactuImpre.setModel(new EstadoFactuImpreModel(this.estadofactuimpreLogic.getEstadoFactuImpres(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoFactuImpre.setModel(new EstadoFactuImpreModel(this.estadofactuimpres,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoFactuImpre!=null && this.jInternalFrameOrderByEstadoFactuImpre.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoFactuImpre();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoFactuImpre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoFactuImpre,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoFactuImprePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO,estadofactuimpreConstantesFunciones.resaltarSeleccionarEstadoFactuImpre,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO,estadofactuimpreConstantesFunciones.resaltarSeleccionarEstadoFactuImpre,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoFactuImpre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoFactuImpre,EstadoFactuImpreConstantesFunciones.LABEL_ID));

		if(this.estadofactuimpreConstantesFunciones.mostraridEstadoFactuImpre && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoFactuImpreConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadofactuimpreConstantesFunciones.resaltaridEstadoFactuImpre,this.estadofactuimpreConstantesFunciones.activaridEstadoFactuImpre,this,true,"idEstadoFactuImpre","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadofactuimpreConstantesFunciones.resaltaridEstadoFactuImpre,this.estadofactuimpreConstantesFunciones.activaridEstadoFactuImpre,this,true,"idEstadoFactuImpre","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoFactuImpre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoFactuImpre,EstadoFactuImpreConstantesFunciones.LABEL_CODIGO));

		if(this.estadofactuimpreConstantesFunciones.mostrarcodigoEstadoFactuImpre && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoFactuImpreConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadofactuimpreConstantesFunciones.resaltarcodigoEstadoFactuImpre,this.estadofactuimpreConstantesFunciones.activarcodigoEstadoFactuImpre,this,true,"codigoEstadoFactuImpre","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadofactuimpreConstantesFunciones.resaltarcodigoEstadoFactuImpre,this.estadofactuimpreConstantesFunciones.activarcodigoEstadoFactuImpre,this,true,"codigoEstadoFactuImpre","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoFactuImprePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoFactuImpre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoFactuImpre,EstadoFactuImpreConstantesFunciones.LABEL_NOMBRE));

		if(this.estadofactuimpreConstantesFunciones.mostrarnombreEstadoFactuImpre && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoFactuImpreConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadofactuimpreConstantesFunciones.resaltarnombreEstadoFactuImpre,this.estadofactuimpreConstantesFunciones.activarnombreEstadoFactuImpre,this,true,"nombreEstadoFactuImpre","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadofactuimpreConstantesFunciones.resaltarnombreEstadoFactuImpre,this.estadofactuimpreConstantesFunciones.activarnombreEstadoFactuImpre,this,true,"nombreEstadoFactuImpre","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoFactuImprePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadofactuimpreSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosFacturaImpresion && this.estadofactuimpreConstantesFunciones.mostrarFacturaImpresionEstadoFactuImpre && !EstadoFactuImpreConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Factura Impresiones");
				tableColumn.setHeaderValue("Factura Impresiones");
				tableColumn.setCellRenderer(new FacturaImpresionTableCell(estadofactuimpreConstantesFunciones.resaltarFacturaImpresionEstadoFactuImpre,this,this.estadofactuimpreConstantesFunciones.activarFacturaImpresionEstadoFactuImpre));
				tableColumn.setCellEditor(new FacturaImpresionTableCell(estadofactuimpreConstantesFunciones.resaltarFacturaImpresionEstadoFactuImpre,this,this.estadofactuimpreConstantesFunciones.activarFacturaImpresionEstadoFactuImpre));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoFactuImpre.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadofactuimpreSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadofactuimpreSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoFactuImpre.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadofactuimpreSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadofactuimpreSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoFactuImpre.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoFactuImpre && this.isPermisoGuardarCambiosEstadoFactuImpre) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadofactuimpreSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadofactuimpreSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoFactuImpre.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadofactuimpreSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoFactuImpre.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoFactuImpre.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoFactuImpre && this.isPermisoGuardarCambiosEstadoFactuImpre) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadofactuimpreSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoFactuImpre && this.isPermisoGuardarCambiosEstadoFactuImpre) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoFactuImpre.moveColumn(this.jTableDatosEstadoFactuImpre.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoFactuImpre.moveColumn(this.jTableDatosEstadoFactuImpre.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadofactuimpreSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoFactuImpre.moveColumn(this.jTableDatosEstadoFactuImpre.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoFactuImpre.moveColumn(this.jTableDatosEstadoFactuImpre.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoFactuImpre.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoFactuImpre.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoFactuImpre,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoFactuImpreJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoFactuImpre.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoFactuImpre.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoFactuImpreJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoFactuImpreJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoFactuImpre.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoFactuImpre.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoFactuImpre.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadofactuimpreLogic.getEstadoFactuImpres().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadofactuimpres.size()-1;
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
		//this.jTableDatosEstadoFactuImpre.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoFactuImpre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoFactuImpre();
			
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
				
				//this.isEsNuevoEstadoFactuImpre=false;
					
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
			
				if(this.estadofactuimpreSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoFactuImpre==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoFactuImpre.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoFactuImpre.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofactuimpre =(EstadoFactuImpre) this.estadofactuimpreLogic.getEstadoFactuImpres().toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofactuimpre =(EstadoFactuImpre) this.estadofactuimpres.toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadofactuimpre.getsType().equals("DUPLICADO")
				   || this.estadofactuimpre.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoFactuImpre=true;
				
				} else {
					this.isEsNuevoEstadoFactuImpre=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
					if(this.estadofactuimpre.getId()>=0 && !this.estadofactuimpre.getIsNew()) {						
						this.isEsNuevoEstadoFactuImpre=false;
						
					} else {
						this.isEsNuevoEstadoFactuImpre=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoFactuImpre(esRelaciones);						
				
				this.seleccionarEstadoFactuImpre(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadofactuimpre.getId()<0) {
					this.isEsNuevoEstadoFactuImpre=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoFactuImpre(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoFactuImpre(evt,rowIndex);
				}	
				
				if(this.estadofactuimpreSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoFactuImpre: " + this.dDif); 
					}
				}								
				
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoFactuImpre(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadofactuimpre)) {
					if(this.estadofactuimpre.getId()>0) {
						this.estadofactuimpre.setIsDeleted(true);
						
						this.estadofactuimpresEliminados.add(this.estadofactuimpre);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadofactuimpreLogic.getEstadoFactuImpres().remove(this.estadofactuimpre);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadofactuimpres.remove(this.estadofactuimpre);				
					}
					
					
					((EstadoFactuImpreModel) this.jTableDatosEstadoFactuImpre.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoFactuImpre(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoFactuImpre(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoFactuImpre) {
			
			if(this.jInternalFrameDetalleFormEstadoFactuImpre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoFactuImpre.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoFactuImpre.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofactuimpre =(EstadoFactuImpre) this.estadofactuimpreLogic.getEstadoFactuImpres().toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofactuimpre =(EstadoFactuImpre) this.estadofactuimpres.toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoFactuImpreJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoFactuImpre(this.estadofactuimpre);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoFactuImpre("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoFactuImpre(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoFactuImpre() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoFactuImpre(EstadoFactuImpre estadofactuimpre) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoFactuImpre(estadofactuimpre,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoFactuImpre(EstadoFactuImpre estadofactuimpre,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoFactuImpre(estadofactuimpre);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoFactuImpre(estadofactuimpre,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoFactuImpre(estadofactuimpre);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoFactuImpre(EstadoFactuImpre estadofactuimpre) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoFactuImpre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoFactuImpre.jLabelidEstadoFactuImpre.setText(estadofactuimpre.getId().toString());
			this.jInternalFrameDetalleFormEstadoFactuImpre.jTextFieldcodigoEstadoFactuImpre.setText(estadofactuimpre.getcodigo());
			this.jInternalFrameDetalleFormEstadoFactuImpre.jTextAreanombreEstadoFactuImpre.setText(estadofactuimpre.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoFactuImpre estadofactuimpreLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadofactuimpreLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoFactuImpre estadofactuimpreLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadofactuimpreLocal=this.estadofactuimpre;
			} else {
				estadofactuimpreLocal=this.estadofactuimpreAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadofactuimpreLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoFactuImpre(estadofactuimpreLocal,true);
					
					if(estadofactuimpreSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadofactuimpreLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadofactuimpreLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoFactuImpre(EstadoFactuImpre estadofactuimpre,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoFactuImpre(estadofactuimpre,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoFactuImpre(estadofactuimpre);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoFactuImpre(EstadoFactuImpre estadofactuimpre,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoFactuImpre(estadofactuimpre,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoFactuImpre(EstadoFactuImpre estadofactuimpre,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoFactuImpre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoFactuImpre.jLabelidEstadoFactuImpre.getText()==null || this.jInternalFrameDetalleFormEstadoFactuImpre.jLabelidEstadoFactuImpre.getText()=="" || this.jInternalFrameDetalleFormEstadoFactuImpre.jLabelidEstadoFactuImpre.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoFactuImpre.jLabelidEstadoFactuImpre.setText("0");
			}

			if(conColumnasBase) {estadofactuimpre.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoFactuImpre.jLabelidEstadoFactuImpre.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoFactuImpreConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoFactuImpre.jLabelIdEstadoFactuImpre,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadofactuimpre.setcodigo(this.jInternalFrameDetalleFormEstadoFactuImpre.jTextFieldcodigoEstadoFactuImpre.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoFactuImpreConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoFactuImpre.jLabelcodigoEstadoFactuImpre,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadofactuimpre.setnombre(this.jInternalFrameDetalleFormEstadoFactuImpre.jTextAreanombreEstadoFactuImpre.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoFactuImpreConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoFactuImpre.jLabelnombreEstadoFactuImpre,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoFactuImpre(EstadoFactuImpre estadofactuimpreBean,EstadoFactuImpre estadofactuimpre,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoFactuImpre(EstadoFactuImpre estadofactuimpreOrigen,EstadoFactuImpre estadofactuimpre,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadofactuimpreOrigen.getId()!=null && !estadofactuimpreOrigen.getId().equals(0L))) {estadofactuimpre.setId(estadofactuimpreOrigen.getId());}}
			if(conDefault || (!conDefault && estadofactuimpreOrigen.getcodigo()!=null && !estadofactuimpreOrigen.getcodigo().equals(""))) {estadofactuimpre.setcodigo(estadofactuimpreOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadofactuimpreOrigen.getnombre()!=null && !estadofactuimpreOrigen.getnombre().equals(""))) {estadofactuimpre.setnombre(estadofactuimpreOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoFactuImpre(EstadoFactuImpre estadofactuimpre) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoFactuImpre.jLabelidEstadoFactuImpre.setText(estadofactuimpre.getId().toString());
			this.jInternalFrameDetalleFormEstadoFactuImpre.jTextFieldcodigoEstadoFactuImpre.setText(estadofactuimpre.getcodigo());
			this.jInternalFrameDetalleFormEstadoFactuImpre.jTextAreanombreEstadoFactuImpre.setText(estadofactuimpre.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoFactuImpre(EstadoFactuImpreBean estadofactuimpreBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoFactuImpre.jLabelidEstadoFactuImpre.setText(estadofactuimpreBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoFactuImpre.jTextFieldcodigoEstadoFactuImpre.setText(estadofactuimpreBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoFactuImpre.jTextAreanombreEstadoFactuImpre.setText(estadofactuimpreBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoFactuImpre(EstadoFactuImpreParameterReturnGeneral estadofactuimpreReturnGeneral,EstadoFactuImpreBean estadofactuimpreBean,Boolean conDefault) throws Exception { 
		try {
			EstadoFactuImpre estadofactuimpreLocal=new EstadoFactuImpre();
			
			estadofactuimpreLocal=estadofactuimpreReturnGeneral.getEstadoFactuImpre();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadofactuimpreLocal.getId()!=null && !estadofactuimpreLocal.getId().equals(0L))) {estadofactuimpreBean.setId(estadofactuimpreLocal.getId());}}
			if(conDefault || (!conDefault && estadofactuimpreLocal.getcodigo()!=null && !estadofactuimpreLocal.getcodigo().equals(""))) {estadofactuimpreBean.setcodigo(estadofactuimpreLocal.getcodigo());}
			if(conDefault || (!conDefault && estadofactuimpreLocal.getnombre()!=null && !estadofactuimpreLocal.getnombre().equals(""))) {estadofactuimpreBean.setnombre(estadofactuimpreLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoFactuImpreGenerico(Long idEstadoFactuImpreSeleccionado,JComboBox jComboBoxEstadoFactuImpre,List<EstadoFactuImpre> estadofactuimpresLocal)throws Exception {
		try {
			EstadoFactuImpre  estadofactuimpreTemp=null;

			for(EstadoFactuImpre estadofactuimpreAux:estadofactuimpresLocal) {
				if(estadofactuimpreAux.getId()!=null && estadofactuimpreAux.getId().equals(idEstadoFactuImpreSeleccionado)) {
					estadofactuimpreTemp=estadofactuimpreAux;
					break;
				}
			}

			jComboBoxEstadoFactuImpre.setSelectedItem(estadofactuimpreTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoFactuImpreGenerico(JComboBox jComboBoxEstadoFactuImpre,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoFactuImpre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoFactuImpre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoFactuImpre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoFactuImpre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoFactuImpre.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoFactuImpre.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoFactuImpre.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoFactuImpre.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoFactuImpre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoFactuImpre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("FacturaImpresion")) {
			jButtonFacturaImpresionActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadofactuimpre=(EstadoFactuImpre) estadofactuimpreLogic.getEstadoFactuImpres().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadofactuimpre =(EstadoFactuImpre) estadofactuimpres.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoFactuImpre estadofactuimpreRow=new EstadoFactuImpre();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadofactuimpreRow=(EstadoFactuImpre) estadofactuimpreLogic.getEstadoFactuImpres().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadofactuimpreRow=(EstadoFactuImpre) estadofactuimpres.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonFacturaImpresionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoFactuImpre estadofactuimpre) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoFactuImpre==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofactuimpreLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadofactuimpre = (EstadoFactuImpre)this.estadofactuimpreLogic.getEstadoFactuImpres().toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadofactuimpre = (EstadoFactuImpre)this.estadofactuimpres.toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadofactuimpre!=null) {
						this.estadofactuimpre = estadofactuimpre;
					} else {
						this.estadofactuimpre = new EstadoFactuImpre();
					}
				}

				if(this.isTienePermisosFacturaImpresion && this.permiteMantenimiento(this.estadofactuimpre)) {
					FacturaImpresionBeanSwingJInternalFrame facturaimpresionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFramePopup=new FacturaImpresionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						facturaimpresionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFramePopup;
					} else {
						facturaimpresionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame;
					}

					List<EstadoFactuImpre> estadofactuimpres=new ArrayList<EstadoFactuImpre>();
					estadofactuimpres.add(this.estadofactuimpre);
					if(!esRelacionado) {
						//facturaimpresionBeanSwingJInternalFrame.facturaimpresionSessionBean.setConGuardarRelaciones(false);
						//facturaimpresionBeanSwingJInternalFrame.facturaimpresionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					facturaimpresionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoFactuImpre.cargarFacturaImpresionBeanSwingJInternalFrame(estadofactuimpres,this.estadofactuimpre,facturaimpresionBeanSwingJInternalFrame,/*conInicializar,*/facturaimpresionBeanSwingJInternalFrame.facturaimpresionSessionBean.getConGuardarRelaciones(),facturaimpresionBeanSwingJInternalFrame.facturaimpresionSessionBean.getEsGuardarRelacionado());
					facturaimpresionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						facturaimpresionBeanSwingJInternalFrame.actualizarEstadoPanelsFacturaImpresion("no_relacionado");

						facturaimpresionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FacturaImpresionConstantesFunciones.ITAMANIOFILATABLA + (FacturaImpresionConstantesFunciones.ITAMANIOFILATABLA/2));

						facturaimpresionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoFactuImpre=(TitledBorder)this.jScrollPanelDatosEstadoFactuImpre.getBorder();
						TitledBorder titledBorderFacturaImpresion=(TitledBorder)facturaimpresionBeanSwingJInternalFrame.jScrollPanelDatosFacturaImpresion.getBorder();

						titledBorderFacturaImpresion.setTitle(titledBorderEstadoFactuImpre.getTitle() + " -> Factura Impresion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,facturaimpresionBeanSwingJInternalFrame);
						}

						facturaimpresionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(facturaimpresionBeanSwingJInternalFrame);

						facturaimpresionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadofactuimpreSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Factura Impresion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofactuimpreLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofactuimpreLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofactuimpreLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoFactuImpre(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoFactuImpre.setVisible((this.isVisibilidadCeldaNuevoEstadoFactuImpre && this.isPermisoNuevoEstadoFactuImpre));			
			this.jButtonDuplicarEstadoFactuImpre.setVisible((this.isVisibilidadCeldaDuplicarEstadoFactuImpre && this.isPermisoDuplicarEstadoFactuImpre));			
			this.jButtonCopiarEstadoFactuImpre.setVisible((this.isVisibilidadCeldaCopiarEstadoFactuImpre && this.isPermisoCopiarEstadoFactuImpre));
			this.jButtonVerFormEstadoFactuImpre.setVisible((this.isVisibilidadCeldaVerFormEstadoFactuImpre && this.isPermisoVerFormEstadoFactuImpre));
			
			this.jButtonAbrirOrderByEstadoFactuImpre.setVisible((this.isVisibilidadCeldaOrdenEstadoFactuImpre && this.isPermisoOrdenEstadoFactuImpre));			
			
			this.jButtonNuevoRelacionesEstadoFactuImpre.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoFactuImpre && this.isPermisoNuevoEstadoFactuImpre));			
			this.jButtonNuevoGuardarCambiosEstadoFactuImpre.setVisible((this.isVisibilidadCeldaNuevoEstadoFactuImpre && this.isPermisoNuevoEstadoFactuImpre && this.isPermisoGuardarCambiosEstadoFactuImpre));
			
			if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) {
			this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonModificarEstadoFactuImpre.setVisible((this.isVisibilidadCeldaModificarEstadoFactuImpre && this.isPermisoActualizarEstadoFactuImpre));	
			this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonActualizarEstadoFactuImpre.setVisible((this.isVisibilidadCeldaActualizarEstadoFactuImpre && this.isPermisoActualizarEstadoFactuImpre));	
			this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonEliminarEstadoFactuImpre.setVisible((this.isVisibilidadCeldaEliminarEstadoFactuImpre && this.isPermisoEliminarEstadoFactuImpre));
			this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonCancelarEstadoFactuImpre.setVisible(this.isVisibilidadCeldaCancelarEstadoFactuImpre);							
			this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonGuardarCambiosEstadoFactuImpre.setVisible((this.isVisibilidadCeldaGuardarEstadoFactuImpre && this.isPermisoGuardarCambiosEstadoFactuImpre));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoFactuImpre.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoFactuImpre && this.isPermisoGuardarCambiosEstadoFactuImpre));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoFactuImpre.setVisible((this.isVisibilidadCeldaNuevoEstadoFactuImpre && this.isPermisoNuevoEstadoFactuImpre));						
			this.jButtonDuplicarToolBarEstadoFactuImpre.setVisible((this.isVisibilidadCeldaDuplicarEstadoFactuImpre && this.isPermisoDuplicarEstadoFactuImpre));						
			this.jButtonCopiarToolBarEstadoFactuImpre.setVisible((this.isVisibilidadCeldaCopiarEstadoFactuImpre && this.isPermisoCopiarEstadoFactuImpre));			
			this.jButtonVerFormToolBarEstadoFactuImpre.setVisible((this.isVisibilidadCeldaVerFormEstadoFactuImpre && this.isPermisoVerFormEstadoFactuImpre));			
			this.jButtonAbrirOrderByToolBarEstadoFactuImpre.setVisible((this.isVisibilidadCeldaOrdenEstadoFactuImpre && this.isPermisoOrdenEstadoFactuImpre));
			this.jButtonNuevoRelacionesToolBarEstadoFactuImpre.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoFactuImpre && this.isPermisoNuevoEstadoFactuImpre));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoFactuImpre.setVisible((this.isVisibilidadCeldaNuevoEstadoFactuImpre && this.isPermisoNuevoEstadoFactuImpre && this.isPermisoGuardarCambiosEstadoFactuImpre));			
			
			if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) {
			this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonModificarToolBarEstadoFactuImpre.setVisible((this.isVisibilidadCeldaModificarEstadoFactuImpre && this.isPermisoActualizarEstadoFactuImpre));	
			this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonActualizarToolBarEstadoFactuImpre.setVisible((this.isVisibilidadCeldaActualizarEstadoFactuImpre  && this.isPermisoActualizarEstadoFactuImpre));	
			this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonEliminarToolBarEstadoFactuImpre.setVisible((this.isVisibilidadCeldaEliminarEstadoFactuImpre && this.isPermisoEliminarEstadoFactuImpre));
			this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonCancelarToolBarEstadoFactuImpre.setVisible(this.isVisibilidadCeldaCancelarEstadoFactuImpre);				
			this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonGuardarCambiosToolBarEstadoFactuImpre.setVisible((this.isVisibilidadCeldaGuardarEstadoFactuImpre && this.isPermisoGuardarCambiosEstadoFactuImpre));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoFactuImpre.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoFactuImpre && this.isPermisoGuardarCambiosEstadoFactuImpre));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoFactuImpre.setVisible((this.isVisibilidadCeldaNuevoEstadoFactuImpre && this.isPermisoNuevoEstadoFactuImpre));			
			this.jMenuItemDuplicarEstadoFactuImpre.setVisible((this.isVisibilidadCeldaDuplicarEstadoFactuImpre && this.isPermisoDuplicarEstadoFactuImpre));			
			this.jMenuItemCopiarEstadoFactuImpre.setVisible((this.isVisibilidadCeldaCopiarEstadoFactuImpre && this.isPermisoCopiarEstadoFactuImpre));			
			this.jMenuItemVerFormEstadoFactuImpre.setVisible((this.isVisibilidadCeldaVerFormEstadoFactuImpre && this.isPermisoVerFormEstadoFactuImpre));			
			this.jMenuItemAbrirOrderByEstadoFactuImpre.setVisible((this.isVisibilidadCeldaOrdenEstadoFactuImpre && this.isPermisoOrdenEstadoFactuImpre));			
			//this.jMenuItemMostrarOcultarEstadoFactuImpre.setVisible((this.isVisibilidadCeldaOrdenEstadoFactuImpre && this.isPermisoOrdenEstadoFactuImpre));
			this.jMenuItemDetalleAbrirOrderByEstadoFactuImpre.setVisible((this.isVisibilidadCeldaOrdenEstadoFactuImpre && this.isPermisoOrdenEstadoFactuImpre));			
			//this.jMenuItemDetalleMostrarOcultarEstadoFactuImpre.setVisible((this.isVisibilidadCeldaOrdenEstadoFactuImpre && this.isPermisoOrdenEstadoFactuImpre));			
			this.jMenuItemNuevoRelacionesEstadoFactuImpre.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoFactuImpre && this.isPermisoNuevoEstadoFactuImpre));			
			this.jMenuItemNuevoGuardarCambiosEstadoFactuImpre.setVisible((this.isVisibilidadCeldaNuevoEstadoFactuImpre && this.isPermisoNuevoEstadoFactuImpre && this.isPermisoGuardarCambiosEstadoFactuImpre));									
			
			if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) {
			this.jInternalFrameDetalleFormEstadoFactuImpre.jMenuItemModificarEstadoFactuImpre.setVisible((this.isVisibilidadCeldaModificarEstadoFactuImpre && this.isPermisoActualizarEstadoFactuImpre));	
			this.jInternalFrameDetalleFormEstadoFactuImpre.jMenuItemActualizarEstadoFactuImpre.setVisible((this.isVisibilidadCeldaActualizarEstadoFactuImpre && this.isPermisoActualizarEstadoFactuImpre));	
			this.jInternalFrameDetalleFormEstadoFactuImpre.jMenuItemEliminarEstadoFactuImpre.setVisible((this.isVisibilidadCeldaEliminarEstadoFactuImpre && this.isPermisoEliminarEstadoFactuImpre));
			this.jInternalFrameDetalleFormEstadoFactuImpre.jMenuItemCancelarEstadoFactuImpre.setVisible(this.isVisibilidadCeldaCancelarEstadoFactuImpre);				
			}
			
			this.jMenuItemGuardarCambiosEstadoFactuImpre.setVisible((this.isVisibilidadCeldaGuardarEstadoFactuImpre && this.isPermisoGuardarCambiosEstadoFactuImpre));						
			this.jMenuItemGuardarCambiosTablaEstadoFactuImpre.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoFactuImpre && this.isPermisoGuardarCambiosEstadoFactuImpre));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoFactuImpre=this.jButtonNuevoEstadoFactuImpre.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoFactuImpre=this.jButtonDuplicarEstadoFactuImpre.isVisible();
			this.isVisibilidadCeldaCopiarEstadoFactuImpre=this.jButtonCopiarEstadoFactuImpre.isVisible();
			this.isVisibilidadCeldaVerFormEstadoFactuImpre=this.jButtonVerFormEstadoFactuImpre.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoFactuImpre=this.jButtonAbrirOrderByEstadoFactuImpre.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoFactuImpre=this.jButtonNuevoRelacionesEstadoFactuImpre.isVisible();
			this.isVisibilidadCeldaModificarEstadoFactuImpre=this.jButtonModificarEstadoFactuImpre.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) {
			this.isVisibilidadCeldaActualizarEstadoFactuImpre=this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonActualizarEstadoFactuImpre.isVisible();
			this.isVisibilidadCeldaEliminarEstadoFactuImpre=this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonEliminarEstadoFactuImpre.isVisible();
			this.isVisibilidadCeldaCancelarEstadoFactuImpre=this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonCancelarEstadoFactuImpre.isVisible();
			this.isVisibilidadCeldaGuardarEstadoFactuImpre=this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonGuardarCambiosEstadoFactuImpre.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoFactuImpre=this.jButtonGuardarCambiosTablaEstadoFactuImpre.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoFactuImpre=this.jButtonNuevoToolBarEstadoFactuImpre.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoFactuImpre=this.jButtonNuevoRelacionesToolBarEstadoFactuImpre.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) {
			this.isVisibilidadCeldaModificarEstadoFactuImpre=this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonModificarToolBarEstadoFactuImpre.isVisible();
			this.isVisibilidadCeldaActualizarEstadoFactuImpre=this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonActualizarToolBarEstadoFactuImpre.isVisible();
			this.isVisibilidadCeldaEliminarEstadoFactuImpre=this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonEliminarToolBarEstadoFactuImpre.isVisible();
			this.isVisibilidadCeldaCancelarEstadoFactuImpre=this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonCancelarToolBarEstadoFactuImpre.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoFactuImpre=this.jButtonGuardarCambiosToolBarEstadoFactuImpre.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoFactuImpre=this.jButtonGuardarCambiosTablaToolBarEstadoFactuImpre.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoFactuImpre=this.jMenuItemNuevoEstadoFactuImpre.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoFactuImpre=this.jMenuItemNuevoRelacionesEstadoFactuImpre.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) {
			this.isVisibilidadCeldaModificarEstadoFactuImpre=this.jInternalFrameDetalleFormEstadoFactuImpre.jMenuItemModificarEstadoFactuImpre.isVisible();
			this.isVisibilidadCeldaActualizarEstadoFactuImpre=this.jInternalFrameDetalleFormEstadoFactuImpre.jMenuItemActualizarEstadoFactuImpre.isVisible();
			this.isVisibilidadCeldaEliminarEstadoFactuImpre=this.jInternalFrameDetalleFormEstadoFactuImpre.jMenuItemEliminarEstadoFactuImpre.isVisible();
			this.isVisibilidadCeldaCancelarEstadoFactuImpre=this.jInternalFrameDetalleFormEstadoFactuImpre.jMenuItemCancelarEstadoFactuImpre.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoFactuImpre=this.jMenuItemGuardarCambiosEstadoFactuImpre.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoFactuImpre=this.jMenuItemGuardarCambiosTablaEstadoFactuImpre.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoFactuImpre(Boolean esInicializar) {
		if(EstadoFactuImpreJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadofactuimpreSessionBean.getConGuardarRelaciones()) {
				//if(this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoFactuImpre();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoFactuImpre(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoFactuImpre() {
		this.jButtonNuevoEstadoFactuImpre.setVisible(this.isPermisoNuevoEstadoFactuImpre);			
		this.jButtonDuplicarEstadoFactuImpre.setVisible(this.isPermisoDuplicarEstadoFactuImpre);			
		this.jButtonCopiarEstadoFactuImpre.setVisible(this.isPermisoCopiarEstadoFactuImpre);			
		this.jButtonVerFormEstadoFactuImpre.setVisible(this.isPermisoVerFormEstadoFactuImpre);			
		
		this.jButtonAbrirOrderByEstadoFactuImpre.setVisible(this.isPermisoOrdenEstadoFactuImpre);					
		
		this.jButtonNuevoRelacionesEstadoFactuImpre.setVisible(this.isPermisoNuevoEstadoFactuImpre);			
		
		if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonModificarEstadoFactuImpre.setVisible(this.isPermisoActualizarEstadoFactuImpre);	
			this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonActualizarEstadoFactuImpre.setVisible(this.isPermisoActualizarEstadoFactuImpre);	
			this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonEliminarEstadoFactuImpre.setVisible(this.isPermisoEliminarEstadoFactuImpre);
			this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonCancelarEstadoFactuImpre.setVisible(this.isVisibilidadCeldaCancelarEstadoFactuImpre);						
			this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonGuardarCambiosEstadoFactuImpre.setVisible(this.isPermisoGuardarCambiosEstadoFactuImpre);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoFactuImpre.setVisible(this.isPermisoActualizarEstadoFactuImpre);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoFactuImpre() {
		this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonModificarEstadoFactuImpre.setVisible(this.isPermisoActualizarEstadoFactuImpre);	
		this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonActualizarEstadoFactuImpre.setVisible(this.isPermisoActualizarEstadoFactuImpre);	
		this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonEliminarEstadoFactuImpre.setVisible(this.isPermisoEliminarEstadoFactuImpre);
		this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonCancelarEstadoFactuImpre.setVisible(this.isVisibilidadCeldaCancelarEstadoFactuImpre);							
		this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonGuardarCambiosEstadoFactuImpre.setVisible((this.isVisibilidadCeldaGuardarEstadoFactuImpre && this.isPermisoGuardarCambiosEstadoFactuImpre));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoFactuImpre() {
		if(EstadoFactuImpreJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoFactuImpre();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoFactuImpre() {
	}
	
	public void jTableDatosEstadoFactuImpreListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoFactuImpre(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoFactuImpreBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofactuimpreLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoFactuImpre.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoFactuImpre(this.getestadofactuimpre(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFactuImpre(this.estadofactuimpre);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadofactuimpre =(EstadoFactuImpre) this.estadofactuimpreLogic.getEstadoFactuImpres().toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadofactuimpre =(EstadoFactuImpre) this.estadofactuimpres.toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadofactuimpre==null) {
						this.estadofactuimpre = new EstadoFactuImpre();
					}

					this.setVariablesFormularioToObjetoActualEstadoFactuImpre(this.estadofactuimpre,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFactuImpre(this.estadofactuimpre);
				}

				if(this.estadofactuimpre.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadofactuimpre.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoFactuImpre(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofactuimpreLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofactuimpreLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofactuimpreLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoFactuImpreBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofactuimpreLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoFactuImpre.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoFactuImpre(this.getestadofactuimpre(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFactuImpre(this.estadofactuimpre);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadofactuimpre =(EstadoFactuImpre) this.estadofactuimpreLogic.getEstadoFactuImpres().toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadofactuimpre =(EstadoFactuImpre) this.estadofactuimpres.toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadofactuimpre==null) {
						this.estadofactuimpre = new EstadoFactuImpre();
					}

					this.setVariablesFormularioToObjetoActualEstadoFactuImpre(this.estadofactuimpre,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFactuImpre(this.estadofactuimpre);
				}

				if(this.estadofactuimpre.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadofactuimpre.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoFactuImpre(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofactuimpreLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofactuimpreLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofactuimpreLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoFactuImpreBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofactuimpreLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoFactuImpre.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoFactuImpre(this.getestadofactuimpre(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFactuImpre(this.estadofactuimpre);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadofactuimpre =(EstadoFactuImpre) this.estadofactuimpreLogic.getEstadoFactuImpres().toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadofactuimpre =(EstadoFactuImpre) this.estadofactuimpres.toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadofactuimpre==null) {
						this.estadofactuimpre = new EstadoFactuImpre();
					}

					this.setVariablesFormularioToObjetoActualEstadoFactuImpre(this.estadofactuimpre,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFactuImpre(this.estadofactuimpre);
				}

				if(this.estadofactuimpre.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadofactuimpre.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoFactuImpre(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofactuimpreLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofactuimpreLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofactuimpreLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoFactuImpre() {
		if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) {
			this.jInternalFrameDetalleFormEstadoFactuImpre.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoFactuImpre.dispose();
			this.jInternalFrameDetalleFormEstadoFactuImpre=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoFactuImpre!=null) {
			this.jInternalFrameReporteDinamicoEstadoFactuImpre.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoFactuImpre.dispose();
			this.jInternalFrameReporteDinamicoEstadoFactuImpre=null;
		}
		
		if(this.jInternalFrameImportacionEstadoFactuImpre!=null) {
			this.jInternalFrameImportacionEstadoFactuImpre.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoFactuImpre.dispose();
			this.jInternalFrameImportacionEstadoFactuImpre=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoFactuImpre();
			
			EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoFactuImpre")) {
				jButtonNuevoEstadoFactuImpreActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoFactuImpre")) {
				jButtonDuplicarEstadoFactuImpreActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoFactuImpre")) {
				jButtonCopiarEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoFactuImpre")) {
				jButtonVerFormEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoFactuImpre")) {
				jButtonNuevoEstadoFactuImpreActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoFactuImpre")) {
				jButtonDuplicarEstadoFactuImpreActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoFactuImpre")) {
				jButtonNuevoEstadoFactuImpreActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoFactuImpre")) {
				jButtonDuplicarEstadoFactuImpreActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoFactuImpre")) {
				jButtonNuevoEstadoFactuImpreActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoFactuImpre")) {
				jButtonNuevoEstadoFactuImpreActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoFactuImpre")) {
				jButtonNuevoEstadoFactuImpreActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoFactuImpre")) {
				jButtonModificarEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoFactuImpre")) {
				jButtonModificarEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoFactuImpre")) {
				jButtonModificarEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoFactuImpre")) {
				jButtonActualizarEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoFactuImpre")) {
				jButtonActualizarEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoFactuImpre")) {
				jButtonActualizarEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoFactuImpre")) {
				jButtonEliminarEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoFactuImpre")) {
				jButtonEliminarEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoFactuImpre")) {
				jButtonEliminarEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoFactuImpre")) {
				jButtonCancelarEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoFactuImpre")) {
				jButtonCancelarEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoFactuImpre")) {
				jButtonCancelarEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoFactuImpre")) {
				jButtonCerrarEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoFactuImpre")) {
				jButtonCerrarEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoFactuImpre")) {
				jButtonCerrarEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoFactuImpre")) {
				jButtonMostrarOcultarEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoFactuImpre")) {
				jButtonCancelarEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoFactuImpre")) {
				jButtonGuardarCambiosEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoFactuImpre")) {
				jButtonGuardarCambiosEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoFactuImpre")) {
				jButtonCopiarEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoFactuImpre")) {
				jButtonVerFormEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoFactuImpre")) {
				jButtonGuardarCambiosEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoFactuImpre")) {
				jButtonCopiarEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoFactuImpre")) {
				jButtonVerFormEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoFactuImpre")) {
				jButtonGuardarCambiosEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoFactuImpre")) {
				jButtonGuardarCambiosEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoFactuImpre")) {
				jButtonGuardarCambiosEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoFactuImpre")) {
				jButtonRecargarInformacionEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoFactuImpre")) {
				jButtonRecargarInformacionEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoFactuImpre")) {
				jButtonRecargarInformacionEstadoFactuImpreActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoFactuImpre")) {
				jButtonAnterioresEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoFactuImpre")) {
				jButtonAnterioresEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoFactuImpre")) {
				jButtonAnterioresEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoFactuImpre")) {
				jButtonSiguientesEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoFactuImpre")) {
				jButtonSiguientesEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoFactuImpre")) {
				jButtonSiguientesEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoFactuImpre") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoFactuImpre")) {
				jButtonAbrirOrderByEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoFactuImpre") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoFactuImpre")) {
				jButtonMostrarOcultarEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoFactuImpre")) {
				jButtonNuevoGuardarCambiosEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoFactuImpre")) {
				jButtonNuevoGuardarCambiosEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoFactuImpre")) {
				jButtonNuevoGuardarCambiosEstadoFactuImpreActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoFactuImpre")) {
				jButtonCerrarReporteDinamicoEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoFactuImpre")) {
				jButtonGenerarReporteDinamicoEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoFactuImpre")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoFactuImpreActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoFactuImpre")) {
				jButtonCerrarImportacionEstadoFactuImpreActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoFactuImpre")) {
				
				jButtonGenerarImportacionEstadoFactuImpreActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoFactuImpre")) {
				
				jButtonAbrirImportacionEstadoFactuImpreActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoFactuImpre")) {
				jComboBoxTiposAccionesEstadoFactuImpreActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoFactuImpre")) {
				jComboBoxTiposRelacionesEstadoFactuImpreActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoFactuImpre")) {
				jComboBoxTiposAccionesEstadoFactuImpreActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoFactuImpre")) {
				
				jComboBoxTiposSeleccionarEstadoFactuImpreActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoFactuImpre")) {
				jTextFieldValorCampoGeneralEstadoFactuImpreActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoFactuImpre")) {
				jButtonAbrirOrderByEstadoFactuImpreActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoFactuImpre")) {
				jButtonAbrirOrderByEstadoFactuImpreActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoFactuImpre")) {
				jButtonCerrarOrderByEstadoFactuImpreActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoFactuImpreBusqueda")) {
				this.jButtonidEstadoFactuImpreBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoFactuImpreBusqueda")) {
				this.jButtoncodigoEstadoFactuImpreBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoFactuImpreBusqueda")) {
				this.jButtonnombreEstadoFactuImpreBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoFactuImpre();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFactuImpreActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofactuimpre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofactuimpre);
				
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
				
				


				
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFactuImpre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFactuImpre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoFactuImpre estadofactuimpreLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadofactuimpreLocal=this.estadofactuimpre;
			} else {
				estadofactuimpreLocal=this.estadofactuimpreAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofactuimpre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofactuimpre);
				
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
							
				
				


				
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFactuImpre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFactuImpre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFactuImpreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoFactuImpre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofactuimpreAnterior =(EstadoFactuImpre) this.estadofactuimpreLogic.getEstadoFactuImpres().toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofactuimpreAnterior =(EstadoFactuImpre) this.estadofactuimpres.toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
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
			
			EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
			
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
			
			


			
			EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFactuImpreActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofactuimpre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofactuimpre);
				
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
								
						
				


				
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFactuImpre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFactuImpre.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofactuimpre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofactuimpre);
				
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
								
				
				


				
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFactuImpre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFactuImpre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFactuImpreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoFactuImpre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofactuimpreAnterior =(EstadoFactuImpre) this.estadofactuimpreLogic.getEstadoFactuImpres().toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofactuimpreAnterior =(EstadoFactuImpre) this.estadofactuimpres.toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofactuimpre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofactuimpre);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFactuImpreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoFactuImpre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofactuimpreAnterior =(EstadoFactuImpre) this.estadofactuimpreLogic.getEstadoFactuImpres().toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofactuimpreAnterior =(EstadoFactuImpre) this.estadofactuimpres.toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFactuImpreActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofactuimpre);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadofactuimpre);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofactuimpre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofactuimpre);
				
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
							
				
				


				
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFactuImpre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFactuImpre.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFactuImpreActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoFactuImpre.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadofactuimpreAnterior =(EstadoFactuImpre) this.estadofactuimpreLogic.getEstadoFactuImpres().toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadofactuimpreAnterior =(EstadoFactuImpre) this.estadofactuimpres.toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
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
			
			EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
			
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
			
			


			
			EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFactuImpreActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofactuimpre);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadofactuimpre);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofactuimpre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofactuimpre);
				
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
								
				
				


				
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFactuImpre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFactuImpre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFactuImpreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoFactuImpre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofactuimpreAnterior =(EstadoFactuImpre) this.estadofactuimpreLogic.getEstadoFactuImpres().toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofactuimpreAnterior =(EstadoFactuImpre) this.estadofactuimpres.toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFactuImpreActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofactuimpre);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadofactuimpre);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFactuImpreActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofactuimpre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofactuimpre);
				
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoFactuImpre")) {
					jCheckBoxSeleccionarTodosEstadoFactuImpreItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoFactuImpre")) {
					jCheckBoxSeleccionadosEstadoFactuImpreItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoFactuImpre")) {
					
				}
				
				


				
				
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFactuImpre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFactuImpre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofactuimpre);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadofactuimpre);
				
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
												
				
				


				
				
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFactuImpre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFactuImpre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFactuImpreActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoFactuImpre.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadofactuimpreAnterior =(EstadoFactuImpre) this.estadofactuimpreLogic.getEstadoFactuImpres().toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadofactuimpreAnterior =(EstadoFactuImpre) this.estadofactuimpres.toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFactuImpreActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofactuimpre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofactuimpre);
				
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
				
				
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
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
			
			EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
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
			
			


			
			EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFactuImpreActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofactuimpre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofactuimpre);
				
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFactuImpre.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFactuImpre.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofactuimpre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofactuimpre);
				
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
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
				
				


				
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFactuImpre.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFactuImpre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFactuImpreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoFactuImpre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofactuimpreAnterior =(EstadoFactuImpre) this.estadofactuimpreLogic.getEstadoFactuImpres().toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofactuimpreAnterior =(EstadoFactuImpre) this.estadofactuimpres.toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoFactuImpre")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoFactuImpreListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoFactuImpre.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadofactuimpre =(EstadoFactuImpre) this.estadofactuimpreLogic.getEstadoFactuImpres().toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadofactuimpre =(EstadoFactuImpre) this.estadofactuimpres.toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadofactuimpre);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoFactuImpre")) {
				
				}
				
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoFactuImpre")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoFactuImpre.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoFactuImpre")) {
			
			}
			
			EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoFactuImpre();
			
			EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoFactuImpre")) {
				jButtonNuevoEstadoFactuImpreActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoFactuImpre")) {
				jButtonDuplicarEstadoFactuImpreActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoFactuImpre")) {
				jButtonCopiarEstadoFactuImpreActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoFactuImpre")) {
				jButtonVerFormEstadoFactuImpreActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoFactuImpre")) {
				jButtonNuevoEstadoFactuImpreActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoFactuImpre")) {
				jButtonModificarEstadoFactuImpreActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoFactuImpre")) {
				jButtonActualizarEstadoFactuImpreActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoFactuImpre")) {
				jButtonEliminarEstadoFactuImpreActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoFactuImpre")) {
				jButtonGuardarCambiosEstadoFactuImpreActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoFactuImpre")) {
				jButtonCancelarEstadoFactuImpreActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoFactuImpre")) {
				jButtonCerrarEstadoFactuImpreActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoFactuImpre")) {
				jButtonGuardarCambiosEstadoFactuImpreActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoFactuImpre")) {
				jButtonNuevoGuardarCambiosEstadoFactuImpreActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoFactuImpre")) {
				jButtonAbrirOrderByEstadoFactuImpreActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoFactuImpre")) {
				jButtonRecargarInformacionEstadoFactuImpreActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoFactuImpre")) {
				jButtonAnterioresEstadoFactuImpreActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoFactuImpre")) {
				jButtonSiguientesEstadoFactuImpreActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoFactuImpreBusqueda")) {
				this.jButtonidEstadoFactuImpreBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoFactuImpreBusqueda")) {
				this.jButtoncodigoEstadoFactuImpreBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoFactuImpreBusqueda")) {
				this.jButtonnombreEstadoFactuImpreBusquedaActionPerformed(evt);
			}
			
			EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoFactuImpre();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoFactuImpre")) {
				closingInternalFrameEstadoFactuImpre();
				
			} else if(sTipo.equals("jButtonCancelarEstadoFactuImpre")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoFactuImpre = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoFactuImpreBeanSwingJInternalFrame jInternalFrameParent=(EstadoFactuImpreBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoFactuImpre.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoFactuImpreActionPerformed(null);
			}
			
			EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadofactuimpre,new Object(),this.estadofactuimpreParameterGeneral,this.estadofactuimpreReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoFactuImpre(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoFactuImpre(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoFactuImpre(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadofactuimpre)) {
			if(!esControlTabla) {
				if(EstadoFactuImpreJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoFactuImpre(this.estadofactuimpre,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFactuImpre(this.estadofactuimpre);			
				}
				
				if(this.estadofactuimpreSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoFactuImpre(this.estadofactuimpre,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadofactuimpreReturnGeneral=estadofactuimpreLogic.procesarEventosEstadoFactuImpresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadofactuimpreLogic.getEstadoFactuImpres(),this.estadofactuimpre,this.estadofactuimpreParameterGeneral,this.isEsNuevoEstadoFactuImpre,classes);//this.estadofactuimpreLogic.getEstadoFactuImpre()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoFactuImpre(this.estadofactuimpreReturnGeneral,this.estadofactuimpreBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadofactuimpreSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoFactuImpre(classes,this.estadofactuimpreReturnGeneral,this.estadofactuimpreBean,false);
					}
						
					if(this.estadofactuimpreReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoFactuImpre(this.estadofactuimpreReturnGeneral.getEstadoFactuImpre());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoFactuImpre(this.estadofactuimpreReturnGeneral.getEstadoFactuImpre());	
					}
						
					if(this.estadofactuimpreReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoFactuImpre(this.estadofactuimpreReturnGeneral.getEstadoFactuImpre(),classes);//this.estadofactuimpreBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoFactuImpre(this.estadofactuimpre,classes);//this.estadofactuimpreBean);									
				}
			
				if(EstadoFactuImpreJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoFactuImpre(this.estadofactuimpre,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFactuImpre(this.estadofactuimpre);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadofactuimpreAnterior!=null) {
						this.estadofactuimpre=this.estadofactuimpreAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadofactuimpreReturnGeneral=estadofactuimpreLogic.procesarEventosEstadoFactuImpresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadofactuimpreLogic.getEstadoFactuImpres(),this.estadofactuimpre,this.estadofactuimpreParameterGeneral,this.isEsNuevoEstadoFactuImpre,classes);//this.estadofactuimpreLogic.getEstadoFactuImpre()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadofactuimpreSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadofactuimpreSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadofactuimpreReturnGeneral.getEstadoFactuImpre(),estadofactuimpreLogic.getEstadoFactuImpres());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadofactuimpreReturnGeneral.getEstadoFactuImpre(),this.estadofactuimpres);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoFactuImpre.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoFactuImpre.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoFactuImpre();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoFactuImpre() throws Exception {
		
		EstadoFactuImpreModel estadofactuimpreModel=(EstadoFactuImpreModel)this.jTableDatosEstadoFactuImpre.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadofactuimpreModel.estadofactuimpres=this.estadofactuimpreLogic.getEstadoFactuImpres();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadofactuimpreModel.estadofactuimpres=this.estadofactuimpres;
		}
		
		
		((EstadoFactuImpreModel) this.jTableDatosEstadoFactuImpre.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoFactuImpre() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadofactuimpreAnterior(),this.estadofactuimpreLogic.getEstadoFactuImpres());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadofactuimpreAnterior(),this.estadofactuimpres);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoFactuImpre();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoFactuImpre(EstadoFactuImpre estadofactuimpre,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FacturaImpresion.class)) {
					this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresionLogic.setFacturaImpresions(estadofactuimpre.getFacturaImpresions());
					this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaImpresion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
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
										
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadofactuimpre,new Object(),generalEntityParameterGeneral,this.estadofactuimpreReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadofactuimpreSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoFactuImpreConstantesFunciones.getClassesRelationshipsOfEstadoFactuImpre(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoFactuImpreConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoFactuImpre(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoFactuImpre(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoFactuImpreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadofactuimpre,new Object(),generalEntityParameterGeneral,this.estadofactuimpreReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoFactuImpre(EstadoFactuImpreBean estadofactuimpreBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FacturaImpresion.class)) {
					this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresionLogic.setFacturaImpresions(estadofactuimpre.getFacturaImpresions());
					this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaImpresion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoFactuImpre(ArrayList<Classe> classes,EstadoFactuImpreReturnGeneral estadofactuimpreReturnGeneral,EstadoFactuImpreBean estadofactuimpreBean,Boolean conDefault) throws Exception {
		
			this.estadofactuimpreBean.setFacturaImpresions(estadofactuimpreReturnGeneral.getEstadoFactuImpre().getFacturaImpresions());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoFactuImpre(EstadoFactuImpre estadofactuimpre,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(FacturaImpresion.class)) {
					estadofactuimpre.setFacturaImpresions(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionBeanSwingJInternalFrame.facturaimpresionLogic.getFacturaImpresions());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadofactuimpre)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoFactuImpre = new EstadoFactuImpreDetalleFormJInternalFrame(jDesktopPane,this.estadofactuimpreSessionBean.getConGuardarRelaciones(),this.estadofactuimpreSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoFactuImpre);
		this.jInternalFrameDetalleFormEstadoFactuImpre.setVisible(false);
		this.jInternalFrameDetalleFormEstadoFactuImpre.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoFactuImpre.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoFactuImpre.estadofactuimpreLogic=this.estadofactuimpreLogic;
		
		this.cargarCombosFrameForeignKeyEstadoFactuImpre("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoFactuImpre();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoFactuImpre();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoFactuImpre("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoFactuImpre();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoFactuImpre.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoFactuImpre"));
		
		this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonModificarEstadoFactuImpre.addActionListener(new ButtonActionListener(this,"ModificarEstadoFactuImpre"));

		
		this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonModificarToolBarEstadoFactuImpre.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoFactuImpre"));
					
		this.jInternalFrameDetalleFormEstadoFactuImpre.jMenuItemModificarEstadoFactuImpre.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoFactuImpre"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonActualizarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"ActualizarEstadoFactuImpre"));
		
		
		this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonActualizarToolBarEstadoFactuImpre.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoFactuImpre"));
						
		this.jInternalFrameDetalleFormEstadoFactuImpre.jMenuItemActualizarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoFactuImpre"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonEliminarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"EliminarEstadoFactuImpre"));
		
		
		this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonEliminarToolBarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoFactuImpre"));
								
		this.jInternalFrameDetalleFormEstadoFactuImpre.jMenuItemEliminarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoFactuImpre"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonCancelarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"CancelarEstadoFactuImpre"));
		
		
		this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonCancelarToolBarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoFactuImpre"));
					
		this.jInternalFrameDetalleFormEstadoFactuImpre.jMenuItemCancelarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoFactuImpre"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoFactuImpre.jMenuItemDetalleCerrarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoFactuImpre"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonGuardarCambiosToolBarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoFactuImpre"));
		
		
		
		this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonGuardarCambiosToolBarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoFactuImpre"));
		
		
		
		this.jInternalFrameDetalleFormEstadoFactuImpre.jComboBoxTiposAccionesFormularioEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoFactuImpre"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonidEstadoFactuImpreBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoFactuImpreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFactuImpre.jButtoncodigoEstadoFactuImpreBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoFactuImpreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonnombreEstadoFactuImpreBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoFactuImpreBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoFactuImpre.jTabbedPaneRelacionesEstadoFactuImpre.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoFactuImpre"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoFactuImpre"));
		
		if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFactuImpre.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoFactuImpre"));
		}
		
		this.jTableDatosEstadoFactuImpre.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoFactuImpre"));
		
		this.jTableDatosEstadoFactuImpre.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoFactuImpre"));
		
		this.jButtonNuevoEstadoFactuImpre.addActionListener(new ButtonActionListener(this,"NuevoEstadoFactuImpre"));
		
		this.jButtonDuplicarEstadoFactuImpre.addActionListener(new ButtonActionListener(this,"DuplicarEstadoFactuImpre"));
		
		this.jButtonCopiarEstadoFactuImpre.addActionListener(new ButtonActionListener(this,"CopiarEstadoFactuImpre"));
		
		this.jButtonVerFormEstadoFactuImpre.addActionListener(new ButtonActionListener(this,"VerFormEstadoFactuImpre"));
		
		
		this.jButtonNuevoToolBarEstadoFactuImpre.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoFactuImpre"));
			
		this.jButtonDuplicarToolBarEstadoFactuImpre.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoFactuImpre"));
			
		this.jMenuItemNuevoEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoFactuImpre"));
			
		this.jMenuItemDuplicarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoFactuImpre"));		
		
		
		this.jButtonNuevoRelacionesEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoFactuImpre"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoFactuImpre.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoFactuImpre"));
			
		this.jMenuItemNuevoRelacionesEstadoFactuImpre.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoFactuImpre"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonModificarEstadoFactuImpre.addActionListener(new ButtonActionListener(this,"ModificarEstadoFactuImpre"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonModificarToolBarEstadoFactuImpre.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoFactuImpre"));
			
			this.jInternalFrameDetalleFormEstadoFactuImpre.jMenuItemModificarEstadoFactuImpre.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoFactuImpre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonActualizarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"ActualizarEstadoFactuImpre"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonActualizarToolBarEstadoFactuImpre.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoFactuImpre"));
				
			this.jInternalFrameDetalleFormEstadoFactuImpre.jMenuItemActualizarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoFactuImpre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonEliminarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"EliminarEstadoFactuImpre"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonEliminarToolBarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoFactuImpre"));
						
			this.jInternalFrameDetalleFormEstadoFactuImpre.jMenuItemEliminarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoFactuImpre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonCancelarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"CancelarEstadoFactuImpre"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonCancelarToolBarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoFactuImpre"));
			
			this.jInternalFrameDetalleFormEstadoFactuImpre.jMenuItemCancelarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoFactuImpre"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoFactuImpre"));		
		
		
		this.jButtonCerrarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"CerrarEstadoFactuImpre"));
		
		
		this.jButtonCerrarToolBarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoFactuImpre"));
			
		this.jMenuItemCerrarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoFactuImpre"));
			
		if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFactuImpre.jMenuItemDetalleCerrarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoFactuImpre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonGuardarCambiosEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoFactuImpre"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonGuardarCambiosToolBarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoFactuImpre"));
		}
		
		this.jButtonCopiarToolBarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoFactuImpre"));
			
		this.jButtonVerFormToolBarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoFactuImpre"));
		
		this.jMenuItemGuardarCambiosEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoFactuImpre"));
			
		this.jMenuItemCopiarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoFactuImpre"));		
		
		this.jMenuItemVerFormEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoFactuImpre"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoFactuImpre"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoFactuImpre"));
			
		this.jMenuItemGuardarCambiosTablaEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoFactuImpre"));		
		
		
		
		this.jButtonRecargarInformacionEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoFactuImpre"));
					
		this.jButtonRecargarInformacionToolBarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoFactuImpre"));
		
		this.jMenuItemRecargarInformacionEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoFactuImpre"));		
		
		
		
		this.jButtonAnterioresEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"AnterioresEstadoFactuImpre"));
		
		
		this.jButtonAnterioresToolBarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoFactuImpre"));
		
		this.jMenuItemAnterioresEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoFactuImpre"));		
		
		
		this.jButtonSiguientesEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"SiguientesEstadoFactuImpre"));
		
		
		this.jButtonSiguientesToolBarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoFactuImpre"));
			
		this.jMenuItemSiguientesEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoFactuImpre"));
			
		this.jMenuItemAbrirOrderByEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoFactuImpre"));
			
		this.jMenuItemMostrarOcultarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoFactuImpre"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoFactuImpre"));
			
		this.jMenuItemDetalleMostarOcultarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoFactuImpre"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoFactuImpre"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoFactuImpre"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoFactuImpre"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoFactuImpre.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoFactuImpre"));

		this.jCheckBoxSeleccionadosEstadoFactuImpre.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoFactuImpre"));
		
		if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFactuImpre.jComboBoxTiposAccionesFormularioEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoFactuImpre"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoFactuImpre"));
			
		this.jComboBoxTiposAccionesEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoFactuImpre"));
					
		this.jComboBoxTiposSeleccionarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoFactuImpre"));
			
		this.jTextFieldValorCampoGeneralEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoFactuImpre"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonidEstadoFactuImpreBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoFactuImpreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFactuImpre.jButtoncodigoEstadoFactuImpreBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoFactuImpreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonnombreEstadoFactuImpreBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoFactuImpreBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoFactuImpre!=null) {
				this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoFactuImpre"));
				this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoFactuImpre"));
				this.jInternalFrameReporteDinamicoEstadoFactuImpre.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoFactuImpre"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoFactuImpre"));				
			//this.jButtonGenerarReporteDinamicoEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoFactuImpre"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoFactuImpre"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoFactuImpre!=null) {
				this.jInternalFrameImportacionEstadoFactuImpre.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoFactuImpre"));
				this.jInternalFrameImportacionEstadoFactuImpre.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoFactuImpre"));
				this.jInternalFrameImportacionEstadoFactuImpre.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoFactuImpre"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoFactuImpre"));
			
			this.jButtonAbrirOrderByToolBarEstadoFactuImpre.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoFactuImpre"));			
			
			if(this.jInternalFrameOrderByEstadoFactuImpre!=null) {
				this.jInternalFrameOrderByEstadoFactuImpre.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoFactuImpre"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFactuImpre.jTabbedPaneRelacionesEstadoFactuImpre.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoFactuImpre"));
		
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
            		closingInternalFrameEstadoFactuImpre();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoFactuImpre.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoFactuImpre = (JInternalFrameBase)event.getSource();
	            	
	            EstadoFactuImpreBeanSwingJInternalFrame jInternalFrameParent=(EstadoFactuImpreBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoFactuImpre.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoFactuImpreActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoFactuImpre.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoFactuImpreListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoFactuImpre.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoFactuImpre.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoFactuImpreActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoFactuImpreActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoFactuImpreActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoFactuImpre";
		inputMap = this.jButtonNuevoEstadoFactuImpre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoFactuImpre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoFactuImpreActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoFactuImpreActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoFactuImpreActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoFactuImpreActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoFactuImpre";
		inputMap = this.jButtonNuevoRelacionesEstadoFactuImpre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoFactuImpre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoFactuImpreActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoFactuImpre";
		inputMap = this.jButtonModificarEstadoFactuImpre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoFactuImpre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoFactuImpreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoFactuImpre";
		inputMap = this.jButtonActualizarEstadoFactuImpre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoFactuImpre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoFactuImpreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoFactuImpre";
		inputMap = this.jButtonEliminarEstadoFactuImpre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoFactuImpre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoFactuImpreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoFactuImpre";
		inputMap = this.jButtonCancelarEstadoFactuImpre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoFactuImpre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoFactuImpreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoFactuImpre";
		inputMap = this.jButtonCerrarEstadoFactuImpre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoFactuImpre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoFactuImpreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonGuardarCambiosEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoFactuImpre";
		inputMap = this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonGuardarCambiosEstadoFactuImpre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonGuardarCambiosEstadoFactuImpre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoFactuImpreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoFactuImpre.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoFactuImpreItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoFactuImpre.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoFactuImpreActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoFactuImpre.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoFactuImpreActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoFactuImpre.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoFactuImpreActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonidEstadoFactuImpreBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoFactuImpreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFactuImpre.jButtoncodigoEstadoFactuImpreBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoFactuImpreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFactuImpre.jButtonnombreEstadoFactuImpreBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoFactuImpreBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoFactuImpre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoFactuImpreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoFactuImpreActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoFactuImpre.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoFactuImpre(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoFactuImpre estadofactuimpreAux:this.estadofactuimpreLogic.getEstadoFactuImpres()) {
					estadofactuimpreAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoFactuImpre estadofactuimpreAux:estadofactuimpres) {
					estadofactuimpreAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoFactuImpreItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoFactuImpre(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoFactuImpre estadofactuimpreAux:this.estadofactuimpreLogic.getEstadoFactuImpres()) {
						estadofactuimpreAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoFactuImpre estadofactuimpreAux:estadofactuimpres) {
						estadofactuimpreAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoFactuImpre estadofactuimpreAux:this.estadofactuimpreLogic.getEstadoFactuImpres()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoFactuImpre estadofactuimpreAux:estadofactuimpres) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoFactuImpre(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoFactuImpre.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoFactuImpre.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoFactuImpre,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoFactuImpreItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoFactuImpre(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoFactuImpre.getSelectedRows();
			
			EstadoFactuImpre estadofactuimpreLocal=new EstadoFactuImpre();
			
			//this.seleccionarTodosEstadoFactuImpre(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadofactuimpreLocal =(EstadoFactuImpre) this.estadofactuimpreLogic.getEstadoFactuImpres().toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadofactuimpreLocal =(EstadoFactuImpre) this.estadofactuimpres.toArray()[this.jTableDatosEstadoFactuImpre.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadofactuimpreLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoFactuImpre estadofactuimpreAux:this.estadofactuimpreLogic.getEstadoFactuImpres()) {
						estadofactuimpreAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoFactuImpre estadofactuimpreAux:estadofactuimpres) {
						estadofactuimpreAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoFactuImpre(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoFactuImpre.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoFactuImpre.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoFactuImpre,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoFactuImpreItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoFactuImpreParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoFactuImpreActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoFactuImpre(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoFactuImpre.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoFactuImpre estadofactuimpreAux:this.estadofactuimpreLogic.getEstadoFactuImpres()) {
				
						if(sTipoSeleccionar.equals(EstadoFactuImpreConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadofactuimpreAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoFactuImpreConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadofactuimpreAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoFactuImpre estadofactuimpreAux:estadofactuimpres) {
					
						if(sTipoSeleccionar.equals(EstadoFactuImpreConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadofactuimpreAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoFactuImpreConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadofactuimpreAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoFactuImpre(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoFactuImpreActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoFactuImpre(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoFactuImpre=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoFactuImpre.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoFactuImpre.jComboBoxTiposAccionesFormularioEstadoFactuImpre.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoFactuImpre) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoFactuImpre(conSplash);
				
					this.generarReporteEstadoFactuImpresSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoFactuImpre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoFactuImpre.jComboBoxTiposAccionesFormularioEstadoFactuImpre.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoFactuImpresSeleccionados();
				//this.jComboBoxTiposAccionesEstadoFactuImpre.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoFactuImpresSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoFactuImpre.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoFactuImpresSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoFactuImpre.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoFactuImpre();
				
				this.exportarEstadoFactuImpresSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoFactuImpre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoFactuImpre.jComboBoxTiposAccionesFormularioEstadoFactuImpre.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoFactuImpres();
				//this.importarEstadoFactuImpres();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoFactuImpre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoFactuImpre.jComboBoxTiposAccionesFormularioEstadoFactuImpre.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoFactuImpre();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoFactuImpresSeleccionados();
				//this.jComboBoxTiposAccionesEstadoFactuImpre.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Factu Impre", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoFactuImpre();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoFactuImpre)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoFactuImpre(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Factu Impre",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoFactuImpre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoFactuImpre.jComboBoxTiposAccionesFormularioEstadoFactuImpre.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadoFactuImpreBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadoFactuImpre) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadoFactuImpre(conSplash);
					
						//this.actualizarParametrosGeneralEstadoFactuImpre();
						
						this.generarReporteProcesoAccionEstadoFactuImpresSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadoFactuImpre.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadoFactuImpre.jComboBoxTiposAccionesFormularioEstadoFactuImpre.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadoFactuImpreBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estado Factu ImpreS SELECCIONADOS?", "MANTENIMIENTO DE Estado Factu Impre", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadoFactuImpre();
				
						this.actualizarParametrosGeneralEstadoFactuImpre();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadofactuimpreReturnGeneral=estadofactuimpreLogic.procesarAccionEstadoFactuImpresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadofactuimpreLogic.getEstadoFactuImpres(),this.estadofactuimpreParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadoFactuImpreReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoFactuImpre.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoFactuImpre.jComboBoxTiposAccionesFormularioEstadoFactuImpre.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoFactuImpre();
					
					EstadoFactuImpreBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadoFactuImpreReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoFactuImpre.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoFactuImpre.jComboBoxTiposAccionesFormularioEstadoFactuImpre.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoFactuImpre(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoFactuImpreActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoFactuImpre();
			
			if(this.jInternalFrameDetalleFormEstadoFactuImpre==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoFactuImpre> estadofactuimpresSeleccionados=new ArrayList<EstadoFactuImpre>();		
			EstadoFactuImpre estadofactuimpre=new EstadoFactuImpre();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoFactuImpre(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoFactuImpre.getSelectedItem();
			
			
			
			
			estadofactuimpresSeleccionados=this.getEstadoFactuImpresSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadofactuimpresSeleccionados.size()==1) {
				for(EstadoFactuImpre estadofactuimpreAux:estadofactuimpresSeleccionados) {
					estadofactuimpre=estadofactuimpreAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Factura Impresion")) {
					jButtonFacturaImpresionActionPerformed(null,rowIndex,true,false,estadofactuimpre);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoFactuImpre();
			
      		//this.finishProcessEstadoFactuImpre(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoFactuImpreReturnGeneral() throws Exception {
		if(this.estadofactuimpreReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadofactuimpreReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadofactuimpreReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadofactuimpreReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadofactuimpreReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadofactuimpreReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoFactuImpre(false);
		}
		
		if(this.estadofactuimpreReturnGeneral.getConRetornoLista() || this.estadofactuimpreReturnGeneral.getConRetornoObjeto()) {
			if(this.estadofactuimpreReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadofactuimpreLogic.setEstadoFactuImpres(this.estadofactuimpreReturnGeneral.getEstadoFactuImpres());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadofactuimpreReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadofactuimpreLogic.setEstadoFactuImpre(this.estadofactuimpreReturnGeneral.getEstadoFactuImpre());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoFactuImpre(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoFactuImpre() throws Exception {
		
		
	}
	
	public ArrayList<EstadoFactuImpre> getEstadoFactuImpresSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoFactuImpre> estadofactuimpresSeleccionados=new ArrayList<EstadoFactuImpre>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoFactuImpre) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoFactuImpre estadofactuimpreAux:estadofactuimpreLogic.getEstadoFactuImpres()) {
					if(estadofactuimpreAux.getIsSelected()) {
						estadofactuimpresSeleccionados.add(estadofactuimpreAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoFactuImpre estadofactuimpreAux:this.estadofactuimpres) {
					if(estadofactuimpreAux.getIsSelected()) {
						estadofactuimpresSeleccionados.add(estadofactuimpreAux);				
					}
				}
			}
			
			if(estadofactuimpresSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadofactuimpresSeleccionados.addAll(this.estadofactuimpreLogic.getEstadoFactuImpres());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadofactuimpresSeleccionados.addAll(this.estadofactuimpres);				
					}
				}
			}
		} else {
			estadofactuimpresSeleccionados.add(this.estadofactuimpre);
		}
		
		return estadofactuimpresSeleccionados;
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
	
	public void generarReporteEstadoFactuImpresSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoFactuImpresSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoFactuImpresSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoFactuImpresSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoFactuImpresSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoFactuImpresSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Factu Impre",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoFactuImpresSeleccionados() throws Exception {
		ArrayList<EstadoFactuImpre> estadofactuimpresSeleccionados=new ArrayList<EstadoFactuImpre>();		
		
		estadofactuimpresSeleccionados=this.getEstadoFactuImpresSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoFactuImpres("Todos",estadofactuimpresSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoFactuImpresSeleccionados() throws Exception {
		ArrayList<EstadoFactuImpre> estadofactuimpresSeleccionados=new ArrayList<EstadoFactuImpre>();		
		
		estadofactuimpresSeleccionados=this.getEstadoFactuImpresSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoFactuImpres("Todos",estadofactuimpresSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoFactuImpresSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoFactuImpre> estadofactuimpresSeleccionados=new ArrayList<EstadoFactuImpre>();
		
		estadofactuimpresSeleccionados=this.getEstadoFactuImpresSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoFactuImpres("Todos",estadofactuimpresSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoFactuImpresSeleccionados() throws Exception {
		ArrayList<EstadoFactuImpre> estadofactuimpresSeleccionados=new ArrayList<EstadoFactuImpre>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoFactuImpre();
		
		
		estadofactuimpresSeleccionados=this.getEstadoFactuImpresSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoFactuImpre();
		
		
		//this.generarReporteEstadoFactuImpres("Todos",estadofactuimpresSeleccionados ,estadofactuimpreImplementable,estadofactuimpreImplementableHome);
	}
	
	public void mostrarImportacionEstadoFactuImpres() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoFactuImpre();
		
		this.abrirFrameImportacionEstadoFactuImpre();		
		
			
		//this.generarReporteEstadoFactuImpres("Todos",estadofactuimpresSeleccionados ,estadofactuimpreImplementable,estadofactuimpreImplementableHome);
	}
	
	public void importarEstadoFactuImpres() throws Exception {		
	
	}
	
	public void exportarEstadoFactuImpresSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoFactuImpresSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoFactuImpresSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoFactuImpresSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Factu Impre",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoFactuImpresSeleccionados() throws Exception {
		ArrayList<EstadoFactuImpre> estadofactuimpresSeleccionados=new ArrayList<EstadoFactuImpre>();		
		
		estadofactuimpresSeleccionados=this.getEstadoFactuImpresSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofactuimpre."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoFactuImpre(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoFactuImpre estadofactuimpreAux:estadofactuimpresSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoFactuImpre(estadofactuimpreAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadofactuimpreAux.setsDetalleGeneralEntityReporte(estadofactuimpreAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Factu Impre",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoFactuImpre(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoFactuImpreConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoFactuImpreConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoFactuImpreConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoFactuImpreConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoFactuImpre(EstadoFactuImpre estadofactuimpre,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadofactuimpre.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadofactuimpre.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadofactuimpre.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadofactuimpre.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoFactuImpresSeleccionados() throws Exception {
		ArrayList<EstadoFactuImpre> estadofactuimpresSeleccionados=new ArrayList<EstadoFactuImpre>();		
		
		estadofactuimpresSeleccionados=this.getEstadoFactuImpresSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofactuimpre.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoFactuImpres");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoFactuImpre(row);				
				iRow++;
			}				
			
			for(EstadoFactuImpre estadofactuimpreAux:estadofactuimpresSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoFactuImpre(estadofactuimpreAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Factu Impre",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoFactuImpresSeleccionados() throws Exception {
		ArrayList<EstadoFactuImpre> estadofactuimpresSeleccionados=new ArrayList<EstadoFactuImpre>();		
		
		estadofactuimpresSeleccionados=this.getEstadoFactuImpresSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofactuimpre.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadofactuimpres");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadofactuimpre");
			//elementRoot.appendChild(element);
		
			for(EstadoFactuImpre estadofactuimpreAux:estadofactuimpresSeleccionados) {
				element = document.createElement("estadofactuimpre");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoFactuImpre(estadofactuimpreAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Factu Impre",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoFactuImpre(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoFactuImpreConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoFactuImpreConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoFactuImpreConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoFactuImpreConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoFactuImpre(EstadoFactuImpre estadofactuimpre,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadofactuimpre.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadofactuimpre.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadofactuimpre.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoFactuImpre(EstadoFactuImpre estadofactuimpre,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoFactuImpreConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadofactuimpre.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoFactuImpreConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadofactuimpre.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoFactuImpreConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadofactuimpre.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoFactuImpreConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadofactuimpre.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoFactuImpresSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoFactuImpre> estadofactuimpresSeleccionados=new ArrayList<EstadoFactuImpre>();
		
		estadofactuimpresSeleccionados=this.getEstadoFactuImpresSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoFactuImpre(estadofactuimpresSeleccionados);
		
		this.generarReporteEstadoFactuImpres("Todos",estadofactuimpresSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoFactuImpre(ArrayList<EstadoFactuImpre> estadofactuimpresSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoFactuImpre estadofactuimpreAux:estadofactuimpresSeleccionados) {
				estadofactuimpreAux.setsDetalleGeneralEntityReporte(estadofactuimpreAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoFactuImpreConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadofactuimpreAux.setsDescripcionGeneralEntityReporte1(estadofactuimpreAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoFactuImpreConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadofactuimpreAux.setsDescripcionGeneralEntityReporte1(estadofactuimpreAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFactuImpreConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoFactuImpre(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoFactuImpre=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoFactuImpre=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoFactuImpre=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoFactuImpre=false;
			this.isVisibilidadCeldaActualizarEstadoFactuImpre=false;
			this.isVisibilidadCeldaEliminarEstadoFactuImpre=false;
			this.isVisibilidadCeldaCancelarEstadoFactuImpre=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFactuImpre=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFactuImpre=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoFactuImpre=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFactuImpre=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFactuImpre=false;
			this.isVisibilidadCeldaModificarEstadoFactuImpre=false;
			this.isVisibilidadCeldaActualizarEstadoFactuImpre=true;
			this.isVisibilidadCeldaEliminarEstadoFactuImpre=false;
			this.isVisibilidadCeldaCancelarEstadoFactuImpre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFactuImpre=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFactuImpre=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoFactuImpre=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFactuImpre=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFactuImpre=false;
			this.isVisibilidadCeldaModificarEstadoFactuImpre=false;
			this.isVisibilidadCeldaActualizarEstadoFactuImpre=true;
			this.isVisibilidadCeldaEliminarEstadoFactuImpre=true;
			this.isVisibilidadCeldaCancelarEstadoFactuImpre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFactuImpre=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFactuImpre=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoFactuImpre=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFactuImpre=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFactuImpre=false;
			this.isVisibilidadCeldaModificarEstadoFactuImpre=false;
			this.isVisibilidadCeldaActualizarEstadoFactuImpre=true;
			this.isVisibilidadCeldaEliminarEstadoFactuImpre=false;
			this.isVisibilidadCeldaCancelarEstadoFactuImpre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFactuImpre=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFactuImpre=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoFactuImpre=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFactuImpre=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoFactuImpre=true;
			this.isVisibilidadCeldaModificarEstadoFactuImpre=false;
			this.isVisibilidadCeldaActualizarEstadoFactuImpre=false;
			this.isVisibilidadCeldaEliminarEstadoFactuImpre=false;
			this.isVisibilidadCeldaCancelarEstadoFactuImpre=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFactuImpre=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFactuImpre=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoFactuImpre=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFactuImpre=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFactuImpre=false;
			this.isVisibilidadCeldaActualizarEstadoFactuImpre=false;
			this.isVisibilidadCeldaEliminarEstadoFactuImpre=false;
			this.isVisibilidadCeldaCancelarEstadoFactuImpre=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFactuImpre=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFactuImpre=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoFactuImpre=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFactuImpre=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFactuImpre=false;
			this.isVisibilidadCeldaModificarEstadoFactuImpre=true;
			this.isVisibilidadCeldaActualizarEstadoFactuImpre=false;
			this.isVisibilidadCeldaEliminarEstadoFactuImpre=false;
			this.isVisibilidadCeldaCancelarEstadoFactuImpre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFactuImpre=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFactuImpre=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoFactuImpreJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoFactuImpre=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFactuImpre=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoFactuImpre=true;
		} else {
			this.actualizarEstadoPanelsEstadoFactuImpre(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoFactuImpre=false;
			//this.isVisibilidadCeldaVerFormEstadoFactuImpre=false;
			this.isVisibilidadCeldaDuplicarEstadoFactuImpre=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadofactuimpreSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoFactuImpre=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoFactuImpre=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFactuImpre=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
			if(!estadofactuimpreSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoFactuImpre=false;												
			}
			
			this.jButtonCerrarEstadoFactuImpre.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoFactuImpre=false;
		}
		
		if(!this.permiteMantenimiento(this.estadofactuimpre)) {
			this.isVisibilidadCeldaActualizarEstadoFactuImpre=false;
			this.isVisibilidadCeldaEliminarEstadoFactuImpre=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoFactuImpre() {
		this.isVisibilidadCeldaNuevoEstadoFactuImpre=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoFactuImpre=false;
	}
	
	public void actualizarEstadoPanelsEstadoFactuImpre(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoFactuImpre!=null) {
				this.jScrollPanelDatosEdicionEstadoFactuImpre.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoFactuImpre!=null) {
				this.jScrollPanelDatosEstadoFactuImpre.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoFactuImpre!=null) {
				this.jPanelPaginacionEstadoFactuImpre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoFactuImpre!=null) {
				this.jPanelParametrosReportesEstadoFactuImpre.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoFactuImpre!=null) {
				this.jScrollPanelDatosEdicionEstadoFactuImpre.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoFactuImpre!=null) {
				this.jScrollPanelDatosEstadoFactuImpre.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoFactuImpre!=null) {
				this.jPanelPaginacionEstadoFactuImpre.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoFactuImpre!=null) {
				this.jPanelParametrosReportesEstadoFactuImpre.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoFactuImpre!=null) {
				this.jScrollPanelDatosEdicionEstadoFactuImpre.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoFactuImpre!=null) {
				this.jScrollPanelDatosEstadoFactuImpre.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoFactuImpre!=null) {
				this.jPanelPaginacionEstadoFactuImpre.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoFactuImpre!=null) {
				this.jPanelParametrosReportesEstadoFactuImpre.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoFactuImpre!=null) {
				this.jScrollPanelDatosEdicionEstadoFactuImpre.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoFactuImpre!=null) {
				this.jScrollPanelDatosEstadoFactuImpre.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoFactuImpre!=null) {
				this.jPanelPaginacionEstadoFactuImpre.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoFactuImpre!=null) {
				this.jPanelParametrosReportesEstadoFactuImpre.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoFactuImpre!=null) {
				this.jScrollPanelDatosEdicionEstadoFactuImpre.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoFactuImpre!=null) {
				this.jScrollPanelDatosEstadoFactuImpre.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoFactuImpre!=null) {
				this.jPanelPaginacionEstadoFactuImpre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoFactuImpre!=null) {
				this.jPanelParametrosReportesEstadoFactuImpre.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoFactuImpre!=null) {
				this.jScrollPanelDatosEdicionEstadoFactuImpre.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoFactuImpre!=null) {
				this.jScrollPanelDatosEstadoFactuImpre.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoFactuImpre!=null) {
				this.jPanelPaginacionEstadoFactuImpre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoFactuImpre!=null) {
				this.jPanelParametrosReportesEstadoFactuImpre.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoFactuImpre!=null) {
				this.jScrollPanelDatosEdicionEstadoFactuImpre.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoFactuImpre!=null) {
				this.jScrollPanelDatosEstadoFactuImpre.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoFactuImpre!=null) {
				this.jPanelPaginacionEstadoFactuImpre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoFactuImpre!=null) {
				this.jPanelParametrosReportesEstadoFactuImpre.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoFactuImpreParaFacturaImpresiones() throws Exception {
		Boolean isPaginaPopupFacturaImpresion=false;

		try {

			if(this.estadofactuimpreSessionBean==null) {
				this.estadofactuimpreSessionBean=new EstadoFactuImpreSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionSessionBean=new FacturaImpresionSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionSessionBean.setsPathNavegacionActual(estadofactuimpreSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFacturaImpresion=this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFacturaImpresion(true);
			this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFacturaImpresion(EstadoFactuImpreConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionSessionBean.setisBusquedaDesdeForeignKeySesionEstadoFactuImpre(true);
			this.jInternalFrameDetalleFormEstadoFactuImpre.facturaimpresionSessionBean.setlidEstadoFactuImpreActual(this.idEstadoFactuImpreActual);

			estadofactuimpreSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoFactuImpre(true);
			estadofactuimpreSessionBean.setlIdEstadoFactuImpreActualForeignKey(this.idEstadoFactuImpreActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoFactuImpreSessionBean estadofactuimpreSessionBean=new EstadoFactuImpreSessionBean();
		
		if(this.estadofactuimpreSessionBean==null) {
			this.estadofactuimpreSessionBean=new EstadoFactuImpreSessionBean();
		}
		
		this.estadofactuimpreSessionBean.setsUltimaBusquedaEstadoFactuImpre(this.getsAccionBusqueda());
		this.estadofactuimpreSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadofactuimpreSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoFactuImpreSessionBean estadofactuimpreSessionBean=new EstadoFactuImpreSessionBean();
		
		if(this.estadofactuimpreSessionBean==null) {
			this.estadofactuimpreSessionBean=new EstadoFactuImpreSessionBean();
		}
		
		if(this.estadofactuimpreSessionBean.getsUltimaBusquedaEstadoFactuImpre()!=null&&!this.estadofactuimpreSessionBean.getsUltimaBusquedaEstadoFactuImpre().equals("")) {
			this.setsAccionBusqueda(estadofactuimpreSessionBean.getsUltimaBusquedaEstadoFactuImpre());
			this.setiNumeroPaginacion(estadofactuimpreSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadofactuimpreSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadofactuimpreSessionBean.setsUltimaBusquedaEstadoFactuImpre("");
		this.estadofactuimpreSessionBean.setiNumeroPaginacion(EstadoFactuImpreConstantesFunciones.INUMEROPAGINACION);
		this.estadofactuimpreSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoFactuImpre(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoFactuImpre() {
		this.updateBorderResaltarBusquedasFormularioEstadoFactuImpre();
		this.updateVisibilidadBusquedasFormularioEstadoFactuImpre();
		this.updateHabilitarBusquedasFormularioEstadoFactuImpre();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoFactuImpre() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoFactuImpre() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoFactuImpre() {
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
	
	public void updateControlesFormularioEstadoFactuImpre() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoFactuImpre==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoFactuImpre();
		this.updateVisibilidadResaltarControlesFormularioEstadoFactuImpre();
		this.updateHabilitarResaltarControlesFormularioEstadoFactuImpre();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoFactuImpre() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoFactuImpre==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadofactuimpreConstantesFunciones.resaltaridEstadoFactuImpre!=null && this.jInternalFrameDetalleFormEstadoFactuImpre!=null) {this.jInternalFrameDetalleFormEstadoFactuImpre.jLabelidEstadoFactuImpre.setBorder(this.estadofactuimpreConstantesFunciones.resaltaridEstadoFactuImpre);}
		if(this.estadofactuimpreConstantesFunciones.resaltarcodigoEstadoFactuImpre!=null && this.jInternalFrameDetalleFormEstadoFactuImpre!=null) {this.jInternalFrameDetalleFormEstadoFactuImpre.jTextFieldcodigoEstadoFactuImpre.setBorder(this.estadofactuimpreConstantesFunciones.resaltarcodigoEstadoFactuImpre);}
		if(this.estadofactuimpreConstantesFunciones.resaltarnombreEstadoFactuImpre!=null && this.jInternalFrameDetalleFormEstadoFactuImpre!=null) {this.jInternalFrameDetalleFormEstadoFactuImpre.jTextAreanombreEstadoFactuImpre.setBorder(this.estadofactuimpreConstantesFunciones.resaltarnombreEstadoFactuImpre);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoFactuImpre() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoFactuImpre==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) {
	
		//this.jInternalFrameDetalleFormEstadoFactuImpre.jLabelidEstadoFactuImpre.setVisible(this.estadofactuimpreConstantesFunciones.mostraridEstadoFactuImpre);
		this.jInternalFrameDetalleFormEstadoFactuImpre.jPanelidEstadoFactuImpre.setVisible(this.estadofactuimpreConstantesFunciones.mostraridEstadoFactuImpre);
		//this.jInternalFrameDetalleFormEstadoFactuImpre.jTextFieldcodigoEstadoFactuImpre.setVisible(this.estadofactuimpreConstantesFunciones.mostrarcodigoEstadoFactuImpre);
		this.jInternalFrameDetalleFormEstadoFactuImpre.jPanelcodigoEstadoFactuImpre.setVisible(this.estadofactuimpreConstantesFunciones.mostrarcodigoEstadoFactuImpre);
		//this.jInternalFrameDetalleFormEstadoFactuImpre.jTextAreanombreEstadoFactuImpre.setVisible(this.estadofactuimpreConstantesFunciones.mostrarnombreEstadoFactuImpre);
		this.jInternalFrameDetalleFormEstadoFactuImpre.jPanelnombreEstadoFactuImpre.setVisible(this.estadofactuimpreConstantesFunciones.mostrarnombreEstadoFactuImpre);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoFactuImpre() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoFactuImpre==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoFactuImpre!=null) {
	
		this.jInternalFrameDetalleFormEstadoFactuImpre.jLabelidEstadoFactuImpre.setEnabled(this.estadofactuimpreConstantesFunciones.activaridEstadoFactuImpre);
		this.jInternalFrameDetalleFormEstadoFactuImpre.jTextFieldcodigoEstadoFactuImpre.setEnabled(this.estadofactuimpreConstantesFunciones.activarcodigoEstadoFactuImpre);
		this.jInternalFrameDetalleFormEstadoFactuImpre.jTextAreanombreEstadoFactuImpre.setEnabled(this.estadofactuimpreConstantesFunciones.activarnombreEstadoFactuImpre);
		}
	}
	
		
}