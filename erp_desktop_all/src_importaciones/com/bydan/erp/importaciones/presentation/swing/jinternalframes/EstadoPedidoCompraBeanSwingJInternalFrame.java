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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;




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

import com.bydan.erp.importaciones.util.EstadoPedidoCompraConstantesFunciones;
import com.bydan.erp.importaciones.util.EstadoPedidoCompraParameterReturnGeneral;
//import com.bydan.erp.importaciones.util.EstadoPedidoCompraParameterGeneral;
//import com.bydan.erp.importaciones.presentation.report.source.EstadoPedidoCompraBean;
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

import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.importaciones.resources.reportes.AuxiliarReportes;


import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.importaciones.business.logic.*;

import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.importaciones.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class EstadoPedidoCompraBeanSwingJInternalFrame extends EstadoPedidoCompraJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoPedidoCompraBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoPedidoCompra> estadopedidocompraValidator = new ClassValidator<EstadoPedidoCompra>(EstadoPedidoCompra.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoPedidoCompra estadopedidocompra;	
	public EstadoPedidoCompra estadopedidocompraAux;
	public EstadoPedidoCompra estadopedidocompraAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoPedidoCompra estadopedidocompraTotales;
	public Long idEstadoPedidoCompraActual;
	public Long iIdNuevoEstadoPedidoCompra=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	
	
	
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
	
	public Boolean isPermisoTodoEstadoPedidoCompra;
	public Boolean isPermisoNuevoEstadoPedidoCompra;
	public Boolean isPermisoActualizarEstadoPedidoCompra;
	public Boolean isPermisoActualizarOriginalEstadoPedidoCompra;
	public Boolean isPermisoEliminarEstadoPedidoCompra;
	public Boolean isPermisoGuardarCambiosEstadoPedidoCompra;
	public Boolean isPermisoConsultaEstadoPedidoCompra;
	public Boolean isPermisoBusquedaEstadoPedidoCompra;
	public Boolean isPermisoReporteEstadoPedidoCompra;
	public Boolean isPermisoPaginacionMedioEstadoPedidoCompra;
	public Boolean isPermisoPaginacionAltoEstadoPedidoCompra;
	public Boolean isPermisoPaginacionTodoEstadoPedidoCompra;
	public Boolean isPermisoCopiarEstadoPedidoCompra;
	public Boolean isPermisoVerFormEstadoPedidoCompra;
	public Boolean isPermisoDuplicarEstadoPedidoCompra;
	public Boolean isPermisoOrdenEstadoPedidoCompra;
	
	
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
	
	public EstadoPedidoCompraParameterReturnGeneral estadopedidocompraReturnGeneral;
	public EstadoPedidoCompraParameterReturnGeneral estadopedidocompraParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoPedidoCompra=false;
	public Boolean esParaAccionDesdeFormularioEstadoPedidoCompra=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoPedidoCompraLogic estadopedidocompraLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoPedidoCompra estadopedidocompraBean;
	public EstadoPedidoCompraConstantesFunciones estadopedidocompraConstantesFunciones;
	//public EstadoPedidoCompraParameterReturnGeneral estadopedidocompraReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoPedidoCompra> estadopedidocompras;	
	//public List<EstadoPedidoCompra> estadopedidocomprasEliminados;
	//public List<EstadoPedidoCompra> estadopedidocomprasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoPedidoCompra=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoPedidoCompra=true;
	public Boolean isVisibilidadCeldaCopiarEstadoPedidoCompra=true;
	public Boolean isVisibilidadCeldaVerFormEstadoPedidoCompra=true;
	public Boolean isVisibilidadCeldaOrdenEstadoPedidoCompra=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoPedidoCompra=false;
	public Boolean isVisibilidadCeldaModificarEstadoPedidoCompra=false;
	public Boolean isVisibilidadCeldaActualizarEstadoPedidoCompra=false;
	public Boolean isVisibilidadCeldaEliminarEstadoPedidoCompra=false;
	public Boolean isVisibilidadCeldaCancelarEstadoPedidoCompra=false;
	public Boolean isVisibilidadCeldaGuardarEstadoPedidoCompra=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoPedidoCompra=false;	
	
	
	
	public Long getiIdNuevoEstadoPedidoCompra() {
		return this.iIdNuevoEstadoPedidoCompra;
	}

	public void setiIdNuevoEstadoPedidoCompra(Long iIdNuevoEstadoPedidoCompra) {
		this.iIdNuevoEstadoPedidoCompra = iIdNuevoEstadoPedidoCompra;
	}
	
	public Long getidEstadoPedidoCompraActual() {
		return this.idEstadoPedidoCompraActual;
	}

	public void setidEstadoPedidoCompraActual(Long idEstadoPedidoCompraActual) {
		this.idEstadoPedidoCompraActual = idEstadoPedidoCompraActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoPedidoCompra getestadopedidocompra() {
		return this.estadopedidocompra;
	}

	public void setestadopedidocompra(EstadoPedidoCompra estadopedidocompra) {
		this.estadopedidocompra = estadopedidocompra;
	}
	
	public EstadoPedidoCompra getestadopedidocompraAux() {
		return this.estadopedidocompraAux;
	}

	public void setestadopedidocompraAux(EstadoPedidoCompra estadopedidocompraAux) {
		this.estadopedidocompraAux = estadopedidocompraAux;
	}				
	
	public EstadoPedidoCompra getestadopedidocompraAnterior() {
		return this.estadopedidocompraAnterior;
	}

	public void setestadopedidocompraAnterior(EstadoPedidoCompra estadopedidocompraAnterior) {
		this.estadopedidocompraAnterior = estadopedidocompraAnterior;
	}	
	
	public EstadoPedidoCompra getestadopedidocompraTotales() {
		return this.estadopedidocompraTotales;
	}

	public void setestadopedidocompraTotales(EstadoPedidoCompra estadopedidocompraTotales) {
		this.estadopedidocompraTotales = estadopedidocompraTotales;
	}	
	
	public EstadoPedidoCompra getestadopedidocompraBean() {
		return this.estadopedidocompraBean;
	}

	public void setestadopedidocompraBean(EstadoPedidoCompra estadopedidocompraBean) {
		this.estadopedidocompraBean = estadopedidocompraBean;
	}	
	
	public EstadoPedidoCompraParameterReturnGeneral getestadopedidocompraReturnGeneral() {
		return this.estadopedidocompraReturnGeneral;
	}

	public void setestadopedidocompraReturnGeneral(EstadoPedidoCompraParameterReturnGeneral estadopedidocompraReturnGeneral) {
		this.estadopedidocompraReturnGeneral = estadopedidocompraReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoPedidoCompraLogic getEstadoPedidoCompraLogic()	{		
		return estadopedidocompraLogic;
	}

	public void setEstadoPedidoCompraLogic(EstadoPedidoCompraLogic estadopedidocompraLogic) {
		this.estadopedidocompraLogic = estadopedidocompraLogic;
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
	
	public Boolean getIsEsNuevoEstadoPedidoCompra() {
		return isEsNuevoEstadoPedidoCompra;
	}

	public void setIsEsNuevoEstadoPedidoCompra(Boolean isEsNuevoEstadoPedidoCompra) {
		this.isEsNuevoEstadoPedidoCompra = isEsNuevoEstadoPedidoCompra;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoPedidoCompra() {
		return esParaAccionDesdeFormularioEstadoPedidoCompra;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoPedidoCompra(Boolean esParaAccionDesdeFormularioEstadoPedidoCompra) {
		this.esParaAccionDesdeFormularioEstadoPedidoCompra = esParaAccionDesdeFormularioEstadoPedidoCompra;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoPedidoCompra() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoPedidoCompraConstantesFunciones.refrescarForeignKeysDescripcionesEstadoPedidoCompra(this.estadopedidocompraLogic.getEstadoPedidoCompras());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoPedidoCompraConstantesFunciones.refrescarForeignKeysDescripcionesEstadoPedidoCompra(this.estadopedidocompras);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadopedidocompraLogic.setEstadoPedidoCompras(this.estadopedidocompras);
			estadopedidocompraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoPedidoCompraParameterReturnGeneral getEstadoPedidoCompraParameterGeneral() {
		return this.estadopedidocompraParameterGeneral;
	}
	
	public void setEstadoPedidoCompraParameterGeneral(EstadoPedidoCompraParameterReturnGeneral estadopedidocompraParameterGeneral) {
		this.estadopedidocompraParameterGeneral = estadopedidocompraParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoPedidoCompra() {
		return isPermisoTodoEstadoPedidoCompra;
	}

	public void setIsPermisoTodoEstadoPedidoCompra(Boolean isPermisoTodoEstadoPedidoCompra) {
		this.isPermisoTodoEstadoPedidoCompra = isPermisoTodoEstadoPedidoCompra;
	}

	public Boolean getIsPermisoNuevoEstadoPedidoCompra() {
		return isPermisoNuevoEstadoPedidoCompra;
	}

	public void setIsPermisoNuevoEstadoPedidoCompra(Boolean isPermisoNuevoEstadoPedidoCompra) {
		this.isPermisoNuevoEstadoPedidoCompra = isPermisoNuevoEstadoPedidoCompra;
	}

	public Boolean getIsPermisoActualizarEstadoPedidoCompra() {
		return isPermisoActualizarEstadoPedidoCompra;
	}

	public void setIsPermisoActualizarEstadoPedidoCompra(Boolean isPermisoActualizarEstadoPedidoCompra) {
		this.isPermisoActualizarEstadoPedidoCompra = isPermisoActualizarEstadoPedidoCompra;
	}

	public Boolean getIsPermisoEliminarEstadoPedidoCompra() {
		return isPermisoEliminarEstadoPedidoCompra;
	}

	public void setIsPermisoEliminarEstadoPedidoCompra(Boolean isPermisoEliminarEstadoPedidoCompra) {
		this.isPermisoEliminarEstadoPedidoCompra = isPermisoEliminarEstadoPedidoCompra;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoPedidoCompra() {
		return isPermisoGuardarCambiosEstadoPedidoCompra;
	}

	public void setIsPermisoGuardarCambiosEstadoPedidoCompra(Boolean isPermisoGuardarCambiosEstadoPedidoCompra) {
		this.isPermisoGuardarCambiosEstadoPedidoCompra = isPermisoGuardarCambiosEstadoPedidoCompra;
	}
	
	public Boolean getIsPermisoConsultaEstadoPedidoCompra() {
		return isPermisoConsultaEstadoPedidoCompra;
	}

	public void setIsPermisoConsultaEstadoPedidoCompra(Boolean isPermisoConsultaEstadoPedidoCompra) {
		this.isPermisoConsultaEstadoPedidoCompra = isPermisoConsultaEstadoPedidoCompra;
	}

	public Boolean getIsPermisoBusquedaEstadoPedidoCompra() {
		return isPermisoBusquedaEstadoPedidoCompra;
	}

	public void setIsPermisoBusquedaEstadoPedidoCompra(Boolean isPermisoBusquedaEstadoPedidoCompra) {
		this.isPermisoBusquedaEstadoPedidoCompra = isPermisoBusquedaEstadoPedidoCompra;
	}

	public Boolean getIsPermisoReporteEstadoPedidoCompra() {
		return isPermisoReporteEstadoPedidoCompra;
	}

	public void setIsPermisoReporteEstadoPedidoCompra(Boolean isPermisoReporteEstadoPedidoCompra) {
		this.isPermisoReporteEstadoPedidoCompra = isPermisoReporteEstadoPedidoCompra;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoPedidoCompra() {
		return isPermisoPaginacionMedioEstadoPedidoCompra;
	}

	public void setIsPermisoPaginacionMedioEstadoPedidoCompra(Boolean isPermisoPaginacionMedioEstadoPedidoCompra) {
		this.isPermisoPaginacionMedioEstadoPedidoCompra = isPermisoPaginacionMedioEstadoPedidoCompra;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoPedidoCompra() {
		return isPermisoPaginacionTodoEstadoPedidoCompra;
	}

	public void setIsPermisoPaginacionTodoEstadoPedidoCompra(Boolean isPermisoPaginacionTodoEstadoPedidoCompra) {
		this.isPermisoPaginacionTodoEstadoPedidoCompra = isPermisoPaginacionTodoEstadoPedidoCompra;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoPedidoCompra() {
		return isPermisoPaginacionAltoEstadoPedidoCompra;
	}

	public void setIsPermisoPaginacionAltoEstadoPedidoCompra(Boolean isPermisoPaginacionAltoEstadoPedidoCompra) {
		this.isPermisoPaginacionAltoEstadoPedidoCompra = isPermisoPaginacionAltoEstadoPedidoCompra;
	}
	
	public Boolean getIsPermisoCopiarEstadoPedidoCompra() {
		return isPermisoCopiarEstadoPedidoCompra;
	}

	public void setIsPermisoCopiarEstadoPedidoCompra(Boolean isPermisoCopiarEstadoPedidoCompra) {
		this.isPermisoCopiarEstadoPedidoCompra = isPermisoCopiarEstadoPedidoCompra;
	}
	
	public Boolean getIsPermisoVerFormEstadoPedidoCompra() {
		return isPermisoVerFormEstadoPedidoCompra;
	}

	public void setIsPermisoVerFormEstadoPedidoCompra(Boolean isPermisoVerFormEstadoPedidoCompra) {
		this.isPermisoVerFormEstadoPedidoCompra = isPermisoVerFormEstadoPedidoCompra;
	}
	
	public Boolean getIsPermisoDuplicarEstadoPedidoCompra() {
		return isPermisoDuplicarEstadoPedidoCompra;
	}

	public void setIsPermisoDuplicarEstadoPedidoCompra(Boolean isPermisoDuplicarEstadoPedidoCompra) {
		this.isPermisoDuplicarEstadoPedidoCompra = isPermisoDuplicarEstadoPedidoCompra;
	}
	
	public Boolean getIsPermisoOrdenEstadoPedidoCompra() {
		return isPermisoOrdenEstadoPedidoCompra;
	}

	public void setIsPermisoOrdenEstadoPedidoCompra(Boolean isPermisoOrdenEstadoPedidoCompra) {
		this.isPermisoOrdenEstadoPedidoCompra = isPermisoOrdenEstadoPedidoCompra;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoPedidoCompra() {
		return isVisibilidadCeldaNuevoEstadoPedidoCompra;
	}

	public void setIsVisibilidadCeldaNuevoEstadoPedidoCompra(Boolean isVisibilidadCeldaNuevoEstadoPedidoCompra) {
		this.isVisibilidadCeldaNuevoEstadoPedidoCompra = isVisibilidadCeldaNuevoEstadoPedidoCompra;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoPedidoCompra() {
		return isVisibilidadCeldaDuplicarEstadoPedidoCompra;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoPedidoCompra(Boolean isVisibilidadCeldaDuplicarEstadoPedidoCompra) {
		this.isVisibilidadCeldaDuplicarEstadoPedidoCompra = isVisibilidadCeldaDuplicarEstadoPedidoCompra;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoPedidoCompra() {
		return isVisibilidadCeldaCopiarEstadoPedidoCompra;
	}

	public void setIsVisibilidadCeldaCopiarEstadoPedidoCompra(Boolean isVisibilidadCeldaCopiarEstadoPedidoCompra) {
		this.isVisibilidadCeldaCopiarEstadoPedidoCompra = isVisibilidadCeldaCopiarEstadoPedidoCompra;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoPedidoCompra() {
		return isVisibilidadCeldaVerFormEstadoPedidoCompra;
	}

	public void setIsVisibilidadCeldaVerFormEstadoPedidoCompra(Boolean isVisibilidadCeldaVerFormEstadoPedidoCompra) {
		this.isVisibilidadCeldaVerFormEstadoPedidoCompra = isVisibilidadCeldaVerFormEstadoPedidoCompra;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoPedidoCompra() {
		return isVisibilidadCeldaOrdenEstadoPedidoCompra;
	}

	public void setIsVisibilidadCeldaOrdenEstadoPedidoCompra(Boolean isVisibilidadCeldaOrdenEstadoPedidoCompra) {
		this.isVisibilidadCeldaOrdenEstadoPedidoCompra = isVisibilidadCeldaOrdenEstadoPedidoCompra;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoPedidoCompra() {
		return isVisibilidadCeldaNuevoRelacionesEstadoPedidoCompra;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoPedidoCompra(Boolean isVisibilidadCeldaNuevoRelacionesEstadoPedidoCompra) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoPedidoCompra = isVisibilidadCeldaNuevoRelacionesEstadoPedidoCompra;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoPedidoCompra() {
		return isVisibilidadCeldaModificarEstadoPedidoCompra;
	}

	public void setIsVisibilidadCeldaModificarEstadoPedidoCompra(Boolean isVisibilidadCeldaModificarEstadoPedidoCompra) {
		this.isVisibilidadCeldaModificarEstadoPedidoCompra = isVisibilidadCeldaModificarEstadoPedidoCompra;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoPedidoCompra() {
		return isVisibilidadCeldaActualizarEstadoPedidoCompra;
	}

	public void setIsVisibilidadCeldaActualizarEstadoPedidoCompra(Boolean isVisibilidadCeldaActualizarEstadoPedidoCompra) {
		this.isVisibilidadCeldaActualizarEstadoPedidoCompra = isVisibilidadCeldaActualizarEstadoPedidoCompra;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoPedidoCompra() {
		return isVisibilidadCeldaEliminarEstadoPedidoCompra;
	}

	public void setIsVisibilidadCeldaEliminarEstadoPedidoCompra(Boolean isVisibilidadCeldaEliminarEstadoPedidoCompra) {
		this.isVisibilidadCeldaEliminarEstadoPedidoCompra = isVisibilidadCeldaEliminarEstadoPedidoCompra;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoPedidoCompra() {
		return isVisibilidadCeldaCancelarEstadoPedidoCompra;
	}

	public void setIsVisibilidadCeldaCancelarEstadoPedidoCompra(Boolean isVisibilidadCeldaCancelarEstadoPedidoCompra) {
		this.isVisibilidadCeldaCancelarEstadoPedidoCompra = isVisibilidadCeldaCancelarEstadoPedidoCompra;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoPedidoCompra() {
		return isVisibilidadCeldaGuardarEstadoPedidoCompra;
	}

	public void setIsVisibilidadCeldaGuardarEstadoPedidoCompra(Boolean isVisibilidadCeldaGuardarEstadoPedidoCompra) {
		this.isVisibilidadCeldaGuardarEstadoPedidoCompra = isVisibilidadCeldaGuardarEstadoPedidoCompra;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoPedidoCompra() {
		return isVisibilidadCeldaGuardarCambiosEstadoPedidoCompra;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoPedidoCompra(Boolean isVisibilidadCeldaGuardarCambiosEstadoPedidoCompra) {
		this.isVisibilidadCeldaGuardarCambiosEstadoPedidoCompra = isVisibilidadCeldaGuardarCambiosEstadoPedidoCompra;
	}
		
	public EstadoPedidoCompraSessionBean getestadopedidocompraSessionBean() {
		return this.estadopedidocompraSessionBean;
	}
	
	public void setestadopedidocompraSessionBean(EstadoPedidoCompraSessionBean estadopedidocompraSessionBean) {
		this.estadopedidocompraSessionBean=estadopedidocompraSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoPedidoCompra(EstadoPedidoCompra estadopedidocompra)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoPedidoCompra estadopedidocompra,EstadoPedidoCompra estadopedidocompraAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoPedidoCompra(estadopedidocompra);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadopedidocompraAux.setId(estadopedidocompra.getId());
		estadopedidocompraAux.setVersionRow(estadopedidocompra.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoPedidoCompra();
		
			int intSelectedRow = this.jTableDatosEstadoPedidoCompra.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidocompra =(EstadoPedidoCompra) this.estadopedidocompraLogic.getEstadoPedidoCompras().toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadopedidocompra =(EstadoPedidoCompra) this.estadopedidocompras.toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoPedidoCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoPedidoCompra(this.estadopedidocompra,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedidoCompra(this.estadopedidocompra);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadopedidocompraValidator.getInvalidValues(this.estadopedidocompra);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadopedidocompraLogic.setDatosCliente(datosCliente);
			estadopedidocompraLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadopedidocompraAux=new  EstadoPedidoCompra();
				
				estadopedidocompraAux.setIsNew(true);
				estadopedidocompraAux.setIsChanged(true);
				
				estadopedidocompraAux.setEstadoPedidoCompraOriginal(this.estadopedidocompra);
				
				estadopedidocompraAux.setId(this.estadopedidocompra.getId());	
				estadopedidocompraAux.setVersionRow(this.estadopedidocompra.getVersionRow());	
				estadopedidocompraAux.setcodigo(this.estadopedidocompra.getcodigo());	
				estadopedidocompraAux.setnombre(this.estadopedidocompra.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadopedidocompraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadopedidocompraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadopedidocompraAux,estadopedidocompraLogic.getEstadoPedidoCompras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadopedidocompraAux,estadopedidocompras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadopedidocompraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadopedidocompraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadopedidocompraLogic.saveEstadoPedidoCompras();//WithConnection
						//estadopedidocompraLogic.getSetVersionRowEstadoPedidoCompras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadopedidocompra,estadopedidocompraAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadopedidocompraAux=new  EstadoPedidoCompra();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadopedidocompraSessionBean.getEsGuardarRelacionado() 
					|| (this.estadopedidocompraSessionBean.getEsGuardarRelacionado() && this.estadopedidocompra.getId()>=0)) {
						
					estadopedidocompraAux.setIsNew(false);
				}
				
				estadopedidocompraAux.setIsDeleted(false);
			
				estadopedidocompraAux.setId(this.estadopedidocompra.getId());	
				estadopedidocompraAux.setVersionRow(this.estadopedidocompra.getVersionRow());	
				estadopedidocompraAux.setcodigo(this.estadopedidocompra.getcodigo());	
				estadopedidocompraAux.setnombre(this.estadopedidocompra.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadopedidocompraAux,estadopedidocompraLogic.getEstadoPedidoCompras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadopedidocompraAux,estadopedidocompras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadopedidocompraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadopedidocompraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadopedidocompraLogic.saveEstadoPedidoCompras();//WithConnection
						//estadopedidocompraLogic.getSetVersionRowEstadoPedidoCompras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadopedidocompra,estadopedidocompraAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadopedidocompraAux=new  EstadoPedidoCompra();
				
				estadopedidocompraAux.setIsNew(false);
				estadopedidocompraAux.setIsChanged(false);
				
				estadopedidocompraAux.setIsDeleted(true);
				
				estadopedidocompraAux.setId(this.estadopedidocompra.getId());	
				estadopedidocompraAux.setVersionRow(this.estadopedidocompra.getVersionRow());	
				estadopedidocompraAux.setcodigo(this.estadopedidocompra.getcodigo());	
				estadopedidocompraAux.setnombre(this.estadopedidocompra.getnombre());	
				
				if(this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadopedidocompraAux.getId()>=0) {	
						this.estadopedidocomprasEliminados.add(estadopedidocompraAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadopedidocompraAux,estadopedidocompraLogic.getEstadoPedidoCompras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadopedidocompraAux,estadopedidocompras);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadopedidocompraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadopedidocompraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadopedidocompraLogic.saveEstadoPedidoCompras();//WithConnection
						//estadopedidocompraLogic.getSetVersionRowEstadoPedidoCompras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidocompraLogic.getEstadoPedidoCompras().addAll(this.estadopedidocomprasEliminados);
					
					estadopedidocompraLogic.saveEstadoPedidoCompras();//WithConnection
					//estadopedidocompraLogic.getSetVersionRowEstadoPedidoCompras();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadopedidocomprasEliminados= new ArrayList<EstadoPedidoCompra>();		
			}
			
			if(this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Pedido Compra GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Pedido Compra",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadopedidocompra=estadopedidocompraAux;
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
      		//this.finishProcessEstadoPedidoCompra();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoPedidoCompra estadopedidocompraLocal) throws Exception {
		
		if(this.estadopedidocompraSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoPedidoCompra estadopedidocompraLocal) throws Exception {	
		if(this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoPedidoCompraActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoPedidoCompra.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadopedidocompra =(EstadoPedidoCompra) this.estadopedidocompraLogic.getEstadoPedidoCompras().toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadopedidocompra =(EstadoPedidoCompra) this.estadopedidocompras.toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadopedidocompraValidator.getInvalidValues(this.estadopedidocompra);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoPedidoCompra estadopedidocompra,List<EstadoPedidoCompra> estadopedidocompras) throws Exception {
		try	{		
			EstadoPedidoCompraConstantesFunciones.actualizarLista(estadopedidocompra,estadopedidocompras,this.estadopedidocompraSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoPedidoCompra estadopedidocompra,List<EstadoPedidoCompra> estadopedidocompras) throws Exception {
		try	{			
			EstadoPedidoCompraConstantesFunciones.actualizarSelectedLista(estadopedidocompra,estadopedidocompras);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoPedidoCompra> estadopedidocomprasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadopedidocomprasLocal=this.estadopedidocompraLogic.getEstadoPedidoCompras();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadopedidocomprasLocal=this.estadopedidocompras;
			}
			//ARCHITECTURE
		
			for(EstadoPedidoCompra estadopedidocompraLocal:estadopedidocomprasLocal) {
				if(this.permiteMantenimiento(estadopedidocompraLocal) && estadopedidocompraLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoPedidoCompraConstantesFunciones.getEstadoPedidoCompraLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoPedidoCompraConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPedidoCompra.jLabelcodigoEstadoPedidoCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoPedidoCompraConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPedidoCompra.jLabelnombreEstadoPedidoCompra,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoPedidoCompra.jLabelcodigoEstadoPedidoCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoPedidoCompra.jLabelnombreEstadoPedidoCompra,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoPedidoCompra--;	
		
		
		this.estadopedidocompraAux=new EstadoPedidoCompra();
		
		this.estadopedidocompraAux.setId(this.iIdNuevoEstadoPedidoCompra);
		this.estadopedidocompraAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadopedidocompraLogic.getEstadoPedidoCompras().add(this.estadopedidocompraAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadopedidocompras.add(this.estadopedidocompraAux);
		}
		//ARCHITECTURE
		
		this.estadopedidocompra=this.estadopedidocompraAux;
		
		if(EstadoPedidoCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoPedidoCompra(this.estadopedidocompra);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoPedidoCompra(this.estadopedidocompra);
		}
				
		//this.setDefaultControlesEstadoPedidoCompra();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoPedidoCompra();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoPedidoCompra();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoPedidoCompra();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoPedidoCompra(this.estadopedidocompraBean,this.estadopedidocompra,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedidoCompra(this.estadopedidocompra);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadopedidocompraSessionBean.getConGuardarRelaciones()) {
			classes=EstadoPedidoCompraConstantesFunciones.getClassesRelationshipsOfEstadoPedidoCompra(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadopedidocompraReturnGeneral=estadopedidocompraLogic.procesarEventosEstadoPedidoComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadopedidocompraLogic.getEstadoPedidoCompras(),this.estadopedidocompra,this.estadopedidocompraParameterGeneral,this.isEsNuevoEstadoPedidoCompra,classes);//this.estadopedidocompraLogic.getEstadoPedidoCompra()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoPedidoCompra(this.estadopedidocompraReturnGeneral,this.estadopedidocompraBean,false);
		
		if(this.estadopedidocompraReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoPedidoCompra(this.estadopedidocompraReturnGeneral.getEstadoPedidoCompra());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoPedidoCompra(this.estadopedidocompraReturnGeneral.getEstadoPedidoCompra());
		}
		
		if(this.estadopedidocompraReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoPedidoCompra(this.estadopedidocompraReturnGeneral.getEstadoPedidoCompra(),classes);//this.estadopedidocompraBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoPedidoCompra(this.estadopedidocompra,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoPedidoCompra();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoPedidoCompra();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoPedidoCompra(false);
						
			if(estadopedidocompraSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EstadoPedidoCompraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoPedidoCompra();
			}
			
			this.actualizarVisualTableDatosEstadoPedidoCompra();
			
			this.jTableDatosEstadoPedidoCompra.setRowSelectionInterval(this.getIndiceNuevoEstadoPedidoCompra(), this.getIndiceNuevoEstadoPedidoCompra());
			
			this.seleccionarFilaTablaEstadoPedidoCompraActual();
						
			this.actualizarEstadoCeldasBotonesEstadoPedidoCompra("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoPedidoCompra(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jTextFieldcodigoEstadoPedidoCompra.setEnabled(isHabilitar && this.estadopedidocompraConstantesFunciones.activarcodigoEstadoPedidoCompra);
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jTextAreanombreEstadoPedidoCompra.setEnabled(isHabilitar && this.estadopedidocompraConstantesFunciones.activarnombreEstadoPedidoCompra);	
		
	};
	
	public void setDefaultControlesEstadoPedidoCompra() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoPedidoCompra(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadopedidocompraSessionBean.setConGuardarRelaciones(true);			
			this.estadopedidocompraSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jTabbedPaneRelacionesEstadoPedidoCompra.setVisible(true);
			
					
		} else {
			//this.estadopedidocompraSessionBean.setConGuardarRelaciones(false);			
			this.estadopedidocompraSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jTabbedPaneRelacionesEstadoPedidoCompra.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEstadoPedidoCompra() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPedidoCompra estadopedidocompraAux:this.estadopedidocompraLogic.getEstadoPedidoCompras()) {
				if(estadopedidocompraAux.getId().equals(this.iIdNuevoEstadoPedidoCompra)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPedidoCompra estadopedidocompraAux:this.estadopedidocompras) {
				if(estadopedidocompraAux.getId().equals(this.iIdNuevoEstadoPedidoCompra)) {
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
	
	public int getIndiceActualEstadoPedidoCompra(EstadoPedidoCompra estadopedidocompra,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPedidoCompra estadopedidocompraAux:this.estadopedidocompraLogic.getEstadoPedidoCompras()) {
				if(estadopedidocompraAux.getId().equals(estadopedidocompra.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPedidoCompra estadopedidocompraAux:this.estadopedidocompras) {
				if(estadopedidocompraAux.getId().equals(estadopedidocompra.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoPedidoCompra(EstadoPedidoCompra estadopedidocompraOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPedidoCompra estadopedidocompraAux:this.estadopedidocompraLogic.getEstadoPedidoCompras()) {
				if(estadopedidocompraAux.getEstadoPedidoCompraOriginal().getId().equals(estadopedidocompraOriginal.getId())) {
					existe=true;
					estadopedidocompraOriginal.setId(estadopedidocompraAux.getId());
					estadopedidocompraOriginal.setVersionRow(estadopedidocompraAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPedidoCompra estadopedidocompraAux:this.estadopedidocompras) {
				if(estadopedidocompraAux.getEstadoPedidoCompraOriginal().getId().equals(estadopedidocompraOriginal.getId())) {
					existe=true;
					estadopedidocompraOriginal.setId(estadopedidocompraAux.getId());
					estadopedidocompraOriginal.setVersionRow(estadopedidocompraAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoPedidoCompra(Boolean esParaCancelar) throws Exception {
		estadopedidocomprasAux=new ArrayList<EstadoPedidoCompra>();
		estadopedidocompraAux=new EstadoPedidoCompra();
		
		if(!this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoPedidoCompra estadopedidocompraAux:this.estadopedidocompraLogic.getEstadoPedidoCompras()) {
					if(estadopedidocompraAux.getId()<0) {
						estadopedidocomprasAux.add(estadopedidocompraAux);
					}		
				}
				this.iIdNuevoEstadoPedidoCompra=0L;
				this.estadopedidocompraLogic.getEstadoPedidoCompras().removeAll(estadopedidocomprasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoPedidoCompra estadopedidocompraAux:this.estadopedidocompras) {
					if(estadopedidocompraAux.getId()<0) {
						estadopedidocomprasAux.add(estadopedidocompraAux);
					}		
				}
				this.iIdNuevoEstadoPedidoCompra=0L;
				this.estadopedidocompras.removeAll(estadopedidocomprasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoPedidoCompra 
					&& this.estadopedidocompraLogic.getEstadoPedidoCompras().size()>0
					) {
					estadopedidocompraAux=this.estadopedidocompraLogic.getEstadoPedidoCompras().get(this.estadopedidocompraLogic.getEstadoPedidoCompras().size() - 1);
				
					if(estadopedidocompraAux.getId()<0) {
						this.estadopedidocompraLogic.getEstadoPedidoCompras().remove(estadopedidocompraAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoPedidoCompra && this.estadopedidocompras.size()>0) {
					estadopedidocompraAux=this.estadopedidocompras.get(this.estadopedidocompras.size() - 1);
				
					if(estadopedidocompraAux.getId()<0) {
						this.estadopedidocompras.remove(estadopedidocompraAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoPedidoCompra(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadopedidocompra.getId()<0) {
				this.estadopedidocompraLogic.getEstadoPedidoCompras().remove(this.estadopedidocompra);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadopedidocompra.getId()<0) {
				this.estadopedidocompras.remove(this.estadopedidocompra);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoPedidoCompra(List<EstadoPedidoCompra> estadopedidocomprasAux) throws Exception {
		EstadoPedidoCompraConstantesFunciones.setEstadosInicialesEstadoPedidoCompra(estadopedidocomprasAux);
	}
	
	public void setEstadosInicialesEstadoPedidoCompra(EstadoPedidoCompra estadopedidocompraAux) throws Exception {
		EstadoPedidoCompraConstantesFunciones.setEstadosInicialesEstadoPedidoCompra(estadopedidocompraAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoPedidoCompraActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoPedidoCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoPedidoCompraActual()) {
				if(!this.isEsNuevoEstadoPedidoCompra) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoPedidoCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoPedidoCompra=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoPedidoCompraActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Pedido Compra ?", "MANTENIMIENTO DE Estado Pedido Compra", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoPedidoCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoPedidoCompra estadopedidocompra) throws Exception {
		EstadoPedidoCompraConstantesFunciones.seleccionarAsignar(this.estadopedidocompra,estadopedidocompra);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoPedidoCompra=this.isPermisoActualizarOriginalEstadoPedidoCompra;
			
			
			this.seleccionarAsignar(estadopedidocompra);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoPedidoCompraConstantesFunciones.quitarEspaciosEstadoPedidoCompra(this.estadopedidocompra,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoPedidoCompra("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadopedidocompraSessionBean.setsFuncionBusquedaRapida(this.estadopedidocompraSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoPedidoCompra) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoPedidoCompra(esParaCancelar);				
				this.cancelarNuevoEstadoPedidoCompra(esParaCancelar);								
			}
			
			this.estadopedidocompra=new EstadoPedidoCompra();
			
			this.inicializarEstadoPedidoCompra();
			
			this.actualizarEstadoCeldasBotonesEstadoPedidoCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoPedidoCompra() throws Exception {
		try {
			EstadoPedidoCompraConstantesFunciones.inicializarEstadoPedidoCompra(this.estadopedidocompra);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadopedidocompraLogic.getEstadoPedidoCompras().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoPedidoCompras(String sAccionBusqueda,List<EstadoPedidoCompra> estadopedidocomprasParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoPedidoCompra"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoPedidoCompraMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoPedidoCompraMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoPedidoCompra"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Pedido Compras");		
		parameters.put("busquedapor", EstadoPedidoCompraConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoPedidoCompra=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoPedidoCompraConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoPedidoCompraConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoPedidoCompra=new JRBeanArrayDataSource(EstadoPedidoCompraJInternalFrame.TraerEstadoPedidoCompraBeans(estadopedidocomprasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoPedidoCompra);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoPedidoCompraConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoPedidoCompraConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoPedidoCompraBean.TraerEstadoPedidoCompraBeans(estadopedidocomprasParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoPedidoCompras(sAccionBusqueda,sTipoArchivoReporte,estadopedidocomprasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoPedidoCompras(sAccionBusqueda,sTipoArchivoReporte,estadopedidocomprasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoPedidoCompraActionPerformed(null);
					//this.generarExcelReporteEstadoPedidoCompras(sAccionBusqueda,sTipoArchivoReporte,estadopedidocomprasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoPedidoCompras(sAccionBusqueda,sTipoArchivoReporte,estadopedidocomprasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoPedidoCompras(sAccionBusqueda,sTipoArchivoReporte,estadopedidocomprasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoPedidoCompras(sAccionBusqueda,sTipoArchivoReporte,estadopedidocomprasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoPedidoCompras(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoPedidoCompra> estadopedidocomprasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopedidocompra";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoPedidoCompras");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoPedidoCompra("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoPedidoCompra estadopedidocompra : estadopedidocomprasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoPedidoCompraConstantesFunciones.generarExcelReporteDataEstadoPedidoCompra("NORMAL",row,workbook,estadopedidocompra,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Pedido Compra",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoPedidoCompra(String sTipo,Row row,Workbook workbook) {
		
		EstadoPedidoCompraConstantesFunciones.generarExcelReporteHeaderEstadoPedidoCompra(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoPedidoCompras(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoPedidoCompra> estadopedidocomprasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopedidocompra_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoPedidoCompras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoPedidoCompra estadopedidocompra : estadopedidocomprasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoPedidoCompraConstantesFunciones.getEstadoPedidoCompraDescripcion(estadopedidocompra));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoPedidoCompraConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoPedidoCompraConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadopedidocompra.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoPedidoCompraConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoPedidoCompraConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadopedidocompra.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Pedido Compra",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoPedidoCompras(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoPedidoCompra> estadopedidocomprasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoPedidoCompra> estadopedidocomprasRespaldo=null;
		
		classes=EstadoPedidoCompraConstantesFunciones.getClassesRelationshipsOfEstadoPedidoCompra(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadopedidocompraLogic.setDatosCliente(this.datosCliente);
		this.estadopedidocompraLogic.setDatosDeep(this.datosDeep);
		this.estadopedidocompraLogic.setIsConDeep(true);
		
		estadopedidocomprasRespaldo=this.estadopedidocompraLogic.getEstadoPedidoCompras();
		
		this.estadopedidocompraLogic.setEstadoPedidoCompras(estadopedidocomprasParaReportes);	
		this.estadopedidocompraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadopedidocomprasParaReportes=this.estadopedidocompraLogic.getEstadoPedidoCompras();
		this.estadopedidocompraLogic.setEstadoPedidoCompras(estadopedidocomprasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopedidocompra_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoPedidoCompras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoPedidoCompra("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoPedidoCompra estadopedidocompra : estadopedidocomprasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoPedidoCompra("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoPedidoCompraConstantesFunciones.generarExcelReporteDataEstadoPedidoCompra("NORMAL",row,workbook,estadopedidocompra,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EstadoPedidoCompraConstantesFunciones.getEstadoPedidoCompraDescripcion(estadopedidocompra));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Pedido Compra",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoPedidoCompra() throws Exception {		
		this.startProcessEstadoPedidoCompra(true);
	}
	
	public void startProcessEstadoPedidoCompra(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoPedidoCompra, this.jScrollPanelDatosEstadoPedidoCompra,this.jPanelPaginacionEstadoPedidoCompra, this.jScrollPanelDatosEdicionEstadoPedidoCompra, this.jPanelAccionesEstadoPedidoCompra,this.jPanelAccionesFormularioEstadoPedidoCompra,this.jmenuBarEstadoPedidoCompra,this.jmenuBarDetalleEstadoPedidoCompra,this.jTtoolBarEstadoPedidoCompra,this.jTtoolBarDetalleEstadoPedidoCompra);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoPedidoCompra=null; 
		
		final JPanel jPanelParametrosReportesEstadoPedidoCompra=this.jPanelParametrosReportesEstadoPedidoCompra;
		//final JScrollPane jScrollPanelDatosEstadoPedidoCompra=this.jScrollPanelDatosEstadoPedidoCompra;
		final JTable jTableDatosEstadoPedidoCompra=this.jTableDatosEstadoPedidoCompra;		
		final JPanel jPanelPaginacionEstadoPedidoCompra=this.jPanelPaginacionEstadoPedidoCompra;
		//final JScrollPane jScrollPanelDatosEdicionEstadoPedidoCompra=this.jScrollPanelDatosEdicionEstadoPedidoCompra;
		final JPanel jPanelAccionesEstadoPedidoCompra=this.jPanelAccionesEstadoPedidoCompra;
		
		JPanel jPanelCamposAuxiliarEstadoPedidoCompra=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoPedidoCompra=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) {
			jPanelCamposAuxiliarEstadoPedidoCompra=this.jInternalFrameDetalleFormEstadoPedidoCompra.jPanelCamposEstadoPedidoCompra;
			jPanelAccionesFormularioAuxiliarEstadoPedidoCompra=this.jInternalFrameDetalleFormEstadoPedidoCompra.jPanelAccionesFormularioEstadoPedidoCompra;
		}
		
		final JPanel jPanelCamposEstadoPedidoCompra=jPanelCamposAuxiliarEstadoPedidoCompra;
		final JPanel jPanelAccionesFormularioEstadoPedidoCompra=jPanelAccionesFormularioAuxiliarEstadoPedidoCompra;
		
		
		final JMenuBar jmenuBarEstadoPedidoCompra=this.jmenuBarEstadoPedidoCompra;
		final JToolBar jTtoolBarEstadoPedidoCompra=this.jTtoolBarEstadoPedidoCompra;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoPedidoCompra=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoPedidoCompra=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) {
			jmenuBarDetalleAuxiliarEstadoPedidoCompra=this.jInternalFrameDetalleFormEstadoPedidoCompra.jmenuBarDetalleEstadoPedidoCompra;
			jTtoolBarDetalleAuxiliarEstadoPedidoCompra=this.jInternalFrameDetalleFormEstadoPedidoCompra.jTtoolBarDetalleEstadoPedidoCompra;
		}
		
		final JMenuBar jmenuBarDetalleEstadoPedidoCompra=jmenuBarDetalleAuxiliarEstadoPedidoCompra;
		final JToolBar jTtoolBarDetalleEstadoPedidoCompra=jTtoolBarDetalleAuxiliarEstadoPedidoCompra;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoPedidoCompra;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoPedidoCompra;
			processRunnable.jTableDatos=jTableDatosEstadoPedidoCompra;
			processRunnable.jPanelCampos=jPanelCamposEstadoPedidoCompra;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoPedidoCompra;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoPedidoCompra;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoPedidoCompra;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoPedidoCompra;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoPedidoCompra;
			processRunnable.jTtoolBar=jTtoolBarEstadoPedidoCompra;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoPedidoCompra;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoPedidoCompra ,jPanelParametrosReportesEstadoPedidoCompra,jTableDatosEstadoPedidoCompra, /*jScrollPanelDatosEstadoPedidoCompra,*/jPanelCamposEstadoPedidoCompra,jPanelPaginacionEstadoPedidoCompra, /*jScrollPanelDatosEdicionEstadoPedidoCompra,*/ jPanelAccionesEstadoPedidoCompra,jPanelAccionesFormularioEstadoPedidoCompra,jmenuBarEstadoPedidoCompra,jmenuBarDetalleEstadoPedidoCompra,jTtoolBarEstadoPedidoCompra,jTtoolBarDetalleEstadoPedidoCompra);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoPedidoCompra, jScrollPanelDatosEstadoPedidoCompra,jPanelPaginacionEstadoPedidoCompra, jScrollPanelDatosEdicionEstadoPedidoCompra, jPanelAccionesEstadoPedidoCompra,jPanelAccionesFormularioEstadoPedidoCompra,jmenuBarEstadoPedidoCompra,jmenuBarDetalleEstadoPedidoCompra,jTtoolBarEstadoPedidoCompra,jTtoolBarDetalleEstadoPedidoCompra);
						
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
	
	public void finishProcessEstadoPedidoCompra() {// throws Exception 
		this.finishProcessEstadoPedidoCompra(true);
	}
	
	public void finishProcessEstadoPedidoCompra(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoPedidoCompra, this.jScrollPanelDatosEstadoPedidoCompra,this.jPanelPaginacionEstadoPedidoCompra, this.jScrollPanelDatosEdicionEstadoPedidoCompra, this.jPanelAccionesEstadoPedidoCompra,this.jPanelAccionesFormularioEstadoPedidoCompra,this.jmenuBarEstadoPedidoCompra,this.jmenuBarDetalleEstadoPedidoCompra,this.jTtoolBarEstadoPedidoCompra,this.jTtoolBarDetalleEstadoPedidoCompra);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoPedidoCompra=null; 
		
		final JPanel jPanelParametrosReportesEstadoPedidoCompra=this.jPanelParametrosReportesEstadoPedidoCompra;
		//final JScrollPane jScrollPanelDatosEstadoPedidoCompra=this.jScrollPanelDatosEstadoPedidoCompra;
		final JTable jTableDatosEstadoPedidoCompra=this.jTableDatosEstadoPedidoCompra;		
		final JPanel jPanelPaginacionEstadoPedidoCompra=this.jPanelPaginacionEstadoPedidoCompra;
		//final JScrollPane jScrollPanelDatosEdicionEstadoPedidoCompra=this.jScrollPanelDatosEdicionEstadoPedidoCompra;
		final JPanel jPanelAccionesEstadoPedidoCompra=this.jPanelAccionesEstadoPedidoCompra;
		
		JPanel jPanelCamposAuxiliarEstadoPedidoCompra=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoPedidoCompra=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) {
			jPanelCamposAuxiliarEstadoPedidoCompra=this.jInternalFrameDetalleFormEstadoPedidoCompra.jPanelCamposEstadoPedidoCompra;
			jPanelAccionesFormularioAuxiliarEstadoPedidoCompra=this.jInternalFrameDetalleFormEstadoPedidoCompra.jPanelAccionesFormularioEstadoPedidoCompra;
		}
		
		final JPanel jPanelCamposEstadoPedidoCompra=jPanelCamposAuxiliarEstadoPedidoCompra;
		final JPanel jPanelAccionesFormularioEstadoPedidoCompra=jPanelAccionesFormularioAuxiliarEstadoPedidoCompra;
		
		
		final JMenuBar jmenuBarEstadoPedidoCompra=this.jmenuBarEstadoPedidoCompra;		
		final JToolBar jTtoolBarEstadoPedidoCompra=this.jTtoolBarEstadoPedidoCompra;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoPedidoCompra=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoPedidoCompra=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) {
			jmenuBarDetalleAuxiliarEstadoPedidoCompra=this.jInternalFrameDetalleFormEstadoPedidoCompra.jmenuBarDetalleEstadoPedidoCompra;
			jTtoolBarDetalleAuxiliarEstadoPedidoCompra=this.jInternalFrameDetalleFormEstadoPedidoCompra.jTtoolBarDetalleEstadoPedidoCompra;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoPedidoCompra=jmenuBarDetalleAuxiliarEstadoPedidoCompra;
		final JToolBar jTtoolBarDetalleEstadoPedidoCompra=jTtoolBarDetalleAuxiliarEstadoPedidoCompra;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoPedidoCompra;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoPedidoCompra;
			processRunnable.jTableDatos=jTableDatosEstadoPedidoCompra;
			processRunnable.jPanelCampos=jPanelCamposEstadoPedidoCompra;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoPedidoCompra;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoPedidoCompra;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoPedidoCompra;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoPedidoCompra;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoPedidoCompra;
			processRunnable.jTtoolBar=jTtoolBarEstadoPedidoCompra;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoPedidoCompra;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoPedidoCompra ,jPanelParametrosReportesEstadoPedidoCompra, jTableDatosEstadoPedidoCompra,/*jScrollPanelDatosEstadoPedidoCompra,*/jPanelCamposEstadoPedidoCompra,jPanelPaginacionEstadoPedidoCompra, /*jScrollPanelDatosEdicionEstadoPedidoCompra,*/ jPanelAccionesEstadoPedidoCompra,jPanelAccionesFormularioEstadoPedidoCompra,jmenuBarEstadoPedidoCompra,jmenuBarDetalleEstadoPedidoCompra,jTtoolBarEstadoPedidoCompra,jTtoolBarDetalleEstadoPedidoCompra));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoPedidoCompra(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoPedidoCompra(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoPedidoCompra(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoPedidoCompra(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoPedidoCompra,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoPedidoCompra,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoPedidoCompra(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoPedidoCompra,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoPedidoCompra,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadopedidocompraConstantesFunciones.getsFinalQueryEstadoPedidoCompra();
		String  finalQueryPaginacionTodos=this.estadopedidocompraConstantesFunciones.getsFinalQueryEstadoPedidoCompra();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoPedidoCompraConstantesFunciones.getArrayColumnasGlobalesNoEstadoPedidoCompra(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoPedidoCompraConstantesFunciones.getArrayColumnasGlobalesEstadoPedidoCompra(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoPedidoCompraConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadopedidocomprasEliminados= new ArrayList<EstadoPedidoCompra>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoPedidoCompra();
		
				///*EstadoPedidoCompraSessionBean*/this.estadopedidocompraSessionBean=new EstadoPedidoCompraSessionBean();
			
			if(this.estadopedidocompraSessionBean==null) {
				this.estadopedidocompraSessionBean=new EstadoPedidoCompraSessionBean();
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
					this.iNumeroPaginacion=EstadoPedidoCompraConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoPedidoCompraConstantesFunciones.getClassesForeignKeysOfEstadoPedidoCompra(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadopedidocompra."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadopedidocomprasAux= new ArrayList<EstadoPedidoCompra>();
			
				
			estadopedidocompraLogic.setDatosCliente(this.datosCliente);
			estadopedidocompraLogic.setDatosDeep(this.datosDeep);
			estadopedidocompraLogic.setIsConDeep(true);
			
			
			estadopedidocompraLogic.getEstadoPedidoCompraDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadopedidocompraLogic.getTodosEstadoPedidoCompras(finalQueryGlobal,pagination);
					
					//estadopedidocompraLogic.getTodosEstadoPedidoComprasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadopedidocompraLogic.getEstadoPedidoCompras()==null|| estadopedidocompraLogic.getEstadoPedidoCompras().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadopedidocomprasAux= new ArrayList<EstadoPedidoCompra>();
							estadopedidocomprasAux.addAll(estadopedidocompraLogic.getEstadoPedidoCompras());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadopedidocomprasAux= new ArrayList<EstadoPedidoCompra>();
							estadopedidocomprasAux.addAll(estadopedidocompras);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadopedidocompraLogic.getTodosEstadoPedidoCompras(finalQueryGlobal+"",this.pagination);												
							
							//estadopedidocompraLogic.getTodosEstadoPedidoComprasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoPedidoCompras("Todos",estadopedidocompraLogic.getEstadoPedidoCompras() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadopedidocompraLogic.setEstadoPedidoCompras(new ArrayList<EstadoPedidoCompra>());					
							estadopedidocompraLogic.getEstadoPedidoCompras().addAll(estadopedidocomprasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadopedidocompras=new ArrayList<EstadoPedidoCompra>();
							estadopedidocompras.addAll(estadopedidocomprasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoPedidoCompra=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoPedidoCompra=this.idActual;
				
				} else if(this.idEstadoPedidoCompraActual!=null && this.idEstadoPedidoCompraActual!=0L) {
					idEstadoPedidoCompra=idEstadoPedidoCompraActual;
				}
				
					
				this.sDetalleReporte=EstadoPedidoCompraConstantesFunciones.getDetalleIndicePorId(idEstadoPedidoCompra);
				
				this.estadopedidocompras=new ArrayList<EstadoPedidoCompra>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadopedidocompraLogic.getEntity(idEstadoPedidoCompra);
					
					//estadopedidocompraLogic.getEntityWithConnection(idEstadoPedidoCompra);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadopedidocompraLogic.setEstadoPedidoCompras(new ArrayList<EstadoPedidoCompra>());
					estadopedidocompraLogic.getEstadoPedidoCompras().add(estadopedidocompraLogic.getEstadoPedidoCompra());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadopedidocompras=new ArrayList<EstadoPedidoCompra>();
					this.estadopedidocompras.add(estadopedidocompra);
				}
				
				if(estadopedidocompraLogic.getEstadoPedidoCompra()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoPedidoCompra();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoPedidoCompra();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadopedidocompraLogic.getEstadoPedidoCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadopedidocompras.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadopedidocompraLogic.getEstadoPedidoCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadopedidocompras.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoPedidoCompra estadopedidocompra) {
		Boolean permite=true;
		
		if(this.estadopedidocompra.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoPedidoCompraConstantesFunciones.getOrderByListaEstadoPedidoCompra();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoPedidoCompraConstantesFunciones.getOrderByListaEstadoPedidoCompra();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPedidoCompra estadopedidocompra:estadopedidocompraLogic.getEstadoPedidoCompras()) {
				if(estadopedidocompra.getsType().equals(Constantes2.S_TOTALES)) {
					estadopedidocompraTotales=estadopedidocompra;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPedidoCompra estadopedidocompra:this.estadopedidocompras) {
				if(estadopedidocompra.getsType().equals(Constantes2.S_TOTALES)) {
					estadopedidocompraTotales=estadopedidocompra;
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
			this.estadopedidocompraAux=new EstadoPedidoCompra();
			this.estadopedidocompraAux.setsType(Constantes2.S_TOTALES);
			this.estadopedidocompraAux.setIsNew(false);
			this.estadopedidocompraAux.setIsChanged(false);
			this.estadopedidocompraAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoPedidoCompraConstantesFunciones.TotalizarValoresFilaEstadoPedidoCompra(this.estadopedidocompraLogic.getEstadoPedidoCompras(),this.estadopedidocompraAux);
				
				this.estadopedidocompraLogic.getEstadoPedidoCompras().add(this.estadopedidocompraAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoPedidoCompraConstantesFunciones.TotalizarValoresFilaEstadoPedidoCompra(this.estadopedidocompras,this.estadopedidocompraAux);
				
				this.estadopedidocompras.add(this.estadopedidocompraAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadopedidocompraTotales=new EstadoPedidoCompra();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadopedidocompraLogic.getEstadoPedidoCompras().remove(estadopedidocompraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadopedidocompras.remove(estadopedidocompraTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadopedidocompraTotales=new EstadoPedidoCompra();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPedidoCompra estadopedidocompra:estadopedidocompraLogic.getEstadoPedidoCompras()) {
				if(estadopedidocompra.getsType().equals(Constantes2.S_TOTALES)) {
					estadopedidocompraTotales=estadopedidocompra;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoPedidoCompraConstantesFunciones.TotalizarValoresFilaEstadoPedidoCompra(this.estadopedidocompraLogic.getEstadoPedidoCompras(),estadopedidocompraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPedidoCompra estadopedidocompra:this.estadopedidocompras) {
				if(estadopedidocompra.getsType().equals(Constantes2.S_TOTALES)) {
					estadopedidocompraTotales=estadopedidocompra;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoPedidoCompraConstantesFunciones.TotalizarValoresFilaEstadoPedidoCompra(this.estadopedidocompras,estadopedidocompraTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosEstadoPedidoCompra() {
		this.isPermisoTodoEstadoPedidoCompra=false;
		this.isPermisoNuevoEstadoPedidoCompra=false;
		this.isPermisoActualizarEstadoPedidoCompra=false;
		this.isPermisoActualizarOriginalEstadoPedidoCompra=false;
		this.isPermisoEliminarEstadoPedidoCompra=false;
		this.isPermisoGuardarCambiosEstadoPedidoCompra=false;
		this.isPermisoConsultaEstadoPedidoCompra=false;
		this.isPermisoBusquedaEstadoPedidoCompra=false;
		this.isPermisoReporteEstadoPedidoCompra=false;		
		this.isPermisoOrdenEstadoPedidoCompra=false;		
		this.isPermisoPaginacionMedioEstadoPedidoCompra=false;		
		this.isPermisoPaginacionAltoEstadoPedidoCompra=false;
		this.isPermisoPaginacionTodoEstadoPedidoCompra=false;
		this.isPermisoCopiarEstadoPedidoCompra=false;		
		this.isPermisoVerFormEstadoPedidoCompra=false;		
		this.isPermisoDuplicarEstadoPedidoCompra=false;		
		this.isPermisoOrdenEstadoPedidoCompra=false;		
	}
	
	public void setPermisosUsuarioEstadoPedidoCompra(Boolean isPermiso) {
		this.isPermisoTodoEstadoPedidoCompra=isPermiso;
		this.isPermisoNuevoEstadoPedidoCompra=isPermiso;
		this.isPermisoActualizarEstadoPedidoCompra=isPermiso;
		this.isPermisoActualizarOriginalEstadoPedidoCompra=isPermiso;
		this.isPermisoEliminarEstadoPedidoCompra=isPermiso;
		this.isPermisoGuardarCambiosEstadoPedidoCompra=isPermiso;
		this.isPermisoConsultaEstadoPedidoCompra=isPermiso;
		this.isPermisoBusquedaEstadoPedidoCompra=isPermiso;
		this.isPermisoReporteEstadoPedidoCompra=isPermiso;
		this.isPermisoOrdenEstadoPedidoCompra=isPermiso;		
		this.isPermisoPaginacionMedioEstadoPedidoCompra=isPermiso;		
		this.isPermisoPaginacionAltoEstadoPedidoCompra=isPermiso;		
		this.isPermisoPaginacionTodoEstadoPedidoCompra=isPermiso;		
		this.isPermisoCopiarEstadoPedidoCompra=isPermiso;		
		this.isPermisoVerFormEstadoPedidoCompra=isPermiso;		
		this.isPermisoDuplicarEstadoPedidoCompra=isPermiso;
		this.isPermisoOrdenEstadoPedidoCompra=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoPedidoCompra(Boolean isPermiso) {
		//this.isPermisoTodoEstadoPedidoCompra=isPermiso;
		this.isPermisoNuevoEstadoPedidoCompra=isPermiso;
		this.isPermisoActualizarEstadoPedidoCompra=isPermiso;
		this.isPermisoActualizarOriginalEstadoPedidoCompra=isPermiso;
		this.isPermisoEliminarEstadoPedidoCompra=isPermiso;
		this.isPermisoGuardarCambiosEstadoPedidoCompra=isPermiso;
		//this.isPermisoConsultaEstadoPedidoCompra=isPermiso;
		//this.isPermisoBusquedaEstadoPedidoCompra=isPermiso;
		//this.isPermisoReporteEstadoPedidoCompra=isPermiso;
		//this.isPermisoOrdenEstadoPedidoCompra=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoPedidoCompra=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoPedidoCompra=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoPedidoCompra=isPermiso;		
		//this.isPermisoCopiarEstadoPedidoCompra=isPermiso;		
		//this.isPermisoDuplicarEstadoPedidoCompra=isPermiso;
		//this.isPermisoOrdenEstadoPedidoCompra=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoPedidoCompraClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EstadoPedidoCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoPedidoCompra(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoPedidoCompraClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoPedidoCompraClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoPedidoCompraClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoPedidoCompraClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEstadoPedidoCompra() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoPedidoCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoPedidoCompraConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoPedidoCompra=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoPedidoCompra=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoPedidoCompra=this.isPermisoActualizarEstadoPedidoCompra;
			this.isPermisoEliminarEstadoPedidoCompra=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoPedidoCompra=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoPedidoCompra=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoPedidoCompra=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoPedidoCompra=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoPedidoCompra=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoPedidoCompra=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoPedidoCompra=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoPedidoCompra=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoPedidoCompra=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoPedidoCompra=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoPedidoCompra=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoPedidoCompra=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoPedidoCompra=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoPedidoCompra.setToolTipText(this.jTableDatosEstadoPedidoCompra.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoPedidoCompra(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoPedidoCompra(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoPedidoCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoPedidoCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoPedidoCompra() throws Exception {
		Reporte reporte=null;
		
		
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	public void inicializarCombosForeignKeyEstadoPedidoCompraListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoPedidoCompraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoPedidoCompraJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoPedidoCompraListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoPedidoCompraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoPedidoCompra()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoPedidoCompra()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoPedidoCompra(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoPedidoCompra()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoPedidoCompra();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoPedidoCompra(EstadoPedidoCompra estadopedidocompra)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoPedidoCompra(EstadoPedidoCompra estadopedidocompra,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoPedidoCompra()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoPedidoCompra()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoPedidoCompra()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoPedidoCompra()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoPedidoCompra()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoPedidoCompra()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoPedidoCompra(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoPedidoCompra()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoPedidoCompraBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoPedidoCompraBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoPedidoCompraBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadopedidocompraSessionBean=new EstadoPedidoCompraSessionBean(); 
		this.estadopedidocompraConstantesFunciones=new EstadoPedidoCompraConstantesFunciones(); 
		this.estadopedidocompraBean=new EstadoPedidoCompra();//(this.estadopedidocompraConstantesFunciones); 		
		this.estadopedidocompraReturnGeneral=new EstadoPedidoCompraParameterReturnGeneral(); 
		
		this.estadopedidocompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadopedidocompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoPedidoCompraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoPedidoCompraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoPedidoCompraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoPedidoCompra(true);
			
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
			
			this.estadopedidocompraConstantesFunciones=new EstadoPedidoCompraConstantesFunciones(); 
			this.estadopedidocompraBean=new EstadoPedidoCompra();//this.estadopedidocompraConstantesFunciones); 			
			this.estadopedidocompraReturnGeneral=new EstadoPedidoCompraParameterReturnGeneral(); 
		
			EstadoPedidoCompraBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Pedido Compra Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadopedidocompra=new EstadoPedidoCompra();
			this.estadopedidocompras = new ArrayList<EstadoPedidoCompra>();
			this.estadopedidocomprasAux = new ArrayList<EstadoPedidoCompra>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic=new EstadoPedidoCompraLogic();
				this.estadopedidocompraLogic.getNewConnexionToDeep("");
			}
			
			//this.estadopedidocompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadopedidocompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoPedidoCompra);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoPedidoCompra!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoPedidoCompra);	
					}
					
					if(this.jInternalFrameImportacionEstadoPedidoCompra!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoPedidoCompra);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoPedidoCompra!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoPedidoCompra);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoPedidoCompra);
				this.jInternalFrameDetalleFormEstadoPedidoCompra.setVisible(false);
				this.jInternalFrameDetalleFormEstadoPedidoCompra.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoPedidoCompra!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoPedidoCompra);
					this.jInternalFrameReporteDinamicoEstadoPedidoCompra.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoPedidoCompra.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoPedidoCompra!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoPedidoCompra);
					this.jInternalFrameImportacionEstadoPedidoCompra.setVisible(false);
					this.jInternalFrameImportacionEstadoPedidoCompra.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoPedidoCompra!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoPedidoCompra);
					this.jInternalFrameOrderByEstadoPedidoCompra.setVisible(false);
					this.jInternalFrameOrderByEstadoPedidoCompra.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoPedidoCompraActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoPedidoCompraConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadopedidocompraReturnGeneral=new EstadoPedidoCompraParameterReturnGeneral();
			
			this.estadopedidocompraParameterGeneral=new EstadoPedidoCompraParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadopedidocompraLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoPedidoCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoPedidoCompraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadopedidocompraSessionBean.getEsGuardarRelacionado(),this.estadopedidocompraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoPedidoCompraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadopedidocompraSessionBean.getEsGuardarRelacionado(),this.estadopedidocompraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoPedidoCompra=false;
			this.isVisibilidadCeldaDuplicarEstadoPedidoCompra=true;
			this.isVisibilidadCeldaCopiarEstadoPedidoCompra=true;
			this.isVisibilidadCeldaVerFormEstadoPedidoCompra=true;
			this.isVisibilidadCeldaOrdenEstadoPedidoCompra=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPedidoCompra=false;
			this.isVisibilidadCeldaModificarEstadoPedidoCompra=false;
			this.isVisibilidadCeldaActualizarEstadoPedidoCompra=false;
			this.isVisibilidadCeldaEliminarEstadoPedidoCompra=false;
			this.isVisibilidadCeldaCancelarEstadoPedidoCompra=false;
			this.isVisibilidadCeldaGuardarEstadoPedidoCompra=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPedidoCompra=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoPedidoCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoPedidoCompra();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoPedidoCompra(false);
			
			this.setPermisosUsuarioEstadoPedidoCompra();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadopedidocompraSessionBean.getEsGuardarRelacionado() 
				|| (this.estadopedidocompraSessionBean.getEsGuardarRelacionado() && this.estadopedidocompraSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoPedidoCompraClasesRelacionadas();
			}
			
			if(this.estadopedidocompraSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoPedidoCompraClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoPedidoCompraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoPedidoCompra();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoPedidoCompra();
			}
			
			if(!this.isPermisoBusquedaEstadoPedidoCompra) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoPedidoCompra,this.isPermisoPaginacionMedioEstadoPedidoCompra,this.isPermisoPaginacionTodoEstadoPedidoCompra);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoPedidoCompraConstantesFunciones.getTiposSeleccionarEstadoPedidoCompra());
				
				this.tiposColumnasSelect=EstadoPedidoCompraConstantesFunciones.getTiposSeleccionarEstadoPedidoCompra(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
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
			//if(!this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoPedidoCompra();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoPedidoCompra(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoPedidoCompra(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoPedidoCompra() ;
			
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
				estadopedidocompraImplementable= (EstadoPedidoCompraImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoPedidoCompraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadopedidocompraImplementableHome= (EstadoPedidoCompraImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoPedidoCompraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadopedidocompras= new ArrayList<EstadoPedidoCompra>();
			this.estadopedidocomprasEliminados= new ArrayList<EstadoPedidoCompra>();
						
			this.isEsNuevoEstadoPedidoCompra=false;
			this.esParaAccionDesdeFormularioEstadoPedidoCompra=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoPedidoCompra(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoPedidoCompra();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoPedidoCompraConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoPedidoCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoPedidoCompra(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoPedidoCompra();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoPedidoCompra();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoPedidoCompra(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoPedidoCompra: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoPedidoCompra() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoPedidoCompra")) {
				iIndex=this.jInternalFrameDetalleFormEstadoPedidoCompra.jTabbedPaneRelacionesEstadoPedidoCompra.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoPedidoCompra.jTabbedPaneRelacionesEstadoPedidoCompra.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoPedidoCompra.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoPedidoCompra();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyEstadoPedidoCompra(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoPedidoCompra(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoPedidoCompra(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoPedidoCompraListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoPedidoCompra();
		
		this.cargarCombosFrameForeignKeyEstadoPedidoCompra();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoPedidoCompra();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoPedidoCompra();
		}
	}
	
	
	
	public void jButtonNuevoEstadoPedidoCompraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadopedidocompraSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoPedidoCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
			
			
			if(jTableDatosEstadoPedidoCompra.getRowCount()>=1) {
				jTableDatosEstadoPedidoCompra.removeRowSelectionInterval(0, jTableDatosEstadoPedidoCompra.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoPedidoCompra=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoPedidoCompra(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoPedidoCompra(true);			
			//this.estadopedidocompra=new EstadoPedidoCompra();
			//this.estadopedidocompra.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoPedidoCompra(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoPedidoCompra() ;
			
			if(EstadoPedidoCompraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoPedidoCompra(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadopedidocompra);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadopedidocompra);				
			
			EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
			
			if(this.estadopedidocompraSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoPedidoCompra: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoPedidoCompraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoPedidoCompra> estadopedidocomprasSeleccionados=new ArrayList<EstadoPedidoCompra>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoPedidoCompra.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoPedidoCompra.getSelectedRows().length;			
			}
			
			estadopedidocomprasSeleccionados=this.getEstadoPedidoComprasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoPedidoCompra--;			
				//EstadoPedidoCompra estadopedidocompraAux= new EstadoPedidoCompra();			
				//estadopedidocompraAux.setId(this.iIdNuevoEstadoPedidoCompra);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoPedidoCompra estadopedidocompraOrigen=new EstadoPedidoCompra();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoPedidoCompra estadopedidocompraOrigen : estadopedidocomprasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoPedidoCompra.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadopedidocompraOrigen =(EstadoPedidoCompra) this.estadopedidocompraLogic.getEstadoPedidoCompras().toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadopedidocompraOrigen =(EstadoPedidoCompra) this.estadopedidocompras.toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoPedidoCompra();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadopedidocompra.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoPedidoCompra(estadopedidocompraOrigen,this.estadopedidocompra,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedidoCompra(this.estadopedidocompra);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadopedidocompraLogic.getEstadoPedidoCompras().add(this.estadopedidocompraAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadopedidocompras.add(this.estadopedidocompraAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoPedidoCompra(false);
				
				this.jTableDatosEstadoPedidoCompra.setRowSelectionInterval(this.getIndiceNuevoEstadoPedidoCompra(), this.getIndiceNuevoEstadoPedidoCompra());
				
				int iLastRow =  this.jTableDatosEstadoPedidoCompra.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoPedidoCompra.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoPedidoCompra.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoPedidoCompra(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoPedidoCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoPedidoCompra> estadopedidocomprasSeleccionados=new ArrayList<EstadoPedidoCompra>();									
		
			EstadoPedidoCompra estadopedidocompraOrigen=new EstadoPedidoCompra();
			EstadoPedidoCompra estadopedidocompraDestino=new EstadoPedidoCompra();
				
			estadopedidocomprasSeleccionados=this.getEstadoPedidoComprasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoPedidoCompra.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadopedidocomprasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoPedidoCompra.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadopedidocompraOrigen =(EstadoPedidoCompra) this.estadopedidocompraLogic.getEstadoPedidoCompras().toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadopedidocompraOrigen =(EstadoPedidoCompra) this.estadopedidocompras.toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadopedidocompraDestino =(EstadoPedidoCompra) this.estadopedidocompraLogic.getEstadoPedidoCompras().toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadopedidocompraDestino =(EstadoPedidoCompra) this.estadopedidocompras.toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadopedidocompraOrigen =estadopedidocomprasSeleccionados.get(0);
				estadopedidocompraDestino =estadopedidocomprasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoPedidoCompra(estadopedidocompraOrigen,estadopedidocompraDestino,true,false);
				
				estadopedidocompraDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadopedidocompraDestino,estadopedidocompraLogic.getEstadoPedidoCompras());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadopedidocompraDestino,estadopedidocompras);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoPedidoCompra(false);
				
				//this.jTableDatosEstadoPedidoCompra.setRowSelectionInterval(this.getIndiceNuevoEstadoPedidoCompra(), this.getIndiceNuevoEstadoPedidoCompra());
				
				int iLastRow =  this.jTableDatosEstadoPedidoCompra.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoPedidoCompra.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoPedidoCompra.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoPedidoCompra(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoPedidoCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoPedidoCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoPedidoCompra.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoPedidoCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoPedidoCompra.isVisible();
			
			
			this.jPanelParametrosReportesEstadoPedidoCompra.setVisible(!isVisible);
			this.jPanelPaginacionEstadoPedidoCompra.setVisible(!isVisible);
			this.jPanelAccionesEstadoPedidoCompra.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoPedidoCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoPedidoCompra();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoPedidoCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoPedidoCompra();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoPedidoCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoPedidoCompra();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoPedidoCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoPedidoCompra();
			
			this.abrirFrameOrderByEstadoPedidoCompra();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoPedidoCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoPedidoCompra();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoPedidoCompra(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoPedidoCompra);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoPedidoCompra.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoPedidoCompra.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoPedidoCompra.setSize(this.jInternalFrameDetalleFormEstadoPedidoCompra.iWidthFormulario,this.jInternalFrameDetalleFormEstadoPedidoCompra.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoPedidoCompra.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoPedidoCompra.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoPedidoCompra.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoPedidoCompra.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoPedidoCompra.jContentPaneDetalleEstadoPedidoCompra.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoPedidoCompra.jTabbedPaneRelacionesEstadoPedidoCompra.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoPedidoCompra.jContentPaneDetalleEstadoPedidoCompra.getWidth(),EstadoPedidoCompraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoPedidoCompra.jTabbedPaneRelacionesEstadoPedidoCompra.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoPedidoCompra.jContentPaneDetalleEstadoPedidoCompra.getWidth(),EstadoPedidoCompraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoPedidoCompra.jTabbedPaneRelacionesEstadoPedidoCompra.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoPedidoCompra.jContentPaneDetalleEstadoPedidoCompra.getWidth(),EstadoPedidoCompraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoPedidoCompra.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoPedidoCompra.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoPedidoCompra() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoPedidoCompra==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoPedidoCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoPedidoCompra,false,this);
				} else {
					this.jInternalFrameOrderByEstadoPedidoCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoPedidoCompra,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoPedidoCompra);
				this.jInternalFrameOrderByEstadoPedidoCompra.setVisible(false);
				this.jInternalFrameOrderByEstadoPedidoCompra.setSelected(false);
				
				this.jInternalFrameOrderByEstadoPedidoCompra.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoPedidoCompra"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoPedidoCompra();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoPedidoCompra() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoPedidoCompra==null) {
				
				this.jInternalFrameImportacionEstadoPedidoCompra=new ImportacionJInternalFrame(EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoPedidoCompra);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoPedidoCompra);
				this.jInternalFrameImportacionEstadoPedidoCompra.setVisible(false);
				this.jInternalFrameImportacionEstadoPedidoCompra.setSelected(false);


				this.jInternalFrameImportacionEstadoPedidoCompra.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoPedidoCompra"));
				this.jInternalFrameImportacionEstadoPedidoCompra.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoPedidoCompra"));
				this.jInternalFrameImportacionEstadoPedidoCompra.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoPedidoCompra"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoPedidoCompra() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoPedidoCompra==null) {
				this.jInternalFrameReporteDinamicoEstadoPedidoCompra=new ReporteDinamicoJInternalFrame(EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoPedidoCompra);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoPedidoCompra);
				this.jInternalFrameReporteDinamicoEstadoPedidoCompra.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoPedidoCompra.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoPedidoCompra"));
				this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoPedidoCompra"));
				this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoPedidoCompra"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoPedidoCompra();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleEstadoPedidoCompra() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoPedidoCompra);
			
	       	this.jInternalFrameDetalleFormEstadoPedidoCompra.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoPedidoCompra.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoPedidoCompra.dispose();
			//this.jInternalFrameDetalleFormEstadoPedidoCompra=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoPedidoCompra() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoPedidoCompra.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoPedidoCompra.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoPedidoCompra() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoPedidoCompra.setVisible(true);
	        this.jInternalFrameImportacionEstadoPedidoCompra.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoPedidoCompra() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoPedidoCompra.setVisible(true);
	        this.jInternalFrameOrderByEstadoPedidoCompra.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoPedidoCompra() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoPedidoCompra.setVisible(false);
	        this.jInternalFrameOrderByEstadoPedidoCompra.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoPedidoCompra() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoPedidoCompra.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoPedidoCompra.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoPedidoCompra() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoPedidoCompra.setVisible(false);
	        this.jInternalFrameImportacionEstadoPedidoCompra.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoPedidoCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoPedidoCompra(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoPedidoCompra(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoPedidoCompra.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoPedidoCompra(true);
			//this.isEsNuevoEstadoPedidoCompra=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompra =(EstadoPedidoCompra) this.estadopedidocompraLogic.getEstadoPedidoCompras().toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadopedidocompra =(EstadoPedidoCompra) this.estadopedidocompras.toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoPedidoCompra("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoPedidoCompra(false) ;
			
			if(estadopedidocompraSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EstadoPedidoCompraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoPedidoCompra(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoPedidoCompra(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoPedidoCompraActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoPedidoCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidocompra =(EstadoPedidoCompra) this.estadopedidocompraLogic.getEstadoPedidoCompras().toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopedidocompra =(EstadoPedidoCompra) this.estadopedidocompras.toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoPedidoCompra(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoPedidoCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoPedidoCompra.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoPedidoCompra(true);
			//this.isEsNuevoEstadoPedidoCompra=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompra =(EstadoPedidoCompra) this.estadopedidocompraLogic.getEstadoPedidoCompras().toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadopedidocompra =(EstadoPedidoCompra) this.estadopedidocompras.toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadopedidocompra.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoPedidoCompra("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoPedidoCompra(false) ;
			
			if(EstadoPedidoCompraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoPedidoCompra(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoPedidoCompra(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoPedidoCompraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoPedidoCompra(false);
			
			//if(!this.isEsNuevoEstadoPedidoCompra) {								
				int intSelectedRow = this.jTableDatosEstadoPedidoCompra.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidocompra =(EstadoPedidoCompra) this.estadopedidocompraLogic.getEstadoPedidoCompras().toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadopedidocompra =(EstadoPedidoCompra) this.estadopedidocompras.toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoPedidoCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoPedidoCompra(this.estadopedidocompra,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedidoCompra(this.estadopedidocompra);
				
			}
			
			if(this.permiteMantenimiento(this.estadopedidocompra)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoPedidoCompra=true;
					this.inicializarActualizarBindingTablaEstadoPedidoCompra(false);
					this.isEsNuevoEstadoPedidoCompra=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoPedidoCompra=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoPedidoCompra=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoPedidoCompra(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoPedidoCompra(false);
				
				this.habilitarDeshabilitarControlesEstadoPedidoCompra(false);
			
												
				
				if(EstadoPedidoCompraJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoPedidoCompra();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoPedidoCompraActionPerformed(evt,estadopedidocompraSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoPedidoCompra(this.estadopedidocompra,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoPedidoCompra.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadopedidocompraSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadopedidocompra.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoPedidoCompra.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPedidoCompra.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoPedidoCompraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoPedidoCompra.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompra =(EstadoPedidoCompra) this.estadopedidocompraLogic.getEstadoPedidoCompras().toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
				this.estadopedidocompra.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadopedidocompra =(EstadoPedidoCompra) this.estadopedidocompras.toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
				this.estadopedidocompra.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadopedidocompra)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoPedidoCompraModel) this.jTableDatosEstadoPedidoCompra.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoPedidoCompra=true;
				this.inicializarActualizarBindingTablaEstadoPedidoCompra(false);
				this.isEsNuevoEstadoPedidoCompra=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoPedidoCompra(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoPedidoCompra(false);
				
				this.habilitarDeshabilitarControlesEstadoPedidoCompra(false);
				
				
				
				if(EstadoPedidoCompraJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoPedidoCompra();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoPedidoCompraActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoPedidoCompra.getRowCount()>=1) {
				jTableDatosEstadoPedidoCompra.removeRowSelectionInterval(0, jTableDatosEstadoPedidoCompra.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoPedidoCompra(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoPedidoCompra(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoPedidoCompra(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoPedidoCompra(false) ;
			
			this.isEsNuevoEstadoPedidoCompra=false;
			
			if(EstadoPedidoCompraJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoPedidoCompra();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoPedidoCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoPedidoCompra(false);
				
				//SI ES MANUAL
				if(EstadoPedidoCompraJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoPedidoCompra();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoPedidoCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoPedidoCompra--;			
			//EstadoPedidoCompra estadopedidocompraAux= new EstadoPedidoCompra();			
			//estadopedidocompraAux.setId(this.iIdNuevoEstadoPedidoCompra);
			
			if(this.jInternalFrameDetalleFormEstadoPedidoCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoPedidoCompra();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedidoCompra(this.estadopedidocompra);
			
			this.estadopedidocompra.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadopedidocompraLogic.getEstadoPedidoCompras().add(this.estadopedidocompraAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadopedidocompras.add(this.estadopedidocompraAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoPedidoCompra(false);
			
			this.jTableDatosEstadoPedidoCompra.setRowSelectionInterval(this.getIndiceNuevoEstadoPedidoCompra(), this.getIndiceNuevoEstadoPedidoCompra());
			
			int iLastRow =  this.jTableDatosEstadoPedidoCompra.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoPedidoCompra.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoPedidoCompra.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoPedidoCompra(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoPedidoCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoPedidoCompra(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoPedidoCompra(false);
			
			//SI ES MANUAL
			if(EstadoPedidoCompraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoPedidoCompra();
			}
			
			//this.abrirFrameTreeEstadoPedidoCompra();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoPedidoCompraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Pedido CompraS ?", "MANTENIMIENTO DE Estado Pedido Compra", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoPedidoCompra.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoPedidoCompra();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadopedidocompraReturnGeneral=estadopedidocompraLogic.procesarImportacionEstadoPedidoComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadopedidocompraParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoPedidoCompraReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoPedidoCompraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoPedidoCompra.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoPedidoCompra.setFileImportacion(this.jInternalFrameImportacionEstadoPedidoCompra.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoPedidoCompra.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoPedidoCompra.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoPedidoCompra.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoPedidoCompra.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoPedidoCompraActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoPedidoCompra> estadopedidocomprasSeleccionados=new ArrayList<EstadoPedidoCompra>();		

		estadopedidocomprasSeleccionados=this.getEstadoPedidoComprasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoPedidoCompraBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoPedidoCompraBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoPedidoCompras("Todos",estadopedidocomprasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Pedido Compra",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoPedidoCompraConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoPedidoCompraConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoPedidoCompraConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoPedidoCompraConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoPedidoCompraConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoPedidoCompraConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoPedidoCompraConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoPedidoCompraConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoPedidoCompraActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoPedidoCompra> estadopedidocomprasSeleccionados=new ArrayList<EstadoPedidoCompra>();		
		
		estadopedidocomprasSeleccionados=this.getEstadoPedidoComprasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopedidocompra";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoPedidoCompras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoPedidoCompraConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoPedidoCompraConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoPedidoCompra estadopedidocompra:estadopedidocomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadopedidocompra.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoPedidoCompraConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoPedidoCompraConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoPedidoCompra estadopedidocompra:estadopedidocomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadopedidocompra.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoPedidoCompra(row);				
			//	iRow++;
			//}				
			
			//for(EstadoPedidoCompra estadopedidocompraAux:estadopedidocomprasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoPedidoCompra(estadopedidocompraAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Pedido Compra",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadopedidocompraLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoPedidoCompra(false);
			
			//SI ES MANUAL
			if(EstadoPedidoCompraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoPedidoCompra();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoPedidoCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoPedidoCompra(false);
			
			//SI ES MANUAL
			if(EstadoPedidoCompraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoPedidoCompra();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoPedidoCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoPedidoCompra(false);
			
			//SI ES MANUAL
			if(EstadoPedidoCompraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoPedidoCompra();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopedidocompraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoPedidoCompra() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoPedidoCompra.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoPedidoCompra.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoPedidoCompra.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoPedidoCompra.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoPedidoCompra.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoPedidoCompra.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoPedidoCompra.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoPedidoCompra(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoPedidoCompra(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoPedidoCompra(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoPedidoCompra(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoPedidoCompra(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoPedidoCompra(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoPedidoCompra(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoPedidoCompra(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoPedidoCompraJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoPedidoCompraJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoPedidoCompra() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoPedidoCompra();
		
		this.inicializarActualizarBindingBotonesManualEstadoPedidoCompra(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoPedidoCompra();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoPedidoCompra() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoPedidoCompra(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoPedidoCompra(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoPedidoCompra.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoPedidoCompra.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoPedidoCompra.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoPedidoCompra.jCheckBoxPostAccionNuevoEstadoPedidoCompra.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoPedidoCompra.jCheckBoxPostAccionSinCerrarEstadoPedidoCompra.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoPedidoCompra.jCheckBoxPostAccionSinMensajeEstadoPedidoCompra.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoPedidoCompra.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoPedidoCompra.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoPedidoCompra.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) {
				this.jInternalFrameDetalleFormEstadoPedidoCompra.jCheckBoxPostAccionNuevoEstadoPedidoCompra.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoPedidoCompra.jCheckBoxPostAccionSinCerrarEstadoPedidoCompra.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoPedidoCompra.jCheckBoxPostAccionSinMensajeEstadoPedidoCompra.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoPedidoCompra.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoPedidoCompra.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoPedidoCompra.jComboBoxTiposAccionesFormularioEstadoPedidoCompra.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoPedidoCompra.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoPedidoCompra!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoPedidoCompra.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoPedidoCompra.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoPedidoCompra.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoPedidoCompra.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoPedidoCompra!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoPedidoCompra.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoPedidoCompra.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoPedidoCompra(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoPedidoCompraJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoPedidoCompra(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoPedidoCompra() throws Exception {
		try	{
			if(EstadoPedidoCompraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoPedidoCompra();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoPedidoCompra() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jComboBoxTiposAccionesFormularioEstadoPedidoCompra.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jComboBoxTiposAccionesFormularioEstadoPedidoCompra.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoPedidoCompra() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoPedidoCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoPedidoCompra.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoPedidoCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoPedidoCompra.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoPedidoCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoPedidoCompra.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoPedidoCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoPedidoCompra.addItem(reporte);
			}
			
			
			if(!this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoPedidoCompra.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoPedidoCompra.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoPedidoCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoPedidoCompra.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoPedidoCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoPedidoCompra.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoPedidoCompra.jComboBoxTiposAccionesFormularioEstadoPedidoCompra.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoPedidoCompra.jComboBoxTiposAccionesFormularioEstadoPedidoCompra.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoPedidoCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoPedidoCompra.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoPedidoCompra.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoPedidoCompra();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoPedidoCompra() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoPedidoCompra!=null) {
				this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoPedidoCompra!=null) {
				this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoPedidoCompra!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoPedidoCompra()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoPedidoCompra(Boolean esInicializar) throws Exception {				
		if(EstadoPedidoCompraJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoPedidoCompra();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoPedidoCompra() throws Exception {
		this.inicializarActualizarBindingTablaEstadoPedidoCompra(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoPedidoCompra() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoPedidoCompra.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoPedidoCompra.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoPedidoCompra.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoPedidoCompraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoPedidoCompra.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoPedidoCompra.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoPedidoCompraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoPedidoCompraOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPedidoCompraOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoPedidoCompraPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoPedidoCompra.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoPedidoCompra.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoPedidoCompraPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoPedidoCompra.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoPedidoCompra(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadopedidocompraLogic.getEstadoPedidoCompras().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadopedidocompras.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoPedidoCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoPedidoCompra.setModel(new EstadoPedidoCompraModel(this.estadopedidocompraLogic.getEstadoPedidoCompras(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoPedidoCompra.setModel(new EstadoPedidoCompraModel(this.estadopedidocompras,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoPedidoCompra!=null && this.jInternalFrameOrderByEstadoPedidoCompra.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoPedidoCompra();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoPedidoCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPedidoCompra,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoPedidoCompraPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO,estadopedidocompraConstantesFunciones.resaltarSeleccionarEstadoPedidoCompra,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoPedidoCompraConstantesFunciones.SCLASSWEBTITULO,estadopedidocompraConstantesFunciones.resaltarSeleccionarEstadoPedidoCompra,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoPedidoCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPedidoCompra,EstadoPedidoCompraConstantesFunciones.LABEL_ID));

		if(this.estadopedidocompraConstantesFunciones.mostraridEstadoPedidoCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoPedidoCompraConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadopedidocompraConstantesFunciones.resaltaridEstadoPedidoCompra,this.estadopedidocompraConstantesFunciones.activaridEstadoPedidoCompra,this,true,"idEstadoPedidoCompra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadopedidocompraConstantesFunciones.resaltaridEstadoPedidoCompra,this.estadopedidocompraConstantesFunciones.activaridEstadoPedidoCompra,this,true,"idEstadoPedidoCompra","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoPedidoCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPedidoCompra,EstadoPedidoCompraConstantesFunciones.LABEL_CODIGO));

		if(this.estadopedidocompraConstantesFunciones.mostrarcodigoEstadoPedidoCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoPedidoCompraConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadopedidocompraConstantesFunciones.resaltarcodigoEstadoPedidoCompra,this.estadopedidocompraConstantesFunciones.activarcodigoEstadoPedidoCompra,this,true,"codigoEstadoPedidoCompra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadopedidocompraConstantesFunciones.resaltarcodigoEstadoPedidoCompra,this.estadopedidocompraConstantesFunciones.activarcodigoEstadoPedidoCompra,this,true,"codigoEstadoPedidoCompra","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoPedidoCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoPedidoCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPedidoCompra,EstadoPedidoCompraConstantesFunciones.LABEL_NOMBRE));

		if(this.estadopedidocompraConstantesFunciones.mostrarnombreEstadoPedidoCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoPedidoCompraConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadopedidocompraConstantesFunciones.resaltarnombreEstadoPedidoCompra,this.estadopedidocompraConstantesFunciones.activarnombreEstadoPedidoCompra,this,true,"nombreEstadoPedidoCompra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadopedidocompraConstantesFunciones.resaltarnombreEstadoPedidoCompra,this.estadopedidocompraConstantesFunciones.activarnombreEstadoPedidoCompra,this,true,"nombreEstadoPedidoCompra","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoPedidoCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadopedidocompraSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadopedidocompraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadopedidocompraSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoPedidoCompra.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadopedidocompraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadopedidocompraSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoPedidoCompra.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoPedidoCompra && this.isPermisoGuardarCambiosEstadoPedidoCompra) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadopedidocompraSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadopedidocompraSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoPedidoCompra.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoPedidoCompra.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoPedidoCompra && this.isPermisoGuardarCambiosEstadoPedidoCompra) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoPedidoCompra && this.isPermisoGuardarCambiosEstadoPedidoCompra) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoPedidoCompra.moveColumn(this.jTableDatosEstadoPedidoCompra.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoPedidoCompra.moveColumn(this.jTableDatosEstadoPedidoCompra.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoPedidoCompra.moveColumn(this.jTableDatosEstadoPedidoCompra.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoPedidoCompra.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoPedidoCompra.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoPedidoCompra,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoPedidoCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoPedidoCompra.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoPedidoCompra.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoPedidoCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoPedidoCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoPedidoCompra.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoPedidoCompra.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoPedidoCompra.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadopedidocompraLogic.getEstadoPedidoCompras().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadopedidocompras.size()-1;
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
		//this.jTableDatosEstadoPedidoCompra.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoPedidoCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoPedidoCompra();
			
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
				
				//this.isEsNuevoEstadoPedidoCompra=false;
					
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
			
				if(this.estadopedidocompraSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoPedidoCompra==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoPedidoCompra.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoPedidoCompra.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidocompra =(EstadoPedidoCompra) this.estadopedidocompraLogic.getEstadoPedidoCompras().toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopedidocompra =(EstadoPedidoCompra) this.estadopedidocompras.toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadopedidocompra.getsType().equals("DUPLICADO")
				   || this.estadopedidocompra.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoPedidoCompra=true;
				
				} else {
					this.isEsNuevoEstadoPedidoCompra=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {
					if(this.estadopedidocompra.getId()>=0 && !this.estadopedidocompra.getIsNew()) {						
						this.isEsNuevoEstadoPedidoCompra=false;
						
					} else {
						this.isEsNuevoEstadoPedidoCompra=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoPedidoCompra(esRelaciones);						
				
				this.seleccionarEstadoPedidoCompra(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadopedidocompra.getId()<0) {
					this.isEsNuevoEstadoPedidoCompra=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoPedidoCompra(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoPedidoCompra(evt,rowIndex);
				}	
				
				if(this.estadopedidocompraSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoPedidoCompra: " + this.dDif); 
					}
				}								
				
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoPedidoCompra(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadopedidocompra)) {
					if(this.estadopedidocompra.getId()>0) {
						this.estadopedidocompra.setIsDeleted(true);
						
						this.estadopedidocomprasEliminados.add(this.estadopedidocompra);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadopedidocompraLogic.getEstadoPedidoCompras().remove(this.estadopedidocompra);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadopedidocompras.remove(this.estadopedidocompra);				
					}
					
					
					((EstadoPedidoCompraModel) this.jTableDatosEstadoPedidoCompra.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoPedidoCompra(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoPedidoCompra(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoPedidoCompra) {
			
			if(this.jInternalFrameDetalleFormEstadoPedidoCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoPedidoCompra.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoPedidoCompra.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidocompra =(EstadoPedidoCompra) this.estadopedidocompraLogic.getEstadoPedidoCompras().toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopedidocompra =(EstadoPedidoCompra) this.estadopedidocompras.toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoPedidoCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoPedidoCompra(this.estadopedidocompra);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoPedidoCompra("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoPedidoCompra(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoPedidoCompra() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoPedidoCompra(EstadoPedidoCompra estadopedidocompra) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoPedidoCompra(estadopedidocompra,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoPedidoCompra(EstadoPedidoCompra estadopedidocompra,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoPedidoCompra(estadopedidocompra);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoPedidoCompra(estadopedidocompra,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoPedidoCompra(estadopedidocompra);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoPedidoCompra(EstadoPedidoCompra estadopedidocompra) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoPedidoCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jTextFieldidEstadoPedidoCompra.setText(estadopedidocompra.getId().toString());
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jTextFieldcodigoEstadoPedidoCompra.setText(estadopedidocompra.getcodigo());
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jTextAreanombreEstadoPedidoCompra.setText(estadopedidocompra.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoPedidoCompra estadopedidocompraLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadopedidocompraLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoPedidoCompra estadopedidocompraLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadopedidocompraLocal=this.estadopedidocompra;
			} else {
				estadopedidocompraLocal=this.estadopedidocompraAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadopedidocompraLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoPedidoCompra(estadopedidocompraLocal,true);
					
					if(estadopedidocompraSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadopedidocompraLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadopedidocompraLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoPedidoCompra(EstadoPedidoCompra estadopedidocompra,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoPedidoCompra(estadopedidocompra,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedidoCompra(estadopedidocompra);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoPedidoCompra(EstadoPedidoCompra estadopedidocompra,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoPedidoCompra(estadopedidocompra,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoPedidoCompra(EstadoPedidoCompra estadopedidocompra,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoPedidoCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoPedidoCompra.jTextFieldidEstadoPedidoCompra.getText()==null || this.jInternalFrameDetalleFormEstadoPedidoCompra.jTextFieldidEstadoPedidoCompra.getText()=="" || this.jInternalFrameDetalleFormEstadoPedidoCompra.jTextFieldidEstadoPedidoCompra.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoPedidoCompra.jTextFieldidEstadoPedidoCompra.setText("0");
			}

			if(conColumnasBase) {estadopedidocompra.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoPedidoCompra.jTextFieldidEstadoPedidoCompra.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoPedidoCompraConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPedidoCompra.jLabelIdEstadoPedidoCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadopedidocompra.setcodigo(this.jInternalFrameDetalleFormEstadoPedidoCompra.jTextFieldcodigoEstadoPedidoCompra.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoPedidoCompraConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPedidoCompra.jLabelcodigoEstadoPedidoCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadopedidocompra.setnombre(this.jInternalFrameDetalleFormEstadoPedidoCompra.jTextAreanombreEstadoPedidoCompra.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoPedidoCompraConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPedidoCompra.jLabelnombreEstadoPedidoCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoPedidoCompra(EstadoPedidoCompra estadopedidocompraBean,EstadoPedidoCompra estadopedidocompra,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoPedidoCompra(EstadoPedidoCompra estadopedidocompraOrigen,EstadoPedidoCompra estadopedidocompra,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadopedidocompraOrigen.getId()!=null && !estadopedidocompraOrigen.getId().equals(0L))) {estadopedidocompra.setId(estadopedidocompraOrigen.getId());}}
			if(conDefault || (!conDefault && estadopedidocompraOrigen.getcodigo()!=null && !estadopedidocompraOrigen.getcodigo().equals(""))) {estadopedidocompra.setcodigo(estadopedidocompraOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadopedidocompraOrigen.getnombre()!=null && !estadopedidocompraOrigen.getnombre().equals(""))) {estadopedidocompra.setnombre(estadopedidocompraOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoPedidoCompra(EstadoPedidoCompra estadopedidocompra) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jTextFieldidEstadoPedidoCompra.setText(estadopedidocompra.getId().toString());
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jTextFieldcodigoEstadoPedidoCompra.setText(estadopedidocompra.getcodigo());
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jTextAreanombreEstadoPedidoCompra.setText(estadopedidocompra.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoPedidoCompra(EstadoPedidoCompraBean estadopedidocompraBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jTextFieldidEstadoPedidoCompra.setText(estadopedidocompraBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jTextFieldcodigoEstadoPedidoCompra.setText(estadopedidocompraBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jTextAreanombreEstadoPedidoCompra.setText(estadopedidocompraBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoPedidoCompra(EstadoPedidoCompraParameterReturnGeneral estadopedidocompraReturnGeneral,EstadoPedidoCompraBean estadopedidocompraBean,Boolean conDefault) throws Exception { 
		try {
			EstadoPedidoCompra estadopedidocompraLocal=new EstadoPedidoCompra();
			
			estadopedidocompraLocal=estadopedidocompraReturnGeneral.getEstadoPedidoCompra();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadopedidocompraLocal.getId()!=null && !estadopedidocompraLocal.getId().equals(0L))) {estadopedidocompraBean.setId(estadopedidocompraLocal.getId());}}
			if(conDefault || (!conDefault && estadopedidocompraLocal.getcodigo()!=null && !estadopedidocompraLocal.getcodigo().equals(""))) {estadopedidocompraBean.setcodigo(estadopedidocompraLocal.getcodigo());}
			if(conDefault || (!conDefault && estadopedidocompraLocal.getnombre()!=null && !estadopedidocompraLocal.getnombre().equals(""))) {estadopedidocompraBean.setnombre(estadopedidocompraLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoPedidoCompraGenerico(Long idEstadoPedidoCompraSeleccionado,JComboBox jComboBoxEstadoPedidoCompra,List<EstadoPedidoCompra> estadopedidocomprasLocal)throws Exception {
		try {
			EstadoPedidoCompra  estadopedidocompraTemp=null;

			for(EstadoPedidoCompra estadopedidocompraAux:estadopedidocomprasLocal) {
				if(estadopedidocompraAux.getId()!=null && estadopedidocompraAux.getId().equals(idEstadoPedidoCompraSeleccionado)) {
					estadopedidocompraTemp=estadopedidocompraAux;
					break;
				}
			}

			jComboBoxEstadoPedidoCompra.setSelectedItem(estadopedidocompraTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoPedidoCompraGenerico(JComboBox jComboBoxEstadoPedidoCompra,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoPedidoCompra.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoPedidoCompra.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoPedidoCompra.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoPedidoCompra.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadopedidocompra=(EstadoPedidoCompra) estadopedidocompraLogic.getEstadoPedidoCompras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadopedidocompra =(EstadoPedidoCompra) estadopedidocompras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoPedidoCompra estadopedidocompraRow=new EstadoPedidoCompra();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadopedidocompraRow=(EstadoPedidoCompra) estadopedidocompraLogic.getEstadoPedidoCompras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadopedidocompraRow=(EstadoPedidoCompra) estadopedidocompras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoPedidoCompra(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaNuevoEstadoPedidoCompra && this.isPermisoNuevoEstadoPedidoCompra));			
			this.jButtonDuplicarEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaDuplicarEstadoPedidoCompra && this.isPermisoDuplicarEstadoPedidoCompra));			
			this.jButtonCopiarEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaCopiarEstadoPedidoCompra && this.isPermisoCopiarEstadoPedidoCompra));
			this.jButtonVerFormEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaVerFormEstadoPedidoCompra && this.isPermisoVerFormEstadoPedidoCompra));
			
			this.jButtonAbrirOrderByEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaOrdenEstadoPedidoCompra && this.isPermisoOrdenEstadoPedidoCompra));			
			
			this.jButtonNuevoRelacionesEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoPedidoCompra && this.isPermisoNuevoEstadoPedidoCompra));			
			this.jButtonNuevoGuardarCambiosEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaNuevoEstadoPedidoCompra && this.isPermisoNuevoEstadoPedidoCompra && this.isPermisoGuardarCambiosEstadoPedidoCompra));
			
			if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) {
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonModificarEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaModificarEstadoPedidoCompra && this.isPermisoActualizarEstadoPedidoCompra));	
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonActualizarEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaActualizarEstadoPedidoCompra && this.isPermisoActualizarEstadoPedidoCompra));	
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonEliminarEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaEliminarEstadoPedidoCompra && this.isPermisoEliminarEstadoPedidoCompra));
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonCancelarEstadoPedidoCompra.setVisible(this.isVisibilidadCeldaCancelarEstadoPedidoCompra);							
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonGuardarCambiosEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaGuardarEstadoPedidoCompra && this.isPermisoGuardarCambiosEstadoPedidoCompra));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoPedidoCompra && this.isPermisoGuardarCambiosEstadoPedidoCompra));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaNuevoEstadoPedidoCompra && this.isPermisoNuevoEstadoPedidoCompra));						
			this.jButtonDuplicarToolBarEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaDuplicarEstadoPedidoCompra && this.isPermisoDuplicarEstadoPedidoCompra));						
			this.jButtonCopiarToolBarEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaCopiarEstadoPedidoCompra && this.isPermisoCopiarEstadoPedidoCompra));			
			this.jButtonVerFormToolBarEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaVerFormEstadoPedidoCompra && this.isPermisoVerFormEstadoPedidoCompra));			
			this.jButtonAbrirOrderByToolBarEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaOrdenEstadoPedidoCompra && this.isPermisoOrdenEstadoPedidoCompra));
			this.jButtonNuevoRelacionesToolBarEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoPedidoCompra && this.isPermisoNuevoEstadoPedidoCompra));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaNuevoEstadoPedidoCompra && this.isPermisoNuevoEstadoPedidoCompra && this.isPermisoGuardarCambiosEstadoPedidoCompra));			
			
			if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) {
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonModificarToolBarEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaModificarEstadoPedidoCompra && this.isPermisoActualizarEstadoPedidoCompra));	
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonActualizarToolBarEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaActualizarEstadoPedidoCompra  && this.isPermisoActualizarEstadoPedidoCompra));	
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonEliminarToolBarEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaEliminarEstadoPedidoCompra && this.isPermisoEliminarEstadoPedidoCompra));
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonCancelarToolBarEstadoPedidoCompra.setVisible(this.isVisibilidadCeldaCancelarEstadoPedidoCompra);				
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonGuardarCambiosToolBarEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaGuardarEstadoPedidoCompra && this.isPermisoGuardarCambiosEstadoPedidoCompra));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoPedidoCompra && this.isPermisoGuardarCambiosEstadoPedidoCompra));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaNuevoEstadoPedidoCompra && this.isPermisoNuevoEstadoPedidoCompra));			
			this.jMenuItemDuplicarEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaDuplicarEstadoPedidoCompra && this.isPermisoDuplicarEstadoPedidoCompra));			
			this.jMenuItemCopiarEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaCopiarEstadoPedidoCompra && this.isPermisoCopiarEstadoPedidoCompra));			
			this.jMenuItemVerFormEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaVerFormEstadoPedidoCompra && this.isPermisoVerFormEstadoPedidoCompra));			
			this.jMenuItemAbrirOrderByEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaOrdenEstadoPedidoCompra && this.isPermisoOrdenEstadoPedidoCompra));			
			//this.jMenuItemMostrarOcultarEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaOrdenEstadoPedidoCompra && this.isPermisoOrdenEstadoPedidoCompra));
			this.jMenuItemDetalleAbrirOrderByEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaOrdenEstadoPedidoCompra && this.isPermisoOrdenEstadoPedidoCompra));			
			//this.jMenuItemDetalleMostrarOcultarEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaOrdenEstadoPedidoCompra && this.isPermisoOrdenEstadoPedidoCompra));			
			this.jMenuItemNuevoRelacionesEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoPedidoCompra && this.isPermisoNuevoEstadoPedidoCompra));			
			this.jMenuItemNuevoGuardarCambiosEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaNuevoEstadoPedidoCompra && this.isPermisoNuevoEstadoPedidoCompra && this.isPermisoGuardarCambiosEstadoPedidoCompra));									
			
			if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) {
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jMenuItemModificarEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaModificarEstadoPedidoCompra && this.isPermisoActualizarEstadoPedidoCompra));	
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jMenuItemActualizarEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaActualizarEstadoPedidoCompra && this.isPermisoActualizarEstadoPedidoCompra));	
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jMenuItemEliminarEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaEliminarEstadoPedidoCompra && this.isPermisoEliminarEstadoPedidoCompra));
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jMenuItemCancelarEstadoPedidoCompra.setVisible(this.isVisibilidadCeldaCancelarEstadoPedidoCompra);				
			}
			
			this.jMenuItemGuardarCambiosEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaGuardarEstadoPedidoCompra && this.isPermisoGuardarCambiosEstadoPedidoCompra));						
			this.jMenuItemGuardarCambiosTablaEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoPedidoCompra && this.isPermisoGuardarCambiosEstadoPedidoCompra));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoPedidoCompra=this.jButtonNuevoEstadoPedidoCompra.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoPedidoCompra=this.jButtonDuplicarEstadoPedidoCompra.isVisible();
			this.isVisibilidadCeldaCopiarEstadoPedidoCompra=this.jButtonCopiarEstadoPedidoCompra.isVisible();
			this.isVisibilidadCeldaVerFormEstadoPedidoCompra=this.jButtonVerFormEstadoPedidoCompra.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoPedidoCompra=this.jButtonAbrirOrderByEstadoPedidoCompra.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoPedidoCompra=this.jButtonNuevoRelacionesEstadoPedidoCompra.isVisible();
			this.isVisibilidadCeldaModificarEstadoPedidoCompra=this.jButtonModificarEstadoPedidoCompra.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) {
			this.isVisibilidadCeldaActualizarEstadoPedidoCompra=this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonActualizarEstadoPedidoCompra.isVisible();
			this.isVisibilidadCeldaEliminarEstadoPedidoCompra=this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonEliminarEstadoPedidoCompra.isVisible();
			this.isVisibilidadCeldaCancelarEstadoPedidoCompra=this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonCancelarEstadoPedidoCompra.isVisible();
			this.isVisibilidadCeldaGuardarEstadoPedidoCompra=this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonGuardarCambiosEstadoPedidoCompra.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoPedidoCompra=this.jButtonGuardarCambiosTablaEstadoPedidoCompra.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoPedidoCompra=this.jButtonNuevoToolBarEstadoPedidoCompra.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoPedidoCompra=this.jButtonNuevoRelacionesToolBarEstadoPedidoCompra.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) {
			this.isVisibilidadCeldaModificarEstadoPedidoCompra=this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonModificarToolBarEstadoPedidoCompra.isVisible();
			this.isVisibilidadCeldaActualizarEstadoPedidoCompra=this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonActualizarToolBarEstadoPedidoCompra.isVisible();
			this.isVisibilidadCeldaEliminarEstadoPedidoCompra=this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonEliminarToolBarEstadoPedidoCompra.isVisible();
			this.isVisibilidadCeldaCancelarEstadoPedidoCompra=this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonCancelarToolBarEstadoPedidoCompra.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoPedidoCompra=this.jButtonGuardarCambiosToolBarEstadoPedidoCompra.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoPedidoCompra=this.jButtonGuardarCambiosTablaToolBarEstadoPedidoCompra.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoPedidoCompra=this.jMenuItemNuevoEstadoPedidoCompra.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoPedidoCompra=this.jMenuItemNuevoRelacionesEstadoPedidoCompra.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) {
			this.isVisibilidadCeldaModificarEstadoPedidoCompra=this.jInternalFrameDetalleFormEstadoPedidoCompra.jMenuItemModificarEstadoPedidoCompra.isVisible();
			this.isVisibilidadCeldaActualizarEstadoPedidoCompra=this.jInternalFrameDetalleFormEstadoPedidoCompra.jMenuItemActualizarEstadoPedidoCompra.isVisible();
			this.isVisibilidadCeldaEliminarEstadoPedidoCompra=this.jInternalFrameDetalleFormEstadoPedidoCompra.jMenuItemEliminarEstadoPedidoCompra.isVisible();
			this.isVisibilidadCeldaCancelarEstadoPedidoCompra=this.jInternalFrameDetalleFormEstadoPedidoCompra.jMenuItemCancelarEstadoPedidoCompra.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoPedidoCompra=this.jMenuItemGuardarCambiosEstadoPedidoCompra.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoPedidoCompra=this.jMenuItemGuardarCambiosTablaEstadoPedidoCompra.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoPedidoCompra(Boolean esInicializar) {
		if(EstadoPedidoCompraJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadopedidocompraSessionBean.getConGuardarRelaciones()) {
				//if(this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoPedidoCompra();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoPedidoCompra(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoPedidoCompra() {
		this.jButtonNuevoEstadoPedidoCompra.setVisible(this.isPermisoNuevoEstadoPedidoCompra);			
		this.jButtonDuplicarEstadoPedidoCompra.setVisible(this.isPermisoDuplicarEstadoPedidoCompra);			
		this.jButtonCopiarEstadoPedidoCompra.setVisible(this.isPermisoCopiarEstadoPedidoCompra);			
		this.jButtonVerFormEstadoPedidoCompra.setVisible(this.isPermisoVerFormEstadoPedidoCompra);			
		
		this.jButtonAbrirOrderByEstadoPedidoCompra.setVisible(this.isPermisoOrdenEstadoPedidoCompra);					
		
		this.jButtonNuevoRelacionesEstadoPedidoCompra.setVisible(this.isPermisoNuevoEstadoPedidoCompra);			
		
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonModificarEstadoPedidoCompra.setVisible(this.isPermisoActualizarEstadoPedidoCompra);	
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonActualizarEstadoPedidoCompra.setVisible(this.isPermisoActualizarEstadoPedidoCompra);	
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonEliminarEstadoPedidoCompra.setVisible(this.isPermisoEliminarEstadoPedidoCompra);
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonCancelarEstadoPedidoCompra.setVisible(this.isVisibilidadCeldaCancelarEstadoPedidoCompra);						
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonGuardarCambiosEstadoPedidoCompra.setVisible(this.isPermisoGuardarCambiosEstadoPedidoCompra);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoPedidoCompra.setVisible(this.isPermisoActualizarEstadoPedidoCompra);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoPedidoCompra() {
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonModificarEstadoPedidoCompra.setVisible(this.isPermisoActualizarEstadoPedidoCompra);	
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonActualizarEstadoPedidoCompra.setVisible(this.isPermisoActualizarEstadoPedidoCompra);	
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonEliminarEstadoPedidoCompra.setVisible(this.isPermisoEliminarEstadoPedidoCompra);
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonCancelarEstadoPedidoCompra.setVisible(this.isVisibilidadCeldaCancelarEstadoPedidoCompra);							
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonGuardarCambiosEstadoPedidoCompra.setVisible((this.isVisibilidadCeldaGuardarEstadoPedidoCompra && this.isPermisoGuardarCambiosEstadoPedidoCompra));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoPedidoCompra() {
		if(EstadoPedidoCompraJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoPedidoCompra();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoPedidoCompra() {
	}
	
	public void jTableDatosEstadoPedidoCompraListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoPedidoCompra(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoPedidoCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidocompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoPedidoCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoPedidoCompra(this.getestadopedidocompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedidoCompra(this.estadopedidocompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadopedidocompra =(EstadoPedidoCompra) this.estadopedidocompraLogic.getEstadoPedidoCompras().toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadopedidocompra =(EstadoPedidoCompra) this.estadopedidocompras.toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadopedidocompra==null) {
						this.estadopedidocompra = new EstadoPedidoCompra();
					}

					this.setVariablesFormularioToObjetoActualEstadoPedidoCompra(this.estadopedidocompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedidoCompra(this.estadopedidocompra);
				}

				if(this.estadopedidocompra.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadopedidocompra.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoPedidoCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidocompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidocompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidocompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoPedidoCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidocompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoPedidoCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoPedidoCompra(this.getestadopedidocompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedidoCompra(this.estadopedidocompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadopedidocompra =(EstadoPedidoCompra) this.estadopedidocompraLogic.getEstadoPedidoCompras().toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadopedidocompra =(EstadoPedidoCompra) this.estadopedidocompras.toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadopedidocompra==null) {
						this.estadopedidocompra = new EstadoPedidoCompra();
					}

					this.setVariablesFormularioToObjetoActualEstadoPedidoCompra(this.estadopedidocompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedidoCompra(this.estadopedidocompra);
				}

				if(this.estadopedidocompra.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadopedidocompra.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoPedidoCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidocompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidocompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidocompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoPedidoCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidocompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoPedidoCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoPedidoCompra(this.getestadopedidocompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedidoCompra(this.estadopedidocompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadopedidocompra =(EstadoPedidoCompra) this.estadopedidocompraLogic.getEstadoPedidoCompras().toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadopedidocompra =(EstadoPedidoCompra) this.estadopedidocompras.toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadopedidocompra==null) {
						this.estadopedidocompra = new EstadoPedidoCompra();
					}

					this.setVariablesFormularioToObjetoActualEstadoPedidoCompra(this.estadopedidocompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedidoCompra(this.estadopedidocompra);
				}

				if(this.estadopedidocompra.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadopedidocompra.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoPedidoCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidocompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidocompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidocompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoPedidoCompra() {
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) {
			this.jInternalFrameDetalleFormEstadoPedidoCompra.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoPedidoCompra.dispose();
			this.jInternalFrameDetalleFormEstadoPedidoCompra=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoPedidoCompra!=null) {
			this.jInternalFrameReporteDinamicoEstadoPedidoCompra.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoPedidoCompra.dispose();
			this.jInternalFrameReporteDinamicoEstadoPedidoCompra=null;
		}
		
		if(this.jInternalFrameImportacionEstadoPedidoCompra!=null) {
			this.jInternalFrameImportacionEstadoPedidoCompra.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoPedidoCompra.dispose();
			this.jInternalFrameImportacionEstadoPedidoCompra=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoPedidoCompra();
			
			EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoPedidoCompra")) {
				jButtonNuevoEstadoPedidoCompraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoPedidoCompra")) {
				jButtonDuplicarEstadoPedidoCompraActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoPedidoCompra")) {
				jButtonCopiarEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoPedidoCompra")) {
				jButtonVerFormEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoPedidoCompra")) {
				jButtonNuevoEstadoPedidoCompraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoPedidoCompra")) {
				jButtonDuplicarEstadoPedidoCompraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoPedidoCompra")) {
				jButtonNuevoEstadoPedidoCompraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoPedidoCompra")) {
				jButtonDuplicarEstadoPedidoCompraActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoPedidoCompra")) {
				jButtonNuevoEstadoPedidoCompraActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoPedidoCompra")) {
				jButtonNuevoEstadoPedidoCompraActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoPedidoCompra")) {
				jButtonNuevoEstadoPedidoCompraActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoPedidoCompra")) {
				jButtonModificarEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoPedidoCompra")) {
				jButtonModificarEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoPedidoCompra")) {
				jButtonModificarEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoPedidoCompra")) {
				jButtonActualizarEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoPedidoCompra")) {
				jButtonActualizarEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoPedidoCompra")) {
				jButtonActualizarEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoPedidoCompra")) {
				jButtonEliminarEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoPedidoCompra")) {
				jButtonEliminarEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoPedidoCompra")) {
				jButtonEliminarEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoPedidoCompra")) {
				jButtonCancelarEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoPedidoCompra")) {
				jButtonCancelarEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoPedidoCompra")) {
				jButtonCancelarEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoPedidoCompra")) {
				jButtonCerrarEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoPedidoCompra")) {
				jButtonCerrarEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoPedidoCompra")) {
				jButtonCerrarEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoPedidoCompra")) {
				jButtonMostrarOcultarEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoPedidoCompra")) {
				jButtonCancelarEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoPedidoCompra")) {
				jButtonGuardarCambiosEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoPedidoCompra")) {
				jButtonGuardarCambiosEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoPedidoCompra")) {
				jButtonCopiarEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoPedidoCompra")) {
				jButtonVerFormEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoPedidoCompra")) {
				jButtonGuardarCambiosEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoPedidoCompra")) {
				jButtonCopiarEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoPedidoCompra")) {
				jButtonVerFormEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoPedidoCompra")) {
				jButtonGuardarCambiosEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoPedidoCompra")) {
				jButtonGuardarCambiosEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoPedidoCompra")) {
				jButtonGuardarCambiosEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoPedidoCompra")) {
				jButtonRecargarInformacionEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoPedidoCompra")) {
				jButtonRecargarInformacionEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoPedidoCompra")) {
				jButtonRecargarInformacionEstadoPedidoCompraActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoPedidoCompra")) {
				jButtonAnterioresEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoPedidoCompra")) {
				jButtonAnterioresEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoPedidoCompra")) {
				jButtonAnterioresEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoPedidoCompra")) {
				jButtonSiguientesEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoPedidoCompra")) {
				jButtonSiguientesEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoPedidoCompra")) {
				jButtonSiguientesEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoPedidoCompra") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoPedidoCompra")) {
				jButtonAbrirOrderByEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoPedidoCompra") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoPedidoCompra")) {
				jButtonMostrarOcultarEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoPedidoCompra")) {
				jButtonNuevoGuardarCambiosEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoPedidoCompra")) {
				jButtonNuevoGuardarCambiosEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoPedidoCompra")) {
				jButtonNuevoGuardarCambiosEstadoPedidoCompraActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoPedidoCompra")) {
				jButtonCerrarReporteDinamicoEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoPedidoCompra")) {
				jButtonGenerarReporteDinamicoEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoPedidoCompra")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoPedidoCompraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoPedidoCompra")) {
				jButtonCerrarImportacionEstadoPedidoCompraActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoPedidoCompra")) {
				
				jButtonGenerarImportacionEstadoPedidoCompraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoPedidoCompra")) {
				
				jButtonAbrirImportacionEstadoPedidoCompraActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoPedidoCompra")) {
				jComboBoxTiposAccionesEstadoPedidoCompraActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoPedidoCompra")) {
				jComboBoxTiposRelacionesEstadoPedidoCompraActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoPedidoCompra")) {
				jComboBoxTiposAccionesEstadoPedidoCompraActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoPedidoCompra")) {
				
				jComboBoxTiposSeleccionarEstadoPedidoCompraActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoPedidoCompra")) {
				jTextFieldValorCampoGeneralEstadoPedidoCompraActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoPedidoCompra")) {
				jButtonAbrirOrderByEstadoPedidoCompraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoPedidoCompra")) {
				jButtonAbrirOrderByEstadoPedidoCompraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoPedidoCompra")) {
				jButtonCerrarOrderByEstadoPedidoCompraActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoPedidoCompraBusqueda")) {
				this.jButtonidEstadoPedidoCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoPedidoCompraBusqueda")) {
				this.jButtoncodigoEstadoPedidoCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoPedidoCompraBusqueda")) {
				this.jButtonnombreEstadoPedidoCompraBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoPedidoCompra();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPedidoCompraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedidocompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopedidocompra);
				
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
				
				


				
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPedidoCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPedidoCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoPedidoCompra estadopedidocompraLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadopedidocompraLocal=this.estadopedidocompra;
			} else {
				estadopedidocompraLocal=this.estadopedidocompraAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedidocompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopedidocompra);
				
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
							
				
				


				
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPedidoCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPedidoCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPedidoCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPedidoCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidocompraAnterior =(EstadoPedidoCompra) this.estadopedidocompraLogic.getEstadoPedidoCompras().toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopedidocompraAnterior =(EstadoPedidoCompra) this.estadopedidocompras.toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
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
			
			EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
			
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
			
			


			
			EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPedidoCompraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedidocompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopedidocompra);
				
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
								
						
				


				
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPedidoCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPedidoCompra.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedidocompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopedidocompra);
				
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
								
				
				


				
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPedidoCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPedidoCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPedidoCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPedidoCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidocompraAnterior =(EstadoPedidoCompra) this.estadopedidocompraLogic.getEstadoPedidoCompras().toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopedidocompraAnterior =(EstadoPedidoCompra) this.estadopedidocompras.toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedidocompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopedidocompra);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPedidoCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPedidoCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidocompraAnterior =(EstadoPedidoCompra) this.estadopedidocompraLogic.getEstadoPedidoCompras().toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopedidocompraAnterior =(EstadoPedidoCompra) this.estadopedidocompras.toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPedidoCompraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedidocompra);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadopedidocompra);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedidocompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopedidocompra);
				
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
							
				
				


				
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPedidoCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPedidoCompra.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPedidoCompraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoPedidoCompra.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadopedidocompraAnterior =(EstadoPedidoCompra) this.estadopedidocompraLogic.getEstadoPedidoCompras().toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadopedidocompraAnterior =(EstadoPedidoCompra) this.estadopedidocompras.toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
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
			
			EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
			
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
			
			


			
			EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPedidoCompraActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedidocompra);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadopedidocompra);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedidocompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopedidocompra);
				
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
								
				
				


				
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPedidoCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPedidoCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPedidoCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPedidoCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidocompraAnterior =(EstadoPedidoCompra) this.estadopedidocompraLogic.getEstadoPedidoCompras().toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopedidocompraAnterior =(EstadoPedidoCompra) this.estadopedidocompras.toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPedidoCompraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedidocompra);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadopedidocompra);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPedidoCompraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedidocompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopedidocompra);
				
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoPedidoCompra")) {
					jCheckBoxSeleccionarTodosEstadoPedidoCompraItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoPedidoCompra")) {
					jCheckBoxSeleccionadosEstadoPedidoCompraItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoPedidoCompra")) {
					
				}
				
				


				
				
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPedidoCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPedidoCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedidocompra);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadopedidocompra);
				
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
												
				
				


				
				
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPedidoCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPedidoCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPedidoCompraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoPedidoCompra.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadopedidocompraAnterior =(EstadoPedidoCompra) this.estadopedidocompraLogic.getEstadoPedidoCompras().toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadopedidocompraAnterior =(EstadoPedidoCompra) this.estadopedidocompras.toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPedidoCompraActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedidocompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopedidocompra);
				
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
				
				
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
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
			
			EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
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
			
			


			
			EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPedidoCompraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedidocompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopedidocompra);
				
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPedidoCompra.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPedidoCompra.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopedidocompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopedidocompra);
				
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
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
				
				


				
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPedidoCompra.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPedidoCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPedidoCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPedidoCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopedidocompraAnterior =(EstadoPedidoCompra) this.estadopedidocompraLogic.getEstadoPedidoCompras().toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopedidocompraAnterior =(EstadoPedidoCompra) this.estadopedidocompras.toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoPedidoCompra")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoPedidoCompraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoPedidoCompra.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadopedidocompra =(EstadoPedidoCompra) this.estadopedidocompraLogic.getEstadoPedidoCompras().toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadopedidocompra =(EstadoPedidoCompra) this.estadopedidocompras.toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadopedidocompra);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoPedidoCompra")) {
				
				}
				
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoPedidoCompra")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoPedidoCompra.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoPedidoCompra")) {
			
			}
			
			EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoPedidoCompra();
			
			EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoPedidoCompra")) {
				jButtonNuevoEstadoPedidoCompraActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoPedidoCompra")) {
				jButtonDuplicarEstadoPedidoCompraActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoPedidoCompra")) {
				jButtonCopiarEstadoPedidoCompraActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoPedidoCompra")) {
				jButtonVerFormEstadoPedidoCompraActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoPedidoCompra")) {
				jButtonNuevoEstadoPedidoCompraActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoPedidoCompra")) {
				jButtonModificarEstadoPedidoCompraActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoPedidoCompra")) {
				jButtonActualizarEstadoPedidoCompraActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoPedidoCompra")) {
				jButtonEliminarEstadoPedidoCompraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoPedidoCompra")) {
				jButtonGuardarCambiosEstadoPedidoCompraActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoPedidoCompra")) {
				jButtonCancelarEstadoPedidoCompraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoPedidoCompra")) {
				jButtonCerrarEstadoPedidoCompraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoPedidoCompra")) {
				jButtonGuardarCambiosEstadoPedidoCompraActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoPedidoCompra")) {
				jButtonNuevoGuardarCambiosEstadoPedidoCompraActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoPedidoCompra")) {
				jButtonAbrirOrderByEstadoPedidoCompraActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoPedidoCompra")) {
				jButtonRecargarInformacionEstadoPedidoCompraActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoPedidoCompra")) {
				jButtonAnterioresEstadoPedidoCompraActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoPedidoCompra")) {
				jButtonSiguientesEstadoPedidoCompraActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoPedidoCompraBusqueda")) {
				this.jButtonidEstadoPedidoCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoPedidoCompraBusqueda")) {
				this.jButtoncodigoEstadoPedidoCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoPedidoCompraBusqueda")) {
				this.jButtonnombreEstadoPedidoCompraBusquedaActionPerformed(evt);
			}
			
			EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoPedidoCompra();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoPedidoCompra")) {
				closingInternalFrameEstadoPedidoCompra();
				
			} else if(sTipo.equals("jButtonCancelarEstadoPedidoCompra")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoPedidoCompra = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoPedidoCompraBeanSwingJInternalFrame jInternalFrameParent=(EstadoPedidoCompraBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoPedidoCompra.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoPedidoCompraActionPerformed(null);
			}
			
			EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadopedidocompra,new Object(),this.estadopedidocompraParameterGeneral,this.estadopedidocompraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoPedidoCompra(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoPedidoCompra(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoPedidoCompra(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadopedidocompra)) {
			if(!esControlTabla) {
				if(EstadoPedidoCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoPedidoCompra(this.estadopedidocompra,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedidoCompra(this.estadopedidocompra);			
				}
				
				if(this.estadopedidocompraSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoPedidoCompra(this.estadopedidocompra,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadopedidocompraReturnGeneral=estadopedidocompraLogic.procesarEventosEstadoPedidoComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadopedidocompraLogic.getEstadoPedidoCompras(),this.estadopedidocompra,this.estadopedidocompraParameterGeneral,this.isEsNuevoEstadoPedidoCompra,classes);//this.estadopedidocompraLogic.getEstadoPedidoCompra()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoPedidoCompra(this.estadopedidocompraReturnGeneral,this.estadopedidocompraBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadopedidocompraSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoPedidoCompra(classes,this.estadopedidocompraReturnGeneral,this.estadopedidocompraBean,false);
					}
						
					if(this.estadopedidocompraReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoPedidoCompra(this.estadopedidocompraReturnGeneral.getEstadoPedidoCompra());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoPedidoCompra(this.estadopedidocompraReturnGeneral.getEstadoPedidoCompra());	
					}
						
					if(this.estadopedidocompraReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoPedidoCompra(this.estadopedidocompraReturnGeneral.getEstadoPedidoCompra(),classes);//this.estadopedidocompraBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoPedidoCompra(this.estadopedidocompra,classes);//this.estadopedidocompraBean);									
				}
			
				if(EstadoPedidoCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoPedidoCompra(this.estadopedidocompra,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPedidoCompra(this.estadopedidocompra);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadopedidocompraAnterior!=null) {
						this.estadopedidocompra=this.estadopedidocompraAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadopedidocompraReturnGeneral=estadopedidocompraLogic.procesarEventosEstadoPedidoComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadopedidocompraLogic.getEstadoPedidoCompras(),this.estadopedidocompra,this.estadopedidocompraParameterGeneral,this.isEsNuevoEstadoPedidoCompra,classes);//this.estadopedidocompraLogic.getEstadoPedidoCompra()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadopedidocompraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadopedidocompraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadopedidocompraReturnGeneral.getEstadoPedidoCompra(),estadopedidocompraLogic.getEstadoPedidoCompras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadopedidocompraReturnGeneral.getEstadoPedidoCompra(),this.estadopedidocompras);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoPedidoCompra.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoPedidoCompra.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoPedidoCompra();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoPedidoCompra() throws Exception {
		
		EstadoPedidoCompraModel estadopedidocompraModel=(EstadoPedidoCompraModel)this.jTableDatosEstadoPedidoCompra.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadopedidocompraModel.estadopedidocompras=this.estadopedidocompraLogic.getEstadoPedidoCompras();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadopedidocompraModel.estadopedidocompras=this.estadopedidocompras;
		}
		
		
		((EstadoPedidoCompraModel) this.jTableDatosEstadoPedidoCompra.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoPedidoCompra() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadopedidocompraAnterior(),this.estadopedidocompraLogic.getEstadoPedidoCompras());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadopedidocompraAnterior(),this.estadopedidocompras);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoPedidoCompra();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoPedidoCompra(EstadoPedidoCompra estadopedidocompra,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
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
										
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadopedidocompra,new Object(),generalEntityParameterGeneral,this.estadopedidocompraReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadopedidocompraSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoPedidoCompraConstantesFunciones.getClassesRelationshipsOfEstadoPedidoCompra(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoPedidoCompraConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoPedidoCompra(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoPedidoCompra(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoPedidoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadopedidocompra,new Object(),generalEntityParameterGeneral,this.estadopedidocompraReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoPedidoCompra(EstadoPedidoCompraBean estadopedidocompraBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoPedidoCompra(ArrayList<Classe> classes,EstadoPedidoCompraReturnGeneral estadopedidocompraReturnGeneral,EstadoPedidoCompraBean estadopedidocompraBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoPedidoCompra(EstadoPedidoCompra estadopedidocompra,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.estadopedidocompra)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoPedidoCompra = new EstadoPedidoCompraDetalleFormJInternalFrame(jDesktopPane,this.estadopedidocompraSessionBean.getConGuardarRelaciones(),this.estadopedidocompraSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoPedidoCompra);
		this.jInternalFrameDetalleFormEstadoPedidoCompra.setVisible(false);
		this.jInternalFrameDetalleFormEstadoPedidoCompra.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoPedidoCompra.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoPedidoCompra.estadopedidocompraLogic=this.estadopedidocompraLogic;
		
		this.cargarCombosFrameForeignKeyEstadoPedidoCompra("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoPedidoCompra();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoPedidoCompra();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoPedidoCompra("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoPedidoCompra();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoPedidoCompra.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoPedidoCompra"));
		
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonModificarEstadoPedidoCompra.addActionListener(new ButtonActionListener(this,"ModificarEstadoPedidoCompra"));

		
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonModificarToolBarEstadoPedidoCompra.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoPedidoCompra"));
					
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jMenuItemModificarEstadoPedidoCompra.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoPedidoCompra"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonActualizarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"ActualizarEstadoPedidoCompra"));
		
		
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonActualizarToolBarEstadoPedidoCompra.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoPedidoCompra"));
						
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jMenuItemActualizarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoPedidoCompra"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonEliminarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"EliminarEstadoPedidoCompra"));
		
		
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonEliminarToolBarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoPedidoCompra"));
								
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jMenuItemEliminarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoPedidoCompra"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonCancelarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"CancelarEstadoPedidoCompra"));
		
		
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonCancelarToolBarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoPedidoCompra"));
					
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jMenuItemCancelarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoPedidoCompra"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jMenuItemDetalleCerrarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoPedidoCompra"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonGuardarCambiosToolBarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoPedidoCompra"));
		
		
		
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonGuardarCambiosToolBarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoPedidoCompra"));
		
		
		
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jComboBoxTiposAccionesFormularioEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoPedidoCompra"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonidEstadoPedidoCompraBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoPedidoCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtoncodigoEstadoPedidoCompraBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoPedidoCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonnombreEstadoPedidoCompraBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoPedidoCompraBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jTabbedPaneRelacionesEstadoPedidoCompra.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoPedidoCompra"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoPedidoCompra"));
		
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedidoCompra.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoPedidoCompra"));
		}
		
		this.jTableDatosEstadoPedidoCompra.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoPedidoCompra"));
		
		this.jTableDatosEstadoPedidoCompra.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoPedidoCompra"));
		
		this.jButtonNuevoEstadoPedidoCompra.addActionListener(new ButtonActionListener(this,"NuevoEstadoPedidoCompra"));
		
		this.jButtonDuplicarEstadoPedidoCompra.addActionListener(new ButtonActionListener(this,"DuplicarEstadoPedidoCompra"));
		
		this.jButtonCopiarEstadoPedidoCompra.addActionListener(new ButtonActionListener(this,"CopiarEstadoPedidoCompra"));
		
		this.jButtonVerFormEstadoPedidoCompra.addActionListener(new ButtonActionListener(this,"VerFormEstadoPedidoCompra"));
		
		
		this.jButtonNuevoToolBarEstadoPedidoCompra.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoPedidoCompra"));
			
		this.jButtonDuplicarToolBarEstadoPedidoCompra.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoPedidoCompra"));
			
		this.jMenuItemNuevoEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoPedidoCompra"));
			
		this.jMenuItemDuplicarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoPedidoCompra"));		
		
		
		this.jButtonNuevoRelacionesEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoPedidoCompra"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoPedidoCompra.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoPedidoCompra"));
			
		this.jMenuItemNuevoRelacionesEstadoPedidoCompra.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoPedidoCompra"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonModificarEstadoPedidoCompra.addActionListener(new ButtonActionListener(this,"ModificarEstadoPedidoCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonModificarToolBarEstadoPedidoCompra.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoPedidoCompra"));
			
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jMenuItemModificarEstadoPedidoCompra.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoPedidoCompra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonActualizarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"ActualizarEstadoPedidoCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonActualizarToolBarEstadoPedidoCompra.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoPedidoCompra"));
				
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jMenuItemActualizarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoPedidoCompra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonEliminarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"EliminarEstadoPedidoCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonEliminarToolBarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoPedidoCompra"));
						
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jMenuItemEliminarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoPedidoCompra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonCancelarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"CancelarEstadoPedidoCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonCancelarToolBarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoPedidoCompra"));
			
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jMenuItemCancelarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoPedidoCompra"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoPedidoCompra"));		
		
		
		this.jButtonCerrarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"CerrarEstadoPedidoCompra"));
		
		
		this.jButtonCerrarToolBarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoPedidoCompra"));
			
		this.jMenuItemCerrarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoPedidoCompra"));
			
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jMenuItemDetalleCerrarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoPedidoCompra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonGuardarCambiosEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoPedidoCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonGuardarCambiosToolBarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoPedidoCompra"));
		}
		
		this.jButtonCopiarToolBarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoPedidoCompra"));
			
		this.jButtonVerFormToolBarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoPedidoCompra"));
		
		this.jMenuItemGuardarCambiosEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoPedidoCompra"));
			
		this.jMenuItemCopiarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoPedidoCompra"));		
		
		this.jMenuItemVerFormEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoPedidoCompra"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoPedidoCompra"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoPedidoCompra"));
			
		this.jMenuItemGuardarCambiosTablaEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoPedidoCompra"));		
		
		
		
		this.jButtonRecargarInformacionEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoPedidoCompra"));
					
		this.jButtonRecargarInformacionToolBarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoPedidoCompra"));
		
		this.jMenuItemRecargarInformacionEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoPedidoCompra"));		
		
		
		
		this.jButtonAnterioresEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"AnterioresEstadoPedidoCompra"));
		
		
		this.jButtonAnterioresToolBarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoPedidoCompra"));
		
		this.jMenuItemAnterioresEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoPedidoCompra"));		
		
		
		this.jButtonSiguientesEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"SiguientesEstadoPedidoCompra"));
		
		
		this.jButtonSiguientesToolBarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoPedidoCompra"));
			
		this.jMenuItemSiguientesEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoPedidoCompra"));
			
		this.jMenuItemAbrirOrderByEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoPedidoCompra"));
			
		this.jMenuItemMostrarOcultarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoPedidoCompra"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoPedidoCompra"));
			
		this.jMenuItemDetalleMostarOcultarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoPedidoCompra"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoPedidoCompra"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoPedidoCompra"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoPedidoCompra"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoPedidoCompra.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoPedidoCompra"));

		this.jCheckBoxSeleccionadosEstadoPedidoCompra.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoPedidoCompra"));
		
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jComboBoxTiposAccionesFormularioEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoPedidoCompra"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoPedidoCompra"));
			
		this.jComboBoxTiposAccionesEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoPedidoCompra"));
					
		this.jComboBoxTiposSeleccionarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoPedidoCompra"));
			
		this.jTextFieldValorCampoGeneralEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoPedidoCompra"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonidEstadoPedidoCompraBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoPedidoCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtoncodigoEstadoPedidoCompraBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoPedidoCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonnombreEstadoPedidoCompraBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoPedidoCompraBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoPedidoCompra!=null) {
				this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoPedidoCompra"));
				this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoPedidoCompra"));
				this.jInternalFrameReporteDinamicoEstadoPedidoCompra.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoPedidoCompra"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoPedidoCompra"));				
			//this.jButtonGenerarReporteDinamicoEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoPedidoCompra"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoPedidoCompra"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoPedidoCompra!=null) {
				this.jInternalFrameImportacionEstadoPedidoCompra.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoPedidoCompra"));
				this.jInternalFrameImportacionEstadoPedidoCompra.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoPedidoCompra"));
				this.jInternalFrameImportacionEstadoPedidoCompra.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoPedidoCompra"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoPedidoCompra"));
			
			this.jButtonAbrirOrderByToolBarEstadoPedidoCompra.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoPedidoCompra"));			
			
			if(this.jInternalFrameOrderByEstadoPedidoCompra!=null) {
				this.jInternalFrameOrderByEstadoPedidoCompra.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoPedidoCompra"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPedidoCompra.jTabbedPaneRelacionesEstadoPedidoCompra.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoPedidoCompra"));
		
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
            		closingInternalFrameEstadoPedidoCompra();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoPedidoCompra.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoPedidoCompra = (JInternalFrameBase)event.getSource();
	            	
	            EstadoPedidoCompraBeanSwingJInternalFrame jInternalFrameParent=(EstadoPedidoCompraBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoPedidoCompra.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoPedidoCompraActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoPedidoCompra.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoPedidoCompraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoPedidoCompra.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoPedidoCompra.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPedidoCompraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPedidoCompraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPedidoCompraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoPedidoCompra";
		inputMap = this.jButtonNuevoEstadoPedidoCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoPedidoCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoPedidoCompraActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPedidoCompraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPedidoCompraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPedidoCompraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoPedidoCompra";
		inputMap = this.jButtonNuevoRelacionesEstadoPedidoCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoPedidoCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoPedidoCompraActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoPedidoCompra";
		inputMap = this.jButtonModificarEstadoPedidoCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoPedidoCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoPedidoCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoPedidoCompra";
		inputMap = this.jButtonActualizarEstadoPedidoCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoPedidoCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoPedidoCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoPedidoCompra";
		inputMap = this.jButtonEliminarEstadoPedidoCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoPedidoCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoPedidoCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoPedidoCompra";
		inputMap = this.jButtonCancelarEstadoPedidoCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoPedidoCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoPedidoCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoPedidoCompra";
		inputMap = this.jButtonCerrarEstadoPedidoCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoPedidoCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoPedidoCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonGuardarCambiosEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoPedidoCompra";
		inputMap = this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonGuardarCambiosEstadoPedidoCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonGuardarCambiosEstadoPedidoCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoPedidoCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoPedidoCompra.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoPedidoCompraItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoPedidoCompra.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoPedidoCompraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoPedidoCompra.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoPedidoCompraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoPedidoCompra.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoPedidoCompraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonidEstadoPedidoCompraBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoPedidoCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtoncodigoEstadoPedidoCompraBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoPedidoCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jButtonnombreEstadoPedidoCompraBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoPedidoCompraBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoPedidoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoPedidoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoPedidoCompraActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoPedidoCompra.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoPedidoCompra(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoPedidoCompra estadopedidocompraAux:this.estadopedidocompraLogic.getEstadoPedidoCompras()) {
					estadopedidocompraAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoPedidoCompra estadopedidocompraAux:estadopedidocompras) {
					estadopedidocompraAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoPedidoCompraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoPedidoCompra(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoPedidoCompra estadopedidocompraAux:this.estadopedidocompraLogic.getEstadoPedidoCompras()) {
						estadopedidocompraAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoPedidoCompra estadopedidocompraAux:estadopedidocompras) {
						estadopedidocompraAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoPedidoCompra estadopedidocompraAux:this.estadopedidocompraLogic.getEstadoPedidoCompras()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoPedidoCompra estadopedidocompraAux:estadopedidocompras) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoPedidoCompra(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoPedidoCompra.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoPedidoCompra.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoPedidoCompra,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoPedidoCompraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoPedidoCompra(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoPedidoCompra.getSelectedRows();
			
			EstadoPedidoCompra estadopedidocompraLocal=new EstadoPedidoCompra();
			
			//this.seleccionarTodosEstadoPedidoCompra(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadopedidocompraLocal =(EstadoPedidoCompra) this.estadopedidocompraLogic.getEstadoPedidoCompras().toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadopedidocompraLocal =(EstadoPedidoCompra) this.estadopedidocompras.toArray()[this.jTableDatosEstadoPedidoCompra.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadopedidocompraLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoPedidoCompra estadopedidocompraAux:this.estadopedidocompraLogic.getEstadoPedidoCompras()) {
						estadopedidocompraAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoPedidoCompra estadopedidocompraAux:estadopedidocompras) {
						estadopedidocompraAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoPedidoCompra(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoPedidoCompra.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoPedidoCompra.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoPedidoCompra,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoPedidoCompraItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoPedidoCompraParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoPedidoCompraActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoPedidoCompra(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoPedidoCompra.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoPedidoCompra estadopedidocompraAux:this.estadopedidocompraLogic.getEstadoPedidoCompras()) {
				
						if(sTipoSeleccionar.equals(EstadoPedidoCompraConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadopedidocompraAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoPedidoCompraConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadopedidocompraAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoPedidoCompra estadopedidocompraAux:estadopedidocompras) {
					
						if(sTipoSeleccionar.equals(EstadoPedidoCompraConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadopedidocompraAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoPedidoCompraConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadopedidocompraAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoPedidoCompra(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoPedidoCompraActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoPedidoCompra(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoPedidoCompra=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoPedidoCompra.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoPedidoCompra.jComboBoxTiposAccionesFormularioEstadoPedidoCompra.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoPedidoCompra) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoPedidoCompra(conSplash);
				
					this.generarReporteEstadoPedidoComprasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoPedidoCompra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoPedidoCompra.jComboBoxTiposAccionesFormularioEstadoPedidoCompra.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoPedidoComprasSeleccionados();
				//this.jComboBoxTiposAccionesEstadoPedidoCompra.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoPedidoComprasSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoPedidoCompra.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoPedidoComprasSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoPedidoCompra.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoPedidoCompra();
				
				this.exportarEstadoPedidoComprasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoPedidoCompra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoPedidoCompra.jComboBoxTiposAccionesFormularioEstadoPedidoCompra.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoPedidoCompras();
				//this.importarEstadoPedidoCompras();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoPedidoCompra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoPedidoCompra.jComboBoxTiposAccionesFormularioEstadoPedidoCompra.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoPedidoCompra();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoPedidoComprasSeleccionados();
				//this.jComboBoxTiposAccionesEstadoPedidoCompra.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Pedido Compra", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoPedidoCompra();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoPedidoCompra)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoPedidoCompra(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Pedido Compra",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoPedidoCompra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoPedidoCompra.jComboBoxTiposAccionesFormularioEstadoPedidoCompra.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoPedidoCompra();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoPedidoCompra(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoPedidoCompraActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoPedidoCompra();
			
			if(this.jInternalFrameDetalleFormEstadoPedidoCompra==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoPedidoCompra> estadopedidocomprasSeleccionados=new ArrayList<EstadoPedidoCompra>();		
			EstadoPedidoCompra estadopedidocompra=new EstadoPedidoCompra();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoPedidoCompra(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoPedidoCompra.getSelectedItem();
			
			
			
			
			estadopedidocomprasSeleccionados=this.getEstadoPedidoComprasSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadopedidocomprasSeleccionados.size()==1) {
				for(EstadoPedidoCompra estadopedidocompraAux:estadopedidocomprasSeleccionados) {
					estadopedidocompra=estadopedidocompraAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoPedidoCompra();
			
      		//this.finishProcessEstadoPedidoCompra(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoPedidoCompraReturnGeneral() throws Exception {
		if(this.estadopedidocompraReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadopedidocompraReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadopedidocompraReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadopedidocompraReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadopedidocompraReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadopedidocompraReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoPedidoCompra(false);
		}
		
		if(this.estadopedidocompraReturnGeneral.getConRetornoLista() || this.estadopedidocompraReturnGeneral.getConRetornoObjeto()) {
			if(this.estadopedidocompraReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadopedidocompraLogic.setEstadoPedidoCompras(this.estadopedidocompraReturnGeneral.getEstadoPedidoCompras());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadopedidocompraReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadopedidocompraLogic.setEstadoPedidoCompra(this.estadopedidocompraReturnGeneral.getEstadoPedidoCompra());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoPedidoCompra(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoPedidoCompra() throws Exception {
		
		
	}
	
	public ArrayList<EstadoPedidoCompra> getEstadoPedidoComprasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoPedidoCompra> estadopedidocomprasSeleccionados=new ArrayList<EstadoPedidoCompra>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoPedidoCompra) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoPedidoCompra estadopedidocompraAux:estadopedidocompraLogic.getEstadoPedidoCompras()) {
					if(estadopedidocompraAux.getIsSelected()) {
						estadopedidocomprasSeleccionados.add(estadopedidocompraAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoPedidoCompra estadopedidocompraAux:this.estadopedidocompras) {
					if(estadopedidocompraAux.getIsSelected()) {
						estadopedidocomprasSeleccionados.add(estadopedidocompraAux);				
					}
				}
			}
			
			if(estadopedidocomprasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadopedidocomprasSeleccionados.addAll(this.estadopedidocompraLogic.getEstadoPedidoCompras());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadopedidocomprasSeleccionados.addAll(this.estadopedidocompras);				
					}
				}
			}
		} else {
			estadopedidocomprasSeleccionados.add(this.estadopedidocompra);
		}
		
		return estadopedidocomprasSeleccionados;
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
	
	public void generarReporteEstadoPedidoComprasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoPedidoComprasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoPedidoComprasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoPedidoComprasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoPedidoComprasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Pedido Compra",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoPedidoComprasSeleccionados() throws Exception {
		ArrayList<EstadoPedidoCompra> estadopedidocomprasSeleccionados=new ArrayList<EstadoPedidoCompra>();		
		
		estadopedidocomprasSeleccionados=this.getEstadoPedidoComprasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoPedidoCompras("Todos",estadopedidocomprasSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoPedidoComprasSeleccionados() throws Exception {
		ArrayList<EstadoPedidoCompra> estadopedidocomprasSeleccionados=new ArrayList<EstadoPedidoCompra>();		
		
		estadopedidocomprasSeleccionados=this.getEstadoPedidoComprasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoPedidoCompras("Todos",estadopedidocomprasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoPedidoComprasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoPedidoCompra> estadopedidocomprasSeleccionados=new ArrayList<EstadoPedidoCompra>();
		
		estadopedidocomprasSeleccionados=this.getEstadoPedidoComprasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoPedidoCompras("Todos",estadopedidocomprasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoPedidoComprasSeleccionados() throws Exception {
		ArrayList<EstadoPedidoCompra> estadopedidocomprasSeleccionados=new ArrayList<EstadoPedidoCompra>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoPedidoCompra();
		
		
		estadopedidocomprasSeleccionados=this.getEstadoPedidoComprasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoPedidoCompra();
		
		
		//this.generarReporteEstadoPedidoCompras("Todos",estadopedidocomprasSeleccionados ,estadopedidocompraImplementable,estadopedidocompraImplementableHome);
	}
	
	public void mostrarImportacionEstadoPedidoCompras() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoPedidoCompra();
		
		this.abrirFrameImportacionEstadoPedidoCompra();		
		
			
		//this.generarReporteEstadoPedidoCompras("Todos",estadopedidocomprasSeleccionados ,estadopedidocompraImplementable,estadopedidocompraImplementableHome);
	}
	
	public void importarEstadoPedidoCompras() throws Exception {		
	
	}
	
	public void exportarEstadoPedidoComprasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoPedidoComprasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoPedidoComprasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoPedidoComprasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Pedido Compra",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoPedidoComprasSeleccionados() throws Exception {
		ArrayList<EstadoPedidoCompra> estadopedidocomprasSeleccionados=new ArrayList<EstadoPedidoCompra>();		
		
		estadopedidocomprasSeleccionados=this.getEstadoPedidoComprasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopedidocompra."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoPedidoCompra(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoPedidoCompra estadopedidocompraAux:estadopedidocomprasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoPedidoCompra(estadopedidocompraAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadopedidocompraAux.setsDetalleGeneralEntityReporte(estadopedidocompraAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Pedido Compra",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoPedidoCompra(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoPedidoCompraConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoPedidoCompraConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoPedidoCompraConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoPedidoCompraConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoPedidoCompra(EstadoPedidoCompra estadopedidocompra,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadopedidocompra.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadopedidocompra.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadopedidocompra.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadopedidocompra.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoPedidoComprasSeleccionados() throws Exception {
		ArrayList<EstadoPedidoCompra> estadopedidocomprasSeleccionados=new ArrayList<EstadoPedidoCompra>();		
		
		estadopedidocomprasSeleccionados=this.getEstadoPedidoComprasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopedidocompra.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoPedidoCompras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoPedidoCompra(row);				
				iRow++;
			}				
			
			for(EstadoPedidoCompra estadopedidocompraAux:estadopedidocomprasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoPedidoCompra(estadopedidocompraAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Pedido Compra",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoPedidoComprasSeleccionados() throws Exception {
		ArrayList<EstadoPedidoCompra> estadopedidocomprasSeleccionados=new ArrayList<EstadoPedidoCompra>();		
		
		estadopedidocomprasSeleccionados=this.getEstadoPedidoComprasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopedidocompra.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadopedidocompras");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadopedidocompra");
			//elementRoot.appendChild(element);
		
			for(EstadoPedidoCompra estadopedidocompraAux:estadopedidocomprasSeleccionados) {
				element = document.createElement("estadopedidocompra");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoPedidoCompra(estadopedidocompraAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Pedido Compra",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoPedidoCompra(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoPedidoCompraConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoPedidoCompraConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoPedidoCompraConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoPedidoCompraConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoPedidoCompra(EstadoPedidoCompra estadopedidocompra,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadopedidocompra.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadopedidocompra.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadopedidocompra.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoPedidoCompra(EstadoPedidoCompra estadopedidocompra,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoPedidoCompraConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadopedidocompra.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoPedidoCompraConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadopedidocompra.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoPedidoCompraConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadopedidocompra.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoPedidoCompraConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadopedidocompra.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoPedidoComprasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoPedidoCompra> estadopedidocomprasSeleccionados=new ArrayList<EstadoPedidoCompra>();
		
		estadopedidocomprasSeleccionados=this.getEstadoPedidoComprasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoPedidoCompra(estadopedidocomprasSeleccionados);
		
		this.generarReporteEstadoPedidoCompras("Todos",estadopedidocomprasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoPedidoCompra(ArrayList<EstadoPedidoCompra> estadopedidocomprasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoPedidoCompra estadopedidocompraAux:estadopedidocomprasSeleccionados) {
				estadopedidocompraAux.setsDetalleGeneralEntityReporte(estadopedidocompraAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoPedidoCompraConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadopedidocompraAux.setsDescripcionGeneralEntityReporte1(estadopedidocompraAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoPedidoCompraConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadopedidocompraAux.setsDescripcionGeneralEntityReporte1(estadopedidocompraAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPedidoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoPedidoCompra(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoPedidoCompra=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoPedidoCompra=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoPedidoCompra=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoPedidoCompra=false;
			this.isVisibilidadCeldaActualizarEstadoPedidoCompra=false;
			this.isVisibilidadCeldaEliminarEstadoPedidoCompra=false;
			this.isVisibilidadCeldaCancelarEstadoPedidoCompra=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPedidoCompra=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPedidoCompra=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoPedidoCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPedidoCompra=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPedidoCompra=false;
			this.isVisibilidadCeldaModificarEstadoPedidoCompra=false;
			this.isVisibilidadCeldaActualizarEstadoPedidoCompra=true;
			this.isVisibilidadCeldaEliminarEstadoPedidoCompra=false;
			this.isVisibilidadCeldaCancelarEstadoPedidoCompra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPedidoCompra=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPedidoCompra=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoPedidoCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPedidoCompra=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPedidoCompra=false;
			this.isVisibilidadCeldaModificarEstadoPedidoCompra=false;
			this.isVisibilidadCeldaActualizarEstadoPedidoCompra=true;
			this.isVisibilidadCeldaEliminarEstadoPedidoCompra=true;
			this.isVisibilidadCeldaCancelarEstadoPedidoCompra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPedidoCompra=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPedidoCompra=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoPedidoCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPedidoCompra=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPedidoCompra=false;
			this.isVisibilidadCeldaModificarEstadoPedidoCompra=false;
			this.isVisibilidadCeldaActualizarEstadoPedidoCompra=true;
			this.isVisibilidadCeldaEliminarEstadoPedidoCompra=false;
			this.isVisibilidadCeldaCancelarEstadoPedidoCompra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPedidoCompra=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPedidoCompra=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoPedidoCompra=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPedidoCompra=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoPedidoCompra=true;
			this.isVisibilidadCeldaModificarEstadoPedidoCompra=false;
			this.isVisibilidadCeldaActualizarEstadoPedidoCompra=false;
			this.isVisibilidadCeldaEliminarEstadoPedidoCompra=false;
			this.isVisibilidadCeldaCancelarEstadoPedidoCompra=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPedidoCompra=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPedidoCompra=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoPedidoCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPedidoCompra=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPedidoCompra=false;
			this.isVisibilidadCeldaActualizarEstadoPedidoCompra=false;
			this.isVisibilidadCeldaEliminarEstadoPedidoCompra=false;
			this.isVisibilidadCeldaCancelarEstadoPedidoCompra=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPedidoCompra=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPedidoCompra=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoPedidoCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPedidoCompra=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPedidoCompra=false;
			this.isVisibilidadCeldaModificarEstadoPedidoCompra=true;
			this.isVisibilidadCeldaActualizarEstadoPedidoCompra=false;
			this.isVisibilidadCeldaEliminarEstadoPedidoCompra=false;
			this.isVisibilidadCeldaCancelarEstadoPedidoCompra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPedidoCompra=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPedidoCompra=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoPedidoCompraJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoPedidoCompra=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPedidoCompra=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoPedidoCompra=true;
		} else {
			this.actualizarEstadoPanelsEstadoPedidoCompra(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoPedidoCompra=false;
			//this.isVisibilidadCeldaVerFormEstadoPedidoCompra=false;
			this.isVisibilidadCeldaDuplicarEstadoPedidoCompra=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadopedidocompraSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoPedidoCompra=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoPedidoCompra=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPedidoCompra=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadopedidocompraSessionBean.getEsGuardarRelacionado()) {
			if(!estadopedidocompraSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoPedidoCompra=false;												
			}
			
			this.jButtonCerrarEstadoPedidoCompra.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoPedidoCompra=false;
		}
		
		if(!this.permiteMantenimiento(this.estadopedidocompra)) {
			this.isVisibilidadCeldaActualizarEstadoPedidoCompra=false;
			this.isVisibilidadCeldaEliminarEstadoPedidoCompra=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoPedidoCompra() {
	}
	
	public void actualizarEstadoPanelsEstadoPedidoCompra(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoPedidoCompra!=null) {
				this.jScrollPanelDatosEdicionEstadoPedidoCompra.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoPedidoCompra!=null) {
				this.jScrollPanelDatosEstadoPedidoCompra.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoPedidoCompra!=null) {
				this.jPanelPaginacionEstadoPedidoCompra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoPedidoCompra!=null) {
				this.jPanelParametrosReportesEstadoPedidoCompra.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoPedidoCompra!=null) {
				this.jScrollPanelDatosEdicionEstadoPedidoCompra.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoPedidoCompra!=null) {
				this.jScrollPanelDatosEstadoPedidoCompra.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoPedidoCompra!=null) {
				this.jPanelPaginacionEstadoPedidoCompra.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoPedidoCompra!=null) {
				this.jPanelParametrosReportesEstadoPedidoCompra.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoPedidoCompra!=null) {
				this.jScrollPanelDatosEdicionEstadoPedidoCompra.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoPedidoCompra!=null) {
				this.jScrollPanelDatosEstadoPedidoCompra.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoPedidoCompra!=null) {
				this.jPanelPaginacionEstadoPedidoCompra.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoPedidoCompra!=null) {
				this.jPanelParametrosReportesEstadoPedidoCompra.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoPedidoCompra!=null) {
				this.jScrollPanelDatosEdicionEstadoPedidoCompra.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoPedidoCompra!=null) {
				this.jScrollPanelDatosEstadoPedidoCompra.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoPedidoCompra!=null) {
				this.jPanelPaginacionEstadoPedidoCompra.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoPedidoCompra!=null) {
				this.jPanelParametrosReportesEstadoPedidoCompra.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoPedidoCompra!=null) {
				this.jScrollPanelDatosEdicionEstadoPedidoCompra.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoPedidoCompra!=null) {
				this.jScrollPanelDatosEstadoPedidoCompra.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoPedidoCompra!=null) {
				this.jPanelPaginacionEstadoPedidoCompra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoPedidoCompra!=null) {
				this.jPanelParametrosReportesEstadoPedidoCompra.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoPedidoCompra!=null) {
				this.jScrollPanelDatosEdicionEstadoPedidoCompra.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoPedidoCompra!=null) {
				this.jScrollPanelDatosEstadoPedidoCompra.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoPedidoCompra!=null) {
				this.jPanelPaginacionEstadoPedidoCompra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoPedidoCompra!=null) {
				this.jPanelParametrosReportesEstadoPedidoCompra.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoPedidoCompra!=null) {
				this.jScrollPanelDatosEdicionEstadoPedidoCompra.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoPedidoCompra!=null) {
				this.jScrollPanelDatosEstadoPedidoCompra.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoPedidoCompra!=null) {
				this.jPanelPaginacionEstadoPedidoCompra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoPedidoCompra!=null) {
				this.jPanelParametrosReportesEstadoPedidoCompra.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadopedidocompraSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoPedidoCompraSessionBean estadopedidocompraSessionBean=new EstadoPedidoCompraSessionBean();
		
		if(this.estadopedidocompraSessionBean==null) {
			this.estadopedidocompraSessionBean=new EstadoPedidoCompraSessionBean();
		}
		
		this.estadopedidocompraSessionBean.setsUltimaBusquedaEstadoPedidoCompra(this.getsAccionBusqueda());
		this.estadopedidocompraSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadopedidocompraSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoPedidoCompraSessionBean estadopedidocompraSessionBean=new EstadoPedidoCompraSessionBean();
		
		if(this.estadopedidocompraSessionBean==null) {
			this.estadopedidocompraSessionBean=new EstadoPedidoCompraSessionBean();
		}
		
		if(this.estadopedidocompraSessionBean.getsUltimaBusquedaEstadoPedidoCompra()!=null&&!this.estadopedidocompraSessionBean.getsUltimaBusquedaEstadoPedidoCompra().equals("")) {
			this.setsAccionBusqueda(estadopedidocompraSessionBean.getsUltimaBusquedaEstadoPedidoCompra());
			this.setiNumeroPaginacion(estadopedidocompraSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadopedidocompraSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadopedidocompraSessionBean.setsUltimaBusquedaEstadoPedidoCompra("");
		this.estadopedidocompraSessionBean.setiNumeroPaginacion(EstadoPedidoCompraConstantesFunciones.INUMEROPAGINACION);
		this.estadopedidocompraSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoPedidoCompra(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoPedidoCompra() {
		this.updateBorderResaltarBusquedasFormularioEstadoPedidoCompra();
		this.updateVisibilidadBusquedasFormularioEstadoPedidoCompra();
		this.updateHabilitarBusquedasFormularioEstadoPedidoCompra();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoPedidoCompra() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoPedidoCompra() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoPedidoCompra() {
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
	
	public void updateControlesFormularioEstadoPedidoCompra() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoPedidoCompra==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoPedidoCompra();
		this.updateVisibilidadResaltarControlesFormularioEstadoPedidoCompra();
		this.updateHabilitarResaltarControlesFormularioEstadoPedidoCompra();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoPedidoCompra() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadopedidocompraConstantesFunciones.resaltaridEstadoPedidoCompra!=null && this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) {this.jInternalFrameDetalleFormEstadoPedidoCompra.jTextFieldidEstadoPedidoCompra.setBorder(this.estadopedidocompraConstantesFunciones.resaltaridEstadoPedidoCompra);}
		if(this.estadopedidocompraConstantesFunciones.resaltarcodigoEstadoPedidoCompra!=null && this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) {this.jInternalFrameDetalleFormEstadoPedidoCompra.jTextFieldcodigoEstadoPedidoCompra.setBorder(this.estadopedidocompraConstantesFunciones.resaltarcodigoEstadoPedidoCompra);}
		if(this.estadopedidocompraConstantesFunciones.resaltarnombreEstadoPedidoCompra!=null && this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) {this.jInternalFrameDetalleFormEstadoPedidoCompra.jTextAreanombreEstadoPedidoCompra.setBorder(this.estadopedidocompraConstantesFunciones.resaltarnombreEstadoPedidoCompra);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoPedidoCompra() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) {
	
		//this.jInternalFrameDetalleFormEstadoPedidoCompra.jTextFieldidEstadoPedidoCompra.setVisible(this.estadopedidocompraConstantesFunciones.mostraridEstadoPedidoCompra);
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jPanelidEstadoPedidoCompra.setVisible(this.estadopedidocompraConstantesFunciones.mostraridEstadoPedidoCompra);
		//this.jInternalFrameDetalleFormEstadoPedidoCompra.jTextFieldcodigoEstadoPedidoCompra.setVisible(this.estadopedidocompraConstantesFunciones.mostrarcodigoEstadoPedidoCompra);
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jPanelcodigoEstadoPedidoCompra.setVisible(this.estadopedidocompraConstantesFunciones.mostrarcodigoEstadoPedidoCompra);
		//this.jInternalFrameDetalleFormEstadoPedidoCompra.jTextAreanombreEstadoPedidoCompra.setVisible(this.estadopedidocompraConstantesFunciones.mostrarnombreEstadoPedidoCompra);
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jPanelnombreEstadoPedidoCompra.setVisible(this.estadopedidocompraConstantesFunciones.mostrarnombreEstadoPedidoCompra);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoPedidoCompra() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoPedidoCompra!=null) {
	
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jTextFieldidEstadoPedidoCompra.setEnabled(this.estadopedidocompraConstantesFunciones.activaridEstadoPedidoCompra);
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jTextFieldcodigoEstadoPedidoCompra.setEnabled(this.estadopedidocompraConstantesFunciones.activarcodigoEstadoPedidoCompra);
		this.jInternalFrameDetalleFormEstadoPedidoCompra.jTextAreanombreEstadoPedidoCompra.setEnabled(this.estadopedidocompraConstantesFunciones.activarnombreEstadoPedidoCompra);
		}
	}
	
		
}