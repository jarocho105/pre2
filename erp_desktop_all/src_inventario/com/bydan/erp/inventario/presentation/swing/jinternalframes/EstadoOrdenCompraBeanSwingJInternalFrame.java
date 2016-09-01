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

import com.bydan.erp.inventario.util.EstadoOrdenCompraConstantesFunciones;
import com.bydan.erp.inventario.util.EstadoOrdenCompraParameterReturnGeneral;
//import com.bydan.erp.inventario.util.EstadoOrdenCompraParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.EstadoOrdenCompraBean;
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
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.sris.business.logic.*;

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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class EstadoOrdenCompraBeanSwingJInternalFrame extends EstadoOrdenCompraJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoOrdenCompraBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoOrdenCompra> estadoordencompraValidator = new ClassValidator<EstadoOrdenCompra>(EstadoOrdenCompra.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoOrdenCompra estadoordencompra;	
	public EstadoOrdenCompra estadoordencompraAux;
	public EstadoOrdenCompra estadoordencompraAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoOrdenCompra estadoordencompraTotales;
	public Long idEstadoOrdenCompraActual;
	public Long iIdNuevoEstadoOrdenCompra=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosOrdenCompra=false;

	public Boolean getIsTienePermisosOrdenCompra() {
		return isTienePermisosOrdenCompra;
	}

	public void setIsTienePermisosOrdenCompra(Boolean isTienePermisosOrdenCompra) {
		this.isTienePermisosOrdenCompra= isTienePermisosOrdenCompra;
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
	
	public Boolean isPermisoTodoEstadoOrdenCompra;
	public Boolean isPermisoNuevoEstadoOrdenCompra;
	public Boolean isPermisoActualizarEstadoOrdenCompra;
	public Boolean isPermisoActualizarOriginalEstadoOrdenCompra;
	public Boolean isPermisoEliminarEstadoOrdenCompra;
	public Boolean isPermisoGuardarCambiosEstadoOrdenCompra;
	public Boolean isPermisoConsultaEstadoOrdenCompra;
	public Boolean isPermisoBusquedaEstadoOrdenCompra;
	public Boolean isPermisoReporteEstadoOrdenCompra;
	public Boolean isPermisoPaginacionMedioEstadoOrdenCompra;
	public Boolean isPermisoPaginacionAltoEstadoOrdenCompra;
	public Boolean isPermisoPaginacionTodoEstadoOrdenCompra;
	public Boolean isPermisoCopiarEstadoOrdenCompra;
	public Boolean isPermisoVerFormEstadoOrdenCompra;
	public Boolean isPermisoDuplicarEstadoOrdenCompra;
	public Boolean isPermisoOrdenEstadoOrdenCompra;
	
	
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
	
	public EstadoOrdenCompraParameterReturnGeneral estadoordencompraReturnGeneral;
	public EstadoOrdenCompraParameterReturnGeneral estadoordencompraParameterGeneral;
	
	

	public OrdenCompraLogic ordencompraLogic=null;

	public OrdenCompraLogic getOrdenCompraLogic() {
		return ordencompraLogic;
	}

	public void setOrdenCompraLogic(OrdenCompraLogic ordencompraLogic) {
		this.ordencompraLogic = ordencompraLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoOrdenCompra=false;
	public Boolean esParaAccionDesdeFormularioEstadoOrdenCompra=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadoOrdenCompraSessionBeanAdditional estadoordencompraSessionBeanAdditional=null;
	
	public EstadoOrdenCompraSessionBeanAdditional getEstadoOrdenCompraSessionBeanAdditional() {
		return this.estadoordencompraSessionBeanAdditional;
	}
	
	public void setEstadoOrdenCompraSessionBeanAdditional(EstadoOrdenCompraSessionBeanAdditional estadoordencompraSessionBeanAdditional) {
		try {
			this.estadoordencompraSessionBeanAdditional=estadoordencompraSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadoOrdenCompraBeanSwingJInternalFrameAdditional estadoordencompraBeanSwingJInternalFrameAdditional=null;
	//public class EstadoOrdenCompraBeanSwingJInternalFrame
	
	public EstadoOrdenCompraBeanSwingJInternalFrameAdditional getEstadoOrdenCompraBeanSwingJInternalFrameAdditional() {
		return this.estadoordencompraBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadoOrdenCompraBeanSwingJInternalFrameAdditional(EstadoOrdenCompraBeanSwingJInternalFrameAdditional estadoordencompraBeanSwingJInternalFrameAdditional) {
		try {
			this.estadoordencompraBeanSwingJInternalFrameAdditional=estadoordencompraBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoOrdenCompraLogic estadoordencompraLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoOrdenCompra estadoordencompraBean;
	public EstadoOrdenCompraConstantesFunciones estadoordencompraConstantesFunciones;
	//public EstadoOrdenCompraParameterReturnGeneral estadoordencompraReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoOrdenCompra> estadoordencompras;	
	//public List<EstadoOrdenCompra> estadoordencomprasEliminados;
	//public List<EstadoOrdenCompra> estadoordencomprasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoOrdenCompra=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoOrdenCompra=true;
	public Boolean isVisibilidadCeldaCopiarEstadoOrdenCompra=true;
	public Boolean isVisibilidadCeldaVerFormEstadoOrdenCompra=true;
	public Boolean isVisibilidadCeldaOrdenEstadoOrdenCompra=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoOrdenCompra=false;
	public Boolean isVisibilidadCeldaModificarEstadoOrdenCompra=false;
	public Boolean isVisibilidadCeldaActualizarEstadoOrdenCompra=false;
	public Boolean isVisibilidadCeldaEliminarEstadoOrdenCompra=false;
	public Boolean isVisibilidadCeldaCancelarEstadoOrdenCompra=false;
	public Boolean isVisibilidadCeldaGuardarEstadoOrdenCompra=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoOrdenCompra=false;	
	
	
	
	public Long getiIdNuevoEstadoOrdenCompra() {
		return this.iIdNuevoEstadoOrdenCompra;
	}

	public void setiIdNuevoEstadoOrdenCompra(Long iIdNuevoEstadoOrdenCompra) {
		this.iIdNuevoEstadoOrdenCompra = iIdNuevoEstadoOrdenCompra;
	}
	
	public Long getidEstadoOrdenCompraActual() {
		return this.idEstadoOrdenCompraActual;
	}

	public void setidEstadoOrdenCompraActual(Long idEstadoOrdenCompraActual) {
		this.idEstadoOrdenCompraActual = idEstadoOrdenCompraActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoOrdenCompra getestadoordencompra() {
		return this.estadoordencompra;
	}

	public void setestadoordencompra(EstadoOrdenCompra estadoordencompra) {
		this.estadoordencompra = estadoordencompra;
	}
	
	public EstadoOrdenCompra getestadoordencompraAux() {
		return this.estadoordencompraAux;
	}

	public void setestadoordencompraAux(EstadoOrdenCompra estadoordencompraAux) {
		this.estadoordencompraAux = estadoordencompraAux;
	}				
	
	public EstadoOrdenCompra getestadoordencompraAnterior() {
		return this.estadoordencompraAnterior;
	}

	public void setestadoordencompraAnterior(EstadoOrdenCompra estadoordencompraAnterior) {
		this.estadoordencompraAnterior = estadoordencompraAnterior;
	}	
	
	public EstadoOrdenCompra getestadoordencompraTotales() {
		return this.estadoordencompraTotales;
	}

	public void setestadoordencompraTotales(EstadoOrdenCompra estadoordencompraTotales) {
		this.estadoordencompraTotales = estadoordencompraTotales;
	}	
	
	public EstadoOrdenCompra getestadoordencompraBean() {
		return this.estadoordencompraBean;
	}

	public void setestadoordencompraBean(EstadoOrdenCompra estadoordencompraBean) {
		this.estadoordencompraBean = estadoordencompraBean;
	}	
	
	public EstadoOrdenCompraParameterReturnGeneral getestadoordencompraReturnGeneral() {
		return this.estadoordencompraReturnGeneral;
	}

	public void setestadoordencompraReturnGeneral(EstadoOrdenCompraParameterReturnGeneral estadoordencompraReturnGeneral) {
		this.estadoordencompraReturnGeneral = estadoordencompraReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoOrdenCompraLogic getEstadoOrdenCompraLogic()	{		
		return estadoordencompraLogic;
	}

	public void setEstadoOrdenCompraLogic(EstadoOrdenCompraLogic estadoordencompraLogic) {
		this.estadoordencompraLogic = estadoordencompraLogic;
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
	
	public Boolean getIsEsNuevoEstadoOrdenCompra() {
		return isEsNuevoEstadoOrdenCompra;
	}

	public void setIsEsNuevoEstadoOrdenCompra(Boolean isEsNuevoEstadoOrdenCompra) {
		this.isEsNuevoEstadoOrdenCompra = isEsNuevoEstadoOrdenCompra;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoOrdenCompra() {
		return esParaAccionDesdeFormularioEstadoOrdenCompra;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoOrdenCompra(Boolean esParaAccionDesdeFormularioEstadoOrdenCompra) {
		this.esParaAccionDesdeFormularioEstadoOrdenCompra = esParaAccionDesdeFormularioEstadoOrdenCompra;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoOrdenCompra() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoOrdenCompraConstantesFunciones.refrescarForeignKeysDescripcionesEstadoOrdenCompra(this.estadoordencompraLogic.getEstadoOrdenCompras());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoOrdenCompraConstantesFunciones.refrescarForeignKeysDescripcionesEstadoOrdenCompra(this.estadoordencompras);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadoordencompraLogic.setEstadoOrdenCompras(this.estadoordencompras);
			estadoordencompraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoOrdenCompraParameterReturnGeneral getEstadoOrdenCompraParameterGeneral() {
		return this.estadoordencompraParameterGeneral;
	}
	
	public void setEstadoOrdenCompraParameterGeneral(EstadoOrdenCompraParameterReturnGeneral estadoordencompraParameterGeneral) {
		this.estadoordencompraParameterGeneral = estadoordencompraParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoOrdenCompra() {
		return isPermisoTodoEstadoOrdenCompra;
	}

	public void setIsPermisoTodoEstadoOrdenCompra(Boolean isPermisoTodoEstadoOrdenCompra) {
		this.isPermisoTodoEstadoOrdenCompra = isPermisoTodoEstadoOrdenCompra;
	}

	public Boolean getIsPermisoNuevoEstadoOrdenCompra() {
		return isPermisoNuevoEstadoOrdenCompra;
	}

	public void setIsPermisoNuevoEstadoOrdenCompra(Boolean isPermisoNuevoEstadoOrdenCompra) {
		this.isPermisoNuevoEstadoOrdenCompra = isPermisoNuevoEstadoOrdenCompra;
	}

	public Boolean getIsPermisoActualizarEstadoOrdenCompra() {
		return isPermisoActualizarEstadoOrdenCompra;
	}

	public void setIsPermisoActualizarEstadoOrdenCompra(Boolean isPermisoActualizarEstadoOrdenCompra) {
		this.isPermisoActualizarEstadoOrdenCompra = isPermisoActualizarEstadoOrdenCompra;
	}

	public Boolean getIsPermisoEliminarEstadoOrdenCompra() {
		return isPermisoEliminarEstadoOrdenCompra;
	}

	public void setIsPermisoEliminarEstadoOrdenCompra(Boolean isPermisoEliminarEstadoOrdenCompra) {
		this.isPermisoEliminarEstadoOrdenCompra = isPermisoEliminarEstadoOrdenCompra;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoOrdenCompra() {
		return isPermisoGuardarCambiosEstadoOrdenCompra;
	}

	public void setIsPermisoGuardarCambiosEstadoOrdenCompra(Boolean isPermisoGuardarCambiosEstadoOrdenCompra) {
		this.isPermisoGuardarCambiosEstadoOrdenCompra = isPermisoGuardarCambiosEstadoOrdenCompra;
	}
	
	public Boolean getIsPermisoConsultaEstadoOrdenCompra() {
		return isPermisoConsultaEstadoOrdenCompra;
	}

	public void setIsPermisoConsultaEstadoOrdenCompra(Boolean isPermisoConsultaEstadoOrdenCompra) {
		this.isPermisoConsultaEstadoOrdenCompra = isPermisoConsultaEstadoOrdenCompra;
	}

	public Boolean getIsPermisoBusquedaEstadoOrdenCompra() {
		return isPermisoBusquedaEstadoOrdenCompra;
	}

	public void setIsPermisoBusquedaEstadoOrdenCompra(Boolean isPermisoBusquedaEstadoOrdenCompra) {
		this.isPermisoBusquedaEstadoOrdenCompra = isPermisoBusquedaEstadoOrdenCompra;
	}

	public Boolean getIsPermisoReporteEstadoOrdenCompra() {
		return isPermisoReporteEstadoOrdenCompra;
	}

	public void setIsPermisoReporteEstadoOrdenCompra(Boolean isPermisoReporteEstadoOrdenCompra) {
		this.isPermisoReporteEstadoOrdenCompra = isPermisoReporteEstadoOrdenCompra;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoOrdenCompra() {
		return isPermisoPaginacionMedioEstadoOrdenCompra;
	}

	public void setIsPermisoPaginacionMedioEstadoOrdenCompra(Boolean isPermisoPaginacionMedioEstadoOrdenCompra) {
		this.isPermisoPaginacionMedioEstadoOrdenCompra = isPermisoPaginacionMedioEstadoOrdenCompra;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoOrdenCompra() {
		return isPermisoPaginacionTodoEstadoOrdenCompra;
	}

	public void setIsPermisoPaginacionTodoEstadoOrdenCompra(Boolean isPermisoPaginacionTodoEstadoOrdenCompra) {
		this.isPermisoPaginacionTodoEstadoOrdenCompra = isPermisoPaginacionTodoEstadoOrdenCompra;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoOrdenCompra() {
		return isPermisoPaginacionAltoEstadoOrdenCompra;
	}

	public void setIsPermisoPaginacionAltoEstadoOrdenCompra(Boolean isPermisoPaginacionAltoEstadoOrdenCompra) {
		this.isPermisoPaginacionAltoEstadoOrdenCompra = isPermisoPaginacionAltoEstadoOrdenCompra;
	}
	
	public Boolean getIsPermisoCopiarEstadoOrdenCompra() {
		return isPermisoCopiarEstadoOrdenCompra;
	}

	public void setIsPermisoCopiarEstadoOrdenCompra(Boolean isPermisoCopiarEstadoOrdenCompra) {
		this.isPermisoCopiarEstadoOrdenCompra = isPermisoCopiarEstadoOrdenCompra;
	}
	
	public Boolean getIsPermisoVerFormEstadoOrdenCompra() {
		return isPermisoVerFormEstadoOrdenCompra;
	}

	public void setIsPermisoVerFormEstadoOrdenCompra(Boolean isPermisoVerFormEstadoOrdenCompra) {
		this.isPermisoVerFormEstadoOrdenCompra = isPermisoVerFormEstadoOrdenCompra;
	}
	
	public Boolean getIsPermisoDuplicarEstadoOrdenCompra() {
		return isPermisoDuplicarEstadoOrdenCompra;
	}

	public void setIsPermisoDuplicarEstadoOrdenCompra(Boolean isPermisoDuplicarEstadoOrdenCompra) {
		this.isPermisoDuplicarEstadoOrdenCompra = isPermisoDuplicarEstadoOrdenCompra;
	}
	
	public Boolean getIsPermisoOrdenEstadoOrdenCompra() {
		return isPermisoOrdenEstadoOrdenCompra;
	}

	public void setIsPermisoOrdenEstadoOrdenCompra(Boolean isPermisoOrdenEstadoOrdenCompra) {
		this.isPermisoOrdenEstadoOrdenCompra = isPermisoOrdenEstadoOrdenCompra;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoOrdenCompra() {
		return isVisibilidadCeldaNuevoEstadoOrdenCompra;
	}

	public void setIsVisibilidadCeldaNuevoEstadoOrdenCompra(Boolean isVisibilidadCeldaNuevoEstadoOrdenCompra) {
		this.isVisibilidadCeldaNuevoEstadoOrdenCompra = isVisibilidadCeldaNuevoEstadoOrdenCompra;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoOrdenCompra() {
		return isVisibilidadCeldaDuplicarEstadoOrdenCompra;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoOrdenCompra(Boolean isVisibilidadCeldaDuplicarEstadoOrdenCompra) {
		this.isVisibilidadCeldaDuplicarEstadoOrdenCompra = isVisibilidadCeldaDuplicarEstadoOrdenCompra;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoOrdenCompra() {
		return isVisibilidadCeldaCopiarEstadoOrdenCompra;
	}

	public void setIsVisibilidadCeldaCopiarEstadoOrdenCompra(Boolean isVisibilidadCeldaCopiarEstadoOrdenCompra) {
		this.isVisibilidadCeldaCopiarEstadoOrdenCompra = isVisibilidadCeldaCopiarEstadoOrdenCompra;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoOrdenCompra() {
		return isVisibilidadCeldaVerFormEstadoOrdenCompra;
	}

	public void setIsVisibilidadCeldaVerFormEstadoOrdenCompra(Boolean isVisibilidadCeldaVerFormEstadoOrdenCompra) {
		this.isVisibilidadCeldaVerFormEstadoOrdenCompra = isVisibilidadCeldaVerFormEstadoOrdenCompra;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoOrdenCompra() {
		return isVisibilidadCeldaOrdenEstadoOrdenCompra;
	}

	public void setIsVisibilidadCeldaOrdenEstadoOrdenCompra(Boolean isVisibilidadCeldaOrdenEstadoOrdenCompra) {
		this.isVisibilidadCeldaOrdenEstadoOrdenCompra = isVisibilidadCeldaOrdenEstadoOrdenCompra;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoOrdenCompra() {
		return isVisibilidadCeldaNuevoRelacionesEstadoOrdenCompra;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoOrdenCompra(Boolean isVisibilidadCeldaNuevoRelacionesEstadoOrdenCompra) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenCompra = isVisibilidadCeldaNuevoRelacionesEstadoOrdenCompra;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoOrdenCompra() {
		return isVisibilidadCeldaModificarEstadoOrdenCompra;
	}

	public void setIsVisibilidadCeldaModificarEstadoOrdenCompra(Boolean isVisibilidadCeldaModificarEstadoOrdenCompra) {
		this.isVisibilidadCeldaModificarEstadoOrdenCompra = isVisibilidadCeldaModificarEstadoOrdenCompra;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoOrdenCompra() {
		return isVisibilidadCeldaActualizarEstadoOrdenCompra;
	}

	public void setIsVisibilidadCeldaActualizarEstadoOrdenCompra(Boolean isVisibilidadCeldaActualizarEstadoOrdenCompra) {
		this.isVisibilidadCeldaActualizarEstadoOrdenCompra = isVisibilidadCeldaActualizarEstadoOrdenCompra;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoOrdenCompra() {
		return isVisibilidadCeldaEliminarEstadoOrdenCompra;
	}

	public void setIsVisibilidadCeldaEliminarEstadoOrdenCompra(Boolean isVisibilidadCeldaEliminarEstadoOrdenCompra) {
		this.isVisibilidadCeldaEliminarEstadoOrdenCompra = isVisibilidadCeldaEliminarEstadoOrdenCompra;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoOrdenCompra() {
		return isVisibilidadCeldaCancelarEstadoOrdenCompra;
	}

	public void setIsVisibilidadCeldaCancelarEstadoOrdenCompra(Boolean isVisibilidadCeldaCancelarEstadoOrdenCompra) {
		this.isVisibilidadCeldaCancelarEstadoOrdenCompra = isVisibilidadCeldaCancelarEstadoOrdenCompra;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoOrdenCompra() {
		return isVisibilidadCeldaGuardarEstadoOrdenCompra;
	}

	public void setIsVisibilidadCeldaGuardarEstadoOrdenCompra(Boolean isVisibilidadCeldaGuardarEstadoOrdenCompra) {
		this.isVisibilidadCeldaGuardarEstadoOrdenCompra = isVisibilidadCeldaGuardarEstadoOrdenCompra;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoOrdenCompra() {
		return isVisibilidadCeldaGuardarCambiosEstadoOrdenCompra;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoOrdenCompra(Boolean isVisibilidadCeldaGuardarCambiosEstadoOrdenCompra) {
		this.isVisibilidadCeldaGuardarCambiosEstadoOrdenCompra = isVisibilidadCeldaGuardarCambiosEstadoOrdenCompra;
	}
		
	public EstadoOrdenCompraSessionBean getestadoordencompraSessionBean() {
		return this.estadoordencompraSessionBean;
	}
	
	public void setestadoordencompraSessionBean(EstadoOrdenCompraSessionBean estadoordencompraSessionBean) {
		this.estadoordencompraSessionBean=estadoordencompraSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenCompra(EstadoOrdenCompra estadoordencompra)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoOrdenCompra estadoordencompra,EstadoOrdenCompra estadoordencompraAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoOrdenCompra(estadoordencompra);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadoordencompraAux.setId(estadoordencompra.getId());
		estadoordencompraAux.setVersionRow(estadoordencompra.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoOrdenCompra();
		
			int intSelectedRow = this.jTableDatosEstadoOrdenCompra.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordencompra =(EstadoOrdenCompra) this.estadoordencompraLogic.getEstadoOrdenCompras().toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadoordencompra =(EstadoOrdenCompra) this.estadoordencompras.toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoOrdenCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoOrdenCompra(this.estadoordencompra,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenCompra(this.estadoordencompra);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadoordencompraValidator.getInvalidValues(this.estadoordencompra);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadoordencompraLogic.setDatosCliente(datosCliente);
			estadoordencompraLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadoordencompraAux=new  EstadoOrdenCompra();
				
				estadoordencompraAux.setIsNew(true);
				estadoordencompraAux.setIsChanged(true);
				
				estadoordencompraAux.setEstadoOrdenCompraOriginal(this.estadoordencompra);
				
				estadoordencompraAux.setId(this.estadoordencompra.getId());	
				estadoordencompraAux.setVersionRow(this.estadoordencompra.getVersionRow());	
				estadoordencompraAux.setcodigo(this.estadoordencompra.getcodigo());	
				estadoordencompraAux.setnombre(this.estadoordencompra.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoordencompraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoordencompraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadoordencompraAux,estadoordencompraLogic.getEstadoOrdenCompras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoordencompraAux,estadoordencompras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadoordencompraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoordencompraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoordencompraLogic.saveEstadoOrdenCompras();//WithConnection
						//estadoordencompraLogic.getSetVersionRowEstadoOrdenCompras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoordencompra,estadoordencompraAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoordencompraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencompraLogic.getOrdenCompras().addAll(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencomprasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencompras.addAll(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencomprasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenCompra.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenCompra.detalleordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenCompra.detalleordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenCompra.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenCompra.detalleordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenCompra.detalleordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadoordencompraLogic.saveEstadoOrdenCompraRelaciones(estadoordencompraAux,this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencompraLogic.getOrdenCompras());//WithConnection
								//estadoordencompraLogic.getSetVersionRowEstadoOrdenCompras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadoordencompra,estadoordencompraAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencompraLogic.setOrdenCompras(new ArrayList<OrdenCompra>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencompras= new ArrayList<OrdenCompra>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoordencompraAux.setOrdenCompras(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencompraLogic.getOrdenCompras());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadoordencompraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadoordencompraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadoordencompraAux,estadoordencompraLogic.getEstadoOrdenCompras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadoordencompraAux,estadoordencompras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadoordencompra,estadoordencompraAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadoordencompraAux=new  EstadoOrdenCompra();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadoordencompraSessionBean.getEsGuardarRelacionado() 
					|| (this.estadoordencompraSessionBean.getEsGuardarRelacionado() && this.estadoordencompra.getId()>=0)) {
						
					estadoordencompraAux.setIsNew(false);
				}
				
				estadoordencompraAux.setIsDeleted(false);
			
				estadoordencompraAux.setId(this.estadoordencompra.getId());	
				estadoordencompraAux.setVersionRow(this.estadoordencompra.getVersionRow());	
				estadoordencompraAux.setcodigo(this.estadoordencompra.getcodigo());	
				estadoordencompraAux.setnombre(this.estadoordencompra.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoordencompraAux,estadoordencompraLogic.getEstadoOrdenCompras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoordencompraAux,estadoordencompras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadoordencompraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoordencompraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoordencompraLogic.saveEstadoOrdenCompras();//WithConnection
						//estadoordencompraLogic.getSetVersionRowEstadoOrdenCompras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoordencompra,estadoordencompraAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoordencompraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencompraLogic.getOrdenCompras().addAll(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencomprasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencompras.addAll(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencomprasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenCompra.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenCompra.detalleordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenCompra.detalleordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenCompra.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenCompra.detalleordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenCompra.detalleordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadoordencompraLogic.saveEstadoOrdenCompraRelaciones(estadoordencompraAux,this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencompraLogic.getOrdenCompras());//WithConnection
								//estadoordencompraLogic.getSetVersionRowEstadoOrdenCompras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadoordencompra,estadoordencompraAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencompraLogic.setOrdenCompras(new ArrayList<OrdenCompra>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencompras= new ArrayList<OrdenCompra>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoordencompraAux.setOrdenCompras(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencompraLogic.getOrdenCompras());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadoordencompraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadoordencompraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadoordencompraAux,estadoordencompraLogic.getEstadoOrdenCompras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadoordencompraAux,estadoordencompras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadoordencompra,estadoordencompraAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadoordencompraAux=new  EstadoOrdenCompra();
				
				estadoordencompraAux.setIsNew(false);
				estadoordencompraAux.setIsChanged(false);
				
				estadoordencompraAux.setIsDeleted(true);
				
				estadoordencompraAux.setId(this.estadoordencompra.getId());	
				estadoordencompraAux.setVersionRow(this.estadoordencompra.getVersionRow());	
				estadoordencompraAux.setcodigo(this.estadoordencompra.getcodigo());	
				estadoordencompraAux.setnombre(this.estadoordencompra.getnombre());	
				
				if(this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadoordencompraAux.getId()>=0) {	
						this.estadoordencomprasEliminados.add(estadoordencompraAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadoordencompraAux,estadoordencompraLogic.getEstadoOrdenCompras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoordencompraAux,estadoordencompras);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadoordencompraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoordencompraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoordencompraLogic.saveEstadoOrdenCompras();//WithConnection
						//estadoordencompraLogic.getSetVersionRowEstadoOrdenCompras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoordencompraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencompraLogic.getOrdenCompras().addAll(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencomprasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencompras.addAll(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencomprasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenCompra.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenCompra.detalleordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenCompra.detalleordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenCompra.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenCompra.detalleordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenCompra.detalleordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadoordencompraLogic.saveEstadoOrdenCompraRelaciones(estadoordencompraAux,this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencompraLogic.getOrdenCompras());//WithConnection
								//estadoordencompraLogic.getSetVersionRowEstadoOrdenCompras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencompraLogic.setOrdenCompras(new ArrayList<OrdenCompra>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencompras= new ArrayList<OrdenCompra>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoordencompraAux.setOrdenCompras(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencompraLogic.getOrdenCompras());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadoordencompraSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadoordencompraSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadoordencompraAux,estadoordencompraLogic.getEstadoOrdenCompras());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadoordencompraAux,estadoordencompras);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordencompraLogic.getEstadoOrdenCompras().addAll(this.estadoordencomprasEliminados);
					
					estadoordencompraLogic.saveEstadoOrdenCompras();//WithConnection
					//estadoordencompraLogic.getSetVersionRowEstadoOrdenCompras();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadoordencomprasEliminados= new ArrayList<EstadoOrdenCompra>();		
			}
			
			if(this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Orden Compra GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Orden Compra",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadoordencompra=estadoordencompraAux;
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
      		//this.finishProcessEstadoOrdenCompra();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoOrdenCompra estadoordencompraLocal) throws Exception {
		
		if(this.estadoordencompraSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadoordencompraLocal.setOrdenCompras(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencompraLogic.getOrdenCompras());
			
			} else {
			
				estadoordencompraLocal.setOrdenCompras(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencompras);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoOrdenCompra estadoordencompraLocal) throws Exception {	
		if(this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoOrdenCompraActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoOrdenCompra.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoordencompra =(EstadoOrdenCompra) this.estadoordencompraLogic.getEstadoOrdenCompras().toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadoordencompra =(EstadoOrdenCompra) this.estadoordencompras.toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadoordencompraValidator.getInvalidValues(this.estadoordencompra);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoOrdenCompra estadoordencompra,List<EstadoOrdenCompra> estadoordencompras) throws Exception {
		try	{		
			EstadoOrdenCompraConstantesFunciones.actualizarLista(estadoordencompra,estadoordencompras,this.estadoordencompraSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoOrdenCompra estadoordencompra,List<EstadoOrdenCompra> estadoordencompras) throws Exception {
		try	{			
			EstadoOrdenCompraConstantesFunciones.actualizarSelectedLista(estadoordencompra,estadoordencompras);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoOrdenCompra> estadoordencomprasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadoordencomprasLocal=this.estadoordencompraLogic.getEstadoOrdenCompras();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadoordencomprasLocal=this.estadoordencompras;
			}
			//ARCHITECTURE
		
			for(EstadoOrdenCompra estadoordencompraLocal:estadoordencomprasLocal) {
				if(this.permiteMantenimiento(estadoordencompraLocal) && estadoordencompraLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoOrdenCompraConstantesFunciones.getEstadoOrdenCompraLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoOrdenCompraConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoOrdenCompra.jLabelcodigoEstadoOrdenCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoOrdenCompraConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoOrdenCompra.jLabelnombreEstadoOrdenCompra,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoOrdenCompra.jLabelcodigoEstadoOrdenCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoOrdenCompra.jLabelnombreEstadoOrdenCompra,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("OrdenCompra")) {
			if(this.estadoordencompra==null) {
				this.estadoordencompra= new EstadoOrdenCompra();
			}

			if(this.estadoordencompraSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoOrdenCompra
				this.setVariablesFormularioToObjetoActualEstadoOrdenCompra(this.estadoordencompra,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenCompra(this.estadoordencompra);

				this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.getordencompra().setEstadoOrdenCompra(this.estadoordencompra);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoOrdenCompra--;	
		
		
		this.estadoordencompraAux=new EstadoOrdenCompra();
		
		this.estadoordencompraAux.setId(this.iIdNuevoEstadoOrdenCompra);
		this.estadoordencompraAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoordencompraLogic.getEstadoOrdenCompras().add(this.estadoordencompraAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadoordencompras.add(this.estadoordencompraAux);
		}
		//ARCHITECTURE
		
		this.estadoordencompra=this.estadoordencompraAux;
		
		if(EstadoOrdenCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoOrdenCompra(this.estadoordencompra);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoOrdenCompra(this.estadoordencompra);
		}
				
		//this.setDefaultControlesEstadoOrdenCompra();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoOrdenCompra();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoOrdenCompra();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoOrdenCompra();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoOrdenCompra(this.estadoordencompraBean,this.estadoordencompra,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenCompra(this.estadoordencompra);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadoordencompraSessionBean.getConGuardarRelaciones()) {
			classes=EstadoOrdenCompraConstantesFunciones.getClassesRelationshipsOfEstadoOrdenCompra(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadoordencompraReturnGeneral=estadoordencompraLogic.procesarEventosEstadoOrdenComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoordencompraLogic.getEstadoOrdenCompras(),this.estadoordencompra,this.estadoordencompraParameterGeneral,this.isEsNuevoEstadoOrdenCompra,classes);//this.estadoordencompraLogic.getEstadoOrdenCompra()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoOrdenCompra(this.estadoordencompraReturnGeneral,this.estadoordencompraBean,false);
		
		if(this.estadoordencompraReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoOrdenCompra(this.estadoordencompraReturnGeneral.getEstadoOrdenCompra());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoOrdenCompra(this.estadoordencompraReturnGeneral.getEstadoOrdenCompra());
		}
		
		if(this.estadoordencompraReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoOrdenCompra(this.estadoordencompraReturnGeneral.getEstadoOrdenCompra(),classes);//this.estadoordencompraBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoOrdenCompra(this.estadoordencompra,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoOrdenCompra();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoOrdenCompra();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoOrdenCompraBeanSwingJInternalFrameAdditional.RecargarFormEstadoOrdenCompra(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoOrdenCompra(false);
						
			if(estadoordencompraSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencompraSessionBean.getEsGuardarRelacionado() && OrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonOrdenCompraActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoOrdenCompraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoOrdenCompra();
			}
			
			this.actualizarVisualTableDatosEstadoOrdenCompra();
			
			this.jTableDatosEstadoOrdenCompra.setRowSelectionInterval(this.getIndiceNuevoEstadoOrdenCompra(), this.getIndiceNuevoEstadoOrdenCompra());
			
			this.seleccionarFilaTablaEstadoOrdenCompraActual();
						
			this.actualizarEstadoCeldasBotonesEstadoOrdenCompra("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoOrdenCompra(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jTextFieldcodigoEstadoOrdenCompra.setEnabled(isHabilitar && this.estadoordencompraConstantesFunciones.activarcodigoEstadoOrdenCompra);
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jTextAreanombreEstadoOrdenCompra.setEnabled(isHabilitar && this.estadoordencompraConstantesFunciones.activarnombreEstadoOrdenCompra);	
		
	};
	
	public void setDefaultControlesEstadoOrdenCompra() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoOrdenCompra(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadoordencompraSessionBean.setConGuardarRelaciones(true);			
			this.estadoordencompraSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jTabbedPaneRelacionesEstadoOrdenCompra.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencompraSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadoordencompraSessionBean.setConGuardarRelaciones(false);			
			this.estadoordencompraSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jTabbedPaneRelacionesEstadoOrdenCompra.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencompraSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoOrdenCompra() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoOrdenCompra estadoordencompraAux:this.estadoordencompraLogic.getEstadoOrdenCompras()) {
				if(estadoordencompraAux.getId().equals(this.iIdNuevoEstadoOrdenCompra)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoOrdenCompra estadoordencompraAux:this.estadoordencompras) {
				if(estadoordencompraAux.getId().equals(this.iIdNuevoEstadoOrdenCompra)) {
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
	
	public int getIndiceActualEstadoOrdenCompra(EstadoOrdenCompra estadoordencompra,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoOrdenCompra estadoordencompraAux:this.estadoordencompraLogic.getEstadoOrdenCompras()) {
				if(estadoordencompraAux.getId().equals(estadoordencompra.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoOrdenCompra estadoordencompraAux:this.estadoordencompras) {
				if(estadoordencompraAux.getId().equals(estadoordencompra.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoOrdenCompra(EstadoOrdenCompra estadoordencompraOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoOrdenCompra estadoordencompraAux:this.estadoordencompraLogic.getEstadoOrdenCompras()) {
				if(estadoordencompraAux.getEstadoOrdenCompraOriginal().getId().equals(estadoordencompraOriginal.getId())) {
					existe=true;
					estadoordencompraOriginal.setId(estadoordencompraAux.getId());
					estadoordencompraOriginal.setVersionRow(estadoordencompraAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoOrdenCompra estadoordencompraAux:this.estadoordencompras) {
				if(estadoordencompraAux.getEstadoOrdenCompraOriginal().getId().equals(estadoordencompraOriginal.getId())) {
					existe=true;
					estadoordencompraOriginal.setId(estadoordencompraAux.getId());
					estadoordencompraOriginal.setVersionRow(estadoordencompraAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoOrdenCompra(Boolean esParaCancelar) throws Exception {
		estadoordencomprasAux=new ArrayList<EstadoOrdenCompra>();
		estadoordencompraAux=new EstadoOrdenCompra();
		
		if(!this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoOrdenCompra estadoordencompraAux:this.estadoordencompraLogic.getEstadoOrdenCompras()) {
					if(estadoordencompraAux.getId()<0) {
						estadoordencomprasAux.add(estadoordencompraAux);
					}		
				}
				this.iIdNuevoEstadoOrdenCompra=0L;
				this.estadoordencompraLogic.getEstadoOrdenCompras().removeAll(estadoordencomprasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoOrdenCompra estadoordencompraAux:this.estadoordencompras) {
					if(estadoordencompraAux.getId()<0) {
						estadoordencomprasAux.add(estadoordencompraAux);
					}		
				}
				this.iIdNuevoEstadoOrdenCompra=0L;
				this.estadoordencompras.removeAll(estadoordencomprasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoOrdenCompra 
					&& this.estadoordencompraLogic.getEstadoOrdenCompras().size()>0
					) {
					estadoordencompraAux=this.estadoordencompraLogic.getEstadoOrdenCompras().get(this.estadoordencompraLogic.getEstadoOrdenCompras().size() - 1);
				
					if(estadoordencompraAux.getId()<0) {
						this.estadoordencompraLogic.getEstadoOrdenCompras().remove(estadoordencompraAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoOrdenCompra && this.estadoordencompras.size()>0) {
					estadoordencompraAux=this.estadoordencompras.get(this.estadoordencompras.size() - 1);
				
					if(estadoordencompraAux.getId()<0) {
						this.estadoordencompras.remove(estadoordencompraAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoOrdenCompra(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadoordencompra.getId()<0) {
				this.estadoordencompraLogic.getEstadoOrdenCompras().remove(this.estadoordencompra);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadoordencompra.getId()<0) {
				this.estadoordencompras.remove(this.estadoordencompra);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoOrdenCompra(List<EstadoOrdenCompra> estadoordencomprasAux) throws Exception {
		EstadoOrdenCompraConstantesFunciones.setEstadosInicialesEstadoOrdenCompra(estadoordencomprasAux);
	}
	
	public void setEstadosInicialesEstadoOrdenCompra(EstadoOrdenCompra estadoordencompraAux) throws Exception {
		EstadoOrdenCompraConstantesFunciones.setEstadosInicialesEstadoOrdenCompra(estadoordencompraAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoOrdenCompraActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoOrdenCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoOrdenCompraActual()) {
				if(!this.isEsNuevoEstadoOrdenCompra) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoOrdenCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoOrdenCompra=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoOrdenCompraActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Orden Compra ?", "MANTENIMIENTO DE Estado Orden Compra", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoOrdenCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoOrdenCompra estadoordencompra) throws Exception {
		EstadoOrdenCompraConstantesFunciones.seleccionarAsignar(this.estadoordencompra,estadoordencompra);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoOrdenCompra=this.isPermisoActualizarOriginalEstadoOrdenCompra;
			
			
			this.seleccionarAsignar(estadoordencompra);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoOrdenCompraConstantesFunciones.quitarEspaciosEstadoOrdenCompra(this.estadoordencompra,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoOrdenCompra("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadoordencompraSessionBean.setsFuncionBusquedaRapida(this.estadoordencompraSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoOrdenCompra) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoOrdenCompra(esParaCancelar);				
				this.cancelarNuevoEstadoOrdenCompra(esParaCancelar);								
			}
			
			this.estadoordencompra=new EstadoOrdenCompra();
			
			this.inicializarEstadoOrdenCompra();
			
			this.actualizarEstadoCeldasBotonesEstadoOrdenCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoOrdenCompra() throws Exception {
		try {
			EstadoOrdenCompraConstantesFunciones.inicializarEstadoOrdenCompra(this.estadoordencompra);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadoordencompraLogic.getEstadoOrdenCompras().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoOrdenCompras(String sAccionBusqueda,List<EstadoOrdenCompra> estadoordencomprasParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoOrdenCompra"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoOrdenCompraMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoOrdenCompraMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoOrdenCompra"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Orden Compras");		
		parameters.put("busquedapor", EstadoOrdenCompraConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(OrdenCompra.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoOrdenCompraLogic estadoordencompraLogicAuxiliar=new EstadoOrdenCompraLogic();
					estadoordencompraLogicAuxiliar.setDatosCliente(estadoordencompraLogic.getDatosCliente());				
					estadoordencompraLogicAuxiliar.setEstadoOrdenCompras(estadoordencomprasParaReportes);
					
					estadoordencompraLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoOrdenCompraWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadoordencomprasParaReportes=estadoordencompraLogicAuxiliar.getEstadoOrdenCompras();
					
					//estadoordencompraLogic.getNewConnexionToDeep();
					
					//for (EstadoOrdenCompra estadoordencompra:estadoordencomprasParaReportes) {
					//	estadoordencompraLogic.deepLoad(estadoordencompra, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadoordencompraLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadoordencompraLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileOrdenCompra = AuxiliarReportes.class.getResourceAsStream("OrdenCompraDetalleRelacionesDesign.jasper");
			parameters.put("subreport_ordencompra", reportFileOrdenCompra);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoOrdenCompra=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoOrdenCompraConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoOrdenCompraConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoOrdenCompra=new JRBeanArrayDataSource(EstadoOrdenCompraJInternalFrame.TraerEstadoOrdenCompraBeans(estadoordencomprasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoOrdenCompra);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoOrdenCompraConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoOrdenCompraConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoOrdenCompraBean.TraerEstadoOrdenCompraBeans(estadoordencomprasParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoOrdenCompras(sAccionBusqueda,sTipoArchivoReporte,estadoordencomprasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoOrdenCompras(sAccionBusqueda,sTipoArchivoReporte,estadoordencomprasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoOrdenCompraActionPerformed(null);
					//this.generarExcelReporteEstadoOrdenCompras(sAccionBusqueda,sTipoArchivoReporte,estadoordencomprasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoOrdenCompras(sAccionBusqueda,sTipoArchivoReporte,estadoordencomprasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoOrdenCompras(sAccionBusqueda,sTipoArchivoReporte,estadoordencomprasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoOrdenCompras(sAccionBusqueda,sTipoArchivoReporte,estadoordencomprasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoOrdenCompras(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoOrdenCompra> estadoordencomprasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoordencompra";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoOrdenCompras");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoOrdenCompra("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoOrdenCompra estadoordencompra : estadoordencomprasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoOrdenCompraConstantesFunciones.generarExcelReporteDataEstadoOrdenCompra("NORMAL",row,workbook,estadoordencompra,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Orden Compra",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoOrdenCompra(String sTipo,Row row,Workbook workbook) {
		
		EstadoOrdenCompraConstantesFunciones.generarExcelReporteHeaderEstadoOrdenCompra(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoOrdenCompras(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoOrdenCompra> estadoordencomprasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoordencompra_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoOrdenCompras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoOrdenCompra estadoordencompra : estadoordencomprasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoOrdenCompraConstantesFunciones.getEstadoOrdenCompraDescripcion(estadoordencompra));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoOrdenCompraConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoOrdenCompraConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoordencompra.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoOrdenCompraConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoOrdenCompraConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoordencompra.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Orden Compra",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoOrdenCompras(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoOrdenCompra> estadoordencomprasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoOrdenCompra> estadoordencomprasRespaldo=null;
		
		classes=EstadoOrdenCompraConstantesFunciones.getClassesRelationshipsOfEstadoOrdenCompra(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadoordencompraLogic.setDatosCliente(this.datosCliente);
		this.estadoordencompraLogic.setDatosDeep(this.datosDeep);
		this.estadoordencompraLogic.setIsConDeep(true);
		
		estadoordencomprasRespaldo=this.estadoordencompraLogic.getEstadoOrdenCompras();
		
		this.estadoordencompraLogic.setEstadoOrdenCompras(estadoordencomprasParaReportes);	
		this.estadoordencompraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadoordencomprasParaReportes=this.estadoordencompraLogic.getEstadoOrdenCompras();
		this.estadoordencompraLogic.setEstadoOrdenCompras(estadoordencomprasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoordencompra_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoOrdenCompras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoOrdenCompra("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoOrdenCompra estadoordencompra : estadoordencomprasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoOrdenCompra("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoOrdenCompraConstantesFunciones.generarExcelReporteDataEstadoOrdenCompra("NORMAL",row,workbook,estadoordencompra,cellStyleDataAux);
		
			
			


				//OrdenCompra
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(OrdenCompraConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadoordencompra.getOrdenCompras()!=null && estadoordencompra.getOrdenCompras().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(OrdenCompraConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					OrdenCompraConstantesFunciones.generarExcelReporteHeaderOrdenCompra("RELACIONADO",row,workbook);
				}

				if(estadoordencompra.getOrdenCompras()!=null) {
					i2=0;
					for(OrdenCompra ordencompra : estadoordencompra.getOrdenCompras()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						OrdenCompraConstantesFunciones.generarExcelReporteDataOrdenCompra("RELACIONADO",row,workbook,ordencompra,cellStyleDataAuxHijo);
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
		cell.setCellValue(EstadoOrdenCompraConstantesFunciones.getEstadoOrdenCompraDescripcion(estadoordencompra));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Orden Compra",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoOrdenCompra() throws Exception {		
		this.startProcessEstadoOrdenCompra(true);
	}
	
	public void startProcessEstadoOrdenCompra(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoOrdenCompra, this.jScrollPanelDatosEstadoOrdenCompra,this.jPanelPaginacionEstadoOrdenCompra, this.jScrollPanelDatosEdicionEstadoOrdenCompra, this.jPanelAccionesEstadoOrdenCompra,this.jPanelAccionesFormularioEstadoOrdenCompra,this.jmenuBarEstadoOrdenCompra,this.jmenuBarDetalleEstadoOrdenCompra,this.jTtoolBarEstadoOrdenCompra,this.jTtoolBarDetalleEstadoOrdenCompra);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoOrdenCompra=null; 
		
		final JPanel jPanelParametrosReportesEstadoOrdenCompra=this.jPanelParametrosReportesEstadoOrdenCompra;
		//final JScrollPane jScrollPanelDatosEstadoOrdenCompra=this.jScrollPanelDatosEstadoOrdenCompra;
		final JTable jTableDatosEstadoOrdenCompra=this.jTableDatosEstadoOrdenCompra;		
		final JPanel jPanelPaginacionEstadoOrdenCompra=this.jPanelPaginacionEstadoOrdenCompra;
		//final JScrollPane jScrollPanelDatosEdicionEstadoOrdenCompra=this.jScrollPanelDatosEdicionEstadoOrdenCompra;
		final JPanel jPanelAccionesEstadoOrdenCompra=this.jPanelAccionesEstadoOrdenCompra;
		
		JPanel jPanelCamposAuxiliarEstadoOrdenCompra=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoOrdenCompra=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) {
			jPanelCamposAuxiliarEstadoOrdenCompra=this.jInternalFrameDetalleFormEstadoOrdenCompra.jPanelCamposEstadoOrdenCompra;
			jPanelAccionesFormularioAuxiliarEstadoOrdenCompra=this.jInternalFrameDetalleFormEstadoOrdenCompra.jPanelAccionesFormularioEstadoOrdenCompra;
		}
		
		final JPanel jPanelCamposEstadoOrdenCompra=jPanelCamposAuxiliarEstadoOrdenCompra;
		final JPanel jPanelAccionesFormularioEstadoOrdenCompra=jPanelAccionesFormularioAuxiliarEstadoOrdenCompra;
		
		
		final JMenuBar jmenuBarEstadoOrdenCompra=this.jmenuBarEstadoOrdenCompra;
		final JToolBar jTtoolBarEstadoOrdenCompra=this.jTtoolBarEstadoOrdenCompra;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoOrdenCompra=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoOrdenCompra=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) {
			jmenuBarDetalleAuxiliarEstadoOrdenCompra=this.jInternalFrameDetalleFormEstadoOrdenCompra.jmenuBarDetalleEstadoOrdenCompra;
			jTtoolBarDetalleAuxiliarEstadoOrdenCompra=this.jInternalFrameDetalleFormEstadoOrdenCompra.jTtoolBarDetalleEstadoOrdenCompra;
		}
		
		final JMenuBar jmenuBarDetalleEstadoOrdenCompra=jmenuBarDetalleAuxiliarEstadoOrdenCompra;
		final JToolBar jTtoolBarDetalleEstadoOrdenCompra=jTtoolBarDetalleAuxiliarEstadoOrdenCompra;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoOrdenCompra;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoOrdenCompra;
			processRunnable.jTableDatos=jTableDatosEstadoOrdenCompra;
			processRunnable.jPanelCampos=jPanelCamposEstadoOrdenCompra;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoOrdenCompra;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoOrdenCompra;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoOrdenCompra;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoOrdenCompra;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoOrdenCompra;
			processRunnable.jTtoolBar=jTtoolBarEstadoOrdenCompra;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoOrdenCompra;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoOrdenCompra ,jPanelParametrosReportesEstadoOrdenCompra,jTableDatosEstadoOrdenCompra, /*jScrollPanelDatosEstadoOrdenCompra,*/jPanelCamposEstadoOrdenCompra,jPanelPaginacionEstadoOrdenCompra, /*jScrollPanelDatosEdicionEstadoOrdenCompra,*/ jPanelAccionesEstadoOrdenCompra,jPanelAccionesFormularioEstadoOrdenCompra,jmenuBarEstadoOrdenCompra,jmenuBarDetalleEstadoOrdenCompra,jTtoolBarEstadoOrdenCompra,jTtoolBarDetalleEstadoOrdenCompra);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoOrdenCompra, jScrollPanelDatosEstadoOrdenCompra,jPanelPaginacionEstadoOrdenCompra, jScrollPanelDatosEdicionEstadoOrdenCompra, jPanelAccionesEstadoOrdenCompra,jPanelAccionesFormularioEstadoOrdenCompra,jmenuBarEstadoOrdenCompra,jmenuBarDetalleEstadoOrdenCompra,jTtoolBarEstadoOrdenCompra,jTtoolBarDetalleEstadoOrdenCompra);
						
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
	
	public void finishProcessEstadoOrdenCompra() {// throws Exception 
		this.finishProcessEstadoOrdenCompra(true);
	}
	
	public void finishProcessEstadoOrdenCompra(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoOrdenCompra, this.jScrollPanelDatosEstadoOrdenCompra,this.jPanelPaginacionEstadoOrdenCompra, this.jScrollPanelDatosEdicionEstadoOrdenCompra, this.jPanelAccionesEstadoOrdenCompra,this.jPanelAccionesFormularioEstadoOrdenCompra,this.jmenuBarEstadoOrdenCompra,this.jmenuBarDetalleEstadoOrdenCompra,this.jTtoolBarEstadoOrdenCompra,this.jTtoolBarDetalleEstadoOrdenCompra);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoOrdenCompra=null; 
		
		final JPanel jPanelParametrosReportesEstadoOrdenCompra=this.jPanelParametrosReportesEstadoOrdenCompra;
		//final JScrollPane jScrollPanelDatosEstadoOrdenCompra=this.jScrollPanelDatosEstadoOrdenCompra;
		final JTable jTableDatosEstadoOrdenCompra=this.jTableDatosEstadoOrdenCompra;		
		final JPanel jPanelPaginacionEstadoOrdenCompra=this.jPanelPaginacionEstadoOrdenCompra;
		//final JScrollPane jScrollPanelDatosEdicionEstadoOrdenCompra=this.jScrollPanelDatosEdicionEstadoOrdenCompra;
		final JPanel jPanelAccionesEstadoOrdenCompra=this.jPanelAccionesEstadoOrdenCompra;
		
		JPanel jPanelCamposAuxiliarEstadoOrdenCompra=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoOrdenCompra=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) {
			jPanelCamposAuxiliarEstadoOrdenCompra=this.jInternalFrameDetalleFormEstadoOrdenCompra.jPanelCamposEstadoOrdenCompra;
			jPanelAccionesFormularioAuxiliarEstadoOrdenCompra=this.jInternalFrameDetalleFormEstadoOrdenCompra.jPanelAccionesFormularioEstadoOrdenCompra;
		}
		
		final JPanel jPanelCamposEstadoOrdenCompra=jPanelCamposAuxiliarEstadoOrdenCompra;
		final JPanel jPanelAccionesFormularioEstadoOrdenCompra=jPanelAccionesFormularioAuxiliarEstadoOrdenCompra;
		
		
		final JMenuBar jmenuBarEstadoOrdenCompra=this.jmenuBarEstadoOrdenCompra;		
		final JToolBar jTtoolBarEstadoOrdenCompra=this.jTtoolBarEstadoOrdenCompra;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoOrdenCompra=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoOrdenCompra=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) {
			jmenuBarDetalleAuxiliarEstadoOrdenCompra=this.jInternalFrameDetalleFormEstadoOrdenCompra.jmenuBarDetalleEstadoOrdenCompra;
			jTtoolBarDetalleAuxiliarEstadoOrdenCompra=this.jInternalFrameDetalleFormEstadoOrdenCompra.jTtoolBarDetalleEstadoOrdenCompra;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoOrdenCompra=jmenuBarDetalleAuxiliarEstadoOrdenCompra;
		final JToolBar jTtoolBarDetalleEstadoOrdenCompra=jTtoolBarDetalleAuxiliarEstadoOrdenCompra;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoOrdenCompra;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoOrdenCompra;
			processRunnable.jTableDatos=jTableDatosEstadoOrdenCompra;
			processRunnable.jPanelCampos=jPanelCamposEstadoOrdenCompra;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoOrdenCompra;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoOrdenCompra;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoOrdenCompra;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoOrdenCompra;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoOrdenCompra;
			processRunnable.jTtoolBar=jTtoolBarEstadoOrdenCompra;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoOrdenCompra;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoOrdenCompra ,jPanelParametrosReportesEstadoOrdenCompra, jTableDatosEstadoOrdenCompra,/*jScrollPanelDatosEstadoOrdenCompra,*/jPanelCamposEstadoOrdenCompra,jPanelPaginacionEstadoOrdenCompra, /*jScrollPanelDatosEdicionEstadoOrdenCompra,*/ jPanelAccionesEstadoOrdenCompra,jPanelAccionesFormularioEstadoOrdenCompra,jmenuBarEstadoOrdenCompra,jmenuBarDetalleEstadoOrdenCompra,jTtoolBarEstadoOrdenCompra,jTtoolBarDetalleEstadoOrdenCompra));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoOrdenCompra(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoOrdenCompra(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoOrdenCompra(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoOrdenCompra(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoOrdenCompra,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoOrdenCompra,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoOrdenCompra(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoOrdenCompra,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoOrdenCompra,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadoordencompraConstantesFunciones.getsFinalQueryEstadoOrdenCompra();
		String  finalQueryPaginacionTodos=this.estadoordencompraConstantesFunciones.getsFinalQueryEstadoOrdenCompra();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoOrdenCompraConstantesFunciones.getArrayColumnasGlobalesNoEstadoOrdenCompra(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoOrdenCompraConstantesFunciones.getArrayColumnasGlobalesEstadoOrdenCompra(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoOrdenCompraConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadoordencomprasEliminados= new ArrayList<EstadoOrdenCompra>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoOrdenCompra();
		
				///*EstadoOrdenCompraSessionBean*/this.estadoordencompraSessionBean=new EstadoOrdenCompraSessionBean();
			
			if(this.estadoordencompraSessionBean==null) {
				this.estadoordencompraSessionBean=new EstadoOrdenCompraSessionBean();
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
					this.iNumeroPaginacion=EstadoOrdenCompraConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoOrdenCompraConstantesFunciones.getClassesForeignKeysOfEstadoOrdenCompra(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadoordencompra."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadoordencomprasAux= new ArrayList<EstadoOrdenCompra>();
			
				
			estadoordencompraLogic.setDatosCliente(this.datosCliente);
			estadoordencompraLogic.setDatosDeep(this.datosDeep);
			estadoordencompraLogic.setIsConDeep(true);
			
			
			estadoordencompraLogic.getEstadoOrdenCompraDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadoordencompraLogic.getTodosEstadoOrdenCompras(finalQueryGlobal,pagination);
					
					//estadoordencompraLogic.getTodosEstadoOrdenComprasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadoordencompraLogic.getEstadoOrdenCompras()==null|| estadoordencompraLogic.getEstadoOrdenCompras().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoordencomprasAux= new ArrayList<EstadoOrdenCompra>();
							estadoordencomprasAux.addAll(estadoordencompraLogic.getEstadoOrdenCompras());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoordencomprasAux= new ArrayList<EstadoOrdenCompra>();
							estadoordencomprasAux.addAll(estadoordencompras);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoordencompraLogic.getTodosEstadoOrdenCompras(finalQueryGlobal+"",this.pagination);												
							
							//estadoordencompraLogic.getTodosEstadoOrdenComprasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoOrdenCompras("Todos",estadoordencompraLogic.getEstadoOrdenCompras() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoordencompraLogic.setEstadoOrdenCompras(new ArrayList<EstadoOrdenCompra>());					
							estadoordencompraLogic.getEstadoOrdenCompras().addAll(estadoordencomprasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoordencompras=new ArrayList<EstadoOrdenCompra>();
							estadoordencompras.addAll(estadoordencomprasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoOrdenCompra=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoOrdenCompra=this.idActual;
				
				} else if(this.idEstadoOrdenCompraActual!=null && this.idEstadoOrdenCompraActual!=0L) {
					idEstadoOrdenCompra=idEstadoOrdenCompraActual;
				}
				
					
				this.sDetalleReporte=EstadoOrdenCompraConstantesFunciones.getDetalleIndicePorId(idEstadoOrdenCompra);
				
				this.estadoordencompras=new ArrayList<EstadoOrdenCompra>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadoordencompraLogic.getEntity(idEstadoOrdenCompra);
					
					//estadoordencompraLogic.getEntityWithConnection(idEstadoOrdenCompra);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoordencompraLogic.setEstadoOrdenCompras(new ArrayList<EstadoOrdenCompra>());
					estadoordencompraLogic.getEstadoOrdenCompras().add(estadoordencompraLogic.getEstadoOrdenCompra());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoordencompras=new ArrayList<EstadoOrdenCompra>();
					this.estadoordencompras.add(estadoordencompra);
				}
				
				if(estadoordencompraLogic.getEstadoOrdenCompra()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoOrdenCompra();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoOrdenCompra();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoordencompraLogic.getEstadoOrdenCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoordencompras.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoordencompraLogic.getEstadoOrdenCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoordencompras.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoOrdenCompra estadoordencompra) {
		Boolean permite=true;
		
		if(this.estadoordencompra.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoOrdenCompraConstantesFunciones.getOrderByListaEstadoOrdenCompra();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoOrdenCompraConstantesFunciones.getOrderByListaEstadoOrdenCompra();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoOrdenCompra estadoordencompra:estadoordencompraLogic.getEstadoOrdenCompras()) {
				if(estadoordencompra.getsType().equals(Constantes2.S_TOTALES)) {
					estadoordencompraTotales=estadoordencompra;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoOrdenCompra estadoordencompra:this.estadoordencompras) {
				if(estadoordencompra.getsType().equals(Constantes2.S_TOTALES)) {
					estadoordencompraTotales=estadoordencompra;
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
			this.estadoordencompraAux=new EstadoOrdenCompra();
			this.estadoordencompraAux.setsType(Constantes2.S_TOTALES);
			this.estadoordencompraAux.setIsNew(false);
			this.estadoordencompraAux.setIsChanged(false);
			this.estadoordencompraAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoOrdenCompraConstantesFunciones.TotalizarValoresFilaEstadoOrdenCompra(this.estadoordencompraLogic.getEstadoOrdenCompras(),this.estadoordencompraAux);
				
				this.estadoordencompraLogic.getEstadoOrdenCompras().add(this.estadoordencompraAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoOrdenCompraConstantesFunciones.TotalizarValoresFilaEstadoOrdenCompra(this.estadoordencompras,this.estadoordencompraAux);
				
				this.estadoordencompras.add(this.estadoordencompraAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadoordencompraTotales=new EstadoOrdenCompra();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoordencompraLogic.getEstadoOrdenCompras().remove(estadoordencompraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoordencompras.remove(estadoordencompraTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadoordencompraTotales=new EstadoOrdenCompra();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoOrdenCompra estadoordencompra:estadoordencompraLogic.getEstadoOrdenCompras()) {
				if(estadoordencompra.getsType().equals(Constantes2.S_TOTALES)) {
					estadoordencompraTotales=estadoordencompra;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoOrdenCompraConstantesFunciones.TotalizarValoresFilaEstadoOrdenCompra(this.estadoordencompraLogic.getEstadoOrdenCompras(),estadoordencompraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoOrdenCompra estadoordencompra:this.estadoordencompras) {
				if(estadoordencompra.getsType().equals(Constantes2.S_TOTALES)) {
					estadoordencompraTotales=estadoordencompra;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoOrdenCompraConstantesFunciones.TotalizarValoresFilaEstadoOrdenCompra(this.estadoordencompras,estadoordencompraTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosEstadoOrdenCompra() {
		this.isPermisoTodoEstadoOrdenCompra=false;
		this.isPermisoNuevoEstadoOrdenCompra=false;
		this.isPermisoActualizarEstadoOrdenCompra=false;
		this.isPermisoActualizarOriginalEstadoOrdenCompra=false;
		this.isPermisoEliminarEstadoOrdenCompra=false;
		this.isPermisoGuardarCambiosEstadoOrdenCompra=false;
		this.isPermisoConsultaEstadoOrdenCompra=false;
		this.isPermisoBusquedaEstadoOrdenCompra=false;
		this.isPermisoReporteEstadoOrdenCompra=false;		
		this.isPermisoOrdenEstadoOrdenCompra=false;		
		this.isPermisoPaginacionMedioEstadoOrdenCompra=false;		
		this.isPermisoPaginacionAltoEstadoOrdenCompra=false;
		this.isPermisoPaginacionTodoEstadoOrdenCompra=false;
		this.isPermisoCopiarEstadoOrdenCompra=false;		
		this.isPermisoVerFormEstadoOrdenCompra=false;		
		this.isPermisoDuplicarEstadoOrdenCompra=false;		
		this.isPermisoOrdenEstadoOrdenCompra=false;		
	}
	
	public void setPermisosUsuarioEstadoOrdenCompra(Boolean isPermiso) {
		this.isPermisoTodoEstadoOrdenCompra=isPermiso;
		this.isPermisoNuevoEstadoOrdenCompra=isPermiso;
		this.isPermisoActualizarEstadoOrdenCompra=isPermiso;
		this.isPermisoActualizarOriginalEstadoOrdenCompra=isPermiso;
		this.isPermisoEliminarEstadoOrdenCompra=isPermiso;
		this.isPermisoGuardarCambiosEstadoOrdenCompra=isPermiso;
		this.isPermisoConsultaEstadoOrdenCompra=isPermiso;
		this.isPermisoBusquedaEstadoOrdenCompra=isPermiso;
		this.isPermisoReporteEstadoOrdenCompra=isPermiso;
		this.isPermisoOrdenEstadoOrdenCompra=isPermiso;		
		this.isPermisoPaginacionMedioEstadoOrdenCompra=isPermiso;		
		this.isPermisoPaginacionAltoEstadoOrdenCompra=isPermiso;		
		this.isPermisoPaginacionTodoEstadoOrdenCompra=isPermiso;		
		this.isPermisoCopiarEstadoOrdenCompra=isPermiso;		
		this.isPermisoVerFormEstadoOrdenCompra=isPermiso;		
		this.isPermisoDuplicarEstadoOrdenCompra=isPermiso;
		this.isPermisoOrdenEstadoOrdenCompra=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoOrdenCompra(Boolean isPermiso) {
		//this.isPermisoTodoEstadoOrdenCompra=isPermiso;
		this.isPermisoNuevoEstadoOrdenCompra=isPermiso;
		this.isPermisoActualizarEstadoOrdenCompra=isPermiso;
		this.isPermisoActualizarOriginalEstadoOrdenCompra=isPermiso;
		this.isPermisoEliminarEstadoOrdenCompra=isPermiso;
		this.isPermisoGuardarCambiosEstadoOrdenCompra=isPermiso;
		//this.isPermisoConsultaEstadoOrdenCompra=isPermiso;
		//this.isPermisoBusquedaEstadoOrdenCompra=isPermiso;
		//this.isPermisoReporteEstadoOrdenCompra=isPermiso;
		//this.isPermisoOrdenEstadoOrdenCompra=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoOrdenCompra=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoOrdenCompra=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoOrdenCompra=isPermiso;		
		//this.isPermisoCopiarEstadoOrdenCompra=isPermiso;		
		//this.isPermisoDuplicarEstadoOrdenCompra=isPermiso;
		//this.isPermisoOrdenEstadoOrdenCompra=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoOrdenCompraClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(OrdenCompraConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoOrdenCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosOrdenCompra=false;
		this.isTienePermisosOrdenCompra=this.verificarGetPermisosUsuarioOpcionEstadoOrdenCompraClaseRelacionada(this.opcionsRelacionadas,OrdenCompraConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoOrdenCompra(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoOrdenCompraClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosOrdenCompra=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoOrdenCompraClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoOrdenCompraClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoOrdenCompraClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosOrdenCompra && this.jInternalFrameDetalleFormEstadoOrdenCompra!=null && this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jTabbedPaneRelacionesEstadoOrdenCompra.remove(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoOrdenCompra() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoOrdenCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoOrdenCompraConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoOrdenCompra=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoOrdenCompra=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoOrdenCompra=this.isPermisoActualizarEstadoOrdenCompra;
			this.isPermisoEliminarEstadoOrdenCompra=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoOrdenCompra=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoOrdenCompra=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoOrdenCompra=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoOrdenCompra=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoOrdenCompra=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoOrdenCompra=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoOrdenCompra=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoOrdenCompra=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoOrdenCompra=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoOrdenCompra=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoOrdenCompra=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoOrdenCompra=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoOrdenCompra=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoOrdenCompra.setToolTipText(this.jTableDatosEstadoOrdenCompra.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoOrdenCompra(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoOrdenCompra(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoOrdenCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoOrdenCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoOrdenCompra() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosOrdenCompra && this.estadoordencompraConstantesFunciones.mostrarOrdenCompraEstadoOrdenCompra && !EstadoOrdenCompraConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("OrdenCompra");
			reporte.setsDescripcion("OrdenCompra");
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
	
		
	public void inicializarCombosForeignKeyEstadoOrdenCompraListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoOrdenCompraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoOrdenCompraJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoOrdenCompraListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoOrdenCompraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoOrdenCompra()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoOrdenCompra()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoOrdenCompra(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoOrdenCompra()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoOrdenCompra();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoOrdenCompra(EstadoOrdenCompra estadoordencompra)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoOrdenCompra(EstadoOrdenCompra estadoordencompra,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoOrdenCompra()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoOrdenCompra()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoOrdenCompra()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoOrdenCompra()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoOrdenCompra()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoOrdenCompra()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoOrdenCompra(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoOrdenCompra()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoOrdenCompraBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoOrdenCompraBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoOrdenCompraBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadoordencompraSessionBean=new EstadoOrdenCompraSessionBean(); 
		this.estadoordencompraConstantesFunciones=new EstadoOrdenCompraConstantesFunciones(); 
		this.estadoordencompraBean=new EstadoOrdenCompra();//(this.estadoordencompraConstantesFunciones); 		
		this.estadoordencompraReturnGeneral=new EstadoOrdenCompraParameterReturnGeneral(); 
		
		this.estadoordencompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoordencompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoOrdenCompraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoOrdenCompraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoOrdenCompraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoOrdenCompra(true);
			
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
			
			this.estadoordencompraConstantesFunciones=new EstadoOrdenCompraConstantesFunciones(); 
			this.estadoordencompraBean=new EstadoOrdenCompra();//this.estadoordencompraConstantesFunciones); 			
			this.estadoordencompraReturnGeneral=new EstadoOrdenCompraParameterReturnGeneral(); 
		
			EstadoOrdenCompraBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Orden Compra Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadoordencompra=new EstadoOrdenCompra();
			this.estadoordencompras = new ArrayList<EstadoOrdenCompra>();
			this.estadoordencomprasAux = new ArrayList<EstadoOrdenCompra>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic=new EstadoOrdenCompraLogic();
				this.estadoordencompraLogic.getNewConnexionToDeep("");
			}
			
			//this.estadoordencompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadoordencompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoOrdenCompra);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoOrdenCompra!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoOrdenCompra);	
					}
					
					if(this.jInternalFrameImportacionEstadoOrdenCompra!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoOrdenCompra);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoOrdenCompra!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoOrdenCompra);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoOrdenCompra);
				this.jInternalFrameDetalleFormEstadoOrdenCompra.setVisible(false);
				this.jInternalFrameDetalleFormEstadoOrdenCompra.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoOrdenCompra!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoOrdenCompra);
					this.jInternalFrameReporteDinamicoEstadoOrdenCompra.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoOrdenCompra.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoOrdenCompra!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoOrdenCompra);
					this.jInternalFrameImportacionEstadoOrdenCompra.setVisible(false);
					this.jInternalFrameImportacionEstadoOrdenCompra.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoOrdenCompra!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoOrdenCompra);
					this.jInternalFrameOrderByEstadoOrdenCompra.setVisible(false);
					this.jInternalFrameOrderByEstadoOrdenCompra.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoOrdenCompraActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoOrdenCompraConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadoordencompraReturnGeneral=new EstadoOrdenCompraParameterReturnGeneral();
			
			this.estadoordencompraParameterGeneral=new EstadoOrdenCompraParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadoordencompraLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoOrdenCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(OrdenCompraConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoOrdenCompraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoordencompraSessionBean.getEsGuardarRelacionado(),this.estadoordencompraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoOrdenCompraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoordencompraSessionBean.getEsGuardarRelacionado(),this.estadoordencompraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoOrdenCompra=false;
			this.isVisibilidadCeldaDuplicarEstadoOrdenCompra=true;
			this.isVisibilidadCeldaCopiarEstadoOrdenCompra=true;
			this.isVisibilidadCeldaVerFormEstadoOrdenCompra=true;
			this.isVisibilidadCeldaOrdenEstadoOrdenCompra=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenCompra=false;
			this.isVisibilidadCeldaModificarEstadoOrdenCompra=false;
			this.isVisibilidadCeldaActualizarEstadoOrdenCompra=false;
			this.isVisibilidadCeldaEliminarEstadoOrdenCompra=false;
			this.isVisibilidadCeldaCancelarEstadoOrdenCompra=false;
			this.isVisibilidadCeldaGuardarEstadoOrdenCompra=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoOrdenCompra=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoOrdenCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoOrdenCompra();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoOrdenCompra(false);
			
			this.setPermisosUsuarioEstadoOrdenCompra();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoordencompraSessionBean.getEsGuardarRelacionado() 
				|| (this.estadoordencompraSessionBean.getEsGuardarRelacionado() && this.estadoordencompraSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoOrdenCompraClasesRelacionadas();
			}
			
			if(this.estadoordencompraSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoOrdenCompraClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoOrdenCompraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoOrdenCompra();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoOrdenCompra();
			}
			
			if(!this.isPermisoBusquedaEstadoOrdenCompra) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoOrdenCompra,this.isPermisoPaginacionMedioEstadoOrdenCompra,this.isPermisoPaginacionTodoEstadoOrdenCompra);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoOrdenCompraConstantesFunciones.getTiposSeleccionarEstadoOrdenCompra());
				
				this.tiposColumnasSelect=EstadoOrdenCompraConstantesFunciones.getTiposSeleccionarEstadoOrdenCompra(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoOrdenCompra();				
				//this.tiposRelacionesSelect=EstadoOrdenCompraConstantesFunciones.getTiposRelacionesEstadoOrdenCompra(true);
				
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
			//if(!this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoOrdenCompra();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoOrdenCompra(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoOrdenCompra(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoOrdenCompra() ;
			
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
			
			
			this.ordencompraLogic=new OrdenCompraLogic(); 
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
				estadoordencompraImplementable= (EstadoOrdenCompraImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoOrdenCompraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadoordencompraImplementableHome= (EstadoOrdenCompraImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoOrdenCompraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadoordencompras= new ArrayList<EstadoOrdenCompra>();
			this.estadoordencomprasEliminados= new ArrayList<EstadoOrdenCompra>();
						
			this.isEsNuevoEstadoOrdenCompra=false;
			this.esParaAccionDesdeFormularioEstadoOrdenCompra=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoOrdenCompra(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoOrdenCompra();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadoOrdenCompraBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoOrdenCompraConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoOrdenCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoOrdenCompra(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoOrdenCompra();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoOrdenCompra();
			}
			
			EstadoOrdenCompraBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoOrdenCompra(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoOrdenCompra: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoOrdenCompra() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(OrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(OrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoOrdenCompra")) {
				iIndex=this.jInternalFrameDetalleFormEstadoOrdenCompra.jTabbedPaneRelacionesEstadoOrdenCompra.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoOrdenCompra.jTabbedPaneRelacionesEstadoOrdenCompra.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoOrdenCompra.getSelectedRow();	
				
				

				if(sTitle.equals("OrdenCompras")) {
					if(!OrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoOrdenCompra();

						this.cargarParteTabPanelRelacionadaOrdenCompra(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoOrdenCompra();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaOrdenCompra(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoOrdenCompra.cargarSessionConBeanSwingJInternalFrameOrdenCompra(false,true,iIndex);
		this.jButtonOrdenCompraActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaOrdenCompra();

		//this.jTabbedPaneRelacionesEstadoOrdenCompra.updateUI();
		//this.jTabbedPaneRelacionesEstadoOrdenCompra.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoOrdenCompra.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("OrdenCompra")) {
				int row=this.jTableDatosEstadoOrdenCompra.getSelectedRow();
				jButtonOrdenCompraActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("OrdenCompra")) {

					if(this.isTienePermisosOrdenCompra && this.estadoordencompraConstantesFunciones.mostrarOrdenCompraEstadoOrdenCompra && !EstadoOrdenCompraConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="OrdenCompras"+"("+OrdenCompraConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("OrdenCompras");

						if(estadoordencompraConstantesFunciones.resaltarOrdenCompraEstadoOrdenCompra!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadoordencompraConstantesFunciones.resaltarOrdenCompraEstadoOrdenCompra);
						}

						jmenuItem.setEnabled(this.estadoordencompraConstantesFunciones.activarOrdenCompraEstadoOrdenCompra);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"OrdenCompra"));

						

						this.jInternalFrameDetalleFormEstadoOrdenCompra.jmenuDetalleEstadoOrdenCompra.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoOrdenCompra(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoOrdenCompra(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoOrdenCompra(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoOrdenCompraListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoOrdenCompra();
		
		this.cargarCombosFrameForeignKeyEstadoOrdenCompra();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoOrdenCompra();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoOrdenCompra();
		}
	}
	
	
	
	public void jButtonNuevoEstadoOrdenCompraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadoordencompraSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoOrdenCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
			
			
			if(jTableDatosEstadoOrdenCompra.getRowCount()>=1) {
				jTableDatosEstadoOrdenCompra.removeRowSelectionInterval(0, jTableDatosEstadoOrdenCompra.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoOrdenCompra=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoOrdenCompra(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoOrdenCompra(true);			
			//this.estadoordencompra=new EstadoOrdenCompra();
			//this.estadoordencompra.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoOrdenCompra(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoOrdenCompra() ;
			
			if(EstadoOrdenCompraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoOrdenCompra(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadoordencompra);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadoordencompra);				
			
			EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
			
			if(this.estadoordencompraSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoOrdenCompra: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoOrdenCompraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoOrdenCompra> estadoordencomprasSeleccionados=new ArrayList<EstadoOrdenCompra>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoOrdenCompra.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoOrdenCompra.getSelectedRows().length;			
			}
			
			estadoordencomprasSeleccionados=this.getEstadoOrdenComprasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoOrdenCompra--;			
				//EstadoOrdenCompra estadoordencompraAux= new EstadoOrdenCompra();			
				//estadoordencompraAux.setId(this.iIdNuevoEstadoOrdenCompra);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoOrdenCompra estadoordencompraOrigen=new EstadoOrdenCompra();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoOrdenCompra estadoordencompraOrigen : estadoordencomprasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoOrdenCompra.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadoordencompraOrigen =(EstadoOrdenCompra) this.estadoordencompraLogic.getEstadoOrdenCompras().toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoordencompraOrigen =(EstadoOrdenCompra) this.estadoordencompras.toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoOrdenCompra();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadoordencompra.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoOrdenCompra(estadoordencompraOrigen,this.estadoordencompra,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenCompra(this.estadoordencompra);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoordencompraLogic.getEstadoOrdenCompras().add(this.estadoordencompraAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoordencompras.add(this.estadoordencompraAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoOrdenCompra(false);
				
				this.jTableDatosEstadoOrdenCompra.setRowSelectionInterval(this.getIndiceNuevoEstadoOrdenCompra(), this.getIndiceNuevoEstadoOrdenCompra());
				
				int iLastRow =  this.jTableDatosEstadoOrdenCompra.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoOrdenCompra.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoOrdenCompra.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoOrdenCompra(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoOrdenCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoOrdenCompra> estadoordencomprasSeleccionados=new ArrayList<EstadoOrdenCompra>();									
		
			EstadoOrdenCompra estadoordencompraOrigen=new EstadoOrdenCompra();
			EstadoOrdenCompra estadoordencompraDestino=new EstadoOrdenCompra();
				
			estadoordencomprasSeleccionados=this.getEstadoOrdenComprasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoOrdenCompra.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadoordencomprasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoOrdenCompra.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoordencompraOrigen =(EstadoOrdenCompra) this.estadoordencompraLogic.getEstadoOrdenCompras().toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoordencompraOrigen =(EstadoOrdenCompra) this.estadoordencompras.toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoordencompraDestino =(EstadoOrdenCompra) this.estadoordencompraLogic.getEstadoOrdenCompras().toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoordencompraDestino =(EstadoOrdenCompra) this.estadoordencompras.toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadoordencompraOrigen =estadoordencomprasSeleccionados.get(0);
				estadoordencompraDestino =estadoordencomprasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoOrdenCompra(estadoordencompraOrigen,estadoordencompraDestino,true,false);
				
				estadoordencompraDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoordencompraDestino,estadoordencompraLogic.getEstadoOrdenCompras());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoordencompraDestino,estadoordencompras);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoOrdenCompra(false);
				
				//this.jTableDatosEstadoOrdenCompra.setRowSelectionInterval(this.getIndiceNuevoEstadoOrdenCompra(), this.getIndiceNuevoEstadoOrdenCompra());
				
				int iLastRow =  this.jTableDatosEstadoOrdenCompra.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoOrdenCompra.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoOrdenCompra.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoOrdenCompra(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoOrdenCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoOrdenCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoOrdenCompra.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoOrdenCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoOrdenCompra.isVisible();
			
			
			this.jPanelParametrosReportesEstadoOrdenCompra.setVisible(!isVisible);
			this.jPanelPaginacionEstadoOrdenCompra.setVisible(!isVisible);
			this.jPanelAccionesEstadoOrdenCompra.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoOrdenCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoOrdenCompra();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoOrdenCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoOrdenCompra();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoOrdenCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoOrdenCompra();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoOrdenCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoOrdenCompra();
			
			this.abrirFrameOrderByEstadoOrdenCompra();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoOrdenCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoOrdenCompra();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoOrdenCompra(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoOrdenCompra);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoOrdenCompra.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoOrdenCompra.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoOrdenCompra.setSize(this.jInternalFrameDetalleFormEstadoOrdenCompra.iWidthFormulario,this.jInternalFrameDetalleFormEstadoOrdenCompra.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoOrdenCompra.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoOrdenCompra.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoOrdenCompra.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoOrdenCompra.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoOrdenCompra.jContentPaneDetalleEstadoOrdenCompra.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoOrdenCompra.jTabbedPaneRelacionesEstadoOrdenCompra.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoOrdenCompra.jContentPaneDetalleEstadoOrdenCompra.getWidth(),EstadoOrdenCompraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoOrdenCompra.jTabbedPaneRelacionesEstadoOrdenCompra.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoOrdenCompra.jContentPaneDetalleEstadoOrdenCompra.getWidth(),EstadoOrdenCompraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoOrdenCompra.jTabbedPaneRelacionesEstadoOrdenCompra.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoOrdenCompra.jContentPaneDetalleEstadoOrdenCompra.getWidth(),EstadoOrdenCompraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(OrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaOrdenCompra();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoOrdenCompra.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoOrdenCompra.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoOrdenCompra() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoOrdenCompra==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoOrdenCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoOrdenCompra,false,this);
				} else {
					this.jInternalFrameOrderByEstadoOrdenCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoOrdenCompra,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoOrdenCompra);
				this.jInternalFrameOrderByEstadoOrdenCompra.setVisible(false);
				this.jInternalFrameOrderByEstadoOrdenCompra.setSelected(false);
				
				this.jInternalFrameOrderByEstadoOrdenCompra.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoOrdenCompra"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoOrdenCompra();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoOrdenCompra() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoOrdenCompra==null) {
				
				this.jInternalFrameImportacionEstadoOrdenCompra=new ImportacionJInternalFrame(EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoOrdenCompra);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoOrdenCompra);
				this.jInternalFrameImportacionEstadoOrdenCompra.setVisible(false);
				this.jInternalFrameImportacionEstadoOrdenCompra.setSelected(false);


				this.jInternalFrameImportacionEstadoOrdenCompra.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoOrdenCompra"));
				this.jInternalFrameImportacionEstadoOrdenCompra.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoOrdenCompra"));
				this.jInternalFrameImportacionEstadoOrdenCompra.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoOrdenCompra"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoOrdenCompra() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoOrdenCompra==null) {
				this.jInternalFrameReporteDinamicoEstadoOrdenCompra=new ReporteDinamicoJInternalFrame(EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoOrdenCompra);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoOrdenCompra);
				this.jInternalFrameReporteDinamicoEstadoOrdenCompra.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoOrdenCompra.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoOrdenCompra"));
				this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoOrdenCompra"));
				this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoOrdenCompra"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoOrdenCompra();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaOrdenCompra() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.jScrollPanelDatosOrdenCompra.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoOrdenCompra.jContentPaneDetalleEstadoOrdenCompra.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.jScrollPanelDatosOrdenCompra.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.jScrollPanelDatosOrdenCompra.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.jScrollPanelDatosOrdenCompra.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoOrdenCompra() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoOrdenCompra);
			
	       	this.jInternalFrameDetalleFormEstadoOrdenCompra.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoOrdenCompra.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoOrdenCompra.dispose();
			//this.jInternalFrameDetalleFormEstadoOrdenCompra=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoOrdenCompra() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoOrdenCompra.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoOrdenCompra.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoOrdenCompra() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoOrdenCompra.setVisible(true);
	        this.jInternalFrameImportacionEstadoOrdenCompra.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoOrdenCompra() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoOrdenCompra.setVisible(true);
	        this.jInternalFrameOrderByEstadoOrdenCompra.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoOrdenCompra() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoOrdenCompra.setVisible(false);
	        this.jInternalFrameOrderByEstadoOrdenCompra.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoOrdenCompra() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoOrdenCompra.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoOrdenCompra.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoOrdenCompra() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoOrdenCompra.setVisible(false);
	        this.jInternalFrameImportacionEstadoOrdenCompra.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoOrdenCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoOrdenCompra(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoOrdenCompra(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoOrdenCompra.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoOrdenCompra(true);
			//this.isEsNuevoEstadoOrdenCompra=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompra =(EstadoOrdenCompra) this.estadoordencompraLogic.getEstadoOrdenCompras().toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoordencompra =(EstadoOrdenCompra) this.estadoordencompras.toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoOrdenCompra("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoOrdenCompra(false) ;
			
			if(estadoordencompraSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencompraSessionBean.getEsGuardarRelacionado() && OrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonOrdenCompraActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoOrdenCompraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoOrdenCompra(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoOrdenCompra(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoOrdenCompraActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoOrdenCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordencompra =(EstadoOrdenCompra) this.estadoordencompraLogic.getEstadoOrdenCompras().toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoordencompra =(EstadoOrdenCompra) this.estadoordencompras.toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoOrdenCompra(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoOrdenCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoOrdenCompra.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoOrdenCompra(true);
			//this.isEsNuevoEstadoOrdenCompra=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompra =(EstadoOrdenCompra) this.estadoordencompraLogic.getEstadoOrdenCompras().toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoordencompra =(EstadoOrdenCompra) this.estadoordencompras.toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadoordencompra.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoOrdenCompra("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoOrdenCompra(false) ;
			
			if(EstadoOrdenCompraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoOrdenCompra(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoOrdenCompra(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoOrdenCompraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoOrdenCompra(false);
			
			//if(!this.isEsNuevoEstadoOrdenCompra) {								
				int intSelectedRow = this.jTableDatosEstadoOrdenCompra.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordencompra =(EstadoOrdenCompra) this.estadoordencompraLogic.getEstadoOrdenCompras().toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoordencompra =(EstadoOrdenCompra) this.estadoordencompras.toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoOrdenCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoOrdenCompra(this.estadoordencompra,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenCompra(this.estadoordencompra);
				
			}
			
			if(this.permiteMantenimiento(this.estadoordencompra)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoOrdenCompra=true;
					this.inicializarActualizarBindingTablaEstadoOrdenCompra(false);
					this.isEsNuevoEstadoOrdenCompra=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoOrdenCompra=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoOrdenCompra=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoOrdenCompra(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoOrdenCompra(false);
				
				this.habilitarDeshabilitarControlesEstadoOrdenCompra(false);
			
												
				
				if(EstadoOrdenCompraJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoOrdenCompra();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoOrdenCompraActionPerformed(evt,estadoordencompraSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoOrdenCompra(this.estadoordencompra,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoOrdenCompra.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadoordencompraSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadoordencompra.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoOrdenCompra.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoOrdenCompra.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoOrdenCompraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoOrdenCompra.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompra =(EstadoOrdenCompra) this.estadoordencompraLogic.getEstadoOrdenCompras().toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				this.estadoordencompra.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoordencompra =(EstadoOrdenCompra) this.estadoordencompras.toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				this.estadoordencompra.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadoordencompra)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoOrdenCompraModel) this.jTableDatosEstadoOrdenCompra.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoOrdenCompra=true;
				this.inicializarActualizarBindingTablaEstadoOrdenCompra(false);
				this.isEsNuevoEstadoOrdenCompra=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoOrdenCompra(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoOrdenCompra(false);
				
				this.habilitarDeshabilitarControlesEstadoOrdenCompra(false);
				
				
				
				if(EstadoOrdenCompraJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoOrdenCompra();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoOrdenCompraActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoOrdenCompra.getRowCount()>=1) {
				jTableDatosEstadoOrdenCompra.removeRowSelectionInterval(0, jTableDatosEstadoOrdenCompra.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoOrdenCompra(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoOrdenCompra(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoOrdenCompra(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoOrdenCompra(false) ;
			
			this.isEsNuevoEstadoOrdenCompra=false;
			
			if(EstadoOrdenCompraJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoOrdenCompra();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoOrdenCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoOrdenCompra(false);
				
				//SI ES MANUAL
				if(EstadoOrdenCompraJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoOrdenCompra();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoOrdenCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoOrdenCompra--;			
			//EstadoOrdenCompra estadoordencompraAux= new EstadoOrdenCompra();			
			//estadoordencompraAux.setId(this.iIdNuevoEstadoOrdenCompra);
			
			if(this.jInternalFrameDetalleFormEstadoOrdenCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoOrdenCompra();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenCompra(this.estadoordencompra);
			
			this.estadoordencompra.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadoordencompraLogic.getEstadoOrdenCompras().add(this.estadoordencompraAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadoordencompras.add(this.estadoordencompraAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoOrdenCompra(false);
			
			this.jTableDatosEstadoOrdenCompra.setRowSelectionInterval(this.getIndiceNuevoEstadoOrdenCompra(), this.getIndiceNuevoEstadoOrdenCompra());
			
			int iLastRow =  this.jTableDatosEstadoOrdenCompra.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoOrdenCompra.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoOrdenCompra.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoOrdenCompra(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoOrdenCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoOrdenCompra(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoOrdenCompra(false);
			
			//SI ES MANUAL
			if(EstadoOrdenCompraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoOrdenCompra();
			}
			
			//this.abrirFrameTreeEstadoOrdenCompra();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoOrdenCompraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Orden CompraS ?", "MANTENIMIENTO DE Estado Orden Compra", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoOrdenCompra.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoOrdenCompra();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadoordencompraReturnGeneral=estadoordencompraLogic.procesarImportacionEstadoOrdenComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadoordencompraParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoOrdenCompraReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoOrdenCompraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoOrdenCompra.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoOrdenCompra.setFileImportacion(this.jInternalFrameImportacionEstadoOrdenCompra.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoOrdenCompra.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoOrdenCompra.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoOrdenCompra.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoOrdenCompra.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoOrdenCompraActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoOrdenCompra> estadoordencomprasSeleccionados=new ArrayList<EstadoOrdenCompra>();		

		estadoordencomprasSeleccionados=this.getEstadoOrdenComprasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoOrdenCompraBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoOrdenCompraBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoOrdenCompras("Todos",estadoordencomprasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Orden Compra",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoOrdenCompraConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoOrdenCompraConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoOrdenCompraConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoOrdenCompraConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoOrdenCompraConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoOrdenCompraConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoOrdenCompraConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoOrdenCompraConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoOrdenCompraActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoOrdenCompra> estadoordencomprasSeleccionados=new ArrayList<EstadoOrdenCompra>();		
		
		estadoordencomprasSeleccionados=this.getEstadoOrdenComprasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoordencompra";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoOrdenCompras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoOrdenCompraConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoOrdenCompraConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoOrdenCompra estadoordencompra:estadoordencomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoordencompra.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoOrdenCompraConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoOrdenCompraConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoOrdenCompra estadoordencompra:estadoordencomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoordencompra.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoOrdenCompra(row);				
			//	iRow++;
			//}				
			
			//for(EstadoOrdenCompra estadoordencompraAux:estadoordencomprasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoOrdenCompra(estadoordencompraAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Orden Compra",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadoordencompraLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoOrdenCompra(false);
			
			//SI ES MANUAL
			if(EstadoOrdenCompraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoOrdenCompra();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoOrdenCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoOrdenCompra(false);
			
			//SI ES MANUAL
			if(EstadoOrdenCompraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoOrdenCompra();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoOrdenCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoOrdenCompra(false);
			
			//SI ES MANUAL
			if(EstadoOrdenCompraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoOrdenCompra();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordencompraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoOrdenCompra() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoOrdenCompra.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoOrdenCompra.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoOrdenCompra.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoOrdenCompra.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoOrdenCompra.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoOrdenCompra.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoOrdenCompra.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoOrdenCompra(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoOrdenCompra(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoOrdenCompra(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoOrdenCompra(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoOrdenCompra(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoOrdenCompra(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoOrdenCompra(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoOrdenCompra(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoOrdenCompraJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoOrdenCompraJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoOrdenCompra() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoOrdenCompra();
		
		this.inicializarActualizarBindingBotonesManualEstadoOrdenCompra(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoOrdenCompra();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoOrdenCompra() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoOrdenCompra(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoOrdenCompra(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoOrdenCompra.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoOrdenCompra.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoOrdenCompra.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoOrdenCompra.jCheckBoxPostAccionNuevoEstadoOrdenCompra.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoOrdenCompra.jCheckBoxPostAccionSinCerrarEstadoOrdenCompra.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoOrdenCompra.jCheckBoxPostAccionSinMensajeEstadoOrdenCompra.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoOrdenCompra.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoOrdenCompra.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoOrdenCompra.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) {
				this.jInternalFrameDetalleFormEstadoOrdenCompra.jCheckBoxPostAccionNuevoEstadoOrdenCompra.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoOrdenCompra.jCheckBoxPostAccionSinCerrarEstadoOrdenCompra.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoOrdenCompra.jCheckBoxPostAccionSinMensajeEstadoOrdenCompra.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoOrdenCompra.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoOrdenCompra.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoOrdenCompra.jComboBoxTiposAccionesFormularioEstadoOrdenCompra.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoOrdenCompra.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoOrdenCompra!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoOrdenCompra.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoOrdenCompra.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoOrdenCompra.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoOrdenCompra.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoOrdenCompra!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoOrdenCompra.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoOrdenCompra.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoOrdenCompra(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoOrdenCompraJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoOrdenCompra(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoOrdenCompra() throws Exception {
		try	{
			if(EstadoOrdenCompraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoOrdenCompra();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoOrdenCompra() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jComboBoxTiposAccionesFormularioEstadoOrdenCompra.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jComboBoxTiposAccionesFormularioEstadoOrdenCompra.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoOrdenCompra() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoOrdenCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoOrdenCompra.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoOrdenCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoOrdenCompra.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoOrdenCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoOrdenCompra.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoOrdenCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoOrdenCompra.addItem(reporte);
			}
			
			
			if(!this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoOrdenCompra.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoOrdenCompra.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoOrdenCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoOrdenCompra.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoOrdenCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoOrdenCompra.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoOrdenCompra.jComboBoxTiposAccionesFormularioEstadoOrdenCompra.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoOrdenCompra.jComboBoxTiposAccionesFormularioEstadoOrdenCompra.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoOrdenCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoOrdenCompra.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoOrdenCompra.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoOrdenCompra();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoOrdenCompra() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoOrdenCompra!=null) {
				this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoOrdenCompra!=null) {
				this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoOrdenCompra!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoOrdenCompra()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoOrdenCompra(Boolean esInicializar) throws Exception {				
		if(EstadoOrdenCompraJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoOrdenCompra();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoOrdenCompra() throws Exception {
		this.inicializarActualizarBindingTablaEstadoOrdenCompra(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoOrdenCompra() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoOrdenCompra.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoOrdenCompra.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoOrdenCompra.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoOrdenCompraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoOrdenCompra.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoOrdenCompra.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoOrdenCompraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoOrdenCompraOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoOrdenCompraOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoOrdenCompraPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoOrdenCompra.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoOrdenCompra.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoOrdenCompraPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoOrdenCompra.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoOrdenCompra(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadoordencompraLogic.getEstadoOrdenCompras().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadoordencompras.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoOrdenCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoOrdenCompra.setModel(new EstadoOrdenCompraModel(this.estadoordencompraLogic.getEstadoOrdenCompras(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoOrdenCompra.setModel(new EstadoOrdenCompraModel(this.estadoordencompras,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoOrdenCompra!=null && this.jInternalFrameOrderByEstadoOrdenCompra.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoOrdenCompra();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoOrdenCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoOrdenCompra,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoOrdenCompraPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO,estadoordencompraConstantesFunciones.resaltarSeleccionarEstadoOrdenCompra,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO,estadoordencompraConstantesFunciones.resaltarSeleccionarEstadoOrdenCompra,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoOrdenCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoOrdenCompra,EstadoOrdenCompraConstantesFunciones.LABEL_ID));

		if(this.estadoordencompraConstantesFunciones.mostraridEstadoOrdenCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoOrdenCompraConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadoordencompraConstantesFunciones.resaltaridEstadoOrdenCompra,this.estadoordencompraConstantesFunciones.activaridEstadoOrdenCompra,this,true,"idEstadoOrdenCompra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoordencompraConstantesFunciones.resaltaridEstadoOrdenCompra,this.estadoordencompraConstantesFunciones.activaridEstadoOrdenCompra,this,true,"idEstadoOrdenCompra","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoOrdenCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoOrdenCompra,EstadoOrdenCompraConstantesFunciones.LABEL_CODIGO));

		if(this.estadoordencompraConstantesFunciones.mostrarcodigoEstadoOrdenCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoOrdenCompraConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoordencompraConstantesFunciones.resaltarcodigoEstadoOrdenCompra,this.estadoordencompraConstantesFunciones.activarcodigoEstadoOrdenCompra,this,true,"codigoEstadoOrdenCompra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoordencompraConstantesFunciones.resaltarcodigoEstadoOrdenCompra,this.estadoordencompraConstantesFunciones.activarcodigoEstadoOrdenCompra,this,true,"codigoEstadoOrdenCompra","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoOrdenCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoOrdenCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoOrdenCompra,EstadoOrdenCompraConstantesFunciones.LABEL_NOMBRE));

		if(this.estadoordencompraConstantesFunciones.mostrarnombreEstadoOrdenCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoOrdenCompraConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoordencompraConstantesFunciones.resaltarnombreEstadoOrdenCompra,this.estadoordencompraConstantesFunciones.activarnombreEstadoOrdenCompra,this,true,"nombreEstadoOrdenCompra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoordencompraConstantesFunciones.resaltarnombreEstadoOrdenCompra,this.estadoordencompraConstantesFunciones.activarnombreEstadoOrdenCompra,this,true,"nombreEstadoOrdenCompra","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoOrdenCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadoordencompraSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosOrdenCompra && this.estadoordencompraConstantesFunciones.mostrarOrdenCompraEstadoOrdenCompra && !EstadoOrdenCompraConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("OrdenCompras");
				tableColumn.setHeaderValue("OrdenCompras");
				tableColumn.setCellRenderer(new OrdenCompraTableCell(estadoordencompraConstantesFunciones.resaltarOrdenCompraEstadoOrdenCompra,this,this.estadoordencompraConstantesFunciones.activarOrdenCompraEstadoOrdenCompra));
				tableColumn.setCellEditor(new OrdenCompraTableCell(estadoordencompraConstantesFunciones.resaltarOrdenCompraEstadoOrdenCompra,this,this.estadoordencompraConstantesFunciones.activarOrdenCompraEstadoOrdenCompra));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoOrdenCompra.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoordencompraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoordencompraSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoOrdenCompra.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoordencompraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoordencompraSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoOrdenCompra.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoOrdenCompra && this.isPermisoGuardarCambiosEstadoOrdenCompra) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadoordencompraSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadoordencompraSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoOrdenCompra.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadoordencompraSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoOrdenCompra.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoOrdenCompra.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoOrdenCompra && this.isPermisoGuardarCambiosEstadoOrdenCompra) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadoordencompraSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoOrdenCompra && this.isPermisoGuardarCambiosEstadoOrdenCompra) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoOrdenCompra.moveColumn(this.jTableDatosEstadoOrdenCompra.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoOrdenCompra.moveColumn(this.jTableDatosEstadoOrdenCompra.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadoordencompraSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoOrdenCompra.moveColumn(this.jTableDatosEstadoOrdenCompra.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoOrdenCompra.moveColumn(this.jTableDatosEstadoOrdenCompra.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoOrdenCompra.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoOrdenCompra.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoOrdenCompra,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoOrdenCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoOrdenCompra.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoOrdenCompra.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoOrdenCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoOrdenCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoOrdenCompra.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoOrdenCompra.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoOrdenCompra.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadoordencompraLogic.getEstadoOrdenCompras().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadoordencompras.size()-1;
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
		//this.jTableDatosEstadoOrdenCompra.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoOrdenCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoOrdenCompra();
			
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
				
				//this.isEsNuevoEstadoOrdenCompra=false;
					
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
			
				if(this.estadoordencompraSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoOrdenCompra==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoOrdenCompra.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoOrdenCompra.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordencompra =(EstadoOrdenCompra) this.estadoordencompraLogic.getEstadoOrdenCompras().toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoordencompra =(EstadoOrdenCompra) this.estadoordencompras.toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadoordencompra.getsType().equals("DUPLICADO")
				   || this.estadoordencompra.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoOrdenCompra=true;
				
				} else {
					this.isEsNuevoEstadoOrdenCompra=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
					if(this.estadoordencompra.getId()>=0 && !this.estadoordencompra.getIsNew()) {						
						this.isEsNuevoEstadoOrdenCompra=false;
						
					} else {
						this.isEsNuevoEstadoOrdenCompra=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoOrdenCompra(esRelaciones);						
				
				this.seleccionarEstadoOrdenCompra(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadoordencompra.getId()<0) {
					this.isEsNuevoEstadoOrdenCompra=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoOrdenCompra(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoOrdenCompra(evt,rowIndex);
				}	
				
				if(this.estadoordencompraSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoOrdenCompra: " + this.dDif); 
					}
				}								
				
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoOrdenCompra(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadoordencompra)) {
					if(this.estadoordencompra.getId()>0) {
						this.estadoordencompra.setIsDeleted(true);
						
						this.estadoordencomprasEliminados.add(this.estadoordencompra);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoordencompraLogic.getEstadoOrdenCompras().remove(this.estadoordencompra);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoordencompras.remove(this.estadoordencompra);				
					}
					
					
					((EstadoOrdenCompraModel) this.jTableDatosEstadoOrdenCompra.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoOrdenCompra(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoOrdenCompra(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoOrdenCompra) {
			
			if(this.jInternalFrameDetalleFormEstadoOrdenCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoOrdenCompra.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoOrdenCompra.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordencompra =(EstadoOrdenCompra) this.estadoordencompraLogic.getEstadoOrdenCompras().toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoordencompra =(EstadoOrdenCompra) this.estadoordencompras.toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoOrdenCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoOrdenCompra(this.estadoordencompra);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoOrdenCompra("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoOrdenCompra(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoOrdenCompra() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoOrdenCompra(EstadoOrdenCompra estadoordencompra) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoOrdenCompra(estadoordencompra,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoOrdenCompra(EstadoOrdenCompra estadoordencompra,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoOrdenCompra(estadoordencompra);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoOrdenCompra(estadoordencompra,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoOrdenCompra(estadoordencompra);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoOrdenCompra(EstadoOrdenCompra estadoordencompra) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoOrdenCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jTextFieldidEstadoOrdenCompra.setText(estadoordencompra.getId().toString());
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jTextFieldcodigoEstadoOrdenCompra.setText(estadoordencompra.getcodigo());
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jTextAreanombreEstadoOrdenCompra.setText(estadoordencompra.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoOrdenCompra estadoordencompraLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadoordencompraLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoOrdenCompra estadoordencompraLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadoordencompraLocal=this.estadoordencompra;
			} else {
				estadoordencompraLocal=this.estadoordencompraAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadoordencompraLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoOrdenCompra(estadoordencompraLocal,true);
					
					if(estadoordencompraSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadoordencompraLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadoordencompraLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoOrdenCompra(EstadoOrdenCompra estadoordencompra,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoOrdenCompra(estadoordencompra,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenCompra(estadoordencompra);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoOrdenCompra(EstadoOrdenCompra estadoordencompra,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoOrdenCompra(estadoordencompra,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoOrdenCompra(EstadoOrdenCompra estadoordencompra,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoOrdenCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoOrdenCompra.jTextFieldidEstadoOrdenCompra.getText()==null || this.jInternalFrameDetalleFormEstadoOrdenCompra.jTextFieldidEstadoOrdenCompra.getText()=="" || this.jInternalFrameDetalleFormEstadoOrdenCompra.jTextFieldidEstadoOrdenCompra.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoOrdenCompra.jTextFieldidEstadoOrdenCompra.setText("0");
			}

			if(conColumnasBase) {estadoordencompra.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoOrdenCompra.jTextFieldidEstadoOrdenCompra.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoOrdenCompraConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoOrdenCompra.jLabelIdEstadoOrdenCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoordencompra.setcodigo(this.jInternalFrameDetalleFormEstadoOrdenCompra.jTextFieldcodigoEstadoOrdenCompra.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoOrdenCompraConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoOrdenCompra.jLabelcodigoEstadoOrdenCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoordencompra.setnombre(this.jInternalFrameDetalleFormEstadoOrdenCompra.jTextAreanombreEstadoOrdenCompra.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoOrdenCompraConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoOrdenCompra.jLabelnombreEstadoOrdenCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoOrdenCompra(EstadoOrdenCompra estadoordencompraBean,EstadoOrdenCompra estadoordencompra,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoOrdenCompra(EstadoOrdenCompra estadoordencompraOrigen,EstadoOrdenCompra estadoordencompra,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoordencompraOrigen.getId()!=null && !estadoordencompraOrigen.getId().equals(0L))) {estadoordencompra.setId(estadoordencompraOrigen.getId());}}
			if(conDefault || (!conDefault && estadoordencompraOrigen.getcodigo()!=null && !estadoordencompraOrigen.getcodigo().equals(""))) {estadoordencompra.setcodigo(estadoordencompraOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadoordencompraOrigen.getnombre()!=null && !estadoordencompraOrigen.getnombre().equals(""))) {estadoordencompra.setnombre(estadoordencompraOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoOrdenCompra(EstadoOrdenCompra estadoordencompra) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jTextFieldidEstadoOrdenCompra.setText(estadoordencompra.getId().toString());
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jTextFieldcodigoEstadoOrdenCompra.setText(estadoordencompra.getcodigo());
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jTextAreanombreEstadoOrdenCompra.setText(estadoordencompra.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoOrdenCompra(EstadoOrdenCompraBean estadoordencompraBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jTextFieldidEstadoOrdenCompra.setText(estadoordencompraBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jTextFieldcodigoEstadoOrdenCompra.setText(estadoordencompraBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jTextAreanombreEstadoOrdenCompra.setText(estadoordencompraBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoOrdenCompra(EstadoOrdenCompraParameterReturnGeneral estadoordencompraReturnGeneral,EstadoOrdenCompraBean estadoordencompraBean,Boolean conDefault) throws Exception { 
		try {
			EstadoOrdenCompra estadoordencompraLocal=new EstadoOrdenCompra();
			
			estadoordencompraLocal=estadoordencompraReturnGeneral.getEstadoOrdenCompra();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoordencompraLocal.getId()!=null && !estadoordencompraLocal.getId().equals(0L))) {estadoordencompraBean.setId(estadoordencompraLocal.getId());}}
			if(conDefault || (!conDefault && estadoordencompraLocal.getcodigo()!=null && !estadoordencompraLocal.getcodigo().equals(""))) {estadoordencompraBean.setcodigo(estadoordencompraLocal.getcodigo());}
			if(conDefault || (!conDefault && estadoordencompraLocal.getnombre()!=null && !estadoordencompraLocal.getnombre().equals(""))) {estadoordencompraBean.setnombre(estadoordencompraLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoOrdenCompraGenerico(Long idEstadoOrdenCompraSeleccionado,JComboBox jComboBoxEstadoOrdenCompra,List<EstadoOrdenCompra> estadoordencomprasLocal)throws Exception {
		try {
			EstadoOrdenCompra  estadoordencompraTemp=null;

			for(EstadoOrdenCompra estadoordencompraAux:estadoordencomprasLocal) {
				if(estadoordencompraAux.getId()!=null && estadoordencompraAux.getId().equals(idEstadoOrdenCompraSeleccionado)) {
					estadoordencompraTemp=estadoordencompraAux;
					break;
				}
			}

			jComboBoxEstadoOrdenCompra.setSelectedItem(estadoordencompraTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoOrdenCompraGenerico(JComboBox jComboBoxEstadoOrdenCompra,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoOrdenCompra.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoOrdenCompra.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoOrdenCompra.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoOrdenCompra.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("OrdenCompra")) {
			jButtonOrdenCompraActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoordencompra=(EstadoOrdenCompra) estadoordencompraLogic.getEstadoOrdenCompras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoordencompra =(EstadoOrdenCompra) estadoordencompras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoOrdenCompra estadoordencompraRow=new EstadoOrdenCompra();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoordencompraRow=(EstadoOrdenCompra) estadoordencompraLogic.getEstadoOrdenCompras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoordencompraRow=(EstadoOrdenCompra) estadoordencompras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonOrdenCompraActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoOrdenCompra estadoordencompra) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoOrdenCompra==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordencompraLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoordencompra = (EstadoOrdenCompra)this.estadoordencompraLogic.getEstadoOrdenCompras().toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadoordencompra = (EstadoOrdenCompra)this.estadoordencompras.toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadoordencompra!=null) {
						this.estadoordencompra = estadoordencompra;
					} else {
						this.estadoordencompra = new EstadoOrdenCompra();
					}
				}

				if(this.isTienePermisosOrdenCompra && this.permiteMantenimiento(this.estadoordencompra)) {
					OrdenCompraBeanSwingJInternalFrame ordencompraBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFramePopup=new OrdenCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						ordencompraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFramePopup;
					} else {
						ordencompraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame;
					}

					List<EstadoOrdenCompra> estadoordencompras=new ArrayList<EstadoOrdenCompra>();
					estadoordencompras.add(this.estadoordencompra);
					if(!esRelacionado) {
						//ordencompraBeanSwingJInternalFrame.ordencompraSessionBean.setConGuardarRelaciones(false);
						//ordencompraBeanSwingJInternalFrame.ordencompraSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					ordencompraBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoOrdenCompra.cargarOrdenCompraBeanSwingJInternalFrame(estadoordencompras,this.estadoordencompra,ordencompraBeanSwingJInternalFrame,/*conInicializar,*/ordencompraBeanSwingJInternalFrame.ordencompraSessionBean.getConGuardarRelaciones(),ordencompraBeanSwingJInternalFrame.ordencompraSessionBean.getEsGuardarRelacionado());
					ordencompraBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						ordencompraBeanSwingJInternalFrame.actualizarEstadoPanelsOrdenCompra("no_relacionado");

						ordencompraBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(OrdenCompraConstantesFunciones.ITAMANIOFILATABLA + (OrdenCompraConstantesFunciones.ITAMANIOFILATABLA/2));

						ordencompraBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoOrdenCompra=(TitledBorder)this.jScrollPanelDatosEstadoOrdenCompra.getBorder();
						TitledBorder titledBorderOrdenCompra=(TitledBorder)ordencompraBeanSwingJInternalFrame.jScrollPanelDatosOrdenCompra.getBorder();

						titledBorderOrdenCompra.setTitle(titledBorderEstadoOrdenCompra.getTitle() + " -> OrdenCompra");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,ordencompraBeanSwingJInternalFrame);
						}

						ordencompraBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(ordencompraBeanSwingJInternalFrame);

						ordencompraBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadoordencompraSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE OrdenCompra",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordencompraLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordencompraLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordencompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoOrdenCompra(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaNuevoEstadoOrdenCompra && this.isPermisoNuevoEstadoOrdenCompra));			
			this.jButtonDuplicarEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaDuplicarEstadoOrdenCompra && this.isPermisoDuplicarEstadoOrdenCompra));			
			this.jButtonCopiarEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaCopiarEstadoOrdenCompra && this.isPermisoCopiarEstadoOrdenCompra));
			this.jButtonVerFormEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaVerFormEstadoOrdenCompra && this.isPermisoVerFormEstadoOrdenCompra));
			
			this.jButtonAbrirOrderByEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaOrdenEstadoOrdenCompra && this.isPermisoOrdenEstadoOrdenCompra));			
			
			this.jButtonNuevoRelacionesEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenCompra && this.isPermisoNuevoEstadoOrdenCompra));			
			this.jButtonNuevoGuardarCambiosEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaNuevoEstadoOrdenCompra && this.isPermisoNuevoEstadoOrdenCompra && this.isPermisoGuardarCambiosEstadoOrdenCompra));
			
			if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) {
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonModificarEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaModificarEstadoOrdenCompra && this.isPermisoActualizarEstadoOrdenCompra));	
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonActualizarEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaActualizarEstadoOrdenCompra && this.isPermisoActualizarEstadoOrdenCompra));	
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonEliminarEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaEliminarEstadoOrdenCompra && this.isPermisoEliminarEstadoOrdenCompra));
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonCancelarEstadoOrdenCompra.setVisible(this.isVisibilidadCeldaCancelarEstadoOrdenCompra);							
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonGuardarCambiosEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaGuardarEstadoOrdenCompra && this.isPermisoGuardarCambiosEstadoOrdenCompra));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoOrdenCompra && this.isPermisoGuardarCambiosEstadoOrdenCompra));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaNuevoEstadoOrdenCompra && this.isPermisoNuevoEstadoOrdenCompra));						
			this.jButtonDuplicarToolBarEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaDuplicarEstadoOrdenCompra && this.isPermisoDuplicarEstadoOrdenCompra));						
			this.jButtonCopiarToolBarEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaCopiarEstadoOrdenCompra && this.isPermisoCopiarEstadoOrdenCompra));			
			this.jButtonVerFormToolBarEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaVerFormEstadoOrdenCompra && this.isPermisoVerFormEstadoOrdenCompra));			
			this.jButtonAbrirOrderByToolBarEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaOrdenEstadoOrdenCompra && this.isPermisoOrdenEstadoOrdenCompra));
			this.jButtonNuevoRelacionesToolBarEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenCompra && this.isPermisoNuevoEstadoOrdenCompra));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaNuevoEstadoOrdenCompra && this.isPermisoNuevoEstadoOrdenCompra && this.isPermisoGuardarCambiosEstadoOrdenCompra));			
			
			if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) {
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonModificarToolBarEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaModificarEstadoOrdenCompra && this.isPermisoActualizarEstadoOrdenCompra));	
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonActualizarToolBarEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaActualizarEstadoOrdenCompra  && this.isPermisoActualizarEstadoOrdenCompra));	
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonEliminarToolBarEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaEliminarEstadoOrdenCompra && this.isPermisoEliminarEstadoOrdenCompra));
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonCancelarToolBarEstadoOrdenCompra.setVisible(this.isVisibilidadCeldaCancelarEstadoOrdenCompra);				
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonGuardarCambiosToolBarEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaGuardarEstadoOrdenCompra && this.isPermisoGuardarCambiosEstadoOrdenCompra));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoOrdenCompra && this.isPermisoGuardarCambiosEstadoOrdenCompra));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaNuevoEstadoOrdenCompra && this.isPermisoNuevoEstadoOrdenCompra));			
			this.jMenuItemDuplicarEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaDuplicarEstadoOrdenCompra && this.isPermisoDuplicarEstadoOrdenCompra));			
			this.jMenuItemCopiarEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaCopiarEstadoOrdenCompra && this.isPermisoCopiarEstadoOrdenCompra));			
			this.jMenuItemVerFormEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaVerFormEstadoOrdenCompra && this.isPermisoVerFormEstadoOrdenCompra));			
			this.jMenuItemAbrirOrderByEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaOrdenEstadoOrdenCompra && this.isPermisoOrdenEstadoOrdenCompra));			
			//this.jMenuItemMostrarOcultarEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaOrdenEstadoOrdenCompra && this.isPermisoOrdenEstadoOrdenCompra));
			this.jMenuItemDetalleAbrirOrderByEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaOrdenEstadoOrdenCompra && this.isPermisoOrdenEstadoOrdenCompra));			
			//this.jMenuItemDetalleMostrarOcultarEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaOrdenEstadoOrdenCompra && this.isPermisoOrdenEstadoOrdenCompra));			
			this.jMenuItemNuevoRelacionesEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenCompra && this.isPermisoNuevoEstadoOrdenCompra));			
			this.jMenuItemNuevoGuardarCambiosEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaNuevoEstadoOrdenCompra && this.isPermisoNuevoEstadoOrdenCompra && this.isPermisoGuardarCambiosEstadoOrdenCompra));									
			
			if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) {
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jMenuItemModificarEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaModificarEstadoOrdenCompra && this.isPermisoActualizarEstadoOrdenCompra));	
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jMenuItemActualizarEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaActualizarEstadoOrdenCompra && this.isPermisoActualizarEstadoOrdenCompra));	
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jMenuItemEliminarEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaEliminarEstadoOrdenCompra && this.isPermisoEliminarEstadoOrdenCompra));
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jMenuItemCancelarEstadoOrdenCompra.setVisible(this.isVisibilidadCeldaCancelarEstadoOrdenCompra);				
			}
			
			this.jMenuItemGuardarCambiosEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaGuardarEstadoOrdenCompra && this.isPermisoGuardarCambiosEstadoOrdenCompra));						
			this.jMenuItemGuardarCambiosTablaEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoOrdenCompra && this.isPermisoGuardarCambiosEstadoOrdenCompra));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoOrdenCompra=this.jButtonNuevoEstadoOrdenCompra.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoOrdenCompra=this.jButtonDuplicarEstadoOrdenCompra.isVisible();
			this.isVisibilidadCeldaCopiarEstadoOrdenCompra=this.jButtonCopiarEstadoOrdenCompra.isVisible();
			this.isVisibilidadCeldaVerFormEstadoOrdenCompra=this.jButtonVerFormEstadoOrdenCompra.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoOrdenCompra=this.jButtonAbrirOrderByEstadoOrdenCompra.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenCompra=this.jButtonNuevoRelacionesEstadoOrdenCompra.isVisible();
			this.isVisibilidadCeldaModificarEstadoOrdenCompra=this.jButtonModificarEstadoOrdenCompra.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) {
			this.isVisibilidadCeldaActualizarEstadoOrdenCompra=this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonActualizarEstadoOrdenCompra.isVisible();
			this.isVisibilidadCeldaEliminarEstadoOrdenCompra=this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonEliminarEstadoOrdenCompra.isVisible();
			this.isVisibilidadCeldaCancelarEstadoOrdenCompra=this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonCancelarEstadoOrdenCompra.isVisible();
			this.isVisibilidadCeldaGuardarEstadoOrdenCompra=this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonGuardarCambiosEstadoOrdenCompra.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoOrdenCompra=this.jButtonGuardarCambiosTablaEstadoOrdenCompra.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoOrdenCompra=this.jButtonNuevoToolBarEstadoOrdenCompra.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenCompra=this.jButtonNuevoRelacionesToolBarEstadoOrdenCompra.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) {
			this.isVisibilidadCeldaModificarEstadoOrdenCompra=this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonModificarToolBarEstadoOrdenCompra.isVisible();
			this.isVisibilidadCeldaActualizarEstadoOrdenCompra=this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonActualizarToolBarEstadoOrdenCompra.isVisible();
			this.isVisibilidadCeldaEliminarEstadoOrdenCompra=this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonEliminarToolBarEstadoOrdenCompra.isVisible();
			this.isVisibilidadCeldaCancelarEstadoOrdenCompra=this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonCancelarToolBarEstadoOrdenCompra.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoOrdenCompra=this.jButtonGuardarCambiosToolBarEstadoOrdenCompra.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoOrdenCompra=this.jButtonGuardarCambiosTablaToolBarEstadoOrdenCompra.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoOrdenCompra=this.jMenuItemNuevoEstadoOrdenCompra.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenCompra=this.jMenuItemNuevoRelacionesEstadoOrdenCompra.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) {
			this.isVisibilidadCeldaModificarEstadoOrdenCompra=this.jInternalFrameDetalleFormEstadoOrdenCompra.jMenuItemModificarEstadoOrdenCompra.isVisible();
			this.isVisibilidadCeldaActualizarEstadoOrdenCompra=this.jInternalFrameDetalleFormEstadoOrdenCompra.jMenuItemActualizarEstadoOrdenCompra.isVisible();
			this.isVisibilidadCeldaEliminarEstadoOrdenCompra=this.jInternalFrameDetalleFormEstadoOrdenCompra.jMenuItemEliminarEstadoOrdenCompra.isVisible();
			this.isVisibilidadCeldaCancelarEstadoOrdenCompra=this.jInternalFrameDetalleFormEstadoOrdenCompra.jMenuItemCancelarEstadoOrdenCompra.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoOrdenCompra=this.jMenuItemGuardarCambiosEstadoOrdenCompra.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoOrdenCompra=this.jMenuItemGuardarCambiosTablaEstadoOrdenCompra.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoOrdenCompra(Boolean esInicializar) {
		if(EstadoOrdenCompraJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadoordencompraSessionBean.getConGuardarRelaciones()) {
				//if(this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoOrdenCompra();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoOrdenCompra(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoOrdenCompra() {
		this.jButtonNuevoEstadoOrdenCompra.setVisible(this.isPermisoNuevoEstadoOrdenCompra);			
		this.jButtonDuplicarEstadoOrdenCompra.setVisible(this.isPermisoDuplicarEstadoOrdenCompra);			
		this.jButtonCopiarEstadoOrdenCompra.setVisible(this.isPermisoCopiarEstadoOrdenCompra);			
		this.jButtonVerFormEstadoOrdenCompra.setVisible(this.isPermisoVerFormEstadoOrdenCompra);			
		
		this.jButtonAbrirOrderByEstadoOrdenCompra.setVisible(this.isPermisoOrdenEstadoOrdenCompra);					
		
		this.jButtonNuevoRelacionesEstadoOrdenCompra.setVisible(this.isPermisoNuevoEstadoOrdenCompra);			
		
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonModificarEstadoOrdenCompra.setVisible(this.isPermisoActualizarEstadoOrdenCompra);	
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonActualizarEstadoOrdenCompra.setVisible(this.isPermisoActualizarEstadoOrdenCompra);	
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonEliminarEstadoOrdenCompra.setVisible(this.isPermisoEliminarEstadoOrdenCompra);
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonCancelarEstadoOrdenCompra.setVisible(this.isVisibilidadCeldaCancelarEstadoOrdenCompra);						
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonGuardarCambiosEstadoOrdenCompra.setVisible(this.isPermisoGuardarCambiosEstadoOrdenCompra);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoOrdenCompra.setVisible(this.isPermisoActualizarEstadoOrdenCompra);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoOrdenCompra() {
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonModificarEstadoOrdenCompra.setVisible(this.isPermisoActualizarEstadoOrdenCompra);	
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonActualizarEstadoOrdenCompra.setVisible(this.isPermisoActualizarEstadoOrdenCompra);	
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonEliminarEstadoOrdenCompra.setVisible(this.isPermisoEliminarEstadoOrdenCompra);
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonCancelarEstadoOrdenCompra.setVisible(this.isVisibilidadCeldaCancelarEstadoOrdenCompra);							
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonGuardarCambiosEstadoOrdenCompra.setVisible((this.isVisibilidadCeldaGuardarEstadoOrdenCompra && this.isPermisoGuardarCambiosEstadoOrdenCompra));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoOrdenCompra() {
		if(EstadoOrdenCompraJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoOrdenCompra();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoOrdenCompra() {
	}
	
	public void jTableDatosEstadoOrdenCompraListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoOrdenCompra(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoOrdenCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordencompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoOrdenCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoOrdenCompra(this.getestadoordencompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenCompra(this.estadoordencompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoordencompra =(EstadoOrdenCompra) this.estadoordencompraLogic.getEstadoOrdenCompras().toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoordencompra =(EstadoOrdenCompra) this.estadoordencompras.toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoordencompra==null) {
						this.estadoordencompra = new EstadoOrdenCompra();
					}

					this.setVariablesFormularioToObjetoActualEstadoOrdenCompra(this.estadoordencompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenCompra(this.estadoordencompra);
				}

				if(this.estadoordencompra.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadoordencompra.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoOrdenCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordencompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordencompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordencompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoOrdenCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordencompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoOrdenCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoOrdenCompra(this.getestadoordencompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenCompra(this.estadoordencompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoordencompra =(EstadoOrdenCompra) this.estadoordencompraLogic.getEstadoOrdenCompras().toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoordencompra =(EstadoOrdenCompra) this.estadoordencompras.toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoordencompra==null) {
						this.estadoordencompra = new EstadoOrdenCompra();
					}

					this.setVariablesFormularioToObjetoActualEstadoOrdenCompra(this.estadoordencompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenCompra(this.estadoordencompra);
				}

				if(this.estadoordencompra.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadoordencompra.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoOrdenCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordencompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordencompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordencompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoOrdenCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordencompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoOrdenCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoOrdenCompra(this.getestadoordencompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenCompra(this.estadoordencompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoordencompra =(EstadoOrdenCompra) this.estadoordencompraLogic.getEstadoOrdenCompras().toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoordencompra =(EstadoOrdenCompra) this.estadoordencompras.toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoordencompra==null) {
						this.estadoordencompra = new EstadoOrdenCompra();
					}

					this.setVariablesFormularioToObjetoActualEstadoOrdenCompra(this.estadoordencompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenCompra(this.estadoordencompra);
				}

				if(this.estadoordencompra.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadoordencompra.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoOrdenCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordencompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordencompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordencompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoOrdenCompra() {
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) {
			this.jInternalFrameDetalleFormEstadoOrdenCompra.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoOrdenCompra.dispose();
			this.jInternalFrameDetalleFormEstadoOrdenCompra=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoOrdenCompra!=null) {
			this.jInternalFrameReporteDinamicoEstadoOrdenCompra.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoOrdenCompra.dispose();
			this.jInternalFrameReporteDinamicoEstadoOrdenCompra=null;
		}
		
		if(this.jInternalFrameImportacionEstadoOrdenCompra!=null) {
			this.jInternalFrameImportacionEstadoOrdenCompra.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoOrdenCompra.dispose();
			this.jInternalFrameImportacionEstadoOrdenCompra=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoOrdenCompra();
			
			EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoOrdenCompra")) {
				jButtonNuevoEstadoOrdenCompraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoOrdenCompra")) {
				jButtonDuplicarEstadoOrdenCompraActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoOrdenCompra")) {
				jButtonCopiarEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoOrdenCompra")) {
				jButtonVerFormEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoOrdenCompra")) {
				jButtonNuevoEstadoOrdenCompraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoOrdenCompra")) {
				jButtonDuplicarEstadoOrdenCompraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoOrdenCompra")) {
				jButtonNuevoEstadoOrdenCompraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoOrdenCompra")) {
				jButtonDuplicarEstadoOrdenCompraActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoOrdenCompra")) {
				jButtonNuevoEstadoOrdenCompraActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoOrdenCompra")) {
				jButtonNuevoEstadoOrdenCompraActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoOrdenCompra")) {
				jButtonNuevoEstadoOrdenCompraActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoOrdenCompra")) {
				jButtonModificarEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoOrdenCompra")) {
				jButtonModificarEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoOrdenCompra")) {
				jButtonModificarEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoOrdenCompra")) {
				jButtonActualizarEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoOrdenCompra")) {
				jButtonActualizarEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoOrdenCompra")) {
				jButtonActualizarEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoOrdenCompra")) {
				jButtonEliminarEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoOrdenCompra")) {
				jButtonEliminarEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoOrdenCompra")) {
				jButtonEliminarEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoOrdenCompra")) {
				jButtonCancelarEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoOrdenCompra")) {
				jButtonCancelarEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoOrdenCompra")) {
				jButtonCancelarEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoOrdenCompra")) {
				jButtonCerrarEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoOrdenCompra")) {
				jButtonCerrarEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoOrdenCompra")) {
				jButtonCerrarEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoOrdenCompra")) {
				jButtonMostrarOcultarEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoOrdenCompra")) {
				jButtonCancelarEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoOrdenCompra")) {
				jButtonGuardarCambiosEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoOrdenCompra")) {
				jButtonGuardarCambiosEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoOrdenCompra")) {
				jButtonCopiarEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoOrdenCompra")) {
				jButtonVerFormEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoOrdenCompra")) {
				jButtonGuardarCambiosEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoOrdenCompra")) {
				jButtonCopiarEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoOrdenCompra")) {
				jButtonVerFormEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoOrdenCompra")) {
				jButtonGuardarCambiosEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoOrdenCompra")) {
				jButtonGuardarCambiosEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoOrdenCompra")) {
				jButtonGuardarCambiosEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoOrdenCompra")) {
				jButtonRecargarInformacionEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoOrdenCompra")) {
				jButtonRecargarInformacionEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoOrdenCompra")) {
				jButtonRecargarInformacionEstadoOrdenCompraActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoOrdenCompra")) {
				jButtonAnterioresEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoOrdenCompra")) {
				jButtonAnterioresEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoOrdenCompra")) {
				jButtonAnterioresEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoOrdenCompra")) {
				jButtonSiguientesEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoOrdenCompra")) {
				jButtonSiguientesEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoOrdenCompra")) {
				jButtonSiguientesEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoOrdenCompra") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoOrdenCompra")) {
				jButtonAbrirOrderByEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoOrdenCompra") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoOrdenCompra")) {
				jButtonMostrarOcultarEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoOrdenCompra")) {
				jButtonNuevoGuardarCambiosEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoOrdenCompra")) {
				jButtonNuevoGuardarCambiosEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoOrdenCompra")) {
				jButtonNuevoGuardarCambiosEstadoOrdenCompraActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoOrdenCompra")) {
				jButtonCerrarReporteDinamicoEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoOrdenCompra")) {
				jButtonGenerarReporteDinamicoEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoOrdenCompra")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoOrdenCompraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoOrdenCompra")) {
				jButtonCerrarImportacionEstadoOrdenCompraActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoOrdenCompra")) {
				
				jButtonGenerarImportacionEstadoOrdenCompraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoOrdenCompra")) {
				
				jButtonAbrirImportacionEstadoOrdenCompraActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoOrdenCompra")) {
				jComboBoxTiposAccionesEstadoOrdenCompraActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoOrdenCompra")) {
				jComboBoxTiposRelacionesEstadoOrdenCompraActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoOrdenCompra")) {
				jComboBoxTiposAccionesEstadoOrdenCompraActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoOrdenCompra")) {
				
				jComboBoxTiposSeleccionarEstadoOrdenCompraActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoOrdenCompra")) {
				jTextFieldValorCampoGeneralEstadoOrdenCompraActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoOrdenCompra")) {
				jButtonAbrirOrderByEstadoOrdenCompraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoOrdenCompra")) {
				jButtonAbrirOrderByEstadoOrdenCompraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoOrdenCompra")) {
				jButtonCerrarOrderByEstadoOrdenCompraActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoOrdenCompraBusqueda")) {
				this.jButtonidEstadoOrdenCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoOrdenCompraBusqueda")) {
				this.jButtoncodigoEstadoOrdenCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoOrdenCompraBusqueda")) {
				this.jButtonnombreEstadoOrdenCompraBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoOrdenCompra();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoOrdenCompraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordencompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoordencompra);
				
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
				
				


				
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoOrdenCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoOrdenCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoOrdenCompra estadoordencompraLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadoordencompraLocal=this.estadoordencompra;
			} else {
				estadoordencompraLocal=this.estadoordencompraAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordencompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoordencompra);
				
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
							
				
				


				
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoOrdenCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoOrdenCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoOrdenCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoOrdenCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordencompraAnterior =(EstadoOrdenCompra) this.estadoordencompraLogic.getEstadoOrdenCompras().toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoordencompraAnterior =(EstadoOrdenCompra) this.estadoordencompras.toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
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
			
			EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
			
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
			
			


			
			EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoOrdenCompraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordencompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoordencompra);
				
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
								
						
				


				
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoOrdenCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoOrdenCompra.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordencompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoordencompra);
				
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
								
				
				


				
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoOrdenCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoOrdenCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoOrdenCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoOrdenCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordencompraAnterior =(EstadoOrdenCompra) this.estadoordencompraLogic.getEstadoOrdenCompras().toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoordencompraAnterior =(EstadoOrdenCompra) this.estadoordencompras.toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordencompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoordencompra);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoOrdenCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoOrdenCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordencompraAnterior =(EstadoOrdenCompra) this.estadoordencompraLogic.getEstadoOrdenCompras().toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoordencompraAnterior =(EstadoOrdenCompra) this.estadoordencompras.toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoOrdenCompraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordencompra);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoordencompra);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordencompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoordencompra);
				
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
							
				
				


				
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoOrdenCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoOrdenCompra.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoOrdenCompraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoOrdenCompra.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoordencompraAnterior =(EstadoOrdenCompra) this.estadoordencompraLogic.getEstadoOrdenCompras().toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoordencompraAnterior =(EstadoOrdenCompra) this.estadoordencompras.toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
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
			
			EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
			
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
			
			


			
			EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoOrdenCompraActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordencompra);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoordencompra);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordencompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoordencompra);
				
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
								
				
				


				
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoOrdenCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoOrdenCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoOrdenCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoOrdenCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordencompraAnterior =(EstadoOrdenCompra) this.estadoordencompraLogic.getEstadoOrdenCompras().toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoordencompraAnterior =(EstadoOrdenCompra) this.estadoordencompras.toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoOrdenCompraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordencompra);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoordencompra);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoOrdenCompraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordencompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoordencompra);
				
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoOrdenCompra")) {
					jCheckBoxSeleccionarTodosEstadoOrdenCompraItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoOrdenCompra")) {
					jCheckBoxSeleccionadosEstadoOrdenCompraItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoOrdenCompra")) {
					
				}
				
				


				
				
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoOrdenCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoOrdenCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordencompra);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadoordencompra);
				
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
												
				
				


				
				
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoOrdenCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoOrdenCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoOrdenCompraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoOrdenCompra.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoordencompraAnterior =(EstadoOrdenCompra) this.estadoordencompraLogic.getEstadoOrdenCompras().toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoordencompraAnterior =(EstadoOrdenCompra) this.estadoordencompras.toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoOrdenCompraActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordencompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoordencompra);
				
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
				
				
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
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
			
			EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
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
			
			


			
			EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoOrdenCompraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordencompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoordencompra);
				
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoOrdenCompra.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoOrdenCompra.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordencompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoordencompra);
				
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
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
				
				


				
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoOrdenCompra.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoOrdenCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoOrdenCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoOrdenCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordencompraAnterior =(EstadoOrdenCompra) this.estadoordencompraLogic.getEstadoOrdenCompras().toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoordencompraAnterior =(EstadoOrdenCompra) this.estadoordencompras.toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoOrdenCompra")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoOrdenCompraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoOrdenCompra.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadoordencompra =(EstadoOrdenCompra) this.estadoordencompraLogic.getEstadoOrdenCompras().toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadoordencompra =(EstadoOrdenCompra) this.estadoordencompras.toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadoordencompra);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoOrdenCompra")) {
				
				}
				
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoOrdenCompra")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoOrdenCompra.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoOrdenCompra")) {
			
			}
			
			EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoOrdenCompra();
			
			EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoOrdenCompra")) {
				jButtonNuevoEstadoOrdenCompraActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoOrdenCompra")) {
				jButtonDuplicarEstadoOrdenCompraActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoOrdenCompra")) {
				jButtonCopiarEstadoOrdenCompraActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoOrdenCompra")) {
				jButtonVerFormEstadoOrdenCompraActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoOrdenCompra")) {
				jButtonNuevoEstadoOrdenCompraActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoOrdenCompra")) {
				jButtonModificarEstadoOrdenCompraActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoOrdenCompra")) {
				jButtonActualizarEstadoOrdenCompraActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoOrdenCompra")) {
				jButtonEliminarEstadoOrdenCompraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoOrdenCompra")) {
				jButtonGuardarCambiosEstadoOrdenCompraActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoOrdenCompra")) {
				jButtonCancelarEstadoOrdenCompraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoOrdenCompra")) {
				jButtonCerrarEstadoOrdenCompraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoOrdenCompra")) {
				jButtonGuardarCambiosEstadoOrdenCompraActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoOrdenCompra")) {
				jButtonNuevoGuardarCambiosEstadoOrdenCompraActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoOrdenCompra")) {
				jButtonAbrirOrderByEstadoOrdenCompraActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoOrdenCompra")) {
				jButtonRecargarInformacionEstadoOrdenCompraActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoOrdenCompra")) {
				jButtonAnterioresEstadoOrdenCompraActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoOrdenCompra")) {
				jButtonSiguientesEstadoOrdenCompraActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoOrdenCompraBusqueda")) {
				this.jButtonidEstadoOrdenCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoOrdenCompraBusqueda")) {
				this.jButtoncodigoEstadoOrdenCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoOrdenCompraBusqueda")) {
				this.jButtonnombreEstadoOrdenCompraBusquedaActionPerformed(evt);
			}
			
			EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoOrdenCompra();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoOrdenCompra")) {
				closingInternalFrameEstadoOrdenCompra();
				
			} else if(sTipo.equals("jButtonCancelarEstadoOrdenCompra")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoOrdenCompra = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoOrdenCompraBeanSwingJInternalFrame jInternalFrameParent=(EstadoOrdenCompraBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoOrdenCompra.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoOrdenCompraActionPerformed(null);
			}
			
			EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoordencompra,new Object(),this.estadoordencompraParameterGeneral,this.estadoordencompraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoOrdenCompra(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoOrdenCompra(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoOrdenCompra(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadoordencompra)) {
			if(!esControlTabla) {
				if(EstadoOrdenCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoOrdenCompra(this.estadoordencompra,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenCompra(this.estadoordencompra);			
				}
				
				if(this.estadoordencompraSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoOrdenCompra(this.estadoordencompra,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoordencompraReturnGeneral=estadoordencompraLogic.procesarEventosEstadoOrdenComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoordencompraLogic.getEstadoOrdenCompras(),this.estadoordencompra,this.estadoordencompraParameterGeneral,this.isEsNuevoEstadoOrdenCompra,classes);//this.estadoordencompraLogic.getEstadoOrdenCompra()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoOrdenCompra(this.estadoordencompraReturnGeneral,this.estadoordencompraBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadoordencompraSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoOrdenCompra(classes,this.estadoordencompraReturnGeneral,this.estadoordencompraBean,false);
					}
						
					if(this.estadoordencompraReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoOrdenCompra(this.estadoordencompraReturnGeneral.getEstadoOrdenCompra());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoOrdenCompra(this.estadoordencompraReturnGeneral.getEstadoOrdenCompra());	
					}
						
					if(this.estadoordencompraReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoOrdenCompra(this.estadoordencompraReturnGeneral.getEstadoOrdenCompra(),classes);//this.estadoordencompraBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoOrdenCompra(this.estadoordencompra,classes);//this.estadoordencompraBean);									
				}
			
				if(EstadoOrdenCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoOrdenCompra(this.estadoordencompra,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenCompra(this.estadoordencompra);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadoordencompraAnterior!=null) {
						this.estadoordencompra=this.estadoordencompraAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoordencompraReturnGeneral=estadoordencompraLogic.procesarEventosEstadoOrdenComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoordencompraLogic.getEstadoOrdenCompras(),this.estadoordencompra,this.estadoordencompraParameterGeneral,this.isEsNuevoEstadoOrdenCompra,classes);//this.estadoordencompraLogic.getEstadoOrdenCompra()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoordencompraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoordencompraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadoordencompraReturnGeneral.getEstadoOrdenCompra(),estadoordencompraLogic.getEstadoOrdenCompras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadoordencompraReturnGeneral.getEstadoOrdenCompra(),this.estadoordencompras);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoOrdenCompra.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoOrdenCompra.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoOrdenCompra();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoOrdenCompra() throws Exception {
		
		EstadoOrdenCompraModel estadoordencompraModel=(EstadoOrdenCompraModel)this.jTableDatosEstadoOrdenCompra.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoordencompraModel.estadoordencompras=this.estadoordencompraLogic.getEstadoOrdenCompras();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadoordencompraModel.estadoordencompras=this.estadoordencompras;
		}
		
		
		((EstadoOrdenCompraModel) this.jTableDatosEstadoOrdenCompra.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoOrdenCompra() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadoordencompraAnterior(),this.estadoordencompraLogic.getEstadoOrdenCompras());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadoordencompraAnterior(),this.estadoordencompras);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoOrdenCompra();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoOrdenCompra(EstadoOrdenCompra estadoordencompra,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(OrdenCompra.class)) {
					this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencompraLogic.setOrdenCompras(estadoordencompra.getOrdenCompras());
					this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaOrdenCompra(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
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
										
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoordencompra,new Object(),generalEntityParameterGeneral,this.estadoordencompraReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadoordencompraSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoOrdenCompraConstantesFunciones.getClassesRelationshipsOfEstadoOrdenCompra(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoOrdenCompraConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoOrdenCompra(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoOrdenCompra(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoOrdenCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoordencompra,new Object(),generalEntityParameterGeneral,this.estadoordencompraReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoOrdenCompra(EstadoOrdenCompraBean estadoordencompraBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(OrdenCompra.class)) {
					this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencompraLogic.setOrdenCompras(estadoordencompra.getOrdenCompras());
					this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaOrdenCompra(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoOrdenCompra(ArrayList<Classe> classes,EstadoOrdenCompraReturnGeneral estadoordencompraReturnGeneral,EstadoOrdenCompraBean estadoordencompraBean,Boolean conDefault) throws Exception {
		
			this.estadoordencompraBean.setOrdenCompras(estadoordencompraReturnGeneral.getEstadoOrdenCompra().getOrdenCompras());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoOrdenCompra(EstadoOrdenCompra estadoordencompra,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(OrdenCompra.class)) {
					estadoordencompra.setOrdenCompras(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraBeanSwingJInternalFrame.ordencompraLogic.getOrdenCompras());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadoordencompra)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoOrdenCompra = new EstadoOrdenCompraDetalleFormJInternalFrame(jDesktopPane,this.estadoordencompraSessionBean.getConGuardarRelaciones(),this.estadoordencompraSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoOrdenCompra);
		this.jInternalFrameDetalleFormEstadoOrdenCompra.setVisible(false);
		this.jInternalFrameDetalleFormEstadoOrdenCompra.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoOrdenCompra.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoOrdenCompra.estadoordencompraLogic=this.estadoordencompraLogic;
		
		this.cargarCombosFrameForeignKeyEstadoOrdenCompra("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoOrdenCompra();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoOrdenCompra();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoOrdenCompra("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoOrdenCompra();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoOrdenCompra.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoOrdenCompra"));
		
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonModificarEstadoOrdenCompra.addActionListener(new ButtonActionListener(this,"ModificarEstadoOrdenCompra"));

		
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonModificarToolBarEstadoOrdenCompra.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoOrdenCompra"));
					
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jMenuItemModificarEstadoOrdenCompra.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoOrdenCompra"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonActualizarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"ActualizarEstadoOrdenCompra"));
		
		
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonActualizarToolBarEstadoOrdenCompra.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoOrdenCompra"));
						
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jMenuItemActualizarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoOrdenCompra"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonEliminarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"EliminarEstadoOrdenCompra"));
		
		
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonEliminarToolBarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoOrdenCompra"));
								
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jMenuItemEliminarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoOrdenCompra"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonCancelarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"CancelarEstadoOrdenCompra"));
		
		
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonCancelarToolBarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoOrdenCompra"));
					
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jMenuItemCancelarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoOrdenCompra"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jMenuItemDetalleCerrarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoOrdenCompra"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonGuardarCambiosToolBarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoOrdenCompra"));
		
		
		
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonGuardarCambiosToolBarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoOrdenCompra"));
		
		
		
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jComboBoxTiposAccionesFormularioEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoOrdenCompra"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonidEstadoOrdenCompraBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoOrdenCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtoncodigoEstadoOrdenCompraBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoOrdenCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonnombreEstadoOrdenCompraBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoOrdenCompraBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jTabbedPaneRelacionesEstadoOrdenCompra.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoOrdenCompra"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoOrdenCompra"));
		
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenCompra.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoOrdenCompra"));
		}
		
		this.jTableDatosEstadoOrdenCompra.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoOrdenCompra"));
		
		this.jTableDatosEstadoOrdenCompra.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoOrdenCompra"));
		
		this.jButtonNuevoEstadoOrdenCompra.addActionListener(new ButtonActionListener(this,"NuevoEstadoOrdenCompra"));
		
		this.jButtonDuplicarEstadoOrdenCompra.addActionListener(new ButtonActionListener(this,"DuplicarEstadoOrdenCompra"));
		
		this.jButtonCopiarEstadoOrdenCompra.addActionListener(new ButtonActionListener(this,"CopiarEstadoOrdenCompra"));
		
		this.jButtonVerFormEstadoOrdenCompra.addActionListener(new ButtonActionListener(this,"VerFormEstadoOrdenCompra"));
		
		
		this.jButtonNuevoToolBarEstadoOrdenCompra.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoOrdenCompra"));
			
		this.jButtonDuplicarToolBarEstadoOrdenCompra.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoOrdenCompra"));
			
		this.jMenuItemNuevoEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoOrdenCompra"));
			
		this.jMenuItemDuplicarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoOrdenCompra"));		
		
		
		this.jButtonNuevoRelacionesEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoOrdenCompra"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoOrdenCompra.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoOrdenCompra"));
			
		this.jMenuItemNuevoRelacionesEstadoOrdenCompra.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoOrdenCompra"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonModificarEstadoOrdenCompra.addActionListener(new ButtonActionListener(this,"ModificarEstadoOrdenCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonModificarToolBarEstadoOrdenCompra.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoOrdenCompra"));
			
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jMenuItemModificarEstadoOrdenCompra.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoOrdenCompra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonActualizarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"ActualizarEstadoOrdenCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonActualizarToolBarEstadoOrdenCompra.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoOrdenCompra"));
				
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jMenuItemActualizarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoOrdenCompra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonEliminarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"EliminarEstadoOrdenCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonEliminarToolBarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoOrdenCompra"));
						
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jMenuItemEliminarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoOrdenCompra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonCancelarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"CancelarEstadoOrdenCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonCancelarToolBarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoOrdenCompra"));
			
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jMenuItemCancelarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoOrdenCompra"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoOrdenCompra"));		
		
		
		this.jButtonCerrarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"CerrarEstadoOrdenCompra"));
		
		
		this.jButtonCerrarToolBarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoOrdenCompra"));
			
		this.jMenuItemCerrarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoOrdenCompra"));
			
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jMenuItemDetalleCerrarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoOrdenCompra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonGuardarCambiosEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoOrdenCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonGuardarCambiosToolBarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoOrdenCompra"));
		}
		
		this.jButtonCopiarToolBarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoOrdenCompra"));
			
		this.jButtonVerFormToolBarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoOrdenCompra"));
		
		this.jMenuItemGuardarCambiosEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoOrdenCompra"));
			
		this.jMenuItemCopiarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoOrdenCompra"));		
		
		this.jMenuItemVerFormEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoOrdenCompra"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoOrdenCompra"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoOrdenCompra"));
			
		this.jMenuItemGuardarCambiosTablaEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoOrdenCompra"));		
		
		
		
		this.jButtonRecargarInformacionEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoOrdenCompra"));
					
		this.jButtonRecargarInformacionToolBarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoOrdenCompra"));
		
		this.jMenuItemRecargarInformacionEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoOrdenCompra"));		
		
		
		
		this.jButtonAnterioresEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"AnterioresEstadoOrdenCompra"));
		
		
		this.jButtonAnterioresToolBarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoOrdenCompra"));
		
		this.jMenuItemAnterioresEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoOrdenCompra"));		
		
		
		this.jButtonSiguientesEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"SiguientesEstadoOrdenCompra"));
		
		
		this.jButtonSiguientesToolBarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoOrdenCompra"));
			
		this.jMenuItemSiguientesEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoOrdenCompra"));
			
		this.jMenuItemAbrirOrderByEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoOrdenCompra"));
			
		this.jMenuItemMostrarOcultarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoOrdenCompra"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoOrdenCompra"));
			
		this.jMenuItemDetalleMostarOcultarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoOrdenCompra"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoOrdenCompra"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoOrdenCompra"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoOrdenCompra"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoOrdenCompra.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoOrdenCompra"));

		this.jCheckBoxSeleccionadosEstadoOrdenCompra.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoOrdenCompra"));
		
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jComboBoxTiposAccionesFormularioEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoOrdenCompra"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoOrdenCompra"));
			
		this.jComboBoxTiposAccionesEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoOrdenCompra"));
					
		this.jComboBoxTiposSeleccionarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoOrdenCompra"));
			
		this.jTextFieldValorCampoGeneralEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoOrdenCompra"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonidEstadoOrdenCompraBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoOrdenCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtoncodigoEstadoOrdenCompraBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoOrdenCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonnombreEstadoOrdenCompraBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoOrdenCompraBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoOrdenCompra!=null) {
				this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoOrdenCompra"));
				this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoOrdenCompra"));
				this.jInternalFrameReporteDinamicoEstadoOrdenCompra.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoOrdenCompra"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoOrdenCompra"));				
			//this.jButtonGenerarReporteDinamicoEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoOrdenCompra"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoOrdenCompra"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoOrdenCompra!=null) {
				this.jInternalFrameImportacionEstadoOrdenCompra.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoOrdenCompra"));
				this.jInternalFrameImportacionEstadoOrdenCompra.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoOrdenCompra"));
				this.jInternalFrameImportacionEstadoOrdenCompra.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoOrdenCompra"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoOrdenCompra"));
			
			this.jButtonAbrirOrderByToolBarEstadoOrdenCompra.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoOrdenCompra"));			
			
			if(this.jInternalFrameOrderByEstadoOrdenCompra!=null) {
				this.jInternalFrameOrderByEstadoOrdenCompra.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoOrdenCompra"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenCompra.jTabbedPaneRelacionesEstadoOrdenCompra.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoOrdenCompra"));
		
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
            		closingInternalFrameEstadoOrdenCompra();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoOrdenCompra.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoOrdenCompra = (JInternalFrameBase)event.getSource();
	            	
	            EstadoOrdenCompraBeanSwingJInternalFrame jInternalFrameParent=(EstadoOrdenCompraBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoOrdenCompra.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoOrdenCompraActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoOrdenCompra.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoOrdenCompraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoOrdenCompra.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoOrdenCompra.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoOrdenCompraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoOrdenCompraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoOrdenCompraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoOrdenCompra";
		inputMap = this.jButtonNuevoEstadoOrdenCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoOrdenCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoOrdenCompraActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoOrdenCompraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoOrdenCompraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoOrdenCompraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoOrdenCompra";
		inputMap = this.jButtonNuevoRelacionesEstadoOrdenCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoOrdenCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoOrdenCompraActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoOrdenCompra";
		inputMap = this.jButtonModificarEstadoOrdenCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoOrdenCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoOrdenCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoOrdenCompra";
		inputMap = this.jButtonActualizarEstadoOrdenCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoOrdenCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoOrdenCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoOrdenCompra";
		inputMap = this.jButtonEliminarEstadoOrdenCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoOrdenCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoOrdenCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoOrdenCompra";
		inputMap = this.jButtonCancelarEstadoOrdenCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoOrdenCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoOrdenCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoOrdenCompra";
		inputMap = this.jButtonCerrarEstadoOrdenCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoOrdenCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoOrdenCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonGuardarCambiosEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoOrdenCompra";
		inputMap = this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonGuardarCambiosEstadoOrdenCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonGuardarCambiosEstadoOrdenCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoOrdenCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoOrdenCompra.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoOrdenCompraItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoOrdenCompra.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoOrdenCompraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoOrdenCompra.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoOrdenCompraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoOrdenCompra.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoOrdenCompraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonidEstadoOrdenCompraBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoOrdenCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtoncodigoEstadoOrdenCompraBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoOrdenCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jButtonnombreEstadoOrdenCompraBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoOrdenCompraBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoOrdenCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoOrdenCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoOrdenCompraActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoOrdenCompra.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoOrdenCompra(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoOrdenCompra estadoordencompraAux:this.estadoordencompraLogic.getEstadoOrdenCompras()) {
					estadoordencompraAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoOrdenCompra estadoordencompraAux:estadoordencompras) {
					estadoordencompraAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoOrdenCompraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoOrdenCompra(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoOrdenCompra estadoordencompraAux:this.estadoordencompraLogic.getEstadoOrdenCompras()) {
						estadoordencompraAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoOrdenCompra estadoordencompraAux:estadoordencompras) {
						estadoordencompraAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoOrdenCompra estadoordencompraAux:this.estadoordencompraLogic.getEstadoOrdenCompras()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoOrdenCompra estadoordencompraAux:estadoordencompras) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoOrdenCompra(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoOrdenCompra.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoOrdenCompra.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoOrdenCompra,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoOrdenCompraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoOrdenCompra(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoOrdenCompra.getSelectedRows();
			
			EstadoOrdenCompra estadoordencompraLocal=new EstadoOrdenCompra();
			
			//this.seleccionarTodosEstadoOrdenCompra(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoordencompraLocal =(EstadoOrdenCompra) this.estadoordencompraLogic.getEstadoOrdenCompras().toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadoordencompraLocal =(EstadoOrdenCompra) this.estadoordencompras.toArray()[this.jTableDatosEstadoOrdenCompra.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadoordencompraLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoOrdenCompra estadoordencompraAux:this.estadoordencompraLogic.getEstadoOrdenCompras()) {
						estadoordencompraAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoOrdenCompra estadoordencompraAux:estadoordencompras) {
						estadoordencompraAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoOrdenCompra(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoOrdenCompra.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoOrdenCompra.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoOrdenCompra,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoOrdenCompraItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoOrdenCompraParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoOrdenCompraActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoOrdenCompra(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoOrdenCompra.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoOrdenCompra estadoordencompraAux:this.estadoordencompraLogic.getEstadoOrdenCompras()) {
				
						if(sTipoSeleccionar.equals(EstadoOrdenCompraConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoordencompraAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoOrdenCompraConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoordencompraAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoOrdenCompra estadoordencompraAux:estadoordencompras) {
					
						if(sTipoSeleccionar.equals(EstadoOrdenCompraConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoordencompraAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoOrdenCompraConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoordencompraAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoOrdenCompra(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoOrdenCompraActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoOrdenCompra(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoOrdenCompra=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoOrdenCompra.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoOrdenCompra.jComboBoxTiposAccionesFormularioEstadoOrdenCompra.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoOrdenCompra) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoOrdenCompra(conSplash);
				
					this.generarReporteEstadoOrdenComprasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoOrdenCompra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoOrdenCompra.jComboBoxTiposAccionesFormularioEstadoOrdenCompra.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoOrdenComprasSeleccionados();
				//this.jComboBoxTiposAccionesEstadoOrdenCompra.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoOrdenComprasSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoOrdenCompra.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoOrdenComprasSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoOrdenCompra.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoOrdenCompra();
				
				this.exportarEstadoOrdenComprasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoOrdenCompra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoOrdenCompra.jComboBoxTiposAccionesFormularioEstadoOrdenCompra.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoOrdenCompras();
				//this.importarEstadoOrdenCompras();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoOrdenCompra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoOrdenCompra.jComboBoxTiposAccionesFormularioEstadoOrdenCompra.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoOrdenCompra();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoOrdenComprasSeleccionados();
				//this.jComboBoxTiposAccionesEstadoOrdenCompra.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Orden Compra", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoOrdenCompra();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoOrdenCompra)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoOrdenCompra(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Orden Compra",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoOrdenCompra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoOrdenCompra.jComboBoxTiposAccionesFormularioEstadoOrdenCompra.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadoOrdenCompraBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadoOrdenCompra) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadoOrdenCompra(conSplash);
					
						//this.actualizarParametrosGeneralEstadoOrdenCompra();
						
						this.generarReporteProcesoAccionEstadoOrdenComprasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadoOrdenCompra.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadoOrdenCompra.jComboBoxTiposAccionesFormularioEstadoOrdenCompra.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadoOrdenCompraBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estado Orden CompraS SELECCIONADOS?", "MANTENIMIENTO DE Estado Orden Compra", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadoOrdenCompra();
				
						this.actualizarParametrosGeneralEstadoOrdenCompra();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadoordencompraReturnGeneral=estadoordencompraLogic.procesarAccionEstadoOrdenComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadoordencompraLogic.getEstadoOrdenCompras(),this.estadoordencompraParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadoOrdenCompraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoOrdenCompra.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoOrdenCompra.jComboBoxTiposAccionesFormularioEstadoOrdenCompra.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoOrdenCompra();
					
					EstadoOrdenCompraBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadoOrdenCompraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoOrdenCompra.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoOrdenCompra.jComboBoxTiposAccionesFormularioEstadoOrdenCompra.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoOrdenCompra(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoOrdenCompraActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoOrdenCompra();
			
			if(this.jInternalFrameDetalleFormEstadoOrdenCompra==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoOrdenCompra> estadoordencomprasSeleccionados=new ArrayList<EstadoOrdenCompra>();		
			EstadoOrdenCompra estadoordencompra=new EstadoOrdenCompra();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoOrdenCompra(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoOrdenCompra.getSelectedItem();
			
			
			
			
			estadoordencomprasSeleccionados=this.getEstadoOrdenComprasSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadoordencomprasSeleccionados.size()==1) {
				for(EstadoOrdenCompra estadoordencompraAux:estadoordencomprasSeleccionados) {
					estadoordencompra=estadoordencompraAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("OrdenCompra")) {
					jButtonOrdenCompraActionPerformed(null,rowIndex,true,false,estadoordencompra);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoOrdenCompra();
			
      		//this.finishProcessEstadoOrdenCompra(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoOrdenCompraReturnGeneral() throws Exception {
		if(this.estadoordencompraReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadoordencompraReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadoordencompraReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadoordencompraReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadoordencompraReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadoordencompraReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoOrdenCompra(false);
		}
		
		if(this.estadoordencompraReturnGeneral.getConRetornoLista() || this.estadoordencompraReturnGeneral.getConRetornoObjeto()) {
			if(this.estadoordencompraReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoordencompraLogic.setEstadoOrdenCompras(this.estadoordencompraReturnGeneral.getEstadoOrdenCompras());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadoordencompraReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoordencompraLogic.setEstadoOrdenCompra(this.estadoordencompraReturnGeneral.getEstadoOrdenCompra());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoOrdenCompra(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoOrdenCompra() throws Exception {
		
		
	}
	
	public ArrayList<EstadoOrdenCompra> getEstadoOrdenComprasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoOrdenCompra> estadoordencomprasSeleccionados=new ArrayList<EstadoOrdenCompra>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoOrdenCompra) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoOrdenCompra estadoordencompraAux:estadoordencompraLogic.getEstadoOrdenCompras()) {
					if(estadoordencompraAux.getIsSelected()) {
						estadoordencomprasSeleccionados.add(estadoordencompraAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoOrdenCompra estadoordencompraAux:this.estadoordencompras) {
					if(estadoordencompraAux.getIsSelected()) {
						estadoordencomprasSeleccionados.add(estadoordencompraAux);				
					}
				}
			}
			
			if(estadoordencomprasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadoordencomprasSeleccionados.addAll(this.estadoordencompraLogic.getEstadoOrdenCompras());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadoordencomprasSeleccionados.addAll(this.estadoordencompras);				
					}
				}
			}
		} else {
			estadoordencomprasSeleccionados.add(this.estadoordencompra);
		}
		
		return estadoordencomprasSeleccionados;
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
	
	public void generarReporteEstadoOrdenComprasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoOrdenComprasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoOrdenComprasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoOrdenComprasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoOrdenComprasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoOrdenComprasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Orden Compra",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoOrdenComprasSeleccionados() throws Exception {
		ArrayList<EstadoOrdenCompra> estadoordencomprasSeleccionados=new ArrayList<EstadoOrdenCompra>();		
		
		estadoordencomprasSeleccionados=this.getEstadoOrdenComprasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoOrdenCompras("Todos",estadoordencomprasSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoOrdenComprasSeleccionados() throws Exception {
		ArrayList<EstadoOrdenCompra> estadoordencomprasSeleccionados=new ArrayList<EstadoOrdenCompra>();		
		
		estadoordencomprasSeleccionados=this.getEstadoOrdenComprasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoOrdenCompras("Todos",estadoordencomprasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoOrdenComprasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoOrdenCompra> estadoordencomprasSeleccionados=new ArrayList<EstadoOrdenCompra>();
		
		estadoordencomprasSeleccionados=this.getEstadoOrdenComprasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoOrdenCompras("Todos",estadoordencomprasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoOrdenComprasSeleccionados() throws Exception {
		ArrayList<EstadoOrdenCompra> estadoordencomprasSeleccionados=new ArrayList<EstadoOrdenCompra>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoOrdenCompra();
		
		
		estadoordencomprasSeleccionados=this.getEstadoOrdenComprasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoOrdenCompra();
		
		
		//this.generarReporteEstadoOrdenCompras("Todos",estadoordencomprasSeleccionados ,estadoordencompraImplementable,estadoordencompraImplementableHome);
	}
	
	public void mostrarImportacionEstadoOrdenCompras() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoOrdenCompra();
		
		this.abrirFrameImportacionEstadoOrdenCompra();		
		
			
		//this.generarReporteEstadoOrdenCompras("Todos",estadoordencomprasSeleccionados ,estadoordencompraImplementable,estadoordencompraImplementableHome);
	}
	
	public void importarEstadoOrdenCompras() throws Exception {		
	
	}
	
	public void exportarEstadoOrdenComprasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoOrdenComprasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoOrdenComprasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoOrdenComprasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Orden Compra",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoOrdenComprasSeleccionados() throws Exception {
		ArrayList<EstadoOrdenCompra> estadoordencomprasSeleccionados=new ArrayList<EstadoOrdenCompra>();		
		
		estadoordencomprasSeleccionados=this.getEstadoOrdenComprasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoordencompra."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoOrdenCompra(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoOrdenCompra estadoordencompraAux:estadoordencomprasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoOrdenCompra(estadoordencompraAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadoordencompraAux.setsDetalleGeneralEntityReporte(estadoordencompraAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Orden Compra",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoOrdenCompra(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoOrdenCompraConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoOrdenCompraConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoOrdenCompraConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoOrdenCompraConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoOrdenCompra(EstadoOrdenCompra estadoordencompra,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadoordencompra.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoordencompra.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoordencompra.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoordencompra.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoOrdenComprasSeleccionados() throws Exception {
		ArrayList<EstadoOrdenCompra> estadoordencomprasSeleccionados=new ArrayList<EstadoOrdenCompra>();		
		
		estadoordencomprasSeleccionados=this.getEstadoOrdenComprasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoordencompra.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoOrdenCompras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoOrdenCompra(row);				
				iRow++;
			}				
			
			for(EstadoOrdenCompra estadoordencompraAux:estadoordencomprasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoOrdenCompra(estadoordencompraAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Orden Compra",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoOrdenComprasSeleccionados() throws Exception {
		ArrayList<EstadoOrdenCompra> estadoordencomprasSeleccionados=new ArrayList<EstadoOrdenCompra>();		
		
		estadoordencomprasSeleccionados=this.getEstadoOrdenComprasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoordencompra.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadoordencompras");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadoordencompra");
			//elementRoot.appendChild(element);
		
			for(EstadoOrdenCompra estadoordencompraAux:estadoordencomprasSeleccionados) {
				element = document.createElement("estadoordencompra");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoOrdenCompra(estadoordencompraAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Orden Compra",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoOrdenCompra(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoOrdenCompraConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoOrdenCompraConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoOrdenCompraConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoOrdenCompraConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoOrdenCompra(EstadoOrdenCompra estadoordencompra,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadoordencompra.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoordencompra.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoordencompra.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoOrdenCompra(EstadoOrdenCompra estadoordencompra,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoOrdenCompraConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadoordencompra.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoOrdenCompraConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadoordencompra.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoOrdenCompraConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadoordencompra.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoOrdenCompraConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadoordencompra.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoOrdenComprasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoOrdenCompra> estadoordencomprasSeleccionados=new ArrayList<EstadoOrdenCompra>();
		
		estadoordencomprasSeleccionados=this.getEstadoOrdenComprasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoOrdenCompra(estadoordencomprasSeleccionados);
		
		this.generarReporteEstadoOrdenCompras("Todos",estadoordencomprasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoOrdenCompra(ArrayList<EstadoOrdenCompra> estadoordencomprasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoOrdenCompra estadoordencompraAux:estadoordencomprasSeleccionados) {
				estadoordencompraAux.setsDetalleGeneralEntityReporte(estadoordencompraAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoOrdenCompraConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadoordencompraAux.setsDescripcionGeneralEntityReporte1(estadoordencompraAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoOrdenCompraConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadoordencompraAux.setsDescripcionGeneralEntityReporte1(estadoordencompraAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoOrdenCompra(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoOrdenCompra=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenCompra=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoOrdenCompra=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoOrdenCompra=false;
			this.isVisibilidadCeldaActualizarEstadoOrdenCompra=false;
			this.isVisibilidadCeldaEliminarEstadoOrdenCompra=false;
			this.isVisibilidadCeldaCancelarEstadoOrdenCompra=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoOrdenCompra=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoOrdenCompra=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoOrdenCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenCompra=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoOrdenCompra=false;
			this.isVisibilidadCeldaModificarEstadoOrdenCompra=false;
			this.isVisibilidadCeldaActualizarEstadoOrdenCompra=true;
			this.isVisibilidadCeldaEliminarEstadoOrdenCompra=false;
			this.isVisibilidadCeldaCancelarEstadoOrdenCompra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoOrdenCompra=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoOrdenCompra=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoOrdenCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenCompra=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoOrdenCompra=false;
			this.isVisibilidadCeldaModificarEstadoOrdenCompra=false;
			this.isVisibilidadCeldaActualizarEstadoOrdenCompra=true;
			this.isVisibilidadCeldaEliminarEstadoOrdenCompra=true;
			this.isVisibilidadCeldaCancelarEstadoOrdenCompra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoOrdenCompra=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoOrdenCompra=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoOrdenCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenCompra=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoOrdenCompra=false;
			this.isVisibilidadCeldaModificarEstadoOrdenCompra=false;
			this.isVisibilidadCeldaActualizarEstadoOrdenCompra=true;
			this.isVisibilidadCeldaEliminarEstadoOrdenCompra=false;
			this.isVisibilidadCeldaCancelarEstadoOrdenCompra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoOrdenCompra=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoOrdenCompra=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoOrdenCompra=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenCompra=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoOrdenCompra=true;
			this.isVisibilidadCeldaModificarEstadoOrdenCompra=false;
			this.isVisibilidadCeldaActualizarEstadoOrdenCompra=false;
			this.isVisibilidadCeldaEliminarEstadoOrdenCompra=false;
			this.isVisibilidadCeldaCancelarEstadoOrdenCompra=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoOrdenCompra=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoOrdenCompra=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoOrdenCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenCompra=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoOrdenCompra=false;
			this.isVisibilidadCeldaActualizarEstadoOrdenCompra=false;
			this.isVisibilidadCeldaEliminarEstadoOrdenCompra=false;
			this.isVisibilidadCeldaCancelarEstadoOrdenCompra=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoOrdenCompra=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoOrdenCompra=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoOrdenCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenCompra=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoOrdenCompra=false;
			this.isVisibilidadCeldaModificarEstadoOrdenCompra=true;
			this.isVisibilidadCeldaActualizarEstadoOrdenCompra=false;
			this.isVisibilidadCeldaEliminarEstadoOrdenCompra=false;
			this.isVisibilidadCeldaCancelarEstadoOrdenCompra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoOrdenCompra=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoOrdenCompra=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoOrdenCompraJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoOrdenCompra=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenCompra=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoOrdenCompra=true;
		} else {
			this.actualizarEstadoPanelsEstadoOrdenCompra(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoOrdenCompra=false;
			//this.isVisibilidadCeldaVerFormEstadoOrdenCompra=false;
			this.isVisibilidadCeldaDuplicarEstadoOrdenCompra=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadoordencompraSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenCompra=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoOrdenCompra=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoOrdenCompra=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadoordencompraSessionBean.getEsGuardarRelacionado()) {
			if(!estadoordencompraSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenCompra=false;												
			}
			
			this.jButtonCerrarEstadoOrdenCompra.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenCompra=false;
		}
		
		if(!this.permiteMantenimiento(this.estadoordencompra)) {
			this.isVisibilidadCeldaActualizarEstadoOrdenCompra=false;
			this.isVisibilidadCeldaEliminarEstadoOrdenCompra=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoOrdenCompra() {
		this.isVisibilidadCeldaNuevoEstadoOrdenCompra=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoOrdenCompra=false;
	}
	
	public void actualizarEstadoPanelsEstadoOrdenCompra(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoOrdenCompra!=null) {
				this.jScrollPanelDatosEdicionEstadoOrdenCompra.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoOrdenCompra!=null) {
				this.jScrollPanelDatosEstadoOrdenCompra.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoOrdenCompra!=null) {
				this.jPanelPaginacionEstadoOrdenCompra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoOrdenCompra!=null) {
				this.jPanelParametrosReportesEstadoOrdenCompra.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoOrdenCompra!=null) {
				this.jScrollPanelDatosEdicionEstadoOrdenCompra.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoOrdenCompra!=null) {
				this.jScrollPanelDatosEstadoOrdenCompra.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoOrdenCompra!=null) {
				this.jPanelPaginacionEstadoOrdenCompra.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoOrdenCompra!=null) {
				this.jPanelParametrosReportesEstadoOrdenCompra.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoOrdenCompra!=null) {
				this.jScrollPanelDatosEdicionEstadoOrdenCompra.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoOrdenCompra!=null) {
				this.jScrollPanelDatosEstadoOrdenCompra.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoOrdenCompra!=null) {
				this.jPanelPaginacionEstadoOrdenCompra.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoOrdenCompra!=null) {
				this.jPanelParametrosReportesEstadoOrdenCompra.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoOrdenCompra!=null) {
				this.jScrollPanelDatosEdicionEstadoOrdenCompra.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoOrdenCompra!=null) {
				this.jScrollPanelDatosEstadoOrdenCompra.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoOrdenCompra!=null) {
				this.jPanelPaginacionEstadoOrdenCompra.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoOrdenCompra!=null) {
				this.jPanelParametrosReportesEstadoOrdenCompra.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoOrdenCompra!=null) {
				this.jScrollPanelDatosEdicionEstadoOrdenCompra.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoOrdenCompra!=null) {
				this.jScrollPanelDatosEstadoOrdenCompra.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoOrdenCompra!=null) {
				this.jPanelPaginacionEstadoOrdenCompra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoOrdenCompra!=null) {
				this.jPanelParametrosReportesEstadoOrdenCompra.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoOrdenCompra!=null) {
				this.jScrollPanelDatosEdicionEstadoOrdenCompra.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoOrdenCompra!=null) {
				this.jScrollPanelDatosEstadoOrdenCompra.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoOrdenCompra!=null) {
				this.jPanelPaginacionEstadoOrdenCompra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoOrdenCompra!=null) {
				this.jPanelParametrosReportesEstadoOrdenCompra.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoOrdenCompra!=null) {
				this.jScrollPanelDatosEdicionEstadoOrdenCompra.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoOrdenCompra!=null) {
				this.jScrollPanelDatosEstadoOrdenCompra.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoOrdenCompra!=null) {
				this.jPanelPaginacionEstadoOrdenCompra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoOrdenCompra!=null) {
				this.jPanelParametrosReportesEstadoOrdenCompra.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoOrdenCompraParaOrdenCompras() throws Exception {
		Boolean isPaginaPopupOrdenCompra=false;

		try {

			if(this.estadoordencompraSessionBean==null) {
				this.estadoordencompraSessionBean=new EstadoOrdenCompraSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraSessionBean=new OrdenCompraSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraSessionBean.setsPathNavegacionActual(estadoordencompraSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+OrdenCompraConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupOrdenCompra=this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeOrdenCompra(true);
			this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeOrdenCompra(EstadoOrdenCompraConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraSessionBean.setisBusquedaDesdeForeignKeySesionEstadoOrdenCompra(true);
			this.jInternalFrameDetalleFormEstadoOrdenCompra.ordencompraSessionBean.setlidEstadoOrdenCompraActual(this.idEstadoOrdenCompraActual);

			estadoordencompraSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoOrdenCompra(true);
			estadoordencompraSessionBean.setlIdEstadoOrdenCompraActualForeignKey(this.idEstadoOrdenCompraActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoOrdenCompraSessionBean estadoordencompraSessionBean=new EstadoOrdenCompraSessionBean();
		
		if(this.estadoordencompraSessionBean==null) {
			this.estadoordencompraSessionBean=new EstadoOrdenCompraSessionBean();
		}
		
		this.estadoordencompraSessionBean.setsUltimaBusquedaEstadoOrdenCompra(this.getsAccionBusqueda());
		this.estadoordencompraSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadoordencompraSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoOrdenCompraSessionBean estadoordencompraSessionBean=new EstadoOrdenCompraSessionBean();
		
		if(this.estadoordencompraSessionBean==null) {
			this.estadoordencompraSessionBean=new EstadoOrdenCompraSessionBean();
		}
		
		if(this.estadoordencompraSessionBean.getsUltimaBusquedaEstadoOrdenCompra()!=null&&!this.estadoordencompraSessionBean.getsUltimaBusquedaEstadoOrdenCompra().equals("")) {
			this.setsAccionBusqueda(estadoordencompraSessionBean.getsUltimaBusquedaEstadoOrdenCompra());
			this.setiNumeroPaginacion(estadoordencompraSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadoordencompraSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadoordencompraSessionBean.setsUltimaBusquedaEstadoOrdenCompra("");
		this.estadoordencompraSessionBean.setiNumeroPaginacion(EstadoOrdenCompraConstantesFunciones.INUMEROPAGINACION);
		this.estadoordencompraSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoOrdenCompra(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoOrdenCompra() {
		this.updateBorderResaltarBusquedasFormularioEstadoOrdenCompra();
		this.updateVisibilidadBusquedasFormularioEstadoOrdenCompra();
		this.updateHabilitarBusquedasFormularioEstadoOrdenCompra();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoOrdenCompra() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoOrdenCompra() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoOrdenCompra() {
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
	
	public void updateControlesFormularioEstadoOrdenCompra() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoOrdenCompra==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoOrdenCompra();
		this.updateVisibilidadResaltarControlesFormularioEstadoOrdenCompra();
		this.updateHabilitarResaltarControlesFormularioEstadoOrdenCompra();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoOrdenCompra() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadoordencompraConstantesFunciones.resaltaridEstadoOrdenCompra!=null && this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) {this.jInternalFrameDetalleFormEstadoOrdenCompra.jTextFieldidEstadoOrdenCompra.setBorder(this.estadoordencompraConstantesFunciones.resaltaridEstadoOrdenCompra);}
		if(this.estadoordencompraConstantesFunciones.resaltarcodigoEstadoOrdenCompra!=null && this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) {this.jInternalFrameDetalleFormEstadoOrdenCompra.jTextFieldcodigoEstadoOrdenCompra.setBorder(this.estadoordencompraConstantesFunciones.resaltarcodigoEstadoOrdenCompra);}
		if(this.estadoordencompraConstantesFunciones.resaltarnombreEstadoOrdenCompra!=null && this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) {this.jInternalFrameDetalleFormEstadoOrdenCompra.jTextAreanombreEstadoOrdenCompra.setBorder(this.estadoordencompraConstantesFunciones.resaltarnombreEstadoOrdenCompra);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoOrdenCompra() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) {
	
		//this.jInternalFrameDetalleFormEstadoOrdenCompra.jTextFieldidEstadoOrdenCompra.setVisible(this.estadoordencompraConstantesFunciones.mostraridEstadoOrdenCompra);
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jPanelidEstadoOrdenCompra.setVisible(this.estadoordencompraConstantesFunciones.mostraridEstadoOrdenCompra);
		//this.jInternalFrameDetalleFormEstadoOrdenCompra.jTextFieldcodigoEstadoOrdenCompra.setVisible(this.estadoordencompraConstantesFunciones.mostrarcodigoEstadoOrdenCompra);
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jPanelcodigoEstadoOrdenCompra.setVisible(this.estadoordencompraConstantesFunciones.mostrarcodigoEstadoOrdenCompra);
		//this.jInternalFrameDetalleFormEstadoOrdenCompra.jTextAreanombreEstadoOrdenCompra.setVisible(this.estadoordencompraConstantesFunciones.mostrarnombreEstadoOrdenCompra);
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jPanelnombreEstadoOrdenCompra.setVisible(this.estadoordencompraConstantesFunciones.mostrarnombreEstadoOrdenCompra);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoOrdenCompra() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoOrdenCompra!=null) {
	
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jTextFieldidEstadoOrdenCompra.setEnabled(this.estadoordencompraConstantesFunciones.activaridEstadoOrdenCompra);
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jTextFieldcodigoEstadoOrdenCompra.setEnabled(this.estadoordencompraConstantesFunciones.activarcodigoEstadoOrdenCompra);
		this.jInternalFrameDetalleFormEstadoOrdenCompra.jTextAreanombreEstadoOrdenCompra.setEnabled(this.estadoordencompraConstantesFunciones.activarnombreEstadoOrdenCompra);
		}
	}
	
		
}