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

import com.bydan.erp.cartera.util.EstadoClienteConstantesFunciones;
import com.bydan.erp.cartera.util.EstadoClienteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.EstadoClienteParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.EstadoClienteBean;
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
public class EstadoClienteBeanSwingJInternalFrame extends EstadoClienteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoClienteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoCliente> estadoclienteValidator = new ClassValidator<EstadoCliente>(EstadoCliente.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoCliente estadocliente;	
	public EstadoCliente estadoclienteAux;
	public EstadoCliente estadoclienteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoCliente estadoclienteTotales;
	public Long idEstadoClienteActual;
	public Long iIdNuevoEstadoCliente=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosCliente=false;

	public Boolean getIsTienePermisosCliente() {
		return isTienePermisosCliente;
	}

	public void setIsTienePermisosCliente(Boolean isTienePermisosCliente) {
		this.isTienePermisosCliente= isTienePermisosCliente;
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
	
	public Boolean isPermisoTodoEstadoCliente;
	public Boolean isPermisoNuevoEstadoCliente;
	public Boolean isPermisoActualizarEstadoCliente;
	public Boolean isPermisoActualizarOriginalEstadoCliente;
	public Boolean isPermisoEliminarEstadoCliente;
	public Boolean isPermisoGuardarCambiosEstadoCliente;
	public Boolean isPermisoConsultaEstadoCliente;
	public Boolean isPermisoBusquedaEstadoCliente;
	public Boolean isPermisoReporteEstadoCliente;
	public Boolean isPermisoPaginacionMedioEstadoCliente;
	public Boolean isPermisoPaginacionAltoEstadoCliente;
	public Boolean isPermisoPaginacionTodoEstadoCliente;
	public Boolean isPermisoCopiarEstadoCliente;
	public Boolean isPermisoVerFormEstadoCliente;
	public Boolean isPermisoDuplicarEstadoCliente;
	public Boolean isPermisoOrdenEstadoCliente;
	
	
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
	
	public EstadoClienteParameterReturnGeneral estadoclienteReturnGeneral;
	public EstadoClienteParameterReturnGeneral estadoclienteParameterGeneral;
	
	

	public ClienteLogic clienteLogic=null;

	public ClienteLogic getClienteLogic() {
		return clienteLogic;
	}

	public void setClienteLogic(ClienteLogic clienteLogic) {
		this.clienteLogic = clienteLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoCliente=false;
	public Boolean esParaAccionDesdeFormularioEstadoCliente=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadoClienteSessionBeanAdditional estadoclienteSessionBeanAdditional=null;
	
	public EstadoClienteSessionBeanAdditional getEstadoClienteSessionBeanAdditional() {
		return this.estadoclienteSessionBeanAdditional;
	}
	
	public void setEstadoClienteSessionBeanAdditional(EstadoClienteSessionBeanAdditional estadoclienteSessionBeanAdditional) {
		try {
			this.estadoclienteSessionBeanAdditional=estadoclienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadoClienteBeanSwingJInternalFrameAdditional estadoclienteBeanSwingJInternalFrameAdditional=null;
	//public class EstadoClienteBeanSwingJInternalFrame
	
	public EstadoClienteBeanSwingJInternalFrameAdditional getEstadoClienteBeanSwingJInternalFrameAdditional() {
		return this.estadoclienteBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadoClienteBeanSwingJInternalFrameAdditional(EstadoClienteBeanSwingJInternalFrameAdditional estadoclienteBeanSwingJInternalFrameAdditional) {
		try {
			this.estadoclienteBeanSwingJInternalFrameAdditional=estadoclienteBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoClienteLogic estadoclienteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoCliente estadoclienteBean;
	public EstadoClienteConstantesFunciones estadoclienteConstantesFunciones;
	//public EstadoClienteParameterReturnGeneral estadoclienteReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoCliente> estadoclientes;	
	//public List<EstadoCliente> estadoclientesEliminados;
	//public List<EstadoCliente> estadoclientesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoCliente=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoCliente=true;
	public Boolean isVisibilidadCeldaCopiarEstadoCliente=true;
	public Boolean isVisibilidadCeldaVerFormEstadoCliente=true;
	public Boolean isVisibilidadCeldaOrdenEstadoCliente=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoCliente=false;
	public Boolean isVisibilidadCeldaModificarEstadoCliente=false;
	public Boolean isVisibilidadCeldaActualizarEstadoCliente=false;
	public Boolean isVisibilidadCeldaEliminarEstadoCliente=false;
	public Boolean isVisibilidadCeldaCancelarEstadoCliente=false;
	public Boolean isVisibilidadCeldaGuardarEstadoCliente=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoCliente=false;	
	
	
	
	public Long getiIdNuevoEstadoCliente() {
		return this.iIdNuevoEstadoCliente;
	}

	public void setiIdNuevoEstadoCliente(Long iIdNuevoEstadoCliente) {
		this.iIdNuevoEstadoCliente = iIdNuevoEstadoCliente;
	}
	
	public Long getidEstadoClienteActual() {
		return this.idEstadoClienteActual;
	}

	public void setidEstadoClienteActual(Long idEstadoClienteActual) {
		this.idEstadoClienteActual = idEstadoClienteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoCliente getestadocliente() {
		return this.estadocliente;
	}

	public void setestadocliente(EstadoCliente estadocliente) {
		this.estadocliente = estadocliente;
	}
	
	public EstadoCliente getestadoclienteAux() {
		return this.estadoclienteAux;
	}

	public void setestadoclienteAux(EstadoCliente estadoclienteAux) {
		this.estadoclienteAux = estadoclienteAux;
	}				
	
	public EstadoCliente getestadoclienteAnterior() {
		return this.estadoclienteAnterior;
	}

	public void setestadoclienteAnterior(EstadoCliente estadoclienteAnterior) {
		this.estadoclienteAnterior = estadoclienteAnterior;
	}	
	
	public EstadoCliente getestadoclienteTotales() {
		return this.estadoclienteTotales;
	}

	public void setestadoclienteTotales(EstadoCliente estadoclienteTotales) {
		this.estadoclienteTotales = estadoclienteTotales;
	}	
	
	public EstadoCliente getestadoclienteBean() {
		return this.estadoclienteBean;
	}

	public void setestadoclienteBean(EstadoCliente estadoclienteBean) {
		this.estadoclienteBean = estadoclienteBean;
	}	
	
	public EstadoClienteParameterReturnGeneral getestadoclienteReturnGeneral() {
		return this.estadoclienteReturnGeneral;
	}

	public void setestadoclienteReturnGeneral(EstadoClienteParameterReturnGeneral estadoclienteReturnGeneral) {
		this.estadoclienteReturnGeneral = estadoclienteReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoClienteLogic getEstadoClienteLogic()	{		
		return estadoclienteLogic;
	}

	public void setEstadoClienteLogic(EstadoClienteLogic estadoclienteLogic) {
		this.estadoclienteLogic = estadoclienteLogic;
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
	
	public Boolean getIsEsNuevoEstadoCliente() {
		return isEsNuevoEstadoCliente;
	}

	public void setIsEsNuevoEstadoCliente(Boolean isEsNuevoEstadoCliente) {
		this.isEsNuevoEstadoCliente = isEsNuevoEstadoCliente;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoCliente() {
		return esParaAccionDesdeFormularioEstadoCliente;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoCliente(Boolean esParaAccionDesdeFormularioEstadoCliente) {
		this.esParaAccionDesdeFormularioEstadoCliente = esParaAccionDesdeFormularioEstadoCliente;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoCliente() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoClienteConstantesFunciones.refrescarForeignKeysDescripcionesEstadoCliente(this.estadoclienteLogic.getEstadoClientes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoClienteConstantesFunciones.refrescarForeignKeysDescripcionesEstadoCliente(this.estadoclientes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadoclienteLogic.setEstadoClientes(this.estadoclientes);
			estadoclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoClienteParameterReturnGeneral getEstadoClienteParameterGeneral() {
		return this.estadoclienteParameterGeneral;
	}
	
	public void setEstadoClienteParameterGeneral(EstadoClienteParameterReturnGeneral estadoclienteParameterGeneral) {
		this.estadoclienteParameterGeneral = estadoclienteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoCliente() {
		return isPermisoTodoEstadoCliente;
	}

	public void setIsPermisoTodoEstadoCliente(Boolean isPermisoTodoEstadoCliente) {
		this.isPermisoTodoEstadoCliente = isPermisoTodoEstadoCliente;
	}

	public Boolean getIsPermisoNuevoEstadoCliente() {
		return isPermisoNuevoEstadoCliente;
	}

	public void setIsPermisoNuevoEstadoCliente(Boolean isPermisoNuevoEstadoCliente) {
		this.isPermisoNuevoEstadoCliente = isPermisoNuevoEstadoCliente;
	}

	public Boolean getIsPermisoActualizarEstadoCliente() {
		return isPermisoActualizarEstadoCliente;
	}

	public void setIsPermisoActualizarEstadoCliente(Boolean isPermisoActualizarEstadoCliente) {
		this.isPermisoActualizarEstadoCliente = isPermisoActualizarEstadoCliente;
	}

	public Boolean getIsPermisoEliminarEstadoCliente() {
		return isPermisoEliminarEstadoCliente;
	}

	public void setIsPermisoEliminarEstadoCliente(Boolean isPermisoEliminarEstadoCliente) {
		this.isPermisoEliminarEstadoCliente = isPermisoEliminarEstadoCliente;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoCliente() {
		return isPermisoGuardarCambiosEstadoCliente;
	}

	public void setIsPermisoGuardarCambiosEstadoCliente(Boolean isPermisoGuardarCambiosEstadoCliente) {
		this.isPermisoGuardarCambiosEstadoCliente = isPermisoGuardarCambiosEstadoCliente;
	}
	
	public Boolean getIsPermisoConsultaEstadoCliente() {
		return isPermisoConsultaEstadoCliente;
	}

	public void setIsPermisoConsultaEstadoCliente(Boolean isPermisoConsultaEstadoCliente) {
		this.isPermisoConsultaEstadoCliente = isPermisoConsultaEstadoCliente;
	}

	public Boolean getIsPermisoBusquedaEstadoCliente() {
		return isPermisoBusquedaEstadoCliente;
	}

	public void setIsPermisoBusquedaEstadoCliente(Boolean isPermisoBusquedaEstadoCliente) {
		this.isPermisoBusquedaEstadoCliente = isPermisoBusquedaEstadoCliente;
	}

	public Boolean getIsPermisoReporteEstadoCliente() {
		return isPermisoReporteEstadoCliente;
	}

	public void setIsPermisoReporteEstadoCliente(Boolean isPermisoReporteEstadoCliente) {
		this.isPermisoReporteEstadoCliente = isPermisoReporteEstadoCliente;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoCliente() {
		return isPermisoPaginacionMedioEstadoCliente;
	}

	public void setIsPermisoPaginacionMedioEstadoCliente(Boolean isPermisoPaginacionMedioEstadoCliente) {
		this.isPermisoPaginacionMedioEstadoCliente = isPermisoPaginacionMedioEstadoCliente;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoCliente() {
		return isPermisoPaginacionTodoEstadoCliente;
	}

	public void setIsPermisoPaginacionTodoEstadoCliente(Boolean isPermisoPaginacionTodoEstadoCliente) {
		this.isPermisoPaginacionTodoEstadoCliente = isPermisoPaginacionTodoEstadoCliente;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoCliente() {
		return isPermisoPaginacionAltoEstadoCliente;
	}

	public void setIsPermisoPaginacionAltoEstadoCliente(Boolean isPermisoPaginacionAltoEstadoCliente) {
		this.isPermisoPaginacionAltoEstadoCliente = isPermisoPaginacionAltoEstadoCliente;
	}
	
	public Boolean getIsPermisoCopiarEstadoCliente() {
		return isPermisoCopiarEstadoCliente;
	}

	public void setIsPermisoCopiarEstadoCliente(Boolean isPermisoCopiarEstadoCliente) {
		this.isPermisoCopiarEstadoCliente = isPermisoCopiarEstadoCliente;
	}
	
	public Boolean getIsPermisoVerFormEstadoCliente() {
		return isPermisoVerFormEstadoCliente;
	}

	public void setIsPermisoVerFormEstadoCliente(Boolean isPermisoVerFormEstadoCliente) {
		this.isPermisoVerFormEstadoCliente = isPermisoVerFormEstadoCliente;
	}
	
	public Boolean getIsPermisoDuplicarEstadoCliente() {
		return isPermisoDuplicarEstadoCliente;
	}

	public void setIsPermisoDuplicarEstadoCliente(Boolean isPermisoDuplicarEstadoCliente) {
		this.isPermisoDuplicarEstadoCliente = isPermisoDuplicarEstadoCliente;
	}
	
	public Boolean getIsPermisoOrdenEstadoCliente() {
		return isPermisoOrdenEstadoCliente;
	}

	public void setIsPermisoOrdenEstadoCliente(Boolean isPermisoOrdenEstadoCliente) {
		this.isPermisoOrdenEstadoCliente = isPermisoOrdenEstadoCliente;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoCliente() {
		return isVisibilidadCeldaNuevoEstadoCliente;
	}

	public void setIsVisibilidadCeldaNuevoEstadoCliente(Boolean isVisibilidadCeldaNuevoEstadoCliente) {
		this.isVisibilidadCeldaNuevoEstadoCliente = isVisibilidadCeldaNuevoEstadoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoCliente() {
		return isVisibilidadCeldaDuplicarEstadoCliente;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoCliente(Boolean isVisibilidadCeldaDuplicarEstadoCliente) {
		this.isVisibilidadCeldaDuplicarEstadoCliente = isVisibilidadCeldaDuplicarEstadoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoCliente() {
		return isVisibilidadCeldaCopiarEstadoCliente;
	}

	public void setIsVisibilidadCeldaCopiarEstadoCliente(Boolean isVisibilidadCeldaCopiarEstadoCliente) {
		this.isVisibilidadCeldaCopiarEstadoCliente = isVisibilidadCeldaCopiarEstadoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoCliente() {
		return isVisibilidadCeldaVerFormEstadoCliente;
	}

	public void setIsVisibilidadCeldaVerFormEstadoCliente(Boolean isVisibilidadCeldaVerFormEstadoCliente) {
		this.isVisibilidadCeldaVerFormEstadoCliente = isVisibilidadCeldaVerFormEstadoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoCliente() {
		return isVisibilidadCeldaOrdenEstadoCliente;
	}

	public void setIsVisibilidadCeldaOrdenEstadoCliente(Boolean isVisibilidadCeldaOrdenEstadoCliente) {
		this.isVisibilidadCeldaOrdenEstadoCliente = isVisibilidadCeldaOrdenEstadoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoCliente() {
		return isVisibilidadCeldaNuevoRelacionesEstadoCliente;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoCliente(Boolean isVisibilidadCeldaNuevoRelacionesEstadoCliente) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoCliente = isVisibilidadCeldaNuevoRelacionesEstadoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoCliente() {
		return isVisibilidadCeldaModificarEstadoCliente;
	}

	public void setIsVisibilidadCeldaModificarEstadoCliente(Boolean isVisibilidadCeldaModificarEstadoCliente) {
		this.isVisibilidadCeldaModificarEstadoCliente = isVisibilidadCeldaModificarEstadoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoCliente() {
		return isVisibilidadCeldaActualizarEstadoCliente;
	}

	public void setIsVisibilidadCeldaActualizarEstadoCliente(Boolean isVisibilidadCeldaActualizarEstadoCliente) {
		this.isVisibilidadCeldaActualizarEstadoCliente = isVisibilidadCeldaActualizarEstadoCliente;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoCliente() {
		return isVisibilidadCeldaEliminarEstadoCliente;
	}

	public void setIsVisibilidadCeldaEliminarEstadoCliente(Boolean isVisibilidadCeldaEliminarEstadoCliente) {
		this.isVisibilidadCeldaEliminarEstadoCliente = isVisibilidadCeldaEliminarEstadoCliente;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoCliente() {
		return isVisibilidadCeldaCancelarEstadoCliente;
	}

	public void setIsVisibilidadCeldaCancelarEstadoCliente(Boolean isVisibilidadCeldaCancelarEstadoCliente) {
		this.isVisibilidadCeldaCancelarEstadoCliente = isVisibilidadCeldaCancelarEstadoCliente;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoCliente() {
		return isVisibilidadCeldaGuardarEstadoCliente;
	}

	public void setIsVisibilidadCeldaGuardarEstadoCliente(Boolean isVisibilidadCeldaGuardarEstadoCliente) {
		this.isVisibilidadCeldaGuardarEstadoCliente = isVisibilidadCeldaGuardarEstadoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoCliente() {
		return isVisibilidadCeldaGuardarCambiosEstadoCliente;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoCliente(Boolean isVisibilidadCeldaGuardarCambiosEstadoCliente) {
		this.isVisibilidadCeldaGuardarCambiosEstadoCliente = isVisibilidadCeldaGuardarCambiosEstadoCliente;
	}
		
	public EstadoClienteSessionBean getestadoclienteSessionBean() {
		return this.estadoclienteSessionBean;
	}
	
	public void setestadoclienteSessionBean(EstadoClienteSessionBean estadoclienteSessionBean) {
		this.estadoclienteSessionBean=estadoclienteSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoCliente(EstadoCliente estadocliente)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoCliente estadocliente,EstadoCliente estadoclienteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoCliente(estadocliente);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadoclienteAux.setId(estadocliente.getId());
		estadoclienteAux.setVersionRow(estadocliente.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoCliente();
		
			int intSelectedRow = this.jTableDatosEstadoCliente.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocliente =(EstadoCliente) this.estadoclienteLogic.getEstadoClientes().toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadocliente =(EstadoCliente) this.estadoclientes.toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoCliente(this.estadocliente,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoCliente(this.estadocliente);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadoclienteValidator.getInvalidValues(this.estadocliente);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadoclienteLogic.setDatosCliente(datosCliente);
			estadoclienteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadoclienteAux=new  EstadoCliente();
				
				estadoclienteAux.setIsNew(true);
				estadoclienteAux.setIsChanged(true);
				
				estadoclienteAux.setEstadoClienteOriginal(this.estadocliente);
				
				estadoclienteAux.setId(this.estadocliente.getId());	
				estadoclienteAux.setVersionRow(this.estadocliente.getVersionRow());	
				estadoclienteAux.setcodigo(this.estadocliente.getcodigo());	
				estadoclienteAux.setnombre(this.estadocliente.getnombre());	
				estadoclienteAux.setes_defecto(this.estadocliente.getes_defecto());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadoclienteAux,estadoclienteLogic.getEstadoClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoclienteAux,estadoclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadoclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoclienteLogic.saveEstadoClientes();//WithConnection
						//estadoclienteLogic.getSetVersionRowEstadoClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadocliente,estadoclienteAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clientesEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadoclienteLogic.saveEstadoClienteRelaciones(estadoclienteAux,this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());//WithConnection
								//estadoclienteLogic.getSetVersionRowEstadoClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadocliente,estadoclienteAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoclienteAux.setClientes(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadoclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadoclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadoclienteAux,estadoclienteLogic.getEstadoClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadoclienteAux,estadoclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadocliente,estadoclienteAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadoclienteAux=new  EstadoCliente();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadoclienteSessionBean.getEsGuardarRelacionado() 
					|| (this.estadoclienteSessionBean.getEsGuardarRelacionado() && this.estadocliente.getId()>=0)) {
						
					estadoclienteAux.setIsNew(false);
				}
				
				estadoclienteAux.setIsDeleted(false);
			
				estadoclienteAux.setId(this.estadocliente.getId());	
				estadoclienteAux.setVersionRow(this.estadocliente.getVersionRow());	
				estadoclienteAux.setcodigo(this.estadocliente.getcodigo());	
				estadoclienteAux.setnombre(this.estadocliente.getnombre());	
				estadoclienteAux.setes_defecto(this.estadocliente.getes_defecto());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoclienteAux,estadoclienteLogic.getEstadoClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoclienteAux,estadoclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadoclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoclienteLogic.saveEstadoClientes();//WithConnection
						//estadoclienteLogic.getSetVersionRowEstadoClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadocliente,estadoclienteAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clientesEliminados);
						}
						//ARCHITECTURE
						
						if(!this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadoclienteLogic.saveEstadoClienteRelaciones(estadoclienteAux,this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());//WithConnection
								//estadoclienteLogic.getSetVersionRowEstadoClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadocliente,estadoclienteAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoclienteAux.setClientes(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadoclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadoclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadoclienteAux,estadoclienteLogic.getEstadoClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadoclienteAux,estadoclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadocliente,estadoclienteAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadoclienteAux=new  EstadoCliente();
				
				estadoclienteAux.setIsNew(false);
				estadoclienteAux.setIsChanged(false);
				
				estadoclienteAux.setIsDeleted(true);
				
				estadoclienteAux.setId(this.estadocliente.getId());	
				estadoclienteAux.setVersionRow(this.estadocliente.getVersionRow());	
				estadoclienteAux.setcodigo(this.estadocliente.getcodigo());	
				estadoclienteAux.setnombre(this.estadocliente.getnombre());	
				estadoclienteAux.setes_defecto(this.estadocliente.getes_defecto());	
				
				if(this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadoclienteAux.getId()>=0) {	
						this.estadoclientesEliminados.add(estadoclienteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadoclienteAux,estadoclienteLogic.getEstadoClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoclienteAux,estadoclientes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadoclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoclienteLogic.saveEstadoClientes();//WithConnection
						//estadoclienteLogic.getSetVersionRowEstadoClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clientesEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadoclienteLogic.saveEstadoClienteRelaciones(estadoclienteAux,this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());//WithConnection
								//estadoclienteLogic.getSetVersionRowEstadoClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoclienteAux.setClientes(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadoclienteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadoclienteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadoclienteAux,estadoclienteLogic.getEstadoClientes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadoclienteAux,estadoclientes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoclienteLogic.getEstadoClientes().addAll(this.estadoclientesEliminados);
					
					estadoclienteLogic.saveEstadoClientes();//WithConnection
					//estadoclienteLogic.getSetVersionRowEstadoClientes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadoclientesEliminados= new ArrayList<EstadoCliente>();		
			}
			
			if(this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Cliente GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Cliente",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadocliente=estadoclienteAux;
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
      		//this.finishProcessEstadoCliente();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoCliente estadoclienteLocal) throws Exception {
		
		if(this.estadoclienteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadoclienteLocal.setClientes(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
			
			} else {
			
				estadoclienteLocal.setClientes(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clientes);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoCliente estadoclienteLocal) throws Exception {	
		if(this.estadoclienteSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoClienteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoCliente.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadocliente =(EstadoCliente) this.estadoclienteLogic.getEstadoClientes().toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadocliente =(EstadoCliente) this.estadoclientes.toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadoclienteValidator.getInvalidValues(this.estadocliente);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoCliente estadocliente,List<EstadoCliente> estadoclientes) throws Exception {
		try	{		
			EstadoClienteConstantesFunciones.actualizarLista(estadocliente,estadoclientes,this.estadoclienteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoCliente estadocliente,List<EstadoCliente> estadoclientes) throws Exception {
		try	{			
			EstadoClienteConstantesFunciones.actualizarSelectedLista(estadocliente,estadoclientes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoCliente> estadoclientesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadoclientesLocal=this.estadoclienteLogic.getEstadoClientes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadoclientesLocal=this.estadoclientes;
			}
			//ARCHITECTURE
		
			for(EstadoCliente estadoclienteLocal:estadoclientesLocal) {
				if(this.permiteMantenimiento(estadoclienteLocal) && estadoclienteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoClienteConstantesFunciones.getEstadoClienteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoClienteConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoCliente.jLabelcodigoEstadoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoClienteConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoCliente.jLabelnombreEstadoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoClienteConstantesFunciones.ESDEFECTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoCliente.jLabeles_defectoEstadoCliente,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoCliente!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoCliente.jLabelcodigoEstadoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoCliente.jLabelnombreEstadoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoCliente.jLabeles_defectoEstadoCliente,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Cliente")) {
			if(this.estadocliente==null) {
				this.estadocliente= new EstadoCliente();
			}

			if(this.estadoclienteSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoCliente
				this.setVariablesFormularioToObjetoActualEstadoCliente(this.estadocliente,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoCliente(this.estadocliente);

				this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.getcliente().setEstadoCliente(this.estadocliente);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoCliente--;	
		
		
		this.estadoclienteAux=new EstadoCliente();
		
		this.estadoclienteAux.setId(this.iIdNuevoEstadoCliente);
		this.estadoclienteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoclienteLogic.getEstadoClientes().add(this.estadoclienteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadoclientes.add(this.estadoclienteAux);
		}
		//ARCHITECTURE
		
		this.estadocliente=this.estadoclienteAux;
		
		if(EstadoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoCliente(this.estadocliente);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoCliente(this.estadocliente);
		}
				
		//this.setDefaultControlesEstadoCliente();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoCliente();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoCliente();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoCliente();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoCliente(this.estadoclienteBean,this.estadocliente,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoCliente(this.estadocliente);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoClienteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadoclienteSessionBean.getConGuardarRelaciones()) {
			classes=EstadoClienteConstantesFunciones.getClassesRelationshipsOfEstadoCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadoclienteReturnGeneral=estadoclienteLogic.procesarEventosEstadoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoclienteLogic.getEstadoClientes(),this.estadocliente,this.estadoclienteParameterGeneral,this.isEsNuevoEstadoCliente,classes);//this.estadoclienteLogic.getEstadoCliente()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoCliente(this.estadoclienteReturnGeneral,this.estadoclienteBean,false);
		
		if(this.estadoclienteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoCliente(this.estadoclienteReturnGeneral.getEstadoCliente());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoCliente(this.estadoclienteReturnGeneral.getEstadoCliente());
		}
		
		if(this.estadoclienteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoCliente(this.estadoclienteReturnGeneral.getEstadoCliente(),classes);//this.estadoclienteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoCliente(this.estadocliente,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoCliente();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoCliente();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoClienteBeanSwingJInternalFrameAdditional.RecargarFormEstadoCliente(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoCliente(false);
						
			if(estadoclienteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoCliente();
			}
			
			this.actualizarVisualTableDatosEstadoCliente();
			
			this.jTableDatosEstadoCliente.setRowSelectionInterval(this.getIndiceNuevoEstadoCliente(), this.getIndiceNuevoEstadoCliente());
			
			this.seleccionarFilaTablaEstadoClienteActual();
						
			this.actualizarEstadoCeldasBotonesEstadoCliente("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoCliente(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoCliente.jTextFieldcodigoEstadoCliente.setEnabled(isHabilitar && this.estadoclienteConstantesFunciones.activarcodigoEstadoCliente);
		this.jInternalFrameDetalleFormEstadoCliente.jTextAreanombreEstadoCliente.setEnabled(isHabilitar && this.estadoclienteConstantesFunciones.activarnombreEstadoCliente);
		this.jInternalFrameDetalleFormEstadoCliente.jCheckBoxes_defectoEstadoCliente.setEnabled(isHabilitar && this.estadoclienteConstantesFunciones.activares_defectoEstadoCliente);	
		
	};
	
	public void setDefaultControlesEstadoCliente() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoCliente(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadoclienteSessionBean.setConGuardarRelaciones(true);			
			this.estadoclienteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoCliente.jTabbedPaneRelacionesEstadoCliente.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadoclienteSessionBean.setConGuardarRelaciones(false);			
			this.estadoclienteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoCliente.jTabbedPaneRelacionesEstadoCliente.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoCliente() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoCliente estadoclienteAux:this.estadoclienteLogic.getEstadoClientes()) {
				if(estadoclienteAux.getId().equals(this.iIdNuevoEstadoCliente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoCliente estadoclienteAux:this.estadoclientes) {
				if(estadoclienteAux.getId().equals(this.iIdNuevoEstadoCliente)) {
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
	
	public int getIndiceActualEstadoCliente(EstadoCliente estadocliente,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoCliente estadoclienteAux:this.estadoclienteLogic.getEstadoClientes()) {
				if(estadoclienteAux.getId().equals(estadocliente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoCliente estadoclienteAux:this.estadoclientes) {
				if(estadoclienteAux.getId().equals(estadocliente.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoCliente(EstadoCliente estadoclienteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoCliente estadoclienteAux:this.estadoclienteLogic.getEstadoClientes()) {
				if(estadoclienteAux.getEstadoClienteOriginal().getId().equals(estadoclienteOriginal.getId())) {
					existe=true;
					estadoclienteOriginal.setId(estadoclienteAux.getId());
					estadoclienteOriginal.setVersionRow(estadoclienteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoCliente estadoclienteAux:this.estadoclientes) {
				if(estadoclienteAux.getEstadoClienteOriginal().getId().equals(estadoclienteOriginal.getId())) {
					existe=true;
					estadoclienteOriginal.setId(estadoclienteAux.getId());
					estadoclienteOriginal.setVersionRow(estadoclienteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoCliente(Boolean esParaCancelar) throws Exception {
		estadoclientesAux=new ArrayList<EstadoCliente>();
		estadoclienteAux=new EstadoCliente();
		
		if(!this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoCliente estadoclienteAux:this.estadoclienteLogic.getEstadoClientes()) {
					if(estadoclienteAux.getId()<0) {
						estadoclientesAux.add(estadoclienteAux);
					}		
				}
				this.iIdNuevoEstadoCliente=0L;
				this.estadoclienteLogic.getEstadoClientes().removeAll(estadoclientesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoCliente estadoclienteAux:this.estadoclientes) {
					if(estadoclienteAux.getId()<0) {
						estadoclientesAux.add(estadoclienteAux);
					}		
				}
				this.iIdNuevoEstadoCliente=0L;
				this.estadoclientes.removeAll(estadoclientesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoCliente 
					&& this.estadoclienteLogic.getEstadoClientes().size()>0
					) {
					estadoclienteAux=this.estadoclienteLogic.getEstadoClientes().get(this.estadoclienteLogic.getEstadoClientes().size() - 1);
				
					if(estadoclienteAux.getId()<0) {
						this.estadoclienteLogic.getEstadoClientes().remove(estadoclienteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoCliente && this.estadoclientes.size()>0) {
					estadoclienteAux=this.estadoclientes.get(this.estadoclientes.size() - 1);
				
					if(estadoclienteAux.getId()<0) {
						this.estadoclientes.remove(estadoclienteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoCliente(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadocliente.getId()<0) {
				this.estadoclienteLogic.getEstadoClientes().remove(this.estadocliente);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadocliente.getId()<0) {
				this.estadoclientes.remove(this.estadocliente);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoCliente(List<EstadoCliente> estadoclientesAux) throws Exception {
		EstadoClienteConstantesFunciones.setEstadosInicialesEstadoCliente(estadoclientesAux);
	}
	
	public void setEstadosInicialesEstadoCliente(EstadoCliente estadoclienteAux) throws Exception {
		EstadoClienteConstantesFunciones.setEstadosInicialesEstadoCliente(estadoclienteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoClienteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoClienteActual()) {
				if(!this.isEsNuevoEstadoCliente) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoCliente=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoClienteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Cliente ?", "MANTENIMIENTO DE Estado Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoCliente estadocliente) throws Exception {
		EstadoClienteConstantesFunciones.seleccionarAsignar(this.estadocliente,estadocliente);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoCliente=this.isPermisoActualizarOriginalEstadoCliente;
			
			
			this.seleccionarAsignar(estadocliente);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoClienteConstantesFunciones.quitarEspaciosEstadoCliente(this.estadocliente,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadoclienteSessionBean.setsFuncionBusquedaRapida(this.estadoclienteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoCliente) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoCliente(esParaCancelar);				
				this.cancelarNuevoEstadoCliente(esParaCancelar);								
			}
			
			this.estadocliente=new EstadoCliente();
			
			this.inicializarEstadoCliente();
			
			this.actualizarEstadoCeldasBotonesEstadoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoCliente() throws Exception {
		try {
			EstadoClienteConstantesFunciones.inicializarEstadoCliente(this.estadocliente);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadoclienteLogic.getEstadoClientes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoClientes(String sAccionBusqueda,List<EstadoCliente> estadoclientesParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoCliente"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoClienteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoClienteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoCliente"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Clientes");		
		parameters.put("busquedapor", EstadoClienteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Cliente.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoClienteLogic estadoclienteLogicAuxiliar=new EstadoClienteLogic();
					estadoclienteLogicAuxiliar.setDatosCliente(estadoclienteLogic.getDatosCliente());				
					estadoclienteLogicAuxiliar.setEstadoClientes(estadoclientesParaReportes);
					
					estadoclienteLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoClienteWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadoclientesParaReportes=estadoclienteLogicAuxiliar.getEstadoClientes();
					
					//estadoclienteLogic.getNewConnexionToDeep();
					
					//for (EstadoCliente estadocliente:estadoclientesParaReportes) {
					//	estadoclienteLogic.deepLoad(estadocliente, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadoclienteLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadoclienteLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCliente = AuxiliarReportes.class.getResourceAsStream("ClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cliente", reportFileCliente);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoCliente=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoCliente=new JRBeanArrayDataSource(EstadoClienteJInternalFrame.TraerEstadoClienteBeans(estadoclientesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoCliente);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoClienteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoClienteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoClienteBean.TraerEstadoClienteBeans(estadoclientesParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoClientes(sAccionBusqueda,sTipoArchivoReporte,estadoclientesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoClientes(sAccionBusqueda,sTipoArchivoReporte,estadoclientesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoClienteActionPerformed(null);
					//this.generarExcelReporteEstadoClientes(sAccionBusqueda,sTipoArchivoReporte,estadoclientesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoClientes(sAccionBusqueda,sTipoArchivoReporte,estadoclientesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoClientes(sAccionBusqueda,sTipoArchivoReporte,estadoclientesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoClientes(sAccionBusqueda,sTipoArchivoReporte,estadoclientesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoCliente> estadoclientesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocliente";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoClientes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoCliente("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoCliente estadocliente : estadoclientesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoClienteConstantesFunciones.generarExcelReporteDataEstadoCliente("NORMAL",row,workbook,estadocliente,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoCliente(String sTipo,Row row,Workbook workbook) {
		
		EstadoClienteConstantesFunciones.generarExcelReporteHeaderEstadoCliente(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoCliente> estadoclientesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocliente_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoCliente estadocliente : estadoclientesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoClienteConstantesFunciones.getEstadoClienteDescripcion(estadocliente));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoClienteConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoClienteConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadocliente.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoClienteConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoClienteConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadocliente.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoClienteConstantesFunciones.LABEL_ESDEFECTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoClienteConstantesFunciones.LABEL_ESDEFECTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(estadocliente.getes_defecto()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoCliente> estadoclientesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoCliente> estadoclientesRespaldo=null;
		
		classes=EstadoClienteConstantesFunciones.getClassesRelationshipsOfEstadoCliente(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadoclienteLogic.setDatosCliente(this.datosCliente);
		this.estadoclienteLogic.setDatosDeep(this.datosDeep);
		this.estadoclienteLogic.setIsConDeep(true);
		
		estadoclientesRespaldo=this.estadoclienteLogic.getEstadoClientes();
		
		this.estadoclienteLogic.setEstadoClientes(estadoclientesParaReportes);	
		this.estadoclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadoclientesParaReportes=this.estadoclienteLogic.getEstadoClientes();
		this.estadoclienteLogic.setEstadoClientes(estadoclientesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocliente_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoCliente("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoCliente estadocliente : estadoclientesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoCliente("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoClienteConstantesFunciones.generarExcelReporteDataEstadoCliente("NORMAL",row,workbook,estadocliente,cellStyleDataAux);
		
			
			


				//Cliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadocliente.getClientes()!=null && estadocliente.getClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ClienteConstantesFunciones.generarExcelReporteHeaderCliente("RELACIONADO",row,workbook);
				}

				if(estadocliente.getClientes()!=null) {
					i2=0;
					for(Cliente cliente : estadocliente.getClientes()) {
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
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EstadoClienteConstantesFunciones.getEstadoClienteDescripcion(estadocliente));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoCliente.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoCliente.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoCliente() throws Exception {		
		this.startProcessEstadoCliente(true);
	}
	
	public void startProcessEstadoCliente(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoCliente, this.jScrollPanelDatosEstadoCliente,this.jPanelPaginacionEstadoCliente, this.jScrollPanelDatosEdicionEstadoCliente, this.jPanelAccionesEstadoCliente,this.jPanelAccionesFormularioEstadoCliente,this.jmenuBarEstadoCliente,this.jmenuBarDetalleEstadoCliente,this.jTtoolBarEstadoCliente,this.jTtoolBarDetalleEstadoCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoCliente=null; 
		
		final JPanel jPanelParametrosReportesEstadoCliente=this.jPanelParametrosReportesEstadoCliente;
		//final JScrollPane jScrollPanelDatosEstadoCliente=this.jScrollPanelDatosEstadoCliente;
		final JTable jTableDatosEstadoCliente=this.jTableDatosEstadoCliente;		
		final JPanel jPanelPaginacionEstadoCliente=this.jPanelPaginacionEstadoCliente;
		//final JScrollPane jScrollPanelDatosEdicionEstadoCliente=this.jScrollPanelDatosEdicionEstadoCliente;
		final JPanel jPanelAccionesEstadoCliente=this.jPanelAccionesEstadoCliente;
		
		JPanel jPanelCamposAuxiliarEstadoCliente=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoCliente=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoCliente!=null) {
			jPanelCamposAuxiliarEstadoCliente=this.jInternalFrameDetalleFormEstadoCliente.jPanelCamposEstadoCliente;
			jPanelAccionesFormularioAuxiliarEstadoCliente=this.jInternalFrameDetalleFormEstadoCliente.jPanelAccionesFormularioEstadoCliente;
		}
		
		final JPanel jPanelCamposEstadoCliente=jPanelCamposAuxiliarEstadoCliente;
		final JPanel jPanelAccionesFormularioEstadoCliente=jPanelAccionesFormularioAuxiliarEstadoCliente;
		
		
		final JMenuBar jmenuBarEstadoCliente=this.jmenuBarEstadoCliente;
		final JToolBar jTtoolBarEstadoCliente=this.jTtoolBarEstadoCliente;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoCliente=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoCliente!=null) {
			jmenuBarDetalleAuxiliarEstadoCliente=this.jInternalFrameDetalleFormEstadoCliente.jmenuBarDetalleEstadoCliente;
			jTtoolBarDetalleAuxiliarEstadoCliente=this.jInternalFrameDetalleFormEstadoCliente.jTtoolBarDetalleEstadoCliente;
		}
		
		final JMenuBar jmenuBarDetalleEstadoCliente=jmenuBarDetalleAuxiliarEstadoCliente;
		final JToolBar jTtoolBarDetalleEstadoCliente=jTtoolBarDetalleAuxiliarEstadoCliente;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoCliente;
			processRunnable.jTableDatos=jTableDatosEstadoCliente;
			processRunnable.jPanelCampos=jPanelCamposEstadoCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoCliente;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoCliente;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoCliente;
			processRunnable.jTtoolBar=jTtoolBarEstadoCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoCliente ,jPanelParametrosReportesEstadoCliente,jTableDatosEstadoCliente, /*jScrollPanelDatosEstadoCliente,*/jPanelCamposEstadoCliente,jPanelPaginacionEstadoCliente, /*jScrollPanelDatosEdicionEstadoCliente,*/ jPanelAccionesEstadoCliente,jPanelAccionesFormularioEstadoCliente,jmenuBarEstadoCliente,jmenuBarDetalleEstadoCliente,jTtoolBarEstadoCliente,jTtoolBarDetalleEstadoCliente);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoCliente, jScrollPanelDatosEstadoCliente,jPanelPaginacionEstadoCliente, jScrollPanelDatosEdicionEstadoCliente, jPanelAccionesEstadoCliente,jPanelAccionesFormularioEstadoCliente,jmenuBarEstadoCliente,jmenuBarDetalleEstadoCliente,jTtoolBarEstadoCliente,jTtoolBarDetalleEstadoCliente);
						
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
	
	public void finishProcessEstadoCliente() {// throws Exception 
		this.finishProcessEstadoCliente(true);
	}
	
	public void finishProcessEstadoCliente(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoCliente, this.jScrollPanelDatosEstadoCliente,this.jPanelPaginacionEstadoCliente, this.jScrollPanelDatosEdicionEstadoCliente, this.jPanelAccionesEstadoCliente,this.jPanelAccionesFormularioEstadoCliente,this.jmenuBarEstadoCliente,this.jmenuBarDetalleEstadoCliente,this.jTtoolBarEstadoCliente,this.jTtoolBarDetalleEstadoCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoCliente=null; 
		
		final JPanel jPanelParametrosReportesEstadoCliente=this.jPanelParametrosReportesEstadoCliente;
		//final JScrollPane jScrollPanelDatosEstadoCliente=this.jScrollPanelDatosEstadoCliente;
		final JTable jTableDatosEstadoCliente=this.jTableDatosEstadoCliente;		
		final JPanel jPanelPaginacionEstadoCliente=this.jPanelPaginacionEstadoCliente;
		//final JScrollPane jScrollPanelDatosEdicionEstadoCliente=this.jScrollPanelDatosEdicionEstadoCliente;
		final JPanel jPanelAccionesEstadoCliente=this.jPanelAccionesEstadoCliente;
		
		JPanel jPanelCamposAuxiliarEstadoCliente=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoCliente=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoCliente!=null) {
			jPanelCamposAuxiliarEstadoCliente=this.jInternalFrameDetalleFormEstadoCliente.jPanelCamposEstadoCliente;
			jPanelAccionesFormularioAuxiliarEstadoCliente=this.jInternalFrameDetalleFormEstadoCliente.jPanelAccionesFormularioEstadoCliente;
		}
		
		final JPanel jPanelCamposEstadoCliente=jPanelCamposAuxiliarEstadoCliente;
		final JPanel jPanelAccionesFormularioEstadoCliente=jPanelAccionesFormularioAuxiliarEstadoCliente;
		
		
		final JMenuBar jmenuBarEstadoCliente=this.jmenuBarEstadoCliente;		
		final JToolBar jTtoolBarEstadoCliente=this.jTtoolBarEstadoCliente;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoCliente=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoCliente!=null) {
			jmenuBarDetalleAuxiliarEstadoCliente=this.jInternalFrameDetalleFormEstadoCliente.jmenuBarDetalleEstadoCliente;
			jTtoolBarDetalleAuxiliarEstadoCliente=this.jInternalFrameDetalleFormEstadoCliente.jTtoolBarDetalleEstadoCliente;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoCliente=jmenuBarDetalleAuxiliarEstadoCliente;
		final JToolBar jTtoolBarDetalleEstadoCliente=jTtoolBarDetalleAuxiliarEstadoCliente;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoCliente;
			processRunnable.jTableDatos=jTableDatosEstadoCliente;
			processRunnable.jPanelCampos=jPanelCamposEstadoCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoCliente;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoCliente;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoCliente;
			processRunnable.jTtoolBar=jTtoolBarEstadoCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoCliente ,jPanelParametrosReportesEstadoCliente, jTableDatosEstadoCliente,/*jScrollPanelDatosEstadoCliente,*/jPanelCamposEstadoCliente,jPanelPaginacionEstadoCliente, /*jScrollPanelDatosEdicionEstadoCliente,*/ jPanelAccionesEstadoCliente,jPanelAccionesFormularioEstadoCliente,jmenuBarEstadoCliente,jmenuBarDetalleEstadoCliente,jTtoolBarEstadoCliente,jTtoolBarDetalleEstadoCliente));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoCliente(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoCliente(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoCliente(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoCliente,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoCliente,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadoclienteConstantesFunciones.getsFinalQueryEstadoCliente();
		String  finalQueryPaginacionTodos=this.estadoclienteConstantesFunciones.getsFinalQueryEstadoCliente();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoClienteConstantesFunciones.getArrayColumnasGlobalesNoEstadoCliente(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoClienteConstantesFunciones.getArrayColumnasGlobalesEstadoCliente(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoClienteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadoclientesEliminados= new ArrayList<EstadoCliente>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoCliente();
		
				///*EstadoClienteSessionBean*/this.estadoclienteSessionBean=new EstadoClienteSessionBean();
			
			if(this.estadoclienteSessionBean==null) {
				this.estadoclienteSessionBean=new EstadoClienteSessionBean();
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
					this.iNumeroPaginacion=EstadoClienteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoClienteConstantesFunciones.getClassesForeignKeysOfEstadoCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadocliente."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadoclientesAux= new ArrayList<EstadoCliente>();
			
				
			estadoclienteLogic.setDatosCliente(this.datosCliente);
			estadoclienteLogic.setDatosDeep(this.datosDeep);
			estadoclienteLogic.setIsConDeep(true);
			
			
			estadoclienteLogic.getEstadoClienteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadoclienteLogic.getTodosEstadoClientes(finalQueryGlobal,pagination);
					
					//estadoclienteLogic.getTodosEstadoClientesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadoclienteLogic.getEstadoClientes()==null|| estadoclienteLogic.getEstadoClientes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoclientesAux= new ArrayList<EstadoCliente>();
							estadoclientesAux.addAll(estadoclienteLogic.getEstadoClientes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoclientesAux= new ArrayList<EstadoCliente>();
							estadoclientesAux.addAll(estadoclientes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoclienteLogic.getTodosEstadoClientes(finalQueryGlobal+"",this.pagination);												
							
							//estadoclienteLogic.getTodosEstadoClientesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoClientes("Todos",estadoclienteLogic.getEstadoClientes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoclienteLogic.setEstadoClientes(new ArrayList<EstadoCliente>());					
							estadoclienteLogic.getEstadoClientes().addAll(estadoclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoclientes=new ArrayList<EstadoCliente>();
							estadoclientes.addAll(estadoclientesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoCliente=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoCliente=this.idActual;
				
				} else if(this.idEstadoClienteActual!=null && this.idEstadoClienteActual!=0L) {
					idEstadoCliente=idEstadoClienteActual;
				}
				
					
				this.sDetalleReporte=EstadoClienteConstantesFunciones.getDetalleIndicePorId(idEstadoCliente);
				
				this.estadoclientes=new ArrayList<EstadoCliente>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadoclienteLogic.getEntity(idEstadoCliente);
					
					//estadoclienteLogic.getEntityWithConnection(idEstadoCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoclienteLogic.setEstadoClientes(new ArrayList<EstadoCliente>());
					estadoclienteLogic.getEstadoClientes().add(estadoclienteLogic.getEstadoCliente());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoclientes=new ArrayList<EstadoCliente>();
					this.estadoclientes.add(estadocliente);
				}
				
				if(estadoclienteLogic.getEstadoCliente()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoCliente();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoCliente();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoclienteLogic.getEstadoClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoclientes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoclienteLogic.getEstadoClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoclientes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoCliente estadocliente) {
		Boolean permite=true;
		
		if(this.estadocliente.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoClienteConstantesFunciones.getOrderByListaEstadoCliente();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoClienteConstantesFunciones.getOrderByListaEstadoCliente();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoCliente estadocliente:estadoclienteLogic.getEstadoClientes()) {
				if(estadocliente.getsType().equals(Constantes2.S_TOTALES)) {
					estadoclienteTotales=estadocliente;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoCliente estadocliente:this.estadoclientes) {
				if(estadocliente.getsType().equals(Constantes2.S_TOTALES)) {
					estadoclienteTotales=estadocliente;
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
			this.estadoclienteAux=new EstadoCliente();
			this.estadoclienteAux.setsType(Constantes2.S_TOTALES);
			this.estadoclienteAux.setIsNew(false);
			this.estadoclienteAux.setIsChanged(false);
			this.estadoclienteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoClienteConstantesFunciones.TotalizarValoresFilaEstadoCliente(this.estadoclienteLogic.getEstadoClientes(),this.estadoclienteAux);
				
				this.estadoclienteLogic.getEstadoClientes().add(this.estadoclienteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoClienteConstantesFunciones.TotalizarValoresFilaEstadoCliente(this.estadoclientes,this.estadoclienteAux);
				
				this.estadoclientes.add(this.estadoclienteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadoclienteTotales=new EstadoCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoclienteLogic.getEstadoClientes().remove(estadoclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoclientes.remove(estadoclienteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadoclienteTotales=new EstadoCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoCliente estadocliente:estadoclienteLogic.getEstadoClientes()) {
				if(estadocliente.getsType().equals(Constantes2.S_TOTALES)) {
					estadoclienteTotales=estadocliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoClienteConstantesFunciones.TotalizarValoresFilaEstadoCliente(this.estadoclienteLogic.getEstadoClientes(),estadoclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoCliente estadocliente:this.estadoclientes) {
				if(estadocliente.getsType().equals(Constantes2.S_TOTALES)) {
					estadoclienteTotales=estadocliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoClienteConstantesFunciones.TotalizarValoresFilaEstadoCliente(this.estadoclientes,estadoclienteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEstadoClientePorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getEstadoClientePorCodigo(String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoclienteLogic.getEstadoClientePorCodigo(codigo);
				
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
	
	public void inicializarPermisosEstadoCliente() {
		this.isPermisoTodoEstadoCliente=false;
		this.isPermisoNuevoEstadoCliente=false;
		this.isPermisoActualizarEstadoCliente=false;
		this.isPermisoActualizarOriginalEstadoCliente=false;
		this.isPermisoEliminarEstadoCliente=false;
		this.isPermisoGuardarCambiosEstadoCliente=false;
		this.isPermisoConsultaEstadoCliente=false;
		this.isPermisoBusquedaEstadoCliente=false;
		this.isPermisoReporteEstadoCliente=false;		
		this.isPermisoOrdenEstadoCliente=false;		
		this.isPermisoPaginacionMedioEstadoCliente=false;		
		this.isPermisoPaginacionAltoEstadoCliente=false;
		this.isPermisoPaginacionTodoEstadoCliente=false;
		this.isPermisoCopiarEstadoCliente=false;		
		this.isPermisoVerFormEstadoCliente=false;		
		this.isPermisoDuplicarEstadoCliente=false;		
		this.isPermisoOrdenEstadoCliente=false;		
	}
	
	public void setPermisosUsuarioEstadoCliente(Boolean isPermiso) {
		this.isPermisoTodoEstadoCliente=isPermiso;
		this.isPermisoNuevoEstadoCliente=isPermiso;
		this.isPermisoActualizarEstadoCliente=isPermiso;
		this.isPermisoActualizarOriginalEstadoCliente=isPermiso;
		this.isPermisoEliminarEstadoCliente=isPermiso;
		this.isPermisoGuardarCambiosEstadoCliente=isPermiso;
		this.isPermisoConsultaEstadoCliente=isPermiso;
		this.isPermisoBusquedaEstadoCliente=isPermiso;
		this.isPermisoReporteEstadoCliente=isPermiso;
		this.isPermisoOrdenEstadoCliente=isPermiso;		
		this.isPermisoPaginacionMedioEstadoCliente=isPermiso;		
		this.isPermisoPaginacionAltoEstadoCliente=isPermiso;		
		this.isPermisoPaginacionTodoEstadoCliente=isPermiso;		
		this.isPermisoCopiarEstadoCliente=isPermiso;		
		this.isPermisoVerFormEstadoCliente=isPermiso;		
		this.isPermisoDuplicarEstadoCliente=isPermiso;
		this.isPermisoOrdenEstadoCliente=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoCliente(Boolean isPermiso) {
		//this.isPermisoTodoEstadoCliente=isPermiso;
		this.isPermisoNuevoEstadoCliente=isPermiso;
		this.isPermisoActualizarEstadoCliente=isPermiso;
		this.isPermisoActualizarOriginalEstadoCliente=isPermiso;
		this.isPermisoEliminarEstadoCliente=isPermiso;
		this.isPermisoGuardarCambiosEstadoCliente=isPermiso;
		//this.isPermisoConsultaEstadoCliente=isPermiso;
		//this.isPermisoBusquedaEstadoCliente=isPermiso;
		//this.isPermisoReporteEstadoCliente=isPermiso;
		//this.isPermisoOrdenEstadoCliente=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoCliente=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoCliente=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoCliente=isPermiso;		
		//this.isPermisoCopiarEstadoCliente=isPermiso;		
		//this.isPermisoDuplicarEstadoCliente=isPermiso;
		//this.isPermisoOrdenEstadoCliente=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoClienteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosCliente=this.verificarGetPermisosUsuarioOpcionEstadoClienteClaseRelacionada(this.opcionsRelacionadas,ClienteConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoCliente(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoClienteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCliente=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoClienteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoClienteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoClienteClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCliente && this.jInternalFrameDetalleFormEstadoCliente!=null && this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoCliente.jTabbedPaneRelacionesEstadoCliente.remove(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoCliente() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoClienteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoCliente=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoCliente=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoCliente=this.isPermisoActualizarEstadoCliente;
			this.isPermisoEliminarEstadoCliente=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoCliente=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoCliente=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoCliente=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoCliente=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoCliente=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoCliente=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoCliente=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoCliente=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoCliente=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoCliente=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoCliente=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoCliente.setToolTipText(this.jTableDatosEstadoCliente.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoCliente(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoCliente(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoCliente() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCliente && this.estadoclienteConstantesFunciones.mostrarClienteEstadoCliente && !EstadoClienteConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cliente");
			reporte.setsDescripcion("Cliente");
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
	
		
	public void inicializarCombosForeignKeyEstadoClienteListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoClienteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoClienteListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoCliente()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoCliente();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoCliente(EstadoCliente estadocliente)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoCliente(EstadoCliente estadocliente,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoCliente()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoCliente()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoCliente()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoCliente()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoCliente()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoClienteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoClienteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoClienteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadoclienteSessionBean=new EstadoClienteSessionBean(); 
		this.estadoclienteConstantesFunciones=new EstadoClienteConstantesFunciones(); 
		this.estadoclienteBean=new EstadoCliente();//(this.estadoclienteConstantesFunciones); 		
		this.estadoclienteReturnGeneral=new EstadoClienteParameterReturnGeneral(); 
		
		this.estadoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoCliente(true);
			
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
			
			this.estadoclienteConstantesFunciones=new EstadoClienteConstantesFunciones(); 
			this.estadoclienteBean=new EstadoCliente();//this.estadoclienteConstantesFunciones); 			
			this.estadoclienteReturnGeneral=new EstadoClienteParameterReturnGeneral(); 
		
			EstadoClienteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Cliente Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadocliente=new EstadoCliente();
			this.estadoclientes = new ArrayList<EstadoCliente>();
			this.estadoclientesAux = new ArrayList<EstadoCliente>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic=new EstadoClienteLogic();
				this.estadoclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estadoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoCliente);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoCliente);	
					}
					
					if(this.jInternalFrameImportacionEstadoCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoCliente);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoCliente);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoCliente!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoCliente);
				this.jInternalFrameDetalleFormEstadoCliente.setVisible(false);
				this.jInternalFrameDetalleFormEstadoCliente.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoCliente);
					this.jInternalFrameReporteDinamicoEstadoCliente.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoCliente.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoCliente);
					this.jInternalFrameImportacionEstadoCliente.setVisible(false);
					this.jInternalFrameImportacionEstadoCliente.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoCliente);
					this.jInternalFrameOrderByEstadoCliente.setVisible(false);
					this.jInternalFrameOrderByEstadoCliente.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoClienteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoClienteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadoclienteReturnGeneral=new EstadoClienteParameterReturnGeneral();
			
			this.estadoclienteParameterGeneral=new EstadoClienteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadoclienteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoclienteSessionBean.getEsGuardarRelacionado(),this.estadoclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoclienteSessionBean.getEsGuardarRelacionado(),this.estadoclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoCliente=false;
			this.isVisibilidadCeldaDuplicarEstadoCliente=true;
			this.isVisibilidadCeldaCopiarEstadoCliente=true;
			this.isVisibilidadCeldaVerFormEstadoCliente=true;
			this.isVisibilidadCeldaOrdenEstadoCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCliente=false;
			this.isVisibilidadCeldaModificarEstadoCliente=false;
			this.isVisibilidadCeldaActualizarEstadoCliente=false;
			this.isVisibilidadCeldaEliminarEstadoCliente=false;
			this.isVisibilidadCeldaCancelarEstadoCliente=false;
			this.isVisibilidadCeldaGuardarEstadoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCliente=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoCliente();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoCliente(false);
			
			this.setPermisosUsuarioEstadoCliente();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoclienteSessionBean.getEsGuardarRelacionado() 
				|| (this.estadoclienteSessionBean.getEsGuardarRelacionado() && this.estadoclienteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoClienteClasesRelacionadas();
			}
			
			if(this.estadoclienteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoClienteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoCliente();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoCliente();
			}
			
			if(!this.isPermisoBusquedaEstadoCliente) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoclienteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoCliente,this.isPermisoPaginacionMedioEstadoCliente,this.isPermisoPaginacionTodoEstadoCliente);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoClienteConstantesFunciones.getTiposSeleccionarEstadoCliente());
				
				this.tiposColumnasSelect=EstadoClienteConstantesFunciones.getTiposSeleccionarEstadoCliente(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoCliente();				
				//this.tiposRelacionesSelect=EstadoClienteConstantesFunciones.getTiposRelacionesEstadoCliente(true);
				
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
			//if(!this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoCliente();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoCliente(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoCliente(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoCliente() ;
			
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
				estadoclienteImplementable= (EstadoClienteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadoclienteImplementableHome= (EstadoClienteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadoclientes= new ArrayList<EstadoCliente>();
			this.estadoclientesEliminados= new ArrayList<EstadoCliente>();
						
			this.isEsNuevoEstadoCliente=false;
			this.esParaAccionDesdeFormularioEstadoCliente=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoCliente(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoCliente();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadoClienteBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoClienteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoCliente(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoCliente!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoCliente();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoCliente();
			}
			
			EstadoClienteBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoCliente(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoCliente: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoCliente() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoCliente")) {
				iIndex=this.jInternalFrameDetalleFormEstadoCliente.jTabbedPaneRelacionesEstadoCliente.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoCliente.jTabbedPaneRelacionesEstadoCliente.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoCliente.getSelectedRow();	
				
				

				if(sTitle.equals("Clientes")) {
					if(!ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoCliente();

						this.cargarParteTabPanelRelacionadaCliente(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoCliente();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoCliente.cargarSessionConBeanSwingJInternalFrameCliente(false,true,iIndex);
		this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCliente();

		//this.jTabbedPaneRelacionesEstadoCliente.updateUI();
		//this.jTabbedPaneRelacionesEstadoCliente.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoCliente.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Cliente")) {
				int row=this.jTableDatosEstadoCliente.getSelectedRow();
				jButtonClienteActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Cliente")) {

					if(this.isTienePermisosCliente && this.estadoclienteConstantesFunciones.mostrarClienteEstadoCliente && !EstadoClienteConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Clientes"+"("+ClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Clientes");

						if(estadoclienteConstantesFunciones.resaltarClienteEstadoCliente!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadoclienteConstantesFunciones.resaltarClienteEstadoCliente);
						}

						jmenuItem.setEnabled(this.estadoclienteConstantesFunciones.activarClienteEstadoCliente);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Cliente"));

						

						this.jInternalFrameDetalleFormEstadoCliente.jmenuDetalleEstadoCliente.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoCliente(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoCliente(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoClienteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoCliente();
		
		this.cargarCombosFrameForeignKeyEstadoCliente();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoCliente();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoCliente();
		}
	}
	
	
	
	public void jButtonNuevoEstadoClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadoclienteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
			
			
			if(jTableDatosEstadoCliente.getRowCount()>=1) {
				jTableDatosEstadoCliente.removeRowSelectionInterval(0, jTableDatosEstadoCliente.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoCliente=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoCliente(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoCliente(true);			
			//this.estadocliente=new EstadoCliente();
			//this.estadocliente.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoCliente(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoCliente() ;
			
			if(EstadoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoCliente(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadocliente);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadocliente);				
			
			EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
			
			if(this.estadoclienteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoCliente: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoCliente> estadoclientesSeleccionados=new ArrayList<EstadoCliente>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoCliente.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoCliente.getSelectedRows().length;			
			}
			
			estadoclientesSeleccionados=this.getEstadoClientesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoCliente--;			
				//EstadoCliente estadoclienteAux= new EstadoCliente();			
				//estadoclienteAux.setId(this.iIdNuevoEstadoCliente);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoCliente estadoclienteOrigen=new EstadoCliente();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoCliente estadoclienteOrigen : estadoclientesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoCliente.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadoclienteOrigen =(EstadoCliente) this.estadoclienteLogic.getEstadoClientes().toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoclienteOrigen =(EstadoCliente) this.estadoclientes.toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoCliente();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadocliente.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoCliente(estadoclienteOrigen,this.estadocliente,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCliente(this.estadocliente);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoclienteLogic.getEstadoClientes().add(this.estadoclienteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoclientes.add(this.estadoclienteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoCliente(false);
				
				this.jTableDatosEstadoCliente.setRowSelectionInterval(this.getIndiceNuevoEstadoCliente(), this.getIndiceNuevoEstadoCliente());
				
				int iLastRow =  this.jTableDatosEstadoCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoCliente(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoCliente> estadoclientesSeleccionados=new ArrayList<EstadoCliente>();									
		
			EstadoCliente estadoclienteOrigen=new EstadoCliente();
			EstadoCliente estadoclienteDestino=new EstadoCliente();
				
			estadoclientesSeleccionados=this.getEstadoClientesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoCliente.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadoclientesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoCliente.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoclienteOrigen =(EstadoCliente) this.estadoclienteLogic.getEstadoClientes().toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoclienteOrigen =(EstadoCliente) this.estadoclientes.toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoclienteDestino =(EstadoCliente) this.estadoclienteLogic.getEstadoClientes().toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoclienteDestino =(EstadoCliente) this.estadoclientes.toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadoclienteOrigen =estadoclientesSeleccionados.get(0);
				estadoclienteDestino =estadoclientesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoCliente(estadoclienteOrigen,estadoclienteDestino,true,false);
				
				estadoclienteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoclienteDestino,estadoclienteLogic.getEstadoClientes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoclienteDestino,estadoclientes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoCliente(false);
				
				//this.jTableDatosEstadoCliente.setRowSelectionInterval(this.getIndiceNuevoEstadoCliente(), this.getIndiceNuevoEstadoCliente());
				
				int iLastRow =  this.jTableDatosEstadoCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoCliente(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoCliente.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoCliente.isVisible();
			
			
			this.jPanelParametrosReportesEstadoCliente.setVisible(!isVisible);
			this.jPanelPaginacionEstadoCliente.setVisible(!isVisible);
			this.jPanelAccionesEstadoCliente.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoCliente();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoCliente();
			
			this.abrirFrameOrderByEstadoCliente();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoCliente(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoCliente);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoCliente.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoCliente.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoCliente.setSize(this.jInternalFrameDetalleFormEstadoCliente.iWidthFormulario,this.jInternalFrameDetalleFormEstadoCliente.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoCliente.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoCliente.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoCliente.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoCliente.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoCliente.jContentPaneDetalleEstadoCliente.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoCliente.jTabbedPaneRelacionesEstadoCliente.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoCliente.jContentPaneDetalleEstadoCliente.getWidth(),EstadoClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoCliente.jTabbedPaneRelacionesEstadoCliente.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoCliente.jContentPaneDetalleEstadoCliente.getWidth(),EstadoClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoCliente.jTabbedPaneRelacionesEstadoCliente.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoCliente.jContentPaneDetalleEstadoCliente.getWidth(),EstadoClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCliente();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoCliente.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoCliente.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoCliente==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoCliente,false,this);
				} else {
					this.jInternalFrameOrderByEstadoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoCliente,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoCliente);
				this.jInternalFrameOrderByEstadoCliente.setVisible(false);
				this.jInternalFrameOrderByEstadoCliente.setSelected(false);
				
				this.jInternalFrameOrderByEstadoCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoCliente"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoCliente();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoCliente==null) {
				
				this.jInternalFrameImportacionEstadoCliente=new ImportacionJInternalFrame(EstadoClienteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoCliente);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoCliente);
				this.jInternalFrameImportacionEstadoCliente.setVisible(false);
				this.jInternalFrameImportacionEstadoCliente.setSelected(false);


				this.jInternalFrameImportacionEstadoCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoCliente"));
				this.jInternalFrameImportacionEstadoCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoCliente"));
				this.jInternalFrameImportacionEstadoCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoCliente"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoCliente() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoCliente==null) {
				this.jInternalFrameReporteDinamicoEstadoCliente=new ReporteDinamicoJInternalFrame(EstadoClienteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoCliente);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoCliente);
				this.jInternalFrameReporteDinamicoEstadoCliente.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoCliente.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoCliente"));
				this.jInternalFrameReporteDinamicoEstadoCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoCliente"));
				this.jInternalFrameReporteDinamicoEstadoCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoCliente"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoCliente();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoCliente.jContentPaneDetalleEstadoCliente.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoCliente() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoCliente);
			
	       	this.jInternalFrameDetalleFormEstadoCliente.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoCliente.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoCliente.dispose();
			//this.jInternalFrameDetalleFormEstadoCliente=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoCliente() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoCliente.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoCliente.setVisible(true);
	        this.jInternalFrameImportacionEstadoCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoCliente.setVisible(true);
	        this.jInternalFrameOrderByEstadoCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoCliente.setVisible(false);
	        this.jInternalFrameOrderByEstadoCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoCliente() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoCliente.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoCliente.setVisible(false);
	        this.jInternalFrameImportacionEstadoCliente.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoCliente(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoCliente(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoCliente.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoCliente(true);
			//this.isEsNuevoEstadoCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocliente =(EstadoCliente) this.estadoclienteLogic.getEstadoClientes().toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadocliente =(EstadoCliente) this.estadoclientes.toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoCliente(false) ;
			
			if(estadoclienteSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoCliente(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoClienteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocliente =(EstadoCliente) this.estadoclienteLogic.getEstadoClientes().toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocliente =(EstadoCliente) this.estadoclientes.toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoCliente(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoCliente.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoCliente(true);
			//this.isEsNuevoEstadoCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocliente =(EstadoCliente) this.estadoclienteLogic.getEstadoClientes().toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadocliente =(EstadoCliente) this.estadoclientes.toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadocliente.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoCliente(false) ;
			
			if(EstadoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoCliente(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoCliente(false);
			
			//if(!this.isEsNuevoEstadoCliente) {								
				int intSelectedRow = this.jTableDatosEstadoCliente.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocliente =(EstadoCliente) this.estadoclienteLogic.getEstadoClientes().toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadocliente =(EstadoCliente) this.estadoclientes.toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoCliente(this.estadocliente,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoCliente(this.estadocliente);
				
			}
			
			if(this.permiteMantenimiento(this.estadocliente)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoCliente=true;
					this.inicializarActualizarBindingTablaEstadoCliente(false);
					this.isEsNuevoEstadoCliente=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoCliente=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoCliente=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoCliente(false);
				
				this.habilitarDeshabilitarControlesEstadoCliente(false);
			
												
				
				if(EstadoClienteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoCliente();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoClienteActionPerformed(evt,estadoclienteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoCliente(this.estadocliente,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoCliente.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadoclienteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadocliente.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoCliente.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCliente.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoCliente.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocliente =(EstadoCliente) this.estadoclienteLogic.getEstadoClientes().toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
				this.estadocliente.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadocliente =(EstadoCliente) this.estadoclientes.toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
				this.estadocliente.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadocliente)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoClienteModel) this.jTableDatosEstadoCliente.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoCliente=true;
				this.inicializarActualizarBindingTablaEstadoCliente(false);
				this.isEsNuevoEstadoCliente=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoCliente(false);
				
				this.habilitarDeshabilitarControlesEstadoCliente(false);
				
				
				
				if(EstadoClienteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoCliente();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoClienteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoCliente.getRowCount()>=1) {
				jTableDatosEstadoCliente.removeRowSelectionInterval(0, jTableDatosEstadoCliente.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoCliente(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoCliente(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoCliente(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoCliente(false) ;
			
			this.isEsNuevoEstadoCliente=false;
			
			if(EstadoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoCliente();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoCliente(false);
				
				//SI ES MANUAL
				if(EstadoClienteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoCliente();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoCliente--;			
			//EstadoCliente estadoclienteAux= new EstadoCliente();			
			//estadoclienteAux.setId(this.iIdNuevoEstadoCliente);
			
			if(this.jInternalFrameDetalleFormEstadoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoCliente();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoCliente(this.estadocliente);
			
			this.estadocliente.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadoclienteLogic.getEstadoClientes().add(this.estadoclienteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadoclientes.add(this.estadoclienteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoCliente(false);
			
			this.jTableDatosEstadoCliente.setRowSelectionInterval(this.getIndiceNuevoEstadoCliente(), this.getIndiceNuevoEstadoCliente());
			
			int iLastRow =  this.jTableDatosEstadoCliente.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoCliente.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoCliente.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoCliente(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoCliente(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoCliente(false);
			
			//SI ES MANUAL
			if(EstadoClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoCliente();
			}
			
			//this.abrirFrameTreeEstadoCliente();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado ClienteS ?", "MANTENIMIENTO DE Estado Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoCliente.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoCliente();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadoclienteReturnGeneral=estadoclienteLogic.procesarImportacionEstadoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadoclienteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoClienteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoCliente.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoCliente.setFileImportacion(this.jInternalFrameImportacionEstadoCliente.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoCliente.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoCliente.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoCliente.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoCliente.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoCliente> estadoclientesSeleccionados=new ArrayList<EstadoCliente>();		

		estadoclientesSeleccionados=this.getEstadoClientesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoClienteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoClienteBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoClientes("Todos",estadoclientesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoClienteConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoClienteConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoClienteConstantesFunciones.LABEL_ESDEFECTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Defecto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Defecto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Defecto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Defecto_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoEstadoCliente.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoCliente.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoCliente.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoClienteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoClienteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case EstadoClienteConstantesFunciones.LABEL_ESDEFECTO:
					sNombreCampoCategoria="es_defecto";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoCliente.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoClienteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoClienteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case EstadoClienteConstantesFunciones.LABEL_ESDEFECTO:
					sNombreCampoCategoriaValor="es_defecto";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoCliente.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoCliente.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoClienteConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoClienteConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case EstadoClienteConstantesFunciones.LABEL_ESDEFECTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Defecto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_defecto");
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoClienteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoCliente> estadoclientesSeleccionados=new ArrayList<EstadoCliente>();		
		
		estadoclientesSeleccionados=this.getEstadoClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocliente";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoClienteConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoClienteConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoCliente estadocliente:estadoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadocliente.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoClienteConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoClienteConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoCliente estadocliente:estadoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadocliente.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoClienteConstantesFunciones.LABEL_ESDEFECTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoClienteConstantesFunciones.LABEL_ESDEFECTO);
					iRow++;

					for(EstadoCliente estadocliente:estadoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadocliente.getes_defecto());
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
			//	this.getFilaCabeceraExportarExcelEstadoCliente(row);				
			//	iRow++;
			//}				
			
			//for(EstadoCliente estadoclienteAux:estadoclientesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoCliente(estadoclienteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Cliente",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoCliente(false);
			
			//SI ES MANUAL
			if(EstadoClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoCliente();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoCliente(false);
			
			//SI ES MANUAL
			if(EstadoClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoCliente();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoCliente(false);
			
			//SI ES MANUAL
			if(EstadoClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoCliente();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoCliente() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoCliente.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoCliente.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoCliente.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoCliente.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoCliente.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoCliente.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoCliente.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoCliente(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoCliente(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoCliente(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoCliente(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoCliente(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoCliente(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoCliente(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoCliente(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoClienteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoClienteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoCliente() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoCliente();
		
		this.inicializarActualizarBindingBotonesManualEstadoCliente(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoCliente();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoCliente() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoCliente(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoCliente(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoCliente.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoCliente.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoCliente.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoCliente!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoCliente.jCheckBoxPostAccionNuevoEstadoCliente.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoCliente.jCheckBoxPostAccionSinCerrarEstadoCliente.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoCliente.jCheckBoxPostAccionSinMensajeEstadoCliente.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoCliente.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoCliente.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoCliente.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoCliente!=null) {
				this.jInternalFrameDetalleFormEstadoCliente.jCheckBoxPostAccionNuevoEstadoCliente.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoCliente.jCheckBoxPostAccionSinCerrarEstadoCliente.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoCliente.jCheckBoxPostAccionSinMensajeEstadoCliente.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoCliente.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoCliente.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoCliente!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoCliente.jComboBoxTiposAccionesFormularioEstadoCliente.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoCliente.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoCliente!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoCliente.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoCliente.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoCliente!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoCliente.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoCliente.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoCliente(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoClienteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoCliente(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoCliente() throws Exception {
		try	{
			if(EstadoClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoCliente();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoCliente() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoCliente.jComboBoxTiposAccionesFormularioEstadoCliente.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoCliente.jComboBoxTiposAccionesFormularioEstadoCliente.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoCliente() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoCliente.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoCliente.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoCliente.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoCliente.addItem(reporte);
			}
			
			
			if(!this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoCliente!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoCliente.jComboBoxTiposAccionesFormularioEstadoCliente.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoCliente.jComboBoxTiposAccionesFormularioEstadoCliente.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoCliente.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoCliente.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoCliente();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoCliente() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoCliente!=null) {
				this.jInternalFrameReporteDinamicoEstadoCliente.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoCliente.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoCliente!=null) {
				this.jInternalFrameReporteDinamicoEstadoCliente.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoCliente.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoCliente!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoCliente.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoCliente.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoCliente.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoCliente.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoCliente.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoCliente.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoCliente()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoCliente(Boolean esInicializar) throws Exception {				
		if(EstadoClienteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoCliente();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoCliente() throws Exception {
		this.inicializarActualizarBindingTablaEstadoCliente(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoCliente() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoCliente.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoCliente.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoCliente.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoClienteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoClienteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoClientePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoCliente.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoClientePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoCliente.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoCliente(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadoclienteLogic.getEstadoClientes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadoclientes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoCliente.setModel(new EstadoClienteModel(this.estadoclienteLogic.getEstadoClientes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoCliente.setModel(new EstadoClienteModel(this.estadoclientes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoCliente!=null && this.jInternalFrameOrderByEstadoCliente.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoCliente();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoCliente,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoClientePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO,estadoclienteConstantesFunciones.resaltarSeleccionarEstadoCliente,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoClienteConstantesFunciones.SCLASSWEBTITULO,estadoclienteConstantesFunciones.resaltarSeleccionarEstadoCliente,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoCliente,EstadoClienteConstantesFunciones.LABEL_ID));

		if(this.estadoclienteConstantesFunciones.mostraridEstadoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoClienteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadoclienteConstantesFunciones.resaltaridEstadoCliente,this.estadoclienteConstantesFunciones.activaridEstadoCliente,this,true,"idEstadoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoclienteConstantesFunciones.resaltaridEstadoCliente,this.estadoclienteConstantesFunciones.activaridEstadoCliente,this,true,"idEstadoCliente","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoCliente,EstadoClienteConstantesFunciones.LABEL_CODIGO));

		if(this.estadoclienteConstantesFunciones.mostrarcodigoEstadoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoClienteConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoclienteConstantesFunciones.resaltarcodigoEstadoCliente,this.estadoclienteConstantesFunciones.activarcodigoEstadoCliente,this,true,"codigoEstadoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoclienteConstantesFunciones.resaltarcodigoEstadoCliente,this.estadoclienteConstantesFunciones.activarcodigoEstadoCliente,this,true,"codigoEstadoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoCliente,EstadoClienteConstantesFunciones.LABEL_NOMBRE));

		if(this.estadoclienteConstantesFunciones.mostrarnombreEstadoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoClienteConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoclienteConstantesFunciones.resaltarnombreEstadoCliente,this.estadoclienteConstantesFunciones.activarnombreEstadoCliente,this,true,"nombreEstadoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoclienteConstantesFunciones.resaltarnombreEstadoCliente,this.estadoclienteConstantesFunciones.activarnombreEstadoCliente,this,true,"nombreEstadoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoCliente,EstadoClienteConstantesFunciones.LABEL_ESDEFECTO));

		if(this.estadoclienteConstantesFunciones.mostrares_defectoEstadoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoClienteConstantesFunciones.LABEL_ESDEFECTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.estadoclienteConstantesFunciones.resaltares_defectoEstadoCliente,this.estadoclienteConstantesFunciones.activares_defectoEstadoCliente));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.estadoclienteConstantesFunciones.resaltares_defectoEstadoCliente,this.estadoclienteConstantesFunciones.activares_defectoEstadoCliente,this,true,"es_defectoEstadoCliente","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EstadoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadoclienteSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCliente && this.estadoclienteConstantesFunciones.mostrarClienteEstadoCliente && !EstadoClienteConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Clientes");
				tableColumn.setHeaderValue("Clientes");
				tableColumn.setCellRenderer(new ClienteTableCell(estadoclienteConstantesFunciones.resaltarClienteEstadoCliente,this,this.estadoclienteConstantesFunciones.activarClienteEstadoCliente));
				tableColumn.setCellEditor(new ClienteTableCell(estadoclienteConstantesFunciones.resaltarClienteEstadoCliente,this,this.estadoclienteConstantesFunciones.activarClienteEstadoCliente));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoCliente.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoclienteSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoCliente.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoclienteSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoCliente.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoCliente && this.isPermisoGuardarCambiosEstadoCliente) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadoclienteSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadoclienteSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoCliente.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadoclienteSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoCliente.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoCliente.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoCliente && this.isPermisoGuardarCambiosEstadoCliente) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadoclienteSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoCliente && this.isPermisoGuardarCambiosEstadoCliente) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoCliente.moveColumn(this.jTableDatosEstadoCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoCliente.moveColumn(this.jTableDatosEstadoCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadoclienteSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoCliente.moveColumn(this.jTableDatosEstadoCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoCliente.moveColumn(this.jTableDatosEstadoCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoCliente.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoCliente.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoCliente,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoCliente.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoCliente.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoCliente.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoCliente.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoCliente.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadoclienteLogic.getEstadoClientes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadoclientes.size()-1;
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
		//this.jTableDatosEstadoCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoCliente();
			
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
				
				//this.isEsNuevoEstadoCliente=false;
					
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
			
				if(this.estadoclienteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoCliente==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoCliente.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocliente =(EstadoCliente) this.estadoclienteLogic.getEstadoClientes().toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocliente =(EstadoCliente) this.estadoclientes.toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadocliente.getsType().equals("DUPLICADO")
				   || this.estadocliente.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoCliente=true;
				
				} else {
					this.isEsNuevoEstadoCliente=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
					if(this.estadocliente.getId()>=0 && !this.estadocliente.getIsNew()) {						
						this.isEsNuevoEstadoCliente=false;
						
					} else {
						this.isEsNuevoEstadoCliente=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoCliente(esRelaciones);						
				
				this.seleccionarEstadoCliente(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadocliente.getId()<0) {
					this.isEsNuevoEstadoCliente=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoCliente(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoCliente(evt,rowIndex);
				}	
				
				if(this.estadoclienteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoCliente: " + this.dDif); 
					}
				}								
				
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoCliente(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadocliente)) {
					if(this.estadocliente.getId()>0) {
						this.estadocliente.setIsDeleted(true);
						
						this.estadoclientesEliminados.add(this.estadocliente);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoclienteLogic.getEstadoClientes().remove(this.estadocliente);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoclientes.remove(this.estadocliente);				
					}
					
					
					((EstadoClienteModel) this.jTableDatosEstadoCliente.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoCliente(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoCliente(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoCliente) {
			
			if(this.jInternalFrameDetalleFormEstadoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoCliente.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocliente =(EstadoCliente) this.estadoclienteLogic.getEstadoClientes().toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocliente =(EstadoCliente) this.estadoclientes.toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoCliente(this.estadocliente);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoCliente("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoCliente(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoCliente() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoCliente(EstadoCliente estadocliente) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoCliente(estadocliente,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoCliente(EstadoCliente estadocliente,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoCliente(estadocliente);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoCliente(estadocliente,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoCliente(estadocliente);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoCliente(EstadoCliente estadocliente) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoCliente.jTextFieldidEstadoCliente.setText(estadocliente.getId().toString());
			this.jInternalFrameDetalleFormEstadoCliente.jTextFieldcodigoEstadoCliente.setText(estadocliente.getcodigo());
			this.jInternalFrameDetalleFormEstadoCliente.jTextAreanombreEstadoCliente.setText(estadocliente.getnombre());
			this.jInternalFrameDetalleFormEstadoCliente.jCheckBoxes_defectoEstadoCliente.setSelected(estadocliente.getes_defecto());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoCliente estadoclienteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadoclienteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoCliente estadoclienteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadoclienteLocal=this.estadocliente;
			} else {
				estadoclienteLocal=this.estadoclienteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadoclienteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoCliente(estadoclienteLocal,true);
					
					if(estadoclienteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadoclienteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadoclienteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoCliente(EstadoCliente estadocliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoCliente(estadocliente,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoCliente(estadocliente);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoCliente(EstadoCliente estadocliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoCliente(estadocliente,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoCliente(EstadoCliente estadocliente,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoCliente.jTextFieldidEstadoCliente.getText()==null || this.jInternalFrameDetalleFormEstadoCliente.jTextFieldidEstadoCliente.getText()=="" || this.jInternalFrameDetalleFormEstadoCliente.jTextFieldidEstadoCliente.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoCliente.jTextFieldidEstadoCliente.setText("0");
			}

			if(conColumnasBase) {estadocliente.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoCliente.jTextFieldidEstadoCliente.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoClienteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoCliente.jLabelIdEstadoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadocliente.setcodigo(this.jInternalFrameDetalleFormEstadoCliente.jTextFieldcodigoEstadoCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoClienteConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoCliente.jLabelcodigoEstadoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadocliente.setnombre(this.jInternalFrameDetalleFormEstadoCliente.jTextAreanombreEstadoCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoClienteConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoCliente.jLabelnombreEstadoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadocliente.setes_defecto(this.jInternalFrameDetalleFormEstadoCliente.jCheckBoxes_defectoEstadoCliente.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoClienteConstantesFunciones.LABEL_ESDEFECTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoCliente.jLabeles_defectoEstadoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoCliente(EstadoCliente estadoclienteBean,EstadoCliente estadocliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoCliente(EstadoCliente estadoclienteOrigen,EstadoCliente estadocliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoclienteOrigen.getId()!=null && !estadoclienteOrigen.getId().equals(0L))) {estadocliente.setId(estadoclienteOrigen.getId());}}
			if(conDefault || (!conDefault && estadoclienteOrigen.getcodigo()!=null && !estadoclienteOrigen.getcodigo().equals(""))) {estadocliente.setcodigo(estadoclienteOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadoclienteOrigen.getnombre()!=null && !estadoclienteOrigen.getnombre().equals(""))) {estadocliente.setnombre(estadoclienteOrigen.getnombre());}
			if(conDefault || (!conDefault && estadoclienteOrigen.getes_defecto()!=null && !estadoclienteOrigen.getes_defecto().equals(false))) {estadocliente.setes_defecto(estadoclienteOrigen.getes_defecto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoCliente(EstadoCliente estadocliente) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoCliente.jTextFieldidEstadoCliente.setText(estadocliente.getId().toString());
			this.jInternalFrameDetalleFormEstadoCliente.jTextFieldcodigoEstadoCliente.setText(estadocliente.getcodigo());
			this.jInternalFrameDetalleFormEstadoCliente.jTextAreanombreEstadoCliente.setText(estadocliente.getnombre());
			this.jInternalFrameDetalleFormEstadoCliente.jCheckBoxes_defectoEstadoCliente.setSelected(estadocliente.getes_defecto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoCliente(EstadoClienteBean estadoclienteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoCliente.jTextFieldidEstadoCliente.setText(estadoclienteBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoCliente.jTextFieldcodigoEstadoCliente.setText(estadoclienteBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoCliente.jTextAreanombreEstadoCliente.setText(estadoclienteBean.getnombre());
			this.jInternalFrameDetalleFormEstadoCliente.jCheckBoxes_defectoEstadoCliente.setSelected(estadoclienteBean.getes_defecto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoCliente(EstadoClienteParameterReturnGeneral estadoclienteReturnGeneral,EstadoClienteBean estadoclienteBean,Boolean conDefault) throws Exception { 
		try {
			EstadoCliente estadoclienteLocal=new EstadoCliente();
			
			estadoclienteLocal=estadoclienteReturnGeneral.getEstadoCliente();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoclienteLocal.getId()!=null && !estadoclienteLocal.getId().equals(0L))) {estadoclienteBean.setId(estadoclienteLocal.getId());}}
			if(conDefault || (!conDefault && estadoclienteLocal.getcodigo()!=null && !estadoclienteLocal.getcodigo().equals(""))) {estadoclienteBean.setcodigo(estadoclienteLocal.getcodigo());}
			if(conDefault || (!conDefault && estadoclienteLocal.getnombre()!=null && !estadoclienteLocal.getnombre().equals(""))) {estadoclienteBean.setnombre(estadoclienteLocal.getnombre());}
			if(conDefault || (!conDefault && estadoclienteLocal.getes_defecto()!=null && !estadoclienteLocal.getes_defecto().equals(false))) {estadoclienteBean.setes_defecto(estadoclienteLocal.getes_defecto());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoClienteGenerico(Long idEstadoClienteSeleccionado,JComboBox jComboBoxEstadoCliente,List<EstadoCliente> estadoclientesLocal)throws Exception {
		try {
			EstadoCliente  estadoclienteTemp=null;

			for(EstadoCliente estadoclienteAux:estadoclientesLocal) {
				if(estadoclienteAux.getId()!=null && estadoclienteAux.getId().equals(idEstadoClienteSeleccionado)) {
					estadoclienteTemp=estadoclienteAux;
					break;
				}
			}

			jComboBoxEstadoCliente.setSelectedItem(estadoclienteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoClienteGenerico(JComboBox jComboBoxEstadoCliente,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoCliente.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoCliente.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadocliente=(EstadoCliente) estadoclienteLogic.getEstadoClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadocliente =(EstadoCliente) estadoclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoCliente estadoclienteRow=new EstadoCliente();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoclienteRow=(EstadoCliente) estadoclienteLogic.getEstadoClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoclienteRow=(EstadoCliente) estadoclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoCliente estadocliente) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoCliente==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoclienteLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocliente = (EstadoCliente)this.estadoclienteLogic.getEstadoClientes().toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadocliente = (EstadoCliente)this.estadoclientes.toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadocliente!=null) {
						this.estadocliente = estadocliente;
					} else {
						this.estadocliente = new EstadoCliente();
					}
				}

				if(this.isTienePermisosCliente && this.permiteMantenimiento(this.estadocliente)) {
					ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFramePopup;
					} else {
						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame;
					}

					List<EstadoCliente> estadoclientes=new ArrayList<EstadoCliente>();
					estadoclientes.add(this.estadocliente);
					if(!esRelacionado) {
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setConGuardarRelaciones(false);
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoCliente.cargarClienteBeanSwingJInternalFrame(estadoclientes,this.estadocliente,clienteBeanSwingJInternalFrame,/*conInicializar,*/clienteBeanSwingJInternalFrame.clienteSessionBean.getConGuardarRelaciones(),clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado());
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");

						clienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ClienteConstantesFunciones.ITAMANIOFILATABLA + (ClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						clienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoCliente=(TitledBorder)this.jScrollPanelDatosEstadoCliente.getBorder();
						TitledBorder titledBorderCliente=(TitledBorder)clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

						titledBorderCliente.setTitle(titledBorderEstadoCliente.getTitle() + " -> Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,clienteBeanSwingJInternalFrame);
						}

						clienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(clienteBeanSwingJInternalFrame);

						clienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadoclienteSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoclienteLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoclienteLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoCliente(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoCliente && this.isPermisoNuevoEstadoCliente));			
			this.jButtonDuplicarEstadoCliente.setVisible((this.isVisibilidadCeldaDuplicarEstadoCliente && this.isPermisoDuplicarEstadoCliente));			
			this.jButtonCopiarEstadoCliente.setVisible((this.isVisibilidadCeldaCopiarEstadoCliente && this.isPermisoCopiarEstadoCliente));
			this.jButtonVerFormEstadoCliente.setVisible((this.isVisibilidadCeldaVerFormEstadoCliente && this.isPermisoVerFormEstadoCliente));
			
			this.jButtonAbrirOrderByEstadoCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoCliente && this.isPermisoOrdenEstadoCliente));			
			
			this.jButtonNuevoRelacionesEstadoCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoCliente && this.isPermisoNuevoEstadoCliente));			
			this.jButtonNuevoGuardarCambiosEstadoCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoCliente && this.isPermisoNuevoEstadoCliente && this.isPermisoGuardarCambiosEstadoCliente));
			
			if(this.jInternalFrameDetalleFormEstadoCliente!=null) {
			this.jInternalFrameDetalleFormEstadoCliente.jButtonModificarEstadoCliente.setVisible((this.isVisibilidadCeldaModificarEstadoCliente && this.isPermisoActualizarEstadoCliente));	
			this.jInternalFrameDetalleFormEstadoCliente.jButtonActualizarEstadoCliente.setVisible((this.isVisibilidadCeldaActualizarEstadoCliente && this.isPermisoActualizarEstadoCliente));	
			this.jInternalFrameDetalleFormEstadoCliente.jButtonEliminarEstadoCliente.setVisible((this.isVisibilidadCeldaEliminarEstadoCliente && this.isPermisoEliminarEstadoCliente));
			this.jInternalFrameDetalleFormEstadoCliente.jButtonCancelarEstadoCliente.setVisible(this.isVisibilidadCeldaCancelarEstadoCliente);							
			this.jInternalFrameDetalleFormEstadoCliente.jButtonGuardarCambiosEstadoCliente.setVisible((this.isVisibilidadCeldaGuardarEstadoCliente && this.isPermisoGuardarCambiosEstadoCliente));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoCliente && this.isPermisoGuardarCambiosEstadoCliente));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoCliente && this.isPermisoNuevoEstadoCliente));						
			this.jButtonDuplicarToolBarEstadoCliente.setVisible((this.isVisibilidadCeldaDuplicarEstadoCliente && this.isPermisoDuplicarEstadoCliente));						
			this.jButtonCopiarToolBarEstadoCliente.setVisible((this.isVisibilidadCeldaCopiarEstadoCliente && this.isPermisoCopiarEstadoCliente));			
			this.jButtonVerFormToolBarEstadoCliente.setVisible((this.isVisibilidadCeldaVerFormEstadoCliente && this.isPermisoVerFormEstadoCliente));			
			this.jButtonAbrirOrderByToolBarEstadoCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoCliente && this.isPermisoOrdenEstadoCliente));
			this.jButtonNuevoRelacionesToolBarEstadoCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoCliente && this.isPermisoNuevoEstadoCliente));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoCliente && this.isPermisoNuevoEstadoCliente && this.isPermisoGuardarCambiosEstadoCliente));			
			
			if(this.jInternalFrameDetalleFormEstadoCliente!=null) {
			this.jInternalFrameDetalleFormEstadoCliente.jButtonModificarToolBarEstadoCliente.setVisible((this.isVisibilidadCeldaModificarEstadoCliente && this.isPermisoActualizarEstadoCliente));	
			this.jInternalFrameDetalleFormEstadoCliente.jButtonActualizarToolBarEstadoCliente.setVisible((this.isVisibilidadCeldaActualizarEstadoCliente  && this.isPermisoActualizarEstadoCliente));	
			this.jInternalFrameDetalleFormEstadoCliente.jButtonEliminarToolBarEstadoCliente.setVisible((this.isVisibilidadCeldaEliminarEstadoCliente && this.isPermisoEliminarEstadoCliente));
			this.jInternalFrameDetalleFormEstadoCliente.jButtonCancelarToolBarEstadoCliente.setVisible(this.isVisibilidadCeldaCancelarEstadoCliente);				
			this.jInternalFrameDetalleFormEstadoCliente.jButtonGuardarCambiosToolBarEstadoCliente.setVisible((this.isVisibilidadCeldaGuardarEstadoCliente && this.isPermisoGuardarCambiosEstadoCliente));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoCliente && this.isPermisoGuardarCambiosEstadoCliente));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoCliente && this.isPermisoNuevoEstadoCliente));			
			this.jMenuItemDuplicarEstadoCliente.setVisible((this.isVisibilidadCeldaDuplicarEstadoCliente && this.isPermisoDuplicarEstadoCliente));			
			this.jMenuItemCopiarEstadoCliente.setVisible((this.isVisibilidadCeldaCopiarEstadoCliente && this.isPermisoCopiarEstadoCliente));			
			this.jMenuItemVerFormEstadoCliente.setVisible((this.isVisibilidadCeldaVerFormEstadoCliente && this.isPermisoVerFormEstadoCliente));			
			this.jMenuItemAbrirOrderByEstadoCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoCliente && this.isPermisoOrdenEstadoCliente));			
			//this.jMenuItemMostrarOcultarEstadoCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoCliente && this.isPermisoOrdenEstadoCliente));
			this.jMenuItemDetalleAbrirOrderByEstadoCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoCliente && this.isPermisoOrdenEstadoCliente));			
			//this.jMenuItemDetalleMostrarOcultarEstadoCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoCliente && this.isPermisoOrdenEstadoCliente));			
			this.jMenuItemNuevoRelacionesEstadoCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoCliente && this.isPermisoNuevoEstadoCliente));			
			this.jMenuItemNuevoGuardarCambiosEstadoCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoCliente && this.isPermisoNuevoEstadoCliente && this.isPermisoGuardarCambiosEstadoCliente));									
			
			if(this.jInternalFrameDetalleFormEstadoCliente!=null) {
			this.jInternalFrameDetalleFormEstadoCliente.jMenuItemModificarEstadoCliente.setVisible((this.isVisibilidadCeldaModificarEstadoCliente && this.isPermisoActualizarEstadoCliente));	
			this.jInternalFrameDetalleFormEstadoCliente.jMenuItemActualizarEstadoCliente.setVisible((this.isVisibilidadCeldaActualizarEstadoCliente && this.isPermisoActualizarEstadoCliente));	
			this.jInternalFrameDetalleFormEstadoCliente.jMenuItemEliminarEstadoCliente.setVisible((this.isVisibilidadCeldaEliminarEstadoCliente && this.isPermisoEliminarEstadoCliente));
			this.jInternalFrameDetalleFormEstadoCliente.jMenuItemCancelarEstadoCliente.setVisible(this.isVisibilidadCeldaCancelarEstadoCliente);				
			}
			
			this.jMenuItemGuardarCambiosEstadoCliente.setVisible((this.isVisibilidadCeldaGuardarEstadoCliente && this.isPermisoGuardarCambiosEstadoCliente));						
			this.jMenuItemGuardarCambiosTablaEstadoCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoCliente && this.isPermisoGuardarCambiosEstadoCliente));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoCliente=this.jButtonNuevoEstadoCliente.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoCliente=this.jButtonDuplicarEstadoCliente.isVisible();
			this.isVisibilidadCeldaCopiarEstadoCliente=this.jButtonCopiarEstadoCliente.isVisible();
			this.isVisibilidadCeldaVerFormEstadoCliente=this.jButtonVerFormEstadoCliente.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoCliente=this.jButtonAbrirOrderByEstadoCliente.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoCliente=this.jButtonNuevoRelacionesEstadoCliente.isVisible();
			this.isVisibilidadCeldaModificarEstadoCliente=this.jButtonModificarEstadoCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoCliente!=null) {
			this.isVisibilidadCeldaActualizarEstadoCliente=this.jInternalFrameDetalleFormEstadoCliente.jButtonActualizarEstadoCliente.isVisible();
			this.isVisibilidadCeldaEliminarEstadoCliente=this.jInternalFrameDetalleFormEstadoCliente.jButtonEliminarEstadoCliente.isVisible();
			this.isVisibilidadCeldaCancelarEstadoCliente=this.jInternalFrameDetalleFormEstadoCliente.jButtonCancelarEstadoCliente.isVisible();
			this.isVisibilidadCeldaGuardarEstadoCliente=this.jInternalFrameDetalleFormEstadoCliente.jButtonGuardarCambiosEstadoCliente.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoCliente=this.jButtonGuardarCambiosTablaEstadoCliente.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoCliente=this.jButtonNuevoToolBarEstadoCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoCliente=this.jButtonNuevoRelacionesToolBarEstadoCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoCliente!=null) {
			this.isVisibilidadCeldaModificarEstadoCliente=this.jInternalFrameDetalleFormEstadoCliente.jButtonModificarToolBarEstadoCliente.isVisible();
			this.isVisibilidadCeldaActualizarEstadoCliente=this.jInternalFrameDetalleFormEstadoCliente.jButtonActualizarToolBarEstadoCliente.isVisible();
			this.isVisibilidadCeldaEliminarEstadoCliente=this.jInternalFrameDetalleFormEstadoCliente.jButtonEliminarToolBarEstadoCliente.isVisible();
			this.isVisibilidadCeldaCancelarEstadoCliente=this.jInternalFrameDetalleFormEstadoCliente.jButtonCancelarToolBarEstadoCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoCliente=this.jButtonGuardarCambiosToolBarEstadoCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoCliente=this.jButtonGuardarCambiosTablaToolBarEstadoCliente.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoCliente=this.jMenuItemNuevoEstadoCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoCliente=this.jMenuItemNuevoRelacionesEstadoCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoCliente!=null) {
			this.isVisibilidadCeldaModificarEstadoCliente=this.jInternalFrameDetalleFormEstadoCliente.jMenuItemModificarEstadoCliente.isVisible();
			this.isVisibilidadCeldaActualizarEstadoCliente=this.jInternalFrameDetalleFormEstadoCliente.jMenuItemActualizarEstadoCliente.isVisible();
			this.isVisibilidadCeldaEliminarEstadoCliente=this.jInternalFrameDetalleFormEstadoCliente.jMenuItemEliminarEstadoCliente.isVisible();
			this.isVisibilidadCeldaCancelarEstadoCliente=this.jInternalFrameDetalleFormEstadoCliente.jMenuItemCancelarEstadoCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoCliente=this.jMenuItemGuardarCambiosEstadoCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoCliente=this.jMenuItemGuardarCambiosTablaEstadoCliente.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoCliente(Boolean esInicializar) {
		if(EstadoClienteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadoclienteSessionBean.getConGuardarRelaciones()) {
				//if(this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoCliente();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoCliente(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoCliente() {
		this.jButtonNuevoEstadoCliente.setVisible(this.isPermisoNuevoEstadoCliente);			
		this.jButtonDuplicarEstadoCliente.setVisible(this.isPermisoDuplicarEstadoCliente);			
		this.jButtonCopiarEstadoCliente.setVisible(this.isPermisoCopiarEstadoCliente);			
		this.jButtonVerFormEstadoCliente.setVisible(this.isPermisoVerFormEstadoCliente);			
		
		this.jButtonAbrirOrderByEstadoCliente.setVisible(this.isPermisoOrdenEstadoCliente);					
		
		this.jButtonNuevoRelacionesEstadoCliente.setVisible(this.isPermisoNuevoEstadoCliente);			
		
		if(this.jInternalFrameDetalleFormEstadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCliente.jButtonModificarEstadoCliente.setVisible(this.isPermisoActualizarEstadoCliente);	
			this.jInternalFrameDetalleFormEstadoCliente.jButtonActualizarEstadoCliente.setVisible(this.isPermisoActualizarEstadoCliente);	
			this.jInternalFrameDetalleFormEstadoCliente.jButtonEliminarEstadoCliente.setVisible(this.isPermisoEliminarEstadoCliente);
			this.jInternalFrameDetalleFormEstadoCliente.jButtonCancelarEstadoCliente.setVisible(this.isVisibilidadCeldaCancelarEstadoCliente);						
			this.jInternalFrameDetalleFormEstadoCliente.jButtonGuardarCambiosEstadoCliente.setVisible(this.isPermisoGuardarCambiosEstadoCliente);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoCliente.setVisible(this.isPermisoActualizarEstadoCliente);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoCliente() {
		this.jInternalFrameDetalleFormEstadoCliente.jButtonModificarEstadoCliente.setVisible(this.isPermisoActualizarEstadoCliente);	
		this.jInternalFrameDetalleFormEstadoCliente.jButtonActualizarEstadoCliente.setVisible(this.isPermisoActualizarEstadoCliente);	
		this.jInternalFrameDetalleFormEstadoCliente.jButtonEliminarEstadoCliente.setVisible(this.isPermisoEliminarEstadoCliente);
		this.jInternalFrameDetalleFormEstadoCliente.jButtonCancelarEstadoCliente.setVisible(this.isVisibilidadCeldaCancelarEstadoCliente);							
		this.jInternalFrameDetalleFormEstadoCliente.jButtonGuardarCambiosEstadoCliente.setVisible((this.isVisibilidadCeldaGuardarEstadoCliente && this.isPermisoGuardarCambiosEstadoCliente));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoCliente() {
		if(EstadoClienteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoCliente();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoCliente() {
	}
	
	public void jTableDatosEstadoClienteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoCliente(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoCliente(this.getestadocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCliente(this.estadocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocliente =(EstadoCliente) this.estadoclienteLogic.getEstadoClientes().toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadocliente =(EstadoCliente) this.estadoclientes.toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadocliente==null) {
						this.estadocliente = new EstadoCliente();
					}

					this.setVariablesFormularioToObjetoActualEstadoCliente(this.estadocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCliente(this.estadocliente);
				}

				if(this.estadocliente.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadocliente.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoCliente(this.getestadocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCliente(this.estadocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocliente =(EstadoCliente) this.estadoclienteLogic.getEstadoClientes().toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadocliente =(EstadoCliente) this.estadoclientes.toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadocliente==null) {
						this.estadocliente = new EstadoCliente();
					}

					this.setVariablesFormularioToObjetoActualEstadoCliente(this.estadocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCliente(this.estadocliente);
				}

				if(this.estadocliente.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadocliente.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoCliente(this.getestadocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCliente(this.estadocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocliente =(EstadoCliente) this.estadoclienteLogic.getEstadoClientes().toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadocliente =(EstadoCliente) this.estadoclientes.toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadocliente==null) {
						this.estadocliente = new EstadoCliente();
					}

					this.setVariablesFormularioToObjetoActualEstadoCliente(this.estadocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCliente(this.estadocliente);
				}

				if(this.estadocliente.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadocliente.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_defectoEstadoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoCliente(this.getestadocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCliente(this.estadocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocliente =(EstadoCliente) this.estadoclienteLogic.getEstadoClientes().toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadocliente =(EstadoCliente) this.estadoclientes.toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadocliente==null) {
						this.estadocliente = new EstadoCliente();
					}

					this.setVariablesFormularioToObjetoActualEstadoCliente(this.estadocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCliente(this.estadocliente);
				}

				if(this.estadocliente.getes_defecto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_defecto = "+this.estadocliente.getes_defecto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoCliente() {
		if(this.jInternalFrameDetalleFormEstadoCliente!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoCliente!=null) {
			this.jInternalFrameDetalleFormEstadoCliente.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoCliente.dispose();
			this.jInternalFrameDetalleFormEstadoCliente=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoCliente!=null) {
			this.jInternalFrameReporteDinamicoEstadoCliente.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoCliente.dispose();
			this.jInternalFrameReporteDinamicoEstadoCliente=null;
		}
		
		if(this.jInternalFrameImportacionEstadoCliente!=null) {
			this.jInternalFrameImportacionEstadoCliente.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoCliente.dispose();
			this.jInternalFrameImportacionEstadoCliente=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoCliente();
			
			EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoCliente")) {
				jButtonNuevoEstadoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoCliente")) {
				jButtonDuplicarEstadoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoCliente")) {
				jButtonCopiarEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoCliente")) {
				jButtonVerFormEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoCliente")) {
				jButtonNuevoEstadoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoCliente")) {
				jButtonDuplicarEstadoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoCliente")) {
				jButtonNuevoEstadoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoCliente")) {
				jButtonDuplicarEstadoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoCliente")) {
				jButtonNuevoEstadoClienteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoCliente")) {
				jButtonNuevoEstadoClienteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoCliente")) {
				jButtonNuevoEstadoClienteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoCliente")) {
				jButtonModificarEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoCliente")) {
				jButtonModificarEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoCliente")) {
				jButtonModificarEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoCliente")) {
				jButtonActualizarEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoCliente")) {
				jButtonActualizarEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoCliente")) {
				jButtonActualizarEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoCliente")) {
				jButtonEliminarEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoCliente")) {
				jButtonEliminarEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoCliente")) {
				jButtonEliminarEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoCliente")) {
				jButtonCancelarEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoCliente")) {
				jButtonCancelarEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoCliente")) {
				jButtonCancelarEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoCliente")) {
				jButtonCerrarEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoCliente")) {
				jButtonCerrarEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoCliente")) {
				jButtonCerrarEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoCliente")) {
				jButtonMostrarOcultarEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoCliente")) {
				jButtonCancelarEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoCliente")) {
				jButtonGuardarCambiosEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoCliente")) {
				jButtonGuardarCambiosEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoCliente")) {
				jButtonCopiarEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoCliente")) {
				jButtonVerFormEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoCliente")) {
				jButtonGuardarCambiosEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoCliente")) {
				jButtonCopiarEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoCliente")) {
				jButtonVerFormEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoCliente")) {
				jButtonGuardarCambiosEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoCliente")) {
				jButtonGuardarCambiosEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoCliente")) {
				jButtonGuardarCambiosEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoCliente")) {
				jButtonRecargarInformacionEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoCliente")) {
				jButtonRecargarInformacionEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoCliente")) {
				jButtonRecargarInformacionEstadoClienteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoCliente")) {
				jButtonAnterioresEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoCliente")) {
				jButtonAnterioresEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoCliente")) {
				jButtonAnterioresEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoCliente")) {
				jButtonSiguientesEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoCliente")) {
				jButtonSiguientesEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoCliente")) {
				jButtonSiguientesEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoCliente") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoCliente")) {
				jButtonAbrirOrderByEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoCliente") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoCliente")) {
				jButtonMostrarOcultarEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoCliente")) {
				jButtonNuevoGuardarCambiosEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoCliente")) {
				jButtonNuevoGuardarCambiosEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoCliente")) {
				jButtonNuevoGuardarCambiosEstadoClienteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoCliente")) {
				jButtonCerrarReporteDinamicoEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoCliente")) {
				jButtonGenerarReporteDinamicoEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoCliente")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoCliente")) {
				jButtonCerrarImportacionEstadoClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoCliente")) {
				
				jButtonGenerarImportacionEstadoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoCliente")) {
				
				jButtonAbrirImportacionEstadoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoCliente")) {
				jComboBoxTiposAccionesEstadoClienteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoCliente")) {
				jComboBoxTiposRelacionesEstadoClienteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoCliente")) {
				jComboBoxTiposAccionesEstadoClienteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoCliente")) {
				
				jComboBoxTiposSeleccionarEstadoClienteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoCliente")) {
				jTextFieldValorCampoGeneralEstadoClienteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoCliente")) {
				jButtonAbrirOrderByEstadoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoCliente")) {
				jButtonAbrirOrderByEstadoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoCliente")) {
				jButtonCerrarOrderByEstadoClienteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoClienteBusqueda")) {
				this.jButtonidEstadoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoClienteBusqueda")) {
				this.jButtoncodigoEstadoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoClienteBusqueda")) {
				this.jButtonnombreEstadoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_defectoEstadoClienteBusqueda")) {
				this.jButtones_defectoEstadoClienteBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoCliente();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocliente);
				
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
				
				


				
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoCliente estadoclienteLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadoclienteLocal=this.estadocliente;
			} else {
				estadoclienteLocal=this.estadoclienteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocliente);
				
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
							
				
				


				
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoclienteAnterior =(EstadoCliente) this.estadoclienteLogic.getEstadoClientes().toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoclienteAnterior =(EstadoCliente) this.estadoclientes.toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
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
			
			EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
			
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
			
			


			
			EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocliente);
				
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
								
						
				


				
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCliente.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocliente);
				
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
								
				
				


				
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoclienteAnterior =(EstadoCliente) this.estadoclienteLogic.getEstadoClientes().toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoclienteAnterior =(EstadoCliente) this.estadoclientes.toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocliente);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoclienteAnterior =(EstadoCliente) this.estadoclienteLogic.getEstadoClientes().toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoclienteAnterior =(EstadoCliente) this.estadoclientes.toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocliente);
				
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
							
				
				


				
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCliente.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoclienteAnterior =(EstadoCliente) this.estadoclienteLogic.getEstadoClientes().toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoclienteAnterior =(EstadoCliente) this.estadoclientes.toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
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
			
			EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
			
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
			
			


			
			EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoClienteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocliente);
				
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
								
				
				


				
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoclienteAnterior =(EstadoCliente) this.estadoclienteLogic.getEstadoClientes().toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoclienteAnterior =(EstadoCliente) this.estadoclientes.toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocliente);
				
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoCliente")) {
					jCheckBoxSeleccionarTodosEstadoClienteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoCliente")) {
					jCheckBoxSeleccionadosEstadoClienteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoCliente")) {
					
				}
				
				


				
				
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocliente);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadocliente);
				
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
												
				
				


				
				
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoclienteAnterior =(EstadoCliente) this.estadoclienteLogic.getEstadoClientes().toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoclienteAnterior =(EstadoCliente) this.estadoclientes.toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoClienteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocliente);
				
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
				
				
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
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
			
			EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
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
			
			


			
			EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocliente);
				
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCliente.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCliente.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocliente);
				
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
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
				
				


				
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCliente.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoclienteAnterior =(EstadoCliente) this.estadoclienteLogic.getEstadoClientes().toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoclienteAnterior =(EstadoCliente) this.estadoclientes.toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoCliente")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoCliente.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadocliente =(EstadoCliente) this.estadoclienteLogic.getEstadoClientes().toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadocliente =(EstadoCliente) this.estadoclientes.toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadocliente);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoCliente")) {
				
				}
				
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoCliente")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoCliente.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoCliente")) {
			
			}
			
			EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoCliente();
			
			EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoCliente")) {
				jButtonNuevoEstadoClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoCliente")) {
				jButtonDuplicarEstadoClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoCliente")) {
				jButtonCopiarEstadoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoCliente")) {
				jButtonVerFormEstadoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoCliente")) {
				jButtonNuevoEstadoClienteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoCliente")) {
				jButtonModificarEstadoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoCliente")) {
				jButtonActualizarEstadoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoCliente")) {
				jButtonEliminarEstadoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoCliente")) {
				jButtonGuardarCambiosEstadoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoCliente")) {
				jButtonCancelarEstadoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoCliente")) {
				jButtonCerrarEstadoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoCliente")) {
				jButtonGuardarCambiosEstadoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoCliente")) {
				jButtonNuevoGuardarCambiosEstadoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoCliente")) {
				jButtonAbrirOrderByEstadoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoCliente")) {
				jButtonRecargarInformacionEstadoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoCliente")) {
				jButtonAnterioresEstadoClienteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoCliente")) {
				jButtonSiguientesEstadoClienteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoClienteBusqueda")) {
				this.jButtonidEstadoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoClienteBusqueda")) {
				this.jButtoncodigoEstadoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoClienteBusqueda")) {
				this.jButtonnombreEstadoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_defectoEstadoClienteBusqueda")) {
				this.jButtones_defectoEstadoClienteBusquedaActionPerformed(evt);
			}
			
			EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoCliente();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoCliente")) {
				closingInternalFrameEstadoCliente();
				
			} else if(sTipo.equals("jButtonCancelarEstadoCliente")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoCliente = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoClienteBeanSwingJInternalFrame jInternalFrameParent=(EstadoClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoCliente.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoClienteActionPerformed(null);
			}
			
			EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadocliente,new Object(),this.estadoclienteParameterGeneral,this.estadoclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadocliente)) {
			if(!esControlTabla) {
				if(EstadoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoCliente(this.estadocliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCliente(this.estadocliente);			
				}
				
				if(this.estadoclienteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoCliente(this.estadocliente,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoclienteReturnGeneral=estadoclienteLogic.procesarEventosEstadoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoclienteLogic.getEstadoClientes(),this.estadocliente,this.estadoclienteParameterGeneral,this.isEsNuevoEstadoCliente,classes);//this.estadoclienteLogic.getEstadoCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoCliente(this.estadoclienteReturnGeneral,this.estadoclienteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoCliente(classes,this.estadoclienteReturnGeneral,this.estadoclienteBean,false);
					}
						
					if(this.estadoclienteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoCliente(this.estadoclienteReturnGeneral.getEstadoCliente());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoCliente(this.estadoclienteReturnGeneral.getEstadoCliente());	
					}
						
					if(this.estadoclienteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoCliente(this.estadoclienteReturnGeneral.getEstadoCliente(),classes);//this.estadoclienteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoCliente(this.estadocliente,classes);//this.estadoclienteBean);									
				}
			
				if(EstadoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoCliente(this.estadocliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCliente(this.estadocliente);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadoclienteAnterior!=null) {
						this.estadocliente=this.estadoclienteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoclienteReturnGeneral=estadoclienteLogic.procesarEventosEstadoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoclienteLogic.getEstadoClientes(),this.estadocliente,this.estadoclienteParameterGeneral,this.isEsNuevoEstadoCliente,classes);//this.estadoclienteLogic.getEstadoCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadoclienteReturnGeneral.getEstadoCliente(),estadoclienteLogic.getEstadoClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadoclienteReturnGeneral.getEstadoCliente(),this.estadoclientes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoCliente.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoCliente.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoCliente();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoCliente() throws Exception {
		
		EstadoClienteModel estadoclienteModel=(EstadoClienteModel)this.jTableDatosEstadoCliente.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoclienteModel.estadoclientes=this.estadoclienteLogic.getEstadoClientes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadoclienteModel.estadoclientes=this.estadoclientes;
		}
		
		
		((EstadoClienteModel) this.jTableDatosEstadoCliente.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoCliente() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadoclienteAnterior(),this.estadoclienteLogic.getEstadoClientes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadoclienteAnterior(),this.estadoclientes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoCliente();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoCliente(EstadoCliente estadocliente,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(estadocliente.getClientes());
					this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
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
										
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadocliente,new Object(),generalEntityParameterGeneral,this.estadoclienteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadoclienteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoClienteConstantesFunciones.getClassesRelationshipsOfEstadoCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoClienteConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoCliente(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadocliente,new Object(),generalEntityParameterGeneral,this.estadoclienteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoCliente(EstadoClienteBean estadoclienteBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(estadocliente.getClientes());
					this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoCliente(ArrayList<Classe> classes,EstadoClienteReturnGeneral estadoclienteReturnGeneral,EstadoClienteBean estadoclienteBean,Boolean conDefault) throws Exception {
		
			this.estadoclienteBean.setClientes(estadoclienteReturnGeneral.getEstadoCliente().getClientes());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoCliente(EstadoCliente estadocliente,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					estadocliente.setClientes(this.jInternalFrameDetalleFormEstadoCliente.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadocliente)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoCliente = new EstadoClienteDetalleFormJInternalFrame(jDesktopPane,this.estadoclienteSessionBean.getConGuardarRelaciones(),this.estadoclienteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoCliente);
		this.jInternalFrameDetalleFormEstadoCliente.setVisible(false);
		this.jInternalFrameDetalleFormEstadoCliente.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoCliente.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoCliente.estadoclienteLogic=this.estadoclienteLogic;
		
		this.cargarCombosFrameForeignKeyEstadoCliente("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoCliente();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoCliente();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoCliente("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoCliente();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoCliente"));
		
		this.jInternalFrameDetalleFormEstadoCliente.jButtonModificarEstadoCliente.addActionListener(new ButtonActionListener(this,"ModificarEstadoCliente"));

		
		this.jInternalFrameDetalleFormEstadoCliente.jButtonModificarToolBarEstadoCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoCliente"));
					
		this.jInternalFrameDetalleFormEstadoCliente.jMenuItemModificarEstadoCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoCliente.jButtonActualizarEstadoCliente.addActionListener (new ButtonActionListener(this,"ActualizarEstadoCliente"));
		
		
		this.jInternalFrameDetalleFormEstadoCliente.jButtonActualizarToolBarEstadoCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoCliente"));
						
		this.jInternalFrameDetalleFormEstadoCliente.jMenuItemActualizarEstadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoCliente.jButtonEliminarEstadoCliente.addActionListener (new ButtonActionListener(this,"EliminarEstadoCliente"));
		
		
		this.jInternalFrameDetalleFormEstadoCliente.jButtonEliminarToolBarEstadoCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoCliente"));
								
		this.jInternalFrameDetalleFormEstadoCliente.jMenuItemEliminarEstadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoCliente.jButtonCancelarEstadoCliente.addActionListener (new ButtonActionListener(this,"CancelarEstadoCliente"));
		
		
		this.jInternalFrameDetalleFormEstadoCliente.jButtonCancelarToolBarEstadoCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoCliente"));
					
		this.jInternalFrameDetalleFormEstadoCliente.jMenuItemCancelarEstadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoCliente"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoCliente.jMenuItemDetalleCerrarEstadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoCliente.jButtonGuardarCambiosToolBarEstadoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoCliente"));
		
		
		
		this.jInternalFrameDetalleFormEstadoCliente.jButtonGuardarCambiosToolBarEstadoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoCliente"));
		
		
		
		this.jInternalFrameDetalleFormEstadoCliente.jComboBoxTiposAccionesFormularioEstadoCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoCliente"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCliente.jButtonidEstadoClienteBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCliente.jButtoncodigoEstadoClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCliente.jButtonnombreEstadoClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCliente.jButtones_defectoEstadoClienteBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoEstadoClienteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoCliente.jTabbedPaneRelacionesEstadoCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoCliente"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoCliente"));
		
		if(this.jInternalFrameDetalleFormEstadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoCliente"));
		}
		
		this.jTableDatosEstadoCliente.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoCliente"));
		
		this.jTableDatosEstadoCliente.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoCliente"));
		
		this.jButtonNuevoEstadoCliente.addActionListener(new ButtonActionListener(this,"NuevoEstadoCliente"));
		
		this.jButtonDuplicarEstadoCliente.addActionListener(new ButtonActionListener(this,"DuplicarEstadoCliente"));
		
		this.jButtonCopiarEstadoCliente.addActionListener(new ButtonActionListener(this,"CopiarEstadoCliente"));
		
		this.jButtonVerFormEstadoCliente.addActionListener(new ButtonActionListener(this,"VerFormEstadoCliente"));
		
		
		this.jButtonNuevoToolBarEstadoCliente.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoCliente"));
			
		this.jButtonDuplicarToolBarEstadoCliente.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoCliente"));
			
		this.jMenuItemNuevoEstadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoCliente"));
			
		this.jMenuItemDuplicarEstadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoCliente"));		
		
		
		this.jButtonNuevoRelacionesEstadoCliente.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoCliente"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoCliente.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoCliente"));
			
		this.jMenuItemNuevoRelacionesEstadoCliente.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoCliente"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCliente.jButtonModificarEstadoCliente.addActionListener(new ButtonActionListener(this,"ModificarEstadoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCliente.jButtonModificarToolBarEstadoCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoCliente"));
			
			this.jInternalFrameDetalleFormEstadoCliente.jMenuItemModificarEstadoCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCliente!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoCliente.jButtonActualizarEstadoCliente.addActionListener (new ButtonActionListener(this,"ActualizarEstadoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCliente.jButtonActualizarToolBarEstadoCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoCliente"));
				
			this.jInternalFrameDetalleFormEstadoCliente.jMenuItemActualizarEstadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCliente.jButtonEliminarEstadoCliente.addActionListener (new ButtonActionListener(this,"EliminarEstadoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCliente.jButtonEliminarToolBarEstadoCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoCliente"));
						
			this.jInternalFrameDetalleFormEstadoCliente.jMenuItemEliminarEstadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCliente.jButtonCancelarEstadoCliente.addActionListener (new ButtonActionListener(this,"CancelarEstadoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCliente.jButtonCancelarToolBarEstadoCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoCliente"));
			
			this.jInternalFrameDetalleFormEstadoCliente.jMenuItemCancelarEstadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoCliente"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoCliente.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoCliente"));		
		
		
		this.jButtonCerrarEstadoCliente.addActionListener (new ButtonActionListener(this,"CerrarEstadoCliente"));
		
		
		this.jButtonCerrarToolBarEstadoCliente.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoCliente"));
			
		this.jMenuItemCerrarEstadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoCliente"));
			
		if(this.jInternalFrameDetalleFormEstadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCliente.jMenuItemDetalleCerrarEstadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCliente.jButtonGuardarCambiosEstadoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCliente.jButtonGuardarCambiosToolBarEstadoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoCliente"));
		}
		
		this.jButtonCopiarToolBarEstadoCliente.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoCliente"));
			
		this.jButtonVerFormToolBarEstadoCliente.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoCliente"));
		
		this.jMenuItemGuardarCambiosEstadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoCliente"));
			
		this.jMenuItemCopiarEstadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoCliente"));		
		
		this.jMenuItemVerFormEstadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoCliente"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoCliente"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoCliente"));
			
		this.jMenuItemGuardarCambiosTablaEstadoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoCliente"));		
		
		
		
		this.jButtonRecargarInformacionEstadoCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoCliente"));
					
		this.jButtonRecargarInformacionToolBarEstadoCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoCliente"));
		
		this.jMenuItemRecargarInformacionEstadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoCliente"));		
		
		
		
		this.jButtonAnterioresEstadoCliente.addActionListener (new ButtonActionListener(this,"AnterioresEstadoCliente"));
		
		
		this.jButtonAnterioresToolBarEstadoCliente.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoCliente"));
		
		this.jMenuItemAnterioresEstadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoCliente"));		
		
		
		this.jButtonSiguientesEstadoCliente.addActionListener (new ButtonActionListener(this,"SiguientesEstadoCliente"));
		
		
		this.jButtonSiguientesToolBarEstadoCliente.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoCliente"));
			
		this.jMenuItemSiguientesEstadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoCliente"));
			
		this.jMenuItemAbrirOrderByEstadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoCliente"));
			
		this.jMenuItemMostrarOcultarEstadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoCliente"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoCliente"));
			
		this.jMenuItemDetalleMostarOcultarEstadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoCliente"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoCliente"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoCliente"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoCliente"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoCliente"));

		this.jCheckBoxSeleccionadosEstadoCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoCliente"));
		
		if(this.jInternalFrameDetalleFormEstadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCliente.jComboBoxTiposAccionesFormularioEstadoCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoCliente"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoCliente.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoCliente"));
			
		this.jComboBoxTiposAccionesEstadoCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoCliente"));
					
		this.jComboBoxTiposSeleccionarEstadoCliente.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoCliente"));
			
		this.jTextFieldValorCampoGeneralEstadoCliente.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoCliente"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoCliente!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCliente.jButtonidEstadoClienteBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCliente.jButtoncodigoEstadoClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCliente.jButtonnombreEstadoClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCliente.jButtones_defectoEstadoClienteBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoEstadoClienteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoCliente!=null) {
				this.jInternalFrameReporteDinamicoEstadoCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoCliente"));
				this.jInternalFrameReporteDinamicoEstadoCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoCliente"));
				this.jInternalFrameReporteDinamicoEstadoCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoCliente"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoCliente.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoCliente"));				
			//this.jButtonGenerarReporteDinamicoEstadoCliente.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoCliente"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoCliente.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoCliente"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoCliente!=null) {
				this.jInternalFrameImportacionEstadoCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoCliente"));
				this.jInternalFrameImportacionEstadoCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoCliente"));
				this.jInternalFrameImportacionEstadoCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoCliente"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoCliente"));
			
			this.jButtonAbrirOrderByToolBarEstadoCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoCliente"));			
			
			if(this.jInternalFrameOrderByEstadoCliente!=null) {
				this.jInternalFrameOrderByEstadoCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoCliente"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoCliente!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCliente.jTabbedPaneRelacionesEstadoCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoCliente"));
		
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
            		closingInternalFrameEstadoCliente();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoCliente.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoCliente = (JInternalFrameBase)event.getSource();
	            	
	            EstadoClienteBeanSwingJInternalFrame jInternalFrameParent=(EstadoClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoCliente.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoClienteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoCliente.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoCliente.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoCliente.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoCliente";
		inputMap = this.jButtonNuevoEstadoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoClienteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoCliente";
		inputMap = this.jButtonNuevoRelacionesEstadoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoClienteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoCliente";
		inputMap = this.jButtonModificarEstadoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoCliente";
		inputMap = this.jButtonActualizarEstadoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoCliente";
		inputMap = this.jButtonEliminarEstadoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoCliente";
		inputMap = this.jButtonCancelarEstadoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoCliente";
		inputMap = this.jButtonCerrarEstadoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoCliente.jButtonGuardarCambiosEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoCliente";
		inputMap = this.jInternalFrameDetalleFormEstadoCliente.jButtonGuardarCambiosEstadoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoCliente.jButtonGuardarCambiosEstadoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoCliente.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoClienteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCliente.jButtonidEstadoClienteBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCliente.jButtoncodigoEstadoClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCliente.jButtonnombreEstadoClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCliente.jButtones_defectoEstadoClienteBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoEstadoClienteBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoClienteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoCliente.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoCliente(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoCliente estadoclienteAux:this.estadoclienteLogic.getEstadoClientes()) {
					estadoclienteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoCliente estadoclienteAux:estadoclientes) {
					estadoclienteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoCliente estadoclienteAux:this.estadoclienteLogic.getEstadoClientes()) {
						estadoclienteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoCliente estadoclienteAux:estadoclientes) {
						estadoclienteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoCliente estadoclienteAux:this.estadoclienteLogic.getEstadoClientes()) {
					
						if(sTipoSeleccionar.equals(EstadoClienteConstantesFunciones.LABEL_ESDEFECTO)) {
							existe=true;
							estadoclienteAux.setes_defecto(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoCliente estadoclienteAux:estadoclientes) {
						
						if(sTipoSeleccionar.equals(EstadoClienteConstantesFunciones.LABEL_ESDEFECTO)) {
							existe=true;
							estadoclienteAux.setes_defecto(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoCliente.getSelectedRows();
			
			EstadoCliente estadoclienteLocal=new EstadoCliente();
			
			//this.seleccionarTodosEstadoCliente(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoclienteLocal =(EstadoCliente) this.estadoclienteLogic.getEstadoClientes().toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadoclienteLocal =(EstadoCliente) this.estadoclientes.toArray()[this.jTableDatosEstadoCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadoclienteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoCliente estadoclienteAux:this.estadoclienteLogic.getEstadoClientes()) {
						estadoclienteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoCliente estadoclienteAux:estadoclientes) {
						estadoclienteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoCliente(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoClienteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoClienteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoClienteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoCliente(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoCliente.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoCliente estadoclienteAux:this.estadoclienteLogic.getEstadoClientes()) {
				
						if(sTipoSeleccionar.equals(EstadoClienteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoclienteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoClienteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoclienteAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoCliente estadoclienteAux:estadoclientes) {
					
						if(sTipoSeleccionar.equals(EstadoClienteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoclienteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoClienteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoclienteAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoClienteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoCliente=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoCliente.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoCliente.jComboBoxTiposAccionesFormularioEstadoCliente.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoCliente) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoCliente(conSplash);
				
					this.generarReporteEstadoClientesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoCliente.jComboBoxTiposAccionesFormularioEstadoCliente.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoClientesSeleccionados();
				//this.jComboBoxTiposAccionesEstadoCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoClientesSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoClientesSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoCliente();
				
				this.exportarEstadoClientesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoCliente.jComboBoxTiposAccionesFormularioEstadoCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoClientes();
				//this.importarEstadoClientes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoCliente.jComboBoxTiposAccionesFormularioEstadoCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoCliente();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoClientesSeleccionados();
				//this.jComboBoxTiposAccionesEstadoCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoCliente();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoCliente)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoCliente(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Cliente",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoCliente.jComboBoxTiposAccionesFormularioEstadoCliente.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadoClienteBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadoCliente) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadoCliente(conSplash);
					
						//this.actualizarParametrosGeneralEstadoCliente();
						
						this.generarReporteProcesoAccionEstadoClientesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadoCliente.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadoCliente.jComboBoxTiposAccionesFormularioEstadoCliente.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadoClienteBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estado ClienteS SELECCIONADOS?", "MANTENIMIENTO DE Estado Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadoCliente();
				
						this.actualizarParametrosGeneralEstadoCliente();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadoclienteReturnGeneral=estadoclienteLogic.procesarAccionEstadoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadoclienteLogic.getEstadoClientes(),this.estadoclienteParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadoClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoCliente.jComboBoxTiposAccionesFormularioEstadoCliente.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoCliente();
					
					EstadoClienteBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadoClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoCliente.jComboBoxTiposAccionesFormularioEstadoCliente.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoCliente(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoClienteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoCliente();
			
			if(this.jInternalFrameDetalleFormEstadoCliente==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoCliente> estadoclientesSeleccionados=new ArrayList<EstadoCliente>();		
			EstadoCliente estadocliente=new EstadoCliente();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoCliente.getSelectedItem();
			
			
			
			
			estadoclientesSeleccionados=this.getEstadoClientesSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadoclientesSeleccionados.size()==1) {
				for(EstadoCliente estadoclienteAux:estadoclientesSeleccionados) {
					estadocliente=estadoclienteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Cliente")) {
					jButtonClienteActionPerformed(null,rowIndex,true,false,estadocliente);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoCliente();
			
      		//this.finishProcessEstadoCliente(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoClienteReturnGeneral() throws Exception {
		if(this.estadoclienteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadoclienteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadoclienteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadoclienteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadoclienteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadoclienteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoCliente(false);
		}
		
		if(this.estadoclienteReturnGeneral.getConRetornoLista() || this.estadoclienteReturnGeneral.getConRetornoObjeto()) {
			if(this.estadoclienteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoclienteLogic.setEstadoClientes(this.estadoclienteReturnGeneral.getEstadoClientes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadoclienteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoclienteLogic.setEstadoCliente(this.estadoclienteReturnGeneral.getEstadoCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoCliente(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoCliente() throws Exception {
		
		
	}
	
	public ArrayList<EstadoCliente> getEstadoClientesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoCliente> estadoclientesSeleccionados=new ArrayList<EstadoCliente>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoCliente) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoCliente estadoclienteAux:estadoclienteLogic.getEstadoClientes()) {
					if(estadoclienteAux.getIsSelected()) {
						estadoclientesSeleccionados.add(estadoclienteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoCliente estadoclienteAux:this.estadoclientes) {
					if(estadoclienteAux.getIsSelected()) {
						estadoclientesSeleccionados.add(estadoclienteAux);				
					}
				}
			}
			
			if(estadoclientesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadoclientesSeleccionados.addAll(this.estadoclienteLogic.getEstadoClientes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadoclientesSeleccionados.addAll(this.estadoclientes);				
					}
				}
			}
		} else {
			estadoclientesSeleccionados.add(this.estadocliente);
		}
		
		return estadoclientesSeleccionados;
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
	
	public void generarReporteEstadoClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoClientesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoClientesSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoClientesSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoClientesSeleccionados() throws Exception {
		ArrayList<EstadoCliente> estadoclientesSeleccionados=new ArrayList<EstadoCliente>();		
		
		estadoclientesSeleccionados=this.getEstadoClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoClientes("Todos",estadoclientesSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoClientesSeleccionados() throws Exception {
		ArrayList<EstadoCliente> estadoclientesSeleccionados=new ArrayList<EstadoCliente>();		
		
		estadoclientesSeleccionados=this.getEstadoClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoClientes("Todos",estadoclientesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoClientesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoCliente> estadoclientesSeleccionados=new ArrayList<EstadoCliente>();
		
		estadoclientesSeleccionados=this.getEstadoClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoClientes("Todos",estadoclientesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoClientesSeleccionados() throws Exception {
		ArrayList<EstadoCliente> estadoclientesSeleccionados=new ArrayList<EstadoCliente>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoCliente();
		
		
		estadoclientesSeleccionados=this.getEstadoClientesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoCliente();
		
		
		//this.generarReporteEstadoClientes("Todos",estadoclientesSeleccionados ,estadoclienteImplementable,estadoclienteImplementableHome);
	}
	
	public void mostrarImportacionEstadoClientes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoCliente();
		
		this.abrirFrameImportacionEstadoCliente();		
		
			
		//this.generarReporteEstadoClientes("Todos",estadoclientesSeleccionados ,estadoclienteImplementable,estadoclienteImplementableHome);
	}
	
	public void importarEstadoClientes() throws Exception {		
	
	}
	
	public void exportarEstadoClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoClientesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoClientesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoClientesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoClientesSeleccionados() throws Exception {
		ArrayList<EstadoCliente> estadoclientesSeleccionados=new ArrayList<EstadoCliente>();		
		
		estadoclientesSeleccionados=this.getEstadoClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocliente."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoCliente(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoCliente estadoclienteAux:estadoclientesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoCliente(estadoclienteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadoclienteAux.setsDetalleGeneralEntityReporte(estadoclienteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoCliente(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoClienteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoClienteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoClienteConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoClienteConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoClienteConstantesFunciones.LABEL_ESDEFECTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoCliente(EstadoCliente estadocliente,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadocliente.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadocliente.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadocliente.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadocliente.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadocliente.getes_defecto().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoClientesSeleccionados() throws Exception {
		ArrayList<EstadoCliente> estadoclientesSeleccionados=new ArrayList<EstadoCliente>();		
		
		estadoclientesSeleccionados=this.getEstadoClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocliente.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoCliente(row);				
				iRow++;
			}				
			
			for(EstadoCliente estadoclienteAux:estadoclientesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoCliente(estadoclienteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoClientesSeleccionados() throws Exception {
		ArrayList<EstadoCliente> estadoclientesSeleccionados=new ArrayList<EstadoCliente>();		
		
		estadoclientesSeleccionados=this.getEstadoClientesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocliente.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadoclientes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadocliente");
			//elementRoot.appendChild(element);
		
			for(EstadoCliente estadoclienteAux:estadoclientesSeleccionados) {
				element = document.createElement("estadocliente");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoCliente(estadoclienteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoCliente(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoClienteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoClienteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoClienteConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoClienteConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoClienteConstantesFunciones.LABEL_ESDEFECTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoCliente(EstadoCliente estadocliente,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadocliente.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadocliente.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadocliente.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(estadocliente.getes_defecto());				
	}
	
	public void setFilaDatosExportarXmlEstadoCliente(EstadoCliente estadocliente,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoClienteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadocliente.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoClienteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadocliente.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoClienteConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadocliente.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoClienteConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadocliente.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementes_defecto = document.createElement(EstadoClienteConstantesFunciones.ESDEFECTO);
		elementes_defecto.appendChild(document.createTextNode(estadocliente.getes_defecto().toString().trim()));
		element.appendChild(elementes_defecto);
	}
	
	public void generarReporteGroupGenericoEstadoClientesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoCliente> estadoclientesSeleccionados=new ArrayList<EstadoCliente>();
		
		estadoclientesSeleccionados=this.getEstadoClientesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoCliente(estadoclientesSeleccionados);
		
		this.generarReporteEstadoClientes("Todos",estadoclientesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoCliente(ArrayList<EstadoCliente> estadoclientesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoCliente estadoclienteAux:estadoclientesSeleccionados) {
				estadoclienteAux.setsDetalleGeneralEntityReporte(estadoclienteAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoClienteConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadoclienteAux.setsDescripcionGeneralEntityReporte1(estadoclienteAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoClienteConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadoclienteAux.setsDescripcionGeneralEntityReporte1(estadoclienteAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(EstadoClienteConstantesFunciones.LABEL_ESDEFECTO)) {
					existe=true;
					estadoclienteAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(estadoclienteAux.getes_defecto()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoCliente(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoCliente=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoCliente=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoCliente=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoCliente=false;
			this.isVisibilidadCeldaActualizarEstadoCliente=false;
			this.isVisibilidadCeldaEliminarEstadoCliente=false;
			this.isVisibilidadCeldaCancelarEstadoCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCliente=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCliente=false;
			this.isVisibilidadCeldaModificarEstadoCliente=false;
			this.isVisibilidadCeldaActualizarEstadoCliente=true;
			this.isVisibilidadCeldaEliminarEstadoCliente=false;
			this.isVisibilidadCeldaCancelarEstadoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCliente=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCliente=false;
			this.isVisibilidadCeldaModificarEstadoCliente=false;
			this.isVisibilidadCeldaActualizarEstadoCliente=true;
			this.isVisibilidadCeldaEliminarEstadoCliente=true;
			this.isVisibilidadCeldaCancelarEstadoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCliente=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCliente=false;
			this.isVisibilidadCeldaModificarEstadoCliente=false;
			this.isVisibilidadCeldaActualizarEstadoCliente=true;
			this.isVisibilidadCeldaEliminarEstadoCliente=false;
			this.isVisibilidadCeldaCancelarEstadoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCliente=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCliente=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoCliente=true;
			this.isVisibilidadCeldaModificarEstadoCliente=false;
			this.isVisibilidadCeldaActualizarEstadoCliente=false;
			this.isVisibilidadCeldaEliminarEstadoCliente=false;
			this.isVisibilidadCeldaCancelarEstadoCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCliente=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCliente=false;
			this.isVisibilidadCeldaActualizarEstadoCliente=false;
			this.isVisibilidadCeldaEliminarEstadoCliente=false;
			this.isVisibilidadCeldaCancelarEstadoCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCliente=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCliente=false;
			this.isVisibilidadCeldaModificarEstadoCliente=true;
			this.isVisibilidadCeldaActualizarEstadoCliente=false;
			this.isVisibilidadCeldaEliminarEstadoCliente=false;
			this.isVisibilidadCeldaCancelarEstadoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCliente=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoClienteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCliente=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoCliente=true;
		} else {
			this.actualizarEstadoPanelsEstadoCliente(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoCliente=false;
			//this.isVisibilidadCeldaVerFormEstadoCliente=false;
			this.isVisibilidadCeldaDuplicarEstadoCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadoclienteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoCliente=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadoclienteSessionBean.getEsGuardarRelacionado()) {
			if(!estadoclienteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoCliente=false;												
			}
			
			this.jButtonCerrarEstadoCliente.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoCliente=false;
		}
		
		if(!this.permiteMantenimiento(this.estadocliente)) {
			this.isVisibilidadCeldaActualizarEstadoCliente=false;
			this.isVisibilidadCeldaEliminarEstadoCliente=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoCliente() {
		this.isVisibilidadCeldaNuevoEstadoCliente=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoCliente=false;
	}
	
	public void actualizarEstadoPanelsEstadoCliente(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoCliente!=null) {
				this.jScrollPanelDatosEstadoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoCliente!=null) {
				this.jPanelPaginacionEstadoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoCliente!=null) {
				this.jPanelParametrosReportesEstadoCliente.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoCliente.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoCliente!=null) {
				this.jScrollPanelDatosEstadoCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoCliente!=null) {
				this.jPanelPaginacionEstadoCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoCliente!=null) {
				this.jPanelParametrosReportesEstadoCliente.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoCliente.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoCliente!=null) {
				this.jScrollPanelDatosEstadoCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoCliente!=null) {
				this.jPanelPaginacionEstadoCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoCliente!=null) {
				this.jPanelParametrosReportesEstadoCliente.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoCliente!=null) {
				this.jScrollPanelDatosEstadoCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoCliente!=null) {
				this.jPanelPaginacionEstadoCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoCliente!=null) {
				this.jPanelParametrosReportesEstadoCliente.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoCliente!=null) {
				this.jScrollPanelDatosEstadoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoCliente!=null) {
				this.jPanelPaginacionEstadoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoCliente!=null) {
				this.jPanelParametrosReportesEstadoCliente.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoCliente.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoCliente!=null) {
				this.jScrollPanelDatosEstadoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoCliente!=null) {
				this.jPanelPaginacionEstadoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoCliente!=null) {
				this.jPanelParametrosReportesEstadoCliente.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoCliente.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoCliente!=null) {
				this.jScrollPanelDatosEstadoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoCliente!=null) {
				this.jPanelPaginacionEstadoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoCliente!=null) {
				this.jPanelParametrosReportesEstadoCliente.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadoclienteSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoClienteParaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(this.estadoclienteSessionBean==null) {
				this.estadoclienteSessionBean=new EstadoClienteSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoCliente.clienteSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoCliente.clienteSessionBean=new ClienteSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoCliente.clienteSessionBean.setsPathNavegacionActual(estadoclienteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoCliente.clienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCliente=this.jInternalFrameDetalleFormEstadoCliente.clienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoCliente.clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			this.jInternalFrameDetalleFormEstadoCliente.clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(EstadoClienteConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoCliente.clienteSessionBean.setisBusquedaDesdeForeignKeySesionEstadoCliente(true);
			this.jInternalFrameDetalleFormEstadoCliente.clienteSessionBean.setlidEstadoClienteActual(this.idEstadoClienteActual);

			estadoclienteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoCliente(true);
			estadoclienteSessionBean.setlIdEstadoClienteActualForeignKey(this.idEstadoClienteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoClienteSessionBean estadoclienteSessionBean=new EstadoClienteSessionBean();
		
		if(this.estadoclienteSessionBean==null) {
			this.estadoclienteSessionBean=new EstadoClienteSessionBean();
		}
		
		this.estadoclienteSessionBean.setsUltimaBusquedaEstadoCliente(this.getsAccionBusqueda());
		this.estadoclienteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadoclienteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoClienteSessionBean estadoclienteSessionBean=new EstadoClienteSessionBean();
		
		if(this.estadoclienteSessionBean==null) {
			this.estadoclienteSessionBean=new EstadoClienteSessionBean();
		}
		
		if(this.estadoclienteSessionBean.getsUltimaBusquedaEstadoCliente()!=null&&!this.estadoclienteSessionBean.getsUltimaBusquedaEstadoCliente().equals("")) {
			this.setsAccionBusqueda(estadoclienteSessionBean.getsUltimaBusquedaEstadoCliente());
			this.setiNumeroPaginacion(estadoclienteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadoclienteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadoclienteSessionBean.setsUltimaBusquedaEstadoCliente("");
		this.estadoclienteSessionBean.setiNumeroPaginacion(EstadoClienteConstantesFunciones.INUMEROPAGINACION);
		this.estadoclienteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoCliente(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoCliente() {
		this.updateBorderResaltarBusquedasFormularioEstadoCliente();
		this.updateVisibilidadBusquedasFormularioEstadoCliente();
		this.updateHabilitarBusquedasFormularioEstadoCliente();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoCliente() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoCliente() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoCliente() {
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
	
	public void updateControlesFormularioEstadoCliente() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoCliente==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoCliente();
		this.updateVisibilidadResaltarControlesFormularioEstadoCliente();
		this.updateHabilitarResaltarControlesFormularioEstadoCliente();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoCliente() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadoclienteConstantesFunciones.resaltaridEstadoCliente!=null && this.jInternalFrameDetalleFormEstadoCliente!=null) {this.jInternalFrameDetalleFormEstadoCliente.jTextFieldidEstadoCliente.setBorder(this.estadoclienteConstantesFunciones.resaltaridEstadoCliente);}
		if(this.estadoclienteConstantesFunciones.resaltarcodigoEstadoCliente!=null && this.jInternalFrameDetalleFormEstadoCliente!=null) {this.jInternalFrameDetalleFormEstadoCliente.jTextFieldcodigoEstadoCliente.setBorder(this.estadoclienteConstantesFunciones.resaltarcodigoEstadoCliente);}
		if(this.estadoclienteConstantesFunciones.resaltarnombreEstadoCliente!=null && this.jInternalFrameDetalleFormEstadoCliente!=null) {this.jInternalFrameDetalleFormEstadoCliente.jTextAreanombreEstadoCliente.setBorder(this.estadoclienteConstantesFunciones.resaltarnombreEstadoCliente);}
		if(this.estadoclienteConstantesFunciones.resaltares_defectoEstadoCliente!=null && this.jInternalFrameDetalleFormEstadoCliente!=null) {this.jInternalFrameDetalleFormEstadoCliente.jCheckBoxes_defectoEstadoCliente.setBorderPainted(true);this.jInternalFrameDetalleFormEstadoCliente.jCheckBoxes_defectoEstadoCliente.setBorder(this.estadoclienteConstantesFunciones.resaltares_defectoEstadoCliente);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoCliente() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoCliente!=null) {
	
		//this.jInternalFrameDetalleFormEstadoCliente.jTextFieldidEstadoCliente.setVisible(this.estadoclienteConstantesFunciones.mostraridEstadoCliente);
		this.jInternalFrameDetalleFormEstadoCliente.jPanelidEstadoCliente.setVisible(this.estadoclienteConstantesFunciones.mostraridEstadoCliente);
		//this.jInternalFrameDetalleFormEstadoCliente.jTextFieldcodigoEstadoCliente.setVisible(this.estadoclienteConstantesFunciones.mostrarcodigoEstadoCliente);
		this.jInternalFrameDetalleFormEstadoCliente.jPanelcodigoEstadoCliente.setVisible(this.estadoclienteConstantesFunciones.mostrarcodigoEstadoCliente);
		//this.jInternalFrameDetalleFormEstadoCliente.jTextAreanombreEstadoCliente.setVisible(this.estadoclienteConstantesFunciones.mostrarnombreEstadoCliente);
		this.jInternalFrameDetalleFormEstadoCliente.jPanelnombreEstadoCliente.setVisible(this.estadoclienteConstantesFunciones.mostrarnombreEstadoCliente);
		//this.jInternalFrameDetalleFormEstadoCliente.jCheckBoxes_defectoEstadoCliente.setVisible(this.estadoclienteConstantesFunciones.mostrares_defectoEstadoCliente);
		this.jInternalFrameDetalleFormEstadoCliente.jPaneles_defectoEstadoCliente.setVisible(this.estadoclienteConstantesFunciones.mostrares_defectoEstadoCliente);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoCliente() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoCliente!=null) {
	
		this.jInternalFrameDetalleFormEstadoCliente.jTextFieldidEstadoCliente.setEnabled(this.estadoclienteConstantesFunciones.activaridEstadoCliente);
		this.jInternalFrameDetalleFormEstadoCliente.jTextFieldcodigoEstadoCliente.setEnabled(this.estadoclienteConstantesFunciones.activarcodigoEstadoCliente);
		this.jInternalFrameDetalleFormEstadoCliente.jTextAreanombreEstadoCliente.setEnabled(this.estadoclienteConstantesFunciones.activarnombreEstadoCliente);
		this.jInternalFrameDetalleFormEstadoCliente.jCheckBoxes_defectoEstadoCliente.setEnabled(this.estadoclienteConstantesFunciones.activares_defectoEstadoCliente);
		}
	}
	
		
}