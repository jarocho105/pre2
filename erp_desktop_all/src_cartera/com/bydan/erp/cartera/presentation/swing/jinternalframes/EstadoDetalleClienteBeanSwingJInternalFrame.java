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

import com.bydan.erp.cartera.util.EstadoDetalleClienteConstantesFunciones;
import com.bydan.erp.cartera.util.EstadoDetalleClienteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.EstadoDetalleClienteParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.EstadoDetalleClienteBean;
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
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class EstadoDetalleClienteBeanSwingJInternalFrame extends EstadoDetalleClienteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoDetalleClienteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoDetalleCliente> estadodetalleclienteValidator = new ClassValidator<EstadoDetalleCliente>(EstadoDetalleCliente.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoDetalleCliente estadodetallecliente;	
	public EstadoDetalleCliente estadodetalleclienteAux;
	public EstadoDetalleCliente estadodetalleclienteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoDetalleCliente estadodetalleclienteTotales;
	public Long idEstadoDetalleClienteActual;
	public Long iIdNuevoEstadoDetalleCliente=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosDetalleProve=false;

	public Boolean getIsTienePermisosDetalleProve() {
		return isTienePermisosDetalleProve;
	}

	public void setIsTienePermisosDetalleProve(Boolean isTienePermisosDetalleProve) {
		this.isTienePermisosDetalleProve= isTienePermisosDetalleProve;
	}


	public Boolean isTienePermisosDetalleMoviClienProve=false;

	public Boolean getIsTienePermisosDetalleMoviClienProve() {
		return isTienePermisosDetalleMoviClienProve;
	}

	public void setIsTienePermisosDetalleMoviClienProve(Boolean isTienePermisosDetalleMoviClienProve) {
		this.isTienePermisosDetalleMoviClienProve= isTienePermisosDetalleMoviClienProve;
	}


	public Boolean isTienePermisosDetalleCliente=false;

	public Boolean getIsTienePermisosDetalleCliente() {
		return isTienePermisosDetalleCliente;
	}

	public void setIsTienePermisosDetalleCliente(Boolean isTienePermisosDetalleCliente) {
		this.isTienePermisosDetalleCliente= isTienePermisosDetalleCliente;
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
	
	public Boolean isPermisoTodoEstadoDetalleCliente;
	public Boolean isPermisoNuevoEstadoDetalleCliente;
	public Boolean isPermisoActualizarEstadoDetalleCliente;
	public Boolean isPermisoActualizarOriginalEstadoDetalleCliente;
	public Boolean isPermisoEliminarEstadoDetalleCliente;
	public Boolean isPermisoGuardarCambiosEstadoDetalleCliente;
	public Boolean isPermisoConsultaEstadoDetalleCliente;
	public Boolean isPermisoBusquedaEstadoDetalleCliente;
	public Boolean isPermisoReporteEstadoDetalleCliente;
	public Boolean isPermisoPaginacionMedioEstadoDetalleCliente;
	public Boolean isPermisoPaginacionAltoEstadoDetalleCliente;
	public Boolean isPermisoPaginacionTodoEstadoDetalleCliente;
	public Boolean isPermisoCopiarEstadoDetalleCliente;
	public Boolean isPermisoVerFormEstadoDetalleCliente;
	public Boolean isPermisoDuplicarEstadoDetalleCliente;
	public Boolean isPermisoOrdenEstadoDetalleCliente;
	
	
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
	
	public EstadoDetalleClienteParameterReturnGeneral estadodetalleclienteReturnGeneral;
	public EstadoDetalleClienteParameterReturnGeneral estadodetalleclienteParameterGeneral;
	
	

	public DetalleProveLogic detalleproveLogic=null;

	public DetalleProveLogic getDetalleProveLogic() {
		return detalleproveLogic;
	}

	public void setDetalleProveLogic(DetalleProveLogic detalleproveLogic) {
		this.detalleproveLogic = detalleproveLogic;
	}


	public DetalleMoviClienProveLogic detallemoviclienproveLogic=null;

	public DetalleMoviClienProveLogic getDetalleMoviClienProveLogic() {
		return detallemoviclienproveLogic;
	}

	public void setDetalleMoviClienProveLogic(DetalleMoviClienProveLogic detallemoviclienproveLogic) {
		this.detallemoviclienproveLogic = detallemoviclienproveLogic;
	}


	public DetalleClienteLogic detalleclienteLogic=null;

	public DetalleClienteLogic getDetalleClienteLogic() {
		return detalleclienteLogic;
	}

	public void setDetalleClienteLogic(DetalleClienteLogic detalleclienteLogic) {
		this.detalleclienteLogic = detalleclienteLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoDetalleCliente=false;
	public Boolean esParaAccionDesdeFormularioEstadoDetalleCliente=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadoDetalleClienteSessionBeanAdditional estadodetalleclienteSessionBeanAdditional=null;
	
	public EstadoDetalleClienteSessionBeanAdditional getEstadoDetalleClienteSessionBeanAdditional() {
		return this.estadodetalleclienteSessionBeanAdditional;
	}
	
	public void setEstadoDetalleClienteSessionBeanAdditional(EstadoDetalleClienteSessionBeanAdditional estadodetalleclienteSessionBeanAdditional) {
		try {
			this.estadodetalleclienteSessionBeanAdditional=estadodetalleclienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadoDetalleClienteBeanSwingJInternalFrameAdditional estadodetalleclienteBeanSwingJInternalFrameAdditional=null;
	//public class EstadoDetalleClienteBeanSwingJInternalFrame
	
	public EstadoDetalleClienteBeanSwingJInternalFrameAdditional getEstadoDetalleClienteBeanSwingJInternalFrameAdditional() {
		return this.estadodetalleclienteBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadoDetalleClienteBeanSwingJInternalFrameAdditional(EstadoDetalleClienteBeanSwingJInternalFrameAdditional estadodetalleclienteBeanSwingJInternalFrameAdditional) {
		try {
			this.estadodetalleclienteBeanSwingJInternalFrameAdditional=estadodetalleclienteBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoDetalleClienteLogic estadodetalleclienteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoDetalleCliente estadodetalleclienteBean;
	public EstadoDetalleClienteConstantesFunciones estadodetalleclienteConstantesFunciones;
	//public EstadoDetalleClienteParameterReturnGeneral estadodetalleclienteReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoDetalleCliente> estadodetalleclientes;	
	//public List<EstadoDetalleCliente> estadodetalleclientesEliminados;
	//public List<EstadoDetalleCliente> estadodetalleclientesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoDetalleCliente=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoDetalleCliente=true;
	public Boolean isVisibilidadCeldaCopiarEstadoDetalleCliente=true;
	public Boolean isVisibilidadCeldaVerFormEstadoDetalleCliente=true;
	public Boolean isVisibilidadCeldaOrdenEstadoDetalleCliente=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoDetalleCliente=false;
	public Boolean isVisibilidadCeldaModificarEstadoDetalleCliente=false;
	public Boolean isVisibilidadCeldaActualizarEstadoDetalleCliente=false;
	public Boolean isVisibilidadCeldaEliminarEstadoDetalleCliente=false;
	public Boolean isVisibilidadCeldaCancelarEstadoDetalleCliente=false;
	public Boolean isVisibilidadCeldaGuardarEstadoDetalleCliente=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoDetalleCliente=false;	
	
	
	
	public Long getiIdNuevoEstadoDetalleCliente() {
		return this.iIdNuevoEstadoDetalleCliente;
	}

	public void setiIdNuevoEstadoDetalleCliente(Long iIdNuevoEstadoDetalleCliente) {
		this.iIdNuevoEstadoDetalleCliente = iIdNuevoEstadoDetalleCliente;
	}
	
	public Long getidEstadoDetalleClienteActual() {
		return this.idEstadoDetalleClienteActual;
	}

	public void setidEstadoDetalleClienteActual(Long idEstadoDetalleClienteActual) {
		this.idEstadoDetalleClienteActual = idEstadoDetalleClienteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoDetalleCliente getestadodetallecliente() {
		return this.estadodetallecliente;
	}

	public void setestadodetallecliente(EstadoDetalleCliente estadodetallecliente) {
		this.estadodetallecliente = estadodetallecliente;
	}
	
	public EstadoDetalleCliente getestadodetalleclienteAux() {
		return this.estadodetalleclienteAux;
	}

	public void setestadodetalleclienteAux(EstadoDetalleCliente estadodetalleclienteAux) {
		this.estadodetalleclienteAux = estadodetalleclienteAux;
	}				
	
	public EstadoDetalleCliente getestadodetalleclienteAnterior() {
		return this.estadodetalleclienteAnterior;
	}

	public void setestadodetalleclienteAnterior(EstadoDetalleCliente estadodetalleclienteAnterior) {
		this.estadodetalleclienteAnterior = estadodetalleclienteAnterior;
	}	
	
	public EstadoDetalleCliente getestadodetalleclienteTotales() {
		return this.estadodetalleclienteTotales;
	}

	public void setestadodetalleclienteTotales(EstadoDetalleCliente estadodetalleclienteTotales) {
		this.estadodetalleclienteTotales = estadodetalleclienteTotales;
	}	
	
	public EstadoDetalleCliente getestadodetalleclienteBean() {
		return this.estadodetalleclienteBean;
	}

	public void setestadodetalleclienteBean(EstadoDetalleCliente estadodetalleclienteBean) {
		this.estadodetalleclienteBean = estadodetalleclienteBean;
	}	
	
	public EstadoDetalleClienteParameterReturnGeneral getestadodetalleclienteReturnGeneral() {
		return this.estadodetalleclienteReturnGeneral;
	}

	public void setestadodetalleclienteReturnGeneral(EstadoDetalleClienteParameterReturnGeneral estadodetalleclienteReturnGeneral) {
		this.estadodetalleclienteReturnGeneral = estadodetalleclienteReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoDetalleClienteLogic getEstadoDetalleClienteLogic()	{		
		return estadodetalleclienteLogic;
	}

	public void setEstadoDetalleClienteLogic(EstadoDetalleClienteLogic estadodetalleclienteLogic) {
		this.estadodetalleclienteLogic = estadodetalleclienteLogic;
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
	
	public Boolean getIsEsNuevoEstadoDetalleCliente() {
		return isEsNuevoEstadoDetalleCliente;
	}

	public void setIsEsNuevoEstadoDetalleCliente(Boolean isEsNuevoEstadoDetalleCliente) {
		this.isEsNuevoEstadoDetalleCliente = isEsNuevoEstadoDetalleCliente;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoDetalleCliente() {
		return esParaAccionDesdeFormularioEstadoDetalleCliente;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoDetalleCliente(Boolean esParaAccionDesdeFormularioEstadoDetalleCliente) {
		this.esParaAccionDesdeFormularioEstadoDetalleCliente = esParaAccionDesdeFormularioEstadoDetalleCliente;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoDetalleCliente() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoDetalleClienteConstantesFunciones.refrescarForeignKeysDescripcionesEstadoDetalleCliente(this.estadodetalleclienteLogic.getEstadoDetalleClientes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoDetalleClienteConstantesFunciones.refrescarForeignKeysDescripcionesEstadoDetalleCliente(this.estadodetalleclientes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadodetalleclienteLogic.setEstadoDetalleClientes(this.estadodetalleclientes);
			estadodetalleclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoDetalleClienteParameterReturnGeneral getEstadoDetalleClienteParameterGeneral() {
		return this.estadodetalleclienteParameterGeneral;
	}
	
	public void setEstadoDetalleClienteParameterGeneral(EstadoDetalleClienteParameterReturnGeneral estadodetalleclienteParameterGeneral) {
		this.estadodetalleclienteParameterGeneral = estadodetalleclienteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoDetalleCliente() {
		return isPermisoTodoEstadoDetalleCliente;
	}

	public void setIsPermisoTodoEstadoDetalleCliente(Boolean isPermisoTodoEstadoDetalleCliente) {
		this.isPermisoTodoEstadoDetalleCliente = isPermisoTodoEstadoDetalleCliente;
	}

	public Boolean getIsPermisoNuevoEstadoDetalleCliente() {
		return isPermisoNuevoEstadoDetalleCliente;
	}

	public void setIsPermisoNuevoEstadoDetalleCliente(Boolean isPermisoNuevoEstadoDetalleCliente) {
		this.isPermisoNuevoEstadoDetalleCliente = isPermisoNuevoEstadoDetalleCliente;
	}

	public Boolean getIsPermisoActualizarEstadoDetalleCliente() {
		return isPermisoActualizarEstadoDetalleCliente;
	}

	public void setIsPermisoActualizarEstadoDetalleCliente(Boolean isPermisoActualizarEstadoDetalleCliente) {
		this.isPermisoActualizarEstadoDetalleCliente = isPermisoActualizarEstadoDetalleCliente;
	}

	public Boolean getIsPermisoEliminarEstadoDetalleCliente() {
		return isPermisoEliminarEstadoDetalleCliente;
	}

	public void setIsPermisoEliminarEstadoDetalleCliente(Boolean isPermisoEliminarEstadoDetalleCliente) {
		this.isPermisoEliminarEstadoDetalleCliente = isPermisoEliminarEstadoDetalleCliente;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoDetalleCliente() {
		return isPermisoGuardarCambiosEstadoDetalleCliente;
	}

	public void setIsPermisoGuardarCambiosEstadoDetalleCliente(Boolean isPermisoGuardarCambiosEstadoDetalleCliente) {
		this.isPermisoGuardarCambiosEstadoDetalleCliente = isPermisoGuardarCambiosEstadoDetalleCliente;
	}
	
	public Boolean getIsPermisoConsultaEstadoDetalleCliente() {
		return isPermisoConsultaEstadoDetalleCliente;
	}

	public void setIsPermisoConsultaEstadoDetalleCliente(Boolean isPermisoConsultaEstadoDetalleCliente) {
		this.isPermisoConsultaEstadoDetalleCliente = isPermisoConsultaEstadoDetalleCliente;
	}

	public Boolean getIsPermisoBusquedaEstadoDetalleCliente() {
		return isPermisoBusquedaEstadoDetalleCliente;
	}

	public void setIsPermisoBusquedaEstadoDetalleCliente(Boolean isPermisoBusquedaEstadoDetalleCliente) {
		this.isPermisoBusquedaEstadoDetalleCliente = isPermisoBusquedaEstadoDetalleCliente;
	}

	public Boolean getIsPermisoReporteEstadoDetalleCliente() {
		return isPermisoReporteEstadoDetalleCliente;
	}

	public void setIsPermisoReporteEstadoDetalleCliente(Boolean isPermisoReporteEstadoDetalleCliente) {
		this.isPermisoReporteEstadoDetalleCliente = isPermisoReporteEstadoDetalleCliente;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoDetalleCliente() {
		return isPermisoPaginacionMedioEstadoDetalleCliente;
	}

	public void setIsPermisoPaginacionMedioEstadoDetalleCliente(Boolean isPermisoPaginacionMedioEstadoDetalleCliente) {
		this.isPermisoPaginacionMedioEstadoDetalleCliente = isPermisoPaginacionMedioEstadoDetalleCliente;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoDetalleCliente() {
		return isPermisoPaginacionTodoEstadoDetalleCliente;
	}

	public void setIsPermisoPaginacionTodoEstadoDetalleCliente(Boolean isPermisoPaginacionTodoEstadoDetalleCliente) {
		this.isPermisoPaginacionTodoEstadoDetalleCliente = isPermisoPaginacionTodoEstadoDetalleCliente;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoDetalleCliente() {
		return isPermisoPaginacionAltoEstadoDetalleCliente;
	}

	public void setIsPermisoPaginacionAltoEstadoDetalleCliente(Boolean isPermisoPaginacionAltoEstadoDetalleCliente) {
		this.isPermisoPaginacionAltoEstadoDetalleCliente = isPermisoPaginacionAltoEstadoDetalleCliente;
	}
	
	public Boolean getIsPermisoCopiarEstadoDetalleCliente() {
		return isPermisoCopiarEstadoDetalleCliente;
	}

	public void setIsPermisoCopiarEstadoDetalleCliente(Boolean isPermisoCopiarEstadoDetalleCliente) {
		this.isPermisoCopiarEstadoDetalleCliente = isPermisoCopiarEstadoDetalleCliente;
	}
	
	public Boolean getIsPermisoVerFormEstadoDetalleCliente() {
		return isPermisoVerFormEstadoDetalleCliente;
	}

	public void setIsPermisoVerFormEstadoDetalleCliente(Boolean isPermisoVerFormEstadoDetalleCliente) {
		this.isPermisoVerFormEstadoDetalleCliente = isPermisoVerFormEstadoDetalleCliente;
	}
	
	public Boolean getIsPermisoDuplicarEstadoDetalleCliente() {
		return isPermisoDuplicarEstadoDetalleCliente;
	}

	public void setIsPermisoDuplicarEstadoDetalleCliente(Boolean isPermisoDuplicarEstadoDetalleCliente) {
		this.isPermisoDuplicarEstadoDetalleCliente = isPermisoDuplicarEstadoDetalleCliente;
	}
	
	public Boolean getIsPermisoOrdenEstadoDetalleCliente() {
		return isPermisoOrdenEstadoDetalleCliente;
	}

	public void setIsPermisoOrdenEstadoDetalleCliente(Boolean isPermisoOrdenEstadoDetalleCliente) {
		this.isPermisoOrdenEstadoDetalleCliente = isPermisoOrdenEstadoDetalleCliente;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoDetalleCliente() {
		return isVisibilidadCeldaNuevoEstadoDetalleCliente;
	}

	public void setIsVisibilidadCeldaNuevoEstadoDetalleCliente(Boolean isVisibilidadCeldaNuevoEstadoDetalleCliente) {
		this.isVisibilidadCeldaNuevoEstadoDetalleCliente = isVisibilidadCeldaNuevoEstadoDetalleCliente;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoDetalleCliente() {
		return isVisibilidadCeldaDuplicarEstadoDetalleCliente;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoDetalleCliente(Boolean isVisibilidadCeldaDuplicarEstadoDetalleCliente) {
		this.isVisibilidadCeldaDuplicarEstadoDetalleCliente = isVisibilidadCeldaDuplicarEstadoDetalleCliente;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoDetalleCliente() {
		return isVisibilidadCeldaCopiarEstadoDetalleCliente;
	}

	public void setIsVisibilidadCeldaCopiarEstadoDetalleCliente(Boolean isVisibilidadCeldaCopiarEstadoDetalleCliente) {
		this.isVisibilidadCeldaCopiarEstadoDetalleCliente = isVisibilidadCeldaCopiarEstadoDetalleCliente;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoDetalleCliente() {
		return isVisibilidadCeldaVerFormEstadoDetalleCliente;
	}

	public void setIsVisibilidadCeldaVerFormEstadoDetalleCliente(Boolean isVisibilidadCeldaVerFormEstadoDetalleCliente) {
		this.isVisibilidadCeldaVerFormEstadoDetalleCliente = isVisibilidadCeldaVerFormEstadoDetalleCliente;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoDetalleCliente() {
		return isVisibilidadCeldaOrdenEstadoDetalleCliente;
	}

	public void setIsVisibilidadCeldaOrdenEstadoDetalleCliente(Boolean isVisibilidadCeldaOrdenEstadoDetalleCliente) {
		this.isVisibilidadCeldaOrdenEstadoDetalleCliente = isVisibilidadCeldaOrdenEstadoDetalleCliente;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoDetalleCliente() {
		return isVisibilidadCeldaNuevoRelacionesEstadoDetalleCliente;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoDetalleCliente(Boolean isVisibilidadCeldaNuevoRelacionesEstadoDetalleCliente) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleCliente = isVisibilidadCeldaNuevoRelacionesEstadoDetalleCliente;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoDetalleCliente() {
		return isVisibilidadCeldaModificarEstadoDetalleCliente;
	}

	public void setIsVisibilidadCeldaModificarEstadoDetalleCliente(Boolean isVisibilidadCeldaModificarEstadoDetalleCliente) {
		this.isVisibilidadCeldaModificarEstadoDetalleCliente = isVisibilidadCeldaModificarEstadoDetalleCliente;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoDetalleCliente() {
		return isVisibilidadCeldaActualizarEstadoDetalleCliente;
	}

	public void setIsVisibilidadCeldaActualizarEstadoDetalleCliente(Boolean isVisibilidadCeldaActualizarEstadoDetalleCliente) {
		this.isVisibilidadCeldaActualizarEstadoDetalleCliente = isVisibilidadCeldaActualizarEstadoDetalleCliente;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoDetalleCliente() {
		return isVisibilidadCeldaEliminarEstadoDetalleCliente;
	}

	public void setIsVisibilidadCeldaEliminarEstadoDetalleCliente(Boolean isVisibilidadCeldaEliminarEstadoDetalleCliente) {
		this.isVisibilidadCeldaEliminarEstadoDetalleCliente = isVisibilidadCeldaEliminarEstadoDetalleCliente;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoDetalleCliente() {
		return isVisibilidadCeldaCancelarEstadoDetalleCliente;
	}

	public void setIsVisibilidadCeldaCancelarEstadoDetalleCliente(Boolean isVisibilidadCeldaCancelarEstadoDetalleCliente) {
		this.isVisibilidadCeldaCancelarEstadoDetalleCliente = isVisibilidadCeldaCancelarEstadoDetalleCliente;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoDetalleCliente() {
		return isVisibilidadCeldaGuardarEstadoDetalleCliente;
	}

	public void setIsVisibilidadCeldaGuardarEstadoDetalleCliente(Boolean isVisibilidadCeldaGuardarEstadoDetalleCliente) {
		this.isVisibilidadCeldaGuardarEstadoDetalleCliente = isVisibilidadCeldaGuardarEstadoDetalleCliente;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoDetalleCliente() {
		return isVisibilidadCeldaGuardarCambiosEstadoDetalleCliente;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoDetalleCliente(Boolean isVisibilidadCeldaGuardarCambiosEstadoDetalleCliente) {
		this.isVisibilidadCeldaGuardarCambiosEstadoDetalleCliente = isVisibilidadCeldaGuardarCambiosEstadoDetalleCliente;
	}
		
	public EstadoDetalleClienteSessionBean getestadodetalleclienteSessionBean() {
		return this.estadodetalleclienteSessionBean;
	}
	
	public void setestadodetalleclienteSessionBean(EstadoDetalleClienteSessionBean estadodetalleclienteSessionBean) {
		this.estadodetalleclienteSessionBean=estadodetalleclienteSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleCliente(EstadoDetalleCliente estadodetallecliente)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoDetalleCliente estadodetallecliente,EstadoDetalleCliente estadodetalleclienteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoDetalleCliente(estadodetallecliente);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadodetalleclienteAux.setId(estadodetallecliente.getId());
		estadodetalleclienteAux.setVersionRow(estadodetallecliente.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoDetalleCliente();
		
			int intSelectedRow = this.jTableDatosEstadoDetalleCliente.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallecliente =(EstadoDetalleCliente) this.estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadodetallecliente =(EstadoDetalleCliente) this.estadodetalleclientes.toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoDetalleClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoDetalleCliente(this.estadodetallecliente,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleCliente(this.estadodetallecliente);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadodetalleclienteValidator.getInvalidValues(this.estadodetallecliente);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadodetalleclienteLogic.setDatosCliente(datosCliente);
			estadodetalleclienteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadodetalleclienteAux=new  EstadoDetalleCliente();
				
				estadodetalleclienteAux.setIsNew(true);
				estadodetalleclienteAux.setIsChanged(true);
				
				estadodetalleclienteAux.setEstadoDetalleClienteOriginal(this.estadodetallecliente);
				
				estadodetalleclienteAux.setId(this.estadodetallecliente.getId());	
				estadodetalleclienteAux.setVersionRow(this.estadodetallecliente.getVersionRow());	
				estadodetalleclienteAux.setcodigo(this.estadodetallecliente.getcodigo());	
				estadodetalleclienteAux.setnombre(this.estadodetallecliente.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadodetalleclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadodetalleclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadodetalleclienteAux,estadodetalleclienteLogic.getEstadoDetalleClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetalleclienteAux,estadodetalleclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadodetalleclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadodetalleclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetalleclienteLogic.saveEstadoDetalleClientes();//WithConnection
						//estadodetalleclienteLogic.getSetVersionRowEstadoDetalleClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadodetallecliente,estadodetalleclienteAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadodetalleclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleproveLogic.getDetalleProves().addAll(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleprovesEliminados);
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveLogic.getDetalleMoviClienProves().addAll(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienprovesEliminados);
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclienteLogic.getDetalleClientes().addAll(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleproves.addAll(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleprovesEliminados);
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproves.addAll(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienprovesEliminados);
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclientes.addAll(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclientesEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.pagoautoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.pagoautoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.pagoautoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.autoripagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleCliente.detallerecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleCliente.detallerecapBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleCliente.detallerecapBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.pagoautoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.pagoautoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.pagoautoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.autoripagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleCliente.detallerecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleCliente.detallerecapBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleCliente.detallerecapBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadodetalleclienteLogic.saveEstadoDetalleClienteRelaciones(estadodetalleclienteAux,this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleproveLogic.getDetalleProves(),this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveLogic.getDetalleMoviClienProves(),this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclienteLogic.getDetalleClientes());//WithConnection
								//estadodetalleclienteLogic.getSetVersionRowEstadoDetalleClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadodetallecliente,estadodetalleclienteAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleproveLogic.setDetalleProves(new ArrayList<DetalleProve>());
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveLogic.setDetalleMoviClienProves(new ArrayList<DetalleMoviClienProve>());
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclienteLogic.setDetalleClientes(new ArrayList<DetalleCliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleproves= new ArrayList<DetalleProve>();
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproves= new ArrayList<DetalleMoviClienProve>();
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclientes= new ArrayList<DetalleCliente>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodetalleclienteAux.setDetalleProves(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleproveLogic.getDetalleProves());

							if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodetalleclienteAux.setDetalleMoviClienProves(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveLogic.getDetalleMoviClienProves());

							if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodetalleclienteAux.setDetalleClientes(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclienteLogic.getDetalleClientes());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadodetalleclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadodetalleclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadodetalleclienteAux,estadodetalleclienteLogic.getEstadoDetalleClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadodetalleclienteAux,estadodetalleclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadodetallecliente,estadodetalleclienteAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadodetalleclienteAux=new  EstadoDetalleCliente();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadodetalleclienteSessionBean.getEsGuardarRelacionado() 
					|| (this.estadodetalleclienteSessionBean.getEsGuardarRelacionado() && this.estadodetallecliente.getId()>=0)) {
						
					estadodetalleclienteAux.setIsNew(false);
				}
				
				estadodetalleclienteAux.setIsDeleted(false);
			
				estadodetalleclienteAux.setId(this.estadodetallecliente.getId());	
				estadodetalleclienteAux.setVersionRow(this.estadodetallecliente.getVersionRow());	
				estadodetalleclienteAux.setcodigo(this.estadodetallecliente.getcodigo());	
				estadodetalleclienteAux.setnombre(this.estadodetallecliente.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadodetalleclienteAux,estadodetalleclienteLogic.getEstadoDetalleClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetalleclienteAux,estadodetalleclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadodetalleclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadodetalleclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetalleclienteLogic.saveEstadoDetalleClientes();//WithConnection
						//estadodetalleclienteLogic.getSetVersionRowEstadoDetalleClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadodetallecliente,estadodetalleclienteAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadodetalleclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleproveLogic.getDetalleProves().addAll(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleprovesEliminados);
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveLogic.getDetalleMoviClienProves().addAll(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienprovesEliminados);
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclienteLogic.getDetalleClientes().addAll(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleproves.addAll(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleprovesEliminados);
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproves.addAll(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienprovesEliminados);
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclientes.addAll(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclientesEliminados);
						}
						//ARCHITECTURE
						
						if(!this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.pagoautoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.pagoautoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.pagoautoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.autoripagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleCliente.detallerecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleCliente.detallerecapBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleCliente.detallerecapBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.pagoautoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.pagoautoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.pagoautoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.autoripagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleCliente.detallerecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleCliente.detallerecapBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleCliente.detallerecapBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadodetalleclienteLogic.saveEstadoDetalleClienteRelaciones(estadodetalleclienteAux,this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleproveLogic.getDetalleProves(),this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveLogic.getDetalleMoviClienProves(),this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclienteLogic.getDetalleClientes());//WithConnection
								//estadodetalleclienteLogic.getSetVersionRowEstadoDetalleClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadodetallecliente,estadodetalleclienteAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleproveLogic.setDetalleProves(new ArrayList<DetalleProve>());
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveLogic.setDetalleMoviClienProves(new ArrayList<DetalleMoviClienProve>());
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclienteLogic.setDetalleClientes(new ArrayList<DetalleCliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleproves= new ArrayList<DetalleProve>();
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproves= new ArrayList<DetalleMoviClienProve>();
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclientes= new ArrayList<DetalleCliente>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodetalleclienteAux.setDetalleProves(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleproveLogic.getDetalleProves());

							if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodetalleclienteAux.setDetalleMoviClienProves(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveLogic.getDetalleMoviClienProves());

							if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodetalleclienteAux.setDetalleClientes(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclienteLogic.getDetalleClientes());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadodetalleclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadodetalleclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadodetalleclienteAux,estadodetalleclienteLogic.getEstadoDetalleClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadodetalleclienteAux,estadodetalleclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadodetallecliente,estadodetalleclienteAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadodetalleclienteAux=new  EstadoDetalleCliente();
				
				estadodetalleclienteAux.setIsNew(false);
				estadodetalleclienteAux.setIsChanged(false);
				
				estadodetalleclienteAux.setIsDeleted(true);
				
				estadodetalleclienteAux.setId(this.estadodetallecliente.getId());	
				estadodetalleclienteAux.setVersionRow(this.estadodetallecliente.getVersionRow());	
				estadodetalleclienteAux.setcodigo(this.estadodetallecliente.getcodigo());	
				estadodetalleclienteAux.setnombre(this.estadodetallecliente.getnombre());	
				
				if(this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadodetalleclienteAux.getId()>=0) {	
						this.estadodetalleclientesEliminados.add(estadodetalleclienteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadodetalleclienteAux,estadodetalleclienteLogic.getEstadoDetalleClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetalleclienteAux,estadodetalleclientes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadodetalleclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadodetalleclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetalleclienteLogic.saveEstadoDetalleClientes();//WithConnection
						//estadodetalleclienteLogic.getSetVersionRowEstadoDetalleClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadodetalleclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleproveLogic.getDetalleProves().addAll(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleprovesEliminados);
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveLogic.getDetalleMoviClienProves().addAll(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienprovesEliminados);
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclienteLogic.getDetalleClientes().addAll(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleproves.addAll(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleprovesEliminados);
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproves.addAll(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienprovesEliminados);
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclientes.addAll(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclientesEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.pagoautoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.pagoautoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.pagoautoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.autoripagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleCliente.detallerecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleCliente.detallerecapBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleCliente.detallerecapBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.pagoautoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.pagoautoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.pagoautoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.autoripagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.autoripagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleProve.autoripagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleCliente.detallerecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleCliente.detallerecapBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleCliente.detallerecapBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadodetalleclienteLogic.saveEstadoDetalleClienteRelaciones(estadodetalleclienteAux,this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleproveLogic.getDetalleProves(),this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveLogic.getDetalleMoviClienProves(),this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclienteLogic.getDetalleClientes());//WithConnection
								//estadodetalleclienteLogic.getSetVersionRowEstadoDetalleClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleproveLogic.setDetalleProves(new ArrayList<DetalleProve>());
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveLogic.setDetalleMoviClienProves(new ArrayList<DetalleMoviClienProve>());
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclienteLogic.setDetalleClientes(new ArrayList<DetalleCliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleproves= new ArrayList<DetalleProve>();
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproves= new ArrayList<DetalleMoviClienProve>();
							this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclientes= new ArrayList<DetalleCliente>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodetalleclienteAux.setDetalleProves(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleproveLogic.getDetalleProves());

							if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodetalleclienteAux.setDetalleMoviClienProves(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveLogic.getDetalleMoviClienProves());

							if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodetalleclienteAux.setDetalleClientes(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclienteLogic.getDetalleClientes());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadodetalleclienteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadodetalleclienteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadodetalleclienteAux,estadodetalleclienteLogic.getEstadoDetalleClientes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadodetalleclienteAux,estadodetalleclientes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteLogic.getEstadoDetalleClientes().addAll(this.estadodetalleclientesEliminados);
					
					estadodetalleclienteLogic.saveEstadoDetalleClientes();//WithConnection
					//estadodetalleclienteLogic.getSetVersionRowEstadoDetalleClientes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadodetalleclientesEliminados= new ArrayList<EstadoDetalleCliente>();		
			}
			
			if(this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Detalle Cliente GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Detalle Cliente",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadodetallecliente=estadodetalleclienteAux;
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
      		//this.finishProcessEstadoDetalleCliente();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoDetalleCliente estadodetalleclienteLocal) throws Exception {
		
		if(this.estadodetalleclienteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadodetalleclienteLocal.setDetalleProves(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleproveLogic.getDetalleProves());
				estadodetalleclienteLocal.setDetalleMoviClienProves(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveLogic.getDetalleMoviClienProves());
				estadodetalleclienteLocal.setDetalleClientes(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclienteLogic.getDetalleClientes());
			
			} else {
			
				estadodetalleclienteLocal.setDetalleProves(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleproves);
				estadodetalleclienteLocal.setDetalleMoviClienProves(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproves);
				estadodetalleclienteLocal.setDetalleClientes(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclientes);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoDetalleCliente estadodetalleclienteLocal) throws Exception {	
		if(this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoDetalleClienteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoDetalleCliente.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadodetallecliente =(EstadoDetalleCliente) this.estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadodetallecliente =(EstadoDetalleCliente) this.estadodetalleclientes.toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadodetalleclienteValidator.getInvalidValues(this.estadodetallecliente);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoDetalleCliente estadodetallecliente,List<EstadoDetalleCliente> estadodetalleclientes) throws Exception {
		try	{		
			EstadoDetalleClienteConstantesFunciones.actualizarLista(estadodetallecliente,estadodetalleclientes,this.estadodetalleclienteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoDetalleCliente estadodetallecliente,List<EstadoDetalleCliente> estadodetalleclientes) throws Exception {
		try	{			
			EstadoDetalleClienteConstantesFunciones.actualizarSelectedLista(estadodetallecliente,estadodetalleclientes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoDetalleCliente> estadodetalleclientesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadodetalleclientesLocal=this.estadodetalleclienteLogic.getEstadoDetalleClientes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadodetalleclientesLocal=this.estadodetalleclientes;
			}
			//ARCHITECTURE
		
			for(EstadoDetalleCliente estadodetalleclienteLocal:estadodetalleclientesLocal) {
				if(this.permiteMantenimiento(estadodetalleclienteLocal) && estadodetalleclienteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoDetalleClienteConstantesFunciones.getEstadoDetalleClienteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoDetalleClienteConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleCliente.jLabelcodigoEstadoDetalleCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoDetalleClienteConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleCliente.jLabelnombreEstadoDetalleCliente,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoDetalleCliente.jLabelcodigoEstadoDetalleCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoDetalleCliente.jLabelnombreEstadoDetalleCliente,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleProve")) {
			if(this.estadodetallecliente==null) {
				this.estadodetallecliente= new EstadoDetalleCliente();
			}

			if(this.estadodetalleclienteSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoDetalleCliente
				this.setVariablesFormularioToObjetoActualEstadoDetalleCliente(this.estadodetallecliente,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleCliente(this.estadodetallecliente);

				this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.getdetalleprove().setEstadoDetalleCliente(this.estadodetallecliente);
			}

			return;
		}
		 else  if(sTipo.equals("DetalleMoviClienProve")) {
			if(this.estadodetallecliente==null) {
				this.estadodetallecliente= new EstadoDetalleCliente();
			}

			if(this.estadodetalleclienteSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoDetalleCliente
				this.setVariablesFormularioToObjetoActualEstadoDetalleCliente(this.estadodetallecliente,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleCliente(this.estadodetallecliente);

				this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.getdetallemoviclienprove().setEstadoDetalleCliente(this.estadodetallecliente);
			}

			return;
		}
		 else  if(sTipo.equals("DetalleCliente")) {
			if(this.estadodetallecliente==null) {
				this.estadodetallecliente= new EstadoDetalleCliente();
			}

			if(this.estadodetalleclienteSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoDetalleCliente
				this.setVariablesFormularioToObjetoActualEstadoDetalleCliente(this.estadodetallecliente,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleCliente(this.estadodetallecliente);

				this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.getdetallecliente().setEstadoDetalleCliente(this.estadodetallecliente);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoDetalleCliente--;	
		
		
		this.estadodetalleclienteAux=new EstadoDetalleCliente();
		
		this.estadodetalleclienteAux.setId(this.iIdNuevoEstadoDetalleCliente);
		this.estadodetalleclienteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadodetalleclienteLogic.getEstadoDetalleClientes().add(this.estadodetalleclienteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadodetalleclientes.add(this.estadodetalleclienteAux);
		}
		//ARCHITECTURE
		
		this.estadodetallecliente=this.estadodetalleclienteAux;
		
		if(EstadoDetalleClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoDetalleCliente(this.estadodetallecliente);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleCliente(this.estadodetallecliente);
		}
				
		//this.setDefaultControlesEstadoDetalleCliente();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoDetalleCliente();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoDetalleCliente();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoDetalleCliente();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoDetalleCliente(this.estadodetalleclienteBean,this.estadodetallecliente,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleCliente(this.estadodetallecliente);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadodetalleclienteSessionBean.getConGuardarRelaciones()) {
			classes=EstadoDetalleClienteConstantesFunciones.getClassesRelationshipsOfEstadoDetalleCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadodetalleclienteReturnGeneral=estadodetalleclienteLogic.procesarEventosEstadoDetalleClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadodetalleclienteLogic.getEstadoDetalleClientes(),this.estadodetallecliente,this.estadodetalleclienteParameterGeneral,this.isEsNuevoEstadoDetalleCliente,classes);//this.estadodetalleclienteLogic.getEstadoDetalleCliente()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoDetalleCliente(this.estadodetalleclienteReturnGeneral,this.estadodetalleclienteBean,false);
		
		if(this.estadodetalleclienteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleCliente(this.estadodetalleclienteReturnGeneral.getEstadoDetalleCliente());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoDetalleCliente(this.estadodetalleclienteReturnGeneral.getEstadoDetalleCliente());
		}
		
		if(this.estadodetalleclienteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoDetalleCliente(this.estadodetalleclienteReturnGeneral.getEstadoDetalleCliente(),classes);//this.estadodetalleclienteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoDetalleCliente(this.estadodetallecliente,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoDetalleCliente();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoDetalleCliente();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoDetalleClienteBeanSwingJInternalFrameAdditional.RecargarFormEstadoDetalleCliente(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoDetalleCliente(false);
						
			if(estadodetalleclienteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleproveSessionBean.getEsGuardarRelacionado() && DetalleProveJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleProveActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveSessionBean.getEsGuardarRelacionado() && DetalleMoviClienProveJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleMoviClienProveActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclienteSessionBean.getEsGuardarRelacionado() && DetalleClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleClienteActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoDetalleClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoDetalleCliente();
			}
			
			this.actualizarVisualTableDatosEstadoDetalleCliente();
			
			this.jTableDatosEstadoDetalleCliente.setRowSelectionInterval(this.getIndiceNuevoEstadoDetalleCliente(), this.getIndiceNuevoEstadoDetalleCliente());
			
			this.seleccionarFilaTablaEstadoDetalleClienteActual();
						
			this.actualizarEstadoCeldasBotonesEstadoDetalleCliente("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoDetalleCliente(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jTextFieldcodigoEstadoDetalleCliente.setEnabled(isHabilitar && this.estadodetalleclienteConstantesFunciones.activarcodigoEstadoDetalleCliente);
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jTextAreanombreEstadoDetalleCliente.setEnabled(isHabilitar && this.estadodetalleclienteConstantesFunciones.activarnombreEstadoDetalleCliente);	
		
	};
	
	public void setDefaultControlesEstadoDetalleCliente() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoDetalleCliente(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadodetalleclienteSessionBean.setConGuardarRelaciones(true);			
			this.estadodetalleclienteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jTabbedPaneRelacionesEstadoDetalleCliente.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleproveSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadodetalleclienteSessionBean.setConGuardarRelaciones(false);			
			this.estadodetalleclienteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jTabbedPaneRelacionesEstadoDetalleCliente.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleproveSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoDetalleCliente() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleCliente estadodetalleclienteAux:this.estadodetalleclienteLogic.getEstadoDetalleClientes()) {
				if(estadodetalleclienteAux.getId().equals(this.iIdNuevoEstadoDetalleCliente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleCliente estadodetalleclienteAux:this.estadodetalleclientes) {
				if(estadodetalleclienteAux.getId().equals(this.iIdNuevoEstadoDetalleCliente)) {
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
	
	public int getIndiceActualEstadoDetalleCliente(EstadoDetalleCliente estadodetallecliente,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleCliente estadodetalleclienteAux:this.estadodetalleclienteLogic.getEstadoDetalleClientes()) {
				if(estadodetalleclienteAux.getId().equals(estadodetallecliente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleCliente estadodetalleclienteAux:this.estadodetalleclientes) {
				if(estadodetalleclienteAux.getId().equals(estadodetallecliente.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoDetalleCliente(EstadoDetalleCliente estadodetalleclienteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleCliente estadodetalleclienteAux:this.estadodetalleclienteLogic.getEstadoDetalleClientes()) {
				if(estadodetalleclienteAux.getEstadoDetalleClienteOriginal().getId().equals(estadodetalleclienteOriginal.getId())) {
					existe=true;
					estadodetalleclienteOriginal.setId(estadodetalleclienteAux.getId());
					estadodetalleclienteOriginal.setVersionRow(estadodetalleclienteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleCliente estadodetalleclienteAux:this.estadodetalleclientes) {
				if(estadodetalleclienteAux.getEstadoDetalleClienteOriginal().getId().equals(estadodetalleclienteOriginal.getId())) {
					existe=true;
					estadodetalleclienteOriginal.setId(estadodetalleclienteAux.getId());
					estadodetalleclienteOriginal.setVersionRow(estadodetalleclienteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoDetalleCliente(Boolean esParaCancelar) throws Exception {
		estadodetalleclientesAux=new ArrayList<EstadoDetalleCliente>();
		estadodetalleclienteAux=new EstadoDetalleCliente();
		
		if(!this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoDetalleCliente estadodetalleclienteAux:this.estadodetalleclienteLogic.getEstadoDetalleClientes()) {
					if(estadodetalleclienteAux.getId()<0) {
						estadodetalleclientesAux.add(estadodetalleclienteAux);
					}		
				}
				this.iIdNuevoEstadoDetalleCliente=0L;
				this.estadodetalleclienteLogic.getEstadoDetalleClientes().removeAll(estadodetalleclientesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetalleCliente estadodetalleclienteAux:this.estadodetalleclientes) {
					if(estadodetalleclienteAux.getId()<0) {
						estadodetalleclientesAux.add(estadodetalleclienteAux);
					}		
				}
				this.iIdNuevoEstadoDetalleCliente=0L;
				this.estadodetalleclientes.removeAll(estadodetalleclientesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoDetalleCliente 
					&& this.estadodetalleclienteLogic.getEstadoDetalleClientes().size()>0
					) {
					estadodetalleclienteAux=this.estadodetalleclienteLogic.getEstadoDetalleClientes().get(this.estadodetalleclienteLogic.getEstadoDetalleClientes().size() - 1);
				
					if(estadodetalleclienteAux.getId()<0) {
						this.estadodetalleclienteLogic.getEstadoDetalleClientes().remove(estadodetalleclienteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoDetalleCliente && this.estadodetalleclientes.size()>0) {
					estadodetalleclienteAux=this.estadodetalleclientes.get(this.estadodetalleclientes.size() - 1);
				
					if(estadodetalleclienteAux.getId()<0) {
						this.estadodetalleclientes.remove(estadodetalleclienteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoDetalleCliente(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadodetallecliente.getId()<0) {
				this.estadodetalleclienteLogic.getEstadoDetalleClientes().remove(this.estadodetallecliente);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadodetallecliente.getId()<0) {
				this.estadodetalleclientes.remove(this.estadodetallecliente);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoDetalleCliente(List<EstadoDetalleCliente> estadodetalleclientesAux) throws Exception {
		EstadoDetalleClienteConstantesFunciones.setEstadosInicialesEstadoDetalleCliente(estadodetalleclientesAux);
	}
	
	public void setEstadosInicialesEstadoDetalleCliente(EstadoDetalleCliente estadodetalleclienteAux) throws Exception {
		EstadoDetalleClienteConstantesFunciones.setEstadosInicialesEstadoDetalleCliente(estadodetalleclienteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoDetalleClienteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoDetalleCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoDetalleClienteActual()) {
				if(!this.isEsNuevoEstadoDetalleCliente) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoDetalleCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoDetalleCliente=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoDetalleClienteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Detalle Cliente ?", "MANTENIMIENTO DE Estado Detalle Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoDetalleCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoDetalleCliente estadodetallecliente) throws Exception {
		EstadoDetalleClienteConstantesFunciones.seleccionarAsignar(this.estadodetallecliente,estadodetallecliente);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoDetalleCliente=this.isPermisoActualizarOriginalEstadoDetalleCliente;
			
			
			this.seleccionarAsignar(estadodetallecliente);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoDetalleClienteConstantesFunciones.quitarEspaciosEstadoDetalleCliente(this.estadodetallecliente,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoDetalleCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadodetalleclienteSessionBean.setsFuncionBusquedaRapida(this.estadodetalleclienteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoDetalleCliente) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoDetalleCliente(esParaCancelar);				
				this.cancelarNuevoEstadoDetalleCliente(esParaCancelar);								
			}
			
			this.estadodetallecliente=new EstadoDetalleCliente();
			
			this.inicializarEstadoDetalleCliente();
			
			this.actualizarEstadoCeldasBotonesEstadoDetalleCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoDetalleCliente() throws Exception {
		try {
			EstadoDetalleClienteConstantesFunciones.inicializarEstadoDetalleCliente(this.estadodetallecliente);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadodetalleclienteLogic.getEstadoDetalleClientes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoDetalleClientes(String sAccionBusqueda,List<EstadoDetalleCliente> estadodetalleclientesParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoDetalleCliente"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoDetalleClienteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoDetalleClienteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoDetalleCliente"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Detalle Clientes");		
		parameters.put("busquedapor", EstadoDetalleClienteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleProve.class));
			classes.add(new Classe(DetalleMoviClienProve.class));
			classes.add(new Classe(DetalleCliente.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoDetalleClienteLogic estadodetalleclienteLogicAuxiliar=new EstadoDetalleClienteLogic();
					estadodetalleclienteLogicAuxiliar.setDatosCliente(estadodetalleclienteLogic.getDatosCliente());				
					estadodetalleclienteLogicAuxiliar.setEstadoDetalleClientes(estadodetalleclientesParaReportes);
					
					estadodetalleclienteLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoDetalleClienteWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadodetalleclientesParaReportes=estadodetalleclienteLogicAuxiliar.getEstadoDetalleClientes();
					
					//estadodetalleclienteLogic.getNewConnexionToDeep();
					
					//for (EstadoDetalleCliente estadodetallecliente:estadodetalleclientesParaReportes) {
					//	estadodetalleclienteLogic.deepLoad(estadodetallecliente, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadodetalleclienteLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadodetalleclienteLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleProve = AuxiliarReportes.class.getResourceAsStream("DetalleProveDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalleprove", reportFileDetalleProve);

			InputStream reportFileDetalleMoviClienProve = AuxiliarReportes.class.getResourceAsStream("DetalleMoviClienProveDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detallemoviclienprove", reportFileDetalleMoviClienProve);

			InputStream reportFileDetalleCliente = AuxiliarReportes.class.getResourceAsStream("DetalleClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detallecliente", reportFileDetalleCliente);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoDetalleCliente=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoDetalleClienteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoDetalleClienteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoDetalleCliente=new JRBeanArrayDataSource(EstadoDetalleClienteJInternalFrame.TraerEstadoDetalleClienteBeans(estadodetalleclientesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoDetalleCliente);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoDetalleClienteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoDetalleClienteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoDetalleClienteBean.TraerEstadoDetalleClienteBeans(estadodetalleclientesParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoDetalleClientes(sAccionBusqueda,sTipoArchivoReporte,estadodetalleclientesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoDetalleClientes(sAccionBusqueda,sTipoArchivoReporte,estadodetalleclientesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoDetalleClienteActionPerformed(null);
					//this.generarExcelReporteEstadoDetalleClientes(sAccionBusqueda,sTipoArchivoReporte,estadodetalleclientesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoDetalleClientes(sAccionBusqueda,sTipoArchivoReporte,estadodetalleclientesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoDetalleClientes(sAccionBusqueda,sTipoArchivoReporte,estadodetalleclientesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoDetalleClientes(sAccionBusqueda,sTipoArchivoReporte,estadodetalleclientesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoDetalleClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoDetalleCliente> estadodetalleclientesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetallecliente";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoDetalleClientes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoDetalleCliente("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoDetalleCliente estadodetallecliente : estadodetalleclientesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoDetalleClienteConstantesFunciones.generarExcelReporteDataEstadoDetalleCliente("NORMAL",row,workbook,estadodetallecliente,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoDetalleCliente(String sTipo,Row row,Workbook workbook) {
		
		EstadoDetalleClienteConstantesFunciones.generarExcelReporteHeaderEstadoDetalleCliente(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoDetalleClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoDetalleCliente> estadodetalleclientesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetallecliente_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoDetalleClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoDetalleCliente estadodetallecliente : estadodetalleclientesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoDetalleClienteConstantesFunciones.getEstadoDetalleClienteDescripcion(estadodetallecliente));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoDetalleClienteConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoDetalleClienteConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadodetallecliente.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoDetalleClienteConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoDetalleClienteConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadodetallecliente.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoDetalleClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoDetalleCliente> estadodetalleclientesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoDetalleCliente> estadodetalleclientesRespaldo=null;
		
		classes=EstadoDetalleClienteConstantesFunciones.getClassesRelationshipsOfEstadoDetalleCliente(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadodetalleclienteLogic.setDatosCliente(this.datosCliente);
		this.estadodetalleclienteLogic.setDatosDeep(this.datosDeep);
		this.estadodetalleclienteLogic.setIsConDeep(true);
		
		estadodetalleclientesRespaldo=this.estadodetalleclienteLogic.getEstadoDetalleClientes();
		
		this.estadodetalleclienteLogic.setEstadoDetalleClientes(estadodetalleclientesParaReportes);	
		this.estadodetalleclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadodetalleclientesParaReportes=this.estadodetalleclienteLogic.getEstadoDetalleClientes();
		this.estadodetalleclienteLogic.setEstadoDetalleClientes(estadodetalleclientesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetallecliente_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoDetalleClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoDetalleCliente("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoDetalleCliente estadodetallecliente : estadodetalleclientesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoDetalleCliente("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoDetalleClienteConstantesFunciones.generarExcelReporteDataEstadoDetalleCliente("NORMAL",row,workbook,estadodetallecliente,cellStyleDataAux);
		
			
			


				//DetalleProve
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleProveConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadodetallecliente.getDetalleProves()!=null && estadodetallecliente.getDetalleProves().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleProveConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleProveConstantesFunciones.generarExcelReporteHeaderDetalleProve("RELACIONADO",row,workbook);
				}

				if(estadodetallecliente.getDetalleProves()!=null) {
					i2=0;
					for(DetalleProve detalleprove : estadodetallecliente.getDetalleProves()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleProveConstantesFunciones.generarExcelReporteDataDetalleProve("RELACIONADO",row,workbook,detalleprove,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//DetalleMoviClienProve
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadodetallecliente.getDetalleMoviClienProves()!=null && estadodetallecliente.getDetalleMoviClienProves().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleMoviClienProveConstantesFunciones.generarExcelReporteHeaderDetalleMoviClienProve("RELACIONADO",row,workbook);
				}

				if(estadodetallecliente.getDetalleMoviClienProves()!=null) {
					i2=0;
					for(DetalleMoviClienProve detallemoviclienprove : estadodetallecliente.getDetalleMoviClienProves()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleMoviClienProveConstantesFunciones.generarExcelReporteDataDetalleMoviClienProve("RELACIONADO",row,workbook,detallemoviclienprove,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//DetalleCliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadodetallecliente.getDetalleClientes()!=null && estadodetallecliente.getDetalleClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleClienteConstantesFunciones.generarExcelReporteHeaderDetalleCliente("RELACIONADO",row,workbook);
				}

				if(estadodetallecliente.getDetalleClientes()!=null) {
					i2=0;
					for(DetalleCliente detallecliente : estadodetallecliente.getDetalleClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleClienteConstantesFunciones.generarExcelReporteDataDetalleCliente("RELACIONADO",row,workbook,detallecliente,cellStyleDataAuxHijo);
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
		cell.setCellValue(EstadoDetalleClienteConstantesFunciones.getEstadoDetalleClienteDescripcion(estadodetallecliente));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoDetalleCliente() throws Exception {		
		this.startProcessEstadoDetalleCliente(true);
	}
	
	public void startProcessEstadoDetalleCliente(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoDetalleCliente, this.jScrollPanelDatosEstadoDetalleCliente,this.jPanelPaginacionEstadoDetalleCliente, this.jScrollPanelDatosEdicionEstadoDetalleCliente, this.jPanelAccionesEstadoDetalleCliente,this.jPanelAccionesFormularioEstadoDetalleCliente,this.jmenuBarEstadoDetalleCliente,this.jmenuBarDetalleEstadoDetalleCliente,this.jTtoolBarEstadoDetalleCliente,this.jTtoolBarDetalleEstadoDetalleCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoDetalleCliente=null; 
		
		final JPanel jPanelParametrosReportesEstadoDetalleCliente=this.jPanelParametrosReportesEstadoDetalleCliente;
		//final JScrollPane jScrollPanelDatosEstadoDetalleCliente=this.jScrollPanelDatosEstadoDetalleCliente;
		final JTable jTableDatosEstadoDetalleCliente=this.jTableDatosEstadoDetalleCliente;		
		final JPanel jPanelPaginacionEstadoDetalleCliente=this.jPanelPaginacionEstadoDetalleCliente;
		//final JScrollPane jScrollPanelDatosEdicionEstadoDetalleCliente=this.jScrollPanelDatosEdicionEstadoDetalleCliente;
		final JPanel jPanelAccionesEstadoDetalleCliente=this.jPanelAccionesEstadoDetalleCliente;
		
		JPanel jPanelCamposAuxiliarEstadoDetalleCliente=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoDetalleCliente=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) {
			jPanelCamposAuxiliarEstadoDetalleCliente=this.jInternalFrameDetalleFormEstadoDetalleCliente.jPanelCamposEstadoDetalleCliente;
			jPanelAccionesFormularioAuxiliarEstadoDetalleCliente=this.jInternalFrameDetalleFormEstadoDetalleCliente.jPanelAccionesFormularioEstadoDetalleCliente;
		}
		
		final JPanel jPanelCamposEstadoDetalleCliente=jPanelCamposAuxiliarEstadoDetalleCliente;
		final JPanel jPanelAccionesFormularioEstadoDetalleCliente=jPanelAccionesFormularioAuxiliarEstadoDetalleCliente;
		
		
		final JMenuBar jmenuBarEstadoDetalleCliente=this.jmenuBarEstadoDetalleCliente;
		final JToolBar jTtoolBarEstadoDetalleCliente=this.jTtoolBarEstadoDetalleCliente;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoDetalleCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoDetalleCliente=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) {
			jmenuBarDetalleAuxiliarEstadoDetalleCliente=this.jInternalFrameDetalleFormEstadoDetalleCliente.jmenuBarDetalleEstadoDetalleCliente;
			jTtoolBarDetalleAuxiliarEstadoDetalleCliente=this.jInternalFrameDetalleFormEstadoDetalleCliente.jTtoolBarDetalleEstadoDetalleCliente;
		}
		
		final JMenuBar jmenuBarDetalleEstadoDetalleCliente=jmenuBarDetalleAuxiliarEstadoDetalleCliente;
		final JToolBar jTtoolBarDetalleEstadoDetalleCliente=jTtoolBarDetalleAuxiliarEstadoDetalleCliente;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoDetalleCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoDetalleCliente;
			processRunnable.jTableDatos=jTableDatosEstadoDetalleCliente;
			processRunnable.jPanelCampos=jPanelCamposEstadoDetalleCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoDetalleCliente;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoDetalleCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoDetalleCliente;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoDetalleCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoDetalleCliente;
			processRunnable.jTtoolBar=jTtoolBarEstadoDetalleCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoDetalleCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoDetalleCliente ,jPanelParametrosReportesEstadoDetalleCliente,jTableDatosEstadoDetalleCliente, /*jScrollPanelDatosEstadoDetalleCliente,*/jPanelCamposEstadoDetalleCliente,jPanelPaginacionEstadoDetalleCliente, /*jScrollPanelDatosEdicionEstadoDetalleCliente,*/ jPanelAccionesEstadoDetalleCliente,jPanelAccionesFormularioEstadoDetalleCliente,jmenuBarEstadoDetalleCliente,jmenuBarDetalleEstadoDetalleCliente,jTtoolBarEstadoDetalleCliente,jTtoolBarDetalleEstadoDetalleCliente);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoDetalleCliente, jScrollPanelDatosEstadoDetalleCliente,jPanelPaginacionEstadoDetalleCliente, jScrollPanelDatosEdicionEstadoDetalleCliente, jPanelAccionesEstadoDetalleCliente,jPanelAccionesFormularioEstadoDetalleCliente,jmenuBarEstadoDetalleCliente,jmenuBarDetalleEstadoDetalleCliente,jTtoolBarEstadoDetalleCliente,jTtoolBarDetalleEstadoDetalleCliente);
						
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
	
	public void finishProcessEstadoDetalleCliente() {// throws Exception 
		this.finishProcessEstadoDetalleCliente(true);
	}
	
	public void finishProcessEstadoDetalleCliente(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoDetalleCliente, this.jScrollPanelDatosEstadoDetalleCliente,this.jPanelPaginacionEstadoDetalleCliente, this.jScrollPanelDatosEdicionEstadoDetalleCliente, this.jPanelAccionesEstadoDetalleCliente,this.jPanelAccionesFormularioEstadoDetalleCliente,this.jmenuBarEstadoDetalleCliente,this.jmenuBarDetalleEstadoDetalleCliente,this.jTtoolBarEstadoDetalleCliente,this.jTtoolBarDetalleEstadoDetalleCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoDetalleCliente=null; 
		
		final JPanel jPanelParametrosReportesEstadoDetalleCliente=this.jPanelParametrosReportesEstadoDetalleCliente;
		//final JScrollPane jScrollPanelDatosEstadoDetalleCliente=this.jScrollPanelDatosEstadoDetalleCliente;
		final JTable jTableDatosEstadoDetalleCliente=this.jTableDatosEstadoDetalleCliente;		
		final JPanel jPanelPaginacionEstadoDetalleCliente=this.jPanelPaginacionEstadoDetalleCliente;
		//final JScrollPane jScrollPanelDatosEdicionEstadoDetalleCliente=this.jScrollPanelDatosEdicionEstadoDetalleCliente;
		final JPanel jPanelAccionesEstadoDetalleCliente=this.jPanelAccionesEstadoDetalleCliente;
		
		JPanel jPanelCamposAuxiliarEstadoDetalleCliente=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoDetalleCliente=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) {
			jPanelCamposAuxiliarEstadoDetalleCliente=this.jInternalFrameDetalleFormEstadoDetalleCliente.jPanelCamposEstadoDetalleCliente;
			jPanelAccionesFormularioAuxiliarEstadoDetalleCliente=this.jInternalFrameDetalleFormEstadoDetalleCliente.jPanelAccionesFormularioEstadoDetalleCliente;
		}
		
		final JPanel jPanelCamposEstadoDetalleCliente=jPanelCamposAuxiliarEstadoDetalleCliente;
		final JPanel jPanelAccionesFormularioEstadoDetalleCliente=jPanelAccionesFormularioAuxiliarEstadoDetalleCliente;
		
		
		final JMenuBar jmenuBarEstadoDetalleCliente=this.jmenuBarEstadoDetalleCliente;		
		final JToolBar jTtoolBarEstadoDetalleCliente=this.jTtoolBarEstadoDetalleCliente;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoDetalleCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoDetalleCliente=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) {
			jmenuBarDetalleAuxiliarEstadoDetalleCliente=this.jInternalFrameDetalleFormEstadoDetalleCliente.jmenuBarDetalleEstadoDetalleCliente;
			jTtoolBarDetalleAuxiliarEstadoDetalleCliente=this.jInternalFrameDetalleFormEstadoDetalleCliente.jTtoolBarDetalleEstadoDetalleCliente;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoDetalleCliente=jmenuBarDetalleAuxiliarEstadoDetalleCliente;
		final JToolBar jTtoolBarDetalleEstadoDetalleCliente=jTtoolBarDetalleAuxiliarEstadoDetalleCliente;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoDetalleCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoDetalleCliente;
			processRunnable.jTableDatos=jTableDatosEstadoDetalleCliente;
			processRunnable.jPanelCampos=jPanelCamposEstadoDetalleCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoDetalleCliente;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoDetalleCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoDetalleCliente;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoDetalleCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoDetalleCliente;
			processRunnable.jTtoolBar=jTtoolBarEstadoDetalleCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoDetalleCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoDetalleCliente ,jPanelParametrosReportesEstadoDetalleCliente, jTableDatosEstadoDetalleCliente,/*jScrollPanelDatosEstadoDetalleCliente,*/jPanelCamposEstadoDetalleCliente,jPanelPaginacionEstadoDetalleCliente, /*jScrollPanelDatosEdicionEstadoDetalleCliente,*/ jPanelAccionesEstadoDetalleCliente,jPanelAccionesFormularioEstadoDetalleCliente,jmenuBarEstadoDetalleCliente,jmenuBarDetalleEstadoDetalleCliente,jTtoolBarEstadoDetalleCliente,jTtoolBarDetalleEstadoDetalleCliente));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoDetalleCliente(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoDetalleCliente(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoDetalleCliente(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoDetalleCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoDetalleCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoDetalleCliente,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoDetalleCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoDetalleCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoDetalleCliente,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadodetalleclienteConstantesFunciones.getsFinalQueryEstadoDetalleCliente();
		String  finalQueryPaginacionTodos=this.estadodetalleclienteConstantesFunciones.getsFinalQueryEstadoDetalleCliente();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoDetalleClienteConstantesFunciones.getArrayColumnasGlobalesNoEstadoDetalleCliente(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoDetalleClienteConstantesFunciones.getArrayColumnasGlobalesEstadoDetalleCliente(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoDetalleClienteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadodetalleclientesEliminados= new ArrayList<EstadoDetalleCliente>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoDetalleCliente();
		
				///*EstadoDetalleClienteSessionBean*/this.estadodetalleclienteSessionBean=new EstadoDetalleClienteSessionBean();
			
			if(this.estadodetalleclienteSessionBean==null) {
				this.estadodetalleclienteSessionBean=new EstadoDetalleClienteSessionBean();
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
					this.iNumeroPaginacion=EstadoDetalleClienteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoDetalleClienteConstantesFunciones.getClassesForeignKeysOfEstadoDetalleCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadodetallecliente."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadodetalleclientesAux= new ArrayList<EstadoDetalleCliente>();
			
				
			estadodetalleclienteLogic.setDatosCliente(this.datosCliente);
			estadodetalleclienteLogic.setDatosDeep(this.datosDeep);
			estadodetalleclienteLogic.setIsConDeep(true);
			
			
			estadodetalleclienteLogic.getEstadoDetalleClienteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadodetalleclienteLogic.getTodosEstadoDetalleClientes(finalQueryGlobal,pagination);
					
					//estadodetalleclienteLogic.getTodosEstadoDetalleClientesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadodetalleclienteLogic.getEstadoDetalleClientes()==null|| estadodetalleclienteLogic.getEstadoDetalleClientes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadodetalleclientesAux= new ArrayList<EstadoDetalleCliente>();
							estadodetalleclientesAux.addAll(estadodetalleclienteLogic.getEstadoDetalleClientes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadodetalleclientesAux= new ArrayList<EstadoDetalleCliente>();
							estadodetalleclientesAux.addAll(estadodetalleclientes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadodetalleclienteLogic.getTodosEstadoDetalleClientes(finalQueryGlobal+"",this.pagination);												
							
							//estadodetalleclienteLogic.getTodosEstadoDetalleClientesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoDetalleClientes("Todos",estadodetalleclienteLogic.getEstadoDetalleClientes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadodetalleclienteLogic.setEstadoDetalleClientes(new ArrayList<EstadoDetalleCliente>());					
							estadodetalleclienteLogic.getEstadoDetalleClientes().addAll(estadodetalleclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadodetalleclientes=new ArrayList<EstadoDetalleCliente>();
							estadodetalleclientes.addAll(estadodetalleclientesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoDetalleCliente=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoDetalleCliente=this.idActual;
				
				} else if(this.idEstadoDetalleClienteActual!=null && this.idEstadoDetalleClienteActual!=0L) {
					idEstadoDetalleCliente=idEstadoDetalleClienteActual;
				}
				
					
				this.sDetalleReporte=EstadoDetalleClienteConstantesFunciones.getDetalleIndicePorId(idEstadoDetalleCliente);
				
				this.estadodetalleclientes=new ArrayList<EstadoDetalleCliente>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadodetalleclienteLogic.getEntity(idEstadoDetalleCliente);
					
					//estadodetalleclienteLogic.getEntityWithConnection(idEstadoDetalleCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadodetalleclienteLogic.setEstadoDetalleClientes(new ArrayList<EstadoDetalleCliente>());
					estadodetalleclienteLogic.getEstadoDetalleClientes().add(estadodetalleclienteLogic.getEstadoDetalleCliente());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadodetalleclientes=new ArrayList<EstadoDetalleCliente>();
					this.estadodetalleclientes.add(estadodetallecliente);
				}
				
				if(estadodetalleclienteLogic.getEstadoDetalleCliente()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoDetalleCliente();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoDetalleCliente();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadodetalleclienteLogic.getEstadoDetalleClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadodetalleclientes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadodetalleclienteLogic.getEstadoDetalleClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadodetalleclientes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoDetalleCliente estadodetallecliente) {
		Boolean permite=true;
		
		if(this.estadodetallecliente.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoDetalleClienteConstantesFunciones.getOrderByListaEstadoDetalleCliente();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoDetalleClienteConstantesFunciones.getOrderByListaEstadoDetalleCliente();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleCliente estadodetallecliente:estadodetalleclienteLogic.getEstadoDetalleClientes()) {
				if(estadodetallecliente.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetalleclienteTotales=estadodetallecliente;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleCliente estadodetallecliente:this.estadodetalleclientes) {
				if(estadodetallecliente.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetalleclienteTotales=estadodetallecliente;
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
			this.estadodetalleclienteAux=new EstadoDetalleCliente();
			this.estadodetalleclienteAux.setsType(Constantes2.S_TOTALES);
			this.estadodetalleclienteAux.setIsNew(false);
			this.estadodetalleclienteAux.setIsChanged(false);
			this.estadodetalleclienteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoDetalleClienteConstantesFunciones.TotalizarValoresFilaEstadoDetalleCliente(this.estadodetalleclienteLogic.getEstadoDetalleClientes(),this.estadodetalleclienteAux);
				
				this.estadodetalleclienteLogic.getEstadoDetalleClientes().add(this.estadodetalleclienteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoDetalleClienteConstantesFunciones.TotalizarValoresFilaEstadoDetalleCliente(this.estadodetalleclientes,this.estadodetalleclienteAux);
				
				this.estadodetalleclientes.add(this.estadodetalleclienteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadodetalleclienteTotales=new EstadoDetalleCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadodetalleclienteLogic.getEstadoDetalleClientes().remove(estadodetalleclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadodetalleclientes.remove(estadodetalleclienteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadodetalleclienteTotales=new EstadoDetalleCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleCliente estadodetallecliente:estadodetalleclienteLogic.getEstadoDetalleClientes()) {
				if(estadodetallecliente.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetalleclienteTotales=estadodetallecliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoDetalleClienteConstantesFunciones.TotalizarValoresFilaEstadoDetalleCliente(this.estadodetalleclienteLogic.getEstadoDetalleClientes(),estadodetalleclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleCliente estadodetallecliente:this.estadodetalleclientes) {
				if(estadodetallecliente.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetalleclienteTotales=estadodetallecliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoDetalleClienteConstantesFunciones.TotalizarValoresFilaEstadoDetalleCliente(this.estadodetalleclientes,estadodetalleclienteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEstadoDetalleClientePorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getEstadoDetalleClientePorCodigo(String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadodetalleclienteLogic.getEstadoDetalleClientePorCodigo(codigo);
				
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
	
	public void inicializarPermisosEstadoDetalleCliente() {
		this.isPermisoTodoEstadoDetalleCliente=false;
		this.isPermisoNuevoEstadoDetalleCliente=false;
		this.isPermisoActualizarEstadoDetalleCliente=false;
		this.isPermisoActualizarOriginalEstadoDetalleCliente=false;
		this.isPermisoEliminarEstadoDetalleCliente=false;
		this.isPermisoGuardarCambiosEstadoDetalleCliente=false;
		this.isPermisoConsultaEstadoDetalleCliente=false;
		this.isPermisoBusquedaEstadoDetalleCliente=false;
		this.isPermisoReporteEstadoDetalleCliente=false;		
		this.isPermisoOrdenEstadoDetalleCliente=false;		
		this.isPermisoPaginacionMedioEstadoDetalleCliente=false;		
		this.isPermisoPaginacionAltoEstadoDetalleCliente=false;
		this.isPermisoPaginacionTodoEstadoDetalleCliente=false;
		this.isPermisoCopiarEstadoDetalleCliente=false;		
		this.isPermisoVerFormEstadoDetalleCliente=false;		
		this.isPermisoDuplicarEstadoDetalleCliente=false;		
		this.isPermisoOrdenEstadoDetalleCliente=false;		
	}
	
	public void setPermisosUsuarioEstadoDetalleCliente(Boolean isPermiso) {
		this.isPermisoTodoEstadoDetalleCliente=isPermiso;
		this.isPermisoNuevoEstadoDetalleCliente=isPermiso;
		this.isPermisoActualizarEstadoDetalleCliente=isPermiso;
		this.isPermisoActualizarOriginalEstadoDetalleCliente=isPermiso;
		this.isPermisoEliminarEstadoDetalleCliente=isPermiso;
		this.isPermisoGuardarCambiosEstadoDetalleCliente=isPermiso;
		this.isPermisoConsultaEstadoDetalleCliente=isPermiso;
		this.isPermisoBusquedaEstadoDetalleCliente=isPermiso;
		this.isPermisoReporteEstadoDetalleCliente=isPermiso;
		this.isPermisoOrdenEstadoDetalleCliente=isPermiso;		
		this.isPermisoPaginacionMedioEstadoDetalleCliente=isPermiso;		
		this.isPermisoPaginacionAltoEstadoDetalleCliente=isPermiso;		
		this.isPermisoPaginacionTodoEstadoDetalleCliente=isPermiso;		
		this.isPermisoCopiarEstadoDetalleCliente=isPermiso;		
		this.isPermisoVerFormEstadoDetalleCliente=isPermiso;		
		this.isPermisoDuplicarEstadoDetalleCliente=isPermiso;
		this.isPermisoOrdenEstadoDetalleCliente=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoDetalleCliente(Boolean isPermiso) {
		//this.isPermisoTodoEstadoDetalleCliente=isPermiso;
		this.isPermisoNuevoEstadoDetalleCliente=isPermiso;
		this.isPermisoActualizarEstadoDetalleCliente=isPermiso;
		this.isPermisoActualizarOriginalEstadoDetalleCliente=isPermiso;
		this.isPermisoEliminarEstadoDetalleCliente=isPermiso;
		this.isPermisoGuardarCambiosEstadoDetalleCliente=isPermiso;
		//this.isPermisoConsultaEstadoDetalleCliente=isPermiso;
		//this.isPermisoBusquedaEstadoDetalleCliente=isPermiso;
		//this.isPermisoReporteEstadoDetalleCliente=isPermiso;
		//this.isPermisoOrdenEstadoDetalleCliente=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoDetalleCliente=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoDetalleCliente=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoDetalleCliente=isPermiso;		
		//this.isPermisoCopiarEstadoDetalleCliente=isPermiso;		
		//this.isPermisoDuplicarEstadoDetalleCliente=isPermiso;
		//this.isPermisoOrdenEstadoDetalleCliente=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoDetalleClienteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleProveConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(DetalleMoviClienProveConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(DetalleClienteConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoDetalleClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleProve=false;
		this.isTienePermisosDetalleProve=this.verificarGetPermisosUsuarioOpcionEstadoDetalleClienteClaseRelacionada(this.opcionsRelacionadas,DetalleProveConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosDetalleMoviClienProve=false;
		this.isTienePermisosDetalleMoviClienProve=this.verificarGetPermisosUsuarioOpcionEstadoDetalleClienteClaseRelacionada(this.opcionsRelacionadas,DetalleMoviClienProveConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosDetalleCliente=false;
		this.isTienePermisosDetalleCliente=this.verificarGetPermisosUsuarioOpcionEstadoDetalleClienteClaseRelacionada(this.opcionsRelacionadas,DetalleClienteConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoDetalleCliente(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoDetalleClienteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleProve=conPermiso;
		this.isTienePermisosDetalleMoviClienProve=conPermiso;
		this.isTienePermisosDetalleCliente=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoDetalleClienteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoDetalleClienteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoDetalleClienteClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleProve && this.jInternalFrameDetalleFormEstadoDetalleCliente!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jTabbedPaneRelacionesEstadoDetalleCliente.remove(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosDetalleMoviClienProve && this.jInternalFrameDetalleFormEstadoDetalleCliente!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jTabbedPaneRelacionesEstadoDetalleCliente.remove(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosDetalleCliente && this.jInternalFrameDetalleFormEstadoDetalleCliente!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jTabbedPaneRelacionesEstadoDetalleCliente.remove(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoDetalleCliente() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoDetalleClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoDetalleClienteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoDetalleCliente=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoDetalleCliente=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoDetalleCliente=this.isPermisoActualizarEstadoDetalleCliente;
			this.isPermisoEliminarEstadoDetalleCliente=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoDetalleCliente=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoDetalleCliente=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoDetalleCliente=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoDetalleCliente=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoDetalleCliente=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoDetalleCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoDetalleCliente=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoDetalleCliente=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoDetalleCliente=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoDetalleCliente=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoDetalleCliente=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoDetalleCliente=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoDetalleCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoDetalleCliente.setToolTipText(this.jTableDatosEstadoDetalleCliente.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoDetalleCliente(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoDetalleCliente(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoDetalleClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoDetalleClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoDetalleCliente() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleProve && this.estadodetalleclienteConstantesFunciones.mostrarDetalleProveEstadoDetalleCliente && !EstadoDetalleClienteConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Prove");
			reporte.setsDescripcion("Detalle Prove");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosDetalleMoviClienProve && this.estadodetalleclienteConstantesFunciones.mostrarDetalleMoviClienProveEstadoDetalleCliente && !EstadoDetalleClienteConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Cliente");
			reporte.setsDescripcion("Detalle Cliente");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosDetalleCliente && this.estadodetalleclienteConstantesFunciones.mostrarDetalleClienteEstadoDetalleCliente && !EstadoDetalleClienteConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Cliente");
			reporte.setsDescripcion("Detalle Cliente");
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
	
		
	public void inicializarCombosForeignKeyEstadoDetalleClienteListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoDetalleClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoDetalleClienteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoDetalleClienteListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoDetalleClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoDetalleCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoDetalleCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoDetalleCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoDetalleCliente()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoDetalleCliente();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleCliente(EstadoDetalleCliente estadodetallecliente)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoDetalleCliente(EstadoDetalleCliente estadodetallecliente,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoDetalleCliente()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoDetalleCliente()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoDetalleCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoDetalleCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoDetalleCliente()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoDetalleCliente()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoDetalleCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoDetalleCliente()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoDetalleClienteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoDetalleClienteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoDetalleClienteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadodetalleclienteSessionBean=new EstadoDetalleClienteSessionBean(); 
		this.estadodetalleclienteConstantesFunciones=new EstadoDetalleClienteConstantesFunciones(); 
		this.estadodetalleclienteBean=new EstadoDetalleCliente();//(this.estadodetalleclienteConstantesFunciones); 		
		this.estadodetalleclienteReturnGeneral=new EstadoDetalleClienteParameterReturnGeneral(); 
		
		this.estadodetalleclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadodetalleclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoDetalleClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoDetalleClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoDetalleClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoDetalleCliente(true);
			
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
			
			this.estadodetalleclienteConstantesFunciones=new EstadoDetalleClienteConstantesFunciones(); 
			this.estadodetalleclienteBean=new EstadoDetalleCliente();//this.estadodetalleclienteConstantesFunciones); 			
			this.estadodetalleclienteReturnGeneral=new EstadoDetalleClienteParameterReturnGeneral(); 
		
			EstadoDetalleClienteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Detalle Cliente Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadodetallecliente=new EstadoDetalleCliente();
			this.estadodetalleclientes = new ArrayList<EstadoDetalleCliente>();
			this.estadodetalleclientesAux = new ArrayList<EstadoDetalleCliente>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic=new EstadoDetalleClienteLogic();
				this.estadodetalleclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estadodetalleclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadodetalleclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoDetalleCliente);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoDetalleCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoDetalleCliente);	
					}
					
					if(this.jInternalFrameImportacionEstadoDetalleCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoDetalleCliente);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoDetalleCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoDetalleCliente);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoDetalleCliente);
				this.jInternalFrameDetalleFormEstadoDetalleCliente.setVisible(false);
				this.jInternalFrameDetalleFormEstadoDetalleCliente.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoDetalleCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoDetalleCliente);
					this.jInternalFrameReporteDinamicoEstadoDetalleCliente.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoDetalleCliente.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoDetalleCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoDetalleCliente);
					this.jInternalFrameImportacionEstadoDetalleCliente.setVisible(false);
					this.jInternalFrameImportacionEstadoDetalleCliente.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoDetalleCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoDetalleCliente);
					this.jInternalFrameOrderByEstadoDetalleCliente.setVisible(false);
					this.jInternalFrameOrderByEstadoDetalleCliente.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoDetalleClienteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoDetalleClienteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadodetalleclienteReturnGeneral=new EstadoDetalleClienteParameterReturnGeneral();
			
			this.estadodetalleclienteParameterGeneral=new EstadoDetalleClienteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadodetalleclienteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoDetalleClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleProveConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(DetalleMoviClienProveConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(DetalleClienteConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoDetalleClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadodetalleclienteSessionBean.getEsGuardarRelacionado(),this.estadodetalleclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoDetalleClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadodetalleclienteSessionBean.getEsGuardarRelacionado(),this.estadodetalleclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoDetalleCliente=false;
			this.isVisibilidadCeldaDuplicarEstadoDetalleCliente=true;
			this.isVisibilidadCeldaCopiarEstadoDetalleCliente=true;
			this.isVisibilidadCeldaVerFormEstadoDetalleCliente=true;
			this.isVisibilidadCeldaOrdenEstadoDetalleCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleCliente=false;
			this.isVisibilidadCeldaModificarEstadoDetalleCliente=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleCliente=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleCliente=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleCliente=false;
			this.isVisibilidadCeldaGuardarEstadoDetalleCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleCliente=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoDetalleCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoDetalleCliente();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoDetalleCliente(false);
			
			this.setPermisosUsuarioEstadoDetalleCliente();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadodetalleclienteSessionBean.getEsGuardarRelacionado() 
				|| (this.estadodetalleclienteSessionBean.getEsGuardarRelacionado() && this.estadodetalleclienteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoDetalleClienteClasesRelacionadas();
			}
			
			if(this.estadodetalleclienteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoDetalleClienteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoDetalleClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoDetalleCliente();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoDetalleCliente();
			}
			
			if(!this.isPermisoBusquedaEstadoDetalleCliente) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoDetalleCliente,this.isPermisoPaginacionMedioEstadoDetalleCliente,this.isPermisoPaginacionTodoEstadoDetalleCliente);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoDetalleClienteConstantesFunciones.getTiposSeleccionarEstadoDetalleCliente());
				
				this.tiposColumnasSelect=EstadoDetalleClienteConstantesFunciones.getTiposSeleccionarEstadoDetalleCliente(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoDetalleCliente();				
				//this.tiposRelacionesSelect=EstadoDetalleClienteConstantesFunciones.getTiposRelacionesEstadoDetalleCliente(true);
				
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
			//if(!this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoDetalleCliente();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoDetalleCliente(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoDetalleCliente(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetalleCliente() ;
			
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
			
			
			this.detalleproveLogic=new DetalleProveLogic();
			this.detallemoviclienproveLogic=new DetalleMoviClienProveLogic();
			this.detalleclienteLogic=new DetalleClienteLogic(); 
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
				estadodetalleclienteImplementable= (EstadoDetalleClienteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoDetalleClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadodetalleclienteImplementableHome= (EstadoDetalleClienteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoDetalleClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadodetalleclientes= new ArrayList<EstadoDetalleCliente>();
			this.estadodetalleclientesEliminados= new ArrayList<EstadoDetalleCliente>();
						
			this.isEsNuevoEstadoDetalleCliente=false;
			this.esParaAccionDesdeFormularioEstadoDetalleCliente=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoDetalleCliente(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoDetalleCliente();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadoDetalleClienteBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoDetalleClienteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoDetalleCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoDetalleCliente(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoDetalleCliente();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoDetalleCliente();
			}
			
			EstadoDetalleClienteBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoDetalleCliente(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoDetalleCliente: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoDetalleCliente() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleProveConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleProveConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(DetalleClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoDetalleCliente")) {
				iIndex=this.jInternalFrameDetalleFormEstadoDetalleCliente.jTabbedPaneRelacionesEstadoDetalleCliente.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoDetalleCliente.jTabbedPaneRelacionesEstadoDetalleCliente.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoDetalleCliente.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Clientes")) {
					if(!DetalleClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoDetalleCliente();

						this.cargarParteTabPanelRelacionadaDetalleCliente(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Detalle Clientes")) {
					if(!DetalleMoviClienProveJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoDetalleCliente();

						this.cargarParteTabPanelRelacionadaDetalleMoviClienProve(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Detalle Proves")) {
					if(!DetalleProveJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoDetalleCliente();

						this.cargarParteTabPanelRelacionadaDetalleProve(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoDetalleCliente();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoDetalleCliente.cargarSessionConBeanSwingJInternalFrameDetalleCliente(false,true,iIndex);
		this.jButtonDetalleClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleCliente();

		//this.jTabbedPaneRelacionesEstadoDetalleCliente.updateUI();
		//this.jTabbedPaneRelacionesEstadoDetalleCliente.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoDetalleCliente.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaDetalleMoviClienProve(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoDetalleCliente.cargarSessionConBeanSwingJInternalFrameDetalleMoviClienProve(false,true,iIndex);
		this.jButtonDetalleMoviClienProveActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleMoviClienProve();

		//this.jTabbedPaneRelacionesEstadoDetalleCliente.updateUI();
		//this.jTabbedPaneRelacionesEstadoDetalleCliente.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoDetalleCliente.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaDetalleProve(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoDetalleCliente.cargarSessionConBeanSwingJInternalFrameDetalleProve(false,true,iIndex);
		this.jButtonDetalleProveActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleProve();

		//this.jTabbedPaneRelacionesEstadoDetalleCliente.updateUI();
		//this.jTabbedPaneRelacionesEstadoDetalleCliente.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoDetalleCliente.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleProve")) {
				int row=this.jTableDatosEstadoDetalleCliente.getSelectedRow();
				jButtonDetalleProveActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("DetalleMoviClienProve")) {
				int row=this.jTableDatosEstadoDetalleCliente.getSelectedRow();
				jButtonDetalleMoviClienProveActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("DetalleCliente")) {
				int row=this.jTableDatosEstadoDetalleCliente.getSelectedRow();
				jButtonDetalleClienteActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Prove")) {

					if(this.isTienePermisosDetalleProve && this.estadodetalleclienteConstantesFunciones.mostrarDetalleProveEstadoDetalleCliente && !EstadoDetalleClienteConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Proves"+"("+DetalleProveConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Proves");

						if(estadodetalleclienteConstantesFunciones.resaltarDetalleProveEstadoDetalleCliente!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadodetalleclienteConstantesFunciones.resaltarDetalleProveEstadoDetalleCliente);
						}

						jmenuItem.setEnabled(this.estadodetalleclienteConstantesFunciones.activarDetalleProveEstadoDetalleCliente);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleProve"));

						

						this.jInternalFrameDetalleFormEstadoDetalleCliente.jmenuDetalleEstadoDetalleCliente.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Detalle Cliente")) {

					if(this.isTienePermisosDetalleMoviClienProve && this.estadodetalleclienteConstantesFunciones.mostrarDetalleMoviClienProveEstadoDetalleCliente && !EstadoDetalleClienteConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Clientes"+"("+DetalleMoviClienProveConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Clientes");

						if(estadodetalleclienteConstantesFunciones.resaltarDetalleMoviClienProveEstadoDetalleCliente!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadodetalleclienteConstantesFunciones.resaltarDetalleMoviClienProveEstadoDetalleCliente);
						}

						jmenuItem.setEnabled(this.estadodetalleclienteConstantesFunciones.activarDetalleMoviClienProveEstadoDetalleCliente);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleMoviClienProve"));

						

						this.jInternalFrameDetalleFormEstadoDetalleCliente.jmenuDetalleEstadoDetalleCliente.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Detalle Cliente")) {

					if(this.isTienePermisosDetalleCliente && this.estadodetalleclienteConstantesFunciones.mostrarDetalleClienteEstadoDetalleCliente && !EstadoDetalleClienteConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Clientes"+"("+DetalleClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Clientes");

						if(estadodetalleclienteConstantesFunciones.resaltarDetalleClienteEstadoDetalleCliente!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadodetalleclienteConstantesFunciones.resaltarDetalleClienteEstadoDetalleCliente);
						}

						jmenuItem.setEnabled(this.estadodetalleclienteConstantesFunciones.activarDetalleClienteEstadoDetalleCliente);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleCliente"));

						

						this.jInternalFrameDetalleFormEstadoDetalleCliente.jmenuDetalleEstadoDetalleCliente.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoDetalleCliente(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoDetalleCliente(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoDetalleCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoDetalleClienteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoDetalleCliente();
		
		this.cargarCombosFrameForeignKeyEstadoDetalleCliente();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoDetalleCliente();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoDetalleCliente();
		}
	}
	
	
	
	public void jButtonNuevoEstadoDetalleClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadodetalleclienteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoDetalleCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
			
			
			if(jTableDatosEstadoDetalleCliente.getRowCount()>=1) {
				jTableDatosEstadoDetalleCliente.removeRowSelectionInterval(0, jTableDatosEstadoDetalleCliente.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoDetalleCliente=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoDetalleCliente(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoDetalleCliente(true);			
			//this.estadodetallecliente=new EstadoDetalleCliente();
			//this.estadodetallecliente.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoDetalleCliente(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetalleCliente() ;
			
			if(EstadoDetalleClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoDetalleCliente(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadodetallecliente);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetallecliente);				
			
			EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
			
			if(this.estadodetalleclienteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoDetalleCliente: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoDetalleClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoDetalleCliente> estadodetalleclientesSeleccionados=new ArrayList<EstadoDetalleCliente>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoDetalleCliente.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoDetalleCliente.getSelectedRows().length;			
			}
			
			estadodetalleclientesSeleccionados=this.getEstadoDetalleClientesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoDetalleCliente--;			
				//EstadoDetalleCliente estadodetalleclienteAux= new EstadoDetalleCliente();			
				//estadodetalleclienteAux.setId(this.iIdNuevoEstadoDetalleCliente);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoDetalleCliente estadodetalleclienteOrigen=new EstadoDetalleCliente();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoDetalleCliente estadodetalleclienteOrigen : estadodetalleclientesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoDetalleCliente.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadodetalleclienteOrigen =(EstadoDetalleCliente) this.estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadodetalleclienteOrigen =(EstadoDetalleCliente) this.estadodetalleclientes.toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoDetalleCliente();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadodetallecliente.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoDetalleCliente(estadodetalleclienteOrigen,this.estadodetallecliente,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleCliente(this.estadodetallecliente);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadodetalleclienteLogic.getEstadoDetalleClientes().add(this.estadodetalleclienteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadodetalleclientes.add(this.estadodetalleclienteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoDetalleCliente(false);
				
				this.jTableDatosEstadoDetalleCliente.setRowSelectionInterval(this.getIndiceNuevoEstadoDetalleCliente(), this.getIndiceNuevoEstadoDetalleCliente());
				
				int iLastRow =  this.jTableDatosEstadoDetalleCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoDetalleCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoDetalleCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoDetalleCliente(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoDetalleClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoDetalleCliente> estadodetalleclientesSeleccionados=new ArrayList<EstadoDetalleCliente>();									
		
			EstadoDetalleCliente estadodetalleclienteOrigen=new EstadoDetalleCliente();
			EstadoDetalleCliente estadodetalleclienteDestino=new EstadoDetalleCliente();
				
			estadodetalleclientesSeleccionados=this.getEstadoDetalleClientesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoDetalleCliente.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadodetalleclientesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoDetalleCliente.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetalleclienteOrigen =(EstadoDetalleCliente) this.estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadodetalleclienteOrigen =(EstadoDetalleCliente) this.estadodetalleclientes.toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetalleclienteDestino =(EstadoDetalleCliente) this.estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadodetalleclienteDestino =(EstadoDetalleCliente) this.estadodetalleclientes.toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadodetalleclienteOrigen =estadodetalleclientesSeleccionados.get(0);
				estadodetalleclienteDestino =estadodetalleclientesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoDetalleCliente(estadodetalleclienteOrigen,estadodetalleclienteDestino,true,false);
				
				estadodetalleclienteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadodetalleclienteDestino,estadodetalleclienteLogic.getEstadoDetalleClientes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetalleclienteDestino,estadodetalleclientes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoDetalleCliente(false);
				
				//this.jTableDatosEstadoDetalleCliente.setRowSelectionInterval(this.getIndiceNuevoEstadoDetalleCliente(), this.getIndiceNuevoEstadoDetalleCliente());
				
				int iLastRow =  this.jTableDatosEstadoDetalleCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoDetalleCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoDetalleCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoDetalleCliente(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoDetalleClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoDetalleCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoDetalleCliente.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoDetalleClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoDetalleCliente.isVisible();
			
			
			this.jPanelParametrosReportesEstadoDetalleCliente.setVisible(!isVisible);
			this.jPanelPaginacionEstadoDetalleCliente.setVisible(!isVisible);
			this.jPanelAccionesEstadoDetalleCliente.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoDetalleClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoDetalleCliente();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoDetalleClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoDetalleCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoDetalleClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoDetalleCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoDetalleClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoDetalleCliente();
			
			this.abrirFrameOrderByEstadoDetalleCliente();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoDetalleClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoDetalleCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoDetalleCliente(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoDetalleCliente);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoDetalleCliente.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoDetalleCliente.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoDetalleCliente.setSize(this.jInternalFrameDetalleFormEstadoDetalleCliente.iWidthFormulario,this.jInternalFrameDetalleFormEstadoDetalleCliente.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoDetalleCliente.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoDetalleCliente.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoDetalleCliente.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoDetalleCliente.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoDetalleCliente.jContentPaneDetalleEstadoDetalleCliente.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoDetalleCliente.jTabbedPaneRelacionesEstadoDetalleCliente.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoDetalleCliente.jContentPaneDetalleEstadoDetalleCliente.getWidth(),EstadoDetalleClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoDetalleCliente.jTabbedPaneRelacionesEstadoDetalleCliente.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoDetalleCliente.jContentPaneDetalleEstadoDetalleCliente.getWidth(),EstadoDetalleClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoDetalleCliente.jTabbedPaneRelacionesEstadoDetalleCliente.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoDetalleCliente.jContentPaneDetalleEstadoDetalleCliente.getWidth(),EstadoDetalleClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleCliente();
					}

					if(DetalleMoviClienProveJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleMoviClienProve();
					}

					if(DetalleProveJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleProve();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoDetalleCliente.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoDetalleCliente.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoDetalleCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoDetalleCliente==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoDetalleCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetalleCliente,false,this);
				} else {
					this.jInternalFrameOrderByEstadoDetalleCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetalleCliente,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoDetalleCliente);
				this.jInternalFrameOrderByEstadoDetalleCliente.setVisible(false);
				this.jInternalFrameOrderByEstadoDetalleCliente.setSelected(false);
				
				this.jInternalFrameOrderByEstadoDetalleCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoDetalleCliente"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoDetalleCliente();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoDetalleCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoDetalleCliente==null) {
				
				this.jInternalFrameImportacionEstadoDetalleCliente=new ImportacionJInternalFrame(EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoDetalleCliente);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoDetalleCliente);
				this.jInternalFrameImportacionEstadoDetalleCliente.setVisible(false);
				this.jInternalFrameImportacionEstadoDetalleCliente.setSelected(false);


				this.jInternalFrameImportacionEstadoDetalleCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoDetalleCliente"));
				this.jInternalFrameImportacionEstadoDetalleCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoDetalleCliente"));
				this.jInternalFrameImportacionEstadoDetalleCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoDetalleCliente"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoDetalleCliente() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoDetalleCliente==null) {
				this.jInternalFrameReporteDinamicoEstadoDetalleCliente=new ReporteDinamicoJInternalFrame(EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoDetalleCliente);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoDetalleCliente);
				this.jInternalFrameReporteDinamicoEstadoDetalleCliente.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoDetalleCliente.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoDetalleCliente"));
				this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoDetalleCliente"));
				this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoDetalleCliente"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoDetalleCliente();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.jScrollPanelDatosDetalleCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoDetalleCliente.jContentPaneDetalleEstadoDetalleCliente.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.jScrollPanelDatosDetalleCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.jScrollPanelDatosDetalleCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.jScrollPanelDatosDetalleCliente.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaDetalleMoviClienProve() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.jScrollPanelDatosDetalleMoviClienProve.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoDetalleCliente.jContentPaneDetalleEstadoDetalleCliente.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.jScrollPanelDatosDetalleMoviClienProve.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.jScrollPanelDatosDetalleMoviClienProve.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.jScrollPanelDatosDetalleMoviClienProve.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaDetalleProve() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jScrollPanelDatosDetalleProve.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoDetalleCliente.jContentPaneDetalleEstadoDetalleCliente.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jScrollPanelDatosDetalleProve.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jScrollPanelDatosDetalleProve.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.jScrollPanelDatosDetalleProve.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoDetalleCliente() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoDetalleCliente);
			
	       	this.jInternalFrameDetalleFormEstadoDetalleCliente.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoDetalleCliente.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoDetalleCliente.dispose();
			//this.jInternalFrameDetalleFormEstadoDetalleCliente=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoDetalleCliente() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoDetalleCliente.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoDetalleCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoDetalleCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoDetalleCliente.setVisible(true);
	        this.jInternalFrameImportacionEstadoDetalleCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoDetalleCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoDetalleCliente.setVisible(true);
	        this.jInternalFrameOrderByEstadoDetalleCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoDetalleCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoDetalleCliente.setVisible(false);
	        this.jInternalFrameOrderByEstadoDetalleCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoDetalleCliente() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoDetalleCliente.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoDetalleCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoDetalleCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoDetalleCliente.setVisible(false);
	        this.jInternalFrameImportacionEstadoDetalleCliente.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoDetalleClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoDetalleCliente(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoDetalleCliente(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoDetalleCliente.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoDetalleCliente(true);
			//this.isEsNuevoEstadoDetalleCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallecliente =(EstadoDetalleCliente) this.estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadodetallecliente =(EstadoDetalleCliente) this.estadodetalleclientes.toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoDetalleCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoDetalleCliente(false) ;
			
			if(estadodetalleclienteSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleproveSessionBean.getEsGuardarRelacionado() && DetalleProveJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleProveActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveSessionBean.getEsGuardarRelacionado() && DetalleMoviClienProveJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleMoviClienProveActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclienteSessionBean.getEsGuardarRelacionado() && DetalleClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleClienteActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoDetalleClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoDetalleCliente(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetalleCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoDetalleClienteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoDetalleCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallecliente =(EstadoDetalleCliente) this.estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetallecliente =(EstadoDetalleCliente) this.estadodetalleclientes.toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoDetalleCliente(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoDetalleCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoDetalleCliente.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoDetalleCliente(true);
			//this.isEsNuevoEstadoDetalleCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallecliente =(EstadoDetalleCliente) this.estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadodetallecliente =(EstadoDetalleCliente) this.estadodetalleclientes.toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadodetallecliente.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoDetalleCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoDetalleCliente(false) ;
			
			if(EstadoDetalleClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoDetalleCliente(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetalleCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoDetalleClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoDetalleCliente(false);
			
			//if(!this.isEsNuevoEstadoDetalleCliente) {								
				int intSelectedRow = this.jTableDatosEstadoDetalleCliente.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallecliente =(EstadoDetalleCliente) this.estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadodetallecliente =(EstadoDetalleCliente) this.estadodetalleclientes.toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoDetalleClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoDetalleCliente(this.estadodetallecliente,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleCliente(this.estadodetallecliente);
				
			}
			
			if(this.permiteMantenimiento(this.estadodetallecliente)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoDetalleCliente=true;
					this.inicializarActualizarBindingTablaEstadoDetalleCliente(false);
					this.isEsNuevoEstadoDetalleCliente=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoDetalleCliente=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoDetalleCliente=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoDetalleCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoDetalleCliente(false);
				
				this.habilitarDeshabilitarControlesEstadoDetalleCliente(false);
			
												
				
				if(EstadoDetalleClienteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoDetalleCliente();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoDetalleClienteActionPerformed(evt,estadodetalleclienteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoDetalleCliente(this.estadodetallecliente,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoDetalleCliente.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadodetalleclienteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadodetallecliente.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleCliente.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleCliente.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoDetalleClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoDetalleCliente.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetallecliente =(EstadoDetalleCliente) this.estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
				this.estadodetallecliente.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadodetallecliente =(EstadoDetalleCliente) this.estadodetalleclientes.toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
				this.estadodetallecliente.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadodetallecliente)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoDetalleClienteModel) this.jTableDatosEstadoDetalleCliente.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoDetalleCliente=true;
				this.inicializarActualizarBindingTablaEstadoDetalleCliente(false);
				this.isEsNuevoEstadoDetalleCliente=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoDetalleCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoDetalleCliente(false);
				
				this.habilitarDeshabilitarControlesEstadoDetalleCliente(false);
				
				
				
				if(EstadoDetalleClienteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoDetalleCliente();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoDetalleClienteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoDetalleCliente.getRowCount()>=1) {
				jTableDatosEstadoDetalleCliente.removeRowSelectionInterval(0, jTableDatosEstadoDetalleCliente.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoDetalleCliente(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoDetalleCliente(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoDetalleCliente(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetalleCliente(false) ;
			
			this.isEsNuevoEstadoDetalleCliente=false;
			
			if(EstadoDetalleClienteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoDetalleCliente();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoDetalleClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoDetalleCliente(false);
				
				//SI ES MANUAL
				if(EstadoDetalleClienteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoDetalleCliente();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoDetalleClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoDetalleCliente--;			
			//EstadoDetalleCliente estadodetalleclienteAux= new EstadoDetalleCliente();			
			//estadodetalleclienteAux.setId(this.iIdNuevoEstadoDetalleCliente);
			
			if(this.jInternalFrameDetalleFormEstadoDetalleCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoDetalleCliente();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleCliente(this.estadodetallecliente);
			
			this.estadodetallecliente.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadodetalleclienteLogic.getEstadoDetalleClientes().add(this.estadodetalleclienteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadodetalleclientes.add(this.estadodetalleclienteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoDetalleCliente(false);
			
			this.jTableDatosEstadoDetalleCliente.setRowSelectionInterval(this.getIndiceNuevoEstadoDetalleCliente(), this.getIndiceNuevoEstadoDetalleCliente());
			
			int iLastRow =  this.jTableDatosEstadoDetalleCliente.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoDetalleCliente.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoDetalleCliente.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoDetalleCliente(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoDetalleClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoDetalleCliente(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetalleCliente(false);
			
			//SI ES MANUAL
			if(EstadoDetalleClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoDetalleCliente();
			}
			
			//this.abrirFrameTreeEstadoDetalleCliente();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoDetalleClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Detalle ClienteS ?", "MANTENIMIENTO DE Estado Detalle Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoDetalleCliente.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoDetalleCliente();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadodetalleclienteReturnGeneral=estadodetalleclienteLogic.procesarImportacionEstadoDetalleClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadodetalleclienteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoDetalleClienteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoDetalleClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoDetalleCliente.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoDetalleCliente.setFileImportacion(this.jInternalFrameImportacionEstadoDetalleCliente.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoDetalleCliente.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoDetalleCliente.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoDetalleCliente.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoDetalleCliente.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoDetalleClienteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoDetalleCliente> estadodetalleclientesSeleccionados=new ArrayList<EstadoDetalleCliente>();		

		estadodetalleclientesSeleccionados=this.getEstadoDetalleClientesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoDetalleClienteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoDetalleClienteBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoDetalleClientes("Todos",estadodetalleclientesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoDetalleClienteConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoDetalleClienteConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoDetalleClienteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoDetalleClienteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoDetalleClienteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoDetalleClienteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoDetalleClienteConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoDetalleClienteConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoDetalleClienteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoDetalleCliente> estadodetalleclientesSeleccionados=new ArrayList<EstadoDetalleCliente>();		
		
		estadodetalleclientesSeleccionados=this.getEstadoDetalleClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetallecliente";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoDetalleClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoDetalleClienteConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoDetalleClienteConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoDetalleCliente estadodetallecliente:estadodetalleclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadodetallecliente.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoDetalleClienteConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoDetalleClienteConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoDetalleCliente estadodetallecliente:estadodetalleclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadodetallecliente.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoDetalleCliente(row);				
			//	iRow++;
			//}				
			
			//for(EstadoDetalleCliente estadodetalleclienteAux:estadodetalleclientesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoDetalleCliente(estadodetalleclienteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Cliente",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadodetalleclienteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetalleCliente(false);
			
			//SI ES MANUAL
			if(EstadoDetalleClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoDetalleCliente();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoDetalleClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetalleCliente(false);
			
			//SI ES MANUAL
			if(EstadoDetalleClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoDetalleCliente();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoDetalleClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetalleCliente(false);
			
			//SI ES MANUAL
			if(EstadoDetalleClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoDetalleCliente();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoDetalleCliente() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoDetalleCliente.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoDetalleCliente.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoDetalleCliente.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoDetalleCliente.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoDetalleCliente.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoDetalleCliente.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoDetalleCliente.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoDetalleCliente(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoDetalleCliente(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoDetalleCliente(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoDetalleCliente(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoDetalleCliente(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoDetalleCliente(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetalleCliente(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoDetalleCliente(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoDetalleClienteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoDetalleClienteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoDetalleCliente() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoDetalleCliente();
		
		this.inicializarActualizarBindingBotonesManualEstadoDetalleCliente(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoDetalleCliente();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetalleCliente() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoDetalleCliente(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoDetalleCliente(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoDetalleCliente.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoDetalleCliente.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoDetalleCliente.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoDetalleCliente.jCheckBoxPostAccionNuevoEstadoDetalleCliente.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoDetalleCliente.jCheckBoxPostAccionSinCerrarEstadoDetalleCliente.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoDetalleCliente.jCheckBoxPostAccionSinMensajeEstadoDetalleCliente.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoDetalleCliente.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoDetalleCliente.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoDetalleCliente.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) {
				this.jInternalFrameDetalleFormEstadoDetalleCliente.jCheckBoxPostAccionNuevoEstadoDetalleCliente.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoDetalleCliente.jCheckBoxPostAccionSinCerrarEstadoDetalleCliente.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoDetalleCliente.jCheckBoxPostAccionSinMensajeEstadoDetalleCliente.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoDetalleCliente.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoDetalleCliente.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoDetalleCliente.jComboBoxTiposAccionesFormularioEstadoDetalleCliente.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoDetalleCliente.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoDetalleCliente!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoDetalleCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoDetalleCliente.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoDetalleCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoDetalleCliente.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoDetalleCliente!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoDetalleCliente.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoDetalleCliente.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoDetalleCliente(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoDetalleClienteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoDetalleCliente(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetalleCliente() throws Exception {
		try	{
			if(EstadoDetalleClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoDetalleCliente();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoDetalleCliente() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jComboBoxTiposAccionesFormularioEstadoDetalleCliente.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jComboBoxTiposAccionesFormularioEstadoDetalleCliente.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoDetalleCliente() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoDetalleCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoDetalleCliente.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoDetalleCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoDetalleCliente.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoDetalleCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoDetalleCliente.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoDetalleCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoDetalleCliente.addItem(reporte);
			}
			
			
			if(!this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoDetalleCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoDetalleCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoDetalleCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoDetalleCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoDetalleCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoDetalleCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoDetalleCliente.jComboBoxTiposAccionesFormularioEstadoDetalleCliente.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoDetalleCliente.jComboBoxTiposAccionesFormularioEstadoDetalleCliente.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoDetalleCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoDetalleCliente.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoDetalleCliente.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoDetalleCliente();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoDetalleCliente() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoDetalleCliente!=null) {
				this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoDetalleCliente!=null) {
				this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoDetalleCliente!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoDetalleCliente()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoDetalleCliente(Boolean esInicializar) throws Exception {				
		if(EstadoDetalleClienteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoDetalleCliente();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoDetalleCliente() throws Exception {
		this.inicializarActualizarBindingTablaEstadoDetalleCliente(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoDetalleCliente() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoDetalleCliente.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoDetalleCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoDetalleCliente.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoDetalleClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoDetalleCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoDetalleCliente.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoDetalleClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoDetalleClienteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleClienteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoDetalleClientePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoDetalleCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoDetalleCliente.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoDetalleClientePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoDetalleCliente.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoDetalleCliente(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadodetalleclienteLogic.getEstadoDetalleClientes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadodetalleclientes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoDetalleClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoDetalleCliente.setModel(new EstadoDetalleClienteModel(this.estadodetalleclienteLogic.getEstadoDetalleClientes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoDetalleCliente.setModel(new EstadoDetalleClienteModel(this.estadodetalleclientes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoDetalleCliente!=null && this.jInternalFrameOrderByEstadoDetalleCliente.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoDetalleCliente();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoDetalleCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleCliente,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoDetalleClientePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO,estadodetalleclienteConstantesFunciones.resaltarSeleccionarEstadoDetalleCliente,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoDetalleClienteConstantesFunciones.SCLASSWEBTITULO,estadodetalleclienteConstantesFunciones.resaltarSeleccionarEstadoDetalleCliente,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoDetalleCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleCliente,EstadoDetalleClienteConstantesFunciones.LABEL_ID));

		if(this.estadodetalleclienteConstantesFunciones.mostraridEstadoDetalleCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoDetalleClienteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadodetalleclienteConstantesFunciones.resaltaridEstadoDetalleCliente,this.estadodetalleclienteConstantesFunciones.activaridEstadoDetalleCliente,this,true,"idEstadoDetalleCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadodetalleclienteConstantesFunciones.resaltaridEstadoDetalleCliente,this.estadodetalleclienteConstantesFunciones.activaridEstadoDetalleCliente,this,true,"idEstadoDetalleCliente","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoDetalleCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleCliente,EstadoDetalleClienteConstantesFunciones.LABEL_CODIGO));

		if(this.estadodetalleclienteConstantesFunciones.mostrarcodigoEstadoDetalleCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoDetalleClienteConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadodetalleclienteConstantesFunciones.resaltarcodigoEstadoDetalleCliente,this.estadodetalleclienteConstantesFunciones.activarcodigoEstadoDetalleCliente,this,true,"codigoEstadoDetalleCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadodetalleclienteConstantesFunciones.resaltarcodigoEstadoDetalleCliente,this.estadodetalleclienteConstantesFunciones.activarcodigoEstadoDetalleCliente,this,true,"codigoEstadoDetalleCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoDetalleClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoDetalleCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleCliente,EstadoDetalleClienteConstantesFunciones.LABEL_NOMBRE));

		if(this.estadodetalleclienteConstantesFunciones.mostrarnombreEstadoDetalleCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoDetalleClienteConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadodetalleclienteConstantesFunciones.resaltarnombreEstadoDetalleCliente,this.estadodetalleclienteConstantesFunciones.activarnombreEstadoDetalleCliente,this,true,"nombreEstadoDetalleCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadodetalleclienteConstantesFunciones.resaltarnombreEstadoDetalleCliente,this.estadodetalleclienteConstantesFunciones.activarnombreEstadoDetalleCliente,this,true,"nombreEstadoDetalleCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoDetalleClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleProve && this.estadodetalleclienteConstantesFunciones.mostrarDetalleProveEstadoDetalleCliente && !EstadoDetalleClienteConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Proves");
				tableColumn.setHeaderValue("Detalle Proves");
				tableColumn.setCellRenderer(new DetalleProveTableCell(estadodetalleclienteConstantesFunciones.resaltarDetalleProveEstadoDetalleCliente,this,this.estadodetalleclienteConstantesFunciones.activarDetalleProveEstadoDetalleCliente));
				tableColumn.setCellEditor(new DetalleProveTableCell(estadodetalleclienteConstantesFunciones.resaltarDetalleProveEstadoDetalleCliente,this,this.estadodetalleclienteConstantesFunciones.activarDetalleProveEstadoDetalleCliente));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoDetalleCliente.addColumn(tableColumn);
			}

			if(this.isTienePermisosDetalleMoviClienProve && this.estadodetalleclienteConstantesFunciones.mostrarDetalleMoviClienProveEstadoDetalleCliente && !EstadoDetalleClienteConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Clientes");
				tableColumn.setHeaderValue("Detalle Clientes");
				tableColumn.setCellRenderer(new DetalleMoviClienProveTableCell(estadodetalleclienteConstantesFunciones.resaltarDetalleMoviClienProveEstadoDetalleCliente,this,this.estadodetalleclienteConstantesFunciones.activarDetalleMoviClienProveEstadoDetalleCliente));
				tableColumn.setCellEditor(new DetalleMoviClienProveTableCell(estadodetalleclienteConstantesFunciones.resaltarDetalleMoviClienProveEstadoDetalleCliente,this,this.estadodetalleclienteConstantesFunciones.activarDetalleMoviClienProveEstadoDetalleCliente));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoDetalleCliente.addColumn(tableColumn);
			}

			if(this.isTienePermisosDetalleCliente && this.estadodetalleclienteConstantesFunciones.mostrarDetalleClienteEstadoDetalleCliente && !EstadoDetalleClienteConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Clientes");
				tableColumn.setHeaderValue("Detalle Clientes");
				tableColumn.setCellRenderer(new DetalleClienteTableCell(estadodetalleclienteConstantesFunciones.resaltarDetalleClienteEstadoDetalleCliente,this,this.estadodetalleclienteConstantesFunciones.activarDetalleClienteEstadoDetalleCliente));
				tableColumn.setCellEditor(new DetalleClienteTableCell(estadodetalleclienteConstantesFunciones.resaltarDetalleClienteEstadoDetalleCliente,this,this.estadodetalleclienteConstantesFunciones.activarDetalleClienteEstadoDetalleCliente));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoDetalleCliente.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoDetalleCliente.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoDetalleCliente.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoDetalleCliente && this.isPermisoGuardarCambiosEstadoDetalleCliente) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoDetalleCliente.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadodetalleclienteSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoDetalleCliente.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoDetalleCliente.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoDetalleCliente && this.isPermisoGuardarCambiosEstadoDetalleCliente) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadodetalleclienteSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoDetalleCliente && this.isPermisoGuardarCambiosEstadoDetalleCliente) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoDetalleCliente.moveColumn(this.jTableDatosEstadoDetalleCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoDetalleCliente.moveColumn(this.jTableDatosEstadoDetalleCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadodetalleclienteSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoDetalleCliente.moveColumn(this.jTableDatosEstadoDetalleCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoDetalleCliente.moveColumn(this.jTableDatosEstadoDetalleCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoDetalleCliente.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoDetalleCliente.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoDetalleCliente,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoDetalleClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoDetalleCliente.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoDetalleCliente.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoDetalleClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoDetalleClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoDetalleCliente.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoDetalleCliente.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoDetalleCliente.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadodetalleclienteLogic.getEstadoDetalleClientes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadodetalleclientes.size()-1;
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
		//this.jTableDatosEstadoDetalleCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoDetalleCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoDetalleCliente();
			
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
				
				//this.isEsNuevoEstadoDetalleCliente=false;
					
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
			
				if(this.estadodetalleclienteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoDetalleCliente==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoDetalleCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoDetalleCliente.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallecliente =(EstadoDetalleCliente) this.estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetallecliente =(EstadoDetalleCliente) this.estadodetalleclientes.toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadodetallecliente.getsType().equals("DUPLICADO")
				   || this.estadodetallecliente.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoDetalleCliente=true;
				
				} else {
					this.isEsNuevoEstadoDetalleCliente=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
					if(this.estadodetallecliente.getId()>=0 && !this.estadodetallecliente.getIsNew()) {						
						this.isEsNuevoEstadoDetalleCliente=false;
						
					} else {
						this.isEsNuevoEstadoDetalleCliente=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoDetalleCliente(esRelaciones);						
				
				this.seleccionarEstadoDetalleCliente(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadodetallecliente.getId()<0) {
					this.isEsNuevoEstadoDetalleCliente=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoDetalleCliente(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoDetalleCliente(evt,rowIndex);
				}	
				
				if(this.estadodetalleclienteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoDetalleCliente: " + this.dDif); 
					}
				}								
				
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoDetalleCliente(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadodetallecliente)) {
					if(this.estadodetallecliente.getId()>0) {
						this.estadodetallecliente.setIsDeleted(true);
						
						this.estadodetalleclientesEliminados.add(this.estadodetallecliente);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadodetalleclienteLogic.getEstadoDetalleClientes().remove(this.estadodetallecliente);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadodetalleclientes.remove(this.estadodetallecliente);				
					}
					
					
					((EstadoDetalleClienteModel) this.jTableDatosEstadoDetalleCliente.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoDetalleCliente(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoDetalleCliente(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoDetalleCliente) {
			
			if(this.jInternalFrameDetalleFormEstadoDetalleCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoDetalleCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoDetalleCliente.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetallecliente =(EstadoDetalleCliente) this.estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetallecliente =(EstadoDetalleCliente) this.estadodetalleclientes.toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoDetalleClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoDetalleCliente(this.estadodetallecliente);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoDetalleCliente("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoDetalleCliente(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoDetalleCliente() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoDetalleCliente(EstadoDetalleCliente estadodetallecliente) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoDetalleCliente(estadodetallecliente,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoDetalleCliente(EstadoDetalleCliente estadodetallecliente,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoDetalleCliente(estadodetallecliente);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoDetalleCliente(estadodetallecliente,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleCliente(estadodetallecliente);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoDetalleCliente(EstadoDetalleCliente estadodetallecliente) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoDetalleCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jLabelidEstadoDetalleCliente.setText(estadodetallecliente.getId().toString());
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jTextFieldcodigoEstadoDetalleCliente.setText(estadodetallecliente.getcodigo());
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jTextAreanombreEstadoDetalleCliente.setText(estadodetallecliente.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoDetalleCliente estadodetalleclienteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadodetalleclienteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoDetalleCliente estadodetalleclienteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadodetalleclienteLocal=this.estadodetallecliente;
			} else {
				estadodetalleclienteLocal=this.estadodetalleclienteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadodetalleclienteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoDetalleCliente(estadodetalleclienteLocal,true);
					
					if(estadodetalleclienteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadodetalleclienteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadodetalleclienteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoDetalleCliente(EstadoDetalleCliente estadodetallecliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoDetalleCliente(estadodetallecliente,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleCliente(estadodetallecliente);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoDetalleCliente(EstadoDetalleCliente estadodetallecliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoDetalleCliente(estadodetallecliente,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoDetalleCliente(EstadoDetalleCliente estadodetallecliente,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoDetalleCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoDetalleCliente.jLabelidEstadoDetalleCliente.getText()==null || this.jInternalFrameDetalleFormEstadoDetalleCliente.jLabelidEstadoDetalleCliente.getText()=="" || this.jInternalFrameDetalleFormEstadoDetalleCliente.jLabelidEstadoDetalleCliente.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoDetalleCliente.jLabelidEstadoDetalleCliente.setText("0");
			}

			if(conColumnasBase) {estadodetallecliente.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoDetalleCliente.jLabelidEstadoDetalleCliente.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoDetalleClienteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleCliente.jLabelIdEstadoDetalleCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadodetallecliente.setcodigo(this.jInternalFrameDetalleFormEstadoDetalleCliente.jTextFieldcodigoEstadoDetalleCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoDetalleClienteConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleCliente.jLabelcodigoEstadoDetalleCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadodetallecliente.setnombre(this.jInternalFrameDetalleFormEstadoDetalleCliente.jTextAreanombreEstadoDetalleCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoDetalleClienteConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleCliente.jLabelnombreEstadoDetalleCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoDetalleCliente(EstadoDetalleCliente estadodetalleclienteBean,EstadoDetalleCliente estadodetallecliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoDetalleCliente(EstadoDetalleCliente estadodetalleclienteOrigen,EstadoDetalleCliente estadodetallecliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadodetalleclienteOrigen.getId()!=null && !estadodetalleclienteOrigen.getId().equals(0L))) {estadodetallecliente.setId(estadodetalleclienteOrigen.getId());}}
			if(conDefault || (!conDefault && estadodetalleclienteOrigen.getcodigo()!=null && !estadodetalleclienteOrigen.getcodigo().equals(""))) {estadodetallecliente.setcodigo(estadodetalleclienteOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadodetalleclienteOrigen.getnombre()!=null && !estadodetalleclienteOrigen.getnombre().equals(""))) {estadodetallecliente.setnombre(estadodetalleclienteOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoDetalleCliente(EstadoDetalleCliente estadodetallecliente) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jLabelidEstadoDetalleCliente.setText(estadodetallecliente.getId().toString());
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jTextFieldcodigoEstadoDetalleCliente.setText(estadodetallecliente.getcodigo());
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jTextAreanombreEstadoDetalleCliente.setText(estadodetallecliente.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoDetalleCliente(EstadoDetalleClienteBean estadodetalleclienteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jLabelidEstadoDetalleCliente.setText(estadodetalleclienteBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jTextFieldcodigoEstadoDetalleCliente.setText(estadodetalleclienteBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jTextAreanombreEstadoDetalleCliente.setText(estadodetalleclienteBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoDetalleCliente(EstadoDetalleClienteParameterReturnGeneral estadodetalleclienteReturnGeneral,EstadoDetalleClienteBean estadodetalleclienteBean,Boolean conDefault) throws Exception { 
		try {
			EstadoDetalleCliente estadodetalleclienteLocal=new EstadoDetalleCliente();
			
			estadodetalleclienteLocal=estadodetalleclienteReturnGeneral.getEstadoDetalleCliente();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadodetalleclienteLocal.getId()!=null && !estadodetalleclienteLocal.getId().equals(0L))) {estadodetalleclienteBean.setId(estadodetalleclienteLocal.getId());}}
			if(conDefault || (!conDefault && estadodetalleclienteLocal.getcodigo()!=null && !estadodetalleclienteLocal.getcodigo().equals(""))) {estadodetalleclienteBean.setcodigo(estadodetalleclienteLocal.getcodigo());}
			if(conDefault || (!conDefault && estadodetalleclienteLocal.getnombre()!=null && !estadodetalleclienteLocal.getnombre().equals(""))) {estadodetalleclienteBean.setnombre(estadodetalleclienteLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoDetalleClienteGenerico(Long idEstadoDetalleClienteSeleccionado,JComboBox jComboBoxEstadoDetalleCliente,List<EstadoDetalleCliente> estadodetalleclientesLocal)throws Exception {
		try {
			EstadoDetalleCliente  estadodetalleclienteTemp=null;

			for(EstadoDetalleCliente estadodetalleclienteAux:estadodetalleclientesLocal) {
				if(estadodetalleclienteAux.getId()!=null && estadodetalleclienteAux.getId().equals(idEstadoDetalleClienteSeleccionado)) {
					estadodetalleclienteTemp=estadodetalleclienteAux;
					break;
				}
			}

			jComboBoxEstadoDetalleCliente.setSelectedItem(estadodetalleclienteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoDetalleClienteGenerico(JComboBox jComboBoxEstadoDetalleCliente,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoDetalleCliente.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoDetalleCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoDetalleCliente.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoDetalleCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetalleProve")) {
			jButtonDetalleProveActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("DetalleMoviClienProve")) {
			jButtonDetalleMoviClienProveActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("DetalleCliente")) {
			jButtonDetalleClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadodetallecliente=(EstadoDetalleCliente) estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadodetallecliente =(EstadoDetalleCliente) estadodetalleclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoDetalleCliente estadodetalleclienteRow=new EstadoDetalleCliente();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadodetalleclienteRow=(EstadoDetalleCliente) estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadodetalleclienteRow=(EstadoDetalleCliente) estadodetalleclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleProveActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoDetalleCliente estadodetallecliente) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoDetalleCliente==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetallecliente = (EstadoDetalleCliente)this.estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadodetallecliente = (EstadoDetalleCliente)this.estadodetalleclientes.toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadodetallecliente!=null) {
						this.estadodetallecliente = estadodetallecliente;
					} else {
						this.estadodetallecliente = new EstadoDetalleCliente();
					}
				}

				if(this.isTienePermisosDetalleProve && this.permiteMantenimiento(this.estadodetallecliente)) {
					DetalleProveBeanSwingJInternalFrame detalleproveBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFramePopup=new DetalleProveBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleproveBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFramePopup;
					} else {
						detalleproveBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame;
					}

					List<EstadoDetalleCliente> estadodetalleclientes=new ArrayList<EstadoDetalleCliente>();
					estadodetalleclientes.add(this.estadodetallecliente);
					if(!esRelacionado) {
						//detalleproveBeanSwingJInternalFrame.detalleproveSessionBean.setConGuardarRelaciones(false);
						//detalleproveBeanSwingJInternalFrame.detalleproveSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleproveBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoDetalleCliente.cargarDetalleProveBeanSwingJInternalFrame(estadodetalleclientes,this.estadodetallecliente,detalleproveBeanSwingJInternalFrame,/*conInicializar,*/detalleproveBeanSwingJInternalFrame.detalleproveSessionBean.getConGuardarRelaciones(),detalleproveBeanSwingJInternalFrame.detalleproveSessionBean.getEsGuardarRelacionado());
					detalleproveBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleproveBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleProve("no_relacionado");

						detalleproveBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleProveConstantesFunciones.ITAMANIOFILATABLA + (DetalleProveConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleproveBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoDetalleCliente=(TitledBorder)this.jScrollPanelDatosEstadoDetalleCliente.getBorder();
						TitledBorder titledBorderDetalleProve=(TitledBorder)detalleproveBeanSwingJInternalFrame.jScrollPanelDatosDetalleProve.getBorder();

						titledBorderDetalleProve.setTitle(titledBorderEstadoDetalleCliente.getTitle() + " -> Detalle Prove");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleproveBeanSwingJInternalFrame);
						}

						detalleproveBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleproveBeanSwingJInternalFrame);

						detalleproveBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadodetalleclienteSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Prove",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonDetalleMoviClienProveActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoDetalleCliente estadodetallecliente) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoDetalleCliente==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetallecliente = (EstadoDetalleCliente)this.estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadodetallecliente = (EstadoDetalleCliente)this.estadodetalleclientes.toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadodetallecliente!=null) {
						this.estadodetallecliente = estadodetallecliente;
					} else {
						this.estadodetallecliente = new EstadoDetalleCliente();
					}
				}

				if(this.isTienePermisosDetalleMoviClienProve && this.permiteMantenimiento(this.estadodetallecliente)) {
					DetalleMoviClienProveBeanSwingJInternalFrame detallemoviclienproveBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFramePopup=new DetalleMoviClienProveBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detallemoviclienproveBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFramePopup;
					} else {
						detallemoviclienproveBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame;
					}

					List<EstadoDetalleCliente> estadodetalleclientes=new ArrayList<EstadoDetalleCliente>();
					estadodetalleclientes.add(this.estadodetallecliente);
					if(!esRelacionado) {
						//detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveSessionBean.setConGuardarRelaciones(false);
						//detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detallemoviclienproveBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoDetalleCliente.cargarDetalleMoviClienProveBeanSwingJInternalFrame(estadodetalleclientes,this.estadodetallecliente,detallemoviclienproveBeanSwingJInternalFrame,/*conInicializar,*/detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveSessionBean.getConGuardarRelaciones(),detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveSessionBean.getEsGuardarRelacionado());
					detallemoviclienproveBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detallemoviclienproveBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleMoviClienProve("no_relacionado");

						detallemoviclienproveBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleMoviClienProveConstantesFunciones.ITAMANIOFILATABLA + (DetalleMoviClienProveConstantesFunciones.ITAMANIOFILATABLA/2));

						detallemoviclienproveBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoDetalleCliente=(TitledBorder)this.jScrollPanelDatosEstadoDetalleCliente.getBorder();
						TitledBorder titledBorderDetalleMoviClienProve=(TitledBorder)detallemoviclienproveBeanSwingJInternalFrame.jScrollPanelDatosDetalleMoviClienProve.getBorder();

						titledBorderDetalleMoviClienProve.setTitle(titledBorderEstadoDetalleCliente.getTitle() + " -> Detalle Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detallemoviclienproveBeanSwingJInternalFrame);
						}

						detallemoviclienproveBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detallemoviclienproveBeanSwingJInternalFrame);

						detallemoviclienproveBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadodetalleclienteSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonDetalleClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoDetalleCliente estadodetallecliente) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoDetalleCliente==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetallecliente = (EstadoDetalleCliente)this.estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadodetallecliente = (EstadoDetalleCliente)this.estadodetalleclientes.toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadodetallecliente!=null) {
						this.estadodetallecliente = estadodetallecliente;
					} else {
						this.estadodetallecliente = new EstadoDetalleCliente();
					}
				}

				if(this.isTienePermisosDetalleCliente && this.permiteMantenimiento(this.estadodetallecliente)) {
					DetalleClienteBeanSwingJInternalFrame detalleclienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFramePopup=new DetalleClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFramePopup;
					} else {
						detalleclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame;
					}

					List<EstadoDetalleCliente> estadodetalleclientes=new ArrayList<EstadoDetalleCliente>();
					estadodetalleclientes.add(this.estadodetallecliente);
					if(!esRelacionado) {
						//detalleclienteBeanSwingJInternalFrame.detalleclienteSessionBean.setConGuardarRelaciones(false);
						//detalleclienteBeanSwingJInternalFrame.detalleclienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleclienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoDetalleCliente.cargarDetalleClienteBeanSwingJInternalFrame(estadodetalleclientes,this.estadodetallecliente,detalleclienteBeanSwingJInternalFrame,/*conInicializar,*/detalleclienteBeanSwingJInternalFrame.detalleclienteSessionBean.getConGuardarRelaciones(),detalleclienteBeanSwingJInternalFrame.detalleclienteSessionBean.getEsGuardarRelacionado());
					detalleclienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleclienteBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleCliente("no_relacionado");

						detalleclienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleClienteConstantesFunciones.ITAMANIOFILATABLA + (DetalleClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleclienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoDetalleCliente=(TitledBorder)this.jScrollPanelDatosEstadoDetalleCliente.getBorder();
						TitledBorder titledBorderDetalleCliente=(TitledBorder)detalleclienteBeanSwingJInternalFrame.jScrollPanelDatosDetalleCliente.getBorder();

						titledBorderDetalleCliente.setTitle(titledBorderEstadoDetalleCliente.getTitle() + " -> Detalle Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleclienteBeanSwingJInternalFrame);
						}

						detalleclienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleclienteBeanSwingJInternalFrame);

						detalleclienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadodetalleclienteSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoDetalleCliente(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleCliente && this.isPermisoNuevoEstadoDetalleCliente));			
			this.jButtonDuplicarEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaDuplicarEstadoDetalleCliente && this.isPermisoDuplicarEstadoDetalleCliente));			
			this.jButtonCopiarEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaCopiarEstadoDetalleCliente && this.isPermisoCopiarEstadoDetalleCliente));
			this.jButtonVerFormEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaVerFormEstadoDetalleCliente && this.isPermisoVerFormEstadoDetalleCliente));
			
			this.jButtonAbrirOrderByEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleCliente && this.isPermisoOrdenEstadoDetalleCliente));			
			
			this.jButtonNuevoRelacionesEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleCliente && this.isPermisoNuevoEstadoDetalleCliente));			
			this.jButtonNuevoGuardarCambiosEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleCliente && this.isPermisoNuevoEstadoDetalleCliente && this.isPermisoGuardarCambiosEstadoDetalleCliente));
			
			if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonModificarEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaModificarEstadoDetalleCliente && this.isPermisoActualizarEstadoDetalleCliente));	
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonActualizarEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaActualizarEstadoDetalleCliente && this.isPermisoActualizarEstadoDetalleCliente));	
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonEliminarEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaEliminarEstadoDetalleCliente && this.isPermisoEliminarEstadoDetalleCliente));
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonCancelarEstadoDetalleCliente.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleCliente);							
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonGuardarCambiosEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaGuardarEstadoDetalleCliente && this.isPermisoGuardarCambiosEstadoDetalleCliente));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoDetalleCliente && this.isPermisoGuardarCambiosEstadoDetalleCliente));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleCliente && this.isPermisoNuevoEstadoDetalleCliente));						
			this.jButtonDuplicarToolBarEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaDuplicarEstadoDetalleCliente && this.isPermisoDuplicarEstadoDetalleCliente));						
			this.jButtonCopiarToolBarEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaCopiarEstadoDetalleCliente && this.isPermisoCopiarEstadoDetalleCliente));			
			this.jButtonVerFormToolBarEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaVerFormEstadoDetalleCliente && this.isPermisoVerFormEstadoDetalleCliente));			
			this.jButtonAbrirOrderByToolBarEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleCliente && this.isPermisoOrdenEstadoDetalleCliente));
			this.jButtonNuevoRelacionesToolBarEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleCliente && this.isPermisoNuevoEstadoDetalleCliente));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleCliente && this.isPermisoNuevoEstadoDetalleCliente && this.isPermisoGuardarCambiosEstadoDetalleCliente));			
			
			if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonModificarToolBarEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaModificarEstadoDetalleCliente && this.isPermisoActualizarEstadoDetalleCliente));	
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonActualizarToolBarEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaActualizarEstadoDetalleCliente  && this.isPermisoActualizarEstadoDetalleCliente));	
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonEliminarToolBarEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaEliminarEstadoDetalleCliente && this.isPermisoEliminarEstadoDetalleCliente));
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonCancelarToolBarEstadoDetalleCliente.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleCliente);				
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonGuardarCambiosToolBarEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaGuardarEstadoDetalleCliente && this.isPermisoGuardarCambiosEstadoDetalleCliente));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoDetalleCliente && this.isPermisoGuardarCambiosEstadoDetalleCliente));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleCliente && this.isPermisoNuevoEstadoDetalleCliente));			
			this.jMenuItemDuplicarEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaDuplicarEstadoDetalleCliente && this.isPermisoDuplicarEstadoDetalleCliente));			
			this.jMenuItemCopiarEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaCopiarEstadoDetalleCliente && this.isPermisoCopiarEstadoDetalleCliente));			
			this.jMenuItemVerFormEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaVerFormEstadoDetalleCliente && this.isPermisoVerFormEstadoDetalleCliente));			
			this.jMenuItemAbrirOrderByEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleCliente && this.isPermisoOrdenEstadoDetalleCliente));			
			//this.jMenuItemMostrarOcultarEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleCliente && this.isPermisoOrdenEstadoDetalleCliente));
			this.jMenuItemDetalleAbrirOrderByEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleCliente && this.isPermisoOrdenEstadoDetalleCliente));			
			//this.jMenuItemDetalleMostrarOcultarEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleCliente && this.isPermisoOrdenEstadoDetalleCliente));			
			this.jMenuItemNuevoRelacionesEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleCliente && this.isPermisoNuevoEstadoDetalleCliente));			
			this.jMenuItemNuevoGuardarCambiosEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleCliente && this.isPermisoNuevoEstadoDetalleCliente && this.isPermisoGuardarCambiosEstadoDetalleCliente));									
			
			if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jMenuItemModificarEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaModificarEstadoDetalleCliente && this.isPermisoActualizarEstadoDetalleCliente));	
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jMenuItemActualizarEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaActualizarEstadoDetalleCliente && this.isPermisoActualizarEstadoDetalleCliente));	
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jMenuItemEliminarEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaEliminarEstadoDetalleCliente && this.isPermisoEliminarEstadoDetalleCliente));
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jMenuItemCancelarEstadoDetalleCliente.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleCliente);				
			}
			
			this.jMenuItemGuardarCambiosEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaGuardarEstadoDetalleCliente && this.isPermisoGuardarCambiosEstadoDetalleCliente));						
			this.jMenuItemGuardarCambiosTablaEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoDetalleCliente && this.isPermisoGuardarCambiosEstadoDetalleCliente));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoDetalleCliente=this.jButtonNuevoEstadoDetalleCliente.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoDetalleCliente=this.jButtonDuplicarEstadoDetalleCliente.isVisible();
			this.isVisibilidadCeldaCopiarEstadoDetalleCliente=this.jButtonCopiarEstadoDetalleCliente.isVisible();
			this.isVisibilidadCeldaVerFormEstadoDetalleCliente=this.jButtonVerFormEstadoDetalleCliente.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoDetalleCliente=this.jButtonAbrirOrderByEstadoDetalleCliente.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleCliente=this.jButtonNuevoRelacionesEstadoDetalleCliente.isVisible();
			this.isVisibilidadCeldaModificarEstadoDetalleCliente=this.jButtonModificarEstadoDetalleCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) {
			this.isVisibilidadCeldaActualizarEstadoDetalleCliente=this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonActualizarEstadoDetalleCliente.isVisible();
			this.isVisibilidadCeldaEliminarEstadoDetalleCliente=this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonEliminarEstadoDetalleCliente.isVisible();
			this.isVisibilidadCeldaCancelarEstadoDetalleCliente=this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonCancelarEstadoDetalleCliente.isVisible();
			this.isVisibilidadCeldaGuardarEstadoDetalleCliente=this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonGuardarCambiosEstadoDetalleCliente.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleCliente=this.jButtonGuardarCambiosTablaEstadoDetalleCliente.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoDetalleCliente=this.jButtonNuevoToolBarEstadoDetalleCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleCliente=this.jButtonNuevoRelacionesToolBarEstadoDetalleCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) {
			this.isVisibilidadCeldaModificarEstadoDetalleCliente=this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonModificarToolBarEstadoDetalleCliente.isVisible();
			this.isVisibilidadCeldaActualizarEstadoDetalleCliente=this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonActualizarToolBarEstadoDetalleCliente.isVisible();
			this.isVisibilidadCeldaEliminarEstadoDetalleCliente=this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonEliminarToolBarEstadoDetalleCliente.isVisible();
			this.isVisibilidadCeldaCancelarEstadoDetalleCliente=this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonCancelarToolBarEstadoDetalleCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoDetalleCliente=this.jButtonGuardarCambiosToolBarEstadoDetalleCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleCliente=this.jButtonGuardarCambiosTablaToolBarEstadoDetalleCliente.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoDetalleCliente=this.jMenuItemNuevoEstadoDetalleCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleCliente=this.jMenuItemNuevoRelacionesEstadoDetalleCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) {
			this.isVisibilidadCeldaModificarEstadoDetalleCliente=this.jInternalFrameDetalleFormEstadoDetalleCliente.jMenuItemModificarEstadoDetalleCliente.isVisible();
			this.isVisibilidadCeldaActualizarEstadoDetalleCliente=this.jInternalFrameDetalleFormEstadoDetalleCliente.jMenuItemActualizarEstadoDetalleCliente.isVisible();
			this.isVisibilidadCeldaEliminarEstadoDetalleCliente=this.jInternalFrameDetalleFormEstadoDetalleCliente.jMenuItemEliminarEstadoDetalleCliente.isVisible();
			this.isVisibilidadCeldaCancelarEstadoDetalleCliente=this.jInternalFrameDetalleFormEstadoDetalleCliente.jMenuItemCancelarEstadoDetalleCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoDetalleCliente=this.jMenuItemGuardarCambiosEstadoDetalleCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleCliente=this.jMenuItemGuardarCambiosTablaEstadoDetalleCliente.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoDetalleCliente(Boolean esInicializar) {
		if(EstadoDetalleClienteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadodetalleclienteSessionBean.getConGuardarRelaciones()) {
				//if(this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoDetalleCliente();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoDetalleCliente(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoDetalleCliente() {
		this.jButtonNuevoEstadoDetalleCliente.setVisible(this.isPermisoNuevoEstadoDetalleCliente);			
		this.jButtonDuplicarEstadoDetalleCliente.setVisible(this.isPermisoDuplicarEstadoDetalleCliente);			
		this.jButtonCopiarEstadoDetalleCliente.setVisible(this.isPermisoCopiarEstadoDetalleCliente);			
		this.jButtonVerFormEstadoDetalleCliente.setVisible(this.isPermisoVerFormEstadoDetalleCliente);			
		
		this.jButtonAbrirOrderByEstadoDetalleCliente.setVisible(this.isPermisoOrdenEstadoDetalleCliente);					
		
		this.jButtonNuevoRelacionesEstadoDetalleCliente.setVisible(this.isPermisoNuevoEstadoDetalleCliente);			
		
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonModificarEstadoDetalleCliente.setVisible(this.isPermisoActualizarEstadoDetalleCliente);	
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonActualizarEstadoDetalleCliente.setVisible(this.isPermisoActualizarEstadoDetalleCliente);	
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonEliminarEstadoDetalleCliente.setVisible(this.isPermisoEliminarEstadoDetalleCliente);
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonCancelarEstadoDetalleCliente.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleCliente);						
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonGuardarCambiosEstadoDetalleCliente.setVisible(this.isPermisoGuardarCambiosEstadoDetalleCliente);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoDetalleCliente.setVisible(this.isPermisoActualizarEstadoDetalleCliente);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoDetalleCliente() {
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonModificarEstadoDetalleCliente.setVisible(this.isPermisoActualizarEstadoDetalleCliente);	
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonActualizarEstadoDetalleCliente.setVisible(this.isPermisoActualizarEstadoDetalleCliente);	
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonEliminarEstadoDetalleCliente.setVisible(this.isPermisoEliminarEstadoDetalleCliente);
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonCancelarEstadoDetalleCliente.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleCliente);							
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonGuardarCambiosEstadoDetalleCliente.setVisible((this.isVisibilidadCeldaGuardarEstadoDetalleCliente && this.isPermisoGuardarCambiosEstadoDetalleCliente));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoDetalleCliente() {
		if(EstadoDetalleClienteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoDetalleCliente();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoDetalleCliente() {
	}
	
	public void jTableDatosEstadoDetalleClienteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoDetalleCliente(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoDetalleClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoDetalleCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoDetalleCliente(this.getestadodetallecliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleCliente(this.estadodetallecliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetallecliente =(EstadoDetalleCliente) this.estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadodetallecliente =(EstadoDetalleCliente) this.estadodetalleclientes.toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadodetallecliente==null) {
						this.estadodetallecliente = new EstadoDetalleCliente();
					}

					this.setVariablesFormularioToObjetoActualEstadoDetalleCliente(this.estadodetallecliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleCliente(this.estadodetallecliente);
				}

				if(this.estadodetallecliente.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadodetallecliente.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoDetalleCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoDetalleClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoDetalleCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoDetalleCliente(this.getestadodetallecliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleCliente(this.estadodetallecliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetallecliente =(EstadoDetalleCliente) this.estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadodetallecliente =(EstadoDetalleCliente) this.estadodetalleclientes.toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadodetallecliente==null) {
						this.estadodetallecliente = new EstadoDetalleCliente();
					}

					this.setVariablesFormularioToObjetoActualEstadoDetalleCliente(this.estadodetallecliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleCliente(this.estadodetallecliente);
				}

				if(this.estadodetallecliente.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadodetallecliente.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoDetalleCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoDetalleClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoDetalleCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoDetalleCliente(this.getestadodetallecliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleCliente(this.estadodetallecliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetallecliente =(EstadoDetalleCliente) this.estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadodetallecliente =(EstadoDetalleCliente) this.estadodetalleclientes.toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadodetallecliente==null) {
						this.estadodetallecliente = new EstadoDetalleCliente();
					}

					this.setVariablesFormularioToObjetoActualEstadoDetalleCliente(this.estadodetallecliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleCliente(this.estadodetallecliente);
				}

				if(this.estadodetallecliente.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadodetallecliente.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoDetalleCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoDetalleCliente() {
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoDetalleCliente.dispose();
			this.jInternalFrameDetalleFormEstadoDetalleCliente=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoDetalleCliente!=null) {
			this.jInternalFrameReporteDinamicoEstadoDetalleCliente.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoDetalleCliente.dispose();
			this.jInternalFrameReporteDinamicoEstadoDetalleCliente=null;
		}
		
		if(this.jInternalFrameImportacionEstadoDetalleCliente!=null) {
			this.jInternalFrameImportacionEstadoDetalleCliente.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoDetalleCliente.dispose();
			this.jInternalFrameImportacionEstadoDetalleCliente=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoDetalleCliente();
			
			EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoDetalleCliente")) {
				jButtonNuevoEstadoDetalleClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoDetalleCliente")) {
				jButtonDuplicarEstadoDetalleClienteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoDetalleCliente")) {
				jButtonCopiarEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoDetalleCliente")) {
				jButtonVerFormEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoDetalleCliente")) {
				jButtonNuevoEstadoDetalleClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoDetalleCliente")) {
				jButtonDuplicarEstadoDetalleClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoDetalleCliente")) {
				jButtonNuevoEstadoDetalleClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoDetalleCliente")) {
				jButtonDuplicarEstadoDetalleClienteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoDetalleCliente")) {
				jButtonNuevoEstadoDetalleClienteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoDetalleCliente")) {
				jButtonNuevoEstadoDetalleClienteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoDetalleCliente")) {
				jButtonNuevoEstadoDetalleClienteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoDetalleCliente")) {
				jButtonModificarEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoDetalleCliente")) {
				jButtonModificarEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoDetalleCliente")) {
				jButtonModificarEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoDetalleCliente")) {
				jButtonActualizarEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoDetalleCliente")) {
				jButtonActualizarEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoDetalleCliente")) {
				jButtonActualizarEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoDetalleCliente")) {
				jButtonEliminarEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoDetalleCliente")) {
				jButtonEliminarEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoDetalleCliente")) {
				jButtonEliminarEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoDetalleCliente")) {
				jButtonCancelarEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoDetalleCliente")) {
				jButtonCancelarEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoDetalleCliente")) {
				jButtonCancelarEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoDetalleCliente")) {
				jButtonCerrarEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoDetalleCliente")) {
				jButtonCerrarEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoDetalleCliente")) {
				jButtonCerrarEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoDetalleCliente")) {
				jButtonMostrarOcultarEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoDetalleCliente")) {
				jButtonCancelarEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoDetalleCliente")) {
				jButtonGuardarCambiosEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoDetalleCliente")) {
				jButtonGuardarCambiosEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoDetalleCliente")) {
				jButtonCopiarEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoDetalleCliente")) {
				jButtonVerFormEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoDetalleCliente")) {
				jButtonGuardarCambiosEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoDetalleCliente")) {
				jButtonCopiarEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoDetalleCliente")) {
				jButtonVerFormEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoDetalleCliente")) {
				jButtonGuardarCambiosEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoDetalleCliente")) {
				jButtonGuardarCambiosEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoDetalleCliente")) {
				jButtonGuardarCambiosEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoDetalleCliente")) {
				jButtonRecargarInformacionEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoDetalleCliente")) {
				jButtonRecargarInformacionEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoDetalleCliente")) {
				jButtonRecargarInformacionEstadoDetalleClienteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoDetalleCliente")) {
				jButtonAnterioresEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoDetalleCliente")) {
				jButtonAnterioresEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoDetalleCliente")) {
				jButtonAnterioresEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoDetalleCliente")) {
				jButtonSiguientesEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoDetalleCliente")) {
				jButtonSiguientesEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoDetalleCliente")) {
				jButtonSiguientesEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoDetalleCliente") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoDetalleCliente")) {
				jButtonAbrirOrderByEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoDetalleCliente") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoDetalleCliente")) {
				jButtonMostrarOcultarEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoDetalleCliente")) {
				jButtonNuevoGuardarCambiosEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoDetalleCliente")) {
				jButtonNuevoGuardarCambiosEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoDetalleCliente")) {
				jButtonNuevoGuardarCambiosEstadoDetalleClienteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoDetalleCliente")) {
				jButtonCerrarReporteDinamicoEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoDetalleCliente")) {
				jButtonGenerarReporteDinamicoEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoDetalleCliente")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoDetalleClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoDetalleCliente")) {
				jButtonCerrarImportacionEstadoDetalleClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoDetalleCliente")) {
				
				jButtonGenerarImportacionEstadoDetalleClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoDetalleCliente")) {
				
				jButtonAbrirImportacionEstadoDetalleClienteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoDetalleCliente")) {
				jComboBoxTiposAccionesEstadoDetalleClienteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoDetalleCliente")) {
				jComboBoxTiposRelacionesEstadoDetalleClienteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoDetalleCliente")) {
				jComboBoxTiposAccionesEstadoDetalleClienteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoDetalleCliente")) {
				
				jComboBoxTiposSeleccionarEstadoDetalleClienteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoDetalleCliente")) {
				jTextFieldValorCampoGeneralEstadoDetalleClienteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoDetalleCliente")) {
				jButtonAbrirOrderByEstadoDetalleClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoDetalleCliente")) {
				jButtonAbrirOrderByEstadoDetalleClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoDetalleCliente")) {
				jButtonCerrarOrderByEstadoDetalleClienteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoDetalleClienteBusqueda")) {
				this.jButtonidEstadoDetalleClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoDetalleClienteBusqueda")) {
				this.jButtoncodigoEstadoDetalleClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoDetalleClienteBusqueda")) {
				this.jButtonnombreEstadoDetalleClienteBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoDetalleCliente();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallecliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallecliente);
				
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
				
				


				
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoDetalleCliente estadodetalleclienteLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadodetalleclienteLocal=this.estadodetallecliente;
			} else {
				estadodetalleclienteLocal=this.estadodetalleclienteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallecliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallecliente);
				
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
							
				
				


				
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteAnterior =(EstadoDetalleCliente) this.estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleclienteAnterior =(EstadoDetalleCliente) this.estadodetalleclientes.toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
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
			
			EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
			
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
			
			


			
			EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallecliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallecliente);
				
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
								
						
				


				
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleCliente.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallecliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallecliente);
				
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
								
				
				


				
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteAnterior =(EstadoDetalleCliente) this.estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleclienteAnterior =(EstadoDetalleCliente) this.estadodetalleclientes.toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallecliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallecliente);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteAnterior =(EstadoDetalleCliente) this.estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleclienteAnterior =(EstadoDetalleCliente) this.estadodetalleclientes.toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallecliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetallecliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallecliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallecliente);
				
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
							
				
				


				
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleCliente.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoDetalleCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetalleclienteAnterior =(EstadoDetalleCliente) this.estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadodetalleclienteAnterior =(EstadoDetalleCliente) this.estadodetalleclientes.toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
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
			
			EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
			
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
			
			


			
			EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleClienteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallecliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetallecliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallecliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallecliente);
				
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
								
				
				


				
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteAnterior =(EstadoDetalleCliente) this.estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleclienteAnterior =(EstadoDetalleCliente) this.estadodetalleclientes.toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallecliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetallecliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallecliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallecliente);
				
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoDetalleCliente")) {
					jCheckBoxSeleccionarTodosEstadoDetalleClienteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoDetalleCliente")) {
					jCheckBoxSeleccionadosEstadoDetalleClienteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoDetalleCliente")) {
					
				}
				
				


				
				
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallecliente);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadodetallecliente);
				
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
												
				
				


				
				
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoDetalleCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetalleclienteAnterior =(EstadoDetalleCliente) this.estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadodetalleclienteAnterior =(EstadoDetalleCliente) this.estadodetalleclientes.toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleClienteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallecliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallecliente);
				
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
				
				
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
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
			
			EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
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
			
			


			
			EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallecliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallecliente);
				
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleCliente.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleCliente.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetallecliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetallecliente);
				
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
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
				
				


				
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleCliente.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleclienteAnterior =(EstadoDetalleCliente) this.estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleclienteAnterior =(EstadoDetalleCliente) this.estadodetalleclientes.toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoDetalleCliente")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoDetalleClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoDetalleCliente.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadodetallecliente =(EstadoDetalleCliente) this.estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadodetallecliente =(EstadoDetalleCliente) this.estadodetalleclientes.toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadodetallecliente);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoDetalleCliente")) {
				
				}
				
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoDetalleCliente")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoDetalleCliente.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoDetalleCliente")) {
			
			}
			
			EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoDetalleCliente();
			
			EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoDetalleCliente")) {
				jButtonNuevoEstadoDetalleClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoDetalleCliente")) {
				jButtonDuplicarEstadoDetalleClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoDetalleCliente")) {
				jButtonCopiarEstadoDetalleClienteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoDetalleCliente")) {
				jButtonVerFormEstadoDetalleClienteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoDetalleCliente")) {
				jButtonNuevoEstadoDetalleClienteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoDetalleCliente")) {
				jButtonModificarEstadoDetalleClienteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoDetalleCliente")) {
				jButtonActualizarEstadoDetalleClienteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoDetalleCliente")) {
				jButtonEliminarEstadoDetalleClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoDetalleCliente")) {
				jButtonGuardarCambiosEstadoDetalleClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoDetalleCliente")) {
				jButtonCancelarEstadoDetalleClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoDetalleCliente")) {
				jButtonCerrarEstadoDetalleClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoDetalleCliente")) {
				jButtonGuardarCambiosEstadoDetalleClienteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoDetalleCliente")) {
				jButtonNuevoGuardarCambiosEstadoDetalleClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoDetalleCliente")) {
				jButtonAbrirOrderByEstadoDetalleClienteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoDetalleCliente")) {
				jButtonRecargarInformacionEstadoDetalleClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoDetalleCliente")) {
				jButtonAnterioresEstadoDetalleClienteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoDetalleCliente")) {
				jButtonSiguientesEstadoDetalleClienteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoDetalleClienteBusqueda")) {
				this.jButtonidEstadoDetalleClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoDetalleClienteBusqueda")) {
				this.jButtoncodigoEstadoDetalleClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoDetalleClienteBusqueda")) {
				this.jButtonnombreEstadoDetalleClienteBusquedaActionPerformed(evt);
			}
			
			EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoDetalleCliente();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoDetalleCliente")) {
				closingInternalFrameEstadoDetalleCliente();
				
			} else if(sTipo.equals("jButtonCancelarEstadoDetalleCliente")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoDetalleCliente = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoDetalleClienteBeanSwingJInternalFrame jInternalFrameParent=(EstadoDetalleClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoDetalleCliente.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoDetalleClienteActionPerformed(null);
			}
			
			EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadodetallecliente,new Object(),this.estadodetalleclienteParameterGeneral,this.estadodetalleclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoDetalleCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoDetalleCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoDetalleCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadodetallecliente)) {
			if(!esControlTabla) {
				if(EstadoDetalleClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoDetalleCliente(this.estadodetallecliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleCliente(this.estadodetallecliente);			
				}
				
				if(this.estadodetalleclienteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoDetalleCliente(this.estadodetallecliente,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadodetalleclienteReturnGeneral=estadodetalleclienteLogic.procesarEventosEstadoDetalleClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetalleclienteLogic.getEstadoDetalleClientes(),this.estadodetallecliente,this.estadodetalleclienteParameterGeneral,this.isEsNuevoEstadoDetalleCliente,classes);//this.estadodetalleclienteLogic.getEstadoDetalleCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoDetalleCliente(this.estadodetalleclienteReturnGeneral,this.estadodetalleclienteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadodetalleclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoDetalleCliente(classes,this.estadodetalleclienteReturnGeneral,this.estadodetalleclienteBean,false);
					}
						
					if(this.estadodetalleclienteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleCliente(this.estadodetalleclienteReturnGeneral.getEstadoDetalleCliente());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoDetalleCliente(this.estadodetalleclienteReturnGeneral.getEstadoDetalleCliente());	
					}
						
					if(this.estadodetalleclienteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoDetalleCliente(this.estadodetalleclienteReturnGeneral.getEstadoDetalleCliente(),classes);//this.estadodetalleclienteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoDetalleCliente(this.estadodetallecliente,classes);//this.estadodetalleclienteBean);									
				}
			
				if(EstadoDetalleClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoDetalleCliente(this.estadodetallecliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleCliente(this.estadodetallecliente);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadodetalleclienteAnterior!=null) {
						this.estadodetallecliente=this.estadodetalleclienteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadodetalleclienteReturnGeneral=estadodetalleclienteLogic.procesarEventosEstadoDetalleClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetalleclienteLogic.getEstadoDetalleClientes(),this.estadodetallecliente,this.estadodetalleclienteParameterGeneral,this.isEsNuevoEstadoDetalleCliente,classes);//this.estadodetalleclienteLogic.getEstadoDetalleCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadodetalleclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadodetalleclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadodetalleclienteReturnGeneral.getEstadoDetalleCliente(),estadodetalleclienteLogic.getEstadoDetalleClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadodetalleclienteReturnGeneral.getEstadoDetalleCliente(),this.estadodetalleclientes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoDetalleCliente.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoDetalleCliente.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoDetalleCliente();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoDetalleCliente() throws Exception {
		
		EstadoDetalleClienteModel estadodetalleclienteModel=(EstadoDetalleClienteModel)this.jTableDatosEstadoDetalleCliente.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadodetalleclienteModel.estadodetalleclientes=this.estadodetalleclienteLogic.getEstadoDetalleClientes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadodetalleclienteModel.estadodetalleclientes=this.estadodetalleclientes;
		}
		
		
		((EstadoDetalleClienteModel) this.jTableDatosEstadoDetalleCliente.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoDetalleCliente() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadodetalleclienteAnterior(),this.estadodetalleclienteLogic.getEstadoDetalleClientes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadodetalleclienteAnterior(),this.estadodetalleclientes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoDetalleCliente();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoDetalleCliente(EstadoDetalleCliente estadodetallecliente,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleProve.class)) {
					this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleproveLogic.setDetalleProves(estadodetallecliente.getDetalleProves());
					this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleProve(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleMoviClienProve.class)) {
					this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveLogic.setDetalleMoviClienProves(estadodetallecliente.getDetalleMoviClienProves());
					this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleMoviClienProve(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleCliente.class)) {
					this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclienteLogic.setDetalleClientes(estadodetallecliente.getDetalleClientes());
					this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleCliente(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
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
										
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetallecliente,new Object(),generalEntityParameterGeneral,this.estadodetalleclienteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadodetalleclienteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoDetalleClienteConstantesFunciones.getClassesRelationshipsOfEstadoDetalleCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoDetalleClienteConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoDetalleCliente(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoDetalleCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoDetalleClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetallecliente,new Object(),generalEntityParameterGeneral,this.estadodetalleclienteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoDetalleCliente(EstadoDetalleClienteBean estadodetalleclienteBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleProve.class)) {
					this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleproveLogic.setDetalleProves(estadodetallecliente.getDetalleProves());
					this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleProve(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleMoviClienProve.class)) {
					this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveLogic.setDetalleMoviClienProves(estadodetallecliente.getDetalleMoviClienProves());
					this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleMoviClienProve(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleCliente.class)) {
					this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclienteLogic.setDetalleClientes(estadodetallecliente.getDetalleClientes());
					this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleCliente(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoDetalleCliente(ArrayList<Classe> classes,EstadoDetalleClienteReturnGeneral estadodetalleclienteReturnGeneral,EstadoDetalleClienteBean estadodetalleclienteBean,Boolean conDefault) throws Exception {
		
			this.estadodetalleclienteBean.setDetalleProves(estadodetalleclienteReturnGeneral.getEstadoDetalleCliente().getDetalleProves());
			this.estadodetalleclienteBean.setDetalleMoviClienProves(estadodetalleclienteReturnGeneral.getEstadoDetalleCliente().getDetalleMoviClienProves());
			this.estadodetalleclienteBean.setDetalleClientes(estadodetalleclienteReturnGeneral.getEstadoDetalleCliente().getDetalleClientes());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoDetalleCliente(EstadoDetalleCliente estadodetallecliente,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleProve.class)) {
					estadodetallecliente.setDetalleProves(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveBeanSwingJInternalFrame.detalleproveLogic.getDetalleProves());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleMoviClienProve.class)) {
					estadodetallecliente.setDetalleMoviClienProves(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveLogic.getDetalleMoviClienProves());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleCliente.class)) {
					estadodetallecliente.setDetalleClientes(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteBeanSwingJInternalFrame.detalleclienteLogic.getDetalleClientes());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadodetallecliente)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoDetalleCliente = new EstadoDetalleClienteDetalleFormJInternalFrame(jDesktopPane,this.estadodetalleclienteSessionBean.getConGuardarRelaciones(),this.estadodetalleclienteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoDetalleCliente);
		this.jInternalFrameDetalleFormEstadoDetalleCliente.setVisible(false);
		this.jInternalFrameDetalleFormEstadoDetalleCliente.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoDetalleCliente.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoDetalleCliente.estadodetalleclienteLogic=this.estadodetalleclienteLogic;
		
		this.cargarCombosFrameForeignKeyEstadoDetalleCliente("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoDetalleCliente();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoDetalleCliente();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoDetalleCliente("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoDetalleCliente();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoDetalleCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoDetalleCliente"));
		
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonModificarEstadoDetalleCliente.addActionListener(new ButtonActionListener(this,"ModificarEstadoDetalleCliente"));

		
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonModificarToolBarEstadoDetalleCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoDetalleCliente"));
					
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jMenuItemModificarEstadoDetalleCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoDetalleCliente"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonActualizarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"ActualizarEstadoDetalleCliente"));
		
		
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonActualizarToolBarEstadoDetalleCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoDetalleCliente"));
						
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jMenuItemActualizarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoDetalleCliente"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonEliminarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"EliminarEstadoDetalleCliente"));
		
		
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonEliminarToolBarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoDetalleCliente"));
								
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jMenuItemEliminarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoDetalleCliente"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonCancelarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"CancelarEstadoDetalleCliente"));
		
		
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonCancelarToolBarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoDetalleCliente"));
					
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jMenuItemCancelarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoDetalleCliente"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jMenuItemDetalleCerrarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoDetalleCliente"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonGuardarCambiosToolBarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoDetalleCliente"));
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonGuardarCambiosToolBarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoDetalleCliente"));
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jComboBoxTiposAccionesFormularioEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoDetalleCliente"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonidEstadoDetalleClienteBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoDetalleClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtoncodigoEstadoDetalleClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoDetalleClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonnombreEstadoDetalleClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoDetalleClienteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jTabbedPaneRelacionesEstadoDetalleCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoDetalleCliente"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoDetalleCliente"));
		
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoDetalleCliente"));
		}
		
		this.jTableDatosEstadoDetalleCliente.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoDetalleCliente"));
		
		this.jTableDatosEstadoDetalleCliente.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoDetalleCliente"));
		
		this.jButtonNuevoEstadoDetalleCliente.addActionListener(new ButtonActionListener(this,"NuevoEstadoDetalleCliente"));
		
		this.jButtonDuplicarEstadoDetalleCliente.addActionListener(new ButtonActionListener(this,"DuplicarEstadoDetalleCliente"));
		
		this.jButtonCopiarEstadoDetalleCliente.addActionListener(new ButtonActionListener(this,"CopiarEstadoDetalleCliente"));
		
		this.jButtonVerFormEstadoDetalleCliente.addActionListener(new ButtonActionListener(this,"VerFormEstadoDetalleCliente"));
		
		
		this.jButtonNuevoToolBarEstadoDetalleCliente.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoDetalleCliente"));
			
		this.jButtonDuplicarToolBarEstadoDetalleCliente.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoDetalleCliente"));
			
		this.jMenuItemNuevoEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoDetalleCliente"));
			
		this.jMenuItemDuplicarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoDetalleCliente"));		
		
		
		this.jButtonNuevoRelacionesEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoDetalleCliente"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoDetalleCliente.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoDetalleCliente"));
			
		this.jMenuItemNuevoRelacionesEstadoDetalleCliente.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoDetalleCliente"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonModificarEstadoDetalleCliente.addActionListener(new ButtonActionListener(this,"ModificarEstadoDetalleCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonModificarToolBarEstadoDetalleCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoDetalleCliente"));
			
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jMenuItemModificarEstadoDetalleCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoDetalleCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonActualizarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"ActualizarEstadoDetalleCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonActualizarToolBarEstadoDetalleCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoDetalleCliente"));
				
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jMenuItemActualizarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoDetalleCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonEliminarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"EliminarEstadoDetalleCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonEliminarToolBarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoDetalleCliente"));
						
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jMenuItemEliminarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoDetalleCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonCancelarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"CancelarEstadoDetalleCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonCancelarToolBarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoDetalleCliente"));
			
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jMenuItemCancelarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoDetalleCliente"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoDetalleCliente"));		
		
		
		this.jButtonCerrarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"CerrarEstadoDetalleCliente"));
		
		
		this.jButtonCerrarToolBarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoDetalleCliente"));
			
		this.jMenuItemCerrarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoDetalleCliente"));
			
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jMenuItemDetalleCerrarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoDetalleCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonGuardarCambiosEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoDetalleCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonGuardarCambiosToolBarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoDetalleCliente"));
		}
		
		this.jButtonCopiarToolBarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoDetalleCliente"));
			
		this.jButtonVerFormToolBarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoDetalleCliente"));
		
		this.jMenuItemGuardarCambiosEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoDetalleCliente"));
			
		this.jMenuItemCopiarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoDetalleCliente"));		
		
		this.jMenuItemVerFormEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoDetalleCliente"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoDetalleCliente"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoDetalleCliente"));
			
		this.jMenuItemGuardarCambiosTablaEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoDetalleCliente"));		
		
		
		
		this.jButtonRecargarInformacionEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoDetalleCliente"));
					
		this.jButtonRecargarInformacionToolBarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoDetalleCliente"));
		
		this.jMenuItemRecargarInformacionEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoDetalleCliente"));		
		
		
		
		this.jButtonAnterioresEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"AnterioresEstadoDetalleCliente"));
		
		
		this.jButtonAnterioresToolBarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoDetalleCliente"));
		
		this.jMenuItemAnterioresEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoDetalleCliente"));		
		
		
		this.jButtonSiguientesEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"SiguientesEstadoDetalleCliente"));
		
		
		this.jButtonSiguientesToolBarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoDetalleCliente"));
			
		this.jMenuItemSiguientesEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoDetalleCliente"));
			
		this.jMenuItemAbrirOrderByEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoDetalleCliente"));
			
		this.jMenuItemMostrarOcultarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoDetalleCliente"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoDetalleCliente"));
			
		this.jMenuItemDetalleMostarOcultarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoDetalleCliente"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoDetalleCliente"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoDetalleCliente"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoDetalleCliente"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoDetalleCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoDetalleCliente"));

		this.jCheckBoxSeleccionadosEstadoDetalleCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoDetalleCliente"));
		
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jComboBoxTiposAccionesFormularioEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoDetalleCliente"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoDetalleCliente"));
			
		this.jComboBoxTiposAccionesEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoDetalleCliente"));
					
		this.jComboBoxTiposSeleccionarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoDetalleCliente"));
			
		this.jTextFieldValorCampoGeneralEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoDetalleCliente"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonidEstadoDetalleClienteBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoDetalleClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtoncodigoEstadoDetalleClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoDetalleClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonnombreEstadoDetalleClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoDetalleClienteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoDetalleCliente!=null) {
				this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoDetalleCliente"));
				this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoDetalleCliente"));
				this.jInternalFrameReporteDinamicoEstadoDetalleCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoDetalleCliente"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoDetalleCliente"));				
			//this.jButtonGenerarReporteDinamicoEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoDetalleCliente"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoDetalleCliente"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoDetalleCliente!=null) {
				this.jInternalFrameImportacionEstadoDetalleCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoDetalleCliente"));
				this.jInternalFrameImportacionEstadoDetalleCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoDetalleCliente"));
				this.jInternalFrameImportacionEstadoDetalleCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoDetalleCliente"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoDetalleCliente"));
			
			this.jButtonAbrirOrderByToolBarEstadoDetalleCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoDetalleCliente"));			
			
			if(this.jInternalFrameOrderByEstadoDetalleCliente!=null) {
				this.jInternalFrameOrderByEstadoDetalleCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoDetalleCliente"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleCliente.jTabbedPaneRelacionesEstadoDetalleCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoDetalleCliente"));
		
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
            		closingInternalFrameEstadoDetalleCliente();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoDetalleCliente.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoDetalleCliente = (JInternalFrameBase)event.getSource();
	            	
	            EstadoDetalleClienteBeanSwingJInternalFrame jInternalFrameParent=(EstadoDetalleClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoDetalleCliente.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoDetalleClienteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoDetalleCliente.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoDetalleClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoDetalleCliente.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoDetalleCliente.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoDetalleCliente";
		inputMap = this.jButtonNuevoEstadoDetalleCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoDetalleCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoDetalleClienteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoDetalleCliente";
		inputMap = this.jButtonNuevoRelacionesEstadoDetalleCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoDetalleCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoDetalleClienteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoDetalleCliente";
		inputMap = this.jButtonModificarEstadoDetalleCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoDetalleCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoDetalleClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoDetalleCliente";
		inputMap = this.jButtonActualizarEstadoDetalleCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoDetalleCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoDetalleClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoDetalleCliente";
		inputMap = this.jButtonEliminarEstadoDetalleCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoDetalleCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoDetalleClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoDetalleCliente";
		inputMap = this.jButtonCancelarEstadoDetalleCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoDetalleCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoDetalleClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoDetalleCliente";
		inputMap = this.jButtonCerrarEstadoDetalleCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoDetalleCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoDetalleClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonGuardarCambiosEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoDetalleCliente";
		inputMap = this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonGuardarCambiosEstadoDetalleCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonGuardarCambiosEstadoDetalleCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoDetalleClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoDetalleCliente.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoDetalleClienteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoDetalleCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoDetalleClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoDetalleCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoDetalleClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoDetalleCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoDetalleClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonidEstadoDetalleClienteBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoDetalleClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtoncodigoEstadoDetalleClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoDetalleClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jButtonnombreEstadoDetalleClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoDetalleClienteBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoDetalleCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoDetalleClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoDetalleClienteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoDetalleCliente.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoDetalleCliente(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoDetalleCliente estadodetalleclienteAux:this.estadodetalleclienteLogic.getEstadoDetalleClientes()) {
					estadodetalleclienteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetalleCliente estadodetalleclienteAux:estadodetalleclientes) {
					estadodetalleclienteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoDetalleClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoDetalleCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoDetalleCliente estadodetalleclienteAux:this.estadodetalleclienteLogic.getEstadoDetalleClientes()) {
						estadodetalleclienteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoDetalleCliente estadodetalleclienteAux:estadodetalleclientes) {
						estadodetalleclienteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoDetalleCliente estadodetalleclienteAux:this.estadodetalleclienteLogic.getEstadoDetalleClientes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoDetalleCliente estadodetalleclienteAux:estadodetalleclientes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoDetalleCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoDetalleCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoDetalleCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoDetalleClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoDetalleCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoDetalleCliente.getSelectedRows();
			
			EstadoDetalleCliente estadodetalleclienteLocal=new EstadoDetalleCliente();
			
			//this.seleccionarTodosEstadoDetalleCliente(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadodetalleclienteLocal =(EstadoDetalleCliente) this.estadodetalleclienteLogic.getEstadoDetalleClientes().toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadodetalleclienteLocal =(EstadoDetalleCliente) this.estadodetalleclientes.toArray()[this.jTableDatosEstadoDetalleCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadodetalleclienteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoDetalleCliente estadodetalleclienteAux:this.estadodetalleclienteLogic.getEstadoDetalleClientes()) {
						estadodetalleclienteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoDetalleCliente estadodetalleclienteAux:estadodetalleclientes) {
						estadodetalleclienteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoDetalleCliente(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoDetalleCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoDetalleCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoDetalleClienteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoDetalleClienteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoDetalleClienteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoDetalleCliente(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoDetalleCliente.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoDetalleCliente estadodetalleclienteAux:this.estadodetalleclienteLogic.getEstadoDetalleClientes()) {
				
						if(sTipoSeleccionar.equals(EstadoDetalleClienteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadodetalleclienteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoDetalleClienteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadodetalleclienteAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetalleCliente estadodetalleclienteAux:estadodetalleclientes) {
					
						if(sTipoSeleccionar.equals(EstadoDetalleClienteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadodetalleclienteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoDetalleClienteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadodetalleclienteAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoDetalleCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoDetalleClienteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoDetalleCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoDetalleCliente=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoDetalleCliente.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoDetalleCliente.jComboBoxTiposAccionesFormularioEstadoDetalleCliente.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoDetalleCliente) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoDetalleCliente(conSplash);
				
					this.generarReporteEstadoDetalleClientesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetalleCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetalleCliente.jComboBoxTiposAccionesFormularioEstadoDetalleCliente.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoDetalleClientesSeleccionados();
				//this.jComboBoxTiposAccionesEstadoDetalleCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoDetalleClientesSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoDetalleCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoDetalleClientesSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoDetalleCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoDetalleCliente();
				
				this.exportarEstadoDetalleClientesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetalleCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetalleCliente.jComboBoxTiposAccionesFormularioEstadoDetalleCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoDetalleClientes();
				//this.importarEstadoDetalleClientes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetalleCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetalleCliente.jComboBoxTiposAccionesFormularioEstadoDetalleCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoDetalleCliente();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoDetalleClientesSeleccionados();
				//this.jComboBoxTiposAccionesEstadoDetalleCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Detalle Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoDetalleCliente();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoDetalleCliente)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoDetalleCliente(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Detalle Cliente",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetalleCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetalleCliente.jComboBoxTiposAccionesFormularioEstadoDetalleCliente.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadoDetalleClienteBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadoDetalleCliente) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadoDetalleCliente(conSplash);
					
						//this.actualizarParametrosGeneralEstadoDetalleCliente();
						
						this.generarReporteProcesoAccionEstadoDetalleClientesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadoDetalleCliente.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadoDetalleCliente.jComboBoxTiposAccionesFormularioEstadoDetalleCliente.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadoDetalleClienteBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estado Detalle ClienteS SELECCIONADOS?", "MANTENIMIENTO DE Estado Detalle Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadoDetalleCliente();
				
						this.actualizarParametrosGeneralEstadoDetalleCliente();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadodetalleclienteReturnGeneral=estadodetalleclienteLogic.procesarAccionEstadoDetalleClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadodetalleclienteLogic.getEstadoDetalleClientes(),this.estadodetalleclienteParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadoDetalleClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoDetalleCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoDetalleCliente.jComboBoxTiposAccionesFormularioEstadoDetalleCliente.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoDetalleCliente();
					
					EstadoDetalleClienteBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadoDetalleClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoDetalleCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoDetalleCliente.jComboBoxTiposAccionesFormularioEstadoDetalleCliente.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoDetalleCliente(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoDetalleClienteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoDetalleCliente();
			
			if(this.jInternalFrameDetalleFormEstadoDetalleCliente==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoDetalleCliente> estadodetalleclientesSeleccionados=new ArrayList<EstadoDetalleCliente>();		
			EstadoDetalleCliente estadodetallecliente=new EstadoDetalleCliente();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoDetalleCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoDetalleCliente.getSelectedItem();
			
			
			
			
			estadodetalleclientesSeleccionados=this.getEstadoDetalleClientesSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadodetalleclientesSeleccionados.size()==1) {
				for(EstadoDetalleCliente estadodetalleclienteAux:estadodetalleclientesSeleccionados) {
					estadodetallecliente=estadodetalleclienteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Prove")) {
					jButtonDetalleProveActionPerformed(null,rowIndex,true,false,estadodetallecliente);
				}
				else if(this.sTipoRelacion.equals("Detalle Cliente")) {
					jButtonDetalleMoviClienProveActionPerformed(null,rowIndex,true,false,estadodetallecliente);
				}
				else if(this.sTipoRelacion.equals("Detalle Cliente")) {
					jButtonDetalleClienteActionPerformed(null,rowIndex,true,false,estadodetallecliente);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoDetalleCliente();
			
      		//this.finishProcessEstadoDetalleCliente(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoDetalleClienteReturnGeneral() throws Exception {
		if(this.estadodetalleclienteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadodetalleclienteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadodetalleclienteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadodetalleclienteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadodetalleclienteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadodetalleclienteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoDetalleCliente(false);
		}
		
		if(this.estadodetalleclienteReturnGeneral.getConRetornoLista() || this.estadodetalleclienteReturnGeneral.getConRetornoObjeto()) {
			if(this.estadodetalleclienteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadodetalleclienteLogic.setEstadoDetalleClientes(this.estadodetalleclienteReturnGeneral.getEstadoDetalleClientes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadodetalleclienteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadodetalleclienteLogic.setEstadoDetalleCliente(this.estadodetalleclienteReturnGeneral.getEstadoDetalleCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoDetalleCliente(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoDetalleCliente() throws Exception {
		
		
	}
	
	public ArrayList<EstadoDetalleCliente> getEstadoDetalleClientesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoDetalleCliente> estadodetalleclientesSeleccionados=new ArrayList<EstadoDetalleCliente>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoDetalleCliente) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoDetalleCliente estadodetalleclienteAux:estadodetalleclienteLogic.getEstadoDetalleClientes()) {
					if(estadodetalleclienteAux.getIsSelected()) {
						estadodetalleclientesSeleccionados.add(estadodetalleclienteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetalleCliente estadodetalleclienteAux:this.estadodetalleclientes) {
					if(estadodetalleclienteAux.getIsSelected()) {
						estadodetalleclientesSeleccionados.add(estadodetalleclienteAux);				
					}
				}
			}
			
			if(estadodetalleclientesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadodetalleclientesSeleccionados.addAll(this.estadodetalleclienteLogic.getEstadoDetalleClientes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadodetalleclientesSeleccionados.addAll(this.estadodetalleclientes);				
					}
				}
			}
		} else {
			estadodetalleclientesSeleccionados.add(this.estadodetallecliente);
		}
		
		return estadodetalleclientesSeleccionados;
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
	
	public void generarReporteEstadoDetalleClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoDetalleClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoDetalleClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoDetalleClientesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoDetalleClientesSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoDetalleClientesSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Detalle Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoDetalleClientesSeleccionados() throws Exception {
		ArrayList<EstadoDetalleCliente> estadodetalleclientesSeleccionados=new ArrayList<EstadoDetalleCliente>();		
		
		estadodetalleclientesSeleccionados=this.getEstadoDetalleClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoDetalleClientes("Todos",estadodetalleclientesSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoDetalleClientesSeleccionados() throws Exception {
		ArrayList<EstadoDetalleCliente> estadodetalleclientesSeleccionados=new ArrayList<EstadoDetalleCliente>();		
		
		estadodetalleclientesSeleccionados=this.getEstadoDetalleClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoDetalleClientes("Todos",estadodetalleclientesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoDetalleClientesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoDetalleCliente> estadodetalleclientesSeleccionados=new ArrayList<EstadoDetalleCliente>();
		
		estadodetalleclientesSeleccionados=this.getEstadoDetalleClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoDetalleClientes("Todos",estadodetalleclientesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoDetalleClientesSeleccionados() throws Exception {
		ArrayList<EstadoDetalleCliente> estadodetalleclientesSeleccionados=new ArrayList<EstadoDetalleCliente>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoDetalleCliente();
		
		
		estadodetalleclientesSeleccionados=this.getEstadoDetalleClientesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoDetalleCliente();
		
		
		//this.generarReporteEstadoDetalleClientes("Todos",estadodetalleclientesSeleccionados ,estadodetalleclienteImplementable,estadodetalleclienteImplementableHome);
	}
	
	public void mostrarImportacionEstadoDetalleClientes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoDetalleCliente();
		
		this.abrirFrameImportacionEstadoDetalleCliente();		
		
			
		//this.generarReporteEstadoDetalleClientes("Todos",estadodetalleclientesSeleccionados ,estadodetalleclienteImplementable,estadodetalleclienteImplementableHome);
	}
	
	public void importarEstadoDetalleClientes() throws Exception {		
	
	}
	
	public void exportarEstadoDetalleClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoDetalleClientesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoDetalleClientesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoDetalleClientesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Detalle Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoDetalleClientesSeleccionados() throws Exception {
		ArrayList<EstadoDetalleCliente> estadodetalleclientesSeleccionados=new ArrayList<EstadoDetalleCliente>();		
		
		estadodetalleclientesSeleccionados=this.getEstadoDetalleClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetallecliente."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoDetalleCliente(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoDetalleCliente estadodetalleclienteAux:estadodetalleclientesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoDetalleCliente(estadodetalleclienteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadodetalleclienteAux.setsDetalleGeneralEntityReporte(estadodetalleclienteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoDetalleCliente(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoDetalleClienteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoDetalleClienteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoDetalleClienteConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoDetalleClienteConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoDetalleCliente(EstadoDetalleCliente estadodetallecliente,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadodetallecliente.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadodetallecliente.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadodetallecliente.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadodetallecliente.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoDetalleClientesSeleccionados() throws Exception {
		ArrayList<EstadoDetalleCliente> estadodetalleclientesSeleccionados=new ArrayList<EstadoDetalleCliente>();		
		
		estadodetalleclientesSeleccionados=this.getEstadoDetalleClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetallecliente.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoDetalleClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoDetalleCliente(row);				
				iRow++;
			}				
			
			for(EstadoDetalleCliente estadodetalleclienteAux:estadodetalleclientesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoDetalleCliente(estadodetalleclienteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoDetalleClientesSeleccionados() throws Exception {
		ArrayList<EstadoDetalleCliente> estadodetalleclientesSeleccionados=new ArrayList<EstadoDetalleCliente>();		
		
		estadodetalleclientesSeleccionados=this.getEstadoDetalleClientesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetallecliente.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadodetalleclientes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadodetallecliente");
			//elementRoot.appendChild(element);
		
			for(EstadoDetalleCliente estadodetalleclienteAux:estadodetalleclientesSeleccionados) {
				element = document.createElement("estadodetallecliente");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoDetalleCliente(estadodetalleclienteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoDetalleCliente(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetalleClienteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetalleClienteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetalleClienteConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetalleClienteConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoDetalleCliente(EstadoDetalleCliente estadodetallecliente,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadodetallecliente.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadodetallecliente.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadodetallecliente.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoDetalleCliente(EstadoDetalleCliente estadodetallecliente,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoDetalleClienteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadodetallecliente.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoDetalleClienteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadodetallecliente.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoDetalleClienteConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadodetallecliente.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoDetalleClienteConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadodetallecliente.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoDetalleClientesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoDetalleCliente> estadodetalleclientesSeleccionados=new ArrayList<EstadoDetalleCliente>();
		
		estadodetalleclientesSeleccionados=this.getEstadoDetalleClientesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoDetalleCliente(estadodetalleclientesSeleccionados);
		
		this.generarReporteEstadoDetalleClientes("Todos",estadodetalleclientesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoDetalleCliente(ArrayList<EstadoDetalleCliente> estadodetalleclientesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoDetalleCliente estadodetalleclienteAux:estadodetalleclientesSeleccionados) {
				estadodetalleclienteAux.setsDetalleGeneralEntityReporte(estadodetalleclienteAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoDetalleClienteConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadodetalleclienteAux.setsDescripcionGeneralEntityReporte1(estadodetalleclienteAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoDetalleClienteConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadodetalleclienteAux.setsDescripcionGeneralEntityReporte1(estadodetalleclienteAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoDetalleCliente(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoDetalleCliente=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleCliente=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoDetalleCliente=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoDetalleCliente=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleCliente=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleCliente=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleCliente=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoDetalleCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleCliente=false;
			this.isVisibilidadCeldaModificarEstadoDetalleCliente=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleCliente=true;
			this.isVisibilidadCeldaEliminarEstadoDetalleCliente=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleCliente=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoDetalleCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleCliente=false;
			this.isVisibilidadCeldaModificarEstadoDetalleCliente=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleCliente=true;
			this.isVisibilidadCeldaEliminarEstadoDetalleCliente=true;
			this.isVisibilidadCeldaCancelarEstadoDetalleCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleCliente=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoDetalleCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleCliente=false;
			this.isVisibilidadCeldaModificarEstadoDetalleCliente=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleCliente=true;
			this.isVisibilidadCeldaEliminarEstadoDetalleCliente=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleCliente=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoDetalleCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleCliente=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleCliente=true;
			this.isVisibilidadCeldaModificarEstadoDetalleCliente=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleCliente=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleCliente=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleCliente=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoDetalleCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleCliente=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleCliente=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleCliente=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleCliente=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoDetalleCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleCliente=false;
			this.isVisibilidadCeldaModificarEstadoDetalleCliente=true;
			this.isVisibilidadCeldaActualizarEstadoDetalleCliente=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleCliente=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleCliente=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoDetalleClienteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoDetalleCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleCliente=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleCliente=true;
		} else {
			this.actualizarEstadoPanelsEstadoDetalleCliente(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoDetalleCliente=false;
			//this.isVisibilidadCeldaVerFormEstadoDetalleCliente=false;
			this.isVisibilidadCeldaDuplicarEstadoDetalleCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadodetalleclienteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleCliente=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoDetalleCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
			if(!estadodetalleclienteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleCliente=false;												
			}
			
			this.jButtonCerrarEstadoDetalleCliente.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleCliente=false;
		}
		
		if(!this.permiteMantenimiento(this.estadodetallecliente)) {
			this.isVisibilidadCeldaActualizarEstadoDetalleCliente=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleCliente=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoDetalleCliente() {
		this.isVisibilidadCeldaNuevoEstadoDetalleCliente=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoDetalleCliente=false;
	}
	
	public void actualizarEstadoPanelsEstadoDetalleCliente(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoDetalleCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleCliente!=null) {
				this.jScrollPanelDatosEstadoDetalleCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetalleCliente!=null) {
				this.jPanelPaginacionEstadoDetalleCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleCliente!=null) {
				this.jPanelParametrosReportesEstadoDetalleCliente.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoDetalleCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleCliente.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoDetalleCliente!=null) {
				this.jScrollPanelDatosEstadoDetalleCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoDetalleCliente!=null) {
				this.jPanelPaginacionEstadoDetalleCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleCliente!=null) {
				this.jPanelParametrosReportesEstadoDetalleCliente.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoDetalleCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleCliente.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleCliente!=null) {
				this.jScrollPanelDatosEstadoDetalleCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoDetalleCliente!=null) {
				this.jPanelPaginacionEstadoDetalleCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleCliente!=null) {
				this.jPanelParametrosReportesEstadoDetalleCliente.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoDetalleCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleCliente!=null) {
				this.jScrollPanelDatosEstadoDetalleCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoDetalleCliente!=null) {
				this.jPanelPaginacionEstadoDetalleCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleCliente!=null) {
				this.jPanelParametrosReportesEstadoDetalleCliente.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoDetalleCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleCliente!=null) {
				this.jScrollPanelDatosEstadoDetalleCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetalleCliente!=null) {
				this.jPanelPaginacionEstadoDetalleCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleCliente!=null) {
				this.jPanelParametrosReportesEstadoDetalleCliente.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoDetalleCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleCliente.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleCliente!=null) {
				this.jScrollPanelDatosEstadoDetalleCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetalleCliente!=null) {
				this.jPanelPaginacionEstadoDetalleCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleCliente!=null) {
				this.jPanelParametrosReportesEstadoDetalleCliente.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoDetalleCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleCliente.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleCliente!=null) {
				this.jScrollPanelDatosEstadoDetalleCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetalleCliente!=null) {
				this.jPanelPaginacionEstadoDetalleCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleCliente!=null) {
				this.jPanelParametrosReportesEstadoDetalleCliente.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadodetalleclienteSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoDetalleClienteParaDetalleProves() throws Exception {
		Boolean isPaginaPopupDetalleProve=false;

		try {

			if(this.estadodetalleclienteSessionBean==null) {
				this.estadodetalleclienteSessionBean=new EstadoDetalleClienteSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveSessionBean=new DetalleProveSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveSessionBean.setsPathNavegacionActual(estadodetalleclienteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleProveConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleProve=this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleProve(true);
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleProve(EstadoDetalleClienteConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveSessionBean.setisBusquedaDesdeForeignKeySesionEstadoDetalleCliente(true);
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleproveSessionBean.setlidEstadoDetalleClienteActual(this.idEstadoDetalleClienteActual);

			estadodetalleclienteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoDetalleCliente(true);
			estadodetalleclienteSessionBean.setlIdEstadoDetalleClienteActualForeignKey(this.idEstadoDetalleClienteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionEstadoDetalleClienteParaDetalleMoviClienProves() throws Exception {
		Boolean isPaginaPopupDetalleMoviClienProve=false;

		try {

			if(this.estadodetalleclienteSessionBean==null) {
				this.estadodetalleclienteSessionBean=new EstadoDetalleClienteSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveSessionBean=new DetalleMoviClienProveSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveSessionBean.setsPathNavegacionActual(estadodetalleclienteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleMoviClienProve=this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleMoviClienProve(true);
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleMoviClienProve(EstadoDetalleClienteConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveSessionBean.setisBusquedaDesdeForeignKeySesionEstadoDetalleCliente(true);
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detallemoviclienproveSessionBean.setlidEstadoDetalleClienteActual(this.idEstadoDetalleClienteActual);

			estadodetalleclienteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoDetalleCliente(true);
			estadodetalleclienteSessionBean.setlIdEstadoDetalleClienteActualForeignKey(this.idEstadoDetalleClienteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionEstadoDetalleClienteParaDetalleClientes() throws Exception {
		Boolean isPaginaPopupDetalleCliente=false;

		try {

			if(this.estadodetalleclienteSessionBean==null) {
				this.estadodetalleclienteSessionBean=new EstadoDetalleClienteSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteSessionBean=new DetalleClienteSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteSessionBean.setsPathNavegacionActual(estadodetalleclienteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleCliente=this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleCliente(true);
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleCliente(EstadoDetalleClienteConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteSessionBean.setisBusquedaDesdeForeignKeySesionEstadoDetalleCliente(true);
			this.jInternalFrameDetalleFormEstadoDetalleCliente.detalleclienteSessionBean.setlidEstadoDetalleClienteActual(this.idEstadoDetalleClienteActual);

			estadodetalleclienteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoDetalleCliente(true);
			estadodetalleclienteSessionBean.setlIdEstadoDetalleClienteActualForeignKey(this.idEstadoDetalleClienteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoDetalleClienteSessionBean estadodetalleclienteSessionBean=new EstadoDetalleClienteSessionBean();
		
		if(this.estadodetalleclienteSessionBean==null) {
			this.estadodetalleclienteSessionBean=new EstadoDetalleClienteSessionBean();
		}
		
		this.estadodetalleclienteSessionBean.setsUltimaBusquedaEstadoDetalleCliente(this.getsAccionBusqueda());
		this.estadodetalleclienteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadodetalleclienteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoDetalleClienteSessionBean estadodetalleclienteSessionBean=new EstadoDetalleClienteSessionBean();
		
		if(this.estadodetalleclienteSessionBean==null) {
			this.estadodetalleclienteSessionBean=new EstadoDetalleClienteSessionBean();
		}
		
		if(this.estadodetalleclienteSessionBean.getsUltimaBusquedaEstadoDetalleCliente()!=null&&!this.estadodetalleclienteSessionBean.getsUltimaBusquedaEstadoDetalleCliente().equals("")) {
			this.setsAccionBusqueda(estadodetalleclienteSessionBean.getsUltimaBusquedaEstadoDetalleCliente());
			this.setiNumeroPaginacion(estadodetalleclienteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadodetalleclienteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadodetalleclienteSessionBean.setsUltimaBusquedaEstadoDetalleCliente("");
		this.estadodetalleclienteSessionBean.setiNumeroPaginacion(EstadoDetalleClienteConstantesFunciones.INUMEROPAGINACION);
		this.estadodetalleclienteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoDetalleCliente(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoDetalleCliente() {
		this.updateBorderResaltarBusquedasFormularioEstadoDetalleCliente();
		this.updateVisibilidadBusquedasFormularioEstadoDetalleCliente();
		this.updateHabilitarBusquedasFormularioEstadoDetalleCliente();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoDetalleCliente() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoDetalleCliente() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoDetalleCliente() {
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
	
	public void updateControlesFormularioEstadoDetalleCliente() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoDetalleCliente==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoDetalleCliente();
		this.updateVisibilidadResaltarControlesFormularioEstadoDetalleCliente();
		this.updateHabilitarResaltarControlesFormularioEstadoDetalleCliente();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoDetalleCliente() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadodetalleclienteConstantesFunciones.resaltaridEstadoDetalleCliente!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) {this.jInternalFrameDetalleFormEstadoDetalleCliente.jLabelidEstadoDetalleCliente.setBorder(this.estadodetalleclienteConstantesFunciones.resaltaridEstadoDetalleCliente);}
		if(this.estadodetalleclienteConstantesFunciones.resaltarcodigoEstadoDetalleCliente!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) {this.jInternalFrameDetalleFormEstadoDetalleCliente.jTextFieldcodigoEstadoDetalleCliente.setBorder(this.estadodetalleclienteConstantesFunciones.resaltarcodigoEstadoDetalleCliente);}
		if(this.estadodetalleclienteConstantesFunciones.resaltarnombreEstadoDetalleCliente!=null && this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) {this.jInternalFrameDetalleFormEstadoDetalleCliente.jTextAreanombreEstadoDetalleCliente.setBorder(this.estadodetalleclienteConstantesFunciones.resaltarnombreEstadoDetalleCliente);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoDetalleCliente() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) {
	
		//this.jInternalFrameDetalleFormEstadoDetalleCliente.jLabelidEstadoDetalleCliente.setVisible(this.estadodetalleclienteConstantesFunciones.mostraridEstadoDetalleCliente);
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jPanelidEstadoDetalleCliente.setVisible(this.estadodetalleclienteConstantesFunciones.mostraridEstadoDetalleCliente);
		//this.jInternalFrameDetalleFormEstadoDetalleCliente.jTextFieldcodigoEstadoDetalleCliente.setVisible(this.estadodetalleclienteConstantesFunciones.mostrarcodigoEstadoDetalleCliente);
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jPanelcodigoEstadoDetalleCliente.setVisible(this.estadodetalleclienteConstantesFunciones.mostrarcodigoEstadoDetalleCliente);
		//this.jInternalFrameDetalleFormEstadoDetalleCliente.jTextAreanombreEstadoDetalleCliente.setVisible(this.estadodetalleclienteConstantesFunciones.mostrarnombreEstadoDetalleCliente);
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jPanelnombreEstadoDetalleCliente.setVisible(this.estadodetalleclienteConstantesFunciones.mostrarnombreEstadoDetalleCliente);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoDetalleCliente() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoDetalleCliente!=null) {
	
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jLabelidEstadoDetalleCliente.setEnabled(this.estadodetalleclienteConstantesFunciones.activaridEstadoDetalleCliente);
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jTextFieldcodigoEstadoDetalleCliente.setEnabled(this.estadodetalleclienteConstantesFunciones.activarcodigoEstadoDetalleCliente);
		this.jInternalFrameDetalleFormEstadoDetalleCliente.jTextAreanombreEstadoDetalleCliente.setEnabled(this.estadodetalleclienteConstantesFunciones.activarnombreEstadoDetalleCliente);
		}
	}
	
		
}