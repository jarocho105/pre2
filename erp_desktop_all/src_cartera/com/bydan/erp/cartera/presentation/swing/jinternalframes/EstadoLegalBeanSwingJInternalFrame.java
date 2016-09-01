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

import com.bydan.erp.cartera.util.EstadoLegalConstantesFunciones;
import com.bydan.erp.cartera.util.EstadoLegalParameterReturnGeneral;
//import com.bydan.erp.cartera.util.EstadoLegalParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.EstadoLegalBean;
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

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.produccion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.produccion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class EstadoLegalBeanSwingJInternalFrame extends EstadoLegalJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoLegalBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoLegal> estadolegalValidator = new ClassValidator<EstadoLegal>(EstadoLegal.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoLegal estadolegal;	
	public EstadoLegal estadolegalAux;
	public EstadoLegal estadolegalAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoLegal estadolegalTotales;
	public Long idEstadoLegalActual;
	public Long iIdNuevoEstadoLegal=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosCliente=false;

	public Boolean getIsTienePermisosCliente() {
		return isTienePermisosCliente;
	}

	public void setIsTienePermisosCliente(Boolean isTienePermisosCliente) {
		this.isTienePermisosCliente= isTienePermisosCliente;
	}


	public Boolean isTienePermisosSubCliente=false;

	public Boolean getIsTienePermisosSubCliente() {
		return isTienePermisosSubCliente;
	}

	public void setIsTienePermisosSubCliente(Boolean isTienePermisosSubCliente) {
		this.isTienePermisosSubCliente= isTienePermisosSubCliente;
	}


	public Boolean isTienePermisosParametroCarteraDefecto=false;

	public Boolean getIsTienePermisosParametroCarteraDefecto() {
		return isTienePermisosParametroCarteraDefecto;
	}

	public void setIsTienePermisosParametroCarteraDefecto(Boolean isTienePermisosParametroCarteraDefecto) {
		this.isTienePermisosParametroCarteraDefecto= isTienePermisosParametroCarteraDefecto;
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
	
	public Boolean isPermisoTodoEstadoLegal;
	public Boolean isPermisoNuevoEstadoLegal;
	public Boolean isPermisoActualizarEstadoLegal;
	public Boolean isPermisoActualizarOriginalEstadoLegal;
	public Boolean isPermisoEliminarEstadoLegal;
	public Boolean isPermisoGuardarCambiosEstadoLegal;
	public Boolean isPermisoConsultaEstadoLegal;
	public Boolean isPermisoBusquedaEstadoLegal;
	public Boolean isPermisoReporteEstadoLegal;
	public Boolean isPermisoPaginacionMedioEstadoLegal;
	public Boolean isPermisoPaginacionAltoEstadoLegal;
	public Boolean isPermisoPaginacionTodoEstadoLegal;
	public Boolean isPermisoCopiarEstadoLegal;
	public Boolean isPermisoVerFormEstadoLegal;
	public Boolean isPermisoDuplicarEstadoLegal;
	public Boolean isPermisoOrdenEstadoLegal;
	
	
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
	
	public EstadoLegalParameterReturnGeneral estadolegalReturnGeneral;
	public EstadoLegalParameterReturnGeneral estadolegalParameterGeneral;
	
	

	public ClienteLogic clienteLogic=null;

	public ClienteLogic getClienteLogic() {
		return clienteLogic;
	}

	public void setClienteLogic(ClienteLogic clienteLogic) {
		this.clienteLogic = clienteLogic;
	}


	public SubClienteLogic subclienteLogic=null;

	public SubClienteLogic getSubClienteLogic() {
		return subclienteLogic;
	}

	public void setSubClienteLogic(SubClienteLogic subclienteLogic) {
		this.subclienteLogic = subclienteLogic;
	}


	public ParametroCarteraDefectoLogic parametrocarteradefectoLogic=null;

	public ParametroCarteraDefectoLogic getParametroCarteraDefectoLogic() {
		return parametrocarteradefectoLogic;
	}

	public void setParametroCarteraDefectoLogic(ParametroCarteraDefectoLogic parametrocarteradefectoLogic) {
		this.parametrocarteradefectoLogic = parametrocarteradefectoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoLegal=false;
	public Boolean esParaAccionDesdeFormularioEstadoLegal=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadoLegalSessionBeanAdditional estadolegalSessionBeanAdditional=null;
	
	public EstadoLegalSessionBeanAdditional getEstadoLegalSessionBeanAdditional() {
		return this.estadolegalSessionBeanAdditional;
	}
	
	public void setEstadoLegalSessionBeanAdditional(EstadoLegalSessionBeanAdditional estadolegalSessionBeanAdditional) {
		try {
			this.estadolegalSessionBeanAdditional=estadolegalSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadoLegalBeanSwingJInternalFrameAdditional estadolegalBeanSwingJInternalFrameAdditional=null;
	//public class EstadoLegalBeanSwingJInternalFrame
	
	public EstadoLegalBeanSwingJInternalFrameAdditional getEstadoLegalBeanSwingJInternalFrameAdditional() {
		return this.estadolegalBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadoLegalBeanSwingJInternalFrameAdditional(EstadoLegalBeanSwingJInternalFrameAdditional estadolegalBeanSwingJInternalFrameAdditional) {
		try {
			this.estadolegalBeanSwingJInternalFrameAdditional=estadolegalBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoLegalLogic estadolegalLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoLegal estadolegalBean;
	public EstadoLegalConstantesFunciones estadolegalConstantesFunciones;
	//public EstadoLegalParameterReturnGeneral estadolegalReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoLegal> estadolegals;	
	//public List<EstadoLegal> estadolegalsEliminados;
	//public List<EstadoLegal> estadolegalsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoLegal=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoLegal=true;
	public Boolean isVisibilidadCeldaCopiarEstadoLegal=true;
	public Boolean isVisibilidadCeldaVerFormEstadoLegal=true;
	public Boolean isVisibilidadCeldaOrdenEstadoLegal=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoLegal=false;
	public Boolean isVisibilidadCeldaModificarEstadoLegal=false;
	public Boolean isVisibilidadCeldaActualizarEstadoLegal=false;
	public Boolean isVisibilidadCeldaEliminarEstadoLegal=false;
	public Boolean isVisibilidadCeldaCancelarEstadoLegal=false;
	public Boolean isVisibilidadCeldaGuardarEstadoLegal=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoLegal=false;	
	
	
	
	public Long getiIdNuevoEstadoLegal() {
		return this.iIdNuevoEstadoLegal;
	}

	public void setiIdNuevoEstadoLegal(Long iIdNuevoEstadoLegal) {
		this.iIdNuevoEstadoLegal = iIdNuevoEstadoLegal;
	}
	
	public Long getidEstadoLegalActual() {
		return this.idEstadoLegalActual;
	}

	public void setidEstadoLegalActual(Long idEstadoLegalActual) {
		this.idEstadoLegalActual = idEstadoLegalActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoLegal getestadolegal() {
		return this.estadolegal;
	}

	public void setestadolegal(EstadoLegal estadolegal) {
		this.estadolegal = estadolegal;
	}
	
	public EstadoLegal getestadolegalAux() {
		return this.estadolegalAux;
	}

	public void setestadolegalAux(EstadoLegal estadolegalAux) {
		this.estadolegalAux = estadolegalAux;
	}				
	
	public EstadoLegal getestadolegalAnterior() {
		return this.estadolegalAnterior;
	}

	public void setestadolegalAnterior(EstadoLegal estadolegalAnterior) {
		this.estadolegalAnterior = estadolegalAnterior;
	}	
	
	public EstadoLegal getestadolegalTotales() {
		return this.estadolegalTotales;
	}

	public void setestadolegalTotales(EstadoLegal estadolegalTotales) {
		this.estadolegalTotales = estadolegalTotales;
	}	
	
	public EstadoLegal getestadolegalBean() {
		return this.estadolegalBean;
	}

	public void setestadolegalBean(EstadoLegal estadolegalBean) {
		this.estadolegalBean = estadolegalBean;
	}	
	
	public EstadoLegalParameterReturnGeneral getestadolegalReturnGeneral() {
		return this.estadolegalReturnGeneral;
	}

	public void setestadolegalReturnGeneral(EstadoLegalParameterReturnGeneral estadolegalReturnGeneral) {
		this.estadolegalReturnGeneral = estadolegalReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoLegalLogic getEstadoLegalLogic()	{		
		return estadolegalLogic;
	}

	public void setEstadoLegalLogic(EstadoLegalLogic estadolegalLogic) {
		this.estadolegalLogic = estadolegalLogic;
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
	
	public Boolean getIsEsNuevoEstadoLegal() {
		return isEsNuevoEstadoLegal;
	}

	public void setIsEsNuevoEstadoLegal(Boolean isEsNuevoEstadoLegal) {
		this.isEsNuevoEstadoLegal = isEsNuevoEstadoLegal;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoLegal() {
		return esParaAccionDesdeFormularioEstadoLegal;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoLegal(Boolean esParaAccionDesdeFormularioEstadoLegal) {
		this.esParaAccionDesdeFormularioEstadoLegal = esParaAccionDesdeFormularioEstadoLegal;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoLegal() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoLegalConstantesFunciones.refrescarForeignKeysDescripcionesEstadoLegal(this.estadolegalLogic.getEstadoLegals());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoLegalConstantesFunciones.refrescarForeignKeysDescripcionesEstadoLegal(this.estadolegals);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadolegalLogic.setEstadoLegals(this.estadolegals);
			estadolegalLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoLegalParameterReturnGeneral getEstadoLegalParameterGeneral() {
		return this.estadolegalParameterGeneral;
	}
	
	public void setEstadoLegalParameterGeneral(EstadoLegalParameterReturnGeneral estadolegalParameterGeneral) {
		this.estadolegalParameterGeneral = estadolegalParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoLegal() {
		return isPermisoTodoEstadoLegal;
	}

	public void setIsPermisoTodoEstadoLegal(Boolean isPermisoTodoEstadoLegal) {
		this.isPermisoTodoEstadoLegal = isPermisoTodoEstadoLegal;
	}

	public Boolean getIsPermisoNuevoEstadoLegal() {
		return isPermisoNuevoEstadoLegal;
	}

	public void setIsPermisoNuevoEstadoLegal(Boolean isPermisoNuevoEstadoLegal) {
		this.isPermisoNuevoEstadoLegal = isPermisoNuevoEstadoLegal;
	}

	public Boolean getIsPermisoActualizarEstadoLegal() {
		return isPermisoActualizarEstadoLegal;
	}

	public void setIsPermisoActualizarEstadoLegal(Boolean isPermisoActualizarEstadoLegal) {
		this.isPermisoActualizarEstadoLegal = isPermisoActualizarEstadoLegal;
	}

	public Boolean getIsPermisoEliminarEstadoLegal() {
		return isPermisoEliminarEstadoLegal;
	}

	public void setIsPermisoEliminarEstadoLegal(Boolean isPermisoEliminarEstadoLegal) {
		this.isPermisoEliminarEstadoLegal = isPermisoEliminarEstadoLegal;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoLegal() {
		return isPermisoGuardarCambiosEstadoLegal;
	}

	public void setIsPermisoGuardarCambiosEstadoLegal(Boolean isPermisoGuardarCambiosEstadoLegal) {
		this.isPermisoGuardarCambiosEstadoLegal = isPermisoGuardarCambiosEstadoLegal;
	}
	
	public Boolean getIsPermisoConsultaEstadoLegal() {
		return isPermisoConsultaEstadoLegal;
	}

	public void setIsPermisoConsultaEstadoLegal(Boolean isPermisoConsultaEstadoLegal) {
		this.isPermisoConsultaEstadoLegal = isPermisoConsultaEstadoLegal;
	}

	public Boolean getIsPermisoBusquedaEstadoLegal() {
		return isPermisoBusquedaEstadoLegal;
	}

	public void setIsPermisoBusquedaEstadoLegal(Boolean isPermisoBusquedaEstadoLegal) {
		this.isPermisoBusquedaEstadoLegal = isPermisoBusquedaEstadoLegal;
	}

	public Boolean getIsPermisoReporteEstadoLegal() {
		return isPermisoReporteEstadoLegal;
	}

	public void setIsPermisoReporteEstadoLegal(Boolean isPermisoReporteEstadoLegal) {
		this.isPermisoReporteEstadoLegal = isPermisoReporteEstadoLegal;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoLegal() {
		return isPermisoPaginacionMedioEstadoLegal;
	}

	public void setIsPermisoPaginacionMedioEstadoLegal(Boolean isPermisoPaginacionMedioEstadoLegal) {
		this.isPermisoPaginacionMedioEstadoLegal = isPermisoPaginacionMedioEstadoLegal;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoLegal() {
		return isPermisoPaginacionTodoEstadoLegal;
	}

	public void setIsPermisoPaginacionTodoEstadoLegal(Boolean isPermisoPaginacionTodoEstadoLegal) {
		this.isPermisoPaginacionTodoEstadoLegal = isPermisoPaginacionTodoEstadoLegal;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoLegal() {
		return isPermisoPaginacionAltoEstadoLegal;
	}

	public void setIsPermisoPaginacionAltoEstadoLegal(Boolean isPermisoPaginacionAltoEstadoLegal) {
		this.isPermisoPaginacionAltoEstadoLegal = isPermisoPaginacionAltoEstadoLegal;
	}
	
	public Boolean getIsPermisoCopiarEstadoLegal() {
		return isPermisoCopiarEstadoLegal;
	}

	public void setIsPermisoCopiarEstadoLegal(Boolean isPermisoCopiarEstadoLegal) {
		this.isPermisoCopiarEstadoLegal = isPermisoCopiarEstadoLegal;
	}
	
	public Boolean getIsPermisoVerFormEstadoLegal() {
		return isPermisoVerFormEstadoLegal;
	}

	public void setIsPermisoVerFormEstadoLegal(Boolean isPermisoVerFormEstadoLegal) {
		this.isPermisoVerFormEstadoLegal = isPermisoVerFormEstadoLegal;
	}
	
	public Boolean getIsPermisoDuplicarEstadoLegal() {
		return isPermisoDuplicarEstadoLegal;
	}

	public void setIsPermisoDuplicarEstadoLegal(Boolean isPermisoDuplicarEstadoLegal) {
		this.isPermisoDuplicarEstadoLegal = isPermisoDuplicarEstadoLegal;
	}
	
	public Boolean getIsPermisoOrdenEstadoLegal() {
		return isPermisoOrdenEstadoLegal;
	}

	public void setIsPermisoOrdenEstadoLegal(Boolean isPermisoOrdenEstadoLegal) {
		this.isPermisoOrdenEstadoLegal = isPermisoOrdenEstadoLegal;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoLegal() {
		return isVisibilidadCeldaNuevoEstadoLegal;
	}

	public void setIsVisibilidadCeldaNuevoEstadoLegal(Boolean isVisibilidadCeldaNuevoEstadoLegal) {
		this.isVisibilidadCeldaNuevoEstadoLegal = isVisibilidadCeldaNuevoEstadoLegal;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoLegal() {
		return isVisibilidadCeldaDuplicarEstadoLegal;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoLegal(Boolean isVisibilidadCeldaDuplicarEstadoLegal) {
		this.isVisibilidadCeldaDuplicarEstadoLegal = isVisibilidadCeldaDuplicarEstadoLegal;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoLegal() {
		return isVisibilidadCeldaCopiarEstadoLegal;
	}

	public void setIsVisibilidadCeldaCopiarEstadoLegal(Boolean isVisibilidadCeldaCopiarEstadoLegal) {
		this.isVisibilidadCeldaCopiarEstadoLegal = isVisibilidadCeldaCopiarEstadoLegal;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoLegal() {
		return isVisibilidadCeldaVerFormEstadoLegal;
	}

	public void setIsVisibilidadCeldaVerFormEstadoLegal(Boolean isVisibilidadCeldaVerFormEstadoLegal) {
		this.isVisibilidadCeldaVerFormEstadoLegal = isVisibilidadCeldaVerFormEstadoLegal;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoLegal() {
		return isVisibilidadCeldaOrdenEstadoLegal;
	}

	public void setIsVisibilidadCeldaOrdenEstadoLegal(Boolean isVisibilidadCeldaOrdenEstadoLegal) {
		this.isVisibilidadCeldaOrdenEstadoLegal = isVisibilidadCeldaOrdenEstadoLegal;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoLegal() {
		return isVisibilidadCeldaNuevoRelacionesEstadoLegal;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoLegal(Boolean isVisibilidadCeldaNuevoRelacionesEstadoLegal) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoLegal = isVisibilidadCeldaNuevoRelacionesEstadoLegal;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoLegal() {
		return isVisibilidadCeldaModificarEstadoLegal;
	}

	public void setIsVisibilidadCeldaModificarEstadoLegal(Boolean isVisibilidadCeldaModificarEstadoLegal) {
		this.isVisibilidadCeldaModificarEstadoLegal = isVisibilidadCeldaModificarEstadoLegal;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoLegal() {
		return isVisibilidadCeldaActualizarEstadoLegal;
	}

	public void setIsVisibilidadCeldaActualizarEstadoLegal(Boolean isVisibilidadCeldaActualizarEstadoLegal) {
		this.isVisibilidadCeldaActualizarEstadoLegal = isVisibilidadCeldaActualizarEstadoLegal;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoLegal() {
		return isVisibilidadCeldaEliminarEstadoLegal;
	}

	public void setIsVisibilidadCeldaEliminarEstadoLegal(Boolean isVisibilidadCeldaEliminarEstadoLegal) {
		this.isVisibilidadCeldaEliminarEstadoLegal = isVisibilidadCeldaEliminarEstadoLegal;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoLegal() {
		return isVisibilidadCeldaCancelarEstadoLegal;
	}

	public void setIsVisibilidadCeldaCancelarEstadoLegal(Boolean isVisibilidadCeldaCancelarEstadoLegal) {
		this.isVisibilidadCeldaCancelarEstadoLegal = isVisibilidadCeldaCancelarEstadoLegal;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoLegal() {
		return isVisibilidadCeldaGuardarEstadoLegal;
	}

	public void setIsVisibilidadCeldaGuardarEstadoLegal(Boolean isVisibilidadCeldaGuardarEstadoLegal) {
		this.isVisibilidadCeldaGuardarEstadoLegal = isVisibilidadCeldaGuardarEstadoLegal;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoLegal() {
		return isVisibilidadCeldaGuardarCambiosEstadoLegal;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoLegal(Boolean isVisibilidadCeldaGuardarCambiosEstadoLegal) {
		this.isVisibilidadCeldaGuardarCambiosEstadoLegal = isVisibilidadCeldaGuardarCambiosEstadoLegal;
	}
		
	public EstadoLegalSessionBean getestadolegalSessionBean() {
		return this.estadolegalSessionBean;
	}
	
	public void setestadolegalSessionBean(EstadoLegalSessionBean estadolegalSessionBean) {
		this.estadolegalSessionBean=estadolegalSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoLegal(EstadoLegal estadolegal)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoLegal estadolegal,EstadoLegal estadolegalAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoLegal(estadolegal);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadolegalAux.setId(estadolegal.getId());
		estadolegalAux.setVersionRow(estadolegal.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoLegal();
		
			int intSelectedRow = this.jTableDatosEstadoLegal.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegal =(EstadoLegal) this.estadolegalLogic.getEstadoLegals().toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadolegal =(EstadoLegal) this.estadolegals.toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoLegalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoLegal(this.estadolegal,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoLegal(this.estadolegal);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadolegalValidator.getInvalidValues(this.estadolegal);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadolegalLogic.setDatosCliente(datosCliente);
			estadolegalLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadolegalAux=new  EstadoLegal();
				
				estadolegalAux.setIsNew(true);
				estadolegalAux.setIsChanged(true);
				
				estadolegalAux.setEstadoLegalOriginal(this.estadolegal);
				
				estadolegalAux.setId(this.estadolegal.getId());	
				estadolegalAux.setVersionRow(this.estadolegal.getVersionRow());	
				estadolegalAux.setcodigo(this.estadolegal.getcodigo());	
				estadolegalAux.setnombre(this.estadolegal.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadolegalSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadolegalSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadolegalAux,estadolegalLogic.getEstadoLegals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadolegalAux,estadolegals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadolegalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadolegalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadolegalLogic.saveEstadoLegals();//WithConnection
						//estadolegalLogic.getSetVersionRowEstadoLegals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadolegal,estadolegalAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadolegalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes().addAll(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos().addAll(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclientes.addAll(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos.addAll(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.estadolegalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadolegalLogic.saveEstadoLegalRelaciones(estadolegalAux,this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes(),this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());//WithConnection
								//estadolegalLogic.getSetVersionRowEstadoLegals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadolegal,estadolegalAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclienteLogic.setSubClientes(new ArrayList<SubCliente>());
							this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(new ArrayList<ParametroCarteraDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclientes= new ArrayList<SubCliente>();
							this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos= new ArrayList<ParametroCarteraDefecto>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							estadolegalAux.setClientes(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							estadolegalAux.setSubClientes(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());

							if(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadolegalAux.setParametroCarteraDefectos(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadolegalSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadolegalSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadolegalAux,estadolegalLogic.getEstadoLegals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadolegalAux,estadolegals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadolegal,estadolegalAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadolegalAux=new  EstadoLegal();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadolegalSessionBean.getEsGuardarRelacionado() 
					|| (this.estadolegalSessionBean.getEsGuardarRelacionado() && this.estadolegal.getId()>=0)) {
						
					estadolegalAux.setIsNew(false);
				}
				
				estadolegalAux.setIsDeleted(false);
			
				estadolegalAux.setId(this.estadolegal.getId());	
				estadolegalAux.setVersionRow(this.estadolegal.getVersionRow());	
				estadolegalAux.setcodigo(this.estadolegal.getcodigo());	
				estadolegalAux.setnombre(this.estadolegal.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadolegalAux,estadolegalLogic.getEstadoLegals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadolegalAux,estadolegals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadolegalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadolegalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadolegalLogic.saveEstadoLegals();//WithConnection
						//estadolegalLogic.getSetVersionRowEstadoLegals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadolegal,estadolegalAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadolegalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes().addAll(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos().addAll(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclientes.addAll(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos.addAll(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.estadolegalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadolegalLogic.saveEstadoLegalRelaciones(estadolegalAux,this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes(),this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());//WithConnection
								//estadolegalLogic.getSetVersionRowEstadoLegals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadolegal,estadolegalAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclienteLogic.setSubClientes(new ArrayList<SubCliente>());
							this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(new ArrayList<ParametroCarteraDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclientes= new ArrayList<SubCliente>();
							this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos= new ArrayList<ParametroCarteraDefecto>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							estadolegalAux.setClientes(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							estadolegalAux.setSubClientes(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());

							if(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadolegalAux.setParametroCarteraDefectos(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadolegalSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadolegalSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadolegalAux,estadolegalLogic.getEstadoLegals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadolegalAux,estadolegals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadolegal,estadolegalAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadolegalAux=new  EstadoLegal();
				
				estadolegalAux.setIsNew(false);
				estadolegalAux.setIsChanged(false);
				
				estadolegalAux.setIsDeleted(true);
				
				estadolegalAux.setId(this.estadolegal.getId());	
				estadolegalAux.setVersionRow(this.estadolegal.getVersionRow());	
				estadolegalAux.setcodigo(this.estadolegal.getcodigo());	
				estadolegalAux.setnombre(this.estadolegal.getnombre());	
				
				if(this.estadolegalSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadolegalAux.getId()>=0) {	
						this.estadolegalsEliminados.add(estadolegalAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadolegalAux,estadolegalLogic.getEstadoLegals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadolegalAux,estadolegals);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadolegalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadolegalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadolegalLogic.saveEstadoLegals();//WithConnection
						//estadolegalLogic.getSetVersionRowEstadoLegals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadolegalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes().addAll(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos().addAll(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclientes.addAll(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos.addAll(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.estadolegalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadolegalLogic.saveEstadoLegalRelaciones(estadolegalAux,this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes(),this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());//WithConnection
								//estadolegalLogic.getSetVersionRowEstadoLegals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclienteLogic.setSubClientes(new ArrayList<SubCliente>());
							this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(new ArrayList<ParametroCarteraDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclientes= new ArrayList<SubCliente>();
							this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos= new ArrayList<ParametroCarteraDefecto>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							estadolegalAux.setClientes(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							estadolegalAux.setSubClientes(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());

							if(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadolegalAux.setParametroCarteraDefectos(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadolegalSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadolegalSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadolegalAux,estadolegalLogic.getEstadoLegals());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadolegalAux,estadolegals);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalLogic.getEstadoLegals().addAll(this.estadolegalsEliminados);
					
					estadolegalLogic.saveEstadoLegals();//WithConnection
					//estadolegalLogic.getSetVersionRowEstadoLegals();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadolegalsEliminados= new ArrayList<EstadoLegal>();		
			}
			
			if(this.estadolegalSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadolegalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Legal GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Legal",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadolegal=estadolegalAux;
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
      		//this.finishProcessEstadoLegal();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoLegal estadolegalLocal) throws Exception {
		
		if(this.estadolegalSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadolegalLocal.setClientes(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
				estadolegalLocal.setSubClientes(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());
				estadolegalLocal.setParametroCarteraDefectos(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
			
			} else {
			
				estadolegalLocal.setClientes(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clientes);
				estadolegalLocal.setSubClientes(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclientes);
				estadolegalLocal.setParametroCarteraDefectos(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoLegal estadolegalLocal) throws Exception {	
		if(this.estadolegalSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoLegalActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoLegal.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadolegal =(EstadoLegal) this.estadolegalLogic.getEstadoLegals().toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadolegal =(EstadoLegal) this.estadolegals.toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadolegalValidator.getInvalidValues(this.estadolegal);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoLegal estadolegal,List<EstadoLegal> estadolegals) throws Exception {
		try	{		
			EstadoLegalConstantesFunciones.actualizarLista(estadolegal,estadolegals,this.estadolegalSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoLegal estadolegal,List<EstadoLegal> estadolegals) throws Exception {
		try	{			
			EstadoLegalConstantesFunciones.actualizarSelectedLista(estadolegal,estadolegals);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoLegal> estadolegalsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadolegalsLocal=this.estadolegalLogic.getEstadoLegals();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadolegalsLocal=this.estadolegals;
			}
			//ARCHITECTURE
		
			for(EstadoLegal estadolegalLocal:estadolegalsLocal) {
				if(this.permiteMantenimiento(estadolegalLocal) && estadolegalLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoLegalConstantesFunciones.getEstadoLegalLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoLegalConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoLegal.jLabelcodigoEstadoLegal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoLegalConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoLegal.jLabelnombreEstadoLegal,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoLegal!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoLegal.jLabelcodigoEstadoLegal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoLegal.jLabelnombreEstadoLegal,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Cliente")) {
			if(this.estadolegal==null) {
				this.estadolegal= new EstadoLegal();
			}

			if(this.estadolegalSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoLegal
				this.setVariablesFormularioToObjetoActualEstadoLegal(this.estadolegal,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoLegal(this.estadolegal);

				this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.getcliente().setEstadoLegal(this.estadolegal);
			}

			return;
		}
		 else  if(sTipo.equals("SubCliente")) {
			if(this.estadolegal==null) {
				this.estadolegal= new EstadoLegal();
			}

			if(this.estadolegalSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoLegal
				this.setVariablesFormularioToObjetoActualEstadoLegal(this.estadolegal,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoLegal(this.estadolegal);

				this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.getsubcliente().setEstadoLegal(this.estadolegal);
			}

			return;
		}
		 else  if(sTipo.equals("ParametroCarteraDefecto")) {
			if(this.estadolegal==null) {
				this.estadolegal= new EstadoLegal();
			}

			if(this.estadolegalSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoLegal
				this.setVariablesFormularioToObjetoActualEstadoLegal(this.estadolegal,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoLegal(this.estadolegal);

				this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.getparametrocarteradefecto().setEstadoLegal(this.estadolegal);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoLegal--;	
		
		
		this.estadolegalAux=new EstadoLegal();
		
		this.estadolegalAux.setId(this.iIdNuevoEstadoLegal);
		this.estadolegalAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadolegalLogic.getEstadoLegals().add(this.estadolegalAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadolegals.add(this.estadolegalAux);
		}
		//ARCHITECTURE
		
		this.estadolegal=this.estadolegalAux;
		
		if(EstadoLegalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoLegal(this.estadolegal);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoLegal(this.estadolegal);
		}
				
		//this.setDefaultControlesEstadoLegal();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoLegal();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoLegal();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoLegal();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoLegal(this.estadolegalBean,this.estadolegal,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoLegal(this.estadolegal);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoLegalConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadolegalSessionBean.getConGuardarRelaciones()) {
			classes=EstadoLegalConstantesFunciones.getClassesRelationshipsOfEstadoLegal(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadolegalReturnGeneral=estadolegalLogic.procesarEventosEstadoLegalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadolegalLogic.getEstadoLegals(),this.estadolegal,this.estadolegalParameterGeneral,this.isEsNuevoEstadoLegal,classes);//this.estadolegalLogic.getEstadoLegal()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoLegal(this.estadolegalReturnGeneral,this.estadolegalBean,false);
		
		if(this.estadolegalReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoLegal(this.estadolegalReturnGeneral.getEstadoLegal());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoLegal(this.estadolegalReturnGeneral.getEstadoLegal());
		}
		
		if(this.estadolegalReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoLegal(this.estadolegalReturnGeneral.getEstadoLegal(),classes);//this.estadolegalBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoLegal(this.estadolegal,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoLegal();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoLegal();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoLegalBeanSwingJInternalFrameAdditional.RecargarFormEstadoLegal(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoLegal(false);
						
			if(estadolegalSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclienteSessionBean.getEsGuardarRelacionado() && SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSubClienteActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() && ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroCarteraDefectoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoLegalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoLegal();
			}
			
			this.actualizarVisualTableDatosEstadoLegal();
			
			this.jTableDatosEstadoLegal.setRowSelectionInterval(this.getIndiceNuevoEstadoLegal(), this.getIndiceNuevoEstadoLegal());
			
			this.seleccionarFilaTablaEstadoLegalActual();
						
			this.actualizarEstadoCeldasBotonesEstadoLegal("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoLegal(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoLegal.jTextFieldcodigoEstadoLegal.setEnabled(isHabilitar && this.estadolegalConstantesFunciones.activarcodigoEstadoLegal);
		this.jInternalFrameDetalleFormEstadoLegal.jTextAreanombreEstadoLegal.setEnabled(isHabilitar && this.estadolegalConstantesFunciones.activarnombreEstadoLegal);	
		
	};
	
	public void setDefaultControlesEstadoLegal() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoLegal(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadolegalSessionBean.setConGuardarRelaciones(true);			
			this.estadolegalSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoLegal.jTabbedPaneRelacionesEstadoLegal.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadolegalSessionBean.setConGuardarRelaciones(false);			
			this.estadolegalSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoLegal.jTabbedPaneRelacionesEstadoLegal.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoLegal() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoLegal estadolegalAux:this.estadolegalLogic.getEstadoLegals()) {
				if(estadolegalAux.getId().equals(this.iIdNuevoEstadoLegal)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoLegal estadolegalAux:this.estadolegals) {
				if(estadolegalAux.getId().equals(this.iIdNuevoEstadoLegal)) {
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
	
	public int getIndiceActualEstadoLegal(EstadoLegal estadolegal,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoLegal estadolegalAux:this.estadolegalLogic.getEstadoLegals()) {
				if(estadolegalAux.getId().equals(estadolegal.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoLegal estadolegalAux:this.estadolegals) {
				if(estadolegalAux.getId().equals(estadolegal.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoLegal(EstadoLegal estadolegalOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoLegal estadolegalAux:this.estadolegalLogic.getEstadoLegals()) {
				if(estadolegalAux.getEstadoLegalOriginal().getId().equals(estadolegalOriginal.getId())) {
					existe=true;
					estadolegalOriginal.setId(estadolegalAux.getId());
					estadolegalOriginal.setVersionRow(estadolegalAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoLegal estadolegalAux:this.estadolegals) {
				if(estadolegalAux.getEstadoLegalOriginal().getId().equals(estadolegalOriginal.getId())) {
					existe=true;
					estadolegalOriginal.setId(estadolegalAux.getId());
					estadolegalOriginal.setVersionRow(estadolegalAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoLegal(Boolean esParaCancelar) throws Exception {
		estadolegalsAux=new ArrayList<EstadoLegal>();
		estadolegalAux=new EstadoLegal();
		
		if(!this.estadolegalSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoLegal estadolegalAux:this.estadolegalLogic.getEstadoLegals()) {
					if(estadolegalAux.getId()<0) {
						estadolegalsAux.add(estadolegalAux);
					}		
				}
				this.iIdNuevoEstadoLegal=0L;
				this.estadolegalLogic.getEstadoLegals().removeAll(estadolegalsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoLegal estadolegalAux:this.estadolegals) {
					if(estadolegalAux.getId()<0) {
						estadolegalsAux.add(estadolegalAux);
					}		
				}
				this.iIdNuevoEstadoLegal=0L;
				this.estadolegals.removeAll(estadolegalsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoLegal 
					&& this.estadolegalLogic.getEstadoLegals().size()>0
					) {
					estadolegalAux=this.estadolegalLogic.getEstadoLegals().get(this.estadolegalLogic.getEstadoLegals().size() - 1);
				
					if(estadolegalAux.getId()<0) {
						this.estadolegalLogic.getEstadoLegals().remove(estadolegalAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoLegal && this.estadolegals.size()>0) {
					estadolegalAux=this.estadolegals.get(this.estadolegals.size() - 1);
				
					if(estadolegalAux.getId()<0) {
						this.estadolegals.remove(estadolegalAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoLegal(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadolegal.getId()<0) {
				this.estadolegalLogic.getEstadoLegals().remove(this.estadolegal);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadolegal.getId()<0) {
				this.estadolegals.remove(this.estadolegal);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoLegal(List<EstadoLegal> estadolegalsAux) throws Exception {
		EstadoLegalConstantesFunciones.setEstadosInicialesEstadoLegal(estadolegalsAux);
	}
	
	public void setEstadosInicialesEstadoLegal(EstadoLegal estadolegalAux) throws Exception {
		EstadoLegalConstantesFunciones.setEstadosInicialesEstadoLegal(estadolegalAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoLegalActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoLegal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoLegalActual()) {
				if(!this.isEsNuevoEstadoLegal) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoLegal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoLegal=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoLegalActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Legal ?", "MANTENIMIENTO DE Estado Legal", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoLegal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoLegal estadolegal) throws Exception {
		EstadoLegalConstantesFunciones.seleccionarAsignar(this.estadolegal,estadolegal);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoLegal=this.isPermisoActualizarOriginalEstadoLegal;
			
			
			this.seleccionarAsignar(estadolegal);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoLegalConstantesFunciones.quitarEspaciosEstadoLegal(this.estadolegal,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoLegal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadolegalSessionBean.setsFuncionBusquedaRapida(this.estadolegalSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoLegal) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoLegal(esParaCancelar);				
				this.cancelarNuevoEstadoLegal(esParaCancelar);								
			}
			
			this.estadolegal=new EstadoLegal();
			
			this.inicializarEstadoLegal();
			
			this.actualizarEstadoCeldasBotonesEstadoLegal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoLegal() throws Exception {
		try {
			EstadoLegalConstantesFunciones.inicializarEstadoLegal(this.estadolegal);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadolegalLogic.getEstadoLegals().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoLegals(String sAccionBusqueda,List<EstadoLegal> estadolegalsParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoLegal"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoLegalMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoLegalMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoLegal"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Legales");		
		parameters.put("busquedapor", EstadoLegalConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Cliente.class));
			classes.add(new Classe(SubCliente.class));
			classes.add(new Classe(ParametroCarteraDefecto.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoLegalLogic estadolegalLogicAuxiliar=new EstadoLegalLogic();
					estadolegalLogicAuxiliar.setDatosCliente(estadolegalLogic.getDatosCliente());				
					estadolegalLogicAuxiliar.setEstadoLegals(estadolegalsParaReportes);
					
					estadolegalLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoLegalWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadolegalsParaReportes=estadolegalLogicAuxiliar.getEstadoLegals();
					
					//estadolegalLogic.getNewConnexionToDeep();
					
					//for (EstadoLegal estadolegal:estadolegalsParaReportes) {
					//	estadolegalLogic.deepLoad(estadolegal, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadolegalLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadolegalLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCliente = AuxiliarReportes.class.getResourceAsStream("ClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cliente", reportFileCliente);

			InputStream reportFileSubCliente = AuxiliarReportes.class.getResourceAsStream("SubClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_subcliente", reportFileSubCliente);

			InputStream reportFileParametroCarteraDefecto = AuxiliarReportes.class.getResourceAsStream("ParametroCarteraDefectoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametrocarteradefecto", reportFileParametroCarteraDefecto);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoLegal=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoLegalConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoLegalConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoLegal=new JRBeanArrayDataSource(EstadoLegalJInternalFrame.TraerEstadoLegalBeans(estadolegalsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoLegal);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoLegalConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoLegalConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoLegalBean.TraerEstadoLegalBeans(estadolegalsParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoLegals(sAccionBusqueda,sTipoArchivoReporte,estadolegalsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoLegals(sAccionBusqueda,sTipoArchivoReporte,estadolegalsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoLegalActionPerformed(null);
					//this.generarExcelReporteEstadoLegals(sAccionBusqueda,sTipoArchivoReporte,estadolegalsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoLegals(sAccionBusqueda,sTipoArchivoReporte,estadolegalsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoLegals(sAccionBusqueda,sTipoArchivoReporte,estadolegalsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoLegals(sAccionBusqueda,sTipoArchivoReporte,estadolegalsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoLegals(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoLegal> estadolegalsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadolegal";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoLegals");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoLegal("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoLegal estadolegal : estadolegalsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoLegalConstantesFunciones.generarExcelReporteDataEstadoLegal("NORMAL",row,workbook,estadolegal,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadolegalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Legal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoLegal(String sTipo,Row row,Workbook workbook) {
		
		EstadoLegalConstantesFunciones.generarExcelReporteHeaderEstadoLegal(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoLegals(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoLegal> estadolegalsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadolegal_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoLegals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoLegal estadolegal : estadolegalsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoLegalConstantesFunciones.getEstadoLegalDescripcion(estadolegal));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoLegalConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoLegalConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadolegal.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoLegalConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoLegalConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadolegal.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadolegalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Legal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoLegals(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoLegal> estadolegalsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoLegal> estadolegalsRespaldo=null;
		
		classes=EstadoLegalConstantesFunciones.getClassesRelationshipsOfEstadoLegal(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadolegalLogic.setDatosCliente(this.datosCliente);
		this.estadolegalLogic.setDatosDeep(this.datosDeep);
		this.estadolegalLogic.setIsConDeep(true);
		
		estadolegalsRespaldo=this.estadolegalLogic.getEstadoLegals();
		
		this.estadolegalLogic.setEstadoLegals(estadolegalsParaReportes);	
		this.estadolegalLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadolegalsParaReportes=this.estadolegalLogic.getEstadoLegals();
		this.estadolegalLogic.setEstadoLegals(estadolegalsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadolegal_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoLegals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoLegal("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoLegal estadolegal : estadolegalsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoLegal("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoLegalConstantesFunciones.generarExcelReporteDataEstadoLegal("NORMAL",row,workbook,estadolegal,cellStyleDataAux);
		
			
			


				//Cliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadolegal.getClientes()!=null && estadolegal.getClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ClienteConstantesFunciones.generarExcelReporteHeaderCliente("RELACIONADO",row,workbook);
				}

				if(estadolegal.getClientes()!=null) {
					i2=0;
					for(Cliente cliente : estadolegal.getClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ClienteConstantesFunciones.generarExcelReporteDataCliente("RELACIONADO",row,workbook,cliente,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//SubCliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(SubClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadolegal.getSubClientes()!=null && estadolegal.getSubClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(SubClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					SubClienteConstantesFunciones.generarExcelReporteHeaderSubCliente("RELACIONADO",row,workbook);
				}

				if(estadolegal.getSubClientes()!=null) {
					i2=0;
					for(SubCliente subcliente : estadolegal.getSubClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						SubClienteConstantesFunciones.generarExcelReporteDataSubCliente("RELACIONADO",row,workbook,subcliente,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ParametroCarteraDefecto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadolegal.getParametroCarteraDefectos()!=null && estadolegal.getParametroCarteraDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroCarteraDefectoConstantesFunciones.generarExcelReporteHeaderParametroCarteraDefecto("RELACIONADO",row,workbook);
				}

				if(estadolegal.getParametroCarteraDefectos()!=null) {
					i2=0;
					for(ParametroCarteraDefecto parametrocarteradefecto : estadolegal.getParametroCarteraDefectos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ParametroCarteraDefectoConstantesFunciones.generarExcelReporteDataParametroCarteraDefecto("RELACIONADO",row,workbook,parametrocarteradefecto,cellStyleDataAuxHijo);
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
		cell.setCellValue(EstadoLegalConstantesFunciones.getEstadoLegalDescripcion(estadolegal));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadolegalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Legal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoLegal.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoLegal.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoLegal.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoLegal.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoLegal() throws Exception {		
		this.startProcessEstadoLegal(true);
	}
	
	public void startProcessEstadoLegal(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoLegal, this.jScrollPanelDatosEstadoLegal,this.jPanelPaginacionEstadoLegal, this.jScrollPanelDatosEdicionEstadoLegal, this.jPanelAccionesEstadoLegal,this.jPanelAccionesFormularioEstadoLegal,this.jmenuBarEstadoLegal,this.jmenuBarDetalleEstadoLegal,this.jTtoolBarEstadoLegal,this.jTtoolBarDetalleEstadoLegal);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoLegal=null; 
		
		final JPanel jPanelParametrosReportesEstadoLegal=this.jPanelParametrosReportesEstadoLegal;
		//final JScrollPane jScrollPanelDatosEstadoLegal=this.jScrollPanelDatosEstadoLegal;
		final JTable jTableDatosEstadoLegal=this.jTableDatosEstadoLegal;		
		final JPanel jPanelPaginacionEstadoLegal=this.jPanelPaginacionEstadoLegal;
		//final JScrollPane jScrollPanelDatosEdicionEstadoLegal=this.jScrollPanelDatosEdicionEstadoLegal;
		final JPanel jPanelAccionesEstadoLegal=this.jPanelAccionesEstadoLegal;
		
		JPanel jPanelCamposAuxiliarEstadoLegal=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoLegal=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoLegal!=null) {
			jPanelCamposAuxiliarEstadoLegal=this.jInternalFrameDetalleFormEstadoLegal.jPanelCamposEstadoLegal;
			jPanelAccionesFormularioAuxiliarEstadoLegal=this.jInternalFrameDetalleFormEstadoLegal.jPanelAccionesFormularioEstadoLegal;
		}
		
		final JPanel jPanelCamposEstadoLegal=jPanelCamposAuxiliarEstadoLegal;
		final JPanel jPanelAccionesFormularioEstadoLegal=jPanelAccionesFormularioAuxiliarEstadoLegal;
		
		
		final JMenuBar jmenuBarEstadoLegal=this.jmenuBarEstadoLegal;
		final JToolBar jTtoolBarEstadoLegal=this.jTtoolBarEstadoLegal;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoLegal=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoLegal=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoLegal!=null) {
			jmenuBarDetalleAuxiliarEstadoLegal=this.jInternalFrameDetalleFormEstadoLegal.jmenuBarDetalleEstadoLegal;
			jTtoolBarDetalleAuxiliarEstadoLegal=this.jInternalFrameDetalleFormEstadoLegal.jTtoolBarDetalleEstadoLegal;
		}
		
		final JMenuBar jmenuBarDetalleEstadoLegal=jmenuBarDetalleAuxiliarEstadoLegal;
		final JToolBar jTtoolBarDetalleEstadoLegal=jTtoolBarDetalleAuxiliarEstadoLegal;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoLegal;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoLegal;
			processRunnable.jTableDatos=jTableDatosEstadoLegal;
			processRunnable.jPanelCampos=jPanelCamposEstadoLegal;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoLegal;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoLegal;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoLegal;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoLegal;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoLegal;
			processRunnable.jTtoolBar=jTtoolBarEstadoLegal;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoLegal;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoLegal ,jPanelParametrosReportesEstadoLegal,jTableDatosEstadoLegal, /*jScrollPanelDatosEstadoLegal,*/jPanelCamposEstadoLegal,jPanelPaginacionEstadoLegal, /*jScrollPanelDatosEdicionEstadoLegal,*/ jPanelAccionesEstadoLegal,jPanelAccionesFormularioEstadoLegal,jmenuBarEstadoLegal,jmenuBarDetalleEstadoLegal,jTtoolBarEstadoLegal,jTtoolBarDetalleEstadoLegal);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoLegal, jScrollPanelDatosEstadoLegal,jPanelPaginacionEstadoLegal, jScrollPanelDatosEdicionEstadoLegal, jPanelAccionesEstadoLegal,jPanelAccionesFormularioEstadoLegal,jmenuBarEstadoLegal,jmenuBarDetalleEstadoLegal,jTtoolBarEstadoLegal,jTtoolBarDetalleEstadoLegal);
						
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
	
	public void finishProcessEstadoLegal() {// throws Exception 
		this.finishProcessEstadoLegal(true);
	}
	
	public void finishProcessEstadoLegal(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoLegal, this.jScrollPanelDatosEstadoLegal,this.jPanelPaginacionEstadoLegal, this.jScrollPanelDatosEdicionEstadoLegal, this.jPanelAccionesEstadoLegal,this.jPanelAccionesFormularioEstadoLegal,this.jmenuBarEstadoLegal,this.jmenuBarDetalleEstadoLegal,this.jTtoolBarEstadoLegal,this.jTtoolBarDetalleEstadoLegal);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoLegal=null; 
		
		final JPanel jPanelParametrosReportesEstadoLegal=this.jPanelParametrosReportesEstadoLegal;
		//final JScrollPane jScrollPanelDatosEstadoLegal=this.jScrollPanelDatosEstadoLegal;
		final JTable jTableDatosEstadoLegal=this.jTableDatosEstadoLegal;		
		final JPanel jPanelPaginacionEstadoLegal=this.jPanelPaginacionEstadoLegal;
		//final JScrollPane jScrollPanelDatosEdicionEstadoLegal=this.jScrollPanelDatosEdicionEstadoLegal;
		final JPanel jPanelAccionesEstadoLegal=this.jPanelAccionesEstadoLegal;
		
		JPanel jPanelCamposAuxiliarEstadoLegal=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoLegal=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoLegal!=null) {
			jPanelCamposAuxiliarEstadoLegal=this.jInternalFrameDetalleFormEstadoLegal.jPanelCamposEstadoLegal;
			jPanelAccionesFormularioAuxiliarEstadoLegal=this.jInternalFrameDetalleFormEstadoLegal.jPanelAccionesFormularioEstadoLegal;
		}
		
		final JPanel jPanelCamposEstadoLegal=jPanelCamposAuxiliarEstadoLegal;
		final JPanel jPanelAccionesFormularioEstadoLegal=jPanelAccionesFormularioAuxiliarEstadoLegal;
		
		
		final JMenuBar jmenuBarEstadoLegal=this.jmenuBarEstadoLegal;		
		final JToolBar jTtoolBarEstadoLegal=this.jTtoolBarEstadoLegal;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoLegal=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoLegal=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoLegal!=null) {
			jmenuBarDetalleAuxiliarEstadoLegal=this.jInternalFrameDetalleFormEstadoLegal.jmenuBarDetalleEstadoLegal;
			jTtoolBarDetalleAuxiliarEstadoLegal=this.jInternalFrameDetalleFormEstadoLegal.jTtoolBarDetalleEstadoLegal;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoLegal=jmenuBarDetalleAuxiliarEstadoLegal;
		final JToolBar jTtoolBarDetalleEstadoLegal=jTtoolBarDetalleAuxiliarEstadoLegal;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoLegal;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoLegal;
			processRunnable.jTableDatos=jTableDatosEstadoLegal;
			processRunnable.jPanelCampos=jPanelCamposEstadoLegal;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoLegal;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoLegal;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoLegal;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoLegal;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoLegal;
			processRunnable.jTtoolBar=jTtoolBarEstadoLegal;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoLegal;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoLegal ,jPanelParametrosReportesEstadoLegal, jTableDatosEstadoLegal,/*jScrollPanelDatosEstadoLegal,*/jPanelCamposEstadoLegal,jPanelPaginacionEstadoLegal, /*jScrollPanelDatosEdicionEstadoLegal,*/ jPanelAccionesEstadoLegal,jPanelAccionesFormularioEstadoLegal,jmenuBarEstadoLegal,jmenuBarDetalleEstadoLegal,jTtoolBarEstadoLegal,jTtoolBarDetalleEstadoLegal));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoLegal(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoLegal(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoLegal(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoLegal(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoLegal,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoLegal,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoLegal(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoLegal,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoLegal,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadolegalConstantesFunciones.getsFinalQueryEstadoLegal();
		String  finalQueryPaginacionTodos=this.estadolegalConstantesFunciones.getsFinalQueryEstadoLegal();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoLegalConstantesFunciones.getArrayColumnasGlobalesNoEstadoLegal(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoLegalConstantesFunciones.getArrayColumnasGlobalesEstadoLegal(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoLegalConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadolegalsEliminados= new ArrayList<EstadoLegal>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoLegal();
		
				///*EstadoLegalSessionBean*/this.estadolegalSessionBean=new EstadoLegalSessionBean();
			
			if(this.estadolegalSessionBean==null) {
				this.estadolegalSessionBean=new EstadoLegalSessionBean();
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
					this.iNumeroPaginacion=EstadoLegalConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoLegalConstantesFunciones.getClassesForeignKeysOfEstadoLegal(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadolegal."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadolegalsAux= new ArrayList<EstadoLegal>();
			
				
			estadolegalLogic.setDatosCliente(this.datosCliente);
			estadolegalLogic.setDatosDeep(this.datosDeep);
			estadolegalLogic.setIsConDeep(true);
			
			
			estadolegalLogic.getEstadoLegalDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadolegalLogic.getTodosEstadoLegals(finalQueryGlobal,pagination);
					
					//estadolegalLogic.getTodosEstadoLegalsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadolegalLogic.getEstadoLegals()==null|| estadolegalLogic.getEstadoLegals().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadolegalsAux= new ArrayList<EstadoLegal>();
							estadolegalsAux.addAll(estadolegalLogic.getEstadoLegals());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadolegalsAux= new ArrayList<EstadoLegal>();
							estadolegalsAux.addAll(estadolegals);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadolegalLogic.getTodosEstadoLegals(finalQueryGlobal+"",this.pagination);												
							
							//estadolegalLogic.getTodosEstadoLegalsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoLegals("Todos",estadolegalLogic.getEstadoLegals() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadolegalLogic.setEstadoLegals(new ArrayList<EstadoLegal>());					
							estadolegalLogic.getEstadoLegals().addAll(estadolegalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadolegals=new ArrayList<EstadoLegal>();
							estadolegals.addAll(estadolegalsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoLegal=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoLegal=this.idActual;
				
				} else if(this.idEstadoLegalActual!=null && this.idEstadoLegalActual!=0L) {
					idEstadoLegal=idEstadoLegalActual;
				}
				
					
				this.sDetalleReporte=EstadoLegalConstantesFunciones.getDetalleIndicePorId(idEstadoLegal);
				
				this.estadolegals=new ArrayList<EstadoLegal>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadolegalLogic.getEntity(idEstadoLegal);
					
					//estadolegalLogic.getEntityWithConnection(idEstadoLegal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadolegalLogic.setEstadoLegals(new ArrayList<EstadoLegal>());
					estadolegalLogic.getEstadoLegals().add(estadolegalLogic.getEstadoLegal());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadolegals=new ArrayList<EstadoLegal>();
					this.estadolegals.add(estadolegal);
				}
				
				if(estadolegalLogic.getEstadoLegal()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoLegal();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoLegal();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadolegalLogic.getEstadoLegals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadolegals.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadolegalLogic.getEstadoLegals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadolegals.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoLegal estadolegal) {
		Boolean permite=true;
		
		if(this.estadolegal.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoLegalConstantesFunciones.getOrderByListaEstadoLegal();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoLegalConstantesFunciones.getOrderByListaEstadoLegal();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoLegal estadolegal:estadolegalLogic.getEstadoLegals()) {
				if(estadolegal.getsType().equals(Constantes2.S_TOTALES)) {
					estadolegalTotales=estadolegal;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoLegal estadolegal:this.estadolegals) {
				if(estadolegal.getsType().equals(Constantes2.S_TOTALES)) {
					estadolegalTotales=estadolegal;
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
			this.estadolegalAux=new EstadoLegal();
			this.estadolegalAux.setsType(Constantes2.S_TOTALES);
			this.estadolegalAux.setIsNew(false);
			this.estadolegalAux.setIsChanged(false);
			this.estadolegalAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoLegalConstantesFunciones.TotalizarValoresFilaEstadoLegal(this.estadolegalLogic.getEstadoLegals(),this.estadolegalAux);
				
				this.estadolegalLogic.getEstadoLegals().add(this.estadolegalAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoLegalConstantesFunciones.TotalizarValoresFilaEstadoLegal(this.estadolegals,this.estadolegalAux);
				
				this.estadolegals.add(this.estadolegalAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadolegalTotales=new EstadoLegal();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadolegalLogic.getEstadoLegals().remove(estadolegalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadolegals.remove(estadolegalTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadolegalTotales=new EstadoLegal();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoLegal estadolegal:estadolegalLogic.getEstadoLegals()) {
				if(estadolegal.getsType().equals(Constantes2.S_TOTALES)) {
					estadolegalTotales=estadolegal;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoLegalConstantesFunciones.TotalizarValoresFilaEstadoLegal(this.estadolegalLogic.getEstadoLegals(),estadolegalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoLegal estadolegal:this.estadolegals) {
				if(estadolegal.getsType().equals(Constantes2.S_TOTALES)) {
					estadolegalTotales=estadolegal;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoLegalConstantesFunciones.TotalizarValoresFilaEstadoLegal(this.estadolegals,estadolegalTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEstadoLegalPorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getEstadoLegalPorCodigo(String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadolegalLogic.getEstadoLegalPorCodigo(codigo);
				
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
	
	public void inicializarPermisosEstadoLegal() {
		this.isPermisoTodoEstadoLegal=false;
		this.isPermisoNuevoEstadoLegal=false;
		this.isPermisoActualizarEstadoLegal=false;
		this.isPermisoActualizarOriginalEstadoLegal=false;
		this.isPermisoEliminarEstadoLegal=false;
		this.isPermisoGuardarCambiosEstadoLegal=false;
		this.isPermisoConsultaEstadoLegal=false;
		this.isPermisoBusquedaEstadoLegal=false;
		this.isPermisoReporteEstadoLegal=false;		
		this.isPermisoOrdenEstadoLegal=false;		
		this.isPermisoPaginacionMedioEstadoLegal=false;		
		this.isPermisoPaginacionAltoEstadoLegal=false;
		this.isPermisoPaginacionTodoEstadoLegal=false;
		this.isPermisoCopiarEstadoLegal=false;		
		this.isPermisoVerFormEstadoLegal=false;		
		this.isPermisoDuplicarEstadoLegal=false;		
		this.isPermisoOrdenEstadoLegal=false;		
	}
	
	public void setPermisosUsuarioEstadoLegal(Boolean isPermiso) {
		this.isPermisoTodoEstadoLegal=isPermiso;
		this.isPermisoNuevoEstadoLegal=isPermiso;
		this.isPermisoActualizarEstadoLegal=isPermiso;
		this.isPermisoActualizarOriginalEstadoLegal=isPermiso;
		this.isPermisoEliminarEstadoLegal=isPermiso;
		this.isPermisoGuardarCambiosEstadoLegal=isPermiso;
		this.isPermisoConsultaEstadoLegal=isPermiso;
		this.isPermisoBusquedaEstadoLegal=isPermiso;
		this.isPermisoReporteEstadoLegal=isPermiso;
		this.isPermisoOrdenEstadoLegal=isPermiso;		
		this.isPermisoPaginacionMedioEstadoLegal=isPermiso;		
		this.isPermisoPaginacionAltoEstadoLegal=isPermiso;		
		this.isPermisoPaginacionTodoEstadoLegal=isPermiso;		
		this.isPermisoCopiarEstadoLegal=isPermiso;		
		this.isPermisoVerFormEstadoLegal=isPermiso;		
		this.isPermisoDuplicarEstadoLegal=isPermiso;
		this.isPermisoOrdenEstadoLegal=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoLegal(Boolean isPermiso) {
		//this.isPermisoTodoEstadoLegal=isPermiso;
		this.isPermisoNuevoEstadoLegal=isPermiso;
		this.isPermisoActualizarEstadoLegal=isPermiso;
		this.isPermisoActualizarOriginalEstadoLegal=isPermiso;
		this.isPermisoEliminarEstadoLegal=isPermiso;
		this.isPermisoGuardarCambiosEstadoLegal=isPermiso;
		//this.isPermisoConsultaEstadoLegal=isPermiso;
		//this.isPermisoBusquedaEstadoLegal=isPermiso;
		//this.isPermisoReporteEstadoLegal=isPermiso;
		//this.isPermisoOrdenEstadoLegal=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoLegal=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoLegal=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoLegal=isPermiso;		
		//this.isPermisoCopiarEstadoLegal=isPermiso;		
		//this.isPermisoDuplicarEstadoLegal=isPermiso;
		//this.isPermisoOrdenEstadoLegal=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoLegalClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(SubClienteConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ParametroCarteraDefectoConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoLegalJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCliente=false;
		this.isTienePermisosCliente=this.verificarGetPermisosUsuarioOpcionEstadoLegalClaseRelacionada(this.opcionsRelacionadas,ClienteConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosSubCliente=false;
		this.isTienePermisosSubCliente=this.verificarGetPermisosUsuarioOpcionEstadoLegalClaseRelacionada(this.opcionsRelacionadas,SubClienteConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosParametroCarteraDefecto=false;
		this.isTienePermisosParametroCarteraDefecto=this.verificarGetPermisosUsuarioOpcionEstadoLegalClaseRelacionada(this.opcionsRelacionadas,ParametroCarteraDefectoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoLegal(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoLegalClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCliente=conPermiso;
		this.isTienePermisosSubCliente=conPermiso;
		this.isTienePermisosParametroCarteraDefecto=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoLegalClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoLegalClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoLegalClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCliente && this.jInternalFrameDetalleFormEstadoLegal!=null && this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoLegal.jTabbedPaneRelacionesEstadoLegal.remove(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosSubCliente && this.jInternalFrameDetalleFormEstadoLegal!=null && this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoLegal.jTabbedPaneRelacionesEstadoLegal.remove(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosParametroCarteraDefecto && this.jInternalFrameDetalleFormEstadoLegal!=null && this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoLegal.jTabbedPaneRelacionesEstadoLegal.remove(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoLegal() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoLegalJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadolegalSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoLegalConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoLegal=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoLegal=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoLegal=this.isPermisoActualizarEstadoLegal;
			this.isPermisoEliminarEstadoLegal=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoLegal=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoLegal=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoLegal=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoLegal=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoLegal=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoLegal=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoLegal=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoLegal=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoLegal=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoLegal=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoLegal=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoLegal=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoLegal=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadolegalSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoLegal.setToolTipText(this.jTableDatosEstadoLegal.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoLegal(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoLegal(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoLegalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoLegalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoLegal() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCliente && this.estadolegalConstantesFunciones.mostrarClienteEstadoLegal && !EstadoLegalConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cliente");
			reporte.setsDescripcion("Cliente");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosSubCliente && this.estadolegalConstantesFunciones.mostrarSubClienteEstadoLegal && !EstadoLegalConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Sub Cliente");
			reporte.setsDescripcion("Sub Cliente");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosParametroCarteraDefecto && this.estadolegalConstantesFunciones.mostrarParametroCarteraDefectoEstadoLegal && !EstadoLegalConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Parametro Cartera Defecto");
			reporte.setsDescripcion("Parametro Cartera Defecto");
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
	
		
	public void inicializarCombosForeignKeyEstadoLegalListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoLegalListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoLegalJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoLegalListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoLegalListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoLegal()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoLegal()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoLegal(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoLegal()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoLegal();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoLegal(EstadoLegal estadolegal)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoLegal(EstadoLegal estadolegal,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoLegal()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoLegal()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoLegal()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoLegal()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoLegal()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoLegal()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoLegal(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoLegal()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoLegalBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoLegalBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoLegalBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadolegalSessionBean=new EstadoLegalSessionBean(); 
		this.estadolegalConstantesFunciones=new EstadoLegalConstantesFunciones(); 
		this.estadolegalBean=new EstadoLegal();//(this.estadolegalConstantesFunciones); 		
		this.estadolegalReturnGeneral=new EstadoLegalParameterReturnGeneral(); 
		
		this.estadolegalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadolegalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoLegalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoLegalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoLegalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoLegal(true);
			
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
			
			this.estadolegalConstantesFunciones=new EstadoLegalConstantesFunciones(); 
			this.estadolegalBean=new EstadoLegal();//this.estadolegalConstantesFunciones); 			
			this.estadolegalReturnGeneral=new EstadoLegalParameterReturnGeneral(); 
		
			EstadoLegalBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Legal Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadolegal=new EstadoLegal();
			this.estadolegals = new ArrayList<EstadoLegal>();
			this.estadolegalsAux = new ArrayList<EstadoLegal>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic=new EstadoLegalLogic();
				this.estadolegalLogic.getNewConnexionToDeep("");
			}
			
			//this.estadolegalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadolegalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoLegal);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoLegal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoLegal);	
					}
					
					if(this.jInternalFrameImportacionEstadoLegal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoLegal);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoLegal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoLegal);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoLegal!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoLegal);
				this.jInternalFrameDetalleFormEstadoLegal.setVisible(false);
				this.jInternalFrameDetalleFormEstadoLegal.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoLegal!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoLegal);
					this.jInternalFrameReporteDinamicoEstadoLegal.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoLegal.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoLegal!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoLegal);
					this.jInternalFrameImportacionEstadoLegal.setVisible(false);
					this.jInternalFrameImportacionEstadoLegal.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoLegal!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoLegal);
					this.jInternalFrameOrderByEstadoLegal.setVisible(false);
					this.jInternalFrameOrderByEstadoLegal.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoLegalActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoLegalConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadolegalReturnGeneral=new EstadoLegalParameterReturnGeneral();
			
			this.estadolegalParameterGeneral=new EstadoLegalParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadolegalLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadolegalSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoLegalJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadolegalSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(SubClienteConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ParametroCarteraDefectoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoLegalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadolegalSessionBean.getEsGuardarRelacionado(),this.estadolegalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoLegalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadolegalSessionBean.getEsGuardarRelacionado(),this.estadolegalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoLegal=false;
			this.isVisibilidadCeldaDuplicarEstadoLegal=true;
			this.isVisibilidadCeldaCopiarEstadoLegal=true;
			this.isVisibilidadCeldaVerFormEstadoLegal=true;
			this.isVisibilidadCeldaOrdenEstadoLegal=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoLegal=false;
			this.isVisibilidadCeldaModificarEstadoLegal=false;
			this.isVisibilidadCeldaActualizarEstadoLegal=false;
			this.isVisibilidadCeldaEliminarEstadoLegal=false;
			this.isVisibilidadCeldaCancelarEstadoLegal=false;
			this.isVisibilidadCeldaGuardarEstadoLegal=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoLegal=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoLegal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoLegal();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoLegal(false);
			
			this.setPermisosUsuarioEstadoLegal();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadolegalSessionBean.getEsGuardarRelacionado() 
				|| (this.estadolegalSessionBean.getEsGuardarRelacionado() && this.estadolegalSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoLegalClasesRelacionadas();
			}
			
			if(this.estadolegalSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoLegalClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoLegalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoLegal();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoLegal();
			}
			
			if(!this.isPermisoBusquedaEstadoLegal) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadolegalSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoLegal,this.isPermisoPaginacionMedioEstadoLegal,this.isPermisoPaginacionTodoEstadoLegal);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoLegalConstantesFunciones.getTiposSeleccionarEstadoLegal());
				
				this.tiposColumnasSelect=EstadoLegalConstantesFunciones.getTiposSeleccionarEstadoLegal(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoLegal();				
				//this.tiposRelacionesSelect=EstadoLegalConstantesFunciones.getTiposRelacionesEstadoLegal(true);
				
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
			//if(!this.estadolegalSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoLegal();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoLegal(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoLegal(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoLegal() ;
			
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
			
			
			this.clienteLogic=new ClienteLogic();
			this.subclienteLogic=new SubClienteLogic();
			this.parametrocarteradefectoLogic=new ParametroCarteraDefectoLogic(); 
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
				estadolegalImplementable= (EstadoLegalImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoLegalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadolegalImplementableHome= (EstadoLegalImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoLegalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadolegals= new ArrayList<EstadoLegal>();
			this.estadolegalsEliminados= new ArrayList<EstadoLegal>();
						
			this.isEsNuevoEstadoLegal=false;
			this.esParaAccionDesdeFormularioEstadoLegal=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoLegal(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoLegal();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadolegalSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadoLegalBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoLegalConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoLegal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoLegal(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoLegal!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoLegal();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoLegal();
			}
			
			EstadoLegalBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoLegal(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoLegal: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoLegal() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(SubClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(SubClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoLegal")) {
				iIndex=this.jInternalFrameDetalleFormEstadoLegal.jTabbedPaneRelacionesEstadoLegal.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoLegal.jTabbedPaneRelacionesEstadoLegal.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoLegal.getSelectedRow();	
				
				

				if(sTitle.equals("Clientes")) {
					if(!ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoLegal();

						this.cargarParteTabPanelRelacionadaCliente(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Parametro Cartera Defectos")) {
					if(!ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoLegal();

						this.cargarParteTabPanelRelacionadaParametroCarteraDefecto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Sub Clientes")) {
					if(!SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoLegal();

						this.cargarParteTabPanelRelacionadaSubCliente(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoLegal();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoLegal.cargarSessionConBeanSwingJInternalFrameCliente(false,true,iIndex);
		this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCliente();

		//this.jTabbedPaneRelacionesEstadoLegal.updateUI();
		//this.jTabbedPaneRelacionesEstadoLegal.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoLegal.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaParametroCarteraDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoLegal.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(false,true,iIndex);
		this.jButtonParametroCarteraDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroCarteraDefecto();

		//this.jTabbedPaneRelacionesEstadoLegal.updateUI();
		//this.jTabbedPaneRelacionesEstadoLegal.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoLegal.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaSubCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoLegal.cargarSessionConBeanSwingJInternalFrameSubCliente(false,true,iIndex);
		this.jButtonSubClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaSubCliente();

		//this.jTabbedPaneRelacionesEstadoLegal.updateUI();
		//this.jTabbedPaneRelacionesEstadoLegal.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoLegal.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Cliente")) {
				int row=this.jTableDatosEstadoLegal.getSelectedRow();
				jButtonClienteActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("SubCliente")) {
				int row=this.jTableDatosEstadoLegal.getSelectedRow();
				jButtonSubClienteActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ParametroCarteraDefecto")) {
				int row=this.jTableDatosEstadoLegal.getSelectedRow();
				jButtonParametroCarteraDefectoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadolegalSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Cliente")) {

					if(this.isTienePermisosCliente && this.estadolegalConstantesFunciones.mostrarClienteEstadoLegal && !EstadoLegalConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Clientes"+"("+ClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Clientes");

						if(estadolegalConstantesFunciones.resaltarClienteEstadoLegal!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadolegalConstantesFunciones.resaltarClienteEstadoLegal);
						}

						jmenuItem.setEnabled(this.estadolegalConstantesFunciones.activarClienteEstadoLegal);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Cliente"));

						

						this.jInternalFrameDetalleFormEstadoLegal.jmenuDetalleEstadoLegal.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Sub Cliente")) {

					if(this.isTienePermisosSubCliente && this.estadolegalConstantesFunciones.mostrarSubClienteEstadoLegal && !EstadoLegalConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Sub Clientes"+"("+SubClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Sub Clientes");

						if(estadolegalConstantesFunciones.resaltarSubClienteEstadoLegal!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadolegalConstantesFunciones.resaltarSubClienteEstadoLegal);
						}

						jmenuItem.setEnabled(this.estadolegalConstantesFunciones.activarSubClienteEstadoLegal);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"SubCliente"));

						

						this.jInternalFrameDetalleFormEstadoLegal.jmenuDetalleEstadoLegal.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Parametro Cartera Defecto")) {

					if(this.isTienePermisosParametroCarteraDefecto && this.estadolegalConstantesFunciones.mostrarParametroCarteraDefectoEstadoLegal && !EstadoLegalConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Cartera Defectos"+"("+ParametroCarteraDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Cartera Defectos");

						if(estadolegalConstantesFunciones.resaltarParametroCarteraDefectoEstadoLegal!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadolegalConstantesFunciones.resaltarParametroCarteraDefectoEstadoLegal);
						}

						jmenuItem.setEnabled(this.estadolegalConstantesFunciones.activarParametroCarteraDefectoEstadoLegal);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroCarteraDefecto"));

						

						this.jInternalFrameDetalleFormEstadoLegal.jmenuDetalleEstadoLegal.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoLegal(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoLegal(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoLegal(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoLegalListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoLegal();
		
		this.cargarCombosFrameForeignKeyEstadoLegal();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoLegal();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoLegal();
		}
	}
	
	
	
	public void jButtonNuevoEstadoLegalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadolegalSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoLegal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
			
			
			if(jTableDatosEstadoLegal.getRowCount()>=1) {
				jTableDatosEstadoLegal.removeRowSelectionInterval(0, jTableDatosEstadoLegal.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoLegal=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoLegal(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoLegal(true);			
			//this.estadolegal=new EstadoLegal();
			//this.estadolegal.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoLegal(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoLegal() ;
			
			if(EstadoLegalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoLegal(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadolegal);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadolegal);				
			
			EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
			
			if(this.estadolegalSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoLegal: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoLegalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoLegal> estadolegalsSeleccionados=new ArrayList<EstadoLegal>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoLegal.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoLegal.getSelectedRows().length;			
			}
			
			estadolegalsSeleccionados=this.getEstadoLegalsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoLegal--;			
				//EstadoLegal estadolegalAux= new EstadoLegal();			
				//estadolegalAux.setId(this.iIdNuevoEstadoLegal);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoLegal estadolegalOrigen=new EstadoLegal();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoLegal estadolegalOrigen : estadolegalsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoLegal.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadolegalOrigen =(EstadoLegal) this.estadolegalLogic.getEstadoLegals().toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadolegalOrigen =(EstadoLegal) this.estadolegals.toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoLegal();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadolegal.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoLegal(estadolegalOrigen,this.estadolegal,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoLegal(this.estadolegal);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadolegalLogic.getEstadoLegals().add(this.estadolegalAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadolegals.add(this.estadolegalAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoLegal(false);
				
				this.jTableDatosEstadoLegal.setRowSelectionInterval(this.getIndiceNuevoEstadoLegal(), this.getIndiceNuevoEstadoLegal());
				
				int iLastRow =  this.jTableDatosEstadoLegal.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoLegal.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoLegal.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoLegal(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoLegalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoLegal> estadolegalsSeleccionados=new ArrayList<EstadoLegal>();									
		
			EstadoLegal estadolegalOrigen=new EstadoLegal();
			EstadoLegal estadolegalDestino=new EstadoLegal();
				
			estadolegalsSeleccionados=this.getEstadoLegalsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoLegal.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadolegalsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoLegal.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadolegalOrigen =(EstadoLegal) this.estadolegalLogic.getEstadoLegals().toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadolegalOrigen =(EstadoLegal) this.estadolegals.toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadolegalDestino =(EstadoLegal) this.estadolegalLogic.getEstadoLegals().toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadolegalDestino =(EstadoLegal) this.estadolegals.toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadolegalOrigen =estadolegalsSeleccionados.get(0);
				estadolegalDestino =estadolegalsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoLegal(estadolegalOrigen,estadolegalDestino,true,false);
				
				estadolegalDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadolegalDestino,estadolegalLogic.getEstadoLegals());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadolegalDestino,estadolegals);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoLegal(false);
				
				//this.jTableDatosEstadoLegal.setRowSelectionInterval(this.getIndiceNuevoEstadoLegal(), this.getIndiceNuevoEstadoLegal());
				
				int iLastRow =  this.jTableDatosEstadoLegal.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoLegal.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoLegal.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoLegal(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoLegalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoLegal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoLegal.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoLegalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoLegal.isVisible();
			
			
			this.jPanelParametrosReportesEstadoLegal.setVisible(!isVisible);
			this.jPanelPaginacionEstadoLegal.setVisible(!isVisible);
			this.jPanelAccionesEstadoLegal.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoLegalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoLegal();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoLegalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoLegal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoLegalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoLegal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoLegalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoLegal();
			
			this.abrirFrameOrderByEstadoLegal();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoLegalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoLegal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoLegal(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoLegal);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoLegal.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoLegal.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoLegal.setSize(this.jInternalFrameDetalleFormEstadoLegal.iWidthFormulario,this.jInternalFrameDetalleFormEstadoLegal.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoLegal.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoLegal.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoLegal.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoLegal.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoLegal.jContentPaneDetalleEstadoLegal.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoLegal.jTabbedPaneRelacionesEstadoLegal.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoLegal.jContentPaneDetalleEstadoLegal.getWidth(),EstadoLegalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoLegal.jTabbedPaneRelacionesEstadoLegal.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoLegal.jContentPaneDetalleEstadoLegal.getWidth(),EstadoLegalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoLegal.jTabbedPaneRelacionesEstadoLegal.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoLegal.jContentPaneDetalleEstadoLegal.getWidth(),EstadoLegalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCliente();
					}

					if(ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroCarteraDefecto();
					}

					if(SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaSubCliente();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoLegal.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoLegal.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoLegal() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoLegal==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoLegal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoLegal,false,this);
				} else {
					this.jInternalFrameOrderByEstadoLegal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoLegal,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoLegal);
				this.jInternalFrameOrderByEstadoLegal.setVisible(false);
				this.jInternalFrameOrderByEstadoLegal.setSelected(false);
				
				this.jInternalFrameOrderByEstadoLegal.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoLegal"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoLegal();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoLegal() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoLegal==null) {
				
				this.jInternalFrameImportacionEstadoLegal=new ImportacionJInternalFrame(EstadoLegalConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoLegal);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoLegal);
				this.jInternalFrameImportacionEstadoLegal.setVisible(false);
				this.jInternalFrameImportacionEstadoLegal.setSelected(false);


				this.jInternalFrameImportacionEstadoLegal.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoLegal"));
				this.jInternalFrameImportacionEstadoLegal.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoLegal"));
				this.jInternalFrameImportacionEstadoLegal.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoLegal"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoLegal() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoLegal==null) {
				this.jInternalFrameReporteDinamicoEstadoLegal=new ReporteDinamicoJInternalFrame(EstadoLegalConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoLegal);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoLegal);
				this.jInternalFrameReporteDinamicoEstadoLegal.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoLegal.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoLegal.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoLegal"));
				this.jInternalFrameReporteDinamicoEstadoLegal.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoLegal"));
				this.jInternalFrameReporteDinamicoEstadoLegal.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoLegal"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoLegal();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoLegal.jContentPaneDetalleEstadoLegal.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaParametroCarteraDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoLegal.jContentPaneDetalleEstadoLegal.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaSubCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoLegal.jContentPaneDetalleEstadoLegal.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoLegal() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoLegal);
			
	       	this.jInternalFrameDetalleFormEstadoLegal.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoLegal.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoLegal.dispose();
			//this.jInternalFrameDetalleFormEstadoLegal=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoLegal() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoLegal.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoLegal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoLegal() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoLegal.setVisible(true);
	        this.jInternalFrameImportacionEstadoLegal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoLegal() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoLegal.setVisible(true);
	        this.jInternalFrameOrderByEstadoLegal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoLegal() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoLegal.setVisible(false);
	        this.jInternalFrameOrderByEstadoLegal.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoLegal() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoLegal.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoLegal.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoLegal() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoLegal.setVisible(false);
	        this.jInternalFrameImportacionEstadoLegal.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoLegalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoLegal(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoLegal(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoLegal.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoLegal(true);
			//this.isEsNuevoEstadoLegal=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegal =(EstadoLegal) this.estadolegalLogic.getEstadoLegals().toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadolegal =(EstadoLegal) this.estadolegals.toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoLegal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoLegal(false) ;
			
			if(estadolegalSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclienteSessionBean.getEsGuardarRelacionado() && SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSubClienteActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() && ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroCarteraDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoLegalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoLegal(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoLegal(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoLegalActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoLegal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegal =(EstadoLegal) this.estadolegalLogic.getEstadoLegals().toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadolegal =(EstadoLegal) this.estadolegals.toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoLegal(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoLegal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoLegal.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoLegal(true);
			//this.isEsNuevoEstadoLegal=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegal =(EstadoLegal) this.estadolegalLogic.getEstadoLegals().toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadolegal =(EstadoLegal) this.estadolegals.toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadolegal.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoLegal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoLegal(false) ;
			
			if(EstadoLegalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoLegal(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoLegal(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoLegalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoLegal(false);
			
			//if(!this.isEsNuevoEstadoLegal) {								
				int intSelectedRow = this.jTableDatosEstadoLegal.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegal =(EstadoLegal) this.estadolegalLogic.getEstadoLegals().toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadolegal =(EstadoLegal) this.estadolegals.toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoLegalJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoLegal(this.estadolegal,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoLegal(this.estadolegal);
				
			}
			
			if(this.permiteMantenimiento(this.estadolegal)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadolegalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoLegal=true;
					this.inicializarActualizarBindingTablaEstadoLegal(false);
					this.isEsNuevoEstadoLegal=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoLegal=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoLegal=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoLegal(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoLegal(false);
				
				this.habilitarDeshabilitarControlesEstadoLegal(false);
			
												
				
				if(EstadoLegalJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoLegal();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoLegalActionPerformed(evt,estadolegalSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoLegal(this.estadolegal,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoLegal.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadolegalSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadolegal.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoLegal.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoLegal.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoLegalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoLegal.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegal =(EstadoLegal) this.estadolegalLogic.getEstadoLegals().toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
				this.estadolegal.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadolegal =(EstadoLegal) this.estadolegals.toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
				this.estadolegal.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadolegal)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadolegalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoLegalModel) this.jTableDatosEstadoLegal.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoLegal=true;
				this.inicializarActualizarBindingTablaEstadoLegal(false);
				this.isEsNuevoEstadoLegal=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoLegal(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoLegal(false);
				
				this.habilitarDeshabilitarControlesEstadoLegal(false);
				
				
				
				if(EstadoLegalJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoLegal();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoLegalActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoLegal.getRowCount()>=1) {
				jTableDatosEstadoLegal.removeRowSelectionInterval(0, jTableDatosEstadoLegal.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoLegal(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoLegal(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoLegal(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoLegal(false) ;
			
			this.isEsNuevoEstadoLegal=false;
			
			if(EstadoLegalJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoLegal();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoLegalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoLegal(false);
				
				//SI ES MANUAL
				if(EstadoLegalJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoLegal();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoLegalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoLegal--;			
			//EstadoLegal estadolegalAux= new EstadoLegal();			
			//estadolegalAux.setId(this.iIdNuevoEstadoLegal);
			
			if(this.jInternalFrameDetalleFormEstadoLegal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoLegal();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoLegal(this.estadolegal);
			
			this.estadolegal.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadolegalLogic.getEstadoLegals().add(this.estadolegalAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadolegals.add(this.estadolegalAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoLegal(false);
			
			this.jTableDatosEstadoLegal.setRowSelectionInterval(this.getIndiceNuevoEstadoLegal(), this.getIndiceNuevoEstadoLegal());
			
			int iLastRow =  this.jTableDatosEstadoLegal.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoLegal.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoLegal.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoLegal(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoLegalActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoLegal(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoLegal(false);
			
			//SI ES MANUAL
			if(EstadoLegalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoLegal();
			}
			
			//this.abrirFrameTreeEstadoLegal();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoLegalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado LegalES ?", "MANTENIMIENTO DE Estado Legal", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoLegal.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoLegal();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadolegalReturnGeneral=estadolegalLogic.procesarImportacionEstadoLegalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadolegalParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoLegalReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoLegalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoLegal.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoLegal.setFileImportacion(this.jInternalFrameImportacionEstadoLegal.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoLegal.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoLegal.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoLegal.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoLegal.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoLegalActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoLegal> estadolegalsSeleccionados=new ArrayList<EstadoLegal>();		

		estadolegalsSeleccionados=this.getEstadoLegalsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoLegal.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoLegal.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoLegalBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoLegalBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoLegals("Todos",estadolegalsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadolegalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Legal",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoLegal.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoLegal.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoLegalConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoLegalConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoLegal.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoLegal.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoLegal.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoLegalConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoLegalConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoLegal.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoLegalConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoLegalConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoLegal.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoLegal.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoLegalConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoLegalConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoLegalActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoLegal> estadolegalsSeleccionados=new ArrayList<EstadoLegal>();		
		
		estadolegalsSeleccionados=this.getEstadoLegalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadolegal";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoLegals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoLegal.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoLegal.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoLegalConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoLegalConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoLegal estadolegal:estadolegalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadolegal.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoLegalConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoLegalConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoLegal estadolegal:estadolegalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadolegal.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoLegal(row);				
			//	iRow++;
			//}				
			
			//for(EstadoLegal estadolegalAux:estadolegalsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoLegal(estadolegalAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadolegalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Legal",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadolegalLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoLegal(false);
			
			//SI ES MANUAL
			if(EstadoLegalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoLegal();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoLegalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoLegal(false);
			
			//SI ES MANUAL
			if(EstadoLegalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoLegal();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoLegalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoLegal(false);
			
			//SI ES MANUAL
			if(EstadoLegalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoLegal();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadolegalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoLegal() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoLegal.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoLegal.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoLegal.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoLegal.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoLegal.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoLegal.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoLegal.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoLegal(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoLegal(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoLegal(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoLegal(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoLegal(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadolegalSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoLegal(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoLegal(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoLegal(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoLegalJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoLegalJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoLegal() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoLegal();
		
		this.inicializarActualizarBindingBotonesManualEstadoLegal(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadolegalSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoLegal();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoLegal() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoLegal(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoLegal(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoLegal.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoLegal.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoLegal.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoLegal!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoLegal.jCheckBoxPostAccionNuevoEstadoLegal.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoLegal.jCheckBoxPostAccionSinCerrarEstadoLegal.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoLegal.jCheckBoxPostAccionSinMensajeEstadoLegal.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoLegal.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoLegal.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoLegal.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoLegal!=null) {
				this.jInternalFrameDetalleFormEstadoLegal.jCheckBoxPostAccionNuevoEstadoLegal.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoLegal.jCheckBoxPostAccionSinCerrarEstadoLegal.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoLegal.jCheckBoxPostAccionSinMensajeEstadoLegal.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoLegal.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoLegal.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoLegal!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoLegal.jComboBoxTiposAccionesFormularioEstadoLegal.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoLegal.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoLegal!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoLegal.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoLegal.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoLegal.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoLegal.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoLegal.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoLegal!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoLegal.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoLegal.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoLegal.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoLegal(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoLegalJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoLegal(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoLegal() throws Exception {
		try	{
			if(EstadoLegalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoLegal();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoLegal() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoLegal.jComboBoxTiposAccionesFormularioEstadoLegal.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoLegal.jComboBoxTiposAccionesFormularioEstadoLegal.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoLegal() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoLegal.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoLegal.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoLegal.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoLegal.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoLegal.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoLegal.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoLegal.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoLegal.addItem(reporte);
			}
			
			
			if(!this.estadolegalSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoLegal.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoLegal.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoLegal.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoLegal.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoLegal.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoLegal.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoLegal!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoLegal.jComboBoxTiposAccionesFormularioEstadoLegal.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoLegal.jComboBoxTiposAccionesFormularioEstadoLegal.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoLegal.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoLegal.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoLegal.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoLegal();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoLegal() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoLegal!=null) {
				this.jInternalFrameReporteDinamicoEstadoLegal.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoLegal.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoLegal!=null) {
				this.jInternalFrameReporteDinamicoEstadoLegal.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoLegal.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoLegal!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoLegal.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoLegal.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoLegal.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoLegal.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoLegal.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoLegal.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoLegal()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoLegal(Boolean esInicializar) throws Exception {				
		if(EstadoLegalJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoLegal();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoLegal() throws Exception {
		this.inicializarActualizarBindingTablaEstadoLegal(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoLegal() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoLegal.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoLegal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoLegal.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoLegalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoLegal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoLegal.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoLegalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoLegalOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoLegalOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoLegalPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoLegal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoLegal.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoLegalPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoLegal.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoLegal(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadolegalLogic.getEstadoLegals().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadolegals.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoLegalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoLegal.setModel(new EstadoLegalModel(this.estadolegalLogic.getEstadoLegals(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoLegal.setModel(new EstadoLegalModel(this.estadolegals,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoLegal!=null && this.jInternalFrameOrderByEstadoLegal.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoLegal();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoLegal,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoLegalPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO,estadolegalConstantesFunciones.resaltarSeleccionarEstadoLegal,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO,estadolegalConstantesFunciones.resaltarSeleccionarEstadoLegal,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoLegal,EstadoLegalConstantesFunciones.LABEL_ID));

		if(this.estadolegalConstantesFunciones.mostraridEstadoLegal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoLegalConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadolegalConstantesFunciones.resaltaridEstadoLegal,this.estadolegalConstantesFunciones.activaridEstadoLegal,this,true,"idEstadoLegal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadolegalConstantesFunciones.resaltaridEstadoLegal,this.estadolegalConstantesFunciones.activaridEstadoLegal,this,true,"idEstadoLegal","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoLegal,EstadoLegalConstantesFunciones.LABEL_CODIGO));

		if(this.estadolegalConstantesFunciones.mostrarcodigoEstadoLegal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoLegalConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadolegalConstantesFunciones.resaltarcodigoEstadoLegal,this.estadolegalConstantesFunciones.activarcodigoEstadoLegal,this,true,"codigoEstadoLegal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadolegalConstantesFunciones.resaltarcodigoEstadoLegal,this.estadolegalConstantesFunciones.activarcodigoEstadoLegal,this,true,"codigoEstadoLegal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoLegalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoLegal,EstadoLegalConstantesFunciones.LABEL_NOMBRE));

		if(this.estadolegalConstantesFunciones.mostrarnombreEstadoLegal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoLegalConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadolegalConstantesFunciones.resaltarnombreEstadoLegal,this.estadolegalConstantesFunciones.activarnombreEstadoLegal,this,true,"nombreEstadoLegal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadolegalConstantesFunciones.resaltarnombreEstadoLegal,this.estadolegalConstantesFunciones.activarnombreEstadoLegal,this,true,"nombreEstadoLegal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoLegalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadolegalSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCliente && this.estadolegalConstantesFunciones.mostrarClienteEstadoLegal && !EstadoLegalConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Clientes");
				tableColumn.setHeaderValue("Clientes");
				tableColumn.setCellRenderer(new ClienteTableCell(estadolegalConstantesFunciones.resaltarClienteEstadoLegal,this,this.estadolegalConstantesFunciones.activarClienteEstadoLegal));
				tableColumn.setCellEditor(new ClienteTableCell(estadolegalConstantesFunciones.resaltarClienteEstadoLegal,this,this.estadolegalConstantesFunciones.activarClienteEstadoLegal));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoLegal.addColumn(tableColumn);
			}

			if(this.isTienePermisosSubCliente && this.estadolegalConstantesFunciones.mostrarSubClienteEstadoLegal && !EstadoLegalConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Sub Clientes");
				tableColumn.setHeaderValue("Sub Clientes");
				tableColumn.setCellRenderer(new SubClienteTableCell(estadolegalConstantesFunciones.resaltarSubClienteEstadoLegal,this,this.estadolegalConstantesFunciones.activarSubClienteEstadoLegal));
				tableColumn.setCellEditor(new SubClienteTableCell(estadolegalConstantesFunciones.resaltarSubClienteEstadoLegal,this,this.estadolegalConstantesFunciones.activarSubClienteEstadoLegal));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoLegal.addColumn(tableColumn);
			}

			if(this.isTienePermisosParametroCarteraDefecto && this.estadolegalConstantesFunciones.mostrarParametroCarteraDefectoEstadoLegal && !EstadoLegalConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Cartera Defectos");
				tableColumn.setHeaderValue("Parametro Cartera Defectos");
				tableColumn.setCellRenderer(new ParametroCarteraDefectoTableCell(estadolegalConstantesFunciones.resaltarParametroCarteraDefectoEstadoLegal,this,this.estadolegalConstantesFunciones.activarParametroCarteraDefectoEstadoLegal));
				tableColumn.setCellEditor(new ParametroCarteraDefectoTableCell(estadolegalConstantesFunciones.resaltarParametroCarteraDefectoEstadoLegal,this,this.estadolegalConstantesFunciones.activarParametroCarteraDefectoEstadoLegal));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoLegal.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadolegalSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadolegalSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoLegal.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadolegalSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadolegalSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoLegal.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoLegal && this.isPermisoGuardarCambiosEstadoLegal) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadolegalSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadolegalSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoLegal.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadolegalSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoLegal.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoLegal.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoLegal && this.isPermisoGuardarCambiosEstadoLegal) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadolegalSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoLegal && this.isPermisoGuardarCambiosEstadoLegal) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoLegal.moveColumn(this.jTableDatosEstadoLegal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoLegal.moveColumn(this.jTableDatosEstadoLegal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadolegalSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoLegal.moveColumn(this.jTableDatosEstadoLegal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoLegal.moveColumn(this.jTableDatosEstadoLegal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoLegal.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoLegal.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoLegal,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoLegalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoLegal.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoLegal.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoLegalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoLegalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoLegal.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoLegal.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoLegal.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadolegalLogic.getEstadoLegals().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadolegals.size()-1;
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
		//this.jTableDatosEstadoLegal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoLegal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoLegal();
			
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
				
				//this.isEsNuevoEstadoLegal=false;
					
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
			
				if(this.estadolegalSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoLegal==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoLegal.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoLegal.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegal =(EstadoLegal) this.estadolegalLogic.getEstadoLegals().toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadolegal =(EstadoLegal) this.estadolegals.toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadolegal.getsType().equals("DUPLICADO")
				   || this.estadolegal.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoLegal=true;
				
				} else {
					this.isEsNuevoEstadoLegal=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadolegalSessionBean.getEsGuardarRelacionado()) {
					if(this.estadolegal.getId()>=0 && !this.estadolegal.getIsNew()) {						
						this.isEsNuevoEstadoLegal=false;
						
					} else {
						this.isEsNuevoEstadoLegal=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoLegal(esRelaciones);						
				
				this.seleccionarEstadoLegal(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadolegal.getId()<0) {
					this.isEsNuevoEstadoLegal=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoLegal(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoLegal(evt,rowIndex);
				}	
				
				if(this.estadolegalSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoLegal: " + this.dDif); 
					}
				}								
				
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoLegal(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadolegal)) {
					if(this.estadolegal.getId()>0) {
						this.estadolegal.setIsDeleted(true);
						
						this.estadolegalsEliminados.add(this.estadolegal);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadolegalLogic.getEstadoLegals().remove(this.estadolegal);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadolegals.remove(this.estadolegal);				
					}
					
					
					((EstadoLegalModel) this.jTableDatosEstadoLegal.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoLegal(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoLegal(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoLegal) {
			
			if(this.jInternalFrameDetalleFormEstadoLegal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoLegal.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoLegal.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegal =(EstadoLegal) this.estadolegalLogic.getEstadoLegals().toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadolegal =(EstadoLegal) this.estadolegals.toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoLegalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoLegal(this.estadolegal);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoLegal("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoLegal(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoLegal() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoLegal(EstadoLegal estadolegal) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoLegal(estadolegal,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoLegal(EstadoLegal estadolegal,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoLegal(estadolegal);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoLegal(estadolegal,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoLegal(estadolegal);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoLegal(EstadoLegal estadolegal) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoLegal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoLegal.jTextFieldidEstadoLegal.setText(estadolegal.getId().toString());
			this.jInternalFrameDetalleFormEstadoLegal.jTextFieldcodigoEstadoLegal.setText(estadolegal.getcodigo());
			this.jInternalFrameDetalleFormEstadoLegal.jTextAreanombreEstadoLegal.setText(estadolegal.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoLegal estadolegalLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadolegalLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoLegal estadolegalLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadolegalLocal=this.estadolegal;
			} else {
				estadolegalLocal=this.estadolegalAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadolegalLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoLegal(estadolegalLocal,true);
					
					if(estadolegalSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadolegalLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadolegalSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadolegalLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoLegal(EstadoLegal estadolegal,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoLegal(estadolegal,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoLegal(estadolegal);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoLegal(EstadoLegal estadolegal,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoLegal(estadolegal,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoLegal(EstadoLegal estadolegal,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoLegal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoLegal.jTextFieldidEstadoLegal.getText()==null || this.jInternalFrameDetalleFormEstadoLegal.jTextFieldidEstadoLegal.getText()=="" || this.jInternalFrameDetalleFormEstadoLegal.jTextFieldidEstadoLegal.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoLegal.jTextFieldidEstadoLegal.setText("0");
			}

			if(conColumnasBase) {estadolegal.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoLegal.jTextFieldidEstadoLegal.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoLegalConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoLegal.jLabelIdEstadoLegal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadolegal.setcodigo(this.jInternalFrameDetalleFormEstadoLegal.jTextFieldcodigoEstadoLegal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoLegalConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoLegal.jLabelcodigoEstadoLegal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadolegal.setnombre(this.jInternalFrameDetalleFormEstadoLegal.jTextAreanombreEstadoLegal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoLegalConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoLegal.jLabelnombreEstadoLegal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoLegal(EstadoLegal estadolegalBean,EstadoLegal estadolegal,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoLegal(EstadoLegal estadolegalOrigen,EstadoLegal estadolegal,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadolegalOrigen.getId()!=null && !estadolegalOrigen.getId().equals(0L))) {estadolegal.setId(estadolegalOrigen.getId());}}
			if(conDefault || (!conDefault && estadolegalOrigen.getcodigo()!=null && !estadolegalOrigen.getcodigo().equals(""))) {estadolegal.setcodigo(estadolegalOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadolegalOrigen.getnombre()!=null && !estadolegalOrigen.getnombre().equals(""))) {estadolegal.setnombre(estadolegalOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoLegal(EstadoLegal estadolegal) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoLegal.jTextFieldidEstadoLegal.setText(estadolegal.getId().toString());
			this.jInternalFrameDetalleFormEstadoLegal.jTextFieldcodigoEstadoLegal.setText(estadolegal.getcodigo());
			this.jInternalFrameDetalleFormEstadoLegal.jTextAreanombreEstadoLegal.setText(estadolegal.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoLegal(EstadoLegalBean estadolegalBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoLegal.jTextFieldidEstadoLegal.setText(estadolegalBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoLegal.jTextFieldcodigoEstadoLegal.setText(estadolegalBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoLegal.jTextAreanombreEstadoLegal.setText(estadolegalBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoLegal(EstadoLegalParameterReturnGeneral estadolegalReturnGeneral,EstadoLegalBean estadolegalBean,Boolean conDefault) throws Exception { 
		try {
			EstadoLegal estadolegalLocal=new EstadoLegal();
			
			estadolegalLocal=estadolegalReturnGeneral.getEstadoLegal();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadolegalLocal.getId()!=null && !estadolegalLocal.getId().equals(0L))) {estadolegalBean.setId(estadolegalLocal.getId());}}
			if(conDefault || (!conDefault && estadolegalLocal.getcodigo()!=null && !estadolegalLocal.getcodigo().equals(""))) {estadolegalBean.setcodigo(estadolegalLocal.getcodigo());}
			if(conDefault || (!conDefault && estadolegalLocal.getnombre()!=null && !estadolegalLocal.getnombre().equals(""))) {estadolegalBean.setnombre(estadolegalLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoLegalGenerico(Long idEstadoLegalSeleccionado,JComboBox jComboBoxEstadoLegal,List<EstadoLegal> estadolegalsLocal)throws Exception {
		try {
			EstadoLegal  estadolegalTemp=null;

			for(EstadoLegal estadolegalAux:estadolegalsLocal) {
				if(estadolegalAux.getId()!=null && estadolegalAux.getId().equals(idEstadoLegalSeleccionado)) {
					estadolegalTemp=estadolegalAux;
					break;
				}
			}

			jComboBoxEstadoLegal.setSelectedItem(estadolegalTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoLegalGenerico(JComboBox jComboBoxEstadoLegal,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoLegal.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoLegal.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoLegal.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoLegal.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Cliente")) {
			jButtonClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("SubCliente")) {
			jButtonSubClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ParametroCarteraDefecto")) {
			jButtonParametroCarteraDefectoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadolegal=(EstadoLegal) estadolegalLogic.getEstadoLegals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadolegal =(EstadoLegal) estadolegals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoLegal estadolegalRow=new EstadoLegal();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadolegalRow=(EstadoLegal) estadolegalLogic.getEstadoLegals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadolegalRow=(EstadoLegal) estadolegals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoLegal estadolegal) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoLegal==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadolegal = (EstadoLegal)this.estadolegalLogic.getEstadoLegals().toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadolegal = (EstadoLegal)this.estadolegals.toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadolegal!=null) {
						this.estadolegal = estadolegal;
					} else {
						this.estadolegal = new EstadoLegal();
					}
				}

				if(this.isTienePermisosCliente && this.permiteMantenimiento(this.estadolegal)) {
					ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFramePopup;
					} else {
						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame;
					}

					List<EstadoLegal> estadolegals=new ArrayList<EstadoLegal>();
					estadolegals.add(this.estadolegal);
					if(!esRelacionado) {
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setConGuardarRelaciones(false);
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoLegal.cargarClienteBeanSwingJInternalFrame(estadolegals,this.estadolegal,clienteBeanSwingJInternalFrame,/*conInicializar,*/clienteBeanSwingJInternalFrame.clienteSessionBean.getConGuardarRelaciones(),clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado());
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");

						clienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ClienteConstantesFunciones.ITAMANIOFILATABLA + (ClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						clienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoLegal=(TitledBorder)this.jScrollPanelDatosEstadoLegal.getBorder();
						TitledBorder titledBorderCliente=(TitledBorder)clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

						titledBorderCliente.setTitle(titledBorderEstadoLegal.getTitle() + " -> Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,clienteBeanSwingJInternalFrame);
						}

						clienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(clienteBeanSwingJInternalFrame);

						clienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadolegalSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonSubClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoLegal estadolegal) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoLegal==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadolegal = (EstadoLegal)this.estadolegalLogic.getEstadoLegals().toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadolegal = (EstadoLegal)this.estadolegals.toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadolegal!=null) {
						this.estadolegal = estadolegal;
					} else {
						this.estadolegal = new EstadoLegal();
					}
				}

				if(this.isTienePermisosSubCliente && this.permiteMantenimiento(this.estadolegal)) {
					SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFramePopup=new SubClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						subclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFramePopup;
					} else {
						subclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame;
					}

					List<EstadoLegal> estadolegals=new ArrayList<EstadoLegal>();
					estadolegals.add(this.estadolegal);
					if(!esRelacionado) {
						//subclienteBeanSwingJInternalFrame.subclienteSessionBean.setConGuardarRelaciones(false);
						//subclienteBeanSwingJInternalFrame.subclienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					subclienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoLegal.cargarSubClienteBeanSwingJInternalFrame(estadolegals,this.estadolegal,subclienteBeanSwingJInternalFrame,/*conInicializar,*/subclienteBeanSwingJInternalFrame.subclienteSessionBean.getConGuardarRelaciones(),subclienteBeanSwingJInternalFrame.subclienteSessionBean.getEsGuardarRelacionado());
					subclienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						subclienteBeanSwingJInternalFrame.actualizarEstadoPanelsSubCliente("no_relacionado");

						subclienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(SubClienteConstantesFunciones.ITAMANIOFILATABLA + (SubClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						subclienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoLegal=(TitledBorder)this.jScrollPanelDatosEstadoLegal.getBorder();
						TitledBorder titledBorderSubCliente=(TitledBorder)subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.getBorder();

						titledBorderSubCliente.setTitle(titledBorderEstadoLegal.getTitle() + " -> Sub Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,subclienteBeanSwingJInternalFrame);
						}

						subclienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(subclienteBeanSwingJInternalFrame);

						subclienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadolegalSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Sub Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonParametroCarteraDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoLegal estadolegal) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoLegal==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadolegal = (EstadoLegal)this.estadolegalLogic.getEstadoLegals().toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadolegal = (EstadoLegal)this.estadolegals.toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadolegal!=null) {
						this.estadolegal = estadolegal;
					} else {
						this.estadolegal = new EstadoLegal();
					}
				}

				if(this.isTienePermisosParametroCarteraDefecto && this.permiteMantenimiento(this.estadolegal)) {
					ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFramePopup=new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametrocarteradefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFramePopup;
					} else {
						parametrocarteradefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame;
					}

					List<EstadoLegal> estadolegals=new ArrayList<EstadoLegal>();
					estadolegals.add(this.estadolegal);
					if(!esRelacionado) {
						//parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setConGuardarRelaciones(false);
						//parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametrocarteradefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoLegal.cargarParametroCarteraDefectoBeanSwingJInternalFrame(estadolegals,this.estadolegal,parametrocarteradefectoBeanSwingJInternalFrame,/*conInicializar,*/parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getConGuardarRelaciones(),parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getEsGuardarRelacionado());
					parametrocarteradefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("no_relacionado");

						parametrocarteradefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroCarteraDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroCarteraDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametrocarteradefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoLegal=(TitledBorder)this.jScrollPanelDatosEstadoLegal.getBorder();
						TitledBorder titledBorderParametroCarteraDefecto=(TitledBorder)parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.getBorder();

						titledBorderParametroCarteraDefecto.setTitle(titledBorderEstadoLegal.getTitle() + " -> Parametro Cartera Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametrocarteradefectoBeanSwingJInternalFrame);
						}

						parametrocarteradefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametrocarteradefectoBeanSwingJInternalFrame);

						parametrocarteradefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadolegalSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Cartera Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoLegal(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoLegal.setVisible((this.isVisibilidadCeldaNuevoEstadoLegal && this.isPermisoNuevoEstadoLegal));			
			this.jButtonDuplicarEstadoLegal.setVisible((this.isVisibilidadCeldaDuplicarEstadoLegal && this.isPermisoDuplicarEstadoLegal));			
			this.jButtonCopiarEstadoLegal.setVisible((this.isVisibilidadCeldaCopiarEstadoLegal && this.isPermisoCopiarEstadoLegal));
			this.jButtonVerFormEstadoLegal.setVisible((this.isVisibilidadCeldaVerFormEstadoLegal && this.isPermisoVerFormEstadoLegal));
			
			this.jButtonAbrirOrderByEstadoLegal.setVisible((this.isVisibilidadCeldaOrdenEstadoLegal && this.isPermisoOrdenEstadoLegal));			
			
			this.jButtonNuevoRelacionesEstadoLegal.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoLegal && this.isPermisoNuevoEstadoLegal));			
			this.jButtonNuevoGuardarCambiosEstadoLegal.setVisible((this.isVisibilidadCeldaNuevoEstadoLegal && this.isPermisoNuevoEstadoLegal && this.isPermisoGuardarCambiosEstadoLegal));
			
			if(this.jInternalFrameDetalleFormEstadoLegal!=null) {
			this.jInternalFrameDetalleFormEstadoLegal.jButtonModificarEstadoLegal.setVisible((this.isVisibilidadCeldaModificarEstadoLegal && this.isPermisoActualizarEstadoLegal));	
			this.jInternalFrameDetalleFormEstadoLegal.jButtonActualizarEstadoLegal.setVisible((this.isVisibilidadCeldaActualizarEstadoLegal && this.isPermisoActualizarEstadoLegal));	
			this.jInternalFrameDetalleFormEstadoLegal.jButtonEliminarEstadoLegal.setVisible((this.isVisibilidadCeldaEliminarEstadoLegal && this.isPermisoEliminarEstadoLegal));
			this.jInternalFrameDetalleFormEstadoLegal.jButtonCancelarEstadoLegal.setVisible(this.isVisibilidadCeldaCancelarEstadoLegal);							
			this.jInternalFrameDetalleFormEstadoLegal.jButtonGuardarCambiosEstadoLegal.setVisible((this.isVisibilidadCeldaGuardarEstadoLegal && this.isPermisoGuardarCambiosEstadoLegal));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoLegal.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoLegal && this.isPermisoGuardarCambiosEstadoLegal));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoLegal.setVisible((this.isVisibilidadCeldaNuevoEstadoLegal && this.isPermisoNuevoEstadoLegal));						
			this.jButtonDuplicarToolBarEstadoLegal.setVisible((this.isVisibilidadCeldaDuplicarEstadoLegal && this.isPermisoDuplicarEstadoLegal));						
			this.jButtonCopiarToolBarEstadoLegal.setVisible((this.isVisibilidadCeldaCopiarEstadoLegal && this.isPermisoCopiarEstadoLegal));			
			this.jButtonVerFormToolBarEstadoLegal.setVisible((this.isVisibilidadCeldaVerFormEstadoLegal && this.isPermisoVerFormEstadoLegal));			
			this.jButtonAbrirOrderByToolBarEstadoLegal.setVisible((this.isVisibilidadCeldaOrdenEstadoLegal && this.isPermisoOrdenEstadoLegal));
			this.jButtonNuevoRelacionesToolBarEstadoLegal.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoLegal && this.isPermisoNuevoEstadoLegal));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoLegal.setVisible((this.isVisibilidadCeldaNuevoEstadoLegal && this.isPermisoNuevoEstadoLegal && this.isPermisoGuardarCambiosEstadoLegal));			
			
			if(this.jInternalFrameDetalleFormEstadoLegal!=null) {
			this.jInternalFrameDetalleFormEstadoLegal.jButtonModificarToolBarEstadoLegal.setVisible((this.isVisibilidadCeldaModificarEstadoLegal && this.isPermisoActualizarEstadoLegal));	
			this.jInternalFrameDetalleFormEstadoLegal.jButtonActualizarToolBarEstadoLegal.setVisible((this.isVisibilidadCeldaActualizarEstadoLegal  && this.isPermisoActualizarEstadoLegal));	
			this.jInternalFrameDetalleFormEstadoLegal.jButtonEliminarToolBarEstadoLegal.setVisible((this.isVisibilidadCeldaEliminarEstadoLegal && this.isPermisoEliminarEstadoLegal));
			this.jInternalFrameDetalleFormEstadoLegal.jButtonCancelarToolBarEstadoLegal.setVisible(this.isVisibilidadCeldaCancelarEstadoLegal);				
			this.jInternalFrameDetalleFormEstadoLegal.jButtonGuardarCambiosToolBarEstadoLegal.setVisible((this.isVisibilidadCeldaGuardarEstadoLegal && this.isPermisoGuardarCambiosEstadoLegal));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoLegal.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoLegal && this.isPermisoGuardarCambiosEstadoLegal));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoLegal.setVisible((this.isVisibilidadCeldaNuevoEstadoLegal && this.isPermisoNuevoEstadoLegal));			
			this.jMenuItemDuplicarEstadoLegal.setVisible((this.isVisibilidadCeldaDuplicarEstadoLegal && this.isPermisoDuplicarEstadoLegal));			
			this.jMenuItemCopiarEstadoLegal.setVisible((this.isVisibilidadCeldaCopiarEstadoLegal && this.isPermisoCopiarEstadoLegal));			
			this.jMenuItemVerFormEstadoLegal.setVisible((this.isVisibilidadCeldaVerFormEstadoLegal && this.isPermisoVerFormEstadoLegal));			
			this.jMenuItemAbrirOrderByEstadoLegal.setVisible((this.isVisibilidadCeldaOrdenEstadoLegal && this.isPermisoOrdenEstadoLegal));			
			//this.jMenuItemMostrarOcultarEstadoLegal.setVisible((this.isVisibilidadCeldaOrdenEstadoLegal && this.isPermisoOrdenEstadoLegal));
			this.jMenuItemDetalleAbrirOrderByEstadoLegal.setVisible((this.isVisibilidadCeldaOrdenEstadoLegal && this.isPermisoOrdenEstadoLegal));			
			//this.jMenuItemDetalleMostrarOcultarEstadoLegal.setVisible((this.isVisibilidadCeldaOrdenEstadoLegal && this.isPermisoOrdenEstadoLegal));			
			this.jMenuItemNuevoRelacionesEstadoLegal.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoLegal && this.isPermisoNuevoEstadoLegal));			
			this.jMenuItemNuevoGuardarCambiosEstadoLegal.setVisible((this.isVisibilidadCeldaNuevoEstadoLegal && this.isPermisoNuevoEstadoLegal && this.isPermisoGuardarCambiosEstadoLegal));									
			
			if(this.jInternalFrameDetalleFormEstadoLegal!=null) {
			this.jInternalFrameDetalleFormEstadoLegal.jMenuItemModificarEstadoLegal.setVisible((this.isVisibilidadCeldaModificarEstadoLegal && this.isPermisoActualizarEstadoLegal));	
			this.jInternalFrameDetalleFormEstadoLegal.jMenuItemActualizarEstadoLegal.setVisible((this.isVisibilidadCeldaActualizarEstadoLegal && this.isPermisoActualizarEstadoLegal));	
			this.jInternalFrameDetalleFormEstadoLegal.jMenuItemEliminarEstadoLegal.setVisible((this.isVisibilidadCeldaEliminarEstadoLegal && this.isPermisoEliminarEstadoLegal));
			this.jInternalFrameDetalleFormEstadoLegal.jMenuItemCancelarEstadoLegal.setVisible(this.isVisibilidadCeldaCancelarEstadoLegal);				
			}
			
			this.jMenuItemGuardarCambiosEstadoLegal.setVisible((this.isVisibilidadCeldaGuardarEstadoLegal && this.isPermisoGuardarCambiosEstadoLegal));						
			this.jMenuItemGuardarCambiosTablaEstadoLegal.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoLegal && this.isPermisoGuardarCambiosEstadoLegal));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoLegal=this.jButtonNuevoEstadoLegal.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoLegal=this.jButtonDuplicarEstadoLegal.isVisible();
			this.isVisibilidadCeldaCopiarEstadoLegal=this.jButtonCopiarEstadoLegal.isVisible();
			this.isVisibilidadCeldaVerFormEstadoLegal=this.jButtonVerFormEstadoLegal.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoLegal=this.jButtonAbrirOrderByEstadoLegal.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoLegal=this.jButtonNuevoRelacionesEstadoLegal.isVisible();
			this.isVisibilidadCeldaModificarEstadoLegal=this.jButtonModificarEstadoLegal.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoLegal!=null) {
			this.isVisibilidadCeldaActualizarEstadoLegal=this.jInternalFrameDetalleFormEstadoLegal.jButtonActualizarEstadoLegal.isVisible();
			this.isVisibilidadCeldaEliminarEstadoLegal=this.jInternalFrameDetalleFormEstadoLegal.jButtonEliminarEstadoLegal.isVisible();
			this.isVisibilidadCeldaCancelarEstadoLegal=this.jInternalFrameDetalleFormEstadoLegal.jButtonCancelarEstadoLegal.isVisible();
			this.isVisibilidadCeldaGuardarEstadoLegal=this.jInternalFrameDetalleFormEstadoLegal.jButtonGuardarCambiosEstadoLegal.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoLegal=this.jButtonGuardarCambiosTablaEstadoLegal.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoLegal=this.jButtonNuevoToolBarEstadoLegal.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoLegal=this.jButtonNuevoRelacionesToolBarEstadoLegal.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoLegal!=null) {
			this.isVisibilidadCeldaModificarEstadoLegal=this.jInternalFrameDetalleFormEstadoLegal.jButtonModificarToolBarEstadoLegal.isVisible();
			this.isVisibilidadCeldaActualizarEstadoLegal=this.jInternalFrameDetalleFormEstadoLegal.jButtonActualizarToolBarEstadoLegal.isVisible();
			this.isVisibilidadCeldaEliminarEstadoLegal=this.jInternalFrameDetalleFormEstadoLegal.jButtonEliminarToolBarEstadoLegal.isVisible();
			this.isVisibilidadCeldaCancelarEstadoLegal=this.jInternalFrameDetalleFormEstadoLegal.jButtonCancelarToolBarEstadoLegal.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoLegal=this.jButtonGuardarCambiosToolBarEstadoLegal.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoLegal=this.jButtonGuardarCambiosTablaToolBarEstadoLegal.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoLegal=this.jMenuItemNuevoEstadoLegal.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoLegal=this.jMenuItemNuevoRelacionesEstadoLegal.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoLegal!=null) {
			this.isVisibilidadCeldaModificarEstadoLegal=this.jInternalFrameDetalleFormEstadoLegal.jMenuItemModificarEstadoLegal.isVisible();
			this.isVisibilidadCeldaActualizarEstadoLegal=this.jInternalFrameDetalleFormEstadoLegal.jMenuItemActualizarEstadoLegal.isVisible();
			this.isVisibilidadCeldaEliminarEstadoLegal=this.jInternalFrameDetalleFormEstadoLegal.jMenuItemEliminarEstadoLegal.isVisible();
			this.isVisibilidadCeldaCancelarEstadoLegal=this.jInternalFrameDetalleFormEstadoLegal.jMenuItemCancelarEstadoLegal.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoLegal=this.jMenuItemGuardarCambiosEstadoLegal.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoLegal=this.jMenuItemGuardarCambiosTablaEstadoLegal.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoLegal(Boolean esInicializar) {
		if(EstadoLegalJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadolegalSessionBean.getConGuardarRelaciones()) {
				//if(this.estadolegalSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoLegal();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoLegal(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoLegal() {
		this.jButtonNuevoEstadoLegal.setVisible(this.isPermisoNuevoEstadoLegal);			
		this.jButtonDuplicarEstadoLegal.setVisible(this.isPermisoDuplicarEstadoLegal);			
		this.jButtonCopiarEstadoLegal.setVisible(this.isPermisoCopiarEstadoLegal);			
		this.jButtonVerFormEstadoLegal.setVisible(this.isPermisoVerFormEstadoLegal);			
		
		this.jButtonAbrirOrderByEstadoLegal.setVisible(this.isPermisoOrdenEstadoLegal);					
		
		this.jButtonNuevoRelacionesEstadoLegal.setVisible(this.isPermisoNuevoEstadoLegal);			
		
		if(this.jInternalFrameDetalleFormEstadoLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoLegal.jButtonModificarEstadoLegal.setVisible(this.isPermisoActualizarEstadoLegal);	
			this.jInternalFrameDetalleFormEstadoLegal.jButtonActualizarEstadoLegal.setVisible(this.isPermisoActualizarEstadoLegal);	
			this.jInternalFrameDetalleFormEstadoLegal.jButtonEliminarEstadoLegal.setVisible(this.isPermisoEliminarEstadoLegal);
			this.jInternalFrameDetalleFormEstadoLegal.jButtonCancelarEstadoLegal.setVisible(this.isVisibilidadCeldaCancelarEstadoLegal);						
			this.jInternalFrameDetalleFormEstadoLegal.jButtonGuardarCambiosEstadoLegal.setVisible(this.isPermisoGuardarCambiosEstadoLegal);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoLegal.setVisible(this.isPermisoActualizarEstadoLegal);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoLegal() {
		this.jInternalFrameDetalleFormEstadoLegal.jButtonModificarEstadoLegal.setVisible(this.isPermisoActualizarEstadoLegal);	
		this.jInternalFrameDetalleFormEstadoLegal.jButtonActualizarEstadoLegal.setVisible(this.isPermisoActualizarEstadoLegal);	
		this.jInternalFrameDetalleFormEstadoLegal.jButtonEliminarEstadoLegal.setVisible(this.isPermisoEliminarEstadoLegal);
		this.jInternalFrameDetalleFormEstadoLegal.jButtonCancelarEstadoLegal.setVisible(this.isVisibilidadCeldaCancelarEstadoLegal);							
		this.jInternalFrameDetalleFormEstadoLegal.jButtonGuardarCambiosEstadoLegal.setVisible((this.isVisibilidadCeldaGuardarEstadoLegal && this.isPermisoGuardarCambiosEstadoLegal));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoLegal() {
		if(EstadoLegalJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoLegal();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoLegal() {
	}
	
	public void jTableDatosEstadoLegalListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoLegal(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoLegalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoLegal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoLegal(this.getestadolegal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoLegal(this.estadolegal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadolegal =(EstadoLegal) this.estadolegalLogic.getEstadoLegals().toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadolegal =(EstadoLegal) this.estadolegals.toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadolegal==null) {
						this.estadolegal = new EstadoLegal();
					}

					this.setVariablesFormularioToObjetoActualEstadoLegal(this.estadolegal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoLegal(this.estadolegal);
				}

				if(this.estadolegal.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadolegal.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoLegal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoLegalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoLegal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoLegal(this.getestadolegal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoLegal(this.estadolegal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadolegal =(EstadoLegal) this.estadolegalLogic.getEstadoLegals().toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadolegal =(EstadoLegal) this.estadolegals.toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadolegal==null) {
						this.estadolegal = new EstadoLegal();
					}

					this.setVariablesFormularioToObjetoActualEstadoLegal(this.estadolegal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoLegal(this.estadolegal);
				}

				if(this.estadolegal.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadolegal.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoLegal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoLegalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoLegal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoLegal(this.getestadolegal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoLegal(this.estadolegal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadolegal =(EstadoLegal) this.estadolegalLogic.getEstadoLegals().toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadolegal =(EstadoLegal) this.estadolegals.toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadolegal==null) {
						this.estadolegal = new EstadoLegal();
					}

					this.setVariablesFormularioToObjetoActualEstadoLegal(this.estadolegal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoLegal(this.estadolegal);
				}

				if(this.estadolegal.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadolegal.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoLegal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoLegal() {
		if(this.jInternalFrameDetalleFormEstadoLegal!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoLegal!=null) {
			this.jInternalFrameDetalleFormEstadoLegal.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoLegal.dispose();
			this.jInternalFrameDetalleFormEstadoLegal=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoLegal!=null) {
			this.jInternalFrameReporteDinamicoEstadoLegal.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoLegal.dispose();
			this.jInternalFrameReporteDinamicoEstadoLegal=null;
		}
		
		if(this.jInternalFrameImportacionEstadoLegal!=null) {
			this.jInternalFrameImportacionEstadoLegal.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoLegal.dispose();
			this.jInternalFrameImportacionEstadoLegal=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoLegal();
			
			EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoLegal")) {
				jButtonNuevoEstadoLegalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoLegal")) {
				jButtonDuplicarEstadoLegalActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoLegal")) {
				jButtonCopiarEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoLegal")) {
				jButtonVerFormEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoLegal")) {
				jButtonNuevoEstadoLegalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoLegal")) {
				jButtonDuplicarEstadoLegalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoLegal")) {
				jButtonNuevoEstadoLegalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoLegal")) {
				jButtonDuplicarEstadoLegalActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoLegal")) {
				jButtonNuevoEstadoLegalActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoLegal")) {
				jButtonNuevoEstadoLegalActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoLegal")) {
				jButtonNuevoEstadoLegalActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoLegal")) {
				jButtonModificarEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoLegal")) {
				jButtonModificarEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoLegal")) {
				jButtonModificarEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoLegal")) {
				jButtonActualizarEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoLegal")) {
				jButtonActualizarEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoLegal")) {
				jButtonActualizarEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoLegal")) {
				jButtonEliminarEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoLegal")) {
				jButtonEliminarEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoLegal")) {
				jButtonEliminarEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoLegal")) {
				jButtonCancelarEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoLegal")) {
				jButtonCancelarEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoLegal")) {
				jButtonCancelarEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoLegal")) {
				jButtonCerrarEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoLegal")) {
				jButtonCerrarEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoLegal")) {
				jButtonCerrarEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoLegal")) {
				jButtonMostrarOcultarEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoLegal")) {
				jButtonCancelarEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoLegal")) {
				jButtonGuardarCambiosEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoLegal")) {
				jButtonGuardarCambiosEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoLegal")) {
				jButtonCopiarEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoLegal")) {
				jButtonVerFormEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoLegal")) {
				jButtonGuardarCambiosEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoLegal")) {
				jButtonCopiarEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoLegal")) {
				jButtonVerFormEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoLegal")) {
				jButtonGuardarCambiosEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoLegal")) {
				jButtonGuardarCambiosEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoLegal")) {
				jButtonGuardarCambiosEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoLegal")) {
				jButtonRecargarInformacionEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoLegal")) {
				jButtonRecargarInformacionEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoLegal")) {
				jButtonRecargarInformacionEstadoLegalActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoLegal")) {
				jButtonAnterioresEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoLegal")) {
				jButtonAnterioresEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoLegal")) {
				jButtonAnterioresEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoLegal")) {
				jButtonSiguientesEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoLegal")) {
				jButtonSiguientesEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoLegal")) {
				jButtonSiguientesEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoLegal") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoLegal")) {
				jButtonAbrirOrderByEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoLegal") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoLegal")) {
				jButtonMostrarOcultarEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoLegal")) {
				jButtonNuevoGuardarCambiosEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoLegal")) {
				jButtonNuevoGuardarCambiosEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoLegal")) {
				jButtonNuevoGuardarCambiosEstadoLegalActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoLegal")) {
				jButtonCerrarReporteDinamicoEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoLegal")) {
				jButtonGenerarReporteDinamicoEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoLegal")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoLegalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoLegal")) {
				jButtonCerrarImportacionEstadoLegalActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoLegal")) {
				
				jButtonGenerarImportacionEstadoLegalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoLegal")) {
				
				jButtonAbrirImportacionEstadoLegalActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoLegal")) {
				jComboBoxTiposAccionesEstadoLegalActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoLegal")) {
				jComboBoxTiposRelacionesEstadoLegalActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoLegal")) {
				jComboBoxTiposAccionesEstadoLegalActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoLegal")) {
				
				jComboBoxTiposSeleccionarEstadoLegalActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoLegal")) {
				jTextFieldValorCampoGeneralEstadoLegalActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoLegal")) {
				jButtonAbrirOrderByEstadoLegalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoLegal")) {
				jButtonAbrirOrderByEstadoLegalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoLegal")) {
				jButtonCerrarOrderByEstadoLegalActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoLegalBusqueda")) {
				this.jButtonidEstadoLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoLegalBusqueda")) {
				this.jButtoncodigoEstadoLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoLegalBusqueda")) {
				this.jButtonnombreEstadoLegalBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoLegal();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoLegalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadolegal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadolegal);
				
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
				
				


				
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoLegal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoLegal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoLegal estadolegalLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadolegalLocal=this.estadolegal;
			} else {
				estadolegalLocal=this.estadolegalAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadolegal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadolegal);
				
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
							
				
				


				
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoLegal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoLegal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoLegalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoLegal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalAnterior =(EstadoLegal) this.estadolegalLogic.getEstadoLegals().toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadolegalAnterior =(EstadoLegal) this.estadolegals.toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
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
			
			EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
			
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
			
			


			
			EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoLegalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadolegal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadolegal);
				
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
								
						
				


				
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoLegal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoLegal.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadolegal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadolegal);
				
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
								
				
				


				
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoLegal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoLegal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoLegalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoLegal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalAnterior =(EstadoLegal) this.estadolegalLogic.getEstadoLegals().toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadolegalAnterior =(EstadoLegal) this.estadolegals.toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadolegal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadolegal);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoLegalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoLegal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalAnterior =(EstadoLegal) this.estadolegalLogic.getEstadoLegals().toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadolegalAnterior =(EstadoLegal) this.estadolegals.toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoLegalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadolegal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadolegal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadolegal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadolegal);
				
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
							
				
				


				
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoLegal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoLegal.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoLegalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoLegal.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadolegalAnterior =(EstadoLegal) this.estadolegalLogic.getEstadoLegals().toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadolegalAnterior =(EstadoLegal) this.estadolegals.toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
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
			
			EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
			
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
			
			


			
			EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoLegalActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadolegal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadolegal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadolegal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadolegal);
				
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
								
				
				


				
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoLegal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoLegal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoLegalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoLegal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalAnterior =(EstadoLegal) this.estadolegalLogic.getEstadoLegals().toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadolegalAnterior =(EstadoLegal) this.estadolegals.toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoLegalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadolegal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadolegal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoLegalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadolegal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadolegal);
				
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoLegal")) {
					jCheckBoxSeleccionarTodosEstadoLegalItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoLegal")) {
					jCheckBoxSeleccionadosEstadoLegalItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoLegal")) {
					
				}
				
				


				
				
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoLegal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoLegal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadolegal);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadolegal);
				
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
												
				
				


				
				
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoLegal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoLegal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoLegalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoLegal.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadolegalAnterior =(EstadoLegal) this.estadolegalLogic.getEstadoLegals().toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadolegalAnterior =(EstadoLegal) this.estadolegals.toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoLegalActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadolegal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadolegal);
				
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
				
				
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
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
			
			EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
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
			
			


			
			EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoLegalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadolegal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadolegal);
				
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoLegal.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoLegal.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadolegal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadolegal);
				
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
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
				
				


				
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoLegal.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoLegal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoLegalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoLegal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadolegalAnterior =(EstadoLegal) this.estadolegalLogic.getEstadoLegals().toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadolegalAnterior =(EstadoLegal) this.estadolegals.toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoLegal")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoLegalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoLegal.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadolegal =(EstadoLegal) this.estadolegalLogic.getEstadoLegals().toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadolegal =(EstadoLegal) this.estadolegals.toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadolegal);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoLegal")) {
				
				}
				
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoLegal")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoLegal.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoLegal")) {
			
			}
			
			EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoLegal();
			
			EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoLegal")) {
				jButtonNuevoEstadoLegalActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoLegal")) {
				jButtonDuplicarEstadoLegalActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoLegal")) {
				jButtonCopiarEstadoLegalActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoLegal")) {
				jButtonVerFormEstadoLegalActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoLegal")) {
				jButtonNuevoEstadoLegalActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoLegal")) {
				jButtonModificarEstadoLegalActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoLegal")) {
				jButtonActualizarEstadoLegalActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoLegal")) {
				jButtonEliminarEstadoLegalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoLegal")) {
				jButtonGuardarCambiosEstadoLegalActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoLegal")) {
				jButtonCancelarEstadoLegalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoLegal")) {
				jButtonCerrarEstadoLegalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoLegal")) {
				jButtonGuardarCambiosEstadoLegalActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoLegal")) {
				jButtonNuevoGuardarCambiosEstadoLegalActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoLegal")) {
				jButtonAbrirOrderByEstadoLegalActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoLegal")) {
				jButtonRecargarInformacionEstadoLegalActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoLegal")) {
				jButtonAnterioresEstadoLegalActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoLegal")) {
				jButtonSiguientesEstadoLegalActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoLegalBusqueda")) {
				this.jButtonidEstadoLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoLegalBusqueda")) {
				this.jButtoncodigoEstadoLegalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoLegalBusqueda")) {
				this.jButtonnombreEstadoLegalBusquedaActionPerformed(evt);
			}
			
			EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoLegal();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoLegal")) {
				closingInternalFrameEstadoLegal();
				
			} else if(sTipo.equals("jButtonCancelarEstadoLegal")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoLegal = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoLegalBeanSwingJInternalFrame jInternalFrameParent=(EstadoLegalBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoLegal.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoLegalActionPerformed(null);
			}
			
			EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadolegal,new Object(),this.estadolegalParameterGeneral,this.estadolegalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoLegal(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoLegal(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoLegal(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadolegal)) {
			if(!esControlTabla) {
				if(EstadoLegalJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoLegal(this.estadolegal,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoLegal(this.estadolegal);			
				}
				
				if(this.estadolegalSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoLegal(this.estadolegal,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadolegalReturnGeneral=estadolegalLogic.procesarEventosEstadoLegalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadolegalLogic.getEstadoLegals(),this.estadolegal,this.estadolegalParameterGeneral,this.isEsNuevoEstadoLegal,classes);//this.estadolegalLogic.getEstadoLegal()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoLegal(this.estadolegalReturnGeneral,this.estadolegalBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadolegalSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoLegal(classes,this.estadolegalReturnGeneral,this.estadolegalBean,false);
					}
						
					if(this.estadolegalReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoLegal(this.estadolegalReturnGeneral.getEstadoLegal());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoLegal(this.estadolegalReturnGeneral.getEstadoLegal());	
					}
						
					if(this.estadolegalReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoLegal(this.estadolegalReturnGeneral.getEstadoLegal(),classes);//this.estadolegalBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoLegal(this.estadolegal,classes);//this.estadolegalBean);									
				}
			
				if(EstadoLegalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoLegal(this.estadolegal,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoLegal(this.estadolegal);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadolegalAnterior!=null) {
						this.estadolegal=this.estadolegalAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadolegalReturnGeneral=estadolegalLogic.procesarEventosEstadoLegalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadolegalLogic.getEstadoLegals(),this.estadolegal,this.estadolegalParameterGeneral,this.isEsNuevoEstadoLegal,classes);//this.estadolegalLogic.getEstadoLegal()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadolegalSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadolegalSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadolegalReturnGeneral.getEstadoLegal(),estadolegalLogic.getEstadoLegals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadolegalReturnGeneral.getEstadoLegal(),this.estadolegals);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoLegal.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoLegal.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoLegal();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoLegal() throws Exception {
		
		EstadoLegalModel estadolegalModel=(EstadoLegalModel)this.jTableDatosEstadoLegal.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadolegalModel.estadolegals=this.estadolegalLogic.getEstadoLegals();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadolegalModel.estadolegals=this.estadolegals;
		}
		
		
		((EstadoLegalModel) this.jTableDatosEstadoLegal.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoLegal() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadolegalAnterior(),this.estadolegalLogic.getEstadoLegals());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadolegalAnterior(),this.estadolegals);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoLegal();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoLegal(EstadoLegal estadolegal,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(estadolegal.getClientes());
					this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SubCliente.class)) {
					this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclienteLogic.setSubClientes(estadolegal.getSubClientes());
					this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCarteraDefecto.class)) {
					this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(estadolegal.getParametroCarteraDefectos());
					this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
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
										
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadolegal,new Object(),generalEntityParameterGeneral,this.estadolegalReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadolegalSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoLegalConstantesFunciones.getClassesRelationshipsOfEstadoLegal(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoLegalConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoLegal(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoLegal(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoLegalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadolegal,new Object(),generalEntityParameterGeneral,this.estadolegalReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoLegal(EstadoLegalBean estadolegalBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(estadolegal.getClientes());
					this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SubCliente.class)) {
					this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclienteLogic.setSubClientes(estadolegal.getSubClientes());
					this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCarteraDefecto.class)) {
					this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(estadolegal.getParametroCarteraDefectos());
					this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoLegal(ArrayList<Classe> classes,EstadoLegalReturnGeneral estadolegalReturnGeneral,EstadoLegalBean estadolegalBean,Boolean conDefault) throws Exception {
		
			this.estadolegalBean.setClientes(estadolegalReturnGeneral.getEstadoLegal().getClientes());
			this.estadolegalBean.setSubClientes(estadolegalReturnGeneral.getEstadoLegal().getSubClientes());
			this.estadolegalBean.setParametroCarteraDefectos(estadolegalReturnGeneral.getEstadoLegal().getParametroCarteraDefectos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoLegal(EstadoLegal estadolegal,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					estadolegal.setClientes(this.jInternalFrameDetalleFormEstadoLegal.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SubCliente.class)) {
					estadolegal.setSubClientes(this.jInternalFrameDetalleFormEstadoLegal.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCarteraDefecto.class)) {
					estadolegal.setParametroCarteraDefectos(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadolegal)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoLegal = new EstadoLegalDetalleFormJInternalFrame(jDesktopPane,this.estadolegalSessionBean.getConGuardarRelaciones(),this.estadolegalSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoLegal);
		this.jInternalFrameDetalleFormEstadoLegal.setVisible(false);
		this.jInternalFrameDetalleFormEstadoLegal.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoLegal.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoLegal.estadolegalLogic=this.estadolegalLogic;
		
		this.cargarCombosFrameForeignKeyEstadoLegal("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoLegal();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoLegal();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoLegal("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoLegal();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoLegal.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoLegal"));
		
		this.jInternalFrameDetalleFormEstadoLegal.jButtonModificarEstadoLegal.addActionListener(new ButtonActionListener(this,"ModificarEstadoLegal"));

		
		this.jInternalFrameDetalleFormEstadoLegal.jButtonModificarToolBarEstadoLegal.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoLegal"));
					
		this.jInternalFrameDetalleFormEstadoLegal.jMenuItemModificarEstadoLegal.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoLegal"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoLegal.jButtonActualizarEstadoLegal.addActionListener (new ButtonActionListener(this,"ActualizarEstadoLegal"));
		
		
		this.jInternalFrameDetalleFormEstadoLegal.jButtonActualizarToolBarEstadoLegal.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoLegal"));
						
		this.jInternalFrameDetalleFormEstadoLegal.jMenuItemActualizarEstadoLegal.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoLegal"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoLegal.jButtonEliminarEstadoLegal.addActionListener (new ButtonActionListener(this,"EliminarEstadoLegal"));
		
		
		this.jInternalFrameDetalleFormEstadoLegal.jButtonEliminarToolBarEstadoLegal.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoLegal"));
								
		this.jInternalFrameDetalleFormEstadoLegal.jMenuItemEliminarEstadoLegal.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoLegal"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoLegal.jButtonCancelarEstadoLegal.addActionListener (new ButtonActionListener(this,"CancelarEstadoLegal"));
		
		
		this.jInternalFrameDetalleFormEstadoLegal.jButtonCancelarToolBarEstadoLegal.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoLegal"));
					
		this.jInternalFrameDetalleFormEstadoLegal.jMenuItemCancelarEstadoLegal.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoLegal"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoLegal.jMenuItemDetalleCerrarEstadoLegal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoLegal"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoLegal.jButtonGuardarCambiosToolBarEstadoLegal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoLegal"));
		
		
		
		this.jInternalFrameDetalleFormEstadoLegal.jButtonGuardarCambiosToolBarEstadoLegal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoLegal"));
		
		
		
		this.jInternalFrameDetalleFormEstadoLegal.jComboBoxTiposAccionesFormularioEstadoLegal.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoLegal"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoLegal.jButtonidEstadoLegalBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoLegal.jButtoncodigoEstadoLegalBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoLegal.jButtonnombreEstadoLegalBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoLegalBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoLegal.jTabbedPaneRelacionesEstadoLegal.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoLegal"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoLegal"));
		
		if(this.jInternalFrameDetalleFormEstadoLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoLegal.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoLegal"));
		}
		
		this.jTableDatosEstadoLegal.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoLegal"));
		
		this.jTableDatosEstadoLegal.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoLegal"));
		
		this.jButtonNuevoEstadoLegal.addActionListener(new ButtonActionListener(this,"NuevoEstadoLegal"));
		
		this.jButtonDuplicarEstadoLegal.addActionListener(new ButtonActionListener(this,"DuplicarEstadoLegal"));
		
		this.jButtonCopiarEstadoLegal.addActionListener(new ButtonActionListener(this,"CopiarEstadoLegal"));
		
		this.jButtonVerFormEstadoLegal.addActionListener(new ButtonActionListener(this,"VerFormEstadoLegal"));
		
		
		this.jButtonNuevoToolBarEstadoLegal.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoLegal"));
			
		this.jButtonDuplicarToolBarEstadoLegal.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoLegal"));
			
		this.jMenuItemNuevoEstadoLegal.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoLegal"));
			
		this.jMenuItemDuplicarEstadoLegal.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoLegal"));		
		
		
		this.jButtonNuevoRelacionesEstadoLegal.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoLegal"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoLegal.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoLegal"));
			
		this.jMenuItemNuevoRelacionesEstadoLegal.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoLegal"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoLegal.jButtonModificarEstadoLegal.addActionListener(new ButtonActionListener(this,"ModificarEstadoLegal"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoLegal.jButtonModificarToolBarEstadoLegal.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoLegal"));
			
			this.jInternalFrameDetalleFormEstadoLegal.jMenuItemModificarEstadoLegal.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoLegal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoLegal!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoLegal.jButtonActualizarEstadoLegal.addActionListener (new ButtonActionListener(this,"ActualizarEstadoLegal"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoLegal.jButtonActualizarToolBarEstadoLegal.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoLegal"));
				
			this.jInternalFrameDetalleFormEstadoLegal.jMenuItemActualizarEstadoLegal.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoLegal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoLegal.jButtonEliminarEstadoLegal.addActionListener (new ButtonActionListener(this,"EliminarEstadoLegal"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoLegal.jButtonEliminarToolBarEstadoLegal.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoLegal"));
						
			this.jInternalFrameDetalleFormEstadoLegal.jMenuItemEliminarEstadoLegal.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoLegal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoLegal.jButtonCancelarEstadoLegal.addActionListener (new ButtonActionListener(this,"CancelarEstadoLegal"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoLegal.jButtonCancelarToolBarEstadoLegal.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoLegal"));
			
			this.jInternalFrameDetalleFormEstadoLegal.jMenuItemCancelarEstadoLegal.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoLegal"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoLegal.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoLegal"));		
		
		
		this.jButtonCerrarEstadoLegal.addActionListener (new ButtonActionListener(this,"CerrarEstadoLegal"));
		
		
		this.jButtonCerrarToolBarEstadoLegal.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoLegal"));
			
		this.jMenuItemCerrarEstadoLegal.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoLegal"));
			
		if(this.jInternalFrameDetalleFormEstadoLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoLegal.jMenuItemDetalleCerrarEstadoLegal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoLegal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoLegal.jButtonGuardarCambiosEstadoLegal.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoLegal"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoLegal.jButtonGuardarCambiosToolBarEstadoLegal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoLegal"));
		}
		
		this.jButtonCopiarToolBarEstadoLegal.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoLegal"));
			
		this.jButtonVerFormToolBarEstadoLegal.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoLegal"));
		
		this.jMenuItemGuardarCambiosEstadoLegal.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoLegal"));
			
		this.jMenuItemCopiarEstadoLegal.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoLegal"));		
		
		this.jMenuItemVerFormEstadoLegal.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoLegal"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoLegal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoLegal"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoLegal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoLegal"));
			
		this.jMenuItemGuardarCambiosTablaEstadoLegal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoLegal"));		
		
		
		
		this.jButtonRecargarInformacionEstadoLegal.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoLegal"));
					
		this.jButtonRecargarInformacionToolBarEstadoLegal.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoLegal"));
		
		this.jMenuItemRecargarInformacionEstadoLegal.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoLegal"));		
		
		
		
		this.jButtonAnterioresEstadoLegal.addActionListener (new ButtonActionListener(this,"AnterioresEstadoLegal"));
		
		
		this.jButtonAnterioresToolBarEstadoLegal.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoLegal"));
		
		this.jMenuItemAnterioresEstadoLegal.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoLegal"));		
		
		
		this.jButtonSiguientesEstadoLegal.addActionListener (new ButtonActionListener(this,"SiguientesEstadoLegal"));
		
		
		this.jButtonSiguientesToolBarEstadoLegal.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoLegal"));
			
		this.jMenuItemSiguientesEstadoLegal.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoLegal"));
			
		this.jMenuItemAbrirOrderByEstadoLegal.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoLegal"));
			
		this.jMenuItemMostrarOcultarEstadoLegal.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoLegal"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoLegal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoLegal"));
			
		this.jMenuItemDetalleMostarOcultarEstadoLegal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoLegal"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoLegal.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoLegal"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoLegal.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoLegal"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoLegal.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoLegal"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoLegal.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoLegal"));

		this.jCheckBoxSeleccionadosEstadoLegal.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoLegal"));
		
		if(this.jInternalFrameDetalleFormEstadoLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoLegal.jComboBoxTiposAccionesFormularioEstadoLegal.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoLegal"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoLegal.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoLegal"));
			
		this.jComboBoxTiposAccionesEstadoLegal.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoLegal"));
					
		this.jComboBoxTiposSeleccionarEstadoLegal.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoLegal"));
			
		this.jTextFieldValorCampoGeneralEstadoLegal.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoLegal"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoLegal!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoLegal.jButtonidEstadoLegalBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoLegal.jButtoncodigoEstadoLegalBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoLegal.jButtonnombreEstadoLegalBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoLegalBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoLegal!=null) {
				this.jInternalFrameReporteDinamicoEstadoLegal.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoLegal"));
				this.jInternalFrameReporteDinamicoEstadoLegal.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoLegal"));
				this.jInternalFrameReporteDinamicoEstadoLegal.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoLegal"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoLegal.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoLegal"));				
			//this.jButtonGenerarReporteDinamicoEstadoLegal.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoLegal"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoLegal.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoLegal"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoLegal!=null) {
				this.jInternalFrameImportacionEstadoLegal.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoLegal"));
				this.jInternalFrameImportacionEstadoLegal.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoLegal"));
				this.jInternalFrameImportacionEstadoLegal.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoLegal"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoLegal.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoLegal"));
			
			this.jButtonAbrirOrderByToolBarEstadoLegal.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoLegal"));			
			
			if(this.jInternalFrameOrderByEstadoLegal!=null) {
				this.jInternalFrameOrderByEstadoLegal.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoLegal"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoLegal!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoLegal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoLegal.jTabbedPaneRelacionesEstadoLegal.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoLegal"));
		
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
            		closingInternalFrameEstadoLegal();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoLegal.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoLegal = (JInternalFrameBase)event.getSource();
	            	
	            EstadoLegalBeanSwingJInternalFrame jInternalFrameParent=(EstadoLegalBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoLegal.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoLegalActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoLegal.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoLegalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoLegal.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoLegal.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoLegalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoLegalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoLegalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoLegal";
		inputMap = this.jButtonNuevoEstadoLegal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoLegal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoLegalActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoLegalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoLegalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoLegalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoLegal";
		inputMap = this.jButtonNuevoRelacionesEstadoLegal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoLegal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoLegalActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoLegal";
		inputMap = this.jButtonModificarEstadoLegal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoLegal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoLegalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoLegal";
		inputMap = this.jButtonActualizarEstadoLegal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoLegal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoLegalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoLegal";
		inputMap = this.jButtonEliminarEstadoLegal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoLegal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoLegalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoLegal";
		inputMap = this.jButtonCancelarEstadoLegal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoLegal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoLegalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoLegal";
		inputMap = this.jButtonCerrarEstadoLegal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoLegal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoLegalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoLegal.jButtonGuardarCambiosEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoLegal";
		inputMap = this.jInternalFrameDetalleFormEstadoLegal.jButtonGuardarCambiosEstadoLegal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoLegal.jButtonGuardarCambiosEstadoLegal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoLegalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoLegal.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoLegalItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoLegal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoLegalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoLegal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoLegalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoLegal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoLegalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoLegal.jButtonidEstadoLegalBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoLegal.jButtoncodigoEstadoLegalBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoLegalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoLegal.jButtonnombreEstadoLegalBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoLegalBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoLegal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoLegalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoLegalActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoLegal.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoLegal(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoLegal estadolegalAux:this.estadolegalLogic.getEstadoLegals()) {
					estadolegalAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoLegal estadolegalAux:estadolegals) {
					estadolegalAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoLegalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoLegal(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoLegal estadolegalAux:this.estadolegalLogic.getEstadoLegals()) {
						estadolegalAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoLegal estadolegalAux:estadolegals) {
						estadolegalAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoLegal estadolegalAux:this.estadolegalLogic.getEstadoLegals()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoLegal estadolegalAux:estadolegals) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoLegal(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoLegal.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoLegal.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoLegal,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoLegalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoLegal(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoLegal.getSelectedRows();
			
			EstadoLegal estadolegalLocal=new EstadoLegal();
			
			//this.seleccionarTodosEstadoLegal(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadolegalLocal =(EstadoLegal) this.estadolegalLogic.getEstadoLegals().toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadolegalLocal =(EstadoLegal) this.estadolegals.toArray()[this.jTableDatosEstadoLegal.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadolegalLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoLegal estadolegalAux:this.estadolegalLogic.getEstadoLegals()) {
						estadolegalAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoLegal estadolegalAux:estadolegals) {
						estadolegalAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoLegal(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoLegal.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoLegal.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoLegal,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoLegalItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoLegalParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoLegalActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoLegal(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoLegal.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoLegal estadolegalAux:this.estadolegalLogic.getEstadoLegals()) {
				
						if(sTipoSeleccionar.equals(EstadoLegalConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadolegalAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoLegalConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadolegalAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoLegal estadolegalAux:estadolegals) {
					
						if(sTipoSeleccionar.equals(EstadoLegalConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadolegalAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoLegalConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadolegalAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoLegal(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoLegalActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoLegal(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoLegal=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoLegal.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoLegal.jComboBoxTiposAccionesFormularioEstadoLegal.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoLegal) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoLegal(conSplash);
				
					this.generarReporteEstadoLegalsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoLegal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoLegal.jComboBoxTiposAccionesFormularioEstadoLegal.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoLegalsSeleccionados();
				//this.jComboBoxTiposAccionesEstadoLegal.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoLegalsSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoLegal.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoLegalsSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoLegal.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoLegal();
				
				this.exportarEstadoLegalsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoLegal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoLegal.jComboBoxTiposAccionesFormularioEstadoLegal.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoLegals();
				//this.importarEstadoLegals();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoLegal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoLegal.jComboBoxTiposAccionesFormularioEstadoLegal.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoLegal();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoLegalsSeleccionados();
				//this.jComboBoxTiposAccionesEstadoLegal.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Legal", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoLegal();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoLegal)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoLegal(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Legal",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoLegal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoLegal.jComboBoxTiposAccionesFormularioEstadoLegal.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadoLegalBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadoLegal) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadoLegal(conSplash);
					
						//this.actualizarParametrosGeneralEstadoLegal();
						
						this.generarReporteProcesoAccionEstadoLegalsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadoLegal.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadoLegal.jComboBoxTiposAccionesFormularioEstadoLegal.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadoLegalBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estado LegalES SELECCIONADOS?", "MANTENIMIENTO DE Estado Legal", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadoLegal();
				
						this.actualizarParametrosGeneralEstadoLegal();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadolegalReturnGeneral=estadolegalLogic.procesarAccionEstadoLegalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadolegalLogic.getEstadoLegals(),this.estadolegalParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadoLegalReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoLegal.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoLegal.jComboBoxTiposAccionesFormularioEstadoLegal.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoLegal();
					
					EstadoLegalBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadoLegalReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoLegal.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoLegal.jComboBoxTiposAccionesFormularioEstadoLegal.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoLegal(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoLegalActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoLegal();
			
			if(this.jInternalFrameDetalleFormEstadoLegal==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoLegal> estadolegalsSeleccionados=new ArrayList<EstadoLegal>();		
			EstadoLegal estadolegal=new EstadoLegal();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoLegal(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoLegal.getSelectedItem();
			
			
			
			
			estadolegalsSeleccionados=this.getEstadoLegalsSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadolegalsSeleccionados.size()==1) {
				for(EstadoLegal estadolegalAux:estadolegalsSeleccionados) {
					estadolegal=estadolegalAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Cliente")) {
					jButtonClienteActionPerformed(null,rowIndex,true,false,estadolegal);
				}
				else if(this.sTipoRelacion.equals("Sub Cliente")) {
					jButtonSubClienteActionPerformed(null,rowIndex,true,false,estadolegal);
				}
				else if(this.sTipoRelacion.equals("Parametro Cartera Defecto")) {
					jButtonParametroCarteraDefectoActionPerformed(null,rowIndex,true,false,estadolegal);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoLegal();
			
      		//this.finishProcessEstadoLegal(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoLegalReturnGeneral() throws Exception {
		if(this.estadolegalReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadolegalReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadolegalReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadolegalReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadolegalReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadolegalReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoLegal(false);
		}
		
		if(this.estadolegalReturnGeneral.getConRetornoLista() || this.estadolegalReturnGeneral.getConRetornoObjeto()) {
			if(this.estadolegalReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadolegalLogic.setEstadoLegals(this.estadolegalReturnGeneral.getEstadoLegals());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadolegalReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadolegalLogic.setEstadoLegal(this.estadolegalReturnGeneral.getEstadoLegal());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoLegal(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoLegal() throws Exception {
		
		
	}
	
	public ArrayList<EstadoLegal> getEstadoLegalsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoLegal> estadolegalsSeleccionados=new ArrayList<EstadoLegal>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoLegal) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoLegal estadolegalAux:estadolegalLogic.getEstadoLegals()) {
					if(estadolegalAux.getIsSelected()) {
						estadolegalsSeleccionados.add(estadolegalAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoLegal estadolegalAux:this.estadolegals) {
					if(estadolegalAux.getIsSelected()) {
						estadolegalsSeleccionados.add(estadolegalAux);				
					}
				}
			}
			
			if(estadolegalsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadolegalsSeleccionados.addAll(this.estadolegalLogic.getEstadoLegals());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadolegalsSeleccionados.addAll(this.estadolegals);				
					}
				}
			}
		} else {
			estadolegalsSeleccionados.add(this.estadolegal);
		}
		
		return estadolegalsSeleccionados;
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
	
	public void generarReporteEstadoLegalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoLegalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoLegalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoLegalsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoLegalsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoLegalsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Legal",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoLegalsSeleccionados() throws Exception {
		ArrayList<EstadoLegal> estadolegalsSeleccionados=new ArrayList<EstadoLegal>();		
		
		estadolegalsSeleccionados=this.getEstadoLegalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoLegals("Todos",estadolegalsSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoLegalsSeleccionados() throws Exception {
		ArrayList<EstadoLegal> estadolegalsSeleccionados=new ArrayList<EstadoLegal>();		
		
		estadolegalsSeleccionados=this.getEstadoLegalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoLegals("Todos",estadolegalsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoLegalsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoLegal> estadolegalsSeleccionados=new ArrayList<EstadoLegal>();
		
		estadolegalsSeleccionados=this.getEstadoLegalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoLegals("Todos",estadolegalsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoLegalsSeleccionados() throws Exception {
		ArrayList<EstadoLegal> estadolegalsSeleccionados=new ArrayList<EstadoLegal>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoLegal();
		
		
		estadolegalsSeleccionados=this.getEstadoLegalsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoLegal();
		
		
		//this.generarReporteEstadoLegals("Todos",estadolegalsSeleccionados ,estadolegalImplementable,estadolegalImplementableHome);
	}
	
	public void mostrarImportacionEstadoLegals() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoLegal();
		
		this.abrirFrameImportacionEstadoLegal();		
		
			
		//this.generarReporteEstadoLegals("Todos",estadolegalsSeleccionados ,estadolegalImplementable,estadolegalImplementableHome);
	}
	
	public void importarEstadoLegals() throws Exception {		
	
	}
	
	public void exportarEstadoLegalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoLegalsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoLegalsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoLegalsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Legal",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoLegalsSeleccionados() throws Exception {
		ArrayList<EstadoLegal> estadolegalsSeleccionados=new ArrayList<EstadoLegal>();		
		
		estadolegalsSeleccionados=this.getEstadoLegalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadolegal."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoLegal(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoLegal estadolegalAux:estadolegalsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoLegal(estadolegalAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadolegalAux.setsDetalleGeneralEntityReporte(estadolegalAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadolegalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Legal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoLegal(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoLegalConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoLegalConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoLegalConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoLegalConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoLegal(EstadoLegal estadolegal,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadolegal.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadolegal.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadolegal.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadolegal.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoLegalsSeleccionados() throws Exception {
		ArrayList<EstadoLegal> estadolegalsSeleccionados=new ArrayList<EstadoLegal>();		
		
		estadolegalsSeleccionados=this.getEstadoLegalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadolegal.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoLegals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoLegal(row);				
				iRow++;
			}				
			
			for(EstadoLegal estadolegalAux:estadolegalsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoLegal(estadolegalAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadolegalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Legal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoLegalsSeleccionados() throws Exception {
		ArrayList<EstadoLegal> estadolegalsSeleccionados=new ArrayList<EstadoLegal>();		
		
		estadolegalsSeleccionados=this.getEstadoLegalsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadolegal.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadolegals");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadolegal");
			//elementRoot.appendChild(element);
		
			for(EstadoLegal estadolegalAux:estadolegalsSeleccionados) {
				element = document.createElement("estadolegal");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoLegal(estadolegalAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadolegalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Legal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoLegal(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoLegalConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoLegalConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoLegalConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoLegalConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoLegal(EstadoLegal estadolegal,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadolegal.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadolegal.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadolegal.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoLegal(EstadoLegal estadolegal,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoLegalConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadolegal.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoLegalConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadolegal.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoLegalConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadolegal.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoLegalConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadolegal.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoLegalsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoLegal> estadolegalsSeleccionados=new ArrayList<EstadoLegal>();
		
		estadolegalsSeleccionados=this.getEstadoLegalsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoLegal(estadolegalsSeleccionados);
		
		this.generarReporteEstadoLegals("Todos",estadolegalsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoLegal(ArrayList<EstadoLegal> estadolegalsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoLegal estadolegalAux:estadolegalsSeleccionados) {
				estadolegalAux.setsDetalleGeneralEntityReporte(estadolegalAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoLegalConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadolegalAux.setsDescripcionGeneralEntityReporte1(estadolegalAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoLegalConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadolegalAux.setsDescripcionGeneralEntityReporte1(estadolegalAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoLegalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoLegal(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoLegal=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoLegal=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoLegal=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoLegal=false;
			this.isVisibilidadCeldaActualizarEstadoLegal=false;
			this.isVisibilidadCeldaEliminarEstadoLegal=false;
			this.isVisibilidadCeldaCancelarEstadoLegal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoLegal=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoLegal=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoLegal=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoLegal=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoLegal=false;
			this.isVisibilidadCeldaModificarEstadoLegal=false;
			this.isVisibilidadCeldaActualizarEstadoLegal=true;
			this.isVisibilidadCeldaEliminarEstadoLegal=false;
			this.isVisibilidadCeldaCancelarEstadoLegal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoLegal=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoLegal=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoLegal=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoLegal=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoLegal=false;
			this.isVisibilidadCeldaModificarEstadoLegal=false;
			this.isVisibilidadCeldaActualizarEstadoLegal=true;
			this.isVisibilidadCeldaEliminarEstadoLegal=true;
			this.isVisibilidadCeldaCancelarEstadoLegal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoLegal=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoLegal=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoLegal=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoLegal=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoLegal=false;
			this.isVisibilidadCeldaModificarEstadoLegal=false;
			this.isVisibilidadCeldaActualizarEstadoLegal=true;
			this.isVisibilidadCeldaEliminarEstadoLegal=false;
			this.isVisibilidadCeldaCancelarEstadoLegal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoLegal=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoLegal=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoLegal=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoLegal=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoLegal=true;
			this.isVisibilidadCeldaModificarEstadoLegal=false;
			this.isVisibilidadCeldaActualizarEstadoLegal=false;
			this.isVisibilidadCeldaEliminarEstadoLegal=false;
			this.isVisibilidadCeldaCancelarEstadoLegal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoLegal=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoLegal=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoLegal=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoLegal=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoLegal=false;
			this.isVisibilidadCeldaActualizarEstadoLegal=false;
			this.isVisibilidadCeldaEliminarEstadoLegal=false;
			this.isVisibilidadCeldaCancelarEstadoLegal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoLegal=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoLegal=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoLegal=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoLegal=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoLegal=false;
			this.isVisibilidadCeldaModificarEstadoLegal=true;
			this.isVisibilidadCeldaActualizarEstadoLegal=false;
			this.isVisibilidadCeldaEliminarEstadoLegal=false;
			this.isVisibilidadCeldaCancelarEstadoLegal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoLegal=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoLegal=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoLegalJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoLegal=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoLegal=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoLegal=true;
		} else {
			this.actualizarEstadoPanelsEstadoLegal(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoLegal=false;
			//this.isVisibilidadCeldaVerFormEstadoLegal=false;
			this.isVisibilidadCeldaDuplicarEstadoLegal=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadolegalSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoLegal=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoLegal=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoLegal=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadolegalSessionBean.getEsGuardarRelacionado()) {
			if(!estadolegalSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoLegal=false;												
			}
			
			this.jButtonCerrarEstadoLegal.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoLegal=false;
		}
		
		if(!this.permiteMantenimiento(this.estadolegal)) {
			this.isVisibilidadCeldaActualizarEstadoLegal=false;
			this.isVisibilidadCeldaEliminarEstadoLegal=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoLegal() {
		this.isVisibilidadCeldaNuevoEstadoLegal=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoLegal=false;
	}
	
	public void actualizarEstadoPanelsEstadoLegal(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoLegal!=null) {
				this.jScrollPanelDatosEdicionEstadoLegal.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoLegal!=null) {
				this.jScrollPanelDatosEstadoLegal.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoLegal!=null) {
				this.jPanelPaginacionEstadoLegal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoLegal!=null) {
				this.jPanelParametrosReportesEstadoLegal.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoLegal!=null) {
				this.jScrollPanelDatosEdicionEstadoLegal.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoLegal!=null) {
				this.jScrollPanelDatosEstadoLegal.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoLegal!=null) {
				this.jPanelPaginacionEstadoLegal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoLegal!=null) {
				this.jPanelParametrosReportesEstadoLegal.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoLegal!=null) {
				this.jScrollPanelDatosEdicionEstadoLegal.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoLegal!=null) {
				this.jScrollPanelDatosEstadoLegal.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoLegal!=null) {
				this.jPanelPaginacionEstadoLegal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoLegal!=null) {
				this.jPanelParametrosReportesEstadoLegal.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoLegal!=null) {
				this.jScrollPanelDatosEdicionEstadoLegal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoLegal!=null) {
				this.jScrollPanelDatosEstadoLegal.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoLegal!=null) {
				this.jPanelPaginacionEstadoLegal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoLegal!=null) {
				this.jPanelParametrosReportesEstadoLegal.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoLegal!=null) {
				this.jScrollPanelDatosEdicionEstadoLegal.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoLegal!=null) {
				this.jScrollPanelDatosEstadoLegal.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoLegal!=null) {
				this.jPanelPaginacionEstadoLegal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoLegal!=null) {
				this.jPanelParametrosReportesEstadoLegal.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoLegal!=null) {
				this.jScrollPanelDatosEdicionEstadoLegal.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoLegal!=null) {
				this.jScrollPanelDatosEstadoLegal.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoLegal!=null) {
				this.jPanelPaginacionEstadoLegal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoLegal!=null) {
				this.jPanelParametrosReportesEstadoLegal.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoLegal!=null) {
				this.jScrollPanelDatosEdicionEstadoLegal.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoLegal!=null) {
				this.jScrollPanelDatosEstadoLegal.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoLegal!=null) {
				this.jPanelPaginacionEstadoLegal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoLegal!=null) {
				this.jPanelParametrosReportesEstadoLegal.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadolegalSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadolegalSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoLegalParaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(this.estadolegalSessionBean==null) {
				this.estadolegalSessionBean=new EstadoLegalSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoLegal.clienteSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoLegal.clienteSessionBean=new ClienteSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoLegal.clienteSessionBean.setsPathNavegacionActual(estadolegalSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoLegal.clienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCliente=this.jInternalFrameDetalleFormEstadoLegal.clienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoLegal.clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			this.jInternalFrameDetalleFormEstadoLegal.clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(EstadoLegalConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoLegal.clienteSessionBean.setisBusquedaDesdeForeignKeySesionEstadoLegal(true);
			this.jInternalFrameDetalleFormEstadoLegal.clienteSessionBean.setlidEstadoLegalActual(this.idEstadoLegalActual);

			estadolegalSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoLegal(true);
			estadolegalSessionBean.setlIdEstadoLegalActualForeignKey(this.idEstadoLegalActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionEstadoLegalParaSubClientes() throws Exception {
		Boolean isPaginaPopupSubCliente=false;

		try {

			if(this.estadolegalSessionBean==null) {
				this.estadolegalSessionBean=new EstadoLegalSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoLegal.subclienteSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoLegal.subclienteSessionBean=new SubClienteSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoLegal.subclienteSessionBean.setsPathNavegacionActual(estadolegalSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+SubClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoLegal.subclienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupSubCliente=this.jInternalFrameDetalleFormEstadoLegal.subclienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoLegal.subclienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeSubCliente(true);
			this.jInternalFrameDetalleFormEstadoLegal.subclienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeSubCliente(EstadoLegalConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoLegal.subclienteSessionBean.setisBusquedaDesdeForeignKeySesionEstadoLegal(true);
			this.jInternalFrameDetalleFormEstadoLegal.subclienteSessionBean.setlidEstadoLegalActual(this.idEstadoLegalActual);

			estadolegalSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoLegal(true);
			estadolegalSessionBean.setlIdEstadoLegalActualForeignKey(this.idEstadoLegalActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionEstadoLegalParaParametroCarteraDefectos() throws Exception {
		Boolean isPaginaPopupParametroCarteraDefecto=false;

		try {

			if(this.estadolegalSessionBean==null) {
				this.estadolegalSessionBean=new EstadoLegalSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoSessionBean.setsPathNavegacionActual(estadolegalSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroCarteraDefecto=this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroCarteraDefecto(true);
			this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroCarteraDefecto(EstadoLegalConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoSessionBean.setisBusquedaDesdeForeignKeySesionEstadoLegal(true);
			this.jInternalFrameDetalleFormEstadoLegal.parametrocarteradefectoSessionBean.setlidEstadoLegalActual(this.idEstadoLegalActual);

			estadolegalSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoLegal(true);
			estadolegalSessionBean.setlIdEstadoLegalActualForeignKey(this.idEstadoLegalActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoLegalSessionBean estadolegalSessionBean=new EstadoLegalSessionBean();
		
		if(this.estadolegalSessionBean==null) {
			this.estadolegalSessionBean=new EstadoLegalSessionBean();
		}
		
		this.estadolegalSessionBean.setsUltimaBusquedaEstadoLegal(this.getsAccionBusqueda());
		this.estadolegalSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadolegalSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoLegalSessionBean estadolegalSessionBean=new EstadoLegalSessionBean();
		
		if(this.estadolegalSessionBean==null) {
			this.estadolegalSessionBean=new EstadoLegalSessionBean();
		}
		
		if(this.estadolegalSessionBean.getsUltimaBusquedaEstadoLegal()!=null&&!this.estadolegalSessionBean.getsUltimaBusquedaEstadoLegal().equals("")) {
			this.setsAccionBusqueda(estadolegalSessionBean.getsUltimaBusquedaEstadoLegal());
			this.setiNumeroPaginacion(estadolegalSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadolegalSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadolegalSessionBean.setsUltimaBusquedaEstadoLegal("");
		this.estadolegalSessionBean.setiNumeroPaginacion(EstadoLegalConstantesFunciones.INUMEROPAGINACION);
		this.estadolegalSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoLegal(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoLegal() {
		this.updateBorderResaltarBusquedasFormularioEstadoLegal();
		this.updateVisibilidadBusquedasFormularioEstadoLegal();
		this.updateHabilitarBusquedasFormularioEstadoLegal();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoLegal() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoLegal() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoLegal() {
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
	
	public void updateControlesFormularioEstadoLegal() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoLegal==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoLegal();
		this.updateVisibilidadResaltarControlesFormularioEstadoLegal();
		this.updateHabilitarResaltarControlesFormularioEstadoLegal();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoLegal() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoLegal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadolegalConstantesFunciones.resaltaridEstadoLegal!=null && this.jInternalFrameDetalleFormEstadoLegal!=null) {this.jInternalFrameDetalleFormEstadoLegal.jTextFieldidEstadoLegal.setBorder(this.estadolegalConstantesFunciones.resaltaridEstadoLegal);}
		if(this.estadolegalConstantesFunciones.resaltarcodigoEstadoLegal!=null && this.jInternalFrameDetalleFormEstadoLegal!=null) {this.jInternalFrameDetalleFormEstadoLegal.jTextFieldcodigoEstadoLegal.setBorder(this.estadolegalConstantesFunciones.resaltarcodigoEstadoLegal);}
		if(this.estadolegalConstantesFunciones.resaltarnombreEstadoLegal!=null && this.jInternalFrameDetalleFormEstadoLegal!=null) {this.jInternalFrameDetalleFormEstadoLegal.jTextAreanombreEstadoLegal.setBorder(this.estadolegalConstantesFunciones.resaltarnombreEstadoLegal);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoLegal() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoLegal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoLegal!=null) {
	
		//this.jInternalFrameDetalleFormEstadoLegal.jTextFieldidEstadoLegal.setVisible(this.estadolegalConstantesFunciones.mostraridEstadoLegal);
		this.jInternalFrameDetalleFormEstadoLegal.jPanelidEstadoLegal.setVisible(this.estadolegalConstantesFunciones.mostraridEstadoLegal);
		//this.jInternalFrameDetalleFormEstadoLegal.jTextFieldcodigoEstadoLegal.setVisible(this.estadolegalConstantesFunciones.mostrarcodigoEstadoLegal);
		this.jInternalFrameDetalleFormEstadoLegal.jPanelcodigoEstadoLegal.setVisible(this.estadolegalConstantesFunciones.mostrarcodigoEstadoLegal);
		//this.jInternalFrameDetalleFormEstadoLegal.jTextAreanombreEstadoLegal.setVisible(this.estadolegalConstantesFunciones.mostrarnombreEstadoLegal);
		this.jInternalFrameDetalleFormEstadoLegal.jPanelnombreEstadoLegal.setVisible(this.estadolegalConstantesFunciones.mostrarnombreEstadoLegal);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoLegal() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoLegal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoLegal!=null) {
	
		this.jInternalFrameDetalleFormEstadoLegal.jTextFieldidEstadoLegal.setEnabled(this.estadolegalConstantesFunciones.activaridEstadoLegal);
		this.jInternalFrameDetalleFormEstadoLegal.jTextFieldcodigoEstadoLegal.setEnabled(this.estadolegalConstantesFunciones.activarcodigoEstadoLegal);
		this.jInternalFrameDetalleFormEstadoLegal.jTextAreanombreEstadoLegal.setEnabled(this.estadolegalConstantesFunciones.activarnombreEstadoLegal);
		}
	}
	
		
}