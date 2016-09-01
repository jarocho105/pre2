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

import com.bydan.erp.inventario.util.EstadoMovimientoInventarioConstantesFunciones;
import com.bydan.erp.inventario.util.EstadoMovimientoInventarioParameterReturnGeneral;
//import com.bydan.erp.inventario.util.EstadoMovimientoInventarioParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.EstadoMovimientoInventarioBean;
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
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class EstadoMovimientoInventarioBeanSwingJInternalFrame extends EstadoMovimientoInventarioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoMovimientoInventarioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoMovimientoInventario> estadomovimientoinventarioValidator = new ClassValidator<EstadoMovimientoInventario>(EstadoMovimientoInventario.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoMovimientoInventario estadomovimientoinventario;	
	public EstadoMovimientoInventario estadomovimientoinventarioAux;
	public EstadoMovimientoInventario estadomovimientoinventarioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoMovimientoInventario estadomovimientoinventarioTotales;
	public Long idEstadoMovimientoInventarioActual;
	public Long iIdNuevoEstadoMovimientoInventario=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosMovimientoInventario=false;

	public Boolean getIsTienePermisosMovimientoInventario() {
		return isTienePermisosMovimientoInventario;
	}

	public void setIsTienePermisosMovimientoInventario(Boolean isTienePermisosMovimientoInventario) {
		this.isTienePermisosMovimientoInventario= isTienePermisosMovimientoInventario;
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
	
	public Boolean isPermisoTodoEstadoMovimientoInventario;
	public Boolean isPermisoNuevoEstadoMovimientoInventario;
	public Boolean isPermisoActualizarEstadoMovimientoInventario;
	public Boolean isPermisoActualizarOriginalEstadoMovimientoInventario;
	public Boolean isPermisoEliminarEstadoMovimientoInventario;
	public Boolean isPermisoGuardarCambiosEstadoMovimientoInventario;
	public Boolean isPermisoConsultaEstadoMovimientoInventario;
	public Boolean isPermisoBusquedaEstadoMovimientoInventario;
	public Boolean isPermisoReporteEstadoMovimientoInventario;
	public Boolean isPermisoPaginacionMedioEstadoMovimientoInventario;
	public Boolean isPermisoPaginacionAltoEstadoMovimientoInventario;
	public Boolean isPermisoPaginacionTodoEstadoMovimientoInventario;
	public Boolean isPermisoCopiarEstadoMovimientoInventario;
	public Boolean isPermisoVerFormEstadoMovimientoInventario;
	public Boolean isPermisoDuplicarEstadoMovimientoInventario;
	public Boolean isPermisoOrdenEstadoMovimientoInventario;
	
	
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
	
	public EstadoMovimientoInventarioParameterReturnGeneral estadomovimientoinventarioReturnGeneral;
	public EstadoMovimientoInventarioParameterReturnGeneral estadomovimientoinventarioParameterGeneral;
	
	

	public MovimientoInventarioLogic movimientoinventarioLogic=null;

	public MovimientoInventarioLogic getMovimientoInventarioLogic() {
		return movimientoinventarioLogic;
	}

	public void setMovimientoInventarioLogic(MovimientoInventarioLogic movimientoinventarioLogic) {
		this.movimientoinventarioLogic = movimientoinventarioLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoMovimientoInventario=false;
	public Boolean esParaAccionDesdeFormularioEstadoMovimientoInventario=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadoMovimientoInventarioSessionBeanAdditional estadomovimientoinventarioSessionBeanAdditional=null;
	
	public EstadoMovimientoInventarioSessionBeanAdditional getEstadoMovimientoInventarioSessionBeanAdditional() {
		return this.estadomovimientoinventarioSessionBeanAdditional;
	}
	
	public void setEstadoMovimientoInventarioSessionBeanAdditional(EstadoMovimientoInventarioSessionBeanAdditional estadomovimientoinventarioSessionBeanAdditional) {
		try {
			this.estadomovimientoinventarioSessionBeanAdditional=estadomovimientoinventarioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional estadomovimientoinventarioBeanSwingJInternalFrameAdditional=null;
	//public class EstadoMovimientoInventarioBeanSwingJInternalFrame
	
	public EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional getEstadoMovimientoInventarioBeanSwingJInternalFrameAdditional() {
		return this.estadomovimientoinventarioBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadoMovimientoInventarioBeanSwingJInternalFrameAdditional(EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional estadomovimientoinventarioBeanSwingJInternalFrameAdditional) {
		try {
			this.estadomovimientoinventarioBeanSwingJInternalFrameAdditional=estadomovimientoinventarioBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoMovimientoInventarioLogic estadomovimientoinventarioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoMovimientoInventario estadomovimientoinventarioBean;
	public EstadoMovimientoInventarioConstantesFunciones estadomovimientoinventarioConstantesFunciones;
	//public EstadoMovimientoInventarioParameterReturnGeneral estadomovimientoinventarioReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoMovimientoInventario> estadomovimientoinventarios;	
	//public List<EstadoMovimientoInventario> estadomovimientoinventariosEliminados;
	//public List<EstadoMovimientoInventario> estadomovimientoinventariosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoMovimientoInventario=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoMovimientoInventario=true;
	public Boolean isVisibilidadCeldaCopiarEstadoMovimientoInventario=true;
	public Boolean isVisibilidadCeldaVerFormEstadoMovimientoInventario=true;
	public Boolean isVisibilidadCeldaOrdenEstadoMovimientoInventario=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoMovimientoInventario=false;
	public Boolean isVisibilidadCeldaModificarEstadoMovimientoInventario=false;
	public Boolean isVisibilidadCeldaActualizarEstadoMovimientoInventario=false;
	public Boolean isVisibilidadCeldaEliminarEstadoMovimientoInventario=false;
	public Boolean isVisibilidadCeldaCancelarEstadoMovimientoInventario=false;
	public Boolean isVisibilidadCeldaGuardarEstadoMovimientoInventario=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoMovimientoInventario=false;	
	
	
	
	public Long getiIdNuevoEstadoMovimientoInventario() {
		return this.iIdNuevoEstadoMovimientoInventario;
	}

	public void setiIdNuevoEstadoMovimientoInventario(Long iIdNuevoEstadoMovimientoInventario) {
		this.iIdNuevoEstadoMovimientoInventario = iIdNuevoEstadoMovimientoInventario;
	}
	
	public Long getidEstadoMovimientoInventarioActual() {
		return this.idEstadoMovimientoInventarioActual;
	}

	public void setidEstadoMovimientoInventarioActual(Long idEstadoMovimientoInventarioActual) {
		this.idEstadoMovimientoInventarioActual = idEstadoMovimientoInventarioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoMovimientoInventario getestadomovimientoinventario() {
		return this.estadomovimientoinventario;
	}

	public void setestadomovimientoinventario(EstadoMovimientoInventario estadomovimientoinventario) {
		this.estadomovimientoinventario = estadomovimientoinventario;
	}
	
	public EstadoMovimientoInventario getestadomovimientoinventarioAux() {
		return this.estadomovimientoinventarioAux;
	}

	public void setestadomovimientoinventarioAux(EstadoMovimientoInventario estadomovimientoinventarioAux) {
		this.estadomovimientoinventarioAux = estadomovimientoinventarioAux;
	}				
	
	public EstadoMovimientoInventario getestadomovimientoinventarioAnterior() {
		return this.estadomovimientoinventarioAnterior;
	}

	public void setestadomovimientoinventarioAnterior(EstadoMovimientoInventario estadomovimientoinventarioAnterior) {
		this.estadomovimientoinventarioAnterior = estadomovimientoinventarioAnterior;
	}	
	
	public EstadoMovimientoInventario getestadomovimientoinventarioTotales() {
		return this.estadomovimientoinventarioTotales;
	}

	public void setestadomovimientoinventarioTotales(EstadoMovimientoInventario estadomovimientoinventarioTotales) {
		this.estadomovimientoinventarioTotales = estadomovimientoinventarioTotales;
	}	
	
	public EstadoMovimientoInventario getestadomovimientoinventarioBean() {
		return this.estadomovimientoinventarioBean;
	}

	public void setestadomovimientoinventarioBean(EstadoMovimientoInventario estadomovimientoinventarioBean) {
		this.estadomovimientoinventarioBean = estadomovimientoinventarioBean;
	}	
	
	public EstadoMovimientoInventarioParameterReturnGeneral getestadomovimientoinventarioReturnGeneral() {
		return this.estadomovimientoinventarioReturnGeneral;
	}

	public void setestadomovimientoinventarioReturnGeneral(EstadoMovimientoInventarioParameterReturnGeneral estadomovimientoinventarioReturnGeneral) {
		this.estadomovimientoinventarioReturnGeneral = estadomovimientoinventarioReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoMovimientoInventarioLogic getEstadoMovimientoInventarioLogic()	{		
		return estadomovimientoinventarioLogic;
	}

	public void setEstadoMovimientoInventarioLogic(EstadoMovimientoInventarioLogic estadomovimientoinventarioLogic) {
		this.estadomovimientoinventarioLogic = estadomovimientoinventarioLogic;
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
	
	public Boolean getIsEsNuevoEstadoMovimientoInventario() {
		return isEsNuevoEstadoMovimientoInventario;
	}

	public void setIsEsNuevoEstadoMovimientoInventario(Boolean isEsNuevoEstadoMovimientoInventario) {
		this.isEsNuevoEstadoMovimientoInventario = isEsNuevoEstadoMovimientoInventario;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoMovimientoInventario() {
		return esParaAccionDesdeFormularioEstadoMovimientoInventario;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoMovimientoInventario(Boolean esParaAccionDesdeFormularioEstadoMovimientoInventario) {
		this.esParaAccionDesdeFormularioEstadoMovimientoInventario = esParaAccionDesdeFormularioEstadoMovimientoInventario;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoMovimientoInventario() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoMovimientoInventarioConstantesFunciones.refrescarForeignKeysDescripcionesEstadoMovimientoInventario(this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoMovimientoInventarioConstantesFunciones.refrescarForeignKeysDescripcionesEstadoMovimientoInventario(this.estadomovimientoinventarios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadomovimientoinventarioLogic.setEstadoMovimientoInventarios(this.estadomovimientoinventarios);
			estadomovimientoinventarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoMovimientoInventarioParameterReturnGeneral getEstadoMovimientoInventarioParameterGeneral() {
		return this.estadomovimientoinventarioParameterGeneral;
	}
	
	public void setEstadoMovimientoInventarioParameterGeneral(EstadoMovimientoInventarioParameterReturnGeneral estadomovimientoinventarioParameterGeneral) {
		this.estadomovimientoinventarioParameterGeneral = estadomovimientoinventarioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoMovimientoInventario() {
		return isPermisoTodoEstadoMovimientoInventario;
	}

	public void setIsPermisoTodoEstadoMovimientoInventario(Boolean isPermisoTodoEstadoMovimientoInventario) {
		this.isPermisoTodoEstadoMovimientoInventario = isPermisoTodoEstadoMovimientoInventario;
	}

	public Boolean getIsPermisoNuevoEstadoMovimientoInventario() {
		return isPermisoNuevoEstadoMovimientoInventario;
	}

	public void setIsPermisoNuevoEstadoMovimientoInventario(Boolean isPermisoNuevoEstadoMovimientoInventario) {
		this.isPermisoNuevoEstadoMovimientoInventario = isPermisoNuevoEstadoMovimientoInventario;
	}

	public Boolean getIsPermisoActualizarEstadoMovimientoInventario() {
		return isPermisoActualizarEstadoMovimientoInventario;
	}

	public void setIsPermisoActualizarEstadoMovimientoInventario(Boolean isPermisoActualizarEstadoMovimientoInventario) {
		this.isPermisoActualizarEstadoMovimientoInventario = isPermisoActualizarEstadoMovimientoInventario;
	}

	public Boolean getIsPermisoEliminarEstadoMovimientoInventario() {
		return isPermisoEliminarEstadoMovimientoInventario;
	}

	public void setIsPermisoEliminarEstadoMovimientoInventario(Boolean isPermisoEliminarEstadoMovimientoInventario) {
		this.isPermisoEliminarEstadoMovimientoInventario = isPermisoEliminarEstadoMovimientoInventario;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoMovimientoInventario() {
		return isPermisoGuardarCambiosEstadoMovimientoInventario;
	}

	public void setIsPermisoGuardarCambiosEstadoMovimientoInventario(Boolean isPermisoGuardarCambiosEstadoMovimientoInventario) {
		this.isPermisoGuardarCambiosEstadoMovimientoInventario = isPermisoGuardarCambiosEstadoMovimientoInventario;
	}
	
	public Boolean getIsPermisoConsultaEstadoMovimientoInventario() {
		return isPermisoConsultaEstadoMovimientoInventario;
	}

	public void setIsPermisoConsultaEstadoMovimientoInventario(Boolean isPermisoConsultaEstadoMovimientoInventario) {
		this.isPermisoConsultaEstadoMovimientoInventario = isPermisoConsultaEstadoMovimientoInventario;
	}

	public Boolean getIsPermisoBusquedaEstadoMovimientoInventario() {
		return isPermisoBusquedaEstadoMovimientoInventario;
	}

	public void setIsPermisoBusquedaEstadoMovimientoInventario(Boolean isPermisoBusquedaEstadoMovimientoInventario) {
		this.isPermisoBusquedaEstadoMovimientoInventario = isPermisoBusquedaEstadoMovimientoInventario;
	}

	public Boolean getIsPermisoReporteEstadoMovimientoInventario() {
		return isPermisoReporteEstadoMovimientoInventario;
	}

	public void setIsPermisoReporteEstadoMovimientoInventario(Boolean isPermisoReporteEstadoMovimientoInventario) {
		this.isPermisoReporteEstadoMovimientoInventario = isPermisoReporteEstadoMovimientoInventario;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoMovimientoInventario() {
		return isPermisoPaginacionMedioEstadoMovimientoInventario;
	}

	public void setIsPermisoPaginacionMedioEstadoMovimientoInventario(Boolean isPermisoPaginacionMedioEstadoMovimientoInventario) {
		this.isPermisoPaginacionMedioEstadoMovimientoInventario = isPermisoPaginacionMedioEstadoMovimientoInventario;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoMovimientoInventario() {
		return isPermisoPaginacionTodoEstadoMovimientoInventario;
	}

	public void setIsPermisoPaginacionTodoEstadoMovimientoInventario(Boolean isPermisoPaginacionTodoEstadoMovimientoInventario) {
		this.isPermisoPaginacionTodoEstadoMovimientoInventario = isPermisoPaginacionTodoEstadoMovimientoInventario;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoMovimientoInventario() {
		return isPermisoPaginacionAltoEstadoMovimientoInventario;
	}

	public void setIsPermisoPaginacionAltoEstadoMovimientoInventario(Boolean isPermisoPaginacionAltoEstadoMovimientoInventario) {
		this.isPermisoPaginacionAltoEstadoMovimientoInventario = isPermisoPaginacionAltoEstadoMovimientoInventario;
	}
	
	public Boolean getIsPermisoCopiarEstadoMovimientoInventario() {
		return isPermisoCopiarEstadoMovimientoInventario;
	}

	public void setIsPermisoCopiarEstadoMovimientoInventario(Boolean isPermisoCopiarEstadoMovimientoInventario) {
		this.isPermisoCopiarEstadoMovimientoInventario = isPermisoCopiarEstadoMovimientoInventario;
	}
	
	public Boolean getIsPermisoVerFormEstadoMovimientoInventario() {
		return isPermisoVerFormEstadoMovimientoInventario;
	}

	public void setIsPermisoVerFormEstadoMovimientoInventario(Boolean isPermisoVerFormEstadoMovimientoInventario) {
		this.isPermisoVerFormEstadoMovimientoInventario = isPermisoVerFormEstadoMovimientoInventario;
	}
	
	public Boolean getIsPermisoDuplicarEstadoMovimientoInventario() {
		return isPermisoDuplicarEstadoMovimientoInventario;
	}

	public void setIsPermisoDuplicarEstadoMovimientoInventario(Boolean isPermisoDuplicarEstadoMovimientoInventario) {
		this.isPermisoDuplicarEstadoMovimientoInventario = isPermisoDuplicarEstadoMovimientoInventario;
	}
	
	public Boolean getIsPermisoOrdenEstadoMovimientoInventario() {
		return isPermisoOrdenEstadoMovimientoInventario;
	}

	public void setIsPermisoOrdenEstadoMovimientoInventario(Boolean isPermisoOrdenEstadoMovimientoInventario) {
		this.isPermisoOrdenEstadoMovimientoInventario = isPermisoOrdenEstadoMovimientoInventario;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoMovimientoInventario() {
		return isVisibilidadCeldaNuevoEstadoMovimientoInventario;
	}

	public void setIsVisibilidadCeldaNuevoEstadoMovimientoInventario(Boolean isVisibilidadCeldaNuevoEstadoMovimientoInventario) {
		this.isVisibilidadCeldaNuevoEstadoMovimientoInventario = isVisibilidadCeldaNuevoEstadoMovimientoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoMovimientoInventario() {
		return isVisibilidadCeldaDuplicarEstadoMovimientoInventario;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoMovimientoInventario(Boolean isVisibilidadCeldaDuplicarEstadoMovimientoInventario) {
		this.isVisibilidadCeldaDuplicarEstadoMovimientoInventario = isVisibilidadCeldaDuplicarEstadoMovimientoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoMovimientoInventario() {
		return isVisibilidadCeldaCopiarEstadoMovimientoInventario;
	}

	public void setIsVisibilidadCeldaCopiarEstadoMovimientoInventario(Boolean isVisibilidadCeldaCopiarEstadoMovimientoInventario) {
		this.isVisibilidadCeldaCopiarEstadoMovimientoInventario = isVisibilidadCeldaCopiarEstadoMovimientoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoMovimientoInventario() {
		return isVisibilidadCeldaVerFormEstadoMovimientoInventario;
	}

	public void setIsVisibilidadCeldaVerFormEstadoMovimientoInventario(Boolean isVisibilidadCeldaVerFormEstadoMovimientoInventario) {
		this.isVisibilidadCeldaVerFormEstadoMovimientoInventario = isVisibilidadCeldaVerFormEstadoMovimientoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoMovimientoInventario() {
		return isVisibilidadCeldaOrdenEstadoMovimientoInventario;
	}

	public void setIsVisibilidadCeldaOrdenEstadoMovimientoInventario(Boolean isVisibilidadCeldaOrdenEstadoMovimientoInventario) {
		this.isVisibilidadCeldaOrdenEstadoMovimientoInventario = isVisibilidadCeldaOrdenEstadoMovimientoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoMovimientoInventario() {
		return isVisibilidadCeldaNuevoRelacionesEstadoMovimientoInventario;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoMovimientoInventario(Boolean isVisibilidadCeldaNuevoRelacionesEstadoMovimientoInventario) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoMovimientoInventario = isVisibilidadCeldaNuevoRelacionesEstadoMovimientoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoMovimientoInventario() {
		return isVisibilidadCeldaModificarEstadoMovimientoInventario;
	}

	public void setIsVisibilidadCeldaModificarEstadoMovimientoInventario(Boolean isVisibilidadCeldaModificarEstadoMovimientoInventario) {
		this.isVisibilidadCeldaModificarEstadoMovimientoInventario = isVisibilidadCeldaModificarEstadoMovimientoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoMovimientoInventario() {
		return isVisibilidadCeldaActualizarEstadoMovimientoInventario;
	}

	public void setIsVisibilidadCeldaActualizarEstadoMovimientoInventario(Boolean isVisibilidadCeldaActualizarEstadoMovimientoInventario) {
		this.isVisibilidadCeldaActualizarEstadoMovimientoInventario = isVisibilidadCeldaActualizarEstadoMovimientoInventario;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoMovimientoInventario() {
		return isVisibilidadCeldaEliminarEstadoMovimientoInventario;
	}

	public void setIsVisibilidadCeldaEliminarEstadoMovimientoInventario(Boolean isVisibilidadCeldaEliminarEstadoMovimientoInventario) {
		this.isVisibilidadCeldaEliminarEstadoMovimientoInventario = isVisibilidadCeldaEliminarEstadoMovimientoInventario;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoMovimientoInventario() {
		return isVisibilidadCeldaCancelarEstadoMovimientoInventario;
	}

	public void setIsVisibilidadCeldaCancelarEstadoMovimientoInventario(Boolean isVisibilidadCeldaCancelarEstadoMovimientoInventario) {
		this.isVisibilidadCeldaCancelarEstadoMovimientoInventario = isVisibilidadCeldaCancelarEstadoMovimientoInventario;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoMovimientoInventario() {
		return isVisibilidadCeldaGuardarEstadoMovimientoInventario;
	}

	public void setIsVisibilidadCeldaGuardarEstadoMovimientoInventario(Boolean isVisibilidadCeldaGuardarEstadoMovimientoInventario) {
		this.isVisibilidadCeldaGuardarEstadoMovimientoInventario = isVisibilidadCeldaGuardarEstadoMovimientoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoMovimientoInventario() {
		return isVisibilidadCeldaGuardarCambiosEstadoMovimientoInventario;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoMovimientoInventario(Boolean isVisibilidadCeldaGuardarCambiosEstadoMovimientoInventario) {
		this.isVisibilidadCeldaGuardarCambiosEstadoMovimientoInventario = isVisibilidadCeldaGuardarCambiosEstadoMovimientoInventario;
	}
		
	public EstadoMovimientoInventarioSessionBean getestadomovimientoinventarioSessionBean() {
		return this.estadomovimientoinventarioSessionBean;
	}
	
	public void setestadomovimientoinventarioSessionBean(EstadoMovimientoInventarioSessionBean estadomovimientoinventarioSessionBean) {
		this.estadomovimientoinventarioSessionBean=estadomovimientoinventarioSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoMovimientoInventario(EstadoMovimientoInventario estadomovimientoinventario)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoMovimientoInventario estadomovimientoinventario,EstadoMovimientoInventario estadomovimientoinventarioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoMovimientoInventario(estadomovimientoinventario);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadomovimientoinventarioAux.setId(estadomovimientoinventario.getId());
		estadomovimientoinventarioAux.setVersionRow(estadomovimientoinventario.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoMovimientoInventario();
		
			int intSelectedRow = this.jTableDatosEstadoMovimientoInventario.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadomovimientoinventario =(EstadoMovimientoInventario) this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadomovimientoinventario =(EstadoMovimientoInventario) this.estadomovimientoinventarios.toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoMovimientoInventario(this.estadomovimientoinventario,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoMovimientoInventario(this.estadomovimientoinventario);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadomovimientoinventarioValidator.getInvalidValues(this.estadomovimientoinventario);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadomovimientoinventarioLogic.setDatosCliente(datosCliente);
			estadomovimientoinventarioLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadomovimientoinventarioAux=new  EstadoMovimientoInventario();
				
				estadomovimientoinventarioAux.setIsNew(true);
				estadomovimientoinventarioAux.setIsChanged(true);
				
				estadomovimientoinventarioAux.setEstadoMovimientoInventarioOriginal(this.estadomovimientoinventario);
				
				estadomovimientoinventarioAux.setId(this.estadomovimientoinventario.getId());	
				estadomovimientoinventarioAux.setVersionRow(this.estadomovimientoinventario.getVersionRow());	
				estadomovimientoinventarioAux.setcodigo(this.estadomovimientoinventario.getcodigo());	
				estadomovimientoinventarioAux.setnombre(this.estadomovimientoinventario.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadomovimientoinventarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadomovimientoinventarioAux,estadomovimientoinventarioLogic.getEstadoMovimientoInventarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadomovimientoinventarioAux,estadomovimientoinventarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadomovimientoinventarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadomovimientoinventarioLogic.saveEstadoMovimientoInventarios();//WithConnection
						//estadomovimientoinventarioLogic.getSetVersionRowEstadoMovimientoInventarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadomovimientoinventario,estadomovimientoinventarioAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadomovimientoinventarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventarioLogic.getMovimientoInventarios().addAll(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventariosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventarios.addAll(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventariosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadomovimientoinventarioLogic.saveEstadoMovimientoInventarioRelaciones(estadomovimientoinventarioAux,this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventarioLogic.getMovimientoInventarios());//WithConnection
								//estadomovimientoinventarioLogic.getSetVersionRowEstadoMovimientoInventarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadomovimientoinventario,estadomovimientoinventarioAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventarioLogic.setMovimientoInventarios(new ArrayList<MovimientoInventario>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventarios= new ArrayList<MovimientoInventario>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();}
							estadomovimientoinventarioAux.setMovimientoInventarios(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventarioLogic.getMovimientoInventarios());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadomovimientoinventarioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadomovimientoinventarioAux,estadomovimientoinventarioLogic.getEstadoMovimientoInventarios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadomovimientoinventarioAux,estadomovimientoinventarios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadomovimientoinventario,estadomovimientoinventarioAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadomovimientoinventarioAux=new  EstadoMovimientoInventario();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado() 
					|| (this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado() && this.estadomovimientoinventario.getId()>=0)) {
						
					estadomovimientoinventarioAux.setIsNew(false);
				}
				
				estadomovimientoinventarioAux.setIsDeleted(false);
			
				estadomovimientoinventarioAux.setId(this.estadomovimientoinventario.getId());	
				estadomovimientoinventarioAux.setVersionRow(this.estadomovimientoinventario.getVersionRow());	
				estadomovimientoinventarioAux.setcodigo(this.estadomovimientoinventario.getcodigo());	
				estadomovimientoinventarioAux.setnombre(this.estadomovimientoinventario.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadomovimientoinventarioAux,estadomovimientoinventarioLogic.getEstadoMovimientoInventarios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadomovimientoinventarioAux,estadomovimientoinventarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadomovimientoinventarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadomovimientoinventarioLogic.saveEstadoMovimientoInventarios();//WithConnection
						//estadomovimientoinventarioLogic.getSetVersionRowEstadoMovimientoInventarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadomovimientoinventario,estadomovimientoinventarioAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadomovimientoinventarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventarioLogic.getMovimientoInventarios().addAll(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventariosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventarios.addAll(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventariosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadomovimientoinventarioLogic.saveEstadoMovimientoInventarioRelaciones(estadomovimientoinventarioAux,this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventarioLogic.getMovimientoInventarios());//WithConnection
								//estadomovimientoinventarioLogic.getSetVersionRowEstadoMovimientoInventarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadomovimientoinventario,estadomovimientoinventarioAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventarioLogic.setMovimientoInventarios(new ArrayList<MovimientoInventario>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventarios= new ArrayList<MovimientoInventario>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();}
							estadomovimientoinventarioAux.setMovimientoInventarios(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventarioLogic.getMovimientoInventarios());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadomovimientoinventarioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadomovimientoinventarioAux,estadomovimientoinventarioLogic.getEstadoMovimientoInventarios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadomovimientoinventarioAux,estadomovimientoinventarios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadomovimientoinventario,estadomovimientoinventarioAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadomovimientoinventarioAux=new  EstadoMovimientoInventario();
				
				estadomovimientoinventarioAux.setIsNew(false);
				estadomovimientoinventarioAux.setIsChanged(false);
				
				estadomovimientoinventarioAux.setIsDeleted(true);
				
				estadomovimientoinventarioAux.setId(this.estadomovimientoinventario.getId());	
				estadomovimientoinventarioAux.setVersionRow(this.estadomovimientoinventario.getVersionRow());	
				estadomovimientoinventarioAux.setcodigo(this.estadomovimientoinventario.getcodigo());	
				estadomovimientoinventarioAux.setnombre(this.estadomovimientoinventario.getnombre());	
				
				if(this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadomovimientoinventarioAux.getId()>=0) {	
						this.estadomovimientoinventariosEliminados.add(estadomovimientoinventarioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadomovimientoinventarioAux,estadomovimientoinventarioLogic.getEstadoMovimientoInventarios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadomovimientoinventarioAux,estadomovimientoinventarios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadomovimientoinventarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadomovimientoinventarioLogic.saveEstadoMovimientoInventarios();//WithConnection
						//estadomovimientoinventarioLogic.getSetVersionRowEstadoMovimientoInventarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadomovimientoinventarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventarioLogic.getMovimientoInventarios().addAll(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventariosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventarios.addAll(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventariosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormMovimientoInventario.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadomovimientoinventarioLogic.saveEstadoMovimientoInventarioRelaciones(estadomovimientoinventarioAux,this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventarioLogic.getMovimientoInventarios());//WithConnection
								//estadomovimientoinventarioLogic.getSetVersionRowEstadoMovimientoInventarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventarioLogic.setMovimientoInventarios(new ArrayList<MovimientoInventario>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventarios= new ArrayList<MovimientoInventario>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();}
							estadomovimientoinventarioAux.setMovimientoInventarios(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventarioLogic.getMovimientoInventarios());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadomovimientoinventarioSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadomovimientoinventarioAux,estadomovimientoinventarioLogic.getEstadoMovimientoInventarios());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadomovimientoinventarioAux,estadomovimientoinventarios);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().addAll(this.estadomovimientoinventariosEliminados);
					
					estadomovimientoinventarioLogic.saveEstadoMovimientoInventarios();//WithConnection
					//estadomovimientoinventarioLogic.getSetVersionRowEstadoMovimientoInventarios();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadomovimientoinventariosEliminados= new ArrayList<EstadoMovimientoInventario>();		
			}
			
			if(this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Movimiento Inventario GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Movimiento Inventario",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadomovimientoinventario=estadomovimientoinventarioAux;
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
      		//this.finishProcessEstadoMovimientoInventario();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoMovimientoInventario estadomovimientoinventarioLocal) throws Exception {
		
		if(this.estadomovimientoinventarioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadomovimientoinventarioLocal.setMovimientoInventarios(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventarioLogic.getMovimientoInventarios());
			
			} else {
			
				estadomovimientoinventarioLocal.setMovimientoInventarios(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventarios);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoMovimientoInventario estadomovimientoinventarioLocal) throws Exception {	
		if(this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoMovimientoInventarioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoMovimientoInventario.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadomovimientoinventario =(EstadoMovimientoInventario) this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadomovimientoinventario =(EstadoMovimientoInventario) this.estadomovimientoinventarios.toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadomovimientoinventarioValidator.getInvalidValues(this.estadomovimientoinventario);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoMovimientoInventario estadomovimientoinventario,List<EstadoMovimientoInventario> estadomovimientoinventarios) throws Exception {
		try	{		
			EstadoMovimientoInventarioConstantesFunciones.actualizarLista(estadomovimientoinventario,estadomovimientoinventarios,this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoMovimientoInventario estadomovimientoinventario,List<EstadoMovimientoInventario> estadomovimientoinventarios) throws Exception {
		try	{			
			EstadoMovimientoInventarioConstantesFunciones.actualizarSelectedLista(estadomovimientoinventario,estadomovimientoinventarios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoMovimientoInventario> estadomovimientoinventariosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadomovimientoinventariosLocal=this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadomovimientoinventariosLocal=this.estadomovimientoinventarios;
			}
			//ARCHITECTURE
		
			for(EstadoMovimientoInventario estadomovimientoinventarioLocal:estadomovimientoinventariosLocal) {
				if(this.permiteMantenimiento(estadomovimientoinventarioLocal) && estadomovimientoinventarioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoMovimientoInventarioConstantesFunciones.getEstadoMovimientoInventarioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoMovimientoInventarioConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoMovimientoInventario.jLabelcodigoEstadoMovimientoInventario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoMovimientoInventarioConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoMovimientoInventario.jLabelnombreEstadoMovimientoInventario,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoMovimientoInventario.jLabelcodigoEstadoMovimientoInventario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoMovimientoInventario.jLabelnombreEstadoMovimientoInventario,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("MovimientoInventario")) {
			if(this.estadomovimientoinventario==null) {
				this.estadomovimientoinventario= new EstadoMovimientoInventario();
			}

			if(this.estadomovimientoinventarioSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoMovimientoInventario
				this.setVariablesFormularioToObjetoActualEstadoMovimientoInventario(this.estadomovimientoinventario,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoMovimientoInventario(this.estadomovimientoinventario);

				this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.getmovimientoinventario().setEstadoMovimientoInventario(this.estadomovimientoinventario);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoMovimientoInventario--;	
		
		
		this.estadomovimientoinventarioAux=new EstadoMovimientoInventario();
		
		this.estadomovimientoinventarioAux.setId(this.iIdNuevoEstadoMovimientoInventario);
		this.estadomovimientoinventarioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().add(this.estadomovimientoinventarioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadomovimientoinventarios.add(this.estadomovimientoinventarioAux);
		}
		//ARCHITECTURE
		
		this.estadomovimientoinventario=this.estadomovimientoinventarioAux;
		
		if(EstadoMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoMovimientoInventario(this.estadomovimientoinventario);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoMovimientoInventario(this.estadomovimientoinventario);
		}
				
		//this.setDefaultControlesEstadoMovimientoInventario();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoMovimientoInventario();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoMovimientoInventario();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoMovimientoInventario();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoMovimientoInventario(this.estadomovimientoinventarioBean,this.estadomovimientoinventario,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoMovimientoInventario(this.estadomovimientoinventario);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadomovimientoinventarioSessionBean.getConGuardarRelaciones()) {
			classes=EstadoMovimientoInventarioConstantesFunciones.getClassesRelationshipsOfEstadoMovimientoInventario(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadomovimientoinventarioReturnGeneral=estadomovimientoinventarioLogic.procesarEventosEstadoMovimientoInventariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios(),this.estadomovimientoinventario,this.estadomovimientoinventarioParameterGeneral,this.isEsNuevoEstadoMovimientoInventario,classes);//this.estadomovimientoinventarioLogic.getEstadoMovimientoInventario()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoMovimientoInventario(this.estadomovimientoinventarioReturnGeneral,this.estadomovimientoinventarioBean,false);
		
		if(this.estadomovimientoinventarioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoMovimientoInventario(this.estadomovimientoinventarioReturnGeneral.getEstadoMovimientoInventario());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoMovimientoInventario(this.estadomovimientoinventarioReturnGeneral.getEstadoMovimientoInventario());
		}
		
		if(this.estadomovimientoinventarioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoMovimientoInventario(this.estadomovimientoinventarioReturnGeneral.getEstadoMovimientoInventario(),classes);//this.estadomovimientoinventarioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoMovimientoInventario(this.estadomovimientoinventario,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoMovimientoInventario();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoMovimientoInventario();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.RecargarFormEstadoMovimientoInventario(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoMovimientoInventario(false);
						
			if(estadomovimientoinventarioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventarioSessionBean.getEsGuardarRelacionado() && MovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonMovimientoInventarioActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoMovimientoInventario();
			}
			
			this.actualizarVisualTableDatosEstadoMovimientoInventario();
			
			this.jTableDatosEstadoMovimientoInventario.setRowSelectionInterval(this.getIndiceNuevoEstadoMovimientoInventario(), this.getIndiceNuevoEstadoMovimientoInventario());
			
			this.seleccionarFilaTablaEstadoMovimientoInventarioActual();
						
			this.actualizarEstadoCeldasBotonesEstadoMovimientoInventario("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoMovimientoInventario(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTextFieldcodigoEstadoMovimientoInventario.setEnabled(isHabilitar && this.estadomovimientoinventarioConstantesFunciones.activarcodigoEstadoMovimientoInventario);
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTextAreanombreEstadoMovimientoInventario.setEnabled(isHabilitar && this.estadomovimientoinventarioConstantesFunciones.activarnombreEstadoMovimientoInventario);	
		
	};
	
	public void setDefaultControlesEstadoMovimientoInventario() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoMovimientoInventario(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadomovimientoinventarioSessionBean.setConGuardarRelaciones(true);			
			this.estadomovimientoinventarioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTabbedPaneRelacionesEstadoMovimientoInventario.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventarioSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadomovimientoinventarioSessionBean.setConGuardarRelaciones(false);			
			this.estadomovimientoinventarioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTabbedPaneRelacionesEstadoMovimientoInventario.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventarioSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoMovimientoInventario() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoMovimientoInventario estadomovimientoinventarioAux:this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios()) {
				if(estadomovimientoinventarioAux.getId().equals(this.iIdNuevoEstadoMovimientoInventario)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoMovimientoInventario estadomovimientoinventarioAux:this.estadomovimientoinventarios) {
				if(estadomovimientoinventarioAux.getId().equals(this.iIdNuevoEstadoMovimientoInventario)) {
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
	
	public int getIndiceActualEstadoMovimientoInventario(EstadoMovimientoInventario estadomovimientoinventario,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoMovimientoInventario estadomovimientoinventarioAux:this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios()) {
				if(estadomovimientoinventarioAux.getId().equals(estadomovimientoinventario.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoMovimientoInventario estadomovimientoinventarioAux:this.estadomovimientoinventarios) {
				if(estadomovimientoinventarioAux.getId().equals(estadomovimientoinventario.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoMovimientoInventario(EstadoMovimientoInventario estadomovimientoinventarioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoMovimientoInventario estadomovimientoinventarioAux:this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios()) {
				if(estadomovimientoinventarioAux.getEstadoMovimientoInventarioOriginal().getId().equals(estadomovimientoinventarioOriginal.getId())) {
					existe=true;
					estadomovimientoinventarioOriginal.setId(estadomovimientoinventarioAux.getId());
					estadomovimientoinventarioOriginal.setVersionRow(estadomovimientoinventarioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoMovimientoInventario estadomovimientoinventarioAux:this.estadomovimientoinventarios) {
				if(estadomovimientoinventarioAux.getEstadoMovimientoInventarioOriginal().getId().equals(estadomovimientoinventarioOriginal.getId())) {
					existe=true;
					estadomovimientoinventarioOriginal.setId(estadomovimientoinventarioAux.getId());
					estadomovimientoinventarioOriginal.setVersionRow(estadomovimientoinventarioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoMovimientoInventario(Boolean esParaCancelar) throws Exception {
		estadomovimientoinventariosAux=new ArrayList<EstadoMovimientoInventario>();
		estadomovimientoinventarioAux=new EstadoMovimientoInventario();
		
		if(!this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoMovimientoInventario estadomovimientoinventarioAux:this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios()) {
					if(estadomovimientoinventarioAux.getId()<0) {
						estadomovimientoinventariosAux.add(estadomovimientoinventarioAux);
					}		
				}
				this.iIdNuevoEstadoMovimientoInventario=0L;
				this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().removeAll(estadomovimientoinventariosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoMovimientoInventario estadomovimientoinventarioAux:this.estadomovimientoinventarios) {
					if(estadomovimientoinventarioAux.getId()<0) {
						estadomovimientoinventariosAux.add(estadomovimientoinventarioAux);
					}		
				}
				this.iIdNuevoEstadoMovimientoInventario=0L;
				this.estadomovimientoinventarios.removeAll(estadomovimientoinventariosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoMovimientoInventario 
					&& this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().size()>0
					) {
					estadomovimientoinventarioAux=this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().get(this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().size() - 1);
				
					if(estadomovimientoinventarioAux.getId()<0) {
						this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().remove(estadomovimientoinventarioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoMovimientoInventario && this.estadomovimientoinventarios.size()>0) {
					estadomovimientoinventarioAux=this.estadomovimientoinventarios.get(this.estadomovimientoinventarios.size() - 1);
				
					if(estadomovimientoinventarioAux.getId()<0) {
						this.estadomovimientoinventarios.remove(estadomovimientoinventarioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoMovimientoInventario(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadomovimientoinventario.getId()<0) {
				this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().remove(this.estadomovimientoinventario);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadomovimientoinventario.getId()<0) {
				this.estadomovimientoinventarios.remove(this.estadomovimientoinventario);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoMovimientoInventario(List<EstadoMovimientoInventario> estadomovimientoinventariosAux) throws Exception {
		EstadoMovimientoInventarioConstantesFunciones.setEstadosInicialesEstadoMovimientoInventario(estadomovimientoinventariosAux);
	}
	
	public void setEstadosInicialesEstadoMovimientoInventario(EstadoMovimientoInventario estadomovimientoinventarioAux) throws Exception {
		EstadoMovimientoInventarioConstantesFunciones.setEstadosInicialesEstadoMovimientoInventario(estadomovimientoinventarioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoMovimientoInventarioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoMovimientoInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoMovimientoInventarioActual()) {
				if(!this.isEsNuevoEstadoMovimientoInventario) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoMovimientoInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoMovimientoInventario=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoMovimientoInventarioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Movimiento Inventario ?", "MANTENIMIENTO DE Estado Movimiento Inventario", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoMovimientoInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoMovimientoInventario estadomovimientoinventario) throws Exception {
		EstadoMovimientoInventarioConstantesFunciones.seleccionarAsignar(this.estadomovimientoinventario,estadomovimientoinventario);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoMovimientoInventario=this.isPermisoActualizarOriginalEstadoMovimientoInventario;
			
			
			this.seleccionarAsignar(estadomovimientoinventario);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoMovimientoInventarioConstantesFunciones.quitarEspaciosEstadoMovimientoInventario(this.estadomovimientoinventario,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoMovimientoInventario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadomovimientoinventarioSessionBean.setsFuncionBusquedaRapida(this.estadomovimientoinventarioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoMovimientoInventario) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoMovimientoInventario(esParaCancelar);				
				this.cancelarNuevoEstadoMovimientoInventario(esParaCancelar);								
			}
			
			this.estadomovimientoinventario=new EstadoMovimientoInventario();
			
			this.inicializarEstadoMovimientoInventario();
			
			this.actualizarEstadoCeldasBotonesEstadoMovimientoInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoMovimientoInventario() throws Exception {
		try {
			EstadoMovimientoInventarioConstantesFunciones.inicializarEstadoMovimientoInventario(this.estadomovimientoinventario);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoMovimientoInventarios(String sAccionBusqueda,List<EstadoMovimientoInventario> estadomovimientoinventariosParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoMovimientoInventario"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoMovimientoInventarioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoMovimientoInventarioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoMovimientoInventario"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Movimiento Inventarios");		
		parameters.put("busquedapor", EstadoMovimientoInventarioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(MovimientoInventario.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoMovimientoInventarioLogic estadomovimientoinventarioLogicAuxiliar=new EstadoMovimientoInventarioLogic();
					estadomovimientoinventarioLogicAuxiliar.setDatosCliente(estadomovimientoinventarioLogic.getDatosCliente());				
					estadomovimientoinventarioLogicAuxiliar.setEstadoMovimientoInventarios(estadomovimientoinventariosParaReportes);
					
					estadomovimientoinventarioLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoMovimientoInventarioWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadomovimientoinventariosParaReportes=estadomovimientoinventarioLogicAuxiliar.getEstadoMovimientoInventarios();
					
					//estadomovimientoinventarioLogic.getNewConnexionToDeep();
					
					//for (EstadoMovimientoInventario estadomovimientoinventario:estadomovimientoinventariosParaReportes) {
					//	estadomovimientoinventarioLogic.deepLoad(estadomovimientoinventario, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadomovimientoinventarioLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadomovimientoinventarioLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileMovimientoInventario = AuxiliarReportes.class.getResourceAsStream("MovimientoInventarioDetalleRelacionesDesign.jasper");
			parameters.put("subreport_movimientoinventario", reportFileMovimientoInventario);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoMovimientoInventario=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoMovimientoInventarioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoMovimientoInventarioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoMovimientoInventario=new JRBeanArrayDataSource(EstadoMovimientoInventarioJInternalFrame.TraerEstadoMovimientoInventarioBeans(estadomovimientoinventariosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoMovimientoInventario);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoMovimientoInventarioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoMovimientoInventarioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoMovimientoInventarioBean.TraerEstadoMovimientoInventarioBeans(estadomovimientoinventariosParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoMovimientoInventarios(sAccionBusqueda,sTipoArchivoReporte,estadomovimientoinventariosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoMovimientoInventarios(sAccionBusqueda,sTipoArchivoReporte,estadomovimientoinventariosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoMovimientoInventarioActionPerformed(null);
					//this.generarExcelReporteEstadoMovimientoInventarios(sAccionBusqueda,sTipoArchivoReporte,estadomovimientoinventariosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoMovimientoInventarios(sAccionBusqueda,sTipoArchivoReporte,estadomovimientoinventariosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoMovimientoInventarios(sAccionBusqueda,sTipoArchivoReporte,estadomovimientoinventariosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoMovimientoInventarios(sAccionBusqueda,sTipoArchivoReporte,estadomovimientoinventariosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoMovimientoInventarios(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoMovimientoInventario> estadomovimientoinventariosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadomovimientoinventario";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoMovimientoInventarios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoMovimientoInventario("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoMovimientoInventario estadomovimientoinventario : estadomovimientoinventariosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoMovimientoInventarioConstantesFunciones.generarExcelReporteDataEstadoMovimientoInventario("NORMAL",row,workbook,estadomovimientoinventario,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Movimiento Inventario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoMovimientoInventario(String sTipo,Row row,Workbook workbook) {
		
		EstadoMovimientoInventarioConstantesFunciones.generarExcelReporteHeaderEstadoMovimientoInventario(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoMovimientoInventarios(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoMovimientoInventario> estadomovimientoinventariosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadomovimientoinventario_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoMovimientoInventarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoMovimientoInventario estadomovimientoinventario : estadomovimientoinventariosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoMovimientoInventarioConstantesFunciones.getEstadoMovimientoInventarioDescripcion(estadomovimientoinventario));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoMovimientoInventarioConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoMovimientoInventarioConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadomovimientoinventario.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoMovimientoInventarioConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoMovimientoInventarioConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadomovimientoinventario.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Movimiento Inventario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoMovimientoInventarios(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoMovimientoInventario> estadomovimientoinventariosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoMovimientoInventario> estadomovimientoinventariosRespaldo=null;
		
		classes=EstadoMovimientoInventarioConstantesFunciones.getClassesRelationshipsOfEstadoMovimientoInventario(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadomovimientoinventarioLogic.setDatosCliente(this.datosCliente);
		this.estadomovimientoinventarioLogic.setDatosDeep(this.datosDeep);
		this.estadomovimientoinventarioLogic.setIsConDeep(true);
		
		estadomovimientoinventariosRespaldo=this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios();
		
		this.estadomovimientoinventarioLogic.setEstadoMovimientoInventarios(estadomovimientoinventariosParaReportes);	
		this.estadomovimientoinventarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadomovimientoinventariosParaReportes=this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios();
		this.estadomovimientoinventarioLogic.setEstadoMovimientoInventarios(estadomovimientoinventariosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadomovimientoinventario_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoMovimientoInventarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoMovimientoInventario("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoMovimientoInventario estadomovimientoinventario : estadomovimientoinventariosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoMovimientoInventario("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoMovimientoInventarioConstantesFunciones.generarExcelReporteDataEstadoMovimientoInventario("NORMAL",row,workbook,estadomovimientoinventario,cellStyleDataAux);
		
			
			


				//MovimientoInventario
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadomovimientoinventario.getMovimientoInventarios()!=null && estadomovimientoinventario.getMovimientoInventarios().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					MovimientoInventarioConstantesFunciones.generarExcelReporteHeaderMovimientoInventario("RELACIONADO",row,workbook);
				}

				if(estadomovimientoinventario.getMovimientoInventarios()!=null) {
					i2=0;
					for(MovimientoInventario movimientoinventario : estadomovimientoinventario.getMovimientoInventarios()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						MovimientoInventarioConstantesFunciones.generarExcelReporteDataMovimientoInventario("RELACIONADO",row,workbook,movimientoinventario,cellStyleDataAuxHijo);
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
		cell.setCellValue(EstadoMovimientoInventarioConstantesFunciones.getEstadoMovimientoInventarioDescripcion(estadomovimientoinventario));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Movimiento Inventario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoMovimientoInventario() throws Exception {		
		this.startProcessEstadoMovimientoInventario(true);
	}
	
	public void startProcessEstadoMovimientoInventario(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoMovimientoInventario, this.jScrollPanelDatosEstadoMovimientoInventario,this.jPanelPaginacionEstadoMovimientoInventario, this.jScrollPanelDatosEdicionEstadoMovimientoInventario, this.jPanelAccionesEstadoMovimientoInventario,this.jPanelAccionesFormularioEstadoMovimientoInventario,this.jmenuBarEstadoMovimientoInventario,this.jmenuBarDetalleEstadoMovimientoInventario,this.jTtoolBarEstadoMovimientoInventario,this.jTtoolBarDetalleEstadoMovimientoInventario);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoMovimientoInventario=null; 
		
		final JPanel jPanelParametrosReportesEstadoMovimientoInventario=this.jPanelParametrosReportesEstadoMovimientoInventario;
		//final JScrollPane jScrollPanelDatosEstadoMovimientoInventario=this.jScrollPanelDatosEstadoMovimientoInventario;
		final JTable jTableDatosEstadoMovimientoInventario=this.jTableDatosEstadoMovimientoInventario;		
		final JPanel jPanelPaginacionEstadoMovimientoInventario=this.jPanelPaginacionEstadoMovimientoInventario;
		//final JScrollPane jScrollPanelDatosEdicionEstadoMovimientoInventario=this.jScrollPanelDatosEdicionEstadoMovimientoInventario;
		final JPanel jPanelAccionesEstadoMovimientoInventario=this.jPanelAccionesEstadoMovimientoInventario;
		
		JPanel jPanelCamposAuxiliarEstadoMovimientoInventario=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoMovimientoInventario=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) {
			jPanelCamposAuxiliarEstadoMovimientoInventario=this.jInternalFrameDetalleFormEstadoMovimientoInventario.jPanelCamposEstadoMovimientoInventario;
			jPanelAccionesFormularioAuxiliarEstadoMovimientoInventario=this.jInternalFrameDetalleFormEstadoMovimientoInventario.jPanelAccionesFormularioEstadoMovimientoInventario;
		}
		
		final JPanel jPanelCamposEstadoMovimientoInventario=jPanelCamposAuxiliarEstadoMovimientoInventario;
		final JPanel jPanelAccionesFormularioEstadoMovimientoInventario=jPanelAccionesFormularioAuxiliarEstadoMovimientoInventario;
		
		
		final JMenuBar jmenuBarEstadoMovimientoInventario=this.jmenuBarEstadoMovimientoInventario;
		final JToolBar jTtoolBarEstadoMovimientoInventario=this.jTtoolBarEstadoMovimientoInventario;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoMovimientoInventario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoMovimientoInventario=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) {
			jmenuBarDetalleAuxiliarEstadoMovimientoInventario=this.jInternalFrameDetalleFormEstadoMovimientoInventario.jmenuBarDetalleEstadoMovimientoInventario;
			jTtoolBarDetalleAuxiliarEstadoMovimientoInventario=this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTtoolBarDetalleEstadoMovimientoInventario;
		}
		
		final JMenuBar jmenuBarDetalleEstadoMovimientoInventario=jmenuBarDetalleAuxiliarEstadoMovimientoInventario;
		final JToolBar jTtoolBarDetalleEstadoMovimientoInventario=jTtoolBarDetalleAuxiliarEstadoMovimientoInventario;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoMovimientoInventario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoMovimientoInventario;
			processRunnable.jTableDatos=jTableDatosEstadoMovimientoInventario;
			processRunnable.jPanelCampos=jPanelCamposEstadoMovimientoInventario;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoMovimientoInventario;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoMovimientoInventario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoMovimientoInventario;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoMovimientoInventario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoMovimientoInventario;
			processRunnable.jTtoolBar=jTtoolBarEstadoMovimientoInventario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoMovimientoInventario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoMovimientoInventario ,jPanelParametrosReportesEstadoMovimientoInventario,jTableDatosEstadoMovimientoInventario, /*jScrollPanelDatosEstadoMovimientoInventario,*/jPanelCamposEstadoMovimientoInventario,jPanelPaginacionEstadoMovimientoInventario, /*jScrollPanelDatosEdicionEstadoMovimientoInventario,*/ jPanelAccionesEstadoMovimientoInventario,jPanelAccionesFormularioEstadoMovimientoInventario,jmenuBarEstadoMovimientoInventario,jmenuBarDetalleEstadoMovimientoInventario,jTtoolBarEstadoMovimientoInventario,jTtoolBarDetalleEstadoMovimientoInventario);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoMovimientoInventario, jScrollPanelDatosEstadoMovimientoInventario,jPanelPaginacionEstadoMovimientoInventario, jScrollPanelDatosEdicionEstadoMovimientoInventario, jPanelAccionesEstadoMovimientoInventario,jPanelAccionesFormularioEstadoMovimientoInventario,jmenuBarEstadoMovimientoInventario,jmenuBarDetalleEstadoMovimientoInventario,jTtoolBarEstadoMovimientoInventario,jTtoolBarDetalleEstadoMovimientoInventario);
						
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
	
	public void finishProcessEstadoMovimientoInventario() {// throws Exception 
		this.finishProcessEstadoMovimientoInventario(true);
	}
	
	public void finishProcessEstadoMovimientoInventario(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoMovimientoInventario, this.jScrollPanelDatosEstadoMovimientoInventario,this.jPanelPaginacionEstadoMovimientoInventario, this.jScrollPanelDatosEdicionEstadoMovimientoInventario, this.jPanelAccionesEstadoMovimientoInventario,this.jPanelAccionesFormularioEstadoMovimientoInventario,this.jmenuBarEstadoMovimientoInventario,this.jmenuBarDetalleEstadoMovimientoInventario,this.jTtoolBarEstadoMovimientoInventario,this.jTtoolBarDetalleEstadoMovimientoInventario);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoMovimientoInventario=null; 
		
		final JPanel jPanelParametrosReportesEstadoMovimientoInventario=this.jPanelParametrosReportesEstadoMovimientoInventario;
		//final JScrollPane jScrollPanelDatosEstadoMovimientoInventario=this.jScrollPanelDatosEstadoMovimientoInventario;
		final JTable jTableDatosEstadoMovimientoInventario=this.jTableDatosEstadoMovimientoInventario;		
		final JPanel jPanelPaginacionEstadoMovimientoInventario=this.jPanelPaginacionEstadoMovimientoInventario;
		//final JScrollPane jScrollPanelDatosEdicionEstadoMovimientoInventario=this.jScrollPanelDatosEdicionEstadoMovimientoInventario;
		final JPanel jPanelAccionesEstadoMovimientoInventario=this.jPanelAccionesEstadoMovimientoInventario;
		
		JPanel jPanelCamposAuxiliarEstadoMovimientoInventario=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoMovimientoInventario=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) {
			jPanelCamposAuxiliarEstadoMovimientoInventario=this.jInternalFrameDetalleFormEstadoMovimientoInventario.jPanelCamposEstadoMovimientoInventario;
			jPanelAccionesFormularioAuxiliarEstadoMovimientoInventario=this.jInternalFrameDetalleFormEstadoMovimientoInventario.jPanelAccionesFormularioEstadoMovimientoInventario;
		}
		
		final JPanel jPanelCamposEstadoMovimientoInventario=jPanelCamposAuxiliarEstadoMovimientoInventario;
		final JPanel jPanelAccionesFormularioEstadoMovimientoInventario=jPanelAccionesFormularioAuxiliarEstadoMovimientoInventario;
		
		
		final JMenuBar jmenuBarEstadoMovimientoInventario=this.jmenuBarEstadoMovimientoInventario;		
		final JToolBar jTtoolBarEstadoMovimientoInventario=this.jTtoolBarEstadoMovimientoInventario;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoMovimientoInventario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoMovimientoInventario=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) {
			jmenuBarDetalleAuxiliarEstadoMovimientoInventario=this.jInternalFrameDetalleFormEstadoMovimientoInventario.jmenuBarDetalleEstadoMovimientoInventario;
			jTtoolBarDetalleAuxiliarEstadoMovimientoInventario=this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTtoolBarDetalleEstadoMovimientoInventario;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoMovimientoInventario=jmenuBarDetalleAuxiliarEstadoMovimientoInventario;
		final JToolBar jTtoolBarDetalleEstadoMovimientoInventario=jTtoolBarDetalleAuxiliarEstadoMovimientoInventario;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoMovimientoInventario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoMovimientoInventario;
			processRunnable.jTableDatos=jTableDatosEstadoMovimientoInventario;
			processRunnable.jPanelCampos=jPanelCamposEstadoMovimientoInventario;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoMovimientoInventario;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoMovimientoInventario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoMovimientoInventario;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoMovimientoInventario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoMovimientoInventario;
			processRunnable.jTtoolBar=jTtoolBarEstadoMovimientoInventario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoMovimientoInventario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoMovimientoInventario ,jPanelParametrosReportesEstadoMovimientoInventario, jTableDatosEstadoMovimientoInventario,/*jScrollPanelDatosEstadoMovimientoInventario,*/jPanelCamposEstadoMovimientoInventario,jPanelPaginacionEstadoMovimientoInventario, /*jScrollPanelDatosEdicionEstadoMovimientoInventario,*/ jPanelAccionesEstadoMovimientoInventario,jPanelAccionesFormularioEstadoMovimientoInventario,jmenuBarEstadoMovimientoInventario,jmenuBarDetalleEstadoMovimientoInventario,jTtoolBarEstadoMovimientoInventario,jTtoolBarDetalleEstadoMovimientoInventario));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoMovimientoInventario(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoMovimientoInventario(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoMovimientoInventario(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoMovimientoInventario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoMovimientoInventario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoMovimientoInventario,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoMovimientoInventario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoMovimientoInventario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoMovimientoInventario,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadomovimientoinventarioConstantesFunciones.getsFinalQueryEstadoMovimientoInventario();
		String  finalQueryPaginacionTodos=this.estadomovimientoinventarioConstantesFunciones.getsFinalQueryEstadoMovimientoInventario();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoMovimientoInventarioConstantesFunciones.getArrayColumnasGlobalesNoEstadoMovimientoInventario(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoMovimientoInventarioConstantesFunciones.getArrayColumnasGlobalesEstadoMovimientoInventario(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoMovimientoInventarioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadomovimientoinventariosEliminados= new ArrayList<EstadoMovimientoInventario>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoMovimientoInventario();
		
				///*EstadoMovimientoInventarioSessionBean*/this.estadomovimientoinventarioSessionBean=new EstadoMovimientoInventarioSessionBean();
			
			if(this.estadomovimientoinventarioSessionBean==null) {
				this.estadomovimientoinventarioSessionBean=new EstadoMovimientoInventarioSessionBean();
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
					this.iNumeroPaginacion=EstadoMovimientoInventarioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoMovimientoInventarioConstantesFunciones.getClassesForeignKeysOfEstadoMovimientoInventario(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadomovimientoinventario."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadomovimientoinventariosAux= new ArrayList<EstadoMovimientoInventario>();
			
				
			estadomovimientoinventarioLogic.setDatosCliente(this.datosCliente);
			estadomovimientoinventarioLogic.setDatosDeep(this.datosDeep);
			estadomovimientoinventarioLogic.setIsConDeep(true);
			
			
			estadomovimientoinventarioLogic.getEstadoMovimientoInventarioDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadomovimientoinventarioLogic.getTodosEstadoMovimientoInventarios(finalQueryGlobal,pagination);
					
					//estadomovimientoinventarioLogic.getTodosEstadoMovimientoInventariosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadomovimientoinventarioLogic.getEstadoMovimientoInventarios()==null|| estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadomovimientoinventariosAux= new ArrayList<EstadoMovimientoInventario>();
							estadomovimientoinventariosAux.addAll(estadomovimientoinventarioLogic.getEstadoMovimientoInventarios());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadomovimientoinventariosAux= new ArrayList<EstadoMovimientoInventario>();
							estadomovimientoinventariosAux.addAll(estadomovimientoinventarios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadomovimientoinventarioLogic.getTodosEstadoMovimientoInventarios(finalQueryGlobal+"",this.pagination);												
							
							//estadomovimientoinventarioLogic.getTodosEstadoMovimientoInventariosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoMovimientoInventarios("Todos",estadomovimientoinventarioLogic.getEstadoMovimientoInventarios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadomovimientoinventarioLogic.setEstadoMovimientoInventarios(new ArrayList<EstadoMovimientoInventario>());					
							estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().addAll(estadomovimientoinventariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadomovimientoinventarios=new ArrayList<EstadoMovimientoInventario>();
							estadomovimientoinventarios.addAll(estadomovimientoinventariosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoMovimientoInventario=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoMovimientoInventario=this.idActual;
				
				} else if(this.idEstadoMovimientoInventarioActual!=null && this.idEstadoMovimientoInventarioActual!=0L) {
					idEstadoMovimientoInventario=idEstadoMovimientoInventarioActual;
				}
				
					
				this.sDetalleReporte=EstadoMovimientoInventarioConstantesFunciones.getDetalleIndicePorId(idEstadoMovimientoInventario);
				
				this.estadomovimientoinventarios=new ArrayList<EstadoMovimientoInventario>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadomovimientoinventarioLogic.getEntity(idEstadoMovimientoInventario);
					
					//estadomovimientoinventarioLogic.getEntityWithConnection(idEstadoMovimientoInventario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadomovimientoinventarioLogic.setEstadoMovimientoInventarios(new ArrayList<EstadoMovimientoInventario>());
					estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().add(estadomovimientoinventarioLogic.getEstadoMovimientoInventario());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadomovimientoinventarios=new ArrayList<EstadoMovimientoInventario>();
					this.estadomovimientoinventarios.add(estadomovimientoinventario);
				}
				
				if(estadomovimientoinventarioLogic.getEstadoMovimientoInventario()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoMovimientoInventario();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoMovimientoInventario();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadomovimientoinventarios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadomovimientoinventarios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoMovimientoInventario estadomovimientoinventario) {
		Boolean permite=true;
		
		if(this.estadomovimientoinventario.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoMovimientoInventarioConstantesFunciones.getOrderByListaEstadoMovimientoInventario();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoMovimientoInventarioConstantesFunciones.getOrderByListaEstadoMovimientoInventario();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoMovimientoInventario estadomovimientoinventario:estadomovimientoinventarioLogic.getEstadoMovimientoInventarios()) {
				if(estadomovimientoinventario.getsType().equals(Constantes2.S_TOTALES)) {
					estadomovimientoinventarioTotales=estadomovimientoinventario;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoMovimientoInventario estadomovimientoinventario:this.estadomovimientoinventarios) {
				if(estadomovimientoinventario.getsType().equals(Constantes2.S_TOTALES)) {
					estadomovimientoinventarioTotales=estadomovimientoinventario;
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
			this.estadomovimientoinventarioAux=new EstadoMovimientoInventario();
			this.estadomovimientoinventarioAux.setsType(Constantes2.S_TOTALES);
			this.estadomovimientoinventarioAux.setIsNew(false);
			this.estadomovimientoinventarioAux.setIsChanged(false);
			this.estadomovimientoinventarioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoMovimientoInventarioConstantesFunciones.TotalizarValoresFilaEstadoMovimientoInventario(this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios(),this.estadomovimientoinventarioAux);
				
				this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().add(this.estadomovimientoinventarioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoMovimientoInventarioConstantesFunciones.TotalizarValoresFilaEstadoMovimientoInventario(this.estadomovimientoinventarios,this.estadomovimientoinventarioAux);
				
				this.estadomovimientoinventarios.add(this.estadomovimientoinventarioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadomovimientoinventarioTotales=new EstadoMovimientoInventario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().remove(estadomovimientoinventarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadomovimientoinventarios.remove(estadomovimientoinventarioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadomovimientoinventarioTotales=new EstadoMovimientoInventario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoMovimientoInventario estadomovimientoinventario:estadomovimientoinventarioLogic.getEstadoMovimientoInventarios()) {
				if(estadomovimientoinventario.getsType().equals(Constantes2.S_TOTALES)) {
					estadomovimientoinventarioTotales=estadomovimientoinventario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoMovimientoInventarioConstantesFunciones.TotalizarValoresFilaEstadoMovimientoInventario(this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios(),estadomovimientoinventarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoMovimientoInventario estadomovimientoinventario:this.estadomovimientoinventarios) {
				if(estadomovimientoinventario.getsType().equals(Constantes2.S_TOTALES)) {
					estadomovimientoinventarioTotales=estadomovimientoinventario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoMovimientoInventarioConstantesFunciones.TotalizarValoresFilaEstadoMovimientoInventario(this.estadomovimientoinventarios,estadomovimientoinventarioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosEstadoMovimientoInventario() {
		this.isPermisoTodoEstadoMovimientoInventario=false;
		this.isPermisoNuevoEstadoMovimientoInventario=false;
		this.isPermisoActualizarEstadoMovimientoInventario=false;
		this.isPermisoActualizarOriginalEstadoMovimientoInventario=false;
		this.isPermisoEliminarEstadoMovimientoInventario=false;
		this.isPermisoGuardarCambiosEstadoMovimientoInventario=false;
		this.isPermisoConsultaEstadoMovimientoInventario=false;
		this.isPermisoBusquedaEstadoMovimientoInventario=false;
		this.isPermisoReporteEstadoMovimientoInventario=false;		
		this.isPermisoOrdenEstadoMovimientoInventario=false;		
		this.isPermisoPaginacionMedioEstadoMovimientoInventario=false;		
		this.isPermisoPaginacionAltoEstadoMovimientoInventario=false;
		this.isPermisoPaginacionTodoEstadoMovimientoInventario=false;
		this.isPermisoCopiarEstadoMovimientoInventario=false;		
		this.isPermisoVerFormEstadoMovimientoInventario=false;		
		this.isPermisoDuplicarEstadoMovimientoInventario=false;		
		this.isPermisoOrdenEstadoMovimientoInventario=false;		
	}
	
	public void setPermisosUsuarioEstadoMovimientoInventario(Boolean isPermiso) {
		this.isPermisoTodoEstadoMovimientoInventario=isPermiso;
		this.isPermisoNuevoEstadoMovimientoInventario=isPermiso;
		this.isPermisoActualizarEstadoMovimientoInventario=isPermiso;
		this.isPermisoActualizarOriginalEstadoMovimientoInventario=isPermiso;
		this.isPermisoEliminarEstadoMovimientoInventario=isPermiso;
		this.isPermisoGuardarCambiosEstadoMovimientoInventario=isPermiso;
		this.isPermisoConsultaEstadoMovimientoInventario=isPermiso;
		this.isPermisoBusquedaEstadoMovimientoInventario=isPermiso;
		this.isPermisoReporteEstadoMovimientoInventario=isPermiso;
		this.isPermisoOrdenEstadoMovimientoInventario=isPermiso;		
		this.isPermisoPaginacionMedioEstadoMovimientoInventario=isPermiso;		
		this.isPermisoPaginacionAltoEstadoMovimientoInventario=isPermiso;		
		this.isPermisoPaginacionTodoEstadoMovimientoInventario=isPermiso;		
		this.isPermisoCopiarEstadoMovimientoInventario=isPermiso;		
		this.isPermisoVerFormEstadoMovimientoInventario=isPermiso;		
		this.isPermisoDuplicarEstadoMovimientoInventario=isPermiso;
		this.isPermisoOrdenEstadoMovimientoInventario=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoMovimientoInventario(Boolean isPermiso) {
		//this.isPermisoTodoEstadoMovimientoInventario=isPermiso;
		this.isPermisoNuevoEstadoMovimientoInventario=isPermiso;
		this.isPermisoActualizarEstadoMovimientoInventario=isPermiso;
		this.isPermisoActualizarOriginalEstadoMovimientoInventario=isPermiso;
		this.isPermisoEliminarEstadoMovimientoInventario=isPermiso;
		this.isPermisoGuardarCambiosEstadoMovimientoInventario=isPermiso;
		//this.isPermisoConsultaEstadoMovimientoInventario=isPermiso;
		//this.isPermisoBusquedaEstadoMovimientoInventario=isPermiso;
		//this.isPermisoReporteEstadoMovimientoInventario=isPermiso;
		//this.isPermisoOrdenEstadoMovimientoInventario=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoMovimientoInventario=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoMovimientoInventario=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoMovimientoInventario=isPermiso;		
		//this.isPermisoCopiarEstadoMovimientoInventario=isPermiso;		
		//this.isPermisoDuplicarEstadoMovimientoInventario=isPermiso;
		//this.isPermisoOrdenEstadoMovimientoInventario=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoMovimientoInventarioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(MovimientoInventarioConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoMovimientoInventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosMovimientoInventario=false;
		this.isTienePermisosMovimientoInventario=this.verificarGetPermisosUsuarioOpcionEstadoMovimientoInventarioClaseRelacionada(this.opcionsRelacionadas,MovimientoInventarioConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoMovimientoInventario(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoMovimientoInventarioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosMovimientoInventario=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoMovimientoInventarioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoMovimientoInventarioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoMovimientoInventarioClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosMovimientoInventario && this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null && this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTabbedPaneRelacionesEstadoMovimientoInventario.remove(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoMovimientoInventario() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoMovimientoInventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoMovimientoInventarioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoMovimientoInventario=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoMovimientoInventario=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoMovimientoInventario=this.isPermisoActualizarEstadoMovimientoInventario;
			this.isPermisoEliminarEstadoMovimientoInventario=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoMovimientoInventario=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoMovimientoInventario=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoMovimientoInventario=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoMovimientoInventario=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoMovimientoInventario=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoMovimientoInventario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoMovimientoInventario=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoMovimientoInventario=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoMovimientoInventario=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoMovimientoInventario=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoMovimientoInventario=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoMovimientoInventario=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoMovimientoInventario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoMovimientoInventario.setToolTipText(this.jTableDatosEstadoMovimientoInventario.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoMovimientoInventario(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoMovimientoInventario(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoMovimientoInventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoMovimientoInventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoMovimientoInventario() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosMovimientoInventario && this.estadomovimientoinventarioConstantesFunciones.mostrarMovimientoInventarioEstadoMovimientoInventario && !EstadoMovimientoInventarioConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Movimiento Inventario");
			reporte.setsDescripcion("Movimiento Inventario");
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
	
		
	public void inicializarCombosForeignKeyEstadoMovimientoInventarioListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoMovimientoInventarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoMovimientoInventarioJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoMovimientoInventarioListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoMovimientoInventarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoMovimientoInventario()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoMovimientoInventario()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoMovimientoInventario(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoMovimientoInventario()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoMovimientoInventario();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoMovimientoInventario(EstadoMovimientoInventario estadomovimientoinventario)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoMovimientoInventario(EstadoMovimientoInventario estadomovimientoinventario,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoMovimientoInventario()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoMovimientoInventario()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoMovimientoInventario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoMovimientoInventario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoMovimientoInventario()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoMovimientoInventario()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoMovimientoInventario(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoMovimientoInventario()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoMovimientoInventarioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoMovimientoInventarioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoMovimientoInventarioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadomovimientoinventarioSessionBean=new EstadoMovimientoInventarioSessionBean(); 
		this.estadomovimientoinventarioConstantesFunciones=new EstadoMovimientoInventarioConstantesFunciones(); 
		this.estadomovimientoinventarioBean=new EstadoMovimientoInventario();//(this.estadomovimientoinventarioConstantesFunciones); 		
		this.estadomovimientoinventarioReturnGeneral=new EstadoMovimientoInventarioParameterReturnGeneral(); 
		
		this.estadomovimientoinventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadomovimientoinventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoMovimientoInventarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoMovimientoInventarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoMovimientoInventarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoMovimientoInventario(true);
			
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
			
			this.estadomovimientoinventarioConstantesFunciones=new EstadoMovimientoInventarioConstantesFunciones(); 
			this.estadomovimientoinventarioBean=new EstadoMovimientoInventario();//this.estadomovimientoinventarioConstantesFunciones); 			
			this.estadomovimientoinventarioReturnGeneral=new EstadoMovimientoInventarioParameterReturnGeneral(); 
		
			EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Movimiento Inventario Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadomovimientoinventario=new EstadoMovimientoInventario();
			this.estadomovimientoinventarios = new ArrayList<EstadoMovimientoInventario>();
			this.estadomovimientoinventariosAux = new ArrayList<EstadoMovimientoInventario>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic=new EstadoMovimientoInventarioLogic();
				this.estadomovimientoinventarioLogic.getNewConnexionToDeep("");
			}
			
			//this.estadomovimientoinventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadomovimientoinventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoMovimientoInventario);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoMovimientoInventario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoMovimientoInventario);	
					}
					
					if(this.jInternalFrameImportacionEstadoMovimientoInventario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoMovimientoInventario);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoMovimientoInventario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoMovimientoInventario);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoMovimientoInventario);
				this.jInternalFrameDetalleFormEstadoMovimientoInventario.setVisible(false);
				this.jInternalFrameDetalleFormEstadoMovimientoInventario.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoMovimientoInventario!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoMovimientoInventario);
					this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoMovimientoInventario!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoMovimientoInventario);
					this.jInternalFrameImportacionEstadoMovimientoInventario.setVisible(false);
					this.jInternalFrameImportacionEstadoMovimientoInventario.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoMovimientoInventario!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoMovimientoInventario);
					this.jInternalFrameOrderByEstadoMovimientoInventario.setVisible(false);
					this.jInternalFrameOrderByEstadoMovimientoInventario.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoMovimientoInventarioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoMovimientoInventarioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadomovimientoinventarioReturnGeneral=new EstadoMovimientoInventarioParameterReturnGeneral();
			
			this.estadomovimientoinventarioParameterGeneral=new EstadoMovimientoInventarioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadomovimientoinventarioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoMovimientoInventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(MovimientoInventarioConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoMovimientoInventarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado(),this.estadomovimientoinventarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoMovimientoInventarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado(),this.estadomovimientoinventarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaDuplicarEstadoMovimientoInventario=true;
			this.isVisibilidadCeldaCopiarEstadoMovimientoInventario=true;
			this.isVisibilidadCeldaVerFormEstadoMovimientoInventario=true;
			this.isVisibilidadCeldaOrdenEstadoMovimientoInventario=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaModificarEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaActualizarEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaEliminarEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaCancelarEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaGuardarEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoMovimientoInventario=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoMovimientoInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoMovimientoInventario();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoMovimientoInventario(false);
			
			this.setPermisosUsuarioEstadoMovimientoInventario();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado() 
				|| (this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado() && this.estadomovimientoinventarioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoMovimientoInventarioClasesRelacionadas();
			}
			
			if(this.estadomovimientoinventarioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoMovimientoInventarioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoMovimientoInventario();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoMovimientoInventario();
			}
			
			if(!this.isPermisoBusquedaEstadoMovimientoInventario) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoMovimientoInventario,this.isPermisoPaginacionMedioEstadoMovimientoInventario,this.isPermisoPaginacionTodoEstadoMovimientoInventario);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoMovimientoInventarioConstantesFunciones.getTiposSeleccionarEstadoMovimientoInventario());
				
				this.tiposColumnasSelect=EstadoMovimientoInventarioConstantesFunciones.getTiposSeleccionarEstadoMovimientoInventario(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoMovimientoInventario();				
				//this.tiposRelacionesSelect=EstadoMovimientoInventarioConstantesFunciones.getTiposRelacionesEstadoMovimientoInventario(true);
				
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
			//if(!this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoMovimientoInventario();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoMovimientoInventario(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoMovimientoInventario(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoMovimientoInventario() ;
			
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
			
			
			this.movimientoinventarioLogic=new MovimientoInventarioLogic(); 
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
				estadomovimientoinventarioImplementable= (EstadoMovimientoInventarioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoMovimientoInventarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadomovimientoinventarioImplementableHome= (EstadoMovimientoInventarioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoMovimientoInventarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadomovimientoinventarios= new ArrayList<EstadoMovimientoInventario>();
			this.estadomovimientoinventariosEliminados= new ArrayList<EstadoMovimientoInventario>();
						
			this.isEsNuevoEstadoMovimientoInventario=false;
			this.esParaAccionDesdeFormularioEstadoMovimientoInventario=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoMovimientoInventario(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoMovimientoInventario();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoMovimientoInventarioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoMovimientoInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoMovimientoInventario(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoMovimientoInventario();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoMovimientoInventario();
			}
			
			EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoMovimientoInventario(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoMovimientoInventario: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoMovimientoInventario() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoMovimientoInventario")) {
				iIndex=this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTabbedPaneRelacionesEstadoMovimientoInventario.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTabbedPaneRelacionesEstadoMovimientoInventario.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoMovimientoInventario.getSelectedRow();	
				
				

				if(sTitle.equals("Movimiento Inventarios")) {
					if(!MovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoMovimientoInventario();

						this.cargarParteTabPanelRelacionadaMovimientoInventario(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoMovimientoInventario();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaMovimientoInventario(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.cargarSessionConBeanSwingJInternalFrameMovimientoInventario(false,true,iIndex);
		this.jButtonMovimientoInventarioActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaMovimientoInventario();

		//this.jTabbedPaneRelacionesEstadoMovimientoInventario.updateUI();
		//this.jTabbedPaneRelacionesEstadoMovimientoInventario.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoMovimientoInventario.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("MovimientoInventario")) {
				int row=this.jTableDatosEstadoMovimientoInventario.getSelectedRow();
				jButtonMovimientoInventarioActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Movimiento Inventario")) {

					if(this.isTienePermisosMovimientoInventario && this.estadomovimientoinventarioConstantesFunciones.mostrarMovimientoInventarioEstadoMovimientoInventario && !EstadoMovimientoInventarioConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Movimiento Inventarios"+"("+MovimientoInventarioConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Movimiento Inventarios");

						if(estadomovimientoinventarioConstantesFunciones.resaltarMovimientoInventarioEstadoMovimientoInventario!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadomovimientoinventarioConstantesFunciones.resaltarMovimientoInventarioEstadoMovimientoInventario);
						}

						jmenuItem.setEnabled(this.estadomovimientoinventarioConstantesFunciones.activarMovimientoInventarioEstadoMovimientoInventario);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"MovimientoInventario"));

						

						this.jInternalFrameDetalleFormEstadoMovimientoInventario.jmenuDetalleEstadoMovimientoInventario.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoMovimientoInventario(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoMovimientoInventario(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoMovimientoInventario(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoMovimientoInventarioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoMovimientoInventario();
		
		this.cargarCombosFrameForeignKeyEstadoMovimientoInventario();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoMovimientoInventario();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoMovimientoInventario();
		}
	}
	
	
	
	public void jButtonNuevoEstadoMovimientoInventarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadomovimientoinventarioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
			
			
			if(jTableDatosEstadoMovimientoInventario.getRowCount()>=1) {
				jTableDatosEstadoMovimientoInventario.removeRowSelectionInterval(0, jTableDatosEstadoMovimientoInventario.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoMovimientoInventario=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoMovimientoInventario(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoMovimientoInventario(true);			
			//this.estadomovimientoinventario=new EstadoMovimientoInventario();
			//this.estadomovimientoinventario.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoMovimientoInventario(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoMovimientoInventario() ;
			
			if(EstadoMovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoMovimientoInventario(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadomovimientoinventario);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadomovimientoinventario);				
			
			EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
			
			if(this.estadomovimientoinventarioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoMovimientoInventario: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoMovimientoInventarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoMovimientoInventario> estadomovimientoinventariosSeleccionados=new ArrayList<EstadoMovimientoInventario>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoMovimientoInventario.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoMovimientoInventario.getSelectedRows().length;			
			}
			
			estadomovimientoinventariosSeleccionados=this.getEstadoMovimientoInventariosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoMovimientoInventario--;			
				//EstadoMovimientoInventario estadomovimientoinventarioAux= new EstadoMovimientoInventario();			
				//estadomovimientoinventarioAux.setId(this.iIdNuevoEstadoMovimientoInventario);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoMovimientoInventario estadomovimientoinventarioOrigen=new EstadoMovimientoInventario();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoMovimientoInventario estadomovimientoinventarioOrigen : estadomovimientoinventariosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoMovimientoInventario.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadomovimientoinventarioOrigen =(EstadoMovimientoInventario) this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadomovimientoinventarioOrigen =(EstadoMovimientoInventario) this.estadomovimientoinventarios.toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoMovimientoInventario();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadomovimientoinventario.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoMovimientoInventario(estadomovimientoinventarioOrigen,this.estadomovimientoinventario,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoMovimientoInventario(this.estadomovimientoinventario);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().add(this.estadomovimientoinventarioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadomovimientoinventarios.add(this.estadomovimientoinventarioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoMovimientoInventario(false);
				
				this.jTableDatosEstadoMovimientoInventario.setRowSelectionInterval(this.getIndiceNuevoEstadoMovimientoInventario(), this.getIndiceNuevoEstadoMovimientoInventario());
				
				int iLastRow =  this.jTableDatosEstadoMovimientoInventario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoMovimientoInventario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoMovimientoInventario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoMovimientoInventario(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoMovimientoInventario> estadomovimientoinventariosSeleccionados=new ArrayList<EstadoMovimientoInventario>();									
		
			EstadoMovimientoInventario estadomovimientoinventarioOrigen=new EstadoMovimientoInventario();
			EstadoMovimientoInventario estadomovimientoinventarioDestino=new EstadoMovimientoInventario();
				
			estadomovimientoinventariosSeleccionados=this.getEstadoMovimientoInventariosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoMovimientoInventario.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadomovimientoinventariosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoMovimientoInventario.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadomovimientoinventarioOrigen =(EstadoMovimientoInventario) this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadomovimientoinventarioOrigen =(EstadoMovimientoInventario) this.estadomovimientoinventarios.toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadomovimientoinventarioDestino =(EstadoMovimientoInventario) this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadomovimientoinventarioDestino =(EstadoMovimientoInventario) this.estadomovimientoinventarios.toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadomovimientoinventarioOrigen =estadomovimientoinventariosSeleccionados.get(0);
				estadomovimientoinventarioDestino =estadomovimientoinventariosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoMovimientoInventario(estadomovimientoinventarioOrigen,estadomovimientoinventarioDestino,true,false);
				
				estadomovimientoinventarioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadomovimientoinventarioDestino,estadomovimientoinventarioLogic.getEstadoMovimientoInventarios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadomovimientoinventarioDestino,estadomovimientoinventarios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoMovimientoInventario(false);
				
				//this.jTableDatosEstadoMovimientoInventario.setRowSelectionInterval(this.getIndiceNuevoEstadoMovimientoInventario(), this.getIndiceNuevoEstadoMovimientoInventario());
				
				int iLastRow =  this.jTableDatosEstadoMovimientoInventario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoMovimientoInventario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoMovimientoInventario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoMovimientoInventario(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoMovimientoInventario.isVisible();
			
			
			this.jPanelParametrosReportesEstadoMovimientoInventario.setVisible(!isVisible);
			this.jPanelPaginacionEstadoMovimientoInventario.setVisible(!isVisible);
			this.jPanelAccionesEstadoMovimientoInventario.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoMovimientoInventario();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoMovimientoInventario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoMovimientoInventario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoMovimientoInventario();
			
			this.abrirFrameOrderByEstadoMovimientoInventario();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoMovimientoInventario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoMovimientoInventario(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoMovimientoInventario);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoMovimientoInventario.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoMovimientoInventario.setSize(this.jInternalFrameDetalleFormEstadoMovimientoInventario.iWidthFormulario,this.jInternalFrameDetalleFormEstadoMovimientoInventario.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoMovimientoInventario.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoMovimientoInventario.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoMovimientoInventario.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoMovimientoInventario.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.jContentPaneDetalleEstadoMovimientoInventario.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTabbedPaneRelacionesEstadoMovimientoInventario.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoMovimientoInventario.jContentPaneDetalleEstadoMovimientoInventario.getWidth(),EstadoMovimientoInventarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTabbedPaneRelacionesEstadoMovimientoInventario.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoMovimientoInventario.jContentPaneDetalleEstadoMovimientoInventario.getWidth(),EstadoMovimientoInventarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTabbedPaneRelacionesEstadoMovimientoInventario.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoMovimientoInventario.jContentPaneDetalleEstadoMovimientoInventario.getWidth(),EstadoMovimientoInventarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(MovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaMovimientoInventario();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoMovimientoInventario.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoMovimientoInventario.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoMovimientoInventario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoMovimientoInventario==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoMovimientoInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoMovimientoInventario,false,this);
				} else {
					this.jInternalFrameOrderByEstadoMovimientoInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoMovimientoInventario,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoMovimientoInventario);
				this.jInternalFrameOrderByEstadoMovimientoInventario.setVisible(false);
				this.jInternalFrameOrderByEstadoMovimientoInventario.setSelected(false);
				
				this.jInternalFrameOrderByEstadoMovimientoInventario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoMovimientoInventario"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoMovimientoInventario();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoMovimientoInventario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoMovimientoInventario==null) {
				
				this.jInternalFrameImportacionEstadoMovimientoInventario=new ImportacionJInternalFrame(EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoMovimientoInventario);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoMovimientoInventario);
				this.jInternalFrameImportacionEstadoMovimientoInventario.setVisible(false);
				this.jInternalFrameImportacionEstadoMovimientoInventario.setSelected(false);


				this.jInternalFrameImportacionEstadoMovimientoInventario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoMovimientoInventario"));
				this.jInternalFrameImportacionEstadoMovimientoInventario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoMovimientoInventario"));
				this.jInternalFrameImportacionEstadoMovimientoInventario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoMovimientoInventario"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoMovimientoInventario() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoMovimientoInventario==null) {
				this.jInternalFrameReporteDinamicoEstadoMovimientoInventario=new ReporteDinamicoJInternalFrame(EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoMovimientoInventario);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoMovimientoInventario);
				this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoMovimientoInventario"));
				this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoMovimientoInventario"));
				this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoMovimientoInventario"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoMovimientoInventario();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaMovimientoInventario() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jScrollPanelDatosMovimientoInventario.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoMovimientoInventario.jContentPaneDetalleEstadoMovimientoInventario.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jScrollPanelDatosMovimientoInventario.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jScrollPanelDatosMovimientoInventario.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.jScrollPanelDatosMovimientoInventario.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoMovimientoInventario() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoMovimientoInventario);
			
	       	this.jInternalFrameDetalleFormEstadoMovimientoInventario.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoMovimientoInventario.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoMovimientoInventario.dispose();
			//this.jInternalFrameDetalleFormEstadoMovimientoInventario=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoMovimientoInventario() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoMovimientoInventario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoMovimientoInventario.setVisible(true);
	        this.jInternalFrameImportacionEstadoMovimientoInventario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoMovimientoInventario() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoMovimientoInventario.setVisible(true);
	        this.jInternalFrameOrderByEstadoMovimientoInventario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoMovimientoInventario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoMovimientoInventario.setVisible(false);
	        this.jInternalFrameOrderByEstadoMovimientoInventario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoMovimientoInventario() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoMovimientoInventario() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoMovimientoInventario.setVisible(false);
	        this.jInternalFrameImportacionEstadoMovimientoInventario.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoMovimientoInventario(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoMovimientoInventario(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoMovimientoInventario.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoMovimientoInventario(true);
			//this.isEsNuevoEstadoMovimientoInventario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventario =(EstadoMovimientoInventario) this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadomovimientoinventario =(EstadoMovimientoInventario) this.estadomovimientoinventarios.toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoMovimientoInventario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoMovimientoInventario(false) ;
			
			if(estadomovimientoinventarioSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventarioSessionBean.getEsGuardarRelacionado() && MovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonMovimientoInventarioActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoMovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoMovimientoInventario(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoMovimientoInventario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoMovimientoInventarioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoMovimientoInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadomovimientoinventario =(EstadoMovimientoInventario) this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadomovimientoinventario =(EstadoMovimientoInventario) this.estadomovimientoinventarios.toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoMovimientoInventario(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoMovimientoInventario.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoMovimientoInventario(true);
			//this.isEsNuevoEstadoMovimientoInventario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventario =(EstadoMovimientoInventario) this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadomovimientoinventario =(EstadoMovimientoInventario) this.estadomovimientoinventarios.toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadomovimientoinventario.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoMovimientoInventario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoMovimientoInventario(false) ;
			
			if(EstadoMovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoMovimientoInventario(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoMovimientoInventario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoMovimientoInventario(false);
			
			//if(!this.isEsNuevoEstadoMovimientoInventario) {								
				int intSelectedRow = this.jTableDatosEstadoMovimientoInventario.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadomovimientoinventario =(EstadoMovimientoInventario) this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadomovimientoinventario =(EstadoMovimientoInventario) this.estadomovimientoinventarios.toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoMovimientoInventario(this.estadomovimientoinventario,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoMovimientoInventario(this.estadomovimientoinventario);
				
			}
			
			if(this.permiteMantenimiento(this.estadomovimientoinventario)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoMovimientoInventario=true;
					this.inicializarActualizarBindingTablaEstadoMovimientoInventario(false);
					this.isEsNuevoEstadoMovimientoInventario=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoMovimientoInventario=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoMovimientoInventario=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoMovimientoInventario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoMovimientoInventario(false);
				
				this.habilitarDeshabilitarControlesEstadoMovimientoInventario(false);
			
												
				
				if(EstadoMovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoMovimientoInventario();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoMovimientoInventarioActionPerformed(evt,estadomovimientoinventarioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoMovimientoInventario(this.estadomovimientoinventario,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoMovimientoInventario.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadomovimientoinventarioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadomovimientoinventario.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoMovimientoInventario.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoMovimientoInventario.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoMovimientoInventario.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventario =(EstadoMovimientoInventario) this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				this.estadomovimientoinventario.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadomovimientoinventario =(EstadoMovimientoInventario) this.estadomovimientoinventarios.toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				this.estadomovimientoinventario.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadomovimientoinventario)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoMovimientoInventarioModel) this.jTableDatosEstadoMovimientoInventario.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoMovimientoInventario=true;
				this.inicializarActualizarBindingTablaEstadoMovimientoInventario(false);
				this.isEsNuevoEstadoMovimientoInventario=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoMovimientoInventario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoMovimientoInventario(false);
				
				this.habilitarDeshabilitarControlesEstadoMovimientoInventario(false);
				
				
				
				if(EstadoMovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoMovimientoInventario();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoMovimientoInventario.getRowCount()>=1) {
				jTableDatosEstadoMovimientoInventario.removeRowSelectionInterval(0, jTableDatosEstadoMovimientoInventario.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoMovimientoInventario(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoMovimientoInventario(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoMovimientoInventario(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoMovimientoInventario(false) ;
			
			this.isEsNuevoEstadoMovimientoInventario=false;
			
			if(EstadoMovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoMovimientoInventario();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoMovimientoInventario(false);
				
				//SI ES MANUAL
				if(EstadoMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoMovimientoInventario();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoMovimientoInventario--;			
			//EstadoMovimientoInventario estadomovimientoinventarioAux= new EstadoMovimientoInventario();			
			//estadomovimientoinventarioAux.setId(this.iIdNuevoEstadoMovimientoInventario);
			
			if(this.jInternalFrameDetalleFormEstadoMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoMovimientoInventario();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoMovimientoInventario(this.estadomovimientoinventario);
			
			this.estadomovimientoinventario.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().add(this.estadomovimientoinventarioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadomovimientoinventarios.add(this.estadomovimientoinventarioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoMovimientoInventario(false);
			
			this.jTableDatosEstadoMovimientoInventario.setRowSelectionInterval(this.getIndiceNuevoEstadoMovimientoInventario(), this.getIndiceNuevoEstadoMovimientoInventario());
			
			int iLastRow =  this.jTableDatosEstadoMovimientoInventario.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoMovimientoInventario.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoMovimientoInventario.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoMovimientoInventario(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoMovimientoInventario(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoMovimientoInventario(false);
			
			//SI ES MANUAL
			if(EstadoMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoMovimientoInventario();
			}
			
			//this.abrirFrameTreeEstadoMovimientoInventario();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Movimiento InventarioS ?", "MANTENIMIENTO DE Estado Movimiento Inventario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoMovimientoInventario.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoMovimientoInventario();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadomovimientoinventarioReturnGeneral=estadomovimientoinventarioLogic.procesarImportacionEstadoMovimientoInventariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadomovimientoinventarioParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoMovimientoInventarioReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoMovimientoInventario.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoMovimientoInventario.setFileImportacion(this.jInternalFrameImportacionEstadoMovimientoInventario.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoMovimientoInventario.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoMovimientoInventario.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoMovimientoInventario.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoMovimientoInventario.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoMovimientoInventario> estadomovimientoinventariosSeleccionados=new ArrayList<EstadoMovimientoInventario>();		

		estadomovimientoinventariosSeleccionados=this.getEstadoMovimientoInventariosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoMovimientoInventarioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoMovimientoInventarioBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoMovimientoInventarios("Todos",estadomovimientoinventariosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Movimiento Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoMovimientoInventarioConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoMovimientoInventarioConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoMovimientoInventarioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoMovimientoInventarioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoMovimientoInventarioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoMovimientoInventarioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoMovimientoInventarioConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoMovimientoInventarioConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoMovimientoInventario> estadomovimientoinventariosSeleccionados=new ArrayList<EstadoMovimientoInventario>();		
		
		estadomovimientoinventariosSeleccionados=this.getEstadoMovimientoInventariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadomovimientoinventario";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoMovimientoInventarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoMovimientoInventarioConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoMovimientoInventarioConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoMovimientoInventario estadomovimientoinventario:estadomovimientoinventariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadomovimientoinventario.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoMovimientoInventarioConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoMovimientoInventarioConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoMovimientoInventario estadomovimientoinventario:estadomovimientoinventariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadomovimientoinventario.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoMovimientoInventario(row);				
			//	iRow++;
			//}				
			
			//for(EstadoMovimientoInventario estadomovimientoinventarioAux:estadomovimientoinventariosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoMovimientoInventario(estadomovimientoinventarioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Movimiento Inventario",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadomovimientoinventarioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoMovimientoInventario(false);
			
			//SI ES MANUAL
			if(EstadoMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoMovimientoInventario();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoMovimientoInventario(false);
			
			//SI ES MANUAL
			if(EstadoMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoMovimientoInventario();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoMovimientoInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoMovimientoInventario(false);
			
			//SI ES MANUAL
			if(EstadoMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoMovimientoInventario();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadomovimientoinventarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoMovimientoInventario() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoMovimientoInventario.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoMovimientoInventario.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoMovimientoInventario.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoMovimientoInventario.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoMovimientoInventario.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoMovimientoInventario.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoMovimientoInventario.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoMovimientoInventario(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoMovimientoInventario(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoMovimientoInventario(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoMovimientoInventario(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoMovimientoInventario(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoMovimientoInventario(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoMovimientoInventario(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoMovimientoInventario(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoMovimientoInventario() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoMovimientoInventario();
		
		this.inicializarActualizarBindingBotonesManualEstadoMovimientoInventario(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoMovimientoInventario();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoMovimientoInventario() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoMovimientoInventario(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoMovimientoInventario(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoMovimientoInventario.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoMovimientoInventario.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoMovimientoInventario.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoMovimientoInventario.jCheckBoxPostAccionNuevoEstadoMovimientoInventario.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoMovimientoInventario.jCheckBoxPostAccionSinCerrarEstadoMovimientoInventario.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoMovimientoInventario.jCheckBoxPostAccionSinMensajeEstadoMovimientoInventario.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoMovimientoInventario.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoMovimientoInventario.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoMovimientoInventario.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) {
				this.jInternalFrameDetalleFormEstadoMovimientoInventario.jCheckBoxPostAccionNuevoEstadoMovimientoInventario.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoMovimientoInventario.jCheckBoxPostAccionSinCerrarEstadoMovimientoInventario.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoMovimientoInventario.jCheckBoxPostAccionSinMensajeEstadoMovimientoInventario.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoMovimientoInventario.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoMovimientoInventario.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoMovimientoInventario.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoMovimientoInventario.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoMovimientoInventario!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoMovimientoInventario.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoMovimientoInventario.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoMovimientoInventario.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoMovimientoInventario.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoMovimientoInventario!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoMovimientoInventario.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoMovimientoInventario.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoMovimientoInventario(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoMovimientoInventario(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoMovimientoInventario() throws Exception {
		try	{
			if(EstadoMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoMovimientoInventario();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoMovimientoInventario() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoMovimientoInventario.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoMovimientoInventario.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoMovimientoInventario() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoMovimientoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoMovimientoInventario.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoMovimientoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoMovimientoInventario.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoMovimientoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoMovimientoInventario.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoMovimientoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoMovimientoInventario.addItem(reporte);
			}
			
			
			if(!this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoMovimientoInventario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoMovimientoInventario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoMovimientoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoMovimientoInventario.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoMovimientoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoMovimientoInventario.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoMovimientoInventario.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoMovimientoInventario.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoMovimientoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoMovimientoInventario.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoMovimientoInventario.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoMovimientoInventario();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoMovimientoInventario() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoMovimientoInventario!=null) {
				this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoMovimientoInventario!=null) {
				this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoMovimientoInventario!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoMovimientoInventario()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoMovimientoInventario(Boolean esInicializar) throws Exception {				
		if(EstadoMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoMovimientoInventario();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoMovimientoInventario() throws Exception {
		this.inicializarActualizarBindingTablaEstadoMovimientoInventario(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoMovimientoInventario() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoMovimientoInventario.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoMovimientoInventario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoMovimientoInventario.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoMovimientoInventarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoMovimientoInventario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoMovimientoInventario.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoMovimientoInventarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoMovimientoInventarioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoMovimientoInventarioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoMovimientoInventarioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoMovimientoInventario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoMovimientoInventario.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoMovimientoInventarioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoMovimientoInventario.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoMovimientoInventario(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadomovimientoinventarios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoMovimientoInventario.setModel(new EstadoMovimientoInventarioModel(this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoMovimientoInventario.setModel(new EstadoMovimientoInventarioModel(this.estadomovimientoinventarios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoMovimientoInventario!=null && this.jInternalFrameOrderByEstadoMovimientoInventario.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoMovimientoInventario();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoMovimientoInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoMovimientoInventario,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoMovimientoInventarioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO,estadomovimientoinventarioConstantesFunciones.resaltarSeleccionarEstadoMovimientoInventario,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO,estadomovimientoinventarioConstantesFunciones.resaltarSeleccionarEstadoMovimientoInventario,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoMovimientoInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoMovimientoInventario,EstadoMovimientoInventarioConstantesFunciones.LABEL_ID));

		if(this.estadomovimientoinventarioConstantesFunciones.mostraridEstadoMovimientoInventario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoMovimientoInventarioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadomovimientoinventarioConstantesFunciones.resaltaridEstadoMovimientoInventario,this.estadomovimientoinventarioConstantesFunciones.activaridEstadoMovimientoInventario,this,true,"idEstadoMovimientoInventario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadomovimientoinventarioConstantesFunciones.resaltaridEstadoMovimientoInventario,this.estadomovimientoinventarioConstantesFunciones.activaridEstadoMovimientoInventario,this,true,"idEstadoMovimientoInventario","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoMovimientoInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoMovimientoInventario,EstadoMovimientoInventarioConstantesFunciones.LABEL_CODIGO));

		if(this.estadomovimientoinventarioConstantesFunciones.mostrarcodigoEstadoMovimientoInventario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoMovimientoInventarioConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadomovimientoinventarioConstantesFunciones.resaltarcodigoEstadoMovimientoInventario,this.estadomovimientoinventarioConstantesFunciones.activarcodigoEstadoMovimientoInventario,this,true,"codigoEstadoMovimientoInventario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadomovimientoinventarioConstantesFunciones.resaltarcodigoEstadoMovimientoInventario,this.estadomovimientoinventarioConstantesFunciones.activarcodigoEstadoMovimientoInventario,this,true,"codigoEstadoMovimientoInventario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoMovimientoInventarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoMovimientoInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoMovimientoInventario,EstadoMovimientoInventarioConstantesFunciones.LABEL_NOMBRE));

		if(this.estadomovimientoinventarioConstantesFunciones.mostrarnombreEstadoMovimientoInventario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoMovimientoInventarioConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadomovimientoinventarioConstantesFunciones.resaltarnombreEstadoMovimientoInventario,this.estadomovimientoinventarioConstantesFunciones.activarnombreEstadoMovimientoInventario,this,true,"nombreEstadoMovimientoInventario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadomovimientoinventarioConstantesFunciones.resaltarnombreEstadoMovimientoInventario,this.estadomovimientoinventarioConstantesFunciones.activarnombreEstadoMovimientoInventario,this,true,"nombreEstadoMovimientoInventario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoMovimientoInventarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosMovimientoInventario && this.estadomovimientoinventarioConstantesFunciones.mostrarMovimientoInventarioEstadoMovimientoInventario && !EstadoMovimientoInventarioConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Movimiento Inventarios");
				tableColumn.setHeaderValue("Movimiento Inventarios");
				tableColumn.setCellRenderer(new MovimientoInventarioTableCell(estadomovimientoinventarioConstantesFunciones.resaltarMovimientoInventarioEstadoMovimientoInventario,this,this.estadomovimientoinventarioConstantesFunciones.activarMovimientoInventarioEstadoMovimientoInventario));
				tableColumn.setCellEditor(new MovimientoInventarioTableCell(estadomovimientoinventarioConstantesFunciones.resaltarMovimientoInventarioEstadoMovimientoInventario,this,this.estadomovimientoinventarioConstantesFunciones.activarMovimientoInventarioEstadoMovimientoInventario));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoMovimientoInventario.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoMovimientoInventario.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoMovimientoInventario.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoMovimientoInventario && this.isPermisoGuardarCambiosEstadoMovimientoInventario) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoMovimientoInventario.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadomovimientoinventarioSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoMovimientoInventario.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoMovimientoInventario.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoMovimientoInventario && this.isPermisoGuardarCambiosEstadoMovimientoInventario) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadomovimientoinventarioSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoMovimientoInventario && this.isPermisoGuardarCambiosEstadoMovimientoInventario) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoMovimientoInventario.moveColumn(this.jTableDatosEstadoMovimientoInventario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoMovimientoInventario.moveColumn(this.jTableDatosEstadoMovimientoInventario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadomovimientoinventarioSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoMovimientoInventario.moveColumn(this.jTableDatosEstadoMovimientoInventario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoMovimientoInventario.moveColumn(this.jTableDatosEstadoMovimientoInventario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoMovimientoInventario.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoMovimientoInventario.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoMovimientoInventario,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoMovimientoInventario.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoMovimientoInventario.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoMovimientoInventario.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoMovimientoInventario.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoMovimientoInventario.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadomovimientoinventarios.size()-1;
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
		//this.jTableDatosEstadoMovimientoInventario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoMovimientoInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoMovimientoInventario();
			
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
				
				//this.isEsNuevoEstadoMovimientoInventario=false;
					
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
			
				if(this.estadomovimientoinventarioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoMovimientoInventario==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoMovimientoInventario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoMovimientoInventario.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadomovimientoinventario =(EstadoMovimientoInventario) this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadomovimientoinventario =(EstadoMovimientoInventario) this.estadomovimientoinventarios.toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadomovimientoinventario.getsType().equals("DUPLICADO")
				   || this.estadomovimientoinventario.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoMovimientoInventario=true;
				
				} else {
					this.isEsNuevoEstadoMovimientoInventario=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
					if(this.estadomovimientoinventario.getId()>=0 && !this.estadomovimientoinventario.getIsNew()) {						
						this.isEsNuevoEstadoMovimientoInventario=false;
						
					} else {
						this.isEsNuevoEstadoMovimientoInventario=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoMovimientoInventario(esRelaciones);						
				
				this.seleccionarEstadoMovimientoInventario(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadomovimientoinventario.getId()<0) {
					this.isEsNuevoEstadoMovimientoInventario=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoMovimientoInventario(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoMovimientoInventario(evt,rowIndex);
				}	
				
				if(this.estadomovimientoinventarioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoMovimientoInventario: " + this.dDif); 
					}
				}								
				
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoMovimientoInventario(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadomovimientoinventario)) {
					if(this.estadomovimientoinventario.getId()>0) {
						this.estadomovimientoinventario.setIsDeleted(true);
						
						this.estadomovimientoinventariosEliminados.add(this.estadomovimientoinventario);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().remove(this.estadomovimientoinventario);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadomovimientoinventarios.remove(this.estadomovimientoinventario);				
					}
					
					
					((EstadoMovimientoInventarioModel) this.jTableDatosEstadoMovimientoInventario.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoMovimientoInventario(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoMovimientoInventario(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoMovimientoInventario) {
			
			if(this.jInternalFrameDetalleFormEstadoMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoMovimientoInventario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoMovimientoInventario.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadomovimientoinventario =(EstadoMovimientoInventario) this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadomovimientoinventario =(EstadoMovimientoInventario) this.estadomovimientoinventarios.toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoMovimientoInventario(this.estadomovimientoinventario);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoMovimientoInventario("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoMovimientoInventario(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoMovimientoInventario() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoMovimientoInventario(EstadoMovimientoInventario estadomovimientoinventario) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoMovimientoInventario(estadomovimientoinventario,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoMovimientoInventario(EstadoMovimientoInventario estadomovimientoinventario,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoMovimientoInventario(estadomovimientoinventario);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoMovimientoInventario(estadomovimientoinventario,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoMovimientoInventario(estadomovimientoinventario);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoMovimientoInventario(EstadoMovimientoInventario estadomovimientoinventario) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTextFieldidEstadoMovimientoInventario.setText(estadomovimientoinventario.getId().toString());
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTextFieldcodigoEstadoMovimientoInventario.setText(estadomovimientoinventario.getcodigo());
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTextAreanombreEstadoMovimientoInventario.setText(estadomovimientoinventario.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoMovimientoInventario estadomovimientoinventarioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadomovimientoinventarioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoMovimientoInventario estadomovimientoinventarioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadomovimientoinventarioLocal=this.estadomovimientoinventario;
			} else {
				estadomovimientoinventarioLocal=this.estadomovimientoinventarioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadomovimientoinventarioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoMovimientoInventario(estadomovimientoinventarioLocal,true);
					
					if(estadomovimientoinventarioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadomovimientoinventarioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadomovimientoinventarioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoMovimientoInventario(EstadoMovimientoInventario estadomovimientoinventario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoMovimientoInventario(estadomovimientoinventario,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoMovimientoInventario(estadomovimientoinventario);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoMovimientoInventario(EstadoMovimientoInventario estadomovimientoinventario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoMovimientoInventario(estadomovimientoinventario,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoMovimientoInventario(EstadoMovimientoInventario estadomovimientoinventario,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTextFieldidEstadoMovimientoInventario.getText()==null || this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTextFieldidEstadoMovimientoInventario.getText()=="" || this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTextFieldidEstadoMovimientoInventario.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTextFieldidEstadoMovimientoInventario.setText("0");
			}

			if(conColumnasBase) {estadomovimientoinventario.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTextFieldidEstadoMovimientoInventario.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoMovimientoInventarioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoMovimientoInventario.jLabelIdEstadoMovimientoInventario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadomovimientoinventario.setcodigo(this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTextFieldcodigoEstadoMovimientoInventario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoMovimientoInventarioConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoMovimientoInventario.jLabelcodigoEstadoMovimientoInventario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadomovimientoinventario.setnombre(this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTextAreanombreEstadoMovimientoInventario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoMovimientoInventarioConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoMovimientoInventario.jLabelnombreEstadoMovimientoInventario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoMovimientoInventario(EstadoMovimientoInventario estadomovimientoinventarioBean,EstadoMovimientoInventario estadomovimientoinventario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoMovimientoInventario(EstadoMovimientoInventario estadomovimientoinventarioOrigen,EstadoMovimientoInventario estadomovimientoinventario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadomovimientoinventarioOrigen.getId()!=null && !estadomovimientoinventarioOrigen.getId().equals(0L))) {estadomovimientoinventario.setId(estadomovimientoinventarioOrigen.getId());}}
			if(conDefault || (!conDefault && estadomovimientoinventarioOrigen.getcodigo()!=null && !estadomovimientoinventarioOrigen.getcodigo().equals(""))) {estadomovimientoinventario.setcodigo(estadomovimientoinventarioOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadomovimientoinventarioOrigen.getnombre()!=null && !estadomovimientoinventarioOrigen.getnombre().equals(""))) {estadomovimientoinventario.setnombre(estadomovimientoinventarioOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoMovimientoInventario(EstadoMovimientoInventario estadomovimientoinventario) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTextFieldidEstadoMovimientoInventario.setText(estadomovimientoinventario.getId().toString());
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTextFieldcodigoEstadoMovimientoInventario.setText(estadomovimientoinventario.getcodigo());
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTextAreanombreEstadoMovimientoInventario.setText(estadomovimientoinventario.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoMovimientoInventario(EstadoMovimientoInventarioBean estadomovimientoinventarioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTextFieldidEstadoMovimientoInventario.setText(estadomovimientoinventarioBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTextFieldcodigoEstadoMovimientoInventario.setText(estadomovimientoinventarioBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTextAreanombreEstadoMovimientoInventario.setText(estadomovimientoinventarioBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoMovimientoInventario(EstadoMovimientoInventarioParameterReturnGeneral estadomovimientoinventarioReturnGeneral,EstadoMovimientoInventarioBean estadomovimientoinventarioBean,Boolean conDefault) throws Exception { 
		try {
			EstadoMovimientoInventario estadomovimientoinventarioLocal=new EstadoMovimientoInventario();
			
			estadomovimientoinventarioLocal=estadomovimientoinventarioReturnGeneral.getEstadoMovimientoInventario();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadomovimientoinventarioLocal.getId()!=null && !estadomovimientoinventarioLocal.getId().equals(0L))) {estadomovimientoinventarioBean.setId(estadomovimientoinventarioLocal.getId());}}
			if(conDefault || (!conDefault && estadomovimientoinventarioLocal.getcodigo()!=null && !estadomovimientoinventarioLocal.getcodigo().equals(""))) {estadomovimientoinventarioBean.setcodigo(estadomovimientoinventarioLocal.getcodigo());}
			if(conDefault || (!conDefault && estadomovimientoinventarioLocal.getnombre()!=null && !estadomovimientoinventarioLocal.getnombre().equals(""))) {estadomovimientoinventarioBean.setnombre(estadomovimientoinventarioLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoMovimientoInventarioGenerico(Long idEstadoMovimientoInventarioSeleccionado,JComboBox jComboBoxEstadoMovimientoInventario,List<EstadoMovimientoInventario> estadomovimientoinventariosLocal)throws Exception {
		try {
			EstadoMovimientoInventario  estadomovimientoinventarioTemp=null;

			for(EstadoMovimientoInventario estadomovimientoinventarioAux:estadomovimientoinventariosLocal) {
				if(estadomovimientoinventarioAux.getId()!=null && estadomovimientoinventarioAux.getId().equals(idEstadoMovimientoInventarioSeleccionado)) {
					estadomovimientoinventarioTemp=estadomovimientoinventarioAux;
					break;
				}
			}

			jComboBoxEstadoMovimientoInventario.setSelectedItem(estadomovimientoinventarioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoMovimientoInventarioGenerico(JComboBox jComboBoxEstadoMovimientoInventario,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoMovimientoInventario.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoMovimientoInventario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoMovimientoInventario.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoMovimientoInventario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("MovimientoInventario")) {
			jButtonMovimientoInventarioActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadomovimientoinventario=(EstadoMovimientoInventario) estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadomovimientoinventario =(EstadoMovimientoInventario) estadomovimientoinventarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoMovimientoInventario estadomovimientoinventarioRow=new EstadoMovimientoInventario();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadomovimientoinventarioRow=(EstadoMovimientoInventario) estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadomovimientoinventarioRow=(EstadoMovimientoInventario) estadomovimientoinventarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonMovimientoInventarioActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoMovimientoInventario estadomovimientoinventario) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoMovimientoInventario==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadomovimientoinventarioLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadomovimientoinventario = (EstadoMovimientoInventario)this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadomovimientoinventario = (EstadoMovimientoInventario)this.estadomovimientoinventarios.toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadomovimientoinventario!=null) {
						this.estadomovimientoinventario = estadomovimientoinventario;
					} else {
						this.estadomovimientoinventario = new EstadoMovimientoInventario();
					}
				}

				if(this.isTienePermisosMovimientoInventario && this.permiteMantenimiento(this.estadomovimientoinventario)) {
					MovimientoInventarioBeanSwingJInternalFrame movimientoinventarioBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFramePopup=new MovimientoInventarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						movimientoinventarioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFramePopup;
					} else {
						movimientoinventarioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame;
					}

					List<EstadoMovimientoInventario> estadomovimientoinventarios=new ArrayList<EstadoMovimientoInventario>();
					estadomovimientoinventarios.add(this.estadomovimientoinventario);
					if(!esRelacionado) {
						//movimientoinventarioBeanSwingJInternalFrame.movimientoinventarioSessionBean.setConGuardarRelaciones(false);
						//movimientoinventarioBeanSwingJInternalFrame.movimientoinventarioSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					movimientoinventarioBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoMovimientoInventario.cargarMovimientoInventarioBeanSwingJInternalFrame(estadomovimientoinventarios,this.estadomovimientoinventario,movimientoinventarioBeanSwingJInternalFrame,/*conInicializar,*/movimientoinventarioBeanSwingJInternalFrame.movimientoinventarioSessionBean.getConGuardarRelaciones(),movimientoinventarioBeanSwingJInternalFrame.movimientoinventarioSessionBean.getEsGuardarRelacionado());
					movimientoinventarioBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						movimientoinventarioBeanSwingJInternalFrame.actualizarEstadoPanelsMovimientoInventario("no_relacionado");

						movimientoinventarioBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(MovimientoInventarioConstantesFunciones.ITAMANIOFILATABLA + (MovimientoInventarioConstantesFunciones.ITAMANIOFILATABLA/2));

						movimientoinventarioBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoMovimientoInventario=(TitledBorder)this.jScrollPanelDatosEstadoMovimientoInventario.getBorder();
						TitledBorder titledBorderMovimientoInventario=(TitledBorder)movimientoinventarioBeanSwingJInternalFrame.jScrollPanelDatosMovimientoInventario.getBorder();

						titledBorderMovimientoInventario.setTitle(titledBorderEstadoMovimientoInventario.getTitle() + " -> Movimiento Inventario");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,movimientoinventarioBeanSwingJInternalFrame);
						}

						movimientoinventarioBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(movimientoinventarioBeanSwingJInternalFrame);

						movimientoinventarioBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadomovimientoinventarioSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Movimiento Inventario",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadomovimientoinventarioLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadomovimientoinventarioLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadomovimientoinventarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoMovimientoInventario(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaNuevoEstadoMovimientoInventario && this.isPermisoNuevoEstadoMovimientoInventario));			
			this.jButtonDuplicarEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaDuplicarEstadoMovimientoInventario && this.isPermisoDuplicarEstadoMovimientoInventario));			
			this.jButtonCopiarEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaCopiarEstadoMovimientoInventario && this.isPermisoCopiarEstadoMovimientoInventario));
			this.jButtonVerFormEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaVerFormEstadoMovimientoInventario && this.isPermisoVerFormEstadoMovimientoInventario));
			
			this.jButtonAbrirOrderByEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaOrdenEstadoMovimientoInventario && this.isPermisoOrdenEstadoMovimientoInventario));			
			
			this.jButtonNuevoRelacionesEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoMovimientoInventario && this.isPermisoNuevoEstadoMovimientoInventario));			
			this.jButtonNuevoGuardarCambiosEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaNuevoEstadoMovimientoInventario && this.isPermisoNuevoEstadoMovimientoInventario && this.isPermisoGuardarCambiosEstadoMovimientoInventario));
			
			if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) {
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonModificarEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaModificarEstadoMovimientoInventario && this.isPermisoActualizarEstadoMovimientoInventario));	
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonActualizarEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaActualizarEstadoMovimientoInventario && this.isPermisoActualizarEstadoMovimientoInventario));	
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonEliminarEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaEliminarEstadoMovimientoInventario && this.isPermisoEliminarEstadoMovimientoInventario));
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonCancelarEstadoMovimientoInventario.setVisible(this.isVisibilidadCeldaCancelarEstadoMovimientoInventario);							
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonGuardarCambiosEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaGuardarEstadoMovimientoInventario && this.isPermisoGuardarCambiosEstadoMovimientoInventario));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoMovimientoInventario && this.isPermisoGuardarCambiosEstadoMovimientoInventario));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaNuevoEstadoMovimientoInventario && this.isPermisoNuevoEstadoMovimientoInventario));						
			this.jButtonDuplicarToolBarEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaDuplicarEstadoMovimientoInventario && this.isPermisoDuplicarEstadoMovimientoInventario));						
			this.jButtonCopiarToolBarEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaCopiarEstadoMovimientoInventario && this.isPermisoCopiarEstadoMovimientoInventario));			
			this.jButtonVerFormToolBarEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaVerFormEstadoMovimientoInventario && this.isPermisoVerFormEstadoMovimientoInventario));			
			this.jButtonAbrirOrderByToolBarEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaOrdenEstadoMovimientoInventario && this.isPermisoOrdenEstadoMovimientoInventario));
			this.jButtonNuevoRelacionesToolBarEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoMovimientoInventario && this.isPermisoNuevoEstadoMovimientoInventario));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaNuevoEstadoMovimientoInventario && this.isPermisoNuevoEstadoMovimientoInventario && this.isPermisoGuardarCambiosEstadoMovimientoInventario));			
			
			if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) {
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonModificarToolBarEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaModificarEstadoMovimientoInventario && this.isPermisoActualizarEstadoMovimientoInventario));	
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonActualizarToolBarEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaActualizarEstadoMovimientoInventario  && this.isPermisoActualizarEstadoMovimientoInventario));	
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonEliminarToolBarEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaEliminarEstadoMovimientoInventario && this.isPermisoEliminarEstadoMovimientoInventario));
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonCancelarToolBarEstadoMovimientoInventario.setVisible(this.isVisibilidadCeldaCancelarEstadoMovimientoInventario);				
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonGuardarCambiosToolBarEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaGuardarEstadoMovimientoInventario && this.isPermisoGuardarCambiosEstadoMovimientoInventario));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoMovimientoInventario && this.isPermisoGuardarCambiosEstadoMovimientoInventario));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaNuevoEstadoMovimientoInventario && this.isPermisoNuevoEstadoMovimientoInventario));			
			this.jMenuItemDuplicarEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaDuplicarEstadoMovimientoInventario && this.isPermisoDuplicarEstadoMovimientoInventario));			
			this.jMenuItemCopiarEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaCopiarEstadoMovimientoInventario && this.isPermisoCopiarEstadoMovimientoInventario));			
			this.jMenuItemVerFormEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaVerFormEstadoMovimientoInventario && this.isPermisoVerFormEstadoMovimientoInventario));			
			this.jMenuItemAbrirOrderByEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaOrdenEstadoMovimientoInventario && this.isPermisoOrdenEstadoMovimientoInventario));			
			//this.jMenuItemMostrarOcultarEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaOrdenEstadoMovimientoInventario && this.isPermisoOrdenEstadoMovimientoInventario));
			this.jMenuItemDetalleAbrirOrderByEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaOrdenEstadoMovimientoInventario && this.isPermisoOrdenEstadoMovimientoInventario));			
			//this.jMenuItemDetalleMostrarOcultarEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaOrdenEstadoMovimientoInventario && this.isPermisoOrdenEstadoMovimientoInventario));			
			this.jMenuItemNuevoRelacionesEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoMovimientoInventario && this.isPermisoNuevoEstadoMovimientoInventario));			
			this.jMenuItemNuevoGuardarCambiosEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaNuevoEstadoMovimientoInventario && this.isPermisoNuevoEstadoMovimientoInventario && this.isPermisoGuardarCambiosEstadoMovimientoInventario));									
			
			if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) {
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jMenuItemModificarEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaModificarEstadoMovimientoInventario && this.isPermisoActualizarEstadoMovimientoInventario));	
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jMenuItemActualizarEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaActualizarEstadoMovimientoInventario && this.isPermisoActualizarEstadoMovimientoInventario));	
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jMenuItemEliminarEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaEliminarEstadoMovimientoInventario && this.isPermisoEliminarEstadoMovimientoInventario));
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jMenuItemCancelarEstadoMovimientoInventario.setVisible(this.isVisibilidadCeldaCancelarEstadoMovimientoInventario);				
			}
			
			this.jMenuItemGuardarCambiosEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaGuardarEstadoMovimientoInventario && this.isPermisoGuardarCambiosEstadoMovimientoInventario));						
			this.jMenuItemGuardarCambiosTablaEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoMovimientoInventario && this.isPermisoGuardarCambiosEstadoMovimientoInventario));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoMovimientoInventario=this.jButtonNuevoEstadoMovimientoInventario.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoMovimientoInventario=this.jButtonDuplicarEstadoMovimientoInventario.isVisible();
			this.isVisibilidadCeldaCopiarEstadoMovimientoInventario=this.jButtonCopiarEstadoMovimientoInventario.isVisible();
			this.isVisibilidadCeldaVerFormEstadoMovimientoInventario=this.jButtonVerFormEstadoMovimientoInventario.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoMovimientoInventario=this.jButtonAbrirOrderByEstadoMovimientoInventario.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoMovimientoInventario=this.jButtonNuevoRelacionesEstadoMovimientoInventario.isVisible();
			this.isVisibilidadCeldaModificarEstadoMovimientoInventario=this.jButtonModificarEstadoMovimientoInventario.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) {
			this.isVisibilidadCeldaActualizarEstadoMovimientoInventario=this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonActualizarEstadoMovimientoInventario.isVisible();
			this.isVisibilidadCeldaEliminarEstadoMovimientoInventario=this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonEliminarEstadoMovimientoInventario.isVisible();
			this.isVisibilidadCeldaCancelarEstadoMovimientoInventario=this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonCancelarEstadoMovimientoInventario.isVisible();
			this.isVisibilidadCeldaGuardarEstadoMovimientoInventario=this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonGuardarCambiosEstadoMovimientoInventario.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoMovimientoInventario=this.jButtonGuardarCambiosTablaEstadoMovimientoInventario.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoMovimientoInventario=this.jButtonNuevoToolBarEstadoMovimientoInventario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoMovimientoInventario=this.jButtonNuevoRelacionesToolBarEstadoMovimientoInventario.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) {
			this.isVisibilidadCeldaModificarEstadoMovimientoInventario=this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonModificarToolBarEstadoMovimientoInventario.isVisible();
			this.isVisibilidadCeldaActualizarEstadoMovimientoInventario=this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonActualizarToolBarEstadoMovimientoInventario.isVisible();
			this.isVisibilidadCeldaEliminarEstadoMovimientoInventario=this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonEliminarToolBarEstadoMovimientoInventario.isVisible();
			this.isVisibilidadCeldaCancelarEstadoMovimientoInventario=this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonCancelarToolBarEstadoMovimientoInventario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoMovimientoInventario=this.jButtonGuardarCambiosToolBarEstadoMovimientoInventario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoMovimientoInventario=this.jButtonGuardarCambiosTablaToolBarEstadoMovimientoInventario.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoMovimientoInventario=this.jMenuItemNuevoEstadoMovimientoInventario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoMovimientoInventario=this.jMenuItemNuevoRelacionesEstadoMovimientoInventario.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) {
			this.isVisibilidadCeldaModificarEstadoMovimientoInventario=this.jInternalFrameDetalleFormEstadoMovimientoInventario.jMenuItemModificarEstadoMovimientoInventario.isVisible();
			this.isVisibilidadCeldaActualizarEstadoMovimientoInventario=this.jInternalFrameDetalleFormEstadoMovimientoInventario.jMenuItemActualizarEstadoMovimientoInventario.isVisible();
			this.isVisibilidadCeldaEliminarEstadoMovimientoInventario=this.jInternalFrameDetalleFormEstadoMovimientoInventario.jMenuItemEliminarEstadoMovimientoInventario.isVisible();
			this.isVisibilidadCeldaCancelarEstadoMovimientoInventario=this.jInternalFrameDetalleFormEstadoMovimientoInventario.jMenuItemCancelarEstadoMovimientoInventario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoMovimientoInventario=this.jMenuItemGuardarCambiosEstadoMovimientoInventario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoMovimientoInventario=this.jMenuItemGuardarCambiosTablaEstadoMovimientoInventario.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoMovimientoInventario(Boolean esInicializar) {
		if(EstadoMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadomovimientoinventarioSessionBean.getConGuardarRelaciones()) {
				//if(this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoMovimientoInventario();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoMovimientoInventario(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoMovimientoInventario() {
		this.jButtonNuevoEstadoMovimientoInventario.setVisible(this.isPermisoNuevoEstadoMovimientoInventario);			
		this.jButtonDuplicarEstadoMovimientoInventario.setVisible(this.isPermisoDuplicarEstadoMovimientoInventario);			
		this.jButtonCopiarEstadoMovimientoInventario.setVisible(this.isPermisoCopiarEstadoMovimientoInventario);			
		this.jButtonVerFormEstadoMovimientoInventario.setVisible(this.isPermisoVerFormEstadoMovimientoInventario);			
		
		this.jButtonAbrirOrderByEstadoMovimientoInventario.setVisible(this.isPermisoOrdenEstadoMovimientoInventario);					
		
		this.jButtonNuevoRelacionesEstadoMovimientoInventario.setVisible(this.isPermisoNuevoEstadoMovimientoInventario);			
		
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonModificarEstadoMovimientoInventario.setVisible(this.isPermisoActualizarEstadoMovimientoInventario);	
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonActualizarEstadoMovimientoInventario.setVisible(this.isPermisoActualizarEstadoMovimientoInventario);	
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonEliminarEstadoMovimientoInventario.setVisible(this.isPermisoEliminarEstadoMovimientoInventario);
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonCancelarEstadoMovimientoInventario.setVisible(this.isVisibilidadCeldaCancelarEstadoMovimientoInventario);						
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonGuardarCambiosEstadoMovimientoInventario.setVisible(this.isPermisoGuardarCambiosEstadoMovimientoInventario);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoMovimientoInventario.setVisible(this.isPermisoActualizarEstadoMovimientoInventario);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoMovimientoInventario() {
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonModificarEstadoMovimientoInventario.setVisible(this.isPermisoActualizarEstadoMovimientoInventario);	
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonActualizarEstadoMovimientoInventario.setVisible(this.isPermisoActualizarEstadoMovimientoInventario);	
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonEliminarEstadoMovimientoInventario.setVisible(this.isPermisoEliminarEstadoMovimientoInventario);
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonCancelarEstadoMovimientoInventario.setVisible(this.isVisibilidadCeldaCancelarEstadoMovimientoInventario);							
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonGuardarCambiosEstadoMovimientoInventario.setVisible((this.isVisibilidadCeldaGuardarEstadoMovimientoInventario && this.isPermisoGuardarCambiosEstadoMovimientoInventario));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoMovimientoInventario() {
		if(EstadoMovimientoInventarioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoMovimientoInventario();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoMovimientoInventario() {
	}
	
	public void jTableDatosEstadoMovimientoInventarioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoMovimientoInventario(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoMovimientoInventarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadomovimientoinventarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoMovimientoInventario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoMovimientoInventario(this.getestadomovimientoinventario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoMovimientoInventario(this.estadomovimientoinventario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadomovimientoinventario =(EstadoMovimientoInventario) this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadomovimientoinventario =(EstadoMovimientoInventario) this.estadomovimientoinventarios.toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadomovimientoinventario==null) {
						this.estadomovimientoinventario = new EstadoMovimientoInventario();
					}

					this.setVariablesFormularioToObjetoActualEstadoMovimientoInventario(this.estadomovimientoinventario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoMovimientoInventario(this.estadomovimientoinventario);
				}

				if(this.estadomovimientoinventario.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadomovimientoinventario.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoMovimientoInventario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadomovimientoinventarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadomovimientoinventarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadomovimientoinventarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoMovimientoInventarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadomovimientoinventarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoMovimientoInventario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoMovimientoInventario(this.getestadomovimientoinventario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoMovimientoInventario(this.estadomovimientoinventario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadomovimientoinventario =(EstadoMovimientoInventario) this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadomovimientoinventario =(EstadoMovimientoInventario) this.estadomovimientoinventarios.toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadomovimientoinventario==null) {
						this.estadomovimientoinventario = new EstadoMovimientoInventario();
					}

					this.setVariablesFormularioToObjetoActualEstadoMovimientoInventario(this.estadomovimientoinventario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoMovimientoInventario(this.estadomovimientoinventario);
				}

				if(this.estadomovimientoinventario.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadomovimientoinventario.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoMovimientoInventario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadomovimientoinventarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadomovimientoinventarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadomovimientoinventarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoMovimientoInventarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadomovimientoinventarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoMovimientoInventario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoMovimientoInventario(this.getestadomovimientoinventario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoMovimientoInventario(this.estadomovimientoinventario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadomovimientoinventario =(EstadoMovimientoInventario) this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadomovimientoinventario =(EstadoMovimientoInventario) this.estadomovimientoinventarios.toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadomovimientoinventario==null) {
						this.estadomovimientoinventario = new EstadoMovimientoInventario();
					}

					this.setVariablesFormularioToObjetoActualEstadoMovimientoInventario(this.estadomovimientoinventario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoMovimientoInventario(this.estadomovimientoinventario);
				}

				if(this.estadomovimientoinventario.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadomovimientoinventario.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoMovimientoInventario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadomovimientoinventarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadomovimientoinventarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadomovimientoinventarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoMovimientoInventario() {
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) {
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.dispose();
			this.jInternalFrameDetalleFormEstadoMovimientoInventario=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoMovimientoInventario!=null) {
			this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.dispose();
			this.jInternalFrameReporteDinamicoEstadoMovimientoInventario=null;
		}
		
		if(this.jInternalFrameImportacionEstadoMovimientoInventario!=null) {
			this.jInternalFrameImportacionEstadoMovimientoInventario.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoMovimientoInventario.dispose();
			this.jInternalFrameImportacionEstadoMovimientoInventario=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoMovimientoInventario();
			
			EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoMovimientoInventario")) {
				jButtonNuevoEstadoMovimientoInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoMovimientoInventario")) {
				jButtonDuplicarEstadoMovimientoInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoMovimientoInventario")) {
				jButtonCopiarEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoMovimientoInventario")) {
				jButtonVerFormEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoMovimientoInventario")) {
				jButtonNuevoEstadoMovimientoInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoMovimientoInventario")) {
				jButtonDuplicarEstadoMovimientoInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoMovimientoInventario")) {
				jButtonNuevoEstadoMovimientoInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoMovimientoInventario")) {
				jButtonDuplicarEstadoMovimientoInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoMovimientoInventario")) {
				jButtonNuevoEstadoMovimientoInventarioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoMovimientoInventario")) {
				jButtonNuevoEstadoMovimientoInventarioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoMovimientoInventario")) {
				jButtonNuevoEstadoMovimientoInventarioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoMovimientoInventario")) {
				jButtonModificarEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoMovimientoInventario")) {
				jButtonModificarEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoMovimientoInventario")) {
				jButtonModificarEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoMovimientoInventario")) {
				jButtonActualizarEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoMovimientoInventario")) {
				jButtonActualizarEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoMovimientoInventario")) {
				jButtonActualizarEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoMovimientoInventario")) {
				jButtonEliminarEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoMovimientoInventario")) {
				jButtonEliminarEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoMovimientoInventario")) {
				jButtonEliminarEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoMovimientoInventario")) {
				jButtonCancelarEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoMovimientoInventario")) {
				jButtonCancelarEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoMovimientoInventario")) {
				jButtonCancelarEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoMovimientoInventario")) {
				jButtonCerrarEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoMovimientoInventario")) {
				jButtonCerrarEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoMovimientoInventario")) {
				jButtonCerrarEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoMovimientoInventario")) {
				jButtonMostrarOcultarEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoMovimientoInventario")) {
				jButtonCancelarEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoMovimientoInventario")) {
				jButtonGuardarCambiosEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoMovimientoInventario")) {
				jButtonGuardarCambiosEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoMovimientoInventario")) {
				jButtonCopiarEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoMovimientoInventario")) {
				jButtonVerFormEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoMovimientoInventario")) {
				jButtonGuardarCambiosEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoMovimientoInventario")) {
				jButtonCopiarEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoMovimientoInventario")) {
				jButtonVerFormEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoMovimientoInventario")) {
				jButtonGuardarCambiosEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoMovimientoInventario")) {
				jButtonGuardarCambiosEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoMovimientoInventario")) {
				jButtonGuardarCambiosEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoMovimientoInventario")) {
				jButtonRecargarInformacionEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoMovimientoInventario")) {
				jButtonRecargarInformacionEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoMovimientoInventario")) {
				jButtonRecargarInformacionEstadoMovimientoInventarioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoMovimientoInventario")) {
				jButtonAnterioresEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoMovimientoInventario")) {
				jButtonAnterioresEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoMovimientoInventario")) {
				jButtonAnterioresEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoMovimientoInventario")) {
				jButtonSiguientesEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoMovimientoInventario")) {
				jButtonSiguientesEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoMovimientoInventario")) {
				jButtonSiguientesEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoMovimientoInventario") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoMovimientoInventario")) {
				jButtonAbrirOrderByEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoMovimientoInventario") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoMovimientoInventario")) {
				jButtonMostrarOcultarEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoMovimientoInventario")) {
				jButtonNuevoGuardarCambiosEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoMovimientoInventario")) {
				jButtonNuevoGuardarCambiosEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoMovimientoInventario")) {
				jButtonNuevoGuardarCambiosEstadoMovimientoInventarioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoMovimientoInventario")) {
				jButtonCerrarReporteDinamicoEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoMovimientoInventario")) {
				jButtonGenerarReporteDinamicoEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoMovimientoInventario")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoMovimientoInventario")) {
				jButtonCerrarImportacionEstadoMovimientoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoMovimientoInventario")) {
				
				jButtonGenerarImportacionEstadoMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoMovimientoInventario")) {
				
				jButtonAbrirImportacionEstadoMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoMovimientoInventario")) {
				jComboBoxTiposAccionesEstadoMovimientoInventarioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoMovimientoInventario")) {
				jComboBoxTiposRelacionesEstadoMovimientoInventarioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoMovimientoInventario")) {
				jComboBoxTiposAccionesEstadoMovimientoInventarioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoMovimientoInventario")) {
				
				jComboBoxTiposSeleccionarEstadoMovimientoInventarioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoMovimientoInventario")) {
				jTextFieldValorCampoGeneralEstadoMovimientoInventarioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoMovimientoInventario")) {
				jButtonAbrirOrderByEstadoMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoMovimientoInventario")) {
				jButtonAbrirOrderByEstadoMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoMovimientoInventario")) {
				jButtonCerrarOrderByEstadoMovimientoInventarioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoMovimientoInventarioBusqueda")) {
				this.jButtonidEstadoMovimientoInventarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoMovimientoInventarioBusqueda")) {
				this.jButtoncodigoEstadoMovimientoInventarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoMovimientoInventarioBusqueda")) {
				this.jButtonnombreEstadoMovimientoInventarioBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoMovimientoInventario();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoMovimientoInventarioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadomovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadomovimientoinventario);
				
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
				
				


				
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoMovimientoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoMovimientoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoMovimientoInventario estadomovimientoinventarioLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadomovimientoinventarioLocal=this.estadomovimientoinventario;
			} else {
				estadomovimientoinventarioLocal=this.estadomovimientoinventarioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadomovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadomovimientoinventario);
				
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
							
				
				


				
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoMovimientoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoMovimientoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoMovimientoInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoMovimientoInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadomovimientoinventarioAnterior =(EstadoMovimientoInventario) this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadomovimientoinventarioAnterior =(EstadoMovimientoInventario) this.estadomovimientoinventarios.toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
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
			
			EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
			
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
			
			


			
			EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoMovimientoInventarioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadomovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadomovimientoinventario);
				
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
								
						
				


				
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoMovimientoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoMovimientoInventario.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadomovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadomovimientoinventario);
				
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
								
				
				


				
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoMovimientoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoMovimientoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoMovimientoInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoMovimientoInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadomovimientoinventarioAnterior =(EstadoMovimientoInventario) this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadomovimientoinventarioAnterior =(EstadoMovimientoInventario) this.estadomovimientoinventarios.toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadomovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadomovimientoinventario);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoMovimientoInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoMovimientoInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadomovimientoinventarioAnterior =(EstadoMovimientoInventario) this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadomovimientoinventarioAnterior =(EstadoMovimientoInventario) this.estadomovimientoinventarios.toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoMovimientoInventarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadomovimientoinventario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadomovimientoinventario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadomovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadomovimientoinventario);
				
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
							
				
				


				
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoMovimientoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoMovimientoInventario.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoMovimientoInventarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoMovimientoInventario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadomovimientoinventarioAnterior =(EstadoMovimientoInventario) this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadomovimientoinventarioAnterior =(EstadoMovimientoInventario) this.estadomovimientoinventarios.toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
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
			
			EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
			
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
			
			


			
			EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoMovimientoInventarioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadomovimientoinventario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadomovimientoinventario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadomovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadomovimientoinventario);
				
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
								
				
				


				
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoMovimientoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoMovimientoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoMovimientoInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoMovimientoInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadomovimientoinventarioAnterior =(EstadoMovimientoInventario) this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadomovimientoinventarioAnterior =(EstadoMovimientoInventario) this.estadomovimientoinventarios.toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoMovimientoInventarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadomovimientoinventario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadomovimientoinventario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoMovimientoInventarioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadomovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadomovimientoinventario);
				
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoMovimientoInventario")) {
					jCheckBoxSeleccionarTodosEstadoMovimientoInventarioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoMovimientoInventario")) {
					jCheckBoxSeleccionadosEstadoMovimientoInventarioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoMovimientoInventario")) {
					
				}
				
				


				
				
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoMovimientoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoMovimientoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadomovimientoinventario);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadomovimientoinventario);
				
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
												
				
				


				
				
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoMovimientoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoMovimientoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoMovimientoInventarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoMovimientoInventario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadomovimientoinventarioAnterior =(EstadoMovimientoInventario) this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadomovimientoinventarioAnterior =(EstadoMovimientoInventario) this.estadomovimientoinventarios.toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoMovimientoInventarioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadomovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadomovimientoinventario);
				
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
				
				
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
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
			
			EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
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
			
			


			
			EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoMovimientoInventarioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadomovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadomovimientoinventario);
				
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoMovimientoInventario.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoMovimientoInventario.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadomovimientoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadomovimientoinventario);
				
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
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
				
				


				
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoMovimientoInventario.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoMovimientoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoMovimientoInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoMovimientoInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadomovimientoinventarioAnterior =(EstadoMovimientoInventario) this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadomovimientoinventarioAnterior =(EstadoMovimientoInventario) this.estadomovimientoinventarios.toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoMovimientoInventario")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoMovimientoInventarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoMovimientoInventario.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadomovimientoinventario =(EstadoMovimientoInventario) this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadomovimientoinventario =(EstadoMovimientoInventario) this.estadomovimientoinventarios.toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadomovimientoinventario);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoMovimientoInventario")) {
				
				}
				
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoMovimientoInventario")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoMovimientoInventario.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoMovimientoInventario")) {
			
			}
			
			EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoMovimientoInventario();
			
			EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoMovimientoInventario")) {
				jButtonNuevoEstadoMovimientoInventarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoMovimientoInventario")) {
				jButtonDuplicarEstadoMovimientoInventarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoMovimientoInventario")) {
				jButtonCopiarEstadoMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoMovimientoInventario")) {
				jButtonVerFormEstadoMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoMovimientoInventario")) {
				jButtonNuevoEstadoMovimientoInventarioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoMovimientoInventario")) {
				jButtonModificarEstadoMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoMovimientoInventario")) {
				jButtonActualizarEstadoMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoMovimientoInventario")) {
				jButtonEliminarEstadoMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoMovimientoInventario")) {
				jButtonGuardarCambiosEstadoMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoMovimientoInventario")) {
				jButtonCancelarEstadoMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoMovimientoInventario")) {
				jButtonCerrarEstadoMovimientoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoMovimientoInventario")) {
				jButtonGuardarCambiosEstadoMovimientoInventarioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoMovimientoInventario")) {
				jButtonNuevoGuardarCambiosEstadoMovimientoInventarioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoMovimientoInventario")) {
				jButtonAbrirOrderByEstadoMovimientoInventarioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoMovimientoInventario")) {
				jButtonRecargarInformacionEstadoMovimientoInventarioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoMovimientoInventario")) {
				jButtonAnterioresEstadoMovimientoInventarioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoMovimientoInventario")) {
				jButtonSiguientesEstadoMovimientoInventarioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoMovimientoInventarioBusqueda")) {
				this.jButtonidEstadoMovimientoInventarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoMovimientoInventarioBusqueda")) {
				this.jButtoncodigoEstadoMovimientoInventarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoMovimientoInventarioBusqueda")) {
				this.jButtonnombreEstadoMovimientoInventarioBusquedaActionPerformed(evt);
			}
			
			EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoMovimientoInventario();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoMovimientoInventario")) {
				closingInternalFrameEstadoMovimientoInventario();
				
			} else if(sTipo.equals("jButtonCancelarEstadoMovimientoInventario")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoMovimientoInventario = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoMovimientoInventarioBeanSwingJInternalFrame jInternalFrameParent=(EstadoMovimientoInventarioBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoMovimientoInventario.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoMovimientoInventarioActionPerformed(null);
			}
			
			EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadomovimientoinventario,new Object(),this.estadomovimientoinventarioParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoMovimientoInventario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoMovimientoInventario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoMovimientoInventario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadomovimientoinventario)) {
			if(!esControlTabla) {
				if(EstadoMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoMovimientoInventario(this.estadomovimientoinventario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoMovimientoInventario(this.estadomovimientoinventario);			
				}
				
				if(this.estadomovimientoinventarioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoMovimientoInventario(this.estadomovimientoinventario,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadomovimientoinventarioReturnGeneral=estadomovimientoinventarioLogic.procesarEventosEstadoMovimientoInventariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios(),this.estadomovimientoinventario,this.estadomovimientoinventarioParameterGeneral,this.isEsNuevoEstadoMovimientoInventario,classes);//this.estadomovimientoinventarioLogic.getEstadoMovimientoInventario()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoMovimientoInventario(this.estadomovimientoinventarioReturnGeneral,this.estadomovimientoinventarioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadomovimientoinventarioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoMovimientoInventario(classes,this.estadomovimientoinventarioReturnGeneral,this.estadomovimientoinventarioBean,false);
					}
						
					if(this.estadomovimientoinventarioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoMovimientoInventario(this.estadomovimientoinventarioReturnGeneral.getEstadoMovimientoInventario());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoMovimientoInventario(this.estadomovimientoinventarioReturnGeneral.getEstadoMovimientoInventario());	
					}
						
					if(this.estadomovimientoinventarioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoMovimientoInventario(this.estadomovimientoinventarioReturnGeneral.getEstadoMovimientoInventario(),classes);//this.estadomovimientoinventarioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoMovimientoInventario(this.estadomovimientoinventario,classes);//this.estadomovimientoinventarioBean);									
				}
			
				if(EstadoMovimientoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoMovimientoInventario(this.estadomovimientoinventario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoMovimientoInventario(this.estadomovimientoinventario);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadomovimientoinventarioAnterior!=null) {
						this.estadomovimientoinventario=this.estadomovimientoinventarioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadomovimientoinventarioReturnGeneral=estadomovimientoinventarioLogic.procesarEventosEstadoMovimientoInventariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios(),this.estadomovimientoinventario,this.estadomovimientoinventarioParameterGeneral,this.isEsNuevoEstadoMovimientoInventario,classes);//this.estadomovimientoinventarioLogic.getEstadoMovimientoInventario()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadomovimientoinventarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadomovimientoinventarioReturnGeneral.getEstadoMovimientoInventario(),estadomovimientoinventarioLogic.getEstadoMovimientoInventarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadomovimientoinventarioReturnGeneral.getEstadoMovimientoInventario(),this.estadomovimientoinventarios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoMovimientoInventario.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoMovimientoInventario.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoMovimientoInventario();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoMovimientoInventario() throws Exception {
		
		EstadoMovimientoInventarioModel estadomovimientoinventarioModel=(EstadoMovimientoInventarioModel)this.jTableDatosEstadoMovimientoInventario.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadomovimientoinventarioModel.estadomovimientoinventarios=this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadomovimientoinventarioModel.estadomovimientoinventarios=this.estadomovimientoinventarios;
		}
		
		
		((EstadoMovimientoInventarioModel) this.jTableDatosEstadoMovimientoInventario.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoMovimientoInventario() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadomovimientoinventarioAnterior(),this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadomovimientoinventarioAnterior(),this.estadomovimientoinventarios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoMovimientoInventario();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoMovimientoInventario(EstadoMovimientoInventario estadomovimientoinventario,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(MovimientoInventario.class)) {
					this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventarioLogic.setMovimientoInventarios(estadomovimientoinventario.getMovimientoInventarios());
					this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaMovimientoInventario(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
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
										
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadomovimientoinventario,new Object(),generalEntityParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadomovimientoinventarioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoMovimientoInventarioConstantesFunciones.getClassesRelationshipsOfEstadoMovimientoInventario(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoMovimientoInventarioConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoMovimientoInventario(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoMovimientoInventario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadomovimientoinventario,new Object(),generalEntityParameterGeneral,this.estadomovimientoinventarioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoMovimientoInventario(EstadoMovimientoInventarioBean estadomovimientoinventarioBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(MovimientoInventario.class)) {
					this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventarioLogic.setMovimientoInventarios(estadomovimientoinventario.getMovimientoInventarios());
					this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaMovimientoInventario(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoMovimientoInventario(ArrayList<Classe> classes,EstadoMovimientoInventarioReturnGeneral estadomovimientoinventarioReturnGeneral,EstadoMovimientoInventarioBean estadomovimientoinventarioBean,Boolean conDefault) throws Exception {
		
			this.estadomovimientoinventarioBean.setMovimientoInventarios(estadomovimientoinventarioReturnGeneral.getEstadoMovimientoInventario().getMovimientoInventarios());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoMovimientoInventario(EstadoMovimientoInventario estadomovimientoinventario,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(MovimientoInventario.class)) {
					estadomovimientoinventario.setMovimientoInventarios(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioBeanSwingJInternalFrame.movimientoinventarioLogic.getMovimientoInventarios());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadomovimientoinventario)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoMovimientoInventario = new EstadoMovimientoInventarioDetalleFormJInternalFrame(jDesktopPane,this.estadomovimientoinventarioSessionBean.getConGuardarRelaciones(),this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoMovimientoInventario);
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.setVisible(false);
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.estadomovimientoinventarioLogic=this.estadomovimientoinventarioLogic;
		
		this.cargarCombosFrameForeignKeyEstadoMovimientoInventario("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoMovimientoInventario();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoMovimientoInventario();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoMovimientoInventario("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoMovimientoInventario();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoMovimientoInventario"));
		
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonModificarEstadoMovimientoInventario.addActionListener(new ButtonActionListener(this,"ModificarEstadoMovimientoInventario"));

		
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonModificarToolBarEstadoMovimientoInventario.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoMovimientoInventario"));
					
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jMenuItemModificarEstadoMovimientoInventario.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoMovimientoInventario"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonActualizarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"ActualizarEstadoMovimientoInventario"));
		
		
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonActualizarToolBarEstadoMovimientoInventario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoMovimientoInventario"));
						
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jMenuItemActualizarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoMovimientoInventario"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonEliminarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"EliminarEstadoMovimientoInventario"));
		
		
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonEliminarToolBarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoMovimientoInventario"));
								
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jMenuItemEliminarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoMovimientoInventario"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonCancelarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"CancelarEstadoMovimientoInventario"));
		
		
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonCancelarToolBarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoMovimientoInventario"));
					
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jMenuItemCancelarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoMovimientoInventario"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jMenuItemDetalleCerrarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoMovimientoInventario"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonGuardarCambiosToolBarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoMovimientoInventario"));
		
		
		
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonGuardarCambiosToolBarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoMovimientoInventario"));
		
		
		
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoMovimientoInventario"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonidEstadoMovimientoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoMovimientoInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtoncodigoEstadoMovimientoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoMovimientoInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonnombreEstadoMovimientoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoMovimientoInventarioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTabbedPaneRelacionesEstadoMovimientoInventario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoMovimientoInventario"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoMovimientoInventario"));
		
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoMovimientoInventario"));
		}
		
		this.jTableDatosEstadoMovimientoInventario.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoMovimientoInventario"));
		
		this.jTableDatosEstadoMovimientoInventario.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoMovimientoInventario"));
		
		this.jButtonNuevoEstadoMovimientoInventario.addActionListener(new ButtonActionListener(this,"NuevoEstadoMovimientoInventario"));
		
		this.jButtonDuplicarEstadoMovimientoInventario.addActionListener(new ButtonActionListener(this,"DuplicarEstadoMovimientoInventario"));
		
		this.jButtonCopiarEstadoMovimientoInventario.addActionListener(new ButtonActionListener(this,"CopiarEstadoMovimientoInventario"));
		
		this.jButtonVerFormEstadoMovimientoInventario.addActionListener(new ButtonActionListener(this,"VerFormEstadoMovimientoInventario"));
		
		
		this.jButtonNuevoToolBarEstadoMovimientoInventario.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoMovimientoInventario"));
			
		this.jButtonDuplicarToolBarEstadoMovimientoInventario.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoMovimientoInventario"));
			
		this.jMenuItemNuevoEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoMovimientoInventario"));
			
		this.jMenuItemDuplicarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoMovimientoInventario"));		
		
		
		this.jButtonNuevoRelacionesEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoMovimientoInventario"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoMovimientoInventario.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoMovimientoInventario"));
			
		this.jMenuItemNuevoRelacionesEstadoMovimientoInventario.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoMovimientoInventario"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonModificarEstadoMovimientoInventario.addActionListener(new ButtonActionListener(this,"ModificarEstadoMovimientoInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonModificarToolBarEstadoMovimientoInventario.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoMovimientoInventario"));
			
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jMenuItemModificarEstadoMovimientoInventario.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoMovimientoInventario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonActualizarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"ActualizarEstadoMovimientoInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonActualizarToolBarEstadoMovimientoInventario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoMovimientoInventario"));
				
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jMenuItemActualizarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoMovimientoInventario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonEliminarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"EliminarEstadoMovimientoInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonEliminarToolBarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoMovimientoInventario"));
						
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jMenuItemEliminarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoMovimientoInventario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonCancelarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"CancelarEstadoMovimientoInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonCancelarToolBarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoMovimientoInventario"));
			
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jMenuItemCancelarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoMovimientoInventario"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoMovimientoInventario"));		
		
		
		this.jButtonCerrarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"CerrarEstadoMovimientoInventario"));
		
		
		this.jButtonCerrarToolBarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoMovimientoInventario"));
			
		this.jMenuItemCerrarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoMovimientoInventario"));
			
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jMenuItemDetalleCerrarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoMovimientoInventario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonGuardarCambiosEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoMovimientoInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonGuardarCambiosToolBarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoMovimientoInventario"));
		}
		
		this.jButtonCopiarToolBarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoMovimientoInventario"));
			
		this.jButtonVerFormToolBarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoMovimientoInventario"));
		
		this.jMenuItemGuardarCambiosEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoMovimientoInventario"));
			
		this.jMenuItemCopiarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoMovimientoInventario"));		
		
		this.jMenuItemVerFormEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoMovimientoInventario"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoMovimientoInventario"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoMovimientoInventario"));
			
		this.jMenuItemGuardarCambiosTablaEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoMovimientoInventario"));		
		
		
		
		this.jButtonRecargarInformacionEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoMovimientoInventario"));
					
		this.jButtonRecargarInformacionToolBarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoMovimientoInventario"));
		
		this.jMenuItemRecargarInformacionEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoMovimientoInventario"));		
		
		
		
		this.jButtonAnterioresEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"AnterioresEstadoMovimientoInventario"));
		
		
		this.jButtonAnterioresToolBarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoMovimientoInventario"));
		
		this.jMenuItemAnterioresEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoMovimientoInventario"));		
		
		
		this.jButtonSiguientesEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"SiguientesEstadoMovimientoInventario"));
		
		
		this.jButtonSiguientesToolBarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoMovimientoInventario"));
			
		this.jMenuItemSiguientesEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoMovimientoInventario"));
			
		this.jMenuItemAbrirOrderByEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoMovimientoInventario"));
			
		this.jMenuItemMostrarOcultarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoMovimientoInventario"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoMovimientoInventario"));
			
		this.jMenuItemDetalleMostarOcultarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoMovimientoInventario"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoMovimientoInventario"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoMovimientoInventario"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoMovimientoInventario"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoMovimientoInventario.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoMovimientoInventario"));

		this.jCheckBoxSeleccionadosEstadoMovimientoInventario.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoMovimientoInventario"));
		
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoMovimientoInventario"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoMovimientoInventario"));
			
		this.jComboBoxTiposAccionesEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoMovimientoInventario"));
					
		this.jComboBoxTiposSeleccionarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoMovimientoInventario"));
			
		this.jTextFieldValorCampoGeneralEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoMovimientoInventario"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonidEstadoMovimientoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoMovimientoInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtoncodigoEstadoMovimientoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoMovimientoInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonnombreEstadoMovimientoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoMovimientoInventarioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoMovimientoInventario!=null) {
				this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoMovimientoInventario"));
				this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoMovimientoInventario"));
				this.jInternalFrameReporteDinamicoEstadoMovimientoInventario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoMovimientoInventario"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoMovimientoInventario"));				
			//this.jButtonGenerarReporteDinamicoEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoMovimientoInventario"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoMovimientoInventario"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoMovimientoInventario!=null) {
				this.jInternalFrameImportacionEstadoMovimientoInventario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoMovimientoInventario"));
				this.jInternalFrameImportacionEstadoMovimientoInventario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoMovimientoInventario"));
				this.jInternalFrameImportacionEstadoMovimientoInventario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoMovimientoInventario"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoMovimientoInventario"));
			
			this.jButtonAbrirOrderByToolBarEstadoMovimientoInventario.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoMovimientoInventario"));			
			
			if(this.jInternalFrameOrderByEstadoMovimientoInventario!=null) {
				this.jInternalFrameOrderByEstadoMovimientoInventario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoMovimientoInventario"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTabbedPaneRelacionesEstadoMovimientoInventario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoMovimientoInventario"));
		
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
            		closingInternalFrameEstadoMovimientoInventario();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoMovimientoInventario = (JInternalFrameBase)event.getSource();
	            	
	            EstadoMovimientoInventarioBeanSwingJInternalFrame jInternalFrameParent=(EstadoMovimientoInventarioBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoMovimientoInventario.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoMovimientoInventarioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoMovimientoInventario.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoMovimientoInventarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoMovimientoInventario.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoMovimientoInventario.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoMovimientoInventarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoMovimientoInventarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoMovimientoInventarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoMovimientoInventario";
		inputMap = this.jButtonNuevoEstadoMovimientoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoMovimientoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoMovimientoInventarioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoMovimientoInventarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoMovimientoInventarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoMovimientoInventarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoMovimientoInventario";
		inputMap = this.jButtonNuevoRelacionesEstadoMovimientoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoMovimientoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoMovimientoInventarioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoMovimientoInventario";
		inputMap = this.jButtonModificarEstadoMovimientoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoMovimientoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoMovimientoInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoMovimientoInventario";
		inputMap = this.jButtonActualizarEstadoMovimientoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoMovimientoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoMovimientoInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoMovimientoInventario";
		inputMap = this.jButtonEliminarEstadoMovimientoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoMovimientoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoMovimientoInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoMovimientoInventario";
		inputMap = this.jButtonCancelarEstadoMovimientoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoMovimientoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoMovimientoInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoMovimientoInventario";
		inputMap = this.jButtonCerrarEstadoMovimientoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoMovimientoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoMovimientoInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonGuardarCambiosEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoMovimientoInventario";
		inputMap = this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonGuardarCambiosEstadoMovimientoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonGuardarCambiosEstadoMovimientoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoMovimientoInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoMovimientoInventario.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoMovimientoInventarioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoMovimientoInventario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoMovimientoInventarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoMovimientoInventario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoMovimientoInventarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoMovimientoInventario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoMovimientoInventarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonidEstadoMovimientoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoMovimientoInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtoncodigoEstadoMovimientoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoMovimientoInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jButtonnombreEstadoMovimientoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoMovimientoInventarioBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoMovimientoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoMovimientoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoMovimientoInventarioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoMovimientoInventario.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoMovimientoInventario(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoMovimientoInventario estadomovimientoinventarioAux:this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios()) {
					estadomovimientoinventarioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoMovimientoInventario estadomovimientoinventarioAux:estadomovimientoinventarios) {
					estadomovimientoinventarioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoMovimientoInventarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoMovimientoInventario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoMovimientoInventario estadomovimientoinventarioAux:this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios()) {
						estadomovimientoinventarioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoMovimientoInventario estadomovimientoinventarioAux:estadomovimientoinventarios) {
						estadomovimientoinventarioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoMovimientoInventario estadomovimientoinventarioAux:this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoMovimientoInventario estadomovimientoinventarioAux:estadomovimientoinventarios) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoMovimientoInventario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoMovimientoInventario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoMovimientoInventario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoMovimientoInventario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoMovimientoInventarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoMovimientoInventario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoMovimientoInventario.getSelectedRows();
			
			EstadoMovimientoInventario estadomovimientoinventarioLocal=new EstadoMovimientoInventario();
			
			//this.seleccionarTodosEstadoMovimientoInventario(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadomovimientoinventarioLocal =(EstadoMovimientoInventario) this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios().toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadomovimientoinventarioLocal =(EstadoMovimientoInventario) this.estadomovimientoinventarios.toArray()[this.jTableDatosEstadoMovimientoInventario.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadomovimientoinventarioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoMovimientoInventario estadomovimientoinventarioAux:this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios()) {
						estadomovimientoinventarioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoMovimientoInventario estadomovimientoinventarioAux:estadomovimientoinventarios) {
						estadomovimientoinventarioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoMovimientoInventario(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoMovimientoInventario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoMovimientoInventario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoMovimientoInventario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoMovimientoInventarioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoMovimientoInventarioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoMovimientoInventarioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoMovimientoInventario(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoMovimientoInventario.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoMovimientoInventario estadomovimientoinventarioAux:this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios()) {
				
						if(sTipoSeleccionar.equals(EstadoMovimientoInventarioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadomovimientoinventarioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoMovimientoInventarioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadomovimientoinventarioAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoMovimientoInventario estadomovimientoinventarioAux:estadomovimientoinventarios) {
					
						if(sTipoSeleccionar.equals(EstadoMovimientoInventarioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadomovimientoinventarioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoMovimientoInventarioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadomovimientoinventarioAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoMovimientoInventario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoMovimientoInventarioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoMovimientoInventario(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoMovimientoInventario=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoMovimientoInventario.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoMovimientoInventario.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoMovimientoInventario) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoMovimientoInventario(conSplash);
				
					this.generarReporteEstadoMovimientoInventariosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoMovimientoInventario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoMovimientoInventario.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoMovimientoInventariosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoMovimientoInventario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoMovimientoInventariosSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoMovimientoInventario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoMovimientoInventariosSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoMovimientoInventario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoMovimientoInventario();
				
				this.exportarEstadoMovimientoInventariosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoMovimientoInventario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoMovimientoInventario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoMovimientoInventarios();
				//this.importarEstadoMovimientoInventarios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoMovimientoInventario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoMovimientoInventario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoMovimientoInventario();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoMovimientoInventariosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoMovimientoInventario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Movimiento Inventario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoMovimientoInventario();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoMovimientoInventario)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoMovimientoInventario(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Movimiento Inventario",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoMovimientoInventario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoMovimientoInventario.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadoMovimientoInventarioBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadoMovimientoInventario) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadoMovimientoInventario(conSplash);
					
						//this.actualizarParametrosGeneralEstadoMovimientoInventario();
						
						this.generarReporteProcesoAccionEstadoMovimientoInventariosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadoMovimientoInventario.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadoMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoMovimientoInventario.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estado Movimiento InventarioS SELECCIONADOS?", "MANTENIMIENTO DE Estado Movimiento Inventario", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadoMovimientoInventario();
				
						this.actualizarParametrosGeneralEstadoMovimientoInventario();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadomovimientoinventarioReturnGeneral=estadomovimientoinventarioLogic.procesarAccionEstadoMovimientoInventariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios(),this.estadomovimientoinventarioParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadoMovimientoInventarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoMovimientoInventario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoMovimientoInventario.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoMovimientoInventario();
					
					EstadoMovimientoInventarioBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadoMovimientoInventarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoMovimientoInventario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoMovimientoInventario.jComboBoxTiposAccionesFormularioEstadoMovimientoInventario.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoMovimientoInventario(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoMovimientoInventarioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoMovimientoInventario();
			
			if(this.jInternalFrameDetalleFormEstadoMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoMovimientoInventario> estadomovimientoinventariosSeleccionados=new ArrayList<EstadoMovimientoInventario>();		
			EstadoMovimientoInventario estadomovimientoinventario=new EstadoMovimientoInventario();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoMovimientoInventario(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoMovimientoInventario.getSelectedItem();
			
			
			
			
			estadomovimientoinventariosSeleccionados=this.getEstadoMovimientoInventariosSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadomovimientoinventariosSeleccionados.size()==1) {
				for(EstadoMovimientoInventario estadomovimientoinventarioAux:estadomovimientoinventariosSeleccionados) {
					estadomovimientoinventario=estadomovimientoinventarioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Movimiento Inventario")) {
					jButtonMovimientoInventarioActionPerformed(null,rowIndex,true,false,estadomovimientoinventario);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoMovimientoInventario();
			
      		//this.finishProcessEstadoMovimientoInventario(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoMovimientoInventarioReturnGeneral() throws Exception {
		if(this.estadomovimientoinventarioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadomovimientoinventarioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadomovimientoinventarioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadomovimientoinventarioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadomovimientoinventarioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadomovimientoinventarioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoMovimientoInventario(false);
		}
		
		if(this.estadomovimientoinventarioReturnGeneral.getConRetornoLista() || this.estadomovimientoinventarioReturnGeneral.getConRetornoObjeto()) {
			if(this.estadomovimientoinventarioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadomovimientoinventarioLogic.setEstadoMovimientoInventarios(this.estadomovimientoinventarioReturnGeneral.getEstadoMovimientoInventarios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadomovimientoinventarioReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadomovimientoinventarioLogic.setEstadoMovimientoInventario(this.estadomovimientoinventarioReturnGeneral.getEstadoMovimientoInventario());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoMovimientoInventario(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoMovimientoInventario() throws Exception {
		
		
	}
	
	public ArrayList<EstadoMovimientoInventario> getEstadoMovimientoInventariosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoMovimientoInventario> estadomovimientoinventariosSeleccionados=new ArrayList<EstadoMovimientoInventario>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoMovimientoInventario) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoMovimientoInventario estadomovimientoinventarioAux:estadomovimientoinventarioLogic.getEstadoMovimientoInventarios()) {
					if(estadomovimientoinventarioAux.getIsSelected()) {
						estadomovimientoinventariosSeleccionados.add(estadomovimientoinventarioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoMovimientoInventario estadomovimientoinventarioAux:this.estadomovimientoinventarios) {
					if(estadomovimientoinventarioAux.getIsSelected()) {
						estadomovimientoinventariosSeleccionados.add(estadomovimientoinventarioAux);				
					}
				}
			}
			
			if(estadomovimientoinventariosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadomovimientoinventariosSeleccionados.addAll(this.estadomovimientoinventarioLogic.getEstadoMovimientoInventarios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadomovimientoinventariosSeleccionados.addAll(this.estadomovimientoinventarios);				
					}
				}
			}
		} else {
			estadomovimientoinventariosSeleccionados.add(this.estadomovimientoinventario);
		}
		
		return estadomovimientoinventariosSeleccionados;
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
	
	public void generarReporteEstadoMovimientoInventariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoMovimientoInventariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoMovimientoInventariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoMovimientoInventariosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoMovimientoInventariosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoMovimientoInventariosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Movimiento Inventario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoMovimientoInventariosSeleccionados() throws Exception {
		ArrayList<EstadoMovimientoInventario> estadomovimientoinventariosSeleccionados=new ArrayList<EstadoMovimientoInventario>();		
		
		estadomovimientoinventariosSeleccionados=this.getEstadoMovimientoInventariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoMovimientoInventarios("Todos",estadomovimientoinventariosSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoMovimientoInventariosSeleccionados() throws Exception {
		ArrayList<EstadoMovimientoInventario> estadomovimientoinventariosSeleccionados=new ArrayList<EstadoMovimientoInventario>();		
		
		estadomovimientoinventariosSeleccionados=this.getEstadoMovimientoInventariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoMovimientoInventarios("Todos",estadomovimientoinventariosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoMovimientoInventariosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoMovimientoInventario> estadomovimientoinventariosSeleccionados=new ArrayList<EstadoMovimientoInventario>();
		
		estadomovimientoinventariosSeleccionados=this.getEstadoMovimientoInventariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoMovimientoInventarios("Todos",estadomovimientoinventariosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoMovimientoInventariosSeleccionados() throws Exception {
		ArrayList<EstadoMovimientoInventario> estadomovimientoinventariosSeleccionados=new ArrayList<EstadoMovimientoInventario>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoMovimientoInventario();
		
		
		estadomovimientoinventariosSeleccionados=this.getEstadoMovimientoInventariosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoMovimientoInventario();
		
		
		//this.generarReporteEstadoMovimientoInventarios("Todos",estadomovimientoinventariosSeleccionados ,estadomovimientoinventarioImplementable,estadomovimientoinventarioImplementableHome);
	}
	
	public void mostrarImportacionEstadoMovimientoInventarios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoMovimientoInventario();
		
		this.abrirFrameImportacionEstadoMovimientoInventario();		
		
			
		//this.generarReporteEstadoMovimientoInventarios("Todos",estadomovimientoinventariosSeleccionados ,estadomovimientoinventarioImplementable,estadomovimientoinventarioImplementableHome);
	}
	
	public void importarEstadoMovimientoInventarios() throws Exception {		
	
	}
	
	public void exportarEstadoMovimientoInventariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoMovimientoInventariosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoMovimientoInventariosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoMovimientoInventariosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Movimiento Inventario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoMovimientoInventariosSeleccionados() throws Exception {
		ArrayList<EstadoMovimientoInventario> estadomovimientoinventariosSeleccionados=new ArrayList<EstadoMovimientoInventario>();		
		
		estadomovimientoinventariosSeleccionados=this.getEstadoMovimientoInventariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadomovimientoinventario."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoMovimientoInventario(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoMovimientoInventario estadomovimientoinventarioAux:estadomovimientoinventariosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoMovimientoInventario(estadomovimientoinventarioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadomovimientoinventarioAux.setsDetalleGeneralEntityReporte(estadomovimientoinventarioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Movimiento Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoMovimientoInventario(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoMovimientoInventarioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoMovimientoInventarioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoMovimientoInventarioConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoMovimientoInventarioConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoMovimientoInventario(EstadoMovimientoInventario estadomovimientoinventario,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadomovimientoinventario.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadomovimientoinventario.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadomovimientoinventario.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadomovimientoinventario.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoMovimientoInventariosSeleccionados() throws Exception {
		ArrayList<EstadoMovimientoInventario> estadomovimientoinventariosSeleccionados=new ArrayList<EstadoMovimientoInventario>();		
		
		estadomovimientoinventariosSeleccionados=this.getEstadoMovimientoInventariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadomovimientoinventario.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoMovimientoInventarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoMovimientoInventario(row);				
				iRow++;
			}				
			
			for(EstadoMovimientoInventario estadomovimientoinventarioAux:estadomovimientoinventariosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoMovimientoInventario(estadomovimientoinventarioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Movimiento Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoMovimientoInventariosSeleccionados() throws Exception {
		ArrayList<EstadoMovimientoInventario> estadomovimientoinventariosSeleccionados=new ArrayList<EstadoMovimientoInventario>();		
		
		estadomovimientoinventariosSeleccionados=this.getEstadoMovimientoInventariosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadomovimientoinventario.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadomovimientoinventarios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadomovimientoinventario");
			//elementRoot.appendChild(element);
		
			for(EstadoMovimientoInventario estadomovimientoinventarioAux:estadomovimientoinventariosSeleccionados) {
				element = document.createElement("estadomovimientoinventario");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoMovimientoInventario(estadomovimientoinventarioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Movimiento Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoMovimientoInventario(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoMovimientoInventarioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoMovimientoInventarioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoMovimientoInventarioConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoMovimientoInventarioConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoMovimientoInventario(EstadoMovimientoInventario estadomovimientoinventario,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadomovimientoinventario.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadomovimientoinventario.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadomovimientoinventario.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoMovimientoInventario(EstadoMovimientoInventario estadomovimientoinventario,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoMovimientoInventarioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadomovimientoinventario.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoMovimientoInventarioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadomovimientoinventario.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoMovimientoInventarioConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadomovimientoinventario.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoMovimientoInventarioConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadomovimientoinventario.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoMovimientoInventariosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoMovimientoInventario> estadomovimientoinventariosSeleccionados=new ArrayList<EstadoMovimientoInventario>();
		
		estadomovimientoinventariosSeleccionados=this.getEstadoMovimientoInventariosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoMovimientoInventario(estadomovimientoinventariosSeleccionados);
		
		this.generarReporteEstadoMovimientoInventarios("Todos",estadomovimientoinventariosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoMovimientoInventario(ArrayList<EstadoMovimientoInventario> estadomovimientoinventariosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoMovimientoInventario estadomovimientoinventarioAux:estadomovimientoinventariosSeleccionados) {
				estadomovimientoinventarioAux.setsDetalleGeneralEntityReporte(estadomovimientoinventarioAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoMovimientoInventarioConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadomovimientoinventarioAux.setsDescripcionGeneralEntityReporte1(estadomovimientoinventarioAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoMovimientoInventarioConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadomovimientoinventarioAux.setsDescripcionGeneralEntityReporte1(estadomovimientoinventarioAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoMovimientoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoMovimientoInventario(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoMovimientoInventario=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoMovimientoInventario=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoMovimientoInventario=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaActualizarEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaEliminarEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaCancelarEstadoMovimientoInventario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoMovimientoInventario=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoMovimientoInventario=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaModificarEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaActualizarEstadoMovimientoInventario=true;
			this.isVisibilidadCeldaEliminarEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaCancelarEstadoMovimientoInventario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoMovimientoInventario=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoMovimientoInventario=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaModificarEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaActualizarEstadoMovimientoInventario=true;
			this.isVisibilidadCeldaEliminarEstadoMovimientoInventario=true;
			this.isVisibilidadCeldaCancelarEstadoMovimientoInventario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoMovimientoInventario=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoMovimientoInventario=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaModificarEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaActualizarEstadoMovimientoInventario=true;
			this.isVisibilidadCeldaEliminarEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaCancelarEstadoMovimientoInventario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoMovimientoInventario=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoMovimientoInventario=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoMovimientoInventario=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoMovimientoInventario=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoMovimientoInventario=true;
			this.isVisibilidadCeldaModificarEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaActualizarEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaEliminarEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaCancelarEstadoMovimientoInventario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoMovimientoInventario=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoMovimientoInventario=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaActualizarEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaEliminarEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaCancelarEstadoMovimientoInventario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoMovimientoInventario=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoMovimientoInventario=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaModificarEstadoMovimientoInventario=true;
			this.isVisibilidadCeldaActualizarEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaEliminarEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaCancelarEstadoMovimientoInventario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoMovimientoInventario=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoMovimientoInventario=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoMovimientoInventarioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoMovimientoInventario=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoMovimientoInventario=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoMovimientoInventario=true;
		} else {
			this.actualizarEstadoPanelsEstadoMovimientoInventario(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoMovimientoInventario=false;
			//this.isVisibilidadCeldaVerFormEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaDuplicarEstadoMovimientoInventario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadomovimientoinventarioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoMovimientoInventario=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoMovimientoInventario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			if(!estadomovimientoinventarioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoMovimientoInventario=false;												
			}
			
			this.jButtonCerrarEstadoMovimientoInventario.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoMovimientoInventario=false;
		}
		
		if(!this.permiteMantenimiento(this.estadomovimientoinventario)) {
			this.isVisibilidadCeldaActualizarEstadoMovimientoInventario=false;
			this.isVisibilidadCeldaEliminarEstadoMovimientoInventario=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoMovimientoInventario() {
		this.isVisibilidadCeldaNuevoEstadoMovimientoInventario=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoMovimientoInventario=false;
	}
	
	public void actualizarEstadoPanelsEstadoMovimientoInventario(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoMovimientoInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoMovimientoInventario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoMovimientoInventario!=null) {
				this.jScrollPanelDatosEstadoMovimientoInventario.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoMovimientoInventario!=null) {
				this.jPanelPaginacionEstadoMovimientoInventario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoMovimientoInventario!=null) {
				this.jPanelParametrosReportesEstadoMovimientoInventario.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoMovimientoInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoMovimientoInventario.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoMovimientoInventario!=null) {
				this.jScrollPanelDatosEstadoMovimientoInventario.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoMovimientoInventario!=null) {
				this.jPanelPaginacionEstadoMovimientoInventario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoMovimientoInventario!=null) {
				this.jPanelParametrosReportesEstadoMovimientoInventario.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoMovimientoInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoMovimientoInventario.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoMovimientoInventario!=null) {
				this.jScrollPanelDatosEstadoMovimientoInventario.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoMovimientoInventario!=null) {
				this.jPanelPaginacionEstadoMovimientoInventario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoMovimientoInventario!=null) {
				this.jPanelParametrosReportesEstadoMovimientoInventario.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoMovimientoInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoMovimientoInventario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoMovimientoInventario!=null) {
				this.jScrollPanelDatosEstadoMovimientoInventario.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoMovimientoInventario!=null) {
				this.jPanelPaginacionEstadoMovimientoInventario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoMovimientoInventario!=null) {
				this.jPanelParametrosReportesEstadoMovimientoInventario.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoMovimientoInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoMovimientoInventario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoMovimientoInventario!=null) {
				this.jScrollPanelDatosEstadoMovimientoInventario.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoMovimientoInventario!=null) {
				this.jPanelPaginacionEstadoMovimientoInventario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoMovimientoInventario!=null) {
				this.jPanelParametrosReportesEstadoMovimientoInventario.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoMovimientoInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoMovimientoInventario.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoMovimientoInventario!=null) {
				this.jScrollPanelDatosEstadoMovimientoInventario.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoMovimientoInventario!=null) {
				this.jPanelPaginacionEstadoMovimientoInventario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoMovimientoInventario!=null) {
				this.jPanelParametrosReportesEstadoMovimientoInventario.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoMovimientoInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoMovimientoInventario.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoMovimientoInventario!=null) {
				this.jScrollPanelDatosEstadoMovimientoInventario.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoMovimientoInventario!=null) {
				this.jPanelPaginacionEstadoMovimientoInventario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoMovimientoInventario!=null) {
				this.jPanelParametrosReportesEstadoMovimientoInventario.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadomovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoMovimientoInventarioParaMovimientoInventarios() throws Exception {
		Boolean isPaginaPopupMovimientoInventario=false;

		try {

			if(this.estadomovimientoinventarioSessionBean==null) {
				this.estadomovimientoinventarioSessionBean=new EstadoMovimientoInventarioSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioSessionBean=new MovimientoInventarioSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioSessionBean.setsPathNavegacionActual(estadomovimientoinventarioSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupMovimientoInventario=this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeMovimientoInventario(true);
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeMovimientoInventario(EstadoMovimientoInventarioConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioSessionBean.setisBusquedaDesdeForeignKeySesionEstadoMovimientoInventario(true);
			this.jInternalFrameDetalleFormEstadoMovimientoInventario.movimientoinventarioSessionBean.setlidEstadoMovimientoInventarioActual(this.idEstadoMovimientoInventarioActual);

			estadomovimientoinventarioSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoMovimientoInventario(true);
			estadomovimientoinventarioSessionBean.setlIdEstadoMovimientoInventarioActualForeignKey(this.idEstadoMovimientoInventarioActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoMovimientoInventarioSessionBean estadomovimientoinventarioSessionBean=new EstadoMovimientoInventarioSessionBean();
		
		if(this.estadomovimientoinventarioSessionBean==null) {
			this.estadomovimientoinventarioSessionBean=new EstadoMovimientoInventarioSessionBean();
		}
		
		this.estadomovimientoinventarioSessionBean.setsUltimaBusquedaEstadoMovimientoInventario(this.getsAccionBusqueda());
		this.estadomovimientoinventarioSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadomovimientoinventarioSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoMovimientoInventarioSessionBean estadomovimientoinventarioSessionBean=new EstadoMovimientoInventarioSessionBean();
		
		if(this.estadomovimientoinventarioSessionBean==null) {
			this.estadomovimientoinventarioSessionBean=new EstadoMovimientoInventarioSessionBean();
		}
		
		if(this.estadomovimientoinventarioSessionBean.getsUltimaBusquedaEstadoMovimientoInventario()!=null&&!this.estadomovimientoinventarioSessionBean.getsUltimaBusquedaEstadoMovimientoInventario().equals("")) {
			this.setsAccionBusqueda(estadomovimientoinventarioSessionBean.getsUltimaBusquedaEstadoMovimientoInventario());
			this.setiNumeroPaginacion(estadomovimientoinventarioSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadomovimientoinventarioSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadomovimientoinventarioSessionBean.setsUltimaBusquedaEstadoMovimientoInventario("");
		this.estadomovimientoinventarioSessionBean.setiNumeroPaginacion(EstadoMovimientoInventarioConstantesFunciones.INUMEROPAGINACION);
		this.estadomovimientoinventarioSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoMovimientoInventario(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoMovimientoInventario() {
		this.updateBorderResaltarBusquedasFormularioEstadoMovimientoInventario();
		this.updateVisibilidadBusquedasFormularioEstadoMovimientoInventario();
		this.updateHabilitarBusquedasFormularioEstadoMovimientoInventario();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoMovimientoInventario() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoMovimientoInventario() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoMovimientoInventario() {
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
	
	public void updateControlesFormularioEstadoMovimientoInventario() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoMovimientoInventario();
		this.updateVisibilidadResaltarControlesFormularioEstadoMovimientoInventario();
		this.updateHabilitarResaltarControlesFormularioEstadoMovimientoInventario();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoMovimientoInventario() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadomovimientoinventarioConstantesFunciones.resaltaridEstadoMovimientoInventario!=null && this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) {this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTextFieldidEstadoMovimientoInventario.setBorder(this.estadomovimientoinventarioConstantesFunciones.resaltaridEstadoMovimientoInventario);}
		if(this.estadomovimientoinventarioConstantesFunciones.resaltarcodigoEstadoMovimientoInventario!=null && this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) {this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTextFieldcodigoEstadoMovimientoInventario.setBorder(this.estadomovimientoinventarioConstantesFunciones.resaltarcodigoEstadoMovimientoInventario);}
		if(this.estadomovimientoinventarioConstantesFunciones.resaltarnombreEstadoMovimientoInventario!=null && this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) {this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTextAreanombreEstadoMovimientoInventario.setBorder(this.estadomovimientoinventarioConstantesFunciones.resaltarnombreEstadoMovimientoInventario);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoMovimientoInventario() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) {
	
		//this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTextFieldidEstadoMovimientoInventario.setVisible(this.estadomovimientoinventarioConstantesFunciones.mostraridEstadoMovimientoInventario);
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jPanelidEstadoMovimientoInventario.setVisible(this.estadomovimientoinventarioConstantesFunciones.mostraridEstadoMovimientoInventario);
		//this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTextFieldcodigoEstadoMovimientoInventario.setVisible(this.estadomovimientoinventarioConstantesFunciones.mostrarcodigoEstadoMovimientoInventario);
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jPanelcodigoEstadoMovimientoInventario.setVisible(this.estadomovimientoinventarioConstantesFunciones.mostrarcodigoEstadoMovimientoInventario);
		//this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTextAreanombreEstadoMovimientoInventario.setVisible(this.estadomovimientoinventarioConstantesFunciones.mostrarnombreEstadoMovimientoInventario);
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jPanelnombreEstadoMovimientoInventario.setVisible(this.estadomovimientoinventarioConstantesFunciones.mostrarnombreEstadoMovimientoInventario);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoMovimientoInventario() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoMovimientoInventario!=null) {
	
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTextFieldidEstadoMovimientoInventario.setEnabled(this.estadomovimientoinventarioConstantesFunciones.activaridEstadoMovimientoInventario);
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTextFieldcodigoEstadoMovimientoInventario.setEnabled(this.estadomovimientoinventarioConstantesFunciones.activarcodigoEstadoMovimientoInventario);
		this.jInternalFrameDetalleFormEstadoMovimientoInventario.jTextAreanombreEstadoMovimientoInventario.setEnabled(this.estadomovimientoinventarioConstantesFunciones.activarnombreEstadoMovimientoInventario);
		}
	}
	
		
}