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

import com.bydan.erp.facturacion.util.EstadoDetalleProformaConstantesFunciones;
import com.bydan.erp.facturacion.util.EstadoDetalleProformaParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.EstadoDetalleProformaParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.EstadoDetalleProformaBean;
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
public class EstadoDetalleProformaBeanSwingJInternalFrame extends EstadoDetalleProformaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoDetalleProformaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoDetalleProforma> estadodetalleproformaValidator = new ClassValidator<EstadoDetalleProforma>(EstadoDetalleProforma.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoDetalleProforma estadodetalleproforma;	
	public EstadoDetalleProforma estadodetalleproformaAux;
	public EstadoDetalleProforma estadodetalleproformaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoDetalleProforma estadodetalleproformaTotales;
	public Long idEstadoDetalleProformaActual;
	public Long iIdNuevoEstadoDetalleProforma=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosDetalleProforma=false;

	public Boolean getIsTienePermisosDetalleProforma() {
		return isTienePermisosDetalleProforma;
	}

	public void setIsTienePermisosDetalleProforma(Boolean isTienePermisosDetalleProforma) {
		this.isTienePermisosDetalleProforma= isTienePermisosDetalleProforma;
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
	
	public Boolean isPermisoTodoEstadoDetalleProforma;
	public Boolean isPermisoNuevoEstadoDetalleProforma;
	public Boolean isPermisoActualizarEstadoDetalleProforma;
	public Boolean isPermisoActualizarOriginalEstadoDetalleProforma;
	public Boolean isPermisoEliminarEstadoDetalleProforma;
	public Boolean isPermisoGuardarCambiosEstadoDetalleProforma;
	public Boolean isPermisoConsultaEstadoDetalleProforma;
	public Boolean isPermisoBusquedaEstadoDetalleProforma;
	public Boolean isPermisoReporteEstadoDetalleProforma;
	public Boolean isPermisoPaginacionMedioEstadoDetalleProforma;
	public Boolean isPermisoPaginacionAltoEstadoDetalleProforma;
	public Boolean isPermisoPaginacionTodoEstadoDetalleProforma;
	public Boolean isPermisoCopiarEstadoDetalleProforma;
	public Boolean isPermisoVerFormEstadoDetalleProforma;
	public Boolean isPermisoDuplicarEstadoDetalleProforma;
	public Boolean isPermisoOrdenEstadoDetalleProforma;
	
	
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
	
	public EstadoDetalleProformaParameterReturnGeneral estadodetalleproformaReturnGeneral;
	public EstadoDetalleProformaParameterReturnGeneral estadodetalleproformaParameterGeneral;
	
	

	public DetalleProformaLogic detalleproformaLogic=null;

	public DetalleProformaLogic getDetalleProformaLogic() {
		return detalleproformaLogic;
	}

	public void setDetalleProformaLogic(DetalleProformaLogic detalleproformaLogic) {
		this.detalleproformaLogic = detalleproformaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoDetalleProforma=false;
	public Boolean esParaAccionDesdeFormularioEstadoDetalleProforma=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadoDetalleProformaSessionBeanAdditional estadodetalleproformaSessionBeanAdditional=null;
	
	public EstadoDetalleProformaSessionBeanAdditional getEstadoDetalleProformaSessionBeanAdditional() {
		return this.estadodetalleproformaSessionBeanAdditional;
	}
	
	public void setEstadoDetalleProformaSessionBeanAdditional(EstadoDetalleProformaSessionBeanAdditional estadodetalleproformaSessionBeanAdditional) {
		try {
			this.estadodetalleproformaSessionBeanAdditional=estadodetalleproformaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadoDetalleProformaBeanSwingJInternalFrameAdditional estadodetalleproformaBeanSwingJInternalFrameAdditional=null;
	//public class EstadoDetalleProformaBeanSwingJInternalFrame
	
	public EstadoDetalleProformaBeanSwingJInternalFrameAdditional getEstadoDetalleProformaBeanSwingJInternalFrameAdditional() {
		return this.estadodetalleproformaBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadoDetalleProformaBeanSwingJInternalFrameAdditional(EstadoDetalleProformaBeanSwingJInternalFrameAdditional estadodetalleproformaBeanSwingJInternalFrameAdditional) {
		try {
			this.estadodetalleproformaBeanSwingJInternalFrameAdditional=estadodetalleproformaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoDetalleProformaLogic estadodetalleproformaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoDetalleProforma estadodetalleproformaBean;
	public EstadoDetalleProformaConstantesFunciones estadodetalleproformaConstantesFunciones;
	//public EstadoDetalleProformaParameterReturnGeneral estadodetalleproformaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoDetalleProforma> estadodetalleproformas;	
	//public List<EstadoDetalleProforma> estadodetalleproformasEliminados;
	//public List<EstadoDetalleProforma> estadodetalleproformasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoDetalleProforma=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoDetalleProforma=true;
	public Boolean isVisibilidadCeldaCopiarEstadoDetalleProforma=true;
	public Boolean isVisibilidadCeldaVerFormEstadoDetalleProforma=true;
	public Boolean isVisibilidadCeldaOrdenEstadoDetalleProforma=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoDetalleProforma=false;
	public Boolean isVisibilidadCeldaModificarEstadoDetalleProforma=false;
	public Boolean isVisibilidadCeldaActualizarEstadoDetalleProforma=false;
	public Boolean isVisibilidadCeldaEliminarEstadoDetalleProforma=false;
	public Boolean isVisibilidadCeldaCancelarEstadoDetalleProforma=false;
	public Boolean isVisibilidadCeldaGuardarEstadoDetalleProforma=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoDetalleProforma=false;	
	
	
	
	public Long getiIdNuevoEstadoDetalleProforma() {
		return this.iIdNuevoEstadoDetalleProforma;
	}

	public void setiIdNuevoEstadoDetalleProforma(Long iIdNuevoEstadoDetalleProforma) {
		this.iIdNuevoEstadoDetalleProforma = iIdNuevoEstadoDetalleProforma;
	}
	
	public Long getidEstadoDetalleProformaActual() {
		return this.idEstadoDetalleProformaActual;
	}

	public void setidEstadoDetalleProformaActual(Long idEstadoDetalleProformaActual) {
		this.idEstadoDetalleProformaActual = idEstadoDetalleProformaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoDetalleProforma getestadodetalleproforma() {
		return this.estadodetalleproforma;
	}

	public void setestadodetalleproforma(EstadoDetalleProforma estadodetalleproforma) {
		this.estadodetalleproforma = estadodetalleproforma;
	}
	
	public EstadoDetalleProforma getestadodetalleproformaAux() {
		return this.estadodetalleproformaAux;
	}

	public void setestadodetalleproformaAux(EstadoDetalleProforma estadodetalleproformaAux) {
		this.estadodetalleproformaAux = estadodetalleproformaAux;
	}				
	
	public EstadoDetalleProforma getestadodetalleproformaAnterior() {
		return this.estadodetalleproformaAnterior;
	}

	public void setestadodetalleproformaAnterior(EstadoDetalleProforma estadodetalleproformaAnterior) {
		this.estadodetalleproformaAnterior = estadodetalleproformaAnterior;
	}	
	
	public EstadoDetalleProforma getestadodetalleproformaTotales() {
		return this.estadodetalleproformaTotales;
	}

	public void setestadodetalleproformaTotales(EstadoDetalleProforma estadodetalleproformaTotales) {
		this.estadodetalleproformaTotales = estadodetalleproformaTotales;
	}	
	
	public EstadoDetalleProforma getestadodetalleproformaBean() {
		return this.estadodetalleproformaBean;
	}

	public void setestadodetalleproformaBean(EstadoDetalleProforma estadodetalleproformaBean) {
		this.estadodetalleproformaBean = estadodetalleproformaBean;
	}	
	
	public EstadoDetalleProformaParameterReturnGeneral getestadodetalleproformaReturnGeneral() {
		return this.estadodetalleproformaReturnGeneral;
	}

	public void setestadodetalleproformaReturnGeneral(EstadoDetalleProformaParameterReturnGeneral estadodetalleproformaReturnGeneral) {
		this.estadodetalleproformaReturnGeneral = estadodetalleproformaReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoDetalleProformaLogic getEstadoDetalleProformaLogic()	{		
		return estadodetalleproformaLogic;
	}

	public void setEstadoDetalleProformaLogic(EstadoDetalleProformaLogic estadodetalleproformaLogic) {
		this.estadodetalleproformaLogic = estadodetalleproformaLogic;
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
	
	public Boolean getIsEsNuevoEstadoDetalleProforma() {
		return isEsNuevoEstadoDetalleProforma;
	}

	public void setIsEsNuevoEstadoDetalleProforma(Boolean isEsNuevoEstadoDetalleProforma) {
		this.isEsNuevoEstadoDetalleProforma = isEsNuevoEstadoDetalleProforma;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoDetalleProforma() {
		return esParaAccionDesdeFormularioEstadoDetalleProforma;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoDetalleProforma(Boolean esParaAccionDesdeFormularioEstadoDetalleProforma) {
		this.esParaAccionDesdeFormularioEstadoDetalleProforma = esParaAccionDesdeFormularioEstadoDetalleProforma;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoDetalleProforma() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoDetalleProformaConstantesFunciones.refrescarForeignKeysDescripcionesEstadoDetalleProforma(this.estadodetalleproformaLogic.getEstadoDetalleProformas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoDetalleProformaConstantesFunciones.refrescarForeignKeysDescripcionesEstadoDetalleProforma(this.estadodetalleproformas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadodetalleproformaLogic.setEstadoDetalleProformas(this.estadodetalleproformas);
			estadodetalleproformaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoDetalleProformaParameterReturnGeneral getEstadoDetalleProformaParameterGeneral() {
		return this.estadodetalleproformaParameterGeneral;
	}
	
	public void setEstadoDetalleProformaParameterGeneral(EstadoDetalleProformaParameterReturnGeneral estadodetalleproformaParameterGeneral) {
		this.estadodetalleproformaParameterGeneral = estadodetalleproformaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoDetalleProforma() {
		return isPermisoTodoEstadoDetalleProforma;
	}

	public void setIsPermisoTodoEstadoDetalleProforma(Boolean isPermisoTodoEstadoDetalleProforma) {
		this.isPermisoTodoEstadoDetalleProforma = isPermisoTodoEstadoDetalleProforma;
	}

	public Boolean getIsPermisoNuevoEstadoDetalleProforma() {
		return isPermisoNuevoEstadoDetalleProforma;
	}

	public void setIsPermisoNuevoEstadoDetalleProforma(Boolean isPermisoNuevoEstadoDetalleProforma) {
		this.isPermisoNuevoEstadoDetalleProforma = isPermisoNuevoEstadoDetalleProforma;
	}

	public Boolean getIsPermisoActualizarEstadoDetalleProforma() {
		return isPermisoActualizarEstadoDetalleProforma;
	}

	public void setIsPermisoActualizarEstadoDetalleProforma(Boolean isPermisoActualizarEstadoDetalleProforma) {
		this.isPermisoActualizarEstadoDetalleProforma = isPermisoActualizarEstadoDetalleProforma;
	}

	public Boolean getIsPermisoEliminarEstadoDetalleProforma() {
		return isPermisoEliminarEstadoDetalleProforma;
	}

	public void setIsPermisoEliminarEstadoDetalleProforma(Boolean isPermisoEliminarEstadoDetalleProforma) {
		this.isPermisoEliminarEstadoDetalleProforma = isPermisoEliminarEstadoDetalleProforma;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoDetalleProforma() {
		return isPermisoGuardarCambiosEstadoDetalleProforma;
	}

	public void setIsPermisoGuardarCambiosEstadoDetalleProforma(Boolean isPermisoGuardarCambiosEstadoDetalleProforma) {
		this.isPermisoGuardarCambiosEstadoDetalleProforma = isPermisoGuardarCambiosEstadoDetalleProforma;
	}
	
	public Boolean getIsPermisoConsultaEstadoDetalleProforma() {
		return isPermisoConsultaEstadoDetalleProforma;
	}

	public void setIsPermisoConsultaEstadoDetalleProforma(Boolean isPermisoConsultaEstadoDetalleProforma) {
		this.isPermisoConsultaEstadoDetalleProforma = isPermisoConsultaEstadoDetalleProforma;
	}

	public Boolean getIsPermisoBusquedaEstadoDetalleProforma() {
		return isPermisoBusquedaEstadoDetalleProforma;
	}

	public void setIsPermisoBusquedaEstadoDetalleProforma(Boolean isPermisoBusquedaEstadoDetalleProforma) {
		this.isPermisoBusquedaEstadoDetalleProforma = isPermisoBusquedaEstadoDetalleProforma;
	}

	public Boolean getIsPermisoReporteEstadoDetalleProforma() {
		return isPermisoReporteEstadoDetalleProforma;
	}

	public void setIsPermisoReporteEstadoDetalleProforma(Boolean isPermisoReporteEstadoDetalleProforma) {
		this.isPermisoReporteEstadoDetalleProforma = isPermisoReporteEstadoDetalleProforma;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoDetalleProforma() {
		return isPermisoPaginacionMedioEstadoDetalleProforma;
	}

	public void setIsPermisoPaginacionMedioEstadoDetalleProforma(Boolean isPermisoPaginacionMedioEstadoDetalleProforma) {
		this.isPermisoPaginacionMedioEstadoDetalleProforma = isPermisoPaginacionMedioEstadoDetalleProforma;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoDetalleProforma() {
		return isPermisoPaginacionTodoEstadoDetalleProforma;
	}

	public void setIsPermisoPaginacionTodoEstadoDetalleProforma(Boolean isPermisoPaginacionTodoEstadoDetalleProforma) {
		this.isPermisoPaginacionTodoEstadoDetalleProforma = isPermisoPaginacionTodoEstadoDetalleProforma;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoDetalleProforma() {
		return isPermisoPaginacionAltoEstadoDetalleProforma;
	}

	public void setIsPermisoPaginacionAltoEstadoDetalleProforma(Boolean isPermisoPaginacionAltoEstadoDetalleProforma) {
		this.isPermisoPaginacionAltoEstadoDetalleProforma = isPermisoPaginacionAltoEstadoDetalleProforma;
	}
	
	public Boolean getIsPermisoCopiarEstadoDetalleProforma() {
		return isPermisoCopiarEstadoDetalleProforma;
	}

	public void setIsPermisoCopiarEstadoDetalleProforma(Boolean isPermisoCopiarEstadoDetalleProforma) {
		this.isPermisoCopiarEstadoDetalleProforma = isPermisoCopiarEstadoDetalleProforma;
	}
	
	public Boolean getIsPermisoVerFormEstadoDetalleProforma() {
		return isPermisoVerFormEstadoDetalleProforma;
	}

	public void setIsPermisoVerFormEstadoDetalleProforma(Boolean isPermisoVerFormEstadoDetalleProforma) {
		this.isPermisoVerFormEstadoDetalleProforma = isPermisoVerFormEstadoDetalleProforma;
	}
	
	public Boolean getIsPermisoDuplicarEstadoDetalleProforma() {
		return isPermisoDuplicarEstadoDetalleProforma;
	}

	public void setIsPermisoDuplicarEstadoDetalleProforma(Boolean isPermisoDuplicarEstadoDetalleProforma) {
		this.isPermisoDuplicarEstadoDetalleProforma = isPermisoDuplicarEstadoDetalleProforma;
	}
	
	public Boolean getIsPermisoOrdenEstadoDetalleProforma() {
		return isPermisoOrdenEstadoDetalleProforma;
	}

	public void setIsPermisoOrdenEstadoDetalleProforma(Boolean isPermisoOrdenEstadoDetalleProforma) {
		this.isPermisoOrdenEstadoDetalleProforma = isPermisoOrdenEstadoDetalleProforma;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoDetalleProforma() {
		return isVisibilidadCeldaNuevoEstadoDetalleProforma;
	}

	public void setIsVisibilidadCeldaNuevoEstadoDetalleProforma(Boolean isVisibilidadCeldaNuevoEstadoDetalleProforma) {
		this.isVisibilidadCeldaNuevoEstadoDetalleProforma = isVisibilidadCeldaNuevoEstadoDetalleProforma;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoDetalleProforma() {
		return isVisibilidadCeldaDuplicarEstadoDetalleProforma;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoDetalleProforma(Boolean isVisibilidadCeldaDuplicarEstadoDetalleProforma) {
		this.isVisibilidadCeldaDuplicarEstadoDetalleProforma = isVisibilidadCeldaDuplicarEstadoDetalleProforma;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoDetalleProforma() {
		return isVisibilidadCeldaCopiarEstadoDetalleProforma;
	}

	public void setIsVisibilidadCeldaCopiarEstadoDetalleProforma(Boolean isVisibilidadCeldaCopiarEstadoDetalleProforma) {
		this.isVisibilidadCeldaCopiarEstadoDetalleProforma = isVisibilidadCeldaCopiarEstadoDetalleProforma;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoDetalleProforma() {
		return isVisibilidadCeldaVerFormEstadoDetalleProforma;
	}

	public void setIsVisibilidadCeldaVerFormEstadoDetalleProforma(Boolean isVisibilidadCeldaVerFormEstadoDetalleProforma) {
		this.isVisibilidadCeldaVerFormEstadoDetalleProforma = isVisibilidadCeldaVerFormEstadoDetalleProforma;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoDetalleProforma() {
		return isVisibilidadCeldaOrdenEstadoDetalleProforma;
	}

	public void setIsVisibilidadCeldaOrdenEstadoDetalleProforma(Boolean isVisibilidadCeldaOrdenEstadoDetalleProforma) {
		this.isVisibilidadCeldaOrdenEstadoDetalleProforma = isVisibilidadCeldaOrdenEstadoDetalleProforma;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoDetalleProforma() {
		return isVisibilidadCeldaNuevoRelacionesEstadoDetalleProforma;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoDetalleProforma(Boolean isVisibilidadCeldaNuevoRelacionesEstadoDetalleProforma) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleProforma = isVisibilidadCeldaNuevoRelacionesEstadoDetalleProforma;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoDetalleProforma() {
		return isVisibilidadCeldaModificarEstadoDetalleProforma;
	}

	public void setIsVisibilidadCeldaModificarEstadoDetalleProforma(Boolean isVisibilidadCeldaModificarEstadoDetalleProforma) {
		this.isVisibilidadCeldaModificarEstadoDetalleProforma = isVisibilidadCeldaModificarEstadoDetalleProforma;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoDetalleProforma() {
		return isVisibilidadCeldaActualizarEstadoDetalleProforma;
	}

	public void setIsVisibilidadCeldaActualizarEstadoDetalleProforma(Boolean isVisibilidadCeldaActualizarEstadoDetalleProforma) {
		this.isVisibilidadCeldaActualizarEstadoDetalleProforma = isVisibilidadCeldaActualizarEstadoDetalleProforma;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoDetalleProforma() {
		return isVisibilidadCeldaEliminarEstadoDetalleProforma;
	}

	public void setIsVisibilidadCeldaEliminarEstadoDetalleProforma(Boolean isVisibilidadCeldaEliminarEstadoDetalleProforma) {
		this.isVisibilidadCeldaEliminarEstadoDetalleProforma = isVisibilidadCeldaEliminarEstadoDetalleProforma;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoDetalleProforma() {
		return isVisibilidadCeldaCancelarEstadoDetalleProforma;
	}

	public void setIsVisibilidadCeldaCancelarEstadoDetalleProforma(Boolean isVisibilidadCeldaCancelarEstadoDetalleProforma) {
		this.isVisibilidadCeldaCancelarEstadoDetalleProforma = isVisibilidadCeldaCancelarEstadoDetalleProforma;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoDetalleProforma() {
		return isVisibilidadCeldaGuardarEstadoDetalleProforma;
	}

	public void setIsVisibilidadCeldaGuardarEstadoDetalleProforma(Boolean isVisibilidadCeldaGuardarEstadoDetalleProforma) {
		this.isVisibilidadCeldaGuardarEstadoDetalleProforma = isVisibilidadCeldaGuardarEstadoDetalleProforma;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoDetalleProforma() {
		return isVisibilidadCeldaGuardarCambiosEstadoDetalleProforma;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoDetalleProforma(Boolean isVisibilidadCeldaGuardarCambiosEstadoDetalleProforma) {
		this.isVisibilidadCeldaGuardarCambiosEstadoDetalleProforma = isVisibilidadCeldaGuardarCambiosEstadoDetalleProforma;
	}
		
	public EstadoDetalleProformaSessionBean getestadodetalleproformaSessionBean() {
		return this.estadodetalleproformaSessionBean;
	}
	
	public void setestadodetalleproformaSessionBean(EstadoDetalleProformaSessionBean estadodetalleproformaSessionBean) {
		this.estadodetalleproformaSessionBean=estadodetalleproformaSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleProforma(EstadoDetalleProforma estadodetalleproforma)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoDetalleProforma estadodetalleproforma,EstadoDetalleProforma estadodetalleproformaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoDetalleProforma(estadodetalleproforma);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadodetalleproformaAux.setId(estadodetalleproforma.getId());
		estadodetalleproformaAux.setVersionRow(estadodetalleproforma.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoDetalleProforma();
		
			int intSelectedRow = this.jTableDatosEstadoDetalleProforma.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleproforma =(EstadoDetalleProforma) this.estadodetalleproformaLogic.getEstadoDetalleProformas().toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadodetalleproforma =(EstadoDetalleProforma) this.estadodetalleproformas.toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoDetalleProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoDetalleProforma(this.estadodetalleproforma,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleProforma(this.estadodetalleproforma);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadodetalleproformaValidator.getInvalidValues(this.estadodetalleproforma);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadodetalleproformaLogic.setDatosCliente(datosCliente);
			estadodetalleproformaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadodetalleproformaAux=new  EstadoDetalleProforma();
				
				estadodetalleproformaAux.setIsNew(true);
				estadodetalleproformaAux.setIsChanged(true);
				
				estadodetalleproformaAux.setEstadoDetalleProformaOriginal(this.estadodetalleproforma);
				
				estadodetalleproformaAux.setId(this.estadodetalleproforma.getId());	
				estadodetalleproformaAux.setVersionRow(this.estadodetalleproforma.getVersionRow());	
				estadodetalleproformaAux.setcodigo(this.estadodetalleproforma.getcodigo());	
				estadodetalleproformaAux.setnombre(this.estadodetalleproforma.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadodetalleproformaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadodetalleproformaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadodetalleproformaAux,estadodetalleproformaLogic.getEstadoDetalleProformas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetalleproformaAux,estadodetalleproformas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadodetalleproformaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadodetalleproformaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetalleproformaLogic.saveEstadoDetalleProformas();//WithConnection
						//estadodetalleproformaLogic.getSetVersionRowEstadoDetalleProformas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadodetalleproforma,estadodetalleproformaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadodetalleproformaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.getDetalleProformas().addAll(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformas.addAll(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadodetalleproformaLogic.saveEstadoDetalleProformaRelaciones(estadodetalleproformaAux,this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.getDetalleProformas());//WithConnection
								//estadodetalleproformaLogic.getSetVersionRowEstadoDetalleProformas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadodetalleproforma,estadodetalleproformaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.setDetalleProformas(new ArrayList<DetalleProforma>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformas= new ArrayList<DetalleProforma>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodetalleproformaAux.setDetalleProformas(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.getDetalleProformas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadodetalleproformaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadodetalleproformaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadodetalleproformaAux,estadodetalleproformaLogic.getEstadoDetalleProformas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadodetalleproformaAux,estadodetalleproformas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadodetalleproforma,estadodetalleproformaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadodetalleproformaAux=new  EstadoDetalleProforma();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadodetalleproformaSessionBean.getEsGuardarRelacionado() 
					|| (this.estadodetalleproformaSessionBean.getEsGuardarRelacionado() && this.estadodetalleproforma.getId()>=0)) {
						
					estadodetalleproformaAux.setIsNew(false);
				}
				
				estadodetalleproformaAux.setIsDeleted(false);
			
				estadodetalleproformaAux.setId(this.estadodetalleproforma.getId());	
				estadodetalleproformaAux.setVersionRow(this.estadodetalleproforma.getVersionRow());	
				estadodetalleproformaAux.setcodigo(this.estadodetalleproforma.getcodigo());	
				estadodetalleproformaAux.setnombre(this.estadodetalleproforma.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadodetalleproformaAux,estadodetalleproformaLogic.getEstadoDetalleProformas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetalleproformaAux,estadodetalleproformas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadodetalleproformaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadodetalleproformaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetalleproformaLogic.saveEstadoDetalleProformas();//WithConnection
						//estadodetalleproformaLogic.getSetVersionRowEstadoDetalleProformas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadodetalleproforma,estadodetalleproformaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadodetalleproformaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.getDetalleProformas().addAll(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformas.addAll(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadodetalleproformaLogic.saveEstadoDetalleProformaRelaciones(estadodetalleproformaAux,this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.getDetalleProformas());//WithConnection
								//estadodetalleproformaLogic.getSetVersionRowEstadoDetalleProformas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadodetalleproforma,estadodetalleproformaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.setDetalleProformas(new ArrayList<DetalleProforma>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformas= new ArrayList<DetalleProforma>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodetalleproformaAux.setDetalleProformas(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.getDetalleProformas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadodetalleproformaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadodetalleproformaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadodetalleproformaAux,estadodetalleproformaLogic.getEstadoDetalleProformas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadodetalleproformaAux,estadodetalleproformas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadodetalleproforma,estadodetalleproformaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadodetalleproformaAux=new  EstadoDetalleProforma();
				
				estadodetalleproformaAux.setIsNew(false);
				estadodetalleproformaAux.setIsChanged(false);
				
				estadodetalleproformaAux.setIsDeleted(true);
				
				estadodetalleproformaAux.setId(this.estadodetalleproforma.getId());	
				estadodetalleproformaAux.setVersionRow(this.estadodetalleproforma.getVersionRow());	
				estadodetalleproformaAux.setcodigo(this.estadodetalleproforma.getcodigo());	
				estadodetalleproformaAux.setnombre(this.estadodetalleproforma.getnombre());	
				
				if(this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadodetalleproformaAux.getId()>=0) {	
						this.estadodetalleproformasEliminados.add(estadodetalleproformaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadodetalleproformaAux,estadodetalleproformaLogic.getEstadoDetalleProformas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetalleproformaAux,estadodetalleproformas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadodetalleproformaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadodetalleproformaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetalleproformaLogic.saveEstadoDetalleProformas();//WithConnection
						//estadodetalleproformaLogic.getSetVersionRowEstadoDetalleProformas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadodetalleproformaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.getDetalleProformas().addAll(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformas.addAll(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadodetalleproformaLogic.saveEstadoDetalleProformaRelaciones(estadodetalleproformaAux,this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.getDetalleProformas());//WithConnection
								//estadodetalleproformaLogic.getSetVersionRowEstadoDetalleProformas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.setDetalleProformas(new ArrayList<DetalleProforma>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformas= new ArrayList<DetalleProforma>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodetalleproformaAux.setDetalleProformas(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.getDetalleProformas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadodetalleproformaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadodetalleproformaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadodetalleproformaAux,estadodetalleproformaLogic.getEstadoDetalleProformas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadodetalleproformaAux,estadodetalleproformas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleproformaLogic.getEstadoDetalleProformas().addAll(this.estadodetalleproformasEliminados);
					
					estadodetalleproformaLogic.saveEstadoDetalleProformas();//WithConnection
					//estadodetalleproformaLogic.getSetVersionRowEstadoDetalleProformas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadodetalleproformasEliminados= new ArrayList<EstadoDetalleProforma>();		
			}
			
			if(this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Detalle Proforma GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Detalle Proforma",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadodetalleproforma=estadodetalleproformaAux;
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
      		//this.finishProcessEstadoDetalleProforma();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoDetalleProforma estadodetalleproformaLocal) throws Exception {
		
		if(this.estadodetalleproformaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadodetalleproformaLocal.setDetalleProformas(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.getDetalleProformas());
			
			} else {
			
				estadodetalleproformaLocal.setDetalleProformas(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoDetalleProforma estadodetalleproformaLocal) throws Exception {	
		if(this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoDetalleProformaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoDetalleProforma.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadodetalleproforma =(EstadoDetalleProforma) this.estadodetalleproformaLogic.getEstadoDetalleProformas().toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadodetalleproforma =(EstadoDetalleProforma) this.estadodetalleproformas.toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadodetalleproformaValidator.getInvalidValues(this.estadodetalleproforma);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoDetalleProforma estadodetalleproforma,List<EstadoDetalleProforma> estadodetalleproformas) throws Exception {
		try	{		
			EstadoDetalleProformaConstantesFunciones.actualizarLista(estadodetalleproforma,estadodetalleproformas,this.estadodetalleproformaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoDetalleProforma estadodetalleproforma,List<EstadoDetalleProforma> estadodetalleproformas) throws Exception {
		try	{			
			EstadoDetalleProformaConstantesFunciones.actualizarSelectedLista(estadodetalleproforma,estadodetalleproformas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoDetalleProforma> estadodetalleproformasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadodetalleproformasLocal=this.estadodetalleproformaLogic.getEstadoDetalleProformas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadodetalleproformasLocal=this.estadodetalleproformas;
			}
			//ARCHITECTURE
		
			for(EstadoDetalleProforma estadodetalleproformaLocal:estadodetalleproformasLocal) {
				if(this.permiteMantenimiento(estadodetalleproformaLocal) && estadodetalleproformaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoDetalleProformaConstantesFunciones.getEstadoDetalleProformaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoDetalleProformaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleProforma.jLabelcodigoEstadoDetalleProforma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoDetalleProformaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleProforma.jLabelnombreEstadoDetalleProforma,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoDetalleProforma.jLabelcodigoEstadoDetalleProforma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoDetalleProforma.jLabelnombreEstadoDetalleProforma,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleProforma")) {
			if(this.estadodetalleproforma==null) {
				this.estadodetalleproforma= new EstadoDetalleProforma();
			}

			if(this.estadodetalleproformaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoDetalleProforma
				this.setVariablesFormularioToObjetoActualEstadoDetalleProforma(this.estadodetalleproforma,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleProforma(this.estadodetalleproforma);

				this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.getdetalleproforma().setEstadoDetalleProforma(this.estadodetalleproforma);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoDetalleProforma--;	
		
		
		this.estadodetalleproformaAux=new EstadoDetalleProforma();
		
		this.estadodetalleproformaAux.setId(this.iIdNuevoEstadoDetalleProforma);
		this.estadodetalleproformaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadodetalleproformaLogic.getEstadoDetalleProformas().add(this.estadodetalleproformaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadodetalleproformas.add(this.estadodetalleproformaAux);
		}
		//ARCHITECTURE
		
		this.estadodetalleproforma=this.estadodetalleproformaAux;
		
		if(EstadoDetalleProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoDetalleProforma(this.estadodetalleproforma);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleProforma(this.estadodetalleproforma);
		}
				
		//this.setDefaultControlesEstadoDetalleProforma();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoDetalleProforma();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoDetalleProforma();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoDetalleProforma();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoDetalleProforma(this.estadodetalleproformaBean,this.estadodetalleproforma,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleProforma(this.estadodetalleproforma);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadodetalleproformaSessionBean.getConGuardarRelaciones()) {
			classes=EstadoDetalleProformaConstantesFunciones.getClassesRelationshipsOfEstadoDetalleProforma(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadodetalleproformaReturnGeneral=estadodetalleproformaLogic.procesarEventosEstadoDetalleProformasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadodetalleproformaLogic.getEstadoDetalleProformas(),this.estadodetalleproforma,this.estadodetalleproformaParameterGeneral,this.isEsNuevoEstadoDetalleProforma,classes);//this.estadodetalleproformaLogic.getEstadoDetalleProforma()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoDetalleProforma(this.estadodetalleproformaReturnGeneral,this.estadodetalleproformaBean,false);
		
		if(this.estadodetalleproformaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleProforma(this.estadodetalleproformaReturnGeneral.getEstadoDetalleProforma());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoDetalleProforma(this.estadodetalleproformaReturnGeneral.getEstadoDetalleProforma());
		}
		
		if(this.estadodetalleproformaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoDetalleProforma(this.estadodetalleproformaReturnGeneral.getEstadoDetalleProforma(),classes);//this.estadodetalleproformaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoDetalleProforma(this.estadodetalleproforma,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoDetalleProforma();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoDetalleProforma();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoDetalleProformaBeanSwingJInternalFrameAdditional.RecargarFormEstadoDetalleProforma(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoDetalleProforma(false);
						
			if(estadodetalleproformaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformaSessionBean.getEsGuardarRelacionado() && DetalleProformaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleProformaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoDetalleProformaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoDetalleProforma();
			}
			
			this.actualizarVisualTableDatosEstadoDetalleProforma();
			
			this.jTableDatosEstadoDetalleProforma.setRowSelectionInterval(this.getIndiceNuevoEstadoDetalleProforma(), this.getIndiceNuevoEstadoDetalleProforma());
			
			this.seleccionarFilaTablaEstadoDetalleProformaActual();
						
			this.actualizarEstadoCeldasBotonesEstadoDetalleProforma("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoDetalleProforma(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jTextFieldcodigoEstadoDetalleProforma.setEnabled(isHabilitar && this.estadodetalleproformaConstantesFunciones.activarcodigoEstadoDetalleProforma);
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jTextAreanombreEstadoDetalleProforma.setEnabled(isHabilitar && this.estadodetalleproformaConstantesFunciones.activarnombreEstadoDetalleProforma);	
		
	};
	
	public void setDefaultControlesEstadoDetalleProforma() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoDetalleProforma(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadodetalleproformaSessionBean.setConGuardarRelaciones(true);			
			this.estadodetalleproformaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jTabbedPaneRelacionesEstadoDetalleProforma.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadodetalleproformaSessionBean.setConGuardarRelaciones(false);			
			this.estadodetalleproformaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jTabbedPaneRelacionesEstadoDetalleProforma.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoDetalleProforma() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleProforma estadodetalleproformaAux:this.estadodetalleproformaLogic.getEstadoDetalleProformas()) {
				if(estadodetalleproformaAux.getId().equals(this.iIdNuevoEstadoDetalleProforma)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleProforma estadodetalleproformaAux:this.estadodetalleproformas) {
				if(estadodetalleproformaAux.getId().equals(this.iIdNuevoEstadoDetalleProforma)) {
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
	
	public int getIndiceActualEstadoDetalleProforma(EstadoDetalleProforma estadodetalleproforma,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleProforma estadodetalleproformaAux:this.estadodetalleproformaLogic.getEstadoDetalleProformas()) {
				if(estadodetalleproformaAux.getId().equals(estadodetalleproforma.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleProforma estadodetalleproformaAux:this.estadodetalleproformas) {
				if(estadodetalleproformaAux.getId().equals(estadodetalleproforma.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoDetalleProforma(EstadoDetalleProforma estadodetalleproformaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleProforma estadodetalleproformaAux:this.estadodetalleproformaLogic.getEstadoDetalleProformas()) {
				if(estadodetalleproformaAux.getEstadoDetalleProformaOriginal().getId().equals(estadodetalleproformaOriginal.getId())) {
					existe=true;
					estadodetalleproformaOriginal.setId(estadodetalleproformaAux.getId());
					estadodetalleproformaOriginal.setVersionRow(estadodetalleproformaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleProforma estadodetalleproformaAux:this.estadodetalleproformas) {
				if(estadodetalleproformaAux.getEstadoDetalleProformaOriginal().getId().equals(estadodetalleproformaOriginal.getId())) {
					existe=true;
					estadodetalleproformaOriginal.setId(estadodetalleproformaAux.getId());
					estadodetalleproformaOriginal.setVersionRow(estadodetalleproformaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoDetalleProforma(Boolean esParaCancelar) throws Exception {
		estadodetalleproformasAux=new ArrayList<EstadoDetalleProforma>();
		estadodetalleproformaAux=new EstadoDetalleProforma();
		
		if(!this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoDetalleProforma estadodetalleproformaAux:this.estadodetalleproformaLogic.getEstadoDetalleProformas()) {
					if(estadodetalleproformaAux.getId()<0) {
						estadodetalleproformasAux.add(estadodetalleproformaAux);
					}		
				}
				this.iIdNuevoEstadoDetalleProforma=0L;
				this.estadodetalleproformaLogic.getEstadoDetalleProformas().removeAll(estadodetalleproformasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetalleProforma estadodetalleproformaAux:this.estadodetalleproformas) {
					if(estadodetalleproformaAux.getId()<0) {
						estadodetalleproformasAux.add(estadodetalleproformaAux);
					}		
				}
				this.iIdNuevoEstadoDetalleProforma=0L;
				this.estadodetalleproformas.removeAll(estadodetalleproformasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoDetalleProforma 
					&& this.estadodetalleproformaLogic.getEstadoDetalleProformas().size()>0
					) {
					estadodetalleproformaAux=this.estadodetalleproformaLogic.getEstadoDetalleProformas().get(this.estadodetalleproformaLogic.getEstadoDetalleProformas().size() - 1);
				
					if(estadodetalleproformaAux.getId()<0) {
						this.estadodetalleproformaLogic.getEstadoDetalleProformas().remove(estadodetalleproformaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoDetalleProforma && this.estadodetalleproformas.size()>0) {
					estadodetalleproformaAux=this.estadodetalleproformas.get(this.estadodetalleproformas.size() - 1);
				
					if(estadodetalleproformaAux.getId()<0) {
						this.estadodetalleproformas.remove(estadodetalleproformaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoDetalleProforma(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadodetalleproforma.getId()<0) {
				this.estadodetalleproformaLogic.getEstadoDetalleProformas().remove(this.estadodetalleproforma);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadodetalleproforma.getId()<0) {
				this.estadodetalleproformas.remove(this.estadodetalleproforma);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoDetalleProforma(List<EstadoDetalleProforma> estadodetalleproformasAux) throws Exception {
		EstadoDetalleProformaConstantesFunciones.setEstadosInicialesEstadoDetalleProforma(estadodetalleproformasAux);
	}
	
	public void setEstadosInicialesEstadoDetalleProforma(EstadoDetalleProforma estadodetalleproformaAux) throws Exception {
		EstadoDetalleProformaConstantesFunciones.setEstadosInicialesEstadoDetalleProforma(estadodetalleproformaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoDetalleProformaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoDetalleProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoDetalleProformaActual()) {
				if(!this.isEsNuevoEstadoDetalleProforma) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoDetalleProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoDetalleProforma=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoDetalleProformaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Detalle Proforma ?", "MANTENIMIENTO DE Estado Detalle Proforma", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoDetalleProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoDetalleProforma estadodetalleproforma) throws Exception {
		EstadoDetalleProformaConstantesFunciones.seleccionarAsignar(this.estadodetalleproforma,estadodetalleproforma);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoDetalleProforma=this.isPermisoActualizarOriginalEstadoDetalleProforma;
			
			
			this.seleccionarAsignar(estadodetalleproforma);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoDetalleProformaConstantesFunciones.quitarEspaciosEstadoDetalleProforma(this.estadodetalleproforma,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoDetalleProforma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadodetalleproformaSessionBean.setsFuncionBusquedaRapida(this.estadodetalleproformaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoDetalleProforma) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoDetalleProforma(esParaCancelar);				
				this.cancelarNuevoEstadoDetalleProforma(esParaCancelar);								
			}
			
			this.estadodetalleproforma=new EstadoDetalleProforma();
			
			this.inicializarEstadoDetalleProforma();
			
			this.actualizarEstadoCeldasBotonesEstadoDetalleProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoDetalleProforma() throws Exception {
		try {
			EstadoDetalleProformaConstantesFunciones.inicializarEstadoDetalleProforma(this.estadodetalleproforma);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadodetalleproformaLogic.getEstadoDetalleProformas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoDetalleProformas(String sAccionBusqueda,List<EstadoDetalleProforma> estadodetalleproformasParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoDetalleProforma"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoDetalleProformaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoDetalleProformaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoDetalleProforma"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Detalle Proformas");		
		parameters.put("busquedapor", EstadoDetalleProformaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleProforma.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoDetalleProformaLogic estadodetalleproformaLogicAuxiliar=new EstadoDetalleProformaLogic();
					estadodetalleproformaLogicAuxiliar.setDatosCliente(estadodetalleproformaLogic.getDatosCliente());				
					estadodetalleproformaLogicAuxiliar.setEstadoDetalleProformas(estadodetalleproformasParaReportes);
					
					estadodetalleproformaLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoDetalleProformaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadodetalleproformasParaReportes=estadodetalleproformaLogicAuxiliar.getEstadoDetalleProformas();
					
					//estadodetalleproformaLogic.getNewConnexionToDeep();
					
					//for (EstadoDetalleProforma estadodetalleproforma:estadodetalleproformasParaReportes) {
					//	estadodetalleproformaLogic.deepLoad(estadodetalleproforma, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadodetalleproformaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadodetalleproformaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleProforma = AuxiliarReportes.class.getResourceAsStream("DetalleProformaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalleproforma", reportFileDetalleProforma);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoDetalleProforma=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoDetalleProformaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoDetalleProformaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoDetalleProforma=new JRBeanArrayDataSource(EstadoDetalleProformaJInternalFrame.TraerEstadoDetalleProformaBeans(estadodetalleproformasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoDetalleProforma);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoDetalleProformaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoDetalleProformaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoDetalleProformaBean.TraerEstadoDetalleProformaBeans(estadodetalleproformasParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoDetalleProformas(sAccionBusqueda,sTipoArchivoReporte,estadodetalleproformasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoDetalleProformas(sAccionBusqueda,sTipoArchivoReporte,estadodetalleproformasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoDetalleProformaActionPerformed(null);
					//this.generarExcelReporteEstadoDetalleProformas(sAccionBusqueda,sTipoArchivoReporte,estadodetalleproformasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoDetalleProformas(sAccionBusqueda,sTipoArchivoReporte,estadodetalleproformasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoDetalleProformas(sAccionBusqueda,sTipoArchivoReporte,estadodetalleproformasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoDetalleProformas(sAccionBusqueda,sTipoArchivoReporte,estadodetalleproformasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoDetalleProformas(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoDetalleProforma> estadodetalleproformasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleproforma";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoDetalleProformas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoDetalleProforma("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoDetalleProforma estadodetalleproforma : estadodetalleproformasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoDetalleProformaConstantesFunciones.generarExcelReporteDataEstadoDetalleProforma("NORMAL",row,workbook,estadodetalleproforma,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Proforma",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoDetalleProforma(String sTipo,Row row,Workbook workbook) {
		
		EstadoDetalleProformaConstantesFunciones.generarExcelReporteHeaderEstadoDetalleProforma(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoDetalleProformas(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoDetalleProforma> estadodetalleproformasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleproforma_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoDetalleProformas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoDetalleProforma estadodetalleproforma : estadodetalleproformasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoDetalleProformaConstantesFunciones.getEstadoDetalleProformaDescripcion(estadodetalleproforma));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoDetalleProformaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoDetalleProformaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadodetalleproforma.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoDetalleProformaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoDetalleProformaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadodetalleproforma.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Proforma",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoDetalleProformas(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoDetalleProforma> estadodetalleproformasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoDetalleProforma> estadodetalleproformasRespaldo=null;
		
		classes=EstadoDetalleProformaConstantesFunciones.getClassesRelationshipsOfEstadoDetalleProforma(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadodetalleproformaLogic.setDatosCliente(this.datosCliente);
		this.estadodetalleproformaLogic.setDatosDeep(this.datosDeep);
		this.estadodetalleproformaLogic.setIsConDeep(true);
		
		estadodetalleproformasRespaldo=this.estadodetalleproformaLogic.getEstadoDetalleProformas();
		
		this.estadodetalleproformaLogic.setEstadoDetalleProformas(estadodetalleproformasParaReportes);	
		this.estadodetalleproformaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadodetalleproformasParaReportes=this.estadodetalleproformaLogic.getEstadoDetalleProformas();
		this.estadodetalleproformaLogic.setEstadoDetalleProformas(estadodetalleproformasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleproforma_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoDetalleProformas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoDetalleProforma("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoDetalleProforma estadodetalleproforma : estadodetalleproformasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoDetalleProforma("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoDetalleProformaConstantesFunciones.generarExcelReporteDataEstadoDetalleProforma("NORMAL",row,workbook,estadodetalleproforma,cellStyleDataAux);
		
			
			


				//DetalleProforma
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleProformaConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadodetalleproforma.getDetalleProformas()!=null && estadodetalleproforma.getDetalleProformas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleProformaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleProformaConstantesFunciones.generarExcelReporteHeaderDetalleProforma("RELACIONADO",row,workbook);
				}

				if(estadodetalleproforma.getDetalleProformas()!=null) {
					i2=0;
					for(DetalleProforma detalleproforma : estadodetalleproforma.getDetalleProformas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleProformaConstantesFunciones.generarExcelReporteDataDetalleProforma("RELACIONADO",row,workbook,detalleproforma,cellStyleDataAuxHijo);
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
		cell.setCellValue(EstadoDetalleProformaConstantesFunciones.getEstadoDetalleProformaDescripcion(estadodetalleproforma));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Proforma",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoDetalleProforma() throws Exception {		
		this.startProcessEstadoDetalleProforma(true);
	}
	
	public void startProcessEstadoDetalleProforma(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoDetalleProforma, this.jScrollPanelDatosEstadoDetalleProforma,this.jPanelPaginacionEstadoDetalleProforma, this.jScrollPanelDatosEdicionEstadoDetalleProforma, this.jPanelAccionesEstadoDetalleProforma,this.jPanelAccionesFormularioEstadoDetalleProforma,this.jmenuBarEstadoDetalleProforma,this.jmenuBarDetalleEstadoDetalleProforma,this.jTtoolBarEstadoDetalleProforma,this.jTtoolBarDetalleEstadoDetalleProforma);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoDetalleProforma=null; 
		
		final JPanel jPanelParametrosReportesEstadoDetalleProforma=this.jPanelParametrosReportesEstadoDetalleProforma;
		//final JScrollPane jScrollPanelDatosEstadoDetalleProforma=this.jScrollPanelDatosEstadoDetalleProforma;
		final JTable jTableDatosEstadoDetalleProforma=this.jTableDatosEstadoDetalleProforma;		
		final JPanel jPanelPaginacionEstadoDetalleProforma=this.jPanelPaginacionEstadoDetalleProforma;
		//final JScrollPane jScrollPanelDatosEdicionEstadoDetalleProforma=this.jScrollPanelDatosEdicionEstadoDetalleProforma;
		final JPanel jPanelAccionesEstadoDetalleProforma=this.jPanelAccionesEstadoDetalleProforma;
		
		JPanel jPanelCamposAuxiliarEstadoDetalleProforma=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoDetalleProforma=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) {
			jPanelCamposAuxiliarEstadoDetalleProforma=this.jInternalFrameDetalleFormEstadoDetalleProforma.jPanelCamposEstadoDetalleProforma;
			jPanelAccionesFormularioAuxiliarEstadoDetalleProforma=this.jInternalFrameDetalleFormEstadoDetalleProforma.jPanelAccionesFormularioEstadoDetalleProforma;
		}
		
		final JPanel jPanelCamposEstadoDetalleProforma=jPanelCamposAuxiliarEstadoDetalleProforma;
		final JPanel jPanelAccionesFormularioEstadoDetalleProforma=jPanelAccionesFormularioAuxiliarEstadoDetalleProforma;
		
		
		final JMenuBar jmenuBarEstadoDetalleProforma=this.jmenuBarEstadoDetalleProforma;
		final JToolBar jTtoolBarEstadoDetalleProforma=this.jTtoolBarEstadoDetalleProforma;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoDetalleProforma=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoDetalleProforma=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) {
			jmenuBarDetalleAuxiliarEstadoDetalleProforma=this.jInternalFrameDetalleFormEstadoDetalleProforma.jmenuBarDetalleEstadoDetalleProforma;
			jTtoolBarDetalleAuxiliarEstadoDetalleProforma=this.jInternalFrameDetalleFormEstadoDetalleProforma.jTtoolBarDetalleEstadoDetalleProforma;
		}
		
		final JMenuBar jmenuBarDetalleEstadoDetalleProforma=jmenuBarDetalleAuxiliarEstadoDetalleProforma;
		final JToolBar jTtoolBarDetalleEstadoDetalleProforma=jTtoolBarDetalleAuxiliarEstadoDetalleProforma;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoDetalleProforma;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoDetalleProforma;
			processRunnable.jTableDatos=jTableDatosEstadoDetalleProforma;
			processRunnable.jPanelCampos=jPanelCamposEstadoDetalleProforma;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoDetalleProforma;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoDetalleProforma;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoDetalleProforma;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoDetalleProforma;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoDetalleProforma;
			processRunnable.jTtoolBar=jTtoolBarEstadoDetalleProforma;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoDetalleProforma;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoDetalleProforma ,jPanelParametrosReportesEstadoDetalleProforma,jTableDatosEstadoDetalleProforma, /*jScrollPanelDatosEstadoDetalleProforma,*/jPanelCamposEstadoDetalleProforma,jPanelPaginacionEstadoDetalleProforma, /*jScrollPanelDatosEdicionEstadoDetalleProforma,*/ jPanelAccionesEstadoDetalleProforma,jPanelAccionesFormularioEstadoDetalleProforma,jmenuBarEstadoDetalleProforma,jmenuBarDetalleEstadoDetalleProforma,jTtoolBarEstadoDetalleProforma,jTtoolBarDetalleEstadoDetalleProforma);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoDetalleProforma, jScrollPanelDatosEstadoDetalleProforma,jPanelPaginacionEstadoDetalleProforma, jScrollPanelDatosEdicionEstadoDetalleProforma, jPanelAccionesEstadoDetalleProforma,jPanelAccionesFormularioEstadoDetalleProforma,jmenuBarEstadoDetalleProforma,jmenuBarDetalleEstadoDetalleProforma,jTtoolBarEstadoDetalleProforma,jTtoolBarDetalleEstadoDetalleProforma);
						
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
	
	public void finishProcessEstadoDetalleProforma() {// throws Exception 
		this.finishProcessEstadoDetalleProforma(true);
	}
	
	public void finishProcessEstadoDetalleProforma(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoDetalleProforma, this.jScrollPanelDatosEstadoDetalleProforma,this.jPanelPaginacionEstadoDetalleProforma, this.jScrollPanelDatosEdicionEstadoDetalleProforma, this.jPanelAccionesEstadoDetalleProforma,this.jPanelAccionesFormularioEstadoDetalleProforma,this.jmenuBarEstadoDetalleProforma,this.jmenuBarDetalleEstadoDetalleProforma,this.jTtoolBarEstadoDetalleProforma,this.jTtoolBarDetalleEstadoDetalleProforma);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoDetalleProforma=null; 
		
		final JPanel jPanelParametrosReportesEstadoDetalleProforma=this.jPanelParametrosReportesEstadoDetalleProforma;
		//final JScrollPane jScrollPanelDatosEstadoDetalleProforma=this.jScrollPanelDatosEstadoDetalleProforma;
		final JTable jTableDatosEstadoDetalleProforma=this.jTableDatosEstadoDetalleProforma;		
		final JPanel jPanelPaginacionEstadoDetalleProforma=this.jPanelPaginacionEstadoDetalleProforma;
		//final JScrollPane jScrollPanelDatosEdicionEstadoDetalleProforma=this.jScrollPanelDatosEdicionEstadoDetalleProforma;
		final JPanel jPanelAccionesEstadoDetalleProforma=this.jPanelAccionesEstadoDetalleProforma;
		
		JPanel jPanelCamposAuxiliarEstadoDetalleProforma=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoDetalleProforma=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) {
			jPanelCamposAuxiliarEstadoDetalleProforma=this.jInternalFrameDetalleFormEstadoDetalleProforma.jPanelCamposEstadoDetalleProforma;
			jPanelAccionesFormularioAuxiliarEstadoDetalleProforma=this.jInternalFrameDetalleFormEstadoDetalleProforma.jPanelAccionesFormularioEstadoDetalleProforma;
		}
		
		final JPanel jPanelCamposEstadoDetalleProforma=jPanelCamposAuxiliarEstadoDetalleProforma;
		final JPanel jPanelAccionesFormularioEstadoDetalleProforma=jPanelAccionesFormularioAuxiliarEstadoDetalleProforma;
		
		
		final JMenuBar jmenuBarEstadoDetalleProforma=this.jmenuBarEstadoDetalleProforma;		
		final JToolBar jTtoolBarEstadoDetalleProforma=this.jTtoolBarEstadoDetalleProforma;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoDetalleProforma=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoDetalleProforma=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) {
			jmenuBarDetalleAuxiliarEstadoDetalleProforma=this.jInternalFrameDetalleFormEstadoDetalleProforma.jmenuBarDetalleEstadoDetalleProforma;
			jTtoolBarDetalleAuxiliarEstadoDetalleProforma=this.jInternalFrameDetalleFormEstadoDetalleProforma.jTtoolBarDetalleEstadoDetalleProforma;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoDetalleProforma=jmenuBarDetalleAuxiliarEstadoDetalleProforma;
		final JToolBar jTtoolBarDetalleEstadoDetalleProforma=jTtoolBarDetalleAuxiliarEstadoDetalleProforma;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoDetalleProforma;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoDetalleProforma;
			processRunnable.jTableDatos=jTableDatosEstadoDetalleProforma;
			processRunnable.jPanelCampos=jPanelCamposEstadoDetalleProforma;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoDetalleProforma;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoDetalleProforma;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoDetalleProforma;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoDetalleProforma;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoDetalleProforma;
			processRunnable.jTtoolBar=jTtoolBarEstadoDetalleProforma;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoDetalleProforma;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoDetalleProforma ,jPanelParametrosReportesEstadoDetalleProforma, jTableDatosEstadoDetalleProforma,/*jScrollPanelDatosEstadoDetalleProforma,*/jPanelCamposEstadoDetalleProforma,jPanelPaginacionEstadoDetalleProforma, /*jScrollPanelDatosEdicionEstadoDetalleProforma,*/ jPanelAccionesEstadoDetalleProforma,jPanelAccionesFormularioEstadoDetalleProforma,jmenuBarEstadoDetalleProforma,jmenuBarDetalleEstadoDetalleProforma,jTtoolBarEstadoDetalleProforma,jTtoolBarDetalleEstadoDetalleProforma));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoDetalleProforma(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoDetalleProforma(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoDetalleProforma(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoDetalleProforma(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoDetalleProforma,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoDetalleProforma,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoDetalleProforma(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoDetalleProforma,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoDetalleProforma,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadodetalleproformaConstantesFunciones.getsFinalQueryEstadoDetalleProforma();
		String  finalQueryPaginacionTodos=this.estadodetalleproformaConstantesFunciones.getsFinalQueryEstadoDetalleProforma();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoDetalleProformaConstantesFunciones.getArrayColumnasGlobalesNoEstadoDetalleProforma(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoDetalleProformaConstantesFunciones.getArrayColumnasGlobalesEstadoDetalleProforma(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoDetalleProformaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadodetalleproformasEliminados= new ArrayList<EstadoDetalleProforma>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoDetalleProforma();
		
				///*EstadoDetalleProformaSessionBean*/this.estadodetalleproformaSessionBean=new EstadoDetalleProformaSessionBean();
			
			if(this.estadodetalleproformaSessionBean==null) {
				this.estadodetalleproformaSessionBean=new EstadoDetalleProformaSessionBean();
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
					this.iNumeroPaginacion=EstadoDetalleProformaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoDetalleProformaConstantesFunciones.getClassesForeignKeysOfEstadoDetalleProforma(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadodetalleproforma."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadodetalleproformasAux= new ArrayList<EstadoDetalleProforma>();
			
				
			estadodetalleproformaLogic.setDatosCliente(this.datosCliente);
			estadodetalleproformaLogic.setDatosDeep(this.datosDeep);
			estadodetalleproformaLogic.setIsConDeep(true);
			
			
			estadodetalleproformaLogic.getEstadoDetalleProformaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadodetalleproformaLogic.getTodosEstadoDetalleProformas(finalQueryGlobal,pagination);
					
					//estadodetalleproformaLogic.getTodosEstadoDetalleProformasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadodetalleproformaLogic.getEstadoDetalleProformas()==null|| estadodetalleproformaLogic.getEstadoDetalleProformas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadodetalleproformasAux= new ArrayList<EstadoDetalleProforma>();
							estadodetalleproformasAux.addAll(estadodetalleproformaLogic.getEstadoDetalleProformas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadodetalleproformasAux= new ArrayList<EstadoDetalleProforma>();
							estadodetalleproformasAux.addAll(estadodetalleproformas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadodetalleproformaLogic.getTodosEstadoDetalleProformas(finalQueryGlobal+"",this.pagination);												
							
							//estadodetalleproformaLogic.getTodosEstadoDetalleProformasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoDetalleProformas("Todos",estadodetalleproformaLogic.getEstadoDetalleProformas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadodetalleproformaLogic.setEstadoDetalleProformas(new ArrayList<EstadoDetalleProforma>());					
							estadodetalleproformaLogic.getEstadoDetalleProformas().addAll(estadodetalleproformasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadodetalleproformas=new ArrayList<EstadoDetalleProforma>();
							estadodetalleproformas.addAll(estadodetalleproformasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoDetalleProforma=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoDetalleProforma=this.idActual;
				
				} else if(this.idEstadoDetalleProformaActual!=null && this.idEstadoDetalleProformaActual!=0L) {
					idEstadoDetalleProforma=idEstadoDetalleProformaActual;
				}
				
					
				this.sDetalleReporte=EstadoDetalleProformaConstantesFunciones.getDetalleIndicePorId(idEstadoDetalleProforma);
				
				this.estadodetalleproformas=new ArrayList<EstadoDetalleProforma>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadodetalleproformaLogic.getEntity(idEstadoDetalleProforma);
					
					//estadodetalleproformaLogic.getEntityWithConnection(idEstadoDetalleProforma);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadodetalleproformaLogic.setEstadoDetalleProformas(new ArrayList<EstadoDetalleProforma>());
					estadodetalleproformaLogic.getEstadoDetalleProformas().add(estadodetalleproformaLogic.getEstadoDetalleProforma());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadodetalleproformas=new ArrayList<EstadoDetalleProforma>();
					this.estadodetalleproformas.add(estadodetalleproforma);
				}
				
				if(estadodetalleproformaLogic.getEstadoDetalleProforma()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoDetalleProforma();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoDetalleProforma();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadodetalleproformaLogic.getEstadoDetalleProformas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadodetalleproformas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadodetalleproformaLogic.getEstadoDetalleProformas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadodetalleproformas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoDetalleProforma estadodetalleproforma) {
		Boolean permite=true;
		
		if(this.estadodetalleproforma.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoDetalleProformaConstantesFunciones.getOrderByListaEstadoDetalleProforma();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoDetalleProformaConstantesFunciones.getOrderByListaEstadoDetalleProforma();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleProforma estadodetalleproforma:estadodetalleproformaLogic.getEstadoDetalleProformas()) {
				if(estadodetalleproforma.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetalleproformaTotales=estadodetalleproforma;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleProforma estadodetalleproforma:this.estadodetalleproformas) {
				if(estadodetalleproforma.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetalleproformaTotales=estadodetalleproforma;
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
			this.estadodetalleproformaAux=new EstadoDetalleProforma();
			this.estadodetalleproformaAux.setsType(Constantes2.S_TOTALES);
			this.estadodetalleproformaAux.setIsNew(false);
			this.estadodetalleproformaAux.setIsChanged(false);
			this.estadodetalleproformaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoDetalleProformaConstantesFunciones.TotalizarValoresFilaEstadoDetalleProforma(this.estadodetalleproformaLogic.getEstadoDetalleProformas(),this.estadodetalleproformaAux);
				
				this.estadodetalleproformaLogic.getEstadoDetalleProformas().add(this.estadodetalleproformaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoDetalleProformaConstantesFunciones.TotalizarValoresFilaEstadoDetalleProforma(this.estadodetalleproformas,this.estadodetalleproformaAux);
				
				this.estadodetalleproformas.add(this.estadodetalleproformaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadodetalleproformaTotales=new EstadoDetalleProforma();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadodetalleproformaLogic.getEstadoDetalleProformas().remove(estadodetalleproformaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadodetalleproformas.remove(estadodetalleproformaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadodetalleproformaTotales=new EstadoDetalleProforma();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleProforma estadodetalleproforma:estadodetalleproformaLogic.getEstadoDetalleProformas()) {
				if(estadodetalleproforma.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetalleproformaTotales=estadodetalleproforma;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoDetalleProformaConstantesFunciones.TotalizarValoresFilaEstadoDetalleProforma(this.estadodetalleproformaLogic.getEstadoDetalleProformas(),estadodetalleproformaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleProforma estadodetalleproforma:this.estadodetalleproformas) {
				if(estadodetalleproforma.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetalleproformaTotales=estadodetalleproforma;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoDetalleProformaConstantesFunciones.TotalizarValoresFilaEstadoDetalleProforma(this.estadodetalleproformas,estadodetalleproformaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEstadoDetalleProformaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getEstadoDetalleProformaPorCodigo(String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadodetalleproformaLogic.getEstadoDetalleProformaPorCodigo(codigo);
				
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
	
	public void inicializarPermisosEstadoDetalleProforma() {
		this.isPermisoTodoEstadoDetalleProforma=false;
		this.isPermisoNuevoEstadoDetalleProforma=false;
		this.isPermisoActualizarEstadoDetalleProforma=false;
		this.isPermisoActualizarOriginalEstadoDetalleProforma=false;
		this.isPermisoEliminarEstadoDetalleProforma=false;
		this.isPermisoGuardarCambiosEstadoDetalleProforma=false;
		this.isPermisoConsultaEstadoDetalleProforma=false;
		this.isPermisoBusquedaEstadoDetalleProforma=false;
		this.isPermisoReporteEstadoDetalleProforma=false;		
		this.isPermisoOrdenEstadoDetalleProforma=false;		
		this.isPermisoPaginacionMedioEstadoDetalleProforma=false;		
		this.isPermisoPaginacionAltoEstadoDetalleProforma=false;
		this.isPermisoPaginacionTodoEstadoDetalleProforma=false;
		this.isPermisoCopiarEstadoDetalleProforma=false;		
		this.isPermisoVerFormEstadoDetalleProforma=false;		
		this.isPermisoDuplicarEstadoDetalleProforma=false;		
		this.isPermisoOrdenEstadoDetalleProforma=false;		
	}
	
	public void setPermisosUsuarioEstadoDetalleProforma(Boolean isPermiso) {
		this.isPermisoTodoEstadoDetalleProforma=isPermiso;
		this.isPermisoNuevoEstadoDetalleProforma=isPermiso;
		this.isPermisoActualizarEstadoDetalleProforma=isPermiso;
		this.isPermisoActualizarOriginalEstadoDetalleProforma=isPermiso;
		this.isPermisoEliminarEstadoDetalleProforma=isPermiso;
		this.isPermisoGuardarCambiosEstadoDetalleProforma=isPermiso;
		this.isPermisoConsultaEstadoDetalleProforma=isPermiso;
		this.isPermisoBusquedaEstadoDetalleProforma=isPermiso;
		this.isPermisoReporteEstadoDetalleProforma=isPermiso;
		this.isPermisoOrdenEstadoDetalleProforma=isPermiso;		
		this.isPermisoPaginacionMedioEstadoDetalleProforma=isPermiso;		
		this.isPermisoPaginacionAltoEstadoDetalleProforma=isPermiso;		
		this.isPermisoPaginacionTodoEstadoDetalleProforma=isPermiso;		
		this.isPermisoCopiarEstadoDetalleProforma=isPermiso;		
		this.isPermisoVerFormEstadoDetalleProforma=isPermiso;		
		this.isPermisoDuplicarEstadoDetalleProforma=isPermiso;
		this.isPermisoOrdenEstadoDetalleProforma=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoDetalleProforma(Boolean isPermiso) {
		//this.isPermisoTodoEstadoDetalleProforma=isPermiso;
		this.isPermisoNuevoEstadoDetalleProforma=isPermiso;
		this.isPermisoActualizarEstadoDetalleProforma=isPermiso;
		this.isPermisoActualizarOriginalEstadoDetalleProforma=isPermiso;
		this.isPermisoEliminarEstadoDetalleProforma=isPermiso;
		this.isPermisoGuardarCambiosEstadoDetalleProforma=isPermiso;
		//this.isPermisoConsultaEstadoDetalleProforma=isPermiso;
		//this.isPermisoBusquedaEstadoDetalleProforma=isPermiso;
		//this.isPermisoReporteEstadoDetalleProforma=isPermiso;
		//this.isPermisoOrdenEstadoDetalleProforma=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoDetalleProforma=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoDetalleProforma=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoDetalleProforma=isPermiso;		
		//this.isPermisoCopiarEstadoDetalleProforma=isPermiso;		
		//this.isPermisoDuplicarEstadoDetalleProforma=isPermiso;
		//this.isPermisoOrdenEstadoDetalleProforma=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoDetalleProformaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleProformaConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoDetalleProformaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleProforma=false;
		this.isTienePermisosDetalleProforma=this.verificarGetPermisosUsuarioOpcionEstadoDetalleProformaClaseRelacionada(this.opcionsRelacionadas,DetalleProformaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoDetalleProforma(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoDetalleProformaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleProforma=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoDetalleProformaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoDetalleProformaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoDetalleProformaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleProforma && this.jInternalFrameDetalleFormEstadoDetalleProforma!=null && this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jTabbedPaneRelacionesEstadoDetalleProforma.remove(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoDetalleProforma() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoDetalleProformaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoDetalleProformaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoDetalleProforma=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoDetalleProforma=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoDetalleProforma=this.isPermisoActualizarEstadoDetalleProforma;
			this.isPermisoEliminarEstadoDetalleProforma=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoDetalleProforma=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoDetalleProforma=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoDetalleProforma=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoDetalleProforma=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoDetalleProforma=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoDetalleProforma=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoDetalleProforma=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoDetalleProforma=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoDetalleProforma=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoDetalleProforma=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoDetalleProforma=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoDetalleProforma=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoDetalleProforma=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoDetalleProforma.setToolTipText(this.jTableDatosEstadoDetalleProforma.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoDetalleProforma(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoDetalleProforma(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoDetalleProformaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoDetalleProformaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoDetalleProforma() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleProforma && this.estadodetalleproformaConstantesFunciones.mostrarDetalleProformaEstadoDetalleProforma && !EstadoDetalleProformaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Proforma");
			reporte.setsDescripcion("Detalle Proforma");
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
	
		
	public void inicializarCombosForeignKeyEstadoDetalleProformaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoDetalleProformaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoDetalleProformaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoDetalleProformaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoDetalleProformaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoDetalleProforma()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoDetalleProforma()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoDetalleProforma(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoDetalleProforma()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoDetalleProforma();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleProforma(EstadoDetalleProforma estadodetalleproforma)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoDetalleProforma(EstadoDetalleProforma estadodetalleproforma,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoDetalleProforma()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoDetalleProforma()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoDetalleProforma()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoDetalleProforma()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoDetalleProforma()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoDetalleProforma()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoDetalleProforma(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoDetalleProforma()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoDetalleProformaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoDetalleProformaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoDetalleProformaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadodetalleproformaSessionBean=new EstadoDetalleProformaSessionBean(); 
		this.estadodetalleproformaConstantesFunciones=new EstadoDetalleProformaConstantesFunciones(); 
		this.estadodetalleproformaBean=new EstadoDetalleProforma();//(this.estadodetalleproformaConstantesFunciones); 		
		this.estadodetalleproformaReturnGeneral=new EstadoDetalleProformaParameterReturnGeneral(); 
		
		this.estadodetalleproformaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadodetalleproformaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoDetalleProformaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoDetalleProformaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoDetalleProformaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoDetalleProforma(true);
			
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
			
			this.estadodetalleproformaConstantesFunciones=new EstadoDetalleProformaConstantesFunciones(); 
			this.estadodetalleproformaBean=new EstadoDetalleProforma();//this.estadodetalleproformaConstantesFunciones); 			
			this.estadodetalleproformaReturnGeneral=new EstadoDetalleProformaParameterReturnGeneral(); 
		
			EstadoDetalleProformaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Detalle Proforma Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadodetalleproforma=new EstadoDetalleProforma();
			this.estadodetalleproformas = new ArrayList<EstadoDetalleProforma>();
			this.estadodetalleproformasAux = new ArrayList<EstadoDetalleProforma>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic=new EstadoDetalleProformaLogic();
				this.estadodetalleproformaLogic.getNewConnexionToDeep("");
			}
			
			//this.estadodetalleproformaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadodetalleproformaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoDetalleProforma);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoDetalleProforma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoDetalleProforma);	
					}
					
					if(this.jInternalFrameImportacionEstadoDetalleProforma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoDetalleProforma);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoDetalleProforma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoDetalleProforma);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoDetalleProforma);
				this.jInternalFrameDetalleFormEstadoDetalleProforma.setVisible(false);
				this.jInternalFrameDetalleFormEstadoDetalleProforma.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoDetalleProforma!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoDetalleProforma);
					this.jInternalFrameReporteDinamicoEstadoDetalleProforma.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoDetalleProforma.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoDetalleProforma!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoDetalleProforma);
					this.jInternalFrameImportacionEstadoDetalleProforma.setVisible(false);
					this.jInternalFrameImportacionEstadoDetalleProforma.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoDetalleProforma!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoDetalleProforma);
					this.jInternalFrameOrderByEstadoDetalleProforma.setVisible(false);
					this.jInternalFrameOrderByEstadoDetalleProforma.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoDetalleProformaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoDetalleProformaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadodetalleproformaReturnGeneral=new EstadoDetalleProformaParameterReturnGeneral();
			
			this.estadodetalleproformaParameterGeneral=new EstadoDetalleProformaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadodetalleproformaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoDetalleProformaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleProformaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoDetalleProformaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadodetalleproformaSessionBean.getEsGuardarRelacionado(),this.estadodetalleproformaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoDetalleProformaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadodetalleproformaSessionBean.getEsGuardarRelacionado(),this.estadodetalleproformaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoDetalleProforma=false;
			this.isVisibilidadCeldaDuplicarEstadoDetalleProforma=true;
			this.isVisibilidadCeldaCopiarEstadoDetalleProforma=true;
			this.isVisibilidadCeldaVerFormEstadoDetalleProforma=true;
			this.isVisibilidadCeldaOrdenEstadoDetalleProforma=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleProforma=false;
			this.isVisibilidadCeldaModificarEstadoDetalleProforma=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleProforma=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleProforma=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleProforma=false;
			this.isVisibilidadCeldaGuardarEstadoDetalleProforma=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleProforma=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoDetalleProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoDetalleProforma();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoDetalleProforma(false);
			
			this.setPermisosUsuarioEstadoDetalleProforma();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadodetalleproformaSessionBean.getEsGuardarRelacionado() 
				|| (this.estadodetalleproformaSessionBean.getEsGuardarRelacionado() && this.estadodetalleproformaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoDetalleProformaClasesRelacionadas();
			}
			
			if(this.estadodetalleproformaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoDetalleProformaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoDetalleProformaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoDetalleProforma();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoDetalleProforma();
			}
			
			if(!this.isPermisoBusquedaEstadoDetalleProforma) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoDetalleProforma,this.isPermisoPaginacionMedioEstadoDetalleProforma,this.isPermisoPaginacionTodoEstadoDetalleProforma);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoDetalleProformaConstantesFunciones.getTiposSeleccionarEstadoDetalleProforma());
				
				this.tiposColumnasSelect=EstadoDetalleProformaConstantesFunciones.getTiposSeleccionarEstadoDetalleProforma(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoDetalleProforma();				
				//this.tiposRelacionesSelect=EstadoDetalleProformaConstantesFunciones.getTiposRelacionesEstadoDetalleProforma(true);
				
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
			//if(!this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoDetalleProforma();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoDetalleProforma(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoDetalleProforma(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetalleProforma() ;
			
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
			
			
			this.detalleproformaLogic=new DetalleProformaLogic(); 
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
				estadodetalleproformaImplementable= (EstadoDetalleProformaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoDetalleProformaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadodetalleproformaImplementableHome= (EstadoDetalleProformaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoDetalleProformaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadodetalleproformas= new ArrayList<EstadoDetalleProforma>();
			this.estadodetalleproformasEliminados= new ArrayList<EstadoDetalleProforma>();
						
			this.isEsNuevoEstadoDetalleProforma=false;
			this.esParaAccionDesdeFormularioEstadoDetalleProforma=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoDetalleProforma(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoDetalleProforma();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadoDetalleProformaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoDetalleProformaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoDetalleProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoDetalleProforma(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoDetalleProforma();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoDetalleProforma();
			}
			
			EstadoDetalleProformaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoDetalleProforma(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoDetalleProforma: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoDetalleProforma() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleProformaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleProformaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoDetalleProforma")) {
				iIndex=this.jInternalFrameDetalleFormEstadoDetalleProforma.jTabbedPaneRelacionesEstadoDetalleProforma.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoDetalleProforma.jTabbedPaneRelacionesEstadoDetalleProforma.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoDetalleProforma.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Proformas")) {
					if(!DetalleProformaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoDetalleProforma();

						this.cargarParteTabPanelRelacionadaDetalleProforma(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoDetalleProforma();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleProforma(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoDetalleProforma.cargarSessionConBeanSwingJInternalFrameDetalleProforma(false,true,iIndex);
		this.jButtonDetalleProformaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleProforma();

		//this.jTabbedPaneRelacionesEstadoDetalleProforma.updateUI();
		//this.jTabbedPaneRelacionesEstadoDetalleProforma.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoDetalleProforma.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleProforma")) {
				int row=this.jTableDatosEstadoDetalleProforma.getSelectedRow();
				jButtonDetalleProformaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Proforma")) {

					if(this.isTienePermisosDetalleProforma && this.estadodetalleproformaConstantesFunciones.mostrarDetalleProformaEstadoDetalleProforma && !EstadoDetalleProformaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Proformas"+"("+DetalleProformaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Proformas");

						if(estadodetalleproformaConstantesFunciones.resaltarDetalleProformaEstadoDetalleProforma!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadodetalleproformaConstantesFunciones.resaltarDetalleProformaEstadoDetalleProforma);
						}

						jmenuItem.setEnabled(this.estadodetalleproformaConstantesFunciones.activarDetalleProformaEstadoDetalleProforma);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleProforma"));

						

						this.jInternalFrameDetalleFormEstadoDetalleProforma.jmenuDetalleEstadoDetalleProforma.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoDetalleProforma(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoDetalleProforma(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoDetalleProforma(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoDetalleProformaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoDetalleProforma();
		
		this.cargarCombosFrameForeignKeyEstadoDetalleProforma();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoDetalleProforma();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoDetalleProforma();
		}
	}
	
	
	
	public void jButtonNuevoEstadoDetalleProformaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadodetalleproformaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoDetalleProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
			
			
			if(jTableDatosEstadoDetalleProforma.getRowCount()>=1) {
				jTableDatosEstadoDetalleProforma.removeRowSelectionInterval(0, jTableDatosEstadoDetalleProforma.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoDetalleProforma=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoDetalleProforma(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoDetalleProforma(true);			
			//this.estadodetalleproforma=new EstadoDetalleProforma();
			//this.estadodetalleproforma.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoDetalleProforma(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetalleProforma() ;
			
			if(EstadoDetalleProformaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoDetalleProforma(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadodetalleproforma);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleproforma);				
			
			EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
			
			if(this.estadodetalleproformaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoDetalleProforma: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoDetalleProformaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoDetalleProforma> estadodetalleproformasSeleccionados=new ArrayList<EstadoDetalleProforma>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoDetalleProforma.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoDetalleProforma.getSelectedRows().length;			
			}
			
			estadodetalleproformasSeleccionados=this.getEstadoDetalleProformasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoDetalleProforma--;			
				//EstadoDetalleProforma estadodetalleproformaAux= new EstadoDetalleProforma();			
				//estadodetalleproformaAux.setId(this.iIdNuevoEstadoDetalleProforma);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoDetalleProforma estadodetalleproformaOrigen=new EstadoDetalleProforma();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoDetalleProforma estadodetalleproformaOrigen : estadodetalleproformasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoDetalleProforma.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadodetalleproformaOrigen =(EstadoDetalleProforma) this.estadodetalleproformaLogic.getEstadoDetalleProformas().toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadodetalleproformaOrigen =(EstadoDetalleProforma) this.estadodetalleproformas.toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoDetalleProforma();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadodetalleproforma.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoDetalleProforma(estadodetalleproformaOrigen,this.estadodetalleproforma,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleProforma(this.estadodetalleproforma);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadodetalleproformaLogic.getEstadoDetalleProformas().add(this.estadodetalleproformaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadodetalleproformas.add(this.estadodetalleproformaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoDetalleProforma(false);
				
				this.jTableDatosEstadoDetalleProforma.setRowSelectionInterval(this.getIndiceNuevoEstadoDetalleProforma(), this.getIndiceNuevoEstadoDetalleProforma());
				
				int iLastRow =  this.jTableDatosEstadoDetalleProforma.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoDetalleProforma.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoDetalleProforma.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoDetalleProforma(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoDetalleProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoDetalleProforma> estadodetalleproformasSeleccionados=new ArrayList<EstadoDetalleProforma>();									
		
			EstadoDetalleProforma estadodetalleproformaOrigen=new EstadoDetalleProforma();
			EstadoDetalleProforma estadodetalleproformaDestino=new EstadoDetalleProforma();
				
			estadodetalleproformasSeleccionados=this.getEstadoDetalleProformasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoDetalleProforma.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadodetalleproformasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoDetalleProforma.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetalleproformaOrigen =(EstadoDetalleProforma) this.estadodetalleproformaLogic.getEstadoDetalleProformas().toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadodetalleproformaOrigen =(EstadoDetalleProforma) this.estadodetalleproformas.toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetalleproformaDestino =(EstadoDetalleProforma) this.estadodetalleproformaLogic.getEstadoDetalleProformas().toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadodetalleproformaDestino =(EstadoDetalleProforma) this.estadodetalleproformas.toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadodetalleproformaOrigen =estadodetalleproformasSeleccionados.get(0);
				estadodetalleproformaDestino =estadodetalleproformasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoDetalleProforma(estadodetalleproformaOrigen,estadodetalleproformaDestino,true,false);
				
				estadodetalleproformaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadodetalleproformaDestino,estadodetalleproformaLogic.getEstadoDetalleProformas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetalleproformaDestino,estadodetalleproformas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoDetalleProforma(false);
				
				//this.jTableDatosEstadoDetalleProforma.setRowSelectionInterval(this.getIndiceNuevoEstadoDetalleProforma(), this.getIndiceNuevoEstadoDetalleProforma());
				
				int iLastRow =  this.jTableDatosEstadoDetalleProforma.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoDetalleProforma.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoDetalleProforma.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoDetalleProforma(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoDetalleProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoDetalleProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoDetalleProforma.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoDetalleProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoDetalleProforma.isVisible();
			
			
			this.jPanelParametrosReportesEstadoDetalleProforma.setVisible(!isVisible);
			this.jPanelPaginacionEstadoDetalleProforma.setVisible(!isVisible);
			this.jPanelAccionesEstadoDetalleProforma.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoDetalleProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoDetalleProforma();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoDetalleProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoDetalleProforma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoDetalleProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoDetalleProforma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoDetalleProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoDetalleProforma();
			
			this.abrirFrameOrderByEstadoDetalleProforma();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoDetalleProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoDetalleProforma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoDetalleProforma(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoDetalleProforma);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoDetalleProforma.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoDetalleProforma.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoDetalleProforma.setSize(this.jInternalFrameDetalleFormEstadoDetalleProforma.iWidthFormulario,this.jInternalFrameDetalleFormEstadoDetalleProforma.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoDetalleProforma.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoDetalleProforma.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoDetalleProforma.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoDetalleProforma.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoDetalleProforma.jContentPaneDetalleEstadoDetalleProforma.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoDetalleProforma.jTabbedPaneRelacionesEstadoDetalleProforma.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoDetalleProforma.jContentPaneDetalleEstadoDetalleProforma.getWidth(),EstadoDetalleProformaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoDetalleProforma.jTabbedPaneRelacionesEstadoDetalleProforma.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoDetalleProforma.jContentPaneDetalleEstadoDetalleProforma.getWidth(),EstadoDetalleProformaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoDetalleProforma.jTabbedPaneRelacionesEstadoDetalleProforma.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoDetalleProforma.jContentPaneDetalleEstadoDetalleProforma.getWidth(),EstadoDetalleProformaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleProformaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleProforma();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoDetalleProforma.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoDetalleProforma.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoDetalleProforma() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoDetalleProforma==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoDetalleProforma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetalleProforma,false,this);
				} else {
					this.jInternalFrameOrderByEstadoDetalleProforma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetalleProforma,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoDetalleProforma);
				this.jInternalFrameOrderByEstadoDetalleProforma.setVisible(false);
				this.jInternalFrameOrderByEstadoDetalleProforma.setSelected(false);
				
				this.jInternalFrameOrderByEstadoDetalleProforma.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoDetalleProforma"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoDetalleProforma();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoDetalleProforma() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoDetalleProforma==null) {
				
				this.jInternalFrameImportacionEstadoDetalleProforma=new ImportacionJInternalFrame(EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoDetalleProforma);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoDetalleProforma);
				this.jInternalFrameImportacionEstadoDetalleProforma.setVisible(false);
				this.jInternalFrameImportacionEstadoDetalleProforma.setSelected(false);


				this.jInternalFrameImportacionEstadoDetalleProforma.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoDetalleProforma"));
				this.jInternalFrameImportacionEstadoDetalleProforma.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoDetalleProforma"));
				this.jInternalFrameImportacionEstadoDetalleProforma.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoDetalleProforma"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoDetalleProforma() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoDetalleProforma==null) {
				this.jInternalFrameReporteDinamicoEstadoDetalleProforma=new ReporteDinamicoJInternalFrame(EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoDetalleProforma);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoDetalleProforma);
				this.jInternalFrameReporteDinamicoEstadoDetalleProforma.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoDetalleProforma.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoDetalleProforma"));
				this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoDetalleProforma"));
				this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoDetalleProforma"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoDetalleProforma();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleProforma() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.jScrollPanelDatosDetalleProforma.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoDetalleProforma.jContentPaneDetalleEstadoDetalleProforma.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.jScrollPanelDatosDetalleProforma.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.jScrollPanelDatosDetalleProforma.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.jScrollPanelDatosDetalleProforma.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoDetalleProforma() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoDetalleProforma);
			
	       	this.jInternalFrameDetalleFormEstadoDetalleProforma.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoDetalleProforma.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoDetalleProforma.dispose();
			//this.jInternalFrameDetalleFormEstadoDetalleProforma=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoDetalleProforma() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoDetalleProforma.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoDetalleProforma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoDetalleProforma() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoDetalleProforma.setVisible(true);
	        this.jInternalFrameImportacionEstadoDetalleProforma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoDetalleProforma() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoDetalleProforma.setVisible(true);
	        this.jInternalFrameOrderByEstadoDetalleProforma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoDetalleProforma() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoDetalleProforma.setVisible(false);
	        this.jInternalFrameOrderByEstadoDetalleProforma.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoDetalleProforma() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoDetalleProforma.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoDetalleProforma.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoDetalleProforma() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoDetalleProforma.setVisible(false);
	        this.jInternalFrameImportacionEstadoDetalleProforma.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoDetalleProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoDetalleProforma(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoDetalleProforma(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoDetalleProforma.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoDetalleProforma(true);
			//this.isEsNuevoEstadoDetalleProforma=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproforma =(EstadoDetalleProforma) this.estadodetalleproformaLogic.getEstadoDetalleProformas().toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadodetalleproforma =(EstadoDetalleProforma) this.estadodetalleproformas.toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoDetalleProforma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoDetalleProforma(false) ;
			
			if(estadodetalleproformaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformaSessionBean.getEsGuardarRelacionado() && DetalleProformaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleProformaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoDetalleProformaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoDetalleProforma(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetalleProforma(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoDetalleProformaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoDetalleProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleproforma =(EstadoDetalleProforma) this.estadodetalleproformaLogic.getEstadoDetalleProformas().toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleproforma =(EstadoDetalleProforma) this.estadodetalleproformas.toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoDetalleProforma(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoDetalleProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoDetalleProforma.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoDetalleProforma(true);
			//this.isEsNuevoEstadoDetalleProforma=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproforma =(EstadoDetalleProforma) this.estadodetalleproformaLogic.getEstadoDetalleProformas().toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadodetalleproforma =(EstadoDetalleProforma) this.estadodetalleproformas.toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadodetalleproforma.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoDetalleProforma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoDetalleProforma(false) ;
			
			if(EstadoDetalleProformaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoDetalleProforma(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetalleProforma(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoDetalleProformaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoDetalleProforma(false);
			
			//if(!this.isEsNuevoEstadoDetalleProforma) {								
				int intSelectedRow = this.jTableDatosEstadoDetalleProforma.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleproforma =(EstadoDetalleProforma) this.estadodetalleproformaLogic.getEstadoDetalleProformas().toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadodetalleproforma =(EstadoDetalleProforma) this.estadodetalleproformas.toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoDetalleProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoDetalleProforma(this.estadodetalleproforma,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleProforma(this.estadodetalleproforma);
				
			}
			
			if(this.permiteMantenimiento(this.estadodetalleproforma)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoDetalleProforma=true;
					this.inicializarActualizarBindingTablaEstadoDetalleProforma(false);
					this.isEsNuevoEstadoDetalleProforma=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoDetalleProforma=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoDetalleProforma=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoDetalleProforma(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoDetalleProforma(false);
				
				this.habilitarDeshabilitarControlesEstadoDetalleProforma(false);
			
												
				
				if(EstadoDetalleProformaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoDetalleProforma();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoDetalleProformaActionPerformed(evt,estadodetalleproformaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoDetalleProforma(this.estadodetalleproforma,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoDetalleProforma.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadodetalleproformaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadodetalleproforma.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleProforma.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleProforma.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoDetalleProformaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoDetalleProforma.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproforma =(EstadoDetalleProforma) this.estadodetalleproformaLogic.getEstadoDetalleProformas().toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
				this.estadodetalleproforma.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadodetalleproforma =(EstadoDetalleProforma) this.estadodetalleproformas.toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
				this.estadodetalleproforma.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadodetalleproforma)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoDetalleProformaModel) this.jTableDatosEstadoDetalleProforma.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoDetalleProforma=true;
				this.inicializarActualizarBindingTablaEstadoDetalleProforma(false);
				this.isEsNuevoEstadoDetalleProforma=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoDetalleProforma(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoDetalleProforma(false);
				
				this.habilitarDeshabilitarControlesEstadoDetalleProforma(false);
				
				
				
				if(EstadoDetalleProformaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoDetalleProforma();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoDetalleProformaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoDetalleProforma.getRowCount()>=1) {
				jTableDatosEstadoDetalleProforma.removeRowSelectionInterval(0, jTableDatosEstadoDetalleProforma.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoDetalleProforma(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoDetalleProforma(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoDetalleProforma(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetalleProforma(false) ;
			
			this.isEsNuevoEstadoDetalleProforma=false;
			
			if(EstadoDetalleProformaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoDetalleProforma();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoDetalleProformaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoDetalleProforma(false);
				
				//SI ES MANUAL
				if(EstadoDetalleProformaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoDetalleProforma();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoDetalleProformaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoDetalleProforma--;			
			//EstadoDetalleProforma estadodetalleproformaAux= new EstadoDetalleProforma();			
			//estadodetalleproformaAux.setId(this.iIdNuevoEstadoDetalleProforma);
			
			if(this.jInternalFrameDetalleFormEstadoDetalleProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoDetalleProforma();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleProforma(this.estadodetalleproforma);
			
			this.estadodetalleproforma.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadodetalleproformaLogic.getEstadoDetalleProformas().add(this.estadodetalleproformaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadodetalleproformas.add(this.estadodetalleproformaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoDetalleProforma(false);
			
			this.jTableDatosEstadoDetalleProforma.setRowSelectionInterval(this.getIndiceNuevoEstadoDetalleProforma(), this.getIndiceNuevoEstadoDetalleProforma());
			
			int iLastRow =  this.jTableDatosEstadoDetalleProforma.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoDetalleProforma.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoDetalleProforma.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoDetalleProforma(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoDetalleProformaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoDetalleProforma(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetalleProforma(false);
			
			//SI ES MANUAL
			if(EstadoDetalleProformaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoDetalleProforma();
			}
			
			//this.abrirFrameTreeEstadoDetalleProforma();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoDetalleProformaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Detalle ProformaS ?", "MANTENIMIENTO DE Estado Detalle Proforma", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoDetalleProforma.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoDetalleProforma();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadodetalleproformaReturnGeneral=estadodetalleproformaLogic.procesarImportacionEstadoDetalleProformasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadodetalleproformaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoDetalleProformaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoDetalleProformaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoDetalleProforma.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoDetalleProforma.setFileImportacion(this.jInternalFrameImportacionEstadoDetalleProforma.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoDetalleProforma.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoDetalleProforma.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoDetalleProforma.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoDetalleProforma.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoDetalleProformaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoDetalleProforma> estadodetalleproformasSeleccionados=new ArrayList<EstadoDetalleProforma>();		

		estadodetalleproformasSeleccionados=this.getEstadoDetalleProformasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoDetalleProformaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoDetalleProformaBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoDetalleProformas("Todos",estadodetalleproformasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Proforma",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoDetalleProformaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoDetalleProformaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoDetalleProformaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoDetalleProformaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoDetalleProformaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoDetalleProformaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoDetalleProformaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoDetalleProformaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoDetalleProformaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoDetalleProforma> estadodetalleproformasSeleccionados=new ArrayList<EstadoDetalleProforma>();		
		
		estadodetalleproformasSeleccionados=this.getEstadoDetalleProformasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleproforma";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoDetalleProformas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoDetalleProformaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoDetalleProformaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoDetalleProforma estadodetalleproforma:estadodetalleproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadodetalleproforma.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoDetalleProformaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoDetalleProformaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoDetalleProforma estadodetalleproforma:estadodetalleproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadodetalleproforma.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoDetalleProforma(row);				
			//	iRow++;
			//}				
			
			//for(EstadoDetalleProforma estadodetalleproformaAux:estadodetalleproformasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoDetalleProforma(estadodetalleproformaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Proforma",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadodetalleproformaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetalleProforma(false);
			
			//SI ES MANUAL
			if(EstadoDetalleProformaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoDetalleProforma();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoDetalleProformaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetalleProforma(false);
			
			//SI ES MANUAL
			if(EstadoDetalleProformaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoDetalleProforma();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoDetalleProformaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetalleProforma(false);
			
			//SI ES MANUAL
			if(EstadoDetalleProformaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoDetalleProforma();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleproformaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoDetalleProforma() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoDetalleProforma.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoDetalleProforma.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoDetalleProforma.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoDetalleProforma.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoDetalleProforma.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoDetalleProforma.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoDetalleProforma.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoDetalleProforma(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoDetalleProforma(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoDetalleProforma(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoDetalleProforma(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoDetalleProforma(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoDetalleProforma(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetalleProforma(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoDetalleProforma(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoDetalleProformaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoDetalleProformaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoDetalleProforma() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoDetalleProforma();
		
		this.inicializarActualizarBindingBotonesManualEstadoDetalleProforma(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoDetalleProforma();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetalleProforma() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoDetalleProforma(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoDetalleProforma(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoDetalleProforma.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoDetalleProforma.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoDetalleProforma.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoDetalleProforma.jCheckBoxPostAccionNuevoEstadoDetalleProforma.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoDetalleProforma.jCheckBoxPostAccionSinCerrarEstadoDetalleProforma.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoDetalleProforma.jCheckBoxPostAccionSinMensajeEstadoDetalleProforma.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoDetalleProforma.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoDetalleProforma.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoDetalleProforma.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) {
				this.jInternalFrameDetalleFormEstadoDetalleProforma.jCheckBoxPostAccionNuevoEstadoDetalleProforma.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoDetalleProforma.jCheckBoxPostAccionSinCerrarEstadoDetalleProforma.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoDetalleProforma.jCheckBoxPostAccionSinMensajeEstadoDetalleProforma.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoDetalleProforma.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoDetalleProforma.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoDetalleProforma.jComboBoxTiposAccionesFormularioEstadoDetalleProforma.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoDetalleProforma.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoDetalleProforma!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoDetalleProforma.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoDetalleProforma.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoDetalleProforma.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoDetalleProforma.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoDetalleProforma!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoDetalleProforma.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoDetalleProforma.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoDetalleProforma(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoDetalleProformaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoDetalleProforma(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetalleProforma() throws Exception {
		try	{
			if(EstadoDetalleProformaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoDetalleProforma();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoDetalleProforma() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jComboBoxTiposAccionesFormularioEstadoDetalleProforma.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jComboBoxTiposAccionesFormularioEstadoDetalleProforma.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoDetalleProforma() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoDetalleProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoDetalleProforma.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoDetalleProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoDetalleProforma.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoDetalleProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoDetalleProforma.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoDetalleProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoDetalleProforma.addItem(reporte);
			}
			
			
			if(!this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoDetalleProforma.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoDetalleProforma.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoDetalleProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoDetalleProforma.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoDetalleProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoDetalleProforma.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoDetalleProforma.jComboBoxTiposAccionesFormularioEstadoDetalleProforma.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoDetalleProforma.jComboBoxTiposAccionesFormularioEstadoDetalleProforma.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoDetalleProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoDetalleProforma.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoDetalleProforma.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoDetalleProforma();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoDetalleProforma() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoDetalleProforma!=null) {
				this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoDetalleProforma!=null) {
				this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoDetalleProforma!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoDetalleProforma()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoDetalleProforma(Boolean esInicializar) throws Exception {				
		if(EstadoDetalleProformaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoDetalleProforma();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoDetalleProforma() throws Exception {
		this.inicializarActualizarBindingTablaEstadoDetalleProforma(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoDetalleProforma() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoDetalleProforma.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoDetalleProforma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoDetalleProforma.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoDetalleProformaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoDetalleProforma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoDetalleProforma.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoDetalleProformaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoDetalleProformaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleProformaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoDetalleProformaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoDetalleProforma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoDetalleProforma.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoDetalleProformaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoDetalleProforma.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoDetalleProforma(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadodetalleproformaLogic.getEstadoDetalleProformas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadodetalleproformas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoDetalleProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoDetalleProforma.setModel(new EstadoDetalleProformaModel(this.estadodetalleproformaLogic.getEstadoDetalleProformas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoDetalleProforma.setModel(new EstadoDetalleProformaModel(this.estadodetalleproformas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoDetalleProforma!=null && this.jInternalFrameOrderByEstadoDetalleProforma.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoDetalleProforma();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoDetalleProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleProforma,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoDetalleProformaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO,estadodetalleproformaConstantesFunciones.resaltarSeleccionarEstadoDetalleProforma,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO,estadodetalleproformaConstantesFunciones.resaltarSeleccionarEstadoDetalleProforma,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoDetalleProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleProforma,EstadoDetalleProformaConstantesFunciones.LABEL_ID));

		if(this.estadodetalleproformaConstantesFunciones.mostraridEstadoDetalleProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoDetalleProformaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadodetalleproformaConstantesFunciones.resaltaridEstadoDetalleProforma,this.estadodetalleproformaConstantesFunciones.activaridEstadoDetalleProforma,this,true,"idEstadoDetalleProforma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadodetalleproformaConstantesFunciones.resaltaridEstadoDetalleProforma,this.estadodetalleproformaConstantesFunciones.activaridEstadoDetalleProforma,this,true,"idEstadoDetalleProforma","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoDetalleProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleProforma,EstadoDetalleProformaConstantesFunciones.LABEL_CODIGO));

		if(this.estadodetalleproformaConstantesFunciones.mostrarcodigoEstadoDetalleProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoDetalleProformaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadodetalleproformaConstantesFunciones.resaltarcodigoEstadoDetalleProforma,this.estadodetalleproformaConstantesFunciones.activarcodigoEstadoDetalleProforma,this,true,"codigoEstadoDetalleProforma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadodetalleproformaConstantesFunciones.resaltarcodigoEstadoDetalleProforma,this.estadodetalleproformaConstantesFunciones.activarcodigoEstadoDetalleProforma,this,true,"codigoEstadoDetalleProforma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoDetalleProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoDetalleProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleProforma,EstadoDetalleProformaConstantesFunciones.LABEL_NOMBRE));

		if(this.estadodetalleproformaConstantesFunciones.mostrarnombreEstadoDetalleProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoDetalleProformaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadodetalleproformaConstantesFunciones.resaltarnombreEstadoDetalleProforma,this.estadodetalleproformaConstantesFunciones.activarnombreEstadoDetalleProforma,this,true,"nombreEstadoDetalleProforma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadodetalleproformaConstantesFunciones.resaltarnombreEstadoDetalleProforma,this.estadodetalleproformaConstantesFunciones.activarnombreEstadoDetalleProforma,this,true,"nombreEstadoDetalleProforma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoDetalleProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleProforma && this.estadodetalleproformaConstantesFunciones.mostrarDetalleProformaEstadoDetalleProforma && !EstadoDetalleProformaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Proformas");
				tableColumn.setHeaderValue("Detalle Proformas");
				tableColumn.setCellRenderer(new DetalleProformaTableCell(estadodetalleproformaConstantesFunciones.resaltarDetalleProformaEstadoDetalleProforma,this,this.estadodetalleproformaConstantesFunciones.activarDetalleProformaEstadoDetalleProforma));
				tableColumn.setCellEditor(new DetalleProformaTableCell(estadodetalleproformaConstantesFunciones.resaltarDetalleProformaEstadoDetalleProforma,this,this.estadodetalleproformaConstantesFunciones.activarDetalleProformaEstadoDetalleProforma));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoDetalleProforma.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoDetalleProforma.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoDetalleProforma.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoDetalleProforma && this.isPermisoGuardarCambiosEstadoDetalleProforma) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoDetalleProforma.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadodetalleproformaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoDetalleProforma.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoDetalleProforma.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoDetalleProforma && this.isPermisoGuardarCambiosEstadoDetalleProforma) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadodetalleproformaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoDetalleProforma && this.isPermisoGuardarCambiosEstadoDetalleProforma) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoDetalleProforma.moveColumn(this.jTableDatosEstadoDetalleProforma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoDetalleProforma.moveColumn(this.jTableDatosEstadoDetalleProforma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadodetalleproformaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoDetalleProforma.moveColumn(this.jTableDatosEstadoDetalleProforma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoDetalleProforma.moveColumn(this.jTableDatosEstadoDetalleProforma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoDetalleProforma.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoDetalleProforma.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoDetalleProforma,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoDetalleProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoDetalleProforma.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoDetalleProforma.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoDetalleProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoDetalleProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoDetalleProforma.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoDetalleProforma.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoDetalleProforma.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadodetalleproformaLogic.getEstadoDetalleProformas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadodetalleproformas.size()-1;
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
		//this.jTableDatosEstadoDetalleProforma.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoDetalleProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoDetalleProforma();
			
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
				
				//this.isEsNuevoEstadoDetalleProforma=false;
					
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
			
				if(this.estadodetalleproformaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoDetalleProforma==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoDetalleProforma.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoDetalleProforma.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleproforma =(EstadoDetalleProforma) this.estadodetalleproformaLogic.getEstadoDetalleProformas().toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleproforma =(EstadoDetalleProforma) this.estadodetalleproformas.toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadodetalleproforma.getsType().equals("DUPLICADO")
				   || this.estadodetalleproforma.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoDetalleProforma=true;
				
				} else {
					this.isEsNuevoEstadoDetalleProforma=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
					if(this.estadodetalleproforma.getId()>=0 && !this.estadodetalleproforma.getIsNew()) {						
						this.isEsNuevoEstadoDetalleProforma=false;
						
					} else {
						this.isEsNuevoEstadoDetalleProforma=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoDetalleProforma(esRelaciones);						
				
				this.seleccionarEstadoDetalleProforma(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadodetalleproforma.getId()<0) {
					this.isEsNuevoEstadoDetalleProforma=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoDetalleProforma(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoDetalleProforma(evt,rowIndex);
				}	
				
				if(this.estadodetalleproformaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoDetalleProforma: " + this.dDif); 
					}
				}								
				
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoDetalleProforma(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadodetalleproforma)) {
					if(this.estadodetalleproforma.getId()>0) {
						this.estadodetalleproforma.setIsDeleted(true);
						
						this.estadodetalleproformasEliminados.add(this.estadodetalleproforma);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadodetalleproformaLogic.getEstadoDetalleProformas().remove(this.estadodetalleproforma);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadodetalleproformas.remove(this.estadodetalleproforma);				
					}
					
					
					((EstadoDetalleProformaModel) this.jTableDatosEstadoDetalleProforma.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoDetalleProforma(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoDetalleProforma(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoDetalleProforma) {
			
			if(this.jInternalFrameDetalleFormEstadoDetalleProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoDetalleProforma.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoDetalleProforma.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleproforma =(EstadoDetalleProforma) this.estadodetalleproformaLogic.getEstadoDetalleProformas().toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleproforma =(EstadoDetalleProforma) this.estadodetalleproformas.toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoDetalleProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoDetalleProforma(this.estadodetalleproforma);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoDetalleProforma("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoDetalleProforma(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoDetalleProforma() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoDetalleProforma(EstadoDetalleProforma estadodetalleproforma) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoDetalleProforma(estadodetalleproforma,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoDetalleProforma(EstadoDetalleProforma estadodetalleproforma,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoDetalleProforma(estadodetalleproforma);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoDetalleProforma(estadodetalleproforma,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleProforma(estadodetalleproforma);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoDetalleProforma(EstadoDetalleProforma estadodetalleproforma) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoDetalleProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jLabelidEstadoDetalleProforma.setText(estadodetalleproforma.getId().toString());
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jTextFieldcodigoEstadoDetalleProforma.setText(estadodetalleproforma.getcodigo());
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jTextAreanombreEstadoDetalleProforma.setText(estadodetalleproforma.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoDetalleProforma estadodetalleproformaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadodetalleproformaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoDetalleProforma estadodetalleproformaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadodetalleproformaLocal=this.estadodetalleproforma;
			} else {
				estadodetalleproformaLocal=this.estadodetalleproformaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadodetalleproformaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoDetalleProforma(estadodetalleproformaLocal,true);
					
					if(estadodetalleproformaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadodetalleproformaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadodetalleproformaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoDetalleProforma(EstadoDetalleProforma estadodetalleproforma,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoDetalleProforma(estadodetalleproforma,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleProforma(estadodetalleproforma);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoDetalleProforma(EstadoDetalleProforma estadodetalleproforma,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoDetalleProforma(estadodetalleproforma,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoDetalleProforma(EstadoDetalleProforma estadodetalleproforma,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoDetalleProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoDetalleProforma.jLabelidEstadoDetalleProforma.getText()==null || this.jInternalFrameDetalleFormEstadoDetalleProforma.jLabelidEstadoDetalleProforma.getText()=="" || this.jInternalFrameDetalleFormEstadoDetalleProforma.jLabelidEstadoDetalleProforma.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoDetalleProforma.jLabelidEstadoDetalleProforma.setText("0");
			}

			if(conColumnasBase) {estadodetalleproforma.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoDetalleProforma.jLabelidEstadoDetalleProforma.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoDetalleProformaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleProforma.jLabelIdEstadoDetalleProforma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadodetalleproforma.setcodigo(this.jInternalFrameDetalleFormEstadoDetalleProforma.jTextFieldcodigoEstadoDetalleProforma.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoDetalleProformaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleProforma.jLabelcodigoEstadoDetalleProforma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadodetalleproforma.setnombre(this.jInternalFrameDetalleFormEstadoDetalleProforma.jTextAreanombreEstadoDetalleProforma.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoDetalleProformaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleProforma.jLabelnombreEstadoDetalleProforma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoDetalleProforma(EstadoDetalleProforma estadodetalleproformaBean,EstadoDetalleProforma estadodetalleproforma,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoDetalleProforma(EstadoDetalleProforma estadodetalleproformaOrigen,EstadoDetalleProforma estadodetalleproforma,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadodetalleproformaOrigen.getId()!=null && !estadodetalleproformaOrigen.getId().equals(0L))) {estadodetalleproforma.setId(estadodetalleproformaOrigen.getId());}}
			if(conDefault || (!conDefault && estadodetalleproformaOrigen.getcodigo()!=null && !estadodetalleproformaOrigen.getcodigo().equals(""))) {estadodetalleproforma.setcodigo(estadodetalleproformaOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadodetalleproformaOrigen.getnombre()!=null && !estadodetalleproformaOrigen.getnombre().equals(""))) {estadodetalleproforma.setnombre(estadodetalleproformaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoDetalleProforma(EstadoDetalleProforma estadodetalleproforma) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jLabelidEstadoDetalleProforma.setText(estadodetalleproforma.getId().toString());
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jTextFieldcodigoEstadoDetalleProforma.setText(estadodetalleproforma.getcodigo());
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jTextAreanombreEstadoDetalleProforma.setText(estadodetalleproforma.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoDetalleProforma(EstadoDetalleProformaBean estadodetalleproformaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jLabelidEstadoDetalleProforma.setText(estadodetalleproformaBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jTextFieldcodigoEstadoDetalleProforma.setText(estadodetalleproformaBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jTextAreanombreEstadoDetalleProforma.setText(estadodetalleproformaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoDetalleProforma(EstadoDetalleProformaParameterReturnGeneral estadodetalleproformaReturnGeneral,EstadoDetalleProformaBean estadodetalleproformaBean,Boolean conDefault) throws Exception { 
		try {
			EstadoDetalleProforma estadodetalleproformaLocal=new EstadoDetalleProforma();
			
			estadodetalleproformaLocal=estadodetalleproformaReturnGeneral.getEstadoDetalleProforma();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadodetalleproformaLocal.getId()!=null && !estadodetalleproformaLocal.getId().equals(0L))) {estadodetalleproformaBean.setId(estadodetalleproformaLocal.getId());}}
			if(conDefault || (!conDefault && estadodetalleproformaLocal.getcodigo()!=null && !estadodetalleproformaLocal.getcodigo().equals(""))) {estadodetalleproformaBean.setcodigo(estadodetalleproformaLocal.getcodigo());}
			if(conDefault || (!conDefault && estadodetalleproformaLocal.getnombre()!=null && !estadodetalleproformaLocal.getnombre().equals(""))) {estadodetalleproformaBean.setnombre(estadodetalleproformaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoDetalleProformaGenerico(Long idEstadoDetalleProformaSeleccionado,JComboBox jComboBoxEstadoDetalleProforma,List<EstadoDetalleProforma> estadodetalleproformasLocal)throws Exception {
		try {
			EstadoDetalleProforma  estadodetalleproformaTemp=null;

			for(EstadoDetalleProforma estadodetalleproformaAux:estadodetalleproformasLocal) {
				if(estadodetalleproformaAux.getId()!=null && estadodetalleproformaAux.getId().equals(idEstadoDetalleProformaSeleccionado)) {
					estadodetalleproformaTemp=estadodetalleproformaAux;
					break;
				}
			}

			jComboBoxEstadoDetalleProforma.setSelectedItem(estadodetalleproformaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoDetalleProformaGenerico(JComboBox jComboBoxEstadoDetalleProforma,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoDetalleProforma.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoDetalleProforma.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoDetalleProforma.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoDetalleProforma.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetalleProforma")) {
			jButtonDetalleProformaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadodetalleproforma=(EstadoDetalleProforma) estadodetalleproformaLogic.getEstadoDetalleProformas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadodetalleproforma =(EstadoDetalleProforma) estadodetalleproformas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoDetalleProforma estadodetalleproformaRow=new EstadoDetalleProforma();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadodetalleproformaRow=(EstadoDetalleProforma) estadodetalleproformaLogic.getEstadoDetalleProformas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadodetalleproformaRow=(EstadoDetalleProforma) estadodetalleproformas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleProformaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoDetalleProforma estadodetalleproforma) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoDetalleProforma==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleproformaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetalleproforma = (EstadoDetalleProforma)this.estadodetalleproformaLogic.getEstadoDetalleProformas().toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadodetalleproforma = (EstadoDetalleProforma)this.estadodetalleproformas.toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadodetalleproforma!=null) {
						this.estadodetalleproforma = estadodetalleproforma;
					} else {
						this.estadodetalleproforma = new EstadoDetalleProforma();
					}
				}

				if(this.isTienePermisosDetalleProforma && this.permiteMantenimiento(this.estadodetalleproforma)) {
					DetalleProformaBeanSwingJInternalFrame detalleproformaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFramePopup=new DetalleProformaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleproformaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFramePopup;
					} else {
						detalleproformaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame;
					}

					List<EstadoDetalleProforma> estadodetalleproformas=new ArrayList<EstadoDetalleProforma>();
					estadodetalleproformas.add(this.estadodetalleproforma);
					if(!esRelacionado) {
						//detalleproformaBeanSwingJInternalFrame.detalleproformaSessionBean.setConGuardarRelaciones(false);
						//detalleproformaBeanSwingJInternalFrame.detalleproformaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleproformaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoDetalleProforma.cargarDetalleProformaBeanSwingJInternalFrame(estadodetalleproformas,this.estadodetalleproforma,detalleproformaBeanSwingJInternalFrame,/*conInicializar,*/detalleproformaBeanSwingJInternalFrame.detalleproformaSessionBean.getConGuardarRelaciones(),detalleproformaBeanSwingJInternalFrame.detalleproformaSessionBean.getEsGuardarRelacionado());
					detalleproformaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleproformaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleProforma("no_relacionado");

						detalleproformaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleProformaConstantesFunciones.ITAMANIOFILATABLA + (DetalleProformaConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleproformaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoDetalleProforma=(TitledBorder)this.jScrollPanelDatosEstadoDetalleProforma.getBorder();
						TitledBorder titledBorderDetalleProforma=(TitledBorder)detalleproformaBeanSwingJInternalFrame.jScrollPanelDatosDetalleProforma.getBorder();

						titledBorderDetalleProforma.setTitle(titledBorderEstadoDetalleProforma.getTitle() + " -> Detalle Proforma");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleproformaBeanSwingJInternalFrame);
						}

						detalleproformaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleproformaBeanSwingJInternalFrame);

						detalleproformaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadodetalleproformaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Proforma",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleproformaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleproformaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoDetalleProforma(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleProforma && this.isPermisoNuevoEstadoDetalleProforma));			
			this.jButtonDuplicarEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaDuplicarEstadoDetalleProforma && this.isPermisoDuplicarEstadoDetalleProforma));			
			this.jButtonCopiarEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaCopiarEstadoDetalleProforma && this.isPermisoCopiarEstadoDetalleProforma));
			this.jButtonVerFormEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaVerFormEstadoDetalleProforma && this.isPermisoVerFormEstadoDetalleProforma));
			
			this.jButtonAbrirOrderByEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleProforma && this.isPermisoOrdenEstadoDetalleProforma));			
			
			this.jButtonNuevoRelacionesEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleProforma && this.isPermisoNuevoEstadoDetalleProforma));			
			this.jButtonNuevoGuardarCambiosEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleProforma && this.isPermisoNuevoEstadoDetalleProforma && this.isPermisoGuardarCambiosEstadoDetalleProforma));
			
			if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonModificarEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaModificarEstadoDetalleProforma && this.isPermisoActualizarEstadoDetalleProforma));	
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonActualizarEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaActualizarEstadoDetalleProforma && this.isPermisoActualizarEstadoDetalleProforma));	
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonEliminarEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaEliminarEstadoDetalleProforma && this.isPermisoEliminarEstadoDetalleProforma));
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonCancelarEstadoDetalleProforma.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleProforma);							
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonGuardarCambiosEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaGuardarEstadoDetalleProforma && this.isPermisoGuardarCambiosEstadoDetalleProforma));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoDetalleProforma && this.isPermisoGuardarCambiosEstadoDetalleProforma));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleProforma && this.isPermisoNuevoEstadoDetalleProforma));						
			this.jButtonDuplicarToolBarEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaDuplicarEstadoDetalleProforma && this.isPermisoDuplicarEstadoDetalleProforma));						
			this.jButtonCopiarToolBarEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaCopiarEstadoDetalleProforma && this.isPermisoCopiarEstadoDetalleProforma));			
			this.jButtonVerFormToolBarEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaVerFormEstadoDetalleProforma && this.isPermisoVerFormEstadoDetalleProforma));			
			this.jButtonAbrirOrderByToolBarEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleProforma && this.isPermisoOrdenEstadoDetalleProforma));
			this.jButtonNuevoRelacionesToolBarEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleProforma && this.isPermisoNuevoEstadoDetalleProforma));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleProforma && this.isPermisoNuevoEstadoDetalleProforma && this.isPermisoGuardarCambiosEstadoDetalleProforma));			
			
			if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonModificarToolBarEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaModificarEstadoDetalleProforma && this.isPermisoActualizarEstadoDetalleProforma));	
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonActualizarToolBarEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaActualizarEstadoDetalleProforma  && this.isPermisoActualizarEstadoDetalleProforma));	
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonEliminarToolBarEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaEliminarEstadoDetalleProforma && this.isPermisoEliminarEstadoDetalleProforma));
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonCancelarToolBarEstadoDetalleProforma.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleProforma);				
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonGuardarCambiosToolBarEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaGuardarEstadoDetalleProforma && this.isPermisoGuardarCambiosEstadoDetalleProforma));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoDetalleProforma && this.isPermisoGuardarCambiosEstadoDetalleProforma));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleProforma && this.isPermisoNuevoEstadoDetalleProforma));			
			this.jMenuItemDuplicarEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaDuplicarEstadoDetalleProforma && this.isPermisoDuplicarEstadoDetalleProforma));			
			this.jMenuItemCopiarEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaCopiarEstadoDetalleProforma && this.isPermisoCopiarEstadoDetalleProforma));			
			this.jMenuItemVerFormEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaVerFormEstadoDetalleProforma && this.isPermisoVerFormEstadoDetalleProforma));			
			this.jMenuItemAbrirOrderByEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleProforma && this.isPermisoOrdenEstadoDetalleProforma));			
			//this.jMenuItemMostrarOcultarEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleProforma && this.isPermisoOrdenEstadoDetalleProforma));
			this.jMenuItemDetalleAbrirOrderByEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleProforma && this.isPermisoOrdenEstadoDetalleProforma));			
			//this.jMenuItemDetalleMostrarOcultarEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleProforma && this.isPermisoOrdenEstadoDetalleProforma));			
			this.jMenuItemNuevoRelacionesEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleProforma && this.isPermisoNuevoEstadoDetalleProforma));			
			this.jMenuItemNuevoGuardarCambiosEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleProforma && this.isPermisoNuevoEstadoDetalleProforma && this.isPermisoGuardarCambiosEstadoDetalleProforma));									
			
			if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jMenuItemModificarEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaModificarEstadoDetalleProforma && this.isPermisoActualizarEstadoDetalleProforma));	
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jMenuItemActualizarEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaActualizarEstadoDetalleProforma && this.isPermisoActualizarEstadoDetalleProforma));	
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jMenuItemEliminarEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaEliminarEstadoDetalleProforma && this.isPermisoEliminarEstadoDetalleProforma));
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jMenuItemCancelarEstadoDetalleProforma.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleProforma);				
			}
			
			this.jMenuItemGuardarCambiosEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaGuardarEstadoDetalleProforma && this.isPermisoGuardarCambiosEstadoDetalleProforma));						
			this.jMenuItemGuardarCambiosTablaEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoDetalleProforma && this.isPermisoGuardarCambiosEstadoDetalleProforma));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoDetalleProforma=this.jButtonNuevoEstadoDetalleProforma.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoDetalleProforma=this.jButtonDuplicarEstadoDetalleProforma.isVisible();
			this.isVisibilidadCeldaCopiarEstadoDetalleProforma=this.jButtonCopiarEstadoDetalleProforma.isVisible();
			this.isVisibilidadCeldaVerFormEstadoDetalleProforma=this.jButtonVerFormEstadoDetalleProforma.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoDetalleProforma=this.jButtonAbrirOrderByEstadoDetalleProforma.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleProforma=this.jButtonNuevoRelacionesEstadoDetalleProforma.isVisible();
			this.isVisibilidadCeldaModificarEstadoDetalleProforma=this.jButtonModificarEstadoDetalleProforma.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) {
			this.isVisibilidadCeldaActualizarEstadoDetalleProforma=this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonActualizarEstadoDetalleProforma.isVisible();
			this.isVisibilidadCeldaEliminarEstadoDetalleProforma=this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonEliminarEstadoDetalleProforma.isVisible();
			this.isVisibilidadCeldaCancelarEstadoDetalleProforma=this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonCancelarEstadoDetalleProforma.isVisible();
			this.isVisibilidadCeldaGuardarEstadoDetalleProforma=this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonGuardarCambiosEstadoDetalleProforma.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleProforma=this.jButtonGuardarCambiosTablaEstadoDetalleProforma.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoDetalleProforma=this.jButtonNuevoToolBarEstadoDetalleProforma.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleProforma=this.jButtonNuevoRelacionesToolBarEstadoDetalleProforma.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) {
			this.isVisibilidadCeldaModificarEstadoDetalleProforma=this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonModificarToolBarEstadoDetalleProforma.isVisible();
			this.isVisibilidadCeldaActualizarEstadoDetalleProforma=this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonActualizarToolBarEstadoDetalleProforma.isVisible();
			this.isVisibilidadCeldaEliminarEstadoDetalleProforma=this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonEliminarToolBarEstadoDetalleProforma.isVisible();
			this.isVisibilidadCeldaCancelarEstadoDetalleProforma=this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonCancelarToolBarEstadoDetalleProforma.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoDetalleProforma=this.jButtonGuardarCambiosToolBarEstadoDetalleProforma.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleProforma=this.jButtonGuardarCambiosTablaToolBarEstadoDetalleProforma.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoDetalleProforma=this.jMenuItemNuevoEstadoDetalleProforma.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleProforma=this.jMenuItemNuevoRelacionesEstadoDetalleProforma.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) {
			this.isVisibilidadCeldaModificarEstadoDetalleProforma=this.jInternalFrameDetalleFormEstadoDetalleProforma.jMenuItemModificarEstadoDetalleProforma.isVisible();
			this.isVisibilidadCeldaActualizarEstadoDetalleProforma=this.jInternalFrameDetalleFormEstadoDetalleProforma.jMenuItemActualizarEstadoDetalleProforma.isVisible();
			this.isVisibilidadCeldaEliminarEstadoDetalleProforma=this.jInternalFrameDetalleFormEstadoDetalleProforma.jMenuItemEliminarEstadoDetalleProforma.isVisible();
			this.isVisibilidadCeldaCancelarEstadoDetalleProforma=this.jInternalFrameDetalleFormEstadoDetalleProforma.jMenuItemCancelarEstadoDetalleProforma.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoDetalleProforma=this.jMenuItemGuardarCambiosEstadoDetalleProforma.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleProforma=this.jMenuItemGuardarCambiosTablaEstadoDetalleProforma.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoDetalleProforma(Boolean esInicializar) {
		if(EstadoDetalleProformaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadodetalleproformaSessionBean.getConGuardarRelaciones()) {
				//if(this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoDetalleProforma();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoDetalleProforma(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoDetalleProforma() {
		this.jButtonNuevoEstadoDetalleProforma.setVisible(this.isPermisoNuevoEstadoDetalleProforma);			
		this.jButtonDuplicarEstadoDetalleProforma.setVisible(this.isPermisoDuplicarEstadoDetalleProforma);			
		this.jButtonCopiarEstadoDetalleProforma.setVisible(this.isPermisoCopiarEstadoDetalleProforma);			
		this.jButtonVerFormEstadoDetalleProforma.setVisible(this.isPermisoVerFormEstadoDetalleProforma);			
		
		this.jButtonAbrirOrderByEstadoDetalleProforma.setVisible(this.isPermisoOrdenEstadoDetalleProforma);					
		
		this.jButtonNuevoRelacionesEstadoDetalleProforma.setVisible(this.isPermisoNuevoEstadoDetalleProforma);			
		
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonModificarEstadoDetalleProforma.setVisible(this.isPermisoActualizarEstadoDetalleProforma);	
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonActualizarEstadoDetalleProforma.setVisible(this.isPermisoActualizarEstadoDetalleProforma);	
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonEliminarEstadoDetalleProforma.setVisible(this.isPermisoEliminarEstadoDetalleProforma);
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonCancelarEstadoDetalleProforma.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleProforma);						
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonGuardarCambiosEstadoDetalleProforma.setVisible(this.isPermisoGuardarCambiosEstadoDetalleProforma);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoDetalleProforma.setVisible(this.isPermisoActualizarEstadoDetalleProforma);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoDetalleProforma() {
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonModificarEstadoDetalleProforma.setVisible(this.isPermisoActualizarEstadoDetalleProforma);	
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonActualizarEstadoDetalleProforma.setVisible(this.isPermisoActualizarEstadoDetalleProforma);	
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonEliminarEstadoDetalleProforma.setVisible(this.isPermisoEliminarEstadoDetalleProforma);
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonCancelarEstadoDetalleProforma.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleProforma);							
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonGuardarCambiosEstadoDetalleProforma.setVisible((this.isVisibilidadCeldaGuardarEstadoDetalleProforma && this.isPermisoGuardarCambiosEstadoDetalleProforma));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoDetalleProforma() {
		if(EstadoDetalleProformaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoDetalleProforma();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoDetalleProforma() {
	}
	
	public void jTableDatosEstadoDetalleProformaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoDetalleProforma(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoDetalleProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoDetalleProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoDetalleProforma(this.getestadodetalleproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleProforma(this.estadodetalleproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetalleproforma =(EstadoDetalleProforma) this.estadodetalleproformaLogic.getEstadoDetalleProformas().toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadodetalleproforma =(EstadoDetalleProforma) this.estadodetalleproformas.toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadodetalleproforma==null) {
						this.estadodetalleproforma = new EstadoDetalleProforma();
					}

					this.setVariablesFormularioToObjetoActualEstadoDetalleProforma(this.estadodetalleproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleProforma(this.estadodetalleproforma);
				}

				if(this.estadodetalleproforma.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadodetalleproforma.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoDetalleProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoDetalleProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoDetalleProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoDetalleProforma(this.getestadodetalleproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleProforma(this.estadodetalleproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetalleproforma =(EstadoDetalleProforma) this.estadodetalleproformaLogic.getEstadoDetalleProformas().toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadodetalleproforma =(EstadoDetalleProforma) this.estadodetalleproformas.toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadodetalleproforma==null) {
						this.estadodetalleproforma = new EstadoDetalleProforma();
					}

					this.setVariablesFormularioToObjetoActualEstadoDetalleProforma(this.estadodetalleproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleProforma(this.estadodetalleproforma);
				}

				if(this.estadodetalleproforma.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadodetalleproforma.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoDetalleProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoDetalleProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoDetalleProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoDetalleProforma(this.getestadodetalleproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleProforma(this.estadodetalleproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetalleproforma =(EstadoDetalleProforma) this.estadodetalleproformaLogic.getEstadoDetalleProformas().toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadodetalleproforma =(EstadoDetalleProforma) this.estadodetalleproformas.toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadodetalleproforma==null) {
						this.estadodetalleproforma = new EstadoDetalleProforma();
					}

					this.setVariablesFormularioToObjetoActualEstadoDetalleProforma(this.estadodetalleproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleProforma(this.estadodetalleproforma);
				}

				if(this.estadodetalleproforma.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadodetalleproforma.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoDetalleProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoDetalleProforma() {
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleProforma.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoDetalleProforma.dispose();
			this.jInternalFrameDetalleFormEstadoDetalleProforma=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoDetalleProforma!=null) {
			this.jInternalFrameReporteDinamicoEstadoDetalleProforma.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoDetalleProforma.dispose();
			this.jInternalFrameReporteDinamicoEstadoDetalleProforma=null;
		}
		
		if(this.jInternalFrameImportacionEstadoDetalleProforma!=null) {
			this.jInternalFrameImportacionEstadoDetalleProforma.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoDetalleProforma.dispose();
			this.jInternalFrameImportacionEstadoDetalleProforma=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoDetalleProforma();
			
			EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoDetalleProforma")) {
				jButtonNuevoEstadoDetalleProformaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoDetalleProforma")) {
				jButtonDuplicarEstadoDetalleProformaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoDetalleProforma")) {
				jButtonCopiarEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoDetalleProforma")) {
				jButtonVerFormEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoDetalleProforma")) {
				jButtonNuevoEstadoDetalleProformaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoDetalleProforma")) {
				jButtonDuplicarEstadoDetalleProformaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoDetalleProforma")) {
				jButtonNuevoEstadoDetalleProformaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoDetalleProforma")) {
				jButtonDuplicarEstadoDetalleProformaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoDetalleProforma")) {
				jButtonNuevoEstadoDetalleProformaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoDetalleProforma")) {
				jButtonNuevoEstadoDetalleProformaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoDetalleProforma")) {
				jButtonNuevoEstadoDetalleProformaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoDetalleProforma")) {
				jButtonModificarEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoDetalleProforma")) {
				jButtonModificarEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoDetalleProforma")) {
				jButtonModificarEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoDetalleProforma")) {
				jButtonActualizarEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoDetalleProforma")) {
				jButtonActualizarEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoDetalleProforma")) {
				jButtonActualizarEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoDetalleProforma")) {
				jButtonEliminarEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoDetalleProforma")) {
				jButtonEliminarEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoDetalleProforma")) {
				jButtonEliminarEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoDetalleProforma")) {
				jButtonCancelarEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoDetalleProforma")) {
				jButtonCancelarEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoDetalleProforma")) {
				jButtonCancelarEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoDetalleProforma")) {
				jButtonCerrarEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoDetalleProforma")) {
				jButtonCerrarEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoDetalleProforma")) {
				jButtonCerrarEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoDetalleProforma")) {
				jButtonMostrarOcultarEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoDetalleProforma")) {
				jButtonCancelarEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoDetalleProforma")) {
				jButtonGuardarCambiosEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoDetalleProforma")) {
				jButtonGuardarCambiosEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoDetalleProforma")) {
				jButtonCopiarEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoDetalleProforma")) {
				jButtonVerFormEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoDetalleProforma")) {
				jButtonGuardarCambiosEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoDetalleProforma")) {
				jButtonCopiarEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoDetalleProforma")) {
				jButtonVerFormEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoDetalleProforma")) {
				jButtonGuardarCambiosEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoDetalleProforma")) {
				jButtonGuardarCambiosEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoDetalleProforma")) {
				jButtonGuardarCambiosEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoDetalleProforma")) {
				jButtonRecargarInformacionEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoDetalleProforma")) {
				jButtonRecargarInformacionEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoDetalleProforma")) {
				jButtonRecargarInformacionEstadoDetalleProformaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoDetalleProforma")) {
				jButtonAnterioresEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoDetalleProforma")) {
				jButtonAnterioresEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoDetalleProforma")) {
				jButtonAnterioresEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoDetalleProforma")) {
				jButtonSiguientesEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoDetalleProforma")) {
				jButtonSiguientesEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoDetalleProforma")) {
				jButtonSiguientesEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoDetalleProforma") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoDetalleProforma")) {
				jButtonAbrirOrderByEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoDetalleProforma") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoDetalleProforma")) {
				jButtonMostrarOcultarEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoDetalleProforma")) {
				jButtonNuevoGuardarCambiosEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoDetalleProforma")) {
				jButtonNuevoGuardarCambiosEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoDetalleProforma")) {
				jButtonNuevoGuardarCambiosEstadoDetalleProformaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoDetalleProforma")) {
				jButtonCerrarReporteDinamicoEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoDetalleProforma")) {
				jButtonGenerarReporteDinamicoEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoDetalleProforma")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoDetalleProformaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoDetalleProforma")) {
				jButtonCerrarImportacionEstadoDetalleProformaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoDetalleProforma")) {
				
				jButtonGenerarImportacionEstadoDetalleProformaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoDetalleProforma")) {
				
				jButtonAbrirImportacionEstadoDetalleProformaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoDetalleProforma")) {
				jComboBoxTiposAccionesEstadoDetalleProformaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoDetalleProforma")) {
				jComboBoxTiposRelacionesEstadoDetalleProformaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoDetalleProforma")) {
				jComboBoxTiposAccionesEstadoDetalleProformaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoDetalleProforma")) {
				
				jComboBoxTiposSeleccionarEstadoDetalleProformaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoDetalleProforma")) {
				jTextFieldValorCampoGeneralEstadoDetalleProformaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoDetalleProforma")) {
				jButtonAbrirOrderByEstadoDetalleProformaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoDetalleProforma")) {
				jButtonAbrirOrderByEstadoDetalleProformaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoDetalleProforma")) {
				jButtonCerrarOrderByEstadoDetalleProformaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoDetalleProformaBusqueda")) {
				this.jButtonidEstadoDetalleProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoDetalleProformaBusqueda")) {
				this.jButtoncodigoEstadoDetalleProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoDetalleProformaBusqueda")) {
				this.jButtonnombreEstadoDetalleProformaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoDetalleProforma();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleProformaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleproforma);
				
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
				
				


				
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoDetalleProforma estadodetalleproformaLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadodetalleproformaLocal=this.estadodetalleproforma;
			} else {
				estadodetalleproformaLocal=this.estadodetalleproformaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleproforma);
				
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
							
				
				


				
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleProformaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleproformaAnterior =(EstadoDetalleProforma) this.estadodetalleproformaLogic.getEstadoDetalleProformas().toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleproformaAnterior =(EstadoDetalleProforma) this.estadodetalleproformas.toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
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
			
			EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
			
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
			
			


			
			EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleProformaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleproforma);
				
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
								
						
				


				
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleProforma.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleproforma);
				
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
								
				
				


				
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleProformaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleproformaAnterior =(EstadoDetalleProforma) this.estadodetalleproformaLogic.getEstadoDetalleProformas().toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleproformaAnterior =(EstadoDetalleProforma) this.estadodetalleproformas.toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleproforma);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleProformaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleproformaAnterior =(EstadoDetalleProforma) this.estadodetalleproformaLogic.getEstadoDetalleProformas().toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleproformaAnterior =(EstadoDetalleProforma) this.estadodetalleproformas.toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleProformaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleproforma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleproforma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleproforma);
				
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
							
				
				


				
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleProforma.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleProformaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoDetalleProforma.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetalleproformaAnterior =(EstadoDetalleProforma) this.estadodetalleproformaLogic.getEstadoDetalleProformas().toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadodetalleproformaAnterior =(EstadoDetalleProforma) this.estadodetalleproformas.toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
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
			
			EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
			
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
			
			


			
			EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleProformaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleproforma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleproforma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleproforma);
				
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
								
				
				


				
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleProformaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleproformaAnterior =(EstadoDetalleProforma) this.estadodetalleproformaLogic.getEstadoDetalleProformas().toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleproformaAnterior =(EstadoDetalleProforma) this.estadodetalleproformas.toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleProformaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleproforma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleproforma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleProformaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleproforma);
				
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoDetalleProforma")) {
					jCheckBoxSeleccionarTodosEstadoDetalleProformaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoDetalleProforma")) {
					jCheckBoxSeleccionadosEstadoDetalleProformaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoDetalleProforma")) {
					
				}
				
				


				
				
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleproforma);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleproforma);
				
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
												
				
				


				
				
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleProformaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoDetalleProforma.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetalleproformaAnterior =(EstadoDetalleProforma) this.estadodetalleproformaLogic.getEstadoDetalleProformas().toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadodetalleproformaAnterior =(EstadoDetalleProforma) this.estadodetalleproformas.toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleProformaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleproforma);
				
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
				
				
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
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
			
			EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
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
			
			


			
			EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleProformaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleproforma);
				
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleProforma.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleProforma.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleproforma);
				
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
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
				
				


				
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleProforma.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleProformaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleproformaAnterior =(EstadoDetalleProforma) this.estadodetalleproformaLogic.getEstadoDetalleProformas().toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleproformaAnterior =(EstadoDetalleProforma) this.estadodetalleproformas.toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoDetalleProforma")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoDetalleProformaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoDetalleProforma.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadodetalleproforma =(EstadoDetalleProforma) this.estadodetalleproformaLogic.getEstadoDetalleProformas().toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadodetalleproforma =(EstadoDetalleProforma) this.estadodetalleproformas.toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadodetalleproforma);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoDetalleProforma")) {
				
				}
				
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoDetalleProforma")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoDetalleProforma.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoDetalleProforma")) {
			
			}
			
			EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoDetalleProforma();
			
			EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoDetalleProforma")) {
				jButtonNuevoEstadoDetalleProformaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoDetalleProforma")) {
				jButtonDuplicarEstadoDetalleProformaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoDetalleProforma")) {
				jButtonCopiarEstadoDetalleProformaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoDetalleProforma")) {
				jButtonVerFormEstadoDetalleProformaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoDetalleProforma")) {
				jButtonNuevoEstadoDetalleProformaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoDetalleProforma")) {
				jButtonModificarEstadoDetalleProformaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoDetalleProforma")) {
				jButtonActualizarEstadoDetalleProformaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoDetalleProforma")) {
				jButtonEliminarEstadoDetalleProformaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoDetalleProforma")) {
				jButtonGuardarCambiosEstadoDetalleProformaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoDetalleProforma")) {
				jButtonCancelarEstadoDetalleProformaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoDetalleProforma")) {
				jButtonCerrarEstadoDetalleProformaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoDetalleProforma")) {
				jButtonGuardarCambiosEstadoDetalleProformaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoDetalleProforma")) {
				jButtonNuevoGuardarCambiosEstadoDetalleProformaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoDetalleProforma")) {
				jButtonAbrirOrderByEstadoDetalleProformaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoDetalleProforma")) {
				jButtonRecargarInformacionEstadoDetalleProformaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoDetalleProforma")) {
				jButtonAnterioresEstadoDetalleProformaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoDetalleProforma")) {
				jButtonSiguientesEstadoDetalleProformaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoDetalleProformaBusqueda")) {
				this.jButtonidEstadoDetalleProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoDetalleProformaBusqueda")) {
				this.jButtoncodigoEstadoDetalleProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoDetalleProformaBusqueda")) {
				this.jButtonnombreEstadoDetalleProformaBusquedaActionPerformed(evt);
			}
			
			EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoDetalleProforma();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoDetalleProforma")) {
				closingInternalFrameEstadoDetalleProforma();
				
			} else if(sTipo.equals("jButtonCancelarEstadoDetalleProforma")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoDetalleProforma = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoDetalleProformaBeanSwingJInternalFrame jInternalFrameParent=(EstadoDetalleProformaBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoDetalleProforma.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoDetalleProformaActionPerformed(null);
			}
			
			EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadodetalleproforma,new Object(),this.estadodetalleproformaParameterGeneral,this.estadodetalleproformaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoDetalleProforma(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoDetalleProforma(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoDetalleProforma(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadodetalleproforma)) {
			if(!esControlTabla) {
				if(EstadoDetalleProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoDetalleProforma(this.estadodetalleproforma,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleProforma(this.estadodetalleproforma);			
				}
				
				if(this.estadodetalleproformaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoDetalleProforma(this.estadodetalleproforma,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadodetalleproformaReturnGeneral=estadodetalleproformaLogic.procesarEventosEstadoDetalleProformasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetalleproformaLogic.getEstadoDetalleProformas(),this.estadodetalleproforma,this.estadodetalleproformaParameterGeneral,this.isEsNuevoEstadoDetalleProforma,classes);//this.estadodetalleproformaLogic.getEstadoDetalleProforma()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoDetalleProforma(this.estadodetalleproformaReturnGeneral,this.estadodetalleproformaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadodetalleproformaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoDetalleProforma(classes,this.estadodetalleproformaReturnGeneral,this.estadodetalleproformaBean,false);
					}
						
					if(this.estadodetalleproformaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleProforma(this.estadodetalleproformaReturnGeneral.getEstadoDetalleProforma());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoDetalleProforma(this.estadodetalleproformaReturnGeneral.getEstadoDetalleProforma());	
					}
						
					if(this.estadodetalleproformaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoDetalleProforma(this.estadodetalleproformaReturnGeneral.getEstadoDetalleProforma(),classes);//this.estadodetalleproformaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoDetalleProforma(this.estadodetalleproforma,classes);//this.estadodetalleproformaBean);									
				}
			
				if(EstadoDetalleProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoDetalleProforma(this.estadodetalleproforma,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleProforma(this.estadodetalleproforma);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadodetalleproformaAnterior!=null) {
						this.estadodetalleproforma=this.estadodetalleproformaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadodetalleproformaReturnGeneral=estadodetalleproformaLogic.procesarEventosEstadoDetalleProformasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetalleproformaLogic.getEstadoDetalleProformas(),this.estadodetalleproforma,this.estadodetalleproformaParameterGeneral,this.isEsNuevoEstadoDetalleProforma,classes);//this.estadodetalleproformaLogic.getEstadoDetalleProforma()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadodetalleproformaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadodetalleproformaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadodetalleproformaReturnGeneral.getEstadoDetalleProforma(),estadodetalleproformaLogic.getEstadoDetalleProformas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadodetalleproformaReturnGeneral.getEstadoDetalleProforma(),this.estadodetalleproformas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoDetalleProforma.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoDetalleProforma.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoDetalleProforma();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoDetalleProforma() throws Exception {
		
		EstadoDetalleProformaModel estadodetalleproformaModel=(EstadoDetalleProformaModel)this.jTableDatosEstadoDetalleProforma.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadodetalleproformaModel.estadodetalleproformas=this.estadodetalleproformaLogic.getEstadoDetalleProformas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadodetalleproformaModel.estadodetalleproformas=this.estadodetalleproformas;
		}
		
		
		((EstadoDetalleProformaModel) this.jTableDatosEstadoDetalleProforma.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoDetalleProforma() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadodetalleproformaAnterior(),this.estadodetalleproformaLogic.getEstadoDetalleProformas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadodetalleproformaAnterior(),this.estadodetalleproformas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoDetalleProforma();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoDetalleProforma(EstadoDetalleProforma estadodetalleproforma,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleProforma.class)) {
					this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.setDetalleProformas(estadodetalleproforma.getDetalleProformas());
					this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleProforma(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
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
										
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetalleproforma,new Object(),generalEntityParameterGeneral,this.estadodetalleproformaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadodetalleproformaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoDetalleProformaConstantesFunciones.getClassesRelationshipsOfEstadoDetalleProforma(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoDetalleProformaConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoDetalleProforma(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoDetalleProforma(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoDetalleProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetalleproforma,new Object(),generalEntityParameterGeneral,this.estadodetalleproformaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoDetalleProforma(EstadoDetalleProformaBean estadodetalleproformaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleProforma.class)) {
					this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.setDetalleProformas(estadodetalleproforma.getDetalleProformas());
					this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleProforma(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoDetalleProforma(ArrayList<Classe> classes,EstadoDetalleProformaReturnGeneral estadodetalleproformaReturnGeneral,EstadoDetalleProformaBean estadodetalleproformaBean,Boolean conDefault) throws Exception {
		
			this.estadodetalleproformaBean.setDetalleProformas(estadodetalleproformaReturnGeneral.getEstadoDetalleProforma().getDetalleProformas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoDetalleProforma(EstadoDetalleProforma estadodetalleproforma,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleProforma.class)) {
					estadodetalleproforma.setDetalleProformas(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaBeanSwingJInternalFrame.detalleproformaLogic.getDetalleProformas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadodetalleproforma)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoDetalleProforma = new EstadoDetalleProformaDetalleFormJInternalFrame(jDesktopPane,this.estadodetalleproformaSessionBean.getConGuardarRelaciones(),this.estadodetalleproformaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoDetalleProforma);
		this.jInternalFrameDetalleFormEstadoDetalleProforma.setVisible(false);
		this.jInternalFrameDetalleFormEstadoDetalleProforma.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoDetalleProforma.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoDetalleProforma.estadodetalleproformaLogic=this.estadodetalleproformaLogic;
		
		this.cargarCombosFrameForeignKeyEstadoDetalleProforma("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoDetalleProforma();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoDetalleProforma();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoDetalleProforma("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoDetalleProforma();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoDetalleProforma.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoDetalleProforma"));
		
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonModificarEstadoDetalleProforma.addActionListener(new ButtonActionListener(this,"ModificarEstadoDetalleProforma"));

		
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonModificarToolBarEstadoDetalleProforma.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoDetalleProforma"));
					
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jMenuItemModificarEstadoDetalleProforma.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoDetalleProforma"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonActualizarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"ActualizarEstadoDetalleProforma"));
		
		
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonActualizarToolBarEstadoDetalleProforma.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoDetalleProforma"));
						
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jMenuItemActualizarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoDetalleProforma"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonEliminarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"EliminarEstadoDetalleProforma"));
		
		
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonEliminarToolBarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoDetalleProforma"));
								
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jMenuItemEliminarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoDetalleProforma"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonCancelarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"CancelarEstadoDetalleProforma"));
		
		
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonCancelarToolBarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoDetalleProforma"));
					
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jMenuItemCancelarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoDetalleProforma"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jMenuItemDetalleCerrarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoDetalleProforma"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonGuardarCambiosToolBarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoDetalleProforma"));
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonGuardarCambiosToolBarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoDetalleProforma"));
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jComboBoxTiposAccionesFormularioEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoDetalleProforma"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonidEstadoDetalleProformaBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoDetalleProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtoncodigoEstadoDetalleProformaBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoDetalleProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonnombreEstadoDetalleProformaBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoDetalleProformaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jTabbedPaneRelacionesEstadoDetalleProforma.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoDetalleProforma"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoDetalleProforma"));
		
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleProforma.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoDetalleProforma"));
		}
		
		this.jTableDatosEstadoDetalleProforma.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoDetalleProforma"));
		
		this.jTableDatosEstadoDetalleProforma.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoDetalleProforma"));
		
		this.jButtonNuevoEstadoDetalleProforma.addActionListener(new ButtonActionListener(this,"NuevoEstadoDetalleProforma"));
		
		this.jButtonDuplicarEstadoDetalleProforma.addActionListener(new ButtonActionListener(this,"DuplicarEstadoDetalleProforma"));
		
		this.jButtonCopiarEstadoDetalleProforma.addActionListener(new ButtonActionListener(this,"CopiarEstadoDetalleProforma"));
		
		this.jButtonVerFormEstadoDetalleProforma.addActionListener(new ButtonActionListener(this,"VerFormEstadoDetalleProforma"));
		
		
		this.jButtonNuevoToolBarEstadoDetalleProforma.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoDetalleProforma"));
			
		this.jButtonDuplicarToolBarEstadoDetalleProforma.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoDetalleProforma"));
			
		this.jMenuItemNuevoEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoDetalleProforma"));
			
		this.jMenuItemDuplicarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoDetalleProforma"));		
		
		
		this.jButtonNuevoRelacionesEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoDetalleProforma"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoDetalleProforma.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoDetalleProforma"));
			
		this.jMenuItemNuevoRelacionesEstadoDetalleProforma.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoDetalleProforma"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonModificarEstadoDetalleProforma.addActionListener(new ButtonActionListener(this,"ModificarEstadoDetalleProforma"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonModificarToolBarEstadoDetalleProforma.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoDetalleProforma"));
			
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jMenuItemModificarEstadoDetalleProforma.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoDetalleProforma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonActualizarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"ActualizarEstadoDetalleProforma"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonActualizarToolBarEstadoDetalleProforma.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoDetalleProforma"));
				
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jMenuItemActualizarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoDetalleProforma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonEliminarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"EliminarEstadoDetalleProforma"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonEliminarToolBarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoDetalleProforma"));
						
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jMenuItemEliminarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoDetalleProforma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonCancelarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"CancelarEstadoDetalleProforma"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonCancelarToolBarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoDetalleProforma"));
			
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jMenuItemCancelarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoDetalleProforma"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoDetalleProforma"));		
		
		
		this.jButtonCerrarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"CerrarEstadoDetalleProforma"));
		
		
		this.jButtonCerrarToolBarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoDetalleProforma"));
			
		this.jMenuItemCerrarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoDetalleProforma"));
			
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jMenuItemDetalleCerrarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoDetalleProforma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonGuardarCambiosEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoDetalleProforma"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonGuardarCambiosToolBarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoDetalleProforma"));
		}
		
		this.jButtonCopiarToolBarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoDetalleProforma"));
			
		this.jButtonVerFormToolBarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoDetalleProforma"));
		
		this.jMenuItemGuardarCambiosEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoDetalleProforma"));
			
		this.jMenuItemCopiarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoDetalleProforma"));		
		
		this.jMenuItemVerFormEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoDetalleProforma"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoDetalleProforma"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoDetalleProforma"));
			
		this.jMenuItemGuardarCambiosTablaEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoDetalleProforma"));		
		
		
		
		this.jButtonRecargarInformacionEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoDetalleProforma"));
					
		this.jButtonRecargarInformacionToolBarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoDetalleProforma"));
		
		this.jMenuItemRecargarInformacionEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoDetalleProforma"));		
		
		
		
		this.jButtonAnterioresEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"AnterioresEstadoDetalleProforma"));
		
		
		this.jButtonAnterioresToolBarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoDetalleProforma"));
		
		this.jMenuItemAnterioresEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoDetalleProforma"));		
		
		
		this.jButtonSiguientesEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"SiguientesEstadoDetalleProforma"));
		
		
		this.jButtonSiguientesToolBarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoDetalleProforma"));
			
		this.jMenuItemSiguientesEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoDetalleProforma"));
			
		this.jMenuItemAbrirOrderByEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoDetalleProforma"));
			
		this.jMenuItemMostrarOcultarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoDetalleProforma"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoDetalleProforma"));
			
		this.jMenuItemDetalleMostarOcultarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoDetalleProforma"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoDetalleProforma"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoDetalleProforma"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoDetalleProforma"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoDetalleProforma.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoDetalleProforma"));

		this.jCheckBoxSeleccionadosEstadoDetalleProforma.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoDetalleProforma"));
		
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jComboBoxTiposAccionesFormularioEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoDetalleProforma"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoDetalleProforma"));
			
		this.jComboBoxTiposAccionesEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoDetalleProforma"));
					
		this.jComboBoxTiposSeleccionarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoDetalleProforma"));
			
		this.jTextFieldValorCampoGeneralEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoDetalleProforma"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonidEstadoDetalleProformaBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoDetalleProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtoncodigoEstadoDetalleProformaBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoDetalleProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonnombreEstadoDetalleProformaBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoDetalleProformaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoDetalleProforma!=null) {
				this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoDetalleProforma"));
				this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoDetalleProforma"));
				this.jInternalFrameReporteDinamicoEstadoDetalleProforma.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoDetalleProforma"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoDetalleProforma"));				
			//this.jButtonGenerarReporteDinamicoEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoDetalleProforma"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoDetalleProforma"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoDetalleProforma!=null) {
				this.jInternalFrameImportacionEstadoDetalleProforma.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoDetalleProforma"));
				this.jInternalFrameImportacionEstadoDetalleProforma.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoDetalleProforma"));
				this.jInternalFrameImportacionEstadoDetalleProforma.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoDetalleProforma"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoDetalleProforma"));
			
			this.jButtonAbrirOrderByToolBarEstadoDetalleProforma.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoDetalleProforma"));			
			
			if(this.jInternalFrameOrderByEstadoDetalleProforma!=null) {
				this.jInternalFrameOrderByEstadoDetalleProforma.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoDetalleProforma"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleProforma.jTabbedPaneRelacionesEstadoDetalleProforma.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoDetalleProforma"));
		
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
            		closingInternalFrameEstadoDetalleProforma();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoDetalleProforma.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoDetalleProforma = (JInternalFrameBase)event.getSource();
	            	
	            EstadoDetalleProformaBeanSwingJInternalFrame jInternalFrameParent=(EstadoDetalleProformaBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoDetalleProforma.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoDetalleProformaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoDetalleProforma.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoDetalleProformaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoDetalleProforma.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoDetalleProforma.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleProformaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleProformaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleProformaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoDetalleProforma";
		inputMap = this.jButtonNuevoEstadoDetalleProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoDetalleProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoDetalleProformaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleProformaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleProformaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleProformaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoDetalleProforma";
		inputMap = this.jButtonNuevoRelacionesEstadoDetalleProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoDetalleProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoDetalleProformaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoDetalleProforma";
		inputMap = this.jButtonModificarEstadoDetalleProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoDetalleProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoDetalleProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoDetalleProforma";
		inputMap = this.jButtonActualizarEstadoDetalleProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoDetalleProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoDetalleProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoDetalleProforma";
		inputMap = this.jButtonEliminarEstadoDetalleProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoDetalleProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoDetalleProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoDetalleProforma";
		inputMap = this.jButtonCancelarEstadoDetalleProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoDetalleProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoDetalleProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoDetalleProforma";
		inputMap = this.jButtonCerrarEstadoDetalleProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoDetalleProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoDetalleProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonGuardarCambiosEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoDetalleProforma";
		inputMap = this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonGuardarCambiosEstadoDetalleProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonGuardarCambiosEstadoDetalleProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoDetalleProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoDetalleProforma.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoDetalleProformaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoDetalleProforma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoDetalleProformaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoDetalleProforma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoDetalleProformaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoDetalleProforma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoDetalleProformaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonidEstadoDetalleProformaBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoDetalleProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtoncodigoEstadoDetalleProformaBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoDetalleProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jButtonnombreEstadoDetalleProformaBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoDetalleProformaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoDetalleProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoDetalleProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoDetalleProformaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoDetalleProforma.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoDetalleProforma(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoDetalleProforma estadodetalleproformaAux:this.estadodetalleproformaLogic.getEstadoDetalleProformas()) {
					estadodetalleproformaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetalleProforma estadodetalleproformaAux:estadodetalleproformas) {
					estadodetalleproformaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoDetalleProformaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoDetalleProforma(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoDetalleProforma estadodetalleproformaAux:this.estadodetalleproformaLogic.getEstadoDetalleProformas()) {
						estadodetalleproformaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoDetalleProforma estadodetalleproformaAux:estadodetalleproformas) {
						estadodetalleproformaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoDetalleProforma estadodetalleproformaAux:this.estadodetalleproformaLogic.getEstadoDetalleProformas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoDetalleProforma estadodetalleproformaAux:estadodetalleproformas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoDetalleProforma(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoDetalleProforma.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoDetalleProforma.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleProforma,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoDetalleProformaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoDetalleProforma(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoDetalleProforma.getSelectedRows();
			
			EstadoDetalleProforma estadodetalleproformaLocal=new EstadoDetalleProforma();
			
			//this.seleccionarTodosEstadoDetalleProforma(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadodetalleproformaLocal =(EstadoDetalleProforma) this.estadodetalleproformaLogic.getEstadoDetalleProformas().toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadodetalleproformaLocal =(EstadoDetalleProforma) this.estadodetalleproformas.toArray()[this.jTableDatosEstadoDetalleProforma.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadodetalleproformaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoDetalleProforma estadodetalleproformaAux:this.estadodetalleproformaLogic.getEstadoDetalleProformas()) {
						estadodetalleproformaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoDetalleProforma estadodetalleproformaAux:estadodetalleproformas) {
						estadodetalleproformaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoDetalleProforma(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoDetalleProforma.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoDetalleProforma.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleProforma,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoDetalleProformaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoDetalleProformaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoDetalleProformaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoDetalleProforma(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoDetalleProforma.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoDetalleProforma estadodetalleproformaAux:this.estadodetalleproformaLogic.getEstadoDetalleProformas()) {
				
						if(sTipoSeleccionar.equals(EstadoDetalleProformaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadodetalleproformaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoDetalleProformaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadodetalleproformaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetalleProforma estadodetalleproformaAux:estadodetalleproformas) {
					
						if(sTipoSeleccionar.equals(EstadoDetalleProformaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadodetalleproformaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoDetalleProformaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadodetalleproformaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoDetalleProforma(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoDetalleProformaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoDetalleProforma(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoDetalleProforma=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoDetalleProforma.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoDetalleProforma.jComboBoxTiposAccionesFormularioEstadoDetalleProforma.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoDetalleProforma) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoDetalleProforma(conSplash);
				
					this.generarReporteEstadoDetalleProformasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetalleProforma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetalleProforma.jComboBoxTiposAccionesFormularioEstadoDetalleProforma.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoDetalleProformasSeleccionados();
				//this.jComboBoxTiposAccionesEstadoDetalleProforma.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoDetalleProformasSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoDetalleProforma.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoDetalleProformasSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoDetalleProforma.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoDetalleProforma();
				
				this.exportarEstadoDetalleProformasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetalleProforma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetalleProforma.jComboBoxTiposAccionesFormularioEstadoDetalleProforma.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoDetalleProformas();
				//this.importarEstadoDetalleProformas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetalleProforma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetalleProforma.jComboBoxTiposAccionesFormularioEstadoDetalleProforma.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoDetalleProforma();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoDetalleProformasSeleccionados();
				//this.jComboBoxTiposAccionesEstadoDetalleProforma.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Detalle Proforma", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoDetalleProforma();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoDetalleProforma)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoDetalleProforma(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Detalle Proforma",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetalleProforma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetalleProforma.jComboBoxTiposAccionesFormularioEstadoDetalleProforma.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadoDetalleProformaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadoDetalleProforma) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadoDetalleProforma(conSplash);
					
						//this.actualizarParametrosGeneralEstadoDetalleProforma();
						
						this.generarReporteProcesoAccionEstadoDetalleProformasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadoDetalleProforma.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadoDetalleProforma.jComboBoxTiposAccionesFormularioEstadoDetalleProforma.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadoDetalleProformaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estado Detalle ProformaS SELECCIONADOS?", "MANTENIMIENTO DE Estado Detalle Proforma", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadoDetalleProforma();
				
						this.actualizarParametrosGeneralEstadoDetalleProforma();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadodetalleproformaReturnGeneral=estadodetalleproformaLogic.procesarAccionEstadoDetalleProformasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadodetalleproformaLogic.getEstadoDetalleProformas(),this.estadodetalleproformaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadoDetalleProformaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoDetalleProforma.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoDetalleProforma.jComboBoxTiposAccionesFormularioEstadoDetalleProforma.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoDetalleProforma();
					
					EstadoDetalleProformaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadoDetalleProformaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoDetalleProforma.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoDetalleProforma.jComboBoxTiposAccionesFormularioEstadoDetalleProforma.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoDetalleProforma(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoDetalleProformaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoDetalleProforma();
			
			if(this.jInternalFrameDetalleFormEstadoDetalleProforma==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoDetalleProforma> estadodetalleproformasSeleccionados=new ArrayList<EstadoDetalleProforma>();		
			EstadoDetalleProforma estadodetalleproforma=new EstadoDetalleProforma();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoDetalleProforma(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoDetalleProforma.getSelectedItem();
			
			
			
			
			estadodetalleproformasSeleccionados=this.getEstadoDetalleProformasSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadodetalleproformasSeleccionados.size()==1) {
				for(EstadoDetalleProforma estadodetalleproformaAux:estadodetalleproformasSeleccionados) {
					estadodetalleproforma=estadodetalleproformaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Proforma")) {
					jButtonDetalleProformaActionPerformed(null,rowIndex,true,false,estadodetalleproforma);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoDetalleProforma();
			
      		//this.finishProcessEstadoDetalleProforma(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoDetalleProformaReturnGeneral() throws Exception {
		if(this.estadodetalleproformaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadodetalleproformaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadodetalleproformaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadodetalleproformaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadodetalleproformaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadodetalleproformaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoDetalleProforma(false);
		}
		
		if(this.estadodetalleproformaReturnGeneral.getConRetornoLista() || this.estadodetalleproformaReturnGeneral.getConRetornoObjeto()) {
			if(this.estadodetalleproformaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadodetalleproformaLogic.setEstadoDetalleProformas(this.estadodetalleproformaReturnGeneral.getEstadoDetalleProformas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadodetalleproformaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadodetalleproformaLogic.setEstadoDetalleProforma(this.estadodetalleproformaReturnGeneral.getEstadoDetalleProforma());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoDetalleProforma(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoDetalleProforma() throws Exception {
		
		
	}
	
	public ArrayList<EstadoDetalleProforma> getEstadoDetalleProformasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoDetalleProforma> estadodetalleproformasSeleccionados=new ArrayList<EstadoDetalleProforma>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoDetalleProforma) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoDetalleProforma estadodetalleproformaAux:estadodetalleproformaLogic.getEstadoDetalleProformas()) {
					if(estadodetalleproformaAux.getIsSelected()) {
						estadodetalleproformasSeleccionados.add(estadodetalleproformaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetalleProforma estadodetalleproformaAux:this.estadodetalleproformas) {
					if(estadodetalleproformaAux.getIsSelected()) {
						estadodetalleproformasSeleccionados.add(estadodetalleproformaAux);				
					}
				}
			}
			
			if(estadodetalleproformasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadodetalleproformasSeleccionados.addAll(this.estadodetalleproformaLogic.getEstadoDetalleProformas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadodetalleproformasSeleccionados.addAll(this.estadodetalleproformas);				
					}
				}
			}
		} else {
			estadodetalleproformasSeleccionados.add(this.estadodetalleproforma);
		}
		
		return estadodetalleproformasSeleccionados;
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
	
	public void generarReporteEstadoDetalleProformasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoDetalleProformasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoDetalleProformasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoDetalleProformasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoDetalleProformasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoDetalleProformasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Detalle Proforma",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoDetalleProformasSeleccionados() throws Exception {
		ArrayList<EstadoDetalleProforma> estadodetalleproformasSeleccionados=new ArrayList<EstadoDetalleProforma>();		
		
		estadodetalleproformasSeleccionados=this.getEstadoDetalleProformasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoDetalleProformas("Todos",estadodetalleproformasSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoDetalleProformasSeleccionados() throws Exception {
		ArrayList<EstadoDetalleProforma> estadodetalleproformasSeleccionados=new ArrayList<EstadoDetalleProforma>();		
		
		estadodetalleproformasSeleccionados=this.getEstadoDetalleProformasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoDetalleProformas("Todos",estadodetalleproformasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoDetalleProformasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoDetalleProforma> estadodetalleproformasSeleccionados=new ArrayList<EstadoDetalleProforma>();
		
		estadodetalleproformasSeleccionados=this.getEstadoDetalleProformasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoDetalleProformas("Todos",estadodetalleproformasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoDetalleProformasSeleccionados() throws Exception {
		ArrayList<EstadoDetalleProforma> estadodetalleproformasSeleccionados=new ArrayList<EstadoDetalleProforma>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoDetalleProforma();
		
		
		estadodetalleproformasSeleccionados=this.getEstadoDetalleProformasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoDetalleProforma();
		
		
		//this.generarReporteEstadoDetalleProformas("Todos",estadodetalleproformasSeleccionados ,estadodetalleproformaImplementable,estadodetalleproformaImplementableHome);
	}
	
	public void mostrarImportacionEstadoDetalleProformas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoDetalleProforma();
		
		this.abrirFrameImportacionEstadoDetalleProforma();		
		
			
		//this.generarReporteEstadoDetalleProformas("Todos",estadodetalleproformasSeleccionados ,estadodetalleproformaImplementable,estadodetalleproformaImplementableHome);
	}
	
	public void importarEstadoDetalleProformas() throws Exception {		
	
	}
	
	public void exportarEstadoDetalleProformasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoDetalleProformasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoDetalleProformasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoDetalleProformasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Detalle Proforma",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoDetalleProformasSeleccionados() throws Exception {
		ArrayList<EstadoDetalleProforma> estadodetalleproformasSeleccionados=new ArrayList<EstadoDetalleProforma>();		
		
		estadodetalleproformasSeleccionados=this.getEstadoDetalleProformasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleproforma."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoDetalleProforma(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoDetalleProforma estadodetalleproformaAux:estadodetalleproformasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoDetalleProforma(estadodetalleproformaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadodetalleproformaAux.setsDetalleGeneralEntityReporte(estadodetalleproformaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Proforma",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoDetalleProforma(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoDetalleProformaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoDetalleProformaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoDetalleProformaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoDetalleProformaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoDetalleProforma(EstadoDetalleProforma estadodetalleproforma,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadodetalleproforma.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadodetalleproforma.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadodetalleproforma.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadodetalleproforma.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoDetalleProformasSeleccionados() throws Exception {
		ArrayList<EstadoDetalleProforma> estadodetalleproformasSeleccionados=new ArrayList<EstadoDetalleProforma>();		
		
		estadodetalleproformasSeleccionados=this.getEstadoDetalleProformasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleproforma.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoDetalleProformas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoDetalleProforma(row);				
				iRow++;
			}				
			
			for(EstadoDetalleProforma estadodetalleproformaAux:estadodetalleproformasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoDetalleProforma(estadodetalleproformaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Proforma",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoDetalleProformasSeleccionados() throws Exception {
		ArrayList<EstadoDetalleProforma> estadodetalleproformasSeleccionados=new ArrayList<EstadoDetalleProforma>();		
		
		estadodetalleproformasSeleccionados=this.getEstadoDetalleProformasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleproforma.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadodetalleproformas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadodetalleproforma");
			//elementRoot.appendChild(element);
		
			for(EstadoDetalleProforma estadodetalleproformaAux:estadodetalleproformasSeleccionados) {
				element = document.createElement("estadodetalleproforma");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoDetalleProforma(estadodetalleproformaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Proforma",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoDetalleProforma(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetalleProformaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetalleProformaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetalleProformaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetalleProformaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoDetalleProforma(EstadoDetalleProforma estadodetalleproforma,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadodetalleproforma.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadodetalleproforma.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadodetalleproforma.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoDetalleProforma(EstadoDetalleProforma estadodetalleproforma,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoDetalleProformaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadodetalleproforma.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoDetalleProformaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadodetalleproforma.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoDetalleProformaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadodetalleproforma.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoDetalleProformaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadodetalleproforma.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoDetalleProformasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoDetalleProforma> estadodetalleproformasSeleccionados=new ArrayList<EstadoDetalleProforma>();
		
		estadodetalleproformasSeleccionados=this.getEstadoDetalleProformasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoDetalleProforma(estadodetalleproformasSeleccionados);
		
		this.generarReporteEstadoDetalleProformas("Todos",estadodetalleproformasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoDetalleProforma(ArrayList<EstadoDetalleProforma> estadodetalleproformasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoDetalleProforma estadodetalleproformaAux:estadodetalleproformasSeleccionados) {
				estadodetalleproformaAux.setsDetalleGeneralEntityReporte(estadodetalleproformaAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoDetalleProformaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadodetalleproformaAux.setsDescripcionGeneralEntityReporte1(estadodetalleproformaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoDetalleProformaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadodetalleproformaAux.setsDescripcionGeneralEntityReporte1(estadodetalleproformaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoDetalleProforma(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoDetalleProforma=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleProforma=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoDetalleProforma=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoDetalleProforma=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleProforma=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleProforma=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleProforma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleProforma=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleProforma=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoDetalleProforma=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleProforma=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleProforma=false;
			this.isVisibilidadCeldaModificarEstadoDetalleProforma=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleProforma=true;
			this.isVisibilidadCeldaEliminarEstadoDetalleProforma=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleProforma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleProforma=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleProforma=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoDetalleProforma=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleProforma=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleProforma=false;
			this.isVisibilidadCeldaModificarEstadoDetalleProforma=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleProforma=true;
			this.isVisibilidadCeldaEliminarEstadoDetalleProforma=true;
			this.isVisibilidadCeldaCancelarEstadoDetalleProforma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleProforma=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleProforma=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoDetalleProforma=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleProforma=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleProforma=false;
			this.isVisibilidadCeldaModificarEstadoDetalleProforma=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleProforma=true;
			this.isVisibilidadCeldaEliminarEstadoDetalleProforma=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleProforma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleProforma=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleProforma=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoDetalleProforma=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleProforma=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleProforma=true;
			this.isVisibilidadCeldaModificarEstadoDetalleProforma=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleProforma=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleProforma=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleProforma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleProforma=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleProforma=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoDetalleProforma=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleProforma=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleProforma=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleProforma=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleProforma=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleProforma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleProforma=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleProforma=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoDetalleProforma=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleProforma=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleProforma=false;
			this.isVisibilidadCeldaModificarEstadoDetalleProforma=true;
			this.isVisibilidadCeldaActualizarEstadoDetalleProforma=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleProforma=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleProforma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleProforma=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleProforma=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoDetalleProformaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoDetalleProforma=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleProforma=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleProforma=true;
		} else {
			this.actualizarEstadoPanelsEstadoDetalleProforma(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoDetalleProforma=false;
			//this.isVisibilidadCeldaVerFormEstadoDetalleProforma=false;
			this.isVisibilidadCeldaDuplicarEstadoDetalleProforma=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadodetalleproformaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleProforma=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoDetalleProforma=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleProforma=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
			if(!estadodetalleproformaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleProforma=false;												
			}
			
			this.jButtonCerrarEstadoDetalleProforma.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleProforma=false;
		}
		
		if(!this.permiteMantenimiento(this.estadodetalleproforma)) {
			this.isVisibilidadCeldaActualizarEstadoDetalleProforma=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleProforma=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoDetalleProforma() {
		this.isVisibilidadCeldaNuevoEstadoDetalleProforma=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoDetalleProforma=false;
	}
	
	public void actualizarEstadoPanelsEstadoDetalleProforma(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoDetalleProforma!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleProforma.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleProforma!=null) {
				this.jScrollPanelDatosEstadoDetalleProforma.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetalleProforma!=null) {
				this.jPanelPaginacionEstadoDetalleProforma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleProforma!=null) {
				this.jPanelParametrosReportesEstadoDetalleProforma.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoDetalleProforma!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleProforma.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoDetalleProforma!=null) {
				this.jScrollPanelDatosEstadoDetalleProforma.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoDetalleProforma!=null) {
				this.jPanelPaginacionEstadoDetalleProforma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleProforma!=null) {
				this.jPanelParametrosReportesEstadoDetalleProforma.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoDetalleProforma!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleProforma.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleProforma!=null) {
				this.jScrollPanelDatosEstadoDetalleProforma.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoDetalleProforma!=null) {
				this.jPanelPaginacionEstadoDetalleProforma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleProforma!=null) {
				this.jPanelParametrosReportesEstadoDetalleProforma.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoDetalleProforma!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleProforma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleProforma!=null) {
				this.jScrollPanelDatosEstadoDetalleProforma.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoDetalleProforma!=null) {
				this.jPanelPaginacionEstadoDetalleProforma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleProforma!=null) {
				this.jPanelParametrosReportesEstadoDetalleProforma.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoDetalleProforma!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleProforma.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleProforma!=null) {
				this.jScrollPanelDatosEstadoDetalleProforma.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetalleProforma!=null) {
				this.jPanelPaginacionEstadoDetalleProforma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleProforma!=null) {
				this.jPanelParametrosReportesEstadoDetalleProforma.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoDetalleProforma!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleProforma.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleProforma!=null) {
				this.jScrollPanelDatosEstadoDetalleProforma.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetalleProforma!=null) {
				this.jPanelPaginacionEstadoDetalleProforma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleProforma!=null) {
				this.jPanelParametrosReportesEstadoDetalleProforma.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoDetalleProforma!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleProforma.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleProforma!=null) {
				this.jScrollPanelDatosEstadoDetalleProforma.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetalleProforma!=null) {
				this.jPanelPaginacionEstadoDetalleProforma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleProforma!=null) {
				this.jPanelParametrosReportesEstadoDetalleProforma.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoDetalleProformaParaDetalleProformas() throws Exception {
		Boolean isPaginaPopupDetalleProforma=false;

		try {

			if(this.estadodetalleproformaSessionBean==null) {
				this.estadodetalleproformaSessionBean=new EstadoDetalleProformaSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaSessionBean=new DetalleProformaSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaSessionBean.setsPathNavegacionActual(estadodetalleproformaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleProformaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleProforma=this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleProforma(true);
			this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleProforma(EstadoDetalleProformaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaSessionBean.setisBusquedaDesdeForeignKeySesionEstadoDetalleProforma(true);
			this.jInternalFrameDetalleFormEstadoDetalleProforma.detalleproformaSessionBean.setlidEstadoDetalleProformaActual(this.idEstadoDetalleProformaActual);

			estadodetalleproformaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoDetalleProforma(true);
			estadodetalleproformaSessionBean.setlIdEstadoDetalleProformaActualForeignKey(this.idEstadoDetalleProformaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoDetalleProformaSessionBean estadodetalleproformaSessionBean=new EstadoDetalleProformaSessionBean();
		
		if(this.estadodetalleproformaSessionBean==null) {
			this.estadodetalleproformaSessionBean=new EstadoDetalleProformaSessionBean();
		}
		
		this.estadodetalleproformaSessionBean.setsUltimaBusquedaEstadoDetalleProforma(this.getsAccionBusqueda());
		this.estadodetalleproformaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadodetalleproformaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoDetalleProformaSessionBean estadodetalleproformaSessionBean=new EstadoDetalleProformaSessionBean();
		
		if(this.estadodetalleproformaSessionBean==null) {
			this.estadodetalleproformaSessionBean=new EstadoDetalleProformaSessionBean();
		}
		
		if(this.estadodetalleproformaSessionBean.getsUltimaBusquedaEstadoDetalleProforma()!=null&&!this.estadodetalleproformaSessionBean.getsUltimaBusquedaEstadoDetalleProforma().equals("")) {
			this.setsAccionBusqueda(estadodetalleproformaSessionBean.getsUltimaBusquedaEstadoDetalleProforma());
			this.setiNumeroPaginacion(estadodetalleproformaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadodetalleproformaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadodetalleproformaSessionBean.setsUltimaBusquedaEstadoDetalleProforma("");
		this.estadodetalleproformaSessionBean.setiNumeroPaginacion(EstadoDetalleProformaConstantesFunciones.INUMEROPAGINACION);
		this.estadodetalleproformaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoDetalleProforma(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoDetalleProforma() {
		this.updateBorderResaltarBusquedasFormularioEstadoDetalleProforma();
		this.updateVisibilidadBusquedasFormularioEstadoDetalleProforma();
		this.updateHabilitarBusquedasFormularioEstadoDetalleProforma();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoDetalleProforma() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoDetalleProforma() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoDetalleProforma() {
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
	
	public void updateControlesFormularioEstadoDetalleProforma() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoDetalleProforma==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoDetalleProforma();
		this.updateVisibilidadResaltarControlesFormularioEstadoDetalleProforma();
		this.updateHabilitarResaltarControlesFormularioEstadoDetalleProforma();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoDetalleProforma() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadodetalleproformaConstantesFunciones.resaltaridEstadoDetalleProforma!=null && this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) {this.jInternalFrameDetalleFormEstadoDetalleProforma.jLabelidEstadoDetalleProforma.setBorder(this.estadodetalleproformaConstantesFunciones.resaltaridEstadoDetalleProforma);}
		if(this.estadodetalleproformaConstantesFunciones.resaltarcodigoEstadoDetalleProforma!=null && this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) {this.jInternalFrameDetalleFormEstadoDetalleProforma.jTextFieldcodigoEstadoDetalleProforma.setBorder(this.estadodetalleproformaConstantesFunciones.resaltarcodigoEstadoDetalleProforma);}
		if(this.estadodetalleproformaConstantesFunciones.resaltarnombreEstadoDetalleProforma!=null && this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) {this.jInternalFrameDetalleFormEstadoDetalleProforma.jTextAreanombreEstadoDetalleProforma.setBorder(this.estadodetalleproformaConstantesFunciones.resaltarnombreEstadoDetalleProforma);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoDetalleProforma() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) {
	
		//this.jInternalFrameDetalleFormEstadoDetalleProforma.jLabelidEstadoDetalleProforma.setVisible(this.estadodetalleproformaConstantesFunciones.mostraridEstadoDetalleProforma);
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jPanelidEstadoDetalleProforma.setVisible(this.estadodetalleproformaConstantesFunciones.mostraridEstadoDetalleProforma);
		//this.jInternalFrameDetalleFormEstadoDetalleProforma.jTextFieldcodigoEstadoDetalleProforma.setVisible(this.estadodetalleproformaConstantesFunciones.mostrarcodigoEstadoDetalleProforma);
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jPanelcodigoEstadoDetalleProforma.setVisible(this.estadodetalleproformaConstantesFunciones.mostrarcodigoEstadoDetalleProforma);
		//this.jInternalFrameDetalleFormEstadoDetalleProforma.jTextAreanombreEstadoDetalleProforma.setVisible(this.estadodetalleproformaConstantesFunciones.mostrarnombreEstadoDetalleProforma);
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jPanelnombreEstadoDetalleProforma.setVisible(this.estadodetalleproformaConstantesFunciones.mostrarnombreEstadoDetalleProforma);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoDetalleProforma() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoDetalleProforma!=null) {
	
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jLabelidEstadoDetalleProforma.setEnabled(this.estadodetalleproformaConstantesFunciones.activaridEstadoDetalleProforma);
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jTextFieldcodigoEstadoDetalleProforma.setEnabled(this.estadodetalleproformaConstantesFunciones.activarcodigoEstadoDetalleProforma);
		this.jInternalFrameDetalleFormEstadoDetalleProforma.jTextAreanombreEstadoDetalleProforma.setEnabled(this.estadodetalleproformaConstantesFunciones.activarnombreEstadoDetalleProforma);
		}
	}
	
		
}